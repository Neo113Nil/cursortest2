package ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;

/* loaded from: classes2.dex */
public final class TopRightButtonsViewHolderFactory_Factory implements e<TopRightButtonsViewHolderFactory> {
    private final a<ProductFavoriteDelegateProvider> productFavDelegateProvider;

    public TopRightButtonsViewHolderFactory_Factory(a<ProductFavoriteDelegateProvider> aVar) {
        this.productFavDelegateProvider = aVar;
    }

    public static TopRightButtonsViewHolderFactory_Factory create(a<ProductFavoriteDelegateProvider> aVar) {
        return new TopRightButtonsViewHolderFactory_Factory(aVar);
    }

    public static TopRightButtonsViewHolderFactory newInstance(ProductFavoriteDelegateProvider productFavoriteDelegateProvider) {
        return new TopRightButtonsViewHolderFactory(productFavoriteDelegateProvider);
    }

    @Override // Pc.a
    public TopRightButtonsViewHolderFactory get() {
        return newInstance(this.productFavDelegateProvider.get());
    }
}
