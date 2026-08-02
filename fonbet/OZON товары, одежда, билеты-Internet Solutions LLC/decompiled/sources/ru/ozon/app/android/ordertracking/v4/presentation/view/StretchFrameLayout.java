package ru.ozon.app.android.ordertracking.v4.presentation.view;

import OB.b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.GestureDetectorCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/view/StretchFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "initialTouchX", "", "minInitialWidth", "maxStretchWidth", "gestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "stretchListener", "Lru/ozon/app/android/ordertracking/v4/presentation/view/StretchFrameLayout$StretchListener;", "getStretchListener", "()Lru/ozon/app/android/ordertracking/v4/presentation/view/StretchFrameLayout$StretchListener;", "setStretchListener", "(Lru/ozon/app/android/ordertracking/v4/presentation/view/StretchFrameLayout$StretchListener;)V", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "animateWidthToInitial", "", "Companion", "StretchListener", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StretchFrameLayout extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final GestureDetectorCompat gestureDetector;
    private float initialTouchX;
    private final float maxStretchWidth;
    private int minInitialWidth;
    private StretchListener stretchListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/view/StretchFrameLayout$Companion;", "", "<init>", "()V", "ANIMATION_DURATION", "", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/view/StretchFrameLayout$StretchListener;", "", "onViewStopStretching", "", "onViewStartStretching", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface StretchListener {
        void onViewStartStretching();

        void onViewStopStretching();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StretchFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void animateWidthToInitial() {
        ValueAnimator ofInt = ValueAnimator.ofInt(getLayoutParams().width, this.minInitialWidth);
        ofInt.addUpdateListener(new b(this, 0));
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(500L);
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout$animateWidthToInitial$lambda$5$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                StretchFrameLayout.StretchListener stretchListener = StretchFrameLayout.this.getStretchListener();
                if (stretchListener != null) {
                    stretchListener.onViewStopStretching();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout$animateWidthToInitial$lambda$5$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
                StretchFrameLayout.StretchListener stretchListener = StretchFrameLayout.this.getStretchListener();
                if (stretchListener != null) {
                    stretchListener.onViewStopStretching();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateWidthToInitial$lambda$5$lambda$2(StretchFrameLayout stretchFrameLayout, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        ViewGroup.LayoutParams layoutParams = stretchFrameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        stretchFrameLayout.setLayoutParams(layoutParams);
    }

    public final StretchListener getStretchListener() {
        return this.stretchListener;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.gestureDetector.a(event)) {
            return true;
        }
        int action = event.getAction();
        if (action == 0) {
            StretchListener stretchListener = this.stretchListener;
            if (stretchListener != null) {
                stretchListener.onViewStartStretching();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            this.initialTouchX = event.getX();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float abs = Math.abs(event.getX() - this.initialTouchX);
                int i11 = this.minInitialWidth;
                float f7 = i11 + abs;
                float f11 = i11 + this.maxStretchWidth;
                if (f7 >= f11) {
                    VibrationExtKt.vibrateSingle(this);
                    performClick();
                }
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                if (f7 > f11) {
                    f7 = f11;
                }
                layoutParams.width = (int) f7;
                setLayoutParams(layoutParams);
                return true;
            }
            if (action != 3) {
                return super.onTouchEvent(event);
            }
        }
        animateWidthToInitial();
        return true;
    }

    public final void setStretchListener(StretchListener stretchListener) {
        this.stretchListener = stretchListener;
    }

    public /* synthetic */ StretchFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StretchFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.minInitialWidth = UiExtKt.toPx(50);
        this.maxStretchWidth = UiExtKt.toPxF(45.0f);
        this.gestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                StretchFrameLayout.this.performClick();
                return true;
            }
        });
    }
}
