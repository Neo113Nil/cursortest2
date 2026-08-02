package com.facebook.imagepipeline.producers;

import C7.InterfaceC1039c;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class Y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final D6.n f30715a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.k f30716b;

    /* renamed from: c, reason: collision with root package name */
    public final G6.i f30717c;

    /* renamed from: d, reason: collision with root package name */
    public final G6.a f30718d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f30719e;

    public class a implements d3.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0 f30720a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f30721b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3030n f30722c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6713d f30723d;

        public a(g0 g0Var, e0 e0Var, InterfaceC3030n interfaceC3030n, InterfaceC6713d interfaceC6713d) {
            this.f30720a = g0Var;
            this.f30721b = e0Var;
            this.f30722c = interfaceC3030n;
            this.f30723d = interfaceC6713d;
        }

        @Override // d3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(d3.f fVar) {
            if (Y.g(fVar)) {
                this.f30720a.c(this.f30721b, "PartialDiskCacheProducer", null);
                this.f30722c.a();
            } else if (fVar.n()) {
                this.f30720a.k(this.f30721b, "PartialDiskCacheProducer", fVar.i(), null);
                Y.this.i(this.f30722c, this.f30721b, this.f30723d, null);
            } else {
                H7.k kVar = (H7.k) fVar.j();
                if (kVar != null) {
                    g0 g0Var = this.f30720a;
                    e0 e0Var = this.f30721b;
                    g0Var.j(e0Var, "PartialDiskCacheProducer", Y.f(g0Var, e0Var, true, kVar.y1()));
                    B7.b g10 = B7.b.g(kVar.y1() - 1);
                    kVar.g2(g10);
                    int y12 = kVar.y1();
                    com.facebook.imagepipeline.request.b D02 = this.f30721b.D0();
                    if (g10.c(D02.getBytesRange())) {
                        this.f30721b.B("disk", "partial");
                        this.f30720a.b(this.f30721b, "PartialDiskCacheProducer", true);
                        this.f30722c.b(kVar, 9);
                    } else {
                        this.f30722c.b(kVar, 8);
                        Y.this.i(this.f30722c, new l0(com.facebook.imagepipeline.request.c.b(D02).z(B7.b.d(y12 - 1)).a(), this.f30721b), this.f30723d, kVar);
                    }
                } else {
                    g0 g0Var2 = this.f30720a;
                    e0 e0Var2 = this.f30721b;
                    g0Var2.j(e0Var2, "PartialDiskCacheProducer", Y.f(g0Var2, e0Var2, false, 0));
                    Y.this.i(this.f30722c, this.f30721b, this.f30723d, kVar);
                }
            }
            return null;
        }
    }

    public class b extends AbstractC3022f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f30725a;

        public b(AtomicBoolean atomicBoolean) {
            this.f30725a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f30725a.set(true);
        }
    }

    public static class c extends AbstractC3035t {

        /* renamed from: c, reason: collision with root package name */
        public final D6.n f30727c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC6713d f30728d;

        /* renamed from: e, reason: collision with root package name */
        public final G6.i f30729e;

        /* renamed from: f, reason: collision with root package name */
        public final G6.a f30730f;

        /* renamed from: g, reason: collision with root package name */
        public final H7.k f30731g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f30732h;

        public final void p(InputStream inputStream, OutputStream outputStream, int i10) {
            byte[] bArr = (byte[]) this.f30730f.get(16384);
            int i11 = i10;
            while (i11 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i11));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i11 -= read;
                    }
                } finally {
                    this.f30730f.release(bArr);
                }
            }
            if (i11 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }

        public final G6.k q(H7.k kVar, H7.k kVar2) {
            int i10 = ((B7.b) D6.k.g(kVar2.U())).f816a;
            G6.k e10 = this.f30729e.e(kVar2.y1() + i10);
            p(kVar.m1(), e10, i10);
            p(kVar2.m1(), e10, kVar2.y1());
            return e10;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void h(H7.k kVar, int i10) {
            if (AbstractC3019c.e(i10)) {
                return;
            }
            if (this.f30731g != null && kVar != null && kVar.U() != null) {
                try {
                    try {
                        s(q(this.f30731g, kVar));
                    } catch (IOException e10) {
                        E6.a.n("PartialDiskCacheProducer", "Error while merging image data", e10);
                        o().onFailure(e10);
                    }
                    ((InterfaceC1039c) this.f30727c.get()).b().s(this.f30728d);
                    return;
                } finally {
                    kVar.close();
                    this.f30731g.close();
                }
            }
            if (!this.f30732h || !AbstractC3019c.m(i10, 8) || !AbstractC3019c.d(i10) || kVar == null || kVar.A0() == u7.c.f66212d) {
                o().b(kVar, i10);
            } else {
                ((InterfaceC1039c) this.f30727c.get()).b().p(this.f30728d, kVar);
                o().b(kVar, i10);
            }
        }

        public final void s(G6.k kVar) {
            H7.k kVar2;
            Throwable th2;
            H6.a D02 = H6.a.D0(kVar.d());
            try {
                kVar2 = new H7.k(D02);
                try {
                    kVar2.c2();
                    o().b(kVar2, 1);
                    H7.k.r(kVar2);
                    H6.a.U(D02);
                } catch (Throwable th3) {
                    th2 = th3;
                    H7.k.r(kVar2);
                    H6.a.U(D02);
                    throw th2;
                }
            } catch (Throwable th4) {
                kVar2 = null;
                th2 = th4;
            }
        }

        public c(InterfaceC3030n interfaceC3030n, D6.n nVar, InterfaceC6713d interfaceC6713d, G6.i iVar, G6.a aVar, H7.k kVar, boolean z10) {
            super(interfaceC3030n);
            this.f30727c = nVar;
            this.f30728d = interfaceC6713d;
            this.f30729e = iVar;
            this.f30730f = aVar;
            this.f30731g = kVar;
            this.f30732h = z10;
        }
    }

    public Y(D6.n nVar, A7.k kVar, G6.i iVar, G6.a aVar, d0 d0Var) {
        this.f30715a = nVar;
        this.f30716b = kVar;
        this.f30717c = iVar;
        this.f30718d = aVar;
        this.f30719e = d0Var;
    }

    public static Uri e(com.facebook.imagepipeline.request.b bVar) {
        return bVar.getSourceUri().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    public static Map f(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (g0Var.f(e0Var, "PartialDiskCacheProducer")) {
            return z10 ? D6.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10)) : D6.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(d3.f fVar) {
        if (fVar.l()) {
            return true;
        }
        return fVar.n() && (fVar.i() instanceof CancellationException);
    }

    private void j(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.k(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        com.facebook.imagepipeline.request.b D02 = e0Var.D0();
        boolean isCacheEnabled = e0Var.D0().isCacheEnabled(16);
        boolean isCacheEnabled2 = e0Var.D0().isCacheEnabled(32);
        if (!isCacheEnabled && !isCacheEnabled2) {
            this.f30719e.b(interfaceC3030n, e0Var);
            return;
        }
        g0 z02 = e0Var.z0();
        z02.d(e0Var, "PartialDiskCacheProducer");
        InterfaceC6713d b10 = this.f30716b.b(D02, e(D02), e0Var.d());
        if (!isCacheEnabled) {
            z02.j(e0Var, "PartialDiskCacheProducer", f(z02, e0Var, false, 0));
            i(interfaceC3030n, e0Var, b10, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ((InterfaceC1039c) this.f30715a.get()).b().m(b10, atomicBoolean).e(h(interfaceC3030n, e0Var, b10));
            j(atomicBoolean, e0Var);
        }
    }

    public final d3.d h(InterfaceC3030n interfaceC3030n, e0 e0Var, InterfaceC6713d interfaceC6713d) {
        return new a(e0Var.z0(), e0Var, interfaceC3030n, interfaceC6713d);
    }

    public final void i(InterfaceC3030n interfaceC3030n, e0 e0Var, InterfaceC6713d interfaceC6713d, H7.k kVar) {
        this.f30719e.b(new c(interfaceC3030n, this.f30715a, interfaceC6713d, this.f30717c, this.f30718d, kVar, e0Var.D0().isCacheEnabled(32)), e0Var);
    }
}
