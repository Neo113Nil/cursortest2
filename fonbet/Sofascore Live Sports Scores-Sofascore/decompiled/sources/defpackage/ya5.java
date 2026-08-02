package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ya5 extends az7 {
    public final Drawable a;
    public final boolean b;
    public final int c;

    public ya5(int i, Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya5)) {
            return false;
        }
        ya5 ya5Var = (ya5) obj;
        return Intrinsics.c(this.a, ya5Var.a) && this.b == ya5Var.b && this.c == ya5Var.c;
    }

    public final int hashCode() {
        return wt3.C(this.c) + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }
}
