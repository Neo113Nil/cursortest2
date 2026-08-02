package ru.ozon.app.android.favorites.domain.actionhandlers;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;

/* loaded from: classes12.dex */
public final class FavoriteComposerActionExecutor_Factory implements e<FavoriteComposerActionExecutor> {
    private final a<FavoriteManager> favoriteManagerProvider;
    private final a<FavoritesServiceProvider> favoritesServiceProvider;

    public FavoriteComposerActionExecutor_Factory(a<FavoritesServiceProvider> aVar, a<FavoriteManager> aVar2) {
        this.favoritesServiceProvider = aVar;
        this.favoriteManagerProvider = aVar2;
    }

    public static FavoriteComposerActionExecutor_Factory create(a<FavoritesServiceProvider> aVar, a<FavoriteManager> aVar2) {
        return new FavoriteComposerActionExecutor_Factory(aVar, aVar2);
    }

    public static FavoriteComposerActionExecutor newInstance(FavoritesServiceProvider favoritesServiceProvider, FavoriteManager favoriteManager) {
        return new FavoriteComposerActionExecutor(favoritesServiceProvider, favoriteManager);
    }

    @Override // Pc.a
    public FavoriteComposerActionExecutor get() {
        return newInstance(this.favoritesServiceProvider.get(), this.favoriteManagerProvider.get());
    }
}
