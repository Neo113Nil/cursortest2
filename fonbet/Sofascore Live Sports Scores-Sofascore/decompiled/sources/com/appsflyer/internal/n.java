package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;
import com.appsflyer.sdk_base.referrer.Referrer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AFe1jSDK.AFKeystoreWrapper((Referrer) obj2, (AFe1jSDK) obj);
                break;
            case 1:
                ((AFi1lSDK) obj2).AFKeystoreWrapper((Runnable) obj);
                break;
            case 2:
                AFi1mSDK.registerClient((AFi1mSDK) obj2, (Context) obj);
                break;
            case 3:
                ((AFi1oSDK) obj2).L_((SensorEvent) obj);
                break;
            case 4:
                ((AFi1sSDK) obj2).d((Context) obj);
                break;
            default:
                AFi1tSDK.registerClient((AFi1tSDK) obj2, (Context) obj);
                break;
        }
    }
}
