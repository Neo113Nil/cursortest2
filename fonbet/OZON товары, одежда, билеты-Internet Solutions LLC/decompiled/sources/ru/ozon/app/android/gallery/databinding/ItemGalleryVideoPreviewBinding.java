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
public final class ItemGalleryVideoPreviewBinding implements a {

    @NonNull
    public final ImageView play;

    @NonNull
    public final FrameLayout previewGroup;

    @NonNull
    public final ImageView previewIv;

    @NonNull
    private final FrameLayout rootView;

    private ItemGalleryVideoPreviewBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView2) {
        this.rootView = frameLayout;
        this.play = imageView;
        this.previewGroup = frameLayout2;
        this.previewIv = imageView2;
    }

    @NonNull
    public static ItemGalleryVideoPreviewBinding bind(@NonNull View view) {
        int i11 = R$id.play;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            int i12 = R$id.previewIv;
            ImageView imageView2 = (ImageView) C2548q.d(i12, view);
            if (imageView2 != null) {
                return new ItemGalleryVideoPreviewBinding(frameLayout, imageView, frameLayout, imageView2);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemGalleryVideoPreviewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_gallery_video_preview, viewGroup, false);
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
