package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class np2 extends kp2 {

    @NotNull
    public static final mp2 d = new mp2(null);

    static {
        new np2((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof np2)) {
            return false;
        }
        if (isEmpty() && ((np2) obj).isEmpty()) {
            return true;
        }
        np2 np2Var = (np2) obj;
        return this.a == np2Var.a && this.b == np2Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
