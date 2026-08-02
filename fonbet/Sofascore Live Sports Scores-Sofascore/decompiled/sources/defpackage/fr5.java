package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.OddsCountryProvider;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fr5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ mr5 t;
    public final /* synthetic */ Event u;
    public final /* synthetic */ List v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr5(mr5 mr5Var, Event event, List list, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = mr5Var;
        this.u = event;
        this.v = list;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new fr5(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new fr5(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((fr5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        List list = this.v;
        mr5 mr5Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                umd umdVar = mr5Var.k;
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.Y(list);
                this.s = 1;
                umdVar.getClass();
                Object r = s9a.r(new kmd(oddsCountryProvider, umdVar, this.u, (rq3) null, 4), this);
                return r == lu3Var ? lu3Var : r;
            default:
                lu3 lu3Var2 = lu3.a;
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
                umd umdVar2 = mr5Var.k;
                OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) CollectionsKt.firstOrNull(list);
                this.s = 1;
                umdVar2.getClass();
                Object r2 = s9a.r(new kmd(oddsCountryProvider2, umdVar2, this.u, (rq3) null, 4), this);
                return r2 == lu3Var2 ? lu3Var2 : r2;
        }
    }
}
