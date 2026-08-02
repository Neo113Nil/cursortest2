package ru.ozon.app.android.travel.feature.oldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.travel.feature.oldwidgets.R$id;
import ru.ozon.app.android.travel.feature.oldwidgets.R$layout;

/* loaded from: classes4.dex */
public final class ViewTravelModalPriceDetailInformationPositionItemBinding implements a {

    @NonNull
    public final TextView itemNameTV;

    @NonNull
    public final TextView itemPriceTV;

    @NonNull
    private final LinearLayout rootView;

    private ViewTravelModalPriceDetailInformationPositionItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.itemNameTV = textView;
        this.itemPriceTV = textView2;
    }

    @NonNull
    public static ViewTravelModalPriceDetailInformationPositionItemBinding bind(@NonNull View view) {
        int i11 = R$id.itemNameTV;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.itemPriceTV;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                return new ViewTravelModalPriceDetailInformationPositionItemBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewTravelModalPriceDetailInformationPositionItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_travel_modal_price_detail_information_position_item, viewGroup, false);
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
