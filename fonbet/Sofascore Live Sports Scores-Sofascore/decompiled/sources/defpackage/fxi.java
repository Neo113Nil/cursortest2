package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fxi implements hxi {
    public final jmf a;

    public fxi(jmf jmfVar) {
        jmfVar.getClass();
        this.a = jmfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxi) && this.a == ((fxi) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RankingClickAction(category=" + this.a + ")";
    }
}
