package ru.ozon.fintech.features.camera.ui;

import C.D;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import ca0.C5795b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fI.C6473a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u001f\u001a\u00020\u0010*\u00020\u0010H\u0002J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0014J(\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0014J\u0014\u0010+\u001a\u00020!*\u00020\u000e2\u0006\u0010,\u001a\u00020\u0019H\u0002J\"\u0010-\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u001eH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0013R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lru/ozon/fintech/features/camera/ui/PhoneFrameView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "borderColor", "scannerAreaBorderStrokePaint", "Landroid/graphics/Paint;", "cornerPaintPath", "Landroid/graphics/Path;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroid/graphics/Rect;", "scannerAreaRect", "setScannerAreaRect", "(Landroid/graphics/Rect;)V", "scannerAreaRectFinish", "getScannerAreaRectFinish", "()Landroid/graphics/Rect;", "setScannerAreaRectFinish", "scannerAreaRectFTuned", "Landroid/graphics/RectF;", "isAnimationStarted", "", "currentAlpha", "cornerLinePercent", "", "tuneScannerArea", "updateBoarderStrokeColor", "", "colorId", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "updatePath", "rectF", "calculateRect", "smallPercent", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneFrameView extends View {
    private static final int ALPHA_CORNER_FINISH = 255;
    private static final int ALPHA_CORNER_START = 150;
    private static final long ANIMATION_CORNER_LINE_DURATION = 300;
    private static final long ANIMATION_DELAY = 500;
    private static final long ANIMATION_DURATION = 450;
    private static final double BOX_SIZE_COEF = 0.25d;
    private static final double CORNER_LINE_PERCENT = 0.14d;
    private static final float CORNER_LINE_PERCENT_FINISH = 0.15f;
    private static final float CORNER_LINE_PERCENT_START = 0.25f;
    private static final float OVERSHOOT_INTERPOLATOR_TENSION = 2.5f;
    private static final float POSITION_FINISH = 1.0f;
    private static final float POSITION_START = 0.4f;
    private int borderColor;
    private float cornerLinePercent;

    @NotNull
    private final Path cornerPaintPath;
    private int currentAlpha;
    private boolean isAnimationStarted;

    @NotNull
    private Paint scannerAreaBorderStrokePaint;

    @NotNull
    private Rect scannerAreaRect;

    @NotNull
    private RectF scannerAreaRectFTuned;

    @NotNull
    private Rect scannerAreaRectFinish;
    private static final float SCANNER_CORNER_LINES_RADIUS = D.d(48);
    private static final int BOX_MIN_MARGIN = D.d(24);
    private static final int BOX_STROKE_WIDTH = D.d(4);

    @NotNull
    private static final Rect NO_RECT = new Rect(0, 0, 0, 0);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneFrameView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Rect calculateRect(int w11, int h11, float smallPercent) {
        double d11 = (w11 * BOX_SIZE_COEF) / 2;
        int i11 = BOX_MIN_MARGIN;
        if (d11 >= i11) {
            i11 = (int) d11;
        }
        int i12 = w11 - i11;
        int i13 = i12 - i11;
        float f7 = (1 - smallPercent) * i13;
        int i14 = (int) (f7 / 2);
        int i15 = (int) (f7 / 4);
        int i16 = h11 / 2;
        int i17 = i13 / 4;
        return new Rect(i11 + i14, (i16 - i17) + i15, i12 - i14, (i16 + i17) - i15);
    }

    static /* synthetic */ Rect calculateRect$default(PhoneFrameView phoneFrameView, int i11, int i12, float f7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            f7 = 1.0f;
        }
        return phoneFrameView.calculateRect(i11, i12, f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSizeChanged$lambda$2$lambda$1(PhoneFrameView phoneFrameView, ValueAnimator valueAnimator) {
        phoneFrameView.currentAlpha = ((Integer) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        phoneFrameView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSizeChanged$lambda$4$lambda$3(PhoneFrameView phoneFrameView, ValueAnimator valueAnimator) {
        phoneFrameView.cornerLinePercent = ((Float) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        phoneFrameView.updatePath(phoneFrameView.cornerPaintPath, phoneFrameView.scannerAreaRectFTuned);
        phoneFrameView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSizeChanged$lambda$6$lambda$5(PhoneFrameView phoneFrameView, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int width = phoneFrameView.getWidth();
        int height = phoneFrameView.getHeight();
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        phoneFrameView.setScannerAreaRect(phoneFrameView.calculateRect(width, height, ((Float) animatedValue).floatValue()));
    }

    private final void setScannerAreaRect(Rect rect) {
        Rect tuneScannerArea = tuneScannerArea(rect);
        this.scannerAreaRect = tuneScannerArea;
        updatePath(this.cornerPaintPath, new RectF(tuneScannerArea));
    }

    private final void setScannerAreaRectFinish(Rect rect) {
        this.scannerAreaRectFinish = tuneScannerArea(rect);
    }

    private final Rect tuneScannerArea(Rect rect) {
        int i11 = BOX_STROKE_WIDTH / 2;
        return new Rect(rect.left + i11, rect.top + i11, rect.right - i11, rect.bottom - i11);
    }

    private final void updatePath(Path path, RectF rectF) {
        path.reset();
        float f7 = rectF.right;
        float f11 = rectF.left;
        int i11 = (int) ((f7 - f11) * this.cornerLinePercent);
        float f12 = (int) (i11 * 0.9d);
        path.moveTo(f11, rectF.top + f12);
        path.lineTo(rectF.left, rectF.top);
        float f13 = i11;
        path.lineTo(rectF.left + f13, rectF.top);
        path.moveTo(rectF.right - f13, rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(rectF.right, rectF.top + f12);
        path.moveTo(rectF.left, rectF.bottom - f12);
        path.lineTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left + f13, rectF.bottom);
        path.moveTo(rectF.right - f13, rectF.bottom);
        path.lineTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.right, rectF.bottom - f12);
    }

    @NotNull
    public final Rect getScannerAreaRectFinish() {
        return this.scannerAreaRectFinish;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.scannerAreaBorderStrokePaint.setAlpha(this.currentAlpha);
        canvas.drawPath(this.cornerPaintPath, this.scannerAreaBorderStrokePaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        PhoneFrameView phoneFrameView;
        Rect rect;
        int i11 = 1;
        super.onSizeChanged(w11, h11, oldw, oldh);
        if (getVisibility() == 0) {
            phoneFrameView = this;
            rect = calculateRect$default(phoneFrameView, w11, h11, 0.0f, 4, null);
        } else {
            phoneFrameView = this;
            rect = NO_RECT;
        }
        setScannerAreaRect(rect);
        setScannerAreaRectFinish(rect);
        if (phoneFrameView.isAnimationStarted) {
            return;
        }
        phoneFrameView.isAnimationStarted = true;
        ValueAnimator ofInt = ValueAnimator.ofInt(ALPHA_CORNER_START, ALPHA_CORNER_FINISH);
        ofInt.setDuration(ANIMATION_DURATION);
        ofInt.setStartDelay(ANIMATION_DELAY);
        ofInt.addUpdateListener(new C6473a(this, i11));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(CORNER_LINE_PERCENT_START, CORNER_LINE_PERCENT_FINISH);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(ANIMATION_DELAY);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.features.camera.ui.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PhoneFrameView.onSizeChanged$lambda$4$lambda$3(PhoneFrameView.this, valueAnimator);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(POSITION_START, 1.0f);
        ofFloat2.setDuration(ANIMATION_DURATION);
        ofFloat2.setStartDelay(ANIMATION_DELAY);
        ofFloat2.setInterpolator(new OvershootInterpolator(2.5f));
        ofFloat2.addUpdateListener(new C5795b(this, 4));
        ofFloat.start();
        ofInt.start();
        ofFloat2.start();
    }

    public final void updateBoarderStrokeColor(int colorId) {
        int color = androidx.core.content.a.getColor(getContext(), colorId);
        if (color != this.scannerAreaBorderStrokePaint.getColor()) {
            this.scannerAreaBorderStrokePaint.setColor(color);
            invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneFrameView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PhoneFrameView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneFrameView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.borderColor = R.color.oz_white_1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(androidx.core.content.a.getColor(context, this.borderColor));
        paint.setStrokeWidth(BOX_STROKE_WIDTH);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(SCANNER_CORNER_LINES_RADIUS));
        this.scannerAreaBorderStrokePaint = paint;
        this.cornerPaintPath = new Path();
        Rect rect = NO_RECT;
        this.scannerAreaRect = rect;
        this.scannerAreaRectFinish = rect;
        this.scannerAreaRectFTuned = new RectF(this.scannerAreaRect);
        this.cornerLinePercent = CORNER_LINE_PERCENT_FINISH;
    }
}
