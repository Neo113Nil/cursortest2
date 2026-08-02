package defpackage;

import android.content.Context;
import com.sofascore.model.Country;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.database.DbDismissedBuzzerTile;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.network.response.EventBetBoostsResponse;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.network.response.bettingtips.EventStreak;
import com.sofascore.model.network.response.bettingtips.HighValueStreaksResponse;
import com.sofascore.model.newNetwork.FeaturedEventsResponse;
import com.sofascore.model.newNetwork.RefereeDetailsResponse;
import com.sofascore.model.newNetwork.RefereeStatisticsResponse;
import com.sofascore.model.newNetwork.StagesListResponse;
import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.league.service.LeagueWorker;
import com.sofascore.results.service.PinnedLeagueWorker;
import com.sofascore.results.service.game.MuteEventService;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qu1 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu1(int i, Object obj, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new qu1(this.t, (su1) obj2, rq3Var, 0);
            case 1:
                return new qu1((k92) obj2, this.t, rq3Var, 1);
            case 2:
                return new qu1((pq2) obj2, this.t, rq3Var, 2);
            case 3:
                return new qu1((p63) obj2, this.t, rq3Var, 3);
            case 4:
                return new qu1((tr3) obj2, rq3Var);
            case 5:
                return new qu1((u16) obj2, this.t, rq3Var, 5);
            case 6:
                return new qu1((r36) obj2, this.t, rq3Var, 6);
            case 7:
                return new qu1(this.t, (e1d) obj2, rq3Var, 7);
            case 8:
                return new qu1((pu6) obj2, this.t, rq3Var, 8);
            case 9:
                return new qu1((d87) obj2, this.t, rq3Var, 9);
            case 10:
                return new qu1((ml7) obj2, this.t, rq3Var, 10);
            case 11:
                return new qu1((vp7) obj2, this.t, rq3Var, 11);
            case 12:
                return new qu1((nv7) obj2, this.t, rq3Var, 12);
            case 13:
                return new qu1((my7) obj2, this.t, rq3Var, 13);
            case 14:
                return new qu1((ga9) obj2, this.t, rq3Var, 14);
            case 15:
                return new qu1((ora) obj2, this.t, rq3Var, 15);
            case 16:
                return new qu1((LeagueWorker) obj2, this.t, rq3Var, 16);
            case 17:
                return new qu1((ypb) obj2, this.t, rq3Var, 17);
            case 18:
                return new qu1((cnc) obj2, this.t, rq3Var, 18);
            case 19:
                return new qu1((kpc) obj2, this.t, rq3Var, 19);
            case 20:
                return new qu1((MuteEventService) obj2, this.t, rq3Var, 20);
            case 21:
                return new qu1(this.t, (Function0) obj2, rq3Var, 21);
            case 22:
                return new qu1((a6e) obj2, this.t, rq3Var, 22);
            case 23:
                return new qu1((PinnedLeagueWorker) obj2, this.t, rq3Var, 23);
            case 24:
                return new qu1((PlayerEventStatisticsModal) obj2, this.t, rq3Var, 24);
            case 25:
                return new qu1((qlf) obj2, this.t, rq3Var, 25);
            case 26:
                return new qu1((jsf) obj2, this.t, rq3Var, 26);
            case 27:
                return new qu1((rsf) obj2, this.t, rq3Var, 27);
            case 28:
                return new qu1((d3i) obj2, this.t, rq3Var, 28);
            default:
                return new qu1((p5i) obj2, this.t, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 7:
                ((qu1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((qu1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r0 == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r2 == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x062d, code lost:
    
        if (r0 == r1) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0619, code lost:
    
        if (r2 == r1) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x06c4, code lost:
    
        if (r5.emit(r6, r16) == r1) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x06ae, code lost:
    
        if (r4 == r1) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x069b, code lost:
    
        if (r3 == r1) goto L386;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.sofascore.model.network.response.bettingtips.HighValueStreaksResponse] */
    /* JADX WARN: Type inference failed for: r10v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object d;
        Object y;
        int id;
        Object y2;
        Object d2;
        Object b;
        Object R;
        Object b2;
        Object r;
        Object value;
        Object b3;
        Object P;
        ArrayList arrayList;
        Object x0;
        List<Event> featuredEvents;
        Object d3;
        Event event;
        Object a2;
        Object P2;
        Object P3;
        Object R2;
        List<Stage> stages;
        Object obj2;
        Object P4;
        Object R3;
        int i = this.r;
        int i2 = 2;
        int i3 = 0;
        Object obj3 = this.u;
        int i4 = 1;
        ?? r10 = 0;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    int i6 = this.t;
                    if (i6 == 0) {
                        return null;
                    }
                    umd umdVar = ((su1) obj3).e;
                    this.s = 1;
                    a = umdVar.a(i6, 1, this);
                    if (a == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a = obj;
                }
                return (EventBetBoostsResponse) a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    i92 i92Var = ((k92) obj3).e;
                    int i8 = this.t;
                    this.s = 1;
                    t82 t82Var = i92Var.b.b;
                    Object U = gz8.U(this, t82Var.a, false, true, new r82(i3, t82Var, new DbDismissedBuzzerTile(i8, System.currentTimeMillis())));
                    Object obj4 = U;
                    if (U != lu3Var2) {
                        obj4 = Unit.a;
                    }
                    if (obj4 != lu3Var2) {
                        obj4 = Unit.a;
                    }
                    if (obj4 != lu3Var2) {
                        obj4 = Unit.a;
                    }
                    if (obj4 == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                pq2 pq2Var = (pq2) obj3;
                lu3 lu3Var3 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    s96 s96Var = pq2Var.e;
                    int i10 = this.t;
                    this.s = 1;
                    d = s96Var.d(i10, this);
                    if (d == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d = obj;
                }
                x2g x2gVar = (x2g) d;
                if (x2gVar instanceof v2g) {
                    yzc yzcVar = pq2Var.l;
                    EventResponse eventResponse = (EventResponse) ((v2g) x2gVar).a;
                    yzcVar.j(eventResponse.getEvent());
                    pq2Var.j = eventResponse.getEvent();
                    g9i g9iVar = pq2Var.w;
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    pq2Var.w = xw3.L(un0.z(pq2Var), null, null, new nq2(pq2Var, r10, i4), 3);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    p63 p63Var = (p63) obj3;
                    uwg uwgVar = p63Var.c;
                    int i12 = this.t;
                    String str = p63Var.f.b;
                    this.s = 1;
                    if (uwgVar.b(i12, str, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                tr3 tr3Var = (tr3) obj3;
                lu3 lu3Var5 = lu3.a;
                int i13 = this.t;
                if (i13 == 0) {
                    y6a.M(obj);
                    aeh aehVar = tr3Var.k;
                    this.t = 1;
                    y = rd0.y(aehVar, this);
                    break;
                } else if (i13 == 1) {
                    y6a.M(obj);
                    y = obj;
                } else {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    id = this.s;
                    y6a.M(obj);
                    y2 = obj;
                    aeh aehVar2 = tr3Var.g;
                    f34 f34Var = new f34(id, (l64) y2, tr3Var.l);
                    this.s = id;
                    this.t = 3;
                    break;
                }
                id = ((Event) y).getId();
                z88 z88Var = tr3Var.x;
                this.s = id;
                this.t = 2;
                y2 = rd0.y(z88Var, this);
                break;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    s96 s96Var2 = ((u16) obj3).e;
                    int i15 = this.t;
                    this.s = 1;
                    d2 = s96Var2.d(i15, this);
                    if (d2 == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d2 = obj;
                }
                EventResponse eventResponse2 = (EventResponse) yaa.x((x2g) d2);
                if (eventResponse2 != null) {
                    return eventResponse2.getEvent();
                }
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    t9c t9cVar = ((r36) obj3).p;
                    int i17 = this.t;
                    String c = dv3.c();
                    this.s = 1;
                    b = t9cVar.b(i17, c, this);
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        R = obj;
                        return (List) R;
                    }
                    y6a.M(obj);
                    b = obj;
                }
                List list = (List) b;
                if (list == null) {
                    return km5.a;
                }
                hs4 hs4Var = z45.a;
                k36 k36Var = new k36(i3, list, r10);
                this.s = 2;
                R = xw3.R(hs4Var, k36Var, this);
                break;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    ad2 ad2Var = qv5.a;
                    int i19 = this.t;
                    e1d e1dVar = (e1d) obj3;
                    LinkedHashMap linkedHashMap = qv5.b;
                    KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(z42.class);
                    Object obj5 = linkedHashMap.get(orCreateKotlinClass);
                    Object obj6 = obj5;
                    if (obj5 == null) {
                        aeh b4 = beh.b(0, 0, null, 7);
                        linkedHashMap.put(orCreateKotlinClass, b4);
                        obj6 = b4;
                    }
                    os2 os2Var = new os2(i19, e1dVar);
                    this.s = 1;
                    if (((b1d) obj6).collect(os2Var, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    g62 g62Var = ((pu6) obj3).m;
                    bt6 bt6Var = new bt6(this.t);
                    this.s = 1;
                    if (g62Var.q(this, bt6Var) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                d87 d87Var = (d87) obj3;
                lu3 lu3Var10 = lu3.a;
                int i21 = this.s;
                try {
                    if (i21 == 0) {
                        y6a.M(obj);
                        lx6 lx6Var = d87Var.c;
                        int i22 = this.t;
                        this.s = 1;
                        b2 = lx6Var.b(i22, this);
                        if (b2 == lu3Var10) {
                            return lu3Var10;
                        }
                    } else {
                        if (i21 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        b2 = obj;
                    }
                    ((ix6) b2).a(d87Var.a);
                    d87Var.a(false);
                    return Unit.a;
                } catch (Throwable th) {
                    d87Var.a(false);
                    throw th;
                }
            case 10:
                ml7 ml7Var = (ml7) obj3;
                lu3 lu3Var11 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    ky6 ky6Var = ml7Var.f;
                    int i24 = this.t;
                    this.s = 1;
                    ky6Var.getClass();
                    r = s9a.r(new hy6(ky6Var, i24, r10, i4), this);
                    if (r == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                List list2 = (List) r;
                fdi fdiVar = ml7Var.m;
                do {
                    value = fdiVar.getValue();
                    uj7 uj7Var = uj7.a;
                } while (!fdiVar.k(value, ll7.a((ll7) value, null, null, l6g.W(list2), false, false, false, false, 487)));
                return Unit.a;
            case 11:
                vp7 vp7Var = (vp7) obj3;
                lu3 lu3Var12 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    ky6 ky6Var2 = vp7Var.f;
                    int i26 = this.t;
                    this.s = 1;
                    b3 = ky6Var2.b(i26, this);
                    if (b3 == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    b3 = obj;
                }
                vp7Var.m(qp7.a(vp7Var.k(), null, 0, false, false, null, (List) b3, 251));
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i27 = this.s;
                if (i27 != 0) {
                    if (i27 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                nv7 nv7Var = (nv7) obj3;
                w3b w3bVar = nv7Var.f;
                Context i28 = nv7Var.i();
                int i29 = this.t;
                this.s = 1;
                Object Y = w3bVar.Y(i28, i29, this);
                return Y == lu3Var13 ? lu3Var13 : Y;
            case 13:
                int i30 = this.t;
                my7 my7Var = (my7) obj3;
                lu3 lu3Var14 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    m7c m7cVar = my7Var.b;
                    this.s = 1;
                    Object U2 = gz8.U(this, m7cVar.c.a, false, true, new q13(i30, 25));
                    Object obj7 = U2;
                    if (U2 != lu3Var14) {
                        obj7 = Unit.a;
                    }
                    if (obj7 != lu3Var14) {
                        obj7 = Unit.a;
                    }
                    if (obj7 == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                my7Var.f(i30, false);
                return Unit.a;
            case 14:
                ga9 ga9Var = (ga9) obj3;
                yzc yzcVar2 = ga9Var.f;
                lu3 lu3Var15 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    umd umdVar2 = ga9Var.e;
                    int i33 = this.t;
                    this.s = 1;
                    umdVar2.getClass();
                    P = yaa.P(new lmd(umdVar2, i33, r10, i3), this);
                    if (P == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                x2g x2gVar2 = (x2g) P;
                if (x2gVar2 instanceof v2g) {
                    yea yeaVar = j58.a;
                    Country e = dv3.e();
                    List f = j58.f(e != null ? e.getIso2Alpha() : null);
                    ?? r0 = (HighValueStreaksResponse) ((v2g) x2gVar2).a;
                    List<EventStreak> general = r0.getGeneral();
                    if (general != null) {
                        arrayList = new ArrayList();
                        for (Object obj8 : general) {
                            if (!CollectionsKt.R(f, ok3.v(((EventStreak) obj8).getEvent()))) {
                                arrayList.add(obj8);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    List<EventStreak> head2head = r0.getHead2head();
                    if (head2head != null) {
                        r10 = new ArrayList();
                        for (Object obj9 : head2head) {
                            if (!CollectionsKt.R(f, ok3.v(((EventStreak) obj9).getEvent()))) {
                                r10.add(obj9);
                            }
                        }
                    }
                    yzcVar2.j(new v2g(r0.copy(arrayList, r10)));
                } else {
                    yzcVar2.j(x2gVar2);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    ira iraVar = ((ora) obj3).p;
                    int i35 = this.t;
                    this.s = 1;
                    if (iraVar.f(i35, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i36 = this.s;
                if (i36 != 0) {
                    if (i36 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                int i37 = this.t;
                this.s = 1;
                Serializable e2 = ((LeagueWorker) obj3).e(i37, this);
                return e2 == lu3Var17 ? lu3Var17 : e2;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    aeh aehVar3 = ((ypb) obj3).k;
                    bpb bpbVar = new bpb(this.t);
                    this.s = 1;
                    if (aehVar3.emit(bpbVar, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i39 = this.s;
                if (i39 == 0) {
                    y6a.M(obj);
                    wqc wqcVar = ((cnc) obj3).f;
                    int i40 = this.t;
                    this.s = 1;
                    Object U3 = gz8.U(this, wqcVar.b.a, false, true, new bvb(i40, i2));
                    Object obj10 = U3;
                    if (U3 != lu3Var19) {
                        obj10 = Unit.a;
                    }
                    if (obj10 != lu3Var19) {
                        obj10 = Unit.a;
                    }
                    if (obj10 == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i39 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                kpc kpcVar = (kpc) obj3;
                lu3 lu3Var20 = lu3.a;
                int i41 = this.s;
                if (i41 == 0) {
                    y6a.M(obj);
                    w3b w3bVar2 = kpcVar.e;
                    int i42 = this.t;
                    this.s = 1;
                    x0 = w3bVar2.x0(i42, this);
                    if (x0 == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i41 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    x0 = obj;
                }
                FeaturedEventsResponse featuredEventsResponse = (FeaturedEventsResponse) x0;
                Event event2 = (featuredEventsResponse == null || (featuredEvents = featuredEventsResponse.getFeaturedEvents()) == null) ? null : (Event) CollectionsKt.a0(0, featuredEvents);
                kpcVar.f.j(event2 instanceof MmaEvent ? (MmaEvent) event2 : null);
                return Unit.a;
            case 20:
                MuteEventService muteEventService = (MuteEventService) obj3;
                lu3 lu3Var21 = lu3.a;
                int i43 = this.s;
                if (i43 == 0) {
                    y6a.M(obj);
                    s96 s96Var3 = muteEventService.d;
                    if (s96Var3 == null) {
                        Intrinsics.i("eventRepository");
                        throw null;
                    }
                    int i44 = this.t;
                    this.s = 1;
                    d3 = s96Var3.d(i44, this);
                    if (d3 == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i43 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d3 = obj;
                }
                EventResponse eventResponse3 = (EventResponse) yaa.x((x2g) d3);
                if (eventResponse3 != null && (event = eventResponse3.getEvent()) != null) {
                    su8.b(muteEventService, event);
                }
                return Unit.a;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i45 = this.s;
                if (i45 == 0) {
                    y6a.M(obj);
                    int i46 = this.t;
                    zic zicVar = xsd.c;
                    if (i46 > 1) {
                        this.s = 1;
                        if (n4o.y(500L, this) == lu3Var22) {
                            return lu3Var22;
                        }
                    }
                    return Unit.a;
                }
                if (i45 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ((Function0) obj3).invoke();
                return Unit.a;
            case 22:
                a6e a6eVar = (a6e) obj3;
                lu3 lu3Var23 = lu3.a;
                int i47 = this.s;
                if (i47 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (a6eVar.i(this) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i47 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                a6eVar.u(a6eVar.j(this.t), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i48 = this.s;
                if (i48 != 0) {
                    if (i48 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar3 = ((PinnedLeagueWorker) obj3).b;
                int i49 = this.t;
                this.s = 1;
                Object q0 = w3bVar3.q0(i49, this);
                return q0 == lu3Var24 ? lu3Var24 : q0;
            case 24:
                int i50 = this.t;
                PlayerEventStatisticsModal playerEventStatisticsModal = (PlayerEventStatisticsModal) obj3;
                lu3 lu3Var25 = lu3.a;
                int i51 = this.s;
                if (i51 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(500L, this) == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i51 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                playerEventStatisticsModal.h0 = new Integer(i50);
                Context context = playerEventStatisticsModal.getContext();
                if (context != null) {
                    String str2 = (String) playerEventStatisticsModal.G.getValue();
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    firebaseBundle.putInt("id", i50);
                    if (str2 != null) {
                        firebaseBundle.putString("location", str2);
                    }
                    ia0 ia0Var = ia0.q;
                    me4.d((f5d) me4.e(), "open_player_event_stats", firebaseBundle, context).a.e(n9e.K(firebaseBundle), null, "open_player_event_stats", false);
                }
                return Unit.a;
            case 25:
                qlf qlfVar = (qlf) obj3;
                lu3 lu3Var26 = lu3.a;
                int i52 = this.s;
                if (i52 == 0) {
                    y6a.M(obj);
                    pai paiVar = qlfVar.e;
                    int i53 = this.t;
                    this.s = 1;
                    a2 = paiVar.a(i53, this);
                    if (a2 == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i52 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a2 = obj;
                }
                Ranking ranking = (Ranking) a2;
                if (ranking != null) {
                    qlfVar.f.j(ranking);
                }
                return Unit.a;
            case 26:
                jsf jsfVar = (jsf) obj3;
                lu3 lu3Var27 = lu3.a;
                int i54 = this.s;
                if (i54 == 0) {
                    y6a.M(obj);
                    ctf ctfVar = jsfVar.e;
                    int i55 = this.t;
                    this.s = 1;
                    ctfVar.getClass();
                    P2 = yaa.P(new btf(ctfVar, i55, r10, i3), this);
                    if (P2 == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i54 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                RefereeDetailsResponse refereeDetailsResponse = (RefereeDetailsResponse) yaa.x((x2g) P2);
                Referee referee = refereeDetailsResponse != null ? refereeDetailsResponse.getReferee() : null;
                jsfVar.f.j(referee);
                return referee;
            case 27:
                rsf rsfVar = (rsf) obj3;
                lu3 lu3Var28 = lu3.a;
                int i56 = this.s;
                if (i56 == 0) {
                    y6a.M(obj);
                    ctf ctfVar2 = rsfVar.e;
                    int i57 = this.t;
                    this.s = 1;
                    ctfVar2.getClass();
                    P3 = yaa.P(new btf(ctfVar2, i57, r10, i4), this);
                    if (P3 == lu3Var28) {
                        return lu3Var28;
                    }
                } else {
                    if (i56 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P3 = obj;
                }
                x2g x2gVar3 = (x2g) P3;
                rsfVar.f.j(x2gVar3 instanceof v2g ? ((RefereeStatisticsResponse) ((v2g) x2gVar3).a).getStatistics() : km5.a);
                return Unit.a;
            case 28:
                lu3 lu3Var29 = lu3.a;
                int i58 = this.s;
                if (i58 == 0) {
                    y6a.M(obj);
                    s96 s96Var4 = ((d3i) obj3).l;
                    int i59 = this.t;
                    this.s = 1;
                    R2 = s96Var4.R(i59, this);
                    if (R2 == lu3Var29) {
                        return lu3Var29;
                    }
                } else {
                    if (i58 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R2 = obj;
                }
                StagesListResponse stagesListResponse = (StagesListResponse) R2;
                if (stagesListResponse == null || (stages = stagesListResponse.getStages()) == null) {
                    return null;
                }
                Iterator it = stages.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((Stage) obj2).getType() == ServerType.RACE) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Stage stage = (Stage) obj2;
                if (stage != null) {
                    return new Integer(stage.getId());
                }
                return null;
            default:
                lu3 lu3Var30 = lu3.a;
                int i60 = this.s;
                if (i60 == 0) {
                    y6a.M(obj);
                    xr2 xr2Var = new xr2((p5i) obj3, this.t, r10, 4);
                    this.s = 1;
                    P4 = yaa.P(xr2Var, this);
                    break;
                } else {
                    if (i60 != 1) {
                        if (i60 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        R3 = obj;
                        return (List) R3;
                    }
                    y6a.M(obj);
                    P4 = obj;
                }
                x2g x2gVar4 = (x2g) P4;
                if (!(x2gVar4 instanceof v2g)) {
                    return km5.a;
                }
                hs4 hs4Var2 = z45.a;
                hje hjeVar = new hje((v2g) x2gVar4, r10, 9);
                this.s = 2;
                R3 = xw3.R(hs4Var2, hjeVar, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu1(tr3 tr3Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 4;
        this.u = tr3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu1(Object obj, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = obj;
        this.t = i;
    }
}
