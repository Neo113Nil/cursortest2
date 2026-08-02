package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p44 {
    public final yq3 a;
    public final ArrayList b;
    public final int c;
    public final CrowdsourcingIncidentType.Card d;
    public final int e;

    public p44(yq3 yq3Var, ArrayList arrayList, int i, CrowdsourcingIncidentType.Card card, int i2) {
        this.a = yq3Var;
        this.b = arrayList;
        this.c = i;
        this.d = card;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p44)) {
            return false;
        }
        p44 p44Var = (p44) obj;
        return this.a.equals(p44Var.a) && this.b.equals(p44Var.b) && this.c == p44Var.c && this.d == p44Var.d && this.e == p44Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + wv8.a(this.c, vxd.d(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTimeConstraintContext(existingIncidentData=");
        sb.append(this.a);
        sb.append(", fullTimeOptions=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", selectedType=");
        sb.append(this.d);
        sb.append(", boundaryIndex=");
        return fc6.h(this.e, ")", sb);
    }
}
