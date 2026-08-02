package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gti {
    public static final gti b;
    public final Map a;

    static {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        b = new gti(lm5Var);
    }

    public gti(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gti) {
            return Intrinsics.c(this.a, ((gti) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dmi.s(new StringBuilder("Tags(tags="), this.a, ')');
    }
}
