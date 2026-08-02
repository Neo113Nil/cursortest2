package ru.ozon.app.android.search.widgets.brandList.di;

import GZ.g;
import Pc.a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.search.widgets.brandList.di.BrandListComponent$Companion$create$1$1;
import ru.ozon.app.android.search.widgets.brandList.presentation.BrandListViewModel;
import ru.ozon.app.android.seller.di.SisBrandFavoriteComponentApi;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"ru/ozon/app/android/search/widgets/brandList/di/BrandListComponent$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/brandList/di/BrandListComponent;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "getNavigationComponentApi", "()Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/seller/di/SisBrandFavoriteComponentApi;", "sisBrandFavoriteComponentApi", "Lru/ozon/app/android/seller/di/SisBrandFavoriteComponentApi;", "getSisBrandFavoriteComponentApi", "()Lru/ozon/app/android/seller/di/SisBrandFavoriteComponentApi;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "favoritesDataComponentApi", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "getFavoritesDataComponentApi", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "LPc/a;", "Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListViewModel;", "viewModel", "LPc/a;", "getViewModel", "()LPc/a;", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;", "getSisBrandFavoriteButtonDelegateFactory", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BrandListComponent$Companion$create$1$1 implements BrandListComponent {
    private final FavoritesDataComponentApi favoritesDataComponentApi;
    private final NavigationComponentApi navigationComponentApi;
    private final SisBrandFavoriteComponentApi sisBrandFavoriteComponentApi;
    private final a<BrandListViewModel> viewModel = new a() { // from class: nI.a
        @Override // Pc.a
        public final Object get() {
            BrandListViewModel viewModel$lambda$0;
            viewModel$lambda$0 = BrandListComponent$Companion$create$1$1.viewModel$lambda$0(BrandListComponent$Companion$create$1$1.this);
            return viewModel$lambda$0;
        }
    };

    BrandListComponent$Companion$create$1$1(C7475g c7475g) {
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.sisBrandFavoriteComponentApi = (SisBrandFavoriteComponentApi) c7475g.getComponent(SisBrandFavoriteComponentApi.class);
        this.favoritesDataComponentApi = (FavoritesDataComponentApi) c7475g.getComponent(FavoritesDataComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BrandListViewModel viewModel$lambda$0(BrandListComponent$Companion$create$1$1 brandListComponent$Companion$create$1$1) {
        return new BrandListViewModel(brandListComponent$Companion$create$1$1.favoritesDataComponentApi.getFavoriteStateStore());
    }

    @Override // ru.ozon.app.android.search.widgets.brandList.di.BrandListComponent
    public g getRouter() {
        return this.navigationComponentApi.getOzonRouter();
    }

    @Override // ru.ozon.app.android.search.widgets.brandList.di.BrandListComponent
    public ComposeSisBrandFavoriteButtonDelegateFactory getSisBrandFavoriteButtonDelegateFactory() {
        return this.sisBrandFavoriteComponentApi.getComposeSisBrandFavoriteButtonDelegateFactory();
    }

    @Override // ru.ozon.app.android.search.widgets.brandList.di.BrandListComponent
    public a<BrandListViewModel> getViewModel() {
        return this.viewModel;
    }
}
