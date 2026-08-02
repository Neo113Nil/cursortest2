package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p3j {
    public final boolean a;
    public final boolean b;
    public final List c;

    public p3j(boolean z, boolean z2, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3j)) {
            return false;
        }
        p3j p3jVar = (p3j) obj;
        return this.a == p3jVar.a && this.b == p3jVar.b && Intrinsics.c(this.c, p3jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mz1.p(w1l.k("TeamTransfersInfo(hasIncomingTransfers=", this.a, ", hasOutgoingTransfers=", this.b, ", transferList="), this.c, ")");
    }
}
