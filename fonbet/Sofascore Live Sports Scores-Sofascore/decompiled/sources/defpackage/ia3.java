package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ia3 {
    public final int a;
    public final int b;
    public final boolean c;

    public ia3(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia3)) {
            return false;
        }
        ia3 ia3Var = (ia3) obj;
        return this.a == ia3Var.a && this.b == ia3Var.b && this.c == ia3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return wt3.p(lnb.s(this.a, this.b, "PinnedActionUndoEvent(uniqueTournamentId=", ", orderIndex=", ", isAdded="), this.c, ")");
    }
}
