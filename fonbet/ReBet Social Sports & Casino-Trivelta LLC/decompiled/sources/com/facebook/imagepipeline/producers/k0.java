package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.G;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import lb.C5444x;
import u7.C6528b;

/* loaded from: classes2.dex */
public class k0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30803a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.i f30804b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f30805c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30806d;

    /* renamed from: e, reason: collision with root package name */
    public final O7.d f30807e;

    public class a extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f30808c;

        /* renamed from: d, reason: collision with root package name */
        public final O7.d f30809d;

        /* renamed from: e, reason: collision with root package name */
        public final e0 f30810e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f30811f;

        /* renamed from: g, reason: collision with root package name */
        public final G f30812g;

        /* renamed from: com.facebook.imagepipeline.producers.k0$a$a, reason: collision with other inner class name */
        public class C0482a implements G.d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k0 f30814a;

            public C0482a(k0 k0Var) {
                this.f30814a = k0Var;
            }

            @Override // com.facebook.imagepipeline.producers.G.d
            public void a(H7.k kVar, int i10) {
                if (kVar == null) {
                    a.this.o().b(null, i10);
                } else {
                    a aVar = a.this;
                    aVar.v(kVar, i10, (O7.c) D6.k.g(aVar.f30809d.createImageTranscoder(kVar.A0(), a.this.f30808c)));
                }
            }
        }

        public class b extends AbstractC3022f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k0 f30816a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3030n f30817b;

            public b(k0 k0Var, InterfaceC3030n interfaceC3030n) {
                this.f30816a = k0Var;
                this.f30817b = interfaceC3030n;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC3022f, com.facebook.imagepipeline.producers.f0
            public void a() {
                if (a.this.f30810e.A0()) {
                    a.this.f30812g.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void b() {
                a.this.f30812g.c();
                a.this.f30811f = true;
                this.f30817b.a();
            }
        }

        public a(InterfaceC3030n interfaceC3030n, e0 e0Var, boolean z10, O7.d dVar) {
            super(interfaceC3030n);
            this.f30811f = false;
            this.f30810e = e0Var;
            Boolean resizingAllowedOverride = e0Var.D0().getResizingAllowedOverride();
            this.f30808c = resizingAllowedOverride != null ? resizingAllowedOverride.booleanValue() : z10;
            this.f30809d = dVar;
            this.f30812g = new G(k0.this.f30803a, new C0482a(k0.this), 100);
            e0Var.k(new b(k0.this, interfaceC3030n));
        }

        public final H7.k A(H7.k kVar) {
            return (this.f30810e.D0().getRotationOptions().f() || kVar.Y0() == 0 || kVar.Y0() == -1) ? kVar : x(kVar, 0);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            if (this.f30811f) {
                return;
            }
            boolean d10 = AbstractC3019c.d(i10);
            if (kVar == null) {
                if (d10) {
                    o().b(null, 1);
                    return;
                }
                return;
            }
            u7.c A02 = kVar.A0();
            com.facebook.common.util.e h10 = k0.h(this.f30810e.D0(), kVar, (O7.c) D6.k.g(this.f30809d.createImageTranscoder(A02, this.f30808c)));
            if (d10 || h10 != com.facebook.common.util.e.UNSET) {
                if (h10 != com.facebook.common.util.e.YES) {
                    w(kVar, i10, A02);
                } else if (this.f30812g.k(kVar, i10)) {
                    if (d10 || this.f30810e.A0()) {
                        this.f30812g.h();
                    }
                }
            }
        }

        public final void v(H7.k kVar, int i10, O7.c cVar) {
            this.f30810e.z0().d(this.f30810e, "ResizeAndRotateProducer");
            com.facebook.imagepipeline.request.b D02 = this.f30810e.D0();
            G6.k c10 = k0.this.f30804b.c();
            try {
                try {
                    O7.b b10 = cVar.b(kVar, c10, D02.getRotationOptions(), D02.getResizeOptions(), null, 85, kVar.w0());
                    if (b10.a() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map y10 = y(kVar, D02.getResizeOptions(), b10, cVar.a());
                    H6.a D03 = H6.a.D0(c10.d());
                    try {
                        H7.k kVar2 = new H7.k(D03);
                        kVar2.j2(C6528b.f66196b);
                        try {
                            kVar2.c2();
                            this.f30810e.z0().j(this.f30810e, "ResizeAndRotateProducer", y10);
                            if (b10.a() != 1) {
                                i10 |= 16;
                            }
                            o().b(kVar2, i10);
                            H7.k.r(kVar2);
                            H6.a.U(D03);
                            c10.close();
                        } catch (Throwable th2) {
                            H7.k.r(kVar2);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        H6.a.U(D03);
                        throw th3;
                    }
                } catch (Exception e10) {
                    this.f30810e.z0().k(this.f30810e, "ResizeAndRotateProducer", e10, null);
                    if (AbstractC3019c.d(i10)) {
                        o().onFailure(e10);
                    }
                    c10.close();
                }
            } catch (Throwable th4) {
                c10.close();
                throw th4;
            }
        }

        public final void w(H7.k kVar, int i10, u7.c cVar) {
            o().b((cVar == C6528b.f66196b || cVar == C6528b.f66206l) ? A(kVar) : z(kVar), i10);
        }

        public final H7.k x(H7.k kVar, int i10) {
            H7.k k10 = H7.k.k(kVar);
            if (k10 != null) {
                k10.k2(i10);
            }
            return k10;
        }

        public final Map y(H7.k kVar, B7.g gVar, O7.b bVar, String str) {
            String str2;
            if (!this.f30810e.z0().f(this.f30810e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = kVar.getWidth() + C5444x.f55808b + kVar.getHeight();
            if (gVar != null) {
                str2 = gVar.f849a + C5444x.f55808b + gVar.f850b;
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(kVar.A0()));
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f30812g.f()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(bVar));
            return D6.g.a(hashMap);
        }

        public final H7.k z(H7.k kVar) {
            B7.h rotationOptions = this.f30810e.D0().getRotationOptions();
            return (rotationOptions.j() || !rotationOptions.i()) ? kVar : x(kVar, rotationOptions.h());
        }
    }

    public k0(Executor executor, G6.i iVar, d0 d0Var, boolean z10, O7.d dVar) {
        this.f30803a = (Executor) D6.k.g(executor);
        this.f30804b = (G6.i) D6.k.g(iVar);
        this.f30805c = (d0) D6.k.g(d0Var);
        this.f30807e = (O7.d) D6.k.g(dVar);
        this.f30806d = z10;
    }

    public static boolean f(B7.h hVar, H7.k kVar) {
        if (hVar.f()) {
            return false;
        }
        return O7.e.e(hVar, kVar) != 0 || g(hVar, kVar);
    }

    public static boolean g(B7.h hVar, H7.k kVar) {
        if (hVar.i() && !hVar.f()) {
            return O7.e.f8347b.contains(Integer.valueOf(kVar.K0()));
        }
        kVar.h2(0);
        return false;
    }

    public static com.facebook.common.util.e h(com.facebook.imagepipeline.request.b bVar, H7.k kVar, O7.c cVar) {
        if (kVar == null || kVar.A0() == u7.c.f66212d) {
            return com.facebook.common.util.e.UNSET;
        }
        if (cVar.c(kVar.A0())) {
            return com.facebook.common.util.e.c(f(bVar.getRotationOptions(), kVar) || cVar.d(kVar, bVar.getRotationOptions(), bVar.getResizeOptions()));
        }
        return com.facebook.common.util.e.NO;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        this.f30805c.b(new a(interfaceC3030n, e0Var, this.f30806d, this.f30807e), e0Var);
    }
}
