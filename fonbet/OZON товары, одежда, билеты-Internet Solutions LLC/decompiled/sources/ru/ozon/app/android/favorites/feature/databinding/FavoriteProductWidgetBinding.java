package ru.ozon.app.android.favorites.feature.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;

/* loaded from: classes12.dex */
public final class FavoriteProductWidgetBinding implements a {

    @NonNull
    public final ProductFavoriteMoleculeButtonView favoriteProduct;

    @NonNull
    private final ProductFavoriteMoleculeButtonView rootView;

    private FavoriteProductWidgetBinding(@NonNull ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, @NonNull ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView2) {
        this.rootView = productFavoriteMoleculeButtonView;
        this.favoriteProduct = productFavoriteMoleculeButtonView2;
    }

    @NonNull
    public static FavoriteProductWidgetBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) view;
        return new FavoriteProductWidgetBinding(productFavoriteMoleculeButtonView, productFavoriteMoleculeButtonView);
    }

    @Override // X4.a
    @NonNull
    public ProductFavoriteMoleculeButtonView getRoot() {
        return this.rootView;
    }
}
