package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.model.mvvm.model.StatusKt;
import com.squareup.picasso.Action;
import com.squareup.picasso.RemoteViewsAction;
import defpackage.a70;
import defpackage.ilg;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class Picasso {
    static final String TAG = "Picasso";
    final Cache cache;
    private final CleanupThread cleanupThread;
    final Context context;
    final Bitmap.Config defaultBitmapConfig;
    final Dispatcher dispatcher;
    boolean indicatorsEnabled;
    private final Listener listener;
    volatile boolean loggingEnabled;
    final ReferenceQueue<Object> referenceQueue;
    private final List<RequestHandler> requestHandlers;
    private final RequestTransformer requestTransformer;
    boolean shutdown;
    final Stats stats;
    final Map<Object, Action> targetToAction;
    final Map<ImageView, DeferredRequestCreator> targetToDeferredRequestCreator;
    static final Handler HANDLER = new Handler(Looper.getMainLooper()) { // from class: com.squareup.picasso.Picasso.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                Action action = (Action) message.obj;
                if (action.getPicasso().loggingEnabled) {
                    Utils.log("Main", StatusKt.STATUS_CANCELED, action.request.logId(), "target got garbage collected");
                }
                action.picasso.cancelExistingRequest(action.getTarget());
                return;
            }
            int i2 = 0;
            if (i == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i2 < size) {
                    BitmapHunter bitmapHunter = (BitmapHunter) list.get(i2);
                    bitmapHunter.picasso.complete(bitmapHunter);
                    i2++;
                }
                return;
            }
            if (i != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i2 < size2) {
                Action action2 = (Action) list2.get(i2);
                action2.picasso.resumeAction(action2);
                i2++;
            }
        }
    };
    static volatile Picasso singleton = null;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        private Cache cache;
        private final Context context;
        private Bitmap.Config defaultBitmapConfig;
        private Downloader downloader;
        private boolean indicatorsEnabled;
        private Listener listener;
        private boolean loggingEnabled;
        private List<RequestHandler> requestHandlers;
        private ExecutorService service;
        private RequestTransformer transformer;

        public Builder(@NonNull Context context) {
            if (context != null) {
                this.context = context.getApplicationContext();
            } else {
                a70.p("Context must not be null.");
                throw null;
            }
        }

        public Builder addRequestHandler(@NonNull RequestHandler requestHandler) {
            if (requestHandler == null) {
                a70.p("RequestHandler must not be null.");
                return null;
            }
            List list = this.requestHandlers;
            if (list == null) {
                list = new ArrayList();
                this.requestHandlers = list;
            }
            if (list.contains(requestHandler)) {
                a70.r("RequestHandler already registered.");
                return null;
            }
            this.requestHandlers.add(requestHandler);
            return this;
        }

        public Picasso build() {
            Context context = this.context;
            if (this.downloader == null) {
                this.downloader = new OkHttp3Downloader(context);
            }
            if (this.cache == null) {
                this.cache = new LruCache(context);
            }
            if (this.service == null) {
                this.service = new PicassoExecutorService();
            }
            if (this.transformer == null) {
                this.transformer = RequestTransformer.IDENTITY;
            }
            Stats stats = new Stats(this.cache);
            return new Picasso(context, new Dispatcher(context, this.service, Picasso.HANDLER, this.downloader, this.cache, stats), this.cache, this.listener, this.transformer, this.requestHandlers, stats, this.defaultBitmapConfig, this.indicatorsEnabled, this.loggingEnabled);
        }

        public Builder defaultBitmapConfig(@NonNull Bitmap.Config config) {
            if (config != null) {
                this.defaultBitmapConfig = config;
                return this;
            }
            a70.p("Bitmap config must not be null.");
            return null;
        }

        public Builder downloader(@NonNull Downloader downloader) {
            if (downloader == null) {
                a70.p("Downloader must not be null.");
                return null;
            }
            if (this.downloader == null) {
                this.downloader = downloader;
                return this;
            }
            a70.r("Downloader already set.");
            return null;
        }

        public Builder executor(@NonNull ExecutorService executorService) {
            if (executorService == null) {
                a70.p("Executor service must not be null.");
                return null;
            }
            if (this.service == null) {
                this.service = executorService;
                return this;
            }
            a70.r("Executor service already set.");
            return null;
        }

        public Builder indicatorsEnabled(boolean z) {
            this.indicatorsEnabled = z;
            return this;
        }

        public Builder listener(@NonNull Listener listener) {
            if (listener == null) {
                a70.p("Listener must not be null.");
                return null;
            }
            if (this.listener == null) {
                this.listener = listener;
                return this;
            }
            a70.r("Listener already set.");
            return null;
        }

        public Builder loggingEnabled(boolean z) {
            this.loggingEnabled = z;
            return this;
        }

        public Builder memoryCache(@NonNull Cache cache) {
            if (cache == null) {
                a70.p("Memory cache must not be null.");
                return null;
            }
            if (this.cache == null) {
                this.cache = cache;
                return this;
            }
            a70.r("Memory cache already set.");
            return null;
        }

        public Builder requestTransformer(@NonNull RequestTransformer requestTransformer) {
            if (requestTransformer == null) {
                a70.p("Transformer must not be null.");
                return null;
            }
            if (this.transformer == null) {
                this.transformer = requestTransformer;
                return this;
            }
            a70.r("Transformer already set.");
            return null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class CleanupThread extends Thread {
        private final Handler handler;
        private final ReferenceQueue<Object> referenceQueue;

        public CleanupThread(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.referenceQueue = referenceQueue;
            this.handler = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    Action.RequestWeakReference requestWeakReference = (Action.RequestWeakReference) this.referenceQueue.remove(1000L);
                    Message obtainMessage = this.handler.obtainMessage();
                    if (requestWeakReference != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = requestWeakReference.action;
                        this.handler.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.handler.post(new Runnable() { // from class: com.squareup.picasso.Picasso.CleanupThread.1
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }

        public void shutdown() {
            interrupt();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface Listener {
        void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        final int debugColor;

        LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface RequestTransformer {
        public static final RequestTransformer IDENTITY = new RequestTransformer() { // from class: com.squareup.picasso.Picasso.RequestTransformer.1
            @Override // com.squareup.picasso.Picasso.RequestTransformer
            public Request transformRequest(Request request) {
                return request;
            }
        };

        Request transformRequest(Request request);
    }

    public Picasso(Context context, Dispatcher dispatcher, Cache cache, Listener listener, RequestTransformer requestTransformer, List<RequestHandler> list, Stats stats, Bitmap.Config config, boolean z, boolean z2) {
        this.context = context;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.listener = listener;
        this.requestTransformer = requestTransformer;
        this.defaultBitmapConfig = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new ResourceRequestHandler(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new ContactsPhotoRequestHandler(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new ContentStreamRequestHandler(context));
        arrayList.add(new AssetRequestHandler(context));
        arrayList.add(new FileRequestHandler(context));
        arrayList.add(new NetworkRequestHandler(dispatcher.downloader, stats));
        this.requestHandlers = Collections.unmodifiableList(arrayList);
        this.stats = stats;
        this.targetToAction = new WeakHashMap();
        this.targetToDeferredRequestCreator = new WeakHashMap();
        this.indicatorsEnabled = z;
        this.loggingEnabled = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.referenceQueue = referenceQueue;
        CleanupThread cleanupThread = new CleanupThread(referenceQueue, HANDLER);
        this.cleanupThread = cleanupThread;
        cleanupThread.start();
    }

    private void deliverAction(Bitmap bitmap, LoadedFrom loadedFrom, Action action, Exception exc) {
        if (action.isCancelled()) {
            return;
        }
        if (!action.willReplay()) {
            this.targetToAction.remove(action.getTarget());
        }
        if (bitmap == null) {
            action.error(exc);
            if (this.loggingEnabled) {
                Utils.log("Main", "errored", action.request.logId(), exc.getMessage());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            a70.j("LoadedFrom cannot be null.");
            return;
        }
        action.complete(bitmap, loadedFrom);
        if (this.loggingEnabled) {
            Utils.log("Main", "completed", action.request.logId(), "from " + loadedFrom);
        }
    }

    public static Picasso get() {
        if (singleton == null) {
            synchronized (Picasso.class) {
                try {
                    if (singleton == null) {
                        Context context = PicassoProvider.context;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        singleton = new Builder(context).build();
                    }
                } finally {
                }
            }
        }
        return singleton;
    }

    public static void setSingletonInstance(@NonNull Picasso picasso) {
        if (picasso == null) {
            a70.p("Picasso must not be null.");
            return;
        }
        synchronized (Picasso.class) {
            try {
                if (singleton != null) {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
                singleton = picasso;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean areIndicatorsEnabled() {
        return this.indicatorsEnabled;
    }

    public void cancelExistingRequest(Object obj) {
        Utils.checkMain();
        Action remove = this.targetToAction.remove(obj);
        if (remove != null) {
            remove.cancel();
            this.dispatcher.dispatchCancel(remove);
        }
        if (obj instanceof ImageView) {
            DeferredRequestCreator remove2 = this.targetToDeferredRequestCreator.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.cancel();
            }
        }
    }

    public void cancelRequest(@NonNull RemoteViews remoteViews, int i) {
        if (remoteViews != null) {
            cancelExistingRequest(new RemoteViewsAction.RemoteViewsTarget(remoteViews, i));
        } else {
            a70.p("remoteViews cannot be null.");
        }
    }

    public void cancelTag(@NonNull Object obj) {
        Utils.checkMain();
        if (obj == null) {
            a70.p("Cannot cancel requests with null tag.");
            return;
        }
        ArrayList arrayList = new ArrayList(this.targetToAction.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Action action = (Action) arrayList.get(i);
            if (obj.equals(action.getTag())) {
                cancelExistingRequest(action.getTarget());
            }
        }
        ArrayList arrayList2 = new ArrayList(this.targetToDeferredRequestCreator.values());
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            DeferredRequestCreator deferredRequestCreator = (DeferredRequestCreator) arrayList2.get(i2);
            if (obj.equals(deferredRequestCreator.getTag())) {
                deferredRequestCreator.cancel();
            }
        }
    }

    public void complete(BitmapHunter bitmapHunter) {
        Action action = bitmapHunter.getAction();
        List<Action> actions = bitmapHunter.getActions();
        boolean z = (actions == null || actions.isEmpty()) ? false : true;
        if (action != null || z) {
            Uri uri = bitmapHunter.getData().uri;
            Exception exception = bitmapHunter.getException();
            Bitmap result = bitmapHunter.getResult();
            LoadedFrom loadedFrom = bitmapHunter.getLoadedFrom();
            if (action != null) {
                deliverAction(result, loadedFrom, action, exception);
            }
            if (z) {
                int size = actions.size();
                for (int i = 0; i < size; i++) {
                    deliverAction(result, loadedFrom, actions.get(i), exception);
                }
            }
            Listener listener = this.listener;
            if (listener == null || exception == null) {
                return;
            }
            listener.onImageLoadFailed(this, uri, exception);
        }
    }

    public void defer(ImageView imageView, DeferredRequestCreator deferredRequestCreator) {
        if (this.targetToDeferredRequestCreator.containsKey(imageView)) {
            cancelExistingRequest(imageView);
        }
        this.targetToDeferredRequestCreator.put(imageView, deferredRequestCreator);
    }

    public void enqueueAndSubmit(Action action) {
        Object target = action.getTarget();
        if (target != null && this.targetToAction.get(target) != action) {
            cancelExistingRequest(target);
            this.targetToAction.put(target, action);
        }
        submit(action);
    }

    public List<RequestHandler> getRequestHandlers() {
        return this.requestHandlers;
    }

    public StatsSnapshot getSnapshot() {
        return this.stats.createSnapshot();
    }

    public void invalidate(@NonNull File file) {
        if (file != null) {
            invalidate(Uri.fromFile(file));
        } else {
            a70.p("file == null");
        }
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public RequestCreator load(@Nullable String str) {
        if (str == null) {
            return new RequestCreator(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return load(Uri.parse(str));
        }
        a70.p("Path must not be empty.");
        return null;
    }

    public void pauseTag(@NonNull Object obj) {
        if (obj != null) {
            this.dispatcher.dispatchPauseTag(obj);
        } else {
            a70.p("tag == null");
        }
    }

    public Bitmap quickMemoryCacheCheck(String str) {
        Bitmap bitmap = this.cache.get(str);
        Stats stats = this.stats;
        if (bitmap != null) {
            stats.dispatchCacheHit();
            return bitmap;
        }
        stats.dispatchCacheMiss();
        return bitmap;
    }

    public void resumeAction(Action action) {
        Bitmap quickMemoryCacheCheck = MemoryPolicy.shouldReadFromMemoryCache(action.memoryPolicy) ? quickMemoryCacheCheck(action.getKey()) : null;
        if (quickMemoryCacheCheck == null) {
            enqueueAndSubmit(action);
            if (this.loggingEnabled) {
                Utils.log("Main", "resumed", action.request.logId());
                return;
            }
            return;
        }
        LoadedFrom loadedFrom = LoadedFrom.MEMORY;
        deliverAction(quickMemoryCacheCheck, loadedFrom, action, null);
        if (this.loggingEnabled) {
            Utils.log("Main", "completed", action.request.logId(), "from " + loadedFrom);
        }
    }

    public void resumeTag(@NonNull Object obj) {
        if (obj != null) {
            this.dispatcher.dispatchResumeTag(obj);
        } else {
            a70.p("tag == null");
        }
    }

    public void setIndicatorsEnabled(boolean z) {
        this.indicatorsEnabled = z;
    }

    public void setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
    }

    public void shutdown() {
        if (this == singleton) {
            a70.m("Default singleton instance cannot be shutdown.");
            return;
        }
        if (this.shutdown) {
            return;
        }
        this.cache.clear();
        this.cleanupThread.shutdown();
        this.stats.shutdown();
        this.dispatcher.shutdown();
        Iterator<DeferredRequestCreator> it = this.targetToDeferredRequestCreator.values().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.targetToDeferredRequestCreator.clear();
        this.shutdown = true;
    }

    public void submit(Action action) {
        this.dispatcher.dispatchSubmit(action);
    }

    public Request transformRequest(Request request) {
        Request transformRequest = this.requestTransformer.transformRequest(request);
        if (transformRequest != null) {
            return transformRequest;
        }
        ilg.j("Request transformer ", this.requestTransformer.getClass().getCanonicalName(), " returned null for ", request);
        return null;
    }

    public void invalidate(@Nullable String str) {
        if (str != null) {
            invalidate(Uri.parse(str));
        }
    }

    public void cancelRequest(@NonNull Target target) {
        if (target != null) {
            cancelExistingRequest(target);
        } else {
            a70.p("target cannot be null.");
        }
    }

    public void invalidate(@Nullable Uri uri) {
        if (uri != null) {
            this.cache.clearKeyUri(uri.toString());
        }
    }

    public void cancelRequest(@NonNull ImageView imageView) {
        if (imageView != null) {
            cancelExistingRequest(imageView);
        } else {
            a70.p("view cannot be null.");
        }
    }

    public RequestCreator load(@Nullable Uri uri) {
        return new RequestCreator(this, uri, 0);
    }

    public RequestCreator load(@NonNull File file) {
        if (file == null) {
            return new RequestCreator(this, null, 0);
        }
        return load(Uri.fromFile(file));
    }

    public RequestCreator load(int i) {
        if (i != 0) {
            return new RequestCreator(this, null, i);
        }
        a70.p("Resource ID must not be zero.");
        return null;
    }
}
