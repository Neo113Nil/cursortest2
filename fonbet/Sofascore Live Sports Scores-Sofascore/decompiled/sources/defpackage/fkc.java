package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fkc extends NativeAdWithCodeListener {
    public final MediationAdLoadCallback a;
    public final ekc b;
    public final Context c;

    public fkc(ekc ekcVar, Context context, MediationAdLoadCallback mediationAdLoadCallback) {
        this.c = context;
        this.b = ekcVar;
        this.a = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdClick(Campaign campaign) {
        ekc ekcVar = this.b;
        MediationNativeAdCallback mediationNativeAdCallback = ekcVar.u;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            ekcVar.u.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public final void onAdLoadErrorWithCode(int i, String str) {
        AdError n = vha.n(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        n.toString();
        this.a.onFailure(n);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdLoaded(List list, int i) {
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (list == null || list.size() == 0) {
            AdError m = vha.m(104, "Mintegral SDK failed to return a native ad.");
            String str = MintegralMediationAdapter.TAG;
            m.toString();
            mediationAdLoadCallback.onFailure(m);
            return;
        }
        Campaign campaign = (Campaign) list.get(0);
        ekc ekcVar = this.b;
        ekcVar.s = campaign;
        if (campaign.getAppName() != null) {
            ekcVar.setHeadline(ekcVar.s.getAppName());
        }
        if (ekcVar.s.getAppDesc() != null) {
            ekcVar.setBody(ekcVar.s.getAppDesc());
        }
        if (ekcVar.s.getAdCall() != null) {
            ekcVar.setCallToAction(ekcVar.s.getAdCall());
        }
        ekcVar.setStarRating(Double.valueOf(ekcVar.s.getRating()));
        if (!TextUtils.isEmpty(ekcVar.s.getIconUrl())) {
            ekcVar.setIcon(new dkc(Uri.parse(ekcVar.s.getIconUrl())));
        }
        Context context = this.c;
        MBMediaView mBMediaView = new MBMediaView(context);
        mBMediaView.setVideoSoundOnOff(!ekcVar.v);
        mBMediaView.setNativeAd(ekcVar.s);
        ekcVar.setMediaView(mBMediaView);
        MBAdChoice mBAdChoice = new MBAdChoice(context);
        mBAdChoice.setCampaign(ekcVar.s);
        ekcVar.setAdChoicesContent(mBAdChoice);
        ekcVar.setOverrideClickHandling(true);
        ekcVar.u = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(ekcVar);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onLoggingImpression(int i) {
        MediationNativeAdCallback mediationNativeAdCallback = this.b.u;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public final void onAdFramesLoaded(List list) {
    }
}
