package org.spongycastle.crypto.engines;

/* loaded from: classes5.dex */
public class K implements org.spongycastle.crypto.B {
    private static final int[] TAU_SIGMA = Aj.f.k(Aj.h.e("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] sigma = Aj.h.e("expand 32-byte k");
    protected static final byte[] tau = Aj.h.e("expand 16-byte k");

    /* renamed from: a, reason: collision with root package name */
    public int f62495a;

    /* renamed from: b, reason: collision with root package name */
    public int f62496b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62497c;

    /* renamed from: d, reason: collision with root package name */
    public int f62498d;

    /* renamed from: e, reason: collision with root package name */
    public int f62499e;
    protected int[] engineState;

    /* renamed from: f, reason: collision with root package name */
    public int f62500f;
    private byte[] keyStream;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f62501x;

    public K() {
        this(20);
    }

    public static int i(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    public static void j(int i10, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i10 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        char c10 = 3;
        int i14 = iArr[3];
        char c11 = 4;
        int i15 = iArr[4];
        char c12 = 5;
        int i16 = iArr[5];
        char c13 = 6;
        int i17 = iArr[6];
        int i18 = 7;
        int i19 = iArr[7];
        int i20 = iArr[8];
        int i21 = 9;
        int i22 = iArr[9];
        int i23 = iArr[10];
        int i24 = iArr[11];
        int i25 = iArr[12];
        int i26 = 13;
        int i27 = iArr[13];
        int i28 = iArr[14];
        int i29 = iArr[15];
        int i30 = i28;
        int i31 = i27;
        int i32 = i25;
        int i33 = i24;
        int i34 = i23;
        int i35 = i22;
        int i36 = i20;
        int i37 = i19;
        int i38 = i17;
        int i39 = i16;
        int i40 = i15;
        int i41 = i14;
        int i42 = i13;
        int i43 = i12;
        int i44 = i11;
        int i45 = i10;
        while (i45 > 0) {
            char c14 = c10;
            int i46 = i(i44 + i32, i18) ^ i40;
            int i47 = i36 ^ i(i46 + i44, i21);
            char c15 = c11;
            int i48 = i32 ^ i(i47 + i46, i26);
            char c16 = c12;
            char c17 = c13;
            int i49 = i44 ^ i(i48 + i47, 18);
            int i50 = i35 ^ i(i39 + i43, i18);
            int i51 = i31 ^ i(i50 + i39, i21);
            int i52 = i(i51 + i50, i26) ^ i43;
            int i53 = i(i52 + i51, 18) ^ i39;
            int i54 = i30 ^ i(i34 + i38, 7);
            int i55 = i42 ^ i(i54 + i34, 9);
            int i56 = i38 ^ i(i55 + i54, 13);
            int i57 = i34 ^ i(i56 + i55, 18);
            int i58 = i41 ^ i(i29 + i33, 7);
            int i59 = i37 ^ i(i58 + i29, 9);
            int i60 = i33 ^ i(i59 + i58, 13);
            int i61 = i29 ^ i(i60 + i59, 18);
            int i62 = i52 ^ i(i49 + i58, 7);
            int i63 = i(i62 + i49, 9) ^ i55;
            int i64 = i58 ^ i(i63 + i62, 13);
            i44 = i49 ^ i(i64 + i63, 18);
            int i65 = i(i53 + i46, 7) ^ i56;
            int i66 = i(i65 + i53, 9) ^ i59;
            int i67 = i46 ^ i(i66 + i65, 13);
            i39 = i53 ^ i(i67 + i66, 18);
            i33 = i60 ^ i(i57 + i50, 7);
            int i68 = i(i33 + i57, 9) ^ i47;
            int i69 = i(i68 + i33, 13) ^ i50;
            i34 = i57 ^ i(i69 + i68, 18);
            i32 = i48 ^ i(i61 + i54, 7);
            i31 = i51 ^ i(i32 + i61, 9);
            i30 = i54 ^ i(i31 + i32, 13);
            i29 = i61 ^ i(i30 + i31, 18);
            i45 -= 2;
            i36 = i68;
            i43 = i62;
            i38 = i65;
            i40 = i67;
            i37 = i66;
            i35 = i69;
            c10 = c14;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            i18 = 7;
            i42 = i63;
            i41 = i64;
            i21 = 9;
            i26 = 13;
        }
        char c18 = c10;
        char c19 = c11;
        char c20 = c12;
        char c21 = c13;
        iArr2[0] = i44 + iArr[0];
        iArr2[1] = i43 + iArr[1];
        iArr2[2] = i42 + iArr[2];
        iArr2[c18] = i41 + iArr[c18];
        iArr2[c19] = i40 + iArr[c19];
        iArr2[c20] = i39 + iArr[c20];
        iArr2[c21] = i38 + iArr[c21];
        iArr2[7] = i37 + iArr[7];
        iArr2[8] = i36 + iArr[8];
        iArr2[9] = i35 + iArr[9];
        iArr2[10] = i34 + iArr[10];
        iArr2[11] = i33 + iArr[11];
        iArr2[12] = i32 + iArr[12];
        iArr2[13] = i31 + iArr[13];
        iArr2[14] = i30 + iArr[14];
        iArr2[15] = i29 + iArr[15];
    }

    @Override // org.spongycastle.crypto.B
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof org.spongycastle.crypto.params.z)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
        byte[] a10 = zVar.a();
        if (a10 == null || a10.length != d()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + d() + " bytes of IV");
        }
        org.spongycastle.crypto.j b10 = zVar.b();
        if (b10 == null) {
            if (!this.f62497c) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            k(null, a10);
        } else {
            if (!(b10 instanceof org.spongycastle.crypto.params.w)) {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            k(((org.spongycastle.crypto.params.w) b10).a(), a10);
        }
        reset();
        this.f62497c = true;
    }

    public void b() {
        int[] iArr = this.engineState;
        int i10 = iArr[8] + 1;
        iArr[8] = i10;
        if (i10 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public void c(byte[] bArr) {
        j(this.f62495a, this.engineState, this.f62501x);
        Aj.f.h(this.f62501x, bArr, 0);
    }

    public int d() {
        return 8;
    }

    public final boolean e(int i10) {
        int i11 = this.f62498d + i10;
        this.f62498d = i11;
        if (i11 < i10 && i11 >= 0) {
            int i12 = this.f62499e + 1;
            this.f62499e = i12;
            if (i12 == 0) {
                int i13 = this.f62500f + 1;
                this.f62500f = i13;
                if ((i13 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(int i10, int[] iArr, int i11) {
        int i12 = (i10 - 16) / 4;
        int[] iArr2 = TAU_SIGMA;
        iArr[i11] = iArr2[i12];
        iArr[i11 + 1] = iArr2[i12 + 1];
        iArr[i11 + 2] = iArr2[i12 + 2];
        iArr[i11 + 3] = iArr2[i12 + 3];
    }

    public void g() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    @Override // org.spongycastle.crypto.B
    public String getAlgorithmName() {
        if (this.f62495a == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.f62495a;
    }

    public final void h() {
        this.f62498d = 0;
        this.f62499e = 0;
        this.f62500f = 0;
    }

    public void k(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = TAU_SIGMA;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            Aj.f.j(bArr, 0, iArr, 1, 4);
            Aj.f.j(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        Aj.f.j(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.spongycastle.crypto.B
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f62497c) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        if (e(i11)) {
            throw new org.spongycastle.crypto.w("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            byte[] bArr3 = this.keyStream;
            int i14 = this.f62496b;
            bArr2[i13 + i12] = (byte) (bArr3[i14] ^ bArr[i13 + i10]);
            int i15 = (i14 + 1) & 63;
            this.f62496b = i15;
            if (i15 == 0) {
                b();
                c(this.keyStream);
            }
        }
        return i11;
    }

    @Override // org.spongycastle.crypto.B
    public void reset() {
        this.f62496b = 0;
        h();
        g();
        c(this.keyStream);
    }

    public K(int i10) {
        this.f62496b = 0;
        this.engineState = new int[16];
        this.f62501x = new int[16];
        this.keyStream = new byte[64];
        this.f62497c = false;
        if (i10 <= 0 || (i10 & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.f62495a = i10;
    }
}
