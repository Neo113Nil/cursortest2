package ru.ozon.fintech.features.camera.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0014J(\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0014J\b\u0010/\u001a\u00020$H\u0014J\u0018\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0002J\u0018\u00103\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0002J\u0018\u00104\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0002J\u0018\u00105\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0002J\u001c\u00106\u001a\u00020$2\b\b\u0002\u00101\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u00020\u0007H\u0002J\u0018\u00107\u001a\u00020$2\u0006\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u0010H\u0002J\u0010\u0010:\u001a\u00020$2\u0006\u00109\u001a\u00020\u0010H\u0002J\u0010\u0010;\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J \u0010=\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010?\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010@\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010>\u001a\u00020\u001fH\u0002J\u0018\u0010A\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010>\u001a\u00020\u001fH\u0002J\u0018\u0010B\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010>\u001a\u00020\u001fH\u0002J\b\u0010C\u001a\u00020$H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lru/ozon/fintech/features/camera/ui/SelfieDocFrameView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "portraitAlpha", "landscapeAlpha", "fadeInAnimator", "Landroid/animation/ValueAnimator;", "fadeOutAnimator", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;", "orientation", "getOrientation", "()Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;", "setOrientation", "(Lru/ozon/fintech/features/camera/ui/DocFrameOrientation;)V", "", "isRoundFace", "()Z", "setRoundFace", "(Z)V", "borderColor", "docFrameAreaBorderStrokePaint", "Landroid/graphics/Paint;", "passportFrameAreaRectF", "Landroid/graphics/RectF;", "faceFrameRectF", "passportLandscapeFrameAreaRectF", "faceLandscapeFrameRectF", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "onDetachedFromWindow", "calculatePortraitPassportRectF", "width", "height", "calculatePortraitFaceRectF", "calculateLandscapePassportRectF", "calculateLandscapeFaceRectF", "updateSelfieDocFrameLayout", "startTransitionAnimation", "from", "to", "animateFadeIn", "drawPortraitSelfieDocFrame", "drawLandscapeSelfieDocFrame", "drawRoundFaceFrame", "rectF", "drawOvalFaceFrame", "drawPassportBounds", "drawPortraitPassportDivider", "drawLandscapePassportDivider", "cancelAnimation", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfieDocFrameView extends View {
    private static final long ANIMATION_DURATION_MS = 200;
    private static final float BOX_STROKE_WIDTH = 4.0f;
    private static final float FACE_ADDITIONAL_SPACE = 0.02f;
    private static final float FACE_FRAME_H_COEF = 0.33f;
    private static final float FACE_FRAME_LANDSCAPE_H_COEF = 0.28f;
    private static final float FACE_FRAME_LANDSCAPE_START_MARGIN_COEF = 0.1f;
    private static final float FACE_FRAME_LANDSCAPE_TOP_MARGIN_COEF = 0.15f;
    private static final float FACE_FRAME_LANDSCAPE_W_COEF = 0.8f;
    private static final float FACE_FRAME_ROUND_LANDSCAPE_H_COEF = 0.32f;
    private static final float FACE_FRAME_START_MARGIN_COEF = 0.25f;
    private static final float FACE_FRAME_TOP_MARGIN_COEF = 0.11f;
    private static final float FACE_FRAME_W_COEF = 0.53f;
    private static final float PASS_FRAME_H_COEF = 0.38f;
    private static final float PASS_FRAME_LANDSCAPE_TOP_MARGIN_COEF = 0.55f;
    private static final float PASS_FRAME_START_MARGIN_COEF = 0.25f;
    private static final float PASS_FRAME_TOP_MARGIN_COEF = 0.45f;
    private static final float PASS_FRAME_W_COEF = 0.53f;
    private static final float ROUND_FACE_FRAME_LANDSCAPE_RADIUS_COEF = 2.7f;
    private static final float ROUND_FACE_FRAME_RADIUS_COEF = 3.0f;
    private final int borderColor;

    @NotNull
    private Paint docFrameAreaBorderStrokePaint;
    private RectF faceFrameRectF;
    private RectF faceLandscapeFrameRectF;
    private ValueAnimator fadeInAnimator;
    private ValueAnimator fadeOutAnimator;
    private boolean isRoundFace;
    private int landscapeAlpha;

    @NotNull
    private DocFrameOrientation orientation;
    private RectF passportFrameAreaRectF;
    private RectF passportLandscapeFrameAreaRectF;
    private int portraitAlpha;
    private static final float PASS_FRAME_CORNERS_RADIUS = UiExtKt.toPxF(18.0f);
    private static final float FACE_FRAME_CORNERS_RADIUS = UiExtKt.toPxF(100.0f);
    private static final float FACE_FRAME_LANDSCAPE_CORNERS_RADIUS = UiExtKt.toPxF(200.0f);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieDocFrameView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateFadeIn(DocFrameOrientation to) {
        final boolean z11 = to == DocFrameOrientation.PORTRAIT;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.features.camera.ui.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SelfieDocFrameView.animateFadeIn$lambda$4$lambda$3(z11, this, valueAnimator);
            }
        });
        this.fadeInAnimator = ofInt;
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateFadeIn$lambda$4$lambda$3(boolean z11, SelfieDocFrameView selfieDocFrameView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z11) {
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            selfieDocFrameView.portraitAlpha = ((Integer) animatedValue).intValue();
        } else {
            Object animatedValue2 = it.getAnimatedValue();
            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            selfieDocFrameView.landscapeAlpha = ((Integer) animatedValue2).intValue();
        }
        selfieDocFrameView.invalidate();
    }

    private final RectF calculateLandscapeFaceRectF(int width, int height) {
        float f7 = height;
        boolean z11 = this.isRoundFace;
        float f11 = (z11 ? FACE_FRAME_ROUND_LANDSCAPE_H_COEF : FACE_FRAME_LANDSCAPE_H_COEF) * f7;
        float f12 = width;
        float f13 = FACE_FRAME_LANDSCAPE_W_COEF * f12;
        float f14 = f12 * FACE_FRAME_LANDSCAPE_START_MARGIN_COEF;
        float f15 = f13 + f14;
        float f16 = f7 * (!z11 ? 0.19f : 0.17f);
        return new RectF(f14, f16, f15, f11 + f16);
    }

    private final RectF calculateLandscapePassportRectF(int width, int height) {
        float f7 = width;
        float f11 = 0.53f * f7;
        float f12 = height;
        float f13 = PASS_FRAME_H_COEF * f12;
        float f14 = (f7 - f13) / 2;
        float f15 = f12 * PASS_FRAME_LANDSCAPE_TOP_MARGIN_COEF;
        return new RectF(f14, f15, f13 + f14, f11 + f15);
    }

    private final RectF calculatePortraitFaceRectF(int width, int height) {
        float f7 = height;
        float f11 = FACE_FRAME_H_COEF * f7;
        float f12 = width;
        float f13 = 0.53f * f12;
        float f14 = f12 * 0.25f;
        float f15 = f7 * FACE_FRAME_TOP_MARGIN_COEF;
        return new RectF(f14, f15, f13 + f14, f11 + f15);
    }

    private final RectF calculatePortraitPassportRectF(int width, int height) {
        float f7 = height;
        float f11 = PASS_FRAME_H_COEF * f7;
        float f12 = width;
        float f13 = 0.53f * f12;
        float f14 = f12 * 0.25f;
        float f15 = f13 + f14;
        float f16 = f7 * (!this.isRoundFace ? PASS_FRAME_TOP_MARGIN_COEF : 0.47f);
        return new RectF(f14, f16, f15, f11 + f16);
    }

    private final void cancelAnimation() {
        ValueAnimator valueAnimator = this.fadeInAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.fadeOutAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.fadeOutAnimator = null;
        this.fadeInAnimator = null;
    }

    private final void drawLandscapePassportDivider(Canvas canvas, RectF rectF) {
        canvas.drawLine(rectF.centerX(), rectF.top, rectF.centerX(), rectF.bottom, this.docFrameAreaBorderStrokePaint);
    }

    private final void drawLandscapeSelfieDocFrame(Canvas canvas) {
        this.docFrameAreaBorderStrokePaint.setAlpha(this.landscapeAlpha);
        RectF rectF = this.faceLandscapeFrameRectF;
        if (rectF != null) {
            if (this.isRoundFace) {
                drawRoundFaceFrame(canvas, rectF, DocFrameOrientation.LANDSCAPE);
            } else {
                drawOvalFaceFrame(canvas, rectF, DocFrameOrientation.LANDSCAPE);
            }
        }
        RectF rectF2 = this.passportLandscapeFrameAreaRectF;
        if (rectF2 != null) {
            drawPassportBounds(canvas, rectF2);
            drawLandscapePassportDivider(canvas, rectF2);
        }
    }

    private final void drawOvalFaceFrame(Canvas canvas, RectF rectF, DocFrameOrientation orientation) {
        float f7 = orientation == DocFrameOrientation.PORTRAIT ? FACE_FRAME_CORNERS_RADIUS : FACE_FRAME_LANDSCAPE_CORNERS_RADIUS;
        canvas.drawRoundRect(rectF, f7, f7, this.docFrameAreaBorderStrokePaint);
    }

    private final void drawPassportBounds(Canvas canvas, RectF rectF) {
        float f7 = PASS_FRAME_CORNERS_RADIUS;
        canvas.drawRoundRect(rectF, f7, f7, this.docFrameAreaBorderStrokePaint);
    }

    private final void drawPortraitPassportDivider(Canvas canvas, RectF rectF) {
        canvas.drawLine(rectF.left, rectF.centerY(), rectF.right, rectF.centerY(), this.docFrameAreaBorderStrokePaint);
    }

    private final void drawPortraitSelfieDocFrame(Canvas canvas) {
        this.docFrameAreaBorderStrokePaint.setAlpha(this.portraitAlpha);
        RectF rectF = this.faceFrameRectF;
        if (rectF != null) {
            if (this.isRoundFace) {
                drawRoundFaceFrame(canvas, rectF, DocFrameOrientation.PORTRAIT);
            } else {
                drawOvalFaceFrame(canvas, rectF, DocFrameOrientation.PORTRAIT);
            }
        }
        RectF rectF2 = this.passportFrameAreaRectF;
        if (rectF2 != null) {
            drawPassportBounds(canvas, rectF2);
            drawPortraitPassportDivider(canvas, rectF2);
        }
    }

    private final void drawRoundFaceFrame(Canvas canvas, RectF rectF, DocFrameOrientation orientation) {
        float measuredHeight;
        float f7;
        if (orientation == DocFrameOrientation.PORTRAIT) {
            measuredHeight = getMeasuredHeight();
            f7 = 6.0f;
        } else {
            measuredHeight = getMeasuredHeight();
            f7 = 5.4f;
        }
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), measuredHeight / f7, this.docFrameAreaBorderStrokePaint);
    }

    private final void startTransitionAnimation(DocFrameOrientation from, final DocFrameOrientation to) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.fadeInAnimator;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = this.fadeOutAnimator) != null && valueAnimator.isRunning())) {
            cancelAnimation();
        }
        final boolean z11 = from == DocFrameOrientation.PORTRAIT;
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.features.camera.ui.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                SelfieDocFrameView.startTransitionAnimation$lambda$2$lambda$1(z11, this, valueAnimator3);
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.fintech.features.camera.ui.SelfieDocFrameView$startTransitionAnimation$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                SelfieDocFrameView.this.animateFadeIn(to);
            }
        });
        this.fadeOutAnimator = ofInt;
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitionAnimation$lambda$2$lambda$1(boolean z11, SelfieDocFrameView selfieDocFrameView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z11) {
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            selfieDocFrameView.portraitAlpha = ((Integer) animatedValue).intValue();
        } else {
            Object animatedValue2 = it.getAnimatedValue();
            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            selfieDocFrameView.landscapeAlpha = ((Integer) animatedValue2).intValue();
        }
        selfieDocFrameView.invalidate();
    }

    private final void updateSelfieDocFrameLayout(int width, int height) {
        if (getVisibility() == 0) {
            this.faceFrameRectF = calculatePortraitFaceRectF(width, height);
            this.passportFrameAreaRectF = calculatePortraitPassportRectF(width, height);
            this.faceLandscapeFrameRectF = calculateLandscapeFaceRectF(width, height);
            this.passportLandscapeFrameAreaRectF = calculateLandscapePassportRectF(width, height);
        } else {
            this.faceFrameRectF = null;
            this.passportFrameAreaRectF = null;
            this.faceLandscapeFrameRectF = null;
            this.passportLandscapeFrameAreaRectF = null;
        }
        invalidate();
    }

    static /* synthetic */ void updateSelfieDocFrameLayout$default(SelfieDocFrameView selfieDocFrameView, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = selfieDocFrameView.getMeasuredWidth();
        }
        if ((i13 & 2) != 0) {
            i12 = selfieDocFrameView.getMeasuredHeight();
        }
        selfieDocFrameView.updateSelfieDocFrameLayout(i11, i12);
    }

    @NotNull
    public final DocFrameOrientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: isRoundFace, reason: from getter */
    public final boolean getIsRoundFace() {
        return this.isRoundFace;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.portraitAlpha > 0) {
            drawPortraitSelfieDocFrame(canvas);
        } else {
            drawLandscapeSelfieDocFrame(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        updateSelfieDocFrameLayout$default(this, 0, 0, 3, null);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        updateSelfieDocFrameLayout(w11, h11);
    }

    public final void setOrientation(@NotNull DocFrameOrientation value) {
        Intrinsics.checkNotNullParameter(value, "value");
        DocFrameOrientation docFrameOrientation = this.orientation;
        if (value == docFrameOrientation) {
            return;
        }
        this.orientation = value;
        startTransitionAnimation(docFrameOrientation, value);
    }

    public final void setRoundFace(boolean z11) {
        if (z11 != this.isRoundFace) {
            this.isRoundFace = z11;
            updateSelfieDocFrameLayout$default(this, 0, 0, 3, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieDocFrameView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SelfieDocFrameView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieDocFrameView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.portraitAlpha = 255;
        this.orientation = DocFrameOrientation.PORTRAIT;
        this.borderColor = R.color.white;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(androidx.core.content.a.getColor(context, R.color.white));
        paint.setStrokeWidth(UiExtKt.toPxF(BOX_STROKE_WIDTH));
        this.docFrameAreaBorderStrokePaint = paint;
    }
}
