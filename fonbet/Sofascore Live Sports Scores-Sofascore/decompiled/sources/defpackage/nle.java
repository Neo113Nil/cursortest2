package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nle extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ple t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nle(ple pleVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = pleVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ple pleVar = this.t;
        switch (i) {
            case 0:
                return new nle(pleVar, rq3Var, 0);
            case 1:
                return new nle(pleVar, rq3Var, 1);
            case 2:
                return new nle(pleVar, rq3Var, 2);
            case 3:
                return new nle(pleVar, rq3Var, 3);
            default:
                return new nle(pleVar, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((nle) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Player player;
        int i = this.r;
        ple pleVar = this.t;
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
                wve wveVar = pleVar.e;
                int i3 = pleVar.j;
                this.s = 1;
                Object h = wveVar.h(i3, "overall", this);
                return h == lu3Var ? lu3Var : h;
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
                wi7 wi7Var = pleVar.f;
                int i5 = pleVar.j;
                this.s = 1;
                Object Y = wi7Var.Y(i5, this);
                return Y == lu3Var2 ? lu3Var2 : Y;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                hof hofVar = pleVar.z;
                this.s = 1;
                Object A = rd0.A(hofVar, this);
                return A == lu3Var3 ? lu3Var3 : A;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    wve wveVar2 = pleVar.e;
                    int i8 = pleVar.j;
                    this.s = 1;
                    obj = wveVar2.i(i8, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                PlayerDetailsResponse playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) obj);
                return (playerDetailsResponse == null || (player = playerDetailsResponse.getPlayer()) == null) ? pleVar.l : player;
            default:
                lu3 lu3Var5 = lu3.a;
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
                wve wveVar3 = pleVar.e;
                int i10 = pleVar.j;
                this.s = 1;
                wveVar3.getClass();
                Object P = yaa.P(new ive(wveVar3, i10, null, 6), this);
                return P == lu3Var5 ? lu3Var5 : P;
        }
    }
}
