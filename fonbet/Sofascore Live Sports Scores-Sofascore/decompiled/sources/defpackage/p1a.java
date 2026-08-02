package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p1a {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof p1a) {
            return this.a == ((p1a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lnb.n("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.a, ')');
    }
}
