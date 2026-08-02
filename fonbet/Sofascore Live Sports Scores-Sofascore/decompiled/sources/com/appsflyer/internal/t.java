package com.appsflyer.internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFi1iSDK b;

    public /* synthetic */ t(AFi1iSDK aFi1iSDK, int i) {
        this.a = i;
        this.b = aFi1iSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AFi1iSDK aFi1iSDK = this.b;
        switch (i) {
            case 0:
                aFi1iSDK.v();
                break;
            case 1:
                aFi1iSDK.force();
                break;
            default:
                aFi1iSDK.w();
                break;
        }
    }
}
