package androidx.core.view;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final k2 f1419a;

    /* renamed from: b, reason: collision with root package name */
    public g0.d[] f1420b;

    public z1() {
        this(new k2());
    }

    public final void a() {
        g0.d[] dVarArr = this.f1420b;
        if (dVarArr != null) {
            g0.d dVar = dVarArr[0];
            g0.d dVar2 = dVarArr[1];
            k2 k2Var = this.f1419a;
            if (dVar2 == null) {
                dVar2 = k2Var.f1349a.f(2);
            }
            if (dVar == null) {
                dVar = k2Var.f1349a.f(1);
            }
            g(g0.d.a(dVar, dVar2));
            g0.d dVar3 = this.f1420b[ci.c.A(16)];
            if (dVar3 != null) {
                f(dVar3);
            }
            g0.d dVar4 = this.f1420b[ci.c.A(32)];
            if (dVar4 != null) {
                d(dVar4);
            }
            g0.d dVar5 = this.f1420b[ci.c.A(64)];
            if (dVar5 != null) {
                h(dVar5);
            }
        }
    }

    public abstract k2 b();

    public void c(int i5, g0.d dVar) {
        if (this.f1420b == null) {
            this.f1420b = new g0.d[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i5 & i10) != 0) {
                this.f1420b[ci.c.A(i10)] = dVar;
            }
        }
    }

    public abstract void e(g0.d dVar);

    public abstract void g(g0.d dVar);

    public z1(k2 k2Var) {
        this.f1419a = k2Var;
    }

    public void d(g0.d dVar) {
    }

    public void f(g0.d dVar) {
    }

    public void h(g0.d dVar) {
    }
}
