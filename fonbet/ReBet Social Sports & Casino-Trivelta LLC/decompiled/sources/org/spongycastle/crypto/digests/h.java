package org.spongycastle.crypto.digests;

import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class h implements org.spongycastle.crypto.q, Aj.d {

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f62338S = {41, 46, 67, -55, -94, -40, 124, 1, Base64.padSymbol, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, PSSSigner.TRAILER_IMPLICIT, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, Tnaf.POW_2_WIDTH, -119, 11, 34, 95, 33, ByteCompanionObject.MIN_VALUE, ByteCompanionObject.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};

    /* renamed from: C, reason: collision with root package name */
    private byte[] f62339C;

    /* renamed from: M, reason: collision with root package name */
    private byte[] f62340M;

    /* renamed from: X, reason: collision with root package name */
    private byte[] f62341X;

    /* renamed from: a, reason: collision with root package name */
    public int f62342a;

    /* renamed from: b, reason: collision with root package name */
    public int f62343b;

    /* renamed from: c, reason: collision with root package name */
    public int f62344c;

    public h() {
        this.f62341X = new byte[48];
        this.f62340M = new byte[16];
        this.f62339C = new byte[16];
        reset();
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        b((h) dVar);
    }

    public final void b(h hVar) {
        byte[] bArr = hVar.f62341X;
        System.arraycopy(bArr, 0, this.f62341X, 0, bArr.length);
        this.f62342a = hVar.f62342a;
        byte[] bArr2 = hVar.f62340M;
        System.arraycopy(bArr2, 0, this.f62340M, 0, bArr2.length);
        this.f62343b = hVar.f62343b;
        byte[] bArr3 = hVar.f62339C;
        System.arraycopy(bArr3, 0, this.f62339C, 0, bArr3.length);
        this.f62344c = hVar.f62344c;
    }

    public void c(byte[] bArr) {
        for (int i10 = 0; i10 < 16; i10++) {
            byte[] bArr2 = this.f62341X;
            bArr2[i10 + 16] = bArr[i10];
            bArr2[i10 + 32] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 18; i12++) {
            for (int i13 = 0; i13 < 48; i13++) {
                byte[] bArr3 = this.f62341X;
                byte b10 = (byte) (f62338S[i11] ^ bArr3[i13]);
                bArr3[i13] = b10;
                i11 = b10 & UByte.MAX_VALUE;
            }
            i11 = (i11 + i12) % 256;
        }
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new h(this);
    }

    public void d(byte[] bArr) {
        byte b10 = this.f62339C[15];
        for (int i10 = 0; i10 < 16; i10++) {
            byte[] bArr2 = this.f62339C;
            b10 = (byte) (f62338S[(b10 ^ bArr[i10]) & 255] ^ bArr2[i10]);
            bArr2[i10] = b10;
        }
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        int length = this.f62340M.length;
        int i11 = this.f62343b;
        byte b10 = (byte) (length - i11);
        while (true) {
            byte[] bArr2 = this.f62340M;
            if (i11 >= bArr2.length) {
                d(bArr2);
                c(this.f62340M);
                c(this.f62339C);
                System.arraycopy(this.f62341X, this.f62342a, bArr, i10, 16);
                reset();
                return 16;
            }
            bArr2[i11] = b10;
            i11++;
        }
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "MD2";
    }

    @Override // org.spongycastle.crypto.q
    public int getByteLength() {
        return 16;
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.o
    public void reset() {
        this.f62342a = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f62341X;
            if (i10 == bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        this.f62343b = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f62340M;
            if (i11 == bArr2.length) {
                break;
            }
            bArr2[i11] = 0;
            i11++;
        }
        this.f62344c = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.f62339C;
            if (i12 == bArr3.length) {
                return;
            }
            bArr3[i12] = 0;
            i12++;
        }
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte b10) {
        byte[] bArr = this.f62340M;
        int i10 = this.f62343b;
        int i11 = i10 + 1;
        this.f62343b = i11;
        bArr[i10] = b10;
        if (i11 == 16) {
            d(bArr);
            c(this.f62340M);
            this.f62343b = 0;
        }
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f62343b != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 > 16) {
            System.arraycopy(bArr, i10, this.f62340M, 0, 16);
            d(this.f62340M);
            c(this.f62340M);
            i11 -= 16;
            i10 += 16;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }

    public h(h hVar) {
        this.f62341X = new byte[48];
        this.f62340M = new byte[16];
        this.f62339C = new byte[16];
        b(hVar);
    }
}
