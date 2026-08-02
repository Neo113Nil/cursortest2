package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
final class zbsu extends zbsv {
    final /* synthetic */ zbtc zba;
    private int zbb = 0;
    private final int zbc;

    zbsu(zbtc zbtcVar) {
        this.zba = zbtcVar;
        this.zbc = zbtcVar.zbd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zbb < this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsx
    public final byte zba() {
        int i11 = this.zbb;
        if (i11 >= this.zbc) {
            throw new NoSuchElementException();
        }
        this.zbb = i11 + 1;
        return this.zba.zbb(i11);
    }
}
