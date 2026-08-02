package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class omd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ int t;
    public final /* synthetic */ umd u;
    public final /* synthetic */ Stage v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ omd(umd umdVar, Stage stage, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = umdVar;
        this.v = stage;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Stage stage = this.v;
        umd umdVar = this.u;
        switch (i) {
            case 0:
                omd omdVar = new omd(umdVar, stage, rq3Var, 0);
                omdVar.t = ((Number) obj).intValue();
                return omdVar;
            default:
                omd omdVar2 = new omd(umdVar, stage, rq3Var, 1);
                omdVar2.t = ((Number) obj).intValue();
                return omdVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        int intValue = ((Number) obj).intValue();
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
        }
        return ((omd) create(Integer.valueOf(intValue), rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    nmd nmdVar = new nmd(this.u, this.v, i2, null, 0);
                    this.t = i2;
                    this.s = 1;
                    obj = yaa.P(nmdVar, this);
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
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    nmd nmdVar2 = new nmd(this.u, this.v, i2, null, 1);
                    this.t = i2;
                    this.s = 1;
                    obj = yaa.P(nmdVar2, this);
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
                return yaa.x((x2g) obj);
        }
    }
}
