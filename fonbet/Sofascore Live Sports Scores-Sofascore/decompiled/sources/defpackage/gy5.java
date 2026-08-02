package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gy5 implements Serializable {
    public final boolean a;
    public final CrowdsourcingContribution b;
    public final Integer c;

    public gy5(boolean z, CrowdsourcingContribution crowdsourcingContribution, Integer num) {
        this.a = z;
        this.b = crowdsourcingContribution;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy5)) {
            return false;
        }
        gy5 gy5Var = (gy5) obj;
        return this.a == gy5Var.a && Intrinsics.c(this.b, gy5Var.b) && Intrinsics.c(this.c, gy5Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        CrowdsourcingContribution crowdsourcingContribution = this.b;
        int hashCode2 = (hashCode + (crowdsourcingContribution == null ? 0 : crowdsourcingContribution.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrowdsourcingWrapper(isBannerDisplayed=");
        sb.append(this.a);
        sb.append(", peopleContributions=");
        sb.append(this.b);
        sb.append(", note=");
        return vxd.n(sb, this.c, ")");
    }
}
