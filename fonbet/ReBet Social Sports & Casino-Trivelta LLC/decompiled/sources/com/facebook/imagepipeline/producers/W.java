package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public class W implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final G6.i f30710a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.a f30711b;

    /* renamed from: c, reason: collision with root package name */
    public final X f30712c;

    public class a implements X.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C f30713a;

        public a(C c10) {
            this.f30713a = c10;
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void a() {
            W.this.k(this.f30713a);
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void b(InputStream inputStream, int i10) {
            if (N7.b.d()) {
                N7.b.a("NetworkFetcher->onResponse");
            }
            W.this.m(this.f30713a, inputStream, i10);
            if (N7.b.d()) {
                N7.b.b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void onFailure(Throwable th2) {
            W.this.l(this.f30713a, th2);
        }
    }

    public W(G6.i iVar, G6.a aVar, X x10) {
        this.f30710a = iVar;
        this.f30711b = aVar;
        this.f30712c = x10;
    }

    public static float e(int i10, int i11) {
        return i11 > 0 ? i10 / i11 : 1.0f - ((float) Math.exp((-i10) / 50000.0d));
    }

    public static void j(G6.k kVar, int i10, B7.b bVar, InterfaceC3030n interfaceC3030n, e0 e0Var) {
        H7.k kVar2;
        H6.a D02 = H6.a.D0(kVar.d());
        H7.k kVar3 = null;
        try {
            kVar2 = new H7.k(D02);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            kVar2.g2(bVar);
            kVar2.c2();
            interfaceC3030n.b(kVar2, i10);
            H7.k.r(kVar2);
            H6.a.U(D02);
        } catch (Throwable th3) {
            th = th3;
            kVar3 = kVar2;
            H7.k.r(kVar3);
            H6.a.U(D02);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        e0Var.z0().d(e0Var, "NetworkFetchProducer");
        C createFetchState = this.f30712c.createFetchState(interfaceC3030n, e0Var);
        this.f30712c.fetch(createFetchState, new a(createFetchState));
    }

    public final Map f(C c10, int i10) {
        if (c10.d().f(c10.b(), "NetworkFetchProducer")) {
            return this.f30712c.getExtraMap(c10, i10);
        }
        return null;
    }

    public long g() {
        return SystemClock.uptimeMillis();
    }

    public void h(G6.k kVar, C c10) {
        Map f10 = f(c10, kVar.size());
        g0 d10 = c10.d();
        d10.j(c10.b(), "NetworkFetchProducer", f10);
        d10.b(c10.b(), "NetworkFetchProducer", true);
        c10.b().w0("network");
        j(kVar, c10.e() | 1, c10.f(), c10.a(), c10.b());
    }

    public void i(G6.k kVar, C c10) {
        if (n(c10, c10.b())) {
            long g10 = g();
            if (g10 - c10.c() >= 100) {
                c10.h(g10);
                c10.d().h(c10.b(), "NetworkFetchProducer", "intermediate_result");
                j(kVar, c10.e(), c10.f(), c10.a(), c10.b());
            }
        }
    }

    public final void k(C c10) {
        c10.d().c(c10.b(), "NetworkFetchProducer", null);
        c10.a().a();
    }

    public final void l(C c10, Throwable th2) {
        c10.d().k(c10.b(), "NetworkFetchProducer", th2, null);
        c10.d().b(c10.b(), "NetworkFetchProducer", false);
        c10.b().w0("network");
        c10.a().onFailure(th2);
    }

    public void m(C c10, InputStream inputStream, int i10) {
        G6.k e10 = i10 > 0 ? this.f30710a.e(i10) : this.f30710a.c();
        byte[] bArr = (byte[]) this.f30711b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f30712c.onFetchCompletion(c10, e10.size());
                    h(e10, c10);
                    this.f30711b.release(bArr);
                    e10.close();
                    return;
                }
                if (read > 0) {
                    e10.write(bArr, 0, read);
                    i(e10, c10);
                    c10.a().c(e(e10.size(), i10));
                }
            } catch (Throwable th2) {
                this.f30711b.release(bArr);
                e10.close();
                throw th2;
            }
        }
    }

    public final boolean n(C c10, e0 e0Var) {
        F7.e h10 = e0Var.r().h();
        if (h10 != null && h10.c() && c10.b().A0()) {
            return this.f30712c.shouldPropagate(c10);
        }
        return false;
    }
}
