package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rue {
    public float a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rue)) {
            return false;
        }
        rue rueVar = (rue) obj;
        return Float.compare(this.a, rueVar.a) == 0 && Float.compare(this.b, rueVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectorState(x=" + this.a + ", y=" + this.b + ")";
    }
}
