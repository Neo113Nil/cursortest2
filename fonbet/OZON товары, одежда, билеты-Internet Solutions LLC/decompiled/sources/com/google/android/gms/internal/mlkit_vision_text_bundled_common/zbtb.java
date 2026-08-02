package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import java.io.IOException;

/* loaded from: classes9.dex */
class zbtb extends zbta {
    protected final byte[] zba;

    zbtb(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zba = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbtc) || zbd() != ((zbtc) obj).zbd()) {
            return false;
        }
        if (zbd() == 0) {
            return true;
        }
        if (!(obj instanceof zbtb)) {
            return obj.equals(this);
        }
        zbtb zbtbVar = (zbtb) obj;
        int zbi = zbi();
        int zbi2 = zbtbVar.zbi();
        if (zbi != 0 && zbi2 != 0 && zbi != zbi2) {
            return false;
        }
        int zbd = zbd();
        if (zbd > zbtbVar.zbd()) {
            throw new IllegalArgumentException("Length too large: " + zbd + zbd());
        }
        if (zbd > zbtbVar.zbd()) {
            throw new IllegalArgumentException(A0.a(zbd, zbtbVar.zbd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zba;
        byte[] bArr2 = zbtbVar.zba;
        zbtbVar.zbc();
        int i11 = 0;
        int i12 = 0;
        while (i11 < zbd) {
            if (bArr[i11] != bArr2[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public byte zba(int i11) {
        return this.zba[i11];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    byte zbb(int i11) {
        return this.zba[i11];
    }

    protected int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public int zbd() {
        return this.zba.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    protected final int zbe(int i11, int i12, int i13) {
        return zbuo.zbb(i11, this.zba, 0, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final zbtc zbf(int i11, int i12) {
        int zbh = zbtc.zbh(0, i12, zbd());
        return zbh == 0 ? zbtc.zbb : new zbsw(this.zba, 0, zbh);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    final void zbg(zbst zbstVar) throws IOException {
        ((zbth) zbstVar).zbc(this.zba, 0, zbd());
    }
}
