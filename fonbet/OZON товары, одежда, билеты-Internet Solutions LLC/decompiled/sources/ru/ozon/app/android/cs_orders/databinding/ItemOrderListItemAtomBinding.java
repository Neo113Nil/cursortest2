package ru.ozon.app.android.cs_orders.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView;

/* loaded from: classes11.dex */
public final class ItemOrderListItemAtomBinding implements a {

    @NonNull
    public final DeliveryAdultImageView itemIv;

    @NonNull
    private final DeliveryAdultImageView rootView;

    private ItemOrderListItemAtomBinding(@NonNull DeliveryAdultImageView deliveryAdultImageView, @NonNull DeliveryAdultImageView deliveryAdultImageView2) {
        this.rootView = deliveryAdultImageView;
        this.itemIv = deliveryAdultImageView2;
    }

    @NonNull
    public static ItemOrderListItemAtomBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        DeliveryAdultImageView deliveryAdultImageView = (DeliveryAdultImageView) view;
        return new ItemOrderListItemAtomBinding(deliveryAdultImageView, deliveryAdultImageView);
    }

    @NonNull
    public static ItemOrderListItemAtomBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_list_item_atom, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public DeliveryAdultImageView getRoot() {
        return this.rootView;
    }
}
