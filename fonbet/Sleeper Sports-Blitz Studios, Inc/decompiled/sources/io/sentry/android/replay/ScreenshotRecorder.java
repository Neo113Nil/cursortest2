package io.sentry.android.replay;

import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocViewModelExtKt;
import io.sentry.ScreenshotStrategyType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.screenshot.CanvasStrategy;
import io.sentry.android.replay.screenshot.PixelCopyStrategy;
import io.sentry.android.replay.screenshot.ScreenshotStrategy;
import io.sentry.android.replay.util.DebugOverlayDrawable;
import io.sentry.android.replay.util.ViewsKt;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenshotRecorder.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\b\u0010 \u001a\u00020\u001cH\u0016J\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001cJ\u0010\u0010#\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorder;", "Landroid/view/ViewTreeObserver$OnDrawListener;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "options", "Lio/sentry/SentryOptions;", "executorProvider", "Lio/sentry/android/replay/ExecutorProvider;", "screenshotRecorderCallback", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/SentryOptions;Lio/sentry/android/replay/ExecutorProvider;Lio/sentry/android/replay/ScreenshotRecorderCallback;)V", "getConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "contentChanged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "debugOverlayDrawable", "Lio/sentry/android/replay/util/DebugOverlayDrawable;", "getExecutorProvider", "()Lio/sentry/android/replay/ExecutorProvider;", "isCapturing", "getOptions", "()Lio/sentry/SentryOptions;", "rootView", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "screenshotStrategy", "Lio/sentry/android/replay/screenshot/ScreenshotStrategy;", "bind", "", "root", UnstructuredDocViewModelExtKt.CAPTURE, AnalyticsConstantsKt.CLOSE_BUTTON, "onDraw", "pause", "resume", "unbind", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScreenshotRecorder implements ViewTreeObserver.OnDrawListener {
    public static final int $stable = 8;
    private final ScreenshotRecorderConfig config;
    private final AtomicBoolean contentChanged;
    private final DebugOverlayDrawable debugOverlayDrawable;
    private final ExecutorProvider executorProvider;
    private final AtomicBoolean isCapturing;
    private final SentryOptions options;
    private WeakReference<View> rootView;
    private final ScreenshotStrategy screenshotStrategy;

    /* compiled from: ScreenshotRecorder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenshotStrategyType.values().length];
            try {
                iArr[ScreenshotStrategyType.CANVAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenshotStrategyType.PIXEL_COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScreenshotRecorder(ScreenshotRecorderConfig config, SentryOptions options, ExecutorProvider executorProvider, ScreenshotRecorderCallback screenshotRecorderCallback) {
        CanvasStrategy canvasStrategy;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        this.config = config;
        this.options = options;
        this.executorProvider = executorProvider;
        this.isCapturing = new AtomicBoolean(true);
        DebugOverlayDrawable debugOverlayDrawable = new DebugOverlayDrawable();
        this.debugOverlayDrawable = debugOverlayDrawable;
        this.contentChanged = new AtomicBoolean(false);
        int i = WhenMappings.$EnumSwitchMapping$0[options.getSessionReplay().getScreenshotStrategy().ordinal()];
        if (i == 1) {
            canvasStrategy = new CanvasStrategy(executorProvider, screenshotRecorderCallback, options, config);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            canvasStrategy = new PixelCopyStrategy(executorProvider, screenshotRecorderCallback, options, config, debugOverlayDrawable);
        }
        this.screenshotStrategy = canvasStrategy;
    }

    public final ScreenshotRecorderConfig getConfig() {
        return this.config;
    }

    public final SentryOptions getOptions() {
        return this.options;
    }

    public final ExecutorProvider getExecutorProvider() {
        return this.executorProvider;
    }

    public final void capture() {
        if (this.options.getSessionReplay().isDebug()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(this.isCapturing.get()));
        }
        if (!this.isCapturing.get()) {
            if (this.options.getSessionReplay().isDebug()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (this.options.getSessionReplay().isDebug()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(this.contentChanged.get()), Boolean.valueOf(this.screenshotStrategy.lastCaptureSuccessful()));
        }
        if (!this.contentChanged.get()) {
            this.screenshotStrategy.emitLastScreenshot();
            return;
        }
        WeakReference<View> weakReference = this.rootView;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (WindowsKt.getPhoneWindow(view) == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.contentChanged.set(false);
            this.screenshotStrategy.capture(view);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to capture replay recording", th);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.isCapturing.get()) {
            WeakReference<View> weakReference = this.rootView;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.contentChanged.set(true);
                this.screenshotStrategy.onContentChanged();
            }
        }
    }

    public final void bind(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new WeakReference<>(root);
        ViewsKt.addOnDrawListenerSafe(root, this);
        this.contentChanged.set(true);
        this.screenshotStrategy.onContentChanged();
    }

    public final void unbind(View root) {
        ViewOverlay overlay;
        if (this.options.getReplayController().isDebugMaskingOverlayEnabled() && root != null && (overlay = root.getOverlay()) != null) {
            overlay.remove(this.debugOverlayDrawable);
        }
        if (root != null) {
            ViewsKt.removeOnDrawListenerSafe(root, this);
        }
    }

    public final void pause() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
    }

    public final void resume() {
        View view;
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null) {
            ViewsKt.addOnDrawListenerSafe(view, this);
        }
        this.isCapturing.set(true);
    }

    public final void close() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.screenshotStrategy.close();
    }
}
