package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f8l {
    public final String a;
    public final boolean b;
    public final int c;

    public f8l(int i, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8l)) {
            return false;
        }
        f8l f8lVar = (f8l) obj;
        return Intrinsics.c(this.a, f8lVar.a) && this.b == f8lVar.b && this.c == f8lVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuarterItem(text=");
        sb.append(this.a);
        sb.append(", isLive=");
        sb.append(this.b);
        sb.append(", marginStart=");
        return fc6.h(this.c, ")", sb);
    }
}
