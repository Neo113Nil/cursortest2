package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ejf {
    public final bjf a;
    public final boolean b;

    public ejf(bjf bjfVar, boolean z) {
        bjfVar.getClass();
        this.a = bjfVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejf)) {
            return false;
        }
        ejf ejfVar = (ejf) obj;
        return this.a == ejfVar.a && this.b == ejfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QuickLinkItemWrapper(item=" + this.a + ", isEditMode=" + this.b + ")";
    }
}
