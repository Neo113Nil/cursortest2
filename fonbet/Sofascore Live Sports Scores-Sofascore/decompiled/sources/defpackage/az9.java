package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class az9 extends iz9 {
    public final CrowdsourcingContribution c;
    public final Integer d;

    public az9(CrowdsourcingContribution crowdsourcingContribution, Integer num) {
        this.c = crowdsourcingContribution;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az9)) {
            return false;
        }
        az9 az9Var = (az9) obj;
        return Intrinsics.c(this.c, az9Var.c) && Intrinsics.c(this.d, az9Var.d);
    }

    public final int hashCode() {
        CrowdsourcingContribution crowdsourcingContribution = this.c;
        int hashCode = (crowdsourcingContribution == null ? 0 : crowdsourcingContribution.hashCode()) * 31;
        Integer num = this.d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CrowdsourcingFooter(contribution=" + this.c + ", noteRes=" + this.d + ")";
    }
}
