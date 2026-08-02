package defpackage;

import com.sofascore.model.mvvm.model.Player;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mz3 {
    public final Player a;
    public final List b;

    public mz3(Player player, List list) {
        player.getClass();
        list.getClass();
        this.a = player;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz3)) {
            return false;
        }
        mz3 mz3Var = (mz3) obj;
        return Intrinsics.c(this.a, mz3Var.a) && Intrinsics.c(this.b, mz3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BowlerData(bowler=" + this.a + ", incidents=" + this.b + ")";
    }
}
