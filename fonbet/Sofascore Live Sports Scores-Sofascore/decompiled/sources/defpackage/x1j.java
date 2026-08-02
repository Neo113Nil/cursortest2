package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x1j implements z1j {
    public final wv9 a;

    public x1j(wv9 wv9Var) {
        this.a = wv9Var;
    }

    @Override // defpackage.z1j
    public final wv9 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1j) && this.a.equals(((x1j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StaffSectionHeader(visibleForChips=" + this.a + ")";
    }
}
