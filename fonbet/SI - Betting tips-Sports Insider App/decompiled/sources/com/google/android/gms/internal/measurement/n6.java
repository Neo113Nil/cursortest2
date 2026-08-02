package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n6 extends p6 {
    @Override // com.google.android.gms.internal.measurement.p6
    public final void a(Object obj, long j, byte b10) {
        if (q6.f5203g) {
            q6.c(obj, j, b10);
        } else {
            q6.d(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p6
    public final boolean b(long j, Object obj) {
        return q6.f5203g ? q6.n(j, obj) : q6.o(j, obj);
    }

    @Override // com.google.android.gms.internal.measurement.p6
    public final void c(Object obj, long j, boolean z5) {
        if (q6.f5203g) {
            q6.c(obj, j, z5 ? (byte) 1 : (byte) 0);
        } else {
            q6.d(obj, j, z5 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p6
    public final float d(long j, Object obj) {
        return Float.intBitsToFloat(this.f5182a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.p6
    public final void e(Object obj, long j, float f6) {
        this.f5182a.putInt(obj, j, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.measurement.p6
    public final double f(long j, Object obj) {
        return Double.longBitsToDouble(this.f5182a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.p6
    public final void g(Object obj, long j, double d10) {
        this.f5182a.putLong(obj, j, Double.doubleToLongBits(d10));
    }
}
