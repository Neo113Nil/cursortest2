package ru.ozon.app.android.debugmenu.di;

import IZ.a;
import Jb.e;
import Jb.j;
import Ld0.c;
import java.util.Set;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferences;
import ru.ozon.app.android.debugmenu.deeplink.EnvironmentDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.ExtraHeaderDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.FeatureFlagDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.FintechAutoTestDeeplinkHandler;
import ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelper;
import ru.ozon.app.android.debugmenu.userqa.domain.UserQASegmentInteractor;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferences;
import ru.ozon.app.android.navigation.interceptors.AtMostEmployeeUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;

/* loaded from: classes6.dex */
public final class DebugNavigationModule_ProvideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsReleaseFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsRelease(EnvironmentDeeplinkHandler environmentDeeplinkHandler, FeatureFlagDeeplinkHandler featureFlagDeeplinkHandler, ExtraHeaderDeeplinkHandler extraHeaderDeeplinkHandler, AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, AtMostEmployeeUserDestinationInterceptor atMostEmployeeUserDestinationInterceptor, UserQASegmentInteractor userQASegmentInteractor, AuthDestinationInterceptor authDestinationInterceptor, PlayerPreferences playerPreferences, DarkThemeManager darkThemeManager, MapPreferences mapPreferences, FintechAutoTestDeeplinkHandler fintechAutoTestDeeplinkHandler, SberPayPreferences sberPayPreferences, OzonDebugMenuHelper ozonDebugMenuHelper, DebugToolsService debugToolsService, c cVar) {
        Set<a> provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsRelease = DebugNavigationModule.provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsRelease(environmentDeeplinkHandler, featureFlagDeeplinkHandler, extraHeaderDeeplinkHandler, atMostQaUserDestinationInterceptor, atMostEmployeeUserDestinationInterceptor, userQASegmentInteractor, authDestinationInterceptor, playerPreferences, darkThemeManager, mapPreferences, fintechAutoTestDeeplinkHandler, sberPayPreferences, ozonDebugMenuHelper, debugToolsService, cVar);
        j.d(provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsRelease);
        return provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsRelease;
    }
}
