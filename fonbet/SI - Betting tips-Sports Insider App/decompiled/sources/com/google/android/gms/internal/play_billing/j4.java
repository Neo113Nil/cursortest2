package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j4 extends l4 {
    @Override // com.google.android.gms.internal.play_billing.l4
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.f5499a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.f5499a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void c(Object obj, long j, boolean z5) {
        if (m4.f5515g) {
            m4.c(obj, j, z5 ? (byte) 1 : (byte) 0);
        } else {
            m4.d(obj, j, z5 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void d(Object obj, long j, byte b10) {
        if (m4.f5515g) {
            m4.c(obj, j, b10);
        } else {
            m4.d(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void e(Object obj, long j, double d10) {
        this.f5499a.putLong(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void f(Object obj, long j, float f6) {
        this.f5499a.putInt(obj, j, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final boolean g(long j, Object obj) {
        return m4.f5515g ? m4.m(j, obj) : m4.n(j, obj);
    }
}
