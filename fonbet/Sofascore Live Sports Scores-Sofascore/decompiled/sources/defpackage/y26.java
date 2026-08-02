package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.OddsCountryProvider;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y26 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ c36 t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y26(c36 c36Var, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = c36Var;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        c36 c36Var = this.t;
        switch (i) {
            case 0:
                return new y26(c36Var, event, rq3Var, 0);
            case 1:
                return new y26(c36Var, event, rq3Var, 1);
            default:
                return new y26(c36Var, event, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((y26) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Event event = this.u;
        c36 c36Var = this.t;
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
                s96 s96Var = c36Var.f;
                this.s = 1;
                Object l = s96Var.l(event, this);
                return l == lu3Var ? lu3Var : l;
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
                s96 s96Var2 = c36Var.f;
                this.s = 1;
                Object q = s96Var2.q(event, this);
                return q == lu3Var2 ? lu3Var2 : q;
            default:
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
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) CollectionsKt.firstOrNull(c36Var.i.c());
                umd umdVar = c36Var.h;
                this.s = 1;
                umdVar.getClass();
                Object r = s9a.r(new kmd(oddsCountryProvider, event, umdVar, null), this);
                return r == lu3Var3 ? lu3Var3 : r;
        }
    }
}
