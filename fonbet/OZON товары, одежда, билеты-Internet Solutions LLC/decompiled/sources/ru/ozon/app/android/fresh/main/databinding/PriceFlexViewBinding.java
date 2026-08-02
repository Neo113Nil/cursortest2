package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;

/* loaded from: classes12.dex */
public final class PriceFlexViewBinding implements a {

    @NonNull
    public final ConstraintLayout originalPriceGroup;

    @NonNull
    public final View originalPriceStrikeThrough;

    @NonNull
    public final TextView originalPriceTv;

    @NonNull
    public final TextView priceTv;

    @NonNull
    private final View rootView;

    private PriceFlexViewBinding(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = view;
        this.originalPriceGroup = constraintLayout;
        this.originalPriceStrikeThrough = view2;
        this.originalPriceTv = textView;
        this.priceTv = textView2;
    }

    @NonNull
    public static PriceFlexViewBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.originalPriceGroup;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null && (d11 = C2548q.d((i11 = R$id.originalPriceStrikeThrough), view)) != null) {
            i11 = R$id.originalPriceTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.priceTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new PriceFlexViewBinding(view, constraintLayout, d11, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PriceFlexViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.price_flex_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
