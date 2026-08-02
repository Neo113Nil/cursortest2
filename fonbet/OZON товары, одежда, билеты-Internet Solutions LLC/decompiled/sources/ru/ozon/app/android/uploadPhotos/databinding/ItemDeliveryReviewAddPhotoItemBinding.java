package ru.ozon.app.android.uploadPhotos.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.uploadPhotos.R$id;
import ru.ozon.app.android.uploadPhotos.R$layout;

/* loaded from: classes2.dex */
public final class ItemDeliveryReviewAddPhotoItemBinding implements a {

    @NonNull
    public final AppCompatImageView iconIv;

    @NonNull
    private final FrameLayout rootView;

    private ItemDeliveryReviewAddPhotoItemBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = frameLayout;
        this.iconIv = appCompatImageView;
    }

    @NonNull
    public static ItemDeliveryReviewAddPhotoItemBinding bind(@NonNull View view) {
        int i11 = R$id.iconIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            return new ItemDeliveryReviewAddPhotoItemBinding((FrameLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewAddPhotoItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_add_photo_item, viewGroup, false);
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
