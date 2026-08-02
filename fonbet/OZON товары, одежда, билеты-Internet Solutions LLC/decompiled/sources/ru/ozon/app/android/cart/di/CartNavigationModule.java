package ru.ozon.app.android.cart.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.CartShareModalDeeplinkHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.interceptor.CartDeeplinkInterceptor;
import ru.ozon.app.android.cart.deeplink.CartDeeplinkHandler;
import ru.ozon.app.android.cart.deeplink.DeliveryOptionsDeeplinkHandler;
import ru.ozon.app.android.cart.deeplink.FamilyCartDeeplinkHandler;
import ru.ozon.app.android.cart.deeplink.PrescriptionsDeeplinkHandler;
import ru.ozon.app.android.cart.deeplink.RecommendationsInCartDeeplinkHandler;
import ru.ozon.app.android.cart.deeplink.RecommendationsInCartMainDeeplinkHandler;
import ru.ozon.app.android.cart.deeplink.UpdateCartDeeplinkHandler;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/di/CartNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "Lru/ozon/app/android/cart/common/interceptor/CartDeeplinkInterceptor;", "cartDeeplinkInterceptor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/utils/AppType;", "appType", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;Lru/ozon/app/android/cart/common/interceptor/CartDeeplinkInterceptor;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/utils/AppType;)Ljava/util/Set;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartNavigationModule {

    @NotNull
    public static final CartNavigationModule INSTANCE = new CartNavigationModule();

    private CartNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet(@NotNull CartService cartService, @NotNull JsonParser jsonDeserializer, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, @NotNull CartDeeplinkInterceptor cartDeeplinkInterceptor, @NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(cartDeeplinkInterceptor, "cartDeeplinkInterceptor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return e0.b(new DeliveryOptionsDeeplinkHandler(), new PrescriptionsDeeplinkHandler(), new CartShareModalDeeplinkHandler(), new UpdateCartDeeplinkHandler(cartService, jsonDeserializer, atMostQaUserDestinationInterceptor), new CartDeeplinkHandler(cartDeeplinkInterceptor, featureChecker, featureService, appType), new RecommendationsInCartDeeplinkHandler(), new RecommendationsInCartMainDeeplinkHandler(featureChecker), new FamilyCartDeeplinkHandler(cartDeeplinkInterceptor));
    }
}
