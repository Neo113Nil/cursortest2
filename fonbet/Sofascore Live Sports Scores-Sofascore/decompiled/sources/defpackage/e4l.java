package defpackage;

import com.sofascore.model.network.response.EventResponse;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e4l extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ WeeklyChallengeViewModel t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4l(WeeklyChallengeViewModel weeklyChallengeViewModel, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = weeklyChallengeViewModel;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        WeeklyChallengeViewModel weeklyChallengeViewModel = this.t;
        switch (i) {
            case 0:
                return new e4l(weeklyChallengeViewModel, i2, rq3Var, 0);
            case 1:
                return new e4l(weeklyChallengeViewModel, i2, rq3Var, 1);
            case 2:
                return new e4l(weeklyChallengeViewModel, i2, rq3Var, 2);
            default:
                return new e4l(weeklyChallengeViewModel, i2, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((e4l) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        WeeklyChallengeViewModel weeklyChallengeViewModel = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    s96 s96Var = weeklyChallengeViewModel.f;
                    this.s = 1;
                    obj = s96Var.d(i2, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                EventResponse eventResponse = (EventResponse) yaa.x((x2g) obj);
                if (eventResponse != null) {
                    return eventResponse.getEvent();
                }
                return null;
            case 1:
                lu3 lu3Var2 = lu3.a;
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
                a3l a3lVar = weeklyChallengeViewModel.e;
                String valueOf = String.valueOf(i2);
                this.s = 1;
                Object d = a3lVar.d(valueOf, this);
                return d == lu3Var2 ? lu3Var2 : d;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                a3l a3lVar2 = weeklyChallengeViewModel.e;
                String valueOf2 = String.valueOf(i2);
                this.s = 1;
                Object d2 = a3lVar2.d(valueOf2, this);
                return d2 == lu3Var3 ? lu3Var3 : d2;
            default:
                lu3 lu3Var4 = lu3.a;
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
                a3l a3lVar3 = weeklyChallengeViewModel.e;
                String valueOf3 = String.valueOf(i2);
                this.s = 1;
                Object d3 = a3lVar3.d(valueOf3, this);
                return d3 == lu3Var4 ? lu3Var4 : d3;
        }
    }
}
