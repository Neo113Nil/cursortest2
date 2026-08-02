package je;

import android.os.Parcelable;
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
import java.util.concurrent.atomic.AtomicBoolean;
import jg.q;
import kotlin.collections.e0;
import kotlin.coroutines.Continuation;
import lg.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f18465b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final p0 f18466c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f18467d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f18468e;

    /* renamed from: f, reason: collision with root package name */
    public final i f18469f;

    /* renamed from: g, reason: collision with root package name */
    public t1 f18470g;

    /* renamed from: h, reason: collision with root package name */
    public final t f18471h;

    /* renamed from: i, reason: collision with root package name */
    public we.a f18472i;
    public Parcelable j;

    public b() {
        p0 p0Var = new p0(Boolean.FALSE);
        this.f18466c = p0Var;
        this.f18467d = p0Var;
        d1 b10 = u0.b(e0.f19204a);
        this.f18468e = b10;
        this.f18469f = androidx.lifecycle.d1.a(b10);
        this.f18471h = k.b(new id.a(1));
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        we.a aVar = this.f18472i;
        if (aVar != null) {
            aVar.k();
        }
        this.f18472i = null;
        t1 t1Var = this.f18470g;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f18470g = null;
        this.j = null;
    }

    public final void e(boolean z5) {
        d dVar = (d) this.f18471h.getValue();
        t1 t1Var = this.f18470g;
        dVar.getClass();
        boolean a7 = d.a(t1Var);
        Continuation continuation = null;
        if (a7) {
            c0.t(androidx.lifecycle.d1.i(this), null, null, new ad.a(this, continuation, 10), 3);
            return;
        }
        t1 t1Var2 = this.f18470g;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        u1.a i5 = androidx.lifecycle.d1.i(this);
        e eVar = m0.f9201a;
        this.f18470g = c0.t(i5, q.f18523a, null, new a(this, z5, continuation, 0), 2);
    }
}
