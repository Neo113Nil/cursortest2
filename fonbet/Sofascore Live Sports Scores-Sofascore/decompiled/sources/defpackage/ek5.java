package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ek5 {
    public static final ek5 b = new ek5(0);
    public static final ek5 c = new ek5(1);
    public final int a;

    public ek5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ek5) {
            return this.a == ((ek5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        int i = this.a;
        return i != 0 ? i != 1 ? ljg.j(i, "Unknown value: ") : "JUMP_CUT" : "DEFAULT";
    }
}
