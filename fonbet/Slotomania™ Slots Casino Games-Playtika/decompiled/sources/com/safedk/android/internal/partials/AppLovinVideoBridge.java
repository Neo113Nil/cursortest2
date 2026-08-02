package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;

/* compiled from: AppLovinSourceFile */
/* loaded from: classes9.dex */
public class AppLovinVideoBridge {
    public static void VideoViewPlay(VideoView vv) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.a, (Object) vv);
                CreativeInfoManager.a(h.a, BrandSafetyUtils.a(vv), false, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: ", e.getMessage());
            }
        }
        vv.start();
    }

    public static void VideoViewStop(VideoView vv) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewStop(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewStop: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.a, BrandSafetyUtils.a(vv), true, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewStop : ", e.getMessage());
            }
        }
        vv.stopPlayback();
    }

    public static void VideoViewPause(VideoView vv) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewPause(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPause: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.a, BrandSafetyUtils.a(vv), true, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPause : ", e.getMessage());
            }
        }
        vv.suspend();
    }

    public static void VideoViewSetVideoUri(VideoView vv, Uri uri) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewSetVideoUri(Landroid/widget/VideoView;Landroid/net/Uri;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoUri: player ", vv, ", uri: ", uri, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.a, vv, uri);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: ", e.getMessage());
            }
        }
        vv.setVideoURI(uri);
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.a, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.a, (String) null, true, "media-player");
                }
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.release();
    }
}
