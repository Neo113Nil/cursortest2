package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.post.UserPurchasePostBody;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dl extends hoi implements Function1 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ String t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(el elVar, String str, String str2, Long l, Long l2, rq3 rq3Var) {
        super(1, rq3Var);
        this.v = elVar;
        this.t = str;
        this.u = str2;
        this.w = l;
        this.x = l2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.x;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                return new dl((el) this.v, this.t, (String) this.u, (Long) obj2, (Long) obj, rq3Var);
            case 1:
                return new dl((List) this.v, (List) obj2, (m7c) obj, this.t, (String) this.u, rq3Var);
            default:
                return new dl((nmc) obj2, this.t, (av4) obj, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((dl) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x004a, code lost:
    
        if (r2 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object sportMainEvents;
        Object w;
        List<Event> list;
        LocalDate localDate;
        int i = this.r;
        Object obj2 = this.x;
        Object obj3 = this.w;
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
                NetworkCoroutineAPI networkCoroutineAPI = ((el) this.v).a;
                UserPurchasePostBody userPurchasePostBody = new UserPurchasePostBody(this.t, "ai_analysis_subscription", (String) this.u, (Long) obj3, (Long) obj2);
                this.s = 1;
                Object purchaseAnalyst = networkCoroutineAPI.purchaseAnalyst(userPurchasePostBody, this);
                return purchaseAnalyst == lu3Var ? lu3Var : purchaseAnalyst;
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
                List list2 = (List) this.v;
                String f0 = list2 != null ? CollectionsKt.f0(list2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, new abb(27), 30) : null;
                List list3 = (List) obj3;
                String f02 = list3 != null ? CollectionsKt.f0(list3, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, new abb(28), 30) : null;
                NetworkCoroutineAPI networkCoroutineAPI2 = ((m7c) obj2).a;
                String str = (String) this.u;
                this.s = 1;
                Object personalizedMLMediaPosts = networkCoroutineAPI2.personalizedMLMediaPosts(this.t, str, f0, f02, this);
                return personalizedMLMediaPosts == lu3Var2 ? lu3Var2 : personalizedMLMediaPosts;
            default:
                nmc nmcVar = (nmc) obj3;
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    s96 s96Var = nmcVar.f;
                    String str2 = this.t;
                    str2.getClass();
                    this.s = 1;
                    sportMainEvents = s96Var.a.sportMainEvents(Sports.MMA, str2, this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nmcVar = (nmc) this.u;
                        list = (List) this.v;
                        y6a.M(obj);
                        w = obj;
                        List list4 = (List) w;
                        localDate = (LocalDate) nmcVar.h.getValue();
                        if (localDate != null) {
                            return km5.a;
                        }
                        ArrayList arrayList = new ArrayList();
                        LocalDate minusDays = localDate.minusDays(3L);
                        minusDays.getClass();
                        long O = y6a.O(minusDays);
                        LocalDate plusDays = localDate.plusDays(7L);
                        plusDays.getClass();
                        long O2 = y6a.O(plusDays);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            long startTimestamp = ((Event) obj4).getStartTimestamp();
                            if (O <= startTimestamp && startTimestamp < O2) {
                                arrayList2.add(obj4);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Event event = (Event) next;
                            if (!Intrinsics.c(event.getTournament().isLive(), Boolean.TRUE) && (me4.t(StatusKt.STATUS_FINISHED, event) || (ph0.v(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}, event.getStatus().getType()) && event.getStartTimestamp() * 1000 <= System.currentTimeMillis()))) {
                                arrayList3.add(next);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (Intrinsics.c(((Event) next2).getTournament().isLive(), Boolean.TRUE)) {
                                arrayList4.add(next2);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            Event event2 = (Event) next3;
                            if (!Intrinsics.c(event2.getTournament().isLive(), Boolean.TRUE) && (me4.t(StatusKt.STATUS_NOT_STARTED, event2) || (ph0.v(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED}, event2.getStatus().getType()) && event2.getStartTimestamp() * 1000 > System.currentTimeMillis()))) {
                                arrayList5.add(next3);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            UniqueTournament uniqueTournament = ((Event) it4.next()).getTournament().getUniqueTournament();
                            Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                            if (valueOf != null) {
                                arrayList6.add(valueOf);
                            }
                        }
                        List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj5 : list4) {
                            if (!S0.contains(Integer.valueOf(((UniqueTournament) obj5).getId()))) {
                                arrayList7.add(obj5);
                            }
                        }
                        for (Pair pair : b.j(new Pair(arrayList3, ylc.FINISHED), new Pair(arrayList4, ylc.LIVE), new Pair(arrayList5, ylc.UPCOMING), new Pair(arrayList7, ylc.ORGANIZATIONS))) {
                            List list5 = (List) pair.a;
                            ylc ylcVar = (ylc) pair.b;
                            if (!list5.isEmpty()) {
                                arrayList.add(ylcVar);
                                arrayList.addAll(list5);
                            }
                        }
                        return arrayList;
                    }
                    y6a.M(obj);
                    sportMainEvents = obj;
                }
                List<Event> events = ((EventListResponse) sportMainEvents).getEvents();
                this.v = events;
                this.u = nmcVar;
                this.s = 2;
                w = ((av4) obj2).w(this);
                if (w != lu3Var3) {
                    list = events;
                    List list42 = (List) w;
                    localDate = (LocalDate) nmcVar.h.getValue();
                    if (localDate != null) {
                    }
                }
                return lu3Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(nmc nmcVar, String str, av4 av4Var, rq3 rq3Var) {
        super(1, rq3Var);
        this.w = nmcVar;
        this.t = str;
        this.x = av4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(List list, List list2, m7c m7cVar, String str, String str2, rq3 rq3Var) {
        super(1, rq3Var);
        this.v = list;
        this.w = list2;
        this.x = m7cVar;
        this.t = str;
        this.u = str2;
    }
}
