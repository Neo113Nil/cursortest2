package defpackage;

import android.content.Context;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ikc extends NewInterstitialWithCodeListener implements MediationInterstitialAd {
    public final MediationAdLoadCallback a;
    public lkc b;
    public MediationInterstitialAdCallback c;
    public final boolean d;
    public final dti e;
    public final /* synthetic */ int f;
    public Object g;

    public ikc(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, dti dtiVar, int i) {
        this.f = i;
        this.d = mediationInterstitialAdConfiguration.getMediationExtras().getBoolean("mute_audio");
        this.a = mediationAdLoadCallback;
        this.e = dtiVar;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        lkc lkcVar;
        this.e.getClass();
        if (dti.x() && (lkcVar = this.b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(lkcVar);
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            this.c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public final void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
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

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.c = (MediationInterstitialAdCallback) this.a.onSuccess(this);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public final void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        lkc lkcVar;
        this.e.getClass();
        if (dti.x() && (lkcVar = this.b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(lkcVar);
        }
        AdError n = vha.n(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        n.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(n);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        int i;
        int i2 = this.f;
        boolean z = this.d;
        switch (i2) {
            case 0:
                yia yiaVar = (yia) this.g;
                i = z ? 1 : 2;
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = (MBBidNewInterstitialHandler) yiaVar.b;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.playVideoMute(i);
                }
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler2 = (MBBidNewInterstitialHandler) ((yia) this.g).b;
                if (mBBidNewInterstitialHandler2 != null) {
                    mBBidNewInterstitialHandler2.showFromBid();
                    break;
                }
                break;
            default:
                bka bkaVar = (bka) this.g;
                i = z ? 1 : 2;
                MBNewInterstitialHandler mBNewInterstitialHandler = (MBNewInterstitialHandler) bkaVar.b;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.playVideoMute(i);
                }
                MBNewInterstitialHandler mBNewInterstitialHandler2 = (MBNewInterstitialHandler) ((bka) this.g).b;
                if (mBNewInterstitialHandler2 != null) {
                    mBNewInterstitialHandler2.show();
                    break;
                }
                break;
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }
}
