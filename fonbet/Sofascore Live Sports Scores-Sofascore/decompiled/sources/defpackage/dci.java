package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dci implements fci {
    public final Boolean a;
    public final long b;
    public final long c;
    public final CrowdsourcingContribution d;
    public final int e;

    public dci(Boolean bool, long j, long j2, CrowdsourcingContribution crowdsourcingContribution, int i) {
        this.a = bool;
        this.b = j;
        this.c = j2;
        this.d = crowdsourcingContribution;
        this.e = i;
    }

    public static dci a(dci dciVar, Boolean bool, long j, int i) {
        if ((i & 1) != 0) {
            bool = dciVar.a;
        }
        Boolean bool2 = bool;
        long j2 = dciVar.b;
        if ((i & 4) != 0) {
            j = dciVar.c;
        }
        return new dci(bool2, j2, j, dciVar.d, dciVar.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dci)) {
            return false;
        }
        dci dciVar = (dci) obj;
        return Intrinsics.c(this.a, dciVar.a) && this.b == dciVar.b && this.c == dciVar.c && Intrinsics.c(this.d, dciVar.d) && this.e == dciVar.e;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int c = ljg.c(ljg.c((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b), 31, this.c);
        CrowdsourcingContribution crowdsourcingContribution = this.d;
        return Integer.hashCode(this.e) + ((c + (crowdsourcingContribution != null ? crowdsourcingContribution.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Input(isTimeValid=");
        sb.append(this.a);
        sb.append(", eventStartTimestamp=");
        sb.append(this.b);
        fn0.t(this.c, ", selectedTimestamp=", ", peopleContributions=", sb);
        sb.append(this.d);
        sb.append(", eventId=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
