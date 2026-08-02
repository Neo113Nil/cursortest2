package ru.ozon.app.android.gallery.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.github.chrisbanes.photoview.PhotoView;
import ru.ozon.app.android.gallery.R$layout;

/* loaded from: classes12.dex */
public final class FragmentGalleryPhotoScreenBinding implements a {

    @NonNull
    public final PhotoView previewPv;

    @NonNull
    private final PhotoView rootView;

    private FragmentGalleryPhotoScreenBinding(@NonNull PhotoView photoView, @NonNull PhotoView photoView2) {
        this.rootView = photoView;
        this.previewPv = photoView2;
    }

    @NonNull
    public static FragmentGalleryPhotoScreenBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PhotoView photoView = (PhotoView) view;
        return new FragmentGalleryPhotoScreenBinding(photoView, photoView);
    }

    @NonNull
    public static FragmentGalleryPhotoScreenBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_gallery_photo_screen, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public PhotoView getRoot() {
        return this.rootView;
    }
}
