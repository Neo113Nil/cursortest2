package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w2g implements Serializable {

    @NotNull
    public static final p2g b = new p2g(null);
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof u2g) {
            return ((u2g) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w2g) {
            return Intrinsics.c(this.a, ((w2g) obj).a);
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
        if (obj instanceof u2g) {
            return ((u2g) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
