package defpackage;

import android.graphics.Color;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bk5 extends dk5 {
    public final int b;

    public bk5(int i) {
        this.b = i;
        if (Color.alpha(i) == 255) {
            return;
        }
        a70.p("Background color must be opaque");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bk5) {
            return this.b == ((bk5) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return "ColorBackground{color:" + Integer.toHexString(this.b) + '}';
    }
}
