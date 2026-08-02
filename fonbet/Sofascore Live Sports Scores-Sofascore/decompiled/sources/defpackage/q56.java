package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q56 implements t56 {
    public final String a;
    public final boolean b;

    public q56(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q56)) {
            return false;
        }
        q56 q56Var = (q56) obj;
        return this.a.equals(q56Var.a) && this.b == q56Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopPlayersExpandableSectionItem(sectionName=" + this.a + ", isExpanded=" + this.b + ")";
    }
}
