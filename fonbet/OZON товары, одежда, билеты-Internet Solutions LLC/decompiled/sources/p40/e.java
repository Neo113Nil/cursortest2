package p40;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import C80.a;
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
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Q90.c f80151a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K40.a f80152b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f80153c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final R30.a f80154d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C80.a f80155e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final EnumC8852a f80156f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f80157g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f80158h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appupdate.service.GmsUpdateService$needInAppUpdate$1", f = "GmsUpdateService.kt", l = {122, 127}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<u<? super h>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f80159d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f80160e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f80162g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80162g = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = e.this.new a(this.f80162g, dVar);
            aVar.f80160e = obj;
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
            int i11 = this.f80159d;
            if (i11 == 0) {
                s.b(obj);
                final u uVar = (u) this.f80160e;
                final e eVar = e.this;
                boolean a13 = n.a.a(eVar, eVar.f80151a);
                final boolean z11 = this.f80162g;
                if (a13) {
                    eVar.f80157g = z11;
                    C80.a aVar2 = eVar.f80155e;
                    Function1 callback = new Function1() { // from class: p40.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            h hVar;
                            a.InterfaceC0111a interfaceC0111a = (a.InterfaceC0111a) obj2;
                            if (Intrinsics.d(interfaceC0111a, a.InterfaceC0111a.d.f4498a)) {
                                hVar = h.AVAILABLE;
                            } else if (Intrinsics.d(interfaceC0111a, a.InterfaceC0111a.e.f4499a)) {
                                hVar = h.NOT_AVAILABLE;
                            } else if (Intrinsics.d(interfaceC0111a, a.InterfaceC0111a.c.f4497a)) {
                                hVar = h.UNKNOWN;
                            } else if (Intrinsics.d(interfaceC0111a, a.InterfaceC0111a.C0112a.f4496a)) {
                                hVar = h.PROGRESS;
                            } else if (interfaceC0111a instanceof a.InterfaceC0111a.b) {
                                e eVar2 = e.this;
                                InterfaceC6618a interfaceC6618a = eVar2.f80153c;
                                String name = eVar2.b().name();
                                ((a.InterfaceC0111a.b) interfaceC0111a).getClass();
                                interfaceC6618a.T1(name, null, z11);
                                hVar = h.ERROR;
                            } else {
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
                    callback.invoke(a.InterfaceC0111a.e.f4499a);
                    this.f80159d = 1;
                    a12 = ze.s.a(uVar, new Q90.b(2), this);
                } else {
                    eVar.f80153c.T1(eVar.b().name(), "isEnabledStore: false", z11);
                    uVar.b(h.NOT_AVAILABLE);
                    uVar.l(null);
                    this.f80159d = 2;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.appupdate.service.GmsUpdateService$startInAppUpdate$1", f = "GmsUpdateService.kt", l = {165}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<u<? super g>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f80163d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f80164e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f80166g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f80167h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar, boolean z11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f80166g = rVar;
            this.f80167h = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = e.this.new b(this.f80166g, this.f80167h, dVar);
            bVar.f80164e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super g> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f80163d;
            if (i11 == 0) {
                s.b(obj);
                u uVar = (u) this.f80164e;
                e.this.f80155e.getClass();
                this.f80163d = 1;
                a11 = ze.s.a(uVar, new Q90.b(2), this);
                if (a11 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public e(@NotNull Q90.c featureToggles, @NotNull K40.a cbottomDisplay, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull Context context, @NotNull R30.a appCoroutineScopes, @NotNull C80.a gmsUpdateManager, @NotNull InterfaceC6083a exchanger) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(gmsUpdateManager, "gmsUpdateManager");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f80151a = featureToggles;
        this.f80152b = cbottomDisplay;
        this.f80153c = fintechAnalyticInteractor;
        this.f80154d = appCoroutineScopes;
        this.f80155e = gmsUpdateManager;
        this.f80156f = EnumC8852a.GOOGLE_PLAY;
        ActionResult2.INSTANCE.getClass();
        exchanger.b(ActionResult2.Companion.a("GmsUpdateServiceUUID"), appCoroutineScopes.c(), false, new C8853b(this, 0));
        this.f80158h = Sc.k.a(Sc.n.PUBLICATION, new C8854c());
    }

    public static Unit d(e eVar, ActionResult2 actionResult) {
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        if (Intrinsics.d(actionResult.getComposerActionId(), "SNACKBAR_GMS_SUBMIT_ID")) {
            boolean z11 = eVar.f80157g;
            eVar.f80153c.i(eVar.f80156f.name(), z11);
            eVar.f80155e.getClass();
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
        return this.f80156f;
    }

    @Override // p40.n
    @NotNull
    public final InterfaceC2395h<g> c(r rVar, boolean z11) {
        return C2399j.e(new b(rVar, z11, null));
    }
}
