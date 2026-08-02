package defpackage;

import com.sofascore.model.mvvm.model.Player;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nm1 {
    public final lm1 a;
    public final Integer b;
    public final Player c;

    public nm1(lm1 lm1Var, Integer num, Player player) {
        player.getClass();
        this.a = lm1Var;
        this.b = num;
        this.c = player;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm1)) {
            return false;
        }
        nm1 nm1Var = (nm1) obj;
        return this.a.equals(nm1Var.a) && Intrinsics.c(this.b, nm1Var.b) && Intrinsics.c(this.c, nm1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "BaseballTablePitcherWrapper(pitcher=" + this.a + ", teamId=" + this.b + ", player=" + this.c + ")";
    }
}
