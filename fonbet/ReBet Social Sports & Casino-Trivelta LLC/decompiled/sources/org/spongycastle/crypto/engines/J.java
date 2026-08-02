package org.spongycastle.crypto.engines;

import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class J implements org.spongycastle.crypto.e {

    /* renamed from: X, reason: collision with root package name */
    private final int[] f62494X = new int[4];
    private int[] rk;
    private static final byte[] Sbox = {-42, -112, -23, -2, -52, -31, Base64.padSymbol, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, ByteCompanionObject.MIN_VALUE, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, PSSSigner.TRAILER_IMPLICIT, ByteCompanionObject.MAX_VALUE, 17, -39, 92, 65, 31, Tnaf.POW_2_WIDTH, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};
    private static final int[] CK = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};
    private static final int[] FK = {-1548633402, 1453994832, 1736282519, -1301273892};

    private int l(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof org.spongycastle.crypto.params.w)) {
            throw new IllegalArgumentException("invalid parameter passed to SM4 init - " + jVar.getClass().getName());
        }
        byte[] a10 = ((org.spongycastle.crypto.params.w) jVar).a();
        if (a10.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        this.rk = k(z10, a10);
    }

    public final int b(int[] iArr, int i10) {
        return i((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i10) ^ iArr[0];
    }

    public final int c(int[] iArr, int i10) {
        return i((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i10) ^ iArr[1];
    }

    public final int d(int[] iArr, int i10) {
        return i((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i10) ^ iArr[2];
    }

    public final int e(int[] iArr, int i10) {
        return i((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i10) ^ iArr[3];
    }

    public final int f(int i10) {
        return l(i10, 24) ^ (((l(i10, 2) ^ i10) ^ l(i10, 10)) ^ l(i10, 18));
    }

    public final int g(int i10) {
        return l(i10, 23) ^ (l(i10, 13) ^ i10);
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    public final void h(int[] iArr, int i10) {
        int i11 = i10 + 1;
        int i12 = i10 + 2;
        int i13 = i10 + 3;
        int i14 = iArr[i10] ^ iArr[i13];
        iArr[i10] = i14;
        int i15 = i14 ^ iArr[i13];
        iArr[i13] = i15;
        iArr[i10] = iArr[i10] ^ i15;
        int i16 = iArr[i11] ^ iArr[i12];
        iArr[i11] = i16;
        int i17 = i16 ^ iArr[i12];
        iArr[i12] = i17;
        iArr[i11] = i17 ^ iArr[i11];
    }

    public final int i(int i10) {
        return f(m(i10));
    }

    public final int j(int i10) {
        return g(m(i10));
    }

    public final int[] k(boolean z10, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {Aj.f.a(bArr, 0), Aj.f.a(bArr, 4), Aj.f.a(bArr, 8), Aj.f.a(bArr, 12)};
        int i10 = iArr2[0];
        int[] iArr3 = FK;
        int[] iArr4 = {i10 ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z10) {
            int i11 = iArr4[0];
            int i12 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr5 = CK;
            int j10 = i11 ^ j(i12 ^ iArr5[0]);
            iArr[0] = j10;
            int j11 = j((j10 ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = j11;
            int j12 = j((j11 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = j12;
            iArr[3] = j((j12 ^ (iArr[0] ^ iArr[1])) ^ iArr5[3]) ^ iArr4[3];
            for (int i13 = 4; i13 < 32; i13++) {
                iArr[i13] = iArr[i13 - 4] ^ j(((iArr[i13 - 3] ^ iArr[i13 - 2]) ^ iArr[i13 - 1]) ^ CK[i13]);
            }
        } else {
            int i14 = iArr4[0];
            int i15 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr6 = CK;
            int j13 = i14 ^ j(i15 ^ iArr6[0]);
            iArr[31] = j13;
            int j14 = j((j13 ^ (iArr4[2] ^ iArr4[3])) ^ iArr6[1]) ^ iArr4[1];
            iArr[30] = j14;
            int j15 = j((j14 ^ (iArr4[3] ^ iArr[31])) ^ iArr6[2]) ^ iArr4[2];
            iArr[29] = j15;
            iArr[28] = j((j15 ^ (iArr[31] ^ iArr[30])) ^ iArr6[3]) ^ iArr4[3];
            for (int i16 = 27; i16 >= 0; i16--) {
                iArr[i16] = iArr[i16 + 4] ^ j(((iArr[i16 + 3] ^ iArr[i16 + 2]) ^ iArr[i16 + 1]) ^ CK[31 - i16]);
            }
        }
        return iArr;
    }

    public final int m(int i10) {
        byte[] bArr = Sbox;
        return (bArr[i10 & 255] & UByte.MAX_VALUE) | ((bArr[(i10 >> 24) & 255] & UByte.MAX_VALUE) << 24) | ((bArr[(i10 >> 16) & 255] & UByte.MAX_VALUE) << 16) | ((bArr[(i10 >> 8) & 255] & UByte.MAX_VALUE) << 8);
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.rk == null) {
            throw new IllegalStateException("SM4 not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        this.f62494X[0] = Aj.f.a(bArr, i10);
        this.f62494X[1] = Aj.f.a(bArr, i10 + 4);
        this.f62494X[2] = Aj.f.a(bArr, i10 + 8);
        this.f62494X[3] = Aj.f.a(bArr, i10 + 12);
        for (int i12 = 0; i12 < 32; i12 += 4) {
            int[] iArr = this.f62494X;
            iArr[0] = b(iArr, this.rk[i12]);
            int[] iArr2 = this.f62494X;
            iArr2[1] = c(iArr2, this.rk[i12 + 1]);
            int[] iArr3 = this.f62494X;
            iArr3[2] = d(iArr3, this.rk[i12 + 2]);
            int[] iArr4 = this.f62494X;
            iArr4[3] = e(iArr4, this.rk[i12 + 3]);
        }
        h(this.f62494X, 0);
        Aj.f.d(this.f62494X[0], bArr2, i11);
        Aj.f.d(this.f62494X[1], bArr2, i11 + 4);
        Aj.f.d(this.f62494X[2], bArr2, i11 + 8);
        Aj.f.d(this.f62494X[3], bArr2, i11 + 12);
        return 16;
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}
