package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ke9 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final le9 f;
    public final le9 g;

    public ke9(String str, int i, int i2, String str2, int i3, le9 le9Var, le9 le9Var2) {
        le9Var.getClass();
        le9Var2.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = le9Var;
        this.g = le9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke9)) {
            return false;
        }
        ke9 ke9Var = (ke9) obj;
        return this.a.equals(ke9Var.a) && this.b == ke9Var.b && this.c == ke9Var.c && this.d.equals(ke9Var.d) && this.e == ke9Var.e && Intrinsics.c(this.f, ke9Var.f) && Intrinsics.c(this.g, ke9Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + wv8.a(this.e, dmi.c(wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31)) * 31);
    }

    public final String toString() {
        StringBuilder q = mz1.q(this.b, "HockeyStarOfTheGameUiModel(playerName=", this.a, ", playerId=", ", teamId=");
        vxd.p(this.c, ", playerPosition=", this.d, ", starRank=", q);
        q.append(this.e);
        q.append(", statistic1=");
        q.append(this.f);
        q.append(", statistic2=");
        q.append(this.g);
        q.append(")");
        return q.toString();
    }
}
