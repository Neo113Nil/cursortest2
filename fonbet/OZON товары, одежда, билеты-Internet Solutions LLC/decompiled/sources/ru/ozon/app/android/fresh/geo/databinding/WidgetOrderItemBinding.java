package ru.ozon.app.android.fresh.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.app.android.fresh.geo.ui.molecules.ProductFavoriteExpressMoleculeView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetOrderItemBinding implements a {

    @NonNull
    public final BadgeView badgeV;

    @NonNull
    public final ProductFavoriteExpressMoleculeView favBtn;

    @NonNull
    public final ImageView itemIv;

    @NonNull
    public final TextAtomView nameTAV;

    @NonNull
    public final View orderItemBottomSeparator;

    @NonNull
    public final TextAtomView priceDetailsTAV;

    @NonNull
    public final TextAtomView priceTAV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetOrderItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull ProductFavoriteExpressMoleculeView productFavoriteExpressMoleculeView, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView, @NonNull View view, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.badgeV = badgeView;
        this.favBtn = productFavoriteExpressMoleculeView;
        this.itemIv = imageView;
        this.nameTAV = textAtomView;
        this.orderItemBottomSeparator = view;
        this.priceDetailsTAV = textAtomView2;
        this.priceTAV = textAtomView3;
    }

    @NonNull
    public static WidgetOrderItemBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badgeV;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.favBtn;
            ProductFavoriteExpressMoleculeView productFavoriteExpressMoleculeView = (ProductFavoriteExpressMoleculeView) C2548q.d(i11, view);
            if (productFavoriteExpressMoleculeView != null) {
                i11 = R$id.itemIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.nameTAV;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null && (d11 = C2548q.d((i11 = R$id.orderItemBottomSeparator), view)) != null) {
                        i11 = R$id.priceDetailsTAV;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            i11 = R$id.priceTAV;
                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView3 != null) {
                                return new WidgetOrderItemBinding((ConstraintLayout) view, badgeView, productFavoriteExpressMoleculeView, imageView, textAtomView, d11, textAtomView2, textAtomView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
