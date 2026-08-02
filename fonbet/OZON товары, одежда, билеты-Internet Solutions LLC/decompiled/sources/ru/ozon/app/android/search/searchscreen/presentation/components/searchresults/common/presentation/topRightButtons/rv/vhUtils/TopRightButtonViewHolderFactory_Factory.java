package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProcessorProvider;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;

/* loaded from: classes13.dex */
public final class TopRightButtonViewHolderFactory_Factory implements e<TopRightButtonViewHolderFactory> {
    private final a<ProductFavoriteDelegateProvider> productFavMoleculeDelegateProvider;
    private final a<SelectedProcessorProvider> selectedProcessorProvider;
    private final a<SelectedProductsManager> selectedProductsManagerProvider;

    public TopRightButtonViewHolderFactory_Factory(a<ProductFavoriteDelegateProvider> aVar, a<SelectedProductsManager> aVar2, a<SelectedProcessorProvider> aVar3) {
        this.productFavMoleculeDelegateProvider = aVar;
        this.selectedProductsManagerProvider = aVar2;
        this.selectedProcessorProvider = aVar3;
    }

    public static TopRightButtonViewHolderFactory_Factory create(a<ProductFavoriteDelegateProvider> aVar, a<SelectedProductsManager> aVar2, a<SelectedProcessorProvider> aVar3) {
        return new TopRightButtonViewHolderFactory_Factory(aVar, aVar2, aVar3);
    }

    public static TopRightButtonViewHolderFactory newInstance(ProductFavoriteDelegateProvider productFavoriteDelegateProvider, SelectedProductsManager selectedProductsManager, SelectedProcessorProvider selectedProcessorProvider) {
        return new TopRightButtonViewHolderFactory(productFavoriteDelegateProvider, selectedProductsManager, selectedProcessorProvider);
    }

    @Override // Pc.a
    public TopRightButtonViewHolderFactory get() {
        return newInstance(this.productFavMoleculeDelegateProvider.get(), this.selectedProductsManagerProvider.get(), this.selectedProcessorProvider.get());
    }
}
