package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qp7 {
    public static final ArrayList j;
    public final ev6 a;
    public final int b;
    public final boolean c;
    public final gv9 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final gv9 h;
    public final List i;

    static {
        kp5<rz6> kp5Var = rz6.m;
        ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
        for (rz6 rz6Var : kp5Var) {
            int i = rz6Var.f;
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(new FantasyFootballPlayerPlaceholder(rz6Var, i2));
            }
            arrayList.add(arrayList2);
        }
        j = k13.s(arrayList);
    }

    public qp7(ev6 ev6Var, int i, boolean z, gv9 gv9Var, int i2, boolean z2, boolean z3, gv9 gv9Var2, List list) {
        gv9Var.getClass();
        gv9Var2.getClass();
        list.getClass();
        this.a = ev6Var;
        this.b = i;
        this.c = z;
        this.d = gv9Var;
        this.e = i2;
        this.f = z2;
        this.g = z3;
        this.h = gv9Var2;
        this.i = list;
    }

    public static qp7 a(qp7 qp7Var, gv9 gv9Var, int i, boolean z, boolean z2, gv9 gv9Var2, List list, int i2) {
        ev6 ev6Var = qp7Var.a;
        int i3 = qp7Var.b;
        boolean z3 = (i2 & 4) != 0 ? qp7Var.c : false;
        if ((i2 & 8) != 0) {
            gv9Var = qp7Var.d;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i2 & 16) != 0) {
            i = qp7Var.e;
        }
        int i4 = i;
        if ((i2 & 32) != 0) {
            z = qp7Var.f;
        }
        boolean z4 = z;
        if ((i2 & 64) != 0) {
            z2 = qp7Var.g;
        }
        boolean z5 = z2;
        gv9 gv9Var4 = (i2 & 128) != 0 ? qp7Var.h : gv9Var2;
        List list2 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? qp7Var.i : list;
        qp7Var.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        list2.getClass();
        return new qp7(ev6Var, i3, z3, gv9Var3, i4, z4, z5, gv9Var4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp7)) {
            return false;
        }
        qp7 qp7Var = (qp7) obj;
        return this.a.equals(qp7Var.a) && this.b == qp7Var.b && this.c == qp7Var.c && Intrinsics.c(this.d, qp7Var.d) && this.e == qp7Var.e && this.f == qp7Var.f && this.g == qp7Var.g && Intrinsics.c(this.h, qp7Var.h) && Intrinsics.c(this.i, qp7Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ljg.d(dmi.e(dmi.e(wv8.a(this.e, ljg.d(dmi.e(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyWalkthroughState(competition=");
        sb.append(this.a);
        sb.append(", roundId=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", squad=");
        sb.append(this.d);
        sb.append(", playerCount=");
        sb.append(this.e);
        sb.append(", squadValid=");
        sb.append(this.f);
        sb.append(", pendingChange=");
        sb.append(this.g);
        sb.append(", validationErrors=");
        sb.append(this.h);
        sb.append(", leagues=");
        return mz1.p(sb, this.i, ")");
    }
}
