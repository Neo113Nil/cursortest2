package defpackage;

import com.sofascore.model.mvvm.model.Player;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ge9 {
    public final Player a;
    public final Boolean b;

    public ge9(Player player, Boolean bool) {
        this.a = player;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge9)) {
            return false;
        }
        ge9 ge9Var = (ge9) obj;
        return Intrinsics.c(this.a, ge9Var.a) && Intrinsics.c(this.b, ge9Var.b);
    }

    public final int hashCode() {
        Player player = this.a;
        int hashCode = (player == null ? 0 : player.hashCode()) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "HockeyPlayerSideWrapper(player=" + this.a + ", isHome=" + this.b + ")";
    }
}
