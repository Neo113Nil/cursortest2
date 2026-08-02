package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;

/* loaded from: classes11.dex */
public final class ItemProductsPackageProductBinding implements a {

    @NonNull
    public final ImageView itemIv;

    @NonNull
    public final TextView nameTv;

    @NonNull
    public final TextView pricePerItemTv;

    @NonNull
    public final TextView priceTv;

    @NonNull
    public final ConstraintLayout productView;

    @NonNull
    public final TextView quantityTv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemProductsPackageProductBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView4) {
        this.rootView = constraintLayout;
        this.itemIv = imageView;
        this.nameTv = textView;
        this.pricePerItemTv = textView2;
        this.priceTv = textView3;
        this.productView = constraintLayout2;
        this.quantityTv = textView4;
    }

    @NonNull
    public static ItemProductsPackageProductBinding bind(@NonNull View view) {
        int i11 = R$id.itemIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.nameTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.pricePerItemTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.priceTv;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.quantityTv;
                        TextView textView4 = (TextView) C2548q.d(i11, view);
                        if (textView4 != null) {
                            return new ItemProductsPackageProductBinding(constraintLayout, imageView, textView, textView2, textView3, constraintLayout, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemProductsPackageProductBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_products_package_product, viewGroup, false);
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
