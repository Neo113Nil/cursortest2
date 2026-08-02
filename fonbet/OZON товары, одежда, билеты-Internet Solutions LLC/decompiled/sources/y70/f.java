package y70;

import A30.m;
import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import Ca.o;
import Ca.p;
import H30.u;
import Q90.n;
import Sc.C4005g;
import Sc.InterfaceC4008j;
import Sc.s;
import T80.c;
import We.E;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.wallet.WalletConstants;
import d40.InterfaceC6083a;
import h3.C6788a;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import o40.InterfaceC8640a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p40.EnumC8852a;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingV2DTO;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.FeatureValue;
import x40.C10656a;
import x70.C10675b;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import z70.C10997a;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class f extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f106210a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f106211b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f106212c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f106213d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10675b f106214e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C10656a f106215f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Q90.c f106216g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final E f106217h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC8640a f106218i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final R30.a f106219j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final n f106220k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final m f106221l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final x0<C10997a> f106222m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C0 f106223n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C0 f106224o;

    /* renamed from: p, reason: collision with root package name */
    private FeatureValue f106225p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f106226q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f106227r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f106228s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private EnumC8852a f106229t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private String f106230u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f106231v;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingViewModel$gotoOzonId$1", f = "OnboardingViewModel.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106232d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106232d;
            f fVar = f.this;
            if (i11 == 0) {
                s.b(obj);
                fVar.u0().z();
                m mVar = fVar.f106221l;
                this.f106232d = 1;
                if (mVar.y(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            fVar.t0().d0();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingViewModel$onCreate$1", f = "OnboardingViewModel.kt", l = {101}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106234d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f106236a;

            a(f fVar) {
                this.f106236a = fVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                this.f106236a.F0();
                return Unit.f71690a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106234d;
            if (i11 == 0) {
                s.b(obj);
                f fVar = f.this;
                x0<AppConfig> o11 = fVar.f106216g.o();
                a aVar2 = new a(fVar);
                this.f106234d = 1;
                if (o11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingViewModel$onCreate$2", f = "OnboardingViewModel.kt", l = {107}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106237d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f106239a;

            a(f fVar) {
                this.f106239a = fVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                boolean d11 = Intrinsics.d((Boolean) obj, Boolean.TRUE);
                f fVar = this.f106239a;
                if (d11) {
                    fVar.f106228s = true;
                }
                fVar.F0();
                return Unit.f71690a;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106237d;
            if (i11 == 0) {
                s.b(obj);
                f fVar = f.this;
                w0<Boolean> Y11 = fVar.t0().Y();
                if (Y11 == null) {
                    return Unit.f71690a;
                }
                a aVar2 = new a(fVar);
                this.f106237d = 1;
                if (Y11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingViewModel$onCreate$3", f = "OnboardingViewModel.kt", l = {116}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106240d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f106242a;

            a(f fVar) {
                this.f106242a = fVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                boolean d11 = Intrinsics.d((Boolean) obj, Boolean.TRUE);
                f fVar = this.f106242a;
                if (d11) {
                    fVar.f106228s = true;
                }
                fVar.F0();
                return Unit.f71690a;
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106240d;
            if (i11 == 0) {
                s.b(obj);
                f fVar = f.this;
                w0<Boolean> S02 = fVar.t0().S0();
                if (S02 == null) {
                    return Unit.f71690a;
                }
                a aVar2 = new a(fVar);
                this.f106240d = 1;
                if (S02.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingViewModel$onCreate$4", f = "OnboardingViewModel.kt", l = {127}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106243d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f106245a;

            a(f fVar) {
                this.f106245a = fVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                this.f106245a.f106229t = (EnumC8852a) obj;
                return Unit.f71690a;
            }
        }

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106243d;
            if (i11 == 0) {
                s.b(obj);
                f fVar = f.this;
                InterfaceC2395h<EnumC8852a> a11 = fVar.f106218i.a(true);
                a aVar2 = new a(fVar);
                this.f106243d = 1;
                if (a11.collect(aVar2, this) == aVar) {
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

    public f(@NotNull Application context, @NotNull O30.b fintechLibType, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S80.b fintechNavigation, @NotNull SharedPreferences sharedPreferences, @NotNull InterfaceC6083a exchanger, @NotNull C10675b onBoardingConfig, @NotNull C10656a cbottomMapper2, @NotNull Q90.c featureToggles, @NotNull E okHttpClient, @NotNull InterfaceC8640a forceUpdateInteractor, @NotNull R30.a appCoroutineScopes, @NotNull n fintechUltraManager, @NotNull m authInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(onBoardingConfig, "onBoardingConfig");
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(fintechUltraManager, "fintechUltraManager");
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        this.f106210a = fintechSettings;
        this.f106211b = fintechNavigation;
        this.f106212c = sharedPreferences;
        this.f106213d = exchanger;
        this.f106214e = onBoardingConfig;
        this.f106215f = cbottomMapper2;
        this.f106216g = featureToggles;
        this.f106217h = okHttpClient;
        this.f106218i = forceUpdateInteractor;
        this.f106219j = appCoroutineScopes;
        this.f106220k = fintechUltraManager;
        this.f106221l = authInteractor;
        this.f106222m = O0.a(null);
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f106223n = E0.a(0, 1, enumC11113a);
        this.f106224o = E0.a(0, 1, enumC11113a);
        this.f106227r = authInteractor.v();
        this.f106229t = EnumC8852a.NONE;
        this.f106230u = "";
        this.f106231v = Sc.k.b(new C90.b(this, 2));
    }

    private final Integer C0() {
        if (L0()) {
            this.f106214e.getClass();
        }
        return null;
    }

    private final Integer D0() {
        if (L0()) {
            this.f106214e.getClass();
        }
        return null;
    }

    private final void E0() {
        ru.ozon.fintech.settings.domain.a aVar = this.f106210a;
        boolean needOzonId = aVar.getNeedOzonId();
        S80.b bVar = this.f106211b;
        if (needOzonId) {
            if (this.f106221l.v()) {
                return;
            }
            bVar.getClass();
            bVar.j0("", null, bVar.y());
            bVar.B(false);
            return;
        }
        Activity c11 = bVar.c();
        if (c11 != null) {
            u.c(c11);
        }
        Activity c12 = bVar.c();
        if (c12 != null) {
            u.b(c12);
        }
        x0<c.b> j11 = bVar.j();
        if (j11 != null) {
            j11.setValue(c.b.HIDE_ANIMATED);
        }
        if (aVar.q() && aVar.isStandAloneIntegration()) {
            C6788a a11 = androidx.lifecycle.x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, De.s.f6650a, null, new a(null), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0() {
        C10997a c10997a;
        C10997a c10997a2;
        C10997a c10997a3;
        Q90.c cVar = this.f106216g;
        AppConfig n11 = cVar.n();
        ru.ozon.fintech.settings.domain.a aVar = this.f106210a;
        boolean isStandAloneIntegration = aVar.isStandAloneIntegration();
        S80.b bVar = this.f106211b;
        m mVar = this.f106221l;
        if (isStandAloneIntegration && aVar.q() && ((!mVar.v() || !aVar.getNeedOzonId()) && this.f106226q && n11 != null)) {
            boolean z11 = Tl.a.f(cVar, S90.c.MOB_DISCLOSURE_SCREEN) && aVar.o() == null;
            boolean I02 = I0();
            boolean H02 = H0();
            z0();
            c10997a = new C10997a(null, null, null, null, false, null, false, z11, I02, H02, null, y0());
            bVar.D0();
            if (!I0()) {
                E0();
            }
        } else if (aVar.isStandAloneIntegration() && aVar.q() && (!mVar.v() || !aVar.getNeedOzonId())) {
            this.f106214e.getClass();
            z0();
            c10997a = new C10997a(null, null, null, null, false, null, false, false, false, false, null, y0());
            bVar.D0();
        } else {
            boolean isStandAloneIntegration2 = aVar.isStandAloneIntegration();
            n nVar = this.f106220k;
            if (isStandAloneIntegration2 && !aVar.q() && !mVar.v() && aVar.getNeedOzonId() && n11 == null) {
                C0();
                w0();
                String r02 = r0();
                boolean d11 = nVar.d();
                D0();
                z0();
                c10997a = new C10997a(null, null, null, r02, d11, null, false, false, false, false, null, y0());
            } else {
                if (aVar.isStandAloneIntegration() && !aVar.q() && !mVar.v() && aVar.getNeedOzonId() && n11 != null) {
                    C0();
                    w0();
                    String r03 = r0();
                    boolean d12 = nVar.d();
                    D0();
                    boolean H03 = H0();
                    z0();
                    c10997a3 = new C10997a(null, null, null, r03, d12, null, false, false, false, H03, null, y0());
                    bVar.D0();
                    if (!H0()) {
                        E0();
                    }
                } else if (aVar.isStandAloneIntegration() && n11 != null && this.f106228s) {
                    C0();
                    w0();
                    String r04 = r0();
                    boolean d13 = nVar.d();
                    D0();
                    boolean H04 = H0();
                    z0();
                    c10997a3 = new C10997a(null, null, null, r04, d13, null, false, false, false, H04, null, y0());
                    bVar.D0();
                    if (!H0()) {
                        G0();
                    }
                } else {
                    if (aVar.isStandAloneIntegration() && n11 != null) {
                        C0();
                        w0();
                        String r05 = r0();
                        boolean d14 = nVar.d();
                        D0();
                        boolean H05 = H0();
                        z0();
                        c10997a2 = new C10997a(null, null, null, r05, d14, null, false, false, false, H05, null, y0());
                    } else if (aVar.isStandAloneIntegration()) {
                        C0();
                        w0();
                        String r06 = r0();
                        boolean d15 = nVar.d();
                        D0();
                        z0();
                        c10997a2 = new C10997a(null, null, null, r06, d15, null, false, false, false, false, null, y0());
                    } else if (aVar.isStandAloneIntegration()) {
                        c10997a = null;
                    } else {
                        z0();
                        C10997a c10997a4 = new C10997a(null, null, null, null, false, null, true, false, false, false, null, y0());
                        if (n11 != null && this.f106228s) {
                            G0();
                        }
                        c10997a = c10997a4;
                    }
                    c10997a = c10997a2;
                }
                c10997a = c10997a3;
            }
        }
        this.f106222m.setValue(c10997a);
    }

    private final void G0() {
        x0<c.b> j11 = this.f106211b.j();
        if (j11 != null) {
            j11.setValue((this.f106227r || !this.f106210a.getNeedOzonId()) ? c.b.HIDE_ANIMATED : c.b.HIDE);
        }
    }

    private final boolean H0() {
        return this.f106218i.c() && this.f106229t != EnumC8852a.NONE;
    }

    private final boolean I0() {
        FeatureValue featureValue;
        return this.f106214e.b() && (featureValue = this.f106225p) != null && featureValue.isEnabled() && this.f106210a.q();
    }

    private final boolean L0() {
        ru.ozon.fintech.settings.domain.a aVar = this.f106210a;
        return !aVar.c() || aVar.q();
    }

    public static Unit d0(f fVar, ActionResult2 actionResult) {
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        String widgetId = actionResult.getWidgetId();
        if (widgetId == null || !kotlin.text.h.e0(widgetId, "next", false)) {
            String widgetId2 = actionResult.getWidgetId();
            if (widgetId2 != null && kotlin.text.h.e0(widgetId2, "login", false)) {
                fVar.E0();
            }
        } else {
            fVar.f106223n.tryEmit(Boolean.TRUE);
        }
        return Unit.f71690a;
    }

    public static String e0(f fVar) {
        Set<String> stringSet = fVar.f106212c.getStringSet("SP_SAVED_ONBOARDING_TEXT", null);
        if (stringSet == null) {
            stringSet = C7705l.j0(fVar.f106214e.e());
        }
        Set<String> set = stringSet;
        c.Companion random = kotlin.random.c.INSTANCE;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return (String) (set.isEmpty() ? null : C7714v.F(set, random.e(set.size())));
    }

    public static Unit f0(f fVar) {
        fVar.f106224o.tryEmit(Boolean.TRUE);
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g0(f fVar) {
        FeatureValue featureValue;
        ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a aVar;
        String str;
        Integer version;
        List<Cbottom2OnboardingV2DTO.FrameDTO> frames;
        Cbottom2OnboardingV2DTO.FrameDTO frameDTO;
        if (!fVar.f106210a.q() || (featureValue = fVar.f106225p) == null || !featureValue.isEnabled() || !fVar.f106214e.b()) {
            return;
        }
        FeatureValue featureValue2 = fVar.f106225p;
        JSONObject dict = featureValue2 != null ? featureValue2.getDict() : null;
        if (dict == null) {
            return;
        }
        try {
            aVar = fVar.f106215f.d(dict.toString());
        } catch (Exception e11) {
            L80.a.c("PARSE_ONBOARDING", "V2", e11);
            aVar = null;
        }
        if (aVar != null && (version = aVar.getVersion()) != null && version.intValue() == 2) {
            Cbottom2OnboardingV2DTO cbottom2OnboardingV2DTO = aVar instanceof Cbottom2OnboardingV2DTO ? (Cbottom2OnboardingV2DTO) aVar : null;
            if (cbottom2OnboardingV2DTO != null && (frames = cbottom2OnboardingV2DTO.getFrames()) != null && (frameDTO = (Cbottom2OnboardingV2DTO.FrameDTO) C7714v.M(frames)) != null) {
                str = frameDTO.getVideoUrl();
                if (str == null) {
                    C6788a a11 = androidx.lifecycle.x0.a(fVar);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    C10727i.c(a11, He.b.f10879b, null, new y70.e(str, fVar, null), 2);
                    return;
                }
                return;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    private final String r0() {
        if (L0()) {
            return (String) this.f106231v.getValue();
        }
        return null;
    }

    private final Integer w0() {
        if (L0()) {
            this.f106214e.getClass();
        }
        return null;
    }

    private final Integer y0() {
        if (L0()) {
            return this.f106214e.d();
        }
        return null;
    }

    private final Integer z0() {
        if (L0()) {
            this.f106214e.getClass();
        }
        return null;
    }

    public final FeatureValue A0() {
        return this.f106225p;
    }

    @NotNull
    public final x0<C10997a> B0() {
        return this.f106222m;
    }

    public final void J0(Bundle bundle, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f106230u = uuid;
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new b(null), 3);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new c(null), 3);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new d(null), 3);
        this.f106226q = bundle != null ? bundle.getBoolean("firstLottieAnimationDone", false) : false;
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new e(null), 3);
        ru.ozon.fintech.settings.domain.a aVar = this.f106210a;
        if (aVar.isStandAloneIntegration() && aVar.q() && this.f106214e.b()) {
            C6788a a11 = androidx.lifecycle.x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, He.b.f10879b, null, new g(this, null), 2);
        }
        if (aVar.isStandAloneIntegration()) {
            C10727i.c(this.f106219j.b(), null, null, new h(this, null), 3);
        }
        F0();
    }

    public final void K0(FeatureValue featureValue) {
        this.f106225p = featureValue;
    }

    public final void onStart() {
        C6788a a11 = androidx.lifecycle.x0.a(this);
        o oVar = new o(this, 2);
        InterfaceC6083a interfaceC6083a = this.f106213d;
        interfaceC6083a.b("DISCLOSURE_DONE", a11, true, oVar);
        ActionResult2.Companion companion = ActionResult2.INSTANCE;
        String str = this.f106230u;
        companion.getClass();
        interfaceC6083a.b(ActionResult2.Companion.a(str), androidx.lifecycle.x0.a(this), false, new p(this, 3));
    }

    public final void q0() {
        this.f106226q = true;
        F0();
    }

    @NotNull
    public final C0 s0() {
        return this.f106224o;
    }

    @NotNull
    public final S80.b t0() {
        return this.f106211b;
    }

    @NotNull
    public final ru.ozon.fintech.settings.domain.a u0() {
        return this.f106210a;
    }

    public final boolean v0() {
        return this.f106226q;
    }

    @NotNull
    public final C0 x0() {
        return this.f106223n;
    }
}
