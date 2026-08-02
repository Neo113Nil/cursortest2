package defpackage;

import com.ironsource.U3;
import com.sofascore.model.newNetwork.UniqueTournamentDetailsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lv7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ nv7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv7(nv7 nv7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = nv7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        nv7 nv7Var = this.t;
        switch (i) {
            case 0:
                return new lv7(nv7Var, rq3Var, 0);
            case 1:
                return new lv7(nv7Var, rq3Var, 1);
            case 2:
                return new lv7(nv7Var, rq3Var, 2);
            case 3:
                return new lv7(nv7Var, rq3Var, 3);
            case 4:
                return new lv7(nv7Var, rq3Var, 4);
            case 5:
                return new lv7(nv7Var, rq3Var, 5);
            default:
                return new lv7(nv7Var, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((lv7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        nv7 nv7Var = this.t;
        rq3 rq3Var = null;
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
                w3b w3bVar = nv7Var.f;
                this.s = 1;
                Object p0 = w3bVar.p0(270, 71636, this);
                return p0 == lu3Var ? lu3Var : p0;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    w3b w3bVar2 = nv7Var.f;
                    this.s = 1;
                    obj = w3bVar2.t0(270, this);
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
                UniqueTournamentDetailsResponse uniqueTournamentDetailsResponse = (UniqueTournamentDetailsResponse) obj;
                if (uniqueTournamentDetailsResponse != null) {
                    return uniqueTournamentDetailsResponse.getUniqueTournament();
                }
                return null;
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
                w3b w3bVar3 = nv7Var.f;
                this.s = 1;
                Object Z = w3bVar3.Z(270, 71636, this);
                return Z == lu3Var3 ? lu3Var3 : Z;
            case 3:
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
                w3b w3bVar4 = nv7Var.f;
                this.s = 1;
                Object a0 = w3bVar4.a0(270, 71636, this);
                return a0 == lu3Var4 ? lu3Var4 : a0;
            case 4:
                lu3 lu3Var5 = lu3.a;
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
                w3b w3bVar5 = nv7Var.f;
                rv8 rv8Var = rv8.b;
                this.s = 1;
                Object w = w3bVar5.w(270, 71636, this, U3.i.l);
                return w == lu3Var5 ? lu3Var5 : w;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new yp7(nv7Var, rq3Var, 5), this);
                    return r == lu3Var6 ? lu3Var6 : r;
                }
                if (i7 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lu3 lu3Var7 = lu3.a;
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
                w3b w3bVar6 = nv7Var.f;
                this.s = 1;
                Object h0 = w3bVar6.h0(270, 71636, this);
                return h0 == lu3Var7 ? lu3Var7 : h0;
        }
    }
}
