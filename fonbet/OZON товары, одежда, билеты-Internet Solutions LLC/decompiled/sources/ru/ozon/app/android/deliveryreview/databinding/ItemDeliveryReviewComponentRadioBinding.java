package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.deliveryreview.R$id;
import ru.ozon.app.android.deliveryreview.R$layout;

/* loaded from: classes11.dex */
public final class ItemDeliveryReviewComponentRadioBinding implements a {

    @NonNull
    public final FrameLayout radioFl;

    @NonNull
    public final ImageView radioIv;

    @NonNull
    public final TextView radioTv;

    @NonNull
    private final FrameLayout rootView;

    private ItemDeliveryReviewComponentRadioBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.radioFl = frameLayout2;
        this.radioIv = imageView;
        this.radioTv = textView;
    }

    @NonNull
    public static ItemDeliveryReviewComponentRadioBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.radioIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.radioTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemDeliveryReviewComponentRadioBinding(frameLayout, frameLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewComponentRadioBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_component_radio, viewGroup, false);
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
