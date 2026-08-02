package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import com.ironsource.InterfaceC4246p3;
import com.ironsource.mediationsdk.adunit.adapter.BaseRewardedVideo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class LevelPlayBaseRewardedVideo<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseRewardedVideo<NetworkAdapter> implements InterfaceC4246p3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseRewardedVideo(@NotNull NetworkSettings networkSettings) {
        super(networkSettings);
        networkSettings.getClass();
    }

    @Override // com.ironsource.InterfaceC4246p3
    public void collectBiddingData(@Nullable AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        context.getClass();
        biddingDataCallback.getClass();
    }

    @Nullable
    public final String getDynamicUserId() {
        return p.g().f();
    }
}
