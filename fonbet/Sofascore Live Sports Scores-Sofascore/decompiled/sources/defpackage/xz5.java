package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xz5 implements zz5 {
    public final bnf a;

    public xz5(bnf bnfVar) {
        bnfVar.getClass();
        this.a = bnfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz5) && this.a == ((xz5) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectRatingBreakdown(ratingBreakdownComponent=" + this.a + ")";
    }
}
