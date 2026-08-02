package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import TY.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class zbwm {
    private static final zbwm zba = new zbwm(0, new int[0], new Object[0], false);
    private int zbb;
    private int[] zbc;
    private Object[] zbd;
    private int zbe;
    private boolean zbf;

    private zbwm(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zbe = -1;
        this.zbb = i11;
        this.zbc = iArr;
        this.zbd = objArr;
        this.zbf = z11;
    }

    public static zbwm zbc() {
        return zba;
    }

    static zbwm zbe(zbwm zbwmVar, zbwm zbwmVar2) {
        int i11 = zbwmVar.zbb + zbwmVar2.zbb;
        int[] copyOf = Arrays.copyOf(zbwmVar.zbc, i11);
        System.arraycopy(zbwmVar2.zbc, 0, copyOf, zbwmVar.zbb, zbwmVar2.zbb);
        Object[] copyOf2 = Arrays.copyOf(zbwmVar.zbd, i11);
        System.arraycopy(zbwmVar2.zbd, 0, copyOf2, zbwmVar.zbb, zbwmVar2.zbb);
        return new zbwm(i11, copyOf, copyOf2, true);
    }

    static zbwm zbf() {
        return new zbwm(0, new int[8], new Object[8], true);
    }

    private final void zbm(int i11) {
        int[] iArr = this.zbc;
        if (i11 > iArr.length) {
            int i12 = this.zbb;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.zbc = Arrays.copyOf(iArr, i11);
            this.zbd = Arrays.copyOf(this.zbd, i11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zbwm)) {
            return false;
        }
        zbwm zbwmVar = (zbwm) obj;
        int i11 = this.zbb;
        if (i11 == zbwmVar.zbb) {
            int[] iArr = this.zbc;
            int[] iArr2 = zbwmVar.zbc;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    Object[] objArr = this.zbd;
                    Object[] objArr2 = zbwmVar.zbd;
                    int i13 = this.zbb;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (objArr[i14].equals(objArr2[i14])) {
                        }
                    }
                    return true;
                }
                if (iArr[i12] != iArr2[i12]) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.zbb;
        int i12 = i11 + 527;
        int[] iArr = this.zbc;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = ((i12 * 31) + i14) * 31;
        Object[] objArr = this.zbd;
        int i17 = this.zbb;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    public final int zba() {
        int zbD;
        int zbE;
        int zbD2;
        int i11 = this.zbe;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.zbb; i13++) {
            int i14 = this.zbc[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.zbd[i13]).getClass();
                    zbD2 = zbtk.zbD(i15 << 3) + 8;
                } else if (i16 == 2) {
                    int i17 = i15 << 3;
                    zbtc zbtcVar = (zbtc) this.zbd[i13];
                    int zbD3 = zbtk.zbD(i17);
                    int zbd = zbtcVar.zbd();
                    i12 = zbtk.zbD(zbd) + zbd + zbD3 + i12;
                } else if (i16 == 3) {
                    int zbD4 = zbtk.zbD(i15 << 3);
                    zbD = zbD4 + zbD4;
                    zbE = ((zbwm) this.zbd[i13]).zba();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(new zbup("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zbd[i13]).getClass();
                    zbD2 = zbtk.zbD(i15 << 3) + 4;
                }
                i12 = zbD2 + i12;
            } else {
                int i18 = i15 << 3;
                long longValue = ((Long) this.zbd[i13]).longValue();
                zbD = zbtk.zbD(i18);
                zbE = zbtk.zbE(longValue);
            }
            i12 = zbE + zbD + i12;
        }
        this.zbe = i12;
        return i12;
    }

    public final int zbb() {
        int i11 = this.zbe;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.zbb; i13++) {
            int i14 = this.zbc[i13] >>> 3;
            zbtc zbtcVar = (zbtc) this.zbd[i13];
            int zbD = zbtk.zbD(8);
            int zbD2 = zbtk.zbD(i14) + zbtk.zbD(16);
            int zbD3 = zbtk.zbD(24);
            int zbd = zbtcVar.zbd();
            i12 += zbD + zbD + zbD2 + a.a(zbd, zbd, zbD3);
        }
        this.zbe = i12;
        return i12;
    }

    final zbwm zbd(zbwm zbwmVar) {
        if (zbwmVar.equals(zba)) {
            return this;
        }
        zbg();
        int i11 = this.zbb + zbwmVar.zbb;
        zbm(i11);
        System.arraycopy(zbwmVar.zbc, 0, this.zbc, this.zbb, zbwmVar.zbb);
        System.arraycopy(zbwmVar.zbd, 0, this.zbd, this.zbb, zbwmVar.zbb);
        this.zbb = i11;
        return this;
    }

    final void zbg() {
        if (!this.zbf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zbh() {
        if (this.zbf) {
            this.zbf = false;
        }
    }

    final void zbi(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.zbb; i12++) {
            zbvo.zbb(sb2, i11, String.valueOf(this.zbc[i12] >>> 3), this.zbd[i12]);
        }
    }

    final void zbj(int i11, Object obj) {
        zbg();
        zbm(this.zbb + 1);
        int[] iArr = this.zbc;
        int i12 = this.zbb;
        iArr[i12] = i11;
        this.zbd[i12] = obj;
        this.zbb = i12 + 1;
    }

    final void zbk(zbwy zbwyVar) throws IOException {
        for (int i11 = 0; i11 < this.zbb; i11++) {
            zbwyVar.zbx(this.zbc[i11] >>> 3, this.zbd[i11]);
        }
    }

    public final void zbl(zbwy zbwyVar) throws IOException {
        if (this.zbb != 0) {
            for (int i11 = 0; i11 < this.zbb; i11++) {
                int i12 = this.zbc[i11];
                Object obj = this.zbd[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 == 0) {
                    zbwyVar.zbt(i14, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zbwyVar.zbm(i14, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zbwyVar.zbd(i14, (zbtc) obj);
                } else if (i13 == 3) {
                    zbwyVar.zbG(i14);
                    ((zbwm) obj).zbl(zbwyVar);
                    zbwyVar.zbh(i14);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(new zbup("Protocol message tag had invalid wire type."));
                    }
                    zbwyVar.zbk(i14, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zbwm() {
        this(0, new int[8], new Object[8], true);
    }
}
