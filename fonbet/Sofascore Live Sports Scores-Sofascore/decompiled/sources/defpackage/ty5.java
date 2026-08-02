package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ty5 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ dz5 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Integer u;
    public final /* synthetic */ Integer v;
    public final /* synthetic */ Event w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty5(dz5 dz5Var, int i, Integer num, Integer num2, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = dz5Var;
        this.t = i;
        this.u = num;
        this.v = num2;
        this.w = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ty5(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ty5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        j0j j0jVar = this.s.k;
        int intValue = this.u.intValue();
        int intValue2 = this.v.intValue();
        String label = Season.SubSeasonType.OVERALL.getLabel();
        String s = ok3.s(this.w);
        this.r = 1;
        Object q = j0jVar.q(this.t, intValue, intValue2, label, s, this);
        return q == lu3Var ? lu3Var : q;
    }
}
