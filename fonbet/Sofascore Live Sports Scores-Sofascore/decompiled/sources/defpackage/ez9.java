package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ez9 extends iz9 {
    public final String c;

    public ez9(String str) {
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez9) && Intrinsics.c(this.c, ((ez9) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return lnb.o("OvertimeBreakIncident(text=", this.c, ")");
    }
}
