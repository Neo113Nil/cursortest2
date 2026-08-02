package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q04 implements Serializable {
    public final int a;
    public final int b;
    public final List c;
    public final boolean d;
    public boolean e;

    public q04(boolean z, int i, int i2, List list) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q04)) {
            return false;
        }
        q04 q04Var = (q04) obj;
        return this.a == q04Var.a && this.b == q04Var.b && Intrinsics.c(this.c, q04Var.c) && this.d == q04Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.d(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "CricketOverWrapper(inning=", ", over=", ", balls=");
        s.append(this.c);
        s.append(", isSuperOver=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
