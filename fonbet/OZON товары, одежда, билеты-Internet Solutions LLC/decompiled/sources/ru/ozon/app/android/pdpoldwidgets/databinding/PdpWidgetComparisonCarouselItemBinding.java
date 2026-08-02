package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class PdpWidgetComparisonCarouselItemBinding implements a {

    @NonNull
    public final BadgeView badgeContainerBv;

    @NonNull
    public final SingleAtom buttonSa;

    @NonNull
    public final TextView collapsedStateIndexTV;

    @NonNull
    public final ConstraintLayout compareProductsCL;

    @NonNull
    public final ProductFavoriteMoleculeButtonView favouriteButtonPFMBV;

    @NonNull
    public final TextView indexTV;

    @NonNull
    public final PriceView pricePv;

    @NonNull
    public final ImageView productImageIV;

    @NonNull
    public final TextAtomV2View productTitleTav;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final IconButtonV3View secondSmallButtonSIBV;

    @NonNull
    public final SmallIconButtonView subscribeButtonSibv;

    private PdpWidgetComparisonCarouselItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull SingleAtom singleAtom, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, @NonNull TextView textView2, @NonNull PriceView priceView, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View, @NonNull IconButtonV3View iconButtonV3View, @NonNull SmallIconButtonView smallIconButtonView) {
        this.rootView = constraintLayout;
        this.badgeContainerBv = badgeView;
        this.buttonSa = singleAtom;
        this.collapsedStateIndexTV = textView;
        this.compareProductsCL = constraintLayout2;
        this.favouriteButtonPFMBV = productFavoriteMoleculeButtonView;
        this.indexTV = textView2;
        this.pricePv = priceView;
        this.productImageIV = imageView;
        this.productTitleTav = textAtomV2View;
        this.secondSmallButtonSIBV = iconButtonV3View;
        this.subscribeButtonSibv = smallIconButtonView;
    }

    @NonNull
    public static PdpWidgetComparisonCarouselItemBinding bind(@NonNull View view) {
        int i11 = R$id.badgeContainerBv;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.buttonSa;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                i11 = R$id.collapsedStateIndexTV;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.favouriteButtonPFMBV;
                    ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) C2548q.d(i11, view);
                    if (productFavoriteMoleculeButtonView != null) {
                        i11 = R$id.indexTV;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            i11 = R$id.pricePv;
                            PriceView priceView = (PriceView) C2548q.d(i11, view);
                            if (priceView != null) {
                                i11 = R$id.productImageIV;
                                ImageView imageView = (ImageView) C2548q.d(i11, view);
                                if (imageView != null) {
                                    i11 = R$id.productTitleTav;
                                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View != null) {
                                        i11 = R$id.secondSmallButtonSIBV;
                                        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                                        if (iconButtonV3View != null) {
                                            i11 = R$id.subscribeButtonSibv;
                                            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                                            if (smallIconButtonView != null) {
                                                return new PdpWidgetComparisonCarouselItemBinding(constraintLayout, badgeView, singleAtom, textView, constraintLayout, productFavoriteMoleculeButtonView, textView2, priceView, imageView, textAtomV2View, iconButtonV3View, smallIconButtonView);
                                            }
                                        }
                                    }
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
    public static PdpWidgetComparisonCarouselItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_comparison_carousel_item, viewGroup, false);
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
