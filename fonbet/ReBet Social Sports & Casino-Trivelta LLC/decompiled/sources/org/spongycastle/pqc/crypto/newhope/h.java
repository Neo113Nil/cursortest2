package org.spongycastle.pqc.crypto.newhope;

import android.R;
import kotlin.UByte;
import kotlin.UShort;
import org.spongycastle.crypto.digests.v;

/* loaded from: classes5.dex */
public abstract class h {
    public static void a(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < 1024; i10++) {
            sArr3[i10] = j.a((short) (sArr[i10] + sArr2[i10]));
        }
    }

    public static void b(short[] sArr, byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 7;
            int i12 = bArr[i11] & UByte.MAX_VALUE;
            byte b10 = bArr[i11 + 1];
            int i13 = b10 & UByte.MAX_VALUE;
            int i14 = bArr[i11 + 2] & UByte.MAX_VALUE;
            byte b11 = bArr[i11 + 3];
            int i15 = b11 & UByte.MAX_VALUE;
            int i16 = bArr[i11 + 4] & UByte.MAX_VALUE;
            byte b12 = bArr[i11 + 5];
            int i17 = b12 & UByte.MAX_VALUE;
            int i18 = bArr[i11 + 6] & UByte.MAX_VALUE;
            int i19 = i10 * 4;
            sArr[i19] = (short) (i12 | ((b10 & 63) << 8));
            sArr[i19 + 1] = (short) ((i13 >>> 6) | (i14 << 2) | ((b11 & 15) << 10));
            sArr[i19 + 2] = (short) ((i15 >>> 4) | (i16 << 4) | ((b12 & 3) << 12));
            sArr[i19 + 3] = (short) ((i18 << 6) | (i17 >>> 2));
        }
    }

    public static void c(short[] sArr) {
        f.a(sArr);
        f.b(sArr, i.OMEGAS_INV_MONTGOMERY);
        f.c(sArr, i.PSIS_INV_MONTGOMERY);
    }

    public static void d(short[] sArr, byte[] bArr, byte b10) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b10;
        byte[] bArr3 = new byte[4096];
        a.a(bArr, bArr2, bArr3, 0, 4096);
        for (int i10 = 0; i10 < 1024; i10++) {
            int a10 = Aj.f.a(bArr3, i10 * 4);
            int i11 = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 += (a10 >> i12) & R.attr.cacheColorHint;
            }
            sArr[i10] = (short) (((((i11 >>> 24) + i11) & 255) + 12289) - (((i11 >>> 16) + (i11 >>> 8)) & 255));
        }
    }

    public static short e(short s10) {
        short a10 = j.a(s10);
        int i10 = a10 - 12289;
        return (short) (((a10 ^ i10) & (i10 >> 31)) ^ i10);
    }

    public static void f(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < 1024; i10++) {
            sArr3[i10] = j.b((sArr[i10] & UShort.MAX_VALUE) * (65535 & j.b((sArr2[i10] & UShort.MAX_VALUE) * 3186)));
        }
    }

    public static void g(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 4;
            short e10 = e(sArr[i11]);
            short e11 = e(sArr[i11 + 1]);
            short e12 = e(sArr[i11 + 2]);
            short e13 = e(sArr[i11 + 3]);
            int i12 = i10 * 7;
            bArr[i12] = (byte) e10;
            bArr[i12 + 1] = (byte) ((e10 >> 8) | (e11 << 6));
            bArr[i12 + 2] = (byte) (e11 >> 2);
            bArr[i12 + 3] = (byte) ((e11 >> 10) | (e12 << 4));
            bArr[i12 + 4] = (byte) (e12 >> 4);
            bArr[i12 + 5] = (byte) ((e12 >> 12) | (e13 << 2));
            bArr[i12 + 6] = (byte) (e13 >> 6);
        }
    }

    public static void h(short[] sArr) {
        f.c(sArr, i.PSIS_BITREV_MONTGOMERY);
        f.b(sArr, i.OMEGAS_MONTGOMERY);
    }

    public static void i(short[] sArr, byte[] bArr) {
        v vVar = new v(128);
        vVar.update(bArr, 0, bArr.length);
        int i10 = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            vVar.z(bArr2, 0, 256);
            for (int i11 = 0; i11 < 256; i11 += 2) {
                int i12 = ((bArr2[i11] & UByte.MAX_VALUE) | ((bArr2[i11 + 1] & UByte.MAX_VALUE) << 8)) & 16383;
                if (i12 < 12289) {
                    int i13 = i10 + 1;
                    sArr[i10] = (short) i12;
                    if (i13 == 1024) {
                        return;
                    } else {
                        i10 = i13;
                    }
                }
            }
        }
    }
}
