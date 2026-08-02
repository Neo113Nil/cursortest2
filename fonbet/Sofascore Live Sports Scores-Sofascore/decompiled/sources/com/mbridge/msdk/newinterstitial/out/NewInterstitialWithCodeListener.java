package com.mbridge.msdk.newinterstitial.out;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.util.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class NewInterstitialWithCodeListener implements NewInterstitialListener {
    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
        onResourceLoadFailWithCode(mBridgeIds, a.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, str), str);
    }

    public abstract void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str);

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onShowFail(MBridgeIds mBridgeIds, String str) {
        onShowFailWithCode(mBridgeIds, a.b(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, str), str);
    }

    public abstract void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str);
}
