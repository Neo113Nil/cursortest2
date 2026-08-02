package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class go2 {
    public static final fo2 b = new fo2();
    public final Object a;

    public static final Object a(Object obj) {
        if (obj instanceof fo2) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof go2) {
            return Intrinsics.c(this.a, ((go2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof eo2) {
            return ((eo2) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
