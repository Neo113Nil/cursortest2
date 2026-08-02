package com.vk.core.utils.newtork;

import com.vk.core.utils.newtork.c;
import com.vk.core.utils.newtork.d;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import xsna.aej;
import xsna.b4q;
import xsna.d460;
import xsna.epx;
import xsna.h460;
import xsna.i460;
import xsna.ipo;
import xsna.j2u;
import xsna.j460;
import xsna.jpo;
import xsna.k460;
import xsna.utk0;
import xsna.vdj;
import xsna.vtk0;
import xsna.x1w;
import xsna.ziv;

/* compiled from: NetworkManager.kt */
/* loaded from: classes.dex */
public final class b implements d460 {
    public static final b a = new b();
    public static a b;
    public static c c;
    public static final io.reactivex.rxjava3.subjects.d<d> d;
    public static final io.reactivex.rxjava3.subjects.d<NetworkState> e;
    public static final utk0 f;

    static {
        c.a aVar = new c.a();
        c cVar = new c();
        cVar.a = aVar.a;
        c = cVar;
        io.reactivex.rxjava3.subjects.d<d> N0 = io.reactivex.rxjava3.subjects.d.N0();
        d = N0;
        io.reactivex.rxjava3.subjects.d<NetworkState> N02 = io.reactivex.rxjava3.subjects.d.N0();
        e = N02;
        f = vtk0.a(d.a.a);
        i460 i460Var = new i460(new h460(0), 0);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        N0.E(i460Var, lVar, kVar, kVar).F(new j460(new ziv(2), 0)).subscribe();
        N02.E(new k460(new aej(2), 0), lVar, kVar, kVar).F(new jpo(new ipo(3), 1)).subscribe();
    }

    public static final NetworkState c() {
        NetworkState P0 = e.P0();
        if (P0 == null) {
            P0 = (NetworkState) NetworkState.g.getValue();
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return P0;
        }
        L.u(l, L.LogType.d, new Object[]{"Current emitter state = " + P0});
        return P0;
    }

    public static boolean d() {
        d P0 = d.P0();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.d;
            StringBuilder sb = new StringBuilder("Current emitter status = ");
            sb.append(P0 != null ? P0.getClass().getSimpleName() : null);
            L.u(l, logType, new Object[]{sb.toString()});
        }
        return epx.f(P0, d.a.a);
    }

    public static boolean e() {
        return c.a.invoke().booleanValue();
    }

    public static j1 f() {
        io.reactivex.rxjava3.subjects.d<d> dVar = d;
        dVar.getClass();
        i0 i0Var = new i0(new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new x1w(new j2u(1), 2));
        new vdj(1);
        return i0Var.U(new b4q());
    }

    @Override // xsna.d460
    public final void a(NetworkState networkState) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Network state changed = " + networkState});
        }
        e.onNext(networkState);
    }

    @Override // xsna.d460
    public final void b(d dVar) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Network status changed = ".concat(dVar.getClass().getSimpleName())});
        }
        d.onNext(dVar);
        utk0 utk0Var = f;
        utk0Var.getClass();
        utk0Var.i(null, dVar);
    }
}
