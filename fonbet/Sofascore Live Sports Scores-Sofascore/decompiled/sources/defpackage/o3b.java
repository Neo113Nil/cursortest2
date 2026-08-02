package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o3b extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w3b t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3b(w3b w3bVar, int i, int i2, int i3, String str, int i4, rq3 rq3Var, int i5) {
        super(1, rq3Var);
        this.r = i5;
        this.t = w3bVar;
        this.u = i;
        this.v = i2;
        this.w = i3;
        this.x = str;
        this.y = i4;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new o3b(this.t, this.u, this.v, this.w, this.x, this.y, rq3Var, 0);
            default:
                return new o3b(this.t, this.u, this.v, this.w, this.x, this.y, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((o3b) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        w3b w3bVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = w3bVar.b;
                this.s = 1;
                Object uniqueTournamentTeamEvents = networkCoroutineAPI.uniqueTournamentTeamEvents(this.u, this.v, this.w, this.x, this.y, this);
                return uniqueTournamentTeamEvents == lu3Var ? lu3Var : uniqueTournamentTeamEvents;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = w3bVar.b;
                    this.s = 1;
                    obj = networkCoroutineAPI2.uniqueTournamentSeasonVenueEvents(this.u, this.v, this.w, this.x, this.y, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterator<T> it = ((EventListResponse) obj).getEvents().iterator();
                while (it.hasNext()) {
                    ((Event) it.next()).setHideDate(true);
                }
                return obj;
        }
    }
}
