package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lkc {
    public final String a;
    public final String b;

    public lkc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkc)) {
            return false;
        }
        lkc lkcVar = (lkc) obj;
        return Intrinsics.c(this.a, lkcVar.a) && Intrinsics.c(this.b, lkcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bf3.k("MintegralSlotIdentifier(adUnitId=", this.a, ", placementId=", this.b, ")");
    }
}
