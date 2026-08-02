package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r56 implements t56 {
    public final fmj a;
    public final fmj b;
    public final int c;
    public boolean d = false;
    public boolean e;

    public r56(fmj fmjVar, fmj fmjVar2, int i) {
        this.a = fmjVar;
        this.b = fmjVar2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r56)) {
            return false;
        }
        r56 r56Var = (r56) obj;
        return Intrinsics.c(this.a, r56Var.a) && Intrinsics.c(this.b, r56Var.b) && this.c == r56Var.c && this.d == r56Var.d;
    }

    public final int hashCode() {
        fmj fmjVar = this.a;
        int hashCode = (fmjVar == null ? 0 : fmjVar.hashCode()) * 31;
        fmj fmjVar2 = this.b;
        return Boolean.hashCode(this.d) + wv8.a(this.c, (hashCode + (fmjVar2 != null ? fmjVar2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "TopPlayersItem(firstTeamTopPlayer=" + this.a + ", secondTeamTopPlayer=" + this.b + ", positionInList=" + this.c + ", roundedBottom=" + this.d + ")";
    }
}
