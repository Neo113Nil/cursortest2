package defpackage;

import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q50 {
    public final q4k a;
    public final Object b;
    public final d80 c;
    public final e1d d;
    public final e1d e;
    public final r1d f;
    public final g0i g;
    public final j80 h;
    public final j80 i;
    public final j80 j;
    public final j80 k;

    public q50(Object obj, q4k q4kVar, Object obj2) {
        this.a = q4kVar;
        this.b = obj2;
        d80 d80Var = new d80(q4kVar, obj, null, 60);
        this.c = d80Var;
        this.d = e.f(Boolean.FALSE);
        this.e = e.f(obj);
        this.f = new r1d();
        this.g = new g0i(obj2, 3);
        j80 j80Var = d80Var.c;
        boolean z = j80Var instanceof f80;
        j80 j80Var2 = z ? ml4.e : j80Var instanceof g80 ? ml4.f : j80Var instanceof h80 ? ml4.g : ml4.h;
        this.h = j80Var2;
        j80 j80Var3 = z ? ml4.a : j80Var instanceof g80 ? ml4.b : j80Var instanceof h80 ? ml4.c : ml4.d;
        this.i = j80Var3;
        this.j = j80Var2;
        this.k = j80Var3;
    }

    public static Object a(q50 q50Var, Object obj, c80 c80Var, Function1 function1, rq3 rq3Var, int i) {
        if ((i & 2) != 0) {
            c80Var = q50Var.g;
        }
        c80 c80Var2 = c80Var;
        Object invoke = q50Var.a.b.invoke(q50Var.c.c);
        if ((i & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        Object d = q50Var.d();
        q4k q4kVar = q50Var.a;
        return r1d.a(q50Var.f, new m50(q50Var, invoke, new vti(c80Var2, q4kVar, d, obj, (j80) q4kVar.a.invoke(invoke)), q50Var.c.d, function12, null), rq3Var);
    }

    public final Object b(Object obj) {
        j80 j80Var = this.h;
        j80 j80Var2 = this.j;
        boolean c = Intrinsics.c(j80Var2, j80Var);
        j80 j80Var3 = this.k;
        if (!c || !Intrinsics.c(j80Var3, this.i)) {
            q4k q4kVar = this.a;
            j80 j80Var4 = (j80) q4kVar.a.invoke(obj);
            int b = j80Var4.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (j80Var4.a(i) < j80Var2.a(i) || j80Var4.a(i) > j80Var3.a(i)) {
                    j80Var4.e(llf.b(j80Var4.a(i), j80Var2.a(i), j80Var3.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return q4kVar.b.invoke(j80Var4);
            }
        }
        return obj;
    }

    public final void c() {
        d80 d80Var = this.c;
        d80Var.c.d();
        d80Var.d = Long.MIN_VALUE;
        ((eoh) this.d).setValue(Boolean.FALSE);
    }

    public final Object d() {
        return ((eoh) this.c.b).getValue();
    }

    public final boolean e() {
        return ((Boolean) ((eoh) this.d).getValue()).booleanValue();
    }

    public final Object f(rq3 rq3Var, Object obj) {
        Object a = r1d.a(this.f, new n50(this, obj, null, 0), rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    public final Object g(rq3 rq3Var) {
        Object a = r1d.a(this.f, new ej(this, null, 1), rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    public /* synthetic */ q50(Object obj, q4k q4kVar, Object obj2, int i) {
        this(obj, q4kVar, (i & 4) != 0 ? null : obj2);
    }
}
