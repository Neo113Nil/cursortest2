package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dy7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final k6c f;
    public final gv9 g;
    public final String h;
    public final boolean i;
    public final ehk j;

    public dy7(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, k6c k6cVar, gv9 gv9Var, String str, boolean z6, ehk ehkVar) {
        k6cVar.getClass();
        gv9Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = k6cVar;
        this.g = gv9Var;
        this.h = str;
        this.i = z6;
        this.j = ehkVar;
    }

    public static dy7 a(dy7 dy7Var, boolean z, boolean z2, k6c k6cVar, String str, boolean z3, ehk ehkVar, int i) {
        boolean z4 = (i & 1) != 0 ? dy7Var.a : true;
        boolean z5 = (i & 2) != 0 ? dy7Var.b : false;
        boolean z6 = (i & 4) != 0 ? dy7Var.c : false;
        if ((i & 8) != 0) {
            z = dy7Var.d;
        }
        boolean z7 = z;
        if ((i & 16) != 0) {
            z2 = dy7Var.e;
        }
        boolean z8 = z2;
        k6c k6cVar2 = (i & 32) != 0 ? dy7Var.f : k6cVar;
        gv9 gv9Var = dy7Var.g;
        String str2 = (i & 128) != 0 ? dy7Var.h : str;
        boolean z9 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? dy7Var.i : z3;
        ehk ehkVar2 = (i & 512) != 0 ? dy7Var.j : ehkVar;
        dy7Var.getClass();
        k6cVar2.getClass();
        gv9Var.getClass();
        return new dy7(z4, z5, z6, z7, z8, k6cVar2, gv9Var, str2, z9, ehkVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy7)) {
            return false;
        }
        dy7 dy7Var = (dy7) obj;
        return this.a == dy7Var.a && this.b == dy7Var.b && this.c == dy7Var.c && this.d == dy7Var.d && this.e == dy7Var.e && this.f == dy7Var.f && Intrinsics.c(this.g, dy7Var.g) && Intrinsics.c(this.h, dy7Var.h) && this.i == dy7Var.i && this.j == dy7Var.j;
    }

    public final int hashCode() {
        int d = ljg.d((this.f.hashCode() + dmi.e(dmi.e(dmi.e(dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
        String str = this.h;
        int e = dmi.e((d + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        ehk ehkVar = this.j;
        return e + (ehkVar != null ? ehkVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = w1l.k("FeedState(shouldDraw=", this.a, ", showWelcomeScreen=", this.b, ", showUpdateDialog=");
        vxd.t(", showPrimaryTabPrompt=", ", feedUnderMaintenance=", k, this.c, this.d);
        k.append(this.e);
        k.append(", selectedChip=");
        k.append(this.f);
        k.append(", allChips=");
        k.append(this.g);
        k.append(", userCountryCode=");
        k.append(this.h);
        k.append(", showSofaSeason=");
        k.append(this.i);
        k.append(", seasonUserRole=");
        k.append(this.j);
        k.append(")");
        return k.toString();
    }
}
