package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f19127a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f19128b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Map f19129c = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC2185j f19130a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC2191p f19131b;

        public a(AbstractC2185j abstractC2185j, InterfaceC2191p interfaceC2191p) {
            this.f19130a = abstractC2185j;
            this.f19131b = interfaceC2191p;
            abstractC2185j.a(interfaceC2191p);
        }

        public void a() {
            this.f19130a.d(this.f19131b);
            this.f19131b = null;
        }
    }

    public A(Runnable runnable) {
        this.f19127a = runnable;
    }

    public static /* synthetic */ void a(A a10, AbstractC2185j.b bVar, C c10, InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar) {
        a10.getClass();
        if (aVar == AbstractC2185j.a.d(bVar)) {
            a10.c(c10);
            return;
        }
        if (aVar == AbstractC2185j.a.ON_DESTROY) {
            a10.j(c10);
        } else if (aVar == AbstractC2185j.a.b(bVar)) {
            a10.f19128b.remove(c10);
            a10.f19127a.run();
        }
    }

    public static /* synthetic */ void b(A a10, C c10, InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar) {
        a10.getClass();
        if (aVar == AbstractC2185j.a.ON_DESTROY) {
            a10.j(c10);
        }
    }

    public void c(C c10) {
        this.f19128b.add(c10);
        this.f19127a.run();
    }

    public void d(final C c10, InterfaceC2193s interfaceC2193s) {
        c(c10);
        AbstractC2185j lifecycle = interfaceC2193s.getLifecycle();
        a aVar = (a) this.f19129c.remove(c10);
        if (aVar != null) {
            aVar.a();
        }
        this.f19129c.put(c10, new a(lifecycle, new InterfaceC2191p() { // from class: androidx.core.view.z
            @Override // androidx.lifecycle.InterfaceC2191p
            public final void k(InterfaceC2193s interfaceC2193s2, AbstractC2185j.a aVar2) {
                A.b(A.this, c10, interfaceC2193s2, aVar2);
            }
        }));
    }

    public void e(final C c10, InterfaceC2193s interfaceC2193s, final AbstractC2185j.b bVar) {
        AbstractC2185j lifecycle = interfaceC2193s.getLifecycle();
        a aVar = (a) this.f19129c.remove(c10);
        if (aVar != null) {
            aVar.a();
        }
        this.f19129c.put(c10, new a(lifecycle, new InterfaceC2191p() { // from class: androidx.core.view.y
            @Override // androidx.lifecycle.InterfaceC2191p
            public final void k(InterfaceC2193s interfaceC2193s2, AbstractC2185j.a aVar2) {
                A.a(A.this, bVar, c10, interfaceC2193s2, aVar2);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f19128b.iterator();
        while (it.hasNext()) {
            ((C) it.next()).d(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator it = this.f19128b.iterator();
        while (it.hasNext()) {
            ((C) it.next()).a(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator it = this.f19128b.iterator();
        while (it.hasNext()) {
            if (((C) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator it = this.f19128b.iterator();
        while (it.hasNext()) {
            ((C) it.next()).b(menu);
        }
    }

    public void j(C c10) {
        this.f19128b.remove(c10);
        a aVar = (a) this.f19129c.remove(c10);
        if (aVar != null) {
            aVar.a();
        }
        this.f19127a.run();
    }
}
