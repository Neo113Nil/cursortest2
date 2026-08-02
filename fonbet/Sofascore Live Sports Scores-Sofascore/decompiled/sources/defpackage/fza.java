package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fza {
    public final sza a;
    public final int b;
    public final ArrayList c;

    public fza(sza szaVar, int i, ArrayList arrayList) {
        this.a = szaVar;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fza)) {
            return false;
        }
        fza fzaVar = (fza) obj;
        return this.a == fzaVar.a && this.b == fzaVar.b && this.c.equals(fzaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LeagueRecapTopPerformanceState(selectedStat=" + this.a + ", lastXHours=" + this.b + ", performances=" + this.c + ")";
    }
}
