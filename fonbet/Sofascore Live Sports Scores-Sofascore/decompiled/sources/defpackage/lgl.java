package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lgl implements eil {
    public final sfl a;

    public lgl(sfl sflVar) {
        this.a = sflVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgl) && this.a == ((lgl) obj).a;
    }

    public final int hashCode() {
        sfl sflVar = this.a;
        if (sflVar == null) {
            return 0;
        }
        return sflVar.hashCode();
    }

    public final String toString() {
        return "ChangeMyTeamFilter(filter=" + this.a + ")";
    }
}
