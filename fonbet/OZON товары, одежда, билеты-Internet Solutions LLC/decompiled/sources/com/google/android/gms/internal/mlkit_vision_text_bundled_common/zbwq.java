package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import sun.misc.Unsafe;

/* loaded from: classes9.dex */
final class zbwq extends zbwr {
    zbwq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final double zba(Object obj, long j11) {
        return Double.longBitsToDouble(this.zba.getLong(obj, j11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final float zbb(Object obj, long j11) {
        return Float.intBitsToFloat(this.zba.getInt(obj, j11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbc(Object obj, long j11, boolean z11) {
        if (zbws.zbb) {
            zbws.zbD(obj, j11, r3 ? (byte) 1 : (byte) 0);
        } else {
            zbws.zbE(obj, j11, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbd(Object obj, long j11, byte b11) {
        if (zbws.zbb) {
            zbws.zbD(obj, j11, b11);
        } else {
            zbws.zbE(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbe(Object obj, long j11, double d11) {
        this.zba.putLong(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbf(Object obj, long j11, float f7) {
        this.zba.putInt(obj, j11, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final boolean zbg(Object obj, long j11) {
        return zbws.zbb ? zbws.zbt(obj, j11) : zbws.zbu(obj, j11);
    }
}
