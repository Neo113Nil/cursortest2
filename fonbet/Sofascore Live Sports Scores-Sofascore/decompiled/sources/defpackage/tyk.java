package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.VungleBannerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tyk extends lyk {
    @Override // defpackage.lyk
    public final void a(VungleBannerView vungleBannerView, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        String watermark = mediationBannerAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            vungleBannerView.getAdConfig().setWatermark(watermark);
        }
        vungleBannerView.load(bidResponse);
    }
}
