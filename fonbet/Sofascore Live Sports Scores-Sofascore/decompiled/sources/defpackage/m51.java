package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class m51 implements ite {
    public final int a;
    public ryf c;
    public int d;
    public bse e;
    public int f;
    public ipg g;
    public sm8[] h;
    public long i;
    public boolean k;
    public boolean l;
    public final fp4 b = new fp4(22, false);
    public long j = Long.MIN_VALUE;

    public m51(int i) {
        this.a = i;
    }

    public static int b(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sf6 c(Exception exc, sm8 sm8Var, boolean z, int i) {
        int i2;
        if (sm8Var != null && !this.l) {
            this.l = true;
            try {
                i2 = u(sm8Var) & 7;
            } catch (sf6 unused) {
            } finally {
                this.l = false;
            }
            return new sf6(1, exc, i, e(), this.d, sm8Var, sm8Var != null ? 4 : i2, z);
        }
        i2 = 4;
        return new sf6(1, exc, i, e(), this.d, sm8Var, sm8Var != null ? 4 : i2, z);
    }

    public l2c d() {
        return null;
    }

    public abstract String e();

    public final boolean f() {
        return this.j == Long.MIN_VALUE;
    }

    public abstract boolean g();

    public abstract boolean h();

    public abstract void i();

    public abstract void k(long j, boolean z);

    public abstract void o(sm8[] sm8VarArr, long j, long j2);

    public final int p(fp4 fp4Var, hm4 hm4Var, int i) {
        ipg ipgVar = this.g;
        ipgVar.getClass();
        int a = ipgVar.a(fp4Var, hm4Var, i);
        if (a == -4) {
            if (hm4Var.i(4)) {
                this.j = Long.MIN_VALUE;
                return this.k ? -4 : -3;
            }
            long j = hm4Var.j + this.i;
            hm4Var.j = j;
            this.j = Math.max(this.j, j);
            return a;
        }
        if (a == -5) {
            sm8 sm8Var = (sm8) fp4Var.c;
            sm8Var.getClass();
            long j2 = sm8Var.p;
            if (j2 != Long.MAX_VALUE) {
                pm8 a2 = sm8Var.a();
                a2.o = j2 + this.i;
                fp4Var.c = new sm8(a2);
            }
        }
        return a;
    }

    public abstract void q(long j, long j2);

    public final void r(sm8[] sm8VarArr, ipg ipgVar, long j, long j2) {
        qx9.t(!this.k);
        this.g = ipgVar;
        if (this.j == Long.MIN_VALUE) {
            this.j = j;
        }
        this.h = sm8VarArr;
        this.i = j2;
        o(sm8VarArr, j, j2);
    }

    public final void s() {
        qx9.t(this.f == 0);
        this.b.j();
        l();
    }

    public abstract int u(sm8 sm8Var);

    public int v() {
        return 0;
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    @Override // defpackage.ite
    public void handleMessage(int i, Object obj) {
    }

    public void j(boolean z, boolean z2) {
    }

    public void t(float f, float f2) {
    }
}
