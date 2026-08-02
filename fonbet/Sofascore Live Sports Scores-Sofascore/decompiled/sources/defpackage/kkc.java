package defpackage;

import android.content.Context;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kkc extends RewardVideoWithCodeListener implements MediationRewardedAd {
    public final MediationAdLoadCallback a;
    public lkc b;
    public MediationRewardedAdCallback c;
    public final boolean d;
    public final dti e;
    public final /* synthetic */ int f;
    public Object g;

    public kkc(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, dti dtiVar, int i) {
        this.f = i;
        this.d = mediationRewardedAdConfiguration.getMediationExtras().getBoolean("mute_audio");
        this.a = mediationAdLoadCallback;
        this.e = dtiVar;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.c == null) {
            return;
        }
        if (rewardInfo == null || !rewardInfo.isCompleteView()) {
            String str = MintegralMediationAdapter.TAG;
        } else {
            this.c.onUserEarnedReward();
        }
        this.c.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onAdShow(MBridgeIds mBridgeIds) {
        lkc lkcVar;
        this.e.getClass();
        if (dti.x() && (lkcVar = this.b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(lkcVar);
        }
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public final void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        lkc lkcVar;
        this.e.getClass();
        if (dti.x() && (lkcVar = this.b) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(lkcVar);
        }
        AdError n = vha.n(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        n.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(n);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.c;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public final void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
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

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.c = (MediationRewardedAdCallback) this.a.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        int i;
        int i2 = this.f;
        boolean z = this.d;
        switch (i2) {
            case 0:
                d4a d4aVar = (d4a) this.g;
                i = z ? 1 : 2;
                MBBidRewardVideoHandler mBBidRewardVideoHandler = (MBBidRewardVideoHandler) d4aVar.b;
                if (mBBidRewardVideoHandler != null) {
                    mBBidRewardVideoHandler.playVideoMute(i);
                }
                MBBidRewardVideoHandler mBBidRewardVideoHandler2 = (MBBidRewardVideoHandler) ((d4a) this.g).b;
                if (mBBidRewardVideoHandler2 != null) {
                    mBBidRewardVideoHandler2.showFromBid();
                    break;
                }
                break;
            default:
                e3c e3cVar = (e3c) this.g;
                i = z ? 1 : 2;
                MBRewardVideoHandler mBRewardVideoHandler = (MBRewardVideoHandler) e3cVar.b;
                if (mBRewardVideoHandler != null) {
                    mBRewardVideoHandler.playVideoMute(i);
                }
                MBRewardVideoHandler mBRewardVideoHandler2 = (MBRewardVideoHandler) ((e3c) this.g).b;
                if (mBRewardVideoHandler2 != null) {
                    mBRewardVideoHandler2.show();
                    break;
                }
                break;
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
    }
}
