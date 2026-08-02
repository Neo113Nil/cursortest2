package c0;

import android.content.Context;
import s7.d1;
import s7.f1;
import s7.m1;
import s7.n0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f3328a;

    public x(f1 f1Var) {
        g6.v.h(f1Var);
        this.f3328a = f1Var;
    }

    @Override // s7.m1
    public n0 a() {
        throw null;
    }

    @Override // s7.m1
    public d1 b() {
        throw null;
    }

    @Override // s7.m1
    public md.o c() {
        throw null;
    }

    @Override // s7.m1
    public Context e() {
        throw null;
    }

    @Override // s7.m1
    public q6.a f() {
        throw null;
    }

    public abstract void g(com.google.firebase.messaging.x xVar);

    public abstract String h();

    public zc.k i() {
        return (zc.k) ((gf.t) this.f3328a).getValue();
    }

    public void j() {
        d1 d1Var = ((f1) this.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.j();
    }

    public x() {
        this.f3328a = gf.k.b(new b2.b(25));
    }
}
