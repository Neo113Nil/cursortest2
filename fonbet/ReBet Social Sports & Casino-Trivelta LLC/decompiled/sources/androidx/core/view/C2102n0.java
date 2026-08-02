package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2102n0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f19246a;

    /* renamed from: androidx.core.view.n0$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2104o0 f19247a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f19248b;

        public a(InterfaceC2104o0 interfaceC2104o0, View view) {
            this.f19247a = interfaceC2104o0;
            this.f19248b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19247a.a(this.f19248b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19247a.b(this.f19248b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f19247a.c(this.f19248b);
        }
    }

    public C2102n0(View view) {
        this.f19246a = new WeakReference(view);
    }

    public C2102n0 b(float f10) {
        View view = (View) this.f19246a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f19246a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f19246a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C2102n0 e(long j10) {
        View view = (View) this.f19246a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C2102n0 f(Interpolator interpolator) {
        View view = (View) this.f19246a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C2102n0 g(InterfaceC2104o0 interfaceC2104o0) {
        View view = (View) this.f19246a.get();
        if (view != null) {
            h(view, interfaceC2104o0);
        }
        return this;
    }

    public final void h(View view, InterfaceC2104o0 interfaceC2104o0) {
        if (interfaceC2104o0 != null) {
            view.animate().setListener(new a(interfaceC2104o0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C2102n0 i(long j10) {
        View view = (View) this.f19246a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C2102n0 j(final InterfaceC2108q0 interfaceC2108q0) {
        final View view = (View) this.f19246a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC2108q0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.m0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    InterfaceC2108q0.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f19246a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C2102n0 l(float f10) {
        View view = (View) this.f19246a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    public C2102n0 m(Runnable runnable) {
        View view = (View) this.f19246a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }
}
