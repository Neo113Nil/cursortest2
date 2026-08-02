package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eg2 implements Comparable {
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public eg2(int i, int i2, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.e(this.d, ((eg2) obj).d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg2)) {
            return false;
        }
        eg2 eg2Var = (eg2) obj;
        return this.a == eg2Var.a && this.b == eg2Var.b && this.c == eg2Var.c && this.d == eg2Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", dayOfMonth=");
        sb.append(this.c);
        sb.append(", utcTimeMillis=");
        return fn0.n(sb, this.d, ')');
    }
}
