package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import GZ.g;
import Jb.e;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

/* loaded from: classes12.dex */
public final class SellerHeaderViewModel_Factory implements e<SellerHeaderViewModel> {
    private final Pc.a<ActionV2Repository> actionV2RepositoryProvider;
    private final Pc.a<AuthStateStorage> authStateStorageProvider;
    private final Pc.a<g> routerProvider;
    private final Pc.a<SellerFavoriteService> sellerFavoriteServiceProvider;

    public SellerHeaderViewModel_Factory(Pc.a<ActionV2Repository> aVar, Pc.a<AuthStateStorage> aVar2, Pc.a<SellerFavoriteService> aVar3, Pc.a<g> aVar4) {
        this.actionV2RepositoryProvider = aVar;
        this.authStateStorageProvider = aVar2;
        this.sellerFavoriteServiceProvider = aVar3;
        this.routerProvider = aVar4;
    }

    public static SellerHeaderViewModel_Factory create(Pc.a<ActionV2Repository> aVar, Pc.a<AuthStateStorage> aVar2, Pc.a<SellerFavoriteService> aVar3, Pc.a<g> aVar4) {
        return new SellerHeaderViewModel_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static SellerHeaderViewModel newInstance(ActionV2Repository actionV2Repository, AuthStateStorage authStateStorage, SellerFavoriteService sellerFavoriteService, g gVar) {
        return new SellerHeaderViewModel(actionV2Repository, authStateStorage, sellerFavoriteService, gVar);
    }

    @Override // Pc.a
    public SellerHeaderViewModel get() {
        return newInstance(this.actionV2RepositoryProvider.get(), this.authStateStorageProvider.get(), this.sellerFavoriteServiceProvider.get(), this.routerProvider.get());
    }
}
