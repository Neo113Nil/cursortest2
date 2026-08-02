package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x3 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f5635a;

    /* renamed from: b, reason: collision with root package name */
    public final e3 f5636b;

    public x3(e3 e3Var, t2 t2Var) {
        e3 e3Var2 = b3.f5401a;
        this.f5636b = e3Var;
        this.f5635a = t2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final void a(Object obj) {
        this.f5636b.getClass();
        h4 h4Var = ((g3) obj).zzc;
        if (h4Var.f5479e) {
            h4Var.f5479e = false;
        }
        e3 e3Var = b3.f5401a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final boolean b(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final g3 c() {
        t2 t2Var = this.f5635a;
        return t2Var instanceof g3 ? (g3) ((g3) t2Var).d(4) : ((f3) ((g3) t2Var).d(5)).d();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final int d(t2 t2Var) {
        h4 h4Var = ((g3) t2Var).zzc;
        int i5 = h4Var.f5478d;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < h4Var.f5475a; i11++) {
            int i12 = h4Var.f5476b[i11] >>> 3;
            y2 y2Var = (y2) h4Var.f5477c[i11];
            int e0 = z2.e0(8);
            int e02 = z2.e0(i12) + z2.e0(16);
            int e03 = z2.e0(24);
            int c2 = y2Var.c();
            i10 += e0 + e0 + e02 + androidx.appcompat.widget.c1.w(c2, c2, e03);
        }
        h4Var.f5478d = i10;
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final void e(Object obj, Object obj2) {
        e4.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final int f(g3 g3Var) {
        return g3Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final boolean g(g3 g3Var, g3 g3Var2) {
        return g3Var.zzc.equals(g3Var2.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final void h(Object obj, byte[] bArr, int i5, int i10, com.google.android.gms.internal.measurement.t4 t4Var) {
        g3 g3Var = (g3) obj;
        if (g3Var.zzc == h4.f5474f) {
            g3Var.zzc = h4.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    public final void i(Object obj, r3 r3Var) {
        obj.getClass();
        throw new ClassCastException();
    }
}
