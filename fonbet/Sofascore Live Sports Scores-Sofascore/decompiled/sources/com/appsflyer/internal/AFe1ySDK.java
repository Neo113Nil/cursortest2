package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1ySDK {
    final ExecutorService AFLogger;
    public Executor unregisterClient = Executors.newSingleThreadExecutor();
    final Timer AFKeystoreWrapper = new Timer(true);
    public final List<AFe1xSDK> d = new CopyOnWriteArrayList();
    final Set<AFe1zSDK> registerClient = new CopyOnWriteArraySet();
    final Set<AFe1zSDK> w = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFe1vSDK<?>> force = new ConcurrentSkipListSet();
    final NavigableSet<AFe1vSDK<?>> e = new ConcurrentSkipListSet();
    final List<AFe1vSDK<?>> v = new ArrayList();
    final Set<AFe1vSDK<?>> i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.appsflyer.internal.AFe1ySDK$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        private /* synthetic */ AFe1vSDK registerClient;

        public AnonymousClass1(AFe1vSDK aFe1vSDK) {
            this.registerClient = aFe1vSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFe1ySDK.this.force) {
                try {
                    if (AFe1ySDK.this.i.contains(this.registerClient)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.QUEUE;
                        StringBuilder sb = new StringBuilder("tried to add already running task: ");
                        sb.append(this.registerClient);
                        aFLogger.d(logTag, sb.toString());
                        return;
                    }
                    if (!AFe1ySDK.this.force.contains(this.registerClient) && !AFe1ySDK.this.e.contains(this.registerClient)) {
                        AFe1ySDK aFe1ySDK = AFe1ySDK.this;
                        AFe1vSDK aFe1vSDK = this.registerClient;
                        for (AFe1zSDK aFe1zSDK : aFe1vSDK.AFLogger) {
                            if (aFe1ySDK.w.contains(aFe1zSDK)) {
                                aFe1vSDK.unregisterClient.add(aFe1zSDK);
                            }
                        }
                        boolean containsAll = AFe1ySDK.this.registerClient.containsAll(this.registerClient.unregisterClient);
                        AFe1ySDK aFe1ySDK2 = AFe1ySDK.this;
                        if (containsAll) {
                            add = aFe1ySDK2.force.add(this.registerClient);
                        } else {
                            add = aFe1ySDK2.e.add(this.registerClient);
                            if (add) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                LogTag logTag2 = LogTag.QUEUE;
                                StringBuilder sb2 = new StringBuilder("new task was blocked: ");
                                sb2.append(this.registerClient);
                                aFLogger2.d(logTag2, sb2.toString());
                                this.registerClient.w();
                            }
                        }
                        if (add) {
                            AFe1ySDK aFe1ySDK3 = AFe1ySDK.this;
                            aFe1ySDK3.force.addAll(aFe1ySDK3.v);
                            AFe1ySDK.this.v.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            LogTag logTag3 = LogTag.QUEUE;
                            StringBuilder sb3 = new StringBuilder("task not added, it's already in the queue: ");
                            sb3.append(this.registerClient);
                            aFLogger3.d(logTag3, sb3.toString());
                        }
                        if (!add) {
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            LogTag logTag4 = LogTag.QUEUE;
                            StringBuilder sb4 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb4.append(this.registerClient);
                            aFLogger4.w(logTag4, sb4.toString());
                            return;
                        }
                        AFe1ySDK.this.w.add(this.registerClient.d);
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        LogTag logTag5 = LogTag.QUEUE;
                        StringBuilder sb5 = new StringBuilder("new task added: ");
                        sb5.append(this.registerClient);
                        aFLogger5.d(logTag5, sb5.toString());
                        Iterator<AFe1xSDK> it = AFe1ySDK.this.d.iterator();
                        while (it.hasNext()) {
                            it.next().registerClient(this.registerClient);
                        }
                        AFe1ySDK aFe1ySDK4 = AFe1ySDK.this;
                        aFe1ySDK4.AFLogger.submit(aFe1ySDK4.new AnonymousClass4());
                        AFe1ySDK aFe1ySDK5 = AFe1ySDK.this;
                        synchronized (aFe1ySDK5.force) {
                            try {
                                for (int size = (aFe1ySDK5.force.size() + aFe1ySDK5.e.size()) - 40; size > 0; size--) {
                                    boolean isEmpty = aFe1ySDK5.e.isEmpty();
                                    boolean isEmpty2 = aFe1ySDK5.force.isEmpty();
                                    if (isEmpty2 || isEmpty) {
                                        if (!isEmpty2) {
                                            aFe1ySDK5.unregisterClient(aFe1ySDK5.force);
                                        } else if (!isEmpty) {
                                            aFe1ySDK5.unregisterClient(aFe1ySDK5.e);
                                        }
                                    } else if (aFe1ySDK5.force.first().compareTo(aFe1ySDK5.e.first()) > 0) {
                                        aFe1ySDK5.unregisterClient(aFe1ySDK5.force);
                                    } else {
                                        aFe1ySDK5.unregisterClient(aFe1ySDK5.e);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    LogTag logTag6 = LogTag.QUEUE;
                    StringBuilder sb6 = new StringBuilder("tried to add already scheduled task: ");
                    sb6.append(this.registerClient);
                    aFLogger6.d(logTag6, sb6.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.appsflyer.internal.AFe1ySDK$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1ySDK.this.force) {
                try {
                    final AFe1vSDK<?> pollFirst = AFe1ySDK.this.force.pollFirst();
                    if (pollFirst == null) {
                        return;
                    }
                    AFe1ySDK.this.i.add(pollFirst);
                    long registerClient = pollFirst.registerClient();
                    AFe1wSDK aFe1wSDK = new AFe1wSDK(Thread.currentThread());
                    if (registerClient > 0) {
                        AFe1ySDK.this.AFKeystoreWrapper.schedule(aFe1wSDK, registerClient);
                    }
                    final AFe1ySDK aFe1ySDK = AFe1ySDK.this;
                    aFe1ySDK.unregisterClient.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1ySDK.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator<AFe1xSDK> it = AFe1ySDK.this.d.iterator();
                            while (it.hasNext()) {
                                it.next().unregisterClient(pollFirst);
                            }
                        }
                    });
                    if (!AFe1ySDK.this.force.isEmpty()) {
                        AFe1ySDK aFe1ySDK2 = AFe1ySDK.this;
                        aFe1ySDK2.AFLogger.submit(aFe1ySDK2.new AnonymousClass4());
                    }
                    try {
                        AFLogger.INSTANCE.d(LogTag.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                        final AFd1bSDK call = pollFirst.call();
                        aFe1wSDK.cancel();
                        final AFe1ySDK aFe1ySDK3 = AFe1ySDK.this;
                        aFe1ySDK3.unregisterClient.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1ySDK.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                LogTag logTag = LogTag.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(pollFirst);
                                sb.append(", result: ");
                                sb.append(call);
                                aFLogger.d(logTag, sb.toString());
                                AFe1ySDK.this.i.remove(pollFirst);
                                Iterator<AFe1xSDK> it = AFe1ySDK.this.d.iterator();
                                while (it.hasNext()) {
                                    it.next().AFLogger(pollFirst, call);
                                }
                                if (call == AFd1bSDK.SUCCESS) {
                                    AFe1ySDK.this.registerClient.add(pollFirst.d);
                                    AFe1ySDK.this.registerClient();
                                    return;
                                }
                                boolean d = pollFirst.d();
                                AFe1ySDK aFe1ySDK4 = AFe1ySDK.this;
                                if (!d) {
                                    aFe1ySDK4.registerClient.add(pollFirst.d);
                                    AFe1ySDK.this.registerClient();
                                    return;
                                }
                                AFe1vSDK aFe1vSDK = pollFirst;
                                if ((aFe1vSDK instanceof AFe1dSDK) && aFe1vSDK.d == AFd1aSDK.getEntries) {
                                    return;
                                }
                                synchronized (aFe1ySDK4.force) {
                                    try {
                                        AFe1ySDK.this.v.add(pollFirst);
                                        Iterator<AFe1xSDK> it2 = AFe1ySDK.this.d.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().registerClient(pollFirst);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.d(LogTag.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                        final AFd1bSDK aFd1bSDK = AFd1bSDK.TIMEOUT;
                        pollFirst.AFKeystoreWrapper = aFd1bSDK;
                        final AFe1ySDK aFe1ySDK4 = AFe1ySDK.this;
                        aFe1ySDK4.unregisterClient.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1ySDK.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                LogTag logTag = LogTag.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(pollFirst);
                                sb.append(", result: ");
                                sb.append(aFd1bSDK);
                                aFLogger.d(logTag, sb.toString());
                                AFe1ySDK.this.i.remove(pollFirst);
                                Iterator<AFe1xSDK> it = AFe1ySDK.this.d.iterator();
                                while (it.hasNext()) {
                                    it.next().AFLogger(pollFirst, aFd1bSDK);
                                }
                                if (aFd1bSDK == AFd1bSDK.SUCCESS) {
                                    AFe1ySDK.this.registerClient.add(pollFirst.d);
                                    AFe1ySDK.this.registerClient();
                                    return;
                                }
                                boolean d = pollFirst.d();
                                AFe1ySDK aFe1ySDK42 = AFe1ySDK.this;
                                if (!d) {
                                    aFe1ySDK42.registerClient.add(pollFirst.d);
                                    AFe1ySDK.this.registerClient();
                                    return;
                                }
                                AFe1vSDK aFe1vSDK = pollFirst;
                                if ((aFe1vSDK instanceof AFe1dSDK) && aFe1vSDK.d == AFd1aSDK.getEntries) {
                                    return;
                                }
                                synchronized (aFe1ySDK42.force) {
                                    try {
                                        AFe1ySDK.this.v.add(pollFirst);
                                        Iterator<AFe1xSDK> it2 = AFe1ySDK.this.d.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().registerClient(pollFirst);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused2) {
                        aFe1wSDK.cancel();
                        final AFe1ySDK aFe1ySDK5 = AFe1ySDK.this;
                        final AFd1bSDK aFd1bSDK2 = AFd1bSDK.FAILURE;
                        aFe1ySDK5.unregisterClient.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1ySDK.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                LogTag logTag = LogTag.QUEUE;
                                StringBuilder sb = new StringBuilder("execution finished for ");
                                sb.append(pollFirst);
                                sb.append(", result: ");
                                sb.append(aFd1bSDK2);
                                aFLogger.d(logTag, sb.toString());
                                AFe1ySDK.this.i.remove(pollFirst);
                                Iterator<AFe1xSDK> it = AFe1ySDK.this.d.iterator();
                                while (it.hasNext()) {
                                    it.next().AFLogger(pollFirst, aFd1bSDK2);
                                }
                                if (aFd1bSDK2 == AFd1bSDK.SUCCESS) {
                                    AFe1ySDK.this.registerClient.add(pollFirst.d);
                                    AFe1ySDK.this.registerClient();
                                    return;
                                }
                                boolean d = pollFirst.d();
                                AFe1ySDK aFe1ySDK42 = AFe1ySDK.this;
                                if (!d) {
                                    aFe1ySDK42.registerClient.add(pollFirst.d);
                                    AFe1ySDK.this.registerClient();
                                    return;
                                }
                                AFe1vSDK aFe1vSDK = pollFirst;
                                if ((aFe1vSDK instanceof AFe1dSDK) && aFe1vSDK.d == AFd1aSDK.getEntries) {
                                    return;
                                }
                                synchronized (aFe1ySDK42.force) {
                                    try {
                                        AFe1ySDK.this.v.add(pollFirst);
                                        Iterator<AFe1xSDK> it2 = AFe1ySDK.this.d.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().registerClient(pollFirst);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AFe1ySDK(ExecutorService executorService) {
        this.AFLogger = executorService;
    }

    public final void registerClient() {
        synchronized (this.force) {
            try {
                Iterator<AFe1vSDK<?>> it = this.e.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    AFe1vSDK<?> next = it.next();
                    if (this.registerClient.containsAll(next.unregisterClient)) {
                        it.remove();
                        this.force.add(next);
                        z = true;
                    }
                }
                if (z) {
                    this.AFLogger.submit(new AnonymousClass4());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void unregisterClient(NavigableSet<AFe1vSDK<?>> navigableSet) {
        AFe1vSDK<?> pollFirst = navigableSet.pollFirst();
        this.registerClient.add(pollFirst.d);
        Iterator<AFe1xSDK> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(pollFirst);
        }
    }
}
