package defpackage;

import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class myg extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ pyg t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ ComparisonSeasonInfo w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myg(pyg pygVar, int i, int i2, ComparisonSeasonInfo comparisonSeasonInfo, rq3 rq3Var, int i3) {
        super(1, rq3Var);
        this.r = i3;
        this.t = pygVar;
        this.u = i;
        this.v = i2;
        this.w = comparisonSeasonInfo;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new myg(this.t, this.u, this.v, this.w, rq3Var, 0);
            default:
                return new myg(this.t, this.u, this.v, this.w, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((myg) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ComparisonSeasonInfo comparisonSeasonInfo = this.w;
        int i2 = this.v;
        int i3 = this.u;
        pyg pygVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (pygVar.y(i3, i2, comparisonSeasonInfo, this) == lu3Var) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (pygVar.y(i3, i2, comparisonSeasonInfo, this) == lu3Var2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
