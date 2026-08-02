package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import com.sofascore.model.newNetwork.UniqueTournamentGroupsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentRoundsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentVenuesResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lzwa;", "Lq8;", "vwa", "uwa", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class zwa extends q8 {
    public final w3b e;
    public final yzc f;
    public final yzc g;
    public final yzc h;
    public final yzc i;
    public Tournament j;
    public Season k;
    public final fdi l;
    public final jof m;
    public final fdi n;
    public final jof o;
    public uwa p;
    public final LinkedHashMap q;
    public final mqi r;
    public final mqi s;
    public final mqi t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwa(w3b w3bVar, Application application) {
        super(application);
        w3bVar.getClass();
        this.e = w3bVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
        yzc yzcVar2 = new yzc();
        this.h = yzcVar2;
        this.i = yzcVar2;
        fdi a = gdi.a(rlh.b);
        this.l = a;
        this.m = un0.u(a);
        fdi a2 = gdi.a(null);
        this.n = a2;
        this.o = un0.u(a2);
        this.p = uwa.c;
        this.q = new LinkedHashMap();
        this.r = ypa.b(new sr8(this, 21));
        this.s = ypa.b(new ila(6));
        this.t = ypa.b(new ila(7));
    }

    public final Object k(t6e t6eVar, int i, UniqueTournamentGroup uniqueTournamentGroup, Round round, Integer num, Integer num2, hoi hoiVar) {
        Season season = this.k;
        Integer num3 = season != null ? new Integer(season.getId()) : null;
        Tournament tournament = this.j;
        if (tournament == null) {
            Intrinsics.i("tournament");
            throw null;
        }
        UniqueTournament uniqueTournament = tournament.getUniqueTournament();
        Integer num4 = uniqueTournament != null ? new Integer(uniqueTournament.getId()) : null;
        if (num3 != null && num4 != null) {
            return l(t6eVar, i, uniqueTournamentGroup, round, num, num2, num3, num4.intValue(), hoiVar);
        }
        if (num3 != null) {
            Tournament tournament2 = this.j;
            if (tournament2 != null) {
                return this.e.m0(tournament2.getId(), num3.intValue(), i, hoiVar, t6eVar.toString());
            }
            Intrinsics.i("tournament");
            throw null;
        }
        if (num4 != null) {
            return l(t6eVar, i, uniqueTournamentGroup, round, num, num2, null, num4.intValue(), hoiVar);
        }
        Tournament tournament3 = this.j;
        if (tournament3 != null) {
            return this.e.k0(tournament3.getId(), i, hoiVar, t6eVar.toString());
        }
        Intrinsics.i("tournament");
        throw null;
    }

    public final Object l(t6e t6eVar, int i, UniqueTournamentGroup uniqueTournamentGroup, Round round, Integer num, Integer num2, Integer num3, int i2, hoi hoiVar) {
        if (round != null) {
            w3b w3bVar = this.e;
            if (num3 == null) {
                return w3bVar.v0(i2, i, hoiVar, null, t6eVar.toString());
            }
            int intValue = num3.intValue();
            Integer round2 = round.getRound();
            return w3bVar.B0(i2, intValue, round2 != null ? round2.intValue() : 0, round.getSlug(), round.getPrefix(), t6eVar.toString(), i, hoiVar);
        }
        if (uniqueTournamentGroup != null) {
            w3b w3bVar2 = this.e;
            return num3 != null ? w3bVar2.m0(uniqueTournamentGroup.getTournamentId(), num3.intValue(), i, hoiVar, t6eVar.toString()) : w3bVar2.k0(uniqueTournamentGroup.getTournamentId(), i, hoiVar, t6eVar.toString());
        }
        if (num != null) {
            w3b w3bVar3 = this.e;
            return num3 != null ? w3bVar3.H0(i2, num3.intValue(), num.intValue(), t6eVar.toString(), i, hoiVar) : w3bVar3.v0(i2, i, hoiVar, null, t6eVar.toString());
        }
        w3b w3bVar4 = this.e;
        return num2 != null ? num3 != null ? w3bVar4.K0(i2, num3.intValue(), num2.intValue(), t6eVar.toString(), i, hoiVar) : w3bVar4.v0(i2, i, hoiVar, null, t6eVar.toString()) : w3bVar4.v0(i2, i, hoiVar, num3, t6eVar.toString());
    }

    public final void m() {
        xw3.L(un0.z(this), null, null, new ywa(this, null), 3);
    }

    public final iya n() {
        uwa uwaVar = uwa.e;
        Object obj = this.q.get(uwaVar);
        if (this.p != uwaVar) {
            obj = null;
        }
        if (obj instanceof iya) {
            return (iya) obj;
        }
        return null;
    }

    public final jya o() {
        uwa uwaVar = uwa.d;
        Object obj = this.q.get(uwaVar);
        if (this.p != uwaVar) {
            obj = null;
        }
        if (obj instanceof jya) {
            return (jya) obj;
        }
        return null;
    }

    public final void t() {
        int ordinal = this.p.ordinal();
        this.n.l(ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? null : v() : n() : o());
    }

    public final Team u() {
        int ordinal = this.p.ordinal();
        if (ordinal != 3 && ordinal != 4) {
            return null;
        }
        Object obj = this.q.get(this.p);
        if (obj instanceof Team) {
            return (Team) obj;
        }
        return null;
    }

    public final hya v() {
        uwa uwaVar = uwa.f;
        Object obj = this.q.get(uwaVar);
        if (this.p != uwaVar) {
            obj = null;
        }
        if (obj instanceof hya) {
            return (hya) obj;
        }
        return null;
    }

    public final void w() {
        Iterable<kya> iterable;
        UniqueTournamentRoundsResponse uniqueTournamentRoundsResponse;
        List<Round> rounds;
        UniqueTournamentGroupsResponse uniqueTournamentGroupsResponse;
        List<UniqueTournamentGroup> groups;
        UniqueTournamentVenuesResponse uniqueTournamentVenuesResponse;
        List<Venue> venues;
        int ordinal = this.p.ordinal();
        ArrayList arrayList = null;
        yzc yzcVar = this.h;
        if (ordinal == 1) {
            vwa vwaVar = (vwa) yzcVar.d();
            if (vwaVar != null && (uniqueTournamentRoundsResponse = vwaVar.a) != null && (rounds = uniqueTournamentRoundsResponse.getRounds()) != null) {
                ArrayList arrayList2 = new ArrayList(k13.r(rounds, 10));
                for (Round round : rounds) {
                    Tournament tournament = this.j;
                    if (tournament == null) {
                        Intrinsics.i("tournament");
                        throw null;
                    }
                    arrayList2.add(new jya(round, tournament.getCategory().getSport().getSlug()));
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                iterable = km5.a;
            }
            iterable = arrayList;
        } else if (ordinal == 2) {
            vwa vwaVar2 = (vwa) yzcVar.d();
            if (vwaVar2 != null && (uniqueTournamentGroupsResponse = vwaVar2.b) != null && (groups = uniqueTournamentGroupsResponse.getGroups()) != null) {
                arrayList = new ArrayList(k13.r(groups, 10));
                Iterator<T> it = groups.iterator();
                while (it.hasNext()) {
                    arrayList.add(new iya((UniqueTournamentGroup) it.next()));
                }
            }
            if (arrayList == null) {
                iterable = km5.a;
            }
            iterable = arrayList;
        } else if (ordinal != 5) {
            iterable = km5.a;
        } else {
            vwa vwaVar3 = (vwa) yzcVar.d();
            if (vwaVar3 != null && (uniqueTournamentVenuesResponse = vwaVar3.d) != null && (venues = uniqueTournamentVenuesResponse.getVenues()) != null) {
                arrayList = new ArrayList(k13.r(venues, 10));
                Iterator<T> it2 = venues.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new hya((Venue) it2.next()));
                }
            }
            if (arrayList == null) {
                iterable = km5.a;
            }
            iterable = arrayList;
        }
        ArrayList arrayList3 = new ArrayList(k13.r(iterable, 10));
        for (kya kyaVar : iterable) {
            arrayList3.add(new oxh(kyaVar, kyaVar.a(i()), null, null, null, false, 252));
        }
        this.l.l(l6g.W(arrayList3));
        t();
    }

    public final int x() {
        Tournament tournament = this.j;
        if (tournament != null) {
            UniqueTournament uniqueTournament = tournament.getUniqueTournament();
            return yid.m(uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null);
        }
        Intrinsics.i("tournament");
        throw null;
    }
}
