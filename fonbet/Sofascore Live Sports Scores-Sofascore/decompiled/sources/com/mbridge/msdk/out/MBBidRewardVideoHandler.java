package com.mbridge.msdk.out;

import android.content.Context;
import com.mbridge.msdk.out.strategy.base.BidAdHandler;
import com.mbridge.msdk.out.strategy.component.BidComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.reward.BidRewardVideoStrategy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBBidRewardVideoHandler extends BidAdHandler {
    private static final String TAG = "MBBidRewardVideoHandler";

    public MBBidRewardVideoHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    public void initStrategy(String str, String str2) {
        this.legacyBidVideoAdStrategy = new BidRewardVideoStrategy(str2, str);
        this.componentBidVideoAdStrategy = new BidComponentStrategy(str2, str, 94);
    }

    public MBBidRewardVideoHandler(String str, String str2) {
        super(str, str2);
    }
}
