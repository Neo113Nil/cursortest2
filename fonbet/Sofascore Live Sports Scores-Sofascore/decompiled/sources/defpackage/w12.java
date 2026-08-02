package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w12 {
    public final r9k a;
    public final boolean b;

    public w12(r9k r9kVar, boolean z) {
        r9kVar.getClass();
        this.a = r9kVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w12)) {
            return false;
        }
        w12 w12Var = (w12) obj;
        return Intrinsics.c(this.a, w12Var.a) && this.b == w12Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxScoreColumn(label=" + this.a + ", isWide=" + this.b + ")";
    }
}
