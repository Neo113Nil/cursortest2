package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zwi {
    public final ho1 a;
    public final gv9 b;

    public zwi(ho1 ho1Var, gv9 gv9Var) {
        gv9Var.getClass();
        this.a = ho1Var;
        this.b = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwi)) {
            return false;
        }
        zwi zwiVar = (zwi) obj;
        return this.a.equals(zwiVar.a) && Intrinsics.c(this.b, zwiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamFdrData(team=" + this.a + ", rounds=" + this.b + ")";
    }
}
