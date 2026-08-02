package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.r;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class m implements ComponentCallbacks2, com.bumptech.glide.manager.k {

    /* renamed from: m, reason: collision with root package name */
    public static final L4.h f30073m = (L4.h) L4.h.j0(Bitmap.class).M();

    /* renamed from: n, reason: collision with root package name */
    public static final L4.h f30074n = (L4.h) L4.h.j0(H4.c.class).M();

    /* renamed from: o, reason: collision with root package name */
    public static final L4.h f30075o = (L4.h) ((L4.h) L4.h.k0(com.bumptech.glide.load.engine.j.f29825c).V(h.LOW)).c0(true);

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.c f30076a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f30077b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.manager.j f30078c;

    /* renamed from: d, reason: collision with root package name */
    public final p f30079d;

    /* renamed from: e, reason: collision with root package name */
    public final o f30080e;

    /* renamed from: f, reason: collision with root package name */
    public final r f30081f;

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f30082g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f30083h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f30084i;

    /* renamed from: j, reason: collision with root package name */
    public L4.h f30085j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30086k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30087l;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            mVar.f30078c.b(mVar);
        }
    }

    public class c implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final p f30089a;

        public c(p pVar) {
            this.f30089a = pVar;
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (m.this) {
                    this.f30089a.e();
                }
            }
        }
    }

    public m(com.bumptech.glide.c cVar, com.bumptech.glide.manager.j jVar, o oVar, Context context) {
        this(cVar, jVar, oVar, new p(), cVar.h(), context);
    }

    public synchronized void A() {
        this.f30079d.f();
    }

    public synchronized void B(L4.h hVar) {
        this.f30085j = (L4.h) ((L4.h) hVar.clone()).b();
    }

    public synchronized void C(M4.j jVar, L4.d dVar) {
        this.f30081f.l(jVar);
        this.f30079d.g(dVar);
    }

    public synchronized boolean D(M4.j jVar) {
        L4.d c10 = jVar.c();
        if (c10 == null) {
            return true;
        }
        if (!this.f30079d.a(c10)) {
            return false;
        }
        this.f30081f.o(jVar);
        jVar.g(null);
        return true;
    }

    public final void E(M4.j jVar) {
        boolean D10 = D(jVar);
        L4.d c10 = jVar.c();
        if (D10 || this.f30076a.q(jVar) || c10 == null) {
            return;
        }
        jVar.g(null);
        c10.clear();
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void a() {
        this.f30081f.a();
        r();
        this.f30079d.b();
        this.f30078c.a(this);
        this.f30078c.a(this.f30083h);
        com.bumptech.glide.util.l.x(this.f30082g);
        this.f30076a.t(this);
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void b() {
        try {
            this.f30081f.b();
            if (this.f30087l) {
                r();
            } else {
                z();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void d() {
        A();
        this.f30081f.d();
    }

    public l f(Class cls) {
        return new l(this.f30076a, this, cls, this.f30077b);
    }

    public l k() {
        return f(Bitmap.class).a(f30073m);
    }

    public l l() {
        return f(Drawable.class);
    }

    public l o() {
        return f(File.class).a(L4.h.o0(true));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f30086k) {
            y();
        }
    }

    public void p(M4.j jVar) {
        if (jVar == null) {
            return;
        }
        E(jVar);
    }

    public void q(View view) {
        p(new b(view));
    }

    public final synchronized void r() {
        try {
            Iterator it = this.f30081f.k().iterator();
            while (it.hasNext()) {
                p((M4.j) it.next());
            }
            this.f30081f.f();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public List s() {
        return this.f30084i;
    }

    public synchronized L4.h t() {
        return this.f30085j;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f30079d + ", treeNode=" + this.f30080e + "}";
    }

    public n u(Class cls) {
        return this.f30076a.j().e(cls);
    }

    public l v(Object obj) {
        return l().A0(obj);
    }

    public l w(String str) {
        return l().B0(str);
    }

    public synchronized void x() {
        this.f30079d.c();
    }

    public synchronized void y() {
        x();
        Iterator it = this.f30080e.a().iterator();
        while (it.hasNext()) {
            ((m) it.next()).x();
        }
    }

    public synchronized void z() {
        this.f30079d.d();
    }

    public m(com.bumptech.glide.c cVar, com.bumptech.glide.manager.j jVar, o oVar, p pVar, com.bumptech.glide.manager.c cVar2, Context context) {
        this.f30081f = new r();
        a aVar = new a();
        this.f30082g = aVar;
        this.f30076a = cVar;
        this.f30078c = jVar;
        this.f30080e = oVar;
        this.f30079d = pVar;
        this.f30077b = context;
        com.bumptech.glide.manager.b a10 = cVar2.a(context.getApplicationContext(), new c(pVar));
        this.f30083h = a10;
        cVar.p(this);
        if (com.bumptech.glide.util.l.s()) {
            com.bumptech.glide.util.l.w(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(a10);
        this.f30084i = new CopyOnWriteArrayList(cVar.j().c());
        B(cVar.j().d());
    }

    public static class b extends M4.d {
        public b(View view) {
            super(view);
        }

        @Override // M4.j
        public void n(Drawable drawable) {
        }

        @Override // M4.d
        public void o(Drawable drawable) {
        }

        @Override // M4.j
        public void m(Object obj, N4.d dVar) {
        }
    }
}
