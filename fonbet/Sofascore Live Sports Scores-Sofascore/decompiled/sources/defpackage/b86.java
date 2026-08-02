package defpackage;

import com.sofascore.model.mvvm.model.AiAnalystDemoEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.AiInsightsNextResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b86 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ s96 t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b86(s96 s96Var, String str, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = s96Var;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        s96 s96Var = this.t;
        switch (i) {
            case 0:
                return new b86(s96Var, str, rq3Var, 0);
            case 1:
                return new b86(s96Var, str, rq3Var, 1);
            default:
                return new b86(s96Var, str, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((b86) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
        s96 s96Var = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = s96Var.a;
                this.s = 1;
                Object currentlyRelevantEvents = networkCoroutineAPI.getCurrentlyRelevantEvents(str, this);
                return currentlyRelevantEvents == lu3Var ? lu3Var : currentlyRelevantEvents;
            case 1:
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
                NetworkCoroutineAPI networkCoroutineAPI2 = s96Var.a;
                this.s = 1;
                Object head2HeadEvents = networkCoroutineAPI2.getHead2HeadEvents(str, this);
                return head2HeadEvents == lu3Var2 ? lu3Var2 : head2HeadEvents;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI3 = s96Var.a;
                    this.s = 1;
                    obj = networkCoroutineAPI3.getNextAiInsightsEvent(str, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Event event = (Event) CollectionsKt.firstOrNull(((AiInsightsNextResponse) obj).getEvents());
                if (event != null) {
                    return new AiAnalystDemoEvent(event.getId(), Event.getHomeTeam$default(event, null, 1, null), Event.getAwayTeam$default(event, null, 1, null), event.getStartTimestamp());
                }
                return null;
        }
    }
}
