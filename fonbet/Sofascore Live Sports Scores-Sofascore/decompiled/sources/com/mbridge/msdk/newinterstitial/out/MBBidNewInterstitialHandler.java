package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.strategy.base.BidAdHandler;
import com.mbridge.msdk.out.strategy.component.BidComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.interstitial.BidNewInterstitialStrategy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBBidNewInterstitialHandler extends BidAdHandler {
    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    public void initStrategy(String str, String str2) {
        this.legacyBidVideoAdStrategy = new BidNewInterstitialStrategy(str2, str);
        this.componentBidVideoAdStrategy = new BidComponentStrategy(str2, str, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        super(str, str2);
    }
}
