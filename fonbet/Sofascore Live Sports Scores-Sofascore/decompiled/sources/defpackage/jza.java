package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jza {
    public final kza a;
    public final Event b;
    public final Player c;
    public final Double d;

    public jza(kza kzaVar, Event event, Player player, Double d) {
        event.getClass();
        player.getClass();
        this.a = kzaVar;
        this.b = event;
        this.c = player;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jza)) {
            return false;
        }
        jza jzaVar = (jza) obj;
        return this.a.equals(jzaVar.a) && Intrinsics.c(this.b, jzaVar.b) && Intrinsics.c(this.c, jzaVar.c) && Intrinsics.c(this.d, jzaVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Double d = this.d;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "LeagueRecapTopPerformanceWrapper(performance=" + this.a + ", event=" + this.b + ", player=" + this.c + ", rating=" + this.d + ")";
    }
}
