package L2;

import L2.AbstractC1388m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: L2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1378c extends S {

    /* renamed from: L2.c$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC1388m.i {

        /* renamed from: a, reason: collision with root package name */
        public final View f6832a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6833b = false;

        public a(View view) {
            this.f6832a = view;
        }

        @Override // L2.AbstractC1388m.i
        public void a(AbstractC1388m abstractC1388m) {
            this.f6832a.setTag(AbstractC1383h.f6856d, Float.valueOf(this.f6832a.getVisibility() == 0 ? F.b(this.f6832a) : 0.0f));
        }

        @Override // L2.AbstractC1388m.i
        public void f(AbstractC1388m abstractC1388m) {
            this.f6832a.setTag(AbstractC1383h.f6856d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            F.e(this.f6832a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f6832a.hasOverlappingRendering() && this.f6832a.getLayerType() == 0) {
                this.f6833b = true;
                this.f6832a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f6833b) {
                this.f6832a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            F.e(this.f6832a, 1.0f);
            F.a(this.f6832a);
        }

        @Override // L2.AbstractC1388m.i
        public void b(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void g(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void l(AbstractC1388m abstractC1388m) {
        }

        @Override // L2.AbstractC1388m.i
        public void e(AbstractC1388m abstractC1388m, boolean z10) {
        }
    }

    public C1378c(int i10) {
        v0(i10);
    }

    public static float x0(A a10, float f10) {
        Float f11;
        return (a10 == null || (f11 = (Float) a10.f6756a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // L2.AbstractC1388m
    public boolean N() {
        return true;
    }

    @Override // L2.S, L2.AbstractC1388m
    public void k(A a10) {
        super.k(a10);
        Float f10 = (Float) a10.f6757b.getTag(AbstractC1383h.f6856d);
        if (f10 == null) {
            f10 = a10.f6757b.getVisibility() == 0 ? Float.valueOf(F.b(a10.f6757b)) : Float.valueOf(0.0f);
        }
        a10.f6756a.put("android:fade:transitionAlpha", f10);
    }

    @Override // L2.S
    public Animator s0(ViewGroup viewGroup, View view, A a10, A a11) {
        F.c(view);
        return w0(view, x0(a10, 0.0f), 1.0f);
    }

    @Override // L2.S
    public Animator u0(ViewGroup viewGroup, View view, A a10, A a11) {
        F.c(view);
        Animator w02 = w0(view, x0(a10, 1.0f), 0.0f);
        if (w02 == null) {
            F.e(view, x0(a11, 1.0f));
        }
        return w02;
    }

    public final Animator w0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        F.e(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) F.f6773b, f11);
        a aVar = new a(view);
        ofFloat.addListener(aVar);
        C().c(aVar);
        return ofFloat;
    }

    public C1378c() {
    }
}
