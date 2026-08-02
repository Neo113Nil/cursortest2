package com.appsflyer.internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AFb1bSDK.unregisterClient((AFb1bSDK) obj);
                break;
            case 1:
                AFa1zSDK.registerClient((AFc1aSDK) obj);
                break;
            default:
                ((AFd1uSDK) obj).d();
                break;
        }
    }
}
