package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import Ej.b;

/* loaded from: classes9.dex */
final class zbsw extends zbtb {
    private final int zbc;

    zbsw(byte[] bArr, int i11, int i12) {
        super(bArr);
        zbtc.zbh(0, i12, bArr.length);
        this.zbc = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final byte zba(int i11) {
        int i12 = this.zbc;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return ((zbtb) this).zba[i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(b.a(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(A0.a(i11, i12, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    final byte zbb(int i11) {
        return ((zbtb) this).zba[i11];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb
    protected final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final int zbd() {
        return this.zbc;
    }
}
