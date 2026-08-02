package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p6i implements m6i {
    public final Long a;
    public final boolean b;

    public p6i(Long l, boolean z) {
        this.a = l;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6i)) {
            return false;
        }
        p6i p6iVar = (p6i) obj;
        return this.a.equals(p6iVar.a) && this.b == p6iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatesRow(timestamp=" + this.a + ", isLive=" + this.b + ")";
    }
}
