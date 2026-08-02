package ru.ozon.app.android.debugmenu.di;

import IZ.a;
import Ld0.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferences;
import ru.ozon.app.android.debugmenu.deeplink.AbVariantsDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.BlockVideoPlayingDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.ComposerDebugTokenDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.DebugMenuDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.EnvironmentDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.ExtraHeaderDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.FeatureFlagDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.FintechAutoTestDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.HoldGeoProviderDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.ResolveOverrideDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.SberPaySandboxDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.ServiceInternalHeadersTokenDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.ServiceMeshDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.ThemeDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.TrackerTestModeDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.UserQASegmentDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.VersionDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.WidgetDebugToolsDeeplinkHandler;
import ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelper;
import ru.ozon.app.android.debugmenu.userqa.domain.UserQASegmentInteractor;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferences;
import ru.ozon.app.android.navigation.interceptors.AtMostEmployeeUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/debugmenu/di/DebugNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/debugmenu/deeplink/EnvironmentDeeplinkHandler;", "environmentDeeplinkHandler", "Lru/ozon/app/android/debugmenu/deeplink/FeatureFlagDeeplinkHandler;", "featureFlagDeeplinkHandler", "Lru/ozon/app/android/debugmenu/deeplink/ExtraHeaderDeeplinkHandler;", "extraHeaderDeeplinkHandler", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "Lru/ozon/app/android/navigation/interceptors/AtMostEmployeeUserDestinationInterceptor;", "atMostEmployeeUserDestinationInterceptor", "Lru/ozon/app/android/debugmenu/userqa/domain/UserQASegmentInteractor;", "userQASegmentInteractor", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "playerPreferences", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "darkThemeManager", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferences;", "mapPreferences", "Lru/ozon/app/android/debugmenu/deeplink/FintechAutoTestDeeplinkHandler;", "fintechAutoTestDeeplinkHandler", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferences;", "sberPayPreferences", "Lru/ozon/app/android/debugmenu/ozondebugmenu/OzonDebugMenuHelper;", "ozonDebugMenuHelper", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "LLd0/c;", "ozonLimbDiStore", "", "LIZ/a;", "provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/debugmenu/deeplink/EnvironmentDeeplinkHandler;Lru/ozon/app/android/debugmenu/deeplink/FeatureFlagDeeplinkHandler;Lru/ozon/app/android/debugmenu/deeplink/ExtraHeaderDeeplinkHandler;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;Lru/ozon/app/android/navigation/interceptors/AtMostEmployeeUserDestinationInterceptor;Lru/ozon/app/android/debugmenu/userqa/domain/UserQASegmentInteractor;Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;Lru/ozon/app/android/platform/theme/DarkThemeManager;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/MapPreferences;Lru/ozon/app/android/debugmenu/deeplink/FintechAutoTestDeeplinkHandler;Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferences;Lru/ozon/app/android/debugmenu/ozondebugmenu/OzonDebugMenuHelper;Lru/ozon/app/android/storage/debug/DebugToolsService;LLd0/c;)Ljava/util/Set;", "provideDeeplinkHandlersSet", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugNavigationModule {

    @NotNull
    public static final DebugNavigationModule INSTANCE = new DebugNavigationModule();

    private DebugNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsRelease(@NotNull EnvironmentDeeplinkHandler environmentDeeplinkHandler, @NotNull FeatureFlagDeeplinkHandler featureFlagDeeplinkHandler, @NotNull ExtraHeaderDeeplinkHandler extraHeaderDeeplinkHandler, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, @NotNull AtMostEmployeeUserDestinationInterceptor atMostEmployeeUserDestinationInterceptor, @NotNull UserQASegmentInteractor userQASegmentInteractor, @NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull PlayerPreferences playerPreferences, @NotNull DarkThemeManager darkThemeManager, @NotNull MapPreferences mapPreferences, @NotNull FintechAutoTestDeeplinkHandler fintechAutoTestDeeplinkHandler, @NotNull SberPayPreferences sberPayPreferences, @NotNull OzonDebugMenuHelper ozonDebugMenuHelper, @NotNull DebugToolsService debugToolsService, @NotNull c ozonLimbDiStore) {
        Intrinsics.checkNotNullParameter(environmentDeeplinkHandler, "environmentDeeplinkHandler");
        Intrinsics.checkNotNullParameter(featureFlagDeeplinkHandler, "featureFlagDeeplinkHandler");
        Intrinsics.checkNotNullParameter(extraHeaderDeeplinkHandler, "extraHeaderDeeplinkHandler");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(atMostEmployeeUserDestinationInterceptor, "atMostEmployeeUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(userQASegmentInteractor, "userQASegmentInteractor");
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(playerPreferences, "playerPreferences");
        Intrinsics.checkNotNullParameter(darkThemeManager, "darkThemeManager");
        Intrinsics.checkNotNullParameter(mapPreferences, "mapPreferences");
        Intrinsics.checkNotNullParameter(fintechAutoTestDeeplinkHandler, "fintechAutoTestDeeplinkHandler");
        Intrinsics.checkNotNullParameter(sberPayPreferences, "sberPayPreferences");
        Intrinsics.checkNotNullParameter(ozonDebugMenuHelper, "ozonDebugMenuHelper");
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
        return e0.b(new ServiceInternalHeadersTokenDeeplinkHandler(atMostEmployeeUserDestinationInterceptor), new ComposerDebugTokenDeeplinkHandler(atMostEmployeeUserDestinationInterceptor, ozonLimbDiStore), new AbVariantsDeeplinkHandler(atMostQaUserDestinationInterceptor), new VersionDeeplinkHandler(atMostQaUserDestinationInterceptor), new ServiceMeshDeeplinkHandler(atMostQaUserDestinationInterceptor), new TrackerTestModeDeeplinkHandler(atMostQaUserDestinationInterceptor), new WidgetDebugToolsDeeplinkHandler(atMostQaUserDestinationInterceptor), new DebugMenuDeeplinkHandler(atMostQaUserDestinationInterceptor, ozonDebugMenuHelper), new BlockVideoPlayingDeeplinkHandler(playerPreferences, atMostQaUserDestinationInterceptor), new UserQASegmentDeeplinkHandler(userQASegmentInteractor, authDestinationInterceptor), new ThemeDeeplinkHandler(atMostQaUserDestinationInterceptor, darkThemeManager), new HoldGeoProviderDeeplinkHandler(mapPreferences, atMostQaUserDestinationInterceptor), new SberPaySandboxDeeplinkHandler(sberPayPreferences, atMostQaUserDestinationInterceptor), extraHeaderDeeplinkHandler, environmentDeeplinkHandler, featureFlagDeeplinkHandler, fintechAutoTestDeeplinkHandler, new ResolveOverrideDeeplinkHandler(debugToolsService, atMostQaUserDestinationInterceptor));
    }
}
