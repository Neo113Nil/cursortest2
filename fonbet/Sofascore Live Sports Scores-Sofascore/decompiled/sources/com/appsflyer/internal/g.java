package com.appsflyer.internal;

import android.content.Intent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFb1bSDK b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ g(AFb1bSDK aFb1bSDK, Intent intent, int i) {
        this.a = i;
        this.b = aFb1bSDK;
        this.c = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Intent intent = this.c;
        AFb1bSDK aFb1bSDK = this.b;
        switch (i) {
            case 0:
                AFb1bSDK.j_(aFb1bSDK, intent);
                break;
            default:
                AFb1bSDK.i_(aFb1bSDK, intent);
                break;
        }
    }
}
