package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o7e implements r7e {
    public final /* synthetic */ MediationBannerAdConfiguration a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ p7e e;

    public o7e(p7e p7eVar, MediationBannerAdConfiguration mediationBannerAdConfiguration, Context context, String str, String str2) {
        this.e = p7eVar;
        this.a = mediationBannerAdConfiguration;
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.r7e
    public final void a(AdError adError) {
        adError.toString();
        this.e.a.onFailure(adError);
    }

    @Override // defpackage.r7e
    public final void b() {
        PAGBannerSize pAGBannerSize;
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.a;
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        Context context = this.b;
        if (adSize != null) {
            int width = adSize.getWidth();
            pAGBannerSize = PAGBannerSize.BANNER_W_320_H_50;
            if (width != pAGBannerSize.getWidth() || adSize.getHeight() != pAGBannerSize.getHeight()) {
                int width2 = adSize.getWidth();
                pAGBannerSize = PAGBannerSize.BANNER_W_300_H_250;
                if (width2 != pAGBannerSize.getWidth() || adSize.getHeight() != pAGBannerSize.getHeight()) {
                    int width3 = adSize.getWidth();
                    pAGBannerSize = PAGBannerSize.BANNER_W_728_H_90;
                    if (width3 != pAGBannerSize.getWidth() || adSize.getHeight() != pAGBannerSize.getHeight()) {
                        pAGBannerSize = PAGBannerSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adSize.getWidth());
                        if (adSize.getWidth() != pAGBannerSize.getWidth() || adSize.getHeight() != pAGBannerSize.getHeight()) {
                            pAGBannerSize = PAGBannerSize.getInlineAdaptiveBannerAdSize(adSize.getWidth(), adSize.getHeight());
                        }
                    }
                }
            }
        } else {
            pAGBannerSize = null;
        }
        p7e p7eVar = this.e;
        if (pAGBannerSize == null) {
            AdError y = jaa.y(102, "Failed to request banner ad from Pangle. Invalid banner size.");
            y.toString();
            p7eVar.a.onFailure(y);
            return;
        }
        p7eVar.e = new FrameLayout(context);
        p7eVar.c.getClass();
        PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(pAGBannerSize);
        String str = this.c;
        pAGBannerRequest.setAdString(str);
        uaa.x(pAGBannerRequest, str, mediationBannerAdConfiguration);
        b8e b8eVar = p7eVar.b;
        n7e n7eVar = new n7e(this);
        b8eVar.getClass();
        PAGBannerAd.loadAd(this.d, pAGBannerRequest, n7eVar);
    }
}
