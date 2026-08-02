package ru.ozon.app.android.travel.feature.general.order.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.feature.general.order.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemTravelModalPriceDetailInformationV3DetailsBinding implements a {

    @NonNull
    public final TextAtomView detailsTitleTAV;

    @NonNull
    public final TextAtomView detailsTotalPriceTAV;

    @NonNull
    public final RecyclerView pricesInformationRV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemTravelModalPriceDetailInformationV3DetailsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.detailsTitleTAV = textAtomView;
        this.detailsTotalPriceTAV = textAtomView2;
        this.pricesInformationRV = recyclerView;
    }

    @NonNull
    public static ItemTravelModalPriceDetailInformationV3DetailsBinding bind(@NonNull View view) {
        int i11 = R$id.detailsTitleTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.detailsTotalPriceTAV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                i11 = R$id.pricesInformationRV;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    return new ItemTravelModalPriceDetailInformationV3DetailsBinding((ConstraintLayout) view, textAtomView, textAtomView2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelModalPriceDetailInformationV3DetailsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_modal_price_detail_information_v3_details, viewGroup, false);
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
