package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y7f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public y7f(int i, int i2, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7f)) {
            return false;
        }
        y7f y7fVar = (y7f) obj;
        return Intrinsics.c(this.a, y7fVar.a) && this.b == y7fVar.b && this.c == y7fVar.c && this.d == y7fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return lnb.r(sb, this.d, ')');
    }
}
