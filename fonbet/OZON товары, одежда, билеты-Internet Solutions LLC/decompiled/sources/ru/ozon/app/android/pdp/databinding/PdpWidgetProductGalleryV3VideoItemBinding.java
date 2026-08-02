package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.media3.ui.PlayerView;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;

/* loaded from: classes13.dex */
public final class PdpWidgetProductGalleryV3VideoItemBinding implements a {

    @NonNull
    public final PlayerView exoPlayerV;

    @NonNull
    public final ContentLoadingProgressBar playerPb;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ImageView videoPreviewIv;

    private PdpWidgetProductGalleryV3VideoItemBinding(@NonNull FrameLayout frameLayout, @NonNull PlayerView playerView, @NonNull ContentLoadingProgressBar contentLoadingProgressBar, @NonNull ImageView imageView) {
        this.rootView = frameLayout;
        this.exoPlayerV = playerView;
        this.playerPb = contentLoadingProgressBar;
        this.videoPreviewIv = imageView;
    }

    @NonNull
    public static PdpWidgetProductGalleryV3VideoItemBinding bind(@NonNull View view) {
        int i11 = R$id.exoPlayerV;
        PlayerView playerView = (PlayerView) C2548q.d(i11, view);
        if (playerView != null) {
            i11 = R$id.playerPb;
            ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) C2548q.d(i11, view);
            if (contentLoadingProgressBar != null) {
                i11 = R$id.videoPreviewIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    return new PdpWidgetProductGalleryV3VideoItemBinding((FrameLayout) view, playerView, contentLoadingProgressBar, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpWidgetProductGalleryV3VideoItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_product_gallery_v3_video_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
