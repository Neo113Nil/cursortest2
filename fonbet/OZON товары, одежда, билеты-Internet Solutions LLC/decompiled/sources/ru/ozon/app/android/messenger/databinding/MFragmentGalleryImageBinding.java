package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.github.chrisbanes.photoview.PhotoView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MFragmentGalleryImageBinding implements a {

    @NonNull
    public final ImageView failureIv;

    @NonNull
    public final ImageView galleryBackIv;

    @NonNull
    public final ProgressBar galleryImageLoaderPB;

    @NonNull
    public final PhotoView galleryMainPV;

    @NonNull
    private final FrameLayout rootView;

    private MFragmentGalleryImageBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull PhotoView photoView) {
        this.rootView = frameLayout;
        this.failureIv = imageView;
        this.galleryBackIv = imageView2;
        this.galleryImageLoaderPB = progressBar;
        this.galleryMainPV = photoView;
    }

    @NonNull
    public static MFragmentGalleryImageBinding bind(@NonNull View view) {
        int i11 = R$id.failureIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.galleryBackIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.galleryImageLoaderPB;
                ProgressBar progressBar = (ProgressBar) C2548q.d(i11, view);
                if (progressBar != null) {
                    i11 = R$id.galleryMainPV;
                    PhotoView photoView = (PhotoView) C2548q.d(i11, view);
                    if (photoView != null) {
                        return new MFragmentGalleryImageBinding((FrameLayout) view, imageView, imageView2, progressBar, photoView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MFragmentGalleryImageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_fragment_gallery_image, viewGroup, false);
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
