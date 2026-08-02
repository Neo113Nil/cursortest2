package org.spongycastle.crypto.engines;

import android.R;
import com.plaid.internal.EnumC3631g;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public final class T implements org.spongycastle.crypto.e {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[][] f62522c = {new byte[]{-87, 103, -77, -24, 4, -3, -93, 118, -102, -110, ByteCompanionObject.MIN_VALUE, 120, -28, -35, -47, 56, 13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 25, 91, Base64.padSymbol, 89, -13, -82, -94, -126, 99, 1, -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 37, 11, -69, 78, -119, 107, 83, 106, -76, -15, -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 3, 86, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 98, 113, -127, 121, 9, -83, 36, -51, -7, -40, -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 49, -62, 39, -112, 32, -10, 96, -1, -106, 92, -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 109, 70, -42, 62, 105, 100, 42, -50, -53, 47, -4, -105, 5, 122, -84, ByteCompanionObject.MAX_VALUE, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 88, 7, -103, 52, 110, 80, -34, 104, 101, PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, -54, Tnaf.POW_2_WIDTH, 33, -16, -45, 93, 15, 0, 111, -99, 54, 66, 74, 94, -63, -32}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 6, 63, 94, -70, -82, 91, -118, 0, PSSSigner.TRAILER_IMPLICIT, -99, 109, -63, -79, 14, ByteCompanionObject.MIN_VALUE, 93, -46, -43, -96, -124, 7, 20, -75, -112, 44, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 98, -106, 108, 66, -9, Tnaf.POW_2_WIDTH, 124, 40, 39, -116, 19, -107, -100, -57, 36, 70, 59, 112, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 43, -30, 121, 12, -86, -126, 65, 58, -22, -71, -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, -95, 29, Base64.padSymbol, -16, -34, -77, 11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 42, 73, -127, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 120, 92, 88, 25, -115, -27, -104, 87, 103, ByteCompanionObject.MAX_VALUE, 5, 100, -81, 99, -74, -2, -11, -73, 60, -91, -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 53, 106, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, -122, 86, 85, 9, -66, -111}};
    private int[] gSBox;
    private int[] gSubKeys;

    /* renamed from: a, reason: collision with root package name */
    public boolean f62523a = false;
    private int[] gMDS0 = new int[256];
    private int[] gMDS1 = new int[256];
    private int[] gMDS2 = new int[256];
    private int[] gMDS3 = new int[256];

    /* renamed from: b, reason: collision with root package name */
    public int f62524b = 0;
    private byte[] workingKey = null;

    public T() {
        for (int i10 = 0; i10 < 256; i10++) {
            byte[][] bArr = f62522c;
            int i11 = bArr[0][i10] & UByte.MAX_VALUE;
            int i12 = i(i11) & 255;
            int j10 = j(i11) & 255;
            int i13 = bArr[1][i10] & 255;
            int[] iArr = {i11, i13};
            int[] iArr2 = {i12, i(i13) & 255};
            int[] iArr3 = {j10, j(i13) & 255};
            int[] iArr4 = this.gMDS0;
            int i14 = iArr[1] | (iArr2[1] << 8);
            int i15 = iArr3[1];
            iArr4[i10] = i14 | (i15 << 16) | (i15 << 24);
            int[] iArr5 = this.gMDS1;
            int i16 = iArr3[0];
            iArr5[i10] = i16 | (i16 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr6 = this.gMDS2;
            int i17 = iArr2[1];
            int i18 = iArr3[1];
            iArr6[i10] = (iArr[1] << 16) | i17 | (i18 << 8) | (i18 << 24);
            int[] iArr7 = this.gMDS3;
            int i19 = iArr2[0];
            iArr7[i10] = (iArr3[0] << 16) | (iArr[0] << 8) | i19 | (i19 << 24);
        }
    }

    private void b(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
    }

    private void q(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10) ^ this.gSubKeys[4];
        int c11 = c(bArr, i10 + 4) ^ this.gSubKeys[5];
        int c12 = c(bArr, i10 + 8) ^ this.gSubKeys[6];
        int c13 = c(bArr, i10 + 12) ^ this.gSubKeys[7];
        int i12 = 39;
        for (int i13 = 0; i13 < 16; i13 += 2) {
            int e10 = e(c10);
            int f10 = f(c11);
            int[] iArr = this.gSubKeys;
            int i14 = c13 ^ (((f10 * 2) + e10) + iArr[i12]);
            c12 = ((c12 >>> 31) | (c12 << 1)) ^ ((e10 + f10) + iArr[i12 - 1]);
            c13 = (i14 << 31) | (i14 >>> 1);
            int e11 = e(c12);
            int f11 = f(c13);
            int[] iArr2 = this.gSubKeys;
            int i15 = i12 - 3;
            int i16 = c11 ^ (((f11 * 2) + e11) + iArr2[i12 - 2]);
            i12 -= 4;
            c10 = ((c10 >>> 31) | (c10 << 1)) ^ ((e11 + f11) + iArr2[i15]);
            c11 = (i16 << 31) | (i16 >>> 1);
        }
        b(this.gSubKeys[0] ^ c12, bArr2, i11);
        b(c13 ^ this.gSubKeys[1], bArr2, i11 + 4);
        b(this.gSubKeys[2] ^ c10, bArr2, i11 + 8);
        b(this.gSubKeys[3] ^ c11, bArr2, i11 + 12);
    }

    private void r(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int c10 = c(bArr, i10) ^ this.gSubKeys[0];
        int c11 = c(bArr, i10 + 4) ^ this.gSubKeys[1];
        int c12 = c(bArr, i10 + 8) ^ this.gSubKeys[2];
        int c13 = c(bArr, i10 + 12) ^ this.gSubKeys[3];
        int i12 = 8;
        for (int i13 = 0; i13 < 16; i13 += 2) {
            int e10 = e(c10);
            int f10 = f(c11);
            int[] iArr = this.gSubKeys;
            int i14 = c12 ^ ((e10 + f10) + iArr[i12]);
            c12 = (i14 << 31) | (i14 >>> 1);
            c13 = ((c13 >>> 31) | (c13 << 1)) ^ ((e10 + (f10 * 2)) + iArr[i12 + 1]);
            int e11 = e(c12);
            int f11 = f(c13);
            int[] iArr2 = this.gSubKeys;
            int i15 = i12 + 3;
            int i16 = c10 ^ ((e11 + f11) + iArr2[i12 + 2]);
            c10 = (i16 << 31) | (i16 >>> 1);
            i12 += 4;
            c11 = ((c11 >>> 31) | (c11 << 1)) ^ ((e11 + (f11 * 2)) + iArr2[i15]);
        }
        b(this.gSubKeys[4] ^ c12, bArr2, i11);
        b(c13 ^ this.gSubKeys[5], bArr2, i11 + 4);
        b(this.gSubKeys[6] ^ c10, bArr2, i11 + 8);
        b(this.gSubKeys[7] ^ c11, bArr2, i11 + 12);
    }

    private void s(byte[] bArr) {
        int m10;
        int n10;
        int o10;
        int p10;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.gSubKeys = new int[40];
        int i14 = this.f62524b;
        if (i14 < 1) {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (i14 > 4) {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        for (int i15 = 0; i15 < this.f62524b; i15++) {
            int i16 = i15 * 8;
            iArr[i15] = c(bArr, i16);
            int c10 = c(bArr, i16 + 4);
            iArr2[i15] = c10;
            iArr3[(this.f62524b - 1) - i15] = k(iArr[i15], c10);
        }
        for (int i17 = 0; i17 < 20; i17++) {
            int i18 = 33686018 * i17;
            int d10 = d(i18, iArr);
            int d11 = d(i18 + R.attr.cacheColorHint, iArr2);
            int i19 = (d11 >>> 24) | (d11 << 8);
            int i20 = d10 + i19;
            int[] iArr4 = this.gSubKeys;
            int i21 = i17 * 2;
            iArr4[i21] = i20;
            int i22 = i20 + i19;
            iArr4[i21 + 1] = (i22 << 9) | (i22 >>> 23);
        }
        int i23 = iArr3[0];
        int i24 = iArr3[1];
        int i25 = 2;
        int i26 = iArr3[2];
        int i27 = iArr3[3];
        this.gSBox = new int[1024];
        int i28 = 0;
        while (i28 < 256) {
            int i29 = this.f62524b & 3;
            if (i29 != 0) {
                if (i29 == 1) {
                    int[] iArr5 = this.gSBox;
                    int i30 = i28 * 2;
                    int[] iArr6 = this.gMDS0;
                    byte[][] bArr2 = f62522c;
                    iArr5[i30] = iArr6[(bArr2[0][i28] & UByte.MAX_VALUE) ^ m(i23)];
                    this.gSBox[i30 + 1] = this.gMDS1[(bArr2[0][i28] & UByte.MAX_VALUE) ^ n(i23)];
                    this.gSBox[i30 + 512] = this.gMDS2[(bArr2[1][i28] & UByte.MAX_VALUE) ^ o(i23)];
                    this.gSBox[i30 + 513] = this.gMDS3[(bArr2[1][i28] & UByte.MAX_VALUE) ^ p(i23)];
                } else if (i29 == i25) {
                    i13 = i28;
                    i12 = i13;
                    i11 = i12;
                    i10 = i11;
                    int[] iArr7 = this.gSBox;
                    int i31 = i28 * 2;
                    int[] iArr8 = this.gMDS0;
                    byte[][] bArr3 = f62522c;
                    byte[] bArr4 = bArr3[0];
                    iArr7[i31] = iArr8[(bArr4[(bArr4[i12] & UByte.MAX_VALUE) ^ m(i24)] & UByte.MAX_VALUE) ^ m(i23)];
                    this.gSBox[i31 + 1] = this.gMDS1[(bArr3[0][(bArr3[1][i11] & UByte.MAX_VALUE) ^ n(i24)] & UByte.MAX_VALUE) ^ n(i23)];
                    this.gSBox[i31 + 512] = this.gMDS2[(bArr3[1][(bArr3[0][i10] & UByte.MAX_VALUE) ^ o(i24)] & UByte.MAX_VALUE) ^ o(i23)];
                    int[] iArr9 = this.gMDS3;
                    byte[] bArr5 = bArr3[1];
                    this.gSBox[i31 + 513] = iArr9[(bArr5[(bArr5[i13] & UByte.MAX_VALUE) ^ p(i24)] & UByte.MAX_VALUE) ^ p(i23)];
                } else if (i29 == 3) {
                    p10 = i28;
                    m10 = p10;
                    n10 = m10;
                    o10 = n10;
                }
                i28++;
                i25 = 2;
            } else {
                byte[][] bArr6 = f62522c;
                m10 = (bArr6[1][i28] & UByte.MAX_VALUE) ^ m(i27);
                n10 = (bArr6[0][i28] & UByte.MAX_VALUE) ^ n(i27);
                o10 = (bArr6[0][i28] & UByte.MAX_VALUE) ^ o(i27);
                p10 = (bArr6[1][i28] & UByte.MAX_VALUE) ^ p(i27);
            }
            byte[][] bArr7 = f62522c;
            i12 = (bArr7[1][m10] & UByte.MAX_VALUE) ^ m(i26);
            i11 = (bArr7[1][n10] & UByte.MAX_VALUE) ^ n(i26);
            i10 = (bArr7[0][o10] & UByte.MAX_VALUE) ^ o(i26);
            i13 = (bArr7[0][p10] & UByte.MAX_VALUE) ^ p(i26);
            int[] iArr72 = this.gSBox;
            int i312 = i28 * 2;
            int[] iArr82 = this.gMDS0;
            byte[][] bArr32 = f62522c;
            byte[] bArr42 = bArr32[0];
            iArr72[i312] = iArr82[(bArr42[(bArr42[i12] & UByte.MAX_VALUE) ^ m(i24)] & UByte.MAX_VALUE) ^ m(i23)];
            this.gSBox[i312 + 1] = this.gMDS1[(bArr32[0][(bArr32[1][i11] & UByte.MAX_VALUE) ^ n(i24)] & UByte.MAX_VALUE) ^ n(i23)];
            this.gSBox[i312 + 512] = this.gMDS2[(bArr32[1][(bArr32[0][i10] & UByte.MAX_VALUE) ^ o(i24)] & UByte.MAX_VALUE) ^ o(i23)];
            int[] iArr92 = this.gMDS3;
            byte[] bArr52 = bArr32[1];
            this.gSBox[i312 + 513] = iArr92[(bArr52[(bArr52[i13] & UByte.MAX_VALUE) ^ p(i24)] & UByte.MAX_VALUE) ^ p(i23)];
            i28++;
            i25 = 2;
        }
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof org.spongycastle.crypto.params.w)) {
            throw new IllegalArgumentException("invalid parameter passed to Twofish init - " + jVar.getClass().getName());
        }
        this.f62523a = z10;
        byte[] a10 = ((org.spongycastle.crypto.params.w) jVar).a();
        this.workingKey = a10;
        this.f62524b = a10.length / 8;
        s(a10);
    }

    public final int c(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final int d(int i10, int[] iArr) {
        int i11;
        int i12;
        int m10 = m(i10);
        int n10 = n(i10);
        int o10 = o(i10);
        int p10 = p(i10);
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        int i17 = this.f62524b & 3;
        if (i17 != 0) {
            if (i17 == 1) {
                int[] iArr2 = this.gMDS0;
                byte[][] bArr = f62522c;
                i11 = (iArr2[(bArr[0][m10] & UByte.MAX_VALUE) ^ m(i13)] ^ this.gMDS1[(bArr[0][n10] & UByte.MAX_VALUE) ^ n(i13)]) ^ this.gMDS2[(bArr[1][o10] & UByte.MAX_VALUE) ^ o(i13)];
                i12 = this.gMDS3[(bArr[1][p10] & UByte.MAX_VALUE) ^ p(i13)];
                return i12 ^ i11;
            }
            if (i17 != 2) {
                if (i17 != 3) {
                    return 0;
                }
            }
            int[] iArr3 = this.gMDS0;
            byte[][] bArr2 = f62522c;
            byte[] bArr3 = bArr2[0];
            i11 = (iArr3[(bArr3[(bArr3[m10] & UByte.MAX_VALUE) ^ m(i14)] & UByte.MAX_VALUE) ^ m(i13)] ^ this.gMDS1[(bArr2[0][(bArr2[1][n10] & UByte.MAX_VALUE) ^ n(i14)] & UByte.MAX_VALUE) ^ n(i13)]) ^ this.gMDS2[(bArr2[1][(bArr2[0][o10] & UByte.MAX_VALUE) ^ o(i14)] & UByte.MAX_VALUE) ^ o(i13)];
            int[] iArr4 = this.gMDS3;
            byte[] bArr4 = bArr2[1];
            i12 = iArr4[(bArr4[(bArr4[p10] & UByte.MAX_VALUE) ^ p(i14)] & UByte.MAX_VALUE) ^ p(i13)];
            return i12 ^ i11;
        }
        byte[][] bArr5 = f62522c;
        m10 = (bArr5[1][m10] & UByte.MAX_VALUE) ^ m(i16);
        n10 = (bArr5[0][n10] & UByte.MAX_VALUE) ^ n(i16);
        o10 = (bArr5[0][o10] & UByte.MAX_VALUE) ^ o(i16);
        p10 = (bArr5[1][p10] & UByte.MAX_VALUE) ^ p(i16);
        byte[][] bArr6 = f62522c;
        m10 = (bArr6[1][m10] & UByte.MAX_VALUE) ^ m(i15);
        n10 = (bArr6[1][n10] & UByte.MAX_VALUE) ^ n(i15);
        o10 = (bArr6[0][o10] & UByte.MAX_VALUE) ^ o(i15);
        p10 = (bArr6[0][p10] & UByte.MAX_VALUE) ^ p(i15);
        int[] iArr32 = this.gMDS0;
        byte[][] bArr22 = f62522c;
        byte[] bArr32 = bArr22[0];
        i11 = (iArr32[(bArr32[(bArr32[m10] & UByte.MAX_VALUE) ^ m(i14)] & UByte.MAX_VALUE) ^ m(i13)] ^ this.gMDS1[(bArr22[0][(bArr22[1][n10] & UByte.MAX_VALUE) ^ n(i14)] & UByte.MAX_VALUE) ^ n(i13)]) ^ this.gMDS2[(bArr22[1][(bArr22[0][o10] & UByte.MAX_VALUE) ^ o(i14)] & UByte.MAX_VALUE) ^ o(i13)];
        int[] iArr42 = this.gMDS3;
        byte[] bArr42 = bArr22[1];
        i12 = iArr42[(bArr42[(bArr42[p10] & UByte.MAX_VALUE) ^ p(i14)] & UByte.MAX_VALUE) ^ p(i13)];
        return i12 ^ i11;
    }

    public final int e(int i10) {
        int[] iArr = this.gSBox;
        return iArr[(((i10 >>> 24) & 255) * 2) + 513] ^ ((iArr[(i10 & 255) * 2] ^ iArr[(((i10 >>> 8) & 255) * 2) + 1]) ^ iArr[(((i10 >>> 16) & 255) * 2) + 512]);
    }

    public final int f(int i10) {
        int[] iArr = this.gSBox;
        return iArr[(((i10 >>> 16) & 255) * 2) + 513] ^ ((iArr[((i10 >>> 24) & 255) * 2] ^ iArr[((i10 & 255) * 2) + 1]) ^ iArr[(((i10 >>> 8) & 255) * 2) + 512]);
    }

    public final int g(int i10) {
        return ((i10 & 1) != 0 ? 180 : 0) ^ (i10 >> 1);
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    public final int h(int i10) {
        return ((i10 >> 2) ^ ((i10 & 2) != 0 ? 180 : 0)) ^ ((i10 & 1) != 0 ? 90 : 0);
    }

    public final int i(int i10) {
        return i10 ^ h(i10);
    }

    public final int j(int i10) {
        return h(i10) ^ (g(i10) ^ i10);
    }

    public final int k(int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            i11 = l(i11);
        }
        int i13 = i10 ^ i11;
        for (int i14 = 0; i14 < 4; i14++) {
            i13 = l(i13);
        }
        return i13;
    }

    public final int l(int i10) {
        int i11 = i10 >>> 24;
        int i12 = i11 & 255;
        int i13 = ((i12 << 1) ^ ((i11 & 128) != 0 ? 333 : 0)) & 255;
        int i14 = ((i12 >>> 1) ^ ((i11 & 1) != 0 ? EnumC3631g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE : 0)) ^ i13;
        return ((((i10 << 8) ^ (i14 << 24)) ^ (i13 << 16)) ^ (i14 << 8)) ^ i12;
    }

    public final int m(int i10) {
        return i10 & 255;
    }

    public final int n(int i10) {
        return (i10 >>> 8) & 255;
    }

    public final int o(int i10) {
        return (i10 >>> 16) & 255;
    }

    public final int p(int i10) {
        return (i10 >>> 24) & 255;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        if (this.f62523a) {
            r(bArr, i10, bArr2, i11);
            return 16;
        }
        q(bArr, i10, bArr2, i11);
        return 16;
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
        byte[] bArr = this.workingKey;
        if (bArr != null) {
            s(bArr);
        }
    }
}
