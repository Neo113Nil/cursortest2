package com.mbridge.msdk.out;

import com.mbridge.msdk.util.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class MBSplashLoadWithCodeListener implements MBSplashLoadListener {
    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str, int i) {
        onLoadFailedWithCode(mBridgeIds, a.a(5000, str), str, i);
    }

    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i, String str, int i2);
}
