package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ixk {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final String f;

    public ixk(String str, String str2, int i, int i2, Boolean bool, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = bool;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixk)) {
            return false;
        }
        ixk ixkVar = (ixk) obj;
        return Intrinsics.c(this.a, ixkVar.a) && Intrinsics.c(this.b, ixkVar.b) && this.c == ixkVar.c && this.d == ixkVar.d && Intrinsics.c(this.e, ixkVar.e) && Intrinsics.c(this.f, ixkVar.f);
    }

    public final int hashCode() {
        int a = wv8.a(this.d, wv8.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31), 31);
        Boolean bool = this.e;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = mz1.s("EventStatus(status=", this.a, ", statusDescription=", this.b, ", topScore=");
        me4.q(s, this.c, ", bottomScore=", this.d, ", topWon=");
        s.append(this.e);
        s.append(", currentPeriod=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
