package qd;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import c4.w;
import eg.c0;
import eg.t1;
import eg.y;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f22115b;

    /* renamed from: c, reason: collision with root package name */
    public t1 f22116c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f22117d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f22118e;

    /* renamed from: f, reason: collision with root package name */
    public final p0 f22119f;

    /* renamed from: g, reason: collision with root package name */
    public final p0 f22120g;

    /* renamed from: h, reason: collision with root package name */
    public final p0 f22121h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f22122i;
    public id.c j;

    /* renamed from: k, reason: collision with root package name */
    public final p0 f22123k;

    /* renamed from: l, reason: collision with root package name */
    public final p0 f22124l;

    /* renamed from: m, reason: collision with root package name */
    public final p0 f22125m;

    /* renamed from: n, reason: collision with root package name */
    public final p0 f22126n;

    /* renamed from: o, reason: collision with root package name */
    public final p0 f22127o;

    public h() {
        p0 p0Var = new p0(null);
        this.f22117d = p0Var;
        p0 p0Var2 = new p0(null);
        this.f22118e = p0Var2;
        p0 p0Var3 = new p0(null);
        this.f22119f = p0Var3;
        p0 p0Var4 = new p0(null);
        this.f22120g = p0Var4;
        this.f22121h = new p0(null);
        p0 p0Var5 = new p0(Boolean.FALSE);
        this.f22122i = p0Var5;
        this.j = new id.c(1);
        this.f22123k = p0Var;
        this.f22124l = p0Var2;
        this.f22125m = p0Var3;
        this.f22126n = p0Var4;
        this.f22127o = p0Var5;
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        t1 t1Var = this.f22116c;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f22116c = null;
        this.f22115b = null;
        this.j = null;
    }

    public final void e() {
        u1.a i5 = d1.i(this);
        w wVar = zc.a.f25907a;
        y yVar = new y("onFailureAuth2");
        wVar.getClass();
        c0.t(i5, kotlin.coroutines.e.c(wVar, yVar), null, new f(this, null, 1), 2);
    }
}
