package ru.ozon.app.android.pdp.widgets.cartButtonV4.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonWidgetComponent$Companion$create$1$1$subscribeViewModel$2 extends AbstractC7737t implements Function0<SubscribeViewModel> {
    final /* synthetic */ CartButtonWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonWidgetComponent$Companion$create$1$1$subscribeViewModel$2(CartButtonWidgetComponent$Companion$create$1$1 cartButtonWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = cartButtonWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SubscribeViewModel invoke() {
        AccountComponentApi accountComponentApi;
        FavoriteCoreComponentApi favoriteCoreComponentApi;
        StorageComponentApi storageComponentApi;
        ComposerComponentApi composerComponentApi;
        accountComponentApi = this.this$0.accountComponentApi;
        SubscriptionService subscriptionServiceProvider = accountComponentApi.getSubscriptionServiceProvider();
        favoriteCoreComponentApi = this.this$0.favoriteCoreComponentApi;
        FavoriteInteractor favoriteInteractor = favoriteCoreComponentApi.getFavoriteInteractor();
        storageComponentApi = this.this$0.storageComponentApi;
        AuthStateStorage authStateStorage = storageComponentApi.getAuthStateStorage();
        composerComponentApi = this.this$0.composerComponentApi;
        return new SubscribeViewModel(subscriptionServiceProvider, favoriteInteractor, authStateStorage, composerComponentApi.getComposerNavigator());
    }
}
