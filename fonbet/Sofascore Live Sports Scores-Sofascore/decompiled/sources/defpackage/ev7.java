package defpackage;

import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ev7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ u6b t;
    public final /* synthetic */ b1d u;
    public final /* synthetic */ FeaturedTournamentFragment v;
    public final /* synthetic */ FeaturedTournamentFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev7(u6b u6bVar, b1d b1dVar, FeaturedTournamentFragment featuredTournamentFragment, rq3 rq3Var, FeaturedTournamentFragment featuredTournamentFragment2, int i) {
        super(2, rq3Var);
        this.r = i;
        switch (i) {
            case 1:
                e6b e6bVar = e6b.a;
                this.t = u6bVar;
                this.u = b1dVar;
                this.v = featuredTournamentFragment;
                this.w = featuredTournamentFragment2;
                super(2, rq3Var);
                break;
            default:
                e6b e6bVar2 = e6b.a;
                this.t = u6bVar;
                this.u = b1dVar;
                this.v = featuredTournamentFragment;
                this.w = featuredTournamentFragment2;
                break;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                e6b e6bVar = e6b.a;
                return new ev7(this.t, this.u, this.v, rq3Var, this.w, 0);
            default:
                e6b e6bVar2 = e6b.a;
                return new ev7(this.t, this.u, this.v, rq3Var, this.w, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ev7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        u6b u6bVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    e6b e6bVar = e6b.c;
                    dv7 dv7Var = new dv7(this.u, this.v, null, this.w, 0);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, dv7Var, this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    e6b e6bVar2 = e6b.c;
                    dv7 dv7Var2 = new dv7(this.u, this.v, null, this.w, 1);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar2, dv7Var2, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
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
