package com.bytedance.sdk.openadsdk.core;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private static volatile gm pcc;

    private gm() {
    }

    public static gm pcc() {
        if (pcc == null) {
            synchronized (gm.class) {
                try {
                    if (pcc == null) {
                        pcc = new gm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public Long sf(String str, long j) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, j));
    }

    public int sf(String str, int i) {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, i);
    }

    public String sf(String str, String str2) {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", str, str2);
    }

    public void pcc(String str, String str2) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, str2);
    }

    public void pcc(String str, int i) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, Integer.valueOf(i));
    }

    public void pcc(String str, long j) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, Long.valueOf(j));
    }

    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str);
    }
}
