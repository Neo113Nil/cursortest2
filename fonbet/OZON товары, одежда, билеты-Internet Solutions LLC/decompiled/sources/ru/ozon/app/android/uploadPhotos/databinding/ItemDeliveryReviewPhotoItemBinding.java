package ru.ozon.app.android.uploadPhotos.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.uploadPhotos.R$id;
import ru.ozon.app.android.uploadPhotos.R$layout;

/* loaded from: classes2.dex */
public final class ItemDeliveryReviewPhotoItemBinding implements a {

    @NonNull
    public final ImageView cancelUploadingIv;

    @NonNull
    public final AppCompatImageView ivPhoto;

    @NonNull
    public final AppCompatImageView ivRemovePhoto;

    @NonNull
    public final ImageView retryBtnIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ProgressBar spinnerPb;

    @NonNull
    public final FrameLayout uploadingOverlayFl;

    private ItemDeliveryReviewPhotoItemBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.cancelUploadingIv = imageView;
        this.ivPhoto = appCompatImageView;
        this.ivRemovePhoto = appCompatImageView2;
        this.retryBtnIv = imageView2;
        this.spinnerPb = progressBar;
        this.uploadingOverlayFl = frameLayout2;
    }

    @NonNull
    public static ItemDeliveryReviewPhotoItemBinding bind(@NonNull View view) {
        int i11 = R$id.cancelUploadingIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.ivPhoto;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.ivRemovePhoto;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView2 != null) {
                    i11 = R$id.retryBtnIv;
                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                    if (imageView2 != null) {
                        i11 = R$id.spinnerPb;
                        ProgressBar progressBar = (ProgressBar) C2548q.d(i11, view);
                        if (progressBar != null) {
                            i11 = R$id.uploadingOverlayFl;
                            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                            if (frameLayout != null) {
                                return new ItemDeliveryReviewPhotoItemBinding((FrameLayout) view, imageView, appCompatImageView, appCompatImageView2, imageView2, progressBar, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemDeliveryReviewPhotoItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_delivery_review_photo_item, viewGroup, false);
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
