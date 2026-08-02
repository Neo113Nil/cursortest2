package defpackage;

import com.sofascore.model.mvvm.model.Season;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c73 {
    public final qo2 a;
    public final Season b;
    public final d73 c;

    public /* synthetic */ c73(qo2 qo2Var, int i) {
        this((i & 1) != 0 ? null : qo2Var, null, null);
    }

    public static c73 a(c73 c73Var, Season season, d73 d73Var, int i) {
        qo2 qo2Var = c73Var.a;
        if ((i & 2) != 0) {
            season = c73Var.b;
        }
        c73Var.getClass();
        return new c73(qo2Var, season, d73Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c73)) {
            return false;
        }
        c73 c73Var = (c73) obj;
        return Intrinsics.c(this.a, c73Var.a) && Intrinsics.c(this.b, c73Var.b) && Intrinsics.c(this.c, c73Var.c);
    }

    public final int hashCode() {
        qo2 qo2Var = this.a;
        int hashCode = (qo2Var == null ? 0 : qo2Var.hashCode()) * 31;
        Season season = this.b;
        int hashCode2 = (hashCode + (season == null ? 0 : season.hashCode())) * 31;
        d73 d73Var = this.c;
        return hashCode2 + (d73Var != null ? d73Var.hashCode() : 0);
    }

    public final String toString() {
        return "ComparisonEntitySlot(entityInfo=" + this.a + ", season=" + this.b + ", statistics=" + this.c + ")";
    }

    public c73(qo2 qo2Var, Season season, d73 d73Var) {
        this.a = qo2Var;
        this.b = season;
        this.c = d73Var;
    }
}
