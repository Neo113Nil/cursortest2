package q7;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.appcompat.view.menu.f;
import b6.j;
import com.google.android.gms.measurement.internal.zzpl;
import g6.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import md.o;
import s.e;
import s7.d1;
import s7.e2;
import s7.f1;
import s7.l2;
import s7.n0;
import s7.o2;
import s7.r;
import s7.v3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f22056a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f22057b;

    public a(f1 f1Var) {
        v.h(f1Var);
        this.f22056a = f1Var;
        e2 e2Var = f1Var.f22751m;
        f1.l(e2Var);
        this.f22057b = e2Var;
    }

    @Override // s7.f2
    public final void a(String str, String str2, Bundle bundle) {
        e2 e2Var = this.f22057b;
        ((f1) e2Var.f3328a).f22749k.getClass();
        e2Var.o(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // s7.f2
    public final String b() {
        o2 o2Var = ((f1) this.f22057b.f3328a).f22750l;
        f1.l(o2Var);
        l2 l2Var = o2Var.f22929c;
        if (l2Var != null) {
            return l2Var.f22871a;
        }
        return null;
    }

    @Override // s7.f2
    public final String c() {
        o2 o2Var = ((f1) this.f22057b.f3328a).f22750l;
        f1.l(o2Var);
        l2 l2Var = o2Var.f22929c;
        if (l2Var != null) {
            return l2Var.f22872b;
        }
        return null;
    }

    @Override // s7.f2
    public final void d(Bundle bundle) {
        e2 e2Var = this.f22057b;
        ((f1) e2Var.f3328a).f22749k.getClass();
        e2Var.w(bundle, System.currentTimeMillis());
    }

    @Override // s7.f2
    public final void e(String str) {
        f1 f1Var = this.f22056a;
        r rVar = f1Var.f22752n;
        f1.j(rVar);
        f1Var.f22749k.getClass();
        rVar.l(SystemClock.elapsedRealtime(), str);
    }

    @Override // s7.f2
    public final void f(String str) {
        f1 f1Var = this.f22056a;
        r rVar = f1Var.f22752n;
        f1.j(rVar);
        f1Var.f22749k.getClass();
        rVar.k(SystemClock.elapsedRealtime(), str);
    }

    @Override // s7.f2
    public final long g() {
        v3 v3Var = this.f22056a.f22748i;
        f1.k(v3Var);
        return v3Var.h0();
    }

    @Override // s7.f2
    public final void h(String str, String str2, Bundle bundle) {
        e2 e2Var = this.f22056a.f22751m;
        f1.l(e2Var);
        e2Var.x(str, str2, bundle);
    }

    @Override // s7.f2
    public final List i(String str, String str2) {
        e2 e2Var = this.f22057b;
        f1 f1Var = (f1) e2Var.f3328a;
        d1 d1Var = f1Var.f22746g;
        n0 n0Var = f1Var.f22745f;
        f1.m(d1Var);
        if (d1Var.p()) {
            f1.m(n0Var);
            n0Var.f22903f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (o.f()) {
            f1.m(n0Var);
            n0Var.f22903f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        d1 d1Var2 = f1Var.f22746g;
        f1.m(d1Var2);
        d1Var2.t(atomicReference, 5000L, "get conditional user properties", new f(e2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return v3.a0(list);
        }
        f1.m(n0Var);
        n0Var.f22903f.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // s7.f2
    public final int j(String str) {
        e2 e2Var = this.f22057b;
        e2Var.getClass();
        v.e(str);
        ((f1) e2Var.f3328a).getClass();
        return 25;
    }

    @Override // s7.f2
    public final String k() {
        return (String) this.f22057b.f22700g.get();
    }

    @Override // s7.f2
    public final String l() {
        return this.f22057b.y();
    }

    @Override // s7.f2
    public final Map m(String str, String str2, boolean z5) {
        e2 e2Var = this.f22057b;
        f1 f1Var = (f1) e2Var.f3328a;
        d1 d1Var = f1Var.f22746g;
        n0 n0Var = f1Var.f22745f;
        f1.m(d1Var);
        if (d1Var.p()) {
            f1.m(n0Var);
            n0Var.f22903f.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (o.f()) {
            f1.m(n0Var);
            n0Var.f22903f.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        d1 d1Var2 = f1Var.f22746g;
        f1.m(d1Var2);
        d1Var2.t(atomicReference, 5000L, "get user properties", new j(e2Var, atomicReference, str, str2, z5));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            f1.m(n0Var);
            n0Var.f22903f.b(Boolean.valueOf(z5), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (zzpl zzplVar : list) {
            Object c2 = zzplVar.c();
            if (c2 != null) {
                eVar.put(zzplVar.f5814b, c2);
            }
        }
        return eVar;
    }
}
