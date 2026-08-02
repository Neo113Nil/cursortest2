package com.mbridge.msdk.out;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mbridge.msdk.util.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class InterstitialVideoWithCodeListener implements InterstitialVideoListener {
    @Override // com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, a.b(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, str), str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str);

    @Override // com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListener
    public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        onVideoLoadFailWithCode(mBridgeIds, a.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, str), str);
    }

    public abstract void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str);
}
