package defpackage;

import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y7c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ u8c t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7c(u8c u8cVar, int i, int i2, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.t = u8cVar;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new y7c(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new y7c(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new y7c(this.t, this.u, this.v, rq3Var, 2);
            case 3:
                return new y7c(this.t, this.u, this.v, rq3Var, 3);
            case 4:
                return new y7c(this.t, this.u, this.v, rq3Var, 4);
            case 5:
                return new y7c(this.t, this.u, this.v, rq3Var, 5);
            case 6:
                return new y7c(this.t, this.u, this.v, rq3Var, 6);
            case 7:
                return new y7c(this.t, this.u, this.v, rq3Var, 7);
            case 8:
                return new y7c(this.t, this.u, this.v, rq3Var, 8);
            case 9:
                return new y7c(this.t, this.u, this.v, rq3Var, 9);
            case 10:
                return new y7c(this.t, this.u, this.v, rq3Var, 10);
            default:
                return new y7c(this.t, this.u, this.v, rq3Var, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((y7c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.v;
        int i3 = this.u;
        u8c u8cVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                wve wveVar = u8cVar.g;
                this.s = 1;
                Object j = wveVar.j(i3, i2, this);
                return j == lu3Var ? lu3Var : j;
            case 1:
                lu3 lu3Var2 = lu3.a;
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
                wve wveVar2 = u8cVar.g;
                this.s = 1;
                Object j2 = wveVar2.j(i3, i2, this);
                return j2 == lu3Var2 ? lu3Var2 : j2;
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
                g39 g39Var = u8cVar.f;
                this.s = 1;
                g39Var.getClass();
                Object P = yaa.P(new w29(g39Var, this.u, this.v, null, 8), this);
                return P == lu3Var3 ? lu3Var3 : P;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    g39 g39Var2 = u8cVar.f;
                    this.s = 1;
                    g39Var2.getClass();
                    obj = yaa.P(new w29(g39Var2, this.u, this.v, null, 6), this);
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
                PlayerHeatmapResponse playerHeatmapResponse = (PlayerHeatmapResponse) yaa.x((x2g) obj);
                if (playerHeatmapResponse == null || playerHeatmapResponse.getHeatmap().size() <= 5) {
                    return null;
                }
                return playerHeatmapResponse;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar3 = u8cVar.g;
                this.s = 1;
                Object j3 = wveVar3.j(i3, i2, this);
                return j3 == lu3Var5 ? lu3Var5 : j3;
            case 5:
                lu3 lu3Var6 = lu3.a;
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
                wve wveVar4 = u8cVar.g;
                this.s = 1;
                Object j4 = wveVar4.j(i3, i2, this);
                return j4 == lu3Var6 ? lu3Var6 : j4;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                g39 g39Var3 = u8cVar.f;
                this.s = 1;
                g39Var3.getClass();
                Object P2 = yaa.P(new w29(g39Var3, this.u, this.v, null, 4), this);
                return P2 == lu3Var7 ? lu3Var7 : P2;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                g39 g39Var4 = u8cVar.f;
                this.s = 1;
                g39Var4.getClass();
                Object P3 = yaa.P(new w29(g39Var4, this.u, this.v, null, 7), this);
                return P3 == lu3Var8 ? lu3Var8 : P3;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar5 = u8cVar.g;
                this.s = 1;
                Object j5 = wveVar5.j(i3, i2, this);
                return j5 == lu3Var9 ? lu3Var9 : j5;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar6 = u8cVar.g;
                this.s = 1;
                Object j6 = wveVar6.j(i3, i2, this);
                return j6 == lu3Var10 ? lu3Var10 : j6;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar7 = u8cVar.g;
                this.s = 1;
                Object j7 = wveVar7.j(i3, i2, this);
                return j7 == lu3Var11 ? lu3Var11 : j7;
            default:
                lu3 lu3Var12 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar8 = u8cVar.g;
                this.s = 1;
                Object j8 = wveVar8.j(i3, i2, this);
                return j8 == lu3Var12 ? lu3Var12 : j8;
        }
    }
}
