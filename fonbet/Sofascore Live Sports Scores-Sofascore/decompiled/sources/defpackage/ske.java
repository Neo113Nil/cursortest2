package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ske {
    public final j78 a;

    static {
        new SparseBooleanArray();
        z1a.E(!false);
        nik.N(0);
    }

    public ske(j78 j78Var) {
        this.a = j78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ske) {
            return this.a.equals(((ske) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
