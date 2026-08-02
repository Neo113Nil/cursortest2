package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import com.ironsource.InterfaceC2644s3;
import com.ironsource.mediationsdk.adunit.adapter.BaseRewardedVideo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class LevelPlayBaseRewardedVideo<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseRewardedVideo<NetworkAdapter> implements InterfaceC2644s3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseRewardedVideo(NetworkSettings networkSettings) {
        super(networkSettings);
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
    }

    @Override // com.ironsource.InterfaceC2644s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
    }

    protected final String getDynamicUserId() {
        return p.h().g();
    }
}
