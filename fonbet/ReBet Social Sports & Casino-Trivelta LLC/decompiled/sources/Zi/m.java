package Zi;

import org.spongycastle.crypto.params.z;

/* loaded from: classes5.dex */
public class m implements org.spongycastle.crypto.e {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.e f14950a;

    /* renamed from: b, reason: collision with root package name */
    public int f14951b;

    /* renamed from: c, reason: collision with root package name */
    public int f14952c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14953d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14954e;
    private byte[] tmp;

    public m(org.spongycastle.crypto.e eVar, boolean z10) {
        this.f14950a = eVar;
        this.f14954e = z10;
        int blockSize = eVar.getBlockSize();
        this.f14952c = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
        this.tmp = new byte[blockSize];
    }

    private int b(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f14952c;
        if (i10 + i12 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new org.spongycastle.crypto.l("output buffer too short");
        }
        int i13 = 0;
        this.f14950a.processBlock(this.FR, 0, this.FRE, 0);
        for (int i14 = 0; i14 < this.f14952c; i14++) {
            bArr2[i11 + i14] = f(bArr[i10 + i14], i14);
        }
        while (true) {
            int i15 = this.f14952c;
            if (i13 >= i15) {
                return i15;
            }
            this.FR[i13] = bArr[i10 + i13];
            i13++;
        }
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f14952c;
        if (i10 + i12 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new org.spongycastle.crypto.l("output buffer too short");
        }
        int i13 = 0;
        this.f14950a.processBlock(this.FR, 0, this.FRE, 0);
        for (int i14 = 0; i14 < this.f14952c; i14++) {
            bArr2[i11 + i14] = f(bArr[i10 + i14], i14);
        }
        while (true) {
            int i15 = this.f14952c;
            if (i13 >= i15) {
                return i15;
            }
            this.FR[i13] = bArr2[i11 + i13];
            i13++;
        }
    }

    private byte f(byte b10, int i10) {
        return (byte) (b10 ^ this.FRE[i10]);
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f14953d = z10;
        if (!(jVar instanceof z)) {
            reset();
            this.f14950a.a(true, jVar);
            return;
        }
        z zVar = (z) jVar;
        byte[] a10 = zVar.a();
        int length = a10.length;
        byte[] bArr = this.IV;
        if (length < bArr.length) {
            System.arraycopy(a10, 0, bArr, bArr.length - a10.length, a10.length);
            int i10 = 0;
            while (true) {
                byte[] bArr2 = this.IV;
                if (i10 >= bArr2.length - a10.length) {
                    break;
                }
                bArr2[i10] = 0;
                i10++;
            }
        } else {
            System.arraycopy(a10, 0, bArr, 0, bArr.length);
        }
        reset();
        this.f14950a.a(true, zVar.b());
    }

