package pe;

import android.content.res.Resources;
import android.os.Parcelable;
import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import eg.c0;
import eg.m0;
import eg.t1;
import hg.d1;
import hg.u0;
import ic.i0;
import id.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.y;
import pd.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends k1 {
    public static volatile boolean G;
    public String A;
    public final p0 B;
    public final p0 C;
    public final d1 D;
    public final androidx.lifecycle.i E;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f21866e;

    /* renamed from: g, reason: collision with root package name */
    public final p0 f21868g;

    /* renamed from: h, reason: collision with root package name */
    public final p0 f21869h;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f21870i;
    public final AtomicBoolean j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f21871k;

    /* renamed from: l, reason: collision with root package name */
    public t1 f21872l;

    /* renamed from: m, reason: collision with root package name */
    public t1 f21873m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f21874n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicInteger f21875o;

    /* renamed from: p, reason: collision with root package name */
    public final d1 f21876p;
    public final io.sentry.hints.j q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f21877r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f21878s;

    /* renamed from: t, reason: collision with root package name */
    public final p0 f21879t;

    /* renamed from: u, reason: collision with root package name */
    public final p0 f21880u;

    /* renamed from: v, reason: collision with root package name */
    public final d1 f21881v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f21882w;

    /* renamed from: x, reason: collision with root package name */
    public int f21883x;

    /* renamed from: y, reason: collision with root package name */
    public int f21884y;

    /* renamed from: z, reason: collision with root package name */
    public String f21885z;
    public static mc.a F = mc.a.f20528c;
    public static final ge.n H = new ge.n(10);

    /* renamed from: b, reason: collision with root package name */
    public final x f21863b = new x();

    /* renamed from: c, reason: collision with root package name */
    public final gf.t f21864c = gf.k.b(new v(8));

    /* renamed from: d, reason: collision with root package name */
    public final t f21865d = new t(wf.b.b((Resources.getSystem().getDisplayMetrics().densityDpi / 160.0f) * 15));

    /* renamed from: f, reason: collision with root package name */
    public final d1 f21867f = u0.b(new ArrayList());

    public s() {
        p0 p0Var = new p0(null);
        this.f21868g = p0Var;
        this.f21869h = p0Var;
        this.f21870i = u0.b(8);
        this.j = new AtomicBoolean(false);
        Boolean bool = Boolean.FALSE;
        this.f21871k = u0.b(bool);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f21874n = atomicInteger;
        this.f21875o = new AtomicInteger(atomicInteger.get());
        this.f21876p = u0.b(Integer.valueOf(atomicInteger.get()));
        this.q = new io.sentry.hints.j(28);
        this.f21877r = new AtomicBoolean(false);
        this.f21878s = new AtomicBoolean(false);
        this.f21879t = new p0(bool);
        this.f21880u = new p0(bool);
        this.f21881v = u0.b(bool);
        this.f21882w = new AtomicBoolean(false);
        this.f21883x = -1;
        this.f21884y = -1;
        this.B = new p0(null);
        this.C = new p0(null);
        d1 b10 = u0.b(null);
        this.D = b10;
        this.E = androidx.lifecycle.d1.a(b10);
    }

    public static final void e(s sVar, ja.c cVar, androidx.fragment.app.p0 p0Var) {
        int i5 = cVar.j;
        if (io.sentry.config.a.C(Integer.valueOf(i5)) || !(io.sentry.config.a.C(Integer.valueOf(i5)) || Intrinsics.areEqual(cVar.b(), "unknown"))) {
            sVar.h(cVar.f18388a, cVar.f18391d);
            return;
        }
        AtomicBoolean atomicBoolean = sVar.j;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        u1.a i10 = androidx.lifecycle.d1.i(sVar);
        lg.e eVar = m0.f9201a;
        c0.t(i10, jg.q.f18523a, null, new oe.j(sVar, p0Var, (Continuation) null, 10), 2);
    }

    public static final void f(s sVar, ja.c cVar) {
        String b10 = cVar.b();
        int i5 = cVar.f18391d;
        int i10 = cVar.f18388a;
        if (!Intrinsics.areEqual(b10, "unknown") || (Intrinsics.areEqual(cVar.b(), "unknown") && io.sentry.config.a.C(Integer.valueOf(cVar.j)))) {
            sVar.h(i10, i5);
            return;
        }
        if (cVar.a()) {
            rc.x.a(R.string.match_has_already_begun, false);
            return;
        }
        if (i5 == 2) {
            da.h hVar = new da.h();
            Integer valueOf = Integer.valueOf(i10);
            HashMap hashMap = hVar.f8333a;
            hashMap.put("id", valueOf);
            hashMap.put("announcementId", -1);
            Intrinsics.checkNotNullExpressionValue(hVar, "apply(...)");
            sVar.i(hVar);
            return;
        }
        if (i5 != 3) {
            return;
        }
        da.g gVar = new da.g();
        Integer valueOf2 = Integer.valueOf(i10);
        HashMap hashMap2 = gVar.f8332a;
        hashMap2.put("id", valueOf2);
        hashMap2.put("announcementId", -1);
        Intrinsics.checkNotNullExpressionValue(gVar, "apply(...)");
        sVar.i(gVar);
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        t1 t1Var = this.f21873m;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f21873m = null;
        this.f21866e = null;
        this.f21867f.j(null);
        this.f21868g.j(null);
    }

    public final void g(mc.a aVar) {
        t1 t1Var = this.f21873m;
        Continuation continuation = null;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f21873m = null;
        c0.t(androidx.lifecycle.d1.i(this), null, null, new q(this, aVar, null), 3);
        c0.t(MyApp.f6830c, null, null, new y(this, aVar, continuation, 13), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i5, int i10) {
        o oVar;
        if (i10 == 2) {
            o oVar2 = new o();
            oVar2.f21851a.put("id", Integer.valueOf(i5));
            Intrinsics.checkNotNullExpressionValue(oVar2, "setId(...)");
            oVar = oVar2;
        } else if (i10 != 3) {
            n nVar = new n();
            nVar.f21850a.put("id", Integer.valueOf(i5));
            Intrinsics.checkNotNullExpressionValue(nVar, "setId(...)");
            oVar = nVar;
        } else {
            l lVar = new l();
            lVar.f21848a.put("id", Integer.valueOf(i5));
            Intrinsics.checkNotNullExpressionValue(lVar, "setId(...)");
            oVar = lVar;
        }
        i(oVar);
    }

    public final void i(y1.c0 c0Var) {
        this.f21868g.h(new i0(new ic.f(c0Var)));
    }

    public final void j(u1.a aVar, Function2 function2, boolean z5) {
        t1 t1Var;
        t1 t1Var2 = this.f21872l;
        if (t1Var2 != null) {
            boolean N = t1Var2.N();
            d1 d1Var = this.f21871k;
            if (N || ((t1Var = this.f21872l) != null && t1Var.isCancelled())) {
                this.f21872l = null;
                Boolean bool = Boolean.FALSE;
                d1Var.getClass();
                d1Var.k(null, bool);
            } else if (((Boolean) d1Var.getValue()).booleanValue()) {
                return;
            }
        }
        lg.e eVar = m0.f9201a;
        this.f21872l = c0.t(aVar, lg.d.f20063c, null, new hd.g(this, function2, z5, (Continuation) null), 2);
    }
}
