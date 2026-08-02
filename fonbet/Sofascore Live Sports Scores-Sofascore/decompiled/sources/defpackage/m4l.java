package defpackage;

import com.sofascore.results.service.WeeklyChallengeWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m4l extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ WeeklyChallengeWorker t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4l(WeeklyChallengeWorker weeklyChallengeWorker, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = weeklyChallengeWorker;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        WeeklyChallengeWorker weeklyChallengeWorker = this.t;
        switch (i) {
            case 0:
                return new m4l(weeklyChallengeWorker, i2, rq3Var, 0);
            default:
                return new m4l(weeklyChallengeWorker, i2, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((m4l) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        WeeklyChallengeWorker weeklyChallengeWorker = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                a3l a3lVar = weeklyChallengeWorker.c;
                String valueOf = String.valueOf(i2);
                this.s = 1;
                Object d = a3lVar.d(valueOf, this);
                return d == lu3Var ? lu3Var : d;
            default:
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
                a3l a3lVar2 = weeklyChallengeWorker.c;
                String valueOf2 = String.valueOf(i2);
                this.s = 1;
                Object d2 = a3lVar2.d(valueOf2, this);
                return d2 == lu3Var2 ? lu3Var2 : d2;
        }
    }
}
