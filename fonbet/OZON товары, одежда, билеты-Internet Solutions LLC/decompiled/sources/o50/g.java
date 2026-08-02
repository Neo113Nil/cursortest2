package o50;

import Jb.i;
import Jb.j;
import androidx.lifecycle.z0;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import g30.InterfaceC6618a;
import q50.C8989a;
import ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet;
import s40.InterfaceC9592a;
import x40.C10656a;

/* loaded from: classes3.dex */
final class g implements o50.a {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f77760a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<C10656a> f77761b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<S80.b> f77762c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<p50.a> f77763d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f77764e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<InterfaceC6083a> f77765f;

    /* renamed from: g, reason: collision with root package name */
    private q50.b f77766g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<z0.b> f77767h;

    private static final class a implements Pc.a<InterfaceC6083a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6422b f77768a;

        a(InterfaceC6422b interfaceC6422b) {
            this.f77768a = interfaceC6422b;
        }

        @Override // Pc.a
        public final InterfaceC6083a get() {
            InterfaceC6083a G02 = this.f77768a.G0();
            j.c(G02);
            return G02;
        }
    }

    private static final class b implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f77769a;

        b(Y20.a aVar) {
            this.f77769a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f77769a.B();
            j.c(B11);
            return B11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements Pc.a<C10656a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9592a f77770a;

        c(InterfaceC9592a interfaceC9592a) {
            this.f77770a = interfaceC9592a;
        }

        @Override // Pc.a
        public final C10656a get() {
            return this.f77770a.C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f77771a;

        d(M80.a aVar) {
            this.f77771a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f77771a.d0();
            j.c(d02);
            return d02;
        }
    }

    g(M80.a aVar, Y20.a aVar2, InterfaceC6422b interfaceC6422b, InterfaceC9592a interfaceC9592a) {
        this.f77760a = aVar2;
        c cVar = new c(interfaceC9592a);
        this.f77761b = cVar;
        d dVar = new d(aVar);
        this.f77762c = dVar;
        this.f77763d = Jb.d.b(new e(cVar, dVar));
        b bVar = new b(aVar2);
        this.f77764e = bVar;
        a aVar3 = new a(interfaceC6422b);
        this.f77765f = aVar3;
        this.f77766g = new q50.b(this.f77761b, bVar, aVar3);
        i.a b11 = i.b(1);
        b11.b(C8989a.class, this.f77766g);
        this.f77767h = Jb.d.b(new f(b11.a()));
    }

    @Override // m50.InterfaceC8087a
    public final p50.a r0() {
        return this.f77763d.get();
    }

    @Override // o50.a
    public final void t0(CbottomBottomSheet cbottomBottomSheet) {
        cbottomBottomSheet.factory = this.f77767h.get();
        InterfaceC6618a B11 = this.f77760a.B();
        j.c(B11);
        cbottomBottomSheet.analyticsInteractor = B11;
    }
}
