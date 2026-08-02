package Zi;

/* loaded from: classes5.dex */
public class l implements org.spongycastle.crypto.e {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.e f14946a;

    /* renamed from: b, reason: collision with root package name */
    public int f14947b;

    /* renamed from: c, reason: collision with root package name */
    public int f14948c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14949d;

    public l(org.spongycastle.crypto.e eVar) {
        this.f14946a = eVar;
        int blockSize = eVar.getBlockSize();
        this.f14948c = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
    }

    private int b(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13;
        int i14 = this.f14948c;
        if (i10 + i14 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + i14 > bArr2.length) {
            throw new org.spongycastle.crypto.l("output buffer too short");
        }
        int i15 = this.f14947b;
        int i16 = 2;
        int i17 = 0;
        if (i15 > i14) {
            byte b10 = bArr[i10];
            this.FR[i14 - 2] = b10;
            bArr2[i11] = d(b10, i14 - 2);
            byte b11 = bArr[i10 + 1];
            byte[] bArr3 = this.FR;
            int i18 = this.f14948c;
            bArr3[i18 - 1] = b11;
            bArr2[i11 + 1] = d(b11, i18 - 1);
            this.f14946a.processBlock(this.FR, 0, this.FRE, 0);
            while (i16 < this.f14948c) {
                byte b12 = bArr[i10 + i16];
                int i19 = i16 - 2;
                this.FR[i19] = b12;
                bArr2[i11 + i16] = d(b12, i19);
                i16++;
            }
        } else if (i15 == 0) {
            this.f14946a.processBlock(this.FR, 0, this.FRE, 0);
            while (true) {
                i13 = this.f14948c;
                if (i17 >= i13) {
                    break;
                }
                int i20 = i10 + i17;
                this.FR[i17] = bArr[i20];
                bArr2[i17] = d(bArr[i20], i17);
                i17++;
            }
            this.f14947b += i13;
        } else if (i15 == i14) {
            this.f14946a.processBlock(this.FR, 0, this.FRE, 0);
            byte b13 = bArr[i10];
            byte b14 = bArr[i10 + 1];
            bArr2[i11] = d(b13, 0);
            bArr2[i11 + 1] = d(b14, 1);
            byte[] bArr4 = this.FR;
            System.arraycopy(bArr4, 2, bArr4, 0, this.f14948c - 2);
            byte[] bArr5 = this.FR;
            int i21 = this.f14948c;
            bArr5[i21 - 2] = b13;
            bArr5[i21 - 1] = b14;
            this.f14946a.processBlock(bArr5, 0, this.FRE, 0);
            while (true) {
                i12 = this.f14948c;
                if (i16 >= i12) {
                    break;
                }
                byte b15 = bArr[i10 + i16];
                int i22 = i16 - 2;
                this.FR[i22] = b15;
                bArr2[i11 + i16] = d(b15, i22);
                i16++;
            }
            this.f14947b += i12;
        }
        return this.f14948c;
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13;
        int i14 = this.f14948c;
        if (i10 + i14 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + i14 > bArr2.length) {
            throw new org.spongycastle.crypto.l("output buffer too short");
        }
        int i15 = this.f14947b;
        int i16 = 2;
        int i17 = 0;
        if (i15 > i14) {
            byte[] bArr3 = this.FR;
            int i18 = i14 - 2;
            byte d10 = d(bArr[i10], i14 - 2);
            bArr2[i11] = d10;
            bArr3[i18] = d10;
            byte[] bArr4 = this.FR;
            int i19 = this.f14948c;
            int i20 = i19 - 1;
            byte d11 = d(bArr[i10 + 1], i19 - 1);
            bArr2[i11 + 1] = d11;
            bArr4[i20] = d11;
            this.f14946a.processBlock(this.FR, 0, this.FRE, 0);
            while (i16 < this.f14948c) {
                byte[] bArr5 = this.FR;
                int i21 = i16 - 2;
                byte d12 = d(bArr[i10 + i16], i21);
                bArr2[i11 + i16] = d12;
                bArr5[i21] = d12;
                i16++;
            }
        } else if (i15 == 0) {
            this.f14946a.processBlock(this.FR, 0, this.FRE, 0);
            while (true) {
                i13 = this.f14948c;
                if (i17 >= i13) {
                    break;
                }
                byte[] bArr6 = this.FR;
                byte d13 = d(bArr[i10 + i17], i17);
                bArr2[i11 + i17] = d13;
                bArr6[i17] = d13;
                i17++;
            }
            this.f14947b += i13;
        } else if (i15 == i14) {
            this.f14946a.processBlock(this.FR, 0, this.FRE, 0);
            bArr2[i11] = d(bArr[i10], 0);
            bArr2[i11 + 1] = d(bArr[i10 + 1], 1);
            byte[] bArr7 = this.FR;
            System.arraycopy(bArr7, 2, bArr7, 0, this.f14948c - 2);
            System.arraycopy(bArr2, i11, this.FR, this.f14948c - 2, 2);
            this.f14946a.processBlock(this.FR, 0, this.FRE, 0);
            while (true) {
                i12 = this.f14948c;
                if (i16 >= i12) {
                    break;
                }
                byte[] bArr8 = this.FR;
                int i22 = i16 - 2;
                byte d14 = d(bArr[i10 + i16], i22);
                bArr2[i11 + i16] = d14;
                bArr8[i22] = d14;
                i16++;
            }
            this.f14947b += i12;
        }
        return this.f14948c;
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f14949d = z10;
        reset();
        this.f14946a.a(true, jVar);
    }

    public final byte d(byte b10, int i10) {
        return (byte) (b10 ^ this.FRE[i10]);
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return this.f14946a.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return this.f14946a.getBlockSize();
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f14949d ? c(bArr, i10, bArr2, i11) : b(bArr, i10, bArr2, i11);
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
        this.f14947b = 0;
        byte[] bArr = this.IV;
        byte[] bArr2 = this.FR;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f14946a.reset();
    }
}
