package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class loj implements slj, Serializable {
    public final Player a;
    public final Event b;
    public final jei c;

    public loj(Player player, Event event, jei jeiVar) {
        player.getClass();
        event.getClass();
        this.a = player;
        this.b = event;
        this.c = jeiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof loj) {
            loj lojVar = (loj) obj;
            return Intrinsics.c(this.a, lojVar.a) && Intrinsics.c(this.b, lojVar.b) && this.c == lojVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TopStatsWrapper(player=" + this.a + ", event=" + this.b + ", statisticItem=" + this.c + ", roundedBottom=false)";
    }
}
