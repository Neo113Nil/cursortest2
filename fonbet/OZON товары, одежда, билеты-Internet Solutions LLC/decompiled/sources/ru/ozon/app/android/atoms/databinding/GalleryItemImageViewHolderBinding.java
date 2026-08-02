package ru.ozon.app.android.atoms.databinding;

import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class GalleryItemImageViewHolderBinding implements a {

    @NonNull
    public final ImageView galleryImageItem;

    @NonNull
    private final ImageView rootView;

    private GalleryItemImageViewHolderBinding(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = imageView;
        this.galleryImageItem = imageView2;
    }

    @NonNull
    public static GalleryItemImageViewHolderBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new GalleryItemImageViewHolderBinding(imageView, imageView);
    }

    @Override // X4.a
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
