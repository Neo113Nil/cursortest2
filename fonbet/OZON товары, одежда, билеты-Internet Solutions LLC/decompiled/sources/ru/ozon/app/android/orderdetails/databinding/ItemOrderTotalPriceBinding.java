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
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;

/* loaded from: classes13.dex */
public final class ItemOrderTotalPriceBinding implements a {

    @NonNull
    public final ButtonV3View orderPriceBtn;

    @NonNull
    public final PriceView orderPriceTitlePV;

    @NonNull
    public final TextView orderPriceTitleTv;

    @NonNull
    public final PriceAtomView orderPriceTitleUikit;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemOrderTotalPriceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull PriceView priceView, @NonNull TextView textView, @NonNull PriceAtomView priceAtomView) {
        this.rootView = constraintLayout;
        this.orderPriceBtn = buttonV3View;
        this.orderPriceTitlePV = priceView;
        this.orderPriceTitleTv = textView;
        this.orderPriceTitleUikit = priceAtomView;
    }

    @NonNull
    public static ItemOrderTotalPriceBinding bind(@NonNull View view) {
        int i11 = R$id.orderPriceBtn;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.orderPriceTitlePV;
            PriceView priceView = (PriceView) C2548q.d(i11, view);
            if (priceView != null) {
                i11 = R$id.orderPriceTitleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.orderPriceTitleUikit;
                    PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                    if (priceAtomView != null) {
                        return new ItemOrderTotalPriceBinding((ConstraintLayout) view, buttonV3View, priceView, textView, priceAtomView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemOrderTotalPriceBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_order_total_price, viewGroup, false);
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
