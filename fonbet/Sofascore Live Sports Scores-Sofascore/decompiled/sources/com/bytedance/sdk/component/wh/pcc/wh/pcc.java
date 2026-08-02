package com.bytedance.sdk.component.wh.pcc.wh;

import com.bytedance.sdk.component.wh.pcc.qf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static volatile sf pcc;

    public static sf pcc() {
        if (pcc == null) {
            synchronized (sf.class) {
                try {
                    if (pcc == null) {
                        pcc = new gm(qf.wh().vj(), new wh(qf.wh().vj()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }
}
