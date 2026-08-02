package defpackage;

import com.sofascore.model.LiveActionWidgetProvider;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m86 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ s96 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m86(s96 s96Var, int i, String str, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = s96Var;
        this.u = i;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new m86(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new m86(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new m86(this.t, this.u, this.v, rq3Var, 2);
            case 3:
                return new m86(this.t, this.u, this.v, rq3Var, 3);
            case 4:
                return new m86(this.v, this.t, this.u, rq3Var, 4);
            case 5:
                return new m86(this.t, this.u, this.v, rq3Var, 5);
            default:
                return new m86(this.v, this.t, this.u, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((m86) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r10 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r10 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009b, code lost:
    
        if (r10 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
    
        if (r10 == r0) goto L49;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        s96 s96Var = this.t;
        String str = this.v;
        int i2 = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = s96Var.a;
                    this.s = 1;
                    obj = networkCoroutineAPI.getEventIncidents(i2, this);
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
                return EventIncidentsResponse.mapIncidents$default((EventIncidentsResponse) obj, str, null, 2, null);
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
                NetworkCoroutineAPI networkCoroutineAPI2 = s96Var.a;
                this.s = 1;
                Object stageSeasonRaceResults = networkCoroutineAPI2.stageSeasonRaceResults(i2, str, this);
                return stageSeasonRaceResults == lu3Var2 ? lu3Var2 : stageSeasonRaceResults;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = s96Var.a;
                this.s = 1;
                Object stageStandings = networkCoroutineAPI3.stageStandings(i2, str, this);
                return stageStandings == lu3Var3 ? lu3Var3 : stageStandings;
            case 3:
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
                NetworkCoroutineAPI networkCoroutineAPI4 = s96Var.a;
                this.s = 1;
                Object uniqueTournamentScheduledEvents = networkCoroutineAPI4.uniqueTournamentScheduledEvents(i2, str, this);
                return uniqueTournamentScheduledEvents == lu3Var4 ? lu3Var4 : uniqueTournamentScheduledEvents;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return (c2g) obj;
                    }
                    if (i7 == 2) {
                        y6a.M(obj);
                        return (c2g) obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                boolean c = Intrinsics.c(str, StatusKt.STATUS_FINISHED);
                NetworkCoroutineAPI networkCoroutineAPI5 = s96Var.a;
                if (!c) {
                    this.s = 2;
                    obj = networkCoroutineAPI5.hasEventAiInsights(i2, this);
                    break;
                } else {
                    this.s = 1;
                    obj = networkCoroutineAPI5.hasEventAiInsightsPostMatch(i2, this);
                    break;
                }
                return lu3Var5;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI6 = s96Var.a;
                if (str == null) {
                    str = "";
                }
                this.s = 1;
                Object hasAllCommentary = networkCoroutineAPI6.hasAllCommentary(i2, str, this);
                return hasAllCommentary == lu3Var6 ? lu3Var6 : hasAllCommentary;
            default:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return (c2g) obj;
                    }
                    if (i9 == 2) {
                        y6a.M(obj);
                        return (c2g) obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                boolean c2 = Intrinsics.c(str, LiveActionWidgetProvider.OPTA);
                NetworkCoroutineAPI networkCoroutineAPI7 = s96Var.a;
                if (!c2) {
                    this.s = 2;
                    obj = networkCoroutineAPI7.hasSportRadarLiveMatchTracker(i2, this);
                    break;
                } else {
                    this.s = 1;
                    obj = networkCoroutineAPI7.hasOptaLiveActionWidget(i2, this);
                    break;
                }
                return lu3Var7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m86(String str, s96 s96Var, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.v = str;
        this.t = s96Var;
        this.u = i;
    }
}
