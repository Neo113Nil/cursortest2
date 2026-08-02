package org.bouncycastle.its.asn1;

import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
class Utils {
    public static byte[] octetStringFixed(byte[] bArr) {
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException("octet string out of range");
        }
        return Arrays.clone(bArr);
    }

    public static byte[] octetStringFixed(byte[] bArr, int i10) {
        if (bArr.length == i10) {
            return bArr;
        }
        throw new IllegalArgumentException("octet string out of range");
    }
}
