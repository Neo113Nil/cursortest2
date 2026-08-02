package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uyk extends pyk {
    @Override // defpackage.pyk
    public final String a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        return mediationInterstitialAdConfiguration.getBidResponse();
    }

    @Override // defpackage.pyk
    public final void b(AdConfig adConfig, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (TextUtils.isEmpty(watermark)) {
            return;
        }
        adConfig.setWatermark(watermark);
    }
}
