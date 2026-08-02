package p40;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import N90.a;
import Sc.o;
import Sc.s;
import android.content.Context;
import androidx.fragment.app.r;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p40.n;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ze.u;

/* loaded from: classes3.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Q90.c f80189a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K40.a f80190b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f80191c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final R30.a f80192d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final N90.a f80193e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final EnumC8852a f80194f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f80195g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f80196h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appupdate.service.RustoreUpdateService$needInAppUpdate$1", f = "RustoreUpdateService.kt", l = {119, 124}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<u<? super h>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f80197d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f80198e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f80200g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80200g = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = l.this.new a(this.f80200g, dVar);
            aVar.f80198e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super h> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r7 == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        
            if (r7 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Object a12;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f80197d;
            if (i11 == 0) {
                s.b(obj);
                final u uVar = (u) this.f80198e;
                final l lVar = l.this;
                boolean a13 = n.a.a(lVar, lVar.f80189a);
                final boolean z11 = this.f80200g;
                if (a13) {
                    lVar.f80195g = z11;
                    N90.a aVar2 = lVar.f80193e;
                    Function1 callback = new Function1() { // from class: p40.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            h hVar;
                            a.InterfaceC0367a interfaceC0367a = (a.InterfaceC0367a) obj2;
                            if (Intrinsics.d(interfaceC0367a, a.InterfaceC0367a.d.f18825a)) {
                                hVar = h.AVAILABLE;
                            } else if (Intrinsics.d(interfaceC0367a, a.InterfaceC0367a.e.f18826a)) {
                                hVar = h.NOT_AVAILABLE;
                            } else if (Intrinsics.d(interfaceC0367a, a.InterfaceC0367a.c.f18824a)) {
                                hVar = h.UNKNOWN;
                            } else if (Intrinsics.d(interfaceC0367a, a.InterfaceC0367a.C0368a.f18823a)) {
                                hVar = h.PROGRESS;
                            } else {
                                if (!(interfaceC0367a instanceof a.InterfaceC0367a.b)) {
                                    throw new o();
                                }
                                l lVar2 = l.this;
                                InterfaceC6618a interfaceC6618a = lVar2.f80191c;
                                String name = lVar2.b().name();
                                ((a.InterfaceC0367a.b) interfaceC0367a).getClass();
                                interfaceC6618a.T1(name, null, z11);
                                hVar = h.ERROR;
                            }
                            u uVar2 = uVar;
                            if (!uVar2.g()) {
                                uVar2.b(hVar);
                                uVar2.l(null);
                            }
                            return Unit.f71690a;
                        }
                    };
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    callback.invoke(a.InterfaceC0367a.e.f18826a);
                    this.f80197d = 1;
                    a12 = ze.s.a(uVar, new Q90.b(2), this);
                } else {
                    lVar.f80191c.T1(lVar.b().name(), "isEnabledStore: false", z11);
                    uVar.b(h.NOT_AVAILABLE);
                    uVar.l(null);
                    this.f80197d = 2;
                    a11 = ze.s.a(uVar, new Q90.b(2), this);
                }
            } else {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appupdate.service.RustoreUpdateService$startInAppUpdate$1", f = "RustoreUpdateService.kt", l = {153}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<u<? super g>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f80201d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f80203f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f80204g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, r rVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f80203f = z11;
            this.f80204g = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = l.this.new b(this.f80203f, this.f80204g, dVar);
            bVar.f80201d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super g> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            l.this.f80193e.getClass();
            return Unit.f71690a;
        }
    }

    public l(@NotNull Q90.c featureToggles, @NotNull K40.a cbottomDisplay, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull Context context, @NotNull R30.a appCoroutineScopes, @NotNull N90.a rustoreUpdateManager, @NotNull InterfaceC6083a exchanger) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(rustoreUpdateManager, "rustoreUpdateManager");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f80189a = featureToggles;
        this.f80190b = cbottomDisplay;
        this.f80191c = fintechAnalyticInteractor;
        this.f80192d = appCoroutineScopes;
        this.f80193e = rustoreUpdateManager;
        this.f80194f = EnumC8852a.RUSTORE;
        ActionResult2.INSTANCE.getClass();
        exchanger.b(ActionResult2.Companion.a("RustoreUpdateServiceUUID"), appCoroutineScopes.c(), false, new L60.b(this, 2));
        this.f80196h = Sc.k.a(Sc.n.PUBLICATION, new j());
    }

    public static Unit d(l lVar, ActionResult2 actionResult) {
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        if (Intrinsics.d(actionResult.getComposerActionId(), "SNACKBAR_RUSTORE_SUBMIT_ID")) {
            boolean z11 = lVar.f80195g;
            lVar.f80191c.i(lVar.f80194f.name(), z11);
            lVar.f80193e.getClass();
        }
        return Unit.f71690a;
    }

    @Override // p40.n
    @NotNull
    public final InterfaceC2395h<h> a(boolean z11) {
        return C2399j.e(new a(z11, null));
    }

    @Override // p40.n
    @NotNull
    public final EnumC8852a b() {
        return this.f80194f;
    }

    @Override // p40.n
    @NotNull
    public final InterfaceC2395h<g> c(r rVar, boolean z11) {
        return C2399j.e(new b(z11, rVar, null));
    }
}
