package y50;

import B50.o;
import B50.p;
import Jb.i;
import android.app.Application;
import androidx.lifecycle.z0;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import g30.InterfaceC6618a;
import ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment;
import ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment;
import s40.InterfaceC9592a;
import x40.C10656a;
import z50.InterfaceC10990d;

/* loaded from: classes3.dex */
final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f106033a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<C10656a> f106034b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<S80.b> f106035c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<InterfaceC10990d> f106036d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<InterfaceC6083a> f106037e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f106038f;

    /* renamed from: g, reason: collision with root package name */
    private B50.m f106039g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<Application> f106040h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f106041i;

    /* renamed from: j, reason: collision with root package name */
    private B50.j f106042j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<z0.b> f106043k;

    private static final class a implements Pc.a<InterfaceC6083a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6422b f106044a;

        a(InterfaceC6422b interfaceC6422b) {
            this.f106044a = interfaceC6422b;
        }

        @Override // Pc.a
        public final InterfaceC6083a get() {
            InterfaceC6083a G02 = this.f106044a.G0();
            Jb.j.c(G02);
            return G02;
        }
    }

    private static final class b implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f106045a;

        b(Y20.a aVar) {
            this.f106045a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f106045a.B();
            Jb.j.c(B11);
            return B11;
        }
    }

    private static final class c implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f106046a;

        c(O90.a aVar) {
            this.f106046a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f106046a.w0();
            Jb.j.c(w02);
            return w02;
        }
    }

    private static final class d implements Pc.a<Application> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f106047a;

        d(P30.b bVar) {
            this.f106047a = bVar;
        }

        @Override // Pc.a
        public final Application get() {
            Application m12 = this.f106047a.m1();
            Jb.j.c(m12);
            return m12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements Pc.a<C10656a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9592a f106048a;

        e(InterfaceC9592a interfaceC9592a) {
            this.f106048a = interfaceC9592a;
        }

        @Override // Pc.a
        public final C10656a get() {
            return this.f106048a.C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f106049a;

        f(M80.a aVar) {
            this.f106049a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f106049a.d0();
            Jb.j.c(d02);
            return d02;
        }
    }

    n(P30.b bVar, InterfaceC9592a interfaceC9592a, InterfaceC6422b interfaceC6422b, M80.a aVar, Y20.a aVar2, O90.a aVar3) {
        this.f106033a = aVar2;
        e eVar = new e(interfaceC9592a);
        this.f106034b = eVar;
        f fVar = new f(aVar);
        this.f106035c = fVar;
        Pc.a<InterfaceC10990d> b11 = Jb.d.b(new k(eVar, fVar));
        this.f106036d = b11;
        a aVar4 = new a(interfaceC6422b);
        this.f106037e = aVar4;
        c cVar = new c(aVar3);
        this.f106038f = cVar;
        this.f106039g = new B50.m(aVar4, this.f106034b, cVar, b11, 0);
        d dVar = new d(bVar);
        this.f106040h = dVar;
        b bVar2 = new b(aVar2);
        this.f106041i = bVar2;
        this.f106042j = new B50.j(dVar, bVar2);
        i.a b12 = Jb.i.b(3);
        b12.b(ru.ozon.fintech.features.cbottomstories.presentation.a.class, this.f106039g);
        b12.b(B50.i.class, this.f106042j);
        b12.b(o.class, p.a());
        this.f106043k = Jb.d.b(new l(b12.a()));
    }

    @Override // w50.InterfaceC10441b
    public final InterfaceC10990d B0() {
        return this.f106036d.get();
    }

    @Override // y50.g
    public final void O(B50.h hVar) {
        hVar.factory = this.f106043k.get();
        InterfaceC6618a B11 = this.f106033a.B();
        Jb.j.c(B11);
        hVar.analyticsInteractor = B11;
    }

    @Override // y50.g
    public final void Q0(StoryFragment storyFragment) {
        storyFragment.factory = this.f106043k.get();
        InterfaceC6618a B11 = this.f106033a.B();
        Jb.j.c(B11);
        storyFragment.analyticsInteractor = B11;
    }

    @Override // y50.g
    public final void p(StoriesFragment storiesFragment) {
        storiesFragment.factory = this.f106043k.get();
        InterfaceC6618a B11 = this.f106033a.B();
        Jb.j.c(B11);
        storiesFragment.analyticsInteractor = B11;
    }
}
