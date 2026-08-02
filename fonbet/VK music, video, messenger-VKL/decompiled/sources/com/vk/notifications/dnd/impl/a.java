package com.vk.notifications.dnd.impl;

import android.content.Context;
import android.view.View;
import com.vk.core.preference.Preference;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.completable.w;
import io.reactivex.rxjava3.internal.operators.mixed.k;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.f;
import java.util.List;
import xsna.ab;
import xsna.asu0;
import xsna.b6m;
import xsna.dsc;
import xsna.es;
import xsna.lsn;
import xsna.msn;
import xsna.nsn;
import xsna.o43;
import xsna.osn;
import xsna.rsg0;
import xsna.s7;
import xsna.tf1;
import xsna.tfx;
import xsna.w7;
import xsna.wf1;
import xsna.xy2;
import xsna.ya;
import xsna.yfb;

/* compiled from: DndInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class a implements msn {
    public final es a;
    public final f<Boolean> b = new f<>();
    public Object c = EmptyDisposable.INSTANCE;

    public a(es esVar) {
        this.a = esVar;
    }

    @Override // xsna.msn
    public final m1 a(Context context) {
        q qVar = new q(new nsn(0, context, this));
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.core.q<R> L = qVar.r0(asu0Var.d()).L(new s7(new ya(15, this, context), 13), false);
        tf1 tf1Var = new tf1(new ab(10, context, this), 20);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return L.E(tf1Var, lVar, kVar, kVar).U(new w7(new dsc(this, 25), 18)).a0(asu0Var.d());
    }

    @Override // xsna.msn
    public final boolean b() {
        return lsn.b();
    }

    @Override // xsna.msn
    public final void c(Context context) {
        this.b.onNext(Boolean.valueOf(lsn.b()));
        String d = b6m.d(context);
        this.a.getClass();
        tfx tfxVar = new tfx("account.getPushSettings", new k(1), new n(1));
        if (d != null) {
            tfx.o(tfxVar, "device_id", d, 0, 0, 12);
        }
        rsg0.w0(yfb.x(tfxVar)).subscribe(new wf1(new o43(18, this, context), 20));
    }

    @Override // xsna.msn
    public final w d(View view) {
        xy2 f;
        f = this.a.f(b6m.d(view.getContext()), 0, null, null, null);
        return rsg0.Z(yfb.x(f)).o(asu0.a.d()).g(new osn(0, this, view));
    }

    @Override // xsna.msn
    public final int e() {
        List<Long> list = lsn.a;
        return (int) (Preference.m(0L, "notifications_prefs", "dnd_end") / 1000);
    }

    @Override // xsna.msn
    public final y f() {
        f<Boolean> fVar = this.b;
        fVar.getClass();
        return new y(fVar, io.reactivex.rxjava3.internal.functions.a.a, b.a);
    }
}
