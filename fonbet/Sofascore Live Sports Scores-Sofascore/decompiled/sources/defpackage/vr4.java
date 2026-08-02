package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vr4 {
    public final String a;
    public int b;
    public long c;
    public final scc d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ xr4 g;

    public vr4(xr4 xr4Var, String str, int i, scc sccVar) {
        this.g = xr4Var;
        this.a = str;
        this.b = i;
        this.c = sccVar == null ? -1L : sccVar.d;
        if (sccVar == null || !sccVar.b()) {
            return;
        }
        this.d = sccVar;
    }

    public final boolean a(qv qvVar) {
        scc sccVar = qvVar.d;
        mij mijVar = qvVar.b;
        if (sccVar == null) {
            return this.b != qvVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (sccVar.d > j) {
            return true;
        }
        scc sccVar2 = this.d;
        if (sccVar2 == null) {
            return false;
        }
        int i = sccVar2.b;
        int b = mijVar.b(sccVar.a);
        int b2 = mijVar.b(sccVar2.a);
        if (sccVar.d < sccVar2.d || b < b2) {
            return false;
        }
        if (b > b2) {
            return true;
        }
        if (!sccVar.b()) {
            int i2 = sccVar.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = sccVar.b;
        int i4 = sccVar.c;
        if (i3 <= i) {
            return i3 == i && i4 > sccVar2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(mij mijVar, mij mijVar2) {
        scc sccVar;
        int i = this.b;
        if (i < mijVar.o()) {
            xr4 xr4Var = this.g;
            kij kijVar = xr4Var.a;
            mijVar.n(i, kijVar);
            for (int i2 = kijVar.m; i2 <= kijVar.n; i2++) {
                int b = mijVar2.b(mijVar.l(i2));
                if (b != -1) {
                    i = mijVar2.f(b, xr4Var.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        return i != -1 && ((sccVar = this.d) == null || mijVar2.b(sccVar.a) != -1);
    }
}
