package ru.ozon.app.android.product;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;

/* loaded from: classes13.dex */
public final class TileActionSheetHandlerFactory_Factory implements e<TileActionSheetHandlerFactory> {
    private final a<ActionV2Repository> actionV2RepositoryProvider;
    private final a<FavoriteEventManager> favoriteEventManagerProvider;
    private final a<FavoriteInteractor> favoriteInteractorProvider;
    private final a<FavoritesComposerActionHandler> favoritesComposerActionHandlerProvider;
    private final a<FavoritesListsInteractor> favoritesListsInteractorProvider;
    private final a<SubscriptionService> subscriptionServiceProvider;

    public TileActionSheetHandlerFactory_Factory(a<FavoriteInteractor> aVar, a<FavoriteEventManager> aVar2, a<FavoritesListsInteractor> aVar3, a<ActionV2Repository> aVar4, a<SubscriptionService> aVar5, a<FavoritesComposerActionHandler> aVar6) {
        this.favoriteInteractorProvider = aVar;
        this.favoriteEventManagerProvider = aVar2;
        this.favoritesListsInteractorProvider = aVar3;
        this.actionV2RepositoryProvider = aVar4;
        this.subscriptionServiceProvider = aVar5;
        this.favoritesComposerActionHandlerProvider = aVar6;
    }

    public static TileActionSheetHandlerFactory_Factory create(a<FavoriteInteractor> aVar, a<FavoriteEventManager> aVar2, a<FavoritesListsInteractor> aVar3, a<ActionV2Repository> aVar4, a<SubscriptionService> aVar5, a<FavoritesComposerActionHandler> aVar6) {
        return new TileActionSheetHandlerFactory_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static TileActionSheetHandlerFactory newInstance(FavoriteInteractor favoriteInteractor, FavoriteEventManager favoriteEventManager, FavoritesListsInteractor favoritesListsInteractor, ActionV2Repository actionV2Repository, SubscriptionService subscriptionService, FavoritesComposerActionHandler favoritesComposerActionHandler) {
        return new TileActionSheetHandlerFactory(favoriteInteractor, favoriteEventManager, favoritesListsInteractor, actionV2Repository, subscriptionService, favoritesComposerActionHandler);
    }

    @Override // Pc.a
    public TileActionSheetHandlerFactory get() {
        return newInstance(this.favoriteInteractorProvider.get(), this.favoriteEventManagerProvider.get(), this.favoritesListsInteractorProvider.get(), this.actionV2RepositoryProvider.get(), this.subscriptionServiceProvider.get(), this.favoritesComposerActionHandlerProvider.get());
    }
}
