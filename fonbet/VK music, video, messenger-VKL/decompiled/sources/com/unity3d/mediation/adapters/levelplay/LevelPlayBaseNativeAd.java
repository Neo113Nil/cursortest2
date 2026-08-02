package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import com.ironsource.InterfaceC4540s3;
import com.ironsource.mediationsdk.adunit.adapter.BaseNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;

/* loaded from: classes14.dex */
public abstract class LevelPlayBaseNativeAd<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseNativeAd<NetworkAdapter> implements InterfaceC4540s3 {
    public LevelPlayBaseNativeAd(NetworkSettings networkSettings) {
        super(networkSettings);
    }

    @Override // com.ironsource.InterfaceC4540s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
    }
}
