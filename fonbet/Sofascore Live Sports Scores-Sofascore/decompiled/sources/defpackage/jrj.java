package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jrj {
    public final int a;
    public final String b;
    public final boolean c;
    public final float d;
    public final int e;

    public jrj(int i, String str, boolean z, float f, int i2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = f;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrj)) {
            return false;
        }
        jrj jrjVar = (jrj) obj;
        return this.a == jrjVar.a && Intrinsics.c(this.b, jrjVar.b) && this.c == jrjVar.c && Float.compare(this.d, jrjVar.d) == 0 && this.e == jrjVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + fc6.a(this.d, dmi.e(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TournamentGoatPlayerUiModel(playerId=", ", playerName=", this.b, ", isMyGoat=");
        t.append(this.c);
        t.append(", votePercentage=");
        t.append(this.d);
        t.append(", sortOrder=");
        return fc6.h(this.e, ")", t);
    }
}
