package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k20 implements kze {
    public final int b;

    public k20(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k20.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((k20) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return wv8.j(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
