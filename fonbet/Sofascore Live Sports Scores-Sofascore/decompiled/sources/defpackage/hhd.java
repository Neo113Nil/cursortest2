package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hhd {
    public final boolean a;
    public final long b;
    public final gv9 c;
    public final boolean d;
    public final boolean e;

    public hhd(b7 b7Var, int i) {
        this(0L, (i & 4) != 0 ? rlh.b : b7Var, (i & 1) == 0, false, false);
    }

    public static hhd a(hhd hhdVar, boolean z, long j, gv9 gv9Var, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = hhdVar.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            j = hhdVar.b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            gv9Var = hhdVar.c;
        }
        gv9 gv9Var2 = gv9Var;
        if ((i & 8) != 0) {
            z2 = hhdVar.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = hhdVar.e;
        }
        hhdVar.getClass();
        gv9Var2.getClass();
        return new hhd(j2, gv9Var2, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhd)) {
            return false;
        }
        hhd hhdVar = (hhd) obj;
        return this.a == hhdVar.a && this.b == hhdVar.b && Intrinsics.c(this.c, hhdVar.c) && this.d == hhdVar.d && this.e == hhdVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dmi.e(ljg.d(ljg.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "NotificationSettingsState(notificationsEnabled=" + this.a + ", notificationsMutedUntil=" + this.b + ", groups=" + this.c + ", soundsImported=" + this.d + ", importInProgress=" + this.e + ")";
    }

    public hhd(long j, gv9 gv9Var, boolean z, boolean z2, boolean z3) {
        gv9Var.getClass();
        this.a = z;
        this.b = j;
        this.c = gv9Var;
        this.d = z2;
        this.e = z3;
    }
}
