package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonView;
import ru.ozon.app.android.uikit.view.atoms.labelList.LabelListView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class ItemWiseTileBinding implements a {

    @NonNull
    public final AddToCartButtonView cartButtonView;

    @NonNull
    public final PriceAtomView discountView;

    @NonNull
    public final ProductFavoriteMoleculeButtonView favoriteView;

    @NonNull
    public final LabelListView labelListView;

    @NonNull
    public final ProductMediaView mediaView;

    @NonNull
    public final PriceAtomView priceView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View titleView;

    private ItemWiseTileBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AddToCartButtonView addToCartButtonView, @NonNull PriceAtomView priceAtomView, @NonNull ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, @NonNull LabelListView labelListView, @NonNull ProductMediaView productMediaView, @NonNull PriceAtomView priceAtomView2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.cartButtonView = addToCartButtonView;
        this.discountView = priceAtomView;
        this.favoriteView = productFavoriteMoleculeButtonView;
        this.labelListView = labelListView;
        this.mediaView = productMediaView;
        this.priceView = priceAtomView2;
        this.titleView = textAtomV2View;
    }

    @NonNull
    public static ItemWiseTileBinding bind(@NonNull View view) {
        int i11 = R$id.cart_button_view;
        AddToCartButtonView addToCartButtonView = (AddToCartButtonView) C2548q.d(i11, view);
        if (addToCartButtonView != null) {
            i11 = R$id.discount_view;
            PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
            if (priceAtomView != null) {
                i11 = R$id.favorite_view;
                ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) C2548q.d(i11, view);
                if (productFavoriteMoleculeButtonView != null) {
                    i11 = R$id.label_list_view;
                    LabelListView labelListView = (LabelListView) C2548q.d(i11, view);
                    if (labelListView != null) {
                        i11 = R$id.media_view;
                        ProductMediaView productMediaView = (ProductMediaView) C2548q.d(i11, view);
                        if (productMediaView != null) {
                            i11 = R$id.price_view;
                            PriceAtomView priceAtomView2 = (PriceAtomView) C2548q.d(i11, view);
                            if (priceAtomView2 != null) {
                                i11 = R$id.title_view;
                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View != null) {
                                    return new ItemWiseTileBinding((ConstraintLayout) view, addToCartButtonView, priceAtomView, productFavoriteMoleculeButtonView, labelListView, productMediaView, priceAtomView2, textAtomV2View);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemWiseTileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemWiseTileBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_wise_tile, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
