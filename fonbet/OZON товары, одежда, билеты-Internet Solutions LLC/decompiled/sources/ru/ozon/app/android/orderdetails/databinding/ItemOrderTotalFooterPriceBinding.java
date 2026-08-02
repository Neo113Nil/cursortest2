package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;

/* loaded from: classes13.dex */
public final class ItemOrderTotalFooterPriceBinding implements a {

    @NonNull
    public final PriceView orderPriceTitlePV;

    @NonNull
    public final TextView orderPriceTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemOrderTotalFooterPriceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull PriceView priceView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.orderPriceTitlePV = priceView;
        this.orderPriceTitleTv = textView;
    }

    @NonNull
    public static ItemOrderTotalFooterPriceBinding bind(@NonNull View view) {
        int i11 = R$id.orderPriceTitlePV;
        PriceView priceView = (PriceView) C2548q.d(i11, view);
        if (priceView != null) {
            i11 = R$id.orderPriceTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemOrderTotalFooterPriceBinding((ConstraintLayout) view, priceView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemOrderTotalFooterPriceBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_total_footer_price, viewGroup, false);
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
