package com.google.android.gms.internal.fido;

/* loaded from: classes9.dex */
public final class zzgj {
    public static byte[] zza(byte[]... bArr) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= bArr.length) {
                break;
            }
            i12 += bArr[i11].length;
            i11++;
        }
        byte[] bArr2 = new byte[i12];
        int i13 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i13, length);
            i13 += length;
        }
        return bArr2;
    }
}
