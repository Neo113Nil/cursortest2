package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.app.android.deliveryreview.R$layout;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewComponentCarouselItemBinding implements a {

    @NonNull
    public final View borderV;

    @NonNull
    public final ImageView checkIv;

    @NonNull
    public final ConstraintLayout itemCl;

    @NonNull
    public final ImageView itemIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemDeliveryReviewComponentCarouselItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.borderV = view;
        this.checkIv = imageView;
        this.itemCl = constraintLayout2;
        this.itemIv = imageView2;
        this.titleTv = textView;
    }

    @NonNull
    public static ItemDeliveryReviewComponentCarouselItemBinding bind(@NonNull View view) {
        int i11 = R$id.borderV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.checkIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.itemIv;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    i11 = R$id.titleTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new ItemDeliveryReviewComponentCarouselItemBinding(constraintLayout, d11, imageView, constraintLayout, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewComponentCarouselItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_component_carousel_item, viewGroup, false);
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
