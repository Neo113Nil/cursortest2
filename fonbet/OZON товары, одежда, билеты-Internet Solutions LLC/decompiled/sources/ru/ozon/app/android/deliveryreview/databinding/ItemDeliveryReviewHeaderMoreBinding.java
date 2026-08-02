package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.app.android.deliveryreview.R$layout;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewHeaderMoreBinding implements a {

    @NonNull
    public final TextView moreCountTv;

    @NonNull
    private final FrameLayout rootView;

    private ItemDeliveryReviewHeaderMoreBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.moreCountTv = textView;
    }

    @NonNull
    public static ItemDeliveryReviewHeaderMoreBinding bind(@NonNull View view) {
        int i11 = R$id.moreCountTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new ItemDeliveryReviewHeaderMoreBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewHeaderMoreBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_header_more, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
