package org.spongycastle.crypto.digests;

import java.lang.reflect.Array;
import kotlin.UByte;
import org.spongycastle.crypto.engines.C5964n;
import org.spongycastle.crypto.params.B;

/* loaded from: classes5.dex */
public class a implements org.spongycastle.crypto.q, Aj.d {

    /* renamed from: C2, reason: collision with root package name */
    private static final byte[] f62295C2 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};

    /* renamed from: H, reason: collision with root package name */
    private byte[] f62296H;

    /* renamed from: K, reason: collision with root package name */
    private byte[] f62297K;

    /* renamed from: L, reason: collision with root package name */
    private byte[] f62298L;

    /* renamed from: M, reason: collision with root package name */
    private byte[] f62299M;

    /* renamed from: S, reason: collision with root package name */
    byte[] f62300S;
    private byte[] Sum;

    /* renamed from: U, reason: collision with root package name */
    byte[] f62301U;

    /* renamed from: V, reason: collision with root package name */
    byte[] f62302V;

    /* renamed from: W, reason: collision with root package name */
    byte[] f62303W;

    /* renamed from: a, reason: collision with root package name */
    byte[] f62304a;

    /* renamed from: b, reason: collision with root package name */
    public byte[][] f62305b;

    /* renamed from: c, reason: collision with root package name */
    public int f62306c;

    /* renamed from: d, reason: collision with root package name */
    public long f62307d;

    /* renamed from: e, reason: collision with root package name */
    public org.spongycastle.crypto.e f62308e;
    private byte[] sBox;
    short[] wS;
    short[] w_S;
    private byte[] xBuf;

    public a() {
        this.f62296H = new byte[32];
        this.f62298L = new byte[32];
        this.f62299M = new byte[32];
        this.Sum = new byte[32];
        this.f62305b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.f62308e = new C5964n();
        this.f62297K = new byte[32];
        this.f62304a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.f62300S = new byte[32];
        this.f62301U = new byte[32];
        this.f62302V = new byte[32];
        this.f62303W = new byte[32];
        byte[] g10 = C5964n.g("D-A");
        this.sBox = g10;
        this.f62308e.a(true, new B(null, g10));
        reset();
    }

    private void g() {
        Aj.f.n(this.f62307d * 8, this.f62298L, 0);
        while (this.f62306c != 0) {
            update((byte) 0);
        }
        i(this.f62298L, 0);
        i(this.Sum, 0);
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        a aVar = (a) dVar;
        byte[] bArr = aVar.sBox;
        this.sBox = bArr;
        this.f62308e.a(true, new B(null, bArr));
        reset();
        byte[] bArr2 = aVar.f62296H;
        System.arraycopy(bArr2, 0, this.f62296H, 0, bArr2.length);
        byte[] bArr3 = aVar.f62298L;
        System.arraycopy(bArr3, 0, this.f62298L, 0, bArr3.length);
        byte[] bArr4 = aVar.f62299M;
        System.arraycopy(bArr4, 0, this.f62299M, 0, bArr4.length);
        byte[] bArr5 = aVar.Sum;
        System.arraycopy(bArr5, 0, this.Sum, 0, bArr5.length);
        byte[] bArr6 = aVar.f62305b[1];
        System.arraycopy(bArr6, 0, this.f62305b[1], 0, bArr6.length);
        byte[] bArr7 = aVar.f62305b[2];
        System.arraycopy(bArr7, 0, this.f62305b[2], 0, bArr7.length);
        byte[] bArr8 = aVar.f62305b[3];
        System.arraycopy(bArr8, 0, this.f62305b[3], 0, bArr8.length);
        byte[] bArr9 = aVar.xBuf;
        System.arraycopy(bArr9, 0, this.xBuf, 0, bArr9.length);
        this.f62306c = aVar.f62306c;
        this.f62307d = aVar.f62307d;
    }

    public final byte[] b(byte[] bArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f62304a[i10] = (byte) (bArr[i10] ^ bArr[i10 + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f62304a, 0, bArr, 24, 8);
        return bArr;
    }

    public final void c(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        this.f62308e.a(true, new org.spongycastle.crypto.params.w(bArr));
        this.f62308e.processBlock(bArr3, i11, bArr2, i10);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new a(this);
    }

    public final byte[] d(byte[] bArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            byte[] bArr2 = this.f62297K;
            int i11 = i10 * 4;
            bArr2[i11] = bArr[i10];
            bArr2[i11 + 1] = bArr[i10 + 8];
            bArr2[i11 + 2] = bArr[i10 + 16];
            bArr2[i11 + 3] = bArr[i10 + 24];
        }
        return this.f62297K;
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        g();
        byte[] bArr2 = this.f62296H;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        reset();
        return 32;
    }

    public final void e(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            int i11 = i10 * 2;
            sArr[i10] = (short) ((bArr[i11] & UByte.MAX_VALUE) | ((bArr[i11 + 1] << 8) & 65280));
        }
    }

    public final void f(short[] sArr, byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            int i11 = i10 * 2;
            short s10 = sArr[i10];
            bArr[i11 + 1] = (byte) (s10 >> 8);
            bArr[i11] = (byte) s10;
        }
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.spongycastle.crypto.q
    public int getByteLength() {
        return 32;
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 32;
    }

    public final void h(byte[] bArr) {
        e(bArr, this.wS);
        short[] sArr = this.w_S;
        short[] sArr2 = this.wS;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        f(this.w_S, bArr);
    }

    public void i(byte[] bArr, int i10) {
        System.arraycopy(bArr, i10, this.f62299M, 0, 32);
        System.arraycopy(this.f62296H, 0, this.f62301U, 0, 32);
        System.arraycopy(this.f62299M, 0, this.f62302V, 0, 32);
        for (int i11 = 0; i11 < 32; i11++) {
            this.f62303W[i11] = (byte) (this.f62301U[i11] ^ this.f62302V[i11]);
        }
        c(d(this.f62303W), this.f62300S, 0, this.f62296H, 0);
        for (int i12 = 1; i12 < 4; i12++) {
            byte[] b10 = b(this.f62301U);
            for (int i13 = 0; i13 < 32; i13++) {
                this.f62301U[i13] = (byte) (b10[i13] ^ this.f62305b[i12][i13]);
            }
            this.f62302V = b(b(this.f62302V));
            for (int i14 = 0; i14 < 32; i14++) {
                this.f62303W[i14] = (byte) (this.f62301U[i14] ^ this.f62302V[i14]);
            }
            int i15 = i12 * 8;
            c(d(this.f62303W), this.f62300S, i15, this.f62296H, i15);
        }
        for (int i16 = 0; i16 < 12; i16++) {
            h(this.f62300S);
        }
        for (int i17 = 0; i17 < 32; i17++) {
            byte[] bArr2 = this.f62300S;
            bArr2[i17] = (byte) (bArr2[i17] ^ this.f62299M[i17]);
        }
        h(this.f62300S);
        for (int i18 = 0; i18 < 32; i18++) {
            byte[] bArr3 = this.f62300S;
            bArr3[i18] = (byte) (this.f62296H[i18] ^ bArr3[i18]);
        }
        for (int i19 = 0; i19 < 61; i19++) {
            h(this.f62300S);
        }
        byte[] bArr4 = this.f62300S;
        byte[] bArr5 = this.f62296H;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    public final void j(byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.Sum;
            if (i10 == bArr2.length) {
                return;
            }
            int i12 = (bArr2[i10] & UByte.MAX_VALUE) + (bArr[i10] & UByte.MAX_VALUE) + i11;
            bArr2[i10] = (byte) i12;
            i11 = i12 >>> 8;
            i10++;
        }
    }

    @Override // org.spongycastle.crypto.o
    public void reset() {
        this.f62307d = 0L;
        this.f62306c = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f62296H;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f62298L;
            if (i11 >= bArr2.length) {
                break;
            }
            bArr2[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.f62299M;
            if (i12 >= bArr3.length) {
                break;
            }
            bArr3[i12] = 0;
            i12++;
        }
        int i13 = 0;
        while (true) {
            byte[] bArr4 = this.f62305b[1];
            if (i13 >= bArr4.length) {
                break;
            }
            bArr4[i13] = 0;
            i13++;
        }
        int i14 = 0;
        while (true) {
            byte[] bArr5 = this.f62305b[3];
            if (i14 >= bArr5.length) {
                break;
            }
            bArr5[i14] = 0;
            i14++;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr6 = this.Sum;
            if (i15 >= bArr6.length) {
                break;
            }
            bArr6[i15] = 0;
            i15++;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr7 = this.xBuf;
            if (i16 >= bArr7.length) {
                byte[] bArr8 = f62295C2;
                System.arraycopy(bArr8, 0, this.f62305b[2], 0, bArr8.length);
                return;
            } else {
                bArr7[i16] = 0;
                i16++;
            }
        }
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte b10) {
        byte[] bArr = this.xBuf;
        int i10 = this.f62306c;
        int i11 = i10 + 1;
        this.f62306c = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            j(bArr);
            i(this.xBuf, 0);
            this.f62306c = 0;
        }
        this.f62307d++;
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f62306c != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (true) {
            byte[] bArr2 = this.xBuf;
            if (i11 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i10, bArr2, 0, bArr2.length);
            j(this.xBuf);
            i(this.xBuf, 0);
            byte[] bArr3 = this.xBuf;
            i10 += bArr3.length;
            i11 -= bArr3.length;
            this.f62307d += bArr3.length;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }

    public a(a aVar) {
        this.f62296H = new byte[32];
        this.f62298L = new byte[32];
        this.f62299M = new byte[32];
        this.Sum = new byte[32];
        this.f62305b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.f62308e = new C5964n();
        this.f62297K = new byte[32];
        this.f62304a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.f62300S = new byte[32];
        this.f62301U = new byte[32];
        this.f62302V = new byte[32];
        this.f62303W = new byte[32];
        a(aVar);
    }
}
