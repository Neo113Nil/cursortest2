package com.appsflyer.internal;

import com.appsflyer.sdk_base.referrer.ReferrerProp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFi1lSDK b;
    public final /* synthetic */ ReferrerProp c;

    public /* synthetic */ v(AFi1lSDK aFi1lSDK, ReferrerProp referrerProp, int i) {
        this.a = i;
        this.b = aFi1lSDK;
        this.c = referrerProp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ReferrerProp referrerProp = this.c;
        AFi1lSDK aFi1lSDK = this.b;
        switch (i) {
            case 0:
                aFi1lSDK.d(referrerProp);
                break;
            default:
                aFi1lSDK.unregisterClient(referrerProp);
                break;
        }
    }
}
