package ru.ozon.app.android.travel.feature.oldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.oldwidgets.R$id;
import ru.ozon.app.android.travel.feature.oldwidgets.R$layout;

/* loaded from: classes4.dex */
public final class ViewTravelModalPriceDetailInformationPositionBinding implements a {

    @NonNull
    public final LinearLayout itemsContainerLL;

    @NonNull
    public final TextView positionNameTV;

    @NonNull
    public final TextView positionPriceTV;

    @NonNull
    private final ConstraintLayout rootView;

    private ViewTravelModalPriceDetailInformationPositionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.itemsContainerLL = linearLayout;
        this.positionNameTV = textView;
        this.positionPriceTV = textView2;
    }

    @NonNull
    public static ViewTravelModalPriceDetailInformationPositionBinding bind(@NonNull View view) {
        int i11 = R$id.itemsContainerLL;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.positionNameTV;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.positionPriceTV;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new ViewTravelModalPriceDetailInformationPositionBinding((ConstraintLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewTravelModalPriceDetailInformationPositionBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_travel_modal_price_detail_information_position, viewGroup, false);
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
