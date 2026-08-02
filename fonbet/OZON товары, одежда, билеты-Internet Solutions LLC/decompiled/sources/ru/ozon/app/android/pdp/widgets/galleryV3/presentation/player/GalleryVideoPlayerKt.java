package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"clearAllCallbacks", "", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryVideoPlayerKt {
    public static final void clearAllCallbacks(@NotNull GalleryVideoPlayer galleryVideoPlayer) {
        Intrinsics.checkNotNullParameter(galleryVideoPlayer, "<this>");
        galleryVideoPlayer.setOnBuffering(null);
        galleryVideoPlayer.setOnRenderedFirstFrame(null);
        galleryVideoPlayer.setOnReady(null);
        galleryVideoPlayer.setOnStart(null);
        galleryVideoPlayer.setOnError(null);
        galleryVideoPlayer.setOnFinish(null);
    }
}
