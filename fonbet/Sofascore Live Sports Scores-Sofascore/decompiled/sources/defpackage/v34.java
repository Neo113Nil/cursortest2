package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v34 extends w34 {
    public final int d;
    public final int e;
    public final s54 f;
    public final s54 g;
    public final s54 h;
    public final EventSuggest.IncidentSuggest.GoalSuggest i;
    public final boolean j;
    public final boolean k;

    public v34(int i, int i2, s54 s54Var, s54 s54Var2, s54 s54Var3, EventSuggest.IncidentSuggest.GoalSuggest goalSuggest, boolean z, boolean z2) {
        super(z2, goalSuggest, z);
        this.d = i;
        this.e = i2;
        this.f = s54Var;
        this.g = s54Var2;
        this.h = s54Var3;
        this.i = goalSuggest;
        this.j = z;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v34)) {
            return false;
        }
        v34 v34Var = (v34) obj;
        return this.d == v34Var.d && this.e == v34Var.e && Intrinsics.c(this.f, v34Var.f) && Intrinsics.c(this.g, v34Var.g) && Intrinsics.c(this.h, v34Var.h) && Intrinsics.c(this.i, v34Var.i) && this.j == v34Var.j && this.k == v34Var.k;
    }

    public final int hashCode() {
        int a = wv8.a(this.e, Integer.hashCode(this.d) * 31, 31);
        s54 s54Var = this.f;
        int hashCode = (a + (s54Var == null ? 0 : s54Var.hashCode())) * 31;
        s54 s54Var2 = this.g;
        int hashCode2 = (hashCode + (s54Var2 == null ? 0 : s54Var2.hashCode())) * 31;
        s54 s54Var3 = this.h;
        int hashCode3 = (hashCode2 + (s54Var3 == null ? 0 : s54Var3.hashCode())) * 31;
        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = this.i;
        return Boolean.hashCode(this.k) + dmi.e((hashCode3 + (goalSuggest != null ? goalSuggest.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.d, this.e, "GoalIncidentData(homeScore=", ", awayScore=", ", bottomTimeConstraint=");
        s.append(this.f);
        s.append(", topTimeConstraint=");
        s.append(this.g);
        s.append(", postMatchLastGoalTime=");
        s.append(this.h);
        s.append(", selectedGoal=");
        s.append(this.i);
        s.append(", canDeleteGoal=");
        return w1l.i(", isPostMatch=", ")", s, this.j, this.k);
    }
}
