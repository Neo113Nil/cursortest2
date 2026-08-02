package defpackage;

import android.content.Context;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cr5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ mr5 t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cr5(mr5 mr5Var, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = mr5Var;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        mr5 mr5Var = this.t;
        switch (i) {
            case 0:
                return new cr5(mr5Var, event, rq3Var, 0);
            case 1:
                return new cr5(mr5Var, event, rq3Var, 1);
            case 2:
                return new cr5(mr5Var, event, rq3Var, 2);
            case 3:
                return new cr5(mr5Var, event, rq3Var, 3);
            case 4:
                return new cr5(mr5Var, event, rq3Var, 4);
            case 5:
                return new cr5(mr5Var, event, rq3Var, 5);
            case 6:
                return new cr5(mr5Var, event, rq3Var, 6);
            case 7:
                return new cr5(mr5Var, event, rq3Var, 7);
            case 8:
                return new cr5(mr5Var, event, rq3Var, 8);
            case 9:
                return new cr5(mr5Var, event, rq3Var, 9);
            case 10:
                return new cr5(mr5Var, event, rq3Var, 10);
            case 11:
                return new cr5(mr5Var, event, rq3Var, 11);
            case 12:
                return new cr5(mr5Var, event, rq3Var, 12);
            case 13:
                return new cr5(mr5Var, event, rq3Var, 13);
            case 14:
                return new cr5(mr5Var, event, rq3Var, 14);
            default:
                return new cr5(mr5Var, event, rq3Var, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((cr5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object b;
        int id;
        String str;
        int i = this.r;
        Event event = this.u;
        mr5 mr5Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    f5j f5jVar = f5j.a;
                    Context i3 = mr5Var.i();
                    cg4 cg4Var = mr5Var.n;
                    this.s = 1;
                    b = f5jVar.b(i3, event, cg4Var, this);
                    if (b == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    b = obj;
                }
                if (((Boolean) b).booleanValue()) {
                    mr5Var.C.a(Unit.a);
                }
                return Unit.a;
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
                s96 s96Var = mr5Var.f;
                int id2 = event.getId();
                this.s = 1;
                Object H = s96Var.H(id2, this);
                return H == lu3Var2 ? lu3Var2 : H;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var2 = mr5Var.f;
                int id3 = event.getId();
                this.s = 1;
                Object K = s96Var2.K(id3, this);
                return K == lu3Var3 ? lu3Var3 : K;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var3 = mr5Var.f;
                int id4 = event.getId();
                String statusType = event.getStatusType();
                this.s = 1;
                Object E = s96Var3.E(id4, statusType, this);
                return E == lu3Var4 ? lu3Var4 : E;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                s96 s96Var4 = mr5Var.f;
                int id5 = event.getId();
                this.s = 1;
                Object J = s96Var4.J(id5, this);
                return J == lu3Var5 ? lu3Var5 : J;
            case 5:
                lu3 lu3Var6 = lu3.a;
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
                s96 s96Var5 = mr5Var.f;
                int id6 = event.getId();
                this.s = 1;
                Object J2 = s96Var5.J(id6, this);
                return J2 == lu3Var6 ? lu3Var6 : J2;
            case 6:
                lu3 lu3Var7 = lu3.a;
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
                vrj vrjVar = mr5Var.i;
                UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
                int id7 = uniqueTournament != null ? uniqueTournament.getId() : 0;
                Season season = event.getSeason();
                id = season != null ? season.getId() : 0;
                this.s = 1;
                Object b2 = vrjVar.b(id7, id, this);
                return b2 == lu3Var7 ? lu3Var7 : b2;
            case 7:
                lu3 lu3Var8 = lu3.a;
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
                s96 s96Var6 = mr5Var.f;
                int id8 = event.getId();
                this.s = 1;
                Object G = s96Var6.G(id8, this);
                return G == lu3Var8 ? lu3Var8 : G;
            case 8:
                lu3 lu3Var9 = lu3.a;
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
                s96 s96Var7 = mr5Var.f;
                int id9 = event.getId();
                this.s = 1;
                Object J3 = s96Var7.J(id9, this);
                return J3 == lu3Var9 ? lu3Var9 : J3;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar = mr5Var.g;
                int id10 = Event.getAwayTeam$default(event, null, 1, null).getId();
                this.s = 1;
                Object z = j0jVar.z(id10, this);
                return z == lu3Var10 ? lu3Var10 : z;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar2 = mr5Var.g;
                int id11 = Event.getHomeTeam$default(event, null, 1, null).getId();
                this.s = 1;
                Object z2 = j0jVar2.z(id11, this);
                return z2 == lu3Var11 ? lu3Var11 : z2;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var8 = mr5Var.f;
                int id12 = event.getId();
                this.s = 1;
                Object I = s96Var8.I(id12, this);
                return I == lu3Var12 ? lu3Var12 : I;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                pai paiVar = mr5Var.h;
                int id13 = event.getTournament().getId();
                Season season2 = event.getSeason();
                id = season2 != null ? season2.getId() : 0;
                rv8 rv8Var = rv8.b;
                this.s = 1;
                Object c = paiVar.c(id13, id, this, U3.i.l);
                return c == lu3Var13 ? lu3Var13 : c;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar3 = mr5Var.g;
                int id14 = Event.getAwayTeam$default(event, null, 1, null).getId();
                UniqueTournament uniqueTournament2 = event.getTournament().getUniqueTournament();
                int id15 = uniqueTournament2 != null ? uniqueTournament2.getId() : 0;
                Season season3 = event.getSeason();
                id = season3 != null ? season3.getId() : 0;
                String seasonStatisticsType = event.getSeasonStatisticsType();
                str = seasonStatisticsType != null ? seasonStatisticsType : "";
                this.s = 1;
                Object F = j0jVar3.F(id14, id15, id, this, str);
                return F == lu3Var14 ? lu3Var14 : F;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar4 = mr5Var.g;
                int id16 = Event.getHomeTeam$default(event, null, 1, null).getId();
                UniqueTournament uniqueTournament3 = event.getTournament().getUniqueTournament();
                int id17 = uniqueTournament3 != null ? uniqueTournament3.getId() : 0;
                Season season4 = event.getSeason();
                id = season4 != null ? season4.getId() : 0;
                String seasonStatisticsType2 = event.getSeasonStatisticsType();
                str = seasonStatisticsType2 != null ? seasonStatisticsType2 : "";
                this.s = 1;
                Object F2 = j0jVar4.F(id16, id17, id, this, str);
                return F2 == lu3Var15 ? lu3Var15 : F2;
            default:
                lu3 lu3Var16 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var9 = mr5Var.f;
                int id18 = event.getId();
                this.s = 1;
                Object o = s96Var9.o(id18, null, this);
                return o == lu3Var16 ? lu3Var16 : o;
        }
    }
}
