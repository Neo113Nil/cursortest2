package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class df2 {
    public final mad a;
    public final zad b;

    public df2(mad madVar) {
        this.a = madVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2)) {
            return false;
        }
        df2 df2Var = (df2) obj;
        return Intrinsics.c(this.a, df2Var.a) && Intrinsics.c(this.b, df2Var.b);
    }

    public final int hashCode() {
        mad madVar = this.a;
        int hashCode = (madVar != null ? madVar.hashCode() : 0) * 31;
        zad zadVar = this.b;
        return hashCode + (zadVar != null ? zadVar.hashCode() : 0);
    }

    public final String toString() {
        return "ReadResult(request=" + this.a + ", response=" + this.b + ")";
    }

    public df2(zad zadVar) {
        this.a = null;
        this.b = zadVar;
    }
}
