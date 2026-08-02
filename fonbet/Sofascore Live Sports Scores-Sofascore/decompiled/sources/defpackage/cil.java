package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cil implements eil {
    public final String a;
    public final String b;
    public final int c;

    public cil(String str, String str2, int i) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cil)) {
            return false;
        }
        cil cilVar = (cil) obj;
        return Intrinsics.c(this.a, cilVar.a) && this.b.equals(cilVar.b) && this.c == cilVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return fc6.h(this.c, ")", mz1.s("SendOddsImpression(statusType=", this.a, ", marketName=", this.b, ", eventId="));
    }
}
