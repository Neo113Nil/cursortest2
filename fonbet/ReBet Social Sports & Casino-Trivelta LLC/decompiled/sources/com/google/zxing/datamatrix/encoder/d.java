package com.google.zxing.datamatrix.encoder;

import com.plaid.internal.EnumC3631g;

/* loaded from: classes3.dex */
public final class d extends k {
    public d() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }

    @Override // com.google.zxing.datamatrix.encoder.k
    public int b(int i10) {
        if (i10 <= 8) {
            return EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE;
        }
        return 155;
    }

    @Override // com.google.zxing.datamatrix.encoder.k
    public int f() {
        return 10;
    }
}
