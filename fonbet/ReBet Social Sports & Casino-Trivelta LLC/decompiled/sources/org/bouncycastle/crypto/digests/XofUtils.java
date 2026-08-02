package org.bouncycastle.crypto.digests;

/* loaded from: classes5.dex */
public class XofUtils {
    public static byte[] leftEncode(long j10) {
        long j11 = j10;
        byte b10 = 1;
        while (true) {
            j11 >>= 8;
            if (j11 == 0) {
                break;
            }
            b10 = (byte) (b10 + 1);
        }
        byte[] bArr = new byte[b10 + 1];
        bArr[0] = b10;
        for (int i10 = 1; i10 <= b10; i10++) {
            bArr[i10] = (byte) (j10 >> ((b10 - i10) * 8));
        }
        return bArr;
    }

    public static byte[] rightEncode(long j10) {
        long j11 = j10;
        byte b10 = 1;
        while (true) {
            j11 >>= 8;
            if (j11 == 0) {
                break;
            }
            b10 = (byte) (b10 + 1);
        }
        byte[] bArr = new byte[b10 + 1];
        bArr[b10] = b10;
        for (int i10 = 0; i10 < b10; i10++) {
            bArr[i10] = (byte) (j10 >> (((b10 - i10) - 1) * 8));
        }
        return bArr;
    }
}
