package defpackage;

import com.sofascore.model.newNetwork.FeaturedPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zy5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ dz5 t;
    public final /* synthetic */ FeaturedPlayer u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy5(dz5 dz5Var, FeaturedPlayer featuredPlayer, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = dz5Var;
        this.u = featuredPlayer;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        FeaturedPlayer featuredPlayer = this.u;
        dz5 dz5Var = this.t;
        switch (i) {
            case 0:
                return new zy5(dz5Var, featuredPlayer, rq3Var, 0);
            default:
                return new zy5(dz5Var, featuredPlayer, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((zy5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        FeaturedPlayer featuredPlayer = this.u;
        dz5 dz5Var = this.t;
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
                wve wveVar = dz5Var.m;
                int id = featuredPlayer.getPlayer().getId();
                this.s = 1;
                wveVar.getClass();
                Object P = yaa.P(new ive(wveVar, id, null, 1), this);
                return P == lu3Var ? lu3Var : P;
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
                wve wveVar2 = dz5Var.m;
                int id2 = featuredPlayer.getPlayer().getId();
                this.s = 1;
                wveVar2.getClass();
                Object P2 = yaa.P(new ive(wveVar2, id2, null, 1), this);
                return P2 == lu3Var2 ? lu3Var2 : P2;
        }
    }
}
