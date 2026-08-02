package defpackage;

import com.sofascore.model.mvvm.model.Event;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m06 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ p06 t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m06(p06 p06Var, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = p06Var;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        p06 p06Var = this.t;
        switch (i) {
            case 0:
                return new m06(p06Var, event, rq3Var, 0);
            case 1:
                return new m06(p06Var, event, rq3Var, 1);
            case 2:
                return new m06(p06Var, event, rq3Var, 2);
            case 3:
                return new m06(p06Var, event, rq3Var, 3);
            case 4:
                return new m06(p06Var, event, rq3Var, 4);
            case 5:
                return new m06(p06Var, event, rq3Var, 5);
            default:
                return new m06(p06Var, event, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((m06) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Event event = this.u;
        p06 p06Var = this.t;
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
                s96 s96Var = p06Var.o;
                this.s = 1;
                Object e = s96Var.e(event, this);
                return e == lu3Var ? lu3Var : e;
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
                s96 s96Var2 = p06Var.o;
                this.s = 1;
                Serializable n = s96Var2.n(event, this);
                return n == lu3Var2 ? lu3Var2 : n;
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
                s96 s96Var3 = p06Var.o;
                this.s = 1;
                Object q = s96Var3.q(event, this);
                return q == lu3Var3 ? lu3Var3 : q;
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
                s96 s96Var4 = p06Var.o;
                this.s = 1;
                Object t = s96Var4.t(event, this);
                return t == lu3Var4 ? lu3Var4 : t;
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
                wi7 wi7Var = p06Var.q;
                int id = event.getId();
                this.s = 1;
                Object m = wi7Var.m(id, this);
                return m == lu3Var5 ? lu3Var5 : m;
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
                s96 s96Var5 = p06Var.o;
                this.s = 1;
                Object p = s96Var5.p(event, this);
                return p == lu3Var6 ? lu3Var6 : p;
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
                s96 s96Var6 = p06Var.o;
                int id2 = event.getId();
                this.s = 1;
                Object h = s96Var6.h(id2, this);
                return h == lu3Var7 ? lu3Var7 : h;
        }
    }
}
