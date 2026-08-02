package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.strategy.component.BaseComponentStrategy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseComponentStrategy.AnonymousClass1 b;
    public final /* synthetic */ MBridgeIds c;

    public /* synthetic */ a(BaseComponentStrategy.AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds, int i) {
        this.a = i;
        this.b = anonymousClass1;
        this.c = mBridgeIds;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MBridgeIds mBridgeIds = this.c;
        BaseComponentStrategy.AnonymousClass1 anonymousClass1 = this.b;
        switch (i) {
            case 0:
                anonymousClass1.lambda$onAdShow$0(mBridgeIds);
                break;
            case 1:
                anonymousClass1.lambda$onEndCardShow$5(mBridgeIds);
                break;
            case 2:
                anonymousClass1.lambda$onVideoComplete$4(mBridgeIds);
                break;
            case 3:
                anonymousClass1.lambda$onVideoAdClicked$3(mBridgeIds);
                break;
            case 4:
                anonymousClass1.lambda$onLoadSuccess$8(mBridgeIds);
                break;
            default:
                anonymousClass1.lambda$onVideoLoadSuccess$7(mBridgeIds);
                break;
        }
    }
}
