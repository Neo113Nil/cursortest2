package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v7i implements z7i {
    public final long a;
    public final boolean b;

    public v7i(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7i)) {
            return false;
        }
        v7i v7iVar = (v7i) obj;
        return this.a == v7iVar.a && this.b == v7iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LastUpdated(timestamp=" + this.a + ", isStageLive=" + this.b + ")";
    }
}
