package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WidgetImagePlaceholderComponent$Companion$getInstance$1$1$widgetImagePlaceholderAdapter$2 extends AbstractC7737t implements Function0<WidgetImagePlaceholderAdapter> {
    final /* synthetic */ WidgetImagePlaceholderComponent$Companion$getInstance$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetImagePlaceholderComponent$Companion$getInstance$1$1$widgetImagePlaceholderAdapter$2(WidgetImagePlaceholderComponent$Companion$getInstance$1$1 widgetImagePlaceholderComponent$Companion$getInstance$1$1) {
        super(0);
        this.this$0 = widgetImagePlaceholderComponent$Companion$getInstance$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WidgetImagePlaceholderAdapter invoke() {
        CartServiceApi cartServiceApi;
        NetworkComponentApi networkComponentApi;
        FavoriteCoreComponentApi favoriteCoreComponentApi;
        NetworkComponentApi networkComponentApi2;
        cartServiceApi = this.this$0.getCartServiceApi();
        CartService cartService = cartServiceApi.getCartService();
        networkComponentApi = this.this$0.getNetworkComponentApi();
        JsonParser jsonDeserializer = networkComponentApi.getJsonDeserializer();
        favoriteCoreComponentApi = this.this$0.getFavoriteCoreComponentApi();
        FavoriteInteractor favoriteInteractor = favoriteCoreComponentApi.getFavoriteInteractor();
        networkComponentApi2 = this.this$0.getNetworkComponentApi();
        return new WidgetImagePlaceholderAdapter(cartService, favoriteInteractor, jsonDeserializer, networkComponentApi2.getFeatureChecker());
    }
}
