package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2175z {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f20243a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f20244b;

    /* renamed from: androidx.fragment.app.z$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final FragmentManager.k f20245a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20246b;

        public a(FragmentManager.k callback, boolean z10) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f20245a = callback;
            this.f20246b = z10;
        }

        public final FragmentManager.k a() {
            return this.f20245a;
        }

        public final boolean b() {
            return this.f20246b;
        }
    }

    public C2175z(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f20243a = fragmentManager;
        this.f20244b = new CopyOnWriteArrayList();
    }

    public final void a(Fragment f10, Bundle bundle, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().a(f10, bundle, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().a(this.f20243a, f10, bundle);
            }
        }
    }

    public final void b(Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Context f11 = this.f20243a.D0().f();
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().b(f10, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().b(this.f20243a, f10, f11);
            }
        }
    }

    public final void c(Fragment f10, Bundle bundle, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().c(f10, bundle, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().c(this.f20243a, f10, bundle);
            }
        }
    }

    public final void d(Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().d(f10, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().d(this.f20243a, f10);
            }
        }
    }

    public final void e(Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().e(f10, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().e(this.f20243a, f10);
            }
        }
    }

    public final void f(Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().f(f10, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().f(this.f20243a, f10);
            }
        }
    }

    public final void g(Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Context f11 = this.f20243a.D0().f();
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().g(f10, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().g(this.f20243a, f10, f11);
            }
        }
    }

    public final void h(Fragment f10, Bundle bundle, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().h(f10, bundle, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().h(this.f20243a, f10, bundle);
            }
        }
    }

    public final void i(Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().i(f10, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().i(this.f20243a, f10);
            }
        }
    }

    public final void j(Fragment f10, Bundle outState, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().j(f10, outState, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().j(this.f20243a, f10, outState);
            }
        }
    }

    public final void k(Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().k(f10, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().k(this.f20243a, f10);
            }
        }
    }

    public final void l(Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().l(f10, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().l(this.f20243a, f10);
            }
        }
    }

    public final void m(Fragment f10, View v10, Bundle bundle, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(v10, "v");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().m(f10, v10, bundle, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().m(this.f20243a, f10, v10, bundle);
            }
        }
    }

    public final void n(Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment G02 = this.f20243a.G0();
        if (G02 != null) {
            FragmentManager parentFragmentManager = G02.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().n(f10, true);
        }
        Iterator it = this.f20244b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().n(this.f20243a, f10);
            }
        }
    }

    public final void o(FragmentManager.k cb2, boolean z10) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.f20244b.add(new a(cb2, z10));
    }

    public final void p(FragmentManager.k cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        synchronized (this.f20244b) {
            try {
                int size = this.f20244b.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (((a) this.f20244b.get(i10)).a() == cb2) {
                        this.f20244b.remove(i10);
                        break;
                    }
                    i10++;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
