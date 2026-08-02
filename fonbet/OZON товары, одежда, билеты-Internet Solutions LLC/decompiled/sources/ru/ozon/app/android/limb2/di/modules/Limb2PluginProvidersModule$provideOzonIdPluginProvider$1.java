package ru.ozon.app.android.limb2.di.modules;

import Fb0.e;
import Fb0.f;
import Ld0.c;
import Qj0.s0;
import Sc.InterfaceC4008j;
import Ub0.b;
import android.app.Application;
import android.widget.FrameLayout;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.OpenBarcodeButtonConfig;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule$provideOzonIdPluginProvider$1;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.auth.flags.PerformanceTrackingForAntibotEnabled;
import ru.ozon.app.android.network.cookie.handler.GNCEnabledChecker;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.di.NetworkComponentDependencies;
import ru.ozon.app.android.network.security.antibot.AntibotPerfAnalyticService;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.utils.ContextUtilsKt;
import yb0.InterfaceC10879a;
import zb0.f;
import zb0.g;

@Metadata(d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020!0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001a\u0010*\u001a\u00020)8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R \u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u000bR\u0016\u0010:\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u000bR\u0016\u0010<\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u000b¨\u0006="}, d2 = {"ru/ozon/app/android/limb2/di/modules/Limb2PluginProvidersModule$provideOzonIdPluginProvider$1", "LFb0/f;", "LFb0/e;", "primaryDomain", "LFb0/e;", "getPrimaryDomain", "()LFb0/e;", "", "userAgent", "Ljava/lang/String;", "getUserAgent", "()Ljava/lang/String;", "LFb0/f$a;", "appName", "LFb0/f$a;", "getAppName", "()LFb0/f$a;", "appVersion", "getAppVersion", "antibotAppHash", "getAntibotAppHash", "Lzb0/f$a;", "cookieEventListener", "Lzb0/f$a;", "getCookieEventListener", "()Lzb0/f$a;", "Lyb0/a;", "antibotEventListener", "Lyb0/a;", "getAntibotEventListener", "()Lyb0/a;", "Lkotlin/Function1;", "LLd0/c;", "", "featureFlagsProvider", "Lkotlin/jvm/functions/Function1;", "getFeatureFlagsProvider", "()Lkotlin/jvm/functions/Function1;", "Landroid/widget/FrameLayout;", "antibotFrameForHostProvider", "getAntibotFrameForHostProvider", "", "isManualNotificationRootViewControl", "Z", "()Z", "", "Lzb0/g;", "ozonIdCookieHandlers", "Ljava/util/List;", "getOzonIdCookieHandlers", "()Ljava/util/List;", "LUb0/b;", "getLocaleProvider", "()LUb0/b;", "localeProvider", "getMeshVersion", "meshVersion", "getAbVariants", "abVariants", "getInternalHeadersToken", "internalHeadersToken", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Limb2PluginProvidersModule$provideOzonIdPluginProvider$1 extends f {
    final /* synthetic */ InterfaceC4008j<AppLocaleRepository> $appLocaleRepository;
    final /* synthetic */ InterfaceC4008j<DebugHeaderService> $debugHeaderService;
    private final String antibotAppHash;
    private final InterfaceC10879a antibotEventListener;
    private final Function1<FrameLayout, Unit> antibotFrameForHostProvider;
    private final f.a appName;
    private final String appVersion;
    private final f.a cookieEventListener;
    private final Function1<c, Unit> featureFlagsProvider;
    private final boolean isManualNotificationRootViewControl;
    private final List<g> ozonIdCookieHandlers;
    private final e primaryDomain;
    final /* synthetic */ Limb2PluginProvidersModule this$0;
    private final String userAgent;

    /* JADX WARN: Multi-variable type inference failed */
    Limb2PluginProvidersModule$provideOzonIdPluginProvider$1(EnvironmentService environmentService, AppVersionService appVersionService, Application application, OpenBarcodeButtonConfig openBarcodeButtonConfig, NetworkComponentDependencies networkComponentDependencies, Limb2PluginProvidersModule limb2PluginProvidersModule, InterfaceC4008j<? extends AppLocaleRepository> interfaceC4008j, InterfaceC4008j<? extends DebugHeaderService> interfaceC4008j2, final InterfaceC4008j<OzonIdCookieEvents> interfaceC4008j3, final InterfaceC4008j<? extends AntibotPerfAnalyticService> interfaceC4008j4, final InterfaceC4008j<? extends FeatureChecker> interfaceC4008j5, InterfaceC4008j<? extends UserStatusStorage> interfaceC4008j6) {
        this.this$0 = limb2PluginProvidersModule;
        this.$appLocaleRepository = interfaceC4008j;
        this.$debugHeaderService = interfaceC4008j2;
        e.a aVar = e.Companion;
        boolean isStage = environmentService.isStage();
        aVar.getClass();
        this.primaryDomain = isStage ? e.defaultStage : e.defaultProd;
        this.userAgent = appVersionService.getUserAgent();
        this.appName = ContextUtilsKt.isOzonTravelApplication(application) ? f.a.TRAVEL_APP : ContextUtilsKt.isOzonFreshApplication(application) ? f.a.FRESH_APP : ContextUtilsKt.isOzonSelectApplication(application) ? f.a.SELECT_APP : f.a.BX_APP;
        this.appVersion = appVersionService.getVersion();
        this.antibotAppHash = ContextUtilsKt.isOzonTravelApplication(application) ? "d9e98de0544a5fcb" : ContextUtilsKt.isOzonFreshApplication(application) ? "10701185983c233c" : ContextUtilsKt.isOzonSelectApplication(application) ? "3facef61ef69f500" : "01ae145142fa31f9";
        this.cookieEventListener = new f.a() { // from class: Yy.a
            @Override // zb0.f.a
            public final void a(zb0.f fVar) {
                Limb2PluginProvidersModule$provideOzonIdPluginProvider$1.cookieEventListener$lambda$0(InterfaceC4008j.this, fVar);
            }
        };
        this.antibotEventListener = new InterfaceC10879a() { // from class: ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule$provideOzonIdPluginProvider$1$antibotEventListener$1
            @Override // yb0.InterfaceC10879a
            public void onFlowEnd(InterfaceC10879a.AbstractC2296a state) {
                Intrinsics.checkNotNullParameter(state, "state");
                String a11 = s0.a(state.a().request());
                AntibotPerfAnalyticService value = interfaceC4008j4.getValue();
                if (!interfaceC4008j5.getValue().isEnabled(PerformanceTrackingForAntibotEnabled.INSTANCE) || state.b()) {
                    value.removePerfAnalytic(a11);
                } else {
                    value.trackAntibot(a11);
                }
            }
        };
        this.featureFlagsProvider = new Limb2PluginProvidersModule$provideOzonIdPluginProvider$1$featureFlagsProvider$1(interfaceC4008j6);
        this.antibotFrameForHostProvider = openBarcodeButtonConfig.getAntibotFrameForHostProvider();
        this.isManualNotificationRootViewControl = true;
        Set<g> ozonIdCookieHandlers = networkComponentDependencies.getOzonIdCookieHandlers();
        for (Object obj : ozonIdCookieHandlers) {
            GNCEnabledChecker gNCEnabledChecker = obj instanceof GNCEnabledChecker ? (GNCEnabledChecker) obj : null;
            if (gNCEnabledChecker != null) {
                gNCEnabledChecker.setEnabled(new Limb2PluginProvidersModule$provideOzonIdPluginProvider$1$ozonIdCookieHandlers$1$1(interfaceC4008j5));
            }
        }
        this.ozonIdCookieHandlers = C7714v.U0(ozonIdCookieHandlers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cookieEventListener$lambda$0(InterfaceC4008j interfaceC4008j, zb0.f cookieEvent) {
        Intrinsics.checkNotNullParameter(cookieEvent, "cookieEvent");
        ((OzonIdCookieEvents) interfaceC4008j.getValue()).onCookieEvent(cookieEvent);
    }

    @Override // Fb0.f
    public String getAbVariants() {
        return this.$debugHeaderService.getValue().getAbVariant();
    }

    @Override // Fb0.f
    public String getAntibotAppHash() {
        return this.antibotAppHash;
    }

    @Override // Fb0.f
    public InterfaceC10879a getAntibotEventListener() {
        return this.antibotEventListener;
    }

    @Override // Fb0.f
    public Function1<FrameLayout, Unit> getAntibotFrameForHostProvider() {
        return this.antibotFrameForHostProvider;
    }

    @Override // Fb0.f
    public f.a getAppName() {
        return this.appName;
    }

    @Override // Fb0.f
    public String getAppVersion() {
        return this.appVersion;
    }

    public f.a getCookieEventListener() {
        return this.cookieEventListener;
    }

    public Function1<c, Unit> getFeatureFlagsProvider() {
        return this.featureFlagsProvider;
    }

    @Override // Fb0.f
    public String getInternalHeadersToken() {
        return this.$debugHeaderService.getValue().getInternalHeadersToken();
    }

    @Override // Fb0.f
    public b getLocaleProvider() {
        b localeProvider;
        localeProvider = this.this$0.getLocaleProvider(this.$appLocaleRepository);
        return localeProvider;
    }

    @Override // Fb0.f
    public String getMeshVersion() {
        return this.$debugHeaderService.getValue().getMeshValue();
    }

    public List<g> getOzonIdCookieHandlers() {
        return this.ozonIdCookieHandlers;
    }

    @Override // Fb0.f
    public e getPrimaryDomain() {
        return this.primaryDomain;
    }

    @Override // Fb0.f
    public String getUserAgent() {
        return this.userAgent;
    }

    @Override // Fb0.f
    /* renamed from: isManualNotificationRootViewControl, reason: from getter */
    public boolean getIsManualNotificationRootViewControl() {
        return this.isManualNotificationRootViewControl;
    }
}
