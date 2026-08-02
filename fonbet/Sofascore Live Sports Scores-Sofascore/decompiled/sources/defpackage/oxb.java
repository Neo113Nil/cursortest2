package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oxb implements qxb {
    public final m9k a;

    public oxb(m9k m9kVar) {
        this.a = m9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxb) && this.a.equals(((oxb) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Stopped(descriptionLabel=" + this.a + ")";
    }
}
