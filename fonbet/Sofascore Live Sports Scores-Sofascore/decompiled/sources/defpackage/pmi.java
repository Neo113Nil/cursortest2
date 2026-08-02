package defpackage;

import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerOrTeam;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pmi implements fm8, rdh {
    public final ehk a;
    public final gv9 b;
    public final Team c;
    public final PlayerOrTeam d;
    public final int e;
    public final Sport f;
    public final gv9 g;
    public final gv9 h;

    public pmi(ehk ehkVar, b7 b7Var, Team team, PlayerOrTeam playerOrTeam, int i, Sport sport) {
        b7 K = l6g.K(new r13(hkg.d(4279836223L)), new r13(hkg.d(4281814517L)), new r13(hkg.d(4279836223L)));
        b7 K2 = l6g.K(new r13(hkg.d(4281814517L)), new r13(hkg.b(1295470069)), new r13(hkg.d(4286262988L)));
        b7Var.getClass();
        team.getClass();
        playerOrTeam.getClass();
        sport.getClass();
        K.getClass();
        K2.getClass();
        this.a = ehkVar;
        this.b = b7Var;
        this.c = team;
        this.d = playerOrTeam;
        this.e = i;
        this.f = sport;
        this.g = K;
        this.h = K2;
    }

    @Override // defpackage.fm8
    public final int a() {
        return 8000;
    }

    @Override // defpackage.rdh
    public final gv9 b() {
        return this.h;
    }

    @Override // defpackage.rdh
    public final int c() {
        return R.drawable.wrap_up_card_share_background;
    }

    @Override // defpackage.rdh
    public final gv9 d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmi)) {
            return false;
        }
        pmi pmiVar = (pmi) obj;
        return this.a == pmiVar.a && this.b.equals(pmiVar.b) && Intrinsics.c(this.c, pmiVar.c) && Intrinsics.c(this.d, pmiVar.d) && this.e == pmiVar.e && Intrinsics.c(this.f, pmiVar.f) && this.g.equals(pmiVar.g) && this.h.equals(pmiVar.h);
    }

    public final int hashCode() {
        return ljg.d(wv8.a(R.drawable.wrap_up_card_share_background, ljg.d(wv8.a(8000, (this.f.hashCode() + wv8.a(this.e, (this.d.hashCode() + fc6.b(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31)) * 31, 31), 31, this.g), 31), 961, this.h);
    }

    public final String toString() {
        return "SummaryWrapUpCard(role=" + this.a + ", titleList=" + this.b + ", topTeam=" + this.c + ", topPlayer=" + this.d + ", eventsVisited=" + this.e + ", topSport=" + this.f + ", durationMilliseconds=8000, contentGradient=" + this.g + ", backgroundResource=2131233096, borderContentGradient=" + this.h + ", shareTitle=null, shareDescription=null)";
    }
}
