package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.odds.ProviderOdds;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jmd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ int t;
    public final /* synthetic */ umd u;
    public final /* synthetic */ Event v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmd(umd umdVar, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = umdVar;
        this.v = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Event event = this.v;
        umd umdVar = this.u;
        switch (i) {
            case 0:
                jmd jmdVar = new jmd(umdVar, event, rq3Var, 0);
                jmdVar.t = ((Number) obj).intValue();
                return jmdVar;
            case 1:
                jmd jmdVar2 = new jmd(umdVar, event, rq3Var, 1);
                jmdVar2.t = ((Number) obj).intValue();
                return jmdVar2;
            case 2:
                jmd jmdVar3 = new jmd(umdVar, event, rq3Var, 2);
                jmdVar3.t = ((Number) obj).intValue();
                return jmdVar3;
            default:
                jmd jmdVar4 = new jmd(umdVar, event, rq3Var, 3);
                jmdVar4.t = ((Number) obj).intValue();
                return jmdVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        int intValue = ((Number) obj).intValue();
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
        }
        return ((jmd) create(Integer.valueOf(intValue), rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                Event event = this.v;
                if (i3 == 0) {
                    y6a.M(obj);
                    imd imdVar = new imd(this.u, event, i2, null, 0);
                    this.t = i2;
                    this.s = 1;
                    obj = yaa.P(imdVar, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FeaturedOddsResponse featuredOddsResponse = (FeaturedOddsResponse) yaa.x((x2g) obj);
                if (featuredOddsResponse == null) {
                    return null;
                }
                Iterator<T> it = featuredOddsResponse.getFeatured().values().iterator();
                while (it.hasNext()) {
                    ((ProviderOdds) it.next()).setShouldReverseOdds(event.shouldReverseTeams());
                }
                return featuredOddsResponse;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                Event event2 = this.v;
                if (i4 == 0) {
                    y6a.M(obj);
                    imd imdVar2 = new imd(this.u, event2, i2, null, 1);
                    this.t = i2;
                    this.s = 1;
                    obj = yaa.P(imdVar2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FeaturedOddsResponse featuredOddsResponse2 = (FeaturedOddsResponse) yaa.x((x2g) obj);
                if (featuredOddsResponse2 == null) {
                    return null;
                }
                Iterator<T> it2 = featuredOddsResponse2.getFeatured().values().iterator();
                while (it2.hasNext()) {
                    ((ProviderOdds) it2.next()).setShouldReverseOdds(event2.shouldReverseTeams());
                }
                return featuredOddsResponse2;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    imd imdVar3 = new imd(this.u, this.v, i2, null, 3);
                    this.t = i2;
                    this.s = 1;
                    obj = yaa.P(imdVar3, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            default:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    imd imdVar4 = new imd(this.u, this.v, i2, null, 4);
                    this.t = i2;
                    this.s = 1;
                    obj = yaa.P(imdVar4, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                boolean z = x2gVar instanceof v2g;
                Boolean valueOf = Boolean.valueOf(z);
                if (z) {
                    return valueOf;
                }
                return null;
        }
    }
}
