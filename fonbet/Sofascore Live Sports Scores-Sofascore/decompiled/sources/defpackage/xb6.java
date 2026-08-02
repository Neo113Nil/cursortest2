package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xb6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ bc6 t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb6(bc6 bc6Var, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = bc6Var;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        bc6 bc6Var = this.t;
        switch (i) {
            case 0:
                return new xb6(bc6Var, event, rq3Var, 0);
            case 1:
                return new xb6(bc6Var, event, rq3Var, 1);
            case 2:
                return new xb6(bc6Var, event, rq3Var, 2);
            case 3:
                return new xb6(bc6Var, event, rq3Var, 3);
            case 4:
                return new xb6(bc6Var, event, rq3Var, 4);
            case 5:
                return new xb6(bc6Var, event, rq3Var, 5);
            case 6:
                return new xb6(bc6Var, event, rq3Var, 6);
            case 7:
                return new xb6(bc6Var, event, rq3Var, 7);
            case 8:
                return new xb6(bc6Var, event, rq3Var, 8);
            default:
                return new xb6(bc6Var, event, rq3Var, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xb6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = 8;
        Event event = this.u;
        bc6 bc6Var = this.t;
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
                g39 g39Var = bc6Var.f;
                int id = event.getId();
                int id2 = Event.getHomeTeam$default(event, null, 1, null).getId();
                this.s = 1;
                g39Var.getClass();
                Object P = yaa.P(new w29(g39Var, id, id2, null, 0), this);
                return P == lu3Var ? lu3Var : P;
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
                g39 g39Var2 = bc6Var.f;
                int id3 = event.getId();
                int id4 = Event.getAwayTeam$default(event, null, 1, null).getId();
                this.s = 1;
                g39Var2.getClass();
                Object P2 = yaa.P(new w29(g39Var2, id3, id4, null, 0), this);
                return P2 == lu3Var2 ? lu3Var2 : P2;
            case 2:
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
                g39 g39Var3 = bc6Var.f;
                int id5 = event.getId();
                int id6 = Event.getHomeTeam$default(event, null, 1, null).getId();
                this.s = 1;
                g39Var3.getClass();
                Object P3 = yaa.P(new w29(g39Var3, id5, id6, null, 1), this);
                return P3 == lu3Var3 ? lu3Var3 : P3;
            case 3:
                lu3 lu3Var4 = lu3.a;
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
                g39 g39Var4 = bc6Var.f;
                int id7 = event.getId();
                int id8 = Event.getAwayTeam$default(event, null, 1, null).getId();
                this.s = 1;
                g39Var4.getClass();
                Object P4 = yaa.P(new w29(g39Var4, id7, id8, null, 1), this);
                return P4 == lu3Var4 ? lu3Var4 : P4;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new jk(event, bc6Var, rq3Var, i2), this);
                    return r == lu3Var5 ? lu3Var5 : r;
                }
                if (i7 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                lu3 lu3Var6 = lu3.a;
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
                s96 s96Var = bc6Var.e;
                this.s = 1;
                Object t = s96Var.t(event, this);
                return t == lu3Var6 ? lu3Var6 : t;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object k = bc6Var.k(event, this);
                    return k == lu3Var7 ? lu3Var7 : k;
                }
                if (i9 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object l = bc6Var.l(event, this);
                    return l == lu3Var8 ? lu3Var8 : l;
                }
                if (i10 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                lu3 lu3Var9 = lu3.a;
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
                s96 s96Var2 = bc6Var.e;
                this.s = 1;
                Object p = s96Var2.p(event, this);
                return p == lu3Var9 ? lu3Var9 : p;
            default:
                lu3 lu3Var10 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r2 = s9a.r(new h10(bc6Var, event, rq3Var, i2), this);
                    return r2 == lu3Var10 ? lu3Var10 : r2;
                }
                if (i12 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
