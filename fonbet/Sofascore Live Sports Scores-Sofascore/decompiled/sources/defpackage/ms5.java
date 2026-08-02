package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ms5 implements os5 {
    public final im a;
    public final em b;

    public ms5(im imVar, em emVar) {
        this.a = imVar;
        this.b = emVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms5)) {
            return false;
        }
        ms5 ms5Var = (ms5) obj;
        return this.a.equals(ms5Var.a) && this.b.equals(ms5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NoSubscription(priceWrapper=" + this.a + ", aiInsightsLockedScreenUiState=" + this.b + ")";
    }
}
