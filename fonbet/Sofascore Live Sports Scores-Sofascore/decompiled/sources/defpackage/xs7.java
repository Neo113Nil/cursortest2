package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xs7 {
    public final ys7 a;
    public final ws7 b;

    public xs7(ys7 ys7Var, ws7 ws7Var) {
        ys7Var.getClass();
        ws7Var.getClass();
        this.a = ys7Var;
        this.b = ws7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs7)) {
            return false;
        }
        xs7 xs7Var = (xs7) obj;
        return Intrinsics.c(this.a, xs7Var.a) && Intrinsics.c(this.b, xs7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FavoritesTabDataWrapper(favoritesWrapper=" + this.a + ", suggestionsWrapper=" + this.b + ")";
    }
}
