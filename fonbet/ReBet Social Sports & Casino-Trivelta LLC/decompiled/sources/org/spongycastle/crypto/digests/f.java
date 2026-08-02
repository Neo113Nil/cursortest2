package org.spongycastle.crypto.digests;

import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes5.dex */
public class f implements org.spongycastle.crypto.q {

    /* renamed from: a, reason: collision with root package name */
    public int f62319a;

    /* renamed from: b, reason: collision with root package name */
    public int f62320b;

    /* renamed from: c, reason: collision with root package name */
    public int f62321c;
    protected byte[] chunk;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62322d;

    /* renamed from: e, reason: collision with root package name */
    public int f62323e;
    protected byte[] oneByte;
    private static long[] KeccakRoundConstants = o();
    private static int[] KeccakRhoOffsets = n();
    protected byte[] state = new byte[200];
    protected byte[] dataQueue = new byte[192];

    /* renamed from: C, reason: collision with root package name */
    long[] f62318C = new long[5];
    long[] tempA = new long[25];
    long[] chiC = new long[5];

    public f(int i10) {
        k(i10);
    }

    public static boolean d(byte[] bArr) {
        byte b10 = bArr[0];
        boolean z10 = (b10 & 1) != 0;
        if ((b10 & ByteCompanionObject.MIN_VALUE) != 0) {
            bArr[0] = (byte) ((b10 << 1) ^ 113);
            return z10;
        }
        bArr[0] = (byte) (b10 << 1);
        return z10;
    }

