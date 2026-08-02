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
public final class ItemDeliveryReviewComponentUploadPhotosBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvUploadPhotos;

    @NonNull
    public final TextView tvUploadPhotosTitle;

    private ItemDeliveryReviewComponentUploadPhotosBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.rvUploadPhotos = recyclerView;
        this.tvUploadPhotosTitle = textView;
    }

    @NonNull
    public static ItemDeliveryReviewComponentUploadPhotosBinding bind(@NonNull View view) {
        int i11 = R$id.rvUploadPhotos;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.tvUploadPhotosTitle;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemDeliveryReviewComponentUploadPhotosBinding((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewComponentUploadPhotosBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_component_upload_photos, viewGroup, false);
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
