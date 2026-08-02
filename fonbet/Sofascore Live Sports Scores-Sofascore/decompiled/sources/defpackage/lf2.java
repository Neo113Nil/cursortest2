package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lf2 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public ao4 e;

    public lf2(int i, String str, ao4 ao4Var) {
        this.a = i;
        this.b = str;
        this.e = ao4Var;
    }

    public final long a(long j, long j2) {
        z1a.s(j >= 0);
        z1a.s(j2 >= 0);
        hhh b = b(j, j2);
        long j3 = b.c;
        if (!b.d) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = b.b + j3;
        if (j6 < j5) {
            for (hhh hhhVar : this.c.tailSet(b, false)) {
                long j7 = hhhVar.b;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + hhhVar.c);
                if (j6 >= j5) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final hhh b(long j, long j2) {
        long j3 = j2;
        hhh hhhVar = new hhh(this.b, j, -1L, C.TIME_UNSET, null);
        TreeSet treeSet = this.c;
        hhh hhhVar2 = (hhh) treeSet.floor(hhhVar);
        if (hhhVar2 != null && hhhVar2.b + hhhVar2.c > j) {
            return hhhVar2;
        }
        hhh hhhVar3 = (hhh) treeSet.ceiling(hhhVar);
        if (hhhVar3 != null) {
            long j4 = hhhVar3.b - j;
            j3 = j3 == -1 ? j4 : Math.min(j4, j3);
        }
        return new hhh(this.b, j, j3, C.TIME_UNSET, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            kf2 kf2Var = (kf2) arrayList.get(i);
            long j3 = kf2Var.a;
            long j4 = kf2Var.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lf2.class != obj.getClass()) {
            return false;
        }
        lf2 lf2Var = (lf2) obj;
        return this.a == lf2Var.a && this.b.equals(lf2Var.b) && this.c.equals(lf2Var.c) && this.e.equals(lf2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dmi.c(this.a * 31, 31, this.b);
    }
}
