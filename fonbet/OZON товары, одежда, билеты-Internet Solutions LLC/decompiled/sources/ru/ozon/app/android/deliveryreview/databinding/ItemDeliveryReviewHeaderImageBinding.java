package ru.ozon.app.android.deliveryreview.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.deliveryreview.R$layout;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewHeaderImageBinding implements a {

    @NonNull
    public final ImageView photoIv;

    @NonNull
    private final ImageView rootView;

    private ItemDeliveryReviewHeaderImageBinding(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = imageView;
        this.photoIv = imageView2;
    }

    @NonNull
    public static ItemDeliveryReviewHeaderImageBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new ItemDeliveryReviewHeaderImageBinding(imageView, imageView);
    }

    @NonNull
    public static ItemDeliveryReviewHeaderImageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_header_image, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
