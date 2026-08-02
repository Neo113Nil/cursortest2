package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ytf {
    public final boolean a;
    public final boolean b;

    public ytf(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytf)) {
            return false;
        }
        ytf ytfVar = (ytf) obj;
        return this.a == ytfVar.a && this.b == ytfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReferralState(showTooltip=" + this.a + ", isReferredUser=" + this.b + ")";
    }
}
