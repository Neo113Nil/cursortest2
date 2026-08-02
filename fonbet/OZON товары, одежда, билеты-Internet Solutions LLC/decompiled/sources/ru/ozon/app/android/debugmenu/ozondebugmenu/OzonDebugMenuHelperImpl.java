package ru.ozon.app.android.debugmenu.ozondebugmenu;

import GZ.g;
import Ib.a;
import U20.c;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import r20.C9164a;
import r20.C9165b;
import r20.C9167d;
import ru.ozon.app.android.debugmenu.debugscreen.abtool.AbToggleRouter;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.AnalyticsGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.CheckoutGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.ComposerGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.DebugFeaturesGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.DeeplinkGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.EnvironmentGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.FontScaleDebugMenuProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.HttpHeadersGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.HttpLoggingGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.InformationGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.LocalizationGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.MapsGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.PlayerGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.SentryGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.providers.TrackerGroupProvider;
import ru.ozon.app.android.debugmenu.ozondebugmenu.support.OzonDebugMenuEvents;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.NetworkAtMostQaUserPredicate;
import ru.ozon.app.android.network.flags.DebugShakerEnabledFlag;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.debugMenu.internal.presentation.OzonDebugMenuActivity;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B¿\u0002\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0006\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0006\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0006\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0006\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0006\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0006\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0006\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0006\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0006\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0006¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00109\u001a\u0004\u0018\u0001082\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010@R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010@R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010@R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010@R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010@R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010@R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010@R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010@R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010@R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010@R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010@R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010@R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010@R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010@R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010@R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/OzonDebugMenuHelperImpl;", "Lru/ozon/app/android/debugmenu/ozondebugmenu/OzonDebugMenuHelper;", "Landroid/app/Application;", "application", "Lru/ozon/app/android/network/abtool/NetworkAtMostQaUserPredicate;", "networkAtMostQaUserPredicate", "LIb/a;", "Lru/ozon/app/android/debugmenu/debugscreen/abtool/AbToggleRouter;", "abToggleRouter", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/DeeplinkGroupProvider;", "deeplinkGroupProvider", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "environmentService", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/EnvironmentGroupProvider;", "environmentGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/ComposerGroupProvider;", "composerGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/TrackerGroupProvider;", "trackerGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/HttpLoggingGroupProvider;", "httpLoggingGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/AnalyticsGroupProvider;", "analyticsGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/InformationGroupProvider;", "informationGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/HttpHeadersGroupProvider;", "httpHeadersGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/DebugFeaturesGroupProvider;", "debugFeaturesGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/PlayerGroupProvider;", "playerGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/MapsGroupProvider;", "mapsGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/SentryGroupProvider;", "sentryGroupProvider", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "androidPlatformComponentConfig", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/debugmenu/ozondebugmenu/support/OzonDebugMenuEvents;", "ozonDebugMenuEvents", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/CheckoutGroupProvider;", "checkoutGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/LocalizationGroupProvider;", "localizationGroupProvider", "Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/FontScaleDebugMenuProvider;", "fontScaleDebugMenuProvider", "<init>", "(Landroid/app/Application;Lru/ozon/app/android/network/abtool/NetworkAtMostQaUserPredicate;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;LIb/a;)V", "", "safeInit", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "getIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "", "getOPLibraryApi", "()Ljava/lang/Object;", "Landroid/app/Application;", "Lru/ozon/app/android/network/abtool/NetworkAtMostQaUserPredicate;", "LIb/a;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "isInitialized", "Z", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonDebugMenuHelperImpl implements OzonDebugMenuHelper {

    @NotNull
    private final a<AbToggleRouter> abToggleRouter;

    @NotNull
    private final a<AnalyticsGroupProvider> analyticsGroupProvider;

    @NotNull
    private final a<AndroidPlatformComponentConfig> androidPlatformComponentConfig;

    @NotNull
    private final Application application;

    @NotNull
    private final a<CheckoutGroupProvider> checkoutGroupProvider;

    @NotNull
    private final a<ComposerGroupProvider> composerGroupProvider;

    @NotNull
    private final a<DebugFeaturesGroupProvider> debugFeaturesGroupProvider;

    @NotNull
    private final a<DeeplinkGroupProvider> deeplinkGroupProvider;

    @NotNull
    private final a<EnvironmentGroupProvider> environmentGroupProvider;

    @NotNull
    private final a<EnvironmentService> environmentService;

    @NotNull
    private final a<FeatureChecker> featureChecker;

    @NotNull
    private final a<FontScaleDebugMenuProvider> fontScaleDebugMenuProvider;

    @NotNull
    private final a<HttpHeadersGroupProvider> httpHeadersGroupProvider;

    @NotNull
    private final a<HttpLoggingGroupProvider> httpLoggingGroupProvider;

    @NotNull
    private final a<InformationGroupProvider> informationGroupProvider;
    private boolean isInitialized;

    @NotNull
    private final a<LocalizationGroupProvider> localizationGroupProvider;

    @NotNull
    private final ReentrantLock lock;

    @NotNull
    private final a<MapsGroupProvider> mapsGroupProvider;

    @NotNull
    private final NetworkAtMostQaUserPredicate networkAtMostQaUserPredicate;

    @NotNull
    private final a<OzonDebugMenuEvents> ozonDebugMenuEvents;

    @NotNull
    private final a<g> ozonRouter;

    @NotNull
    private final a<PlayerGroupProvider> playerGroupProvider;

    @NotNull
    private final a<SentryGroupProvider> sentryGroupProvider;

    @NotNull
    private final a<TrackerGroupProvider> trackerGroupProvider;

    public OzonDebugMenuHelperImpl(@NotNull Application application, @NotNull NetworkAtMostQaUserPredicate networkAtMostQaUserPredicate, @NotNull a<AbToggleRouter> abToggleRouter, @NotNull a<DeeplinkGroupProvider> deeplinkGroupProvider, @NotNull a<EnvironmentService> environmentService, @NotNull a<EnvironmentGroupProvider> environmentGroupProvider, @NotNull a<ComposerGroupProvider> composerGroupProvider, @NotNull a<TrackerGroupProvider> trackerGroupProvider, @NotNull a<HttpLoggingGroupProvider> httpLoggingGroupProvider, @NotNull a<AnalyticsGroupProvider> analyticsGroupProvider, @NotNull a<InformationGroupProvider> informationGroupProvider, @NotNull a<HttpHeadersGroupProvider> httpHeadersGroupProvider, @NotNull a<DebugFeaturesGroupProvider> debugFeaturesGroupProvider, @NotNull a<PlayerGroupProvider> playerGroupProvider, @NotNull a<MapsGroupProvider> mapsGroupProvider, @NotNull a<SentryGroupProvider> sentryGroupProvider, @NotNull a<g> ozonRouter, @NotNull a<AndroidPlatformComponentConfig> androidPlatformComponentConfig, @NotNull a<FeatureChecker> featureChecker, @NotNull a<OzonDebugMenuEvents> ozonDebugMenuEvents, @NotNull a<CheckoutGroupProvider> checkoutGroupProvider, @NotNull a<LocalizationGroupProvider> localizationGroupProvider, @NotNull a<FontScaleDebugMenuProvider> fontScaleDebugMenuProvider) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(networkAtMostQaUserPredicate, "networkAtMostQaUserPredicate");
        Intrinsics.checkNotNullParameter(abToggleRouter, "abToggleRouter");
        Intrinsics.checkNotNullParameter(deeplinkGroupProvider, "deeplinkGroupProvider");
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        Intrinsics.checkNotNullParameter(environmentGroupProvider, "environmentGroupProvider");
        Intrinsics.checkNotNullParameter(composerGroupProvider, "composerGroupProvider");
        Intrinsics.checkNotNullParameter(trackerGroupProvider, "trackerGroupProvider");
        Intrinsics.checkNotNullParameter(httpLoggingGroupProvider, "httpLoggingGroupProvider");
        Intrinsics.checkNotNullParameter(analyticsGroupProvider, "analyticsGroupProvider");
        Intrinsics.checkNotNullParameter(informationGroupProvider, "informationGroupProvider");
        Intrinsics.checkNotNullParameter(httpHeadersGroupProvider, "httpHeadersGroupProvider");
        Intrinsics.checkNotNullParameter(debugFeaturesGroupProvider, "debugFeaturesGroupProvider");
        Intrinsics.checkNotNullParameter(playerGroupProvider, "playerGroupProvider");
        Intrinsics.checkNotNullParameter(mapsGroupProvider, "mapsGroupProvider");
        Intrinsics.checkNotNullParameter(sentryGroupProvider, "sentryGroupProvider");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(androidPlatformComponentConfig, "androidPlatformComponentConfig");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(ozonDebugMenuEvents, "ozonDebugMenuEvents");
        Intrinsics.checkNotNullParameter(checkoutGroupProvider, "checkoutGroupProvider");
        Intrinsics.checkNotNullParameter(localizationGroupProvider, "localizationGroupProvider");
        Intrinsics.checkNotNullParameter(fontScaleDebugMenuProvider, "fontScaleDebugMenuProvider");
        this.application = application;
        this.networkAtMostQaUserPredicate = networkAtMostQaUserPredicate;
        this.abToggleRouter = abToggleRouter;
        this.deeplinkGroupProvider = deeplinkGroupProvider;
        this.environmentService = environmentService;
        this.environmentGroupProvider = environmentGroupProvider;
        this.composerGroupProvider = composerGroupProvider;
        this.trackerGroupProvider = trackerGroupProvider;
        this.httpLoggingGroupProvider = httpLoggingGroupProvider;
        this.analyticsGroupProvider = analyticsGroupProvider;
        this.informationGroupProvider = informationGroupProvider;
        this.httpHeadersGroupProvider = httpHeadersGroupProvider;
        this.debugFeaturesGroupProvider = debugFeaturesGroupProvider;
        this.playerGroupProvider = playerGroupProvider;
        this.mapsGroupProvider = mapsGroupProvider;
        this.sentryGroupProvider = sentryGroupProvider;
        this.ozonRouter = ozonRouter;
        this.androidPlatformComponentConfig = androidPlatformComponentConfig;
        this.featureChecker = featureChecker;
        this.ozonDebugMenuEvents = ozonDebugMenuEvents;
        this.checkoutGroupProvider = checkoutGroupProvider;
        this.localizationGroupProvider = localizationGroupProvider;
        this.fontScaleDebugMenuProvider = fontScaleDebugMenuProvider;
        this.lock = new ReentrantLock();
    }

    @Override // ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelper
    public Intent getIntent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.networkAtMostQaUserPredicate.isDebugOrQaUser()) {
            return null;
        }
        safeInit();
        C9164a c9164a = C9164a.f82858a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) OzonDebugMenuActivity.class);
        intent.setFlags(276824064);
        return intent;
    }

    @Override // ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelper
    public Object getOPLibraryApi() {
        C9164a c9164a = C9164a.f82858a;
        return C9164a.b();
    }

    @Override // ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelper
    public void safeInit() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.isInitialized && this.networkAtMostQaUserPredicate.isDebugOrQaUser()) {
                C9164a c9164a = C9164a.f82858a;
                Application application = this.application;
                AbstractC9166c[] elements = new AbstractC9166c[15];
                boolean z11 = false;
                elements[0] = this.deeplinkGroupProvider.get();
                EnvironmentGroupProvider environmentGroupProvider = this.environmentGroupProvider.get();
                EnvironmentGroupProvider environmentGroupProvider2 = environmentGroupProvider;
                if (!this.environmentService.get().isEnabled()) {
                    environmentGroupProvider = null;
                }
                elements[1] = environmentGroupProvider;
                elements[2] = this.composerGroupProvider.get();
                elements[3] = this.trackerGroupProvider.get();
                elements[4] = this.httpLoggingGroupProvider.get();
                AnalyticsGroupProvider analyticsGroupProvider = this.analyticsGroupProvider.get();
                AnalyticsGroupProvider analyticsGroupProvider2 = analyticsGroupProvider;
                if (!this.androidPlatformComponentConfig.get().getIsDebug()) {
                    analyticsGroupProvider = null;
                }
                elements[5] = analyticsGroupProvider;
                elements[6] = this.informationGroupProvider.get();
                elements[7] = this.httpHeadersGroupProvider.get();
                elements[8] = this.debugFeaturesGroupProvider.get();
                elements[9] = this.playerGroupProvider.get();
                elements[10] = this.mapsGroupProvider.get();
                elements[11] = this.checkoutGroupProvider.get();
                SentryGroupProvider sentryGroupProvider = this.sentryGroupProvider.get();
                SentryGroupProvider sentryGroupProvider2 = sentryGroupProvider;
                if (this.androidPlatformComponentConfig.get().getFlavorType() != FlavorType.f93213QA) {
                    sentryGroupProvider = null;
                }
                elements[12] = sentryGroupProvider;
                elements[13] = this.localizationGroupProvider.get();
                elements[14] = this.fontScaleDebugMenuProvider.get();
                Intrinsics.checkNotNullParameter(elements, "elements");
                ArrayList B11 = C7705l.B(elements);
                if (this.androidPlatformComponentConfig.get().getIsDebug() && this.featureChecker.get().isEnabled(DebugShakerEnabledFlag.INSTANCE)) {
                    z11 = true;
                }
                c9164a.d(application, new C9167d(new C9165b(new OzonDebugMenuHelperImpl$safeInit$1$4(this, null), new OzonDebugMenuHelperImpl$safeInit$1$5(this, null), z11), B11, C7714v.b0(new c("AB флаги", new OzonDebugMenuHelperImpl$safeInit$1$6(this)), new c("AB эксперименты", new OzonDebugMenuHelperImpl$safeInit$1$7(this)), new c("Fintech", new OzonDebugMenuHelperImpl$safeInit$1$8(this)))));
                this.isInitialized = true;
                Unit unit = Unit.f71690a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
