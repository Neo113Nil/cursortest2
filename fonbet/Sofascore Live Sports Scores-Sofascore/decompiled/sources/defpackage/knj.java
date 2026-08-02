package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class knj implements lnj {
    public final vue a;

    public knj(nre nreVar) {
        nreVar.getClass();
        this.a = nreVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knj) && Intrinsics.c(this.a, ((knj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PositionFilter(value=" + this.a + ")";
    }
}
