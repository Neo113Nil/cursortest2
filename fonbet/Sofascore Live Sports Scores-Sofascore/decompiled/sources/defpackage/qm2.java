package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qm2 extends tli implements Comparable {
    public long n;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qm2 qm2Var = (qm2) obj;
        if (i(4) != qm2Var.i(4)) {
            return i(4) ? 1 : -1;
        }
        long j = this.j - qm2Var.j;
        if (j == 0) {
            j = this.n - qm2Var.n;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
