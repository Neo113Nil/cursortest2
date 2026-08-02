package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class svb {
    public final Boolean a;
    public final scj b;
    public final scj c;
    public final long d;
    public final long e;
    public final int f;

    public svb(Boolean bool, scj scjVar, scj scjVar2, long j, long j2, int i) {
        this.a = bool;
        this.b = scjVar;
        this.c = scjVar2;
        this.d = j;
        this.e = j2;
        this.f = i;
    }

    public static svb a(svb svbVar, Boolean bool, long j, int i) {
        if ((i & 1) != 0) {
            bool = svbVar.a;
        }
        Boolean bool2 = bool;
        scj scjVar = svbVar.b;
        scj scjVar2 = svbVar.c;
        long j2 = svbVar.d;
        if ((i & 16) != 0) {
            j = svbVar.e;
        }
        return new svb(bool2, scjVar, scjVar2, j2, j, svbVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof svb) {
            svb svbVar = (svb) obj;
            if (Intrinsics.c(this.a, svbVar.a) && this.b == svbVar.b && this.c == svbVar.c && this.d == svbVar.d && this.e == svbVar.e && this.f == svbVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return Integer.hashCode(this.f) + ljg.c(ljg.c((this.c.hashCode() + ((this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchEndedSuggestUiModel(hasMatchEnded=");
        sb.append(this.a);
        sb.append(", selectedHomeScore=");
        sb.append(this.b);
        sb.append(", selectedAwayScore=");
        sb.append(this.c);
        sb.append(", eventStartTimestamp=");
        sb.append(this.d);
        fn0.t(this.e, ", selectedTimestamp=", ", eventId=", sb);
        return fc6.h(this.f, ")", sb);
    }
}
