package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s7c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ u8c t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7c(rq3 rq3Var, u8c u8cVar, Event event) {
        super(2, rq3Var);
        this.r = 6;
        this.u = event;
        this.t = u8cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        u8c u8cVar = this.t;
        switch (i) {
            case 0:
                return new s7c(u8cVar, event, rq3Var, 0);
            case 1:
                return new s7c(u8cVar, event, rq3Var, 1);
            case 2:
                return new s7c(u8cVar, event, rq3Var, 2);
            case 3:
                return new s7c(u8cVar, event, rq3Var, 3);
            case 4:
                return new s7c(u8cVar, event, rq3Var, 4);
            case 5:
                return new s7c(u8cVar, event, rq3Var, 5);
            case 6:
                return new s7c(rq3Var, u8cVar, event);
            case 7:
                return new s7c(u8cVar, event, rq3Var, 7);
            case 8:
                return new s7c(u8cVar, event, rq3Var, 8);
            case 9:
                return new s7c(u8cVar, event, rq3Var, 9);
            case 10:
                return new s7c(u8cVar, event, rq3Var, 10);
            default:
                return new s7c(u8cVar, event, rq3Var, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((s7c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Event event = this.u;
        u8c u8cVar = this.t;
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
                s96 s96Var = u8cVar.c;
                int id = event.getId();
                this.s = 1;
                Object o = s96Var.o(id, null, this);
                return o == lu3Var ? lu3Var : o;
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
                s96 s96Var2 = u8cVar.c;
                int id2 = event.getId();
                this.s = 1;
                Object s = s96Var2.s(id2, null, this);
                return s == lu3Var2 ? lu3Var2 : s;
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
                s96 s96Var3 = u8cVar.c;
                this.s = 1;
                Object p = s96Var3.p(event, this);
                return p == lu3Var3 ? lu3Var3 : p;
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
                s96 s96Var4 = u8cVar.c;
                int id3 = event.getId();
                this.s = 1;
                Object s2 = s96Var4.s(id3, null, this);
                return s2 == lu3Var4 ? lu3Var4 : s2;
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
                s96 s96Var5 = u8cVar.c;
                this.s = 1;
                Object t = s96Var5.t(event, this);
                return t == lu3Var5 ? lu3Var5 : t;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var6 = u8cVar.c;
                this.s = 1;
                Serializable n = s96Var6.n(event, this);
                return n == lu3Var6 ? lu3Var6 : n;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    if (!ok3.C(event) || !Intrinsics.c(event.getSportSlug(), Sports.FOOTBALL)) {
                        return null;
                    }
                    s96 s96Var7 = u8cVar.c;
                    int id4 = event.getId();
                    this.s = 1;
                    obj = s96Var7.h(id4, this);
                    if (obj == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (EventBestPlayersSummaryResponse) obj;
            case 7:
                lu3 lu3Var8 = lu3.a;
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
                s96 s96Var8 = u8cVar.c;
                int id5 = event.getId();
                this.s = 1;
                Object o2 = s96Var8.o(id5, null, this);
                return o2 == lu3Var8 ? lu3Var8 : o2;
            case 8:
                lu3 lu3Var9 = lu3.a;
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
                g39 g39Var = u8cVar.f;
                int id6 = event.getId();
                this.s = 1;
                g39Var.getClass();
                Object P = yaa.P(new x29(g39Var, id6, null, 0), this);
                return P == lu3Var9 ? lu3Var9 : P;
            case 9:
                lu3 lu3Var10 = lu3.a;
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
                g39 g39Var2 = u8cVar.f;
                int id7 = event.getId();
                this.s = 1;
                g39Var2.getClass();
                Object P2 = yaa.P(new c64(g39Var2, id7, (Object) null, (rq3) null, 10), this);
                return P2 == lu3Var10 ? lu3Var10 : P2;
            case 10:
                lu3 lu3Var11 = lu3.a;
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
                s96 s96Var9 = u8cVar.c;
                int id8 = event.getId();
                this.s = 1;
                Object s3 = s96Var9.s(id8, null, this);
                return s3 == lu3Var11 ? lu3Var11 : s3;
            default:
                lu3 lu3Var12 = lu3.a;
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
                cl clVar = new cl(u8cVar, event, null, 17);
                this.s = 1;
                Object P3 = yaa.P(clVar, this);
                return P3 == lu3Var12 ? lu3Var12 : P3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7c(u8c u8cVar, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = u8cVar;
        this.u = event;
    }
}
