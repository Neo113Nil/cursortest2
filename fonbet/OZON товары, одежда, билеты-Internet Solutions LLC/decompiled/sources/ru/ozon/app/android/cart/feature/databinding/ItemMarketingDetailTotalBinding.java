package ru.ozon.app.android.cart.feature.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.feature.R$layout;

/* loaded from: classes11.dex */
public final class ItemMarketingDetailTotalBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView totalTitleTv;

    @NonNull
    public final TextView totalValueTv;

    private ItemMarketingDetailTotalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.totalTitleTv = textView;
        this.totalValueTv = textView2;
    }

    @NonNull
    public static ItemMarketingDetailTotalBinding bind(@NonNull View view) {
        int i11 = R$id.totalTitleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.totalValueTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                return new ItemMarketingDetailTotalBinding((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemMarketingDetailTotalBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_marketing_detail_total, viewGroup, false);
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
