package defpackage;

import com.sofascore.model.newNetwork.MonthlyUniqueTournamentsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vh4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ai4 t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh4(ai4 ai4Var, String str, String str2, String str3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ai4Var;
        this.u = str;
        this.v = str2;
        this.w = str3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new vh4(this.t, this.u, this.v, this.w, rq3Var, 0);
            default:
                return new vh4(this.t, this.u, this.v, this.w, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((vh4) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.w;
        String str2 = this.v;
        String str3 = this.u;
        ai4 ai4Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    vrj vrjVar = ai4Var.f;
                    this.s = 1;
                    obj = vrjVar.a(str3, str2, str, this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                MonthlyUniqueTournamentsResponse monthlyUniqueTournamentsResponse = (MonthlyUniqueTournamentsResponse) obj;
                if (monthlyUniqueTournamentsResponse == null || (r5 = monthlyUniqueTournamentsResponse.getDailyUniqueTournaments()) == null) {
                    break;
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    vrj vrjVar2 = ai4Var.f;
                    this.s = 1;
                    obj = vrjVar2.a(str3, str2, str, this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                MonthlyUniqueTournamentsResponse monthlyUniqueTournamentsResponse2 = (MonthlyUniqueTournamentsResponse) obj;
                if (monthlyUniqueTournamentsResponse2 == null || (r5 = monthlyUniqueTournamentsResponse2.getDailyUniqueTournaments()) == null) {
                    break;
                }
                break;
        }
        return km5.a;
    }
}