    public final int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13 = this.f14952c;
        if (i10 + i13 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + i13 > bArr2.length) {
            throw new org.spongycastle.crypto.l("output buffer too short");
        }
        int i14 = this.f14951b;
        if (i14 == 0) {
            for (int i15 = 0; i15 < this.f14952c; i15++) {
                this.FR[i15] = bArr[i10 + i15];
            }
            this.f14950a.processBlock(this.FR, 0, this.FRE, 0);
            this.f14951b += this.f14952c;
            return 0;
        }
        if (i14 != i13) {
            if (i14 >= i13 + 2) {
                System.arraycopy(bArr, i10, this.tmp, 0, i13);
                bArr2[i11] = f(this.tmp[0], this.f14952c - 2);
                bArr2[i11 + 1] = f(this.tmp[1], this.f14952c - 1);
                System.arraycopy(this.tmp, 0, this.FR, this.f14952c - 2, 2);
                this.f14950a.processBlock(this.FR, 0, this.FRE, 0);
                int i16 = 0;
                while (true) {
                    i12 = this.f14952c;
                    if (i16 >= i12 - 2) {
                        break;
                    }
                    bArr2[i11 + i16 + 2] = f(this.tmp[i16 + 2], i16);
                    i16++;
                }
                System.arraycopy(this.tmp, 2, this.FR, 0, i12 - 2);
            }
            return this.f14952c;
        }
        System.arraycopy(bArr, i10, this.tmp, 0, i13);
        byte[] bArr3 = this.FR;
        System.arraycopy(bArr3, 2, bArr3, 0, this.f14952c - 2);
        byte[] bArr4 = this.FR;
        int i17 = this.f14952c;
        byte[] bArr5 = this.tmp;
        bArr4[i17 - 2] = bArr5[0];
        bArr4[i17 - 1] = bArr5[1];
        this.f14950a.processBlock(bArr4, 0, this.FRE, 0);
        int i18 = 0;
        while (true) {
            int i19 = this.f14952c;
            if (i18 >= i19 - 2) {
                System.arraycopy(this.tmp, 2, this.FR, 0, i19 - 2);
                this.f14951b += 2;
                return this.f14952c - 2;
            }
            bArr2[i11 + i18] = f(this.tmp[i18 + 2], i18);
            i18++;
        }
    }

    public final int e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13;
        int i14 = this.f14952c;
        if (i10 + i14 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        int i15 = this.f14951b;
        if (i15 != 0) {
            if (i15 >= i14 + 2) {
                if (i14 + i11 > bArr2.length) {
                    throw new org.spongycastle.crypto.l("output buffer too short");
                }
                this.f14950a.processBlock(this.FR, 0, this.FRE, 0);
                int i16 = 0;
                while (true) {
                    i12 = this.f14952c;
                    if (i16 >= i12) {
                        break;
                    }
                    bArr2[i11 + i16] = f(bArr[i10 + i16], i16);
                    i16++;
                }
                System.arraycopy(bArr2, i11, this.FR, 0, i12);
            }
            return this.f14952c;
        }
        if ((i14 * 2) + i11 + 2 > bArr2.length) {
            throw new org.spongycastle.crypto.l("output buffer too short");
        }
        this.f14950a.processBlock(this.FR, 0, this.FRE, 0);
        int i17 = 0;
        while (true) {
            i13 = this.f14952c;
            if (i17 >= i13) {
                break;
            }
            bArr2[i11 + i17] = f(this.IV[i17], i17);
            i17++;
        }
        System.arraycopy(bArr2, i11, this.FR, 0, i13);
        this.f14950a.processBlock(this.FR, 0, this.FRE, 0);
        int i18 = this.f14952c;
        bArr2[i11 + i18] = f(this.IV[i18 - 2], 0);
        int i19 = this.f14952c;
        bArr2[i11 + i19 + 1] = f(this.IV[i19 - 1], 1);
        System.arraycopy(bArr2, i11 + 2, this.FR, 0, this.f14952c);
        this.f14950a.processBlock(this.FR, 0, this.FRE, 0);
        int i20 = 0;
        while (true) {
            int i21 = this.f14952c;
            if (i20 >= i21) {
                System.arraycopy(bArr2, i11 + i21 + 2, this.FR, 0, i21);
                int i22 = this.f14951b;
                int i23 = this.f14952c;
                this.f14951b = i22 + (i23 * 2) + 2;
                return (i23 * 2) + 2;
            }
            bArr2[i21 + i11 + 2 + i20] = f(bArr[i10 + i20], i20);
            i20++;
        }
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        if (this.f14954e) {
            return this.f14950a.getAlgorithmName() + "/PGPCFBwithIV";
        }
        return this.f14950a.getAlgorithmName() + "/PGPCFB";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return this.f14950a.getBlockSize();
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f14954e ? this.f14953d ? e(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11) : this.f14953d ? d(bArr, i10, bArr2, i11) : b(bArr, i10, bArr2, i11);
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
        this.f14951b = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.FR;
            if (i10 == bArr.length) {
                this.f14950a.reset();
                return;
            }
            if (this.f14954e) {
                bArr[i10] = 0;
            } else {
                bArr[i10] = this.IV[i10];
            }
            i10++;
        }
    }
}
