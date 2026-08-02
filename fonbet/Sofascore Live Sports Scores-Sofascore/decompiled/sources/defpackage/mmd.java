package defpackage;

import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mmd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ umd t;
    public final /* synthetic */ OddsCountryProvider u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmd(OddsCountryProvider oddsCountryProvider, umd umdVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.u = oddsCountryProvider;
        this.t = umdVar;
        this.v = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new mmd(this.u, this.t, this.v, rq3Var);
            case 1:
                return new mmd(this.t, this.u, this.v, rq3Var, 1);
            default:
                return new mmd(this.t, this.u, this.v, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((mmd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    fmd fmdVar = new fmd(this.t, this.v, OddsProvider.getOddsDisplayProviderId$default(this.u.getProvider(), null, 1, null), null, 2);
                    this.s = 1;
                    obj = yaa.P(fmdVar, this);
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
                return yaa.x((x2g) obj);
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
                umd umdVar = this.t;
                qmd qmdVar = new qmd(umdVar, i2, null, 0);
                this.s = 1;
                Object e = umd.e(umdVar, this.u, null, qmdVar, this, 4);
                return e == lu3Var2 ? lu3Var2 : e;
            default:
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
                umd umdVar2 = this.t;
                qmd qmdVar2 = new qmd(umdVar2, i2, null, 1);
                this.s = 1;
                Object e2 = umd.e(umdVar2, this.u, null, qmdVar2, this, 4);
                return e2 == lu3Var3 ? lu3Var3 : e2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mmd(umd umdVar, OddsCountryProvider oddsCountryProvider, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = umdVar;
        this.u = oddsCountryProvider;
        this.v = i;
    }
}
