package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocViewModelExtKt;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ExecutorProvider;
import io.sentry.android.replay.ScreenshotRecorderCallback;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.WindowsKt;
import io.sentry.android.replay.util.DebugOverlayDrawable;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PixelCopyStrategy.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0017J\b\u0010/\u001a\u00020,H\u0016J\b\u00100\u001a\u00020,H\u0016J\b\u0010\u0012\u001a\u000201H\u0016J\b\u00102\u001a\u00020,H\u0016J\u0014\u00103\u001a\u000204*\u00020!2\u0006\u00105\u001a\u000206H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b(\u0010)¨\u00067"}, d2 = {"Lio/sentry/android/replay/screenshot/PixelCopyStrategy;", "Lio/sentry/android/replay/screenshot/ScreenshotStrategy;", "executorProvider", "Lio/sentry/android/replay/ExecutorProvider;", "screenshotRecorderCallback", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "options", "Lio/sentry/SentryOptions;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "debugOverlayDrawable", "Lio/sentry/android/replay/util/DebugOverlayDrawable;", "(Lio/sentry/android/replay/ExecutorProvider;Lio/sentry/android/replay/ScreenshotRecorderCallback;Lio/sentry/SentryOptions;Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/android/replay/util/DebugOverlayDrawable;)V", "contentChanged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "isClosed", "lastCaptureSuccessful", "mainLooperHandler", "Lio/sentry/android/replay/util/MainLooperHandler;", "maskingPaint", "Landroid/graphics/Paint;", "getMaskingPaint", "()Landroid/graphics/Paint;", "maskingPaint$delegate", "Lkotlin/Lazy;", "prescaledMatrix", "Landroid/graphics/Matrix;", "getPrescaledMatrix", "()Landroid/graphics/Matrix;", "prescaledMatrix$delegate", "screenshot", "Landroid/graphics/Bitmap;", "singlePixelBitmap", "getSinglePixelBitmap", "()Landroid/graphics/Bitmap;", "singlePixelBitmap$delegate", "singlePixelBitmapCanvas", "Landroid/graphics/Canvas;", "getSinglePixelBitmapCanvas", "()Landroid/graphics/Canvas;", "singlePixelBitmapCanvas$delegate", UnstructuredDocViewModelExtKt.CAPTURE, "", "root", "Landroid/view/View;", AnalyticsConstantsKt.CLOSE_BUTTON, "emitLastScreenshot", "", "onContentChanged", "dominantColorForRect", "", "rect", "Landroid/graphics/Rect;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PixelCopyStrategy implements ScreenshotStrategy {
    public static final int $stable = 8;
    private final ScreenshotRecorderConfig config;
    private final AtomicBoolean contentChanged;
    private final DebugOverlayDrawable debugOverlayDrawable;
    private final ScheduledExecutorService executor;
    private final AtomicBoolean isClosed;
    private final AtomicBoolean lastCaptureSuccessful;
    private final MainLooperHandler mainLooperHandler;

    /* renamed from: maskingPaint$delegate, reason: from kotlin metadata */
    private final Lazy maskingPaint;
    private final SentryOptions options;

    /* renamed from: prescaledMatrix$delegate, reason: from kotlin metadata */
    private final Lazy prescaledMatrix;
    private final Bitmap screenshot;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    /* renamed from: singlePixelBitmap$delegate, reason: from kotlin metadata */
    private final Lazy singlePixelBitmap;

    /* renamed from: singlePixelBitmapCanvas$delegate, reason: from kotlin metadata */
    private final Lazy singlePixelBitmapCanvas;

    public PixelCopyStrategy(ExecutorProvider executorProvider, ScreenshotRecorderCallback screenshotRecorderCallback, SentryOptions options, ScreenshotRecorderConfig config, DebugOverlayDrawable debugOverlayDrawable) {
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(debugOverlayDrawable, "debugOverlayDrawable");
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.options = options;
        this.config = config;
        this.debugOverlayDrawable = debugOverlayDrawable;
        this.executor = executorProvider.getExecutor();
        this.mainLooperHandler = executorProvider.getMainLooperHandler();
        this.singlePixelBitmap = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Bitmap>() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$singlePixelBitmap$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bitmap invoke() {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                return createBitmap;
            }
        });
        Bitmap createBitmap = Bitmap.createBitmap(config.getRecordingWidth(), config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.screenshot = createBitmap;
        this.singlePixelBitmapCanvas = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Canvas>() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$singlePixelBitmapCanvas$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Canvas invoke() {
                Bitmap singlePixelBitmap;
                singlePixelBitmap = PixelCopyStrategy.this.getSinglePixelBitmap();
                return new Canvas(singlePixelBitmap);
            }
        });
        this.prescaledMatrix = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Matrix>() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$prescaledMatrix$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Matrix invoke() {
                ScreenshotRecorderConfig screenshotRecorderConfig;
                ScreenshotRecorderConfig screenshotRecorderConfig2;
                Matrix matrix = new Matrix();
                PixelCopyStrategy pixelCopyStrategy = PixelCopyStrategy.this;
                screenshotRecorderConfig = pixelCopyStrategy.config;
                float scaleFactorX = screenshotRecorderConfig.getScaleFactorX();
                screenshotRecorderConfig2 = pixelCopyStrategy.config;
                matrix.preScale(scaleFactorX, screenshotRecorderConfig2.getScaleFactorY());
                return matrix;
            }
        });
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.maskingPaint = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Paint>() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$maskingPaint$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Paint invoke() {
                return new Paint();
            }
        });
        this.contentChanged = new AtomicBoolean(false);
        this.isClosed = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getSinglePixelBitmap() {
        return (Bitmap) this.singlePixelBitmap.getValue();
    }

    private final Canvas getSinglePixelBitmapCanvas() {
        return (Canvas) this.singlePixelBitmapCanvas.getValue();
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint getMaskingPaint() {
        return (Paint) this.maskingPaint.getValue();
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void capture(final View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Window phoneWindow = WindowsKt.getPhoneWindow(root);
        if (phoneWindow == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.isClosed.get()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.contentChanged.set(false);
            PixelCopy.request(phoneWindow, this.screenshot, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$$ExternalSyntheticLambda0
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    PixelCopyStrategy.capture$lambda$2(PixelCopyStrategy.this, root, i);
                }
            }, this.mainLooperHandler.getHandler());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to capture replay recording", th);
            this.lastCaptureSuccessful.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2(final PixelCopyStrategy pixelCopyStrategy, final View view, int i) {
        if (pixelCopyStrategy.isClosed.get()) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i != 0) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
            pixelCopyStrategy.lastCaptureSuccessful.set(false);
        } else if (pixelCopyStrategy.contentChanged.get()) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            pixelCopyStrategy.lastCaptureSuccessful.set(false);
        } else {
            final ViewHierarchyNode fromView = ViewHierarchyNode.INSTANCE.fromView(view, null, 0, pixelCopyStrategy.options);
            ViewsKt.traverse(view, fromView, pixelCopyStrategy.options);
            pixelCopyStrategy.executor.submit(new ReplayRunnable("screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    PixelCopyStrategy.capture$lambda$2$lambda$1(PixelCopyStrategy.this, fromView, view);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2$lambda$1(final PixelCopyStrategy pixelCopyStrategy, ViewHierarchyNode viewHierarchyNode, final View view) {
        if (pixelCopyStrategy.isClosed.get() || pixelCopyStrategy.screenshot.isRecycled()) {
            pixelCopyStrategy.options.getLogger().log(SentryLevel.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final Canvas canvas = new Canvas(pixelCopyStrategy.screenshot);
        canvas.setMatrix(pixelCopyStrategy.getPrescaledMatrix());
        viewHierarchyNode.traverse(new Function1<ViewHierarchyNode, Boolean>() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$capture$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(ViewHierarchyNode node) {
                Pair pair;
                Integer dominantColor;
                Paint maskingPaint;
                SentryOptions sentryOptions;
                Paint maskingPaint2;
                Bitmap bitmap;
                int dominantColorForRect;
                Intrinsics.checkNotNullParameter(node, "node");
                if (node.getShouldMask() && node.getWidth() > 0 && node.getHeight() > 0) {
                    if (node.getVisibleRect() == null) {
                        return false;
                    }
                    if (node instanceof ViewHierarchyNode.ImageViewHierarchyNode) {
                        List listOf = CollectionsKt.listOf(node.getVisibleRect());
                        PixelCopyStrategy pixelCopyStrategy2 = PixelCopyStrategy.this;
                        bitmap = pixelCopyStrategy2.screenshot;
                        dominantColorForRect = pixelCopyStrategy2.dominantColorForRect(bitmap, node.getVisibleRect());
                        pair = TuplesKt.to(listOf, Integer.valueOf(dominantColorForRect));
                    } else {
                        boolean z = node instanceof ViewHierarchyNode.TextViewHierarchyNode;
                        int i = ViewCompat.MEASURED_STATE_MASK;
                        if (z) {
                            ViewHierarchyNode.TextViewHierarchyNode textViewHierarchyNode = (ViewHierarchyNode.TextViewHierarchyNode) node;
                            TextLayout layout = textViewHierarchyNode.getLayout();
                            if ((layout != null && (dominantColor = layout.getDominantTextColor()) != null) || (dominantColor = textViewHierarchyNode.getDominantColor()) != null) {
                                i = dominantColor.intValue();
                            }
                            pair = TuplesKt.to(ViewsKt.getVisibleRects(textViewHierarchyNode.getLayout(), node.getVisibleRect(), textViewHierarchyNode.getPaddingLeft(), textViewHierarchyNode.getPaddingTop()), Integer.valueOf(i));
                        } else {
                            pair = TuplesKt.to(CollectionsKt.listOf(node.getVisibleRect()), Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
                        }
                    }
                    List list = (List) pair.component1();
                    int intValue = ((Number) pair.component2()).intValue();
                    maskingPaint = PixelCopyStrategy.this.getMaskingPaint();
                    maskingPaint.setColor(intValue);
                    Canvas canvas2 = canvas;
                    PixelCopyStrategy pixelCopyStrategy3 = PixelCopyStrategy.this;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        RectF rectF = new RectF((Rect) it.next());
                        maskingPaint2 = pixelCopyStrategy3.getMaskingPaint();
                        canvas2.drawRoundRect(rectF, 10.0f, 10.0f, maskingPaint2);
                    }
                    sentryOptions = PixelCopyStrategy.this.options;
                    if (sentryOptions.getReplayController().isDebugMaskingOverlayEnabled()) {
                        arrayList.addAll(list);
                    }
                }
                return true;
            }
        });
        if (pixelCopyStrategy.options.getReplayController().isDebugMaskingOverlayEnabled()) {
            pixelCopyStrategy.mainLooperHandler.post(new Runnable() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    PixelCopyStrategy.capture$lambda$2$lambda$1$lambda$0(PixelCopyStrategy.this, view, arrayList);
                }
            });
        }
        ScreenshotRecorderCallback screenshotRecorderCallback = pixelCopyStrategy.screenshotRecorderCallback;
        if (screenshotRecorderCallback != null) {
            screenshotRecorderCallback.onScreenshotRecorded(pixelCopyStrategy.screenshot);
        }
        pixelCopyStrategy.lastCaptureSuccessful.set(true);
        pixelCopyStrategy.contentChanged.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2$lambda$1$lambda$0(PixelCopyStrategy pixelCopyStrategy, View view, List list) {
        if (pixelCopyStrategy.debugOverlayDrawable.getCallback() == null) {
            view.getOverlay().add(pixelCopyStrategy.debugOverlayDrawable);
        }
        pixelCopyStrategy.debugOverlayDrawable.updateMasks(list);
        view.postInvalidate();
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void onContentChanged() {
        this.contentChanged.set(true);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public boolean lastCaptureSuccessful() {
        return this.lastCaptureSuccessful.get();
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void emitLastScreenshot() {
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (!lastCaptureSuccessful() || this.screenshot.isRecycled() || (screenshotRecorderCallback = this.screenshotRecorderCallback) == null) {
            return;
        }
        screenshotRecorderCallback.onScreenshotRecorded(this.screenshot);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void close() {
        this.isClosed.set(true);
        this.executor.submit(new ReplayRunnable("PixelCopyStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.PixelCopyStrategy$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                PixelCopyStrategy.close$lambda$4(PixelCopyStrategy.this);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$4(PixelCopyStrategy pixelCopyStrategy) {
        if (!pixelCopyStrategy.screenshot.isRecycled()) {
            synchronized (pixelCopyStrategy.screenshot) {
                if (!pixelCopyStrategy.screenshot.isRecycled()) {
                    pixelCopyStrategy.screenshot.recycle();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        if (pixelCopyStrategy.getSinglePixelBitmap().isRecycled()) {
            return;
        }
        pixelCopyStrategy.getSinglePixelBitmap().recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dominantColorForRect(Bitmap bitmap, Rect rect) {
        if (this.isClosed.get() || bitmap.isRecycled() || getSinglePixelBitmap().isRecycled()) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        getPrescaledMatrix().mapRect(rectF);
        rectF.round(rect2);
        getSinglePixelBitmapCanvas().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return getSinglePixelBitmap().getPixel(0, 0);
    }
}
