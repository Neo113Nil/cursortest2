package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vfd {
    public final gv9 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public vfd(b7 b7Var, int i) {
        this(0L, (i & 1) != 0 ? rlh.b : b7Var, (i & 2) == 0, false, false);
    }

    public static vfd a(vfd vfdVar, gv9 gv9Var, boolean z, boolean z2, boolean z3, long j, int i) {
        if ((i & 1) != 0) {
            gv9Var = vfdVar.a;
        }
        gv9 gv9Var2 = gv9Var;
        if ((i & 2) != 0) {
            z = vfdVar.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = vfdVar.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = vfdVar.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            j = vfdVar.e;
        }
        vfdVar.getClass();
        gv9Var2.getClass();
        return new vfd(j, gv9Var2, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfd)) {
            return false;
        }
        vfd vfdVar = (vfd) obj;
        return Intrinsics.c(this.a, vfdVar.a) && this.b == vfdVar.b && this.c == vfdVar.c && this.d == vfdVar.d && this.e == vfdVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + dmi.e(dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationGroupSettingsState(items=");
        sb.append(this.a);
        sb.append(", saveButtonEnabled=");
        sb.append(this.b);
        sb.append(", isSavingData=");
        vxd.t(", someChannelsDisabled=", ", notificationsMutedUntil=", sb, this.c, this.d);
        return lnb.l(this.e, ")", sb);
    }

    public vfd(long j, gv9 gv9Var, boolean z, boolean z2, boolean z3) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
    }
}
