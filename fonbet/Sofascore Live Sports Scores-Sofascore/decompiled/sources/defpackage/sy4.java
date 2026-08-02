package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sy4 implements oz4 {
    public final tz4 a;
    public final boolean b;

    public sy4(tz4 tz4Var, boolean z) {
        this.a = tz4Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy4)) {
            return false;
        }
        sy4 sy4Var = (sy4) obj;
        return this.a == sy4Var.a && this.b == sy4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChangeDisplaySetting(setting=" + this.a + ", flag=" + this.b + ")";
    }
}
