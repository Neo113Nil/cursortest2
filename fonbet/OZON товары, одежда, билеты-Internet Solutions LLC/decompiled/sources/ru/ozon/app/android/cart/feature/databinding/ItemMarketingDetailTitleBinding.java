package ru.ozon.app.android.cart.feature.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cart.feature.R$layout;

/* loaded from: classes11.dex */
public final class ItemMarketingDetailTitleBinding implements a {

    @NonNull
    public final TextView detailsTitleTv;

    @NonNull
    private final TextView rootView;

    private ItemMarketingDetailTitleBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.detailsTitleTv = textView2;
    }

    @NonNull
    public static ItemMarketingDetailTitleBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ItemMarketingDetailTitleBinding(textView, textView);
    }

    @NonNull
    public static ItemMarketingDetailTitleBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_marketing_detail_title, viewGroup, false);
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
