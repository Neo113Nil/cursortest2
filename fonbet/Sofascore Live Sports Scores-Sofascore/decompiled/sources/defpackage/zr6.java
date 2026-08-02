package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zr6 {
    public final j67 a;
    public final boolean b;

    public zr6(j67 j67Var, boolean z) {
        j67Var.getClass();
        this.a = j67Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr6)) {
            return false;
        }
        zr6 zr6Var = (zr6) obj;
        return Intrinsics.c(this.a, zr6Var.a) && this.b == zr6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JoinedLeague(league=" + this.a + ", isOwner=" + this.b + ")";
    }
}
