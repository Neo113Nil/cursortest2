package defpackage;

import android.app.Application;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.sofascore.model.chat.Message;
import com.sofascore.model.database.DbSavedSearches;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.RiskyTopic;
import com.sofascore.model.newNetwork.RiskyTopicsResponse;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.results.crowdsourcing.CrowdsourcingDeleteIncidentModal;
import com.sofascore.results.view.CupTreeView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hy1 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy1(rq3 rq3Var, k6g k6gVar, Function1 function1) {
        super(2, rq3Var);
        this.r = 29;
        this.t = k6gVar;
        this.u = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                hy1 hy1Var = new hy1((ox9) obj2, rq3Var, 0);
                hy1Var.t = obj;
                return hy1Var;
            case 1:
                return new hy1((q32) this.t, (oqf) obj2, rq3Var, 1);
            case 2:
                return new hy1((x32) this.t, (mi) obj2, rq3Var, 2);
            case 3:
                hy1 hy1Var2 = new hy1((p03) obj2, rq3Var, 3);
                hy1Var2.t = obj;
                return hy1Var2;
            case 4:
                return new hy1((z88) this.t, (p03) obj2, rq3Var, 4);
            case 5:
                hy1 hy1Var3 = new hy1((rn2) obj2, rq3Var, 5);
                hy1Var3.t = obj;
                return hy1Var3;
            case 6:
                hy1 hy1Var4 = new hy1((un2) obj2, rq3Var, 6);
                hy1Var4.t = obj;
                return hy1Var4;
            case 7:
                return new hy1((z88) this.t, (n4h) obj2, rq3Var, 7);
            case 8:
                return new hy1((RiskyTopic) this.t, (pq2) obj2, rq3Var, 8);
            case 9:
                hy1 hy1Var5 = new hy1((pq2) obj2, rq3Var, 9);
                hy1Var5.t = obj;
                return hy1Var5;
            case 10:
                return new hy1((pq2) this.t, (MmaEvent) obj2, rq3Var, 10);
            case 11:
                return new hy1((br2) this.t, (String) obj2, rq3Var, 11);
            case 12:
                return new hy1((us2) this.t, (Message) obj2, rq3Var, 12);
            case 13:
                hy1 hy1Var6 = new hy1((ku2) obj2, rq3Var, 13);
                hy1Var6.t = obj;
                return hy1Var6;
            case 14:
                return new hy1((p63) this.t, (IRecent) obj2, rq3Var, 14);
            case 15:
                return new hy1((te3) obj2, rq3Var, 15);
            case 16:
                return new hy1((xe3) this.t, (Runnable) obj2, rq3Var, 16);
            case 17:
                return new hy1((Function2) this.t, (p0f) obj2, rq3Var, 17);
            case 18:
                return new hy1((Function2) this.t, (fsf) obj2, rq3Var, 18);
            case 19:
                return new hy1((sn3) this.t, (Purchase) obj2, rq3Var, 19);
            case 20:
                return new hy1((tr3) this.t, (Event) obj2, rq3Var, 20);
            case 21:
                hy1 hy1Var7 = new hy1((ks3) obj2, rq3Var, 21);
                hy1Var7.t = obj;
                return hy1Var7;
            case 22:
                return new hy1((qze) this.t, (tbj) obj2, rq3Var, 22);
            case 23:
                return new hy1((CrowdsourcingDeleteIncidentModal) obj2, rq3Var, 23);
            case 24:
                return new hy1((w24) this.t, (k24) obj2, rq3Var, 24);
            case 25:
                return new hy1((z88) this.t, (fdi) obj2, rq3Var, 25);
            case 26:
                return new hy1((q54) obj2, rq3Var, 26);
            case 27:
                return new hy1((CupTreeView) this.t, (j94) obj2, rq3Var, 27);
            case 28:
                return new hy1((yda) this.t, (w84) obj2, rq3Var, 28);
            default:
                return new hy1(rq3Var, (k6g) this.t, (Function1) obj2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((hy1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((hy1) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((hy1) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((hy1) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 28:
                ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((hy1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (defpackage.n4o.y(500, r32) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x05ec, code lost:
    
        if (r2.i("CHAT_USER_COUNTRY_FLAG", r9, r32) == r1) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05cc, code lost:
    
        if (r2 == r1) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x06a8, code lost:
    
        if (r0 == r2) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0665, code lost:
    
        if (r3 == r2) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x071e, code lost:
    
        if (r0 == r2) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x074b, code lost:
    
        if (r0 == r2) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        if (defpackage.bea.q(r3, r32) == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a4 -> B:21:0x00a8). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object y;
        Object d;
        Object P;
        Object u;
        Object e;
        Object u2;
        Object value;
        du2 du2Var;
        ArrayList arrayList;
        asf asfVar;
        Object value2;
        vnb vnbVar;
        Object value3;
        vnb vnbVar2;
        Object y2;
        w24 w24Var;
        Object y3;
        fdi fdiVar;
        a64 a64Var;
        Object e2;
        int i = this.r;
        int i2 = 5;
        int i3 = 2;
        int i4 = 3;
        Object obj2 = this.u;
        int i5 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        switch (i) {
            case 0:
                ox9 ox9Var = (ox9) obj2;
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    meb mebVar = new meb((fu3) ox9Var.b, ((ku3) this.t).getCoroutineContext());
                    g33 g33Var = (g33) ox9Var.c;
                    this.s = 1;
                    if (g33Var.invoke(mebVar, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((h63) ox9Var.e).invoke();
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    q32 q32Var = (q32) this.t;
                    w1 w1Var = new w1((oqf) obj2, 22);
                    this.s = 1;
                    if (zm2.l(q32Var, w1Var, this) == lu3Var2) {
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
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (zm2.l((x32) this.t, (mi) obj2, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    b98 b98Var = (b98) this.t;
                    dsf dsfVar = new dsf();
                    dsfVar.a = Integer.MIN_VALUE;
                    v98 v98Var = new v98((gki) ((p03) obj2).d, new d11(i3, z ? 1 : 0, i2), i3);
                    tf2 tf2Var = new tf2(dsfVar, b98Var);
                    this.s = 1;
                    if (v98Var.collect(tf2Var, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    z88 z88Var = (z88) this.t;
                    f10 f10Var = new f10((p03) obj2, i4);
                    this.s = 1;
                    Object collect = z88Var.collect(new tf2(f10Var, new dsf()), this);
                    if (collect != lu3Var5) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                k8f k8fVar = (k8f) this.t;
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (((rn2) obj2).g(k8fVar, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 6:
                b98 b98Var2 = (b98) this.t;
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (((un2) obj2).k(b98Var2, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((z88) this.t).collect((n4h) obj2, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                s96 s96Var = ((pq2) obj2).f;
                RiskyTopic riskyTopic = (RiskyTopic) this.t;
                lu3 lu3Var9 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    String topicDomain = riskyTopic.getTopicDomain();
                    Integer topicDomainId = riskyTopic.getTopicDomainId();
                    if (topicDomain == null || topicDomainId == null) {
                        return null;
                    }
                    if (!topicDomain.equals("event")) {
                        if (!topicDomain.equals("stage")) {
                            return null;
                        }
                        int intValue = topicDomainId.intValue();
                        this.s = 2;
                        y = s96Var.y(intValue, this);
                        break;
                    } else {
                        int intValue2 = topicDomainId.intValue();
                        this.s = 1;
                        d = s96Var.d(intValue2, this);
                        break;
                    }
                    return lu3Var9;
                }
                if (i14 == 1) {
                    y6a.M(obj);
                    d = obj;
                    x2g x2gVar = (x2g) d;
                    if (!(x2gVar instanceof v2g)) {
                        return null;
                    }
                    EventResponse eventResponse = (EventResponse) ((v2g) x2gVar).a;
                    eventResponse.getEvent();
                    riskyTopic.setChatInterfaceModel(eventResponse.getEvent());
                } else {
                    if (i14 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    y = obj;
                    StageResponse stageResponse = (StageResponse) y;
                    if (stageResponse == null) {
                        return null;
                    }
                    joa joaVar = l5i.a;
                    Stage stage = stageResponse.getStage();
                    l5i.l(stage);
                    riskyTopic.setChatInterfaceModel(stage);
                }
                return riskyTopic;
            case 9:
                pq2 pq2Var = (pq2) obj2;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var10 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    cs2 cs2Var = pq2Var.g;
                    this.t = ku3Var;
                    this.s = 1;
                    cs2Var.getClass();
                    P = yaa.P(new r3(cs2Var, z2 ? 1 : 0, i2), this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        u = obj;
                        ArrayList W = CollectionsKt.W((Iterable) u);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = W.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (((RiskyTopic) next).getChatInterfaceModel() != null) {
                                arrayList2.add(next);
                            }
                        }
                        pq2Var.p.j(arrayList2);
                        return Unit.a;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                x2g x2gVar2 = (x2g) P;
                if (x2gVar2 instanceof v2g) {
                    List<RiskyTopic> risky = ((RiskyTopicsResponse) ((v2g) x2gVar2).a).getRisky();
                    ArrayList arrayList3 = new ArrayList(k13.r(risky, 10));
                    Iterator<T> it2 = risky.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(xw3.t(ku3Var, null, new hy1((RiskyTopic) it2.next(), pq2Var, z3 ? 1 : 0, 8), 3));
                    }
                    this.t = null;
                    this.s = 2;
                    u = m6k.u(arrayList3, this);
                    break;
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var2 = ((pq2) this.t).e;
                int id = ((MmaEvent) obj2).getId();
                this.s = 1;
                s96Var2.getClass();
                Object P2 = yaa.P(new a86(s96Var2, id, z4 ? 1 : 0, 9), this);
                return P2 == lu3Var11 ? lu3Var11 : P2;
            case 11:
                String str = (String) obj2;
                br2 br2Var = (br2) this.t;
                lu3 lu3Var12 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    cg4 cg4Var = br2Var.l;
                    this.s = 1;
                    e = cg4Var.e("CHAT_USER_COUNTRY_FLAG", null, this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        br2Var.k(wq2.a);
                        return Unit.a;
                    }
                    y6a.M(obj);
                    e = obj;
                }
                String str2 = (String) e;
                String str3 = str == null ? "" : str;
                if (str2 == null) {
                    str2 = "";
                }
                if (!str3.equals(str2)) {
                    cg4 cg4Var2 = br2Var.l;
                    if (str == null) {
                        str = "";
                    }
                    this.s = 2;
                    break;
                }
                br2Var.k(wq2.a);
                return Unit.a;
            case 12:
                Message message = (Message) obj2;
                us2 us2Var = (us2) this.t;
                lu3 lu3Var13 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (us2Var.k(new Message[]{message}, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                us2Var.f.k(message);
                return Unit.a;
            case 13:
                ku2 ku2Var = (ku2) obj2;
                fdi fdiVar2 = ku2Var.q;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var14 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    List list = ku2Var.n;
                    List list2 = ((du2) fdiVar2.getValue()).c;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        o13.v(((fu2) it3.next()).a, arrayList4);
                    }
                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList4));
                    ArrayList arrayList5 = new ArrayList(k13.r(S0, 10));
                    Iterator it4 = S0.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(xw3.t(ku3Var2, null, new ok0(((Number) it4.next()).intValue(), list, ku2Var, (rq3) null), 3));
                    }
                    this.t = null;
                    this.s = 1;
                    u2 = m6k.u(arrayList5, this);
                    if (u2 == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u2 = obj;
                }
                Map o = tub.o((Iterable) u2);
                do {
                    value = fdiVar2.getValue();
                    du2Var = (du2) value;
                    List<fu2> list3 = du2Var.c;
                    arrayList = new ArrayList(k13.r(list3, 10));
                    for (fu2 fu2Var : list3) {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it5 = fu2Var.a.iterator();
                        boolean z10 = false;
                        while (it5.hasNext()) {
                            List list4 = (List) me4.f(((Number) it5.next()).intValue(), o);
                            if (list4 != null) {
                                arrayList6.addAll(list4);
                                z10 = true;
                            }
                        }
                        if (z10) {
                            ArrayList u3 = mx9.u(ku2Var.i(), arrayList6, null, null, false, false, false, false, null, 7676);
                            Event event = (Event) CollectionsKt.firstOrNull(arrayList6);
                            long startTimestamp = event != null ? event.getStartTimestamp() : fu2Var.c;
                            Event event2 = (Event) CollectionsKt.j0(arrayList6);
                            fu2Var = new fu2(fu2Var.a, u3, startTimestamp, event2 != null ? event2.getStartTimestamp() : fu2Var.d);
                        }
                        arrayList.add(fu2Var);
                    }
                } while (!fdiVar2.k(value, du2.a(du2Var, null, arrayList, null, null, 27)));
                ku2Var.v = null;
                return Unit.a;
            case 14:
                IRecent iRecent = (IRecent) obj2;
                p63 p63Var = (p63) this.t;
                lu3 lu3Var15 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    uwg uwgVar = p63Var.c;
                    int id2 = iRecent.getId();
                    String str4 = p63Var.f.b;
                    this.s = 1;
                    DbSavedSearches dbSavedSearches = new DbSavedSearches(id2, str4, uwgVar.f(iRecent), System.currentTimeMillis() / 1000);
                    gwg gwgVar = uwgVar.b;
                    Object U = gz8.U(this, gwgVar.a, false, true, new aaf(13, gwgVar, dbSavedSearches));
                    Object obj3 = U;
                    if (U != lu3Var15) {
                        obj3 = Unit.a;
                    }
                    if (obj3 != lu3Var15) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                te3 te3Var = (te3) obj2;
                lu3 lu3Var16 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    if (te3Var.s()) {
                        asf asfVar2 = new asf();
                        Function2 function2 = te3Var.d;
                        g62 g62Var = te3Var.e;
                        g62Var.getClass();
                        t98 t98Var = new t98(f5p.x(g62Var), new zy1((Object) asfVar2, (rq3) (z5 ? 1 : 0), i5), 0);
                        this.t = asfVar2;
                        this.s = 1;
                        if (function2.invoke(t98Var, this) == lu3Var16) {
                            return lu3Var16;
                        }
                        asfVar = asfVar2;
                    }
                    return Unit.a;
                }
                if (i21 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                asfVar = (asf) this.t;
                y6a.M(obj);
                if (!asfVar.a) {
                    a70.r("You must collect the progress flow");
                    return null;
                }
                return Unit.a;
            case 16:
                xe3 xe3Var = (xe3) this.t;
                lu3 lu3Var17 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    ef9 ef9Var = xe3Var.f;
                    this.s = 1;
                    Object b = ef9Var.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - ef9Var.b, this);
                    if (b != lu3Var17) {
                        b = Unit.a;
                    }
                    if (b == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((eoh) ((e1d) xe3Var.c.b)).setValue(Boolean.FALSE);
                ((Runnable) obj2).run();
                return Unit.a;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object invoke = ((Function2) this.t).invoke((p0f) obj2, this);
                    return invoke == lu3Var18 ? lu3Var18 : invoke;
                }
                if (i23 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i24 = this.s;
                if (i24 != 0) {
                    if (i24 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Function2 function22 = (Function2) this.t;
                Object obj4 = ((fsf) obj2).a;
                this.s = 1;
                Object invoke2 = function22.invoke(obj4, this);
                return invoke2 == lu3Var19 ? lu3Var19 : invoke2;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    el elVar = ((sn3) this.t).b;
                    String originalJson = ((Purchase) obj2).getOriginalJson();
                    originalJson.getClass();
                    this.s = 1;
                    elVar.getClass();
                    if (yaa.P(new bl(elVar, originalJson, z6 ? 1 : 0, i5), this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((tr3) this.t).k.emit((Event) obj2, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                ks3 ks3Var = (ks3) obj2;
                fdi fdiVar3 = ks3Var.e;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var22 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    do {
                        value2 = fdiVar3.getValue();
                        vnbVar = (vnb) value2;
                        vnbVar.getClass();
                        if (vnbVar instanceof unb) {
                            vnbVar = new unb(is3.a((is3) ((unb) vnbVar).a, true));
                        }
                    } while (!fdiVar3.k(value2, vnbVar));
                    av4 t = xw3.t(ku3Var3, null, new ip1(ks3Var, z7 ? 1 : 0, i2), 3);
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(500, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    if (z8e.e0(t, R, this) == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                do {
                    value3 = fdiVar3.getValue();
                    vnbVar2 = (vnb) value3;
                    vnbVar2.getClass();
                    if (vnbVar2 instanceof unb) {
                        vnbVar2 = new unb(is3.a((is3) ((unb) vnbVar2).a, false));
                    }
                } while (!fdiVar3.k(value3, vnbVar2));
                return Unit.a;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    qze qzeVar = (qze) this.t;
                    kt3 kt3Var = new kt3((tbj) obj2, i5);
                    this.s = 1;
                    if (rti.d(qzeVar, null, kt3Var, this, 7) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 23:
                CrowdsourcingDeleteIncidentModal crowdsourcingDeleteIncidentModal = (CrowdsourcingDeleteIncidentModal) obj2;
                lu3 lu3Var24 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    w24 w24Var2 = (w24) crowdsourcingDeleteIncidentModal.C.getValue();
                    hof hofVar = ((tr3) crowdsourcingDeleteIncidentModal.B.getValue()).w;
                    this.t = w24Var2;
                    this.s = 1;
                    y2 = rd0.y(hofVar, this);
                    if (y2 == lu3Var24) {
                        return lu3Var24;
                    }
                    w24Var = w24Var2;
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w24Var = (w24) this.t;
                    y6a.M(obj);
                    y2 = obj;
                }
                k24 k24Var = (k24) y2;
                w24Var.getClass();
                k24Var.getClass();
                xw3.L(un0.z(w24Var), null, null, new hy1(w24Var, k24Var, z8 ? 1 : 0, 24), 3);
                return Unit.a;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((w24) this.t).f.emit((k24) obj2, this) == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((z88) this.t).collect((fdi) obj2, this) == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 26:
                q54 q54Var = (q54) obj2;
                lu3 lu3Var27 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    fdi fdiVar4 = q54Var.u;
                    aeh aehVar = q54Var.h;
                    this.t = fdiVar4;
                    this.s = 1;
                    y3 = rd0.y(aehVar, this);
                    if (y3 == lu3Var27) {
                        return lu3Var27;
                    }
                    fdiVar = fdiVar4;
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fdiVar = (fdi) this.t;
                    y6a.M(obj);
                    y3 = obj;
                }
                w34 w34Var = ((k24) y3).b;
                if (w34Var instanceof u34) {
                    a64Var = a64.c;
                } else {
                    if (!(w34Var instanceof v34)) {
                        zzl.b();
                        return null;
                    }
                    a64Var = a64.a;
                }
                fdiVar.getClass();
                fdiVar.m(null, a64Var);
                fdi fdiVar5 = q54Var.g;
                q44 q44Var = q44.b;
                fdiVar5.getClass();
                fdiVar5.m(null, q44Var);
                return Unit.a;
            case 27:
                CupTreeView cupTreeView = (CupTreeView) this.t;
                lu3 lu3Var28 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    v02 v02Var = v02.b;
                    Context context = cupTreeView.getContext();
                    context.getClass();
                    j94 j94Var = (j94) obj2;
                    int i34 = cupTreeView.i;
                    q8g rowStyle = cupTreeView.getRowStyle();
                    Integer num = cupTreeView.p ? cupTreeView.m : null;
                    this.s = 1;
                    e2 = v02Var.e(context, j94Var, i34, rowStyle, num, this);
                    if (e2 == lu3Var28) {
                        return lu3Var28;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e2 = obj;
                }
                return new Pair(e2, (j94) obj2);
            case 28:
                w84 w84Var = (w84) obj2;
                xnh xnhVar = w84Var.c;
                lu3 lu3Var29 = lu3.a;
                int i35 = this.s;
                try {
                    if (i35 != 0) {
                        if (i35 != 1) {
                            if (i35 == 2) {
                                y6a.M(obj);
                                throw new fka();
                            }
                            if (i35 != 3) {
                                if (i35 != 4) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj);
                                xnhVar.i(1.0f);
                                this.s = 3;
                                if (n4o.y(500L, this) == lu3Var29) {
                                    return lu3Var29;
                                }
                                xnhVar.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                this.s = 4;
                                break;
                            } else {
                                y6a.M(obj);
                                xnhVar.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                this.s = 4;
                            }
                        } else {
                            y6a.M(obj);
                        }
                    } else {
                        y6a.M(obj);
                        yda ydaVar = (yda) this.t;
                        if (ydaVar != null) {
                            this.s = 1;
                            break;
                        }
                    }
                    xnhVar.i(1.0f);
                    if (!w84Var.a) {
                        this.s = 2;
                        n4o.u(this);
                        return lu3Var29;
                    }
                    this.s = 3;
                    if (n4o.y(500L, this) == lu3Var29) {
                    }
                    xnhVar.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.s = 4;
                } catch (Throwable th) {
                    xnhVar.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    throw th;
                }
            default:
                lu3 lu3Var30 = lu3.a;
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
                k6g k6gVar = (k6g) this.t;
                ib4 ib4Var = new ib4(k6gVar, z9 ? 1 : 0, (Function1) obj2, i5);
                this.s = 1;
                Object useConnection = k6gVar.useConnection(false, ib4Var, this);
                return useConnection == lu3Var30 ? lu3Var30 : useConnection;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy1(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy1(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }
}
