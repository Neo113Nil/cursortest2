package com.google.android.gms.internal.ads;

import defpackage.a70;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhma {
    public static byte[] a(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        a70.p("n must not be negative");
        return null;
    }

    public static byte[] b(BigInteger bigInteger, int i) {
        if (bigInteger.signum() == -1) {
            a70.p("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            defpackage.zzl.x("integer too large");
            return null;
        }
        if (length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - length, length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, length);
        }
        defpackage.zzl.x("integer too large");
        return null;
    }
}
