package defpackage;

import com.sofascore.model.mvvm.model.Player;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e43 extends f43 {
    public final Player a;
    public final int b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public e43(int i, Player player, Integer num, boolean z, boolean z2, boolean z3) {
        player.getClass();
        this.a = player;
        this.b = i;
        this.c = num;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e43)) {
            return false;
        }
        e43 e43Var = (e43) obj;
        return Intrinsics.c(this.a, e43Var.a) && this.b == e43Var.b && Intrinsics.c(this.c, e43Var.c) && this.d == e43Var.d && this.e == e43Var.e && this.f == e43Var.f;
    }

    public final int hashCode() {
        int a = wv8.a(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return Boolean.hashCode(this.f) + dmi.e(dmi.e((a + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListPlayer(player=");
        sb.append(this.a);
        sb.append(", teamId=");
        sb.append(this.b);
        sb.append(", time=");
        sb.append(this.c);
        sb.append(", isScorer=");
        sb.append(this.d);
        sb.append(", isAssist=");
        return w1l.i(", isOwnGoal=", ")", sb, this.e, this.f);
    }
}
