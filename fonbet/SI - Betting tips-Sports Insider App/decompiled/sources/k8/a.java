package k8;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import java.util.List;
import java.util.Map;
import java.util.Random;
import s7.f2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f18944a;

    public a(j1 j1Var) {
        this.f18944a = j1Var;
    }

    @Override // s7.f2
    public final void a(String str, String str2, Bundle bundle) {
        j1 j1Var = this.f18944a;
        j1Var.c(new x0(j1Var, str, str2, bundle, 1));
    }

    @Override // s7.f2
    public final String b() {
        i0 i0Var = new i0();
        j1 j1Var = this.f18944a;
        j1Var.c(new c1(j1Var, i0Var, 3));
        return (String) i0.f(i0Var.e(500L), String.class);
    }

    @Override // s7.f2
    public final String c() {
        i0 i0Var = new i0();
        j1 j1Var = this.f18944a;
        j1Var.c(new c1(j1Var, i0Var, 4));
        return (String) i0.f(i0Var.e(500L), String.class);
    }

    @Override // s7.f2
    public final void d(Bundle bundle) {
        j1 j1Var = this.f18944a;
        j1Var.c(new w0(j1Var, bundle));
    }

    @Override // s7.f2
    public final void e(String str) {
        j1 j1Var = this.f18944a;
        j1Var.c(new a1(j1Var, str, 1));
    }

    @Override // s7.f2
    public final void f(String str) {
        j1 j1Var = this.f18944a;
        j1Var.c(new a1(j1Var, str, 0));
    }

    @Override // s7.f2
    public final long g() {
        i0 i0Var = new i0();
        j1 j1Var = this.f18944a;
        j1Var.c(new c1(j1Var, i0Var, 2));
        Long l6 = (Long) i0.f(i0Var.e(500L), Long.class);
        if (l6 != null) {
            return l6.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i5 = j1Var.f5093c + 1;
        j1Var.f5093c = i5;
        return nextLong + i5;
    }

    @Override // s7.f2
    public final void h(String str, String str2, Bundle bundle) {
        j1 j1Var = this.f18944a;
        j1Var.c(new x0(j1Var, str, str2, bundle, 0));
    }

    @Override // s7.f2
    public final List i(String str, String str2) {
        return this.f18944a.f(str, str2);
    }

    @Override // s7.f2
    public final int j(String str) {
        return this.f18944a.b(str);
    }

    @Override // s7.f2
    public final String k() {
        i0 i0Var = new i0();
        j1 j1Var = this.f18944a;
        j1Var.c(new c1(j1Var, i0Var, 1));
        return (String) i0.f(i0Var.e(50L), String.class);
    }

    @Override // s7.f2
    public final String l() {
        i0 i0Var = new i0();
        j1 j1Var = this.f18944a;
        j1Var.c(new c1(j1Var, i0Var, 0));
        return (String) i0.f(i0Var.e(500L), String.class);
    }

    @Override // s7.f2
    public final Map m(String str, String str2, boolean z5) {
        return this.f18944a.a(str, str2, z5);
    }
}
