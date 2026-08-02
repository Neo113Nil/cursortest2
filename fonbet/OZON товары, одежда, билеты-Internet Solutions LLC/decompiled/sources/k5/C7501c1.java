package k5;

import Jb.h;
import android.content.Context;
import k5.K2;

/* renamed from: k5.c1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7501c1 implements K2 {

    /* renamed from: a, reason: collision with root package name */
    private Jb.f f70718a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<Context> f70719b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<R0> f70720c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<InterfaceC7505d1> f70721d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<C7525i1> f70722e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k5.c1$a */
    static final class a implements K2.a {

        /* renamed from: a, reason: collision with root package name */
        private C7516g0 f70723a;

        public final C7501c1 a() {
            Jb.j.a(C7516g0.class, this.f70723a);
            return new C7501c1(this.f70723a);
        }

        public final K2.a b(C7516g0 c7516g0) {
            c7516g0.getClass();
            this.f70723a = c7516g0;
            return this;
        }
    }

    C7501c1(C7516g0 c7516g0) {
        Jb.f a11 = Jb.f.a(c7516g0);
        this.f70718a = a11;
        this.f70719b = Jb.d.b(a11);
        Pc.a<R0> b11 = Jb.d.b(this.f70718a);
        this.f70720c = b11;
        this.f70721d = Jb.d.b(new C7504d0(this.f70719b, b11));
        h.a b12 = Jb.h.b(1);
        b12.b(Object.class, this.f70721d);
        this.f70722e = Jb.d.b(new Pa0.j(b12.a(), 2));
    }

    @Override // k5.Y1
    public final Context b() {
        return this.f70719b.get();
    }

    @Override // k5.Y1
    public final C7525i1 c() {
        return this.f70722e.get();
    }

    @Override // k5.Y1
    public final R0 w() {
        return this.f70720c.get();
    }
}
