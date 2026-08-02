package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n77 {
    public final do7 a;
    public final float b;
    public final int c;
    public final int d;
    public final gv9 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public n77(do7 do7Var, float f, int i, int i2, gv9 gv9Var, boolean z, boolean z2, boolean z3, boolean z4) {
        do7Var.getClass();
        gv9Var.getClass();
        this.a = do7Var;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = gv9Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public static n77 a(n77 n77Var, do7 do7Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            do7Var = n77Var.a;
        }
        do7 do7Var2 = do7Var;
        float f = n77Var.b;
        int i2 = n77Var.c;
        int i3 = n77Var.d;
        gv9 gv9Var = n77Var.e;
        if ((i & 32) != 0) {
            z = n77Var.f;
        }
        boolean z5 = z;
        if ((i & 64) != 0) {
            z2 = n77Var.g;
        }
        boolean z6 = z2;
        boolean z7 = (i & 128) != 0 ? n77Var.h : z3;
        boolean z8 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? n77Var.i : z4;
        n77Var.getClass();
        do7Var2.getClass();
        gv9Var.getClass();
        return new n77(do7Var2, f, i2, i3, gv9Var, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n77)) {
            return false;
        }
        n77 n77Var = (n77) obj;
        return Intrinsics.c(this.a, n77Var.a) && Float.compare(this.b, n77Var.b) == 0 && this.c == n77Var.c && this.d == n77Var.d && Intrinsics.c(this.e, n77Var.e) && this.f == n77Var.f && this.g == n77Var.g && this.h == n77Var.h && this.i == n77Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + dmi.e(dmi.e(dmi.e(ljg.d(wv8.a(this.d, wv8.a(this.c, fc6.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyManagerProfileState(userCompetition=");
        sb.append(this.a);
        sb.append(", squadValue=");
        sb.append(this.b);
        sb.append(", fixturesTotal=");
        me4.q(sb, this.c, ", fixturesLeftToPlay=", this.d, ", tokens=");
        sb.append(this.e);
        sb.append(", editTeamNameDialogVisible=");
        sb.append(this.f);
        sb.append(", editTeamNameInProgress=");
        vxd.t(", editTeamNameInterstitialAdWatched=", ", showFullscreenLoadingDialog=", sb, this.g, this.h);
        return wt3.p(sb, this.i, ")");
    }
}
