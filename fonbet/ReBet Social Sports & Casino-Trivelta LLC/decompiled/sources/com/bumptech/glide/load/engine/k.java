package com.bumptech.glide.load.engine;

import P4.a;
import android.util.Log;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.p;
import com.plaid.internal.EnumC3631g;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import x0.InterfaceC6775d;
import z4.C6926b;
import z4.InterfaceC6925a;
import z4.h;

/* loaded from: classes2.dex */
public class k implements m, h.a, p.a {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f29828i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final s f29829a;

    /* renamed from: b, reason: collision with root package name */
    public final o f29830b;

    /* renamed from: c, reason: collision with root package name */
    public final z4.h f29831c;

    /* renamed from: d, reason: collision with root package name */
    public final b f29832d;

    /* renamed from: e, reason: collision with root package name */
    public final y f29833e;

    /* renamed from: f, reason: collision with root package name */
    public final c f29834f;

    /* renamed from: g, reason: collision with root package name */
    public final a f29835g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.a f29836h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final h.e f29837a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC6775d f29838b = P4.a.d(EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE, new C0471a());

        /* renamed from: c, reason: collision with root package name */
        public int f29839c;

        /* renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        public class C0471a implements a.d {
            public C0471a() {
            }

            @Override // P4.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h create() {
                a aVar = a.this;
                return new h(aVar.f29837a, aVar.f29838b);
            }
        }

        public a(h.e eVar) {
            this.f29837a = eVar;
        }

        public h a(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.g gVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, com.bumptech.glide.load.j jVar2, h.b bVar) {
            h hVar2 = (h) com.bumptech.glide.util.k.d((h) this.f29838b.acquire());
            int i12 = this.f29839c;
            this.f29839c = i12 + 1;
            return hVar2.n(eVar, obj, nVar, gVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z12, jVar2, bVar, i12);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final A4.a f29841a;

        /* renamed from: b, reason: collision with root package name */
        public final A4.a f29842b;

        /* renamed from: c, reason: collision with root package name */
        public final A4.a f29843c;

        /* renamed from: d, reason: collision with root package name */
        public final A4.a f29844d;

        /* renamed from: e, reason: collision with root package name */
        public final m f29845e;

        /* renamed from: f, reason: collision with root package name */
        public final p.a f29846f;

        /* renamed from: g, reason: collision with root package name */
        public final InterfaceC6775d f29847g = P4.a.d(EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE, new a());

        public class a implements a.d {
            public a() {
            }

