package defpackage;

import com.sofascore.model.newNetwork.EsportsGame;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yf5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ zf5 t;
    public final /* synthetic */ EsportsGame u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf5(zf5 zf5Var, EsportsGame esportsGame, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = zf5Var;
        this.u = esportsGame;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        EsportsGame esportsGame = this.u;
        zf5 zf5Var = this.t;
        switch (i) {
            case 0:
                return new yf5(zf5Var, esportsGame, rq3Var, 0);
            case 1:
                return new yf5(zf5Var, esportsGame, rq3Var, 1);
            case 2:
                return new yf5(zf5Var, esportsGame, rq3Var, 2);
            default:
                return new yf5(zf5Var, esportsGame, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((yf5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        EsportsGame esportsGame = this.u;
        zf5 zf5Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    xf5 xf5Var = new xf5(zf5Var, esportsGame, null, 0);
                    this.s = 1;
                    obj = yaa.P(xf5Var, this);
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
                return yaa.x((x2g) obj);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    xf5 xf5Var2 = new xf5(zf5Var, esportsGame, null, 1);
                    this.s = 1;
                    obj = yaa.P(xf5Var2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    xf5 xf5Var3 = new xf5(zf5Var, esportsGame, null, 2);
                    this.s = 1;
                    obj = yaa.P(xf5Var3, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    xf5 xf5Var4 = new xf5(zf5Var, esportsGame, null, 3);
                    this.s = 1;
                    obj = yaa.P(xf5Var4, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
        }
    }
}
