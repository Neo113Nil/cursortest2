package com.safedk.android.internal.partials;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;

/* compiled from: AdMobSourceFile */
/* loaded from: classes9.dex */
public class AdMobVideoBridge {
    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("AdMobVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AdMobVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.h, mp);
                CreativeInfoManager.a(h.h, (String) null, false, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerStop(MediaPlayer mp) throws IllegalStateException {
        Logger.d("AdMobVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AdMobVideoBridge;->MediaPlayerStop(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.h, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: ", e.getMessage());
            }
        }
        mp.stop();
    }

    public static void MediaPlayerPause(MediaPlayer mp) throws IllegalStateException {
        Logger.d("AdMobVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AdMobVideoBridge;->MediaPlayerPause(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerPause: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.h, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerPause: ", e.getMessage());
            }
        }
        mp.pause();
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("AdMobVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AdMobVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.h, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.h, (String) null, true, "media-player");
                }
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.release();
    }

    public static void MediaPlayerSetDataSource(MediaPlayer mp, Context context, Uri uri) throws IOException, IllegalArgumentException, IllegalStateException {
        Logger.d("AdMobVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AdMobVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Landroid/content/Context;Landroid/net/Uri;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "media player set data source: player ", mp, ", context ", context, ",  uri= ", uri, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.h, mp, uri);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: ", e.getMessage());
            }
        }
        mp.setDataSource(context, uri);
    }

    public static void MediaPlayerSetSurface(MediaPlayer mp, Surface surface) {
        Logger.d("AdMobVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AdMobVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetSurface: player ", mp, ", surface ", surface, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetSurface: ", e.getMessage());
            }
        }
        mp.setSurface(surface);
    }
}
