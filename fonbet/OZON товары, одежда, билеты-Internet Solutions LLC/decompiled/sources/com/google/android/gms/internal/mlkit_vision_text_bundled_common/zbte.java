package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
final class zbte extends zbtg {
    private int zbb;
    private int zbc;
    private int zbd;

    /* synthetic */ zbte(byte[] bArr, int i11, int i12, boolean z11, zbtd zbtdVar) {
        super(null);
        this.zbd = Integer.MAX_VALUE;
        this.zbb = 0;
    }

    public final int zba(int i11) throws zbuq {
        int i12 = this.zbd;
        this.zbd = 0;
        int i13 = this.zbb + this.zbc;
        this.zbb = i13;
        if (i13 <= 0) {
            this.zbc = 0;
            return i12;
        }
        this.zbc = i13;
        this.zbb = 0;
        return i12;
    }
}
