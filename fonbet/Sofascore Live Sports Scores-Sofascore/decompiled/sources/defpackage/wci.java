package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wci {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final zdl g;

    public wci(int i, String str, int i2, String str2, String str3, String str4, zdl zdlVar) {
        w1l.y(str, str2, str3, str4);
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = zdlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wci)) {
            return false;
        }
        wci wciVar = (wci) obj;
        return this.a == wciVar.a && Intrinsics.c(this.b, wciVar.b) && this.c == wciVar.c && Intrinsics.c(this.d, wciVar.d) && Intrinsics.c(this.e, wciVar.e) && Intrinsics.c(this.f, wciVar.f) && this.g.equals(wciVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dmi.c(dmi.c(dmi.c(wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "StatLeaderUiModel(playerId=", ", playerName=", this.b, ", playerTeamId=");
        vxd.p(this.c, ", playerStatValue=", this.d, ", playerDescription=", t);
        bf3.v(t, this.e, ", categoryName=", this.f, ", color=");
        t.append(this.g);
        t.append(")");
        return t.toString();
    }
}
