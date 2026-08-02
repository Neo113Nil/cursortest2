package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.strategy.component.BaseComponentStrategy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseComponentStrategy.AnonymousClass2 b;
    public final /* synthetic */ MBridgeIds c;
    public final /* synthetic */ String d;

    public /* synthetic */ e(BaseComponentStrategy.AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds, String str, int i) {
        this.a = i;
        this.b = anonymousClass2;
        this.c = mBridgeIds;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        MBridgeIds mBridgeIds = this.c;
        BaseComponentStrategy.AnonymousClass2 anonymousClass2 = this.b;
        switch (i) {
            case 0:
                anonymousClass2.lambda$onShowFail$2(mBridgeIds, str);
                break;
            default:
                anonymousClass2.lambda$onVideoLoadFail$6(mBridgeIds, str);
                break;
        }
    }
}
