package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zj0 extends d7e implements swf {
    public ad2 f;
    public final fdi g = gdi.a(new njh(0));
    public final e1d h = e.f(null);
    public final e1d i = e.f(Float.valueOf(1.0f));
    public final e1d j = e.f(null);
    public sj0 k;
    public d7e l;
    public Function1 m;
    public op3 n;
    public int o;
    public boolean p;
    public final e1d q;
    public final e1d r;
    public final e1d s;

    public zj0(ot9 ot9Var, bpf bpfVar) {
        kj0 kj0Var = kj0.a;
        this.k = kj0Var;
        this.m = ry.F;
        this.n = mp3.b;
        this.o = 1;
        this.q = e.f(kj0Var);
        this.r = e.f(ot9Var);
        this.s = e.f(bpfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.swf
    public final void a() {
        if (this.f != null) {
            return;
        }
        smi o = tz9.o();
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(kotlin.coroutines.e.d(o, rob.a.f));
        this.f = c;
        d7e d7eVar = this.l;
        Object[] objArr = 0;
        swf swfVar = d7eVar instanceof swf ? (swf) d7eVar : null;
        if (swfVar != null) {
            swfVar.a();
        }
        if (!this.p) {
            xw3.L(c, null, null, new q3(this, objArr == true ? 1 : 0, 3), 3);
            return;
        }
        it9 a = ot9.a((ot9) ((eoh) this.r).getValue());
        a.b = ((bpf) ((eoh) this.s).getValue()).b;
        a.z = 0;
        ot9 a2 = a.a();
        Drawable drawable = a2.t;
        Integer num = a2.s;
        a2.x.getClass();
        Drawable b = j.b(a2, drawable, num);
        l(new oj0(b != null ? k(b) : null));
    }

    @Override // defpackage.swf
    public final void b() {
        ad2 ad2Var = this.f;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.f = null;
        Object obj = this.l;
        swf swfVar = obj instanceof swf ? (swf) obj : null;
        if (swfVar != null) {
            swfVar.b();
        }
    }

    @Override // defpackage.d7e
    public final boolean c(float f) {
        ((eoh) this.i).setValue(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.swf
    public final void d() {
        ad2 ad2Var = this.f;
        if (ad2Var != null) {
            s9a.o(ad2Var, null);
        }
        this.f = null;
        Object obj = this.l;
        swf swfVar = obj instanceof swf ? (swf) obj : null;
        if (swfVar != null) {
            swfVar.d();
        }
    }

    @Override // defpackage.d7e
    public final boolean e(ay1 ay1Var) {
        ((eoh) this.j).setValue(ay1Var);
        return true;
    }

    @Override // defpackage.d7e
    public final long i() {
        d7e d7eVar = (d7e) ((eoh) this.h).getValue();
        if (d7eVar != null) {
            return d7eVar.i();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        njh njhVar = new njh(ha5Var.n());
        fdi fdiVar = this.g;
        fdiVar.getClass();
        fdiVar.m(null, njhVar);
        d7e d7eVar = (d7e) ((eoh) this.h).getValue();
        if (d7eVar != null) {
            d7eVar.g(ha5Var, ha5Var.n(), ((Number) ((eoh) this.i).getValue()).floatValue(), (ay1) ((eoh) this.j).getValue());
        }
    }

    public final d7e k(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? n4o.b(new a10(((BitmapDrawable) drawable).getBitmap()), this.o) : drawable instanceof ColorDrawable ? new z13(hkg.b(((ColorDrawable) drawable).getColor())) : new sa5(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(sj0 sj0Var) {
        xt9 xt9Var;
        d7e d7eVar;
        sj0 sj0Var2 = this.k;
        sj0 sj0Var3 = (sj0) this.m.invoke(sj0Var);
        this.k = sj0Var3;
        ((eoh) this.q).setValue(sj0Var3);
        if (!(sj0Var3 instanceof qj0)) {
            if (sj0Var3 instanceof mj0) {
                xt9Var = ((mj0) sj0Var3).b;
            }
            d7eVar = null;
            if (d7eVar == null) {
                d7eVar = sj0Var3.a();
            }
            this.l = d7eVar;
            ((eoh) this.h).setValue(d7eVar);
            if (this.f == null || sj0Var2.a() == sj0Var3.a()) {
                return;
            }
            Object a = sj0Var2.a();
            swf swfVar = a instanceof swf ? (swf) a : null;
            if (swfVar != null) {
                swfVar.d();
            }
            Object a2 = sj0Var3.a();
            swf swfVar2 = a2 instanceof swf ? (swf) a2 : null;
            if (swfVar2 != null) {
                swfVar2.a();
                return;
            }
            return;
        }
        xt9Var = ((qj0) sj0Var3).b;
        ywj a3 = xt9Var.b().g.a(gvd.a, xt9Var);
        if (a3 instanceof j24) {
            d7eVar = new f24(sj0Var2 instanceof oj0 ? sj0Var2.a() : null, sj0Var3.a(), this.n, ((j24) a3).c, ((xt9Var instanceof fmi) && ((fmi) xt9Var).g) ? false : true);
            if (d7eVar == null) {
            }
            this.l = d7eVar;
            ((eoh) this.h).setValue(d7eVar);
            if (this.f == null) {
                return;
            } else {
                return;
            }
        }
        d7eVar = null;
        if (d7eVar == null) {
        }
        this.l = d7eVar;
        ((eoh) this.h).setValue(d7eVar);
        if (this.f == null) {
        }
    }
}
