package i50;

import Jb.i;
import Jb.j;
import androidx.lifecycle.z0;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import g30.InterfaceC6618a;
import j50.InterfaceC7285a;
import k50.C7594a;
import ru.ozon.fintech.features.cbottomscreen.presentation.CbottomScreenFragment;
import s40.InterfaceC9592a;
import x40.C10656a;

/* loaded from: classes3.dex */
final class g implements InterfaceC7010a {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f65865a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<C10656a> f65866b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<S80.b> f65867c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<InterfaceC7285a> f65868d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<InterfaceC6083a> f65869e;

    /* renamed from: f, reason: collision with root package name */
    private k50.b f65870f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<z0.b> f65871g;

    private static final class a implements Pc.a<InterfaceC6083a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6422b f65872a;

        a(InterfaceC6422b interfaceC6422b) {
            this.f65872a = interfaceC6422b;
        }

        @Override // Pc.a
        public final InterfaceC6083a get() {
            InterfaceC6083a G02 = this.f65872a.G0();
            j.c(G02);
            return G02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements Pc.a<C10656a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9592a f65873a;

        b(InterfaceC9592a interfaceC9592a) {
            this.f65873a = interfaceC9592a;
        }

        @Override // Pc.a
        public final C10656a get() {
            return this.f65873a.C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f65874a;

        c(M80.a aVar) {
            this.f65874a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f65874a.d0();
            j.c(d02);
            return d02;
        }
    }

    g(M80.a aVar, Y20.a aVar2, InterfaceC6422b interfaceC6422b, InterfaceC9592a interfaceC9592a) {
        this.f65865a = aVar2;
        b bVar = new b(interfaceC9592a);
        this.f65866b = bVar;
        c cVar = new c(aVar);
        this.f65867c = cVar;
        Pc.a<InterfaceC7285a> b11 = Jb.d.b(new e(bVar, cVar));
        this.f65868d = b11;
        a aVar3 = new a(interfaceC6422b);
        this.f65869e = aVar3;
        this.f65870f = new k50.b(aVar3, this.f65866b, b11);
        i.a b12 = i.b(1);
        b12.b(C7594a.class, this.f65870f);
        this.f65871g = Jb.d.b(new f(b12.a()));
    }

    @Override // g50.InterfaceC6652a
    public final InterfaceC7285a U() {
        return this.f65868d.get();
    }

    @Override // i50.InterfaceC7010a
    public final void n1(CbottomScreenFragment cbottomScreenFragment) {
        cbottomScreenFragment.factory = this.f65871g.get();
        InterfaceC6618a B11 = this.f65865a.B();
        j.c(B11);
        cbottomScreenFragment.analyticsInteractor = B11;
    }
}
