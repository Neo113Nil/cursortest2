package ru.ozon.app.android.videocover;

import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lru/ozon/app/android/videocover/VideoTile;", "", "getPlayerView", "Landroidx/media3/ui/PlayerView;", "showPreview", "", "hidePreview", "onVideoStop", "onVideoStart", "videocover_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface VideoTile {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onVideoStart(@NotNull VideoTile videoTile) {
        }

        public static void onVideoStop(@NotNull VideoTile videoTile) {
        }
    }

    @NotNull
    PlayerView getPlayerView();

    void hidePreview();

    void onVideoStart();

    void onVideoStop();

    void showPreview();
}
