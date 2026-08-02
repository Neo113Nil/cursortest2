package ru.ozon.app.android.travel.feature.hotels.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.media3.ui.LegacyPlayerControlView;
import androidx.media3.ui.PlayerView;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.R$layout;

/* loaded from: classes4.dex */
public final class ItemHotelsGalleryFullVideoBinding implements a {

    @NonNull
    public final PlayerView exoPlayerV;

    @NonNull
    public final AppCompatImageView playerControlsButtonIv;

    @NonNull
    public final LegacyPlayerControlView playerControlsView;

    @NonNull
    public final ContentLoadingProgressBar playerPb;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatImageView soundControlIv;

    @NonNull
    public final AppCompatImageView videoPreviewIv;

    private ItemHotelsGalleryFullVideoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull PlayerView playerView, @NonNull AppCompatImageView appCompatImageView, @NonNull LegacyPlayerControlView legacyPlayerControlView, @NonNull ContentLoadingProgressBar contentLoadingProgressBar, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3) {
        this.rootView = constraintLayout;
        this.exoPlayerV = playerView;
        this.playerControlsButtonIv = appCompatImageView;
        this.playerControlsView = legacyPlayerControlView;
        this.playerPb = contentLoadingProgressBar;
        this.soundControlIv = appCompatImageView2;
        this.videoPreviewIv = appCompatImageView3;
    }

    @NonNull
    public static ItemHotelsGalleryFullVideoBinding bind(@NonNull View view) {
        int i11 = R$id.exoPlayerV;
        PlayerView playerView = (PlayerView) C2548q.d(i11, view);
        if (playerView != null) {
            i11 = R$id.playerControlsButtonIv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.playerControlsView;
                LegacyPlayerControlView legacyPlayerControlView = (LegacyPlayerControlView) C2548q.d(i11, view);
                if (legacyPlayerControlView != null) {
                    i11 = R$id.playerPb;
                    ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) C2548q.d(i11, view);
                    if (contentLoadingProgressBar != null) {
                        i11 = R$id.soundControlIv;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.videoPreviewIv;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) C2548q.d(i11, view);
                            if (appCompatImageView3 != null) {
                                return new ItemHotelsGalleryFullVideoBinding((ConstraintLayout) view, playerView, appCompatImageView, legacyPlayerControlView, contentLoadingProgressBar, appCompatImageView2, appCompatImageView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemHotelsGalleryFullVideoBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_hotels_gallery_full_video, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
