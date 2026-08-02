package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wmj implements fnj {
    public final pnj a;

    public wmj(pnj pnjVar) {
        this.a = pnjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wmj) && this.a.equals(((wmj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdditionalFilterChanged(filter=" + this.a + ")";
    }
}
