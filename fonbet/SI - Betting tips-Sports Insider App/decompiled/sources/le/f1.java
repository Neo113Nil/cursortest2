package le;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.sports.insider.MyApp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f1 extends androidx.lifecycle.k1 {

    /* renamed from: b, reason: collision with root package name */
    public int f19765b = -1;

    /* renamed from: c, reason: collision with root package name */
    public eg.t1 f19766c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19767d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19768e;

    public f1() {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0(null);
        this.f19767d = p0Var;
        this.f19768e = p0Var;
    }

    public static void m(f1 f1Var, Context context) {
        f1Var.i().getClass();
        new l1.a(22).y(context, false);
    }

    @Override // androidx.lifecycle.k1
    public void d() {
        l();
    }

    public final Object f(Activity activity, mf.i iVar) {
        lg.e eVar = eg.m0.f9201a;
        Object A = eg.c0.A(lg.d.f20063c, new bd.i(this, activity, (Continuation) null, 16), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    public abstract Bundle g();

    public abstract y1.a h();

    public abstract wc.d0 i();

    public final void j(y1.c0 navigate) {
        Intrinsics.checkNotNullParameter(navigate, "navigate");
        this.f19767d.h(new ic.i0(new ic.f(navigate)));
    }

    public void k() {
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = eg.m0.f9201a;
        this.f19766c = eg.c0.t(dVar, lg.d.f20063c, null, new androidx.lifecycle.b(this, (Continuation) null, 14), 2);
    }

    public final void l() {
        eg.t1 t1Var = this.f19766c;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f19766c = null;
    }

    public final void n() {
        u1.a i5 = androidx.lifecycle.d1.i(this);
        lg.e eVar = eg.m0.f9201a;
        eg.c0.t(i5, jg.q.f18523a, null, new e1(this, null, 1), 2);
    }

    public void e() {
    }
}
