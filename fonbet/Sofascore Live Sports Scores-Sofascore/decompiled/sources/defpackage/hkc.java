package defpackage;

import android.content.Context;
import android.view.View;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.mbridge.msdk.out.BannerAdWithCodeListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hkc extends BannerAdWithCodeListener implements MediationBannerAd {
    public final MediationAdLoadCallback a;
    public MBBannerView b;
    public MediationBannerAdCallback c;

    public hkc(MediationAdLoadCallback mediationAdLoadCallback) {
        this.a = mediationAdLoadCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r6 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BannerSize a(AdSize adSize, Context context, boolean z, dti dtiVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50));
        arrayList.add(new AdSize(300, 250));
        arrayList.add(new AdSize(728, 90));
        dtiVar.getClass();
        context.getClass();
        adSize.getClass();
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize != null) {
            adSize = findClosestSize;
        }
        r7 = adSize.equals(AdSize.BANNER) ? new BannerSize(4, 0, 0) : null;
        if (adSize.equals(AdSize.MEDIUM_RECTANGLE)) {
            r7 = new BannerSize(2, 0, 0);
        }
        if (adSize.equals(AdSize.LEADERBOARD)) {
            r7 = new BannerSize(3, adSize.getWidth(), 0);
        }
        if (r7 == null) {
            return new BannerSize(5, adSize.getWidth(), adSize.getHeight());
        }
        return r7;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void closeFullScreen(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.b;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onClick(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onCloseBanner(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLeaveApp(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdWithCodeListener
    public final void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str) {
        AdError n = vha.n(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        n.toString();
        this.a.onFailure(n);
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (mediationAdLoadCallback != null) {
            this.c = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void onLogImpression(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public final void showFullScreen(MBridgeIds mBridgeIds) {
        MediationBannerAdCallback mediationBannerAdCallback = this.c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }
}
