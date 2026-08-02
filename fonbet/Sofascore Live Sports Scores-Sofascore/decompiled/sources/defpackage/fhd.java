package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fhd {
    public final String a;
    public final q9k b;
    public final r9k c;
    public final m9k d;
    public final int e;

    public fhd(String str, q9k q9kVar, q9k q9kVar2, m9k m9kVar, int i) {
        this.a = str;
        this.b = q9kVar;
        this.c = q9kVar2;
        this.d = m9kVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhd)) {
            return false;
        }
        fhd fhdVar = (fhd) obj;
        return Intrinsics.c(this.a, fhdVar.a) && Intrinsics.c(this.b, fhdVar.b) && Intrinsics.c(this.c, fhdVar.c) && Intrinsics.c(this.d, fhdVar.d) && this.e == fhdVar.e;
    }

    public final int hashCode() {
        int e = lnb.e(this.a.hashCode() * 31, 31, this.b);
        r9k r9kVar = this.c;
        return Integer.hashCode(this.e) + dmi.c((e + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31, 31, this.d.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationGroupUiModel(group=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", enabledCount=");
        sb.append(this.d);
        sb.append(", iconRes=");
        return fc6.h(this.e, ")", sb);
    }
}
