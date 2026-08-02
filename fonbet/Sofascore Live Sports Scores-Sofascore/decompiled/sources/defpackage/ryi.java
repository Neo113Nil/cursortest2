package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ryi {
    public final yt a;
    public final lre b;
    public final oei c;

    public ryi(yt ytVar, lre lreVar, oei oeiVar) {
        ytVar.getClass();
        lreVar.getClass();
        this.a = ytVar;
        this.b = lreVar;
        this.c = oeiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryi)) {
            return false;
        }
        ryi ryiVar = (ryi) obj;
        return Intrinsics.c(this.a, ryiVar.a) && this.b == ryiVar.b && this.c == ryiVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TeamPlayerStatsFilter(filterPosition=" + this.a + ", filterAppearanceMode=" + this.b + ", type=" + this.c + ")";
    }
}
