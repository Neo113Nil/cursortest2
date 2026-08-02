package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rsb {
    public final float a;
    public final boolean b;
    public final Float c;

    public rsb(float f, boolean z, Float f2) {
        this.a = f;
        this.b = z;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsb)) {
            return false;
        }
        rsb rsbVar = (rsb) obj;
        return Float.compare(this.a, rsbVar.a) == 0 && this.b == rsbVar.b && Intrinsics.c(this.c, rsbVar.c);
    }

    public final int hashCode() {
        int e = dmi.e(Float.hashCode(this.a) * 31, 31, this.b);
        Float f = this.c;
        return e + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "ManagerHistoryColumnData(ratio=" + this.a + ", multiply=" + this.b + ", height=" + this.c + ")";
    }
}
