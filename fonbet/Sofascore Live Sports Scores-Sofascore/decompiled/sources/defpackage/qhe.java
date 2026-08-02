package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class qhe {
    public int a;
    public int b;
    public long c = 0;
    public long d = rhe.a;
    public long e = 0;

    public abstract int R(jo joVar);

    public int S() {
        return (int) (this.c & 4294967295L);
    }

    public int V() {
        return (int) (this.c >> 32);
    }

    public final void Z() {
        this.a = llf.c((int) (this.c >> 32), an3.j(this.d), an3.h(this.d));
        this.b = llf.c((int) (this.c & 4294967295L), an3.i(this.d), an3.g(this.d));
        int i = this.a;
        long j = this.c;
        this.e = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public void a0(float f, long j, n29 n29Var) {
        b0(j, f, null);
    }

    public abstract void b0(long j, float f, Function1 function1);

    public Object h() {
        return null;
    }

    public final void i0(long j) {
        if (c7a.a(this.c, j)) {
            return;
        }
        this.c = j;
        Z();
    }

    public final void m0(long j) {
        if (an3.b(this.d, j)) {
            return;
        }
        this.d = j;
        Z();
    }
}
