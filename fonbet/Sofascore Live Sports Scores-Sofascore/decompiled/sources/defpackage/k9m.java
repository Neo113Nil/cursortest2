package defpackage;

import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.shared.results.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k9m extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ sqm s;
    public final /* synthetic */ MomentModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9m(sqm sqmVar, MomentModel momentModel, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = sqmVar;
        this.t = momentModel;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new k9m(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new k9m(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        MomentModel momentModel = this.t;
        if (i == 0) {
            y6a.M(obj);
            sqm sqmVar = this.s;
            gum gumVar = sqmVar.k0;
            String H = sqmVar.H();
            String str = momentModel.id;
            boolean z = momentModel.u;
            this.r = 1;
            obj = gumVar.e(H, str, z, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        a9m a9mVar = (a9m) obj;
        if (a9mVar instanceof a6m) {
            m mVar = new m();
            mVar.f = ((a6m) a9mVar).a();
            mVar.g = i9a.p("momentId", momentModel.id);
            j1m.a(mVar);
        }
        return Unit.a;
    }
}
