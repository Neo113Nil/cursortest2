package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bb8 {
    public final int a;
    public final fb8 b;
    public final long c;
    public final int d;
    public final int e;

    public bb8(int i, fb8 fb8Var, long j, int i2, int i3) {
        this.a = i;
        this.b = fb8Var;
        this.c = j;
        this.d = i2;
        this.e = i3;
    }

    public final o02 a(ab8 ab8Var, boolean z, int i, int i2, int i3, int i4) {
        if (!ab8Var.b) {
            return null;
        }
        this.b.getClass();
        db8 db8Var = db8.a;
        return null;
    }

    public final ab8 b(boolean z, int i, long j, k6a k6aVar, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (k6aVar == null) {
            return new ab8(true, true);
        }
        long j2 = k6aVar.a;
        this.b.getClass();
        db8 db8Var = db8.a;
        db8 db8Var2 = db8.a;
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new ab8(true, true);
        }
        if (i != 0 && (i >= this.a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new ab8(true, true) : new ab8(true, b(z, 0, k6a.a(an3.h(this.c), (((int) (j & 4294967295L)) - this.e) - i4), new k6a(k6a.a(((int) (j2 >> 32)) - this.d, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).b);
        }
        Math.max(i4, (int) (j2 & 4294967295L));
        return new ab8(false, false);
    }
}
