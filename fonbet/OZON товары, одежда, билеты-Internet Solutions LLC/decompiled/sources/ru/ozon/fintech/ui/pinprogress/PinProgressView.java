package ru.ozon.fintech.ui.pinprogress;

import B0.C2454a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nL.C8468a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.pinprogress.PinProgressView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 P2\u00020\u0001:\u0003PQRB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0014J(\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0014J\u0010\u00108\u001a\u0002002\u0006\u00109\u001a\u00020:H\u0014J\u0006\u0010;\u001a\u000200J\u0006\u0010<\u001a\u000200J&\u0010=\u001a\u0002002\b\b\u0002\u0010>\u001a\u00020+2\b\b\u0002\u0010?\u001a\u00020+2\b\b\u0002\u0010@\u001a\u00020+H\u0002J\b\u0010A\u001a\u000200H\u0002J\b\u0010B\u001a\u000200H\u0002J\u0010\u0010C\u001a\u0002002\u0006\u0010D\u001a\u00020\fH\u0002J\u0006\u0010E\u001a\u000200J \u0010F\u001a\u00020-2\u0006\u0010D\u001a\u00020\f2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u001eH\u0002J0\u0010I\u001a\u00020-2\u0006\u0010D\u001a\u00020\f2\u0006\u0010J\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u001eH\u0002J\u001a\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0N0MH\u0002J\b\u0010O\u001a\u000200H\u0014R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R&\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R&\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010'\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lru/ozon/fintech/ui/pinprogress/PinProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dots", "", "Lru/ozon/fintech/ui/pinprogress/PinProgressView$DotState;", "paint", "Landroid/graphics/Paint;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "dotsCount", "getDotsCount", "()I", "setDotsCount", "(I)V", "normalColor", "getNormalColor", "setNormalColor", "selectedColor", "getSelectedColor", "setSelectedColor", "errorColor", "getErrorColor", "setErrorColor", "", "dotRadius", "getDotRadius", "()F", "setDotRadius", "(F)V", "selectedRadius", "getSelectedRadius", "setSelectedRadius", "selectedDot", "getSelectedDot", "setSelectedDot", "isCircleAnimating", "", "loaderAnimator", "Landroid/animation/Animator;", "currentAngle", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "reset", "setupDots", "layoutDots", "shouldAnimateSelectedDot", "shouldRequestLayout", "shouldAnimateUnselectedDotColor", "animateUnselectedDotColor", "animateSelectedDot", "animateDot", "dot", "playLoaderAnimation", "moveToCenterAnim", "targetX", "targetY", "createMoveAndShakeAnimator", "startX", "startY", "calculateTargetPositions", "", "Lkotlin/Pair;", "onDetachedFromWindow", "Companion", "DotStatus", "DotState", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinProgressView extends View {
    private static final long ARRANGE_IN_CIRCLE_DURATION = 200;
    private static final long CIRCLE_ROTATION_DURATION = 1300;
    public static final int DEFAULT_DOTS_COUNT = 4;
    public static final float DEFAULT_DOT_RADIUS = 6.0f;
    public static final float DEFAULT_SELECTED_DOT_RADIUS = 8.0f;
    private static final int INITIAL_SELECTED_DOT = 0;
    private static final long MOVE_TO_CENTER_DURATION = 200;
    public static final long SCALE_DURATION = 200;
    public static final long SHAKE_DURATION = 300;
    private float currentAngle;
    private float dotRadius;

    @NotNull
    private final List<DotState> dots;
    private int dotsCount;
    private int errorColor;
    private boolean isCircleAnimating;
    private Animator loaderAnimator;
    private int normalColor;

    @NotNull
    private final Paint paint;
    private int selectedColor;
    private int selectedDot;
    private float selectedRadius;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/fintech/ui/pinprogress/PinProgressView$DotStatus;", "", "<init>", "(Ljava/lang/String;I)V", "FILLED", "EMPTY", "ERROR", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DotStatus {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ DotStatus[] $VALUES;
        public static final DotStatus FILLED = new DotStatus("FILLED", 0);
        public static final DotStatus EMPTY = new DotStatus("EMPTY", 1);
        public static final DotStatus ERROR = new DotStatus("ERROR", 2);

        private static final /* synthetic */ DotStatus[] $values() {
            return new DotStatus[]{FILLED, EMPTY, ERROR};
        }

        static {
            DotStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private DotStatus(String str, int i11) {
        }

        @NotNull
        public static Xc.a<DotStatus> getEntries() {
            return $ENTRIES;
        }

        public static DotStatus valueOf(String str) {
            return (DotStatus) Enum.valueOf(DotStatus.class, str);
        }

        public static DotStatus[] values() {
            return (DotStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void animateDot(final DotState dot) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.dotRadius, this.selectedRadius);
        ofFloat.setInterpolator(new OvershootInterpolator(1.5f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.ui.pinprogress.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinProgressView.animateDot$lambda$20$lambda$19(PinProgressView.DotState.this, this, valueAnimator);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.selectedRadius, this.dotRadius);
        ofFloat2.setInterpolator(new OvershootInterpolator(1.5f));
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.ui.pinprogress.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinProgressView.animateDot$lambda$22$lambda$21(PinProgressView.DotState.this, this, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.setInterpolator(new OvershootInterpolator(1.5f));
        animatorSet.setDuration(200L);
        ValueAnimator ofArgb = ValueAnimator.ofArgb(dot.getColor(), this.selectedColor);
        ofArgb.addUpdateListener(new Bk0.b(1, dot, this));
        ofArgb.setDuration(200L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(animatorSet, ofArgb);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDot$lambda$20$lambda$19(DotState dotState, PinProgressView pinProgressView, ValueAnimator valueAnimator) {
        dotState.setRadius(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
        pinProgressView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDot$lambda$22$lambda$21(DotState dotState, PinProgressView pinProgressView, ValueAnimator valueAnimator) {
        dotState.setRadius(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
        pinProgressView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDot$lambda$25$lambda$24(DotState dotState, PinProgressView pinProgressView, ValueAnimator valueAnimator) {
        dotState.setColor(((Integer) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
        pinProgressView.invalidate();
    }

    private final void animateSelectedDot() {
        int i11 = 0;
        for (Object obj : this.dots) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DotState dotState = (DotState) obj;
            if (i11 == this.selectedDot - 1) {
                dotState.setStatus(DotStatus.FILLED);
                animateDot(dotState);
            }
            i11 = i12;
        }
    }

    private final void animateUnselectedDotColor() {
        int i11 = 0;
        for (Object obj : this.dots) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            final DotState dotState = (DotState) obj;
            if (i11 == this.selectedDot) {
                dotState.setStatus(DotStatus.EMPTY);
                ValueAnimator ofArgb = ValueAnimator.ofArgb(this.selectedColor, dotState.getColor());
                ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.ui.pinprogress.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PinProgressView.animateUnselectedDotColor$lambda$17$lambda$16$lambda$15(PinProgressView.DotState.this, this, valueAnimator);
                    }
                });
                ofArgb.setDuration(200L);
                ofArgb.start();
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateUnselectedDotColor$lambda$17$lambda$16$lambda$15(DotState dotState, PinProgressView pinProgressView, ValueAnimator valueAnimator) {
        dotState.setColor(((Integer) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
        pinProgressView.invalidate();
    }

    private final List<Pair<Float, Float>> calculateTargetPositions() {
        if (getWidth() == 0 || getHeight() == 0) {
            return K.f71697a;
        }
        float measuredWidth = getMeasuredWidth();
        float f7 = this.dotRadius;
        float f11 = 2;
        float f12 = (f11 * f7) + ((measuredWidth - ((f7 * f11) * this.dotsCount)) / (r4 - 1));
        float height = getHeight() / 2.0f;
        int i11 = this.dotsCount;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(new Pair(Float.valueOf((i12 * f12) + this.dotRadius), Float.valueOf(height)));
        }
        return arrayList;
    }

    private final Animator createMoveAndShakeAnimator(DotState dot, float startX, float startY, float targetX, float targetY) {
        float f7 = targetX + 8.0f;
        float f11 = targetX - 8.0f;
        float f12 = targetY + 5.0f;
        float f13 = targetY - 5.0f;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dot, PropertyValuesHolder.ofKeyframe("x", (Keyframe[]) Arrays.copyOf(new Keyframe[]{Keyframe.ofFloat(0.0f, startX), Keyframe.ofFloat(0.1f, f7), Keyframe.ofFloat(0.2f, f11), Keyframe.ofFloat(0.3f, f7), Keyframe.ofFloat(0.4f, f11), Keyframe.ofFloat(0.5f, f7), Keyframe.ofFloat(0.6f, f11), Keyframe.ofFloat(0.7f, targetX + 4.0f), Keyframe.ofFloat(0.8f, targetX - 4.0f), Keyframe.ofFloat(0.9f, targetX + 2.0f), Keyframe.ofFloat(1.0f, targetX)}, 11)), PropertyValuesHolder.ofKeyframe("y", (Keyframe[]) Arrays.copyOf(new Keyframe[]{Keyframe.ofFloat(0.0f, startY), Keyframe.ofFloat(0.1f, f12), Keyframe.ofFloat(0.2f, f13), Keyframe.ofFloat(0.3f, f12), Keyframe.ofFloat(0.4f, f13), Keyframe.ofFloat(0.5f, f12), Keyframe.ofFloat(0.6f, f13), Keyframe.ofFloat(0.7f, targetY + 3.0f), Keyframe.ofFloat(0.8f, targetY - 3.0f), Keyframe.ofFloat(0.9f, targetY + 1.0f), Keyframe.ofFloat(1.0f, targetY)}, 11)));
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        ofPropertyValuesHolder.addUpdateListener(new OB.b(this, 1));
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
        return ofPropertyValuesHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMoveAndShakeAnimator$lambda$47$lambda$46(PinProgressView pinProgressView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        pinProgressView.invalidate();
    }

    private final void layoutDots(boolean shouldAnimateSelectedDot, boolean shouldRequestLayout, boolean shouldAnimateUnselectedDotColor) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float measuredWidth = getMeasuredWidth();
        float f7 = this.dotRadius;
        float f11 = 2;
        float f12 = (f11 * f7) + ((measuredWidth - ((f7 * f11) * this.dotsCount)) / (r4 - 1));
        float height = getHeight() / 2.0f;
        int i11 = 0;
        for (Object obj : this.dots) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DotState dotState = (DotState) obj;
            dotState.setX((i11 * f12) + this.dotRadius);
            dotState.setY(height);
            dotState.setRadius(this.dotRadius);
            dotState.setColor(i11 < this.selectedDot ? this.selectedColor : this.normalColor);
            i11 = i12;
        }
        if (shouldAnimateSelectedDot) {
            animateSelectedDot();
        }
        if (shouldAnimateUnselectedDotColor) {
            animateUnselectedDotColor();
        }
        if (shouldRequestLayout) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void layoutDots$default(PinProgressView pinProgressView, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            z13 = false;
        }
        pinProgressView.layoutDots(z11, z12, z13);
    }

    private final Animator moveToCenterAnim(final DotState dot, float targetX, float targetY) {
        dot.setColor(this.selectedColor);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(dot.getX(), targetX);
        ofFloat.addUpdateListener(new C8468a(1, dot, this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dot.getY(), targetY);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.ui.pinprogress.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinProgressView.moveToCenterAnim$lambda$44$lambda$43(PinProgressView.DotState.this, this, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(200L);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToCenterAnim$lambda$42$lambda$41(DotState dotState, PinProgressView pinProgressView, ValueAnimator valueAnimator) {
        dotState.setX(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
        pinProgressView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToCenterAnim$lambda$44$lambda$43(DotState dotState, PinProgressView pinProgressView, ValueAnimator valueAnimator) {
        dotState.setY(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
        pinProgressView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playLoaderAnimation$lambda$29$lambda$28(PinProgressView pinProgressView, float f7, float f11, ValueAnimator valueAnimator) {
        float floatValue = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        int i11 = 0;
        for (Object obj : pinProgressView.dots) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DotState dotState = (DotState) obj;
            double d11 = (i11 * 6.2831855f) / pinProgressView.dotsCount;
            float cos = (pinProgressView.dotRadius * ((float) Math.cos(d11)) * floatValue) + f7;
            float sin = (pinProgressView.dotRadius * ((float) Math.sin(d11)) * floatValue) + f11;
            dotState.setX(cos);
            dotState.setY(sin);
            i11 = i12;
        }
        pinProgressView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playLoaderAnimation$lambda$32$lambda$31(PinProgressView pinProgressView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        for (DotState dotState : pinProgressView.dots) {
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            dotState.setRadius(((Float) animatedValue).floatValue());
            pinProgressView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playLoaderAnimation$lambda$39$lambda$38(PinProgressView pinProgressView, ValueAnimator valueAnimator, float f7, float f11, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!pinProgressView.isCircleAnimating) {
            valueAnimator.cancel();
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        pinProgressView.currentAngle = ((Float) animatedValue).floatValue();
        int i11 = 0;
        for (Object obj : pinProgressView.dots) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DotState dotState = (DotState) obj;
            double radians = ((i11 * 6.283185307179586d) / pinProgressView.dotsCount) + Math.toRadians(pinProgressView.currentAngle);
            dotState.setX((pinProgressView.dotRadius * ((float) Math.cos(radians))) + f7);
            dotState.setY((pinProgressView.dotRadius * ((float) Math.sin(radians))) + f11);
            i11 = i12;
        }
        pinProgressView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$10$lambda$6$lambda$5(DotState dotState, PinProgressView pinProgressView, ValueAnimator valueAnimator) {
        dotState.setColor(((Integer) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
        pinProgressView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$10$lambda$8$lambda$7(DotState dotState, PinProgressView pinProgressView, ValueAnimator valueAnimator) {
        dotState.setRadius(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
        pinProgressView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$4$lambda$3$lambda$2$lambda$1(DotState dotState, PinProgressView pinProgressView, ValueAnimator valueAnimator) {
        dotState.setColor(((Integer) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
        pinProgressView.invalidate();
    }

    public final float getDotRadius() {
        return this.dotRadius;
    }

    public final int getDotsCount() {
        return this.dotsCount;
    }

    public final int getErrorColor() {
        return this.errorColor;
    }

    public final int getNormalColor() {
        return this.normalColor;
    }

    public final int getSelectedColor() {
        return this.selectedColor;
    }

    public final int getSelectedDot() {
        return this.selectedDot;
    }

    public final float getSelectedRadius() {
        return this.selectedRadius;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.loaderAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        for (DotState dotState : this.dots) {
            this.paint.setColor(dotState.getColor());
            canvas.drawCircle(dotState.getX(), dotState.getY(), dotState.getRadius(), this.paint);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.resolveSize(C6915b.c(this.dotRadius * 4) * this.dotsCount, widthMeasureSpec), View.resolveSize(C6915b.c(this.dotRadius) * 2, heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        layoutDots$default(this, false, false, false, 7, null);
    }

    public final void playLoaderAnimation() {
        this.isCircleAnimating = true;
        final float width = getWidth() / 2.0f;
        final float height = getHeight() / 2.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.ui.pinprogress.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinProgressView.playLoaderAnimation$lambda$29$lambda$28(PinProgressView.this, width, height, valueAnimator);
            }
        });
        float f7 = this.dotRadius;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f7, f7 / 2.0f);
        ofFloat2.addUpdateListener(new h(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        List<DotState> list = this.dots;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Animator moveToCenterAnim = moveToCenterAnim((DotState) it.next(), width, height);
            moveToCenterAnim.setInterpolator(new OvershootInterpolator(1.5f));
            arrayList.add(moveToCenterAnim);
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(ofFloat2, ofFloat);
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet2.setDuration(200L);
        final ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setDuration(CIRCLE_ROTATION_DURATION);
        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.ui.pinprogress.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinProgressView.playLoaderAnimation$lambda$39$lambda$38(PinProgressView.this, ofFloat3, width, height, valueAnimator);
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2, ofFloat3);
        animatorSet3.start();
        this.loaderAnimator = animatorSet3;
    }

    public final void reset() {
        boolean z11 = false;
        int i11 = 1;
        Animator animator = this.loaderAnimator;
        if (animator != null) {
            animator.cancel();
        }
        this.isCircleAnimating = false;
        setSelectedDot(0);
        List<Pair<Float, Float>> calculateTargetPositions = calculateTargetPositions();
        if (calculateTargetPositions.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        final AnimatorSet animatorSet = new AnimatorSet();
        List<DotState> list = this.dots;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
        for (DotState dotState : list) {
            ValueAnimator ofArgb = ValueAnimator.ofArgb(this.errorColor, this.normalColor);
            ofArgb.addUpdateListener(new qW.c(i11, dotState, this));
            ofArgb.setDuration(200L);
            arrayList2.add(ofArgb);
        }
        animatorSet.playTogether(arrayList2);
        int i12 = 0;
        for (Object obj : this.dots) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            final DotState dotState2 = (DotState) obj;
            Pair<Float, Float> pair = calculateTargetPositions.get(i12);
            Animator createMoveAndShakeAnimator = createMoveAndShakeAnimator(dotState2, dotState2.getX(), dotState2.getY(), pair.a().floatValue(), pair.b().floatValue());
            dotState2.setStatus(DotStatus.ERROR);
            ValueAnimator ofArgb2 = ValueAnimator.ofArgb(dotState2.getColor(), this.errorColor);
            ofArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.ui.pinprogress.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PinProgressView.reset$lambda$10$lambda$6$lambda$5(PinProgressView.DotState.this, this, valueAnimator);
                }
            });
            ofArgb2.setDuration(200L);
            float radius = dotState2.getRadius();
            float f7 = this.dotRadius;
            boolean z12 = z11;
            float[] fArr = new float[2];
            fArr[z12 ? 1 : 0] = radius;
            fArr[1] = f7;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.fintech.ui.pinprogress.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PinProgressView.reset$lambda$10$lambda$8$lambda$7(PinProgressView.DotState.this, this, valueAnimator);
                }
            });
            ofFloat.setDuration(200L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Animator[] animatorArr = new Animator[3];
            animatorArr[z12 ? 1 : 0] = createMoveAndShakeAnimator;
            animatorArr[1] = ofArgb2;
            animatorArr[2] = ofFloat;
            animatorSet2.playTogether(animatorArr);
            arrayList.add(animatorSet2);
            i12 = i13;
            z11 = z12 ? 1 : 0;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        animatorSet3.start();
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.fintech.ui.pinprogress.PinProgressView$reset$2$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animatorSet.start();
            }
        });
        Iterator<T> it = this.dots.iterator();
        while (it.hasNext()) {
            ((DotState) it.next()).setStatus(DotStatus.EMPTY);
        }
    }

    public final void setDotRadius(float f7) {
        if (this.dotRadius == f7) {
            return;
        }
        this.dotRadius = f7;
        layoutDots$default(this, false, true, false, 5, null);
    }

    public final void setDotsCount(int i11) {
        if (this.dotsCount != i11) {
            this.dotsCount = i11;
            setupDots();
        }
    }

    public final void setErrorColor(int i11) {
        if (this.errorColor != i11) {
            this.errorColor = i11;
            layoutDots$default(this, false, false, false, 7, null);
        }
    }

    public final void setNormalColor(int i11) {
        if (this.normalColor != i11) {
            this.normalColor = i11;
            layoutDots$default(this, false, false, false, 7, null);
        }
    }

    public final void setSelectedColor(int i11) {
        if (this.selectedColor != i11) {
            this.selectedColor = i11;
            layoutDots$default(this, false, false, false, 7, null);
        }
    }

    public final void setSelectedDot(int i11) {
        int i12;
        int i13 = this.selectedDot;
        if (i13 == i11 || i11 > (i12 = this.dotsCount)) {
            return;
        }
        if (i13 > i11) {
            this.selectedDot = i11;
            layoutDots$default(this, false, false, true, 2, null);
        } else {
            this.selectedDot = i11;
            layoutDots$default(this, i11 != i12, false, false, 6, null);
        }
    }

    public final void setSelectedRadius(float f7) {
        if (this.selectedRadius == f7) {
            return;
        }
        this.selectedRadius = f7;
        layoutDots$default(this, false, false, false, 7, null);
    }

    public final void setupDots() {
        this.dots.clear();
        int i11 = this.dotsCount;
        for (int i12 = 0; i12 < i11; i12++) {
            this.dots.add(new DotState(0.0f, 0.0f, this.dotRadius, this.normalColor, DotStatus.EMPTY));
        }
        layoutDots$default(this, false, true, false, 5, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PinProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dots = new ArrayList();
        this.paint = new Paint(1);
        this.dotsCount = 4;
        this.normalColor = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_TERTIARY.getResId());
        this.selectedColor = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_ACTION_PRIMARY.getResId());
        this.errorColor = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_NEGATIVE_PRIMARY.getResId());
        this.dotRadius = UiExtKt.toPxF(6.0f);
        this.selectedRadius = UiExtKt.toPxF(8.0f);
        setupDots();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/fintech/ui/pinprogress/PinProgressView$DotState;", "", "x", "", "y", "radius", "color", "", "status", "Lru/ozon/fintech/ui/pinprogress/PinProgressView$DotStatus;", "<init>", "(FFFILru/ozon/fintech/ui/pinprogress/PinProgressView$DotStatus;)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "getRadius", "setRadius", "getColor", "()I", "setColor", "(I)V", "getStatus", "()Lru/ozon/fintech/ui/pinprogress/PinProgressView$DotStatus;", "setStatus", "(Lru/ozon/fintech/ui/pinprogress/PinProgressView$DotStatus;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DotState {
        private int color;
        private float radius;
        private DotStatus status;
        private float x;
        private float y;

        public DotState(float f7, float f11, float f12, int i11, DotStatus dotStatus) {
            this.x = f7;
            this.y = f11;
            this.radius = f12;
            this.color = i11;
            this.status = dotStatus;
        }

        public static /* synthetic */ DotState copy$default(DotState dotState, float f7, float f11, float f12, int i11, DotStatus dotStatus, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                f7 = dotState.x;
            }
            if ((i12 & 2) != 0) {
                f11 = dotState.y;
            }
            if ((i12 & 4) != 0) {
                f12 = dotState.radius;
            }
            if ((i12 & 8) != 0) {
                i11 = dotState.color;
            }
            if ((i12 & 16) != 0) {
                dotStatus = dotState.status;
            }
            DotStatus dotStatus2 = dotStatus;
            float f13 = f12;
            return dotState.copy(f7, f11, f13, i11, dotStatus2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* renamed from: component3, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        /* renamed from: component4, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* renamed from: component5, reason: from getter */
        public final DotStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final DotState copy(float x11, float y11, float radius, int color, DotStatus status) {
            return new DotState(x11, y11, radius, color, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DotState)) {
                return false;
            }
            DotState dotState = (DotState) other;
            return Float.compare(this.x, dotState.x) == 0 && Float.compare(this.y, dotState.y) == 0 && Float.compare(this.radius, dotState.radius) == 0 && this.color == dotState.color && this.status == dotState.status;
        }

        public final int getColor() {
            return this.color;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final DotStatus getStatus() {
            return this.status;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.color, Pk0.b.a(this.radius, Pk0.b.a(this.y, Float.hashCode(this.x) * 31, 31), 31), 31);
            DotStatus dotStatus = this.status;
            return a11 + (dotStatus == null ? 0 : dotStatus.hashCode());
        }

        public final void setColor(int i11) {
            this.color = i11;
        }

        public final void setRadius(float f7) {
            this.radius = f7;
        }

        public final void setStatus(DotStatus dotStatus) {
            this.status = dotStatus;
        }

        public final void setX(float f7) {
            this.x = f7;
        }

        public final void setY(float f7) {
            this.y = f7;
        }

        @NotNull
        public String toString() {
            return "DotState(x=" + this.x + ", y=" + this.y + ", radius=" + this.radius + ", color=" + this.color + ", status=" + this.status + ")";
        }

        public /* synthetic */ DotState(float f7, float f11, float f12, int i11, DotStatus dotStatus, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(f7, f11, f12, i11, (i12 & 16) != 0 ? null : dotStatus);
        }
    }
}
