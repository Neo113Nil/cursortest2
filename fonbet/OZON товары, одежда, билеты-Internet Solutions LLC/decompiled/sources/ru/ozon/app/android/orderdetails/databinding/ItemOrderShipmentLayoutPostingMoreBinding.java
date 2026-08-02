package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.app.android.orderdetails.R$layout;

/* loaded from: classes13.dex */
public final class ItemOrderShipmentLayoutPostingMoreBinding implements a {

    @NonNull
    public final TextView countMoreTv;

    @NonNull
    private final FrameLayout rootView;

    private ItemOrderShipmentLayoutPostingMoreBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.countMoreTv = textView;
    }

    @NonNull
    public static ItemOrderShipmentLayoutPostingMoreBinding bind(@NonNull View view) {
        int i11 = R$id.countMoreTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new ItemOrderShipmentLayoutPostingMoreBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemOrderShipmentLayoutPostingMoreBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_shipment_layout_posting_more, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
