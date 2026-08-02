package ru.ozon.app.android.cart.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.interceptor.CartDeeplinkInterceptor;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class CartNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(CartService cartService, JsonParser jsonParser, AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, CartDeeplinkInterceptor cartDeeplinkInterceptor, FeatureChecker featureChecker, FeatureService featureService, AppType appType) {
        Set<a> provideDeeplinkHandlersSet = CartNavigationModule.provideDeeplinkHandlersSet(cartService, jsonParser, atMostQaUserDestinationInterceptor, cartDeeplinkInterceptor, featureChecker, featureService, appType);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
