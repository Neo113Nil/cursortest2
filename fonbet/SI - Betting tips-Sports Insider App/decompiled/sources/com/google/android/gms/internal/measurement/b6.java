package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b6 implements h6 {

    /* renamed from: a, reason: collision with root package name */
    public final q4 f4935a;

    /* renamed from: b, reason: collision with root package name */
    public final e5 f4936b;

    public b6(e5 e5Var, q4 q4Var) {
        e5 e5Var2 = a5.f4910a;
        this.f4936b = e5Var;
        this.f4935a = q4Var;
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final g5 a() {
        q4 q4Var = this.f4935a;
        return q4Var instanceof g5 ? (g5) ((g5) q4Var).o(4) : ((f5) ((g5) q4Var).o(5)).e();
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final boolean b(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final void c(Object obj, Object obj2) {
        i6.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final int d(q4 q4Var) {
        l6 l6Var = ((g5) q4Var).zzc;
        int i5 = l6Var.f5130d;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < l6Var.f5127a; i11++) {
            int i12 = l6Var.f5128b[i11] >>> 3;
            w4 w4Var = (w4) l6Var.f5129c[i11];
            int b02 = x4.b0(8);
            int b03 = x4.b0(i12) + x4.b0(16);
            int b04 = x4.b0(24);
            int c2 = w4Var.c();
            i10 += b02 + b02 + b03 + androidx.appcompat.widget.c1.f(c2, c2, b04);
        }
        l6Var.f5130d = i10;
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final void e(Object obj, u5 u5Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final boolean f(g5 g5Var, g5 g5Var2) {
        return g5Var.zzc.equals(g5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final void g(Object obj) {
        this.f4936b.getClass();
        l6 l6Var = ((g5) obj).zzc;
        if (l6Var.f5131e) {
            l6Var.f5131e = false;
        }
        e5 e5Var = a5.f4910a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final void h(Object obj, byte[] bArr, int i5, int i10, t4 t4Var) {
        g5 g5Var = (g5) obj;
        if (g5Var.zzc == l6.f5126f) {
            g5Var.zzc = l6.a();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.h6
    public final int i(g5 g5Var) {
        return g5Var.zzc.hashCode();
    }
}
