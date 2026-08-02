package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.app.android.orderdetails.R$layout;

/* loaded from: classes13.dex */
public final class ItemOrderShipmentLayoutPostingProductBinding implements a {

    @NonNull
    public final DeliveryAdultImageView productIv;

    @NonNull
    public final FrameLayout productView;

    @NonNull
    private final FrameLayout rootView;

    private ItemOrderShipmentLayoutPostingProductBinding(@NonNull FrameLayout frameLayout, @NonNull DeliveryAdultImageView deliveryAdultImageView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.productIv = deliveryAdultImageView;
        this.productView = frameLayout2;
    }

    @NonNull
    public static ItemOrderShipmentLayoutPostingProductBinding bind(@NonNull View view) {
        int i11 = R$id.productIv;
        DeliveryAdultImageView deliveryAdultImageView = (DeliveryAdultImageView) C2548q.d(i11, view);
        if (deliveryAdultImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new ItemOrderShipmentLayoutPostingProductBinding(frameLayout, deliveryAdultImageView, frameLayout);
    }

    @NonNull
    public static ItemOrderShipmentLayoutPostingProductBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_shipment_layout_posting_product, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
