package defpackage;

import com.sofascore.results.fantasy.highlights.gameweek.FantasyGameweekHighlightsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f07 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ FantasyGameweekHighlightsActivity t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f07(FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = fantasyGameweekHighlightsActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = this.t;
        switch (i) {
            case 0:
                return new f07(fantasyGameweekHighlightsActivity, rq3Var, 0);
            case 1:
                return new f07(fantasyGameweekHighlightsActivity, rq3Var, 1);
            default:
                return new f07(fantasyGameweekHighlightsActivity, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((f07) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = this.t;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    int i4 = FantasyGameweekHighlightsActivity.Z;
                    nn2 nn2Var = ((j07) fantasyGameweekHighlightsActivity.T.getValue()).h;
                    f10 f10Var = new f10(fantasyGameweekHighlightsActivity, 7);
                    this.s = 1;
                    if (nn2Var.collect(f10Var, this) == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a.f;
                    f07 f07Var = new f07(fantasyGameweekHighlightsActivity, rq3Var, 0);
                    this.s = 1;
                    if (xw3.R(r69Var, f07Var, this) == lu3Var2) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    e6b e6bVar = e6b.d;
                    f07 f07Var2 = new f07(fantasyGameweekHighlightsActivity, rq3Var, i2);
                    this.s = 1;
                    if (b6a.A(fantasyGameweekHighlightsActivity, e6bVar, f07Var2, this) == lu3Var3) {
                        break;
                    }
                } else if (i6 != 1) {
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
