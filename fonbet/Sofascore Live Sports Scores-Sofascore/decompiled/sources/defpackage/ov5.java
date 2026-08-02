package defpackage;

import android.app.Application;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lov5;", "Lynb;", "Lfv5;", "Llt5;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ov5 extends ynb {
    public final s96 l;
    public final ddi m;
    public n22 n;
    public List o;
    public List p;
    public List q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov5(s96 s96Var, ddi ddiVar, Application application) {
        super(application, tnb.a);
        s96Var.getClass();
        ddiVar.getClass();
        this.l = s96Var;
        this.m = ddiVar;
        km5 km5Var = km5.a;
        this.o = km5Var;
        this.p = km5Var;
        this.q = km5Var;
    }

    public final Event t() {
        return (Event) this.m.getValue();
    }

    public final gv9 u(TeamSelection teamSelection) {
        int i = lv5.a[teamSelection.ordinal()];
        gv9 gv9Var = null;
        if (i == 1) {
            n22 n22Var = this.n;
            if (n22Var != null) {
                gv9Var = n22Var.a;
            }
        } else if (i == 2) {
            n22 n22Var2 = this.n;
            if (n22Var2 != null) {
                gv9Var = n22Var2.b;
            }
        } else if (i == 3) {
            n22 n22Var3 = this.n;
            if (n22Var3 != null) {
                gv9Var = n22Var3.c;
            }
        } else if (i != 4) {
            zzl.b();
            return null;
        }
        return gv9Var == null ? rlh.b : gv9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0052, code lost:
    
        if (r1 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0317, code lost:
    
        if (r2 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0108, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r9 != null ? r9.getHasLiveRating() : null, r11) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0325 A[LOOP:2: B:52:0x0325->B:55:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(sq3 sq3Var) {
        mv5 mv5Var;
        int i;
        LineupsResponse lineupsResponse;
        boolean z;
        ov5 ov5Var;
        boolean z2;
        LineupsResponse lineupsResponse2;
        LineupsResponse lineupsResponse3;
        Boolean bool;
        fdi fdiVar;
        Object value;
        boolean c;
        List<MissingPlayerData> missingPlayers;
        List<MissingPlayerData> missingPlayers2;
        q9k q9kVar;
        if (sq3Var instanceof mv5) {
            mv5Var = (mv5) sq3Var;
            int i2 = mv5Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mv5Var.x = i2 - Integer.MIN_VALUE;
                Object obj = mv5Var.v;
                lu3 lu3Var = lu3.a;
                i = mv5Var.x;
                int i3 = 0;
                int i4 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    Event t = t();
                    mv5Var.x = 1;
                    obj = this.l.p(t, mv5Var);
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = mv5Var.u;
                    ov5Var = mv5Var.t;
                    lineupsResponse3 = mv5Var.s;
                    lineupsResponse2 = mv5Var.r;
                    y6a.M(obj);
                    ov5Var.n = (n22) obj;
                    n22 n22Var = this.n;
                    c = Intrinsics.c(n22Var == null ? Boolean.valueOf(n22Var.d) : null, Boolean.TRUE);
                    List<PlayerData> players = LineupsResponse.getHomeLineups$default(lineupsResponse3, null, 1, null).getPlayers();
                    ArrayList arrayList = new ArrayList(k13.r(players, 10));
                    for (PlayerData playerData : players) {
                        Player player = playerData.getPlayer();
                        PlayerEventStatistics statistics = playerData.getStatistics();
                        arrayList.add(new xoe(player, null, statistics != null ? statistics.getRating() : null, playerData.getPosition(), Event.getHomeTeam$default(t(), null, 1, null), 1, null));
                    }
                    List<PlayerData> players2 = LineupsResponse.getAwayLineups$default(lineupsResponse3, null, 1, null).getPlayers();
                    ArrayList arrayList2 = new ArrayList(k13.r(players2, 10));
                    for (PlayerData playerData2 : players2) {
                        Player player2 = playerData2.getPlayer();
                        PlayerEventStatistics statistics2 = playerData2.getStatistics();
                        arrayList2.add(new xoe(player2, null, statistics2 != null ? statistics2.getRating() : null, playerData2.getPosition(), Event.getAwayTeam$default(t(), null, 1, null), 2, null));
                    }
                    this.o = CollectionsKt.w0(arrayList2, arrayList);
                    missingPlayers = LineupsResponse.getHomeLineups$default(lineupsResponse3, null, 1, null).getMissingPlayers();
                    if (missingPlayers == null) {
                        missingPlayers = km5.a;
                    }
                    this.p = missingPlayers;
                    missingPlayers2 = LineupsResponse.getAwayLineups$default(lineupsResponse3, null, 1, null).getMissingPlayers();
                    if (missingPlayers2 == null) {
                        missingPlayers2 = km5.a;
                    }
                    this.q = missingPlayers2;
                    if (c) {
                        q9kVar = null;
                    } else {
                        UniqueTournament uniqueTournament = t().getTournament().getUniqueTournament();
                        q9kVar = Intrinsics.c(uniqueTournament != null ? uniqueTournament.getHasLiveRating() : null, Boolean.TRUE) ? new q9k(R.string.sofascore_rating_basketball_box_score) : new q9k(R.string.sofascore_rating_basketball_box_score_finished);
                    }
                    TeamSelection teamSelection = !z2 ? TeamSelection.Combined : TeamSelection.First;
                    int id = Event.getHomeTeam$default(t(), null, 1, null).getId();
                    int id2 = Event.getAwayTeam$default(t(), null, 1, null).getId();
                    int i5 = 4;
                    n(new fv5(teamSelection, l6g.K(new r1h(TeamSelection.First, new tc3(-670283069, new nv5(id, i3), true)), new q1h(TeamSelection.Combined, new tc3(-1675584885, new h66(id, i5), true), new tc3(975433642, new h66(id2, 5), true)), new r1h(TeamSelection.Second, new tc3(-379938431, new nv5(id2, i4), true))), false, t().getSportSlug(), rlh.b, null, null), new gk(c, this, q9kVar, i5));
                }
                lineupsResponse = (LineupsResponse) obj;
                if (lineupsResponse != null) {
                    Set set = wyh.a;
                    boolean g = wyh.g(t().getSportSlug());
                    ArrayList w0 = CollectionsKt.w0(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers());
                    if (Intrinsics.c(ok3.s(t()), Sports.BASKETBALL)) {
                        Tournament tournament = t().getTournament();
                        tournament.getClass();
                        UniqueTournament uniqueTournament2 = tournament.getUniqueTournament();
                        if (uniqueTournament2 != null) {
                            Boolean hasLiveRating = uniqueTournament2.getHasLiveRating();
                            Boolean bool2 = Boolean.TRUE;
                            bool = Boolean.valueOf(Intrinsics.c(hasLiveRating, bool2) || Intrinsics.c(uniqueTournament2.getHasRating(), bool2));
                        } else {
                            bool = null;
                        }
                        Boolean bool3 = Boolean.TRUE;
                        if (Intrinsics.c(bool, bool3)) {
                            yea yeaVar = j58.a;
                            if (j58.k()) {
                                if (ph0.a0(new String[]{StatusKt.STATUS_IN_PROGRESS, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_INTERRUPTED}).contains(t().getStatus().getType())) {
                                    UniqueTournament uniqueTournament3 = t().getTournament().getUniqueTournament();
                                }
                                if (!w0.isEmpty()) {
                                    Iterator it = w0.iterator();
                                    while (it.hasNext()) {
                                        PlayerEventStatistics statistics3 = ((PlayerData) it.next()).getStatistics();
                                        if (yid.k(statistics3 != null ? statistics3.getRating() : null) > 1.0E-4d) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    String sportSlug = t().getSportSlug();
                    int id3 = Event.getHomeTeam$default(t(), null, 1, null).getId();
                    int id4 = Event.getAwayTeam$default(t(), null, 1, null).getId();
                    mv5Var.r = lineupsResponse;
                    mv5Var.s = lineupsResponse;
                    mv5Var.t = this;
                    mv5Var.u = g;
                    mv5Var.x = 2;
                    Object r = s9a.r(new du5(lineupsResponse, z, sportSlug, id3, id4, null), mv5Var);
                    if (r != lu3Var) {
                        ov5Var = this;
                        z2 = g;
                        obj = r;
                        lineupsResponse2 = lineupsResponse;
                        lineupsResponse3 = lineupsResponse2;
                        ov5Var.n = (n22) obj;
                        n22 n22Var2 = this.n;
                        c = Intrinsics.c(n22Var2 == null ? Boolean.valueOf(n22Var2.d) : null, Boolean.TRUE);
                        List<PlayerData> players3 = LineupsResponse.getHomeLineups$default(lineupsResponse3, null, 1, null).getPlayers();
                        ArrayList arrayList3 = new ArrayList(k13.r(players3, 10));
                        while (r4.hasNext()) {
                        }
                        List<PlayerData> players22 = LineupsResponse.getAwayLineups$default(lineupsResponse3, null, 1, null).getPlayers();
                        ArrayList arrayList22 = new ArrayList(k13.r(players22, 10));
                        while (r4.hasNext()) {
                        }
                        this.o = CollectionsKt.w0(arrayList22, arrayList3);
                        missingPlayers = LineupsResponse.getHomeLineups$default(lineupsResponse3, null, 1, null).getMissingPlayers();
                        if (missingPlayers == null) {
                        }
                        this.p = missingPlayers;
                        missingPlayers2 = LineupsResponse.getAwayLineups$default(lineupsResponse3, null, 1, null).getMissingPlayers();
                        if (missingPlayers2 == null) {
                        }
                        this.q = missingPlayers2;
                        if (c) {
                        }
                        TeamSelection teamSelection2 = !z2 ? TeamSelection.Combined : TeamSelection.First;
                        int id5 = Event.getHomeTeam$default(t(), null, 1, null).getId();
                        int id22 = Event.getAwayTeam$default(t(), null, 1, null).getId();
                        int i52 = 4;
                        n(new fv5(teamSelection2, l6g.K(new r1h(TeamSelection.First, new tc3(-670283069, new nv5(id5, i3), true)), new q1h(TeamSelection.Combined, new tc3(-1675584885, new h66(id5, i52), true), new tc3(975433642, new h66(id22, 5), true)), new r1h(TeamSelection.Second, new tc3(-379938431, new nv5(id22, i4), true))), false, t().getSportSlug(), rlh.b, null, null), new gk(c, this, q9kVar, i52));
                    }
                    return lu3Var;
                }
                if (!(this.f.a.getValue() instanceof unb)) {
                    do {
                        fdiVar = this.e;
                        value = fdiVar.getValue();
                        ((vnb) value).getClass();
                    } while (!fdiVar.k(value, new snb()));
                }
                Unit unit = Unit.a;
                return Unit.a;
            }
        }
        mv5Var = new mv5(this, sq3Var);
        Object obj2 = mv5Var.v;
        lu3 lu3Var2 = lu3.a;
        i = mv5Var.x;
        int i32 = 0;
        int i42 = 1;
        if (i != 0) {
        }
        lineupsResponse = (LineupsResponse) obj2;
        if (lineupsResponse != null) {
        }
        if (!(this.f.a.getValue() instanceof unb)) {
        }
        Unit unit2 = Unit.a;
        return Unit.a;
    }
}
