package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.model.database.DbMediaReaction;
import com.sofascore.model.mvvm.model.CountrySignupLink;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TeamUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPostReactionsResponse;
import com.sofascore.model.odds.AllOddsWithProvider;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hj extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public boolean u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(xs5 xs5Var, int i, boolean z, bs2 bs2Var, r82 r82Var, im imVar, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.v = xs5Var;
        this.s = i;
        this.u = z;
        this.w = bs2Var;
        this.x = r82Var;
        this.y = imVar;
        this.z = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                hj hjVar = new hj((ij) obj2, rq3Var, 0);
                hjVar.x = obj;
                return hjVar;
            case 1:
                hj hjVar2 = new hj((Set) this.v, (Set) this.w, (ai4) this.x, (String) this.y, this.u, (Map) obj2, rq3Var);
                hjVar2.t = obj;
                return hjVar2;
            case 2:
                hj hjVar3 = new hj((xs5) this.v, this.s, this.u, (bs2) this.w, (r82) this.x, (im) this.y, (String) obj2, rq3Var);
                hjVar3.t = obj;
                return hjVar3;
            case 3:
                hj hjVar4 = new hj((tm7) obj2, this.u, rq3Var);
                hjVar4.t = obj;
                return hjVar4;
            case 4:
                hj hjVar5 = new hj((Set) this.x, (w31) this.y, (u8c) obj2, rq3Var);
                hjVar5.t = obj;
                return hjVar5;
            case 5:
                hj hjVar6 = new hj((hth) this.v, (q50) this.w, (q50) this.x, (q50) this.y, (e1d) obj2, this.u, rq3Var);
                hjVar6.t = obj;
                return hjVar6;
            default:
                hj hjVar7 = new hj((xwi) obj2, rq3Var, 6);
                hjVar7.t = obj;
                return hjVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((hj) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x029f, code lost:
    
        if (r0 == r4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0286, code lost:
    
        if (r5 == r4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x034e, code lost:
    
        if (r5 == r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0175, code lost:
    
        if (r2 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x08d7, code lost:
    
        if (r1 == null) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x092f, code lost:
    
        if (r15 == null) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06e8, code lost:
    
        if (r1 == r2) goto L309;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f2 A[LOOP:3: B:151:0x03ec->B:153:0x03f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x040b A[LOOP:4: B:156:0x0405->B:158:0x040b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x044a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v62, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v87, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v14, types: [km5] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List list;
        av4 t;
        km5<AllOddsWithProvider> km5Var;
        Object u;
        List list2;
        Iterator it;
        Object T;
        List list3;
        LinkedHashMap linkedHashMap;
        List<CountrySignupLink> list4;
        gv9 gv9Var;
        List list5;
        qld qldVar;
        Set keySet;
        Object u2;
        Object value;
        List split$default;
        av4 t2;
        zu4 t3;
        Object w;
        Object T2;
        zu4 zu4Var;
        do7 do7Var;
        Object T3;
        do7 do7Var2;
        List<mj7> list6;
        ?? r6;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Object obj2;
        Iterator it5;
        Object obj3;
        av4 t4;
        boolean contains;
        Object w2;
        DbMediaReaction dbMediaReaction;
        Object T4;
        av4 t5;
        av4 p;
        Boolean bool;
        Object w3;
        av4 av4Var;
        av4 av4Var2;
        boolean c;
        Object T5;
        av4 av4Var3;
        yzc yzcVar;
        List list7;
        Object T6;
        List list8;
        boolean z2;
        yzc yzcVar2;
        List<UniqueTournament> list9;
        Object e;
        boolean z3;
        x2g x2gVar;
        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse;
        String str;
        twi twiVar;
        fdi fdiVar;
        Object value2;
        String sportSlug;
        twi twiVar2;
        Object obj4;
        int i = 5;
        int i2 = 6;
        int i3 = 4;
        int i4 = 2;
        boolean z4 = true;
        boolean z5 = true;
        switch (this.r) {
            case 0:
                ij ijVar = (ij) this.z;
                ku3 ku3Var = (ku3) this.x;
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                char c2 = '\n';
                rq3 rq3Var = null;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.y;
                            list3 = (List) this.t;
                            list2 = (List) this.v;
                            y6a.M(obj);
                            T = obj;
                            linkedHashMap = linkedHashMap2;
                            List list10 = list2;
                            list4 = (List) T;
                            if (list4 != null) {
                                ArrayList arrayList = new ArrayList(k13.r(list4, 10));
                                for (CountrySignupLink countrySignupLink : list4) {
                                    countrySignupLink.getClass();
                                    arrayList.add(new pv3(countrySignupLink.getCta(), countrySignupLink.getButton(), countrySignupLink.getDisclaimer(), countrySignupLink.getDisclaimerUrl(), countrySignupLink.getId(), countrySignupLink.getSignupLink().getId(), countrySignupLink.getUrl()));
                                }
                                gv9Var = l6g.W(arrayList);
                                break;
                            }
                            gv9Var = rlh.b;
                            if (ijVar.f.a.getValue() instanceof unb) {
                                String str2 = (String) CollectionsKt.Z(linkedHashMap.keySet());
                                List list11 = (List) ijVar.o.get(str2);
                                if (list11 != null && (qldVar = (qld) CollectionsKt.firstOrNull(list11)) != null) {
                                    Map map = qldVar.c;
                                    if (map == null || (keySet = map.keySet()) == null) {
                                        Map map2 = qldVar.b;
                                        keySet = map2 != null ? map2.keySet() : null;
                                    }
                                    if (keySet != null) {
                                        list5 = CollectionsKt.S0(keySet);
                                        break;
                                    } else {
                                        list5 = null;
                                        break;
                                    }
                                }
                                list5 = km5.a;
                                List list12 = list5;
                                gv9 t6 = ijVar.t(str2, (String) CollectionsKt.firstOrNull(list12));
                                AllOddsWithProvider allOddsWithProvider = (AllOddsWithProvider) CollectionsKt.firstOrNull(list3);
                                ijVar.k(new pld(null, allOddsWithProvider != null ? allOddsWithProvider.getCountryProvider() : null));
                                ij ijVar2 = (ij) this.z;
                                ijVar2.o(new gj(t6, gv9Var, linkedHashMap, list12, ijVar2, str2, list10));
                            } else {
                                ijVar.n(null, new s1(4, ijVar, gv9Var));
                            }
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        boolean z6 = this.u;
                        t = (av4) this.w;
                        list = (List) this.v;
                        y6a.M(obj);
                        z = z6;
                        u = obj;
                    }
                } else {
                    y6a.M(obj);
                    int i6 = ijVar.p;
                    z = zu3.V.hasMcc(Integer.valueOf(i6)) || zu3.d0.hasMcc(Integer.valueOf(i6)) || zu3.z.hasMcc(Integer.valueOf(i6));
                    amd amdVar = ijVar.n;
                    list = amdVar.g;
                    if (list == null) {
                        list = amdVar.e;
                    }
                    t = xw3.t(ku3Var, null, new q3(ijVar, rq3Var, i4), 3);
                    bga bgaVar = xld.a;
                    Application application = ijVar.b;
                    application.getClass();
                    if (xld.g(application)) {
                        ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            arrayList2.add(xw3.t(ku3Var, null, new t3(ijVar, (OddsCountryProvider) it6.next(), z, rq3Var, 1), 3));
                            c2 = c2;
                        }
                        this.x = null;
                        this.v = list;
                        this.w = t;
                        this.u = z;
                        this.s = 1;
                        u = m6k.u(arrayList2, this);
                        break;
                    } else {
                        km5Var = km5.a;
                        List list13 = list;
                        av4 av4Var4 = t;
                        list2 = list13;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (AllOddsWithProvider allOddsWithProvider2 : km5Var) {
                            for (ProviderOdds providerOdds : allOddsWithProvider2.getAllOdds()) {
                                String marketGroup = providerOdds.getMarketGroup();
                                Object obj5 = linkedHashMap3.get(marketGroup);
                                if (obj5 == null) {
                                    obj5 = wv8.n(linkedHashMap3, marketGroup);
                                }
                                ((List) obj5).add(new FeaturedOddsWithProvider(allOddsWithProvider2.getCountryProvider(), providerOdds));
                            }
                        }
                        int i7 = ijVar.n.i;
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            if (((List) entry.getValue()).size() >= i7) {
                                linkedHashMap4.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(sub.c(linkedHashMap4.size()));
                        it = linkedHashMap4.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            Object key = entry2.getKey();
                            List list14 = (List) entry2.getValue();
                            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                            for (Object obj6 : list14) {
                                String choiceGroup = ((FeaturedOddsWithProvider) obj6).getFeaturedOdds().getChoiceGroup();
                                Object obj7 = linkedHashMap6.get(choiceGroup);
                                if (obj7 == null) {
                                    obj7 = wv8.n(linkedHashMap6, choiceGroup);
                                }
                                ((List) obj7).add(obj6);
                            }
                            ArrayList arrayList3 = new ArrayList(linkedHashMap6.size());
                            Iterator it7 = linkedHashMap6.entrySet().iterator();
                            while (it7.hasNext()) {
                                Map.Entry entry3 = (Map.Entry) it7.next();
                                String str3 = (String) entry3.getKey();
                                List list15 = (List) entry3.getValue();
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it8 = it;
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj8 : list15) {
                                    Iterator it9 = it7;
                                    if (((FeaturedOddsWithProvider) obj8).getFeaturedOdds().isLive()) {
                                        arrayList4.add(obj8);
                                    } else {
                                        arrayList5.add(obj8);
                                    }
                                    it7 = it9;
                                }
                                arrayList3.add(new qld(str3, ij.u(arrayList5, i7), ij.u(arrayList4, i7)));
                                it = it8;
                                it7 = it7;
                            }
                            linkedHashMap5.put(key, arrayList3);
                        }
                        ijVar.o = linkedHashMap5;
                        this.x = null;
                        this.v = list2;
                        this.w = null;
                        this.t = km5Var;
                        this.y = linkedHashMap5;
                        this.u = z;
                        this.s = 2;
                        T = av4Var4.T(this);
                        if (T != lu3Var) {
                            list3 = km5Var;
                            linkedHashMap = linkedHashMap5;
                            List list102 = list2;
                            list4 = (List) T;
                            if (list4 != null) {
                            }
                            gv9Var = rlh.b;
                            if (ijVar.f.a.getValue() instanceof unb) {
                            }
                        }
                        break;
                    }
                }
                ?? W = CollectionsKt.W((Iterable) u);
                int size = W.size();
                km5Var = W;
                if (size != list.size()) {
                    km5Var = null;
                }
                if (km5Var == null) {
                    km5Var = km5.a;
                }
                List list132 = list;
                av4 av4Var42 = t;
                list2 = list132;
                LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                while (r7.hasNext()) {
                }
                int i72 = ijVar.n.i;
                LinkedHashMap linkedHashMap42 = new LinkedHashMap();
                while (r6.hasNext()) {
                }
                LinkedHashMap linkedHashMap52 = new LinkedHashMap(sub.c(linkedHashMap42.size()));
                it = linkedHashMap42.entrySet().iterator();
                while (it.hasNext()) {
                }
                ijVar.o = linkedHashMap52;
                this.x = null;
                this.v = list2;
                this.w = null;
                this.t = km5Var;
                this.y = linkedHashMap52;
                this.u = z;
                this.s = 2;
                T = av4Var42.T(this);
                if (T != lu3Var) {
                }
                break;
            case 1:
                ai4 ai4Var = (ai4) this.x;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    List q = i5h.q(i5h.n(i5h.g(CollectionsKt.N((Set) this.v), new ph4(0, (Set) this.w)), new fa(15, ku3Var2, ai4Var, (String) this.y)));
                    this.t = null;
                    this.s = 1;
                    u2 = m6k.u(q, this);
                    if (u2 == lu3Var2) {
                        break;
                    }
                } else if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    u2 = obj;
                }
                break;
            case 2:
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                esf esfVar = new esf();
                xs5 xs5Var = (xs5) this.v;
                int i9 = this.s;
                SharedPreferences sharedPreferences = xs5Var.m;
                String string = sharedPreferences.getString("EVENT_ANALYSIS_VIEWED_IDS", null);
                if (string != null && string.length() != 0) {
                    split$default = StringsKt__StringsKt.split$default(string, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                    ArrayList U0 = CollectionsKt.U0(split$default);
                    if (!U0.contains(String.valueOf(i9))) {
                        if (U0.size() > 20) {
                            o13.C(U0);
                        }
                        U0.add(String.valueOf(i9));
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.getClass();
                        edit.putString("EVENT_ANALYSIS_VIEWED_IDS", CollectionsKt.f0(U0, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                        edit.apply();
                    }
                    break;
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.getClass();
                    edit2.putString("EVENT_ANALYSIS_VIEWED_IDS", String.valueOf(i9));
                    edit2.apply();
                }
                if (this.u) {
                    fdi fdiVar2 = xs5Var.e;
                    do {
                        value = fdiVar2.getValue();
                    } while (!fdiVar2.k(value, new unb(ls5.a)));
                    esfVar.a = 5000L;
                }
                break;
            case 3:
                tm7 tm7Var = (tm7) this.z;
                e1d e1dVar = tm7Var.h;
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var4 = lu3.a;
                int i10 = this.s;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                list6 = (List) this.v;
                                do7Var2 = (do7) this.y;
                                y6a.M(obj);
                                T3 = obj;
                                Map map3 = (Map) T3;
                                if (list6 == null) {
                                    boolean z7 = this.u;
                                    r6 = new ArrayList();
                                    for (mj7 mj7Var : list6) {
                                        Object orDefault = map3.getOrDefault(new Integer(mj7Var.a), new lj7(mj7Var.a, mj7Var.b, mj7Var.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, rlh.b, false, false));
                                        if (mj7Var.c <= (do7Var2 != null ? do7Var2.h.c : Integer.MAX_VALUE) || (!mj7Var.h() && !z7)) {
                                            orDefault = null;
                                        }
                                        lj7 lj7Var = (lj7) orDefault;
                                        if (lj7Var != null) {
                                            r6.add(lj7Var);
                                        }
                                    }
                                } else {
                                    r6 = 0;
                                }
                                if (r6 == 0) {
                                    r6 = km5.a;
                                }
                                it2 = r6.iterator();
                                int i11 = 0;
                                while (it2.hasNext()) {
                                    i11 += ((lj7) it2.next()).f.size();
                                }
                                it3 = r6.iterator();
                                int i12 = 0;
                                while (it3.hasNext()) {
                                    i12 += ((lj7) it3.next()).e;
                                }
                                boolean z8 = do7Var2 == null ? do7Var2.c.G : true;
                                boolean z9 = do7Var2 != null ? do7Var2.c.F : true;
                                boolean z10 = do7Var2 == null ? do7Var2.j : false;
                                boolean z11 = do7Var2 != null ? do7Var2.i : false;
                                it4 = r6.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj2 = null;
                                    } else {
                                        obj2 = it4.next();
                                        if (((lj7) obj2).h) {
                                        }
                                    }
                                }
                                lj7 lj7Var2 = (lj7) obj2;
                                String C = lj7Var2 == null ? f5p.C(tm7Var.i(), lj7Var2.c, lj7Var2.b) : null;
                                it5 = r6.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj3 = null;
                                    } else {
                                        obj3 = it5.next();
                                        if (((lj7) obj3).g) {
                                        }
                                    }
                                }
                                lj7 lj7Var3 = (lj7) obj3;
                                qm7 qm7Var = new qm7(i11, i12, z8, z9, z10, z11, C, lj7Var3 == null ? f5p.C(tm7Var.i(), lj7Var3.c, lj7Var3.b) : null);
                                rm7 rm7Var = (rm7) ((eoh) e1dVar).getValue();
                                gv9 W2 = l6g.W(r6);
                                boolean c3 = Intrinsics.c(do7Var2 != null ? Boolean.valueOf(do7Var2.c.A) : null, Boolean.TRUE);
                                int i13 = rm7Var.a;
                                W2.getClass();
                                ((eoh) e1dVar).setValue(new rm7(i13, W2, qm7Var, false, c3));
                                break;
                            } else {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            do7Var = (do7) this.y;
                            zu4Var = (zu4) this.x;
                            y6a.M(obj);
                            T2 = obj;
                            List list16 = (List) T2;
                            this.t = null;
                            this.w = null;
                            this.x = null;
                            this.y = do7Var;
                            this.v = list16;
                            this.s = 3;
                            T3 = zu4Var.T(this);
                            if (T3 != lu3Var4) {
                                do7Var2 = do7Var;
                                list6 = list16;
                                Map map32 = (Map) T3;
                                if (list6 == null) {
                                }
                                if (r6 == 0) {
                                }
                                it2 = r6.iterator();
                                int i112 = 0;
                                while (it2.hasNext()) {
                                }
                                it3 = r6.iterator();
                                int i122 = 0;
                                while (it3.hasNext()) {
                                }
                                if (do7Var2 == null) {
                                }
                                boolean z92 = do7Var2 != null ? do7Var2.c.F : true;
                                if (do7Var2 == null) {
                                }
                                boolean z112 = do7Var2 != null ? do7Var2.i : false;
                                it4 = r6.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                    }
                                }
                                lj7 lj7Var22 = (lj7) obj2;
                                if (lj7Var22 == null) {
                                }
                                it5 = r6.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                    }
                                }
                                lj7 lj7Var32 = (lj7) obj3;
                                qm7 qm7Var2 = new qm7(i112, i122, z8, z92, z10, z112, C, lj7Var32 == null ? f5p.C(tm7Var.i(), lj7Var32.c, lj7Var32.b) : null);
                                rm7 rm7Var2 = (rm7) ((eoh) e1dVar).getValue();
                                gv9 W22 = l6g.W(r6);
                                boolean c32 = Intrinsics.c(do7Var2 != null ? Boolean.valueOf(do7Var2.c.A) : null, Boolean.TRUE);
                                int i132 = rm7Var2.a;
                                W22.getClass();
                                ((eoh) e1dVar).setValue(new rm7(i132, W22, qm7Var2, false, c32));
                            }
                            break;
                        }
                    } else {
                        t3 = (zu4) this.x;
                        av4 av4Var5 = (av4) this.w;
                        y6a.M(obj);
                        t2 = av4Var5;
                        w = obj;
                    }
                } else {
                    y6a.M(obj);
                    av4 t7 = xw3.t(ku3Var4, null, new sm7(tm7Var, r10, i4), 3);
                    t2 = xw3.t(ku3Var4, null, new sm7(tm7Var, r10, r7 ? 1 : 0), 3);
                    t3 = xw3.t(ku3Var4, null, new sm7(tm7Var, r10, z4 ? 1 : 0), 3);
                    this.t = null;
                    this.w = t2;
                    this.x = t3;
                    this.s = 1;
                    w = t7.w(this);
                    break;
                }
                do7 do7Var3 = (do7) w;
                this.t = null;
                this.w = null;
                this.x = t3;
                this.y = do7Var3;
                this.s = 2;
                T2 = t2.T(this);
                if (T2 != lu3Var4) {
                    zu4Var = t3;
                    do7Var = do7Var3;
                    List list162 = (List) T2;
                    this.t = null;
                    this.w = null;
                    this.x = null;
                    this.y = do7Var;
                    this.v = list162;
                    this.s = 3;
                    T3 = zu4Var.T(this);
                    if (T3 != lu3Var4) {
                    }
                }
                break;
            case 4:
                u8c u8cVar = (u8c) this.z;
                w31 w31Var = (w31) this.y;
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var5 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            contains = this.u;
                            DbMediaReaction dbMediaReaction2 = (DbMediaReaction) this.v;
                            y6a.M(obj);
                            dbMediaReaction = dbMediaReaction2;
                            T4 = obj;
                            MediaPostReactionsResponse mediaPostReactionsResponse = (MediaPostReactionsResponse) yaa.x((x2g) T4);
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        contains = this.u;
                        t4 = (av4) this.w;
                        y6a.M(obj);
                        w2 = obj;
                    }
                } else {
                    y6a.M(obj);
                    av4 t8 = xw3.t(ku3Var5, null, new t8c(u8cVar, w31Var, r10, r7 ? 1 : 0), 3);
                    t4 = xw3.t(ku3Var5, null, new t8c(u8cVar, w31Var, r10, z5 ? 1 : 0), 3);
                    contains = ((Set) this.x).contains(new Integer(w31Var.getG()));
                    this.t = null;
                    this.w = t4;
                    this.u = contains;
                    this.s = 1;
                    w2 = t8.w(this);
                    break;
                }
                dbMediaReaction = (DbMediaReaction) yaa.x((x2g) w2);
                this.t = null;
                this.w = null;
                this.v = dbMediaReaction;
                this.u = contains;
                this.s = 2;
                T4 = t4.T(this);
                break;
            case 5:
                ku3 ku3Var6 = (ku3) this.t;
                lu3 lu3Var6 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    if (((hth) this.v).e) {
                        xw3.L(ku3Var6, null, null, new w07((q50) this.w, r10, i3), 3);
                        xw3.L(ku3Var6, null, null, new w07((q50) this.x, r10, i), 3);
                        xw3.L(ku3Var6, null, null, new w07((q50) this.y, r10, i2), 3);
                        break;
                    } else {
                        ou6 ou6Var = new ou6(this.u, (q50) this.w, ((fm8) ((e1d) this.z).getValue()) instanceof mmi, (e1d) this.z, (q50) this.x, (q50) this.y, null);
                        this.t = null;
                        this.s = 1;
                        if (s9a.r(ou6Var, this) == lu3Var6) {
                            break;
                        }
                    }
                } else if (i15 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                xwi xwiVar = (xwi) this.z;
                Team team = xwiVar.g;
                ku3 ku3Var7 = (ku3) this.t;
                lu3 lu3Var7 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    t5 = xw3.t(ku3Var7, null, new wwi(xwiVar, r10, i), 3);
                    Set set = wyh.a;
                    p = yaa.p(ku3Var7, !wyh.e(team.getSportSlug()), new wwi(xwiVar, r10, i2));
                    av4 p2 = yaa.p(ku3Var7, wyh.l(team.getSportSlug()), new wwi(xwiVar, r10, i3));
                    if (p2 != null) {
                        this.t = null;
                        this.w = t5;
                        this.x = p;
                        this.s = 1;
                        w3 = p2.w(this);
                        if (w3 != lu3Var7) {
                            av4Var = t5;
                            av4Var2 = p;
                        }
                    } else {
                        bool = null;
                        c = Intrinsics.c(bool, Boolean.TRUE);
                        yzc yzcVar3 = xwiVar.i;
                        this.t = null;
                        this.w = null;
                        this.x = p;
                        this.y = yzcVar3;
                        this.u = c;
                        this.s = 2;
                        T5 = t5.T(this);
                        if (T5 != lu3Var7) {
                            av4Var3 = p;
                            yzcVar = yzcVar3;
                            list7 = (List) T5;
                            if (av4Var3 != null) {
                            }
                            yzc yzcVar4 = yzcVar;
                            list8 = list7;
                            z2 = c;
                            yzcVar2 = yzcVar4;
                            list9 = null;
                            yzcVar2.j(new uwi(list8, list9, z2));
                            cg4 cg4Var = xwiVar.f;
                            this.t = null;
                            this.w = null;
                            this.x = null;
                            this.y = null;
                            this.v = null;
                            this.u = z2;
                            this.s = 4;
                            e = cg4Var.e("PREF_TEAM_EVENTS_DISPLAY_MODE", null, this);
                            if (e != lu3Var7) {
                            }
                        }
                    }
                } else if (i16 == 1) {
                    ?? r2 = (zu4) this.x;
                    av4Var = (av4) this.w;
                    y6a.M(obj);
                    w3 = obj;
                    av4Var2 = r2;
                } else if (i16 == 2) {
                    boolean z12 = this.u;
                    yzcVar = (yzc) this.y;
                    ?? r5 = (zu4) this.x;
                    y6a.M(obj);
                    av4Var3 = r5;
                    c = z12;
                    T5 = obj;
                    list7 = (List) T5;
                    if (av4Var3 != null) {
                        this.t = null;
                        this.w = null;
                        this.x = null;
                        this.y = yzcVar;
                        this.v = list7;
                        this.u = c;
                        this.s = 3;
                        T6 = av4Var3.T(this);
                        if (T6 != lu3Var7) {
                            yzc yzcVar5 = yzcVar;
                            list8 = list7;
                            z2 = c;
                            yzcVar2 = yzcVar5;
                            x2gVar = (x2g) T6;
                            if (x2gVar != null) {
                            }
                            yzc yzcVar6 = yzcVar2;
                            c = z2;
                            list7 = list8;
                            yzcVar = yzcVar6;
                        }
                    }
                    yzc yzcVar42 = yzcVar;
                    list8 = list7;
                    z2 = c;
                    yzcVar2 = yzcVar42;
                    list9 = null;
                    yzcVar2.j(new uwi(list8, list9, z2));
                    cg4 cg4Var2 = xwiVar.f;
                    this.t = null;
                    this.w = null;
                    this.x = null;
                    this.y = null;
                    this.v = null;
                    this.u = z2;
                    this.s = 4;
                    e = cg4Var2.e("PREF_TEAM_EVENTS_DISPLAY_MODE", null, this);
                    if (e != lu3Var7) {
                    }
                } else if (i16 == 3) {
                    z2 = this.u;
                    list8 = (List) this.v;
                    yzcVar2 = (yzc) this.y;
                    y6a.M(obj);
                    T6 = obj;
                    x2gVar = (x2g) T6;
                    if (x2gVar != null || (teamUniqueTournamentsResponse = (TeamUniqueTournamentsResponse) yaa.x(x2gVar)) == null) {
                        yzc yzcVar62 = yzcVar2;
                        c = z2;
                        list7 = list8;
                        yzcVar = yzcVar62;
                        yzc yzcVar422 = yzcVar;
                        list8 = list7;
                        z2 = c;
                        yzcVar2 = yzcVar422;
                        list9 = null;
                        yzcVar2.j(new uwi(list8, list9, z2));
                        cg4 cg4Var22 = xwiVar.f;
                        this.t = null;
                        this.w = null;
                        this.x = null;
                        this.y = null;
                        this.v = null;
                        this.u = z2;
                        this.s = 4;
                        e = cg4Var22.e("PREF_TEAM_EVENTS_DISPLAY_MODE", null, this);
                        if (e != lu3Var7) {
                            z3 = z2;
                            str = (String) e;
                            if (str == null) {
                            }
                            fdiVar = xwiVar.m;
                            do {
                                value2 = fdiVar.getValue();
                                if (twiVar != null) {
                                }
                                jpe jpeVar = twi.c;
                                sportSlug = team.getSportSlug();
                                jpeVar.getClass();
                                if (wyh.l(sportSlug)) {
                                    yea yeaVar = j58.a;
                                    if (fn0.B("team_matches_calendar_view")) {
                                    }
                                }
                                twiVar2 = twi.d;
                            } while (!fdiVar.k(value2, twiVar2));
                        }
                        break;
                    } else {
                        list9 = teamUniqueTournamentsResponse.getUniqueTournaments();
                        yzcVar2.j(new uwi(list8, list9, z2));
                        cg4 cg4Var222 = xwiVar.f;
                        this.t = null;
                        this.w = null;
                        this.x = null;
                        this.y = null;
                        this.v = null;
                        this.u = z2;
                        this.s = 4;
                        e = cg4Var222.e("PREF_TEAM_EVENTS_DISPLAY_MODE", null, this);
                        if (e != lu3Var7) {
                        }
                    }
                } else if (i16 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    boolean z13 = this.u;
                    y6a.M(obj);
                    z3 = z13;
                    e = obj;
                    str = (String) e;
                    if (str == null) {
                        twi.c.getClass();
                        Iterator it10 = twi.g.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                obj4 = it10.next();
                                if (Intrinsics.c(((twi) obj4).name(), str)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        twiVar = (twi) obj4;
                    } else {
                        twiVar = null;
                    }
                    fdiVar = xwiVar.m;
                    do {
                        value2 = fdiVar.getValue();
                        if (twiVar != null) {
                            if (z3) {
                                twiVar2 = twiVar;
                                break;
                            } else {
                                twiVar2 = null;
                                break;
                            }
                        }
                        jpe jpeVar2 = twi.c;
                        sportSlug = team.getSportSlug();
                        jpeVar2.getClass();
                        if (wyh.l(sportSlug) && z3) {
                            yea yeaVar2 = j58.a;
                            if (fn0.B("team_matches_calendar_view")) {
                                twiVar2 = twi.e;
                            }
                        }
                        twiVar2 = twi.d;
                    } while (!fdiVar.k(value2, twiVar2));
                }
                bool = (Boolean) w3;
                av4 av4Var6 = av4Var;
                p = av4Var2;
                t5 = av4Var6;
                c = Intrinsics.c(bool, Boolean.TRUE);
                yzc yzcVar32 = xwiVar.i;
                this.t = null;
                this.w = null;
                this.x = p;
                this.y = yzcVar32;
                this.u = c;
                this.s = 2;
                T5 = t5.T(this);
                if (T5 != lu3Var7) {
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj(q8 q8Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.z = q8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(tm7 tm7Var, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.z = tm7Var;
        this.u = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(hth hthVar, q50 q50Var, q50 q50Var2, q50 q50Var3, e1d e1dVar, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.v = hthVar;
        this.w = q50Var;
        this.x = q50Var2;
        this.y = q50Var3;
        this.z = e1dVar;
        this.u = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(Set set, w31 w31Var, u8c u8cVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 4;
        this.x = set;
        this.y = w31Var;
        this.z = u8cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(Set set, Set set2, ai4 ai4Var, String str, boolean z, Map map, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.v = set;
        this.w = set2;
        this.x = ai4Var;
        this.y = str;
        this.u = z;
        this.z = map;
    }
}
