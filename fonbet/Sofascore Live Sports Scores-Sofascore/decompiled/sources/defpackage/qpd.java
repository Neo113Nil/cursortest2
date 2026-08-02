package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qpd extends l8d {
    public final ppd a;
    public final u6b b;

    public qpd(u6b u6bVar, ppd ppdVar) {
        ppdVar.getClass();
        this.a = ppdVar;
        this.b = u6bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpd)) {
            return false;
        }
        qpd qpdVar = (qpd) obj;
        return Intrinsics.c(this.a, qpdVar.a) && Intrinsics.c(this.b, qpdVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u6b u6bVar = this.b;
        return hashCode + (u6bVar == null ? 0 : u6bVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
