package defpackage;

import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ckc extends MBSplashLoadWithCodeListener implements MediationAppOpenAd, MBSplashShowListener {
    public final MediationAdLoadCallback a;
    public lkc b;
    public MediationAppOpenAdCallback c;
    public by9 d;
    public final dti e;

    public ckc(MediationAdLoadCallback mediationAdLoadCallback, dti dtiVar) {
        this.a = mediationAdLoadCallback;
        this.e = dtiVar;
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onDismiss(MBridgeIds mBridgeIds, int i) {
        MBSplashHandler mBSplashHandler;
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
        by9 by9Var = this.d;
        if (by9Var == null || (mBSplashHandler = (MBSplashHandler) by9Var.a) == null) {
            return;
        }
        mBSplashHandler.onDestroy();
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadWithCodeListener
    public final void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str, int i2) {
        lkc lkcVar;
        this.e.getClass();
        if (dti.x() && (lkcVar = this.b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(lkcVar);
        }
        AdError n = vha.n(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        n.toString();
        this.a.onFailure(n);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds, int i) {
        this.c = (MediationAppOpenAdCallback) this.a.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onShowFailed(MBridgeIds mBridgeIds, String str) {
        lkc lkcVar;
        this.e.getClass();
        if (dti.x() && (lkcVar = this.b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(lkcVar);
        }
        if (this.c != null) {
            AdError n = vha.n(100, str);
            String str2 = MintegralMediationAdapter.TAG;
            n.toString();
            this.c.onAdFailedToShow(n);
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onShowSuccessed(MBridgeIds mBridgeIds) {
        lkc lkcVar;
        this.e.getClass();
        if (dti.x() && (lkcVar = this.b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(lkcVar);
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            this.c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public final void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public final void onAdTick(MBridgeIds mBridgeIds, long j) {
    }
}
