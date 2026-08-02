package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ylj implements fm8, rdh {
    public final r9k a;
    public final Player b;
    public final Team c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final r9k g;
    public final gv9 h;
    public final gv9 i;
    public final n9k j;
    public final r9k k;

    public ylj(r9k r9kVar, Player player, Team team, int i, boolean z, boolean z2, q9k q9kVar, n9k n9kVar, q9k q9kVar2) {
        b7 K = l6g.K(new r13(hkg.d(4281535498L)), new r13(hkg.d(4288226077L)), new r13(hkg.d(4281535498L)));
        b7 K2 = l6g.K(new r13(hkg.d(4294916912L)), new r13(hkg.b(16726832)), new r13(hkg.d(4294916912L)));
        r9kVar.getClass();
        q9kVar.getClass();
        K.getClass();
        K2.getClass();
        this.a = r9kVar;
        this.b = player;
        this.c = team;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = q9kVar;
        this.h = K;
        this.i = K2;
        this.j = n9kVar;
        this.k = q9kVar2;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 6000;
    }

    @Override // defpackage.rdh
    public final gv9 b() {
        return this.i;
    }

    @Override // defpackage.rdh
    public final int c() {
        return R.drawable.red_card_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylj)) {
            return false;
        }
        ylj yljVar = (ylj) obj;
        return Intrinsics.c(this.a, yljVar.a) && Intrinsics.c(this.b, yljVar.b) && Intrinsics.c(this.c, yljVar.c) && this.d == yljVar.d && this.e == yljVar.e && this.f == yljVar.f && this.g.equals(yljVar.g) && this.h.equals(yljVar.h) && this.i.equals(yljVar.i) && this.j.equals(yljVar.j) && Intrinsics.c(this.k, yljVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Player player = this.b;
        int hashCode2 = (hashCode + (player == null ? 0 : player.hashCode())) * 31;
        Team team = this.c;
        int hashCode3 = (this.j.hashCode() + ljg.d(wv8.a(R.drawable.red_card_share_background, ljg.d(wv8.a(6000, (this.g.hashCode() + dmi.e(dmi.e(wv8.a(this.d, (hashCode2 + (team == null ? 0 : team.hashCode())) * 31, 31), 31, this.e), 31, this.f)) * 31, 31), 31, this.h), 31), 31, this.i)) * 31;
        r9k r9kVar = this.k;
        return hashCode3 + (r9kVar != null ? r9kVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPlayerCard(title=");
        sb.append(this.a);
        sb.append(", player=");
        sb.append(this.b);
        sb.append(", team=");
        sb.append(this.c);
        sb.append(", numberOfProfileVisits=");
        sb.append(this.d);
        sb.append(", isNumberOneFan=");
        vxd.t(", isInTopOnePercentFans=", ", description=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", durationMilliseconds=6000, contentGradient=");
        sb.append(this.h);
        sb.append(", backgroundResource=2131232883, borderContentGradient=");
        sb.append(this.i);
        sb.append(", shareTitle=");
        sb.append(this.j);
        sb.append(", shareDescription=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
