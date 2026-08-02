package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzibr {
    public static byte[] a(String str) {
        if ((str.length() & 1) != 0) {
            a70.p("Expected a string of even length");
            return null;
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            int digit = Character.digit(str.charAt(i2), 16);
            int digit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                a70.p("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }
}
