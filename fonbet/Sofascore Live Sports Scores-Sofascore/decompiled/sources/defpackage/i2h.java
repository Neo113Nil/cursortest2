package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i2h {
    public final CrowdsourcingIncidentType a;
    public final boolean b;
    public final boolean c;

    public i2h(CrowdsourcingIncidentType crowdsourcingIncidentType, boolean z, boolean z2) {
        crowdsourcingIncidentType.getClass();
        this.a = crowdsourcingIncidentType;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2h)) {
            return false;
        }
        i2h i2hVar = (i2h) obj;
        return Intrinsics.c(this.a, i2hVar.a) && this.b == i2hVar.b && this.c == i2hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectIncidentTypeData(incidentType=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return wt3.p(sb, this.c, ")");
    }
}
