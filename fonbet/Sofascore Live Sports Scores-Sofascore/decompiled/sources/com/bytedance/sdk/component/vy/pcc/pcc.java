package com.bytedance.sdk.component.vy.pcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static volatile pcc sf;
    private volatile sf pcc;

    private pcc() {
    }

    public static pcc pcc() {
        if (sf == null) {
            synchronized (pcc.class) {
                try {
                    if (sf == null) {
                        sf = new pcc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sf;
    }

    public sf sf() {
        return this.pcc;
    }

    public void pcc(sf sfVar) {
        this.pcc = sfVar;
    }
}
