package Z9;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.measurement.internal.C3298l3;
import com.google.android.gms.measurement.internal.W4;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final C3298l3 f14746a;

    /* renamed from: b, reason: collision with root package name */
    public final W4 f14747b;

    public a(C3298l3 c3298l3) {
        super(null);
        AbstractC3191o.m(c3298l3);
        this.f14746a = c3298l3;
        this.f14747b = c3298l3.B();
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void a(String str, String str2, Bundle bundle) {
        this.f14747b.p(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void b(Bundle bundle) {
        this.f14747b.M(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void c(String str) {
        C3298l3 c3298l3 = this.f14746a;
        c3298l3.M().j(str, c3298l3.e().b());
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void d(String str) {
        C3298l3 c3298l3 = this.f14746a;
        c3298l3.M().i(str, c3298l3.e().b());
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final int e(String str) {
        this.f14747b.L(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final Map f(String str, String str2, boolean z10) {
        return this.f14747b.C(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final void g(String str, String str2, Bundle bundle) {
        this.f14746a.B().O(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final List h(String str, String str2) {
        return this.f14747b.P(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final String zzh() {
        return this.f14747b.Q();
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final String zzi() {
        return this.f14747b.R();
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final String zzj() {
        return this.f14747b.D();
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final String zzk() {
        return this.f14747b.S();
    }

    @Override // com.google.android.gms.measurement.internal.X4
    public final long zzl() {
        return this.f14746a.C().p0();
    }
}
