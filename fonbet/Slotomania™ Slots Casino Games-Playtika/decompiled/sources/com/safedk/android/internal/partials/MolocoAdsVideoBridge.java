package com.safedk.android.internal.partials;

import android.view.View;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;

/* compiled from: MolocoAdsSourceFile */
/* loaded from: classes9.dex */
public class MolocoAdsVideoBridge {
    public static void molocoStyledPlayerViewOnSetPlayer(StyledPlayerView targetInstance, Player player) {
        Logger.d("MolocoAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/MolocoAdsVideoBridge;->molocoStyledPlayerViewOnSetPlayer(Lcom/google/android/exoplayer2/ui/StyledPlayerView;Lcom/google/android/exoplayer2/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "molocoStyledPlayerViewOnSetPlayer triggered, targetInstance :  ", targetInstance, ", player : ", player, ",  isOnUiThread = ", Boolean.valueOf(n.c()));
                VideoEventsManager.a(h.D, (Object) player, (View) targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in molocoStyledPlayerViewOnSetPlayer", th);
            }
        }
        targetInstance.setPlayer(player);
    }

    public static void molocoStyledPlayerViewOnPause(StyledPlayerView targetInstance) {
        Logger.d("MolocoAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/MolocoAdsVideoBridge;->molocoStyledPlayerViewOnPause(Lcom/google/android/exoplayer2/ui/StyledPlayerView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "molocoStyledPlayerViewOnPause triggered, targetInstance :  ", targetInstance, ",isOnUiThread = ", Boolean.valueOf(n.c()));
                VideoEventsManager.onPlayerStop(h.D, targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in molocoStyledPlayerViewOnPause", th);
            }
        }
        targetInstance.onPause();
    }

    public static void molocoStyledPlayerViewOnResume(StyledPlayerView targetInstance) {
        Logger.d("MolocoAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/MolocoAdsVideoBridge;->molocoStyledPlayerViewOnResume(Lcom/google/android/exoplayer2/ui/StyledPlayerView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "molocoStyledPlayerViewOnResume triggered, targetInstance :  ", targetInstance, ",isOnUiThread = ", Boolean.valueOf(n.c()));
                VideoEventsManager.onPlayerPlay(h.D, targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in molocoOnSetPlayer", th);
            }
        }
        targetInstance.onResume();
    }

    public static void molocoExoPlayerSetMediaItem(Player targetInstance, MediaItem mediaItem) {
        Logger.d("MolocoAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/MolocoAdsVideoBridge;->molocoExoPlayerSetMediaItem(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/MediaItem;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "molocoExoPLayerSetMediaItem triggered, targetInstance :  ", targetInstance, ",mediaItem = ", mediaItem);
                VideoEventsManager.a(h.D, targetInstance, mediaItem, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in molocoOnSetPlayer", th);
            }
        }
        targetInstance.setMediaItem(mediaItem);
    }
}
