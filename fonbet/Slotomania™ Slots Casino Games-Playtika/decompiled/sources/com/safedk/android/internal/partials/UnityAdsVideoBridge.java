package com.safedk.android.internal.partials;

import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;

/* compiled from: UnityAdsSourceFile */
/* loaded from: classes9.dex */
public class UnityAdsVideoBridge {
    public static void VideoViewPlay(VideoView vv) {
        Logger.d("UnityAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/UnityAdsVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a("com.unity3d.ads", (Object) vv);
                CreativeInfoManager.a("com.unity3d.ads", BrandSafetyUtils.a(vv), false, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: ", e.getMessage());
            }
        }
        vv.start();
    }

    public static void VideoViewStop(VideoView vv) {
        Logger.d("UnityAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/UnityAdsVideoBridge;->VideoViewStop(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewStop: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a("com.unity3d.ads", BrandSafetyUtils.a(vv), true, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewStop : ", e.getMessage());
            }
        }
        vv.stopPlayback();
    }

    public static void VideoViewPause(VideoView vv) {
        Logger.d("UnityAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/UnityAdsVideoBridge;->VideoViewPause(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPause: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a("com.unity3d.ads", BrandSafetyUtils.a(vv), true, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPause : ", e.getMessage());
            }
        }
        vv.suspend();
    }

    public static void VideoViewSetVideoPath(VideoView vv, String url) {
        Logger.d("UnityAdsVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/UnityAdsVideoBridge;->VideoViewSetVideoPath(Landroid/widget/VideoView;Ljava/lang/String;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoPath: player ", vv, ", path: ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a("com.unity3d.ads", vv, url);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: ", e.getMessage());
            }
        }
        vv.setVideoPath(url);
    }
}
