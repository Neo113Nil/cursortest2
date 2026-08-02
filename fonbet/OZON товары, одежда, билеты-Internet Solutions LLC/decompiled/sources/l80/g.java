package l80;

import A30.m;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import Sc.s;
import T60.a;
import T80.c;
import a5.C4946d;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.r;
import com.google.android.gms.common.GoogleApiAvailability;
import g30.InterfaceC6618a;
import h3.C6788a;
import i80.InterfaceC7021a;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import o40.InterfaceC8640a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.AppConfigTab;
import ru.ozon.fintech.settings.models.AuthPinpad;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import x70.C10675b;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import ze.u;

/* loaded from: classes3.dex */
public class g extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f73083a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f73084b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f73085c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final d70.d f73086d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final m f73087e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C10675b f73088f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final v30.d f73089g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC8640a f73090h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f73091i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Q90.c f73092j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final S60.a f73093k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final x0<String> f73094l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f73095m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f73096n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f73097o;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabViewModel$loadFeatureToggles$1", f = "BaseTabViewModel.kt", l = {116}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73098d;

        /* renamed from: l80.g$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1226a extends C7735q implements Function1<AppConfig, Unit> {
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AppConfig appConfig) {
                AppConfig p02 = appConfig;
                Intrinsics.checkNotNullParameter(p02, "p0");
                ((g) this.receiver).q0(p02);
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73098d;
            g gVar = g.this;
            if (i11 == 0) {
                s.b(obj);
                Q90.c cVar = gVar.f73092j;
                C1226a c1226a = new C1226a(1, gVar, g.class, "onAppConfigApplied", "onAppConfigApplied(Lru/ozon/fintech/settings/models/AppConfig;)V", 0);
                this.f73098d = 1;
                if (cVar.v(c1226a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            gVar.f73087e.C(Tl.a.f(gVar.f73092j, S90.c.MOB_AD_PARAMS));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabViewModel$loadIconInto$1", f = "BaseTabViewModel.kt", l = {186}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<u<? super Drawable>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f73100d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f73101e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f73103g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f73104h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabViewModel$loadIconInto$1$1", f = "BaseTabViewModel.kt", l = {182}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f73105d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ g f73106e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f73107f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f73108g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ u<Drawable> f73109h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(g gVar, String str, String str2, u<? super Drawable> uVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f73106e = gVar;
                this.f73107f = str;
                this.f73108g = str2;
                this.f73109h = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f73106e, this.f73107f, this.f73108g, this.f73109h, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Drawable drawable;
                Drawable createFromStream;
                String str = this.f73108g;
                g gVar = this.f73106e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f73105d;
                u<Drawable> uVar = this.f73109h;
                if (i11 == 0) {
                    s.b(obj);
                    try {
                        Integer iconResByToken = TokensExtKt.getIconResByToken(gVar.f73083a, this.f73107f);
                        if (iconResByToken != null) {
                            drawable = androidx.core.content.a.getDrawable(gVar.f73083a, iconResByToken.intValue());
                        } else {
                            if (kotlin.text.h.e0(str, "http", false)) {
                                InputStream openStream = new URL(str).openStream();
                                try {
                                    createFromStream = Drawable.createFromStream(openStream, null);
                                    Vd0.b.a(openStream, null);
                                } finally {
                                }
                            } else {
                                InputStream open = gVar.f73083a.getAssets().open(str);
                                try {
                                    createFromStream = Drawable.createFromStream(open, null);
                                    Vd0.b.a(open, null);
                                } finally {
                                }
                            }
                            drawable = createFromStream;
                        }
                    } catch (Exception unused) {
                        drawable = null;
                    }
                    if (!uVar.g()) {
                        this.f73105d = 1;
                        if (uVar.n(drawable, this) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                uVar.l(null);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f73103g = str;
            this.f73104h = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = g.this.new b(this.f73103g, this.f73104h, dVar);
            bVar.f73101e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(u<? super Drawable> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f73100d;
            if (i11 == 0) {
                s.b(obj);
                u uVar = (u) this.f73101e;
                C6788a a12 = androidx.lifecycle.x0.a(g.this);
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(a12, He.b.f10879b, null, new a(g.this, this.f73103g, this.f73104h, uVar, null), 2);
                this.f73100d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.tabber.presentation.base.BaseTabViewModel$onAppConfigApplied$1", f = "BaseTabViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AppConfig f73111e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AppConfig appConfig, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f73111e = appConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new c(this.f73111e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String path;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            g gVar = g.this;
            Activity c11 = gVar.f73084b.c();
            r rVar = c11 instanceof r ? (r) c11 : null;
            if (rVar != null) {
                gVar.f73089g.d(rVar);
                gVar.f73089g.a(rVar);
                S60.a aVar2 = gVar.f73093k;
                x0<String> L11 = gVar.f73084b.L();
                if (L11 == null || (path = L11.getValue()) == null) {
                    path = ((AppConfigTab) C7714v.K(this.f73111e.getTabs())).getPath();
                }
                aVar2.b(path);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
    
        if (r8 < 73) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(@NotNull Application context, @NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull d70.d offlineManager, @NotNull m fintechAuthInteractor, @NotNull C10675b onBoardingConfig, @NotNull v30.d fintechAntiFraudInteractor, @NotNull InterfaceC8640a forceUpdateInteractor, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull Q90.c featureToggles, @NotNull S60.a fintechMetrixInteractor) {
        String str;
        Intrinsics.checkNotNullParameter(context, "application");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(onBoardingConfig, "onBoardingConfig");
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        this.f73083a = context;
        this.f73084b = fintechNavigation;
        this.f73085c = fintechSettings;
        this.f73086d = offlineManager;
        this.f73087e = fintechAuthInteractor;
        this.f73088f = onBoardingConfig;
        this.f73089g = fintechAntiFraudInteractor;
        this.f73090h = forceUpdateInteractor;
        this.f73091i = fintechAnalyticInteractor;
        this.f73092j = featureToggles;
        this.f73093k = fintechMetrixInteractor;
        x0<String> a11 = O0.a(null);
        this.f73094l = a11;
        Boolean bool = Boolean.FALSE;
        this.f73095m = O0.a(bool);
        this.f73096n = O0.a(bool);
        if (fintechSettings.isStandAloneIntegration()) {
            Intrinsics.checkNotNullParameter(context, "context");
            boolean z11 = false;
            try {
                PackageInfo a12 = C4946d.a(context);
                str = a12 != null ? a12.versionName : null;
                List m11 = str != null ? kotlin.text.h.m(str, new String[]{"."}, 0, 6) : null;
                if (m11 != null && m11.size() == 4) {
                    int parseInt = Integer.parseInt((String) m11.get(0));
                    if (1 <= parseInt) {
                    }
                }
            } catch (Exception e11) {
                L80.a.c("checkWebView", null, e11);
            }
            str = null;
            try {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    z11 = true;
                }
            } catch (Exception unused) {
            }
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            String upperCase = MANUFACTURER.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            a11.setValue((!Intrinsics.d(upperCase, "HUAWEI") || z11) ? str : null);
        }
    }

    @NotNull
    public final x0<Boolean> j0() {
        return this.f73095m;
    }

    @NotNull
    public final x0<Boolean> k0() {
        return this.f73096n;
    }

    @NotNull
    public final x0<String> l0() {
        return this.f73094l;
    }

    public final void m0() {
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new a(null), 2);
    }

    @NotNull
    public final InterfaceC2395h<Drawable> n0(@NotNull String iconSrc, String str) {
        Intrinsics.checkNotNullParameter(iconSrc, "iconSrc");
        return C2399j.f(new b(str, iconSrc, null));
    }

    public final void q0(@NotNull AppConfig appConfig) {
        Long timestamp;
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        AuthPinpad authPinpad = appConfig.getAuthPinpad();
        a.d dVar = new a.d((authPinpad == null || (timestamp = authPinpad.getTimestamp()) == null) ? System.currentTimeMillis() : timestamp.longValue());
        S60.a aVar = this.f73093k;
        aVar.a(dVar);
        aVar.a(new a.b(System.currentTimeMillis()));
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new c(appConfig, null), 3);
    }

    public final void r0() {
        ru.ozon.fintech.settings.domain.a aVar = this.f73085c;
        if (aVar.isStandAloneIntegration()) {
            aVar.w();
        }
        this.f73091i.H1();
        boolean c11 = this.f73088f.c();
        S80.b bVar = this.f73084b;
        if (c11) {
            x0<c.b> j11 = bVar.j();
            if (j11 != null) {
                j11.setValue(c.b.SHOW);
                return;
            }
            return;
        }
        Activity c12 = bVar.c();
        if (c12 != null) {
            H30.u.c(c12);
        }
        Activity c13 = bVar.c();
        if (c13 != null) {
            H30.u.b(c13);
        }
    }

    public final void s0(@NotNull f fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        S80.b bVar = this.f73084b;
        w0<Boolean> Y11 = bVar.Y();
        if (Y11 != null) {
            Y11.tryEmit(null);
        }
        bVar.I0(false);
        bVar.z(null);
        x0<String> p11 = bVar.p();
        if (p11 != null) {
            p11.setValue(null);
        }
        this.f73089g.f(fragmentActivity);
        this.f73092j.m();
        ru.ozon.fintech.settings.domain.a aVar = this.f73085c;
        if (aVar.isStandAloneIntegration()) {
            aVar.w();
        }
    }

    public final void t0(@NotNull f baseTabActivity) {
        Intrinsics.checkNotNullParameter(baseTabActivity, "baseTabActivity");
        boolean v11 = this.f73087e.v();
        boolean needOzonId = this.f73085c.getNeedOzonId();
        if (v11 || !needOzonId) {
            return;
        }
        H30.u.c(baseTabActivity);
        H30.u.b(baseTabActivity);
        if (this.f73097o) {
            S80.b bVar = this.f73084b;
            bVar.d0();
            bVar.j0("", null, false);
        }
    }

    public final void u0(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f73086d.onSaveInstanceState(outState);
    }

    public final void v0(@NotNull f activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f73092j.n() != null) {
            this.f73089g.a(activity);
        }
    }

    public final void w0(@NotNull f fragmentActivity) {
        boolean z11;
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        if (this.f73092j.n() != null) {
            this.f73089g.e(fragmentActivity);
        }
        ComponentCallbacks2 componentCallbacks2 = this.f73083a;
        InterfaceC7021a interfaceC7021a = componentCallbacks2 instanceof InterfaceC7021a ? (InterfaceC7021a) componentCallbacks2 : null;
        Activity c11 = interfaceC7021a != null ? interfaceC7021a.c() : null;
        if (!Intrinsics.d(c11 != null ? c11.getClass().getSimpleName() : null, "AuthFlowActivity")) {
            if (!Intrinsics.d(c11 != null ? c11.getClass().getSimpleName() : null, "CrossAppAuthActivity")) {
                z11 = false;
                this.f73097o = z11;
            }
        }
        z11 = true;
        this.f73097o = z11;
    }

    public final void x0(boolean z11) {
        this.f73096n.setValue(Boolean.valueOf(z11));
    }

    public final void y0() {
        L80.a.a("BaseTabViewModel", "Update webview");
        this.f73084b.u("com.google.android.webview");
    }
}
