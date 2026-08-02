package org.spongycastle.crypto.engines;

/* renamed from: org.spongycastle.crypto.engines.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5959i extends K {
    public C5959i() {
    }

    public static void l(int i10, int[] iArr, int[] iArr2) {
        int i11 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i10 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        char c10 = 3;
        int i15 = iArr[3];
        char c11 = 4;
        int i16 = iArr[4];
        char c12 = 5;
        int i17 = iArr[5];
        char c13 = 6;
        int i18 = iArr[6];
        int i19 = 7;
        int i20 = iArr[7];
        int i21 = 8;
        int i22 = iArr[8];
        int i23 = iArr[9];
        int i24 = iArr[10];
        int i25 = iArr[11];
        int i26 = 12;
        int i27 = iArr[12];
        int i28 = iArr[13];
        int i29 = iArr[14];
        int i30 = iArr[15];
        int i31 = i29;
        int i32 = i28;
        int i33 = i27;
        int i34 = i25;
        int i35 = i24;
        int i36 = i23;
        int i37 = i22;
        int i38 = i20;
        int i39 = i18;
        int i40 = i17;
        int i41 = i16;
        int i42 = i15;
        int i43 = i14;
        int i44 = i13;
        int i45 = i12;
        int i46 = i10;
        while (i46 > 0) {
            int i47 = i45 + i41;
            char c14 = c10;
            int i48 = K.i(i33 ^ i47, i11);
            int i49 = i37 + i48;
            int i50 = K.i(i41 ^ i49, i26);
            int i51 = i47 + i50;
            int i52 = K.i(i48 ^ i51, i21);
            int i53 = i49 + i52;
            int i54 = K.i(i50 ^ i53, i19);
            int i55 = i44 + i40;
            char c15 = c11;
            int i56 = K.i(i32 ^ i55, i11);
            int i57 = i36 + i56;
            char c16 = c12;
            int i58 = K.i(i40 ^ i57, i26);
            int i59 = i55 + i58;
            int i60 = K.i(i56 ^ i59, i21);
            int i61 = i57 + i60;
            int i62 = K.i(i58 ^ i61, i19);
            int i63 = i43 + i39;
            char c17 = c13;
            int i64 = K.i(i31 ^ i63, i11);
            int i65 = i35 + i64;
            int i66 = K.i(i39 ^ i65, i26);
            int i67 = i63 + i66;
            int i68 = K.i(i64 ^ i67, i21);
            int i69 = i65 + i68;
            int i70 = K.i(i66 ^ i69, i19);
            int i71 = i42 + i38;
            int i72 = K.i(i30 ^ i71, 16);
            int i73 = i34 + i72;
            int i74 = K.i(i38 ^ i73, i26);
            int i75 = i71 + i74;
            int i76 = K.i(i72 ^ i75, 8);
            int i77 = i73 + i76;
            int i78 = K.i(i74 ^ i77, 7);
            int i79 = i51 + i62;
            int i80 = K.i(i76 ^ i79, 16);
            int i81 = i69 + i80;
            int i82 = K.i(i62 ^ i81, 12);
            i45 = i79 + i82;
            i30 = K.i(i80 ^ i45, 8);
            i35 = i81 + i30;
            i40 = K.i(i82 ^ i35, 7);
            int i83 = i59 + i70;
            int i84 = K.i(i52 ^ i83, 16);
            int i85 = i77 + i84;
            int i86 = K.i(i70 ^ i85, 12);
            i44 = i83 + i86;
            i33 = K.i(i84 ^ i44, 8);
            i34 = i85 + i33;
            i39 = K.i(i86 ^ i34, 7);
            int i87 = i67 + i78;
            int i88 = K.i(i60 ^ i87, 16);
            int i89 = i53 + i88;
            int i90 = K.i(i78 ^ i89, 12);
            i43 = i87 + i90;
            i32 = K.i(i88 ^ i43, 8);
            i37 = i89 + i32;
            i38 = K.i(i90 ^ i37, 7);
            int i91 = i75 + i54;
            int i92 = K.i(i68 ^ i91, 16);
            int i93 = i61 + i92;
            int i94 = K.i(i54 ^ i93, 12);
            i42 = i91 + i94;
            i31 = K.i(i92 ^ i42, 8);
            i36 = i93 + i31;
            i41 = K.i(i94 ^ i36, 7);
            i46 -= 2;
            i11 = 16;
            c10 = c14;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            i19 = 7;
            i21 = 8;
            i26 = 12;
        }
        char c18 = c10;
        char c19 = c11;
        char c20 = c12;
        char c21 = c13;
        iArr2[0] = i45 + iArr[0];
        iArr2[1] = i44 + iArr[1];
        iArr2[2] = i43 + iArr[2];
        iArr2[c18] = i42 + iArr[c18];
        iArr2[c19] = i41 + iArr[c19];
        iArr2[c20] = i40 + iArr[c20];
        iArr2[c21] = i39 + iArr[c21];
        iArr2[7] = i38 + iArr[7];
        iArr2[8] = i37 + iArr[8];
        iArr2[9] = i36 + iArr[9];
        iArr2[10] = i35 + iArr[10];
        iArr2[11] = i34 + iArr[11];
        iArr2[12] = i33 + iArr[12];
        iArr2[13] = i32 + iArr[13];
        iArr2[14] = i31 + iArr[14];
        iArr2[15] = i30 + iArr[15];
    }

    @Override // org.spongycastle.crypto.engines.K
    public void b() {
        int[] iArr = this.engineState;
        int i10 = iArr[12] + 1;
        iArr[12] = i10;
        if (i10 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.spongycastle.crypto.engines.K
    public void c(byte[] bArr) {
        l(this.f62495a, this.engineState, this.f62501x);
        Aj.f.h(this.f62501x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.engines.K
    public void g() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.spongycastle.crypto.engines.K, org.spongycastle.crypto.B
    public String getAlgorithmName() {
        return "ChaCha" + this.f62495a;
    }

    @Override // org.spongycastle.crypto.engines.K
    public void k(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            f(bArr.length, this.engineState, 0);
            Aj.f.j(bArr, 0, this.engineState, 4, 4);
            Aj.f.j(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Aj.f.j(bArr2, 0, this.engineState, 14, 2);
    }

    public C5959i(int i10) {
        super(i10);
    }
}
