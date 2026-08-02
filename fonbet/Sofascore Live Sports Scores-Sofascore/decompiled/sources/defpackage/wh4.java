package defpackage;

import com.moloco.sdk.acm.d;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.client_metrics_data.a;
import com.moloco.sdk.internal.client_metrics_data.b;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.g1;
import com.moloco.sdk.internal.publisher.h1;
import com.moloco.sdk.internal.publisher.nativead.e;
import com.moloco.sdk.internal.publisher.nativead.k;
import com.moloco.sdk.internal.publisher.nativead.m;
import com.moloco.sdk.internal.publisher.nativead.model.n;
import com.moloco.sdk.internal.services.init.p;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.service_locator.f;
import com.sofascore.model.newNetwork.MonthlyUniqueTournamentItem;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class wh4 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public long s;
    public int t;
    public String u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh4(c cVar, g1 g1Var, String str, MediationInfo mediationInfo, p pVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = cVar;
        this.w = g1Var;
        this.u = str;
        this.x = mediationInfo;
        this.z = pVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                wh4 wh4Var = new wh4((ai4) obj2, (String) this.v, rq3Var);
                wh4Var.y = obj;
                return wh4Var;
            case 1:
                return new wh4((m) this.x, (h) this.y, this.u, (h1) obj2, rq3Var);
            default:
                return new wh4((c) this.v, (g1) this.w, this.u, (MediationInfo) this.x, (p) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((wh4) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x031e A[SYNTHETIC] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object w;
        String str;
        av4 av4Var;
        long j;
        Collection collection;
        Object T;
        String str2;
        c38 c38Var;
        Object obj2;
        Object value;
        String str3;
        km5 km5Var;
        long currentTimeMillis;
        Object d;
        lu3 lu3Var;
        long j2;
        int i;
        y yVar;
        Object e;
        y yVar2;
        long j3;
        Throwable a;
        Object obj3;
        com.moloco.sdk.internal.publisher.nativead.model.h hVar;
        y yVar3;
        long currentTimeMillis2;
        Object a2;
        h hVar2;
        int i2 = this.r;
        Object obj4 = this.z;
        switch (i2) {
            case 0:
                ai4 ai4Var = (ai4) obj4;
                long j4 = ai4Var.h;
                ku3 ku3Var = (ku3) this.y;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    String i4 = fc6.i(j4, hk4.a(bi4Var.d()));
                    bi4 bi4Var2 = bi4.PATTERN_NETWORK_YM;
                    String i5 = fc6.i(j4, hk4.a(bi4Var2.d()));
                    long epochSecond = Instant.ofEpochSecond(j4).atZone(ZoneId.systemDefault()).plusMonths(1L).toEpochSecond();
                    String i6 = fc6.i(epochSecond, hk4.a(bi4Var2.d()));
                    int offset = TimeZone.getDefault().getOffset(j4 * 1000) / 1000;
                    StringBuilder sb = new StringBuilder();
                    sb.append(offset);
                    String sb2 = sb.toString();
                    rq3 rq3Var = null;
                    av4 t = xw3.t(ku3Var, null, new vh4(ai4Var, i5, sb2, (String) this.v, rq3Var, 1), 3);
                    av4 t2 = xw3.t(ku3Var, null, new vh4(ai4Var, i6, sb2, (String) this.v, rq3Var, 0), 3);
                    this.y = ku3Var;
                    this.u = i4;
                    this.w = t2;
                    this.s = epochSecond;
                    this.t = 1;
                    w = t.w(this);
                    if (w != lu3Var2) {
                        str = i4;
                        av4Var = t2;
                        j = epochSecond;
                    }
                    return lu3Var2;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection2 = (Collection) this.x;
                    str2 = this.u;
                    y6a.M(obj);
                    collection = collection2;
                    T = obj;
                    c38Var = new c38(i5h.g(new a65(new oh0(CollectionsKt.w0((Iterable) T, collection), 1), new y73(12), 2), new q73(25)));
                    while (true) {
                        if (c38Var.hasNext()) {
                            obj2 = null;
                        } else {
                            obj2 = c38Var.next();
                            if (((MonthlyUniqueTournamentItem) obj2).getDate().compareTo(str2) > 0) {
                            }
                        }
                    }
                    MonthlyUniqueTournamentItem monthlyUniqueTournamentItem = (MonthlyUniqueTournamentItem) obj2;
                    String date = monthlyUniqueTournamentItem != null ? monthlyUniqueTournamentItem.getDate() : null;
                    if (bea.B(ku3Var.getCoroutineContext())) {
                        return Unit.a;
                    }
                    fdi fdiVar = ai4Var.m;
                    do {
                        value = fdiVar.getValue();
                        hh4 hh4Var = (hh4) value;
                        str3 = date == null ? "" : date;
                        km5Var = km5.a;
                        hh4Var.getClass();
                        km5Var.getClass();
                    } while (!fdiVar.k(value, new hh4(true, false, str3, km5Var, km5Var)));
                    return Unit.a;
                }
                j = this.s;
                av4 av4Var2 = (av4) this.w;
                str = this.u;
                y6a.M(obj);
                av4Var = av4Var2;
                w = obj;
                collection = (Collection) w;
                this.y = ku3Var;
                this.u = str;
                this.w = null;
                this.x = collection;
                this.s = j;
                this.t = 2;
                T = av4Var.T(this);
                if (T != lu3Var2) {
                    str2 = str;
                    c38Var = new c38(i5h.g(new a65(new oh0(CollectionsKt.w0((Iterable) T, collection), 1), new y73(12), 2), new q73(25)));
                    while (true) {
                        if (c38Var.hasNext()) {
                        }
                    }
                    MonthlyUniqueTournamentItem monthlyUniqueTournamentItem2 = (MonthlyUniqueTournamentItem) obj2;
                    if (monthlyUniqueTournamentItem2 != null) {
                    }
                    if (bea.B(ku3Var.getCoroutineContext())) {
                    }
                }
                return lu3Var2;
            case 1:
                h1 h1Var = (h1) obj4;
                h hVar3 = (h) this.y;
                m mVar = (m) this.x;
                c cVar = mVar.e;
                lu3 lu3Var3 = lu3.a;
                int i7 = this.t;
                if (i7 == 0) {
                    y6a.M(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    ((AtomicLong) hVar3.a.b).set(System.currentTimeMillis());
                    cVar.b(mVar.g);
                    a[] aVarArr = a.b;
                    d dVar = new d("load_ad_attempted");
                    b[] bVarArr = b.a;
                    String lowerCase = mVar.f.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    dVar.a("ad_type", lowerCase);
                    cVar.a(dVar);
                    String str4 = this.u;
                    this.s = currentTimeMillis;
                    this.t = 1;
                    d = mVar.d(str4, hVar3, h1Var, this);
                    if (d == lu3Var3) {
                        lu3Var = lu3Var3;
                        return lu3Var;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            long j5 = this.s;
                            yVar = (y) this.v;
                            y6a.M(obj);
                            j2 = j5;
                            lu3Var = lu3Var3;
                            i = 4;
                            String str5 = yVar.a;
                            com.moloco.sdk.internal.ortb.model.h hVar4 = yVar.d.d;
                            this.v = yVar;
                            this.s = j2;
                            this.t = 3;
                            e = mVar.e(str5, hVar4, h1Var, this);
                            if (e != lu3Var) {
                                yVar2 = yVar;
                                j3 = j2;
                                a = w2g.a(e);
                                if (a == null) {
                                }
                            }
                            return lu3Var;
                        }
                        if (i7 != 3) {
                            if (i7 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hVar = (com.moloco.sdk.internal.publisher.nativead.model.h) this.w;
                            yVar3 = (y) this.v;
                            y6a.M(obj);
                            obj3 = ((w2g) obj).a;
                            Throwable a3 = w2g.a(obj3);
                            return a3 != null ? new w2g(new e(yVar3, hVar, (n) obj3)) : new w2g(new u2g(a3));
                        }
                        long j6 = this.s;
                        y yVar4 = (y) this.v;
                        y6a.M(obj);
                        j3 = j6;
                        yVar2 = yVar4;
                        e = ((w2g) obj).a;
                        lu3Var = lu3Var3;
                        i = 4;
                        a = w2g.a(e);
                        if (a == null) {
                            return new w2g(new u2g(a));
                        }
                        com.moloco.sdk.internal.publisher.nativead.model.h hVar5 = (com.moloco.sdk.internal.publisher.nativead.model.h) e;
                        this.v = yVar2;
                        this.w = hVar5;
                        this.t = i;
                        Object a4 = mVar.a(yVar2.d.d, hVar5, (h1) obj4, j3, this);
                        if (a4 != lu3Var) {
                            obj3 = a4;
                            hVar = hVar5;
                            yVar3 = yVar2;
                            Throwable a32 = w2g.a(obj3);
                            if (a32 != null) {
                            }
                        }
                        return lu3Var;
                    }
                    currentTimeMillis = this.s;
                    y6a.M(obj);
                    d = ((w2g) obj).a;
                }
                j2 = currentTimeMillis;
                Throwable a5 = w2g.a(d);
                if (a5 != null) {
                    return new w2g(new u2g(a5));
                }
                y yVar5 = (y) d;
                hs4 hs4Var = z45.a;
                r69 r69Var = rob.a;
                lu3Var = lu3Var3;
                i = 4;
                k kVar = new k((h1) obj4, mVar, yVar5, j2, null);
                this.v = yVar5;
                this.s = j2;
                this.t = 2;
                if (xw3.R(r69Var, kVar, this) != lu3Var) {
                    yVar = yVar5;
                    String str52 = yVar.a;
                    com.moloco.sdk.internal.ortb.model.h hVar42 = yVar.d.d;
                    this.v = yVar;
                    this.s = j2;
                    this.t = 3;
                    e = mVar.e(str52, hVar42, h1Var, this);
                    if (e != lu3Var) {
                    }
                }
                return lu3Var;
            default:
                c cVar2 = (c) this.v;
                g1 g1Var = (g1) this.w;
                lu3 lu3Var4 = lu3.a;
                int i8 = this.t;
                if (i8 == 0) {
                    y6a.M(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "startInitialization switch to Dispatchers.IO", null, false, 12, null);
                    com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
                    h c = cVar2.c("sdk_init_time");
                    g1Var.a.getClass();
                    currentTimeMillis2 = System.currentTimeMillis();
                    f fVar = f.a;
                    com.moloco.sdk.internal.services.init.n nVar = (com.moloco.sdk.internal.services.init.n) f.e.getValue();
                    String str6 = this.u;
                    MediationInfo mediationInfo = (MediationInfo) this.x;
                    this.y = c;
                    this.s = currentTimeMillis2;
                    this.t = 1;
                    a2 = nVar.a(str6, mediationInfo, this);
                    if (a2 != lu3Var4) {
                        hVar2 = c;
                    }
                    return lu3Var4;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l0 l0Var = (l0) this.y;
                    y6a.M(obj);
                    return l0Var;
                }
                long j7 = this.s;
                hVar2 = (h) this.y;
                y6a.M(obj);
                currentTimeMillis2 = j7;
                a2 = obj;
                l0 l0Var2 = (l0) a2;
                g1Var.a.getClass();
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                this.y = l0Var2;
                this.t = 2;
                if (((g1) this.w).b(l0Var2, currentTimeMillis3, (p) obj4, cVar2, hVar2, this) != lu3Var4) {
                    return l0Var2;
                }
                return lu3Var4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh4(ai4 ai4Var, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = ai4Var;
        this.v = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh4(m mVar, h hVar, String str, h1 h1Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = mVar;
        this.y = hVar;
        this.u = str;
        this.z = h1Var;
    }
}
