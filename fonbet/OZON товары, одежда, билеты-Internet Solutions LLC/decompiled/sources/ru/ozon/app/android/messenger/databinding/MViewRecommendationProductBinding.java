package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.IconButtonView;

/* loaded from: classes12.dex */
public final class MViewRecommendationProductBinding implements a {

    @NonNull
    public final Barrier buttonBarrier;

    @NonNull
    public final IconButtonView productCart;

    @NonNull
    public final IconView productCartApplay;

    @NonNull
    public final IconView productImage;

    @NonNull
    public final PriceAtomView productPrice;

    @NonNull
    public final TextAtomV2View productTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private MViewRecommendationProductBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull IconButtonView iconButtonView, @NonNull IconView iconView, @NonNull IconView iconView2, @NonNull PriceAtomView priceAtomView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.buttonBarrier = barrier;
        this.productCart = iconButtonView;
        this.productCartApplay = iconView;
        this.productImage = iconView2;
        this.productPrice = priceAtomView;
        this.productTitle = textAtomV2View;
    }

    @NonNull
    public static MViewRecommendationProductBinding bind(@NonNull View view) {
        int i11 = R$id.buttonBarrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.productCart;
            IconButtonView iconButtonView = (IconButtonView) C2548q.d(i11, view);
            if (iconButtonView != null) {
                i11 = R$id.productCartApplay;
                IconView iconView = (IconView) C2548q.d(i11, view);
                if (iconView != null) {
                    i11 = R$id.productImage;
                    IconView iconView2 = (IconView) C2548q.d(i11, view);
                    if (iconView2 != null) {
                        i11 = R$id.productPrice;
                        PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                        if (priceAtomView != null) {
                            i11 = R$id.productTitle;
                            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View != null) {
                                return new MViewRecommendationProductBinding((ConstraintLayout) view, barrier, iconButtonView, iconView, iconView2, priceAtomView, textAtomV2View);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MViewRecommendationProductBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_view_recommendation_product, viewGroup, false);
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
