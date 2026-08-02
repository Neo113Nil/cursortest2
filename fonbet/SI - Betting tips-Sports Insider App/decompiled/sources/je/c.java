package je;

import androidx.lifecycle.i;
import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import eg.c0;
import eg.m0;
import eg.t1;
import fd.d;
import gf.k;
import gf.t;
import hg.d1;
import hg.u0;
import id.w;
import jg.q;
import kotlin.coroutines.Continuation;
import lg.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public t1 f18473b;

    /* renamed from: c, reason: collision with root package name */
    public int f18474c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f18475d;

    /* renamed from: e, reason: collision with root package name */
    public we.a f18476e;

    /* renamed from: f, reason: collision with root package name */
    public final i f18477f;

    /* renamed from: g, reason: collision with root package name */
    public final p0 f18478g;

    /* renamed from: h, reason: collision with root package name */
    public final p0 f18479h;

    /* renamed from: i, reason: collision with root package name */
    public final t f18480i;

    public c() {
        d1 b10 = u0.b(null);
        this.f18475d = b10;
        this.f18477f = androidx.lifecycle.d1.a(b10);
        p0 p0Var = new p0(Boolean.FALSE);
        this.f18478g = p0Var;
        this.f18479h = p0Var;
        this.f18480i = k.b(new id.a(2));
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        we.a aVar = this.f18476e;
        if (aVar != null) {
            aVar.k();
        }
        this.f18476e = null;
        t1 t1Var = this.f18473b;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f18475d.j(null);
        this.f18473b = null;
    }

    public final void e(boolean z5) {
        d dVar = (d) this.f18480i.getValue();
        t1 t1Var = this.f18473b;
        dVar.getClass();
        boolean a7 = d.a(t1Var);
        Continuation continuation = null;
        if (a7) {
            c0.t(androidx.lifecycle.d1.i(this), null, null, new ad.a(this, continuation, 11), 3);
            return;
        }
        t1 t1Var2 = this.f18473b;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        this.f18473b = null;
        int i5 = this.f18474c;
        u1.a i10 = androidx.lifecycle.d1.i(this);
        e eVar = m0.f9201a;
        this.f18473b = c0.t(i10, q.f18523a, null, new w(this, i5, z5, (Continuation) null), 2);
    }
}
