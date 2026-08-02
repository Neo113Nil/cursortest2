package ru.ozon.app.android.universalwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;

/* loaded from: classes2.dex */
public final class ProductItemFavoriteMoleculeBinding implements a {

    @NonNull
    public final ProductFavoriteMoleculeButtonView productFavMoleculeButton;

    @NonNull
    private final ProductFavoriteMoleculeButtonView rootView;

    private ProductItemFavoriteMoleculeBinding(@NonNull ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, @NonNull ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView2) {
        this.rootView = productFavoriteMoleculeButtonView;
        this.productFavMoleculeButton = productFavoriteMoleculeButtonView2;
    }

    @NonNull
    public static ProductItemFavoriteMoleculeBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) view;
        return new ProductItemFavoriteMoleculeBinding(productFavoriteMoleculeButtonView, productFavoriteMoleculeButtonView);
    }

    @Override // X4.a
    @NonNull
    public ProductFavoriteMoleculeButtonView getRoot() {
        return this.rootView;
    }
}
