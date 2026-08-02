package y50;

import Jb.i;
import androidx.lifecycle.z0;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.cbottomstories.presentation.FullFragment;
import s40.InterfaceC9592a;
import x40.C10656a;
import z50.InterfaceC10987a;

/* loaded from: classes3.dex */
final class m implements InterfaceC10839a {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f106021a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<C10656a> f106022b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<S80.b> f106023c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<InterfaceC10987a> f106024d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f106025e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<InterfaceC6083a> f106026f;

    /* renamed from: g, reason: collision with root package name */
    private B50.d f106027g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<z0.b> f106028h;

    private static final class a implements Pc.a<InterfaceC6083a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6422b f106029a;

        a(InterfaceC6422b interfaceC6422b) {
            this.f106029a = interfaceC6422b;
        }

        @Override // Pc.a
        public final InterfaceC6083a get() {
            InterfaceC6083a G02 = this.f106029a.G0();
            Jb.j.c(G02);
            return G02;
        }
    }

    private static final class b implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f106030a;

        b(O90.a aVar) {
            this.f106030a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f106030a.w0();
            Jb.j.c(w02);
            return w02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements Pc.a<C10656a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9592a f106031a;

        c(InterfaceC9592a interfaceC9592a) {
            this.f106031a = interfaceC9592a;
        }

        @Override // Pc.a
        public final C10656a get() {
            return this.f106031a.C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f106032a;

        d(M80.a aVar) {
            this.f106032a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f106032a.d0();
            Jb.j.c(d02);
            return d02;
        }
    }

    m(M80.a aVar, O90.a aVar2, Y20.a aVar3, InterfaceC6422b interfaceC6422b, InterfaceC9592a interfaceC9592a) {
        this.f106021a = aVar3;
        c cVar = new c(interfaceC9592a);
        this.f106022b = cVar;
        d dVar = new d(aVar);
        this.f106023c = dVar;
        Pc.a<InterfaceC10987a> b11 = Jb.d.b(new C10843e(cVar, dVar));
        this.f106024d = b11;
        b bVar = new b(aVar2);
        this.f106025e = bVar;
        a aVar4 = new a(interfaceC6422b);
        this.f106026f = aVar4;
        this.f106027g = new B50.d(this.f106022b, b11, bVar, aVar4);
        i.a b12 = Jb.i.b(1);
        b12.b(B50.c.class, this.f106027g);
        this.f106028h = Jb.d.b(new C10844f(b12.a()));
    }

    @Override // y50.InterfaceC10839a
    public final void Q(FullFragment fullFragment) {
        fullFragment.factory = this.f106028h.get();
        InterfaceC6618a B11 = this.f106021a.B();
        Jb.j.c(B11);
        fullFragment.analyticsInteractor = B11;
    }

    @Override // w50.InterfaceC10440a
    public final InterfaceC10987a m() {
        return this.f106024d.get();
    }
}
