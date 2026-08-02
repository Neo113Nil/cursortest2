package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;

/* loaded from: classes13.dex */
public final class PdpWidgetProductGalleryV3VideoPreviewItemBinding implements a {

    @NonNull
    public final ImageView playIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ImageView videoPreviewIv;

    private PdpWidgetProductGalleryV3VideoPreviewItemBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = frameLayout;
        this.playIv = imageView;
        this.videoPreviewIv = imageView2;
    }

    @NonNull
    public static PdpWidgetProductGalleryV3VideoPreviewItemBinding bind(@NonNull View view) {
        int i11 = R$id.playIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.videoPreviewIv;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                return new PdpWidgetProductGalleryV3VideoPreviewItemBinding((FrameLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpWidgetProductGalleryV3VideoPreviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_product_gallery_v3_video_preview_item, viewGroup, false);
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
