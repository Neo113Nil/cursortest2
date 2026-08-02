package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hkb extends ekb {

    @NotNull
    public static final gkb d = new gkb(null);

    public final boolean equals(Object obj) {
        if (!(obj instanceof hkb)) {
            return false;
        }
        if (isEmpty() && ((hkb) obj).isEmpty()) {
            return true;
        }
        hkb hkbVar = (hkb) obj;
        return this.a == hkbVar.a && this.b == hkbVar.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
