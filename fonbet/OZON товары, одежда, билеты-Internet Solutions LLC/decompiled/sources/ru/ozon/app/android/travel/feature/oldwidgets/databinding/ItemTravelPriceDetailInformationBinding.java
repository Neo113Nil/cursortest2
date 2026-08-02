package ru.ozon.app.android.travel.feature.oldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.oldwidgets.R$id;
import ru.ozon.app.android.travel.feature.oldwidgets.R$layout;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;

/* loaded from: classes4.dex */
public final class ItemTravelPriceDetailInformationBinding implements a {

    @NonNull
    public final LinkButtonView priceDetailsBtn;

    @NonNull
    public final TextView priceTV;

    @NonNull
    public final TextView priceTitleTV;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemTravelPriceDetailInformationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinkButtonView linkButtonView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.priceDetailsBtn = linkButtonView;
        this.priceTV = textView;
        this.priceTitleTV = textView2;
    }

    @NonNull
    public static ItemTravelPriceDetailInformationBinding bind(@NonNull View view) {
        int i11 = R$id.priceDetailsBtn;
        LinkButtonView linkButtonView = (LinkButtonView) C2548q.d(i11, view);
        if (linkButtonView != null) {
            i11 = R$id.priceTV;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.priceTitleTV;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new ItemTravelPriceDetailInformationBinding((ConstraintLayout) view, linkButtonView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemTravelPriceDetailInformationBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_travel_price_detail_information, viewGroup, false);
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
