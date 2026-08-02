package io.intercom.android.nexus;

import com.intercom.twig.Twig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public class NexusClient implements NexusTopicProvider {
    private ScheduledExecutorService backgroundTaskExecutor;
    private final OkHttpClient client;
    private final NexusEventPropagator eventPropagator;
    private ScheduledFuture future;
    private long heartbeatInterval;
    private final List<NexusSocket> sockets;
    private final List<String> topics;
    private final Twig twig;

    public static OkHttpClient.Builder defaultOkHttpClientBuilder() {
        return new OkHttpClient.Builder().readTimeout(130L, TimeUnit.SECONDS).writeTimeout(130L, TimeUnit.SECONDS).connectTimeout(20L, TimeUnit.SECONDS);
    }

    public NexusClient(Twig twig) {
        this(twig, defaultOkHttpClientBuilder().build());
    }

    public NexusClient(Twig twig, OkHttpClient okHttpClient) {
        this(twig, okHttpClient, new NexusEventPropagator(twig));
    }

    NexusClient(Twig twig, OkHttpClient okHttpClient, NexusEventPropagator nexusEventPropagator) {
        this.sockets = new ArrayList();
        this.topics = new ArrayList();
        this.twig = twig;
        this.eventPropagator = nexusEventPropagator;
        this.client = okHttpClient;
    }

    public void connect(NexusConfig nexusConfig, boolean z) {
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.e("No endpoints present", new Object[0]);
            return;
        }
        if (this.backgroundTaskExecutor == null) {
            this.backgroundTaskExecutor = Executors.newScheduledThreadPool(nexusConfig.getEndpoints().size() + 1, new NexusThreadFactory());
        }
        for (String str : nexusConfig.getEndpoints()) {
            this.twig.i("Adding socket", new Object[0]);
            boolean z2 = z;
            NexusSocket nexusSocket = new NexusSocket(str, nexusConfig.getConnectionTimeout(), z2, this.twig, this.backgroundTaskExecutor, this.client, this.eventPropagator, this);
            nexusSocket.connect();
            this.sockets.add(nexusSocket);
            z = z2;
        }
        boolean z3 = z;
        this.heartbeatInterval = nexusConfig.getPresenceHeartbeatInterval();
        if (z3) {
            schedulePing();
        }
    }

    public synchronized void disconnect() {
        if (!this.sockets.isEmpty()) {
            for (NexusSocket nexusSocket : this.sockets) {
                this.twig.i("disconnecting socket", new Object[0]);
                nexusSocket.disconnect();
            }
            this.sockets.clear();
            this.twig.i("client disconnected", new Object[0]);
        }
        ScheduledFuture scheduledFuture = this.future;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public synchronized void fire(NexusEvent nexusEvent) {
        this.eventPropagator.cacheEvent(nexusEvent);
        String stringEncodedJsonObject = nexusEvent.toStringEncodedJsonObject();
        if (!stringEncodedJsonObject.isEmpty()) {
            Iterator<NexusSocket> it = this.sockets.iterator();
            while (it.hasNext()) {
                it.next().fire(stringEncodedJsonObject);
            }
        }
    }

    public synchronized void localUpdate(NexusEvent nexusEvent) {
        this.eventPropagator.notifyEvent(nexusEvent);
    }

    public synchronized boolean isConnected() {
        Iterator<NexusSocket> it = this.sockets.iterator();
        while (it.hasNext()) {
            if (it.next().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public void addEventListener(NexusListener nexusListener) {
        this.eventPropagator.addListener(nexusListener);
    }

    public void removeEventListener(NexusListener nexusListener) {
        this.eventPropagator.removeListener(nexusListener);
    }

    @Override // io.intercom.android.nexus.NexusTopicProvider
    public synchronized List<String> getTopics() {
        return this.topics;
    }

    public synchronized void setTopics(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(this.topics);
        ArrayList arrayList2 = new ArrayList(this.topics);
        arrayList2.removeAll(list);
        subscribeToTopics(arrayList);
        unSubscribeFromTopics(arrayList2);
        this.topics.clear();
        this.topics.addAll(list);
    }

    public synchronized void addTopics(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(this.topics);
        subscribeToTopics(arrayList);
        this.topics.addAll(arrayList);
    }

    public synchronized void removeTopics(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (this.topics.contains(str)) {
                arrayList.add(str);
            }
        }
        unSubscribeFromTopics(arrayList);
        this.topics.removeAll(arrayList);
    }

    public synchronized void clearTopics() {
        unSubscribeFromTopics(this.topics);
        this.topics.clear();
    }

    private void subscribeToTopics(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        fire(NexusEvent.getSubscribeEvent(list));
    }

    private void unSubscribeFromTopics(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        fire(NexusEvent.getUnsubscribeEvent(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void schedulePing() {
        if (this.heartbeatInterval > 0) {
            this.future = this.backgroundTaskExecutor.schedule(new Runnable() { // from class: io.intercom.android.nexus.NexusClient.1
                @Override // java.lang.Runnable
                public void run() {
                    NexusClient.this.fire(NexusEvent.getPingEvent());
                    NexusClient.this.schedulePing();
                }
            }, this.heartbeatInterval, TimeUnit.SECONDS);
        }
    }

    private static class NexusThreadFactory implements ThreadFactory {
        private final ThreadFactory defaultFactory;
        private int threadCount;

        private NexusThreadFactory() {
            this.defaultFactory = Executors.defaultThreadFactory();
            this.threadCount = 0;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.defaultFactory.newThread(runnable);
            this.threadCount++;
            newThread.setName("IntercomNexus-" + this.threadCount);
            return newThread;
        }
    }
}
