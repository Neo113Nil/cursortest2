package defpackage;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l7e implements r7e {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MediationAdConfiguration d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l7e(Object obj, String str, MediationAdConfiguration mediationAdConfiguration, String str2, int i) {
        this.a = i;
        this.e = obj;
        this.b = str;
        this.d = mediationAdConfiguration;
        this.c = str2;
    }

    @Override // defpackage.r7e
    public final void a(AdError adError) {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                adError.toString();
                ((m7e) obj).a.onFailure(adError);
                break;
            case 1:
                adError.toString();
                ((u7e) obj).a.onFailure(adError);
                break;
            case 2:
                adError.toString();
                ((y7e) obj).s.onFailure(adError);
                break;
            default:
                adError.toString();
                ((a8e) obj).a.onFailure(adError);
                break;
        }
    }

    @Override // defpackage.r7e
    public final void b() {
        int i = this.a;
        String str = this.c;
        MediationAdConfiguration mediationAdConfiguration = this.d;
        String str2 = this.b;
        Object obj = this.e;
        switch (i) {
            case 0:
                m7e m7eVar = (m7e) obj;
                m7eVar.c.getClass();
                PAGAppOpenRequest pAGAppOpenRequest = new PAGAppOpenRequest();
                pAGAppOpenRequest.setAdString(str2);
                uaa.x(pAGAppOpenRequest, str2, (MediationAppOpenAdConfiguration) mediationAdConfiguration);
                b8e b8eVar = m7eVar.b;
                k7e k7eVar = new k7e(this);
                b8eVar.getClass();
                PAGAppOpenAd.loadAd(str, pAGAppOpenRequest, k7eVar);
                break;
            case 1:
                u7e u7eVar = (u7e) obj;
                u7eVar.c.getClass();
                PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
                pAGInterstitialRequest.setAdString(str2);
                uaa.x(pAGInterstitialRequest, str2, (MediationInterstitialAdConfiguration) mediationAdConfiguration);
                b8e b8eVar2 = u7eVar.b;
                t7e t7eVar = new t7e(this);
                b8eVar2.getClass();
                PAGInterstitialAd.loadAd(str, pAGInterstitialRequest, t7eVar);
                break;
            case 2:
                y7e y7eVar = (y7e) obj;
                y7eVar.v.getClass();
                PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
                pAGNativeRequest.setAdString(str2);
                uaa.x(pAGNativeRequest, str2, (MediationNativeAdConfiguration) mediationAdConfiguration);
                b8e b8eVar3 = y7eVar.u;
                w7e w7eVar = new w7e(this);
                b8eVar3.getClass();
                PAGNativeAd.loadAd(str, pAGNativeRequest, w7eVar);
                break;
            default:
                a8e a8eVar = (a8e) obj;
                a8eVar.c.getClass();
                PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
                pAGRewardedRequest.setAdString(str2);
                uaa.x(pAGRewardedRequest, str2, (MediationRewardedAdConfiguration) mediationAdConfiguration);
                b8e b8eVar4 = a8eVar.b;
                z7e z7eVar = new z7e(this);
                b8eVar4.getClass();
                PAGRewardedAd.loadAd(str, pAGRewardedRequest, z7eVar);
                break;
        }
    }
}
