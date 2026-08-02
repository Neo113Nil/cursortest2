package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.ILogger;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowRecorder.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001fJ\b\u0010&\u001a\u00020\u0010H\u0016J\b\u0010'\u001a\u00020\rH\u0016J\b\u0010(\u001a\u00020\u000bH\u0016J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020#H\u0016J\b\u00100\u001a\u00020#H\u0016J\b\u00101\u001a\u00020#H\u0016J\b\u00102\u001a\u00020#H\u0016J\b\u00103\u001a\u00020#H\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u001c\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e` X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lio/sentry/android/replay/WindowRecorder;", "Lio/sentry/android/replay/Recorder;", "Lio/sentry/android/replay/OnRootViewsChangedListener;", "Lio/sentry/android/replay/ExecutorProvider;", "options", "Lio/sentry/SentryOptions;", "screenshotRecorderCallback", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "windowCallback", "Lio/sentry/android/replay/WindowCallback;", "mainLooperHandler", "Lio/sentry/android/replay/util/MainLooperHandler;", "replayExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/ScreenshotRecorderCallback;Lio/sentry/android/replay/WindowCallback;Lio/sentry/android/replay/util/MainLooperHandler;Ljava/util/concurrent/ScheduledExecutorService;)V", "backgroundProcessingHandler", "Landroid/os/Handler;", "backgroundProcessingHandlerLock", "Lio/sentry/util/AutoClosableReentrantLock;", "backgroundProcessingHandlerThread", "Landroid/os/HandlerThread;", "capturer", "Lio/sentry/android/replay/WindowRecorder$Capturer;", "capturerLock", "isRecording", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastKnownWindowSize", "Landroid/graphics/Point;", "rootViews", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "rootViewsLock", AnalyticsConstantsKt.CLOSE_BUTTON, "", "determineWindowSize", "root", "getBackgroundHandler", "getExecutor", "getMainLooperHandler", "onConfigurationChanged", AnalyticsConstantsKt.KEY_CONFIG, "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "onRootViewsChanged", "added", "", "pause", MetricTracker.Object.RESET, "resume", "start", "stop", "Capturer", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WindowRecorder implements Recorder, OnRootViewsChangedListener, ExecutorProvider {
    public static final int $stable = 8;
    private volatile Handler backgroundProcessingHandler;
    private final AutoClosableReentrantLock backgroundProcessingHandlerLock;
    private volatile HandlerThread backgroundProcessingHandlerThread;
    private volatile Capturer capturer;
    private final AutoClosableReentrantLock capturerLock;
    private final AtomicBoolean isRecording;
    private Point lastKnownWindowSize;
    private final MainLooperHandler mainLooperHandler;
    private final SentryOptions options;
    private final ScheduledExecutorService replayExecutor;
    private final ArrayList<WeakReference<View>> rootViews;
    private final AutoClosableReentrantLock rootViewsLock;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;
    private final WindowCallback windowCallback;

    public WindowRecorder(SentryOptions options, ScreenshotRecorderCallback screenshotRecorderCallback, WindowCallback windowCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(windowCallback, "windowCallback");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.options = options;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.windowCallback = windowCallback;
        this.mainLooperHandler = mainLooperHandler;
        this.replayExecutor = replayExecutor;
        this.isRecording = new AtomicBoolean(false);
        this.rootViews = new ArrayList<>();
        this.lastKnownWindowSize = new Point();
        this.rootViewsLock = new AutoClosableReentrantLock();
        this.capturerLock = new AutoClosableReentrantLock();
        this.backgroundProcessingHandlerLock = new AutoClosableReentrantLock();
    }

    public /* synthetic */ WindowRecorder(SentryOptions sentryOptions, ScreenshotRecorderCallback screenshotRecorderCallback, WindowCallback windowCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService scheduledExecutorService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, (i & 2) != 0 ? null : screenshotRecorderCallback, windowCallback, mainLooperHandler, scheduledExecutorService);
    }

    /* compiled from: WindowRecorder.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0006\u0010\u0019\u001a\u00020\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lio/sentry/android/replay/WindowRecorder$Capturer;", "Ljava/lang/Runnable;", "options", "Lio/sentry/SentryOptions;", "mainLooperHandler", "Lio/sentry/android/replay/util/MainLooperHandler;", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/util/MainLooperHandler;)V", AnalyticsConstantsKt.KEY_CONFIG, "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "getConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "setConfig", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "isRecording", "Ljava/util/concurrent/atomic/AtomicBoolean;", "recorder", "Lio/sentry/android/replay/ScreenshotRecorder;", "getRecorder", "()Lio/sentry/android/replay/ScreenshotRecorder;", "setRecorder", "(Lio/sentry/android/replay/ScreenshotRecorder;)V", "pause", "", "resume", "run", "stop", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Capturer implements Runnable {
        private ScreenshotRecorderConfig config;
        private final AtomicBoolean isRecording;
        private final MainLooperHandler mainLooperHandler;
        private final SentryOptions options;
        private ScreenshotRecorder recorder;

        public Capturer(SentryOptions options, MainLooperHandler mainLooperHandler) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
            this.options = options;
            this.mainLooperHandler = mainLooperHandler;
            this.isRecording = new AtomicBoolean(true);
        }

        public final ScreenshotRecorder getRecorder() {
            return this.recorder;
        }

        public final void setRecorder(ScreenshotRecorder screenshotRecorder) {
            this.recorder = screenshotRecorder;
        }

        public final ScreenshotRecorderConfig getConfig() {
            return this.config;
        }

        public final void setConfig(ScreenshotRecorderConfig screenshotRecorderConfig) {
            this.config = screenshotRecorderConfig;
        }

        public final void resume() {
            if (this.options.getSessionReplay().isDebug()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            ScreenshotRecorder screenshotRecorder = this.recorder;
            if (screenshotRecorder != null) {
                screenshotRecorder.resume();
            }
            this.isRecording.getAndSet(true);
            Capturer capturer = this;
            this.mainLooperHandler.removeCallbacks(capturer);
            if (this.mainLooperHandler.post(capturer)) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        public final void pause() {
            ScreenshotRecorder screenshotRecorder = this.recorder;
            if (screenshotRecorder != null) {
                screenshotRecorder.pause();
            }
            this.isRecording.getAndSet(false);
        }

        public final void stop() {
            ScreenshotRecorder screenshotRecorder = this.recorder;
            if (screenshotRecorder != null) {
                screenshotRecorder.close();
            }
            this.recorder = null;
            this.isRecording.getAndSet(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.isRecording.get()) {
                if (this.options.getSessionReplay().isDebug()) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (this.options.getSessionReplay().isDebug()) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Capturing a frame.", new Object[0]);
                }
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.capture();
                }
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture a frame", th);
            }
            if (this.options.getSessionReplay().isDebug()) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
                ScreenshotRecorderConfig screenshotRecorderConfig = this.config;
                sb.append(screenshotRecorderConfig != null ? screenshotRecorderConfig.getFrameRate() : 1);
                sb.append(" fps.");
                logger.log(sentryLevel, sb.toString(), new Object[0]);
            }
            if (this.mainLooperHandler.postDelayed(this, 1000 / (this.config != null ? r4.getFrameRate() : 1))) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(final View root, boolean added) {
        ScreenshotRecorder recorder;
        ScreenshotRecorder recorder2;
        ScreenshotRecorder recorder3;
        Intrinsics.checkNotNullParameter(root, "root");
        ISentryLifecycleToken acquire = this.rootViewsLock.acquire();
        try {
            ISentryLifecycleToken iSentryLifecycleToken = acquire;
            if (added) {
                if (WindowsKt.getPhoneWindow(root) == null) {
                    this.options.getLogger().log(SentryLevel.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    AutoCloseableKt.closeFinally(acquire, null);
                    return;
                }
                this.rootViews.add(new WeakReference<>(root));
                Capturer capturer = this.capturer;
                if (capturer != null && (recorder3 = capturer.getRecorder()) != null) {
                    recorder3.bind(root);
                }
                determineWindowSize(root);
            } else {
                Capturer capturer2 = this.capturer;
                if (capturer2 != null && (recorder2 = capturer2.getRecorder()) != null) {
                    recorder2.unbind(root);
                }
                CollectionsKt.removeAll((List) this.rootViews, (Function1) new Function1<WeakReference<View>, Boolean>() { // from class: io.sentry.android.replay.WindowRecorder$onRootViewsChanged$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(WeakReference<View> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(Intrinsics.areEqual(it.get(), root));
                    }
                });
                WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.rootViews);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !Intrinsics.areEqual(root, view)) {
                    Capturer capturer3 = this.capturer;
                    if (capturer3 != null && (recorder = capturer3.getRecorder()) != null) {
                        recorder.bind(view);
                    }
                    determineWindowSize(view);
                }
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(acquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(acquire, th);
                throw th2;
            }
        }
    }

    public final void determineWindowSize(final View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (ViewsKt.hasSize(root)) {
            if (root.getWidth() == this.lastKnownWindowSize.x || root.getHeight() == this.lastKnownWindowSize.y) {
                return;
            }
            this.lastKnownWindowSize.set(root.getWidth(), root.getHeight());
            this.windowCallback.onWindowSizeChanged(root.getWidth(), root.getHeight());
            return;
        }
        ViewsKt.addOnPreDrawListenerSafe(root, new ViewTreeObserver.OnPreDrawListener() { // from class: io.sentry.android.replay.WindowRecorder$determineWindowSize$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                ArrayList arrayList;
                Point point;
                Point point2;
                Point point3;
                WindowCallback windowCallback;
                arrayList = WindowRecorder.this.rootViews;
                WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) arrayList);
                if (!Intrinsics.areEqual(root, weakReference != null ? (View) weakReference.get() : null)) {
                    ViewsKt.removeOnPreDrawListenerSafe(root, this);
                    return true;
                }
                if (ViewsKt.hasSize(root)) {
                    ViewsKt.removeOnPreDrawListenerSafe(root, this);
                    int width = root.getWidth();
                    point = WindowRecorder.this.lastKnownWindowSize;
                    if (width != point.x) {
                        int height = root.getHeight();
                        point2 = WindowRecorder.this.lastKnownWindowSize;
                        if (height != point2.y) {
                            point3 = WindowRecorder.this.lastKnownWindowSize;
                            point3.set(root.getWidth(), root.getHeight());
                            windowCallback = WindowRecorder.this.windowCallback;
                            windowCallback.onWindowSizeChanged(root.getWidth(), root.getHeight());
                        }
                    }
                }
                return true;
            }
        });
    }

    @Override // io.sentry.android.replay.Recorder
    public void start() {
        this.isRecording.getAndSet(true);
    }

    @Override // io.sentry.android.replay.Recorder
    public void onConfigurationChanged(ScreenshotRecorderConfig config) {
        Capturer capturer;
        ScreenshotRecorder recorder;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.isRecording.get()) {
            if (this.capturer == null) {
                ISentryLifecycleToken acquire = this.capturerLock.acquire();
                try {
                    ISentryLifecycleToken iSentryLifecycleToken = acquire;
                    if (this.capturer == null) {
                        this.capturer = new Capturer(this.options, this.mainLooperHandler);
                    }
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(acquire, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AutoCloseableKt.closeFinally(acquire, th);
                        throw th2;
                    }
                }
            }
            Capturer capturer2 = this.capturer;
            if (capturer2 != null) {
                capturer2.setConfig(config);
            }
            Capturer capturer3 = this.capturer;
            if (capturer3 != null) {
                capturer3.setRecorder(new ScreenshotRecorder(config, this.options, this, this.screenshotRecorderCallback));
            }
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.rootViews);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (capturer = this.capturer) != null && (recorder = capturer.getRecorder()) != null) {
                recorder.bind(view);
            }
            this.mainLooperHandler.removeCallbacks(this.capturer);
            if (this.mainLooperHandler.postDelayed(this.capturer, 100L)) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void resume() {
        Capturer capturer = this.capturer;
        if (capturer != null) {
            capturer.resume();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void pause() {
        Capturer capturer = this.capturer;
        if (capturer != null) {
            capturer.pause();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void reset() {
        ScreenshotRecorder recorder;
        this.lastKnownWindowSize.set(0, 0);
        ISentryLifecycleToken acquire = this.rootViewsLock.acquire();
        try {
            ISentryLifecycleToken iSentryLifecycleToken = acquire;
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Capturer capturer = this.capturer;
                if (capturer != null && (recorder = capturer.getRecorder()) != null) {
                    recorder.unbind((View) weakReference.get());
                }
            }
            this.rootViews.clear();
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(acquire, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void stop() {
        Capturer capturer = this.capturer;
        if (capturer != null) {
            capturer.stop();
        }
        ISentryLifecycleToken acquire = this.capturerLock.acquire();
        try {
            ISentryLifecycleToken iSentryLifecycleToken = acquire;
            this.capturer = null;
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(acquire, null);
            this.isRecording.set(false);
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        reset();
        this.mainLooperHandler.removeCallbacks(this.capturer);
        ISentryLifecycleToken acquire = this.backgroundProcessingHandlerLock.acquire();
        try {
            ISentryLifecycleToken iSentryLifecycleToken = acquire;
            Handler handler = this.backgroundProcessingHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.backgroundProcessingHandlerThread;
            if (handlerThread != null) {
                Boolean.valueOf(handlerThread.quitSafely());
            }
            AutoCloseableKt.closeFinally(acquire, null);
            stop();
        } finally {
        }
    }

    @Override // io.sentry.android.replay.ExecutorProvider
    /* renamed from: getExecutor, reason: from getter */
    public ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    @Override // io.sentry.android.replay.ExecutorProvider
    public MainLooperHandler getMainLooperHandler() {
        return this.mainLooperHandler;
    }

    @Override // io.sentry.android.replay.ExecutorProvider
    public Handler getBackgroundHandler() {
        if (this.backgroundProcessingHandler == null) {
            ISentryLifecycleToken acquire = this.backgroundProcessingHandlerLock.acquire();
            try {
                ISentryLifecycleToken iSentryLifecycleToken = acquire;
                if (this.backgroundProcessingHandler == null) {
                    this.backgroundProcessingHandlerThread = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.backgroundProcessingHandlerThread;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.backgroundProcessingHandlerThread;
                    Intrinsics.checkNotNull(handlerThread2);
                    this.backgroundProcessingHandler = new Handler(handlerThread2.getLooper());
                }
                Unit unit = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(acquire, null);
            } finally {
            }
        }
        Handler handler = this.backgroundProcessingHandler;
        Intrinsics.checkNotNull(handler);
        return handler;
    }
}
