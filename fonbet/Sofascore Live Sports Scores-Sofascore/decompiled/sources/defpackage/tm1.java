package defpackage;

import com.sofascore.model.newNetwork.BaseballTopPerformerRole;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tm1 {
    public final int a;
    public final int b;
    public final String c;
    public final BaseballTopPerformerRole d;
    public final String e;
    public final gv9 f;

    public tm1(int i, int i2, String str, BaseballTopPerformerRole baseballTopPerformerRole, String str2, gv9 gv9Var) {
        str.getClass();
        gv9Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = baseballTopPerformerRole;
        this.e = str2;
        this.f = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm1)) {
            return false;
        }
        tm1 tm1Var = (tm1) obj;
        return this.a == tm1Var.a && this.b == tm1Var.b && Intrinsics.c(this.c, tm1Var.c) && this.d == tm1Var.d && Intrinsics.c(this.e, tm1Var.e) && Intrinsics.c(this.f, tm1Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31;
        String str = this.e;
        return this.f.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "BaseballTopPerformerUiModel(playerId=", ", teamId=", ", playerName=");
        s.append(this.c);
        s.append(", role=");
        s.append(this.d);
        s.append(", secondaryLabel=");
        s.append(this.e);
        s.append(", stats=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
