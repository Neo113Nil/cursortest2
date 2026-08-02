package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.media3.ui.PlayerView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;

/* loaded from: classes4.dex */
public final class ItemHotelsGalleryVideoItemBinding implements a {

    @NonNull
    public final PlayerView exoPlayerV;

    @NonNull
    public final ContentLoadingProgressBar playerPb;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final AppCompatImageView videoPlayButtonIv;

    @NonNull
    public final AppCompatImageView videoPreviewIv;

    private ItemHotelsGalleryVideoItemBinding(@NonNull FrameLayout frameLayout, @NonNull PlayerView playerView, @NonNull ContentLoadingProgressBar contentLoadingProgressBar, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2) {
        this.rootView = frameLayout;
        this.exoPlayerV = playerView;
        this.playerPb = contentLoadingProgressBar;
        this.videoPlayButtonIv = appCompatImageView;
        this.videoPreviewIv = appCompatImageView2;
    }

    @NonNull
    public static ItemHotelsGalleryVideoItemBinding bind(@NonNull View view) {
        int i11 = R$id.exoPlayerV;
        PlayerView playerView = (PlayerView) C2548q.d(i11, view);
        if (playerView != null) {
            i11 = R$id.playerPb;
            ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) C2548q.d(i11, view);
            if (contentLoadingProgressBar != null) {
                i11 = R$id.videoPlayButtonIv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    i11 = R$id.videoPreviewIv;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView2 != null) {
                        return new ItemHotelsGalleryVideoItemBinding((FrameLayout) view, playerView, contentLoadingProgressBar, appCompatImageView, appCompatImageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHotelsGalleryVideoItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hotels_gallery_video_item, viewGroup, false);
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
