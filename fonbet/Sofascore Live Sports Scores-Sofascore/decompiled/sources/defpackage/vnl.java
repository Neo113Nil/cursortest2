package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class vnl {
    public final k1l a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public vnl(k1l k1lVar) {
        this.a = k1lVar;
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.b.post(new unl(this, 1));
    }

    @JavascriptInterface
    public final void sendError(@NotNull String str) {
        str.getClass();
        this.b.post(new s5l(8, this, str.equalsIgnoreCase("2") ? ane.b : str.equalsIgnoreCase(CampaignEx.CLICKMODE_ON) ? ane.c : str.equalsIgnoreCase(StatisticData.ERROR_CODE_NOT_FOUND) ? ane.d : str.equalsIgnoreCase(StatisticData.ERROR_CODE_IO_ERROR) ? ane.e : str.equalsIgnoreCase("150") ? ane.e : str.equalsIgnoreCase("153") ? ane.f : ane.a));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(@NotNull String str) {
        str.getClass();
        this.b.post(new s5l(5, this, str.equalsIgnoreCase("small") ? yme.b : str.equalsIgnoreCase("medium") ? yme.c : str.equalsIgnoreCase("large") ? yme.d : str.equalsIgnoreCase("hd720") ? yme.e : str.equalsIgnoreCase("hd1080") ? yme.f : str.equalsIgnoreCase("highres") ? yme.g : str.equalsIgnoreCase(BuildConfig.FLAVOR) ? yme.h : yme.a));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(@NotNull String str) {
        str.getClass();
        this.b.post(new s5l(6, this, str.equalsIgnoreCase("0.25") ? zme.b : str.equalsIgnoreCase("0.5") ? zme.c : str.equalsIgnoreCase("0.75") ? zme.d : str.equalsIgnoreCase("1") ? zme.e : str.equalsIgnoreCase("1.25") ? zme.f : str.equalsIgnoreCase("1.5") ? zme.g : str.equalsIgnoreCase("1.75") ? zme.h : str.equalsIgnoreCase("2") ? zme.i : zme.a));
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.b.post(new unl(this, 2));
    }

    @JavascriptInterface
    public final void sendStateChange(@NotNull String str) {
        str.getClass();
        this.b.post(new s5l(9, this, str.equalsIgnoreCase("UNSTARTED") ? bne.b : str.equalsIgnoreCase("ENDED") ? bne.c : str.equalsIgnoreCase("PLAYING") ? bne.d : str.equalsIgnoreCase("PAUSED") ? bne.e : str.equalsIgnoreCase("BUFFERING") ? bne.f : str.equalsIgnoreCase("CUED") ? bne.g : bne.a));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(@NotNull String str) {
        str.getClass();
        try {
            this.b.post(new tnl(this, Float.parseFloat(str), 0));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(@NotNull String str) {
        str.getClass();
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.b.post(new tnl(this, Float.parseFloat(str), 1));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(@NotNull String str) {
        str.getClass();
        return this.b.post(new s5l(7, this, str));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(@NotNull String str) {
        str.getClass();
        try {
            this.b.post(new tnl(this, Float.parseFloat(str), 2));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.b.post(new unl(this, 0));
    }
}
