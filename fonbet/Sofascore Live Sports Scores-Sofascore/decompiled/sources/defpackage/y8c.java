package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y8c extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ t9c t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8c(t9c t9cVar, int i, String str, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = t9cVar;
        this.u = i;
        this.v = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new y8c(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new y8c(this.t, this.u, this.v, rq3Var, 1);
            case 2:
                return new y8c(this.t, this.u, this.v, rq3Var, 2);
            default:
                return new y8c(this.t, this.u, this.v, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((y8c) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.v;
        int i2 = this.u;
        t9c t9cVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = t9cVar.a;
                this.s = 1;
                Object mediaHighlightSummary = networkCoroutineAPI.getMediaHighlightSummary(i2, str, this);
                return mediaHighlightSummary == lu3Var ? lu3Var : mediaHighlightSummary;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = t9cVar.a;
                this.s = 1;
                Object playerHighlightSummary = networkCoroutineAPI2.getPlayerHighlightSummary(i2, str, this);
                return playerHighlightSummary == lu3Var2 ? lu3Var2 : playerHighlightSummary;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = t9cVar.b;
                String q = dmi.q("Bearer ", str);
                this.s = 1;
                Object sportRadarStreamUrl = networkCoroutineAPI3.getSportRadarStreamUrl(i2, q, this);
                return sportRadarStreamUrl == lu3Var3 ? lu3Var3 : sportRadarStreamUrl;
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
                NetworkCoroutineAPI networkCoroutineAPI4 = t9cVar.a;
                this.s = 1;
                Object teamHighlightSummary = networkCoroutineAPI4.getTeamHighlightSummary(i2, str, this);
                return teamHighlightSummary == lu3Var4 ? lu3Var4 : teamHighlightSummary;
        }
    }
}
