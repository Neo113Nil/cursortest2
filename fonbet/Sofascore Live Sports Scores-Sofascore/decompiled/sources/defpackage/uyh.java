package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uyh extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ vyh t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uyh(vyh vyhVar, String str, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = vyhVar;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        vyh vyhVar = this.t;
        switch (i) {
            case 0:
                return new uyh(vyhVar, str, rq3Var, 0);
            case 1:
                return new uyh(vyhVar, str, rq3Var, 1);
            case 2:
                return new uyh(vyhVar, str, rq3Var, 2);
            case 3:
                return new uyh(vyhVar, str, rq3Var, 3);
            case 4:
                return new uyh(vyhVar, str, rq3Var, 4);
            default:
                return new uyh(vyhVar, str, rq3Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((uyh) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
        vyh vyhVar = this.t;
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
                NetworkCoroutineAPI networkCoroutineAPI = vyhVar.a;
                this.s = 1;
                Object liveCategories = networkCoroutineAPI.liveCategories(str, this);
                return liveCategories == lu3Var ? lu3Var : liveCategories;
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
                NetworkCoroutineAPI networkCoroutineAPI2 = vyhVar.a;
                this.s = 1;
                Object sportLiveEvents = networkCoroutineAPI2.sportLiveEvents(str, this);
                return sportLiveEvents == lu3Var2 ? lu3Var2 : sportLiveEvents;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                NetworkCoroutineAPI networkCoroutineAPI3 = vyhVar.a;
                this.s = 1;
                Object sportCategories = networkCoroutineAPI3.sportCategories(str, this);
                return sportCategories == lu3Var3 ? lu3Var3 : sportCategories;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI4 = vyhVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI4.trendingEvents(str, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List<Event> events = ((EventListResponse) obj).getEvents();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : events) {
                    if (Sports.INSTANCE.getEntries().contains(((Event) obj2).getSportSlug())) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI5 = vyhVar.a;
                    this.s = 1;
                    obj = networkCoroutineAPI5.trendingGridEvents(str, this);
                    if (obj == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List<Event> events2 = ((EventListResponse) obj).getEvents();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : events2) {
                    if (Sports.INSTANCE.getTrendingGridSupported().contains(((Event) obj3).getSportSlug())) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            default:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI6 = vyhVar.a;
                this.s = 1;
                Object trendingGridTiles = networkCoroutineAPI6.trendingGridTiles(str, this);
                return trendingGridTiles == lu3Var6 ? lu3Var6 : trendingGridTiles;
        }
    }
}
