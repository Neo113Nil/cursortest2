package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lzd {
    public final gv9 a;
    public final boolean b;

    public lzd(gv9 gv9Var, boolean z) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzd)) {
            return false;
        }
        lzd lzdVar = (lzd) obj;
        return Intrinsics.c(this.a, lzdVar.a) && this.b == lzdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PESMFootballActionUiModel(points=" + this.a + ", rightDirection=" + this.b + ")";
    }
}
