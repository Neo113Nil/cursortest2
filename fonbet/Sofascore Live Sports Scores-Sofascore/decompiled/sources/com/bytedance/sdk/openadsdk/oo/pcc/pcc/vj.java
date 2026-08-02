package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vj {
    private static final byte[] pcc = {105, -42, 73, -118, 67, -35, 89, -76, 122, -9, 45, 88, 34, 76, 10, 55};
    private static byte[] sf = null;

    public static byte[] pcc() {
        byte[] bArr = sf;
        if (bArr == null) {
            bArr = new byte[pcc.length];
            int i = 0;
            while (true) {
                byte[] bArr2 = pcc;
                if (i >= bArr2.length) {
                    break;
                }
                bArr[i] = (byte) (bArr2[i] ^ 20);
                i++;
            }
            sf = bArr;
        }
        return bArr;
    }
}
