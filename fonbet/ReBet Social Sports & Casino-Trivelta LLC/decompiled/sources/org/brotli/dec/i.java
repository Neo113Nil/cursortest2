package org.brotli.dec;

import kotlin.UByte;

/* loaded from: classes5.dex */
public final class i {
    private byte[] byteBuffer;
    private int[] intBuffer;

    public static void a(i iVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int[] iArr = iVar.intBuffer;
            byte[] bArr = iVar.byteBuffer;
            int i12 = i11 * 4;
            iArr[i11] = ((bArr[i12 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i12] & UByte.MAX_VALUE) | ((bArr[i12 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i12 + 2] & UByte.MAX_VALUE) << 16);
        }
    }

    public static void b(i iVar, byte[] bArr, int[] iArr) {
        iVar.byteBuffer = bArr;
        iVar.intBuffer = iArr;
    }
}
