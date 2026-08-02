package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class unj {
    public final int a;
    public final String b;
    public final String c;
    public final Gender d;
    public final umj e;
    public final znj f;
    public final boolean g;
    public final gv9 h;

    public unj(int i, String str, String str2, Gender gender, umj umjVar, znj znjVar, boolean z, gv9 gv9Var) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = gender;
        this.e = umjVar;
        this.f = znjVar;
        this.g = z;
        this.h = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unj)) {
            return false;
        }
        unj unjVar = (unj) obj;
        return this.a == unjVar.a && Intrinsics.c(this.b, unjVar.b) && Intrinsics.c(this.c, unjVar.c) && this.d == unjVar.d && Intrinsics.c(this.e, unjVar.e) && Intrinsics.c(this.f, unjVar.f) && this.g == unjVar.g && Intrinsics.c(this.h, unjVar.h);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Gender gender = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (gender == null ? 0 : gender.hashCode())) * 31)) * 31;
        znj znjVar = this.f;
        int e = dmi.e((hashCode2 + (znjVar == null ? 0 : znjVar.hashCode())) * 31, 31, this.g);
        gv9 gv9Var = this.h;
        return e + (gv9Var != null ? gv9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TopStatsPlayerData(id=", ", translatedName=", this.b, ", position=");
        t.append(this.c);
        t.append(", gender=");
        t.append(this.d);
        t.append(", statisticItem=");
        t.append(this.e);
        t.append(", team=");
        t.append(this.f);
        t.append(", playedEnough=");
        t.append(this.g);
        t.append(", teamIds=");
        t.append(this.h);
        t.append(")");
        return t.toString();
    }
}
