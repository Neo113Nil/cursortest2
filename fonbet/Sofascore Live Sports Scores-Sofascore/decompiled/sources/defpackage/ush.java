package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ush {
    public final boolean a;
    public final ehk b;

    public ush(boolean z, ehk ehkVar) {
        this.a = z;
        this.b = ehkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ush)) {
            return false;
        }
        ush ushVar = (ush) obj;
        return this.a == ushVar.a && this.b == ushVar.b;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        ehk ehkVar = this.b;
        return hashCode + (ehkVar == null ? 0 : ehkVar.hashCode());
    }

    public final String toString() {
        return "SofaSeasonBannerState(isEnabled=" + this.a + ", userRole=" + this.b + ")";
    }
}
