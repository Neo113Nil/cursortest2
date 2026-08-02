package ru.ozon.app.android.favorites.domain.actionhandlers;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes12.dex */
public final class FavoritesComposerActionHandler_Factory implements e<FavoritesComposerActionHandler> {
    private final a<ActionV2Repository> actionV2RepositoryProvider;
    private final a<FavoriteEventManager> favoriteEventManagerProvider;
    private final a<FavoriteManager> favoriteManagerProvider;
    private final a<FeatureChecker> featureCheckerProvider;
    private final a<WishlistEventManager> wishlistEventManagerProvider;

    public FavoritesComposerActionHandler_Factory(a<ActionV2Repository> aVar, a<FavoriteEventManager> aVar2, a<FavoriteManager> aVar3, a<WishlistEventManager> aVar4, a<FeatureChecker> aVar5) {
        this.actionV2RepositoryProvider = aVar;
        this.favoriteEventManagerProvider = aVar2;
        this.favoriteManagerProvider = aVar3;
        this.wishlistEventManagerProvider = aVar4;
        this.featureCheckerProvider = aVar5;
    }

    public static FavoritesComposerActionHandler_Factory create(a<ActionV2Repository> aVar, a<FavoriteEventManager> aVar2, a<FavoriteManager> aVar3, a<WishlistEventManager> aVar4, a<FeatureChecker> aVar5) {
        return new FavoritesComposerActionHandler_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static FavoritesComposerActionHandler newInstance(ActionV2Repository actionV2Repository, FavoriteEventManager favoriteEventManager, FavoriteManager favoriteManager, WishlistEventManager wishlistEventManager, FeatureChecker featureChecker) {
        return new FavoritesComposerActionHandler(actionV2Repository, favoriteEventManager, favoriteManager, wishlistEventManager, featureChecker);
    }

    @Override // Pc.a
    public FavoritesComposerActionHandler get() {
        return newInstance(this.actionV2RepositoryProvider.get(), this.favoriteEventManagerProvider.get(), this.favoriteManagerProvider.get(), this.wishlistEventManagerProvider.get(), this.featureCheckerProvider.get());
    }
}
