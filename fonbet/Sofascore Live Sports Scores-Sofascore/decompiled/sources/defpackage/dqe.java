package defpackage;

import com.sofascore.model.mvvm.model.Season;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dqe extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ fqe s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqe(int i, int i2, int i3, rq3 rq3Var, fqe fqeVar) {
        super(2, rq3Var);
        this.s = fqeVar;
        this.t = i;
        this.u = i2;
        this.v = i3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new dqe(this.t, this.u, this.v, rq3Var, this.s);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dqe) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
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
        String label = Season.SubSeasonType.OVERALL.getLabel();
        this.r = 1;
        yzd yzdVar = fqe.B;
        Object x = this.s.x(this.t, this.u, this.v, this, label);
        return x == lu3Var ? lu3Var : x;
    }
}
