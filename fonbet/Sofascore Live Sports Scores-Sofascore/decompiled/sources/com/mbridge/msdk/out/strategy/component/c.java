package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.strategy.component.BaseComponentStrategy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MBridgeIds b;
    public final /* synthetic */ RewardInfo c;
    public final /* synthetic */ com.mbridge.msdk.config.manager.callback.b d;

    public /* synthetic */ c(com.mbridge.msdk.config.manager.callback.b bVar, MBridgeIds mBridgeIds, RewardInfo rewardInfo, int i) {
        this.a = i;
        this.d = bVar;
        this.b = mBridgeIds;
        this.c = rewardInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RewardInfo rewardInfo = this.c;
        MBridgeIds mBridgeIds = this.b;
        com.mbridge.msdk.config.manager.callback.b bVar = this.d;
        switch (i) {
            case 0:
                ((BaseComponentStrategy.AnonymousClass1) bVar).lambda$onAdClose$1(mBridgeIds, rewardInfo);
                break;
            default:
                ((BaseComponentStrategy.AnonymousClass2) bVar).lambda$onAdClose$1(mBridgeIds, rewardInfo);
                break;
        }
    }
}
