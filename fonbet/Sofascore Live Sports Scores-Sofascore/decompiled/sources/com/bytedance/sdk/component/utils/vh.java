package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh {
    private static final byte[] pcc = pcc("VP8X");

    public static boolean pcc(byte[] bArr, int i) {
        boolean pcc2;
        int i2;
        try {
            pcc2 = pcc(bArr, i + 12, pcc);
            i2 = i + 20;
        } catch (Throwable unused) {
        }
        if (bArr.length <= i2) {
            return false;
        }
        return pcc2 && ((bArr[i2] & 2) == 2);
    }

    private static byte[] pcc(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    private static boolean pcc(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
