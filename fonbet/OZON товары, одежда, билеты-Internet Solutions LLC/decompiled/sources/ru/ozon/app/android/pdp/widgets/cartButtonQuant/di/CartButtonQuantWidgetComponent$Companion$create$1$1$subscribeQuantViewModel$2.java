package ru.ozon.app.android.pdp.widgets.cartButtonQuant.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonQuantWidgetComponent$Companion$create$1$1$subscribeQuantViewModel$2 extends AbstractC7737t implements Function0<SubscribeQuantViewModel> {
    final /* synthetic */ CartButtonQuantWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonQuantWidgetComponent$Companion$create$1$1$subscribeQuantViewModel$2(CartButtonQuantWidgetComponent$Companion$create$1$1 cartButtonQuantWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = cartButtonQuantWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SubscribeQuantViewModel invoke() {
        AccountComponentApi accountComponentApi;
        FavoriteCoreComponentApi favoriteCoreComponentApi;
        StorageComponentApi storageComponentApi;
        accountComponentApi = this.this$0.accountComponentApi;
        SubscriptionService subscriptionServiceProvider = accountComponentApi.getSubscriptionServiceProvider();
        favoriteCoreComponentApi = this.this$0.favoriteCoreComponentApi;
        FavoriteInteractor favoriteInteractor = favoriteCoreComponentApi.getFavoriteInteractor();
        storageComponentApi = this.this$0.storageComponentApi;
        return new SubscribeQuantViewModel(subscriptionServiceProvider, favoriteInteractor, storageComponentApi.getAuthStateStorage());
    }
}
