package org.bouncycastle.crypto.digests;

import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Memoable;

/* loaded from: classes5.dex */
public class MD2Digest implements ExtendedDigest, Memoable {
    private static final int DIGEST_LENGTH = 16;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f61467S = {41, 46, 67, -55, -94, -40, 124, 1, Base64.padSymbol, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, PSSSigner.TRAILER_IMPLICIT, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, Tnaf.POW_2_WIDTH, -119, 11, 34, 95, 33, ByteCompanionObject.MIN_VALUE, ByteCompanionObject.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};

    /* renamed from: C, reason: collision with root package name */
    private byte[] f61468C;
    private int COff;

    /* renamed from: M, reason: collision with root package name */
    private byte[] f61469M;

    /* renamed from: X, reason: collision with root package name */
    private byte[] f61470X;
    private int mOff;
    private int xOff;

    public MD2Digest() {
        this.f61470X = new byte[48];
        this.f61469M = new byte[16];
        this.f61468C = new byte[16];
        reset();
    }

    private void copyIn(MD2Digest mD2Digest) {
        byte[] bArr = mD2Digest.f61470X;
        System.arraycopy(bArr, 0, this.f61470X, 0, bArr.length);
        this.xOff = mD2Digest.xOff;
        byte[] bArr2 = mD2Digest.f61469M;
        System.arraycopy(bArr2, 0, this.f61469M, 0, bArr2.length);
        this.mOff = mD2Digest.mOff;
        byte[] bArr3 = mD2Digest.f61468C;
        System.arraycopy(bArr3, 0, this.f61468C, 0, bArr3.length);
        this.COff = mD2Digest.COff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD2Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        int length = this.f61469M.length;
        int i11 = this.mOff;
        byte b10 = (byte) (length - i11);
        while (true) {
            byte[] bArr2 = this.f61469M;
            if (i11 >= bArr2.length) {
                processCheckSum(bArr2);
                processBlock(this.f61469M);
                processBlock(this.f61468C);
                System.arraycopy(this.f61470X, this.xOff, bArr, i10, 16);
                reset();
                return 16;
            }
            bArr2[i11] = b10;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD2";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    public void processBlock(byte[] bArr) {
        for (int i10 = 0; i10 < 16; i10++) {
            byte[] bArr2 = this.f61470X;
            bArr2[i10 + 16] = bArr[i10];
            bArr2[i10 + 32] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 18; i12++) {
            for (int i13 = 0; i13 < 48; i13++) {
                byte[] bArr3 = this.f61470X;
                byte b10 = (byte) (f61467S[i11] ^ bArr3[i13]);
                bArr3[i13] = b10;
                i11 = b10 & UByte.MAX_VALUE;
            }
            i11 = (i11 + i12) % 256;
        }
    }

    public void processCheckSum(byte[] bArr) {
        byte b10 = this.f61468C[15];
        for (int i10 = 0; i10 < 16; i10++) {
            byte[] bArr2 = this.f61468C;
            b10 = (byte) (f61467S[(b10 ^ bArr[i10]) & 255] ^ bArr2[i10]);
            bArr2[i10] = b10;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.xOff = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f61470X;
            if (i10 == bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        this.mOff = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f61469M;
            if (i11 == bArr2.length) {
                break;
            }
            bArr2[i11] = 0;
            i11++;
        }
        this.COff = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.f61468C;
            if (i12 == bArr3.length) {
                return;
            }
            bArr3[i12] = 0;
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        byte[] bArr = this.f61469M;
        int i10 = this.mOff;
        int i11 = i10 + 1;
        this.mOff = i11;
        bArr[i10] = b10;
        if (i11 == 16) {
            processCheckSum(bArr);
            processBlock(this.f61469M);
            this.mOff = 0;
        }
    }

    public MD2Digest(MD2Digest mD2Digest) {
        this.f61470X = new byte[48];
        this.f61469M = new byte[16];
        this.f61468C = new byte[16];
        copyIn(mD2Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD2Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (this.mOff != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 > 16) {
            System.arraycopy(bArr, i10, this.f61469M, 0, 16);
            processCheckSum(this.f61469M);
            processBlock(this.f61469M);
            i11 -= 16;
            i10 += 16;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
