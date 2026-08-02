package defpackage;

import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.FeaturedOddsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.model.profile.EditorEventOpeningsGraphResponse;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iva extends hoi implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public final /* synthetic */ int r = 1;
    public Collection s;
    public Iterator t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iva(Event event, kva kvaVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.D = event;
        this.B = kvaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new iva((Event) this.D, (kva) this.B, rq3Var);
            default:
                iva ivaVar = new iva((av4) this.F, rq3Var);
                ivaVar.E = obj;
                return ivaVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((iva) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x036f, code lost:
    
        if (r14 != null) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ea  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r20v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40, types: [zu4] */
    /* JADX WARN: Type inference failed for: r9v20, types: [zu4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0178 -> B:24:0x0181). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01b7 -> B:8:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0211 -> B:24:0x0181). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0321 -> B:70:0x032a). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Event event;
        int i;
        int i2;
        Iterator it;
        List list;
        Event event2;
        int i3;
        int i4;
        Map<String, ProviderOdds> featured;
        ProviderOdds providerOdds;
        long j;
        av4 av4Var;
        Collection arrayList;
        Iterator it2;
        int i5;
        int i6;
        int i7;
        Iterator it3;
        Date date;
        Object obj2;
        Collection collection;
        int i8;
        av4 av4Var2;
        Collection collection2;
        int i9;
        int i10;
        int i11;
        EditorEventOpeningsGraphResponse editorEventOpeningsGraphResponse;
        Integer num;
        Map<Long, Integer> points;
        Set<Map.Entry<Long, Integer>> entrySet;
        Iterator it4;
        Object obj3;
        Map.Entry entry;
        int i12;
        Map<Long, Integer> points2;
        Set<Map.Entry<Long, Integer>> entrySet2;
        int i13 = 0;
        switch (this.r) {
            case 0:
                kva kvaVar = (kva) this.B;
                lu3 lu3Var = lu3.a;
                int i14 = this.z;
                if (i14 == 0) {
                    y6a.M(obj);
                    event = (Event) this.D;
                    if (event != null) {
                        if (!rld.s(kvaVar.i(), vmd.LEAGUE_DETAILS, event, false)) {
                            event = null;
                        }
                        if (event != null) {
                            List list2 = kvaVar.w;
                            amd amdVar = kvaVar.h;
                            if (list2 == null) {
                                bga bgaVar = xld.a;
                                List b = xld.b(kvaVar.i());
                                BrandingTournament brandingTournament = kvaVar.k;
                                List e = rld.e(brandingTournament != null ? brandingTournament.getOddsProviderId() : null, b);
                                if (e == null && (e = amdVar.a(o3a.F(event.getTournament()))) == null) {
                                    e = amdVar.c();
                                }
                                kvaVar.w = e;
                            }
                            int i15 = amdVar.c().size() > 1 ? 1 : 0;
                            List list3 = kvaVar.w;
                            if (list3 != null) {
                                List arrayList2 = new ArrayList();
                                i = i15;
                                i2 = 0;
                                it = list3.iterator();
                                list = arrayList2;
                                event2 = event;
                                i3 = 0;
                                i4 = 0;
                                if (it.hasNext()) {
                                }
                            }
                            event2 = event;
                            r14 = km5.a;
                            gv9 W = l6g.W(r14);
                            event2.getClass();
                            OddsEventUIModel oddsEventUIModel = new OddsEventUIModel(event2.getId(), o3a.F(event2.getTournament()), event2.getStatusType(), ok3.s(event2), event2.shouldReverseTeams());
                            List list4 = kvaVar.w;
                            return new xmd(W, list4 == null ? (OddsCountryProvider) CollectionsKt.firstOrNull(list4) : null, oddsEventUIModel, (tld) null, 24);
                        }
                    }
                } else if (i14 == 1) {
                    int i16 = this.y;
                    int i17 = this.x;
                    int i18 = this.w;
                    int i19 = this.v;
                    int i20 = this.u;
                    String str = (String) this.F;
                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) this.E;
                    Iterator it5 = this.t;
                    Collection collection3 = this.s;
                    Event event3 = (Event) this.C;
                    kva kvaVar2 = (kva) this.A;
                    y6a.M(obj);
                    i4 = i16;
                    kvaVar = kvaVar2;
                    Event event4 = event3;
                    List list5 = collection3;
                    Iterator it6 = it5;
                    OddsCountryProvider oddsCountryProvider2 = oddsCountryProvider;
                    int i21 = i19;
                    i3 = i17;
                    i2 = i18;
                    i13 = i20;
                    Object b2 = obj;
                    FeaturedOddsResponse featuredOddsResponse = (FeaturedOddsResponse) b2;
                    and b3 = (featuredOddsResponse != null || (featured = featuredOddsResponse.getFeatured()) == null || (providerOdds = featured.get(str)) == null || !(i21 == 0 || providerOdds.getMarketId() == 1)) ? null : sld.b(kvaVar.i(), oddsCountryProvider2, providerOdds, ok3.s(event4));
                    if (b3 != null) {
                        list5.add(b3);
                    }
                    i = i21;
                    it = it6;
                    list = list5;
                    event2 = event4;
                    if (it.hasNext()) {
                        OddsCountryProvider oddsCountryProvider3 = (OddsCountryProvider) it.next();
                        String featuredOddsType = i != 0 ? "fullTime" : oddsCountryProvider3.getFeaturedOddsType();
                        umd umdVar = kvaVar.g;
                        this.A = kvaVar;
                        this.C = event2;
                        this.s = list;
                        this.t = it;
                        this.E = oddsCountryProvider3;
                        this.F = featuredOddsType;
                        this.u = i13;
                        this.v = i;
                        this.w = i2;
                        this.x = i3;
                        this.y = i4;
                        this.z = 1;
                        b2 = umdVar.b(event2, oddsCountryProvider3, this);
                        if (b2 == lu3Var) {
                            return lu3Var;
                        }
                        i21 = i;
                        str = featuredOddsType;
                        event4 = event2;
                        list5 = list;
                        it6 = it;
                        oddsCountryProvider2 = oddsCountryProvider3;
                        FeaturedOddsResponse featuredOddsResponse2 = (FeaturedOddsResponse) b2;
                        if (featuredOddsResponse2 != null) {
                        }
                        if (b3 != null) {
                        }
                        i = i21;
                        it = it6;
                        list = list5;
                        event2 = event4;
                        if (it.hasNext()) {
                            List list6 = list;
                            if (list6 != null) {
                                if (list6.size() < kvaVar.h.i) {
                                    list6 = null;
                                    break;
                                }
                            }
                            event = event2;
                            event2 = event;
                            list6 = km5.a;
                            gv9 W2 = l6g.W(list6);
                            event2.getClass();
                            OddsEventUIModel oddsEventUIModel2 = new OddsEventUIModel(event2.getId(), o3a.F(event2.getTournament()), event2.getStatusType(), ok3.s(event2), event2.shouldReverseTeams());
                            List list42 = kvaVar.w;
                            return new xmd(W2, list42 == null ? (OddsCountryProvider) CollectionsKt.firstOrNull(list42) : null, oddsEventUIModel2, (tld) null, 24);
                        }
                    }
                } else {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                ku3 ku3Var = (ku3) this.E;
                lu3 lu3Var2 = lu3.a;
                int i22 = this.z;
                if (i22 == 0) {
                    j = 1000;
                    y6a.M(obj);
                    Calendar calendar = Calendar.getInstance();
                    calendar.getClass();
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    calendar.set(5, calendar.getActualMaximum(5));
                    fg2 fg2Var = new fg2(calendar.getTimeInMillis());
                    calendar.set(5, 1);
                    calendar.add(2, -5);
                    fg2 fg2Var2 = new fg2(calendar.getTimeInMillis());
                    qg2 qg2Var = new qg2(fg2Var2, fg2Var, (9 - fg2Var2.c().get(7)) % 7);
                    av4Var = (av4) this.F;
                    arrayList = new ArrayList(k13.r(qg2Var, 10));
                    it2 = qg2Var.iterator();
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    if (!it2.hasNext()) {
                    }
                } else if (i22 == 1) {
                    j = 1000;
                    int i23 = this.y;
                    int i24 = this.x;
                    int i25 = this.w;
                    int i26 = this.v;
                    int i27 = this.u;
                    Collection collection4 = (Collection) this.C;
                    Date date2 = (Date) this.B;
                    Iterator it7 = this.t;
                    Collection collection5 = this.s;
                    ?? r5 = (zu4) this.A;
                    y6a.M(obj);
                    i10 = i23;
                    i11 = i24;
                    i9 = i25;
                    collection2 = collection5;
                    date = date2;
                    collection = collection4;
                    i8 = i27;
                    i7 = i26;
                    av4Var2 = r5;
                    it3 = it7;
                    obj2 = obj;
                    editorEventOpeningsGraphResponse = (EditorEventOpeningsGraphResponse) obj2;
                    if (editorEventOpeningsGraphResponse != null) {
                        it4 = entrySet.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                            }
                        }
                        entry = (Map.Entry) obj3;
                        if (entry != null) {
                        }
                    }
                    num = null;
                    if (num != null) {
                    }
                    av4Var = r9;
                    int i28 = i9;
                    it2 = it3;
                    collection.add(r5);
                    arrayList = r8;
                    i5 = i28;
                    i6 = i8;
                    if (!it2.hasNext()) {
                    }
                } else {
                    if (i22 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i11 = this.x;
                    i9 = this.w;
                    i7 = this.v;
                    i8 = this.u;
                    collection = (Collection) this.D;
                    Date date3 = (Date) this.B;
                    Iterator it8 = this.t;
                    j = 1000;
                    Collection collection6 = this.s;
                    ?? r9 = (zu4) this.A;
                    y6a.M(obj);
                    Object T = obj;
                    Collection collection7 = collection6;
                    av4 av4Var3 = r9;
                    EditorEventOpeningsGraphResponse editorEventOpeningsGraphResponse2 = (EditorEventOpeningsGraphResponse) T;
                    if (editorEventOpeningsGraphResponse2 != null && (points2 = editorEventOpeningsGraphResponse2.getPoints()) != null && (entrySet2 = points2.entrySet()) != null) {
                        Map.Entry entry2 = null;
                        for (?? r20 : entrySet2) {
                            if (((Number) ((Map.Entry) r20).getKey()).longValue() * j < date3.getTime()) {
                                entry2 = r20;
                            }
                        }
                        Map.Entry entry3 = entry2;
                        if (entry3 != null) {
                            i12 = ((Number) entry3.getValue()).intValue();
                            ki5 ki5Var = new ki5(i11, i12);
                            it3 = it8;
                            Collection collection8 = collection7;
                            av4 av4Var4 = av4Var3;
                            av4Var = av4Var4;
                            int i282 = i9;
                            it2 = it3;
                            collection.add(ki5Var);
                            arrayList = collection8;
                            i5 = i282;
                            i6 = i8;
                            if (!it2.hasNext()) {
                                Object next = it2.next();
                                int i29 = i5 + 1;
                                if (i5 < 0) {
                                    b.q();
                                    throw null;
                                }
                                Date date4 = (Date) next;
                                this.E = ku3Var;
                                this.A = av4Var;
                                Collection collection9 = arrayList;
                                this.s = collection9;
                                this.t = it2;
                                this.B = date4;
                                this.C = collection9;
                                this.D = null;
                                this.u = i6;
                                this.v = i7;
                                this.w = i29;
                                this.x = i5;
                                this.y = 0;
                                this.z = 1;
                                obj2 = av4Var.T(this);
                                if (obj2 != lu3Var2) {
                                    it3 = it2;
                                    date = date4;
                                    i9 = i29;
                                    collection = arrayList;
                                    i8 = i6;
                                    av4Var2 = av4Var;
                                    i10 = 0;
                                    i11 = i5;
                                    collection2 = collection;
                                    editorEventOpeningsGraphResponse = (EditorEventOpeningsGraphResponse) obj2;
                                    if (editorEventOpeningsGraphResponse != null && (points = editorEventOpeningsGraphResponse.getPoints()) != null && (entrySet = points.entrySet()) != null) {
                                        it4 = entrySet.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                obj3 = null;
                                            } else {
                                                obj3 = it4.next();
                                                if (((Number) ((Map.Entry) obj3).getKey()).longValue() == date.getTime() / j) {
                                                }
                                            }
                                        }
                                        entry = (Map.Entry) obj3;
                                        if (entry != null) {
                                            num = (Integer) entry.getValue();
                                            if (num != null) {
                                                ki5Var = new ki5(i11, num.intValue());
                                                collection8 = collection2;
                                                av4Var4 = av4Var2;
                                            } else if (i11 == 0) {
                                                this.E = ku3Var;
                                                this.A = av4Var2;
                                                this.s = collection2;
                                                this.t = it3;
                                                this.B = date;
                                                this.C = null;
                                                this.D = collection;
                                                this.u = i8;
                                                this.v = i7;
                                                this.w = i9;
                                                this.x = i11;
                                                this.y = i10;
                                                this.z = 2;
                                                T = av4Var2.T(this);
                                                if (T != lu3Var2) {
                                                    date3 = date;
                                                    it8 = it3;
                                                    collection7 = collection2;
                                                    av4Var3 = av4Var2;
                                                    EditorEventOpeningsGraphResponse editorEventOpeningsGraphResponse22 = (EditorEventOpeningsGraphResponse) T;
                                                    if (editorEventOpeningsGraphResponse22 != null) {
                                                        Map.Entry entry22 = null;
                                                        while (r5.hasNext()) {
                                                        }
                                                        Map.Entry entry32 = entry22;
                                                        if (entry32 != null) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                ki5Var = new ki5(i11, -1);
                                                collection8 = collection2;
                                                av4Var4 = av4Var2;
                                            }
                                            av4Var = av4Var4;
                                            int i2822 = i9;
                                            it2 = it3;
                                            collection.add(ki5Var);
                                            arrayList = collection8;
                                            i5 = i2822;
                                            i6 = i8;
                                            if (!it2.hasNext()) {
                                                return (List) arrayList;
                                            }
                                        }
                                    }
                                    num = null;
                                    if (num != null) {
                                    }
                                    av4Var = av4Var4;
                                    int i28222 = i9;
                                    it2 = it3;
                                    collection.add(ki5Var);
                                    arrayList = collection8;
                                    i5 = i28222;
                                    i6 = i8;
                                    if (!it2.hasNext()) {
                                    }
                                }
                                return lu3Var2;
                            }
                        }
                    }
                    i12 = 0;
                    ki5 ki5Var2 = new ki5(i11, i12);
                    it3 = it8;
                    Collection collection82 = collection7;
                    av4 av4Var42 = av4Var3;
                    av4Var = av4Var42;
                    int i282222 = i9;
                    it2 = it3;
                    collection.add(ki5Var2);
                    arrayList = collection82;
                    i5 = i282222;
                    i6 = i8;
                    if (!it2.hasNext()) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iva(av4 av4Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.F = av4Var;
    }
}
