package ru.ozon.android.messenger.framework.presentation.search;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import android.os.SystemClock;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatGroups.grouplist.j;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.notification.d;
import ru.ozon.android.messenger.framework.presentation.search.InterfaceC9524d;
import ru.ozon.android.messenger.framework.presentation.search.InterfaceC9526f;
import ru.ozon.android.messenger.framework.presentation.search.J;
import ru.ozon.android.messenger.framework.presentation.search.N;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10727i;
import xe.Y;
import ze.C11115c;
import ze.EnumC11113a;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9527g extends w0 {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final Function2<C9525e, InterfaceC9524d, C9525e> f91727A;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.b f91728a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f91729b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.B f91730c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.c f91731d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.notification.g f91732e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final d.a f91733f;

    /* renamed from: g, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f91734g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<C9525e> f91735h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final M0<C9525e> f91736i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C11115c f91737j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<InterfaceC9526f> f91738k;

    /* renamed from: l, reason: collision with root package name */
    private L f91739l;

    /* renamed from: m, reason: collision with root package name */
    private final f.c f91740m;

    /* renamed from: n, reason: collision with root package name */
    private final long f91741n;

    /* renamed from: o, reason: collision with root package name */
    private final int f91742o;

    /* renamed from: p, reason: collision with root package name */
    private B0 f91743p;

    /* renamed from: q, reason: collision with root package name */
    private B0 f91744q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f91745r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f91746s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f91747t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final Object f91748u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final x0<String> f91749v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final C0 f91750w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final x0<String> f91751x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final Je.d f91752y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final HashMap<String, MessengerTrackingInfo> f91753z;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.g$a */
    static final class a extends AbstractC7737t implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C9527g.this.f91745r);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.g$b */
    static final class b extends AbstractC7737t implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C9527g.this.f91746s);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.g$c */
    static final class c extends AbstractC7737t implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C9527g c9527g = C9527g.this;
            C10727i.c(androidx.lifecycle.x0.a(c9527g), null, null, new C9528h(c9527g, null), 3);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$animateEnter$1", f = "ChatSearchViewModel.kt", l = {230}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.g$d */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f91757d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9527g.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f91757d;
            C9527g c9527g = C9527g.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                ArrayList e02 = C9527g.e0(c9527g, c9527g.P0().c());
                ArrayList arrayList = new ArrayList(C7714v.z(e02, 10));
                Iterator it = e02.iterator();
                while (it.hasNext()) {
                    ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) it.next();
                    List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = qVar.b();
                    ArrayList arrayList2 = new ArrayList(C7714v.z(b11, 10));
                    for (ru.ozon.android.messenger.framework.presentation.models.u uVar : b11) {
                        ru.ozon.android.messenger.framework.presentation.models.g c11 = uVar.c();
                        if (c11 instanceof ru.ozon.android.messenger.blocks.chatlistheader.f) {
                            ru.ozon.android.messenger.blocks.chatlistheader.f fVar = (ru.ozon.android.messenger.blocks.chatlistheader.f) c11;
                            f.c d11 = fVar.d();
                            if (d11 instanceof f.c.a) {
                                d11 = f.c.a.a((f.c.a) d11, null, 1791);
                            }
                            uVar = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar, ru.ozon.android.messenger.blocks.chatlistheader.f.a(fVar, kotlin.collections.K.f71697a, d11, 1));
                        }
                        arrayList2.add(uVar);
                    }
                    arrayList.add(ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, arrayList2, null, 2));
                }
                this.f91757d = 1;
                if (C9527g.F0(c9527g, arrayList, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            c9527g.f91747t = true;
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.g$e */
    static final class e extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.presentation.common.notification.d> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.presentation.common.notification.d invoke() {
            return C9527g.this.f91733f.a(ru.ozon.android.messenger.blocks.emptystate.j.CHAT_LIST);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.g$f */
    static final class f extends AbstractC7737t implements Function2<C9525e, InterfaceC9524d, C9525e> {
        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final C9525e invoke(C9525e c9525e, InterfaceC9524d interfaceC9524d) {
            C9525e state = c9525e;
            InterfaceC9524d mutation = interfaceC9524d;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(mutation, "mutation");
            if (mutation instanceof InterfaceC9524d.c) {
                return C9525e.a(state, null, ((InterfaceC9524d.c) mutation).a(), null, null, 13);
            }
            if (mutation instanceof InterfaceC9524d.e) {
                ArrayList p02 = C7714v.p0(((InterfaceC9524d.e) mutation).a(), state.d());
                ArrayList arrayList = new ArrayList();
                Iterator it = p02.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!(((J) next) instanceof J.b)) {
                        arrayList.add(next);
                    }
                }
                return C9525e.a(state, null, null, arrayList, null, 11);
            }
            if (mutation instanceof InterfaceC9524d.C1716d) {
                return C9525e.a(state, null, null, null, ((InterfaceC9524d.C1716d) mutation).a(), 7);
            }
            if (!(mutation instanceof InterfaceC9524d.f)) {
                if (mutation instanceof InterfaceC9524d.a) {
                    return C9525e.a(state, null, null, kotlin.collections.K.f71697a, null, 3);
                }
                if (mutation instanceof InterfaceC9524d.b) {
                    return C9525e.a(state, null, null, ((InterfaceC9524d.b) mutation).a(), null, 11);
                }
                throw new Sc.o();
            }
            List<ru.ozon.android.messenger.framework.presentation.models.q> c11 = state.c();
            InterfaceC9524d.f fVar = (InterfaceC9524d.f) mutation;
            String a11 = fVar.a();
            C9527g.this.getClass();
            List<ru.ozon.android.messenger.framework.presentation.models.q> list = c11;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            for (ru.ozon.android.messenger.framework.presentation.models.q qVar : list) {
                List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = qVar.b();
                ArrayList arrayList3 = new ArrayList(C7714v.z(b11, 10));
                for (ru.ozon.android.messenger.framework.presentation.models.u uVar : b11) {
                    ru.ozon.android.messenger.framework.presentation.models.g c12 = uVar.c();
                    if (c12 instanceof ru.ozon.android.messenger.blocks.chatlistheader.f) {
                        ru.ozon.android.messenger.blocks.chatlistheader.f fVar2 = (ru.ozon.android.messenger.blocks.chatlistheader.f) c12;
                        f.c d11 = fVar2.d();
                        if (d11 instanceof f.c.a) {
                            f.c.a aVar = (f.c.a) d11;
                            d11 = f.c.a.a(aVar, TextDTO.copy$default(aVar.j(), new OzonSpannableString(a11), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), 2043);
                        }
                        uVar = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar, ru.ozon.android.messenger.blocks.chatlistheader.f.a(fVar2, null, d11, 7));
                    }
                    arrayList3.add(uVar);
                }
                arrayList2.add(ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, arrayList3, null, 2));
            }
            return C9525e.a(state, fVar.a(), arrayList2, null, null, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9527g(@NotNull ru.ozon.android.messenger.framework.navigation.controller.b controller, @NotNull C5418g0 savedStateHandle, @NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository, @NotNull ru.ozon.android.messenger.framework.domain.usecases.B mapBlockUpdateUseCase, @NotNull ru.ozon.android.messenger.blocks.emptystate.c emptyScreenStateBlockFactory, @NotNull ru.ozon.android.messenger.framework.presentation.common.notification.g noInternetNotificationPresenter, @NotNull d.a noInternetNotificationOrEmptyScreenConditionFactory, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull Ti.c searchPaginationControllerFactory) {
        f.c cVar;
        long j11;
        int i11;
        B0 b02;
        Object obj;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(mapBlockUpdateUseCase, "mapBlockUpdateUseCase");
        Intrinsics.checkNotNullParameter(emptyScreenStateBlockFactory, "emptyScreenStateBlockFactory");
        Intrinsics.checkNotNullParameter(noInternetNotificationPresenter, "noInternetNotificationPresenter");
        Intrinsics.checkNotNullParameter(noInternetNotificationOrEmptyScreenConditionFactory, "noInternetNotificationOrEmptyScreenConditionFactory");
        Intrinsics.checkNotNullParameter(searchPaginationControllerFactory, "searchPaginationControllerFactory");
        this.f91728a = controller;
        this.f91729b = chatRepository;
        this.f91730c = mapBlockUpdateUseCase;
        this.f91731d = emptyScreenStateBlockFactory;
        this.f91732e = noInternetNotificationPresenter;
        this.f91733f = noInternetNotificationOrEmptyScreenConditionFactory;
        this.f91734g = iVar;
        ru.ozon.android.messenger.framework.navigation.args.a aVar = (ru.ozon.android.messenger.framework.navigation.args.a) savedStateHandle.c("CHAT_SEARCH_ARGS");
        List<ru.ozon.android.messenger.framework.presentation.models.q> a11 = aVar != null ? aVar.a() : null;
        x0<C9525e> a12 = O0.a(new C9525e(a11 == null ? kotlin.collections.K.f71697a : a11, 13));
        this.f91735h = a12;
        this.f91736i = C2399j.b(a12);
        C11115c a13 = ze.k.a(-1, 6, null);
        this.f91737j = a13;
        this.f91738k = C2399j.H(a13);
        ru.ozon.android.messenger.framework.navigation.args.a aVar2 = (ru.ozon.android.messenger.framework.navigation.args.a) savedStateHandle.c("CHAT_SEARCH_ARGS");
        if (aVar2 != null) {
            Iterator<T> it = aVar2.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(((ru.ozon.android.messenger.framework.presentation.models.q) obj).b());
                if ((uVar != null ? uVar.c() : null) instanceof ru.ozon.android.messenger.blocks.chatlistheader.f) {
                    break;
                }
            }
            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
            if (qVar != null) {
                ru.ozon.android.messenger.framework.presentation.models.g c11 = ((ru.ozon.android.messenger.framework.presentation.models.u) C7714v.K(qVar.b())).c();
                ru.ozon.android.messenger.blocks.chatlistheader.f fVar = c11 instanceof ru.ozon.android.messenger.blocks.chatlistheader.f ? (ru.ozon.android.messenger.blocks.chatlistheader.f) c11 : null;
                if (fVar != null) {
                    cVar = fVar.d();
                    this.f91740m = cVar;
                    if (cVar != null) {
                        f.c.a aVar3 = cVar instanceof f.c.a ? (f.c.a) cVar : null;
                        Long e11 = aVar3 != null ? aVar3.e() : null;
                        if (e11 != null) {
                            j11 = e11.longValue();
                            this.f91741n = j11;
                            if (cVar != null) {
                                f.c.a aVar4 = cVar instanceof f.c.a ? (f.c.a) cVar : null;
                                Integer i12 = aVar4 != null ? aVar4.i() : null;
                                if (i12 != null) {
                                    i11 = i12.intValue();
                                    this.f91742o = i11;
                                    this.f91748u = ru.ozon.android.messenger.utils.f.b(new e());
                                    this.f91749v = O0.a("");
                                    this.f91750w = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
                                    this.f91751x = O0.a(N0());
                                    this.f91752y = Je.e.a();
                                    this.f91753z = new HashMap<>();
                                    this.f91727A = new f();
                                    this.f91743p = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new x(this, null), 3);
                                    b02 = this.f91744q;
                                    if (b02 != null || !((AbstractC10711a) b02).isActive()) {
                                        this.f91744q = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new w(this, null), 3);
                                    }
                                    C10727i.c(androidx.lifecycle.x0.a(this), null, null, new y(this, null), 3);
                                    a getHasItemsAfter = new a();
                                    b getIsLoading = new b();
                                    c onLoadMore = new c();
                                    searchPaginationControllerFactory.getClass();
                                    Intrinsics.checkNotNullParameter(getHasItemsAfter, "getHasItemsAfter");
                                    Intrinsics.checkNotNullParameter(getIsLoading, "getIsLoading");
                                    Intrinsics.checkNotNullParameter(onLoadMore, "onLoadMore");
                                    this.f91739l = new L(getHasItemsAfter, getIsLoading, onLoadMore);
                                }
                            }
                            i11 = 3;
                            this.f91742o = i11;
                            this.f91748u = ru.ozon.android.messenger.utils.f.b(new e());
                            this.f91749v = O0.a("");
                            this.f91750w = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
                            this.f91751x = O0.a(N0());
                            this.f91752y = Je.e.a();
                            this.f91753z = new HashMap<>();
                            this.f91727A = new f();
                            this.f91743p = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new x(this, null), 3);
                            b02 = this.f91744q;
                            if (b02 != null) {
                            }
                            this.f91744q = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new w(this, null), 3);
                            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new y(this, null), 3);
                            a getHasItemsAfter2 = new a();
                            b getIsLoading2 = new b();
                            c onLoadMore2 = new c();
                            searchPaginationControllerFactory.getClass();
                            Intrinsics.checkNotNullParameter(getHasItemsAfter2, "getHasItemsAfter");
                            Intrinsics.checkNotNullParameter(getIsLoading2, "getIsLoading");
                            Intrinsics.checkNotNullParameter(onLoadMore2, "onLoadMore");
                            this.f91739l = new L(getHasItemsAfter2, getIsLoading2, onLoadMore2);
                        }
                    }
                    j11 = 300;
                    this.f91741n = j11;
                    if (cVar != null) {
                    }
                    i11 = 3;
                    this.f91742o = i11;
                    this.f91748u = ru.ozon.android.messenger.utils.f.b(new e());
                    this.f91749v = O0.a("");
                    this.f91750w = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
                    this.f91751x = O0.a(N0());
                    this.f91752y = Je.e.a();
                    this.f91753z = new HashMap<>();
                    this.f91727A = new f();
                    this.f91743p = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new x(this, null), 3);
                    b02 = this.f91744q;
                    if (b02 != null) {
                    }
                    this.f91744q = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new w(this, null), 3);
                    C10727i.c(androidx.lifecycle.x0.a(this), null, null, new y(this, null), 3);
                    a getHasItemsAfter22 = new a();
                    b getIsLoading22 = new b();
                    c onLoadMore22 = new c();
                    searchPaginationControllerFactory.getClass();
                    Intrinsics.checkNotNullParameter(getHasItemsAfter22, "getHasItemsAfter");
                    Intrinsics.checkNotNullParameter(getIsLoading22, "getIsLoading");
                    Intrinsics.checkNotNullParameter(onLoadMore22, "onLoadMore");
                    this.f91739l = new L(getHasItemsAfter22, getIsLoading22, onLoadMore22);
                }
            }
        }
        cVar = null;
        this.f91740m = cVar;
        if (cVar != null) {
        }
        j11 = 300;
        this.f91741n = j11;
        if (cVar != null) {
        }
        i11 = 3;
        this.f91742o = i11;
        this.f91748u = ru.ozon.android.messenger.utils.f.b(new e());
        this.f91749v = O0.a("");
        this.f91750w = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this.f91751x = O0.a(N0());
        this.f91752y = Je.e.a();
        this.f91753z = new HashMap<>();
        this.f91727A = new f();
        this.f91743p = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new x(this, null), 3);
        b02 = this.f91744q;
        if (b02 != null) {
        }
        this.f91744q = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new w(this, null), 3);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new y(this, null), 3);
        a getHasItemsAfter222 = new a();
        b getIsLoading222 = new b();
        c onLoadMore222 = new c();
        searchPaginationControllerFactory.getClass();
        Intrinsics.checkNotNullParameter(getHasItemsAfter222, "getHasItemsAfter");
        Intrinsics.checkNotNullParameter(getIsLoading222, "getIsLoading");
        Intrinsics.checkNotNullParameter(onLoadMore222, "onLoadMore");
        this.f91739l = new L(getHasItemsAfter222, getIsLoading222, onLoadMore222);
    }

    public static final Object C0(C9527g c9527g, Function1 function1, kotlin.coroutines.d dVar) {
        Object J02 = c9527g.J0(new A(function1), (kotlin.coroutines.jvm.internal.c) dVar);
        return J02 == Wc.a.COROUTINE_SUSPENDED ? J02 : Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        if (r2.G0(r8, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        if (r8 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
    
        if (r10 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D0(C9527g c9527g, K k11, kotlin.coroutines.jvm.internal.c cVar) {
        B b11;
        int i11;
        boolean K11;
        C9527g c9527g2;
        String str;
        c9527g.getClass();
        if (cVar instanceof B) {
            b11 = (B) cVar;
            int i12 = b11.f91575i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                b11.f91575i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = b11.f91573g;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = b11.f91575i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    b11.f91570d = c9527g;
                    b11.f91571e = k11;
                    b11.f91575i = 1;
                    Object J02 = c9527g.J0(new A(C.f91576b), b11);
                    if (J02 != obj2) {
                        J02 = Unit.f71690a;
                    }
                } else if (i11 == 1) {
                    k11 = (K) b11.f91571e;
                    c9527g = b11.f91570d;
                    Sc.s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            Sc.s.b(obj);
                            return Unit.f71690a;
                        }
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    str = b11.f91572f;
                    k11 = (K) b11.f91571e;
                    c9527g2 = b11.f91570d;
                    Sc.s.b(obj);
                    if (Intrinsics.d(c9527g2.P0().e(), str) || !c9527g2.N0().equals(k11.b())) {
                        return Unit.f71690a;
                    }
                    List a02 = C7714v.a0(ru.ozon.android.messenger.blocks.emptystate.c.m(c9527g2.f91731d));
                    b11.f91570d = null;
                    b11.f91571e = null;
                    b11.f91572f = null;
                    b11.f91575i = 3;
                }
                String a11 = k11.a();
                K11 = kotlin.text.h.K(a11);
                InterfaceC9524d.a aVar = InterfaceC9524d.a.f91713a;
                if (!K11) {
                    c9527g.T0(aVar);
                    return Unit.f71690a;
                }
                c9527g.T0(aVar);
                if (a11.length() < c9527g.f91742o) {
                    b11.f91570d = c9527g;
                    b11.f91571e = k11;
                    b11.f91572f = a11;
                    b11.f91575i = 2;
                    if (Y.b(5000L, b11) != obj2) {
                        c9527g2 = c9527g;
                        str = a11;
                        if (Intrinsics.d(c9527g2.P0().e(), str)) {
                        }
                        return Unit.f71690a;
                    }
                } else {
                    D d11 = new D(c9527g, null);
                    E e11 = new E(c9527g, a11, null);
                    b11.f91570d = null;
                    b11.f91571e = null;
                    b11.f91575i = 4;
                    Object d12 = xe.N.d(new v(c9527g, d11, e11, null), b11);
                    if (d12 != obj2) {
                        d12 = Unit.f71690a;
                    }
                }
                return obj2;
            }
        }
        b11 = new B(c9527g, cVar);
        Object obj3 = b11.f91573g;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = b11.f91575i;
        if (i11 != 0) {
        }
        String a112 = k11.a();
        K11 = kotlin.text.h.K(a112);
        InterfaceC9524d.a aVar2 = InterfaceC9524d.a.f91713a;
        if (!K11) {
        }
    }

    public static final Object F0(C9527g c9527g, ArrayList arrayList, kotlin.coroutines.d dVar) {
        c9527g.getClass();
        Object J02 = c9527g.J0(new F(arrayList), (kotlin.coroutines.jvm.internal.c) dVar);
        return J02 == Wc.a.COROUTINE_SUSPENDED ? J02 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G0(List list, kotlin.coroutines.jvm.internal.c cVar) {
        Object J02;
        return (!list.isEmpty() && (J02 = J0(new C9529i(list), cVar)) == Wc.a.COROUTINE_SUSPENDED) ? J02 : Unit.f71690a;
    }

    private static ru.ozon.android.messenger.framework.presentation.models.q I0(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = qVar.b();
        ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
        for (ru.ozon.android.messenger.framework.presentation.models.u uVar : b11) {
            ru.ozon.android.messenger.framework.presentation.models.g c11 = uVar.c();
            if (c11 instanceof ru.ozon.android.messenger.blocks.chatGroups.a) {
                uVar = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar, ru.ozon.android.messenger.blocks.chatGroups.a.a((ru.ozon.android.messenger.blocks.chatGroups.a) c11, false, 2015));
            } else if (c11 instanceof ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) {
                ru.ozon.android.messenger.blocks.chatGroups.grouplist.m mVar = (ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) c11;
                List<ru.ozon.android.messenger.framework.presentation.models.q> b12 = mVar.b();
                ArrayList arrayList2 = new ArrayList(C7714v.z(b12, 10));
                Iterator<T> it = b12.iterator();
                while (it.hasNext()) {
                    arrayList2.add(I0((ru.ozon.android.messenger.framework.presentation.models.q) it.next()));
                }
                uVar = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar, ru.ozon.android.messenger.blocks.chatGroups.grouplist.m.a(mVar, arrayList2, null, 13));
            }
            arrayList.add(uVar);
        }
        return ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, arrayList, null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:12:0x004f, B:14:0x005f, B:18:0x0068, B:20:0x006e, B:22:0x0074, B:25:0x007a, B:28:0x008b, B:29:0x0094, B:31:0x009a, B:33:0x00ad, B:34:0x00cb, B:36:0x00d1, B:39:0x00e3, B:44:0x00ef, B:46:0x0102, B:47:0x0110), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[Catch: all -> 0x0065, TRY_ENTER, TryCatch #0 {all -> 0x0065, blocks: (B:12:0x004f, B:14:0x005f, B:18:0x0068, B:20:0x006e, B:22:0x0074, B:25:0x007a, B:28:0x008b, B:29:0x0094, B:31:0x009a, B:33:0x00ad, B:34:0x00cb, B:36:0x00d1, B:39:0x00e3, B:44:0x00ef, B:46:0x0102, B:47:0x0110), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J0(Function1 function1, kotlin.coroutines.jvm.internal.c cVar) {
        C9530j c9530j;
        int i11;
        Je.d dVar;
        C9527g c9527g;
        List<ru.ozon.android.messenger.framework.presentation.models.q> c11;
        List<ru.ozon.android.messenger.framework.presentation.models.q> list;
        try {
            if (cVar instanceof C9530j) {
                c9530j = (C9530j) cVar;
                int i12 = c9530j.f91769i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c9530j.f91769i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c9530j.f91767g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c9530j.f91769i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        c9530j.f91764d = this;
                        c9530j.f91765e = function1;
                        dVar = this.f91752y;
                        c9530j.f91766f = dVar;
                        c9530j.f91769i = 1;
                        if (dVar.a(c9530j) == aVar) {
                            return aVar;
                        }
                        c9527g = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Je.d dVar2 = c9530j.f91766f;
                        Function1 function12 = c9530j.f91765e;
                        c9527g = c9530j.f91764d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        function1 = function12;
                    }
                    c11 = c9527g.P0().c();
                    list = (List) function1.invoke(c11);
                    if (c11 != list) {
                        return Unit.f71690a;
                    }
                    if (c11.isEmpty() && list.isEmpty()) {
                        return Unit.f71690a;
                    }
                    List<ru.ozon.android.messenger.framework.presentation.models.q> list2 = c11;
                    int h11 = U.h(C7714v.z(list2, 10));
                    if (h11 < 16) {
                        h11 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                    for (Object obj2 : list2) {
                        linkedHashMap.put(((ru.ozon.android.messenger.framework.presentation.models.q) obj2).c().getId(), obj2);
                    }
                    Set E11 = kotlin.sequences.l.E(kotlin.sequences.l.v(C7714v.w(list), C9531k.f91770b));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (!E11.contains((String) entry.getKey())) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    List U02 = C7714v.U0(linkedHashMap2.values());
                    if (!U02.isEmpty()) {
                        c9527g.f91737j.b(new InterfaceC9526f.b(ru.ozon.android.messenger.framework.presentation.models.f.a(U02)));
                    }
                    c9527g.T0(new InterfaceC9524d.c(list));
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                }
            }
            c11 = c9527g.P0().c();
            list = (List) function1.invoke(c11);
            if (c11 != list) {
            }
        } finally {
            dVar.c(null);
        }
        c9530j = new C9530j(this, cVar);
        Object obj3 = c9530j.f91767g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9530j.f91769i;
        if (i11 != 0) {
        }
    }

    private final String N0() {
        String str;
        Object obj;
        ru.ozon.android.messenger.framework.presentation.models.q a11;
        ru.ozon.android.messenger.blocks.chatGroups.a aVar;
        C9525e P02 = P0();
        Intrinsics.checkNotNullParameter(P02, "<this>");
        Iterator<T> it = P02.c().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ru.ozon.android.messenger.framework.presentation.models.r.b((ru.ozon.android.messenger.framework.presentation.models.q) obj) instanceof ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) {
                break;
            }
        }
        ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
        ru.ozon.android.messenger.blocks.chatGroups.grouplist.m mVar = qVar != null ? (ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) ru.ozon.android.messenger.framework.presentation.models.r.c(qVar) : null;
        if (mVar != null && (a11 = ru.ozon.android.messenger.blocks.chatGroups.grouplist.n.a(mVar)) != null && (aVar = (ru.ozon.android.messenger.blocks.chatGroups.a) ru.ozon.android.messenger.framework.presentation.models.r.c(a11)) != null) {
            str = aVar.b();
        }
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C9525e P0() {
        return this.f91735h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0169, code lost:
    
        if (r13.G0(r14, r0) == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010c, code lost:
    
        if (r6.G0(r13, r0) == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
    
        r4 = r6;
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
    
        if (r13 == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q0(String str, kotlin.coroutines.jvm.internal.c cVar) {
        t tVar;
        int i11;
        String N02;
        Object p11;
        C9527g c9527g;
        ru.ozon.android.messenger.utils.i iVar;
        C9527g c9527g2;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i12 = tVar.f91799i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                tVar.f91799i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = tVar.f91797g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = tVar.f91799i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (str.length() == 0) {
                        return Unit.f71690a;
                    }
                    this.f91746s = true;
                    N02 = N0();
                    ru.ozon.android.messenger.framework.data.requests.f fVar = new ru.ozon.android.messenger.framework.data.requests.f(str, N02, P0().b());
                    tVar.f91794d = this;
                    tVar.f91795e = str;
                    tVar.f91796f = N02;
                    tVar.f91799i = 1;
                    p11 = this.f91729b.p(fVar, tVar);
                    if (p11 != aVar) {
                        c9527g = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c9527g2 = tVar.f91794d;
                        Sc.s.b(obj);
                        c9527g2.f91746s = false;
                        return Unit.f71690a;
                    }
                    ru.ozon.android.messenger.framework.presentation.models.responses.k kVar = (ru.ozon.android.messenger.framework.presentation.models.responses.k) tVar.f91796f;
                    iVar = (ru.ozon.android.messenger.utils.i) tVar.f91795e;
                    C9527g c9527g3 = tVar.f91794d;
                    Sc.s.b(obj);
                    c9527g3.T0(new InterfaceC9524d.C1716d(kVar.c()));
                    c9527g3.f91745r = kVar.a();
                    c9527g2 = c9527g3;
                    if (iVar instanceof i.a) {
                        List<ru.ozon.android.messenger.framework.presentation.models.q> e11 = c9527g2.f91731d.e(c9527g2.f91729b.E().getValue(), ru.ozon.android.messenger.blocks.emptystate.j.CHAT_LIST, null);
                        tVar.f91794d = c9527g2;
                        tVar.f91795e = iVar;
                        tVar.f91796f = null;
                        tVar.f91799i = 4;
                    }
                    c9527g2.f91746s = false;
                    return Unit.f71690a;
                }
                String str2 = (String) tVar.f91796f;
                String str3 = (String) tVar.f91795e;
                c9527g = tVar.f91794d;
                Sc.s.b(obj);
                N02 = str2;
                str = str3;
                p11 = obj;
                iVar = (ru.ozon.android.messenger.utils.i) p11;
                if (iVar instanceof i.b) {
                    ru.ozon.android.messenger.framework.presentation.models.responses.k kVar2 = (ru.ozon.android.messenger.framework.presentation.models.responses.k) ((i.b) iVar).b();
                    if (Intrinsics.d(c9527g.P0().e(), str) && Intrinsics.d(N02, c9527g.N0())) {
                        List<ru.ozon.android.messenger.framework.presentation.models.q> b11 = kVar2.b();
                        ru.ozon.android.messenger.framework.presentation.models.q d11 = kVar2.d();
                        if (!b11.isEmpty()) {
                            List<ru.ozon.android.messenger.framework.presentation.models.q> list = b11;
                            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new J.a((ru.ozon.android.messenger.framework.presentation.models.q) it.next()));
                            }
                            c9527g.T0(new InterfaceC9524d.e(arrayList));
                        }
                        if (d11 != null) {
                            List a02 = C7714v.a0(d11);
                            tVar.f91794d = c9527g;
                            tVar.f91795e = iVar;
                            tVar.f91796f = kVar2;
                            tVar.f91799i = 2;
                        } else {
                            tVar.f91794d = c9527g;
                            tVar.f91795e = iVar;
                            tVar.f91796f = kVar2;
                            tVar.f91799i = 3;
                            Object J02 = c9527g.J0(new A(u.f91800b), tVar);
                            if (J02 != Wc.a.COROUTINE_SUSPENDED) {
                                J02 = Unit.f71690a;
                            }
                        }
                        c9527g3.T0(new InterfaceC9524d.C1716d(kVar.c()));
                        c9527g3.f91745r = kVar.a();
                        c9527g2 = c9527g3;
                        if (iVar instanceof i.a) {
                        }
                        c9527g2.f91746s = false;
                        return Unit.f71690a;
                    }
                }
                c9527g2 = c9527g;
                if (iVar instanceof i.a) {
                }
                c9527g2.f91746s = false;
                return Unit.f71690a;
            }
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.f91797g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = tVar.f91799i;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) p11;
        if (iVar instanceof i.b) {
        }
        c9527g2 = c9527g;
        if (iVar instanceof i.a) {
        }
        c9527g2.f91746s = false;
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R0(String str, kotlin.coroutines.jvm.internal.c cVar) {
        z zVar;
        int i11;
        C9527g c9527g;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i12 = zVar.f91832g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                zVar.f91832g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = zVar.f91830e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = zVar.f91832g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (str == null) {
                        return Unit.f71690a;
                    }
                    ArrayList b11 = this.f91730c.b(new d.w(new j.b(str)), P0().c());
                    zVar.f91829d = this;
                    zVar.f91832g = 1;
                    Object J02 = J0(new F(b11), zVar);
                    if (J02 != aVar) {
                        J02 = Unit.f71690a;
                    }
                    if (J02 == aVar) {
                        return aVar;
                    }
                    c9527g = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9527g = zVar.f91829d;
                    Sc.s.b(obj);
                }
                c9527g.T0(InterfaceC9524d.a.f91713a);
                c9527g.f91751x.setValue(c9527g.N0());
                c9527g.f91750w.tryEmit(N.a.f91602a);
                return Unit.f71690a;
            }
        }
        zVar = new z(this, cVar);
        Object obj2 = zVar.f91830e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = zVar.f91832g;
        if (i11 != 0) {
        }
        c9527g.T0(InterfaceC9524d.a.f91713a);
        c9527g.f91751x.setValue(c9527g.N0());
        c9527g.f91750w.tryEmit(N.a.f91602a);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(InterfaceC9524d interfaceC9524d) {
        C9525e value;
        x0<C9525e> x0Var = this.f91735h;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, (C9525e) ((f) this.f91727A).invoke(value, interfaceC9524d)));
    }

    public static final ArrayList e0(C9527g c9527g, List list) {
        c9527g.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(I0((ru.ozon.android.messenger.framework.presentation.models.q) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r0(C9527g c9527g, d.f fVar, kotlin.coroutines.d dVar) {
        C9532l c9532l;
        int i11;
        Map<String, String> params;
        Map<String, String> params2;
        c9527g.getClass();
        if (dVar instanceof C9532l) {
            c9532l = (C9532l) dVar;
            int i12 = c9532l.f91775h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9532l.f91775h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9532l.f91773f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9532l.f91775h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String id2 = fVar.a().getId();
                    String str = null;
                    if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.CHAT_GROUP_SELECTED.a())) {
                        AtomActionDTO b11 = fVar.a().b();
                        if (b11 != null && (params2 = b11.getParams()) != null) {
                            str = params2.get(d.c.SELECTED_CHAT_GROUP_ID.a());
                        }
                        c9532l.f91771d = c9527g;
                        c9532l.f91772e = fVar;
                        c9532l.f91775h = 1;
                        if (c9527g.R0(str, c9532l) == aVar) {
                            return aVar;
                        }
                    } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.SEARCH_QUERY_CHANGED.a())) {
                        AtomActionDTO b12 = fVar.a().b();
                        if (b12 != null && (params = b12.getParams()) != null) {
                            str = params.get("searchQuery");
                        }
                        if (str == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        c9527g.f91749v.setValue(str);
                        c9527g.T0(new InterfaceC9524d.f(str));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = c9532l.f91772e;
                    c9527g = c9532l.f91771d;
                    Sc.s.b(obj);
                }
                if (fVar.a().c() instanceof AtomAction.Refresh) {
                    c9527g.f91750w.tryEmit(N.b.f91603a);
                }
                return Unit.f71690a;
            }
        }
        c9532l = new C9532l(c9527g, dVar);
        Object obj2 = c9532l.f91773f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9532l.f91775h;
        if (i11 != 0) {
        }
        if (fVar.a().c() instanceof AtomAction.Refresh) {
        }
        return Unit.f71690a;
    }

    public static final void s0(C9527g c9527g, Map map) {
        ru.ozon.android.messenger.framework.analytics.i iVar;
        c9527g.getClass();
        MessengerTrackingInfo messengerTrackingInfo = (MessengerTrackingInfo) map.get("click");
        if (messengerTrackingInfo == null || (iVar = c9527g.f91734g) == null) {
            return;
        }
        ru.ozon.android.messenger.framework.analytics.h.e(iVar, U.i(new Pair("click", messengerTrackingInfo)));
    }

    public static final void t0(C9527g c9527g, ru.ozon.android.messenger.blocks.curtain.c cVar) {
        c9527g.f91737j.b(new InterfaceC9526f.c(cVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static final void u0(C9527g c9527g) {
        ((ru.ozon.android.messenger.framework.presentation.common.notification.d) c9527g.f91748u.getValue()).a(null, new C9533m(c9527g), new o(c9527g));
    }

    public static final void v0(C9527g c9527g, Map map) {
        c9527g.getClass();
        MessengerTrackingInfo messengerTrackingInfo = (MessengerTrackingInfo) map.get("view");
        if (messengerTrackingInfo != null) {
            HashMap<String, MessengerTrackingInfo> hashMap = c9527g.f91753z;
            if (hashMap.containsKey(messengerTrackingInfo.getKey())) {
                messengerTrackingInfo = null;
            }
            if (messengerTrackingInfo != null) {
                hashMap.put(messengerTrackingInfo.getKey(), messengerTrackingInfo);
                ru.ozon.android.messenger.framework.analytics.i iVar = c9527g.f91734g;
                if (iVar != null) {
                    ru.ozon.android.messenger.framework.analytics.h.f(iVar, U.i(new Pair("view", messengerTrackingInfo)));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r9.invoke(r6, r0) != r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (xe.Y.b(r6, r0) == r10) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w0(C9527g c9527g, long j11, Function2 function2, kotlin.coroutines.jvm.internal.c cVar) {
        p pVar;
        int i11;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f91784g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                pVar.f91784g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = pVar.f91782e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = pVar.f91784g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    long elapsedRealtime = 500 - (SystemClock.elapsedRealtime() - j11);
                    if (elapsedRealtime > 0) {
                        pVar.f91781d = function2;
                        pVar.f91784g = 1;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    function2 = pVar.f91781d;
                    Sc.s.b(obj);
                }
                Boolean bool = Boolean.FALSE;
                pVar.f91781d = null;
                pVar.f91784g = 2;
            }
        }
        pVar = new p(c9527g, cVar);
        Object obj2 = pVar.f91782e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = pVar.f91784g;
        if (i11 != 0) {
        }
        Boolean bool2 = Boolean.FALSE;
        pVar.f91781d = null;
        pVar.f91784g = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r2.Q0(r11, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y0(C9527g c9527g, kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        int i11;
        C9527g c9527g2;
        String str;
        int i12;
        c9527g.getClass();
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i13 = rVar.f91792h;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rVar.f91792h = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = rVar.f91790f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = rVar.f91792h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String e11 = c9527g.P0().e();
                    M0<AbstractC9330a> l11 = c9527g.f91729b.l();
                    s sVar = new s(2, null);
                    rVar.f91788d = c9527g;
                    rVar.f91789e = e11;
                    rVar.f91792h = 1;
                    Object v11 = C2399j.v(l11, sVar, rVar);
                    if (v11 != aVar) {
                        c9527g2 = c9527g;
                        str = e11;
                        obj = v11;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                str = rVar.f91789e;
                c9527g2 = rVar.f91788d;
                Sc.s.b(obj);
                Boolean[] boolArr = {Boolean.valueOf(kotlin.text.h.K(str)), Boolean.valueOf(str.length() < c9527g2.f91742o), Boolean.valueOf(!Intrinsics.d(obj, AbstractC9330a.C1590a.f87982a))};
                for (i12 = 0; i12 < 3; i12++) {
                    if (boolArr[i12].booleanValue()) {
                        return Unit.f71690a;
                    }
                }
                rVar.f91788d = null;
                rVar.f91789e = null;
                rVar.f91792h = 2;
            }
        }
        rVar = new r(c9527g, cVar);
        Object obj2 = rVar.f91790f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rVar.f91792h;
        if (i11 != 0) {
        }
        Boolean[] boolArr2 = {Boolean.valueOf(kotlin.text.h.K(str)), Boolean.valueOf(str.length() < c9527g2.f91742o), Boolean.valueOf(!Intrinsics.d(obj2, AbstractC9330a.C1590a.f87982a))};
        while (i12 < 3) {
        }
        rVar.f91788d = null;
        rVar.f91789e = null;
        rVar.f91792h = 2;
    }

    public final void H0() {
        if (this.f91747t) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new d(null), 3);
    }

    @NotNull
    public final M0<C9525e> K0() {
        return this.f91736i;
    }

    @NotNull
    public final InterfaceC2395h<InterfaceC9526f> L0() {
        return this.f91738k;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.navigation.controller.b M0() {
        return this.f91728a;
    }

    public final L O0() {
        return this.f91739l;
    }

    public final void S0(@NotNull ru.ozon.android.messenger.blocks.chat.search.i data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.j() != null) {
            this.f91728a.m(data.j());
        }
        this.f91737j.b(new InterfaceC9526f.a(data));
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        this.f91753z.clear();
        super.onCleared();
    }
}
