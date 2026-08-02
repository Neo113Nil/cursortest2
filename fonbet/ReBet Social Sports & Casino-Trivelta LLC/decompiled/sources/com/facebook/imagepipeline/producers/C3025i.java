package com.facebook.imagepipeline.producers;

import com.facebook.hermes.intl.Constants;
import com.facebook.imagepipeline.request.b;
import w6.InterfaceC6713d;

/* renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3025i implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final A7.x f30775a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.k f30776b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f30777c;

    /* renamed from: com.facebook.imagepipeline.producers.i$a */
    public class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6713d f30778c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f30779d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3030n interfaceC3030n, InterfaceC6713d interfaceC6713d, boolean z10) {
            super(interfaceC3030n);
            this.f30778c = interfaceC6713d;
            this.f30779d = z10;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(H6.a aVar, int i10) {
            H6.a aVar2;
            try {
                if (N7.b.d()) {
                    N7.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean d10 = AbstractC3019c.d(i10);
                if (aVar == null) {
                    if (d10) {
                        o().b(null, i10);
                    }
                    if (N7.b.d()) {
                        N7.b.b();
                        return;
                    }
                    return;
                }
                if (!((H7.e) aVar.z0()).V1() && !AbstractC3019c.m(i10, 8)) {
                    if (!d10 && (aVar2 = C3025i.this.f30775a.get(this.f30778c)) != null) {
                        try {
                            H7.p t12 = ((H7.e) aVar.z0()).t1();
                            H7.p t13 = ((H7.e) aVar2.z0()).t1();
                            if (t13.a() || t13.c() >= t12.c()) {
                                o().b(aVar2, i10);
                                if (N7.b.d()) {
                                    N7.b.b();
                                    return;
                                }
                                return;
                            }
                        } finally {
                            H6.a.U(aVar2);
                        }
                    }
                    H6.a a10 = this.f30779d ? C3025i.this.f30775a.a(this.f30778c, aVar) : null;
                    if (d10) {
                        try {
                            o().c(1.0f);
                        } catch (Throwable th2) {
                            H6.a.U(a10);
                            throw th2;
                        }
                    }
                    InterfaceC3030n o10 = o();
                    if (a10 != null) {
                        aVar = a10;
                    }
                    o10.b(aVar, i10);
                    H6.a.U(a10);
                    if (N7.b.d()) {
                        N7.b.b();
                        return;
                    }
                    return;
                }
                o().b(aVar, i10);
                if (N7.b.d()) {
                    N7.b.b();
                }
            } catch (Throwable th3) {
                if (N7.b.d()) {
                    N7.b.b();
                }
                throw th3;
            }
        }
    }

    public C3025i(A7.x xVar, A7.k kVar, d0 d0Var) {
        this.f30775a = xVar;
        this.f30776b = kVar;
        this.f30777c = d0Var;
    }

    public static void f(H7.l lVar, e0 e0Var) {
        e0Var.m1(lVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        try {
            if (N7.b.d()) {
                N7.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            g0 z02 = e0Var.z0();
            z02.d(e0Var, e());
            InterfaceC6713d a10 = this.f30776b.a(e0Var.D0(), e0Var.d());
            H6.a aVar = e0Var.D0().isCacheEnabled(1) ? this.f30775a.get(a10) : null;
            if (aVar != null) {
                f((H7.l) aVar.z0(), e0Var);
                boolean a11 = ((H7.e) aVar.z0()).t1().a();
                if (a11) {
                    z02.j(e0Var, e(), z02.f(e0Var, e()) ? D6.g.of("cached_value_found", "true") : null);
                    z02.b(e0Var, e(), true);
                    e0Var.B("memory_bitmap", d());
                    interfaceC3030n.c(1.0f);
                }
                interfaceC3030n.b(aVar, AbstractC3019c.k(a11));
                aVar.close();
                if (a11) {
                    if (N7.b.d()) {
                        N7.b.b();
                        return;
                    }
                    return;
                }
            }
            if (e0Var.T1().b() >= b.c.BITMAP_MEMORY_CACHE.b()) {
                z02.j(e0Var, e(), z02.f(e0Var, e()) ? D6.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
                z02.b(e0Var, e(), false);
                e0Var.B("memory_bitmap", d());
                interfaceC3030n.b(null, 1);
                if (N7.b.d()) {
                    N7.b.b();
                    return;
                }
                return;
            }
            InterfaceC3030n g10 = g(interfaceC3030n, a10, e0Var.D0().isCacheEnabled(2));
            z02.j(e0Var, e(), z02.f(e0Var, e()) ? D6.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
            if (N7.b.d()) {
                N7.b.a("mInputProducer.produceResult");
            }
            this.f30777c.b(g10, e0Var);
            if (N7.b.d()) {
                N7.b.b();
            }
            if (N7.b.d()) {
                N7.b.b();
            }
        } catch (Throwable th2) {
            if (N7.b.d()) {
                N7.b.b();
            }
            throw th2;
        }
    }

    public String d() {
        return "pipe_bg";
    }

    public String e() {
        return "BitmapMemoryCacheProducer";
    }

    public InterfaceC3030n g(InterfaceC3030n interfaceC3030n, InterfaceC6713d interfaceC6713d, boolean z10) {
        return new a(interfaceC3030n, interfaceC6713d, z10);
    }
}
