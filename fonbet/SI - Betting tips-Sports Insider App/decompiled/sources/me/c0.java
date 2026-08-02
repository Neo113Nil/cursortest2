package me;

import android.graphics.Color;
import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.data.entity.prediction.GamesInfoData;
import eg.m0;
import eg.t1;
import hg.d1;
import hg.u0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c0 extends k1 {
    public final androidx.lifecycle.i A;
    public final androidx.lifecycle.i B;
    public final androidx.lifecycle.i C;
    public final androidx.lifecycle.i D;
    public final androidx.lifecycle.i E;
    public final androidx.lifecycle.i F;
    public final androidx.lifecycle.i G;
    public final androidx.lifecycle.i H;
    public final androidx.lifecycle.i I;
    public final androidx.lifecycle.i J;
    public final androidx.lifecycle.i K;
    public final androidx.lifecycle.i L;
    public final androidx.lifecycle.i M;
    public final androidx.lifecycle.i N;
    public b0 O;
    public long P;
    public long Q;
    public final d1 R;
    public final d1 S;
    public final d1 T;
    public final d1 U;
    public final d1 V;
    public final d1 W;
    public t1 X;
    public t1 Y;
    public final d1 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final d1 f20611a0;

    /* renamed from: b0, reason: collision with root package name */
    public final androidx.lifecycle.i f20613b0;

    /* renamed from: c0, reason: collision with root package name */
    public final io.sentry.hints.j f20615c0;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f20616d;

    /* renamed from: d0, reason: collision with root package name */
    public final AtomicBoolean f20617d0;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.i f20618e;
    public final AtomicBoolean e0;

    /* renamed from: f, reason: collision with root package name */
    public int f20619f;

    /* renamed from: f0, reason: collision with root package name */
    public final p0 f20620f0;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f20621g;

    /* renamed from: g0, reason: collision with root package name */
    public final p0 f20622g0;

    /* renamed from: h, reason: collision with root package name */
    public t1 f20623h;

    /* renamed from: h0, reason: collision with root package name */
    public int f20624h0;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f20625i;

    /* renamed from: i0, reason: collision with root package name */
    public int f20626i0;
    public final androidx.lifecycle.i j;
    public String j0;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f20627k;
    public String k0;

    /* renamed from: l, reason: collision with root package name */
    public final d1 f20628l;

    /* renamed from: l0, reason: collision with root package name */
    public final p0 f20629l0;

    /* renamed from: m, reason: collision with root package name */
    public final d1 f20630m;

    /* renamed from: m0, reason: collision with root package name */
    public final p0 f20631m0;

    /* renamed from: n, reason: collision with root package name */
    public final d1 f20632n;

    /* renamed from: o, reason: collision with root package name */
    public final d1 f20633o;

    /* renamed from: p, reason: collision with root package name */
    public final d1 f20634p;
    public final d1 q;

    /* renamed from: r, reason: collision with root package name */
    public final d1 f20635r;

    /* renamed from: s, reason: collision with root package name */
    public final d1 f20636s;

    /* renamed from: t, reason: collision with root package name */
    public final d1 f20637t;

    /* renamed from: u, reason: collision with root package name */
    public final d1 f20638u;

    /* renamed from: v, reason: collision with root package name */
    public final d1 f20639v;

    /* renamed from: w, reason: collision with root package name */
    public final d1 f20640w;

    /* renamed from: x, reason: collision with root package name */
    public final d1 f20641x;

    /* renamed from: y, reason: collision with root package name */
    public final d1 f20642y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.lifecycle.i f20643z;

    /* renamed from: b, reason: collision with root package name */
    public final l1.a f20612b = new l1.a(23, false);

    /* renamed from: c, reason: collision with root package name */
    public final m3.f f20614c = new m3.f(19);

    public c0() {
        Boolean bool = Boolean.FALSE;
        d1 b10 = u0.b(bool);
        this.f20616d = b10;
        this.f20618e = androidx.lifecycle.d1.a(b10);
        this.f20619f = -1;
        this.f20621g = new AtomicBoolean(true);
        d1 b11 = u0.b(bool);
        this.f20625i = b11;
        this.j = androidx.lifecycle.d1.a(b11);
        d1 b12 = u0.b(null);
        this.f20627k = b12;
        d1 b13 = u0.b(null);
        this.f20628l = b13;
        d1 b14 = u0.b(null);
        this.f20630m = b14;
        d1 b15 = u0.b(null);
        this.f20632n = b15;
        d1 b16 = u0.b(null);
        this.f20633o = b16;
        d1 b17 = u0.b(null);
        this.f20634p = b17;
        d1 b18 = u0.b(null);
        this.q = b18;
        d1 b19 = u0.b(null);
        this.f20635r = b19;
        d1 b20 = u0.b(null);
        this.f20636s = b20;
        d1 b21 = u0.b(null);
        this.f20637t = b21;
        d1 b22 = u0.b(null);
        this.f20638u = b22;
        d1 b23 = u0.b(null);
        this.f20639v = b23;
        d1 b24 = u0.b(null);
        this.f20640w = b24;
        d1 b25 = u0.b(null);
        this.f20641x = b25;
        d1 b26 = u0.b(null);
        this.f20642y = b26;
        this.f20643z = androidx.lifecycle.d1.a(b12);
        this.A = androidx.lifecycle.d1.a(b13);
        this.B = androidx.lifecycle.d1.a(b14);
        this.C = androidx.lifecycle.d1.a(b15);
        this.D = androidx.lifecycle.d1.a(b18);
        this.E = androidx.lifecycle.d1.a(b19);
        this.F = androidx.lifecycle.d1.a(b20);
        this.G = androidx.lifecycle.d1.a(b21);
        this.H = androidx.lifecycle.d1.a(b22);
        this.I = androidx.lifecycle.d1.a(b23);
        this.J = androidx.lifecycle.d1.a(b24);
        this.K = androidx.lifecycle.d1.a(b25);
        this.L = androidx.lifecycle.d1.a(b26);
        this.M = androidx.lifecycle.d1.a(b16);
        this.N = androidx.lifecycle.d1.a(b17);
        this.R = u0.b(null);
        this.S = u0.b(null);
        this.T = u0.b(null);
        this.U = u0.b(null);
        this.V = u0.b(null);
        this.W = u0.b(null);
        d1 b27 = u0.b(bool);
        this.Z = b27;
        d1 b28 = u0.b(Integer.valueOf(R.drawable.ic_un_saved_24));
        this.f20611a0 = b28;
        androidx.lifecycle.d1.a(b27);
        this.f20613b0 = androidx.lifecycle.d1.a(b28);
        this.f20615c0 = new io.sentry.hints.j(28);
        this.f20617d0 = new AtomicBoolean(false);
        this.e0 = new AtomicBoolean(false);
        this.f20620f0 = new p0(bool);
        this.f20622g0 = new p0(bool);
        this.f20624h0 = -1;
        this.f20626i0 = -1;
        this.f20629l0 = new p0(null);
        this.f20631m0 = new p0(null);
    }

    public static final Object e(c0 c0Var, GamesInfoData gamesInfoData, mf.i iVar) {
        lg.e eVar = m0.f9201a;
        Object A = eg.c0.A(lg.d.f20063c, new kd.e(gamesInfoData, c0Var, (Continuation) null, 28), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        b0 b0Var = this.O;
        if (b0Var != null) {
            b0Var.cancel();
        }
        this.O = null;
        this.Q = 0L;
        t1 t1Var = this.f20623h;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f20623h = null;
        t1 t1Var2 = this.X;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        this.X = null;
        t1 t1Var3 = this.Y;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        this.Y = null;
    }

    public Object f(w wVar) {
        io.sentry.hints.j jVar = this.f20615c0;
        jVar.getClass();
        lg.e eVar = m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new ld.a(jVar, null, 1), wVar);
    }

    public Object g(w wVar) {
        io.sentry.hints.j jVar = this.f20615c0;
        jVar.getClass();
        lg.e eVar = m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new ld.a(jVar, null, 6), wVar);
    }

    public int h() {
        return Color.parseColor("#4D086B48");
    }

    public void i(boolean z5) {
        u1.a i5 = androidx.lifecycle.d1.i(this);
        lg.e eVar = m0.f9201a;
        eg.c0.t(i5, lg.d.f20063c, null, new x(this, z5, null), 2);
    }

    public Object j(kc.b bVar, mf.i iVar) {
        lg.e eVar = m0.f9201a;
        Object A = eg.c0.A(lg.d.f20063c, new m2.f0(this, bVar, null, 5), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    public void k(int i5) {
        AtomicBoolean atomicBoolean = this.f20621g;
        int i10 = this.f20619f;
        int i11 = 3;
        Continuation continuation = null;
        if (i10 == -1) {
            atomicBoolean.set(true);
        } else if (i10 != i5) {
            atomicBoolean.set(true);
            eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new w(this, continuation, 5), 3);
        }
        this.f20619f = i5;
        jg.d dVar = MyApp.f6830c;
        eg.c0.t(dVar, null, null, new w(this, i5, continuation, i11), 3);
        eg.c0.t(dVar, null, null, new w(this, this.f20619f, continuation, 4), 3);
        eg.c0.t(dVar, null, null, new w(this, this.f20619f, continuation, 2), 3);
        i(false);
        eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new ab.b(this, continuation, 29), 3);
        d1 d1Var = this.f20616d;
        String str = gc.d.f9945a;
        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(d2.i.c(), "ru"));
        d1Var.getClass();
        d1Var.k(null, valueOf);
    }

    public void l(boolean z5) {
        if (z5) {
            AtomicBoolean atomicBoolean = this.f20617d0;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            this.f20615c0.C(this.f20624h0);
        }
    }
}
