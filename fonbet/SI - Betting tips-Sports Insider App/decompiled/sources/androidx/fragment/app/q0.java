package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2047a;

    /* renamed from: b, reason: collision with root package name */
    public final Cloneable f2048b;

    public q0(j1 fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f2047a = fragmentManager;
        this.f2048b = new CopyOnWriteArrayList();
    }

    public void a(Fragment f6, boolean z5) {
        Intrinsics.checkNotNullParameter(f6, "f");
        Fragment fragment = ((j1) this.f2047a).f1985y;
        if (fragment != null) {
            j1 parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.a(f6, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
        }
    }

    public void b(Fragment fragment, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        j1 fragmentManager = (j1) this.f2047a;
        p0 context = fragmentManager.f1983w.f2087b;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.b(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(context, "context");
            dVar.a(fragment, io.sentry.android.fragment.b.ATTACHED);
        }
    }

    public void c(Fragment fragment, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.c(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            io.sentry.b1 b1Var = dVar.f15912a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            dVar.a(fragment, io.sentry.android.fragment.b.CREATED);
            if (fragment.isAdded()) {
                if (b1Var.m().isEnableScreenTracking()) {
                    b1Var.y(new io.sentry.android.core.internal.gestures.c(1, dVar, fragment));
                }
                WeakHashMap weakHashMap = dVar.f15915d;
                if (b1Var.m().isTracingEnabled() && dVar.f15914c && !weakHashMap.containsKey(fragment)) {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    b1Var.y(new io.sentry.android.fragment.c(objectRef, 0));
                    String b10 = io.sentry.android.fragment.d.b(fragment);
                    io.sentry.i1 i1Var = (io.sentry.i1) objectRef.element;
                    io.sentry.i1 y5 = i1Var != null ? i1Var.y("ui.load", b10) : null;
                    if (y5 != null) {
                        weakHashMap.put(fragment, y5);
                        y5.v().f16675i = "auto.ui.fragment";
                    }
                }
            }
        }
    }

    public void d(Fragment fragment, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.d(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            dVar.a(fragment, io.sentry.android.fragment.b.DESTROYED);
            dVar.c(fragment);
        }
    }

    public void e(Fragment fragment, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.e(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            dVar.a(fragment, io.sentry.android.fragment.b.DETACHED);
        }
    }

    public void f(Fragment fragment, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.f(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            dVar.a(fragment, io.sentry.android.fragment.b.PAUSED);
        }
    }

    public void g(Fragment f6, boolean z5) {
        Intrinsics.checkNotNullParameter(f6, "f");
        j1 j1Var = (j1) this.f2047a;
        p0 p0Var = j1Var.f1983w.f2087b;
        Fragment fragment = j1Var.f1985y;
        if (fragment != null) {
            j1 parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.g(f6, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
        }
    }

    public void h(Fragment f6, boolean z5) {
        Intrinsics.checkNotNullParameter(f6, "f");
        Fragment fragment = ((j1) this.f2047a).f1985y;
        if (fragment != null) {
            j1 parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.h(f6, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
        }
    }

    public void i(Fragment fragment, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.i(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            dVar.a(fragment, io.sentry.android.fragment.b.RESUMED);
        }
    }

    public void j(Fragment fragment, Bundle outState, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.j(fragment, outState, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(outState, "outState");
            dVar.a(fragment, io.sentry.android.fragment.b.SAVE_INSTANCE_STATE);
        }
    }

    public void k(Fragment fragment, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.k(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            dVar.a(fragment, io.sentry.android.fragment.b.STARTED);
            dVar.c(fragment);
        }
    }

    public void l(Fragment fragment, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.l(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            dVar.a(fragment, io.sentry.android.fragment.b.STOPPED);
        }
    }

    public void m(Fragment fragment, View view, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        Intrinsics.checkNotNullParameter(view, "v");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.m(fragment, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(view, "view");
            dVar.a(fragment, io.sentry.android.fragment.b.VIEW_CREATED);
        }
    }

    public void n(Fragment fragment, boolean z5) {
        Intrinsics.checkNotNullParameter(fragment, "f");
        j1 fragmentManager = (j1) this.f2047a;
        Fragment fragment2 = fragmentManager.f1985y;
        if (fragment2 != null) {
            j1 parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f1976o.n(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2048b).iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (z5) {
                w0Var.getClass();
            }
            io.sentry.android.fragment.d dVar = w0Var.f2102a;
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            dVar.a(fragment, io.sentry.android.fragment.b.VIEW_DESTROYED);
        }
    }

    public q0(Animation animation) {
        this.f2047a = animation;
        this.f2048b = null;
    }

    public q0(Animator animator) {
        this.f2047a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2048b = animatorSet;
        animatorSet.play(animator);
    }
}
