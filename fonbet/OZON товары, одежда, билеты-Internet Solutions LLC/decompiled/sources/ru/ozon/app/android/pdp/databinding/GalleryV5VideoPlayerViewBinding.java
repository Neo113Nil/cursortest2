package ru.ozon.app.android.pdp.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.media3.ui.PlayerView;
import ru.ozon.app.android.pdp.R$layout;

/* loaded from: classes13.dex */
public final class GalleryV5VideoPlayerViewBinding implements a {

    @NonNull
    private final PlayerView rootView;

    private GalleryV5VideoPlayerViewBinding(@NonNull PlayerView playerView) {
        this.rootView = playerView;
    }

    @NonNull
    public static GalleryV5VideoPlayerViewBinding bind(@NonNull View view) {
        if (view != null) {
            return new GalleryV5VideoPlayerViewBinding((PlayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static GalleryV5VideoPlayerViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.gallery_v5_video_player_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public PlayerView getRoot() {
        return this.rootView;
    }
}
