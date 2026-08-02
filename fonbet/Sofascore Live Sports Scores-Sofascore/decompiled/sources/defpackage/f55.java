package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f55 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof f55) {
            return this.a == ((f55) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Picker" : i == 1 ? "Input" : "Unknown";
    }
}
