package n40;

import Jb.j;
import android.content.Context;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import g30.InterfaceC6618a;
import l90.C7901a;
import m40.InterfaceC8077a;
import o40.C8642c;
import o40.InterfaceC8640a;
import p40.m;
import p40.n;

/* loaded from: classes3.dex */
final class c implements InterfaceC8077a {

    /* renamed from: a, reason: collision with root package name */
    private Pc.a<Q90.c> f76487a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f76488b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<K40.a> f76489c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f76490d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<Context> f76491e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<R30.a> f76492f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<InterfaceC6083a> f76493g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<n> f76494h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<n> f76495i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<n> f76496j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<InterfaceC8640a> f76497k;

    private static final class a implements Pc.a<InterfaceC6083a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6422b f76498a;

        a(InterfaceC6422b interfaceC6422b) {
            this.f76498a = interfaceC6422b;
        }

        @Override // Pc.a
        public final InterfaceC6083a get() {
            InterfaceC6083a G02 = this.f76498a.G0();
            j.c(G02);
            return G02;
        }
    }

    private static final class b implements Pc.a<Q90.c> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f76499a;

        b(O90.a aVar) {
            this.f76499a = aVar;
        }

        @Override // Pc.a
        public final Q90.c get() {
            Q90.c F02 = this.f76499a.F0();
            j.c(F02);
            return F02;
        }
    }

    /* renamed from: n40.c$c, reason: collision with other inner class name */
    private static final class C1289c implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f76500a;

        C1289c(Y20.a aVar) {
            this.f76500a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f76500a.B();
            j.c(B11);
            return B11;
        }
    }

    private static final class d implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f76501a;

        d(O90.a aVar) {
            this.f76501a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f76501a.w0();
            j.c(w02);
            return w02;
        }
    }

    private static final class e implements Pc.a<R30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f76502a;

        e(P30.b bVar) {
            this.f76502a = bVar;
        }

        @Override // Pc.a
        public final R30.a get() {
            R30.a f7 = this.f76502a.f();
            j.c(f7);
            return f7;
        }
    }

    private static final class f implements Pc.a<K40.a> {

        /* renamed from: a, reason: collision with root package name */
        private final I40.a f76503a;

        f(I40.a aVar) {
            this.f76503a = aVar;
        }

        @Override // Pc.a
        public final K40.a get() {
            K40.a D02 = this.f76503a.D0();
            j.c(D02);
            return D02;
        }
    }

    private static final class g implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f76504a;

        g(P30.b bVar) {
            this.f76504a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f76504a.h();
            j.c(h11);
            return h11;
        }
    }

    c(P30.b bVar, I40.a aVar, C7901a c7901a, O90.a aVar2, Y20.a aVar3, InterfaceC6422b interfaceC6422b, N90.a aVar4, C80.a aVar5) {
        this.f76487a = new b(aVar2);
        this.f76488b = new d(aVar2);
        this.f76489c = new f(aVar);
        this.f76490d = new C1289c(aVar3);
        this.f76491e = new g(bVar);
        this.f76492f = new e(bVar);
        Jb.f a11 = Jb.f.a(aVar5);
        a aVar6 = new a(interfaceC6422b);
        this.f76493g = aVar6;
        this.f76494h = Jb.d.b(new p40.f(a11, this.f76487a, this.f76489c, this.f76490d, this.f76491e, this.f76492f, aVar6));
        this.f76495i = Jb.d.b(new m(Jb.f.a(aVar4), this.f76487a, this.f76489c, this.f76490d, this.f76491e, this.f76492f, this.f76493g));
        Pc.a<n> b11 = Jb.d.b(new P30.e(this.f76487a, Jb.f.a(c7901a), 2));
        this.f76496j = b11;
        this.f76497k = Jb.d.b(new C8642c(this.f76487a, this.f76488b, this.f76494h, this.f76495i, b11, this.f76490d));
    }

    @Override // m40.InterfaceC8077a
    public final InterfaceC8640a T() {
        return this.f76497k.get();
    }
}
