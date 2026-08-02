package ru.ozon.android.messenger.framework.core.initialization.di;

import De.C2862e;
import Jb.i;
import Jb.l;
import Jb.m;
import Pa0.g;
import android.content.Context;
import androidx.lifecycle.C5418g0;
import c70.h;
import c70.i;
import com.squareup.moshi.Moshi;
import ei0.InterfaceC6369b;
import f30.k;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.core.initialization.di.c;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB;
import ru.ozon.android.messenger.framework.data.local.q;
import ru.ozon.android.messenger.framework.data.remote.FileApi;
import ru.ozon.android.messenger.framework.data.remote.action.ActionApi;
import ru.ozon.android.messenger.framework.data.remote.websocket.C9331b;
import ru.ozon.android.messenger.framework.data.remote.websocket.V;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.data.repository.G;
import ru.ozon.android.messenger.framework.data.repository.H;
import ru.ozon.android.messenger.framework.data.repository.Q;
import ru.ozon.android.messenger.framework.data.repository.S;
import ru.ozon.android.messenger.framework.data.repository.X;
import ru.ozon.android.messenger.framework.data.repository.i0;
import ru.ozon.android.messenger.framework.data.repository.n0;
import ru.ozon.android.messenger.framework.di.C9377b;
import ru.ozon.android.messenger.framework.di.C9378c;
import ru.ozon.android.messenger.framework.di.C9379d;
import ru.ozon.android.messenger.framework.di.C9380e;
import ru.ozon.android.messenger.framework.di.C9381f;
import ru.ozon.android.messenger.framework.di.C9382g;
import ru.ozon.android.messenger.framework.di.E;
import ru.ozon.android.messenger.framework.di.InterfaceC9376a;
import ru.ozon.android.messenger.framework.di.j;
import ru.ozon.android.messenger.framework.di.l;
import ru.ozon.android.messenger.framework.di.n;
import ru.ozon.android.messenger.framework.di.p;
import ru.ozon.android.messenger.framework.di.s;
import ru.ozon.android.messenger.framework.di.t;
import ru.ozon.android.messenger.framework.di.u;
import ru.ozon.android.messenger.framework.di.v;
import ru.ozon.android.messenger.framework.di.w;
import ru.ozon.android.messenger.framework.di.y;
import ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a;
import ru.ozon.android.messenger.framework.domain.service.x;
import ru.ozon.android.messenger.framework.domain.service.z;
import ru.ozon.android.messenger.framework.domain.usecases.A;
import ru.ozon.android.messenger.framework.domain.usecases.C;
import ru.ozon.android.messenger.framework.domain.usecases.C9385b;
import ru.ozon.android.messenger.framework.domain.usecases.C9386c;
import ru.ozon.android.messenger.framework.domain.usecases.C9392i;
import ru.ozon.android.messenger.framework.domain.usecases.C9393j;
import ru.ozon.android.messenger.framework.domain.usecases.C9395l;
import ru.ozon.android.messenger.framework.domain.usecases.C9396m;
import ru.ozon.android.messenger.framework.domain.usecases.C9401s;
import ru.ozon.android.messenger.framework.domain.usecases.C9402t;
import ru.ozon.android.messenger.framework.domain.usecases.C9408z;
import ru.ozon.android.messenger.framework.domain.usecases.F;
import ru.ozon.android.messenger.framework.domain.usecases.K;
import ru.ozon.android.messenger.framework.domain.usecases.L;
import ru.ozon.android.messenger.framework.domain.usecases.O;
import ru.ozon.android.messenger.framework.domain.usecases.P;
import ru.ozon.android.messenger.framework.domain.usecases.Z;
import ru.ozon.android.messenger.framework.domain.usecases.b0;
import ru.ozon.android.messenger.framework.domain.usecases.f0;
import ru.ozon.android.messenger.framework.domain.usecases.g0;
import ru.ozon.android.messenger.framework.domain.usecases.r;
import ru.ozon.android.messenger.framework.presentation.ai.C9409a;
import ru.ozon.android.messenger.framework.presentation.ai.C9413c;
import ru.ozon.android.messenger.framework.presentation.ai.C9414c0;
import ru.ozon.android.messenger.framework.presentation.ai.K0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.k;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C9467e;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.x0;
import ru.ozon.android.messenger.framework.presentation.chatlist.C9488a;
import ru.ozon.android.messenger.framework.presentation.chatlist.k;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.C9498j;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.T;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.U;
import ru.ozon.android.messenger.framework.presentation.common.notification.d;
import ru.ozon.android.messenger.framework.presentation.common.notification.g;
import ru.ozon.android.messenger.framework.presentation.common.notification.i;
import ru.ozon.android.messenger.framework.presentation.common.notification.j;
import ru.ozon.android.messenger.framework.presentation.messenger.j;
import ru.ozon.android.messenger.framework.presentation.models.B;
import ru.ozon.android.messenger.framework.presentation.search.C9516a;
import ru.ozon.android.messenger.framework.presentation.search.G;
import ru.ozon.android.messenger.framework.presentation.search.I;
import ru.ozon.android.messenger.framework.presentation.search.M;
import xe.C10720e0;
import xe.H0;
import xe.N;
import xe.X0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: ru.ozon.android.messenger.framework.core.initialization.di.a$a, reason: collision with other inner class name */
    private static final class C1561a implements InterfaceC9376a.InterfaceC1633a {

        /* renamed from: a, reason: collision with root package name */
        private final f f87158a;

        C1561a(f fVar) {
            this.f87158a = fVar;
        }

        @Override // ru.ozon.android.messenger.framework.di.InterfaceC9376a.InterfaceC1633a
        public final InterfaceC9376a a(C9409a c9409a, C5418g0 c5418g0) {
            return new b(this.f87158a, new C9377b(), c9409a, c5418g0);
        }
    }

    private static final class b implements InterfaceC9376a {

        /* renamed from: A, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.domain.service.c> f87159A;

        /* renamed from: B, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.domain.a> f87160B;

        /* renamed from: C, reason: collision with root package name */
        private Pc.a<x> f87161C;

        /* renamed from: a, reason: collision with root package name */
        private final C9409a f87162a;

        /* renamed from: b, reason: collision with root package name */
        private final C5418g0 f87163b;

        /* renamed from: c, reason: collision with root package name */
        private final f f87164c;

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<K0> f87165d = Jb.d.b(new C9379d());

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<K> f87166e = m.a(L.a());

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<C9385b> f87167f;

        /* renamed from: g, reason: collision with root package name */
        private Jb.f f87168g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.local.a> f87169h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.domain.repository.d> f87170i;

        /* renamed from: j, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.composer.di.module.b f87171j;

        /* renamed from: k, reason: collision with root package name */
        private f0 f87172k;

        /* renamed from: l, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.composer.di.module.b f87173l;

        /* renamed from: m, reason: collision with root package name */
        private C9392i f87174m;

        /* renamed from: n, reason: collision with root package name */
        private ru.ozon.android.messenger.blocks.emptystate.b f87175n;

        /* renamed from: o, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.presentation.common.startup.a> f87176o;

        /* renamed from: p, reason: collision with root package name */
        private Pc.a<o> f87177p;

        /* renamed from: q, reason: collision with root package name */
        private Ua0.b f87178q;

        /* renamed from: r, reason: collision with root package name */
        private k f87179r;

        /* renamed from: s, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.domain.usecases.ai.d f87180s;

        /* renamed from: t, reason: collision with root package name */
        private g f87181t;

        /* renamed from: u, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.c> f87182u;

        /* renamed from: v, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a> f87183v;

        /* renamed from: w, reason: collision with root package name */
        private Pc.a<z> f87184w;

        /* renamed from: x, reason: collision with root package name */
        private Pc.a<x0> f87185x;

        /* renamed from: y, reason: collision with root package name */
        private i0 f87186y;

        /* renamed from: z, reason: collision with root package name */
        private Pc.a<InterfaceC9383a> f87187z;

        b(f fVar, C9377b c9377b, C9409a c9409a, C5418g0 c5418g0) {
            this.f87164c = fVar;
            this.f87162a = c9409a;
            this.f87163b = c5418g0;
            this.f87167f = m.a(new C9386c(fVar.f87281m0));
            Jb.f a11 = Jb.f.a(c9409a);
            this.f87168g = a11;
            Pc.a<ru.ozon.android.messenger.framework.data.local.a> b11 = Jb.d.b(new i(c9377b, this.f87166e, this.f87167f, a11));
            this.f87169h = b11;
            this.f87170i = Jb.d.b(new q(c9377b, new ru.ozon.android.messenger.blocks.alert.b(b11, fVar.f87287p0, E.a()), 2));
            this.f87171j = new ru.ozon.android.messenger.framework.composer.di.module.b(fVar.f87281m0, fVar.f87303x0);
            this.f87172k = new f0(fVar.f87281m0, fVar.f87227H, this.f87171j);
            this.f87173l = new ru.ozon.android.messenger.framework.composer.di.module.b(fVar.f87281m0, fVar.f87303x0);
            this.f87174m = new C9392i(fVar.f87281m0, fVar.f87227H, this.f87173l);
            ru.ozon.android.messenger.blocks.emptystate.b bVar = new ru.ozon.android.messenger.blocks.emptystate.b(fVar.f87290r, fVar.f87213A, fVar.f87278l, fVar.f87292s);
            this.f87175n = bVar;
            this.f87176o = Jb.d.b(new C9382g(c9377b, this.f87172k, this.f87174m, bVar, fVar.f87281m0, this.f87170i, this.f87168g));
            this.f87177p = Jb.d.b(new j(c9377b, this.f87169h, this.f87176o, new Z(fVar.f87281m0, 0)));
            this.f87178q = new Ua0.b(fVar.f87281m0, 1);
            this.f87179r = new k(fVar.f87281m0, 1);
            this.f87180s = new ru.ozon.android.messenger.framework.domain.usecases.ai.d(fVar.f87281m0, 0);
            this.f87181t = new g(fVar.f87281m0, 1);
            this.f87182u = Jb.d.b(new ru.ozon.android.messenger.framework.di.i(c9377b));
            this.f87183v = Jb.d.b(new C9378c(c9377b, this.f87178q, A.a(), this.f87179r, fVar.f87214A0, this.f87180s, this.f87175n, fVar.f87281m0, fVar.f87284o, fVar.f87227H, this.f87181t, this.f87169h, this.f87168g, this.f87177p, this.f87176o, this.f87182u));
            this.f87184w = Jb.d.b(new d90.m(c9377b, ru.ozon.android.messenger.blocks.messageimage.b.a(), ru.ozon.android.messenger.blocks.messagefile.b.a(), fVar.f87213A, fVar.f87296u));
            this.f87185x = Jb.d.b(new La0.b(c9377b, 2));
            this.f87186y = new i0(fVar.f87227H, fVar.f87281m0);
            this.f87187z = Jb.d.b(new C9380e(c9377b, new ru.ozon.android.messenger.framework.domain.service.b(fVar.f87278l, fVar.f87219D)));
            this.f87159A = Jb.d.b(new C9381f(c9377b, fVar.f87281m0, this.f87185x, this.f87186y, y.a(), this.f87170i, this.f87183v, this.f87187z, this.f87182u));
            this.f87160B = Jb.d.b(new h(c9377b, this.f87170i, fVar.f87281m0));
            this.f87161C = Jb.d.b(new ru.ozon.android.messenger.framework.di.h(c9377b, this.f87185x, this.f87159A));
        }

        @Override // ru.ozon.android.messenger.framework.di.InterfaceC9376a
        public final C9414c0 a() {
            f fVar = this.f87164c;
            return new C9414c0((ru.ozon.android.messenger.framework.navigation.controller.a) fVar.f87284o.get(), this.f87165d.get(), (ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get(), this.f87170i.get(), fVar.m0(), (r) fVar.f87285o0.get(), fVar.f87266f, new ru.ozon.android.messenger.framework.presentation.common.notification.c((ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get(), new ru.ozon.android.messenger.blocks.emptystate.a(fVar.f87256a, (ru.ozon.android.messenger.framework.data.b) fVar.f87213A.get(), fVar.f87268g, fVar.f87270h)), this.f87177p.get(), this.f87183v.get(), this.f87176o.get(), new C9402t(this.f87170i.get(), this.f87183v.get(), this.f87177p.get(), this.f87166e.get(), this.f87167f.get(), this.f87162a), new P(this.f87184w.get(), (ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get(), this.f87185x.get(), this.f87159A.get(), this.f87170i.get(), this.f87160B.get(), this.f87187z.get()), new F((ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get(), this.f87170i.get(), this.f87161C.get(), this.f87166e.get(), this.f87177p.get(), this.f87167f.get(), this.f87159A.get()), new ru.ozon.android.messenger.framework.presentation.mapper.a(this.f87182u.get()), new C9393j(this.f87169h.get()), (ru.ozon.android.messenger.blocks.alert.a) fVar.f87291r0.get(), this.f87163b, fVar.f87272i);
        }
    }

    private static final class c implements l.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f87188a;

        c(f fVar) {
            this.f87188a = fVar;
        }

        @Override // ru.ozon.android.messenger.framework.di.l.a
        public final l a(ru.ozon.android.messenger.framework.presentation.chatdetail.i iVar) {
            return new d(this.f87188a, new ru.ozon.android.messenger.framework.di.m(), iVar);
        }
    }

    private static final class d implements l {

        /* renamed from: a, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.presentation.chatdetail.i f87189a;

        /* renamed from: b, reason: collision with root package name */
        private final f f87190b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<K> f87191c = m.a(L.a());

        /* renamed from: d, reason: collision with root package name */
        private Pc.a<C9385b> f87192d;

        /* renamed from: e, reason: collision with root package name */
        private Jb.f f87193e;

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.local.a> f87194f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.domain.repository.d> f87195g;

        /* renamed from: h, reason: collision with root package name */
        private Pc.a<InterfaceC9383a> f87196h;

        /* renamed from: i, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.composer.di.module.b f87197i;

        /* renamed from: j, reason: collision with root package name */
        private f0 f87198j;

        /* renamed from: k, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.composer.di.module.b f87199k;

        /* renamed from: l, reason: collision with root package name */
        private C9392i f87200l;

        /* renamed from: m, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.presentation.common.startup.a> f87201m;

        /* renamed from: n, reason: collision with root package name */
        private Pc.a<o> f87202n;

        /* renamed from: o, reason: collision with root package name */
        private Ua0.b f87203o;

        /* renamed from: p, reason: collision with root package name */
        private k f87204p;

        /* renamed from: q, reason: collision with root package name */
        private Pc.a<x0> f87205q;

        /* renamed from: r, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k> f87206r;

        /* renamed from: s, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a> f87207s;

        /* renamed from: t, reason: collision with root package name */
        private Pc.a<z> f87208t;

        /* renamed from: u, reason: collision with root package name */
        private i0 f87209u;

        /* renamed from: v, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.domain.service.c> f87210v;

        /* renamed from: w, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.domain.a> f87211w;

        /* renamed from: x, reason: collision with root package name */
        private Pc.a<x> f87212x;

        d(f fVar, ru.ozon.android.messenger.framework.di.m mVar, ru.ozon.android.messenger.framework.presentation.chatdetail.i iVar) {
            this.f87190b = fVar;
            this.f87189a = iVar;
            this.f87192d = m.a(new C9386c(fVar.f87281m0));
            Jb.f a11 = Jb.f.a(iVar);
            this.f87193e = a11;
            Pc.a<ru.ozon.android.messenger.framework.data.local.a> b11 = Jb.d.b(new p(mVar, this.f87191c, this.f87192d, a11));
            this.f87194f = b11;
            this.f87195g = Jb.d.b(new ru.ozon.android.messenger.framework.composer.widgets.b(mVar, new ru.ozon.android.messenger.blocks.alert.b(b11, fVar.f87287p0, E.a())));
            this.f87196h = Jb.d.b(new ru.ozon.android.messenger.framework.di.o(mVar, new ru.ozon.android.messenger.framework.domain.service.b(fVar.f87278l, fVar.f87219D)));
            this.f87197i = new ru.ozon.android.messenger.framework.composer.di.module.b(fVar.f87281m0, fVar.f87303x0);
            this.f87198j = new f0(fVar.f87281m0, fVar.f87227H, this.f87197i);
            this.f87199k = new ru.ozon.android.messenger.framework.composer.di.module.b(fVar.f87281m0, fVar.f87303x0);
            C9392i c9392i = new C9392i(fVar.f87281m0, fVar.f87227H, this.f87199k);
            this.f87200l = c9392i;
            this.f87201m = Jb.d.b(new s(mVar, this.f87198j, c9392i, fVar.f87215B, fVar.f87281m0, this.f87194f, this.f87193e));
            this.f87202n = Jb.d.b(new w(mVar, this.f87194f, this.f87201m, new Z(fVar.f87281m0, 0)));
            this.f87203o = new Ua0.b(fVar.f87281m0, 1);
            this.f87204p = new k(fVar.f87281m0, 1);
            this.f87205q = Jb.d.b(new u(mVar));
            this.f87206r = Jb.d.b(new F70.b((Pc.a) this.f87195g, (Pc.a) this.f87205q, new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.k(this.f87198j, this.f87200l, fVar.f87215B, fVar.f87281m0, this.f87194f, this.f87193e), fVar.f87281m0));
            this.f87207s = Jb.d.b(new ru.ozon.android.messenger.framework.di.q(mVar, this.f87203o, A.a(), fVar.f87214A0, this.f87204p, fVar.f87215B, fVar.f87281m0, fVar.f87227H, this.f87194f, this.f87193e, this.f87202n, this.f87201m, this.f87206r));
            this.f87208t = Jb.d.b(new v(mVar, ru.ozon.android.messenger.blocks.messageimage.b.a(), ru.ozon.android.messenger.blocks.messagefile.b.a(), fVar.f87213A, fVar.f87296u));
            this.f87209u = new i0(fVar.f87227H, fVar.f87281m0);
            this.f87210v = Jb.d.b(new ru.ozon.android.messenger.framework.di.r(mVar, fVar.f87281m0, this.f87205q, this.f87209u, y.a(), this.f87195g, this.f87207s, this.f87196h, this.f87206r));
            this.f87211w = Jb.d.b(new n(mVar, this.f87195g, fVar.f87281m0));
            this.f87212x = Jb.d.b(new t(mVar, this.f87205q, this.f87210v));
        }

        @Override // ru.ozon.android.messenger.framework.di.l
        public final C9467e a() {
            f fVar = this.f87190b;
            ru.ozon.android.messenger.framework.navigation.controller.a aVar = (ru.ozon.android.messenger.framework.navigation.controller.a) fVar.f87284o.get();
            ru.ozon.android.messenger.framework.domain.repository.b bVar = (ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get();
            ru.ozon.android.messenger.framework.domain.repository.d dVar = this.f87195g.get();
            C9351a m02 = fVar.m0();
            r rVar = (r) fVar.f87285o0.get();
            ru.ozon.android.messenger.blocks.alert.a aVar2 = (ru.ozon.android.messenger.blocks.alert.a) fVar.f87291r0.get();
            b0 b0Var = new b0((ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get());
            ru.ozon.android.messenger.framework.analytics.i iVar = fVar.f87266f;
            InterfaceC9383a interfaceC9383a = this.f87196h.get();
            ru.ozon.android.messenger.framework.presentation.mappers.a aVar3 = new ru.ozon.android.messenger.framework.presentation.mappers.a();
            g0 g0Var = new g0((ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get());
            d.a aVar4 = (d.a) fVar.f87299v0.get();
            i.a i02 = f.i0(fVar);
            ru.ozon.android.messenger.framework.composer.navigation.router.a j02 = f.j0(fVar);
            o oVar = this.f87202n.get();
            ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar5 = this.f87207s.get();
            ru.ozon.android.messenger.framework.presentation.common.startup.a aVar6 = this.f87201m.get();
            ru.ozon.android.messenger.framework.domain.repository.d dVar2 = this.f87195g.get();
            ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar7 = this.f87207s.get();
            o oVar2 = this.f87202n.get();
            K k11 = this.f87191c.get();
            C9385b c9385b = this.f87192d.get();
            ru.ozon.android.messenger.framework.presentation.chatdetail.i iVar2 = this.f87189a;
            return new C9467e(aVar, bVar, dVar, m02, rVar, aVar2, b0Var, iVar, interfaceC9383a, aVar3, g0Var, aVar4, i02, j02, oVar, aVar5, aVar6, new C9402t(dVar2, aVar7, oVar2, k11, c9385b, iVar2), new P(this.f87208t.get(), (ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get(), this.f87205q.get(), this.f87210v.get(), this.f87195g.get(), this.f87211w.get(), this.f87196h.get()), new F((ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get(), this.f87195g.get(), this.f87212x.get(), this.f87191c.get(), this.f87202n.get(), this.f87192d.get(), this.f87210v.get()), new ru.ozon.android.messenger.framework.presentation.mapper.a(this.f87206r.get()), new O((ru.ozon.android.messenger.framework.domain.repository.b) fVar.f87281m0.get(), this.f87195g.get(), this.f87212x.get(), this.f87207s.get(), (ru.ozon.android.messenger.blocks.alert.a) fVar.f87291r0.get()), new C9393j(this.f87194f.get()), iVar2, f.l0(fVar), f.k0(fVar), this.f87206r.get());
        }

        @Override // ru.ozon.android.messenger.framework.di.l
        public final void b(ru.ozon.android.messenger.framework.presentation.chatdetail.d dVar) {
            f fVar = this.f87190b;
            dVar.f89731d = fVar.f87268g;
            dVar.f89732e = (k.b) fVar.f87231J.get();
            dVar.f89733f = (ru.ozon.android.messenger.framework.data.b) fVar.f87213A.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements c.a {
        public final ru.ozon.android.messenger.framework.core.initialization.di.c a(Context context, d.f fVar, We.E e11, ru.ozon.android.messenger.framework.core.initialization.d dVar, ru.ozon.android.messenger.framework.core.c cVar, ru.ozon.android.messenger.framework.logger.b bVar, d.e eVar, Set<ru.ozon.android.messenger.framework.core.a> set, d.g gVar, d.InterfaceC1560d interfaceC1560d, ru.ozon.android.messenger.framework.analytics.i iVar, ru.ozon.android.messenger.framework.navigation.action.f fVar2, d.b bVar2, ru.ozon.android.messenger.framework.core.initialization.a aVar, InterfaceC6369b interfaceC6369b) {
            context.getClass();
            fVar.getClass();
            dVar.getClass();
            cVar.getClass();
            eVar.getClass();
            set.getClass();
            gVar.getClass();
            fVar2.getClass();
            bVar2.getClass();
            aVar.getClass();
            return new f(new ru.ozon.android.messenger.framework.network.di.a(), context, fVar, e11, dVar, cVar, bVar, eVar, set, gVar, iVar, fVar2, bVar2, aVar, interfaceC6369b);
        }
    }

    private static final class f implements ru.ozon.android.messenger.framework.core.initialization.di.c {

        /* renamed from: A, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.b> f87213A;

        /* renamed from: A0, reason: collision with root package name */
        private Pc.a<C9396m> f87214A0;

        /* renamed from: B, reason: collision with root package name */
        private ru.ozon.android.messenger.blocks.emptystate.f f87215B;

        /* renamed from: B0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.r f87216B0;

        /* renamed from: C, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.data.remote.mapper.f f87217C;

        /* renamed from: C0, reason: collision with root package name */
        private T f87218C0;

        /* renamed from: D, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.m> f87219D;

        /* renamed from: D0, reason: collision with root package name */
        private Jb.f f87220D0;

        /* renamed from: E, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.remote.mapper.g> f87221E;

        /* renamed from: E0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.presentation.chatlist.t f87222E0;

        /* renamed from: F, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.navigation.d> f87223F;

        /* renamed from: F0, reason: collision with root package name */
        private Jb.f f87224F0;

        /* renamed from: G, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.presentation.common.view.recycler.h f87225G;

        /* renamed from: G0, reason: collision with root package name */
        private Jb.f f87226G0;

        /* renamed from: H, reason: collision with root package name */
        private Jb.f f87227H;

        /* renamed from: H0, reason: collision with root package name */
        private Pc.a<n0> f87228H0;

        /* renamed from: I, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.presentation.common.notification.h f87229I;

        /* renamed from: I0, reason: collision with root package name */
        private Jb.f f87230I0;

        /* renamed from: J, reason: collision with root package name */
        private Jb.f f87231J;

        /* renamed from: J0, reason: collision with root package name */
        private Jb.f f87232J0;

        /* renamed from: K, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.remote.mapper.c> f87233K;

        /* renamed from: K0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.presentation.messenger.u f87234K0;

        /* renamed from: L, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.composer.network.serialization.b f87235L;

        /* renamed from: L0, reason: collision with root package name */
        private Jb.f f87236L0;

        /* renamed from: M, reason: collision with root package name */
        private X60.d f87237M;

        /* renamed from: M0, reason: collision with root package name */
        private ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.i f87238M0;

        /* renamed from: N, reason: collision with root package name */
        private Jb.f f87239N;

        /* renamed from: N0, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.di.viewmodels.a> f87240N0;

        /* renamed from: O, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.data.local.t f87241O;

        /* renamed from: O0, reason: collision with root package name */
        private ru.ozon.android.messenger.blocks.emptystate.d f87242O0;

        /* renamed from: P, reason: collision with root package name */
        private V f87243P;

        /* renamed from: P0, reason: collision with root package name */
        private I f87244P0;

        /* renamed from: Q, reason: collision with root package name */
        private Pc.a<C9331b> f87245Q;

        /* renamed from: Q0, reason: collision with root package name */
        private Jb.f f87246Q0;

        /* renamed from: R, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.cache.b> f87247R;

        /* renamed from: S, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.cache.f> f87248S;

        /* renamed from: T, reason: collision with root package name */
        private Pc.a<MessengerDB> f87249T;

        /* renamed from: U, reason: collision with root package name */
        private f50.q f87250U;

        /* renamed from: V, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.local.mapper.c> f87251V;

        /* renamed from: W, reason: collision with root package name */
        private i0 f87252W;

        /* renamed from: X, reason: collision with root package name */
        private Pc.a<X> f87253X;

        /* renamed from: Y, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.local.s> f87254Y;

        /* renamed from: Z, reason: collision with root package name */
        private q f87255Z;

        /* renamed from: a, reason: collision with root package name */
        private final Context f87256a;

        /* renamed from: a0, reason: collision with root package name */
        private Pc.a<H> f87257a0;

        /* renamed from: b, reason: collision with root package name */
        private final We.E f87258b;

        /* renamed from: b0, reason: collision with root package name */
        private Pa0.b f87259b0;

        /* renamed from: c, reason: collision with root package name */
        private final d.f f87260c;

        /* renamed from: c0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.data.o f87261c0;

        /* renamed from: d, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.core.initialization.a f87262d;

        /* renamed from: d0, reason: collision with root package name */
        private Bi0.b f87263d0;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6369b f87264e;

        /* renamed from: e0, reason: collision with root package name */
        private ru.ozon.android.messenger.blocks.input.attachments.data.f f87265e0;

        /* renamed from: f, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.analytics.i f87266f;

        /* renamed from: f0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.di.viewmodels.b f87267f0;

        /* renamed from: g, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.core.initialization.d f87268g;

        /* renamed from: g0, reason: collision with root package name */
        private P60.t f87269g0;

        /* renamed from: h, reason: collision with root package name */
        private final d.b f87270h;

        /* renamed from: h0, reason: collision with root package name */
        private ru.ozon.android.messenger.blocks.input.attachments.data.k f87271h0;

        /* renamed from: i, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.logger.b f87272i;

        /* renamed from: i0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.composer.network.serialization.b f87273i0;

        /* renamed from: j0, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.local.database.draft.s> f87275j0;

        /* renamed from: k, reason: collision with root package name */
        private Jb.f f87276k;

        /* renamed from: k0, reason: collision with root package name */
        private L30.m f87277k0;

        /* renamed from: l, reason: collision with root package name */
        private Jb.f f87278l;

        /* renamed from: l0, reason: collision with root package name */
        private Pc.a<S> f87279l0;

        /* renamed from: m, reason: collision with root package name */
        private Pc.a<Moshi> f87280m;

        /* renamed from: m0, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.data.repository.I> f87281m0;

        /* renamed from: n0, reason: collision with root package name */
        private Pa0.l f87283n0;

        /* renamed from: o0, reason: collision with root package name */
        private Pc.a<r> f87285o0;

        /* renamed from: p, reason: collision with root package name */
        private Jb.f f87286p;

        /* renamed from: p0, reason: collision with root package name */
        private C f87287p0;

        /* renamed from: q, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.data.remote.serialize.d f87288q;

        /* renamed from: q0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.domain.mappers.b f87289q0;

        /* renamed from: r, reason: collision with root package name */
        private Jb.f f87290r;

        /* renamed from: r0, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.blocks.alert.a> f87291r0;

        /* renamed from: s, reason: collision with root package name */
        private Jb.f f87292s;

        /* renamed from: s0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.data.remote.action.z f87293s0;

        /* renamed from: t, reason: collision with root package name */
        private Ia0.b f87294t;

        /* renamed from: t0, reason: collision with root package name */
        private G f87295t0;

        /* renamed from: u0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.presentation.common.notification.e f87297u0;

        /* renamed from: v, reason: collision with root package name */
        private Jb.f f87298v;

        /* renamed from: v0, reason: collision with root package name */
        private Jb.f f87299v0;

        /* renamed from: w, reason: collision with root package name */
        private Jb.f f87300w;

        /* renamed from: w0, reason: collision with root package name */
        private C9498j f87301w0;

        /* renamed from: x, reason: collision with root package name */
        private Jb.f f87302x;

        /* renamed from: x0, reason: collision with root package name */
        private C9408z f87303x0;

        /* renamed from: y, reason: collision with root package name */
        private q f87304y;

        /* renamed from: y0, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.composer.di.module.b f87305y0;

        /* renamed from: z, reason: collision with root package name */
        private ru.ozon.android.messenger.framework.composer.navigation.router.b f87306z;

        /* renamed from: z0, reason: collision with root package name */
        private C9395l f87307z0;

        /* renamed from: j, reason: collision with root package name */
        private final f f87274j = this;

        /* renamed from: n, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.composer.navigation.router.c> f87282n = Jb.d.b(ru.ozon.android.messenger.framework.composer.navigation.router.f.a());

        /* renamed from: o, reason: collision with root package name */
        private Pc.a<ru.ozon.android.messenger.framework.navigation.controller.b> f87284o = Jb.d.b(ru.ozon.android.messenger.framework.navigation.controller.c.a());

        /* renamed from: u, reason: collision with root package name */
        private Jb.c f87296u = new Jb.c();

        f(ru.ozon.android.messenger.framework.network.di.a aVar, Context context, d.f fVar, We.E e11, ru.ozon.android.messenger.framework.core.initialization.d dVar, ru.ozon.android.messenger.framework.core.c cVar, ru.ozon.android.messenger.framework.logger.b bVar, d.e eVar, Set set, d.g gVar, ru.ozon.android.messenger.framework.analytics.i iVar, ru.ozon.android.messenger.framework.navigation.action.f fVar2, d.b bVar2, ru.ozon.android.messenger.framework.core.initialization.a aVar2, InterfaceC6369b interfaceC6369b) {
            this.f87256a = context;
            this.f87258b = e11;
            this.f87260c = fVar;
            this.f87262d = aVar2;
            this.f87264e = interfaceC6369b;
            this.f87266f = iVar;
            this.f87268g = dVar;
            this.f87270h = bVar2;
            this.f87272i = bVar;
            this.f87276k = Jb.f.a(eVar);
            this.f87278l = Jb.f.a(dVar);
            this.f87280m = Jb.d.b(new ru.ozon.android.messenger.framework.data.n(this.f87276k, ru.ozon.android.messenger.framework.data.remote.parser.b.a(), ru.ozon.android.messenger.framework.data.remote.parser.a.a(), this.f87278l, ru.ozon.android.messenger.framework.logger.e.a()));
            this.f87286p = Jb.f.a(set);
            this.f87288q = new ru.ozon.android.messenger.framework.data.remote.serialize.d(this.f87280m);
            this.f87290r = Jb.f.a(context);
            this.f87292s = Jb.f.a(bVar2);
            this.f87294t = new Ia0.b(this.f87290r, 2);
            this.f87298v = Jb.f.a(cVar);
            this.f87300w = Jb.f.a(e11);
            this.f87302x = Jb.f.b(bVar);
            this.f87304y = new q(aVar, this.f87290r, 1);
            l.a a11 = Jb.l.a(4);
            a11.a(ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.e.a());
            a11.a(ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.c.a());
            a11.a(ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.g.a());
            a11.a(ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.i.a());
            ru.ozon.android.messenger.framework.composer.navigation.router.b bVar3 = new ru.ozon.android.messenger.framework.composer.navigation.router.b(this.f87282n, a11.b(), 0);
            this.f87306z = bVar3;
            Pc.a<ru.ozon.android.messenger.framework.data.b> b11 = Jb.d.b(new ru.ozon.android.messenger.framework.data.l(this.f87286p, this.f87288q, this.f87290r, this.f87284o, this.f87292s, this.f87294t, this.f87296u, this.f87298v, this.f87300w, this.f87302x, this.f87304y, bVar3));
            this.f87213A = b11;
            ru.ozon.android.messenger.blocks.emptystate.f fVar3 = new ru.ozon.android.messenger.blocks.emptystate.f(this.f87290r, b11, this.f87292s);
            this.f87215B = fVar3;
            this.f87217C = new ru.ozon.android.messenger.framework.data.remote.mapper.f(b11, fVar3);
            Pc.a<ru.ozon.android.messenger.framework.data.m> b12 = Jb.d.b(new ru.ozon.android.messenger.framework.data.i(this.f87278l, ru.ozon.android.messenger.framework.logger.e.a()));
            this.f87219D = b12;
            Jb.c.a(this.f87296u, m.a(new ru.ozon.android.messenger.framework.data.remote.mapper.b(this.f87213A, this.f87217C, this.f87302x, b12)));
            this.f87221E = m.a(new ru.ozon.android.messenger.framework.data.remote.mapper.h(this.f87296u, new ru.ozon.android.messenger.blocks.cell.b(this.f87290r, this.f87213A)));
            this.f87223F = m.a(new k30.c(this.f87306z, 1));
            this.f87225G = new ru.ozon.android.messenger.framework.presentation.common.view.recycler.h(this.f87290r, this.f87213A);
            Jb.f b13 = Jb.f.b(iVar);
            this.f87227H = b13;
            ru.ozon.android.messenger.framework.presentation.common.notification.h hVar = new ru.ozon.android.messenger.framework.presentation.common.notification.h(this.f87290r);
            this.f87229I = hVar;
            this.f87231J = ru.ozon.android.messenger.framework.presentation.chatdetail.v.b(new ru.ozon.android.messenger.framework.presentation.chatdetail.u(this.f87213A, this.f87223F, this.f87225G, b13, hVar, ru.ozon.android.messenger.framework.presentation.common.notification.k.a()));
            this.f87233K = m.a(new ru.ozon.android.messenger.framework.data.remote.mapper.d(this.f87296u));
            this.f87235L = new ru.ozon.android.messenger.framework.composer.network.serialization.b(this.f87280m, 0);
            ru.ozon.android.messenger.framework.data.remote.serialize.d dVar2 = this.f87288q;
            this.f87237M = new X60.d(dVar2, new f30.g(dVar2, 2), 1);
            Jb.f a12 = Jb.f.a(fVar);
            this.f87239N = a12;
            this.f87241O = new ru.ozon.android.messenger.framework.data.local.t(this.f87290r, 1);
            this.f87243P = new V(this.f87300w, a12, ru.ozon.android.messenger.framework.data.remote.websocket.K.a(), this.f87241O, ru.ozon.android.messenger.framework.di.z.a());
            this.f87245Q = Jb.d.b(new ru.ozon.android.messenger.framework.data.remote.websocket.I(this.f87221E, this.f87235L, this.f87237M, y.a(), this.f87304y, ru.ozon.android.messenger.framework.di.z.a(), this.f87243P, this.f87239N));
            this.f87247R = Jb.d.b(new ru.ozon.android.messenger.framework.data.e(this.f87239N));
            this.f87248S = Jb.d.b(new ru.ozon.android.messenger.framework.data.g(this.f87239N));
            Pc.a<MessengerDB> b14 = Jb.d.b(new ru.ozon.android.messenger.framework.data.h(this.f87239N));
            this.f87249T = b14;
            this.f87250U = new f50.q(b14, 1);
            this.f87251V = Jb.d.b(new ru.ozon.android.messenger.framework.data.k(this.f87213A, ru.ozon.android.messenger.blocks.messageimage.b.a(), ru.ozon.android.messenger.blocks.messagefile.b.a(), this.f87296u));
            this.f87252W = new i0(this.f87250U, this.f87251V, ru.ozon.android.messenger.framework.di.z.a());
            this.f87253X = Jb.d.b(new ru.ozon.android.messenger.framework.data.j(this.f87251V, this.f87221E, 0));
            this.f87254Y = Jb.d.b(new ru.ozon.android.messenger.framework.data.local.t(this.f87296u, 0));
            this.f87255Z = new q(this.f87290r);
            this.f87257a0 = Jb.d.b(new ru.ozon.android.messenger.framework.data.f(this.f87290r, this.f87251V, this.f87213A));
            this.f87259b0 = new Pa0.b(this.f87280m, 1);
            this.f87261c0 = new ru.ozon.android.messenger.framework.data.o(this.f87300w, this.f87259b0, this.f87239N);
            this.f87263d0 = new Bi0.b(this.f87261c0, 2);
            this.f87265e0 = new ru.ozon.android.messenger.blocks.input.attachments.data.f(this.f87263d0, this.f87290r, this.f87219D);
            this.f87267f0 = new ru.ozon.android.messenger.framework.di.viewmodels.b(this.f87290r, 1);
            this.f87269g0 = new P60.t(this.f87290r, 2);
            this.f87271h0 = new ru.ozon.android.messenger.blocks.input.attachments.data.k(this.f87265e0, this.f87267f0, this.f87269g0);
            this.f87273i0 = new ru.ozon.android.messenger.framework.composer.network.serialization.b(this.f87249T, 1);
            Pc.a<ru.ozon.android.messenger.framework.data.local.database.draft.s> b15 = Jb.d.b(this.f87273i0);
            this.f87275j0 = b15;
            this.f87277k0 = new L30.m(b15, ru.ozon.android.messenger.framework.data.local.mapper.b.a(), ru.ozon.android.messenger.framework.di.z.a());
            this.f87279l0 = Jb.d.b(this.f87277k0);
            this.f87281m0 = Jb.d.b(new Q(this.f87221E, this.f87233K, this.f87245Q, this.f87247R, this.f87248S, this.f87252W, this.f87253X, this.f87251V, this.f87254Y, y.a(), ru.ozon.android.messenger.framework.di.z.a(), this.f87255Z, this.f87257a0, this.f87271h0, this.f87279l0));
            this.f87283n0 = new Pa0.l(this.f87279l0, 1);
            this.f87285o0 = m.a(new C9401s(this.f87281m0));
            this.f87287p0 = new C(this.f87213A, 0);
            this.f87289q0 = new ru.ozon.android.messenger.framework.domain.mappers.b(this.f87213A);
            this.f87291r0 = m.a(new ru.ozon.android.messenger.blocks.alert.b(this.f87290r, this.f87213A));
            this.f87293s0 = new ru.ozon.android.messenger.framework.data.remote.action.z(new P80.c(this.f87261c0, 3), this.f87263d0, this.f87219D, this.f87239N);
            this.f87295t0 = new G(this.f87221E, this.f87293s0, y.a(), ru.ozon.android.messenger.framework.di.z.a());
            this.f87297u0 = new ru.ozon.android.messenger.framework.presentation.common.notification.e(this.f87281m0, this.f87215B);
            this.f87299v0 = ru.ozon.android.messenger.framework.presentation.common.notification.f.b(this.f87297u0);
            this.f87301w0 = new C9498j(this.f87287p0, this.f87257a0);
            this.f87303x0 = new C9408z(this.f87227H, this.f87281m0);
            this.f87305y0 = new ru.ozon.android.messenger.framework.composer.di.module.b(this.f87281m0, this.f87303x0);
            this.f87307z0 = new C9395l(this.f87281m0, this.f87305y0, this.f87287p0);
            Pc.a<C9396m> a13 = m.a(new L30.e(this.f87281m0, 1));
            this.f87214A0 = a13;
            this.f87216B0 = new ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.r(this.f87307z0, a13, this.f87215B, this.f87291r0, this.f87281m0, this.f87227H);
            this.f87218C0 = new T(this.f87284o, this.f87281m0, this.f87283n0, this.f87285o0, this.f87287p0, ru.ozon.android.messenger.framework.presentation.chatlist.e.a(), this.f87289q0, this.f87227H, this.f87291r0, this.f87295t0, this.f87299v0, this.f87229I, this.f87298v, this.f87296u, this.f87288q, this.f87301w0, this.f87216B0);
            this.f87220D0 = ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.V.a(this.f87218C0);
            this.f87222E0 = new ru.ozon.android.messenger.framework.presentation.chatlist.t(this.f87213A, this.f87225G, this.f87302x, this.f87227H);
            this.f87224F0 = ru.ozon.android.messenger.framework.presentation.chatlist.u.b(this.f87222E0);
            this.f87226G0 = Jb.f.a(new ru.ozon.android.messenger.blocks.input.di.b());
            this.f87228H0 = Jb.d.b(new ru.ozon.android.messenger.framework.data.k(this.f87281m0, y.a(), ru.ozon.android.messenger.framework.di.A.a()));
            this.f87230I0 = Jb.f.a(gVar);
            this.f87232J0 = Jb.f.a(fVar2);
            this.f87234K0 = new ru.ozon.android.messenger.framework.presentation.messenger.u(this.f87303x0, this.f87281m0, this.f87285o0, this.f87228H0, this.f87230I0, this.f87227H, this.f87284o, this.f87232J0, ru.ozon.android.messenger.framework.di.z.a());
            this.f87236L0 = ru.ozon.android.messenger.framework.presentation.messenger.k.b(this.f87234K0);
            this.f87238M0 = new ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.i(this.f87295t0, this.f87284o, this.f87281m0);
            i.a b16 = Jb.i.b(1);
            b16.b(ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.h.class, this.f87238M0);
            this.f87240N0 = m.a(new ru.ozon.android.messenger.framework.di.viewmodels.b(b16.a(), 0));
            this.f87242O0 = new ru.ozon.android.messenger.blocks.emptystate.d(this.f87290r, this.f87213A, this.f87292s);
            this.f87244P0 = new I(this.f87284o, this.f87281m0, this.f87287p0, this.f87242O0, this.f87229I, this.f87299v0, this.f87227H, M.a());
            this.f87246Q0 = ru.ozon.android.messenger.framework.presentation.search.H.b(this.f87244P0);
        }

        static i.a i0(f fVar) {
            return new i.a(fVar.f87256a);
        }

        static ru.ozon.android.messenger.framework.composer.navigation.router.a j0(f fVar) {
            return new ru.ozon.android.messenger.framework.composer.navigation.router.a(fVar.f87282n.get(), fVar.provideDeeplinkHandlers());
        }

        static ru.ozon.android.messenger.blocks.input.viewmodel.e k0(f fVar) {
            return new ru.ozon.android.messenger.blocks.input.viewmodel.e(fVar.f87279l0.get());
        }

        static ru.ozon.android.messenger.blocks.input.viewmodel.f l0(f fVar) {
            return new ru.ozon.android.messenger.blocks.input.viewmodel.f(fVar.f87279l0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C9351a m0() {
            ru.ozon.android.messenger.framework.data.remote.mapper.g gVar = this.f87221E.get();
            Moshi moshi = this.f87280m.get();
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            MoshiConverterFactory create = MoshiConverterFactory.create(moshi);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            Jb.j.d(create);
            We.E e11 = this.f87258b;
            d.f fVar = this.f87260c;
            Retrofit retrofit = ru.ozon.android.messenger.framework.data.o.a(e11, create, fVar);
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create2 = retrofit.create(ActionApi.class);
            Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
            ActionApi actionApi = (ActionApi) create2;
            Jb.j.d(actionApi);
            Moshi moshi2 = this.f87280m.get();
            Intrinsics.checkNotNullParameter(moshi2, "moshi");
            MoshiConverterFactory create3 = MoshiConverterFactory.create(moshi2);
            Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
            Jb.j.d(create3);
            Retrofit retrofit3 = ru.ozon.android.messenger.framework.data.o.a(e11, create3, fVar);
            Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
            Object create4 = retrofit3.create(FileApi.class);
            Intrinsics.checkNotNullExpressionValue(create4, "create(...)");
            FileApi fileApi = (FileApi) create4;
            Jb.j.d(fileApi);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = new ru.ozon.android.messenger.framework.data.remote.action.y(actionApi, fileApi, this.f87219D.get(), fVar);
            C2862e a11 = N.a(CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b()));
            He.b bVar = He.b.f10879b;
            Jb.j.d(bVar);
            return new C9351a(gVar, yVar, a11, bVar);
        }

        private U n0() {
            U u11 = new U();
            u11.f90613a = (U.a) this.f87220D0.get();
            return u11;
        }

        @Override // ru.ozon.android.messenger.framework.di.F
        public final ru.ozon.android.messenger.framework.navigation.controller.a A() {
            return this.f87284o.get();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void B(ru.ozon.android.messenger.blocks.showTextButton.c cVar) {
            cVar.f86388e = m0();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.dependencies.a
        public final ru.ozon.android.messenger.framework.composer.navigation.router.c C() {
            return this.f87282n.get();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void D(ru.ozon.android.messenger.framework.presentation.messenger.j jVar) {
            jVar.f91364c = (j.a) this.f87236L0.get();
        }

        @Override // ru.ozon.android.messenger.framework.di.C
        public final C9351a E() {
            return m0();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void G(ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.a aVar) {
            aVar.f86150a = this.f87284o.get();
            aVar.f86151b = n0();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void H(ru.ozon.android.messenger.framework.presentation.common.screen.j jVar) {
            jVar.f91128a = this.f87284o.get();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void I(ru.ozon.android.messenger.framework.presentation.messenger.c cVar) {
            cVar.f91315c = this.f87268g;
            cVar.f91316d = this.f87284o.get();
            new g.a(this.f87256a);
            cVar.f91317e = this.f87282n.get();
            cVar.f91318f = this.f87213A.get();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void J(ru.ozon.android.messenger.blocks.curtain.a aVar) {
            aVar.f84967a = this.f87284o.get();
        }

        @Override // ru.ozon.android.messenger.framework.composer.network.di.b
        public final We.E a() {
            return this.f87258b;
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void b(ru.ozon.android.messenger.framework.presentation.chatdetail.d dVar) {
            dVar.f89731d = this.f87268g;
            dVar.f89732e = (k.b) this.f87231J.get();
            dVar.f89733f = this.f87213A.get();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void c(C9516a c9516a) {
            c9516a.f91604c = this.f87213A.get();
            c9516a.f91605d = this.f87284o.get();
            c9516a.f91606e = (G.a) this.f87246Q0.get();
            c9516a.f91607f = this.f87223F.get();
            c9516a.f91608g = this.f87268g;
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void d(ru.ozon.android.messenger.framework.presentation.chatlist.popup.c cVar) {
            cVar.f90517a = this.f87302x;
            cVar.f90518b = n0();
            cVar.f90519c = this.f87268g;
        }

        @Override // ru.ozon.android.messenger.framework.composer.network.di.b
        public final Moshi e() {
            return this.f87280m.get();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void f(ru.ozon.android.messenger.framework.presentation.chatdetail.report.a aVar) {
            aVar.f89936a = this.f87284o.get();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void g(ru.ozon.android.messenger.blocks.messagetext.b bVar) {
            bVar.f85810a = n0();
        }

        @Override // ru.ozon.android.messenger.framework.di.x
        public final Context h() {
            return this.f87256a;
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void i(ru.ozon.android.messenger.blocks.messageimage.presentation.a aVar) {
            aVar.f85752c = this.f87268g;
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final l.a j() {
            return new c(this.f87274j);
        }

        @Override // ru.ozon.android.messenger.framework.composer.network.di.b
        public final ru.ozon.android.messenger.framework.composer.network.serialization.a k() {
            return new ru.ozon.android.messenger.framework.composer.network.serialization.a(this.f87280m.get());
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void l(ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.a aVar) {
            aVar.f86178g = this.f87240N0.get();
            aVar.f86179h = new g.a(this.f87256a);
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final InterfaceC9376a.InterfaceC1633a m() {
            return new C1561a(this.f87274j);
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.dependencies.a
        public final ru.ozon.android.messenger.framework.core.initialization.a n() {
            return this.f87262d;
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.dependencies.a
        public final ru.ozon.android.messenger.framework.analytics.i o() {
            return this.f87266f;
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.dependencies.a
        public final Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a> provideDeeplinkHandlers() {
            Jb.k d11 = Jb.k.d(4);
            d11.a(new ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.d());
            d11.a(new ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.b());
            d11.a(new ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.f());
            d11.a(new ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.h());
            return d11.c();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void q(ru.ozon.android.messenger.blocks.input.di.c cVar) {
            Pc.a<S> aVar = this.f87279l0;
            Pc.a<ru.ozon.android.messenger.framework.navigation.controller.b> aVar2 = this.f87284o;
            cVar.f85526b = (ru.ozon.android.messenger.blocks.input.di.a) this.f87226G0.get();
            cVar.f85527c = aVar2.get();
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            Jb.j.d(bVar);
            Context context = this.f87256a;
            Intrinsics.checkNotNullParameter(context, "context");
            ru.ozon.android.messenger.utils.file.d dVar = new ru.ozon.android.messenger.utils.file.d(context);
            Moshi moshi = this.f87280m.get();
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            MoshiConverterFactory create = MoshiConverterFactory.create(moshi);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            Jb.j.d(create);
            We.E e11 = this.f87258b;
            d.f fVar = this.f87260c;
            Retrofit retrofit = ru.ozon.android.messenger.framework.data.o.a(e11, create, fVar);
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create2 = retrofit.create(FileApi.class);
            Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
            FileApi fileApi = (FileApi) create2;
            Jb.j.d(fileApi);
            ru.ozon.android.messenger.blocks.input.attachments.data.e eVar = new ru.ozon.android.messenger.blocks.input.attachments.data.e(fileApi, context, this.f87219D.get());
            ru.ozon.android.messenger.utils.image.b bVar2 = new ru.ozon.android.messenger.utils.image.b(context);
            Intrinsics.checkNotNullParameter(context, "context");
            cVar.f85528d = new ru.ozon.android.messenger.blocks.input.attachments.manager.d(this.f87256a, bVar, dVar, new ru.ozon.android.messenger.blocks.input.attachments.data.j(eVar, bVar2, new ru.ozon.android.messenger.utils.file.d(context)), new ru.ozon.android.messenger.blocks.input.viewmodel.f(aVar.get()), this.f87260c);
            cVar.f85529e = new ru.ozon.android.messenger.blocks.input.pickerlauncher.b(aVar2.get(), this.f87223F.get(), fVar);
            cVar.f85530f = new ru.ozon.android.messenger.blocks.input.messagesender.b(aVar2.get(), new B.a());
            cVar.f85531g = new ru.ozon.android.messenger.blocks.input.viewmodel.e(aVar.get());
            cVar.f85532h = new ru.ozon.android.messenger.blocks.input.viewmodel.f(aVar.get());
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void r(ru.ozon.android.messenger.blocks.disclaimer.modal.c cVar) {
            cVar.f85061a = this.f87284o.get();
            cVar.f85062b = n0();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.dependencies.a
        public final InterfaceC6369b s() {
            return this.f87264e;
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void t(ru.ozon.android.messenger.framework.presentation.common.screen.compose.a aVar) {
            ru.ozon.android.messenger.framework.presentation.common.screen.compose.c.a(aVar, this.f87284o.get());
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void u(C9488a c9488a) {
            c9488a.f90417c = this.f87268g;
            c9488a.f90418d = n0();
            c9488a.f90419e = (k.a) this.f87224F0.get();
            c9488a.f90420f = this.f87213A.get();
            c9488a.f90421g = this.f87223F.get();
        }

        @Override // ru.ozon.android.messenger.framework.composer.di.dependencies.a
        public final ru.ozon.android.messenger.framework.composer.network.serialization.a v() {
            return new ru.ozon.android.messenger.framework.composer.network.serialization.a(this.f87280m.get());
        }

        @Override // ru.ozon.android.messenger.framework.composer.network.di.b
        public final ru.ozon.android.messenger.framework.data.remote.serialize.c w() {
            return new ru.ozon.android.messenger.framework.data.remote.serialize.c(this.f87280m.get());
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final ru.ozon.android.messenger.framework.core.initialization.d x() {
            return this.f87268g;
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void y(ru.ozon.android.messenger.framework.presentation.chatdetail.coupon.a aVar) {
            aVar.f89726a = this.f87284o.get();
        }

        @Override // ru.ozon.android.messenger.framework.core.initialization.di.c
        public final void z(C9413c c9413c) {
            c9413c.f89419c = this.f87213A.get();
            c9413c.f89420d = this.f87284o.get();
            this.f87223F.get();
            c9413c.f89421e = this.f87268g;
            c9413c.f89422f = new g.a(this.f87256a);
            c9413c.f89423g = new j.a();
        }
    }

    public static c.a a() {
        return new e();
    }
}
