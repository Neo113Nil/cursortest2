package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pmd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ umd t;
    public final /* synthetic */ OddsCountryProvider u;
    public final /* synthetic */ Stage v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pmd(umd umdVar, OddsCountryProvider oddsCountryProvider, Stage stage, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = umdVar;
        this.u = oddsCountryProvider;
        this.v = stage;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new pmd(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new pmd(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((pmd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Stage stage = this.v;
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
                String statusType = stage.getStatusType();
                umd umdVar = this.t;
                omd omdVar = new omd(umdVar, stage, rq3Var, 0);
                this.s = 1;
                Object e = umd.e(umdVar, this.u, statusType, omdVar, this, 4);
                return e == lu3Var ? lu3Var : e;
            default:
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
                String statusType2 = stage.getStatusType();
                omd omdVar2 = new omd(this.t, stage, rq3Var, i2);
                this.s = 1;
                Object e2 = umd.e(this.t, this.u, statusType2, omdVar2, this, 4);
                return e2 == lu3Var2 ? lu3Var2 : e2;
        }
    }
}
