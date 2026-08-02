package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ukc implements wkc {
    public final gv9 a;

    public ukc(gv9 gv9Var) {
        gv9Var.getClass();
        this.a = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukc) && Intrinsics.c(this.a, ((ukc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Combined(pairs=" + this.a + ")";
    }
}
