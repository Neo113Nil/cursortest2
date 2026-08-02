package ru.ozon.fintech.lib;

import A30.m;
import E80.b;
import Q90.c;
import Sc.s;
import We.E;
import android.app.Activity;
import android.app.Application;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Keep;
import b40.InterfaceC5539a;
import b90.C5597d;
import c90.InterfaceC5773a;
import com.detmir.recycli.adapters.c;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import f90.InterfaceC6469a;
import g30.InterfaceC6618a;
import h90.f;
import h90.k;
import i30.C7004a;
import i30.C7005b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import l90.C7901a;
import m90.C8110a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactory;
import ru.ozon.app.android.pikazon.imagePathHandler.ImagePathHandlerConfig;
import ru.ozon.app.android.pikazon.resources.PikazonResourceManagerImpl;
import ru.ozon.fintech.analytic.domain.config.AnalyticsConfig;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import ru.ozon.fintech.esia.api.EsiaLoginData;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.features.demo.ui.RecyclerBinderImpl;
import ru.ozon.fintech.nav.domain.activityresult.FintechActivityResultHandler;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import s30.InterfaceC9590a;
import s40.InterfaceC9592a;
import s50.InterfaceC9600a;
import u50.C9966a;
import u50.InterfaceC9967b;
import v30.C10219a;
import x40.C10656a;
import x70.C10674a;
import x70.C10675b;
import xe.C10727i;
import xe.M;
import y30.InterfaceC10835a;

