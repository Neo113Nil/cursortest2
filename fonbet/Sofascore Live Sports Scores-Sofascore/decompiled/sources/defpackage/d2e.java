package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d2e {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public d2e(int i, String str, String str2, int i2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2e)) {
            return false;
        }
        d2e d2eVar = (d2e) obj;
        return this.a == d2eVar.a && Intrinsics.c(this.b, d2eVar.b) && Intrinsics.c(this.c, d2eVar.c) && this.d == d2eVar.d;
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.d) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "POTSMostAwardsPlayerUiModel(playerId=", ", playerName=", this.b, ", playerShortName=");
        t.append(this.c);
        t.append(", numberOfAwards=");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
