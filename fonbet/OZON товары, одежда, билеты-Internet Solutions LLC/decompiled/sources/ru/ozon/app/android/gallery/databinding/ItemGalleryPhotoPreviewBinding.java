package ru.ozon.app.android.gallery.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.gallery.R$id;
import ru.ozon.app.android.gallery.R$layout;

/* loaded from: classes12.dex */
public final class ItemGalleryPhotoPreviewBinding implements a {

    @NonNull
    public final FrameLayout previewGroup;

    @NonNull
    public final ImageView previewIv;

    @NonNull
    private final FrameLayout rootView;

    private ItemGalleryPhotoPreviewBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView) {
        this.rootView = frameLayout;
        this.previewGroup = frameLayout2;
        this.previewIv = imageView;
    }

    @NonNull
    public static ItemGalleryPhotoPreviewBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.previewIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            return new ItemGalleryPhotoPreviewBinding(frameLayout, frameLayout, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemGalleryPhotoPreviewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_gallery_photo_preview, viewGroup, false);
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
