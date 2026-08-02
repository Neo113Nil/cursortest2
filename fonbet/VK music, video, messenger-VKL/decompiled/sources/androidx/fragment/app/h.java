package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.kt */
/* loaded from: classes.dex */
public final class h {
    public final FragmentManager a;
    public final CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<>();

    /* compiled from: FragmentLifecycleCallbacksDispatcher.kt */
    /* loaded from: classes12.dex */
    public static final class a {
        public final FragmentManager.m a;
        public final boolean b;

        public a(FragmentManager.m mVar, boolean z) {
            this.a = mVar;
            this.b = z;
        }

        public final FragmentManager.m a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public h(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void a(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.a(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().getClass();
            }
        }
    }

    public final void b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        FragmentActivity fragmentActivity = fragmentManager.w.c;
        Fragment fragment2 = fragmentManager.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.b(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().a(fragmentManager, fragment);
            }
        }
    }

    public final void c(Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.c(fragment, bundle, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().b(fragmentManager, fragment);
            }
        }
    }

    public final void d(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.d(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().c(fragmentManager, fragment);
            }
        }
    }

    public final void e(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.e(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().d(fragmentManager, fragment);
            }
        }
    }

    public final void f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.f(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().e(fragment);
            }
        }
    }

    public final void g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        FragmentActivity fragmentActivity = fragmentManager.w.c;
        Fragment fragment2 = fragmentManager.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.g(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().getClass();
            }
        }
    }

    public final void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.a.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.h(fragment, bundle, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().f(fragment);
            }
        }
    }

    public final void i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.i(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().g(fragment);
            }
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.a.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.j(fragment, bundle, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().h(bundle, fragment);
            }
        }
    }

    public final void k(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.k(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().i(fragment);
            }
        }
    }

    public final void l(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.l(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().j(fragment);
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().k(fragmentManager, fragment, view);
            }
        }
    }

    public final void n(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.y;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.n(fragment, true);
        }
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b()) {
                next.a().getClass();
            }
        }
    }
}
