package L2;

import L2.AbstractC1388m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public abstract class C {
    public static Animator a(View view, A a10, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, AbstractC1388m abstractC1388m) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) a10.f6757b.getTag(AbstractC1383h.f6857e)) != null) {
            f10 = (r2[0] - i10) + translationX;
            f11 = (r2[1] - i11) + translationY;
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == f12 && f11 == f13) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, f13));
        a aVar = new a(view, a10.f6757b, translationX, translationY);
        abstractC1388m.c(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public static class a extends AnimatorListenerAdapter implements AbstractC1388m.i {

        /* renamed from: a, reason: collision with root package name */
        public final View f6763a;

        /* renamed from: b, reason: collision with root package name */
        public final View f6764b;

        /* renamed from: c, reason: collision with root package name */
        public float f6765c;

        /* renamed from: d, reason: collision with root package name */
        public float f6766d;

        /* renamed from: e, reason: collision with root package name */
        public final float f6767e;

        /* renamed from: f, reason: collision with root package name */
        public final float f6768f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6769g;
        private int[] mTransitionPosition;

        public a(View view, View view2, float f10, float f11) {
            this.f6764b = view;
            this.f6763a = view2;
            this.f6767e = f10;
            this.f6768f = f11;
            int[] iArr = (int[]) view2.getTag(AbstractC1383h.f6857e);
            this.mTransitionPosition = iArr;
            if (iArr != null) {
                view2.setTag(AbstractC1383h.f6857e, null);
            }
        }

        @Override // L2.AbstractC1388m.i
        public void a(AbstractC1388m abstractC1388m) {
            c();
            this.f6765c = this.f6764b.getTranslationX();
            this.f6766d = this.f6764b.getTranslationY();
            this.f6764b.setTranslationX(this.f6767e);
            this.f6764b.setTranslationY(this.f6768f);
        }

        @Override // L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
            this.f6769g = true;
            this.f6764b.setTranslationX(this.f6767e);
            this.f6764b.setTranslationY(this.f6768f);
        }

        public final void c() {
            if (this.mTransitionPosition == null) {
                this.mTransitionPosition = new int[2];
            }
            this.f6764b.getLocationOnScreen(this.mTransitionPosition);
            this.f6763a.setTag(AbstractC1383h.f6857e, this.mTransitionPosition);
        }

        @Override // L2.AbstractC1388m.i
        public void f(AbstractC1388m abstractC1388m) {
            this.f6764b.setTranslationX(this.f6765c);
            this.f6764b.setTranslationY(this.f6766d);
        }

        @Override // L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
            m(abstractC1388m, false);
        }

        @Override // L2.AbstractC1388m.i
        public void m(AbstractC1388m abstractC1388m, boolean z10) {
            if (this.f6769g) {
                return;
            }
            this.f6763a.setTag(AbstractC1383h.f6857e, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6769g = true;
            this.f6764b.setTranslationX(this.f6767e);
            this.f6764b.setTranslationY(this.f6768f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            this.f6764b.setTranslationX(this.f6767e);
            this.f6764b.setTranslationY(this.f6768f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // L2.AbstractC1388m.i
        public void l(AbstractC1388m abstractC1388m) {
        }
    }
}
