package defpackage;

import com.sofascore.model.mvvm.model.Player;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class awe implements Serializable {
    public final Player a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public awe(Player player, int i, int i2, String str, String str2, String str3) {
        player.getClass();
        str.getClass();
        this.a = player;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awe)) {
            return false;
        }
        awe aweVar = (awe) obj;
        return Intrinsics.c(this.a, aweVar.a) && this.b == aweVar.b && this.c == aweVar.c && Intrinsics.c(this.d, aweVar.d) && this.e.equals(aweVar.e) && Intrinsics.c(this.f, aweVar.f);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
        String str = this.f;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerSeasonStatisticsDataSet(player=");
        sb.append(this.a);
        sb.append(", uniqueTournamentId=");
        sb.append(this.b);
        sb.append(", seasonId=");
        vxd.p(this.c, ", subSeasonType=", this.d, ", sport=", sb);
        return fc6.o(sb, this.e, ", seasonYear=", this.f, ")");
    }
}
