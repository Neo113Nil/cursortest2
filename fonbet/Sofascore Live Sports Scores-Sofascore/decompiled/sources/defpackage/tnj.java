package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tnj implements c71, Serializable {
    public final unj a;
    public final vmj b;

    public tnj(unj unjVar, vmj vmjVar) {
        this.a = unjVar;
        this.b = vmjVar;
    }

    @Override // defpackage.c71
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnj)) {
            return false;
        }
        tnj tnjVar = (tnj) obj;
        return this.a.equals(tnjVar.a) && this.b.equals(tnjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopStatsPerformanceItem(player=" + this.a + ", event=" + this.b + ")";
    }
}
