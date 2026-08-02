package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gxb implements ixb {
    public final q9k a;

    public gxb(q9k q9kVar) {
        this.a = q9kVar;
    }

    @Override // defpackage.ixb
    public final r9k a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxb) && this.a.equals(((gxb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Retired(descriptionLabel=" + this.a + ")";
    }
}
