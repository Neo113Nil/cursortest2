package ru.ozon.app.android.ui.switchingbutton.delegates;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;

/* loaded from: classes2.dex */
public final class SwitchingButtonAddToFavoriteActionDelegate_Factory implements e<SwitchingButtonAddToFavoriteActionDelegate> {
    private final a<AdultHandler> adultHandlerProvider;
    private final a<FavoriteManager> favoriteManagerProvider;
    private final a<FavoritesCustomActionHandlerInteractor> interactorProvider;

    public SwitchingButtonAddToFavoriteActionDelegate_Factory(a<AdultHandler> aVar, a<FavoritesCustomActionHandlerInteractor> aVar2, a<FavoriteManager> aVar3) {
        this.adultHandlerProvider = aVar;
        this.interactorProvider = aVar2;
        this.favoriteManagerProvider = aVar3;
    }

    public static SwitchingButtonAddToFavoriteActionDelegate_Factory create(a<AdultHandler> aVar, a<FavoritesCustomActionHandlerInteractor> aVar2, a<FavoriteManager> aVar3) {
        return new SwitchingButtonAddToFavoriteActionDelegate_Factory(aVar, aVar2, aVar3);
    }

    public static SwitchingButtonAddToFavoriteActionDelegate newInstance(AdultHandler adultHandler, FavoritesCustomActionHandlerInteractor favoritesCustomActionHandlerInteractor, FavoriteManager favoriteManager) {
        return new SwitchingButtonAddToFavoriteActionDelegate(adultHandler, favoritesCustomActionHandlerInteractor, favoriteManager);
    }

    @Override // Pc.a
    public SwitchingButtonAddToFavoriteActionDelegate get() {
        return newInstance(this.adultHandlerProvider.get(), this.interactorProvider.get(), this.favoriteManagerProvider.get());
    }
}
