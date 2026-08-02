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
public final class ItemGalleryPhoto360PreviewBinding implements a {

    @NonNull
    public final ImageView preview360Iv;

    @NonNull
    public final FrameLayout previewGroup;

    @NonNull
    private final FrameLayout rootView;

    private ItemGalleryPhoto360PreviewBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.preview360Iv = imageView;
        this.previewGroup = frameLayout2;
    }

    @NonNull
    public static ItemGalleryPhoto360PreviewBinding bind(@NonNull View view) {
        int i11 = R$id.preview360Iv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new ItemGalleryPhoto360PreviewBinding(frameLayout, imageView, frameLayout);
    }

    @NonNull
    public static ItemGalleryPhoto360PreviewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_gallery_photo360_preview, viewGroup, false);
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
