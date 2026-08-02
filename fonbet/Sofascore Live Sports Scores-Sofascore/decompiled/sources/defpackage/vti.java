package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vti implements t70 {
    public final nmk a;
    public final q4k b;
    public Object c;
    public Object d;
    public j80 e;
    public j80 f;
    public final j80 g;
    public long h;
    public j80 i;

    public vti(c80 c80Var, q4k q4kVar, Object obj, Object obj2, j80 j80Var) {
        this.a = c80Var.a(q4kVar);
        this.b = q4kVar;
        this.c = obj2;
        this.d = obj;
        this.e = (j80) q4kVar.a.invoke(obj);
        Function1 function1 = q4kVar.a;
        this.f = (j80) function1.invoke(obj2);
        this.g = j80Var != null ? j72.y(j80Var) : ((j80) function1.invoke(obj)).c();
        this.h = -1L;
    }

    public final void a(Object obj) {
        if (Intrinsics.c(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (j80) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    @Override // defpackage.t70
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.t70
    public final j80 c(long j) {
        if (!d(j)) {
            return this.a.u(j, this.e, this.f, this.g);
        }
        j80 j80Var = this.i;
        if (j80Var != null) {
            return j80Var;
        }
        j80 o = this.a.o(this.e, this.f, this.g);
        this.i = o;
        return o;
    }

    @Override // defpackage.t70
    public final long e() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long d = this.a.d(this.e, this.f, this.g);
        this.h = d;
        return d;
    }

    @Override // defpackage.t70
    public final q4k f() {
        return this.b;
    }

    @Override // defpackage.t70
    public final Object g(long j) {
        if (d(j)) {
            return this.c;
        }
        j80 z = this.a.z(j, this.e, this.f, this.g);
        int b = z.b();
        for (int i = 0; i < b; i++) {
            if (Float.isNaN(z.a(i))) {
                j3f.b("AnimationVector cannot contain a NaN. " + z + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(z);
    }

    @Override // defpackage.t70
    public final Object h() {
        return this.c;
    }

    public final void i(Object obj) {
        if (Intrinsics.c(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (j80) this.b.a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (e() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
