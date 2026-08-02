package ru.ozon.android.messenger.framework.presentation.messenger;

import Ae.C0;
import Ae.E0;
import Ae.M0;
import De.C2862e;
import android.net.Uri;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.productshelf.j;
import ru.ozon.android.messenger.blocks.recommendations.f;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.repository.n0;
import ru.ozon.android.messenger.framework.domain.usecases.C9407y;
import ru.ozon.android.messenger.framework.navigation.action.c;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.messenger.f;
import ru.ozon.android.messenger.framework.presentation.messenger.i;
import ru.ozon.uni.android.haptic.HapticToken;
import xe.B0;
import xe.C10727i;
import xe.I;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;

/* loaded from: classes10.dex */
public final class l extends w0 {

    /* renamed from: o, reason: collision with root package name */
    private static int f91366o;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9407y f91367a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f91368b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.r f91369c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final n0 f91370d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final d.g f91371e;

    /* renamed from: f, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f91372f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.b f91373g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.action.f f91374h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final f f91375i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.viewmodel.d f91376j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C0 f91377k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C2862e f91378l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final M0 f91379m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final b f91380n;

    static final class a extends AbstractC7737t implements Function1<h, h> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f91381b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final h invoke(h hVar) {
            h it = hVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return h.a(it, null, 6);
        }
    }

    public static final class b {
        b() {
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.messenger.MessengerViewModel$onCleared$1", f = "MessengerViewModel.kt", l = {108}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f91383d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f91383d;
            if (i11 == 0) {
                Sc.s.b(obj);
                l.f91366o--;
                if (l.f91366o == 0) {
                    ru.ozon.android.messenger.framework.domain.repository.b bVar = l.this.f91368b;
                    this.f91383d = 1;
                    if (bVar.v(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<Throwable, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            N.c(l.this.f91378l, null);
            return Unit.f71690a;
        }
    }

    public l(@NotNull C9407y initializeChatUseCase, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.framework.domain.usecases.r getSocketEventUseCase, @NotNull n0 updateGlobalCounterRepository, @NotNull d.g unreadMsgCountChangedListener, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull ru.ozon.android.messenger.framework.navigation.controller.b controller, @NotNull ru.ozon.android.messenger.framework.navigation.action.f messengerExternalActionHandler, @NotNull I ioDispatcher, @NotNull f launchType) {
        Intrinsics.checkNotNullParameter(initializeChatUseCase, "initializeChatUseCase");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(getSocketEventUseCase, "getSocketEventUseCase");
        Intrinsics.checkNotNullParameter(updateGlobalCounterRepository, "updateGlobalCounterRepository");
        Intrinsics.checkNotNullParameter(unreadMsgCountChangedListener, "unreadMsgCountChangedListener");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(messengerExternalActionHandler, "messengerExternalActionHandler");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        this.f91367a = initializeChatUseCase;
        this.f91368b = repository;
        this.f91369c = getSocketEventUseCase;
        this.f91370d = updateGlobalCounterRepository;
        this.f91371e = unreadMsgCountChangedListener;
        this.f91372f = iVar;
        this.f91373g = controller;
        this.f91374h = messengerExternalActionHandler;
        this.f91375i = launchType;
        ru.ozon.android.messenger.framework.presentation.common.viewmodel.d dVar = new ru.ozon.android.messenger.framework.presentation.common.viewmodel.d(new h(null, null));
        this.f91376j = dVar;
        this.f91377k = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this.f91378l = N.a(ioDispatcher.plus(X0.b()));
        this.f91379m = dVar.getState();
        this.f91380n = new b();
        C10727i.c(x0.a(this), null, null, new q(this, null), 3);
        C10727i.c(x0.a(this), null, null, new o(this, null), 3);
        C10727i.c(x0.a(this), null, null, new r(this, null), 3);
        updateGlobalCounterRepository.c(unreadMsgCountChangedListener);
        if (f91366o == 0) {
            C10727i.c(x0.a(this), null, null, new p(this, null), 3);
        }
        f91366o++;
    }

    public static final void m0(l lVar, ru.ozon.android.messenger.framework.navigation.action.c cVar) {
        lVar.getClass();
        boolean z11 = cVar instanceof c.e;
        ru.ozon.android.messenger.framework.presentation.common.viewmodel.d dVar = lVar.f91376j;
        if (z11) {
            dVar.a(new m(cVar));
            return;
        }
        if (cVar instanceof c.a) {
            dVar.a(new n(cVar));
            return;
        }
        if (cVar instanceof c.C1640c) {
            lVar.u0(((c.C1640c) cVar).a(), HapticToken.HEAVY);
        } else if (cVar instanceof c.d) {
            lVar.u0(((c.d) cVar).a(), HapticToken.HEAVY);
        } else if (!(cVar instanceof c.b)) {
            throw new Sc.o();
        }
    }

    private final void u0(String str, HapticToken hapticToken) {
        d.w.a[] aVarArr = {new f.a(str), new j.a(str)};
        for (int i11 = 0; i11 < 2; i11++) {
            this.f91373g.v(aVarArr[i11]);
        }
        this.f91377k.tryEmit(new i.a(hapticToken));
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        c cVar = new c(null);
        C2862e c2862e = this.f91378l;
        C10727i.c(c2862e, null, null, cVar, 3);
        B0 b02 = (B0) c2862e.getCoroutineContext().get(B0.f105374o0);
        if (b02 != null) {
            b02.y(new d());
        }
    }

    public final void p0() {
        this.f91376j.a(a.f91381b);
    }

    @NotNull
    public final b q0() {
        return this.f91380n;
    }

    @NotNull
    public final C0 r0() {
        return this.f91377k;
    }

    @NotNull
    public final M0 s0() {
        return this.f91379m;
    }

    public final void t0(@NotNull String pageName) {
        Uri b11;
        String uri;
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        b bVar = this.f91380n;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        l lVar = l.this;
        f fVar = lVar.f91375i;
        String str = null;
        f.b bVar2 = fVar instanceof f.b ? (f.b) fVar : null;
        if (bVar2 != null && (b11 = bVar2.b()) != null && (uri = b11.toString()) != null && pageName.equals("communications_chat_detail")) {
            str = uri;
        }
        ru.ozon.android.messenger.framework.analytics.e eVar = new ru.ozon.android.messenger.framework.analytics.e(pageName, str);
        ru.ozon.android.messenger.framework.analytics.i iVar = lVar.f91372f;
        if (iVar != null) {
            iVar.sendPageView(eVar);
        }
    }
}
