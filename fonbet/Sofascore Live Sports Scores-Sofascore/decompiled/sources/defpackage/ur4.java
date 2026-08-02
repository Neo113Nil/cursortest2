package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ur4 {
    public final String a;
    public int b;
    public long c;
    public final rcc d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ wr4 g;

    public ur4(wr4 wr4Var, String str, int i, rcc rccVar) {
        this.g = wr4Var;
        this.a = str;
        this.b = i;
        this.c = rccVar == null ? -1L : rccVar.d;
        if (rccVar == null || !rccVar.a()) {
            return;
        }
        this.d = rccVar;
    }

    public final boolean a(pv pvVar) {
        rcc rccVar = pvVar.d;
        lij lijVar = pvVar.b;
        if (rccVar == null) {
            return this.b != pvVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (rccVar.d > j) {
            return true;
        }
        rcc rccVar2 = this.d;
        if (rccVar2 == null) {
            return false;
        }
        int i = rccVar2.b;
        int b = lijVar.b(rccVar.a);
        int b2 = lijVar.b(rccVar2.a);
        if (rccVar.d < rccVar2.d || b < b2) {
            return false;
        }
        if (b > b2) {
            return true;
        }
        if (!rccVar.a()) {
            int i2 = rccVar.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = rccVar.b;
        int i4 = rccVar.c;
        if (i3 <= i) {
            return i3 == i && i4 > rccVar2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(lij lijVar, lij lijVar2) {
        rcc rccVar;
        int i = this.b;
        if (i < lijVar.o()) {
            wr4 wr4Var = this.g;
            jij jijVar = wr4Var.a;
            lijVar.n(i, jijVar);
            for (int i2 = jijVar.m; i2 <= jijVar.n; i2++) {
                int b = lijVar2.b(lijVar.l(i2));
                if (b != -1) {
                    i = lijVar2.f(b, wr4Var.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        return i != -1 && ((rccVar = this.d) == null || lijVar2.b(rccVar.a) != -1);
    }
}
