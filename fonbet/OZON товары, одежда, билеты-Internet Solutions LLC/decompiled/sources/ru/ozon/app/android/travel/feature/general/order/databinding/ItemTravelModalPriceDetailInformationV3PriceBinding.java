package ru.ozon.app.android.travel.feature.general.order.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.feature.general.order.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class ItemTravelModalPriceDetailInformationV3PriceBinding implements a {

    @NonNull
    public final TextAtomView priceInformationTAV;

    @NonNull
    public final TextAtomView productInformationTAV;

    @NonNull
    private final LinearLayout rootView;

    private ItemTravelModalPriceDetailInformationV3PriceBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.priceInformationTAV = textAtomView;
        this.productInformationTAV = textAtomView2;
    }

    @NonNull
    public static ItemTravelModalPriceDetailInformationV3PriceBinding bind(@NonNull View view) {
        int i11 = R$id.priceInformationTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.productInformationTAV;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                return new ItemTravelModalPriceDetailInformationV3PriceBinding((LinearLayout) view, textAtomView, textAtomView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelModalPriceDetailInformationV3PriceBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_modal_price_detail_information_v3_price, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
