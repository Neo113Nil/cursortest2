package org.spongycastle.pqc.crypto.newhope;

import java.security.SecureRandom;
import org.spongycastle.crypto.digests.s;

/* loaded from: classes5.dex */
public abstract class g {
    public static void a(short[] sArr, byte[] bArr, byte[] bArr2) {
        h.b(sArr, bArr2);
        System.arraycopy(bArr2, 1792, bArr, 0, 32);
    }

    public static void b(byte[] bArr, short[] sArr, short[] sArr2) {
        h.g(bArr, sArr);
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 * 4;
            bArr[i10 + 1792] = (byte) ((sArr2[i11 + 3] << 6) | sArr2[i11] | (sArr2[i11 + 1] << 2) | (sArr2[i11 + 2] << 4));
        }
    }

    public static void c(short[] sArr, byte[] bArr) {
        h.i(sArr, bArr);
    }

    public static void d(byte[] bArr) {
        s sVar = new s(256);
        sVar.update(bArr, 0, 32);
        sVar.doFinal(bArr, 0);
    }

    public static void e(SecureRandom secureRandom, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[1024];
        byte[] bArr4 = new byte[32];
        a(sArr, bArr4, bArr3);
        short[] sArr2 = new short[1024];
        c(sArr2, bArr4);
        byte[] bArr5 = new byte[32];
        secureRandom.nextBytes(bArr5);
        short[] sArr3 = new short[1024];
        h.d(sArr3, bArr5, (byte) 0);
        h.h(sArr3);
        short[] sArr4 = new short[1024];
        h.d(sArr4, bArr5, (byte) 1);
        h.h(sArr4);
        short[] sArr5 = new short[1024];
        h.f(sArr2, sArr3, sArr5);
        h.a(sArr5, sArr4, sArr5);
        short[] sArr6 = new short[1024];
        h.f(sArr, sArr3, sArr6);
        h.c(sArr6);
        short[] sArr7 = new short[1024];
        h.d(sArr7, bArr5, (byte) 2);
        h.a(sArr6, sArr7, sArr6);
        short[] sArr8 = new short[1024];
        b.e(sArr8, sArr6, bArr5, (byte) 3);
        b(bArr2, sArr5, sArr8);
        b.f(bArr, sArr6, sArr8);
        d(bArr);
    }
}
