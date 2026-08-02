package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tx6 {
    public final gv9 a;

    public tx6(gv9 gv9Var) {
        gv9Var.getClass();
        this.a = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx6) && Intrinsics.c(this.a, ((tx6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FantasyFdrGameweek(fixtures=" + this.a + ")";
    }
}
