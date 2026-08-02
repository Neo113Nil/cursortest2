package com.bytedance.sdk.component.sf.pcc.sf;

import defpackage.ilg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class wh {
    static vj pcc;
    static long sf;

    private wh() {
    }

    public static void pcc(vj vjVar) {
        if (vjVar.wh != null || vjVar.qf != null) {
            ilg.c();
            return;
        }
        if (vjVar.oo) {
            return;
        }
        synchronized (wh.class) {
            try {
                long j = sf;
                if (j + 8192 > 65536) {
                    return;
                }
                sf = j + 8192;
                vjVar.wh = pcc;
                vjVar.gm = 0;
                vjVar.sf = 0;
                pcc = vjVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static vj pcc() {
        synchronized (wh.class) {
            vj vjVar = pcc;
            if (vjVar != null) {
                pcc = vjVar.wh;
                vjVar.wh = null;
                sf -= 8192;
                return vjVar;
            }
            return new vj();
        }
    }
}
