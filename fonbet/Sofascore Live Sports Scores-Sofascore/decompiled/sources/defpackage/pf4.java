package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.league.service.LeagueWorker;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.service.AbstractRetryCoroutineWorker;
import com.sofascore.results.team.TeamWorker;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pf4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public boolean s;
    public int t;
    public /* synthetic */ Object u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf4(s5d s5dVar, String str, AbstractActivity abstractActivity, Function0 function0, boolean z, Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        e6b e6bVar = e6b.a;
        this.v = s5dVar;
        this.w = str;
        this.u = abstractActivity;
        this.x = function0;
        this.s = z;
        this.y = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                pf4 pf4Var = new pf4((dsf) this.w, (qf4) obj3, this.x, this.s, rq3Var);
                pf4Var.u = obj;
                return pf4Var;
            case 1:
                pf4 pf4Var2 = new pf4((nv7) obj2, (ZonedDateTime) obj3, rq3Var);
                pf4Var2.u = obj;
                return pf4Var2;
            case 2:
                pf4 pf4Var3 = new pf4((long[]) this.w, (LeagueWorker) obj2, (wu) obj3, rq3Var, 2);
                pf4Var3.u = obj;
                return pf4Var3;
            case 3:
                s5d s5dVar = (s5d) this.v;
                String str = (String) this.w;
                AbstractActivity abstractActivity = (AbstractActivity) this.u;
                e6b e6bVar = e6b.a;
                return new pf4(s5dVar, str, abstractActivity, (Function0) obj2, this.s, (Function1) obj3, rq3Var);
            default:
                pf4 pf4Var4 = new pf4((long[]) this.w, (TeamWorker) obj2, (wu) obj3, rq3Var, 4);
                pf4Var4.u = obj;
                return pf4Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((pf4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02a6, code lost:
    
        if (r9.c(r10, r25) == r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0238, code lost:
    
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x026e, code lost:
    
        if (r5 == r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (r5 == r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0433, code lost:
    
        if (r0 == r2) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x013f, code lost:
    
        if (defpackage.jid.i(r4, r5, r25) != r8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0492, code lost:
    
        if (r7.c(r25, r8) == r2) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
    
        if (r5 == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        if (r5 == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x030a, code lost:
    
        if (defpackage.jid.c(r3, r4, r25) != r13) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r17v5, types: [kotlin.coroutines.CoroutineContext, rq3] */
    /* JADX WARN: Type inference failed for: r5v23, types: [kotlin.coroutines.CoroutineContext, rq3] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        fml fmlVar;
        dsf dsfVar;
        OddsCountryProvider oddsCountryProvider;
        Object w;
        boolean z;
        yzc yzcVar;
        Object u;
        UniqueTournament uniqueTournament;
        Object u2;
        Object Q;
        lu3 lu3Var;
        Collection collection;
        boolean booleanValue;
        Collection collection2;
        UniqueTournament uniqueTournament2;
        boolean z2;
        rq3 rq3Var;
        Object u3;
        ArrayList arrayList;
        Object T;
        rq3 rq3Var2;
        boolean z3;
        int i = this.r;
        x42 x42Var = x42.a;
        int i2 = 4;
        int i3 = 10;
        int i4 = 0;
        int i5 = 0;
        Object obj2 = this.y;
        Object obj3 = this.x;
        int i6 = 2;
        int i7 = 3;
        rq3 rq3Var3 = null;
        switch (i) {
            case 0:
                qf4 qf4Var = (qf4) obj2;
                dsf dsfVar2 = (dsf) this.w;
                lu3 lu3Var2 = lu3.a;
                int i8 = this.t;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            y6a.M(obj);
                            if (this.s) {
                                qf4Var.h.B(new od4(obj3, obj3 != null ? obj3.hashCode() : 0, dsfVar2.a));
                            }
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        dsf dsfVar3 = (dsf) this.v;
                        fml fmlVar2 = (fml) this.u;
                        y6a.M(obj);
                        fmlVar = fmlVar2;
                        dsfVar = dsfVar3;
                        a = obj;
                    }
                } else {
                    y6a.M(obj);
                    fml fmlVar3 = (fml) this.u;
                    h7a c = qf4Var.c();
                    this.u = fmlVar3;
                    this.v = dsfVar2;
                    this.t = 1;
                    a = c.a(this);
                    if (a != lu3Var2) {
                        fmlVar = fmlVar3;
                        dsfVar = dsfVar2;
                    }
                    break;
                }
                dsfVar.a = ((Number) a).intValue();
                this.u = null;
                this.v = null;
                this.t = 2;
                break;
            case 1:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj2;
                nv7 nv7Var = (nv7) obj3;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var3 = lu3.a;
                int i9 = this.t;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            yzc yzcVar2 = (yzc) this.w;
                            y6a.M(obj);
                            yzcVar = yzcVar2;
                            u = obj;
                            yzcVar.j(u);
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        boolean z4 = this.s;
                        yzcVar = (yzc) this.w;
                        oddsCountryProvider = (OddsCountryProvider) this.v;
                        y6a.M(obj);
                        z = z4;
                        w = obj;
                    }
                } else {
                    y6a.M(obj);
                    int i10 = nv7Var.h;
                    boolean z5 = zu3.V.hasMcc(Integer.valueOf(i10)) || zu3.d0.hasMcc(Integer.valueOf(i10)) || zu3.z.hasMcc(Integer.valueOf(i10));
                    bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    String format = zonedDateTime.format(hk4.a(bi4Var.d()));
                    format.getClass();
                    av4 t = xw3.t(ku3Var, null, new yp7(nv7Var, format, rq3Var3, i7), 3);
                    ArrayList arrayList2 = nv7Var.t;
                    oddsCountryProvider = arrayList2 != null ? (OddsCountryProvider) CollectionsKt.firstOrNull(arrayList2) : null;
                    yzc yzcVar3 = nv7Var.p;
                    this.u = ku3Var;
                    this.v = oddsCountryProvider;
                    this.w = yzcVar3;
                    this.s = z5;
                    this.t = 1;
                    w = t.w(this);
                    if (w != lu3Var3) {
                        z = z5;
                        yzcVar = yzcVar3;
                    }
                    break;
                }
                OddsCountryProvider oddsCountryProvider2 = oddsCountryProvider;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : (Iterable) w) {
                    Event event = (Event) obj4;
                    long startTimestamp = event.getStartTimestamp();
                    Long endTimestamp = event.getEndTimestamp();
                    if (aba.J(startTimestamp, endTimestamp != null ? endTimestamp.longValue() : 0L, zonedDateTime.toEpochSecond())) {
                        arrayList3.add(obj4);
                    }
                }
                List H0 = CollectionsKt.H0(arrayList3, new se7(i3));
                ArrayList arrayList4 = new ArrayList(k13.r(H0, 10));
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    arrayList4.add(xw3.t(ku3Var, null, new kv7(oddsCountryProvider2, (Event) it.next(), z, nv7Var, (rq3) null), 3));
                }
                this.u = null;
                this.v = null;
                this.w = yzcVar;
                this.s = z;
                this.t = 2;
                u = m6k.u(arrayList4, this);
                break;
            case 2:
                LeagueWorker leagueWorker = (LeagueWorker) obj3;
                ku3 ku3Var2 = (ku3) this.u;
                lu3 lu3Var4 = lu3.a;
                int i11 = this.t;
                char c2 = 5;
                rq3 rq3Var4 = null;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 == 5) {
                                        y6a.M(obj);
                                        ad2 ad2Var = qv5.a;
                                        qv5.a(x42Var);
                                        break;
                                    } else {
                                        a70.r("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    }
                                } else {
                                    z2 = this.s;
                                    y6a.M(obj);
                                    lu3Var = lu3Var4;
                                    uniqueTournament2 = null;
                                    jid jidVar = leagueWorker.e;
                                    Context applicationContext = leagueWorker.getApplicationContext();
                                    applicationContext.getClass();
                                    this.u = uniqueTournament2;
                                    this.v = uniqueTournament2;
                                    this.s = z2;
                                    this.t = 5;
                                    break;
                                }
                            } else {
                                booleanValue = this.s;
                                Collection collection3 = (List) this.v;
                                y6a.M(obj);
                                uniqueTournament = null;
                                collection2 = collection3;
                                boolean z6 = booleanValue;
                                if (z6) {
                                    wu wuVar = (wu) obj2;
                                    ArrayList arrayList5 = new ArrayList(k13.r(collection2, 10));
                                    Iterator it2 = collection2.iterator();
                                    while (it2.hasNext()) {
                                        wu wuVar2 = wuVar;
                                        ?? r5 = uniqueTournament;
                                        arrayList5.add(xw3.t(ku3Var2, r5, new zi7(leagueWorker, (UniqueTournament) it2.next(), wuVar2, (rq3) r5, 21), 3));
                                        uniqueTournament = r5;
                                        lu3Var4 = lu3Var4;
                                        wuVar = wuVar2;
                                    }
                                    UniqueTournament uniqueTournament3 = uniqueTournament;
                                    lu3Var = lu3Var4;
                                    uniqueTournament2 = uniqueTournament3;
                                    this.u = uniqueTournament2;
                                    this.v = uniqueTournament2;
                                    this.s = z6;
                                    this.t = 4;
                                    if (m6k.u(arrayList5, this) != lu3Var) {
                                        z2 = z6;
                                        jid jidVar2 = leagueWorker.e;
                                        Context applicationContext2 = leagueWorker.getApplicationContext();
                                        applicationContext2.getClass();
                                        this.u = uniqueTournament2;
                                        this.v = uniqueTournament2;
                                        this.s = z2;
                                        this.t = 5;
                                    }
                                    break;
                                }
                            }
                        } else {
                            Collection collection4 = (List) this.v;
                            y6a.M(obj);
                            collection = collection4;
                            uniqueTournament = null;
                            Q = obj;
                            booleanValue = ((Boolean) Q).booleanValue();
                            udl udlVar = leagueWorker.f;
                            ArrayList arrayList6 = new ArrayList(k13.r(collection, 10));
                            Iterator it3 = collection.iterator();
                            while (it3.hasNext()) {
                                w1l.A(arrayList6, ((UniqueTournament) it3.next()).getId());
                            }
                            this.u = ku3Var2;
                            this.v = collection;
                            this.s = booleanValue;
                            this.t = 3;
                            collection2 = collection;
                            break;
                        }
                    } else {
                        y6a.M(obj);
                        u2 = obj;
                        uniqueTournament = null;
                    }
                } else {
                    y6a.M(obj);
                    long[] jArr = (long[]) this.w;
                    ArrayList arrayList7 = new ArrayList(jArr.length);
                    int length = jArr.length;
                    while (i5 < length) {
                        arrayList7.add(xw3.t(ku3Var2, null, new z40(leagueWorker, jArr[i5], rq3Var4, 2), 3));
                        i5++;
                        length = length;
                        c2 = 5;
                    }
                    uniqueTournament = null;
                    this.u = ku3Var2;
                    this.t = 1;
                    u2 = m6k.u(arrayList7, this);
                    break;
                }
                ArrayList arrayList8 = new ArrayList();
                for (UniqueTournamentResponse uniqueTournamentResponse : (Iterable) u2) {
                    UniqueTournament uniqueTournament4 = uniqueTournamentResponse != null ? uniqueTournamentResponse.getUniqueTournament() : uniqueTournament;
                    if (uniqueTournament4 != null) {
                        arrayList8.add(uniqueTournament4);
                    }
                }
                w3b w3bVar = leagueWorker.b;
                this.u = ku3Var2;
                this.v = arrayList8;
                this.t = 2;
                Q = w3bVar.Q(arrayList8, this);
                collection = arrayList8;
                break;
            case 3:
                lu3 lu3Var5 = lu3.a;
                int i12 = this.t;
                if (i12 == 0) {
                    y6a.M(obj);
                    th2 B = yqo.B(k53.g0(new wj0(new n5d(yso.q(new j8c((s5d) this.v, (String) this.w, rq3Var3, 12)), (Function0) obj3, this.s), i7), z45.a), ((AbstractActivity) this.u).getLifecycle(), e6b.e);
                    je3 je3Var = new je3(i6, (Function1) obj2);
                    this.t = 1;
                    if (B.collect(je3Var, this) == lu3Var5) {
                        break;
                    }
                } else if (i12 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                TeamWorker teamWorker = (TeamWorker) obj3;
                ku3 ku3Var3 = (ku3) this.u;
                lu3 lu3Var6 = lu3.a;
                int i13 = this.t;
                rq3 rq3Var5 = null;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    y6a.M(obj);
                                    ad2 ad2Var2 = qv5.a;
                                    qv5.a(x42Var);
                                    break;
                                } else {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                z3 = this.s;
                                y6a.M(obj);
                                rq3Var2 = null;
                                jid jidVar3 = teamWorker.e;
                                Context applicationContext3 = teamWorker.getApplicationContext();
                                applicationContext3.getClass();
                                this.u = rq3Var2;
                                this.v = rq3Var2;
                                this.s = z3;
                                this.t = 4;
                                break;
                            }
                        } else {
                            ArrayList arrayList9 = (ArrayList) this.v;
                            y6a.M(obj);
                            arrayList = arrayList9;
                            rq3Var = null;
                            T = obj;
                            boolean booleanValue2 = ((Boolean) T).booleanValue();
                            if (booleanValue2) {
                                wu wuVar3 = (wu) obj2;
                                ArrayList arrayList10 = new ArrayList(k13.r(arrayList, 10));
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    ?? r17 = rq3Var;
                                    arrayList10.add(xw3.t(ku3Var3, r17, new h4i(teamWorker, (Team) ((Pair) it4.next()).a, wuVar3, (rq3) r17, 13), 3));
                                    rq3Var = r17;
                                }
                                rq3Var2 = rq3Var;
                                this.u = rq3Var2;
                                this.v = rq3Var2;
                                this.s = booleanValue2;
                                this.t = 3;
                                if (m6k.u(arrayList10, this) != lu3Var6) {
                                    z3 = booleanValue2;
                                    jid jidVar32 = teamWorker.e;
                                    Context applicationContext32 = teamWorker.getApplicationContext();
                                    applicationContext32.getClass();
                                    this.u = rq3Var2;
                                    this.v = rq3Var2;
                                    this.s = z3;
                                    this.t = 4;
                                }
                                break;
                            }
                        }
                    } else {
                        y6a.M(obj);
                        u3 = obj;
                        rq3Var = null;
                    }
                } else {
                    y6a.M(obj);
                    long[] jArr2 = (long[]) this.w;
                    ArrayList arrayList11 = new ArrayList(jArr2.length);
                    for (int length2 = jArr2.length; i4 < length2; length2 = length2) {
                        arrayList11.add(xw3.t(ku3Var3, null, new z40(teamWorker, jArr2[i4], rq3Var5, 7), 3));
                        i4++;
                    }
                    rq3Var = null;
                    this.u = ku3Var3;
                    this.t = 1;
                    u3 = m6k.u(arrayList11, this);
                    break;
                }
                arrayList = new ArrayList();
                Iterator it5 = ((Iterable) u3).iterator();
                while (it5.hasNext()) {
                    TeamDetailsResponse teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) it5.next());
                    rq3 pair = teamDetailsResponse != null ? new Pair(teamDetailsResponse.getTeam(), Boolean.TRUE) : rq3Var;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                j0j j0jVar = teamWorker.b;
                this.u = ku3Var3;
                this.v = arrayList;
                this.t = 2;
                fvi fviVar = j0jVar.a;
                T = gz8.T(this, fviVar.a, new fzh(fviVar, arrayList, rq3Var, i2));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf4(nv7 nv7Var, ZonedDateTime zonedDateTime, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.x = nv7Var;
        this.y = zonedDateTime;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf4(dsf dsfVar, qf4 qf4Var, Object obj, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.w = dsfVar;
        this.y = qf4Var;
        this.x = obj;
        this.s = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf4(long[] jArr, AbstractRetryCoroutineWorker abstractRetryCoroutineWorker, wu wuVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = jArr;
        this.x = abstractRetryCoroutineWorker;
        this.y = wuVar;
    }
}
