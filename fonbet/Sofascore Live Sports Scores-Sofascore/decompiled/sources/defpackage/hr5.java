package defpackage;

import com.sofascore.model.crowdsourcing.MyContributionsResponse;
import com.sofascore.model.mvvm.model.Event;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hr5 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ Event s;
    public final /* synthetic */ mr5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr5(Event event, mr5 mr5Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = event;
        this.t = mr5Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new hr5(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hr5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        if (r10.getStartDateSuggest() != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r0 > (r10 - defpackage.xd5.k(defpackage.wkn.R(72, defpackage.be5.HOURS), defpackage.be5.SECONDS))) goto L24;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        boolean z = false;
        if (i == 0) {
            y6a.M(obj);
            Event event = this.s;
            if (event.getCrowdsourcingDataDisplayEnabled()) {
                long longValue = xe6.c().b().longValue();
                long startTimestamp = event.getStartTimestamp();
                wd5 wd5Var = xd5.b;
            } else {
                mr5 mr5Var = this.t;
                e64 e64Var = mr5Var.j;
                int i2 = mr5Var.p;
                Calendar calendar = ke0.a;
                String d = ke0.d(mr5Var.i());
                this.r = 1;
                e64Var.getClass();
                obj = yaa.P(new c64(e64Var, i2, d, (rq3) null, 5), this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        MyContributionsResponse myContributionsResponse = (MyContributionsResponse) yaa.x((x2g) obj);
        if (myContributionsResponse != null) {
            if (myContributionsResponse.getLiveIncidentSuggests().isEmpty()) {
                if (myContributionsResponse.getFinalScoreSuggest() == null) {
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
