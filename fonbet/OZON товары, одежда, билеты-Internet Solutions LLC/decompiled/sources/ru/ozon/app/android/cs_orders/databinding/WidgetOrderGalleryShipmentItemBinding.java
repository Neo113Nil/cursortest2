package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes11.dex */
public final class WidgetOrderGalleryShipmentItemBinding implements a {

    @NonNull
    public final LargeButtonView downloadAllActionLBV;

    @NonNull
    public final RecyclerView postingsRv;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetOrderGalleryShipmentItemBinding(@NonNull CardView cardView, @NonNull LargeButtonView largeButtonView, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = cardView;
        this.downloadAllActionLBV = largeButtonView;
        this.postingsRv = recyclerView;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetOrderGalleryShipmentItemBinding bind(@NonNull View view) {
        int i11 = R$id.downloadAllActionLBV;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.postingsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.titleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetOrderGalleryShipmentItemBinding((CardView) view, largeButtonView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetOrderGalleryShipmentItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_order_gallery_shipment_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CardView getConstraintLayout() {
        return this.rootView;
    }
}
