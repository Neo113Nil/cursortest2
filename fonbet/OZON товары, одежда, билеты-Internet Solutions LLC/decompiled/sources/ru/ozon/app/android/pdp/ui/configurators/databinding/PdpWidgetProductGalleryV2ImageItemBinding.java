package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;

/* loaded from: classes13.dex */
public final class PdpWidgetProductGalleryV2ImageItemBinding implements a {

    @NonNull
    public final View galleryParandjaV;

    @NonNull
    public final ImageView imageIv;

    @NonNull
    private final FrameLayout rootView;

    private PdpWidgetProductGalleryV2ImageItemBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ImageView imageView) {
        this.rootView = frameLayout;
        this.galleryParandjaV = view;
        this.imageIv = imageView;
    }

    @NonNull
    public static PdpWidgetProductGalleryV2ImageItemBinding bind(@NonNull View view) {
        int i11 = R$id.galleryParandjaV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.imageIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new PdpWidgetProductGalleryV2ImageItemBinding((FrameLayout) view, d11, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpWidgetProductGalleryV2ImageItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_product_gallery_v2_image_item, viewGroup, false);
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
