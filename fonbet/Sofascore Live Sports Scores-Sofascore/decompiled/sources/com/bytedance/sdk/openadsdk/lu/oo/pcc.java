package com.bytedance.sdk.openadsdk.lu.oo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static boolean pcc(long j) {
        return j - (j % 86400000) == pcc();
    }

    public static long pcc() {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis - (currentTimeMillis % 86400000);
    }
}
