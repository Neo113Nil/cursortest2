package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.CategoriesForDateResponse;
import com.sofascore.model.newNetwork.EventListResponse;
import java.io.Serializable;
import java.text.Collator;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lai4;", "Lq8;", "hh4", "ih4", "gh4", "lh4", "jh4", "kh4", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ai4 extends q8 {
    public final vyh e;
    public final vrj f;
    public final w3b g;
    public final long h;
    public final SimpleDateFormat i;
    public final String j;
    public final String k;
    public boolean l;
    public final fdi m;
    public final jof n;
    public final yzc o;
    public final lec p;
    public final yzc q;
    public final lec r;
    public boolean s;
    public final HashMap t;
    public yda u;
    public oqb v;
    public Map w;
    public Set x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai4(Application application, fqg fqgVar, vyh vyhVar, vrj vrjVar, w3b w3bVar) {
        super(application);
        fqgVar.getClass();
        vyhVar.getClass();
        vrjVar.getClass();
        w3bVar.getClass();
        this.e = vyhVar;
        this.f = vrjVar;
        this.g = w3bVar;
        Long l = (Long) fqgVar.a("ARG_TIMESTAMP");
        this.h = l != null ? l.longValue() : 0L;
        this.i = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Calendar calendar = ke0.a;
        String b = ke0.b(i());
        this.j = b;
        this.k = dv3.c();
        this.l = qha.D(application, b);
        km5 km5Var = km5.a;
        fdi a = gdi.a(new hh4(false, false, null, km5Var, km5Var));
        this.m = a;
        this.n = un0.u(a);
        yzc yzcVar = new yzc();
        this.o = yzcVar;
        this.p = waa.w(yzcVar);
        yzc yzcVar2 = new yzc();
        this.q = yzcVar2;
        this.r = waa.w(yzcVar2);
        this.t = new HashMap();
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.w = lm5Var;
        this.x = rm5.a;
    }

    public final void k(boolean z) {
        int i = 0;
        boolean z2 = this.l != z;
        this.l = z;
        if (z2) {
            xw3.L(un0.z(this), null, null, new mh4(this, null, i), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, boolean z, sq3 sq3Var) {
        nh4 nh4Var;
        int i;
        boolean z2;
        if (sq3Var instanceof nh4) {
            nh4Var = (nh4) sq3Var;
            int i2 = nh4Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nh4Var.u = i2 - Integer.MIN_VALUE;
                nh4 nh4Var2 = nh4Var;
                Object obj = nh4Var2.s;
                lu3 lu3Var = lu3.a;
                i = nh4Var2.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    DateTimeFormatter a = hk4.a(bi4Var.d());
                    long j = this.h;
                    String i3 = fc6.i(j, a);
                    if (z) {
                        oqb oqbVar = this.v;
                        String z3 = oqbVar != null ? i2a.z(oqbVar, j, false) : "";
                        nh4Var2.r = z;
                        nh4Var2.u = 1;
                        vyh vyhVar = this.e;
                        vyhVar.getClass();
                        obj = yaa.P(new tyh(vyhVar, str, i3, z3, null, 0), nh4Var2);
                        if (obj != lu3Var) {
                            z2 = z;
                        }
                    } else {
                        jk jkVar = new jk(this, str, i3, rq3Var, 6);
                        nh4Var2.r = z;
                        nh4Var2.u = 3;
                        Object r = s9a.r(jkVar, nh4Var2);
                        if (r != lu3Var) {
                            return r;
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    if (i == 3) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = nh4Var2.r;
                y6a.M(obj);
                CategoriesForDateResponse categoriesForDateResponse = (CategoriesForDateResponse) yaa.x((x2g) obj);
                Calendar calendar = ke0.a;
                String valueOf = String.valueOf(ke0.c());
                hs4 hs4Var = z45.a;
                r1 r1Var = new r1(categoriesForDateResponse, valueOf, rq3Var, 16);
                nh4Var2.r = z2;
                nh4Var2.u = 2;
                Object R = xw3.R(hs4Var, r1Var, nh4Var2);
                return R != lu3Var ? lu3Var : R;
            }
        }
        nh4Var = new nh4(this, sq3Var);
        nh4 nh4Var22 = nh4Var;
        Object obj2 = nh4Var22.s;
        lu3 lu3Var2 = lu3.a;
        i = nh4Var22.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        CategoriesForDateResponse categoriesForDateResponse2 = (CategoriesForDateResponse) yaa.x((x2g) obj2);
        Calendar calendar2 = ke0.a;
        String valueOf2 = String.valueOf(ke0.c());
        hs4 hs4Var2 = z45.a;
        r1 r1Var2 = new r1(categoriesForDateResponse2, valueOf2, rq3Var2, 16);
        nh4Var22.r = z2;
        nh4Var22.u = 2;
        Object R2 = xw3.R(hs4Var2, r1Var2, nh4Var22);
        if (R2 != lu3Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r15 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(sq3 sq3Var) {
        oh4 oh4Var;
        int i;
        String i2;
        if (sq3Var instanceof oh4) {
            oh4Var = (oh4) sq3Var;
            int i3 = oh4Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oh4Var.u = i3 - Integer.MIN_VALUE;
                Object obj = oh4Var.s;
                lu3 lu3Var = lu3.a;
                i = oh4Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    i2 = fc6.i(this.h, hk4.a(bi4Var.d()));
                    oh4Var.r = i2;
                    oh4Var.u = 1;
                    obj = this.g.m(this.j, oh4Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = oh4Var.r;
                    y6a.M(obj);
                }
                hj hjVar = new hj((Set) obj, this.x, this, i2, u(), this.w, (rq3) null);
                oh4Var.r = null;
                oh4Var.u = 2;
                Object r = s9a.r(hjVar, oh4Var);
                return r != lu3Var ? lu3Var : r;
            }
        }
        oh4Var = new oh4(this, sq3Var);
        Object obj2 = oh4Var.s;
        lu3 lu3Var2 = lu3.a;
        i = oh4Var.u;
        if (i != 0) {
        }
        hj hjVar2 = new hj((Set) obj2, this.x, this, i2, u(), this.w, (rq3) null);
        oh4Var.r = null;
        oh4Var.u = 2;
        Object r2 = s9a.r(hjVar2, oh4Var);
        if (r2 != lu3Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x017a, code lost:
    
        if (r0 == r7) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(HashSet hashSet, boolean z, sq3 sq3Var) {
        qh4 qh4Var;
        int i;
        HashSet hashSet2;
        boolean z2;
        Object obj;
        boolean z3;
        EventListResponse eventListResponse;
        boolean z4;
        List list;
        List<Event> events;
        if (sq3Var instanceof qh4) {
            qh4Var = (qh4) sq3Var;
            int i2 = qh4Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qh4Var.x = i2 - Integer.MIN_VALUE;
                qh4 qh4Var2 = qh4Var;
                Object obj2 = qh4Var2.v;
                lu3 lu3Var = lu3.a;
                i = qh4Var2.x;
                if (i != 0) {
                    y6a.M(obj2);
                    LocalDate now = LocalDate.now(ZoneId.systemDefault());
                    LocalDate minusDays = now.minusDays(14L);
                    LocalDate plusDays = now.plusDays(14L);
                    long j = this.h;
                    LocalDate t = fc6.t(Instant.ofEpochSecond(j));
                    boolean z5 = (t.isAfter(plusDays) || t.isBefore(minusDays)) ? false : true;
                    if (z5 && hashSet.size() < 15) {
                        oqb oqbVar = this.v;
                        if ((oqbVar != null ? i2a.x(oqbVar, j, false) : 0) <= 0) {
                            bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            String i3 = fc6.i(j, hk4.a(bi4Var.d()));
                            hashSet2 = hashSet;
                            qh4Var2.r = hashSet2;
                            qh4Var2.t = z;
                            qh4Var2.u = z5;
                            qh4Var2.x = 1;
                            vyh vyhVar = this.e;
                            vyhVar.getClass();
                            Object P = yaa.P(new tyh(vyhVar, this.j, this.k, i3, null, 1), qh4Var2);
                            if (P != lu3Var) {
                                z2 = z5;
                                obj = P;
                                z3 = z;
                            }
                            return lu3Var;
                        }
                    }
                    return km5.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = qh4Var2.s;
                    y6a.M(obj2);
                    List list2 = (List) obj2;
                    List c = a.c(new dhe(this.l, list.size()));
                    return this.l ? CollectionsKt.w0(list2, c) : c;
                }
                boolean z6 = qh4Var2.u;
                z3 = qh4Var2.t;
                HashSet hashSet3 = qh4Var2.r;
                y6a.M(obj2);
                obj = obj2;
                hashSet2 = hashSet3;
                z2 = z6;
                eventListResponse = (EventListResponse) yaa.x((x2g) obj);
                rq3 rq3Var = null;
                if (eventListResponse != null || (events = eventListResponse.getEvents()) == null) {
                    z4 = z3;
                    list = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : events) {
                        if (!hashSet2.contains(new Integer(((Event) obj3).getId()))) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Event event = (Event) next;
                        long startTimestamp = event.getStartTimestamp();
                        Long endTimestamp = event.getEndTimestamp();
                        boolean z7 = z3;
                        if (aba.J(startTimestamp, endTimestamp != null ? endTimestamp.longValue() : 0L, this.h)) {
                            arrayList2.add(next);
                        }
                        z3 = z7;
                    }
                    z4 = z3;
                    list = CollectionsKt.L0(arrayList2, 8);
                }
                if (list != null || list.isEmpty()) {
                    return km5.a;
                }
                boolean z8 = !z4;
                qh4Var2.r = null;
                qh4Var2.s = list;
                qh4Var2.t = z4;
                qh4Var2.u = z2;
                qh4Var2.x = 2;
                obj2 = list.isEmpty() ? km5.a : xw3.R(z45.a, new l84(this, list, z8, rq3Var, 2), qh4Var2);
            }
        }
        qh4Var = new qh4(this, sq3Var);
        qh4 qh4Var22 = qh4Var;
        Object obj22 = qh4Var22.v;
        lu3 lu3Var2 = lu3.a;
        i = qh4Var22.x;
        if (i != 0) {
        }
        eventListResponse = (EventListResponse) yaa.x((x2g) obj);
        rq3 rq3Var2 = null;
        if (eventListResponse != null) {
        }
        z4 = z3;
        list = null;
        if (list != null) {
        }
        return km5.a;
    }

    public final void o(String str) {
        str.getClass();
        if (this.v != null) {
            yda ydaVar = this.u;
            rq3 rq3Var = null;
            if (ydaVar != null) {
                ydaVar.e(null);
            }
            this.u = xw3.L(un0.z(this), null, null, new t3(this, str, rq3Var, 4), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0059, code lost:
    
        if (r13 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098 A[LOOP:1: B:43:0x0092->B:45:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable t(sq3 sq3Var) {
        uh4 uh4Var;
        Object obj;
        lu3 lu3Var;
        int i;
        List list;
        ai4 ai4Var;
        List list2;
        List list3;
        Iterator it;
        Object n;
        List list4;
        List list5;
        List list6;
        if (sq3Var instanceof uh4) {
            uh4Var = (uh4) sq3Var;
            int i2 = uh4Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uh4Var.w = i2 - Integer.MIN_VALUE;
                obj = uh4Var.u;
                lu3Var = lu3.a;
                i = uh4Var.w;
                rq3 rq3Var = null;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj);
                    uh4Var.w = 1;
                    obj = m(uh4Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                list5 = uh4Var.t;
                                list6 = uh4Var.s;
                                y6a.M(obj);
                                Set set = (Set) obj;
                                for (Object obj2 : list6) {
                                    lrj lrjVar = obj2 instanceof lrj ? (lrj) obj2 : null;
                                    if (lrjVar != null) {
                                        Set set2 = set;
                                        UniqueTournament uniqueTournament = lrjVar.a.getUniqueTournament();
                                        lrjVar.m = CollectionsKt.R(set2, uniqueTournament != null ? new Integer(uniqueTournament.getId()) : null);
                                    }
                                }
                                return CollectionsKt.w0(list5, list6);
                            }
                            list4 = uh4Var.s;
                            y6a.M(obj);
                            ai4Var = this;
                            list5 = (List) obj;
                            uh4Var.r = null;
                            uh4Var.s = list4;
                            uh4Var.t = list5;
                            uh4Var.w = 4;
                            obj = ai4Var.g.b(uh4Var);
                            if (obj != lu3Var) {
                                list6 = list4;
                                Set set3 = (Set) obj;
                                while (r1.hasNext()) {
                                }
                                return CollectionsKt.w0(list5, list6);
                            }
                            return lu3Var;
                        }
                        list2 = uh4Var.r;
                        y6a.M(obj);
                        ai4Var = this;
                        list3 = (List) obj;
                        ArrayList arrayList = new ArrayList(k13.r(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                            w1l.A(arrayList, ((Event) it.next()).getId());
                        }
                        HashSet Q0 = CollectionsKt.Q0(arrayList);
                        if (list3 != null || !list3.isEmpty()) {
                            for (Object obj3 : list3) {
                                if ((obj3 instanceof lrj) && ((lrj) obj3).i != null) {
                                    break;
                                }
                            }
                        }
                        z = false;
                        uh4Var.r = null;
                        uh4Var.s = list3;
                        uh4Var.w = 3;
                        n = ai4Var.n(Q0, z, uh4Var);
                        if (n != lu3Var) {
                            list4 = list3;
                            obj = n;
                            list5 = (List) obj;
                            uh4Var.r = null;
                            uh4Var.s = list4;
                            uh4Var.t = list5;
                            uh4Var.w = 4;
                            obj = ai4Var.g.b(uh4Var);
                            if (obj != lu3Var) {
                            }
                        }
                        return lu3Var;
                    }
                    y6a.M(obj);
                }
                list = (List) obj;
                uh4Var.r = list;
                uh4Var.w = 2;
                if (list.isEmpty()) {
                    ai4Var = this;
                    obj = xw3.R(z45.a, new l84(ai4Var, list, z, rq3Var, 2), uh4Var);
                } else {
                    obj = km5.a;
                    ai4Var = this;
                }
                if (obj != lu3Var) {
                    list2 = list;
                    list3 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    HashSet Q02 = CollectionsKt.Q0(arrayList2);
                    if (list3 != null) {
                    }
                    while (r5.hasNext()) {
                    }
                    z = false;
                    uh4Var.r = null;
                    uh4Var.s = list3;
                    uh4Var.w = 3;
                    n = ai4Var.n(Q02, z, uh4Var);
                    if (n != lu3Var) {
                    }
                }
                return lu3Var;
            }
        }
        uh4Var = new uh4(this, sq3Var);
        obj = uh4Var.u;
        lu3Var = lu3.a;
        i = uh4Var.w;
        rq3 rq3Var2 = null;
        boolean z2 = true;
        if (i != 0) {
        }
        list = (List) obj;
        uh4Var.r = list;
        uh4Var.w = 2;
        if (list.isEmpty()) {
        }
        if (obj != lu3Var) {
        }
        return lu3Var;
    }

    public final boolean u() {
        oqb oqbVar = this.v;
        return (oqbVar != null ? i2a.x(oqbVar, this.h, false) : 0) > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r1 == r8) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(ci6 ci6Var, sq3 sq3Var) {
        xh4 xh4Var;
        Object obj;
        lu3 lu3Var;
        int i;
        ci6 ci6Var2;
        yzc yzcVar;
        ci6 ci6Var3 = ci6Var;
        if (sq3Var instanceof xh4) {
            xh4Var = (xh4) sq3Var;
            int i2 = xh4Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xh4Var.u = i2 - Integer.MIN_VALUE;
                xh4 xh4Var2 = xh4Var;
                obj = xh4Var2.s;
                lu3Var = lu3.a;
                i = xh4Var2.u;
                Object obj2 = null;
                Object[] objArr = 0;
                if (i != 0) {
                    y6a.M(obj);
                    bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    String i3 = fc6.i(this.h, hk4.a(bi4Var.d()));
                    int id = ci6Var3.b.getId();
                    xh4Var2.r = ci6Var3;
                    xh4Var2.u = 1;
                    vyh vyhVar = this.e;
                    vyhVar.getClass();
                    obj = yaa.P(new ryh(vyhVar, id, i3, objArr == true ? 1 : 0, 1), xh4Var2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ci6Var2 = xh4Var2.r;
                        y6a.M(obj);
                        List list = (List) obj;
                        ArrayList arrayList = ci6Var2.c;
                        Category category = ci6Var2.b;
                        arrayList.clear();
                        ci6Var2.c.addAll(list);
                        category.setDownloading(false);
                        yzcVar = (yzc) this.t.get(new Integer(category.getId()));
                        if (yzcVar != null) {
                            yzcVar.j(new gh4(ci6Var2, list));
                        }
                        return Unit.a;
                    }
                    ci6Var3 = xh4Var2.r;
                    y6a.M(obj);
                }
                ci6 ci6Var4 = ci6Var3;
                x2g x2gVar = (x2g) obj;
                if (u()) {
                    obj2 = (Set) me4.f(ci6Var4.b.getId(), this.w);
                    if (obj2 == null) {
                        obj2 = rm5.a;
                    }
                }
                Context i4 = i();
                hs4 hs4Var = z45.a;
                t53 t53Var = new t53(x2gVar, i4, this, obj2, null, 2);
                xh4Var2.r = ci6Var4;
                xh4Var2.u = 2;
                obj = xw3.R(hs4Var, t53Var, xh4Var2);
                if (obj != lu3Var) {
                    ci6Var2 = ci6Var4;
                    List list2 = (List) obj;
                    ArrayList arrayList2 = ci6Var2.c;
                    Category category2 = ci6Var2.b;
                    arrayList2.clear();
                    ci6Var2.c.addAll(list2);
                    category2.setDownloading(false);
                    yzcVar = (yzc) this.t.get(new Integer(category2.getId()));
                    if (yzcVar != null) {
                    }
                    return Unit.a;
                }
                return lu3Var;
            }
        }
        xh4Var = new xh4(this, sq3Var);
        xh4 xh4Var22 = xh4Var;
        obj = xh4Var22.s;
        lu3Var = lu3.a;
        i = xh4Var22.u;
        Object obj22 = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        ci6 ci6Var42 = ci6Var3;
        x2g x2gVar2 = (x2g) obj;
        if (u()) {
        }
        Context i42 = i();
        hs4 hs4Var2 = z45.a;
        t53 t53Var2 = new t53(x2gVar2, i42, this, obj22, null, 2);
        xh4Var22.r = ci6Var42;
        xh4Var22.u = 2;
        obj = xw3.R(hs4Var2, t53Var2, xh4Var22);
        if (obj != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[LOOP:0: B:15:0x0059->B:20:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(ArrayList arrayList, sq3 sq3Var) {
        yh4 yh4Var;
        int i;
        fdi fdiVar;
        Object value;
        boolean u;
        if (sq3Var instanceof yh4) {
            yh4Var = (yh4) sq3Var;
            int i2 = yh4Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yh4Var.t = i2 - Integer.MIN_VALUE;
                Object obj = yh4Var.r;
                lu3 lu3Var = lu3.a;
                i = yh4Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    h10 h10Var = new h10(this, arrayList, rq3Var, 4);
                    yh4Var.t = 1;
                    obj = s9a.r(h10Var, yh4Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Pair pair = (Pair) obj;
                List list = (List) pair.a;
                List list2 = (List) pair.b;
                if (bea.B(yh4Var.getContext())) {
                    return Unit.a;
                }
                do {
                    fdiVar = this.m;
                    value = fdiVar.getValue();
                    u = u();
                    ((hh4) value).getClass();
                    list.getClass();
                    list2.getClass();
                } while (!fdiVar.k(value, new hh4(true, u, null, list, list2)));
                return Unit.a;
            }
        }
        yh4Var = new yh4(this, sq3Var);
        Object obj2 = yh4Var.r;
        lu3 lu3Var2 = lu3.a;
        i = yh4Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        List list3 = (List) pair2.a;
        List list22 = (List) pair2.b;
        if (bea.B(yh4Var.getContext())) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(sq3 sq3Var) {
        zh4 zh4Var;
        int i;
        List list;
        fdi fdiVar;
        Object value;
        if (sq3Var instanceof zh4) {
            zh4Var = (zh4) sq3Var;
            int i2 = zh4Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zh4Var.t = i2 - Integer.MIN_VALUE;
                Object obj = zh4Var.r;
                Object obj2 = lu3.a;
                i = zh4Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    zh4Var.t = 1;
                    obj = t(zh4Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                list = (List) obj;
                do {
                    fdiVar = this.m;
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, hh4.a((hh4) value, null, list, 15)));
                return Unit.a;
            }
        }
        zh4Var = new zh4(this, sq3Var);
        Object obj3 = zh4Var.r;
        Object obj22 = lu3.a;
        i = zh4Var.t;
        if (i != 0) {
        }
        list = (List) obj3;
        do {
            fdiVar = this.m;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, hh4.a((hh4) value, null, list, 15)));
        return Unit.a;
    }

    public final ArrayList y(List list) {
        List H0;
        int i = 1;
        if (!Intrinsics.c(this.j, Sports.TENNIS)) {
            int i2 = ke0.c;
            Iterator it = list.iterator();
            int i3 = 2147483643;
            while (it.hasNext()) {
                Category category = (Category) it.next();
                List<Integer> mccList = category.getMccList();
                if (mccList != null && mccList.contains(Integer.valueOf(i2))) {
                    category.setPriority(i3);
                    i3--;
                }
            }
        }
        Context i4 = i();
        list.getClass();
        int i5 = 0;
        try {
            qe8 qe8Var = new qe8(23);
            Locale locale = Locale.getDefault();
            locale.getClass();
            H0 = CollectionsKt.H0(list, new xl2(qe8Var, new xl2(Collator.getInstance(locale), i4, i5), i));
        } catch (Exception e) {
            s38 a = s38.a();
            a.b("Broken sort for locale=" + Locale.getDefault().getLanguage());
            a.c(e);
            qe8 qe8Var2 = new qe8(24);
            Locale locale2 = Locale.US;
            locale2.getClass();
            H0 = CollectionsKt.H0(list, new xl2(qe8Var2, new xl2(Collator.getInstance(locale2), i4, i5), i));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : H0) {
            if (((Category) obj).getTotalEvents() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
