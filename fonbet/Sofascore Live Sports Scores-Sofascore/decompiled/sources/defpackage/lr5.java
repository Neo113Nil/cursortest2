package defpackage;

import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import kotlin.Unit;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lr5 extends hoi implements ct8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ b98 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ bt7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr5(rq3 rq3Var, bt7 bt7Var, int i) {
        super(3, rq3Var);
        this.r = i;
        this.v = bt7Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        bt7 bt7Var = this.v;
        b98 b98Var = (b98) obj;
        rq3 rq3Var = (rq3) obj3;
        switch (i) {
            case 0:
                lr5 lr5Var = new lr5(rq3Var, bt7Var, 0);
                lr5Var.t = b98Var;
                lr5Var.u = obj2;
                return lr5Var.invokeSuspend(Unit.a);
            case 1:
                lr5 lr5Var2 = new lr5(rq3Var, bt7Var, 1);
                lr5Var2.t = b98Var;
                lr5Var2.u = obj2;
                return lr5Var2.invokeSuspend(Unit.a);
            case 2:
                lr5 lr5Var3 = new lr5(rq3Var, bt7Var, 2);
                lr5Var3.t = b98Var;
                lr5Var3.u = obj2;
                return lr5Var3.invokeSuspend(Unit.a);
            case 3:
                lr5 lr5Var4 = new lr5(rq3Var, bt7Var, 3);
                lr5Var4.t = b98Var;
                lr5Var4.u = obj2;
                return lr5Var4.invokeSuspend(Unit.a);
            case 4:
                lr5 lr5Var5 = new lr5(rq3Var, bt7Var, 4);
                lr5Var5.t = b98Var;
                lr5Var5.u = obj2;
                return lr5Var5.invokeSuspend(Unit.a);
            default:
                lr5 lr5Var6 = new lr5(rq3Var, bt7Var, 5);
                lr5Var6.t = b98Var;
                lr5Var6.u = obj2;
                return lr5Var6.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        z88 a;
        int i = this.r;
        bt7 bt7Var = this.v;
        switch (i) {
            case 0:
                b98 b98Var = this.t;
                Object obj2 = this.u;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    Event event = (Event) obj2;
                    if (event == null) {
                        a = new wf2(null, 6);
                    } else {
                        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                        Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                        xbb b = a.b();
                        b.add(Integer.valueOf(homeTeam$default.getId()));
                        SubTeam subTeam1 = homeTeam$default.getSubTeam1();
                        if (subTeam1 != null) {
                            b.add(Integer.valueOf(subTeam1.getId()));
                        }
                        SubTeam subTeam2 = homeTeam$default.getSubTeam2();
                        if (subTeam2 != null) {
                            b.add(Integer.valueOf(subTeam2.getId()));
                        }
                        b.add(Integer.valueOf(awayTeam$default.getId()));
                        SubTeam subTeam12 = awayTeam$default.getSubTeam1();
                        if (subTeam12 != null) {
                            b.add(Integer.valueOf(subTeam12.getId()));
                        }
                        SubTeam subTeam22 = awayTeam$default.getSubTeam2();
                        if (subTeam22 != null) {
                            b.add(Integer.valueOf(subTeam22.getId()));
                        }
                        a = bt7Var.a(Integer.valueOf(event.getId()), o3a.F(event.getTournament()), a.a(b));
                    }
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var, a, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                b98 b98Var2 = this.t;
                Object obj3 = this.u;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    UniqueTournament uniqueTournament = (UniqueTournament) obj3;
                    z88 b2 = bt7Var.b(uniqueTournament != null ? new Integer(uniqueTournament.getId()) : null);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var2, b2, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                b98 b98Var3 = this.t;
                Object obj4 = this.u;
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Team team = (Team) obj4;
                    z88 a2 = team != null ? bt7Var.a(null, null, a.c(new Integer(team.getId()))) : new wf2(new FavoritesEventsData(null, null, null, 7, null), 6);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var3, a2, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 3:
                b98 b98Var4 = this.t;
                Object obj5 = this.u;
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    UniqueTournament uniqueTournament2 = (UniqueTournament) obj5;
                    z88 b3 = bt7Var.b(uniqueTournament2 != null ? new Integer(uniqueTournament2.getId()) : null);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var4, b3, this) == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 4:
                b98 b98Var5 = this.t;
                Object obj6 = this.u;
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    Team team2 = (Team) obj6;
                    z88 a3 = team2 != null ? bt7Var.a(null, null, a.c(new Integer(team2.getId()))) : new wf2(new FavoritesEventsData(null, null, null, 7, null), 6);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var5, a3, this) == lu3Var5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                b98 b98Var6 = this.t;
                Object obj7 = this.u;
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    Team team3 = (Team) obj7;
                    z88 a4 = team3 != null ? bt7Var.a(null, null, a.c(new Integer(team3.getId()))) : new wf2(new FavoritesEventsData(null, null, null, 7, null), 6);
                    this.t = null;
                    this.u = null;
                    this.s = 1;
                    if (fcp.g0(b98Var6, a4, this) == lu3Var6) {
                        break;
                    }
                } else if (i7 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
