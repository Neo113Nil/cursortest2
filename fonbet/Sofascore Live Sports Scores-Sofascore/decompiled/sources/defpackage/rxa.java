package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rxa {
    public final int a;
    public final boolean b;

    public rxa(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxa)) {
            return false;
        }
        rxa rxaVar = (rxa) obj;
        return this.a == rxaVar.a && this.b == rxaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SeasonUiModel(id=" + this.a + ", isAllTime=" + this.b + ")";
    }
}
