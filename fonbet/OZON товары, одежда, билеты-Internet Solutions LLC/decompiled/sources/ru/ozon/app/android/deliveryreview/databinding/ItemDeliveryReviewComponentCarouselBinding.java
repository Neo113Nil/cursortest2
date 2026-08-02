package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.app.android.deliveryreview.R$layout;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewComponentCarouselBinding implements a {

    @NonNull
    public final RecyclerView carouselRv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemDeliveryReviewComponentCarouselBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.carouselRv = recyclerView;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemDeliveryReviewComponentCarouselBinding bind(@NonNull View view) {
        int i11 = R$id.carouselRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemDeliveryReviewComponentCarouselBinding((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewComponentCarouselBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_component_carousel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
