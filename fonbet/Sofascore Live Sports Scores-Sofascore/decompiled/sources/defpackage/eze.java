package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eze {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public eze(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eze)) {
            return false;
        }
        eze ezeVar = (eze) obj;
        return Intrinsics.c(this.a, ezeVar.a) && Intrinsics.c(this.b, ezeVar.b) && this.c == ezeVar.c && this.d == ezeVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wv8.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return me4.i(mz1.s("PointUIData(homePoint=", this.a, ", awayPoint=", this.b, ", homePointColor="), this.c, ", awayPointColor=", this.d, ")");
    }
}
