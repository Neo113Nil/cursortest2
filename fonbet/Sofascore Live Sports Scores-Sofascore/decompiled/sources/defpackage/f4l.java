package defpackage;

import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f4l extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ WeeklyChallengeViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4l(WeeklyChallengeViewModel weeklyChallengeViewModel, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = weeklyChallengeViewModel;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        WeeklyChallengeViewModel weeklyChallengeViewModel = this.t;
        switch (i) {
            case 0:
                return new f4l(weeklyChallengeViewModel, rq3Var, 0);
            default:
                return new f4l(weeklyChallengeViewModel, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((f4l) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        WeeklyChallengeViewModel weeklyChallengeViewModel = this.t;
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
                a3l a3lVar = weeklyChallengeViewModel.e;
                this.s = 1;
                Object c = a3lVar.c(this);
                return c == lu3Var ? lu3Var : c;
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
                dhk dhkVar = weeklyChallengeViewModel.h;
                String id = WeeklyChallengeViewModel.l().getId();
                this.s = 1;
                Object e = dhkVar.e(id, this);
                return e == lu3Var2 ? lu3Var2 : e;
        }
    }
}