            @Override // P4.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l create() {
                b bVar = b.this;
                return new l(bVar.f29841a, bVar.f29842b, bVar.f29843c, bVar.f29844d, bVar.f29845e, bVar.f29846f, bVar.f29847g);
            }
        }

        public b(A4.a aVar, A4.a aVar2, A4.a aVar3, A4.a aVar4, m mVar, p.a aVar5) {
            this.f29841a = aVar;
            this.f29842b = aVar2;
            this.f29843c = aVar3;
            this.f29844d = aVar4;
            this.f29845e = mVar;
            this.f29846f = aVar5;
        }

        public l a(com.bumptech.glide.load.g gVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) com.bumptech.glide.util.k.d((l) this.f29847g.acquire())).l(gVar, z10, z11, z12, z13);
        }
    }

    public static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC6925a.InterfaceC0980a f29849a;

        /* renamed from: b, reason: collision with root package name */
        public volatile InterfaceC6925a f29850b;

        public c(InterfaceC6925a.InterfaceC0980a interfaceC0980a) {
            this.f29849a = interfaceC0980a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public InterfaceC6925a a() {
            if (this.f29850b == null) {
                synchronized (this) {
                    try {
                        if (this.f29850b == null) {
                            this.f29850b = this.f29849a.build();
                        }
                        if (this.f29850b == null) {
                            this.f29850b = new C6926b();
                        }
                    } finally {
                    }
                }
            }
            return this.f29850b;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final l f29851a;

        /* renamed from: b, reason: collision with root package name */
        public final L4.i f29852b;

        public d(L4.i iVar, l lVar) {
            this.f29852b = iVar;
            this.f29851a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f29851a.r(this.f29852b);
            }
        }
    }

    public k(z4.h hVar, InterfaceC6925a.InterfaceC0980a interfaceC0980a, A4.a aVar, A4.a aVar2, A4.a aVar3, A4.a aVar4, boolean z10) {
        this(hVar, interfaceC0980a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    public static void k(String str, long j10, com.bumptech.glide.load.g gVar) {
        com.bumptech.glide.util.g.a(j10);
        Objects.toString(gVar);
    }

    @Override // z4.h.a
    public void a(v vVar) {
        this.f29833e.a(vVar, true);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void b(l lVar, com.bumptech.glide.load.g gVar, p pVar) {
        if (pVar != null) {
            try {
                if (pVar.d()) {
                    this.f29836h.a(gVar, pVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f29829a.d(gVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void c(l lVar, com.bumptech.glide.load.g gVar) {
        this.f29829a.d(gVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.p.a
    public void d(com.bumptech.glide.load.g gVar, p pVar) {
        this.f29836h.d(gVar);
        if (pVar.d()) {
            this.f29831c.c(gVar, pVar);
        } else {
            this.f29833e.a(pVar, false);
        }
    }

    public void e() {
        this.f29834f.a().clear();
    }

    public final p f(com.bumptech.glide.load.g gVar) {
        v d10 = this.f29831c.d(gVar);
        if (d10 == null) {
            return null;
        }
        return d10 instanceof p ? (p) d10 : new p(d10, true, true, gVar, this);
    }

    public d g(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.g gVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, com.bumptech.glide.load.j jVar2, boolean z12, boolean z13, boolean z14, boolean z15, L4.i iVar, Executor executor) {
        long b10 = f29828i ? com.bumptech.glide.util.g.b() : 0L;
        n a10 = this.f29830b.a(obj, gVar, i10, i11, map, cls, cls2, jVar2);
        synchronized (this) {
            try {
                p j10 = j(a10, z12, b10);
                if (j10 == null) {
                    return m(eVar, obj, gVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, jVar2, z12, z13, z14, z15, iVar, executor, a10, b10);
                }
                iVar.b(j10, com.bumptech.glide.load.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final p h(com.bumptech.glide.load.g gVar) {
        p e10 = this.f29836h.e(gVar);
        if (e10 != null) {
            e10.b();
        }
        return e10;
    }

    public final p i(com.bumptech.glide.load.g gVar) {
        p f10 = f(gVar);
        if (f10 != null) {
            f10.b();
            this.f29836h.a(gVar, f10);
        }
        return f10;
    }

    public final p j(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p h10 = h(nVar);
        if (h10 != null) {
            if (f29828i) {
                k("Loaded resource from active resources", j10, nVar);
            }
            return h10;
        }
        p i10 = i(nVar);
        if (i10 == null) {
            return null;
        }
        if (f29828i) {
            k("Loaded resource from cache", j10, nVar);
        }
        return i10;
    }

    public void l(v vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).e();
    }

    public final d m(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.g gVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, com.bumptech.glide.load.j jVar2, boolean z12, boolean z13, boolean z14, boolean z15, L4.i iVar, Executor executor, n nVar, long j10) {
        l a10 = this.f29829a.a(nVar, z15);
        if (a10 != null) {
            a10.e(iVar, executor);
            if (f29828i) {
                k("Added to existing load", j10, nVar);
            }
            return new d(iVar, a10);
        }
        l a11 = this.f29832d.a(nVar, z12, z13, z14, z15);
        h a12 = this.f29835g.a(eVar, obj, nVar, gVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z15, jVar2, a11);
        this.f29829a.c(nVar, a11);
        a11.e(iVar, executor);
        a11.s(a12);
        if (f29828i) {
            k("Started new load", j10, nVar);
        }
        return new d(iVar, a11);
    }

    public k(z4.h hVar, InterfaceC6925a.InterfaceC0980a interfaceC0980a, A4.a aVar, A4.a aVar2, A4.a aVar3, A4.a aVar4, s sVar, o oVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, y yVar, boolean z10) {
        this.f29831c = hVar;
        c cVar = new c(interfaceC0980a);
        this.f29834f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z10) : aVar5;
        this.f29836h = aVar7;
        aVar7.f(this);
        this.f29830b = oVar == null ? new o() : oVar;
        this.f29829a = sVar == null ? new s() : sVar;
        this.f29832d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f29835g = aVar6 == null ? new a(cVar) : aVar6;
        this.f29833e = yVar == null ? new y() : yVar;
        hVar.e(this);
    }
}
