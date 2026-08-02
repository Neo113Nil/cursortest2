package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MNouiViewRecommendationProductBinding implements a {

    @NonNull
    public final IconView productImage;

    @NonNull
    public final PriceAtomView productPrice;

    @NonNull
    public final TextAtomV2View productTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private MNouiViewRecommendationProductBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull PriceAtomView priceAtomView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.productImage = iconView;
        this.productPrice = priceAtomView;
        this.productTitle = textAtomV2View;
    }

    @NonNull
    public static MNouiViewRecommendationProductBinding bind(@NonNull View view) {
        int i11 = R$id.productImage;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.productPrice;
            PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
            if (priceAtomView != null) {
                i11 = R$id.productTitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new MNouiViewRecommendationProductBinding((ConstraintLayout) view, iconView, priceAtomView, textAtomV2View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MNouiViewRecommendationProductBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_noui_view_recommendation_product, viewGroup, false);
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
