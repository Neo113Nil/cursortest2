package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ae7 {
    public final String a;
    public final String b;
    public final int c;

    public ae7(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae7)) {
            return false;
        }
        ae7 ae7Var = (ae7) obj;
        return Intrinsics.c(this.a, ae7Var.a) && Intrinsics.c(this.b, ae7Var.b) && this.c == ae7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return fc6.h(this.c, ")", mz1.s("FantasyPlayerStatistic(key=", this.a, ", value=", this.b, ", points="));
    }
}
