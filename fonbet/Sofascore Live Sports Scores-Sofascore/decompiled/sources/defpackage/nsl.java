package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nsl {
    public final o0m a;
    public final h7m b;

    public nsl(@NotNull o0m o0mVar, @NotNull h7m h7mVar) {
        o0mVar.getClass();
        h7mVar.getClass();
        this.a = o0mVar;
        this.b = h7mVar;
    }

    public static nsl copy$default(nsl nslVar, o0m o0mVar, h7m h7mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            o0mVar = nslVar.a;
        }
        if ((i & 2) != 0) {
            h7mVar = nslVar.b;
        }
        nslVar.getClass();
        o0mVar.getClass();
        h7mVar.getClass();
        return new nsl(o0mVar, h7mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsl)) {
            return false;
        }
        nsl nslVar = (nsl) obj;
        return Intrinsics.c(this.a, nslVar.a) && Intrinsics.c(this.b, nslVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InteractionBounds(position=" + this.a + ", size=" + this.b + ')';
    }
}
