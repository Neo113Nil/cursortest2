package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class L implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30658a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.i f30659b;

    public class a extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.facebook.imagepipeline.request.b f30660f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g0 f30661g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e0 f30662h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3030n interfaceC3030n, g0 g0Var, e0 e0Var, String str, com.facebook.imagepipeline.request.b bVar, g0 g0Var2, e0 e0Var2) {
            super(interfaceC3030n, g0Var, e0Var, str);
            this.f30660f = bVar;
            this.f30661g = g0Var2;
            this.f30662h = e0Var2;
        }

        @Override // B6.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(H7.k kVar) {
            H7.k.r(kVar);
        }

        @Override // B6.h
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public H7.k c() {
            H7.k d10 = L.this.d(this.f30660f);
            if (d10 == null) {
                this.f30661g.b(this.f30662h, L.this.f(), false);
                this.f30662h.B("local", "fetch");
                return null;
            }
            d10.c2();
            this.f30661g.b(this.f30662h, L.this.f(), true);
            this.f30662h.B("local", "fetch");
            this.f30662h.U("image_color_space", d10.w0());
            return d10;
        }
    }

    public class b extends AbstractC3022f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f30664a;

        public b(m0 m0Var) {
            this.f30664a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f30664a.a();
        }
    }

    public L(Executor executor, G6.i iVar) {
        this.f30658a = executor;
        this.f30659b = iVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        g0 z02 = e0Var.z0();
        com.facebook.imagepipeline.request.b D02 = e0Var.D0();
        e0Var.B("local", "fetch");
        a aVar = new a(interfaceC3030n, z02, e0Var, f(), D02, z02, e0Var);
        e0Var.k(new b(aVar));
        this.f30658a.execute(aVar);
    }

    public H7.k c(InputStream inputStream, int i10) {
        H6.a aVar = null;
        try {
            aVar = i10 <= 0 ? H6.a.D0(this.f30659b.a(inputStream)) : H6.a.D0(this.f30659b.b(inputStream, i10));
            H7.k kVar = new H7.k(aVar);
            D6.b.b(inputStream);
            H6.a.U(aVar);
            return kVar;
        } catch (Throwable th2) {
            D6.b.b(inputStream);
            H6.a.U(aVar);
            throw th2;
        }
    }

    public abstract H7.k d(com.facebook.imagepipeline.request.b bVar);

    public H7.k e(InputStream inputStream, int i10) {
        return c(inputStream, i10);
    }

    public abstract String f();
}
