package defpackage;

import com.sofascore.model.mvvm.model.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mu7 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ tu7 t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu7(tu7 tu7Var, Event event, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = tu7Var;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        tu7 tu7Var = this.t;
        switch (i) {
            case 0:
                return new mu7(tu7Var, event, rq3Var, 0);
            default:
                return new mu7(tu7Var, event, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((mu7) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Event event = this.u;
        tu7 tu7Var = this.t;
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
                List list = tu7Var.p;
                if (list == null) {
                    list = km5.a;
                }
                this.s = 1;
                Object r = s9a.r(new jr5(tu7Var, list, event, (rq3) null), this);
                return r == lu3Var ? lu3Var : r;
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
                List list2 = tu7Var.p;
                if (list2 == null) {
                    list2 = km5.a;
                }
                this.s = 1;
                Object r2 = s9a.r(new jr5(tu7Var, list2, event, (rq3) null), this);
                return r2 == lu3Var2 ? lu3Var2 : r2;
        }
    }
}
