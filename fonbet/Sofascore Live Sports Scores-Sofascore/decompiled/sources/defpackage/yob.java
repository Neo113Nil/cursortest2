package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yob implements apb {
    public final do7 a;

    public yob(do7 do7Var) {
        this.a = do7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yob) && this.a.equals(((yob) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnUserCompetitionClick(userCompetition=" + this.a + ")";
    }
}
