package defpackage;

import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p86 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ s96 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p86(s96 s96Var, int i, Boolean bool, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = s96Var;
        this.u = i;
        this.v = bool;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new p86(this.t, this.u, this.v, rq3Var, 0);
            default:
                return new p86(this.t, this.u, this.v, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((p86) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Boolean bool = this.v;
        int i2 = this.u;
        s96 s96Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = s96Var.a;
                    this.s = 1;
                    obj = networkCoroutineAPI.getLineups(i2, this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                LineupsResponse lineupsResponse = (LineupsResponse) obj;
                if (bool != null) {
                    lineupsResponse.setShouldReverseTeams(bool.booleanValue());
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = s96Var.a;
                    this.s = 1;
                    obj = networkCoroutineAPI2.getEventStatistics(i2, this);
                    if (obj == lu3Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                Iterator<T> it = ((EventStatisticsResponse) obj).getStatistics().iterator();
                while (it.hasNext()) {
                    Iterator<T> it2 = ((EventStatisticsPeriod) it.next()).getGroups().iterator();
                    while (it2.hasNext()) {
                        for (EventStatisticsItem eventStatisticsItem : ((EventStatisticsGroup) it2.next()).getStatisticsItems()) {
                            if (bool != null) {
                                eventStatisticsItem.setShouldReverseTeams(bool.booleanValue());
                            }
                            eventStatisticsItem.setShouldRoundToInt(Double.compare(EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null), (double) wzb.a(EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null))) == 0 && Double.compare(EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null), (double) wzb.a(EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null))) == 0);
                        }
                    }
                }
                break;
        }
        return obj;
    }
}
