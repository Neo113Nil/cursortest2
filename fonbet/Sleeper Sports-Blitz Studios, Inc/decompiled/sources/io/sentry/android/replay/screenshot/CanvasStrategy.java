package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocViewModelExtKt;
import io.radar.sdk.RadarLogger$$ExternalSyntheticApiModelOutline0;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ExecutorProvider;
import io.sentry.android.replay.ScreenshotRecorderCallback;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CanvasStrategy.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0017J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0016J\b\u0010\r\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020$H\u0016J\u0012\u0010+\u001a\u00020$*\u00020,2\u0006\u0010-\u001a\u00020.R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lio/sentry/android/replay/screenshot/CanvasStrategy;", "Lio/sentry/android/replay/screenshot/ScreenshotStrategy;", "executor", "Lio/sentry/android/replay/ExecutorProvider;", "screenshotRecorderCallback", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "options", "Lio/sentry/SentryOptions;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "(Lio/sentry/android/replay/ExecutorProvider;Lio/sentry/android/replay/ScreenshotRecorderCallback;Lio/sentry/SentryOptions;Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastCaptureSuccessful", "pictureRenderTask", "Ljava/lang/Runnable;", "prescaledMatrix", "Landroid/graphics/Matrix;", "getPrescaledMatrix", "()Landroid/graphics/Matrix;", "prescaledMatrix$delegate", "Lkotlin/Lazy;", "screenshot", "Landroid/graphics/Bitmap;", "screenshotLock", "Lio/sentry/util/AutoClosableReentrantLock;", "surface", "Landroid/view/Surface;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "textIgnoringCanvas", "Lio/sentry/android/replay/screenshot/TextIgnoringDelegateCanvas;", "unprocessedPictureRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/graphics/Picture;", UnstructuredDocViewModelExtKt.CAPTURE, "", "root", "Landroid/view/View;", AnalyticsConstantsKt.CLOSE_BUTTON, "emitLastScreenshot", "", "onContentChanged", "postSafely", "Landroid/os/Handler;", "runnable", "Lio/sentry/android/replay/util/ReplayRunnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CanvasStrategy implements ScreenshotStrategy {
    public static final int $stable = 8;
    private final ScreenshotRecorderConfig config;
    private final ExecutorProvider executor;
    private final AtomicBoolean isClosed;
    private final AtomicBoolean lastCaptureSuccessful;
    private final SentryOptions options;
    private final Runnable pictureRenderTask;

    /* renamed from: prescaledMatrix$delegate, reason: from kotlin metadata */
    private final Lazy prescaledMatrix;
    private volatile Bitmap screenshot;
    private final AutoClosableReentrantLock screenshotLock;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;
    private final Surface surface;
    private final SurfaceTexture surfaceTexture;
    private final TextIgnoringDelegateCanvas textIgnoringCanvas;
    private AtomicReference<Picture> unprocessedPictureRef;

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void onContentChanged() {
    }

    public CanvasStrategy(ExecutorProvider executor, ScreenshotRecorderCallback screenshotRecorderCallback, SentryOptions options, ScreenshotRecorderConfig config) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        this.executor = executor;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.options = options;
        this.config = config;
        this.unprocessedPictureRef = new AtomicReference<>(null);
        this.screenshotLock = new AutoClosableReentrantLock();
        this.prescaledMatrix = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Matrix>() { // from class: io.sentry.android.replay.screenshot.CanvasStrategy$prescaledMatrix$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Matrix invoke() {
                ScreenshotRecorderConfig screenshotRecorderConfig;
                ScreenshotRecorderConfig screenshotRecorderConfig2;
                Matrix matrix = new Matrix();
                CanvasStrategy canvasStrategy = CanvasStrategy.this;
                screenshotRecorderConfig = canvasStrategy.config;
                float scaleFactorX = screenshotRecorderConfig.getScaleFactorX();
                screenshotRecorderConfig2 = canvasStrategy.config;
                matrix.preScale(scaleFactorX, screenshotRecorderConfig2.getScaleFactorY());
                return matrix;
            }
        });
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.textIgnoringCanvas = new TextIgnoringDelegateCanvas();
        this.isClosed = new AtomicBoolean(false);
        SurfaceTexture m = RadarLogger$$ExternalSyntheticApiModelOutline0.m(false);
        m.setDefaultBufferSize(config.getRecordingWidth(), config.getRecordingHeight());
        this.surfaceTexture = m;
        this.surface = new Surface(m);
        IntegrationUtils.addIntegrationToSdkVersion("ReplayCanvasStrategy");
        this.pictureRenderTask = new Runnable() { // from class: io.sentry.android.replay.screenshot.CanvasStrategy$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CanvasStrategy.pictureRenderTask$lambda$3(CanvasStrategy.this);
            }
        };
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pictureRenderTask$lambda$3(final CanvasStrategy canvasStrategy) {
        if (canvasStrategy.isClosed.get()) {
            canvasStrategy.options.getLogger().log(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture andSet = canvasStrategy.unprocessedPictureRef.getAndSet(null);
        if (andSet == null) {
            return;
        }
        try {
            Canvas lockHardwareCanvas = canvasStrategy.surface.lockHardwareCanvas();
            try {
                lockHardwareCanvas.drawColor(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.CLEAR);
                andSet.draw(lockHardwareCanvas);
                canvasStrategy.surface.unlockCanvasAndPost(lockHardwareCanvas);
                if (canvasStrategy.screenshot == null) {
                    ISentryLifecycleToken acquire = canvasStrategy.screenshotLock.acquire();
                    try {
                        ISentryLifecycleToken iSentryLifecycleToken = acquire;
                        if (canvasStrategy.screenshot == null) {
                            canvasStrategy.screenshot = Bitmap.createBitmap(canvasStrategy.config.getRecordingWidth(), canvasStrategy.config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
                        }
                        Unit unit = Unit.INSTANCE;
                        AutoCloseableKt.closeFinally(acquire, null);
                    } finally {
                    }
                }
                if (canvasStrategy.isClosed.get()) {
                    canvasStrategy.options.getLogger().log(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = canvasStrategy.surface;
                Bitmap bitmap = canvasStrategy.screenshot;
                Intrinsics.checkNotNull(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.CanvasStrategy$$ExternalSyntheticLambda2
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i) {
                        CanvasStrategy.pictureRenderTask$lambda$3$lambda$2(CanvasStrategy.this, i);
                    }
                }, canvasStrategy.executor.getBackgroundHandler());
            } catch (Throwable th) {
                canvasStrategy.surface.unlockCanvasAndPost(lockHardwareCanvas);
                throw th;
            }
        } catch (Throwable th2) {
            canvasStrategy.options.getLogger().log(SentryLevel.ERROR, "Canvas Strategy: picture render failed", th2);
            canvasStrategy.lastCaptureSuccessful.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pictureRenderTask$lambda$3$lambda$2(CanvasStrategy canvasStrategy, int i) {
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (canvasStrategy.isClosed.get()) {
            canvasStrategy.options.getLogger().log(SentryLevel.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i == 0) {
            canvasStrategy.lastCaptureSuccessful.set(true);
            Bitmap bitmap = canvasStrategy.screenshot;
            if (bitmap == null || bitmap.isRecycled() || (screenshotRecorderCallback = canvasStrategy.screenshotRecorderCallback) == null) {
                return;
            }
            screenshotRecorderCallback.onScreenshotRecorded(bitmap);
            return;
        }
        canvasStrategy.options.getLogger().log(SentryLevel.ERROR, "Canvas Strategy: PixelCopy failed with code " + i, new Object[0]);
        canvasStrategy.lastCaptureSuccessful.set(false);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void capture(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (this.isClosed.get()) {
            return;
        }
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(this.config.getRecordingWidth(), this.config.getRecordingHeight());
        Intrinsics.checkNotNullExpressionValue(beginRecording, "beginRecording(...)");
        this.textIgnoringCanvas.setDelegate(beginRecording);
        this.textIgnoringCanvas.setMatrix(getPrescaledMatrix());
        root.draw(this.textIgnoringCanvas);
        picture.endRecording();
        if (this.isClosed.get()) {
            return;
        }
        this.unprocessedPictureRef.set(picture);
        postSafely(this.executor.getBackgroundHandler(), new ReplayRunnable("screenshot_recorder.canvas", this.pictureRenderTask));
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void close() {
        this.isClosed.set(true);
        postSafely(this.executor.getBackgroundHandler(), new ReplayRunnable("CanvasStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.CanvasStrategy$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CanvasStrategy.close$lambda$6(CanvasStrategy.this);
            }
        }));
        this.unprocessedPictureRef.getAndSet(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$6(CanvasStrategy canvasStrategy) {
        Bitmap bitmap = canvasStrategy.screenshot;
        if (bitmap != null) {
            synchronized (bitmap) {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        canvasStrategy.surface.release();
        canvasStrategy.surfaceTexture.release();
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public boolean lastCaptureSuccessful() {
        return this.lastCaptureSuccessful.get();
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void emitLastScreenshot() {
        Bitmap bitmap;
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (!lastCaptureSuccessful() || (bitmap = this.screenshot) == null || bitmap.isRecycled() || (screenshotRecorderCallback = this.screenshotRecorderCallback) == null) {
            return;
        }
        screenshotRecorderCallback.onScreenshotRecorded(bitmap);
    }

    public final void postSafely(Handler handler, ReplayRunnable runnable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Canvas Strategy: failed to post runnable " + runnable.getTaskName(), th);
        }
    }
}
