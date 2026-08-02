package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gli {
    public final eli a;
    public final boolean b;

    public gli(eli eliVar, boolean z) {
        eliVar.getClass();
        this.a = eliVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gli)) {
            return false;
        }
        gli gliVar = (gli) obj;
        return this.a == gliVar.a && this.b == gliVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubscriptionTypeWrapper(type=" + this.a + ", canManage=" + this.b + ")";
    }
}
