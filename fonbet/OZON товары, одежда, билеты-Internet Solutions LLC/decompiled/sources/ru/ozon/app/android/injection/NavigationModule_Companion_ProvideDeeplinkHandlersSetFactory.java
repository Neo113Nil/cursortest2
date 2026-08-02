package ru.ozon.app.android.injection;

import GZ.g;
import IZ.a;
import Jb.e;
import Jb.j;
import android.content.Context;
import java.util.Set;
import ru.ozon.app.android.bank.navigation.BankAuthDestinationInterceptor;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.core.navigation.deeplink.storefront.web.WebViewAuthDestinationInterceptor;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.web.webview.ai.CheckAiConversation;
import ru.ozon.app.android.whitelist.common.WhiteListDomainsOzonAppsHandler;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes6.dex */
public final class NavigationModule_Companion_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(Context context, DomainsInteractor domainsInteractor, WebViewAuthDestinationInterceptor webViewAuthDestinationInterceptor, WhiteListDomainsOzonAppsHandler whiteListDomainsOzonAppsHandler, HZ.a aVar, FeatureChecker featureChecker, FeatureService featureService, AuthDestinationInterceptor authDestinationInterceptor, FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler, ExternalFintechSettings externalFintechSettings, ExternalFintechSettings externalFintechSettings2, ExternalFintechSettings externalFintechSettings3, g gVar, Ob0.a aVar2, BankAuthDestinationInterceptor bankAuthDestinationInterceptor, CheckAiConversation checkAiConversation, Ib.a<ru.ozon.android.messenger.api.a> aVar3, Ib.a<ru.ozon.android.messenger.api.a> aVar4, Ib.a<ru.ozon.android.messenger.api.a> aVar5, CartService cartService) {
        Set<a> provideDeeplinkHandlersSet = NavigationModule.INSTANCE.provideDeeplinkHandlersSet(context, domainsInteractor, webViewAuthDestinationInterceptor, whiteListDomainsOzonAppsHandler, aVar, featureChecker, featureService, authDestinationInterceptor, freshPdpInBottomSheetHandler, externalFintechSettings, externalFintechSettings2, externalFintechSettings3, gVar, aVar2, bankAuthDestinationInterceptor, checkAiConversation, aVar3, aVar4, aVar5, cartService);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
