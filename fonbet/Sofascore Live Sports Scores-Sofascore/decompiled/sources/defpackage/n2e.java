package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n2e {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final double g;

    public n2e(int i, String str, int i2, String str2, int i3, String str3, double d) {
        str2.getClass();
        str3.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = str3;
        this.g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2e)) {
            return false;
        }
        n2e n2eVar = (n2e) obj;
        return this.a == n2eVar.a && this.b.equals(n2eVar.b) && this.c == n2eVar.c && Intrinsics.c(this.d, n2eVar.d) && this.e == n2eVar.e && Intrinsics.c(this.f, n2eVar.f) && Double.compare(this.g, n2eVar.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + dmi.c(wv8.a(this.e, dmi.c(wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "POTSPlayerAwardUiModel(uniqueTournamentId=", ", uniqueTournamentName=", this.b, ", teamId=");
        vxd.p(this.c, ", teamName=", this.d, ", seasonId=", t);
        vxd.p(this.e, ", seasonName=", this.f, ", rating=", t);
        t.append(this.g);
        t.append(")");
        return t.toString();
    }
}
