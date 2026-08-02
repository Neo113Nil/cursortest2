package defpackage;

import com.sofascore.model.fantasy.FantasyPlayer;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qel {
    public final FantasyPlayer a;
    public final String b;
    public final String c;

    public qel(FantasyPlayer fantasyPlayer, String str, String str2) {
        fantasyPlayer.getClass();
        this.a = fantasyPlayer;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qel)) {
            return false;
        }
        qel qelVar = (qel) obj;
        return Intrinsics.c(this.a, qelVar.a) && this.b.equals(qelVar.b) && this.c.equals(qelVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorldCupFantasyStatsPlayerItem(fantasyPlayer=");
        sb.append(this.a);
        sb.append(", statValue=");
        sb.append(this.b);
        sb.append(", description=");
        return mz1.o(sb, this.c, ")");
    }
}
