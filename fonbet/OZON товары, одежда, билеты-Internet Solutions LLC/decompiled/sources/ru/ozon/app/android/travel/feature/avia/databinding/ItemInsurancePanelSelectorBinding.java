package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ItemInsurancePanelSelectorBinding implements a {

    @NonNull
    public final BadgeView insuranceBV;

    @NonNull
    public final RecyclerView insuranceBenefitsRV;

    @NonNull
    public final BadgeView insuranceDetailedConditions;

    @NonNull
    public final PriceView insurancePricePV;

    @NonNull
    public final TextAtomView insuranceTitleTAV;

    @NonNull
    public final ImageView logoIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView subTitleTAV;

    @NonNull
    public final View view;

    private ItemInsurancePanelSelectorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull RecyclerView recyclerView, @NonNull BadgeView badgeView2, @NonNull PriceView priceView, @NonNull TextAtomView textAtomView, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView2, @NonNull View view) {
        this.rootView = constraintLayout;
        this.insuranceBV = badgeView;
        this.insuranceBenefitsRV = recyclerView;
        this.insuranceDetailedConditions = badgeView2;
        this.insurancePricePV = priceView;
        this.insuranceTitleTAV = textAtomView;
        this.logoIv = imageView;
        this.subTitleTAV = textAtomView2;
        this.view = view;
    }

    @NonNull
    public static ItemInsurancePanelSelectorBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.insuranceBV;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.insuranceBenefitsRV;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.insuranceDetailedConditions;
                BadgeView badgeView2 = (BadgeView) C2548q.d(i11, view);
                if (badgeView2 != null) {
                    i11 = R$id.insurancePricePV;
                    PriceView priceView = (PriceView) C2548q.d(i11, view);
                    if (priceView != null) {
                        i11 = R$id.insuranceTitleTAV;
                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView != null) {
                            i11 = R$id.logoIv;
                            ImageView imageView = (ImageView) C2548q.d(i11, view);
                            if (imageView != null) {
                                i11 = R$id.subTitleTAV;
                                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView2 != null && (d11 = C2548q.d((i11 = R$id.view), view)) != null) {
                                    return new ItemInsurancePanelSelectorBinding((ConstraintLayout) view, badgeView, recyclerView, badgeView2, priceView, textAtomView, imageView, textAtomView2, d11);
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
    public static ItemInsurancePanelSelectorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_insurance_panel_selector, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
