package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bd7 {
    public final sx6 a;
    public final String b;

    public bd7(sx6 sx6Var, String str) {
        str.getClass();
        this.a = sx6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd7)) {
            return false;
        }
        bd7 bd7Var = (bd7) obj;
        return this.a == bd7Var.a && Intrinsics.c(this.b, bd7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FantasyPlayerExpectedStatistic(type=" + this.a + ", value=" + this.b + ")";
    }
}
