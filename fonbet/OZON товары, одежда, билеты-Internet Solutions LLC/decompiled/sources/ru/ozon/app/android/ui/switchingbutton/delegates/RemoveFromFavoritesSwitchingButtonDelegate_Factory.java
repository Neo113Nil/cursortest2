package ru.ozon.app.android.ui.switchingbutton.delegates;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor;

/* loaded from: classes2.dex */
public final class RemoveFromFavoritesSwitchingButtonDelegate_Factory implements e<RemoveFromFavoritesSwitchingButtonDelegate> {
    private final a<FavoritesCustomActionHandlerInteractor> interactorProvider;

    public RemoveFromFavoritesSwitchingButtonDelegate_Factory(a<FavoritesCustomActionHandlerInteractor> aVar) {
        this.interactorProvider = aVar;
    }

    public static RemoveFromFavoritesSwitchingButtonDelegate_Factory create(a<FavoritesCustomActionHandlerInteractor> aVar) {
        return new RemoveFromFavoritesSwitchingButtonDelegate_Factory(aVar);
    }

    public static RemoveFromFavoritesSwitchingButtonDelegate newInstance(FavoritesCustomActionHandlerInteractor favoritesCustomActionHandlerInteractor) {
        return new RemoveFromFavoritesSwitchingButtonDelegate(favoritesCustomActionHandlerInteractor);
    }

    @Override // Pc.a
    public RemoveFromFavoritesSwitchingButtonDelegate get() {
        return newInstance(this.interactorProvider.get());
    }
}
