package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rm2 extends uli implements Comparable {
    public long o;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        rm2 rm2Var = (rm2) obj;
        if (i(4) != rm2Var.i(4)) {
            return i(4) ? 1 : -1;
        }
        long j = this.k - rm2Var.k;
        if (j == 0) {
            j = this.o - rm2Var.o;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
