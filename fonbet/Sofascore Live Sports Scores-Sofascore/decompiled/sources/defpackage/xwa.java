package defpackage;

import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xwa extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ zwa t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwa(zwa zwaVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = zwaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        zwa zwaVar = this.t;
        switch (i) {
            case 0:
                return new xwa(zwaVar, rq3Var, 0);
            case 1:
                return new xwa(zwaVar, rq3Var, 1);
            default:
                return new xwa(zwaVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xwa) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Venue venue;
        Venue venue2;
        Integer num = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    zwa zwaVar = this.t;
                    z = false;
                    if (zwaVar.v() == null) {
                        w3b w3bVar = zwaVar.e;
                        Tournament tournament = zwaVar.j;
                        if (tournament == null) {
                            Intrinsics.i("tournament");
                            throw null;
                        }
                        UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                        int id = uniqueTournament != null ? uniqueTournament.getId() : 0;
                        Season season = zwaVar.k;
                        int id2 = season != null ? season.getId() : 0;
                        this.s = 1;
                        obj = w3bVar.P(id, id2, this);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                t6e t6eVar = t6e.a;
                zwa zwaVar2 = this.t;
                iya n = zwaVar2.n();
                UniqueTournamentGroup uniqueTournamentGroup = n != null ? (UniqueTournamentGroup) n.a : null;
                jya o = zwaVar2.o();
                Round round = o != null ? (Round) o.a : null;
                Team u = zwaVar2.u();
                Integer num2 = u != null ? new Integer(u.getId()) : null;
                hya v = zwaVar2.v();
                Integer num3 = (v == null || (venue = (Venue) v.a) == null) ? null : new Integer(venue.getId());
                this.s = 1;
                Object k = zwaVar2.k(t6eVar, 0, uniqueTournamentGroup, round, num2, num3, this);
                return k == lu3Var2 ? lu3Var2 : k;
            default:
                lu3 lu3Var3 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                t6e t6eVar2 = t6e.b;
                zwa zwaVar3 = this.t;
                iya n2 = zwaVar3.n();
                UniqueTournamentGroup uniqueTournamentGroup2 = n2 != null ? (UniqueTournamentGroup) n2.a : null;
                jya o2 = zwaVar3.o();
                Round round2 = o2 != null ? (Round) o2.a : null;
                Team u2 = zwaVar3.u();
                Integer num4 = u2 != null ? new Integer(u2.getId()) : null;
                hya v2 = zwaVar3.v();
                if (v2 != null && (venue2 = (Venue) v2.a) != null) {
                    num = new Integer(venue2.getId());
                }
                this.s = 1;
                Object k2 = zwaVar3.k(t6eVar2, 0, uniqueTournamentGroup2, round2, num4, num, this);
                return k2 == lu3Var3 ? lu3Var3 : k2;
        }
    }
}
