package com.bytedance.sdk.component.qf.gm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private pcc pcc;
    private sf sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm {
        private static final oo pcc = new oo();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
    }

    private oo() {
        this.pcc = pcc.OFF;
        this.sf = new com.bytedance.sdk.component.qf.gm.sf();
    }

    public static void pcc(pcc pccVar) {
        synchronized (oo.class) {
            gm.pcc.pcc = pccVar;
        }
    }
}
