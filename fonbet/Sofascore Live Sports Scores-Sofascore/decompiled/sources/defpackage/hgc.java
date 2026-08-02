package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hgc implements p74 {
    public static final fh3 b = new fh3(new l92(new m72(14), x5d.a), new l92(new m72(15), h4g.a));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.p74
    public final boolean b(q74 q74Var, long j) {
        long j2 = q74Var.b;
        z1a.s(j2 != C.TIME_UNSET);
        z1a.s(q74Var.c != C.TIME_UNSET);
        boolean z = j2 <= j && j < q74Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((q74) arrayList.get(size)).b) {
                arrayList.add(size + 1, q74Var);
                return z;
            }
        }
        arrayList.add(0, q74Var);
        return z;
    }

    @Override // defpackage.p74
    public final hv9 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((q74) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    q74 q74Var = (q74) arrayList.get(i);
                    if (j >= q74Var.b && j < q74Var.d) {
                        arrayList2.add(q74Var);
                    }
                    if (j < q74Var.b) {
                        break;
                    }
                }
                vvf D = hv9.D(b, arrayList2);
                zu9 s = hv9.s();
                for (int i2 = 0; i2 < D.d; i2++) {
                    s.e(((q74) D.get(i2)).a);
                }
                return s.g();
            }
        }
        av9 av9Var = hv9.b;
        return vvf.e;
    }

    @Override // defpackage.p74
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.p74
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j < ((q74) arrayList.get(0)).b) {
            return C.TIME_UNSET;
        }
        long j2 = ((q74) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((q74) arrayList.get(i)).b;
            long j4 = ((q74) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    @Override // defpackage.p74
    public final long e(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((q74) arrayList.get(i)).b;
            long j4 = ((q74) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == C.TIME_UNSET ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == C.TIME_UNSET ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != C.TIME_UNSET) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.p74
    public final void f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((q74) arrayList.get(i)).b;
            if (j > j2 && j > ((q74) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
