package me;

import android.graphics.Color;
import androidx.lifecycle.d1;
import com.sports.insider.MyApp;
import eg.m0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends g0 {

    /* renamed from: n0, reason: collision with root package name */
    public final int f20651n0 = Color.parseColor("#4DFA3636");

    @Override // me.c0
    public final Object f(w wVar) {
        io.sentry.hints.j jVar = this.f20615c0;
        jVar.getClass();
        lg.e eVar = m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new ld.a(jVar, null, 2), wVar);
    }

    @Override // me.c0
    public final Object g(w wVar) {
        return null;
    }

    @Override // me.g0, me.c0
    public final int h() {
        return this.f20651n0;
    }

    @Override // me.c0
    public final void i(boolean z5) {
        u1.a i5 = d1.i(this);
        lg.e eVar = m0.f9201a;
        eg.c0.t(i5, lg.d.f20063c, null, new hd.g(this, z5, null), 2);
    }

    @Override // me.c0
    public final Object j(kc.b bVar, mf.i iVar) {
        lg.e eVar = m0.f9201a;
        Object A = eg.c0.A(lg.d.f20063c, new kd.e(this, bVar, (Continuation) null, 26), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    @Override // me.c0
    public final void k(int i5) {
        int i10 = this.f20619f;
        AtomicBoolean atomicBoolean = this.f20621g;
        if (i10 == -1) {
            atomicBoolean.set(true);
        } else if (i10 != i5) {
            atomicBoolean.set(true);
        }
        this.f20619f = i5;
        jg.d dVar = MyApp.f6830c;
        Continuation continuation = null;
        eg.c0.t(dVar, null, null, new w(this, i5, continuation, 3), 3);
        eg.c0.t(dVar, null, null, new w(this, this.f20619f, continuation, 2), 3);
        i(false);
        eg.c0.t(d1.i(this), null, null, new ab.b(this, continuation, 29), 3);
    }

    @Override // me.c0
    public final void l(boolean z5) {
    }
}
