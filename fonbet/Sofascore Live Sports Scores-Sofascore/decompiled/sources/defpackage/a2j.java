package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a2j {
    public final Integer a;
    public final String b;
    public final av3 c;

    public a2j(Integer num, String str, av3 av3Var) {
        this.a = num;
        this.b = str;
        this.c = av3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2j)) {
            return false;
        }
        a2j a2jVar = (a2j) obj;
        return Intrinsics.c(this.a, a2jVar.a) && Intrinsics.c(this.b, a2jVar.b) && Intrinsics.c(this.c, a2jVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        av3 av3Var = this.c;
        return hashCode2 + (av3Var != null ? av3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = wv8.m("TeamSquadManagerUiModel(managerId=", this.a, ", managerName=", this.b, ", countryBadge=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
