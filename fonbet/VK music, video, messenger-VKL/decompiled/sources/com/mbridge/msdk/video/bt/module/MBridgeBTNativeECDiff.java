package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.impl.k;

/* loaded from: classes14.dex */
public class MBridgeBTNativeECDiff extends BTBaseView {
    public View ctaView;

    public MBridgeBTNativeECDiff(Context context) {
        super(context);
    }

    public boolean checkChinaProgressBarStatus() {
        return false;
    }

    public MBridgeBTNativeECDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
    }

    public void setChinaCTAData(CampaignEx campaignEx) {
    }

    public void doChinaJumpClick(Context context, k kVar) {
    }
}
