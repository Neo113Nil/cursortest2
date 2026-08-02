package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class la7 implements pa7 {
    public final rn6 a;

    public la7(rn6 rn6Var) {
        this.a = rn6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la7) && this.a.equals(((la7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAgeRangeSelected(ageGroup=" + this.a + ")";
    }
}
