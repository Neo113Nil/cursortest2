package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import com.ironsource.InterfaceC2644s3;
import com.ironsource.mediationsdk.adunit.adapter.BaseBanner;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class LevelPlayBaseBanner<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseBanner<NetworkAdapter> implements InterfaceC2644s3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseBanner(NetworkSettings networkSettings) {
        super(networkSettings);
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
    }

    @Override // com.ironsource.InterfaceC2644s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
    }
}
