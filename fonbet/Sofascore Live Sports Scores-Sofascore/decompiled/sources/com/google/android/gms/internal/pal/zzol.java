package com.google.android.gms.internal.pal;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzol {
    static {
        a(1, 0);
        a(2, 32);
        a(2, 16);
        a(2, 17);
        a(2, 18);
        a(2, 1);
        a(2, 2);
        a(2, 3);
        a(2, 1);
        a(2, 2);
        a(2, 3);
        Charset charset = StandardCharsets.UTF_8;
        "KEM".getBytes(charset);
        "HPKE".getBytes(charset);
        "HPKE-v1".getBytes(charset);
    }

    public static byte[] a(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }
}
