package defpackage;

import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.GoalDistributionsResponse;
import com.sofascore.model.network.response.WinningOddsResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v26 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ c36 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v26(int i, rq3 rq3Var, c36 c36Var) {
        super(2, rq3Var);
        this.r = i;
        this.t = c36Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        c36 c36Var = this.t;
        switch (i) {
            case 0:
                return new v26(0, rq3Var, c36Var);
            case 1:
                return new v26(1, rq3Var, c36Var);
            case 2:
                return new v26(2, rq3Var, c36Var);
            case 3:
                return new v26(3, rq3Var, c36Var);
            case 4:
                return new v26(4, rq3Var, c36Var);
            case 5:
                return new v26(5, rq3Var, c36Var);
            case 6:
                return new v26(6, rq3Var, c36Var);
            case 7:
                return new v26(7, rq3Var, c36Var);
            default:
                return new v26(8, rq3Var, c36Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((v26) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Season season;
        Season season2;
        int i = this.r;
        int i2 = 2;
        c36 c36Var = this.t;
        int i3 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                int id = Event.getHomeTeam$default(c36Var.k(), null, 1, null).getId();
                this.s = 1;
                Object r = s9a.r(new f54(id, (rq3) null, c36Var), this);
                return r == lu3Var ? lu3Var : r;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    c36 c36Var2 = this.t;
                    UniqueTournament uniqueTournament = c36Var2.k().getTournament().getUniqueTournament();
                    if (uniqueTournament == null || (season = c36Var2.k().getSeason()) == null) {
                        return null;
                    }
                    int id2 = c36Var2.k().getAwayTeam(TeamSides.ORIGINAL).getId();
                    int id3 = uniqueTournament.getId();
                    int id4 = season.getId();
                    this.s = 1;
                    obj = s9a.r(new x26(c36Var2, id2, id3, id4, null, 0), this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (GoalDistributionsResponse) obj;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    c36 c36Var3 = this.t;
                    UniqueTournament uniqueTournament2 = c36Var3.k().getTournament().getUniqueTournament();
                    if (uniqueTournament2 == null || (season2 = c36Var3.k().getSeason()) == null) {
                        return null;
                    }
                    int id5 = c36Var3.k().getHomeTeam(TeamSides.ORIGINAL).getId();
                    int id6 = uniqueTournament2.getId();
                    int id7 = season2.getId();
                    this.s = 1;
                    obj = s9a.r(new x26(c36Var3, id5, id6, id7, null, 0), this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (GoalDistributionsResponse) obj;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                String customId = c36Var.k().getCustomId();
                this.s = 1;
                Object l = c36Var.l(customId, this);
                return l == lu3Var4 ? lu3Var4 : l;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Event k = c36Var.k();
                this.s = 1;
                Object r2 = s9a.r(new y26(c36Var, k, rq3Var, 0), this);
                return r2 == lu3Var5 ? lu3Var5 : r2;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Event k2 = c36Var.k();
                this.s = 1;
                Object r3 = s9a.r(new y26(c36Var, k2, rq3Var, i3), this);
                return r3 == lu3Var6 ? lu3Var6 : r3;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                int id8 = Event.getAwayTeam$default(c36Var.k(), null, 1, null).getId();
                this.s = 1;
                Object r4 = s9a.r(new f54(id8, (rq3) null, c36Var), this);
                return r4 == lu3Var7 ? lu3Var7 : r4;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                int id9 = c36Var.k().getId();
                this.s = 1;
                Object r5 = s9a.r(new b36(c36Var, id9, null, 2), this);
                return r5 == lu3Var8 ? lu3Var8 : r5;
            default:
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    int i13 = ke0.c;
                    ArrayList arrayList = dv3.a;
                    Country b = dv3.b(new Integer(i13));
                    String iso2Alpha = b != null ? b.getIso2Alpha() : null;
                    yea yeaVar = j58.a;
                    if (j58.i(ok3.v(c36Var.k()), iso2Alpha)) {
                        return null;
                    }
                    Event k3 = c36Var.k();
                    this.s = 1;
                    obj = s9a.r(new y26(c36Var, k3, rq3Var, i2), this);
                    if (obj == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (WinningOddsResponse) obj;
        }
    }
}
