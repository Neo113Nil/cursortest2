package defpackage;

import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.fantasy.FantasyLeagueType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j67 implements Serializable {
    public static final j67 l = new j67(0, "Neka Nova Liga", "U ovoj li(z)i se prodaju ali i peru masne pare momci. Najnovija Bosch vesh masina obavlja radnju pranja, FINA ne vidi sta se tu dogada, ili je to porezna, ne bi znao.", "sfasfs3241", 0, 5, "Rafo", Long.valueOf(yaa.w()), "HR", FantasyLeagueType.GLOBAL, FantasyLeagueGameType.CLASSIC);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final Long h;
    public final String i;
    public final FantasyLeagueType j;
    public final FantasyLeagueGameType k;

    public j67(int i, String str, String str2, String str3, int i2, int i3, String str4, Long l2, String str5, FantasyLeagueType fantasyLeagueType, FantasyLeagueGameType fantasyLeagueGameType) {
        str.getClass();
        fantasyLeagueGameType.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = i3;
        this.g = str4;
        this.h = l2;
        this.i = str5;
        this.j = fantasyLeagueType;
        this.k = fantasyLeagueGameType;
    }

    public final boolean d() {
        return this.j == FantasyLeagueType.GLOBAL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j67)) {
            return false;
        }
        j67 j67Var = (j67) obj;
        return this.a == j67Var.a && Intrinsics.c(this.b, j67Var.b) && Intrinsics.c(this.c, j67Var.c) && Intrinsics.c(this.d, j67Var.d) && this.e == j67Var.e && this.f == j67Var.f && Intrinsics.c(this.g, j67Var.g) && Intrinsics.c(this.h, j67Var.h) && Intrinsics.c(this.i, j67Var.i) && this.j == j67Var.j && this.k == j67Var.k;
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int a = wv8.a(this.f, wv8.a(this.e, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.g;
        int hashCode2 = (a + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.h;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.i;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FantasyLeagueType fantasyLeagueType = this.j;
        return this.k.hashCode() + ((hashCode4 + (fantasyLeagueType != null ? fantasyLeagueType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FantasyLeagueUiModel(id=", ", name=", this.b, ", description=");
        bf3.v(t, this.c, ", ownerId=", this.d, ", startRoundId=");
        me4.q(t, this.e, ", totalPlayers=", this.f, ", ownerNickname=");
        t.append(this.g);
        t.append(", createdAtTimestamp=");
        t.append(this.h);
        t.append(", countryAlpha2=");
        t.append(this.i);
        t.append(", type=");
        t.append(this.j);
        t.append(", gameType=");
        t.append(this.k);
        t.append(")");
        return t.toString();
    }
}
