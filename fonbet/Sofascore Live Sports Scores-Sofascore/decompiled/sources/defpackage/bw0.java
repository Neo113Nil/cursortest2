package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class bw0 implements b0h {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public bw0(long j, long j2) {
        this.a = 2;
        this.b = j;
        f0h f0hVar = j2 == 0 ? f0h.c : new f0h(0L, j2);
        this.c = new zzg(f0hVar, f0hVar);
    }

    @Override // defpackage.b0h
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

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                dw0 dw0Var = (dw0) obj;
                zzg b = dw0Var.i[0].b(j);
                while (true) {
                    qu2[] qu2VarArr = dw0Var.i;
                    if (i2 >= qu2VarArr.length) {
                        return b;
                    }
                    zzg b2 = qu2VarArr[i2].b(j);
                    if (b2.a.b < b.a.b) {
                        b = b2;
                    }
                    i2++;
                }
            case 1:
                g78 g78Var = (g78) obj;
                ((f78) g78Var.l).getClass();
                f78 f78Var = (f78) g78Var.l;
                long[] jArr = f78Var.a;
                long[] jArr2 = f78Var.b;
                int f = nik.f(jArr, nik.k((g78Var.f * j) / 1000000, 0L, g78Var.k - 1), false);
                long j2 = f == -1 ? 0L : jArr[f];
                long j3 = f != -1 ? jArr2[f] : 0L;
                int i3 = g78Var.f;
                long j4 = (j2 * 1000000) / i3;
                long j5 = this.b;
                f0h f0hVar = new f0h(j4, j3 + j5);
                if (j4 == j || f == jArr.length - 1) {
                    return new zzg(f0hVar, f0hVar);
                }
                int i4 = f + 1;
                return new zzg(f0hVar, new f0h((jArr[i4] * 1000000) / i3, j5 + jArr2[i4]));
            default:
                return (zzg) obj;
        }
    }

    @Override // defpackage.b0h
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
    public bw0(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ bw0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
