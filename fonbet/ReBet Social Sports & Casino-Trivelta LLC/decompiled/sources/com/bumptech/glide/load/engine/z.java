package com.bumptech.glide.load.engine;

import B4.n;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import z4.InterfaceC6925a;

/* loaded from: classes2.dex */
public class z implements f, f.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f29943a;

    /* renamed from: b, reason: collision with root package name */
    public final f.a f29944b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f29945c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f29946d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f29947e;

    /* renamed from: f, reason: collision with root package name */
    public volatile n.a f29948f;

    /* renamed from: g, reason: collision with root package name */
    public volatile d f29949g;

    public class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n.a f29950a;

        public a(n.a aVar) {
            this.f29950a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.g(this.f29950a)) {
                z.this.i(this.f29950a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (z.this.g(this.f29950a)) {
                z.this.h(this.f29950a, obj);
            }
        }
    }

    public z(g gVar, f.a aVar) {
        this.f29943a = gVar;
        this.f29944b = aVar;
    }

    private boolean f() {
        return this.f29945c < this.f29943a.g().size();
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.data.d dVar, com.bumptech.glide.load.a aVar) {
        this.f29944b.a(gVar, exc, dVar, this.f29948f.f752c.d());
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        if (this.f29947e != null) {
            Object obj = this.f29947e;
            this.f29947e = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f29946d != null && this.f29946d.b()) {
            return true;
        }
        this.f29946d = null;
        this.f29948f = null;
        boolean z10 = false;
        while (!z10 && f()) {
            List g10 = this.f29943a.g();
            int i10 = this.f29945c;
            this.f29945c = i10 + 1;
            this.f29948f = (n.a) g10.get(i10);
            if (this.f29948f != null && (this.f29943a.e().c(this.f29948f.f752c.d()) || this.f29943a.u(this.f29948f.f752c.a()))) {
                j(this.f29948f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a aVar = this.f29948f;
        if (aVar != null) {
            aVar.f752c.cancel();
        }
    }

    public final boolean d(Object obj) {
        Throwable th2;
        long b10 = com.bumptech.glide.util.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e o10 = this.f29943a.o(obj);
            Object a10 = o10.a();
            com.bumptech.glide.load.d q10 = this.f29943a.q(a10);
            e eVar = new e(q10, a10, this.f29943a.k());
            d dVar = new d(this.f29948f.f750a, this.f29943a.p());
            InterfaceC6925a d10 = this.f29943a.d();
            d10.b(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                dVar.toString();
                Objects.toString(obj);
                Objects.toString(q10);
                com.bumptech.glide.util.g.a(b10);
            }
            if (d10.a(dVar) != null) {
                this.f29949g = dVar;
                this.f29946d = new c(Collections.singletonList(this.f29948f.f750a), this.f29943a, this);
                this.f29948f.f752c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f29949g);
                Objects.toString(obj);
            }
            try {
                this.f29944b.e(this.f29948f.f750a, o10.a(), this.f29948f.f752c, this.f29948f.f752c.d(), this.f29948f.f750a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z10 = true;
                if (z10) {
                    throw th2;
                }
                this.f29948f.f752c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void e(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.data.d dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.f29944b.e(gVar, obj, dVar, this.f29948f.f752c.d(), gVar);
    }

    public boolean g(n.a aVar) {
        n.a aVar2 = this.f29948f;
        return aVar2 != null && aVar2 == aVar;
    }

    public void h(n.a aVar, Object obj) {
        j e10 = this.f29943a.e();
        if (obj != null && e10.c(aVar.f752c.d())) {
            this.f29947e = obj;
            this.f29944b.c();
        } else {
            f.a aVar2 = this.f29944b;
            com.bumptech.glide.load.g gVar = aVar.f750a;
            com.bumptech.glide.load.data.d dVar = aVar.f752c;
            aVar2.e(gVar, obj, dVar, dVar.d(), this.f29949g);
        }
    }

    public void i(n.a aVar, Exception exc) {
        f.a aVar2 = this.f29944b;
        d dVar = this.f29949g;
        com.bumptech.glide.load.data.d dVar2 = aVar.f752c;
        aVar2.a(dVar, exc, dVar2, dVar2.d());
    }

    public final void j(n.a aVar) {
        this.f29948f.f752c.e(this.f29943a.l(), new a(aVar));
    }
}
