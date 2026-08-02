package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b0l {
    public final zdl a;
    public final int b;
    public final int c;
    public final cdi d;

    public b0l(zdl zdlVar, int i, int i2, cdi cdiVar) {
        zdlVar.getClass();
        cdiVar.getClass();
        this.a = zdlVar;
        this.b = i;
        this.c = i2;
        this.d = cdiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0l)) {
            return false;
        }
        b0l b0lVar = (b0l) obj;
        return Intrinsics.c(this.a, b0lVar.a) && this.b == b0lVar.b && this.c == b0lVar.c && Intrinsics.c(this.d, b0lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "WcUnselectedTeamAnimationState(currentColor=" + this.a + ", fromIdx=" + this.b + ", toIdx=" + this.c + ", rawColorIndex=" + this.d + ")";
    }
}
