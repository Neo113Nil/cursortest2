package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.WinningOddsResponse;
import com.sofascore.model.newNetwork.TeamStreakBettingOddsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kmd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ umd t;
    public final /* synthetic */ OddsCountryProvider u;
    public final /* synthetic */ Event v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmd(OddsCountryProvider oddsCountryProvider, Event event, umd umdVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.u = oddsCountryProvider;
        this.v = event;
        this.t = umdVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new kmd(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new kmd(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new kmd(this.u, this.v, this.t, rq3Var);
            case 3:
                return new kmd(this.u, this.t, this.v, rq3Var, 3);
            default:
                return new kmd(this.u, this.t, this.v, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((kmd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object P;
        Object d;
        Object e;
        int i = this.r;
        Event event = this.v;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                String type = event.getStatus().getType();
                umd umdVar = this.t;
                jmd jmdVar = new jmd(umdVar, event, rq3Var, 0);
                this.s = 1;
                Object e2 = umd.e(umdVar, this.u, type, jmdVar, this, 4);
                return e2 == lu3Var ? lu3Var : e2;
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
                String type2 = event.getStatus().getType();
                jmd jmdVar2 = new jmd(this.t, event, rq3Var, i2);
                this.s = 1;
                Object d2 = this.t.d(this.u, type2, false, jmdVar2, this);
                return d2 == lu3Var2 ? lu3Var2 : d2;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    rq3 rq3Var2 = null;
                    OddsCountryProvider oddsCountryProvider = this.u;
                    if (oddsCountryProvider == null) {
                        return null;
                    }
                    OddsProvider provider = oddsCountryProvider.getProvider();
                    Event event2 = this.v;
                    imd imdVar = new imd(this.t, event2, provider.getOddsDisplayProviderId(event2.getStatus().getType()), rq3Var2, 2);
                    this.s = 1;
                    P = yaa.P(imdVar, this);
                    if (P == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                return (WinningOddsResponse) yaa.x((x2g) P);
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    String statusType = event.getStatusType();
                    umd umdVar2 = this.t;
                    jmd jmdVar3 = new jmd(umdVar2, event, rq3Var, 2);
                    this.s = 1;
                    d = umdVar2.d(this.u, statusType, false, jmdVar3, this);
                    if (d == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d = obj;
                }
                return (TeamStreakBettingOddsResponse) d;
            default:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    OddsCountryProvider oddsCountryProvider2 = this.u;
                    if (oddsCountryProvider2 == null) {
                        return Boolean.FALSE;
                    }
                    String type3 = event.getStatus().getType();
                    umd umdVar3 = this.t;
                    jmd jmdVar4 = new jmd(umdVar3, event, rq3Var, 3);
                    this.s = 1;
                    e = umd.e(umdVar3, oddsCountryProvider2, type3, jmdVar4, this, 4);
                    if (e == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e = obj;
                }
                return Boolean.valueOf(Intrinsics.c(e, Boolean.TRUE));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmd(OddsCountryProvider oddsCountryProvider, umd umdVar, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = oddsCountryProvider;
        this.t = umdVar;
        this.v = event;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmd(umd umdVar, OddsCountryProvider oddsCountryProvider, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = umdVar;
        this.u = oddsCountryProvider;
        this.v = event;
    }
}
