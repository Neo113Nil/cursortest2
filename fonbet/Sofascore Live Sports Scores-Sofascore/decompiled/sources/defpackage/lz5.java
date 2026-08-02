package defpackage;

import com.sofascore.model.newNetwork.EsportsGame;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lz5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ nz5 t;
    public final /* synthetic */ EsportsGame u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz5(nz5 nz5Var, EsportsGame esportsGame, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = nz5Var;
        this.u = esportsGame;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        EsportsGame esportsGame = this.u;
        nz5 nz5Var = this.t;
        switch (i) {
            case 0:
                return new lz5(nz5Var, esportsGame, rq3Var, 0);
            case 1:
                return new lz5(nz5Var, esportsGame, rq3Var, 1);
            case 2:
                return new lz5(nz5Var, esportsGame, rq3Var, 2);
            default:
                return new lz5(nz5Var, esportsGame, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lz5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        EsportsGame esportsGame = this.u;
        nz5 nz5Var = this.t;
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
                zf5 zf5Var = nz5Var.e;
                this.s = 1;
                zf5Var.getClass();
                Object r = s9a.r(new yf5(zf5Var, esportsGame, null, 0), this);
                return r == lu3Var ? lu3Var : r;
            case 1:
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
                zf5 zf5Var2 = nz5Var.e;
                this.s = 1;
                zf5Var2.getClass();
                Object r2 = s9a.r(new yf5(zf5Var2, esportsGame, null, 1), this);
                return r2 == lu3Var2 ? lu3Var2 : r2;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                zf5 zf5Var3 = nz5Var.e;
                this.s = 1;
                zf5Var3.getClass();
                Object r3 = s9a.r(new yf5(zf5Var3, esportsGame, null, 3), this);
                return r3 == lu3Var3 ? lu3Var3 : r3;
            default:
                lu3 lu3Var4 = lu3.a;
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
                zf5 zf5Var4 = nz5Var.e;
                this.s = 1;
                zf5Var4.getClass();
                Object r4 = s9a.r(new yf5(zf5Var4, esportsGame, null, 2), this);
                return r4 == lu3Var4 ? lu3Var4 : r4;
        }
    }
}
