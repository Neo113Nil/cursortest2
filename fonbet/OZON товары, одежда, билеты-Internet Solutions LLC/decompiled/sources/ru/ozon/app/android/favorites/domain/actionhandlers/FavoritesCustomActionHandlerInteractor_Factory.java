package ru.ozon.app.android.favorites.domain.actionhandlers;

import Jb.e;
import Pc.a;

/* loaded from: classes12.dex */
public final class FavoritesCustomActionHandlerInteractor_Factory implements e<FavoritesCustomActionHandlerInteractor> {
    private final a<FavoriteComposerActionExecutor> favoriteActionExecutorProvider;

    public FavoritesCustomActionHandlerInteractor_Factory(a<FavoriteComposerActionExecutor> aVar) {
        this.favoriteActionExecutorProvider = aVar;
    }

    public static FavoritesCustomActionHandlerInteractor_Factory create(a<FavoriteComposerActionExecutor> aVar) {
        return new FavoritesCustomActionHandlerInteractor_Factory(aVar);
    }

    public static FavoritesCustomActionHandlerInteractor newInstance(FavoriteComposerActionExecutor favoriteComposerActionExecutor) {
        return new FavoritesCustomActionHandlerInteractor(favoriteComposerActionExecutor);
    }

    @Override // Pc.a
    public FavoritesCustomActionHandlerInteractor get() {
        return newInstance(this.favoriteActionExecutorProvider.get());
    }
}
