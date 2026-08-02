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
public final class ItemTravelModalPriceDetailInformationV3SectionBinding implements a {

    @NonNull
    public final RecyclerView priceDetailsRV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView sectionSubtitleTAV;

    @NonNull
    public final TextAtomView sectionTitleTAV;

    @NonNull
    public final TextAtomView sectionTotalPriceTAV;

    private ItemTravelModalPriceDetailInformationV3SectionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.priceDetailsRV = recyclerView;
        this.sectionSubtitleTAV = textAtomView;
        this.sectionTitleTAV = textAtomView2;
        this.sectionTotalPriceTAV = textAtomView3;
    }

    @NonNull
    public static ItemTravelModalPriceDetailInformationV3SectionBinding bind(@NonNull View view) {
        int i11 = R$id.priceDetailsRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.sectionSubtitleTAV;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.sectionTitleTAV;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    i11 = R$id.sectionTotalPriceTAV;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView3 != null) {
                        return new ItemTravelModalPriceDetailInformationV3SectionBinding((ConstraintLayout) view, recyclerView, textAtomView, textAtomView2, textAtomView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelModalPriceDetailInformationV3SectionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_modal_price_detail_information_v3_section, viewGroup, false);
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
