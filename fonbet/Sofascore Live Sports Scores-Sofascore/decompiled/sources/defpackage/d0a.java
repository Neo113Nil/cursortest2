package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d0a implements g0a {
    public final gv9 a;
    public final CrowdsourcingContribution b;

    public d0a(gv9 gv9Var, CrowdsourcingContribution crowdsourcingContribution) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = crowdsourcingContribution;
    }

    @Override // defpackage.g0a
    public final gv9 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0a)) {
            return false;
        }
        d0a d0aVar = (d0a) obj;
        return Intrinsics.c(this.a, d0aVar.a) && Intrinsics.c(this.b, d0aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CrowdsourcingContribution crowdsourcingContribution = this.b;
        return hashCode + (crowdsourcingContribution == null ? 0 : crowdsourcingContribution.hashCode());
    }

    public final String toString() {
        return "LiveInput(submittedIncidents=" + this.a + ", peopleContributions=" + this.b + ")";
    }
}
