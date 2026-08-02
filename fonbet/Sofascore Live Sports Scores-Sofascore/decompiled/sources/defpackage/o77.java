package defpackage;

import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetitionResponse;
import com.sofascore.model.fantasy.FantasyUserRoundSquadResponse;
import com.sofascore.model.fantasy.FantasyUserSquad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o77 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ r77 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o77(r77 r77Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = r77Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        r77 r77Var = this.t;
        switch (i) {
            case 0:
                return new o77(r77Var, rq3Var, 0);
            case 1:
                return new o77(r77Var, rq3Var, 1);
            case 2:
                return new o77(r77Var, rq3Var, 2);
            default:
                return new o77(r77Var, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((o77) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        FantasyUserSquad squad;
        List<FantasyRoundPlayer> players;
        FantasyUserCompetition userCompetition;
        int i = this.r;
        r77 r77Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = r77Var.l;
                    int i3 = r77Var.n.c.c;
                    this.s = 1;
                    wi7Var.getClass();
                    obj = yaa.P(new hg7(wi7Var, i3, null, 1), this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ky6 ky6Var = r77Var.m;
                String str = r77Var.p;
                ev6 ev6Var = r77Var.n.c;
                int i5 = ev6Var.c;
                int i6 = ev6Var.n;
                Long l = ev6Var.i.h;
                long longValue = l != null ? l.longValue() : 0L;
                this.s = 1;
                ky6Var.getClass();
                Object r = s9a.r(new iy6(ky6Var, i5, longValue, i6, str, null), this);
                return r == lu3Var2 ? lu3Var2 : r;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = r77Var.l;
                    String str2 = r77Var.p;
                    int i8 = r77Var.n.c.n;
                    this.s = 1;
                    obj = wi7Var2.W(i8, str2, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyUserRoundSquadResponse fantasyUserRoundSquadResponse = (FantasyUserRoundSquadResponse) obj;
                if (fantasyUserRoundSquadResponse == null || (squad = fantasyUserRoundSquadResponse.getSquad()) == null || (players = squad.getPlayers()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(k13.r(players, 10));
                Iterator<T> it = players.iterator();
                while (it.hasNext()) {
                    arrayList.add(hkg.g0((FantasyRoundPlayer) it.next(), r77Var.i()));
                }
                return arrayList;
            default:
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var3 = r77Var.l;
                    String str3 = r77Var.p;
                    int i10 = r77Var.n.c.c;
                    this.s = 1;
                    obj = wi7Var3.N(i10, str3, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyUserCompetitionResponse fantasyUserCompetitionResponse = (FantasyUserCompetitionResponse) obj;
                if (fantasyUserCompetitionResponse == null || (userCompetition = fantasyUserCompetitionResponse.getUserCompetition()) == null) {
                    return null;
                }
                return fkf.O(userCompetition, r77Var.i());
        }
    }
}
