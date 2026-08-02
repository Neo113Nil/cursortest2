package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fxb implements ixb {
    public final r9k a;

    public fxb(r9k r9kVar) {
        this.a = r9kVar;
    }

    @Override // defpackage.ixb
    public final r9k a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxb) && this.a.equals(((fxb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Regular(descriptionLabel=" + this.a + ")";
    }
}
