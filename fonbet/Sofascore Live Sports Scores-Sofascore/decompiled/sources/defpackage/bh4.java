package defpackage;

import com.sofascore.results.main.matches.redesign.datematches.DateMatchesFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bh4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ b1d t;
    public final /* synthetic */ DateMatchesFragment u;
    public final /* synthetic */ DateMatchesFragment v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh4(b1d b1dVar, DateMatchesFragment dateMatchesFragment, rq3 rq3Var, DateMatchesFragment dateMatchesFragment2, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b1dVar;
        this.u = dateMatchesFragment;
        this.v = dateMatchesFragment2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new bh4(this.t, this.u, rq3Var, this.v, 0);
            case 1:
                return new bh4(this.t, this.u, rq3Var, this.v, 1);
            default:
                return new bh4(this.t, this.u, rq3Var, this.v, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((bh4) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            case 1:
                ((bh4) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
            default:
                ((bh4) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return lu3.a;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        DateMatchesFragment dateMatchesFragment = this.v;
        DateMatchesFragment dateMatchesFragment2 = this.u;
        b1d b1dVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    ah4 ah4Var = new ah4(dateMatchesFragment2, dateMatchesFragment, 0);
                    this.s = 1;
                    if (b1dVar.collect(ah4Var, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                pvd.x();
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    ah4 ah4Var2 = new ah4(dateMatchesFragment2, dateMatchesFragment, 1);
                    this.s = 1;
                    if (b1dVar.collect(ah4Var2, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                pvd.x();
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    ah4 ah4Var3 = new ah4(dateMatchesFragment2, dateMatchesFragment, 2);
                    this.s = 1;
                    if (b1dVar.collect(ah4Var3, this) == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                pvd.x();
                break;
        }
        return null;
    }
}
