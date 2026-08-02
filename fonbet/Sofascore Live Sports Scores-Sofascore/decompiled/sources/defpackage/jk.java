package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.format.DateFormat;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingConfig;
import com.sofascore.local_persistance.BrandingOddsTab;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Sports;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyUpcomingCompetition;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.CountrySignupLink;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.network.response.SeasonShotActionAreaResponse;
import com.sofascore.model.network.response.TeamEventShotmapResponse;
import com.sofascore.model.newNetwork.AllOddsResponse;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.MatchdayHighlightItem;
import com.sofascore.model.newNetwork.OddsProvidersResponse;
import com.sofascore.model.newNetwork.SportCategoriesResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.model.newNetwork.TeamCareerStatisticsResponse;
import com.sofascore.model.newNetwork.TeamEventShotmapWrapper;
import com.sofascore.model.newNetwork.ValuableUserResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPost;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.model.profile.ContributionSummaryResponse;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.R;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jk extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(g6b g6bVar, e6b e6bVar, ku3 ku3Var, Function2 function2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 20;
        this.w = g6bVar;
        this.x = e6bVar;
        this.t = ku3Var;
        this.y = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0071, code lost:
    
        if (r0 == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0073, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005e, code lost:
    
        if (r1 == r3) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        av4 p;
        Object w;
        List<t77> list;
        Map map;
        Object T;
        mj7 mj7Var = (mj7) this.u;
        e57 e57Var = (e57) this.x;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0) {
            y6a.M(obj);
            boolean z = false;
            z = false;
            av4 t = xw3.t(ku3Var, null, new a57(e57Var, mj7Var, objArr2 == true ? 1 : 0, z ? 1 : 0), 3);
            if (!mj7Var.o && mj7Var.h()) {
                z = true;
            }
            p = yaa.p(ku3Var, z, new a57(e57Var, mj7Var, objArr == true ? 1 : 0, i2));
            this.t = null;
            this.v = p;
            this.s = 1;
            w = t.w(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list2 = (List) this.w;
                y6a.M(obj);
                list = list2;
                T = obj;
                map = (Map) T;
                if (map != null) {
                    Collection values = map.values();
                    if (values.isEmpty()) {
                        values = null;
                    }
                    Integer num = values != null ? new Integer((int) CollectionsKt.P(values)) : null;
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    for (t77 t77Var : list) {
                        arrayList.add(new t77(t77Var.a, e57.w(t77Var.b, map, num), e57.w(t77Var.c, map, num), t77Var.d, t77Var.e));
                    }
                    list = arrayList;
                }
                String str = (String) this.y;
                for (Object obj3 : list) {
                    t77 t77Var2 = (t77) obj3;
                    if (str != null) {
                        if (Intrinsics.c(t77Var2.b.b, str) || Intrinsics.c(t77Var2.c.b, str)) {
                            obj2 = obj3;
                            break;
                        }
                    } else {
                        t77Var2.getClass();
                    }
                }
                t77 t77Var3 = (t77) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    t77 t77Var4 = (t77) obj4;
                    if (t77Var3 == null || t77Var4.a != t77Var3.a) {
                        arrayList2.add(obj4);
                    }
                }
                return new Pair(t77Var3, l6g.W(arrayList2));
            }
            p = (av4) this.v;
            y6a.M(obj);
            w = obj;
        }
        list = (List) w;
        if (p == null) {
            map = null;
            if (map != null) {
            }
            String str2 = (String) this.y;
            while (r0.hasNext()) {
            }
            t77 t77Var32 = (t77) obj2;
            ArrayList arrayList22 = new ArrayList();
            while (r0.hasNext()) {
            }
            return new Pair(t77Var32, l6g.W(arrayList22));
        }
        this.t = null;
        this.v = null;
        this.w = list;
        this.s = 2;
        T = p.T(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0102, code lost:
    
        if (r0 == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00c4, code lost:
    
        if (r3 != r4) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v24, types: [zu4] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v8, types: [km5] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(Object obj) {
        Object value;
        mb7 mb7Var;
        uj7 uj7Var;
        av4 t;
        av4 t2;
        Object w;
        av4 av4Var;
        List list;
        Object T;
        ArrayList arrayList;
        Object T2;
        Object value2;
        mb7 mb7Var2;
        uj7 uj7Var2;
        gv9 W;
        ArrayList arrayList2;
        ob7 ob7Var = (ob7) this.y;
        fdi fdiVar = ob7Var.f;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 1;
        ?? r9 = 0;
        ?? r92 = 0;
        ?? r93 = 0;
        ?? r94 = 0;
        if (i == 0) {
            y6a.M(obj);
            do {
                value = fdiVar.getValue();
                mb7Var = (mb7) value;
                uj7Var = mb7Var.a;
                if (uj7Var == uj7.b) {
                    uj7Var = uj7.a;
                }
            } while (!fdiVar.k(value, mb7.a(mb7Var, uj7Var, null, null, false, false, null, 62)));
            ia0 ia0Var = ia0.q;
            String e = fc6.e();
            t = xw3.t(ku3Var, null, new nb7(ob7Var, r94 == true ? 1 : 0, 0), 3);
            t2 = xw3.t(ku3Var, null, new nb7(ob7Var, r93 == true ? 1 : 0, i2), 3);
            av4 p = yaa.p(ku3Var, !StringsKt.R(e), new hs6((d50) ob7Var, e, (rq3) (r92 == true ? 1 : 0), 19));
            if (p != null) {
                this.t = null;
                this.v = t;
                this.u = t2;
                this.s = 1;
                w = p.w(this);
                lu3 lu3Var2 = lu3.a;
                if (w != lu3Var) {
                    av4Var = t;
                }
                return lu3Var;
            }
            list = km5.a;
            av4Var = t;
            this.t = null;
            this.v = null;
            this.u = t2;
            this.w = list;
            this.s = 2;
            T = av4Var.T(this);
        } else if (i == 1) {
            ?? r1 = (zu4) this.u;
            av4Var = (av4) this.v;
            y6a.M(obj);
            t2 = r1;
            w = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList3 = (ArrayList) this.x;
                y6a.M(obj);
                arrayList = arrayList3;
                T2 = obj;
                List list2 = (List) T2;
                if (list2 != null) {
                    r9 = new ArrayList();
                    for (Object obj2 : list2) {
                        FantasyUpcomingCompetition fantasyUpcomingCompetition = (FantasyUpcomingCompetition) obj2;
                        if (arrayList == null || !arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((FantasyCompetition) it.next()).getId() == fantasyUpcomingCompetition.getId()) {
                                    break;
                                }
                            }
                        }
                        r9.add(obj2);
                    }
                }
                if (r9 == 0) {
                    r9 = km5.a;
                }
                ArrayList arrayList4 = new ArrayList(k13.r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(f5p.G((FantasyCompetition) it2.next()));
                }
                ArrayList arrayList5 = new ArrayList(k13.r(r9, 10));
                Iterator it3 = r9.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(f5p.H((FantasyUpcomingCompetition) it3.next()));
                }
                ArrayList w0 = CollectionsKt.w0(arrayList5, arrayList4);
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = w0.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    mp6 mp6Var = (mp6) next;
                    if (!mp6Var.l && !mp6Var.k) {
                        arrayList6.add(next);
                    }
                }
                List H0 = CollectionsKt.H0(arrayList6, new v66(18));
                do {
                    value2 = fdiVar.getValue();
                    mb7Var2 = (mb7) value2;
                    uj7Var2 = H0.isEmpty() ? uj7.b : uj7.c;
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj3 : H0) {
                        if (((mp6) obj3).c == FantasyCompetitionType.SEASON) {
                            arrayList7.add(obj3);
                        }
                    }
                    W = l6g.W(arrayList7);
                    arrayList2 = new ArrayList();
                    for (Object obj4 : H0) {
                        if (((mp6) obj4).c == FantasyCompetitionType.WEEKLY) {
                            arrayList2.add(obj4);
                        }
                    }
                } while (!fdiVar.k(value2, mb7.a(mb7Var2, uj7Var2, W, l6g.W(arrayList2), false, false, null, 56)));
                return Unit.a;
            }
            list = (List) this.w;
            ?? r3 = (zu4) this.u;
            y6a.M(obj);
            t2 = r3;
            T = obj;
            arrayList = new ArrayList();
            for (Object obj5 : (Iterable) T) {
                if (!list.contains(new Integer(((FantasyCompetition) obj5).getId()))) {
                    arrayList.add(obj5);
                }
            }
            this.t = null;
            this.v = null;
            this.u = null;
            this.w = null;
            this.x = arrayList;
            this.s = 3;
            T2 = t2.T(this);
        }
        list = (List) w;
        if (list == null) {
            t = av4Var;
            list = km5.a;
            av4Var = t;
        }
        this.t = null;
        this.v = null;
        this.u = t2;
        this.w = list;
        this.s = 2;
        T = av4Var.T(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.coroutines.CoroutineContext, rq3] */
    private final Object g(Object obj) {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = (AtomicReference) this.y;
        bt7 bt7Var = (bt7) this.v;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Object obj2 = null;
        if (i == 0) {
            y6a.M(obj);
            List list = (List) this.w;
            asf asfVar = (asf) this.x;
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AtomicReference atomicReference3 = atomicReference2;
                asf asfVar2 = asfVar;
                arrayList.add(xw3.t(ku3Var, null, new mj5(bt7Var, ((Number) it.next()).intValue(), asfVar2, atomicReference3, (rq3) null, 2), 3));
                asfVar = asfVar2;
                atomicReference2 = atomicReference3;
            }
            atomicReference = atomicReference2;
            this.t = ku3Var;
            this.s = 1;
            if (m6k.u(arrayList, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            atomicReference = atomicReference2;
        }
        List list2 = (List) this.u;
        ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            AtomicReference atomicReference4 = atomicReference;
            ?? r5 = obj2;
            ok0 ok0Var = new ok0(bt7Var, ((Number) it2.next()).intValue(), atomicReference4, (rq3) r5, 23);
            atomicReference = atomicReference4;
            arrayList2.add(xw3.t(ku3Var, r5, ok0Var, 3));
            obj2 = r5;
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        if (r0.invoke(r4, r13, r12) != r3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(Object obj) {
        k8h k8hVar;
        k8h k8hVar2;
        re0 re0Var = (re0) this.v;
        int i = re0Var.a;
        Context context = (Context) this.u;
        lu3 lu3Var = lu3.a;
        int i2 = this.s;
        if (i2 == 0) {
            y6a.M(obj);
            k8h k8hVar3 = (k8h) this.t;
            String M = l98.M(i);
            this.t = k8hVar3;
            this.s = 1;
            Object a = k8hVar3.a(context, M, this);
            if (a != lu3Var) {
                k8hVar = k8hVar3;
                obj = a;
            }
            return lu3Var;
        }
        if (i2 == 1) {
            k8hVar = (k8h) this.t;
            y6a.M(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k8hVar2 = (k8h) this.t;
            y6a.M(obj);
            k8hVar = k8hVar2;
            af0 af0Var = (af0) k8hVar.a.get(l98.M(i));
            af0Var.getClass();
            ct8 ct8Var = (ct8) this.y;
            this.t = null;
            this.s = 3;
        }
        if (!((Boolean) obj).booleanValue()) {
            af0 af0Var2 = new af0((t01) this.w, re0Var, (Bundle) this.x, 248);
            this.t = k8hVar;
            this.s = 2;
            if (k8hVar.b(context, af0Var2, this) != lu3Var) {
                k8hVar2 = k8hVar;
                k8hVar = k8hVar2;
            }
            return lu3Var;
        }
        af0 af0Var3 = (af0) k8hVar.a.get(l98.M(i));
        af0Var3.getClass();
        ct8 ct8Var2 = (ct8) this.y;
        this.t = null;
        this.s = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x005f, code lost:
    
        if (r5 == r4) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f9 A[LOOP:1: B:133:0x00f3->B:135:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015e  */
    /* JADX WARN: Type inference failed for: r10v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        Object d;
        Event event;
        Object u;
        Event event2;
        Venue venue;
        Iterator it;
        Object u2;
        Venue venue2;
        Event event3;
        Iterator it2;
        ArrayList U0;
        String i;
        Context context;
        Event event4;
        Context context2;
        n1k n1kVar;
        Context context3;
        fy7 fy7Var;
        PersonalizedMediaPost personalizedMediaPost = (PersonalizedMediaPost) this.x;
        u8c u8cVar = (u8c) this.w;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i2 = this.s;
        n1k n1kVar2 = 0;
        n1kVar2 = 0;
        n1kVar2 = 0;
        n1kVar2 = 0;
        n1kVar2 = 0;
        n1kVar2 = 0;
        n1kVar2 = 0;
        n1kVar2 = 0;
        if (i2 == 0) {
            y6a.M(obj);
            s96 s96Var = u8cVar.c;
            int id = personalizedMediaPost.getId();
            this.t = ku3Var;
            this.s = 1;
            d = s96Var.d(id, this);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    venue = (Venue) this.v;
                    Event event5 = (Event) this.u;
                    y6a.M(obj);
                    event2 = event5;
                    u = obj;
                    List H0 = CollectionsKt.H0(CollectionsKt.W((Iterable) u), qe8.d);
                    u8c u8cVar2 = (u8c) this.w;
                    Set set = (Set) this.y;
                    ArrayList arrayList = new ArrayList(k13.r(H0, 10));
                    it = H0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xw3.t(ku3Var, null, new va8(u8cVar2, (MediaPost) it.next(), event2, set, null, 17), 3));
                    }
                    Event event6 = event2;
                    this.t = null;
                    this.u = event6;
                    this.v = venue;
                    this.s = 3;
                    u2 = m6k.u(arrayList, this);
                    if (u2 != lu3Var) {
                        venue2 = venue;
                        event3 = event6;
                        ArrayList W = CollectionsKt.W((Iterable) u2);
                        ArrayList arrayList2 = new ArrayList();
                        it2 = W.iterator();
                        while (it2.hasNext()) {
                        }
                        U0 = CollectionsKt.U0(CollectionsKt.L0(arrayList2, 10));
                        if (!U0.isEmpty()) {
                        }
                        return null;
                    }
                    return lu3Var;
                }
                if (i2 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                venue2 = (Venue) this.v;
                Event event7 = (Event) this.u;
                y6a.M(obj);
                event3 = event7;
                u2 = obj;
                ArrayList W2 = CollectionsKt.W((Iterable) u2);
                ArrayList arrayList22 = new ArrayList();
                it2 = W2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((w31) next) instanceof a1i) {
                        arrayList22.add(next);
                    }
                }
                U0 = CollectionsKt.U0(CollectionsKt.L0(arrayList22, 10));
                if (!U0.isEmpty()) {
                    int id2 = personalizedMediaPost.getId();
                    Context context4 = u8cVar.a;
                    Context context5 = u8cVar.a;
                    bx7 F = uxf.F(event3, context4, true, Intrinsics.c(event3.getSportSlug(), Sports.TENNIS), null, null, 48);
                    Event event8 = event3;
                    long startTimestamp = event8.getStartTimestamp();
                    String sportSlug = event8.getSportSlug();
                    long startTimestamp2 = event8.getStartTimestamp();
                    bi4 bi4Var = bi4.PATTERN_DMY;
                    if (ug5.w(startTimestamp2)) {
                        i = context5.getString(R.string.yesterday);
                    } else if (ug5.u(startTimestamp2)) {
                        i = context5.getString(R.string.today);
                    } else if (ug5.v(startTimestamp2)) {
                        i = context5.getString(R.string.tomorrow);
                    } else {
                        ConcurrentHashMap concurrentHashMap = hk4.a;
                        i = fc6.i(startTimestamp2, hk4.a(bi4Var.d()));
                    }
                    i.getClass();
                    String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context5) ? "Hm" : "hm");
                    bestPattern.getClass();
                    U0.add(0, new daa(id2, startTimestamp, sportSlug, F, lnb.o(i, " • ", fc6.i(startTimestamp2, hk4.a(bestPattern)))));
                    if (venue2 != null) {
                        int id3 = venue2.getId();
                        long createdAtTimestamp = personalizedMediaPost.getCreatedAtTimestamp();
                        int id4 = venue2.getId();
                        String name = venue2.getName();
                        if (name == null) {
                            name = "";
                        }
                        String str = name;
                        Country country = venue2.getCountry();
                        String alpha2 = country != null ? country.getAlpha2() : null;
                        Country country2 = venue2.getCountry();
                        U0.add(1, new fnk(id3, createdAtTimestamp, new jy7(id4, str, alpha2, country2 != null ? country2.getName() : null, venue2.getCity().getName())));
                    }
                    FootballEvent footballEvent = event8 instanceof FootballEvent ? (FootballEvent) event8 : null;
                    if (Intrinsics.c(footballEvent != null ? footballEvent.getCorrectAiInsight() : null, Boolean.TRUE)) {
                        FootballEvent footballEvent2 = (FootballEvent) event8;
                        Integer normaltime = Event.getHomeScore$default(footballEvent2, null, 1, null).getNormaltime();
                        Integer normaltime2 = Event.getAwayScore$default(footballEvent2, null, 1, null).getNormaltime();
                        if ((normaltime != null ? normaltime.intValue() : 0) > (normaltime2 != null ? normaltime2.intValue() : 0)) {
                            n1kVar = new n1k(tba.p(context5, Event.getHomeTeam$default(footballEvent2, null, 1, null)), context5.getString(R.string.football_full_time_winner), context5.getString(R.string.ai_forecast_correct_win, tba.p(context5, Event.getHomeTeam$default(footballEvent2, null, 1, null))));
                        } else {
                            n1kVar = (normaltime != null ? normaltime.intValue() : 0) < (normaltime2 != null ? normaltime2.intValue() : 0) ? new n1k(tba.p(context5, Event.getAwayTeam$default(footballEvent2, null, 1, null)), context5.getString(R.string.football_full_time_winner), context5.getString(R.string.ai_forecast_correct_win, tba.p(context5, Event.getAwayTeam$default(footballEvent2, null, 1, null)))) : new n1k(context5.getString(R.string.draw), context5.getString(R.string.football_full_time_outcome), context5.getString(R.string.ai_forecast_correct_draw));
                        }
                        Integer normaltime3 = Event.getHomeScore$default(event8, null, 1, null).getNormaltime();
                        int intValue = normaltime3 != null ? normaltime3.intValue() : 0;
                        Integer normaltime4 = Event.getAwayScore$default(event8, null, 1, null).getNormaltime();
                        if (intValue > (normaltime4 != null ? normaltime4.intValue() : 0)) {
                            fy7Var = uxf.J(Event.getHomeTeam$default(event8, null, 1, null), context5, null, false, null, 30);
                            context3 = context5;
                        } else {
                            context3 = context5;
                            Integer normaltime5 = Event.getHomeScore$default(event8, null, 1, null).getNormaltime();
                            int intValue2 = normaltime5 != null ? normaltime5.intValue() : 0;
                            Integer normaltime6 = Event.getAwayScore$default(event8, null, 1, null).getNormaltime();
                            if (intValue2 < (normaltime6 != null ? normaltime6.intValue() : 0)) {
                                fy7 J = uxf.J(Event.getAwayTeam$default(event8, null, 1, null), context3, null, false, null, 30);
                                context3 = context3;
                                fy7Var = J;
                            } else {
                                fy7Var = null;
                            }
                        }
                        int id5 = footballEvent2.getId();
                        String str2 = (String) n1kVar.a;
                        String str3 = (String) n1kVar.b;
                        personalizedMediaPost.getCreatedAtTimestamp();
                        String str4 = (String) n1kVar.c;
                        event4 = event8;
                        context = context3;
                        U0.add(new euh(id5, str2, str3, uxf.F(event4, context3, false, false, null, null, 62), fy7Var, str4));
                    } else {
                        context = context5;
                        event4 = event8;
                    }
                    String sportSlug2 = event4.getSportSlug();
                    Integer valueOf = Integer.valueOf(R.string.football_match_insights);
                    Integer valueOf2 = Integer.valueOf(R.string.game_insights);
                    if (sportSlug2 != null) {
                        switch (sportSlug2.hashCode()) {
                            case -2002238939:
                                if (sportSlug2.equals(Sports.ICE_HOCKEY)) {
                                    n1kVar2 = new n1k(context.getString(R.string.more_game_insights_available_title), context.getString(R.string.more_basketball_game_insights_available_description), valueOf2);
                                    break;
                                }
                                break;
                            case -877324069:
                                if (sportSlug2.equals(Sports.TENNIS)) {
                                    n1kVar2 = new n1k(context.getString(R.string.more_tennis_match_insights_available_title), context.getString(R.string.more_tennis_match_insights_available_description), Integer.valueOf(R.string.tennis_match_insights));
                                    break;
                                }
                                break;
                            case -83759494:
                                if (sportSlug2.equals(Sports.AMERICAN_FOOTBALL)) {
                                    n1kVar2 = new n1k(context.getString(R.string.more_game_insights_available_title), context.getString(R.string.more_american_football_game_insights_available_description), valueOf2);
                                    break;
                                }
                                break;
                            case 1767150:
                                if (sportSlug2.equals(Sports.HANDBALL)) {
                                    n1kVar2 = new n1k(context.getString(R.string.see_more_from_this_handball_match_title), context.getString(R.string.see_more_from_this_handball_match_description), valueOf);
                                    break;
                                }
                                break;
                            case 394668909:
                                if (sportSlug2.equals(Sports.FOOTBALL)) {
                                    n1kVar2 = new n1k(context.getString(R.string.more_football_match_insights_available_title), context.getString(R.string.more_football_match_insights_available_description), valueOf);
                                    break;
                                }
                                break;
                            case 727149765:
                                if (sportSlug2.equals(Sports.BASKETBALL)) {
                                    n1kVar2 = new n1k(context.getString(R.string.more_game_insights_available_title), context.getString(R.string.more_basketball_game_insights_available_description), valueOf2);
                                    break;
                                }
                                break;
                        }
                    }
                    if (n1kVar2 != 0) {
                        context2 = context;
                        U0.add(new mvc((String) n1kVar2.a, (String) n1kVar2.b, uxf.F(event4, context2, false, false, null, null, 62), personalizedMediaPost.getCreatedAtTimestamp(), event4.getSportSlug(), ((Number) n1kVar2.c).intValue()));
                    } else {
                        context2 = context;
                    }
                    return new v39(personalizedMediaPost.getId(), l6g.W(U0), uxf.F(event4, context2, false, false, null, null, 62), event4.getSportSlug(), new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), true);
                }
                return null;
            }
            y6a.M(obj);
            d = obj;
        }
        EventResponse eventResponse = (EventResponse) yaa.x((x2g) d);
        if (eventResponse != null && (event = eventResponse.getEvent()) != null) {
            Venue venue3 = event.getVenue();
            Venue venue4 = Intrinsics.c(venue3 != null ? venue3.getHidden() : null, Boolean.FALSE) ? event.getVenue() : null;
            List<PersonalizedMediaPost> postIds = personalizedMediaPost.getPostIds();
            ArrayList arrayList3 = new ArrayList(k13.r(postIds, 10));
            Iterator<T> it3 = postIds.iterator();
            while (it3.hasNext()) {
                arrayList3.add(xw3.t(ku3Var, null, new gjb(u8cVar, (PersonalizedMediaPost) it3.next(), n1kVar2, 9), 3));
            }
            this.t = ku3Var;
            this.u = event;
            this.v = venue4;
            this.s = 2;
            u = m6k.u(arrayList3, this);
            if (u != lu3Var) {
                event2 = event;
                venue = venue4;
                List H02 = CollectionsKt.H0(CollectionsKt.W((Iterable) u), qe8.d);
                u8c u8cVar22 = (u8c) this.w;
                Set set2 = (Set) this.y;
                ArrayList arrayList4 = new ArrayList(k13.r(H02, 10));
                it = H02.iterator();
                while (it.hasNext()) {
                }
                Event event62 = event2;
                this.t = null;
                this.u = event62;
                this.v = venue;
                this.s = 3;
                u2 = m6k.u(arrayList4, this);
                if (u2 != lu3Var) {
                }
            }
            return lu3Var;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a3, code lost:
    
        if (r9.e(r8) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [h2d, java.lang.Object, lu3] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h2d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        p1d p1dVar;
        j2d j2dVar;
        Function1 function1;
        Throwable th;
        p1d p1dVar2;
        h2d h2dVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        r1d r1dVar = (r1d) this.x;
        ?? r1 = lu3.a;
        int i = this.s;
        int i2 = 1;
        try {
            try {
                if (i == 0) {
                    y6a.M(obj);
                    ku3 ku3Var = (ku3) this.w;
                    n1d n1dVar = n1d.a;
                    CoroutineContext.Element element = ku3Var.getCoroutineContext().get(uic.g);
                    element.getClass();
                    p1dVar = new p1d((yda) element);
                    AtomicReference atomicReference3 = r1dVar.a;
                    while (true) {
                        p1d p1dVar3 = (p1d) atomicReference3.get();
                        if (p1dVar3 != null) {
                            n1d n1dVar2 = n1d.a;
                            if (n1dVar2.compareTo(n1dVar2) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(p1dVar3, p1dVar)) {
                            if (atomicReference3.get() != p1dVar3) {
                                break;
                            }
                        }
                        if (p1dVar3 != null) {
                            p1dVar3.a.e(new l6b("Mutation interrupted", i2));
                        }
                        j2dVar = r1dVar.b;
                        function1 = (Function1) this.y;
                        this.w = p1dVar;
                        this.u = j2dVar;
                        this.t = function1;
                        this.v = r1dVar;
                        this.s = 1;
                    }
                    return r1;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r1dVar = (r1d) this.t;
                    h2dVar = (h2d) this.u;
                    p1dVar2 = (p1d) this.w;
                    try {
                        y6a.M(obj);
                        atomicReference2 = r1dVar.a;
                        while (!atomicReference2.compareAndSet(p1dVar2, null) && atomicReference2.get() == p1dVar2) {
                        }
                        h2dVar.f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = r1dVar.a;
                        while (!atomicReference.compareAndSet(p1dVar2, null) && atomicReference.get() == p1dVar2) {
                        }
                        throw th;
                    }
                }
                r1dVar = (r1d) this.v;
                Function1 function12 = (Function1) this.t;
                ?? r4 = (h2d) this.u;
                p1d p1dVar4 = (p1d) this.w;
                y6a.M(obj);
                function1 = function12;
                p1dVar = p1dVar4;
                j2dVar = r4;
                this.w = p1dVar;
                this.u = j2dVar;
                this.t = r1dVar;
                this.v = null;
                this.s = 2;
                Object invoke = function1.invoke(this);
                if (invoke != r1) {
                    h2dVar = j2dVar;
                    obj = invoke;
                    p1dVar2 = p1dVar;
                    atomicReference2 = r1dVar.a;
                    while (!atomicReference2.compareAndSet(p1dVar2, null)) {
                    }
                    h2dVar.f(null);
                    return obj;
                }
                return r1;
            } catch (Throwable th3) {
                th = th3;
                p1dVar2 = p1dVar;
                atomicReference = r1dVar.a;
                while (!atomicReference.compareAndSet(p1dVar2, null)) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.f(null);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r14 == r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        jk jkVar;
        fsf fsfVar;
        fad fadVar;
        fsf fsfVar2 = (fsf) this.x;
        fsf fsfVar3 = (fsf) this.v;
        ead eadVar = (ead) this.w;
        zad zadVar = (zad) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        String str = null;
        if (i == 0) {
            y6a.M(obj);
            ead eadVar2 = (ead) this.w;
            rof rofVar = (rof) fsfVar3.a;
            zad zadVar2 = (zad) fsfVar2.a;
            mad madVar = (mad) this.y;
            this.t = zadVar;
            this.u = fsfVar3;
            this.s = 1;
            jkVar = this;
            obj = eadVar2.i(rofVar, zadVar2, madVar, zadVar, jkVar);
            if (obj != lu3Var) {
                fsfVar = fsfVar3;
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            x52 x52Var = (x52) obj;
            if (x52Var.b > 0) {
                return new fwh(c6o.i(x52Var, eadVar.c()), ead.d(eadVar.a, zadVar.d.a("Content-Type")), pe4.d);
            }
            return null;
        }
        fsfVar = (fsf) this.u;
        y6a.M(obj);
        jkVar = this;
        fsfVar.a = obj;
        eadVar.getClass();
        int i2 = zadVar.a;
        if ((200 > i2 || i2 >= 300) && i2 != 304) {
            throw new ui9(zadVar);
        }
        Object obj2 = fsfVar3.a;
        if (obj2 != null) {
            fsfVar2.a = eadVar.h((rof) obj2);
            Object obj3 = fsfVar3.a;
            obj3.getClass();
            b18 f = eadVar.f((rof) obj3);
            String str2 = eadVar.a;
            zad zadVar3 = (zad) fsfVar2.a;
            if (zadVar3 != null && (fadVar = zadVar3.d) != null) {
                str = fadVar.a("Content-Type");
            }
            return new fwh(f, ead.d(str2, str), pe4.d);
        }
        mwh mwhVar = zadVar.e;
        if (mwhVar == null) {
            a70.r("body == null");
            return null;
        }
        jkVar.t = zadVar;
        jkVar.u = null;
        jkVar.s = 2;
        obj = z1a.U(mwhVar, jkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        if (r13 != r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m(Object obj) {
        av4 t;
        boolean z;
        zu4 p;
        SharedPreferences d;
        OddsProvidersResponse oddsProvidersResponse;
        zu4 zu4Var;
        OddsProvidersResponse oddsProvidersResponse2;
        OddsProvidersResponse oddsProvidersResponse3;
        OddsProvidersResponse oddsProvidersResponse4;
        List<OddsCountryProvider> providers;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 2;
        int i3 = 0;
        boolean z2 = true;
        z2 = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i == 0) {
            y6a.M(obj);
            av4 t2 = xw3.t(ku3Var, null, new vld((wld) this.y, objArr3 == true ? 1 : 0, z2 ? 1 : 0), 3);
            t = xw3.t(ku3Var, null, new vld((wld) this.y, objArr2 == true ? 1 : 0, i2), 3);
            qv7 qv7Var = rv7.c;
            if (!ml4.e0()) {
                Context context = ((wld) this.y).a;
                yea yeaVar = j58.a;
                if (!fn0.B("should_show_world_cup")) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    if (!sharedPreferences.getBoolean("DEV_MODE_SHOW_WORLD_CUP", false)) {
                        z = false;
                        p = yaa.p(ku3Var, z, new vld((wld) this.y, objArr == true ? 1 : 0, i3));
                        this.t = null;
                        this.v = t;
                        this.u = p;
                        this.s = 1;
                        obj = t2.w(this);
                    }
                }
            }
            z = true;
            p = yaa.p(ku3Var, z, new vld((wld) this.y, objArr == true ? 1 : 0, i3));
            this.t = null;
            this.v = t;
            this.u = p;
            this.s = 1;
            obj = t2.w(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oddsProvidersResponse3 = (OddsProvidersResponse) this.x;
                    oddsProvidersResponse2 = (OddsProvidersResponse) this.w;
                    y6a.M(obj);
                    oddsProvidersResponse4 = (OddsProvidersResponse) obj;
                    bga bgaVar = xld.a;
                    xld.h(((wld) this.y).a, "app", oddsProvidersResponse2, true);
                    Context context2 = ((wld) this.y).a;
                    providers = oddsProvidersResponse2 != null ? oddsProvidersResponse2.getProviders() : null;
                    if (providers != null && !providers.isEmpty()) {
                        z2 = false;
                    }
                    xld.h(context2, "app-odds", oddsProvidersResponse3, z2);
                    xld.h(((wld) this.y).a, "app-featured", oddsProvidersResponse4, false);
                    return Unit.a;
                }
                oddsProvidersResponse = (OddsProvidersResponse) this.w;
                zu4Var = (zu4) this.u;
                y6a.M(obj);
                OddsProvidersResponse oddsProvidersResponse5 = (OddsProvidersResponse) obj;
                if (zu4Var != null) {
                    oddsProvidersResponse2 = oddsProvidersResponse;
                    oddsProvidersResponse3 = oddsProvidersResponse5;
                    oddsProvidersResponse4 = null;
                    bga bgaVar2 = xld.a;
                    xld.h(((wld) this.y).a, "app", oddsProvidersResponse2, true);
                    Context context22 = ((wld) this.y).a;
                    if (oddsProvidersResponse2 != null) {
                    }
                    if (providers != null) {
                    }
                    xld.h(context22, "app-odds", oddsProvidersResponse3, z2);
                    xld.h(((wld) this.y).a, "app-featured", oddsProvidersResponse4, false);
                    return Unit.a;
                }
                this.t = null;
                this.v = null;
                this.u = null;
                this.w = oddsProvidersResponse;
                this.x = oddsProvidersResponse5;
                this.s = 3;
                Object T = zu4Var.T(this);
                if (T != lu3Var) {
                    oddsProvidersResponse2 = oddsProvidersResponse;
                    oddsProvidersResponse3 = oddsProvidersResponse5;
                    obj = T;
                    oddsProvidersResponse4 = (OddsProvidersResponse) obj;
                    bga bgaVar22 = xld.a;
                    xld.h(((wld) this.y).a, "app", oddsProvidersResponse2, true);
                    Context context222 = ((wld) this.y).a;
                    if (oddsProvidersResponse2 != null) {
                    }
                    if (providers != null) {
                        z2 = false;
                    }
                    xld.h(context222, "app-odds", oddsProvidersResponse3, z2);
                    xld.h(((wld) this.y).a, "app-featured", oddsProvidersResponse4, false);
                    return Unit.a;
                }
                return lu3Var;
            }
            p = (zu4) this.u;
            t = (av4) this.v;
            y6a.M(obj);
        }
        OddsProvidersResponse oddsProvidersResponse6 = (OddsProvidersResponse) obj;
        this.t = null;
        this.v = null;
        this.u = p;
        this.w = oddsProvidersResponse6;
        this.s = 2;
        Object T2 = t.T(this);
        if (T2 != lu3Var) {
            zu4 zu4Var2 = p;
            oddsProvidersResponse = oddsProvidersResponse6;
            obj = T2;
            zu4Var = zu4Var2;
            OddsProvidersResponse oddsProvidersResponse52 = (OddsProvidersResponse) obj;
            if (zu4Var != null) {
            }
        }
        return lu3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(Object obj) {
        fsf fsfVar;
        Throwable th;
        fsf fsfVar2;
        yda ydaVar;
        p6b p6bVar;
        g6b g6bVar = (g6b) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            if (g6bVar.b() == e6b.a) {
                return Unit.a;
            }
            fsf fsfVar3 = new fsf();
            fsfVar = new fsf();
            try {
                e6b e6bVar = (e6b) this.x;
                ku3 ku3Var = (ku3) this.t;
                Function2 function2 = (Function2) this.y;
                try {
                    this.u = fsfVar3;
                    this.v = fsfVar;
                    this.s = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(this));
                    lj2Var.t();
                    d6b.Companion.getClass();
                    czf czfVar = new czf(b6b.b(e6bVar), fsfVar3, ku3Var, b6b.a(e6bVar), lj2Var, new j2d(), function2);
                    fsfVar.a = czfVar;
                    g6bVar.a(czfVar);
                    if (lj2Var.q() == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar2 = fsfVar3;
                } catch (Throwable th2) {
                    th = th2;
                    fsfVar2 = fsfVar3;
                    ydaVar = (yda) fsfVar2.a;
                    if (ydaVar != null) {
                        ydaVar.e(null);
                    }
                    p6bVar = (p6b) fsfVar.a;
                    if (p6bVar != null) {
                        throw th;
                    }
                    g6bVar.d(p6bVar);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fsfVar = (fsf) this.v;
            fsfVar2 = (fsf) this.u;
            try {
                y6a.M(obj);
            } catch (Throwable th4) {
                th = th4;
                ydaVar = (yda) fsfVar2.a;
                if (ydaVar != null) {
                }
                p6bVar = (p6b) fsfVar.a;
                if (p6bVar != null) {
                }
            }
        }
        yda ydaVar2 = (yda) fsfVar2.a;
        if (ydaVar2 != null) {
            ydaVar2.e(null);
        }
        p6b p6bVar2 = (p6b) fsfVar.a;
        if (p6bVar2 != null) {
            g6bVar.d(p6bVar2);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r8 == r2) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        Throwable th;
        ?? r8;
        Context context = (Context) this.x;
        af0 af0Var = (af0) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        try {
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            this.u = th2;
            this.s = 2;
            af0Var.a(context, th2);
            if (Unit.a != lu3Var) {
                th = th2;
                r8 = this;
            }
            return lu3Var;
        }
        if (i == 0) {
            y6a.M(obj);
            sg3 sg3Var = (sg3) this.v;
            af0Var.getClass();
            sg3Var.B(new tc3(-1784282257, new ye0(context, af0Var), true));
            kqf kqfVar = (kqf) this.t;
            this.s = 1;
            Object Q = kqfVar.Q(this);
            this = Q;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.u;
                y6a.M(obj);
                this = this;
                s9a.o((zij) r8.y, ml4.e("Error in recomposition coroutine", th));
                return Unit.a;
            }
            y6a.M(obj);
            this = this;
        }
        return Unit.a;
    }

    private final Object p(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        ku3 ku3Var = (ku3) this.t;
        ArrayList arrayList = (ArrayList) this.u;
        Map map = (Map) this.v;
        ct8 ct8Var = (ct8) this.w;
        Function1 function1 = (Function1) this.x;
        Function1 function12 = (Function1) this.y;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(xw3.t(ku3Var, null, new ajj(((k38) it.next()).a, map, ct8Var, function1, function12, null, 3), 3));
        }
        this.s = 1;
        Object u = m6k.u(arrayList2, this);
        return u == lu3Var ? lu3Var : u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r12 == r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) {
        av4 t;
        List list;
        Collection collection;
        Iterator it;
        uvj uvjVar = (uvj) this.x;
        String str = (String) this.u;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            if (str.length() > 2) {
                av4 t2 = xw3.t(ku3Var, null, new vki(uvjVar, str, rq3Var, 19), 3);
                t = xw3.t(ku3Var, null, new kuj(uvjVar, (Context) this.y, str, (rq3) null), 3);
                this.t = null;
                this.v = t;
                this.s = 1;
                obj = t2.w(this);
            }
            return Unit.a;
        }
        if (i != 1) {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.w;
            y6a.M(obj);
            collection = (List) obj;
            if (collection == null) {
                collection = km5.a;
            }
            yzc yzcVar = uvjVar.i;
            ArrayList w0 = CollectionsKt.w0(list, collection);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            it = w0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(new Integer(((UniqueTournament) next).getId()))) {
                    arrayList.add(next);
                }
            }
            yzcVar.j(arrayList);
            return Unit.a;
        }
        t = (av4) this.v;
        y6a.M(obj);
        List list2 = (List) obj;
        if (list2 == null) {
            list2 = km5.a;
        }
        this.t = null;
        this.v = null;
        this.w = list2;
        this.s = 2;
        Object T = t.T(this);
        if (T != lu3Var) {
            List list3 = list2;
            obj = T;
            list = list3;
            collection = (List) obj;
            if (collection == null) {
            }
            yzc yzcVar2 = uvjVar.i;
            ArrayList w02 = CollectionsKt.w0(list, collection);
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            it = w02.iterator();
            while (it.hasNext()) {
            }
            yzcVar2.j(arrayList2);
            return Unit.a;
        }
        return lu3Var;
    }

    private final Object r(Object obj) {
        Object obj2;
        List<String> list;
        Set set = (Set) this.v;
        fkk fkkVar = (fkk) this.u;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Set<String> set2 = null;
        if (i == 0) {
            y6a.M(obj);
            List list2 = (List) this.w;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list2) {
                String str = (String) obj3;
                if (set == null || !set.contains(str)) {
                    arrayList.add(obj3);
                }
            }
            String str2 = (String) this.x;
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(xw3.t(ku3Var, null, new kuj((String) it.next(), fkkVar, str2, (rq3) null), 3));
            }
            this.t = null;
            this.s = 1;
            obj = m6k.u(arrayList2, this);
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
        Iterable<Pair> iterable = (Iterable) obj;
        ArrayList arrayList3 = new ArrayList(k13.r(iterable, 10));
        for (Pair pair : iterable) {
            Object obj4 = pair.a;
            ValuableUserResponse valuableUserResponse = (ValuableUserResponse) yaa.x((x2g) pair.b);
            if (valuableUserResponse == null || (list = valuableUserResponse.getIds()) == null) {
                list = km5.a;
            }
            arrayList3.add(new Pair(obj4, list));
        }
        ArrayList arrayList4 = new ArrayList();
        String str3 = (String) this.y;
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            String str4 = (String) pair2.a;
            Iterator it3 = ((List) pair2.b).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (c.v(str3, (String) obj2, false)) {
                    break;
                }
            }
            if (((String) obj2) != null) {
                arrayList4.add(str4);
            }
        }
        if (!arrayList4.isEmpty()) {
            Context context = fkkVar.a;
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                String str5 = "valuable_user_" + ((String) it4.next());
                nv.N(context, null, str5);
                nv.Q(context, str5);
                nv.O(context, str5, null);
            }
            SharedPreferences.Editor edit = fkkVar.c.edit();
            edit.getClass();
            if (set != null) {
                ArrayList arrayList5 = new ArrayList(set);
                arrayList5.addAll(arrayList4);
                set2 = CollectionsKt.W0(arrayList5);
            }
            edit.putStringSet("VALUABLE_USER_VERSIONS_SENT", set2);
            edit.apply();
        }
        return Unit.a;
    }

    private final Object t(Object obj) {
        List<rxb> H0;
        Object u;
        Highlight eventHighlight;
        rxb rxbVar;
        qkl qklVar = (qkl) this.v;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        boolean z = true;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            List<MatchdayHighlightItem> list = (List) this.u;
            Map map = (Map) this.x;
            Set set = (Set) this.y;
            ArrayList arrayList = new ArrayList();
            for (MatchdayHighlightItem matchdayHighlightItem : list) {
                Event event = matchdayHighlightItem.getEvent();
                if (event == null || (eventHighlight = matchdayHighlightItem.getEventHighlight()) == null) {
                    rxbVar = null;
                } else {
                    wn1 R = gz8.R(qklVar.i(), event, z);
                    String groupName = event.getTournament().getGroupName();
                    Round roundInfo = event.getRoundInfo();
                    String name = roundInfo != null ? roundInfo.getName() : null;
                    Round roundInfo2 = event.getRoundInfo();
                    Integer round = roundInfo2 != null ? roundInfo2.getRound() : null;
                    r2f r2fVar = (r2f) me4.f(event.getId(), map);
                    if (r2fVar == null) {
                        r2fVar = p2f.a;
                    }
                    rxbVar = new rxb(event, R, eventHighlight, groupName, name, round, r2fVar, set.contains(new Integer(eventHighlight.getId())));
                }
                if (rxbVar != null) {
                    arrayList.add(rxbVar);
                }
                z = true;
            }
            H0 = CollectionsKt.H0(arrayList, new q6i(21));
            if (H0.isEmpty()) {
                return null;
            }
            List M0 = CollectionsKt.M0(5, H0);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : M0) {
                if (((rxb) obj2).g instanceof p2f) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(xw3.t(ku3Var, null, new tjl((rxb) it.next(), qklVar, rq3Var, 0), 3));
            }
            this.t = null;
            this.w = H0;
            this.s = 1;
            u = m6k.u(arrayList3, this);
            if (u == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = (List) this.w;
            y6a.M(obj);
            H0 = list2;
            u = obj;
        }
        Map o = tub.o((Iterable) u);
        ArrayList arrayList4 = new ArrayList(k13.r(H0, 10));
        for (rxb rxbVar2 : H0) {
            r2f r2fVar2 = (r2f) me4.f(rxbVar2.a.getId(), o);
            if (r2fVar2 != null) {
                rxbVar2 = rxb.a(rxbVar2, r2fVar2, 191);
            }
            arrayList4.add(rxbVar2);
        }
        return l6g.W(arrayList4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0087, code lost:
    
        if (r1 == r2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0068, code lost:
    
        if (r15 == r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object u(Object obj) {
        zu4 t;
        zu4 zu4Var;
        StandingsResponse standingsResponse;
        Object R;
        Map map;
        Object obj2;
        StandingsResponse standingsResponse2;
        String groupName;
        String str;
        gv9 gv9Var;
        Iterable<Event> iterable;
        Iterator it;
        Object next;
        Pair pair;
        Object obj3;
        String str2;
        qkl qklVar = (qkl) this.x;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 10;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            av4 t2 = xw3.t(ku3Var, null, new njl(qklVar, rq3Var, 9), 3);
            t = xw3.t(ku3Var, null, new z40(qklVar, rq3Var, i2), 3);
            this.t = null;
            this.u = t;
            this.s = 1;
            obj = t2.w(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    StandingsResponse standingsResponse3 = (StandingsResponse) this.v;
                    zu4Var = (zu4) this.u;
                    y6a.M(obj);
                    R = obj;
                    standingsResponse = standingsResponse3;
                    map = (Map) R;
                    qklVar.I = map;
                    Iterator<T> it2 = standingsResponse.getStandings().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        StandingsTable standingsTable = (StandingsTable) obj2;
                        String groupName2 = standingsTable.getTournament().getGroupName();
                        if (groupName2 != null) {
                            str = groupName2.toLowerCase(Locale.ROOT);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (Intrinsics.c(str, "third-placed teams")) {
                            break;
                        }
                        String lowerCase = standingsTable.getName().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("third-placed teams")) {
                            break;
                        }
                    }
                    StandingsTable standingsTable2 = (StandingsTable) obj2;
                    if (((bgl) this.y) == bgl.d && standingsTable2 != null) {
                        groupName = standingsTable2.getTournament().getGroupName();
                        if (groupName == null) {
                            groupName = standingsTable2.getName();
                        }
                        gv9Var = (gv9) qklVar.I.get(groupName);
                        if (gv9Var != null) {
                        }
                        return null;
                    }
                    this.t = null;
                    this.u = null;
                    this.v = standingsResponse;
                    this.w = map;
                    this.s = 3;
                    Object T = zu4Var.T(this);
                    if (T != lu3Var) {
                        StandingsResponse standingsResponse4 = standingsResponse;
                        obj = T;
                        standingsResponse2 = standingsResponse4;
                        iterable = (List) obj;
                        if (iterable == null) {
                        }
                        ArrayList arrayList = new ArrayList();
                        while (r15.hasNext()) {
                        }
                        it = arrayList.iterator();
                        if (it.hasNext()) {
                        }
                        pair = (Pair) next;
                        if (pair != null) {
                        }
                        String str3 = (String) CollectionsKt.Z(map.keySet());
                        String str4 = str3;
                        standingsResponse = standingsResponse2;
                        groupName = str4;
                        gv9Var = (gv9) qklVar.I.get(groupName);
                        if (gv9Var != null) {
                        }
                        return null;
                    }
                    return lu3Var;
                }
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = (Map) this.w;
                standingsResponse2 = (StandingsResponse) this.v;
                y6a.M(obj);
                iterable = (List) obj;
                if (iterable == null) {
                    iterable = km5.a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Event event : iterable) {
                    Iterator it3 = map.entrySet().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        gv9<ril> gv9Var2 = (gv9) ((Map.Entry) obj3).getValue();
                        if (gv9Var2 == null || !gv9Var2.isEmpty()) {
                            for (ril rilVar : gv9Var2) {
                                if ((rilVar instanceof qil) && ((qil) rilVar).b == Event.getHomeTeam$default(event, null, 1, null).getId()) {
                                    break;
                                }
                            }
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    Pair pair2 = (entry == null || (str2 = (String) entry.getKey()) == null) ? null : new Pair(Boolean.valueOf(ok3.D(event)), str2);
                    if (pair2 != null) {
                        arrayList2.add(pair2);
                    }
                }
                it = arrayList2.iterator();
                if (it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        Pair pair3 = (Pair) next2;
                        Pair pair4 = (Pair) next;
                        int b = o93.b((Comparable) pair3.a, (Comparable) pair4.a);
                        if (b == 0) {
                            b = o93.b((Comparable) pair4.b, (Comparable) pair3.b);
                        }
                        if (b > 0) {
                            next = next2;
                        }
                    }
                }
                pair = (Pair) next;
                if (pair != null || (str3 = (String) pair.b) == null) {
                    String str32 = (String) CollectionsKt.Z(map.keySet());
                }
                String str42 = str32;
                standingsResponse = standingsResponse2;
                groupName = str42;
                gv9Var = (gv9) qklVar.I.get(groupName);
                if (gv9Var != null) {
                    List<StandingsTable> standings = standingsResponse.getStandings();
                    ArrayList arrayList3 = new ArrayList(k13.r(standings, 10));
                    for (StandingsTable standingsTable3 : standings) {
                        String groupName3 = standingsTable3.getTournament().getGroupName();
                        if (groupName3 == null) {
                            groupName3 = standingsTable3.getName();
                        }
                        String groupName4 = standingsTable3.getTournament().getGroupName();
                        if (groupName4 == null) {
                            groupName4 = standingsTable3.getName();
                        }
                        arrayList3.add(new vt2(groupName3, wba.w(groupName4).b(qklVar.i()), false, null, null, null, null, 252));
                    }
                    return new sil(l6g.W(arrayList3), gv9Var, groupName);
                }
                return null;
            }
            t = (zu4) this.u;
            y6a.M(obj);
        }
        zu4Var = t;
        standingsResponse = (StandingsResponse) obj;
        if (standingsResponse != null) {
            hs4 hs4Var = z45.a;
            pdk pdkVar = new pdk(standingsResponse, qklVar, rq3Var, 11);
            this.t = null;
            this.u = zu4Var;
            this.v = standingsResponse;
            this.s = 2;
            R = xw3.R(hs4Var, pdkVar, this);
        }
        return null;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.y;
        switch (i) {
            case 0:
                jk jkVar = new jk((kk) obj2, rq3Var, 0);
                jkVar.t = obj;
                return jkVar;
            case 1:
                jk jkVar2 = new jk((ln2) this.v, (q50) this.w, (e1d) this.x, (e1d) obj2, rq3Var, 1);
                jkVar2.t = obj;
                return jkVar2;
            case 2:
                return new jk((j8f) this.v, (b98) this.w, (igm) this.x, this.t, (aea) obj2, rq3Var, 2);
            case 3:
                jk jkVar3 = new jk((la3) this.w, (i1g) this.x, (String) obj2, rq3Var, 3);
                jkVar3.t = obj;
                return jkVar3;
            case 4:
                jk jkVar4 = new jk((ks3) obj2, rq3Var, 4);
                jkVar4.t = obj;
                return jkVar4;
            case 5:
                jk jkVar5 = new jk((List) this.w, (ArrayList) obj2, rq3Var);
                jkVar5.x = obj;
                return jkVar5;
            case 6:
                jk jkVar6 = new jk((ai4) this.w, (String) this.x, (String) obj2, rq3Var, 6);
                jkVar6.t = obj;
                return jkVar6;
            case 7:
                jk jkVar7 = new jk((d46) this.x, (MmaEvent) obj2, rq3Var, 7);
                jkVar7.t = obj;
                return jkVar7;
            case 8:
                jk jkVar8 = new jk((Event) this.x, (bc6) obj2, rq3Var, 8);
                jkVar8.t = obj;
                return jkVar8;
            case 9:
                jk jkVar9 = new jk((cq6) obj2, rq3Var, 9);
                jkVar9.t = obj;
                return jkVar9;
            case 10:
                jk jkVar10 = new jk((xu6) this.u, (UserAccount) this.w, (String) obj2, rq3Var);
                jkVar10.t = obj;
                return jkVar10;
            case 11:
                jk jkVar11 = new jk((Serializable) this.u, (ltk) this.x, obj2, rq3Var, 11);
                jkVar11.t = obj;
                return jkVar11;
            case 12:
                jk jkVar12 = new jk((ob7) obj2, rq3Var, 12);
                jkVar12.t = obj;
                return jkVar12;
            case 13:
                jk jkVar13 = new jk((yc7) obj2, rq3Var, 13);
                jkVar13.t = obj;
                return jkVar13;
            case 14:
                jk jkVar14 = new jk((List) this.w, this.u, this.v, (Serializable) this.x, (Serializable) obj2, rq3Var, 14);
                jkVar14.t = obj;
                return jkVar14;
            case 15:
                jk jkVar15 = new jk(this.u, this.v, this.w, this.x, (dt8) obj2, rq3Var, 15);
                jkVar15.t = obj;
                return jkVar15;
            case 16:
                jk jkVar16 = new jk((u8c) this.w, (PersonalizedMediaPost) this.x, (Set) obj2, rq3Var, 16);
                jkVar16.t = obj;
                return jkVar16;
            case 17:
                n1d n1dVar = n1d.a;
                jk jkVar17 = new jk((r1d) this.x, (Function1) obj2, rq3Var);
                jkVar17.w = obj;
                return jkVar17;
            case 18:
                jk jkVar18 = new jk((fsf) this.v, (ead) this.w, (fsf) this.x, (mad) obj2, rq3Var, 18);
                jkVar18.t = obj;
                return jkVar18;
            case 19:
                jk jkVar19 = new jk((wld) obj2, rq3Var, 19);
                jkVar19.t = obj;
                return jkVar19;
            case 20:
                return new jk((g6b) this.w, (e6b) this.x, (ku3) this.t, (Function2) obj2, rq3Var);
            case 21:
                return new jk((sg3) this.v, (af0) this.w, (Context) this.x, (kqf) this.t, (zij) obj2, rq3Var, 21);
            case 22:
                jk jkVar20 = new jk(this.u, this.v, this.w, this.x, (dt8) obj2, rq3Var, 22);
                jkVar20.t = obj;
                return jkVar20;
            case 23:
                jk jkVar21 = new jk(this.u, this.v, this.w, this.x, (dt8) obj2, rq3Var, 23);
                jkVar21.t = obj;
                return jkVar21;
            case 24:
                jk jkVar22 = new jk((Serializable) this.u, (ltk) this.x, obj2, rq3Var, 24);
                jkVar22.t = obj;
                return jkVar22;
            case 25:
                jk jkVar23 = new jk((List) this.w, this.u, this.v, (Serializable) this.x, (Serializable) obj2, rq3Var, 25);
                jkVar23.t = obj;
                return jkVar23;
            case 26:
                jk jkVar24 = new jk((List) this.u, (qkl) this.v, (Map) this.x, (Set) obj2, rq3Var);
                jkVar24.t = obj;
                return jkVar24;
            case 27:
                jk jkVar25 = new jk((qkl) this.x, (bgl) obj2, rq3Var, 27);
                jkVar25.t = obj;
                return jkVar25;
            default:
                jk jkVar26 = new jk((e1d) this.v, (e1d) this.w, (e1d) this.x, (tll) obj2, rq3Var, 28);
                jkVar26.t = obj;
                return jkVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((jk) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0215, code lost:
    
        if (r1 != r3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e8, code lost:
    
        if (r5 == r3) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b9, code lost:
    
        if (r1 == r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a4, code lost:
    
        if (r4 == r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0335, code lost:
    
        if (r4 == r10) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0489, code lost:
    
        if (r2 == r10) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0462, code lost:
    
        if (r5 == r10) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0570, code lost:
    
        if (r1 == r10) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x054a, code lost:
    
        if (r0 == r10) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0533, code lost:
    
        if (r5 == r10) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x060b, code lost:
    
        if (r3 == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0629, code lost:
    
        if (r3 == r2) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0606, code lost:
    
        if (r3 == r2) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x06b0, code lost:
    
        if (r9 == r0) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x06d5, code lost:
    
        if (r2 == r0) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x074d, code lost:
    
        if (r5 == r2) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        if (r0 == r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x07ea, code lost:
    
        if (r4 == r11) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x09f1, code lost:
    
        if (r3.emit(r2, r22) == r0) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x09e6, code lost:
    
        if (r2 == r0) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x09b0, code lost:
    
        if (r2 == r0) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0b56, code lost:
    
        if (r0 == null) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0b04, code lost:
    
        if (r0 == r9) goto L432;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0870 A[LOOP:2: B:314:0x086a->B:316:0x0870, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:9:0x0032, B:11:0x00d2, B:30:0x00a2, B:32:0x00b4), top: B:4:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0bb9  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0bc3  */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v30, types: [km5] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, kotlin.coroutines.CoroutineContext, rq3] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:249:0x06b9 -> B:244:0x0693). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:251:0x06d5 -> B:244:0x0693). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:384:0x0a30 -> B:377:0x0a34). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 p;
        Object w;
        OddsCountryProvider oddsCountryProvider;
        List<ProviderOdds> list;
        gv9 a;
        Object T;
        gv9 gv9Var;
        boolean z;
        Brand brand;
        Map<String, BrandingOddsTab> oddsTab;
        ku3 ku3Var;
        b62 it;
        Object a2;
        Object g;
        b98 b98Var;
        Object invoke;
        av4 t;
        Object w2;
        ?? r5;
        Object T2;
        ArrayList arrayList;
        List<Category> categories;
        List list2;
        Iterator it2;
        Iterator it3;
        fdi fdiVar;
        Object value;
        y93 y93Var;
        ArrayList arrayList2;
        av4 t2;
        zu4 t3;
        Object w3;
        Object T3;
        zu4 zu4Var;
        ProfileData profileData;
        Object T4;
        ProfileData profileData2;
        List list3;
        Object obj2;
        ArrayList arrayList3;
        Iterator it4;
        Object obj3;
        be4 be4Var;
        av4 t4;
        Object w4;
        Map map;
        Map map2;
        Object T5;
        av4 t5;
        Object w5;
        TeamCareerStatisticsResponse teamCareerStatisticsResponse;
        Object T6;
        TeamCareerStatisticsResponse teamCareerStatisticsResponse2;
        Object R;
        ?? r8;
        Object P;
        x2g x2gVar;
        av4 t6;
        Object w6;
        Object obj4;
        x2g x2gVar2;
        Object T7;
        x2g x2gVar3;
        Object obj5;
        av4 t7;
        Object w7;
        ArrayList arrayList4;
        Object T8;
        fdi fdiVar2;
        gv9 gv9Var2;
        Iterator it5;
        fo1 fo1Var;
        av4 t8;
        Object w8;
        gv9 W;
        Object T9;
        av4 t9;
        zu4 t10;
        Object w9;
        Object T10;
        zu4 zu4Var2;
        List list4;
        List list5;
        Object T11;
        Object u2gVar;
        e1d e1dVar;
        Object r;
        Object u2gVar2;
        Integer b;
        Object obj6;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i = 3;
        int i2 = 2;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        Object obj7 = null;
        switch (this.r) {
            case 0:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    kk kkVar = (kk) this.y;
                    OddsCountryProvider oddsCountryProvider2 = kkVar.p;
                    if (oddsCountryProvider2 == null) {
                        return Unit.a;
                    }
                    av4 t11 = xw3.t(ku3Var2, null, new ik(kkVar, oddsCountryProvider2, r8, z2 ? 1 : 0), 3);
                    p = yaa.p(ku3Var2, oddsCountryProvider2.getBranded(), new fk((kk) this.y, r8, z9 ? 1 : 0));
                    this.t = null;
                    this.u = oddsCountryProvider2;
                    this.v = p;
                    this.s = 1;
                    w = t11.w(this);
                    if (w != lu3Var) {
                        oddsCountryProvider = oddsCountryProvider2;
                    }
                    return lu3Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gv9 gv9Var3 = (gv9) this.x;
                    list = (List) this.w;
                    oddsCountryProvider = (OddsCountryProvider) this.u;
                    y6a.M(obj);
                    a = gv9Var3;
                    T = obj;
                    List<CountrySignupLink> list6 = (List) T;
                    if (list6 != null) {
                        ArrayList arrayList5 = new ArrayList(k13.r(list6, 10));
                        for (CountrySignupLink countrySignupLink : list6) {
                            countrySignupLink.getClass();
                            arrayList5.add(new pv3(countrySignupLink.getCta(), countrySignupLink.getButton(), countrySignupLink.getDisclaimer(), countrySignupLink.getDisclaimerUrl(), countrySignupLink.getId(), countrySignupLink.getSignupLink().getId(), countrySignupLink.getUrl()));
                        }
                        gv9Var = l6g.W(arrayList5);
                        break;
                    }
                    gv9Var = rlh.b;
                    OddsCountryProvider oddsCountryProvider3 = oddsCountryProvider;
                    gv9 gv9Var4 = a;
                    String string = ((kk) this.y).o.getString("PR_XAIST", null);
                    boolean z16 = (string == null || string.length() == 0) && (ok3.E(((kk) this.y).t()) || ok3.D(((kk) this.y).t())) && Intrinsics.c(ok3.s(((kk) this.y).t()), Sports.FOOTBALL);
                    z = ((kk) this.y).f.a.getValue() instanceof unb;
                    kk kkVar2 = (kk) this.y;
                    if (z) {
                        kkVar2.n(null, new gk((Object) gv9Var4, (Object) gv9Var, z16, (int) (z3 ? 1 : 0)));
                    } else {
                        ProviderOdds providerOdds = (ProviderOdds) CollectionsKt.firstOrNull(list);
                        kkVar2.k(new pld(providerOdds != null ? providerOdds.getMarketName() : null, oddsCountryProvider3));
                        ((kk) this.y).i();
                        int id = oddsCountryProvider3.getProvider().getId();
                        ia0 ia0Var = ia0.q;
                        BrandingConfig brandingConfig = !mz1.C() ? null : ccd.b;
                        BrandingOddsTab brandingOddsTab = (brandingConfig == null || (oddsTab = brandingConfig.getOddsTab()) == null) ? null : oddsTab.get(String.valueOf(id));
                        Brand brand2 = (brandingOddsTab == null || (brand = brandingOddsTab.getBrand()) == null || !Intrinsics.c(brandingOddsTab.getOddsTab(), Boolean.TRUE)) ? null : brand;
                        kk kkVar3 = (kk) this.y;
                        kkVar3.o(new hk(oddsCountryProvider3, kkVar3, brand2, gv9Var4, gv9Var, z16));
                    }
                    return Unit.a;
                }
                p = (av4) this.v;
                OddsCountryProvider oddsCountryProvider4 = (OddsCountryProvider) this.u;
                y6a.M(obj);
                oddsCountryProvider = oddsCountryProvider4;
                w = obj;
                AllOddsResponse allOddsResponse = (AllOddsResponse) w;
                if (allOddsResponse == null || (list = allOddsResponse.getMarkets()) == null) {
                    list = km5.a;
                }
                a = sld.a(((kk) this.y).i(), oddsCountryProvider, list);
                if (p != null) {
                    this.t = null;
                    this.u = oddsCountryProvider;
                    this.v = null;
                    this.w = list;
                    this.x = a;
                    this.s = 2;
                    T = p.T(this);
                    break;
                }
                gv9Var = rlh.b;
                OddsCountryProvider oddsCountryProvider32 = oddsCountryProvider;
                gv9 gv9Var42 = a;
                String string2 = ((kk) this.y).o.getString("PR_XAIST", null);
                if (string2 == null) {
                    z = ((kk) this.y).f.a.getValue() instanceof unb;
                    kk kkVar22 = (kk) this.y;
                    if (z) {
                    }
                    return Unit.a;
                }
                z = ((kk) this.y).f.a.getValue() instanceof unb;
                kk kkVar222 = (kk) this.y;
                if (z) {
                }
                return Unit.a;
            case 1:
                ln2 ln2Var = (ln2) this.v;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    ku3Var = (ku3) this.t;
                    it = ln2Var.iterator();
                    this.t = ku3Var;
                    this.u = it;
                    this.s = 1;
                    a2 = it.a(this);
                    if (a2 == lu3Var2) {
                    }
                    if (((Boolean) a2).booleanValue()) {
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (b62) this.u;
                    ku3Var = (ku3) this.t;
                    y6a.M(obj);
                    a2 = obj;
                    if (((Boolean) a2).booleanValue()) {
                        Object c = it.c();
                        Object a3 = go2.a(ln2Var.o());
                        xw3.L(ku3Var, null, null, new u1(a3 == null ? c : a3, (q50) this.w, (e1d) this.x, (e1d) this.y, null, 2), 3);
                        this.t = ku3Var;
                        this.u = it;
                        this.s = 1;
                        a2 = it.a(this);
                        if (a2 == lu3Var2) {
                            return lu3Var2;
                        }
                        if (((Boolean) a2).booleanValue()) {
                            return Unit.a;
                        }
                    }
                }
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    j8f j8fVar = (j8f) this.v;
                    this.s = 1;
                    g = j8fVar.g(this);
                    break;
                } else if (i5 == 1) {
                    y6a.M(obj);
                    g = ((go2) obj).a;
                } else {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b98 b98Var2 = (b98) this.u;
                    y6a.M(obj);
                    b98Var = b98Var2;
                    invoke = obj;
                    this.u = null;
                    this.s = 3;
                    break;
                }
                aea aeaVar = (aea) this.y;
                if (g instanceof fo2) {
                    eo2 eo2Var = g instanceof eo2 ? (eo2) g : null;
                    r8 = eo2Var != null ? eo2Var.a : 0;
                    if (r8 == 0) {
                        throw new f0(aeaVar);
                    }
                    throw r8;
                }
                b98Var = (b98) this.w;
                igm igmVar = (igm) this.x;
                Object obj8 = this.t;
                if (g == rid.a) {
                    g = null;
                }
                this.u = b98Var;
                this.s = 2;
                invoke = igmVar.invoke(obj8, g, this);
                break;
            case 3:
                String str = (String) this.y;
                la3 la3Var = (la3) this.w;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    av4 t12 = xw3.t(ku3Var3, null, new ja3(la3Var, str, r8, z10 ? 1 : 0), 3);
                    t = xw3.t(ku3Var3, null, new ja3(la3Var, str, r8, z4 ? 1 : 0), 3);
                    this.t = null;
                    this.v = t;
                    this.s = 1;
                    w2 = t12.w(this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ArrayList arrayList6 = (ArrayList) this.u;
                        y6a.M(obj);
                        arrayList = arrayList6;
                        T2 = obj;
                        list2 = (List) T2;
                        ia0 ia0Var2 = ia0.q;
                        Set e = ok3.p().h().e();
                        ArrayList arrayList7 = new ArrayList(k13.r(list2, 10));
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            w1l.A(arrayList7, ((PinnedTournament) it2.next()).getId());
                        }
                        y9h.e(e, arrayList7).size();
                        i1g i1gVar = (i1g) this.x;
                        ArrayList arrayList8 = new ArrayList(arrayList);
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        int i7 = ke0.c;
                        it3 = arrayList8.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Category category = (Category) it3.next();
                            List<Integer> mccList = category.getMccList();
                            if (Intrinsics.c(mccList != null ? Boolean.valueOf(mccList.contains(Integer.valueOf(i7))) : null, Boolean.TRUE)) {
                                category.setPriority(2147483643);
                            }
                            if (t62.J(category)) {
                                arrayList11.add(category);
                            } else {
                                arrayList10.add(category);
                            }
                        }
                        t62.L(arrayList9, i1gVar, true);
                        t62.L(arrayList11, i1gVar, false);
                        t62.L(arrayList10, i1gVar, false);
                        arrayList.clear();
                        if (Sports.E_SPORTS.equals(la3Var.j)) {
                            ArrayList arrayList12 = new ArrayList(arrayList11);
                            arrayList12.addAll(arrayList10);
                            t62.L(arrayList12, i1gVar, true);
                            arrayList.addAll(arrayList12);
                        } else {
                            arrayList.addAll(arrayList11);
                            arrayList.addAll(arrayList10);
                        }
                        fdiVar = la3Var.k;
                        do {
                            value = fdiVar.getValue();
                            ha3 ha3Var = (ha3) value;
                            y93Var = new y93(new Category("Pinned", 0), new ArrayList(list2), qha.E(la3Var.i()), 0);
                            arrayList2 = new ArrayList(k13.r(arrayList, 10));
                            int i8 = 0;
                            for (Object obj9 : arrayList) {
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    b.q();
                                    throw null;
                                }
                                arrayList2.add(new w93((Category) obj9, new ArrayList(), false, i8, 0));
                                i8 = i9;
                            }
                            ha3Var.getClass();
                        } while (!fdiVar.k(value, new ha3(true, y93Var, arrayList2)));
                        return Unit.a;
                    }
                    t = (av4) this.v;
                    y6a.M(obj);
                    w2 = obj;
                }
                SportCategoriesResponse sportCategoriesResponse = (SportCategoriesResponse) yaa.x((x2g) w2);
                if (sportCategoriesResponse == null || (categories = sportCategoriesResponse.getCategories()) == null) {
                    r5 = 0;
                } else {
                    r5 = new ArrayList(k13.r(categories, 10));
                    for (Category category2 : categories) {
                        category2.getClass();
                        ArrayList arrayList13 = dv3.a;
                        com.sofascore.model.Country a4 = dv3.a(category2.getAlpha2());
                        category2.setMccList(a4 != null ? a4.getMccList() : null);
                        r5.add(category2);
                    }
                }
                if (r5 == 0) {
                    r5 = km5.a;
                }
                ArrayList U0 = CollectionsKt.U0(r5);
                this.t = null;
                this.v = null;
                this.u = U0;
                this.s = 2;
                T2 = t.T(this);
                if (T2 != lu3Var4) {
                    arrayList = U0;
                    list2 = (List) T2;
                    ia0 ia0Var22 = ia0.q;
                    Set e2 = ok3.p().h().e();
                    ArrayList arrayList72 = new ArrayList(k13.r(list2, 10));
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                    }
                    y9h.e(e2, arrayList72).size();
                    i1g i1gVar2 = (i1g) this.x;
                    ArrayList arrayList82 = new ArrayList(arrayList);
                    ArrayList arrayList92 = new ArrayList();
                    ArrayList arrayList102 = new ArrayList();
                    ArrayList arrayList112 = new ArrayList();
                    int i72 = ke0.c;
                    it3 = arrayList82.iterator();
                    it3.getClass();
                    while (it3.hasNext()) {
                    }
                    t62.L(arrayList92, i1gVar2, true);
                    t62.L(arrayList112, i1gVar2, false);
                    t62.L(arrayList102, i1gVar2, false);
                    arrayList.clear();
                    if (Sports.E_SPORTS.equals(la3Var.j)) {
                    }
                    fdiVar = la3Var.k;
                    do {
                        value = fdiVar.getValue();
                        ha3 ha3Var2 = (ha3) value;
                        y93Var = new y93(new Category("Pinned", 0), new ArrayList(list2), qha.E(la3Var.i()), 0);
                        arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        int i82 = 0;
                        while (r6.hasNext()) {
                        }
                        ha3Var2.getClass();
                    } while (!fdiVar.k(value, new ha3(true, y93Var, arrayList2)));
                    return Unit.a;
                }
                return lu3Var4;
            case 4:
                ks3 ks3Var = (ks3) this.y;
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    av4 t13 = xw3.t(ku3Var4, null, new js3(ks3Var, r8, i2), 3);
                    t2 = xw3.t(ku3Var4, null, new js3(ks3Var, r8, z5 ? 1 : 0), 3);
                    t3 = xw3.t(ku3Var4, null, new js3(ks3Var, r8, z11 ? 1 : 0), 3);
                    this.t = null;
                    this.v = t2;
                    this.u = t3;
                    this.s = 1;
                    w3 = t13.w(this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            List list7 = (List) this.w;
                            ProfileData profileData3 = (ProfileData) this.x;
                            y6a.M(obj);
                            list3 = list7;
                            profileData2 = profileData3;
                            T4 = obj;
                            ks3Var.n(new is3((Integer) null, (Integer) null, (gv9) null, (b7) null, 31), new l50(profileData2, list3, ks3Var, (ContributionSummaryResponse) T4, 5));
                            return Unit.a;
                        }
                        profileData = (ProfileData) this.x;
                        zu4 zu4Var3 = (zu4) this.u;
                        y6a.M(obj);
                        zu4Var = zu4Var3;
                        T3 = obj;
                        List list8 = (List) T3;
                        this.t = null;
                        this.v = null;
                        this.u = null;
                        this.x = profileData;
                        this.w = list8;
                        this.s = 3;
                        T4 = zu4Var.T(this);
                        if (T4 != lu3Var5) {
                            profileData2 = profileData;
                            list3 = list8;
                            ks3Var.n(new is3((Integer) null, (Integer) null, (gv9) null, (b7) null, 31), new l50(profileData2, list3, ks3Var, (ContributionSummaryResponse) T4, 5));
                            return Unit.a;
                        }
                        return lu3Var5;
                    }
                    t3 = (zu4) this.u;
                    t2 = (av4) this.v;
                    y6a.M(obj);
                    w3 = obj;
                }
                ProfileData profileData4 = (ProfileData) w3;
                this.t = null;
                this.v = null;
                this.u = t3;
                this.x = profileData4;
                this.s = 2;
                T3 = t2.T(this);
                if (T3 != lu3Var5) {
                    zu4Var = t3;
                    profileData = profileData4;
                    List list82 = (List) T3;
                    this.t = null;
                    this.v = null;
                    this.u = null;
                    this.x = profileData;
                    this.w = list82;
                    this.s = 3;
                    T4 = zu4Var.T(this);
                    if (T4 != lu3Var5) {
                    }
                }
                return lu3Var5;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    obj2 = this.x;
                    List list9 = (List) this.w;
                    arrayList3 = (ArrayList) this.y;
                    it4 = list9.iterator();
                } else if (i11 == 1) {
                    obj2 = this.t;
                    be4 be4Var2 = (be4) this.v;
                    Iterator it6 = (Iterator) this.u;
                    ?? r52 = (List) this.x;
                    y6a.M(obj);
                    be4Var = be4Var2;
                    it4 = it6;
                    arrayList3 = r52;
                    obj3 = obj;
                    if (((Boolean) obj3).booleanValue()) {
                        arrayList3.add(new r3(be4Var, r8, 6));
                        this.x = arrayList3;
                        this.u = it4;
                        this.v = null;
                        this.t = null;
                        this.s = 2;
                        obj2 = be4Var.migrate(obj2, this);
                        break;
                    }
                } else {
                    if (i11 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it7 = (Iterator) this.u;
                    ?? r3 = (List) this.x;
                    y6a.M(obj);
                    arrayList3 = r3;
                    it4 = it7;
                    obj2 = obj;
                }
                if (!it4.hasNext()) {
                    return obj2;
                }
                be4Var = (be4) it4.next();
                this.x = arrayList3;
                this.u = it4;
                this.v = be4Var;
                this.t = obj2;
                this.s = 1;
                obj3 = be4Var.shouldMigrate(obj2, this);
                break;
            case 6:
                String str2 = (String) this.x;
                ai4 ai4Var = (ai4) this.w;
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                rq3 rq3Var = null;
                if (i12 == 0) {
                    y6a.M(obj);
                    av4 p2 = yaa.p(ku3Var5, fc6.B(fc6.t(Instant.ofEpochSecond(ai4Var.h))), new ce4(ai4Var, str2, rq3Var, 5));
                    t4 = xw3.t(ku3Var5, null, new g2(ai4Var, str2, (String) this.y, rq3Var, 29), 3);
                    if (p2 != null) {
                        this.t = null;
                        this.v = t4;
                        this.s = 1;
                        w4 = p2.w(this);
                        break;
                    }
                    map = lm5.a;
                    map.getClass();
                    Map map3 = map;
                    av4 av4Var = t4;
                    map2 = map3;
                    this.t = null;
                    this.v = null;
                    this.u = map2;
                    this.s = 2;
                    T5 = av4Var.T(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            return obj;
                        }
                        map2 = (Map) this.u;
                        y6a.M(obj);
                        T5 = obj;
                        hs4 hs4Var = z45.a;
                        r1 r1Var = new r1((List) T5, map2, rq3Var, 17);
                        this.t = null;
                        this.v = null;
                        this.u = null;
                        this.s = 3;
                        Object R2 = xw3.R(hs4Var, r1Var, this);
                        if (R2 != lu3Var7) {
                            return R2;
                        }
                        return lu3Var7;
                    }
                    t4 = (av4) this.v;
                    y6a.M(obj);
                    w4 = obj;
                }
                map = (Map) w4;
                break;
            case 7:
                MmaEvent mmaEvent = (MmaEvent) this.y;
                d46 d46Var = (d46) this.x;
                ku3 ku3Var6 = (ku3) this.t;
                lu3 lu3Var8 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    av4 t14 = xw3.t(ku3Var6, null, new c46(d46Var, mmaEvent, r8, z12 ? 1 : 0), 3);
                    t5 = xw3.t(ku3Var6, null, new c46(d46Var, mmaEvent, r8, z6 ? 1 : 0), 3);
                    this.t = null;
                    this.v = t5;
                    this.s = 1;
                    w5 = t14.w(this);
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            teamCareerStatisticsResponse2 = (TeamCareerStatisticsResponse) this.w;
                            TeamCareerStatisticsResponse teamCareerStatisticsResponse3 = (TeamCareerStatisticsResponse) this.u;
                            y6a.M(obj);
                            teamCareerStatisticsResponse = teamCareerStatisticsResponse3;
                            R = obj;
                            d46Var.g.j(new b46((Map) R, teamCareerStatisticsResponse != null, teamCareerStatisticsResponse2 != null));
                            return Unit.a;
                        }
                        TeamCareerStatisticsResponse teamCareerStatisticsResponse4 = (TeamCareerStatisticsResponse) this.u;
                        y6a.M(obj);
                        teamCareerStatisticsResponse = teamCareerStatisticsResponse4;
                        T6 = obj;
                        teamCareerStatisticsResponse2 = (TeamCareerStatisticsResponse) yaa.x((x2g) T6);
                        if (teamCareerStatisticsResponse != null || teamCareerStatisticsResponse2 != null) {
                            hs4 hs4Var2 = z45.a;
                            r1 r1Var2 = new r1(teamCareerStatisticsResponse, teamCareerStatisticsResponse2, r8, 23);
                            this.t = null;
                            this.v = null;
                            this.u = teamCareerStatisticsResponse;
                            this.w = teamCareerStatisticsResponse2;
                            this.s = 3;
                            R = xw3.R(hs4Var2, r1Var2, this);
                            break;
                        }
                        return Unit.a;
                    }
                    t5 = (av4) this.v;
                    y6a.M(obj);
                    w5 = obj;
                }
                teamCareerStatisticsResponse = (TeamCareerStatisticsResponse) yaa.x((x2g) w5);
                this.t = null;
                this.v = null;
                this.u = teamCareerStatisticsResponse;
                this.s = 2;
                T6 = t5.T(this);
                break;
            case 8:
                bc6 bc6Var = (bc6) this.y;
                Event event = (Event) this.x;
                ku3 ku3Var7 = (ku3) this.t;
                lu3 lu3Var9 = lu3.a;
                int i14 = this.s;
                rq3 rq3Var2 = null;
                if (i14 == 0) {
                    y6a.M(obj);
                    UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
                    Integer num = uniqueTournament != null ? new Integer(uniqueTournament.getId()) : null;
                    Season season = event.getSeason();
                    Integer num2 = season != null ? new Integer(season.getId()) : null;
                    czg[] czgVarArr = czg.b;
                    if (num != null && num2 != null) {
                        g39 g39Var = bc6Var.f;
                        int intValue = num.intValue();
                        int intValue2 = num2.intValue();
                        this.t = ku3Var7;
                        this.s = 1;
                        g39Var.getClass();
                        r8 = 0;
                        P = yaa.P(new w29(g39Var, intValue, intValue2, rq3Var2, 8), this);
                        break;
                    } else {
                        return null;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            x2g x2gVar4 = (x2g) this.w;
                            x2gVar3 = (x2g) this.u;
                            y6a.M(obj);
                            x2gVar2 = x2gVar4;
                            obj5 = null;
                            T7 = obj;
                            x2g x2gVar5 = (x2g) T7;
                            return ((x2gVar2 instanceof v2g) && (x2gVar5 instanceof v2g)) ? new TeamEventShotmapWrapper(((TeamEventShotmapResponse) ((v2g) x2gVar2).a).getShotmap(), ((TeamEventShotmapResponse) ((v2g) x2gVar5).a).getShotmap(), ((SeasonShotActionAreaResponse) ((v2g) x2gVar3).a).getShotActionAreas()) : obj5;
                        }
                        t6 = (av4) this.v;
                        x2g x2gVar6 = (x2g) this.u;
                        y6a.M(obj);
                        x2gVar = x2gVar6;
                        obj4 = null;
                        w6 = obj;
                        x2gVar2 = (x2g) w6;
                        this.t = obj4;
                        this.u = x2gVar;
                        this.v = obj4;
                        this.w = x2gVar2;
                        this.s = 3;
                        T7 = t6.T(this);
                        if (T7 != lu3Var9) {
                            x2gVar3 = x2gVar;
                            obj5 = obj4;
                            x2g x2gVar52 = (x2g) T7;
                            if (x2gVar2 instanceof v2g) {
                                return obj5;
                            }
                        }
                        return lu3Var9;
                    }
                    y6a.M(obj);
                    P = obj;
                    r8 = 0;
                }
                x2gVar = (x2g) P;
                if (!(x2gVar instanceof v2g)) {
                    return r8;
                }
                av4 t15 = xw3.t(ku3Var7, r8, new xb6(bc6Var, event, r8, z7 ? 1 : 0), 3);
                t6 = xw3.t(ku3Var7, r8, new xb6(bc6Var, event, r8, z13 ? 1 : 0), 3);
                this.t = r8;
                this.u = x2gVar;
                this.v = t6;
                this.s = 2;
                w6 = t15.w(this);
                obj4 = r8;
                break;
            case 9:
                cq6 cq6Var = (cq6) this.y;
                ku3 ku3Var8 = (ku3) this.t;
                lu3 lu3Var10 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    av4 t16 = xw3.t(ku3Var8, null, new aq6(cq6Var, r8, z14 ? 1 : 0), 3);
                    t7 = xw3.t(ku3Var8, null, new aq6(cq6Var, r8, z8 ? 1 : 0), 3);
                    this.t = null;
                    this.v = t7;
                    this.s = 1;
                    w7 = t16.w(this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gv9Var2 = (gv9) this.x;
                        fdiVar2 = (fdi) this.w;
                        ArrayList arrayList14 = (ArrayList) this.u;
                        y6a.M(obj);
                        arrayList4 = arrayList14;
                        T8 = obj;
                        s68 s68Var = new s68(gv9Var2, ((Boolean) T8).booleanValue());
                        fdiVar2.getClass();
                        fdiVar2.m(null, s68Var);
                        fdi fdiVar3 = cq6Var.o;
                        it5 = arrayList4.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                Object next = it5.next();
                                if (((fo1) next).a == cq6Var.h.c.n) {
                                    obj7 = next;
                                }
                            }
                        }
                        fo1Var = (fo1) obj7;
                        if (fo1Var == null) {
                            fo1Var = (fo1) CollectionsKt.j0(arrayList4);
                        }
                        fdiVar3.l(fo1Var);
                        return Unit.a;
                    }
                    t7 = (av4) this.v;
                    y6a.M(obj);
                    w7 = obj;
                }
                Iterable<FantasyRound> iterable = (Iterable) w7;
                arrayList4 = new ArrayList(k13.r(iterable, 10));
                for (FantasyRound fantasyRound : iterable) {
                    arrayList4.add(new fo1(fantasyRound.getId(), fantasyRound.getSequence(), fantasyRound.getName(), fantasyRound.getStartTimestamp()));
                }
                fdi fdiVar4 = cq6Var.m;
                gv9 W2 = l6g.W(arrayList4);
                this.t = null;
                this.v = null;
                this.u = arrayList4;
                this.w = fdiVar4;
                this.x = W2;
                this.s = 2;
                T8 = t7.T(this);
                if (T8 != lu3Var10) {
                    fdiVar2 = fdiVar4;
                    gv9Var2 = W2;
                    s68 s68Var2 = new s68(gv9Var2, ((Boolean) T8).booleanValue());
                    fdiVar2.getClass();
                    fdiVar2.m(null, s68Var2);
                    fdi fdiVar32 = cq6Var.o;
                    it5 = arrayList4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                        }
                    }
                    fo1Var = (fo1) obj7;
                    if (fo1Var == null) {
                    }
                    fdiVar32.l(fo1Var);
                    return Unit.a;
                }
                return lu3Var10;
            case 10:
                UserAccount userAccount = (UserAccount) this.w;
                xu6 xu6Var = (xu6) this.u;
                e1d e1dVar2 = xu6Var.g;
                ku3 ku3Var9 = (ku3) this.t;
                lu3 lu3Var11 = lu3.a;
                int i16 = this.s;
                rq3 rq3Var3 = null;
                if (i16 == 0) {
                    y6a.M(obj);
                    av4 t17 = xw3.t(ku3Var9, null, new rh4(xu6Var, userAccount, rq3Var3, 25), 3);
                    t8 = xw3.t(ku3Var9, null, new rh4(xu6Var, (String) this.y, userAccount, rq3Var3, 24), 3);
                    this.t = null;
                    this.v = t8;
                    this.s = 1;
                    w8 = t17.w(this);
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gv9 gv9Var5 = (gv9) this.x;
                        y6a.M(obj);
                        W = gv9Var5;
                        T9 = obj;
                        gv9 W3 = l6g.W((Iterable) T9);
                        int i17 = ((wu6) ((eoh) e1dVar2).getValue()).a;
                        W3.getClass();
                        W.getClass();
                        ((eoh) e1dVar2).setValue(new wu6(i17, W3, W, false));
                        return Unit.a;
                    }
                    t8 = (av4) this.v;
                    y6a.M(obj);
                    w8 = obj;
                }
                W = l6g.W((Iterable) w8);
                this.t = null;
                this.v = null;
                this.x = W;
                this.s = 2;
                T9 = t8.T(this);
                break;
            case 11:
                return e(obj);
            case 12:
                return f(obj);
            case 13:
                yc7 yc7Var = (yc7) this.y;
                ku3 ku3Var10 = (ku3) this.t;
                lu3 lu3Var12 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    av4 t18 = xw3.t(ku3Var10, null, new vc7(yc7Var, r8, i), 3);
                    t9 = xw3.t(ku3Var10, null, new vc7(yc7Var, r8, i2), 3);
                    t10 = xw3.t(ku3Var10, null, new vc7(yc7Var, r8, z15 ? 1 : 0), 3);
                    this.t = null;
                    this.v = t9;
                    this.u = t10;
                    this.s = 1;
                    w9 = t18.w(this);
                    break;
                } else if (i18 == 1) {
                    t10 = (zu4) this.u;
                    av4 av4Var2 = (av4) this.v;
                    y6a.M(obj);
                    t9 = av4Var2;
                    w9 = obj;
                } else {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list10 = (List) this.x;
                        List list11 = (List) this.w;
                        y6a.M(obj);
                        list5 = list10;
                        list4 = list11;
                        T11 = obj;
                        ((eoh) yc7Var.j).setValue(zo6.a(yc7Var.m(), false, null, null, l6g.W(list4), l6g.W(list5), l6g.W((List) T11), false, 6));
                        return Unit.a;
                    }
                    list4 = (List) this.w;
                    zu4Var2 = (zu4) this.u;
                    y6a.M(obj);
                    T10 = obj;
                    list5 = (List) T10;
                    this.t = null;
                    this.v = null;
                    this.u = null;
                    this.w = list4;
                    this.x = list5;
                    this.s = 3;
                    T11 = zu4Var2.T(this);
                    break;
                }
                List list12 = (List) w9;
                this.t = null;
                this.v = null;
                this.u = t10;
                this.w = list12;
                this.s = 2;
                T10 = t9.T(this);
                if (T10 != lu3Var12) {
                    zu4Var2 = t10;
                    list4 = list12;
                    list5 = (List) T10;
                    this.t = null;
                    this.v = null;
                    this.u = null;
                    this.w = list4;
                    this.x = list5;
                    this.s = 3;
                    T11 = zu4Var2.T(this);
                }
                return lu3Var12;
            case 14:
                return g(obj);
            case 15:
                return h(obj);
            case 16:
                return j(obj);
            case 17:
                return k(obj);
            case 18:
                return l(obj);
            case 19:
                return m(obj);
            case 20:
                return n(obj);
            case 21:
                return o(obj);
            case 22:
                qze qzeVar = (qze) this.u;
                lu3 lu3Var13 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    nti ntiVar = new nti((ku3) this.t, new j6f(qzeVar), (Function1) this.v, (Function1) this.w, (ct8) this.x, (Function1) this.y, null);
                    this.s = 1;
                    if (oyn.s(qzeVar, ntiVar, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 23:
                return p(obj);
            case 24:
                return q(obj);
            case 25:
                return r(obj);
            case 26:
                return t(obj);
            case 27:
                return u(obj);
            default:
                tll tllVar = (tll) this.y;
                e1d e1dVar3 = (e1d) this.x;
                e1d e1dVar4 = (e1d) this.v;
                ku3 ku3Var11 = (ku3) this.t;
                lu3 lu3Var14 = lu3.a;
                int i20 = this.s;
                try {
                } catch (Throwable th) {
                    p2g p2gVar = w2g.b;
                    u2gVar = new u2g(th);
                }
                if (i20 == 0) {
                    y6a.M(obj);
                    int length = ((String) e1dVar4.getValue()).length();
                    e1d e1dVar5 = (e1d) this.w;
                    if (length == 0) {
                        e1dVar5.setValue(null);
                        e1dVar3.setValue(null);
                        return Unit.a;
                    }
                    try {
                        p2g p2gVar2 = w2g.b;
                        String str3 = (String) e1dVar4.getValue();
                        this.t = ku3Var11;
                        this.u = e1dVar5;
                        this.s = 1;
                        r = s9a.r(new do5(str3, tllVar, null), this);
                        if (r != lu3Var14) {
                            e1dVar = e1dVar5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        e1dVar = e1dVar5;
                        p2g p2gVar3 = w2g.b;
                        u2gVar2 = new u2g(th);
                        if (u2gVar2 instanceof u2g) {
                        }
                        e1dVar.setValue((skl) u2gVar2);
                        String str4 = (String) e1dVar4.getValue();
                        this.t = null;
                        this.u = e1dVar3;
                        this.s = 2;
                        b = vel.b(str4);
                        if (b != null) {
                        }
                    }
                    return lu3Var14;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e1dVar3 = (e1d) this.u;
                    y6a.M(obj);
                    obj6 = obj;
                    u2gVar = (Bitmap) obj6;
                    p2g p2gVar4 = w2g.b;
                    e1dVar3.setValue((Bitmap) (u2gVar instanceof u2g ? null : u2gVar));
                    return Unit.a;
                }
                e1dVar = (e1d) this.u;
                try {
                    y6a.M(obj);
                    r = obj;
                } catch (Throwable th3) {
                    th = th3;
                    p2g p2gVar32 = w2g.b;
                    u2gVar2 = new u2g(th);
                    if (u2gVar2 instanceof u2g) {
                    }
                    e1dVar.setValue((skl) u2gVar2);
                    String str42 = (String) e1dVar4.getValue();
                    this.t = null;
                    this.u = e1dVar3;
                    this.s = 2;
                    b = vel.b(str42);
                    if (b != null) {
                    }
                }
                u2gVar2 = (skl) r;
                p2g p2gVar5 = w2g.b;
                if (u2gVar2 instanceof u2g) {
                    u2gVar2 = null;
                }
                e1dVar.setValue((skl) u2gVar2);
                String str422 = (String) e1dVar4.getValue();
                this.t = null;
                this.u = e1dVar3;
                this.s = 2;
                b = vel.b(str422);
                if (b != null) {
                    int intValue3 = b.intValue();
                    Context context = tllVar.a;
                    int s = ao2.s(48, context);
                    obj6 = inb.g.u(context, pco.R(intValue3), aba.g(s, s), Bitmap.Config.ARGB_8888, this);
                    break;
                } else {
                    obj6 = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(xu6 xu6Var, UserAccount userAccount, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 10;
        this.u = xu6Var;
        this.w = userAccount;
        this.y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(r1d r1dVar, Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 17;
        n1d n1dVar = n1d.a;
        this.x = r1dVar;
        this.y = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(Serializable serializable, ltk ltkVar, Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = serializable;
        this.x = ltkVar;
        this.y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(Object obj, Object obj2, Object obj3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(Object obj, Object obj2, Object obj3, Object obj4, dt8 dt8Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = dt8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.t = obj4;
        this.y = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(List list, qkl qklVar, Map map, Set set, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 26;
        this.u = list;
        this.v = qklVar;
        this.x = map;
        this.y = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk(List list, Object obj, Object obj2, Serializable serializable, Serializable serializable2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = list;
        this.u = obj;
        this.v = obj2;
        this.x = serializable;
        this.y = serializable2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(List list, ArrayList arrayList, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.w = list;
        this.y = arrayList;
    }
}
