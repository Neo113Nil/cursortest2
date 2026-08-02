package com.vk.clips.design.view.timeline;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import xsna.epx;
import xsna.f4m;
import xsna.iah0;

/* compiled from: ScaledFrameLayout.kt */
/* loaded from: classes16.dex */
public class c extends FrameLayout {
    public static final float c = iah0.b(35.0f);
    public final a b;

    /* compiled from: ScaledFrameLayout.kt */
    public static final class a {
        public boolean a;
        public ValueAnimator b;

        public a() {
            this(0);
        }

        public final void a() {
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.b;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.b = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            ValueAnimator valueAnimator = this.b;
            return hashCode + (valueAnimator == null ? 0 : valueAnimator.hashCode());
        }

        public final String toString() {
            return "VisibilityState(isVisible=" + this.a + ", animator=" + this.b + ')';
        }

        public a(int i) {
            this.a = false;
            this.b = null;
        }
    }

    /* compiled from: AnimExt.kt */
    /* renamed from: com.vk.clips.design.view.timeline.c$c, reason: collision with other inner class name */
    public static final class C0577c extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ c c;

        public C0577c(boolean z, FragmentActionsView fragmentActionsView) {
            this.b = z;
            this.c = fragmentActionsView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z = this.b;
            c cVar = this.c;
            if (!z) {
                f4m.j(cVar);
            }
            cVar.b.a();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(c cVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cVar.setAlpha(floatValue);
        cVar.setCommonScaleWithBoundary(floatValue);
        cVar.setTranslationY((1 - floatValue) * c);
    }

    private final void setCommonScaleWithBoundary(float f) {
        float max = Math.max(f, 0.5f);
        setScaleX(max);
        setScaleY(max);
    }

    public final void b(boolean z, boolean z2) {
        a aVar = this.b;
        if (aVar.a == z || !z2) {
            aVar.a();
            aVar.a = z;
            if (z) {
                setVisibility(0);
                return;
            } else {
                f4m.j(this);
                return;
            }
        }
        ValueAnimator valueAnimator = aVar.b;
        float floatValue = valueAnimator != null ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : z ? 0.0f : 1.0f;
        float f = z ? 1.0f : 0.0f;
        long abs = (long) (Math.abs(f - floatValue) * 200);
        aVar.a();
        setAlpha(floatValue);
        setTranslationY((1 - floatValue) * c);
        setCommonScaleWithBoundary(floatValue);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, f);
        ofFloat.setDuration(abs);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        final FragmentActionsView fragmentActionsView = (FragmentActionsView) this;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.d5h0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                com.vk.clips.design.view.timeline.c.a(fragmentActionsView, valueAnimator2);
            }
        });
        ofFloat.addListener(new b(fragmentActionsView));
        ofFloat.addListener(new C0577c(z, fragmentActionsView));
        aVar.b = ofFloat;
        aVar.a = z;
        ofFloat.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.a();
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new a(0);
        setTranslationY(c);
    }

    /* compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorListener {
        public final /* synthetic */ c b;

        public b(FragmentActionsView fragmentActionsView) {
            this.b = fragmentActionsView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.b.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }
}