    public static int[] n() {
        int[] iArr = new int[25];
        int i10 = 0;
        iArr[0] = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < 24) {
            int i13 = i10 + 1;
            iArr[(i11 % 5) + ((i12 % 5) * 5)] = (((i10 + 2) * i13) / 2) % 64;
            int i14 = i12 % 5;
            i12 = ((i11 * 2) + (i12 * 3)) % 5;
            i11 = i14;
            i10 = i13;
        }
        return iArr;
    }

    public static long[] o() {
        long[] jArr = new long[24];
        byte[] bArr = {1};
        for (int i10 = 0; i10 < 24; i10++) {
            jArr[i10] = 0;
            for (int i11 = 0; i11 < 7; i11++) {
                int i12 = (1 << i11) - 1;
                if (d(bArr)) {
                    jArr[i10] = jArr[i10] ^ (1 << i12);
                }
            }
        }
        return jArr;
    }

    public final void a(byte[] bArr, byte[] bArr2, int i10) {
        q(bArr, bArr2, i10);
    }

    public final void b(byte[] bArr, byte[] bArr2, int i10) {
        System.arraycopy(bArr, 0, bArr2, 0, i10 * 8);
    }

    public final void c(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 128);
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        v(bArr, i10, this.f62321c);
        reset();
        return getDigestSize();
    }

    public void e(byte[] bArr, int i10, long j10) {
        if (this.f62320b % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.f62322d) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        long j11 = 0;
        while (j11 < j10) {
            int i11 = this.f62320b;
            long j12 = 8;
            if (i11 == 0) {
                int i12 = this.f62319a;
                if (j10 >= i12 && j11 <= j10 - i12) {
                    long j13 = (j10 - j11) / i12;
                    long j14 = 0;
                    while (j14 < j13) {
                        byte[] bArr2 = this.chunk;
                        System.arraycopy(bArr, (int) (i10 + (j11 / j12) + (bArr2.length * j14)), bArr2, 0, bArr2.length);
                        byte[] bArr3 = this.state;
                        byte[] bArr4 = this.chunk;
                        a(bArr3, bArr4, bArr4.length);
                        j14++;
                        j12 = j12;
                    }
                    j11 += j13 * this.f62319a;
                }
            }
            int i13 = (int) (j10 - j11);
            int i14 = i13 + i11;
            int i15 = this.f62319a;
            if (i14 > i15) {
                i13 = i15 - i11;
            }
            int i16 = i13 % 8;
            int i17 = i13 - i16;
            System.arraycopy(bArr, ((int) (j11 / 8)) + i10, this.dataQueue, i11 / 8, i17 / 8);
            int i18 = this.f62320b + i17;
            this.f62320b = i18;
            j11 += i17;
            if (i18 == this.f62319a) {
                f();
            }
            if (i16 > 0) {
                byte[] bArr5 = this.dataQueue;
                int i19 = this.f62320b;
                bArr5[i19 / 8] = (byte) (((1 << i16) - 1) & bArr[((int) (j11 / 8)) + i10]);
                this.f62320b = i19 + i16;
                j11 += i16;
            }
        }
    }

    public final void f() {
        a(this.state, this.dataQueue, this.f62319a / 8);
        this.f62320b = 0;
    }

    public final void g(long[] jArr) {
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = 0;
            while (i11 < 5) {
                int i12 = i10 * 5;
                int i13 = i11 + 1;
                this.chiC[i11] = jArr[i11 + i12] ^ ((~jArr[(i13 % 5) + i12]) & jArr[((i11 + 2) % 5) + i12]);
                i11 = i13;
            }
            for (int i14 = 0; i14 < 5; i14++) {
                jArr[(i10 * 5) + i14] = this.chiC[i14];
            }
        }
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "Keccak-" + this.f62321c;
    }

    @Override // org.spongycastle.crypto.q
    public int getByteLength() {
        return this.f62319a / 8;
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return this.f62321c / 8;
    }

    public final void h(int i10, int i11) {
        for (int i12 = i10; i12 != i10 + i11; i12++) {
            this.dataQueue[i12] = 0;
        }
    }

    public final void i(long[] jArr, byte[] bArr) {
        for (int i10 = 0; i10 < 25; i10++) {
            jArr[i10] = 0;
            int i11 = i10 * 8;
            for (int i12 = 0; i12 < 8; i12++) {
                jArr[i10] = jArr[i10] | ((bArr[i11 + i12] & 255) << (i12 * 8));
            }
        }
    }

    public final void j(byte[] bArr, long[] jArr) {
        for (int i10 = 0; i10 < 25; i10++) {
            int i11 = i10 * 8;
            for (int i12 = 0; i12 < 8; i12++) {
                bArr[i11 + i12] = (byte) ((jArr[i10] >>> (i12 * 8)) & 255);
            }
        }
    }

    public final void k(int i10) {
        if (i10 == 128) {
            l(1344, 256);
            return;
        }
        if (i10 == 224) {
            l(1152, 448);
            return;
        }
        if (i10 == 256) {
            l(1088, 512);
            return;
        }
        if (i10 == 288) {
            l(1024, 576);
        } else if (i10 == 384) {
            l(832, 768);
        } else {
            if (i10 != 512) {
                throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
            }
            l(576, 1024);
        }
    }

    public final void l(int i10, int i11) {
        if (i10 + i11 != 1600) {
            throw new IllegalStateException("rate + capacity != 1600");
        }
        if (i10 <= 0 || i10 >= 1600 || i10 % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.f62319a = i10;
        Aj.a.m(this.state, (byte) 0);
        Aj.a.m(this.dataQueue, (byte) 0);
        this.f62320b = 0;
        this.f62322d = false;
        this.f62323e = 0;
        this.f62321c = i11 / 2;
        this.chunk = new byte[i10 / 8];
        this.oneByte = new byte[1];
    }

    public final void m(long[] jArr, int i10) {
        jArr[0] = jArr[0] ^ KeccakRoundConstants[i10];
    }

    public final void p(byte[] bArr) {
        long[] jArr = new long[bArr.length / 8];
        i(jArr, bArr);
        r(jArr);
        j(bArr, jArr);
    }

    public final void q(byte[] bArr, byte[] bArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
        p(bArr);
    }

    public final void r(long[] jArr) {
        for (int i10 = 0; i10 < 24; i10++) {
            w(jArr);
            u(jArr);
            t(jArr);
            g(jArr);
            m(jArr, i10);
        }
    }

    @Override // org.spongycastle.crypto.o
    public void reset() {
        k(this.f62321c);
    }

    public final void s() {
        int i10 = this.f62320b;
        int i11 = i10 + 1;
        int i12 = this.f62319a;
        if (i11 == i12) {
            byte[] bArr = this.dataQueue;
            int i13 = i10 / 8;
            bArr[i13] = (byte) ((1 << (i10 % 8)) | bArr[i13]);
            f();
            h(0, this.f62319a / 8);
        } else {
            h((i10 + 7) / 8, (i12 / 8) - ((i10 + 7) / 8));
            byte[] bArr2 = this.dataQueue;
            int i14 = this.f62320b;
            int i15 = i14 / 8;
            bArr2[i15] = (byte) ((1 << (i14 % 8)) | bArr2[i15]);
        }
        byte[] bArr3 = this.dataQueue;
        int i16 = this.f62319a;
        int i17 = (i16 - 1) / 8;
        bArr3[i17] = (byte) ((1 << ((i16 - 1) % 8)) | bArr3[i17]);
        f();
        int i18 = this.f62319a;
        if (i18 == 1024) {
            c(this.state, this.dataQueue);
            this.f62323e = 1024;
        } else {
            b(this.state, this.dataQueue, i18 / 64);
            this.f62323e = this.f62319a;
        }
        this.f62322d = true;
    }

    public final void t(long[] jArr) {
        long[] jArr2 = this.tempA;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        for (int i10 = 0; i10 < 5; i10++) {
            for (int i11 = 0; i11 < 5; i11++) {
                jArr[((((i10 * 2) + (i11 * 3)) % 5) * 5) + i11] = this.tempA[(i11 * 5) + i10];
            }
        }
    }

    public final void u(long[] jArr) {
        long j10;
        for (int i10 = 0; i10 < 5; i10++) {
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = (i11 * 5) + i10;
                int i13 = KeccakRhoOffsets[i12];
                if (i13 != 0) {
                    long j11 = jArr[i12];
                    j10 = (j11 >>> (64 - i13)) ^ (j11 << i13);
                } else {
                    j10 = jArr[i12];
                }
                jArr[i12] = j10;
            }
        }
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte b10) {
        byte[] bArr = this.oneByte;
        bArr[0] = b10;
        e(bArr, 0, 8L);
    }

    public void v(byte[] bArr, int i10, long j10) {
        if (!this.f62322d) {
            s();
        }
        long j11 = 0;
        if (j10 % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j11 < j10) {
            if (this.f62323e == 0) {
                p(this.state);
                int i11 = this.f62319a;
                if (i11 == 1024) {
                    c(this.state, this.dataQueue);
                    this.f62323e = 1024;
                } else {
                    b(this.state, this.dataQueue, i11 / 64);
                    this.f62323e = this.f62319a;
                }
            }
            int i12 = this.f62323e;
            long j12 = j10 - j11;
            int i13 = ((long) i12) > j12 ? (int) j12 : i12;
            System.arraycopy(this.dataQueue, (this.f62319a - i12) / 8, bArr, ((int) (j11 / 8)) + i10, i13 / 8);
            this.f62323e -= i13;
            j11 += i13;
        }
    }

    public final void w(long[] jArr) {
        for (int i10 = 0; i10 < 5; i10++) {
            this.f62318C[i10] = 0;
            for (int i11 = 0; i11 < 5; i11++) {
                long[] jArr2 = this.f62318C;
                jArr2[i10] = jArr2[i10] ^ jArr[(i11 * 5) + i10];
            }
        }
        int i12 = 0;
        while (i12 < 5) {
            long[] jArr3 = this.f62318C;
            int i13 = i12 + 1;
            long j10 = jArr3[i13 % 5];
            long j11 = ((j10 >>> 63) ^ (j10 << 1)) ^ jArr3[(i12 + 4) % 5];
            for (int i14 = 0; i14 < 5; i14++) {
                int i15 = (i14 * 5) + i12;
                jArr[i15] = jArr[i15] ^ j11;
            }
            i12 = i13;
        }
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte[] bArr, int i10, int i11) {
        e(bArr, i10, i11 * 8);
    }
}
