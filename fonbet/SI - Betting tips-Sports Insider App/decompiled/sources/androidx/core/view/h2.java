package androidx.core.view;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class h2 {

    /* renamed from: b, reason: collision with root package name */
    public static final k2 f1325b;

    /* renamed from: a, reason: collision with root package name */
    public final k2 f1326a;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f1325b = (i5 >= 34 ? new y1() : i5 >= 31 ? new x1() : i5 >= 30 ? new w1() : i5 >= 29 ? new v1() : new t1()).b().f1349a.a().f1349a.b().f1349a.c();
    }

    public h2(k2 k2Var) {
        this.f1326a = k2Var;
    }

    public k2 a() {
        return this.f1326a;
    }

    public k2 b() {
        return this.f1326a;
    }

    public k2 c() {
        return this.f1326a;
    }

    public l e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return o() == h2Var.o() && n() == h2Var.n() && Objects.equals(k(), h2Var.k()) && Objects.equals(i(), h2Var.i()) && Objects.equals(e(), h2Var.e());
    }

    public g0.d f(int i5) {
        return g0.d.f9675e;
    }

    public g0.d g(int i5) {
        if ((i5 & 8) == 0) {
            return g0.d.f9675e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public g0.d h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public g0.d i() {
        return g0.d.f9675e;
    }

    public g0.d j() {
        return k();
    }

    public g0.d k() {
        return g0.d.f9675e;
    }

    public g0.d l() {
        return k();
    }

    public k2 m(int i5, int i10, int i11, int i12) {
        return f1325b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public void d(View view) {
    }

    public void p(g0.d[] dVarArr) {
    }

    public void q(k2 k2Var) {
    }

    public void r(g0.d dVar) {
    }

    public void s(int i5) {
    }
}
