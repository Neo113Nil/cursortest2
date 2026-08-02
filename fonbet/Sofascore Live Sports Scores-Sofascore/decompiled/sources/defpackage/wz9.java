package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wz9 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ wz9(String str, int i) {
        this(str, (i & 2) == 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz9)) {
            return false;
        }
        wz9 wz9Var = (wz9) obj;
        return Intrinsics.c(this.a, wz9Var.a) && this.b == wz9Var.b && this.c == wz9Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + dmi.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncidentScore(value=");
        sb.append(this.a);
        sb.append(", hasPassingNetwork=");
        sb.append(this.b);
        sb.append(", isSportWithPoints=");
        return wt3.p(sb, this.c, ")");
    }

    public wz9(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
