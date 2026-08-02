package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* loaded from: classes9.dex */
final class zbth extends zbtk {
    private final byte[] zbb;
    private final int zbc;
    private int zbd;

    zbth(byte[] bArr, int i11, int i12) {
        super(null);
        int length = bArr.length;
        if (((length - i12) | i12) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i12)));
        }
        this.zbb = bArr;
        this.zbd = 0;
        this.zbc = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final int zba() {
        return this.zbc - this.zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbb(byte b11) throws IOException {
        try {
            byte[] bArr = this.zbb;
            int i11 = this.zbd;
            this.zbd = i11 + 1;
            bArr[i11] = b11;
        } catch (IndexOutOfBoundsException e11) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e11);
        }
    }

    public final void zbc(byte[] bArr, int i11, int i12) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zbb, this.zbd, i12);
            this.zbd += i12;
        } catch (IndexOutOfBoundsException e11) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), Integer.valueOf(i12)), e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbd(int i11, boolean z11) throws IOException {
        zbw(i11 << 3);
        zbb(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbe(byte[] bArr, int i11, int i12) throws IOException {
        zbw(i12);
        zbc(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbf(int i11, zbtc zbtcVar) throws IOException {
        zbw((i11 << 3) | 2);
        zbg(zbtcVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbg(zbtc zbtcVar) throws IOException {
        zbw(zbtcVar.zbd());
        zbtcVar.zbg(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbh(int i11, int i12) throws IOException {
        zbw((i11 << 3) | 5);
        zbi(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbi(int i11) throws IOException {
        try {
            byte[] bArr = this.zbb;
            int i12 = this.zbd;
            int i13 = i12 + 1;
            this.zbd = i13;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i12 + 2;
            this.zbd = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i12 + 3;
            this.zbd = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.zbd = i12 + 4;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbj(int i11, long j11) throws IOException {
        zbw((i11 << 3) | 1);
        zbk(j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbk(long j11) throws IOException {
        try {
            byte[] bArr = this.zbb;
            int i11 = this.zbd;
            int i12 = i11 + 1;
            this.zbd = i12;
            bArr[i11] = (byte) (((int) j11) & 255);
            int i13 = i11 + 2;
            this.zbd = i13;
            bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
            int i14 = i11 + 3;
            this.zbd = i14;
            bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
            int i15 = i11 + 4;
            this.zbd = i15;
            bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
            int i16 = i11 + 5;
            this.zbd = i16;
            bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
            int i17 = i11 + 6;
            this.zbd = i17;
            bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
            int i18 = i11 + 7;
            this.zbd = i18;
            bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
            this.zbd = i11 + 8;
            bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e11) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbl(int i11, int i12) throws IOException {
        zbw(i11 << 3);
        zbm(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbm(int i11) throws IOException {
        if (i11 >= 0) {
            zbw(i11);
        } else {
            zby(i11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbn(byte[] bArr, int i11, int i12) throws IOException {
        zbc(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    final void zbo(int i11, zbvm zbvmVar, zbvx zbvxVar) throws IOException {
        zbw((i11 << 3) | 2);
        zbw(((zbsj) zbvmVar).zbj(zbvxVar));
        zbvxVar.zbi(zbvmVar, this.zba);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbp(zbvm zbvmVar) throws IOException {
        zbw(zbvmVar.zbo());
        zbvmVar.zbL(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbq(int i11, zbvm zbvmVar) throws IOException {
        zbw(11);
        zbv(2, i11);
        zbw(26);
        zbp(zbvmVar);
        zbw(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbr(int i11, zbtc zbtcVar) throws IOException {
        zbw(11);
        zbv(2, i11);
        zbf(3, zbtcVar);
        zbw(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbs(int i11, String str) throws IOException {
        zbw((i11 << 3) | 2);
        zbt(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbt(String str) throws IOException {
        int i11 = this.zbd;
        try {
            int zbD = zbtk.zbD(str.length() * 3);
            int zbD2 = zbtk.zbD(str.length());
            if (zbD2 != zbD) {
                zbw(zbwv.zbc(str));
                byte[] bArr = this.zbb;
                int i12 = this.zbd;
                this.zbd = zbwv.zbb(str, bArr, i12, this.zbc - i12);
                return;
            }
            int i13 = i11 + zbD2;
            this.zbd = i13;
            int zbb = zbwv.zbb(str, this.zbb, i13, this.zbc - i13);
            this.zbd = i11;
            zbw((zbb - i11) - zbD2);
            this.zbd = zbb;
        } catch (zbwu e11) {
            this.zbd = i11;
            zbG(str, e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new zbti(e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbu(int i11, int i12) throws IOException {
        zbw((i11 << 3) | i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbv(int i11, int i12) throws IOException {
        zbw(i11 << 3);
        zbw(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbw(int i11) throws IOException {
        while ((i11 & (-128)) != 0) {
            try {
                byte[] bArr = this.zbb;
                int i12 = this.zbd;
                this.zbd = i12 + 1;
                bArr[i12] = (byte) ((i11 | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                i11 >>>= 7;
            } catch (IndexOutOfBoundsException e11) {
                throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e11);
            }
        }
        byte[] bArr2 = this.zbb;
        int i13 = this.zbd;
        this.zbd = i13 + 1;
        bArr2[i13] = (byte) i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbx(int i11, long j11) throws IOException {
        zbw(i11 << 3);
        zby(j11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zby(long j11) throws IOException {
        boolean z11;
        z11 = zbtk.zbc;
        if (!z11 || this.zbc - this.zbd < 10) {
            while ((j11 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zbb;
                    int i11 = this.zbd;
                    this.zbd = i11 + 1;
                    bArr[i11] = (byte) ((((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN) & 255);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e11);
                }
            }
            byte[] bArr2 = this.zbb;
            int i12 = this.zbd;
            this.zbd = i12 + 1;
            bArr2[i12] = (byte) j11;
            return;
        }
        while (true) {
            int i13 = (int) j11;
            if ((j11 & (-128)) == 0) {
                byte[] bArr3 = this.zbb;
                int i14 = this.zbd;
                this.zbd = i14 + 1;
                zbws.zbn(bArr3, i14, (byte) i13);
                return;
            }
            byte[] bArr4 = this.zbb;
            int i15 = this.zbd;
            this.zbd = i15 + 1;
            zbws.zbn(bArr4, i15, (byte) ((i13 | UserVerificationMethods.USER_VERIFY_PATTERN) & 255));
            j11 >>>= 7;
        }
    }
}
