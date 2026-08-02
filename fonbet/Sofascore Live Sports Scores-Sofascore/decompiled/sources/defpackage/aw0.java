package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class aw0 implements a0h {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public aw0(long j, long j2) {
        this.a = 2;
        this.b = j;
        e0h e0hVar = j2 == 0 ? e0h.c : new e0h(0L, j2);
        this.c = new yzg(e0hVar, e0hVar);
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((g78) this.c).c();
            default:
                return this.b;
        }
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                cw0 cw0Var = (cw0) obj;
                yzg b = cw0Var.g[0].b(j);
                while (true) {
                    pu2[] pu2VarArr = cw0Var.g;
                    if (i2 >= pu2VarArr.length) {
                        return b;
                    }
                    yzg b2 = pu2VarArr[i2].b(j);
                    if (b2.a.b < b.a.b) {
                        b = b2;
                    }
                    i2++;
                }
            case 1:
                g78 g78Var = (g78) obj;
                qx9.u((f78) g78Var.l);
                f78 f78Var = (f78) g78Var.l;
                long[] jArr = f78Var.a;
                long[] jArr2 = f78Var.b;
                int e = lik.e(jArr, lik.i((g78Var.f * j) / 1000000, 0L, g78Var.k - 1), false);
                long j2 = e == -1 ? 0L : jArr[e];
                long j3 = e != -1 ? jArr2[e] : 0L;
                int i3 = g78Var.f;
                long j4 = (j2 * 1000000) / i3;
                long j5 = this.b;
                e0h e0hVar = new e0h(j4, j3 + j5);
                if (j4 == j || e == jArr.length - 1) {
                    return new yzg(e0hVar, e0hVar);
                }
                int i4 = e + 1;
                return new yzg(e0hVar, new e0h((jArr[i4] * 1000000) / i3, j5 + jArr2[i4]));
            default:
                return (yzg) obj;
        }
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aw0(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ aw0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
