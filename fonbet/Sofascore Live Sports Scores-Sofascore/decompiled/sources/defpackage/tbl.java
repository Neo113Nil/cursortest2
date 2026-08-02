package defpackage;

import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tbl {
    public final UUID a;
    public final sbl b;
    public final HashSet c;
    public final md4 d;
    public final md4 e;
    public final int f;
    public final int g;
    public final zm3 h;
    public final long i;
    public final rbl j;
    public final long k;
    public final int l;

    public tbl(UUID uuid, sbl sblVar, HashSet hashSet, md4 md4Var, md4 md4Var2, int i, int i2, zm3 zm3Var, long j, rbl rblVar, long j2, int i3) {
        uuid.getClass();
        md4Var.getClass();
        md4Var2.getClass();
        this.a = uuid;
        this.b = sblVar;
        this.c = hashSet;
        this.d = md4Var;
        this.e = md4Var2;
        this.f = i;
        this.g = i2;
        this.h = zm3Var;
        this.i = j;
        this.j = rblVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !tbl.class.equals(obj.getClass())) {
            return false;
        }
        tbl tblVar = (tbl) obj;
        if (this.f == tblVar.f && this.g == tblVar.g && Intrinsics.c(this.a, tblVar.a) && this.b == tblVar.b && Intrinsics.c(this.d, tblVar.d) && this.h.equals(tblVar.h) && this.i == tblVar.i && Intrinsics.c(this.j, tblVar.j) && this.k == tblVar.k && this.l == tblVar.l && this.c.equals(tblVar.c)) {
            return Intrinsics.c(this.e, tblVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int c = ljg.c((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31, this.i);
        rbl rblVar = this.j;
        return Integer.hashCode(this.l) + ljg.c((c + (rblVar != null ? rblVar.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
