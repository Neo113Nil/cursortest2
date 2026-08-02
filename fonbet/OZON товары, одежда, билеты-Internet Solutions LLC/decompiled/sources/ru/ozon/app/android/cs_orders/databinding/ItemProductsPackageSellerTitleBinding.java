package ru.ozon.app.android.cs_orders.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cs_orders.R$layout;

/* loaded from: classes11.dex */
public final class ItemProductsPackageSellerTitleBinding implements a {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView sellerNameTv;

    private ItemProductsPackageSellerTitleBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.sellerNameTv = textView2;
    }

    @NonNull
    public static ItemProductsPackageSellerTitleBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemProductsPackageSellerTitleBinding(textView, textView);
    }

    @NonNull
    public static ItemProductsPackageSellerTitleBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_products_package_seller_title, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