@Keep
@Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0087\u00012\u00020\u0001:\u0002\u0088\u0001Bá\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\r\u0010@\u001a\u00020?¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\r\u0010F\u001a\u00020E¢\u0006\u0004\bF\u0010GJ\r\u0010I\u001a\u00020H¢\u0006\u0004\bI\u0010JJ\r\u0010L\u001a\u00020K¢\u0006\u0004\bL\u0010MJ\r\u0010O\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\r\u0010R\u001a\u00020Q¢\u0006\u0004\bR\u0010SJ\r\u0010U\u001a\u00020T¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020*¢\u0006\u0004\bW\u0010XJ\r\u0010Z\u001a\u00020Y¢\u0006\u0004\bZ\u0010[J\r\u0010]\u001a\u00020\\¢\u0006\u0004\b]\u0010^J\r\u0010`\u001a\u00020_¢\u0006\u0004\b`\u0010aJ\r\u0010c\u001a\u00020b¢\u0006\u0004\bc\u0010dJ\r\u0010f\u001a\u00020e¢\u0006\u0004\bf\u0010gJ\r\u0010h\u001a\u00020H¢\u0006\u0004\bh\u0010JJ\r\u0010j\u001a\u00020i¢\u0006\u0004\bj\u0010kJ\r\u0010m\u001a\u00020l¢\u0006\u0004\bm\u0010nJ\r\u0010o\u001a\u00020b¢\u0006\u0004\bo\u0010dJ\r\u0010q\u001a\u00020p¢\u0006\u0004\bq\u0010rJ\r\u0010t\u001a\u00020s¢\u0006\u0004\bt\u0010uJ\r\u0010w\u001a\u00020v¢\u0006\u0004\bw\u0010xJ\u001f\u0010|\u001a\u00020{2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010z\u001a\u00020yH\u0002¢\u0006\u0004\b|\u0010}R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010~\u001a\u0004\b\u007f\u0010XR\u001a\u00103\u001a\u0002028\u0006¢\u0006\u000f\n\u0005\b3\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0089\u0001"}, d2 = {"Lru/ozon/fintech/lib/FintechCoreLib;", "", "Landroid/app/Application;", "application", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "externalFintechSettings", "Lru/ozon/fintech/auth/domain/external/ExternalFintechAuth;", "externalFintechAuth", "Lru/ozon/fintech/network/domain/ExternalNetworkSettings;", "externalNetworkSettings", "LT80/b;", "externalFintechNavigation", "Lru/ozon/fintech/analytic/domain/config/AnalyticsConfig;", "analyticsConfig", "Lx70/b;", "onBoardingConfig", "Li30/a;", "graylogConfig", "Lv30/a;", "antiFraudConfig", "LF80/a;", "pikazonConfig", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;", "cameraScannerFactory", "Li30/b;", "mobileHealthConfig", "LK80/a;", "fintechLocationConfig", "Lx70/a;", "disclosureConfig", "Lm90/a;", "ozonTrackerPluginInterctor", "Ll90/a;", "ozonInAppUpdater", "LC80/a;", "googleInAppUpdater", "LN90/a;", "ruStoreAppUpdateInteractor", "LM90/a;", "rustoreReview", "Lb40/a;", "esiaApi", "LZ30/a;", "digRoubleApi", "", "timeBeforeCreate", "Lb90/d;", "fintechSingleNetworkClientProvider", "LN30/b;", "widgetConfig", "LO30/b;", "fintechLibType", "<init>", "(Landroid/app/Application;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/fintech/auth/domain/external/ExternalFintechAuth;Lru/ozon/fintech/network/domain/ExternalNetworkSettings;LT80/b;Lru/ozon/fintech/analytic/domain/config/AnalyticsConfig;Lx70/b;Li30/a;Lv30/a;LF80/a;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerFactory;Li30/b;LK80/a;Lx70/a;Lm90/a;Ll90/a;LC80/a;LN90/a;LM90/a;Lb40/a;LZ30/a;JLb90/d;LN30/b;LO30/b;)V", "Lru/ozon/fintech/settings/domain/a;", "getFintechSettings", "()Lru/ozon/fintech/settings/domain/a;", "LQ90/c;", "getFeatureToggles", "()LQ90/c;", "LS80/b;", "getFintechNavigation", "()LS80/b;", "LV80/b;", "getFintechShortcutManager", "()LV80/b;", "LA30/m;", "getFintechAuthInteractor", "()LA30/m;", "Lh90/f;", "getNotificationInteractor", "()Lh90/f;", "Lh90/k;", "getExternalNotificationInteractor", "()Lh90/k;", "LS60/a;", "getFintechMetrixInteractor", "()LS60/a;", "Lru/ozon/fintech/nav/domain/activityresult/FintechActivityResultHandler;", "getFintechActivityResultHandler", "()Lru/ozon/fintech/nav/domain/activityresult/FintechActivityResultHandler;", "LR30/a;", "getAppCoroutineScopes", "()LR30/a;", "LWe/E;", "getNetwork", "()LWe/E;", "provideDigRoubleApi", "()LZ30/a;", "Lc90/a;", "getTestEnvironmentManager", "()Lc90/a;", "LK40/a;", "getProvideCbottomDisplay", "()LK40/a;", "Lu50/b;", "getSnackbarDisplay", "()Lu50/b;", "Lg30/a;", "getAnalyticsInteractor", "()Lg30/a;", "Ld40/a;", "getExhanger", "()Ld40/a;", "getNotificationServiceInteractor", "LS30/a;", "getApplicationInfoDataSource", "()LS30/a;", "Lv30/d;", "getFintechAntiFraudInteractor", "()Lv30/d;", "getFintechAnalyticInteractor", "Ld70/d;", "getOfflineManager", "()Ld70/d;", "Lx40/a;", "getCbottomMapper2", "()Lx40/a;", "LR90/a;", "getFastEntryInterceptor", "()LR90/a;", "", "forceAllowStartPreferences", "", "warmUpPreferencesShow", "(Landroid/app/Application;Z)V", "LZ30/a;", "getDigRoubleApi", "LO30/b;", "getFintechLibType", "()LO30/b;", "LY30/b;", "getDiStorage", "()LY30/b;", "diStorage", "Companion", "c", "fintech-lib_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechCoreLib {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final Z30.a digRoubleApi;

    @NotNull
    private final O30.b fintechLibType;

    public static final class a implements InterfaceC5539a {
        @Override // b40.InterfaceC5539a
        public final boolean isAvailable() {
            return false;
        }

        @Override // b40.InterfaceC5539a
        public final void login(Activity activity, EsiaLoginData data) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    @e(c = "ru.ozon.fintech.lib.FintechCoreLib$2$2$1", f = "FintechCoreLib.kt", l = {189}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96625d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S30.a f96626e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(S30.a aVar, d<? super b> dVar) {
            super(2, dVar);
            this.f96626e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(this.f96626e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96625d;
            if (i11 == 0) {
                s.b(obj);
                this.f96625d = 1;
                if (this.f96626e.b(this) == aVar) {
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

    /* renamed from: ru.ozon.fintech.lib.FintechCoreLib$c, reason: from kotlin metadata */
    public static final class Companion {
        public static void a() {
            if (((ArrayList) c.a()).isEmpty()) {
                c.d(C7714v.m0(RecyclerBinderImpl.class, ru.ozon.fintech.ui.RecyclerBinderImpl.class, ru.ozon.fintech.features.operations.ui.receipt.RecyclerBinderImpl.class, ru.ozon.fintech.features.onboarding.ui.RecyclerBinderImpl.class));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FintechCoreLib(Application application, ExternalFintechSettings externalFintechSettings, ExternalFintechAuth externalFintechAuth, ExternalNetworkSettings externalNetworkSettings, T80.b bVar, AnalyticsConfig analyticsConfig, C10675b c10675b, C7004a c7004a, C10219a c10219a, F80.a aVar, CameraScannerFactory cameraScannerFactory, C7005b c7005b, K80.a aVar2, C10674a c10674a, C8110a c8110a, C7901a c7901a, C80.a aVar3, N90.a aVar4, M90.a aVar5, InterfaceC5539a interfaceC5539a, Z30.a aVar6, long j11, C5597d c5597d, N30.b bVar2, O30.b bVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, externalFintechSettings, externalFintechAuth, externalNetworkSettings, bVar, analyticsConfig, c10675b, c7004a, c10219a, aVar, cameraScannerFactory, c7005b, aVar2, r16, (i11 & 16384) != 0 ? new C8110a() : c8110a, (32768 & i11) != 0 ? new C7901a() : c7901a, (65536 & i11) != 0 ? new C80.a() : aVar3, (131072 & i11) != 0 ? new N90.a() : aVar4, (262144 & i11) != 0 ? new M90.a() : aVar5, (524288 & i11) != 0 ? new a() : interfaceC5539a, aVar6, j11, c5597d, (8388608 & i11) != 0 ? new N30.b(U.c()) : bVar2, (i11 & 16777216) != 0 ? O30.b.FINANCE : bVar3);
        C10674a c10674a2;
        C10674a c10674a3;
        if ((i11 & 8192) != 0) {
            c10674a3 = C10674a.f105085i;
            c10674a2 = c10674a3;
        } else {
            c10674a2 = c10674a;
        }
    }

    private final Y30.b getDiStorage() {
        int i11 = O30.a.f19934c;
        return O30.a.a(this.fintechLibType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float lambda$3$lambda$1$lambda$0(S80.b bVar) {
        Window window;
        WindowManager.LayoutParams attributes;
        Activity c11 = bVar.c();
        if (c11 == null || (window = c11.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return Float.valueOf(attributes.screenBrightness);
    }

    private final void warmUpPreferencesShow(Application application, boolean forceAllowStartPreferences) {
        int i11 = D80.c.f6156d;
        D80.c.b(application, forceAllowStartPreferences, this.fintechLibType);
    }

    @NotNull
    public final InterfaceC6618a getAnalyticsInteractor() {
        return ((Y20.a) getDiStorage().a(Y20.a.class)).B();
    }

    @NotNull
    public final R30.a getAppCoroutineScopes() {
        return ((P30.b) getDiStorage().a(P30.b.class)).f();
    }

    @NotNull
    public final S30.a getApplicationInfoDataSource() {
        return ((P30.b) getDiStorage().a(P30.b.class)).getApplicationInfoDataSource();
    }

    @NotNull
    public final C10656a getCbottomMapper2() {
        return ((InterfaceC9592a) getDiStorage().a(InterfaceC9592a.class)).C0();
    }

    @NotNull
    public final Z30.a getDigRoubleApi() {
        return this.digRoubleApi;
    }

    @NotNull
    public final InterfaceC6083a getExhanger() {
        return ((InterfaceC6422b) getDiStorage().a(InterfaceC6422b.class)).G0();
    }

    @NotNull
    public final k getExternalNotificationInteractor() {
        return ((InterfaceC6469a) getDiStorage().a(InterfaceC6469a.class)).q();
    }

    @NotNull
    public final R90.a getFastEntryInterceptor() {
        return ((O90.a) getDiStorage().a(O90.a.class)).k0();
    }

    @NotNull
    public final Q90.c getFeatureToggles() {
        return ((O90.a) getDiStorage().a(O90.a.class)).F0();
    }

    @NotNull
    public final FintechActivityResultHandler getFintechActivityResultHandler() {
        return ((M80.a) getDiStorage().a(M80.a.class)).J();
    }

    @NotNull
    public final InterfaceC6618a getFintechAnalyticInteractor() {
        return ((Y20.a) getDiStorage().a(Y20.a.class)).B();
    }

    @NotNull
    public final v30.d getFintechAntiFraudInteractor() {
        return ((InterfaceC9590a) getDiStorage().a(InterfaceC9590a.class)).o1();
    }

    @NotNull
    public final m getFintechAuthInteractor() {
        return ((InterfaceC10835a) getDiStorage().a(InterfaceC10835a.class)).a1();
    }

    @NotNull
    public final O30.b getFintechLibType() {
        return this.fintechLibType;
    }

    @NotNull
    public final S60.a getFintechMetrixInteractor() {
        return ((Q60.a) getDiStorage().a(Q60.a.class)).J0();
    }

    @NotNull
    public final S80.b getFintechNavigation() {
        return ((M80.a) getDiStorage().a(M80.a.class)).d0();
    }

    @NotNull
    public final ru.ozon.fintech.settings.domain.a getFintechSettings() {
        return ((O90.a) getDiStorage().a(O90.a.class)).w0();
    }

    @NotNull
    public final V80.b getFintechShortcutManager() {
        return ((M80.a) getDiStorage().a(M80.a.class)).N0();
    }

    @NotNull
    public final E getNetwork() {
        return ((Z80.a) getDiStorage().a(Z80.a.class)).getOkHttpClient();
    }

    @NotNull
    public final f getNotificationInteractor() {
        return ((InterfaceC6469a) getDiStorage().a(InterfaceC6469a.class)).g1();
    }

    @NotNull
    public final k getNotificationServiceInteractor() {
        return ((InterfaceC6469a) getDiStorage().a(InterfaceC6469a.class)).q();
    }

    @NotNull
    public final d70.d getOfflineManager() {
        return ((U60.a) getDiStorage().a(U60.a.class)).j();
    }

    @NotNull
    public final K40.a getProvideCbottomDisplay() {
        return ((I40.a) getDiStorage().a(I40.a.class)).D0();
    }

    @NotNull
    public final InterfaceC9967b getSnackbarDisplay() {
        return ((InterfaceC9600a) getDiStorage().a(InterfaceC9600a.class)).z0();
    }

    @NotNull
    public final InterfaceC5773a getTestEnvironmentManager() {
        return ((Z80.a) getDiStorage().a(Z80.a.class)).T0();
    }

    @NotNull
    public final Z30.a provideDigRoubleApi() {
        return this.digRoubleApi;
    }

    public FintechCoreLib(@NotNull Application application, @NotNull ExternalFintechSettings externalFintechSettings, @NotNull ExternalFintechAuth externalFintechAuth, @NotNull ExternalNetworkSettings externalNetworkSettings, @NotNull T80.b externalFintechNavigation, @NotNull AnalyticsConfig analyticsConfig, @NotNull C10675b onBoardingConfig, @NotNull C7004a graylogConfig, @NotNull C10219a antiFraudConfig, @NotNull F80.a pikazonConfig, @NotNull CameraScannerFactory cameraScannerFactory, @NotNull C7005b mobileHealthConfig, @NotNull K80.a fintechLocationConfig, @NotNull C10674a disclosureConfig, @NotNull C8110a ozonTrackerPluginInterctor, @NotNull C7901a ozonInAppUpdater, @NotNull C80.a googleInAppUpdater, @NotNull N90.a ruStoreAppUpdateInteractor, @NotNull M90.a rustoreReview, @NotNull InterfaceC5539a esiaApi, @NotNull Z30.a digRoubleApi, long j11, @NotNull C5597d fintechSingleNetworkClientProvider, @NotNull N30.b widgetConfig, @NotNull O30.b fintechLibType) {
        E80.b bVar;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(externalFintechAuth, "externalFintechAuth");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        Intrinsics.checkNotNullParameter(externalFintechNavigation, "externalFintechNavigation");
        Intrinsics.checkNotNullParameter(analyticsConfig, "analyticsConfig");
        Intrinsics.checkNotNullParameter(onBoardingConfig, "onBoardingConfig");
        Intrinsics.checkNotNullParameter(graylogConfig, "graylogConfig");
        Intrinsics.checkNotNullParameter(antiFraudConfig, "antiFraudConfig");
        Intrinsics.checkNotNullParameter(pikazonConfig, "pikazonConfig");
        Intrinsics.checkNotNullParameter(cameraScannerFactory, "cameraScannerFactory");
        Intrinsics.checkNotNullParameter(mobileHealthConfig, "mobileHealthConfig");
        Intrinsics.checkNotNullParameter(fintechLocationConfig, "fintechLocationConfig");
        Intrinsics.checkNotNullParameter(disclosureConfig, "disclosureConfig");
        Intrinsics.checkNotNullParameter(ozonTrackerPluginInterctor, "ozonTrackerPluginInterctor");
        Intrinsics.checkNotNullParameter(ozonInAppUpdater, "ozonInAppUpdater");
        Intrinsics.checkNotNullParameter(googleInAppUpdater, "googleInAppUpdater");
        Intrinsics.checkNotNullParameter(ruStoreAppUpdateInteractor, "ruStoreAppUpdateInteractor");
        Intrinsics.checkNotNullParameter(rustoreReview, "rustoreReview");
        Intrinsics.checkNotNullParameter(esiaApi, "esiaApi");
        Intrinsics.checkNotNullParameter(digRoubleApi, "digRoubleApi");
        Intrinsics.checkNotNullParameter(fintechSingleNetworkClientProvider, "fintechSingleNetworkClientProvider");
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        this.digRoubleApi = digRoubleApi;
        this.fintechLibType = fintechLibType;
        int i11 = Q90.c.f23057s;
        c.a.e(W30.a.a(application, fintechLibType), fintechLibType);
        b.a a11 = E80.a.a();
        a11.a(application);
        a11.r(externalFintechSettings);
        a11.c(externalNetworkSettings);
        a11.j(externalFintechAuth);
        a11.h(externalFintechNavigation);
        a11.u(analyticsConfig);
        a11.k(onBoardingConfig);
        a11.f(ozonTrackerPluginInterctor);
        a11.d(graylogConfig);
        a11.s(widgetConfig);
        a11.e(antiFraudConfig);
        a11.v(fintechLibType);
        a11.l(ozonInAppUpdater);
        a11.g(disclosureConfig);
        a11.w(googleInAppUpdater);
        a11.m(rustoreReview);
        a11.p(ruStoreAppUpdateInteractor);
        a11.q(cameraScannerFactory);
        a11.b(esiaApi);
        a11.t(mobileHealthConfig);
        a11.o(fintechLocationConfig);
        a11.i(digRoubleApi);
        a11.n(fintechSingleNetworkClientProvider);
        E80.b create = a11.create();
        int i12 = O30.a.f19934c;
        O30.a.c(fintechLibType, create.h());
        long currentTimeMillis = System.currentTimeMillis();
        ru.ozon.fintech.settings.domain.a j12 = create.j();
        S80.b i13 = create.i();
        boolean isQa = j12.isQa();
        m n11 = create.n();
        L80.a.e(application, create.f().b(), isQa, isQa);
        Intrinsics.checkNotNullParameter(application, "application");
        application.registerActivityLifecycleCallbacks(new C9966a());
        warmUpPreferencesShow(application, j12.isQa() || j12.u());
        E okHttpClient = create.a();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(pikazonConfig, "pikazonConfig");
        if (Intrinsics.d(pikazonConfig, F80.a.f9147a)) {
            bVar = create;
        } else {
            Pikazon.Companion companion = Pikazon.INSTANCE;
            PikazonResourceManagerImpl pikazonResourceManagerImpl = new PikazonResourceManagerImpl();
            bVar = create;
            List m11 = h.m("cdn[0-9]+\\.ozone\\.ru,ir\\.ozone\\.ru,ir[0-9]+\\.ozone\\.ru,mmedia\\.ozon\\.ru,cdn[0-9]+\\.ozonusercontent\\.com", new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
            Iterator it = m11.iterator();
            while (it.hasNext()) {
                arrayList.add(new Regex((String) it.next()));
            }
            ImagePathHandlerConfig imagePathHandlerConfig = new ImagePathHandlerConfig(arrayList, false);
            pikazonConfig.getClass();
            companion.bind(okHttpClient, pikazonResourceManagerImpl, imagePathHandlerConfig, new Pikazon.Config((String) null, 0, (Set) null, (PikazonUrlFactory) null, new F80.b(), 13, (DefaultConstructorMarker) null));
        }
        INSTANCE.getClass();
        Companion.a();
        InterfaceC6618a m12 = bVar.m();
        m12.S0(j12.j(), j12.q(), currentTimeMillis - j11, j11, bVar.l().g(), bVar.g().a(application), new D80.a(i13, 0));
        m12.j1(n11.p());
        m12.G0(j12.j());
        C10727i.c(bVar.f().b(), null, null, new b(bVar.k(), null), 3);
        getFastEntryInterceptor().a(n11);
        L80.a.a("FintechCoreLib", "FintechCoreLib inited");
    }
}
