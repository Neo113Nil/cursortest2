package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pxh {
    public final tc3 a;
    public final boolean b;

    public pxh(tc3 tc3Var, boolean z) {
        this.a = tc3Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxh)) {
            return false;
        }
        pxh pxhVar = (pxh) obj;
        return Intrinsics.c(this.a, pxhVar.a) && this.b == pxhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SpinnerItemEndContent(content=" + this.a + ", placeAtFarEnd=" + this.b + ")";
    }
}
