package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.local_persistance.BrandingConfig;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.database.DbPlayerOfTheMatchVote;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import com.sofascore.model.newNetwork.CategoriesForDateResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchResponse;
import com.sofascore.model.newNetwork.LiveCategoriesResponse;
import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rh4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh4(String str, mr5 mr5Var, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 6;
        this.u = str;
        this.t = mr5Var;
        this.v = event;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r9 == r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        ru6 ru6Var;
        xu6 xu6Var = (xu6) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            ru6Var = xu6Var.e;
            wi7 wi7Var = xu6Var.f;
            String id = ((UserAccount) this.v).getId();
            this.t = ru6Var;
            this.s = 1;
            obj = wi7Var.Q(id, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ru6Var = (ru6) this.t;
            y6a.M(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(fkf.O((FantasyUserCompetition) it.next(), xu6Var.i()));
        }
        this.t = null;
        this.s = 2;
        Object a = ru6Var.a(arrayList, this);
        return a == lu3Var ? lu3Var : a;
    }

    private final Object f(Object obj) {
        Context context = (Context) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            nv.A(context, "share", "share");
            zic zicVar = zic.g;
            a27 a27Var = (a27) ((b27) this.u);
            Bitmap bitmap = a27Var.a;
            String string = context.getString(R.string.fantasy_league_share_text, "https://www.sofascore.com/fantasy/competition/" + ((h27) this.v).d.c + "#tab:fantasy_leagues,joinCode:" + a27Var.b);
            string.getClass();
            this.s = 1;
            if (zicVar.L(context, bitmap, string, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r9 == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r9.w(r8) == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        av4 t;
        h27 h27Var = (h27) this.v;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 1;
        int i3 = 2;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            av4 t2 = xw3.t(ku3Var, null, new u41(i3, rq3Var, 4), 3);
            t = xw3.t(ku3Var, null, new g27(h27Var, rq3Var, i2), 3);
            this.u = null;
            this.t = t;
            this.s = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                String str = (String) obj;
                if (str != null) {
                    ((eoh) h27Var.f).setValue(f27.a((f27) ((eoh) h27Var.f).getValue(), false, str, 12));
                }
                return Unit.a;
            }
            t = (av4) this.t;
            y6a.M(obj);
        }
        this.u = null;
        this.t = null;
        this.s = 2;
        obj = t.T(this);
    }

    private final Object h(Object obj) {
        String str = (String) this.u;
        r77 r77Var = (r77) this.v;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            r77Var.n(null, new yt6(20));
            av4 t = xw3.t(ku3Var, null, new hs6((d50) r77Var, str, rq3Var, 15), 3);
            wd5 wd5Var = xd5.b;
            long R = wkn.R(400, be5.MILLISECONDS);
            this.t = null;
            this.s = 1;
            obj = z8e.e0(t, R, this);
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
        x2g x2gVar = (x2g) obj;
        x2gVar.getClass();
        if (x2gVar instanceof v2g) {
            r77Var.n(null, new jp1(str, 13));
            r77Var.k(new h77(str));
        } else {
            r77Var.n(null, new yt6(21));
            r77Var.k(g77.a);
        }
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new rh4((ai4) obj2, rq3Var, 0);
            case 1:
                rh4 rh4Var = new rh4((ls4) this.u, (Function2) obj2, rq3Var, 1);
                rh4Var.t = obj;
                return rh4Var;
            case 2:
                return new rh4((ls4) this.t, (m1d) this.u, (Function2) obj2, rq3Var, 2);
            case 3:
                rh4 rh4Var2 = new rh4(this.u, (aq4) obj2, rq3Var, 3);
                rh4Var2.t = obj;
                return rh4Var2;
            case 4:
                rh4 rh4Var3 = new rh4((j95) this.u, (x95) obj2, rq3Var, 4);
                rh4Var3.t = obj;
                return rh4Var3;
            case 5:
                rh4 rh4Var4 = new rh4((x95) this.u, (s85) obj2, rq3Var, 5);
                rh4Var4.t = obj;
                return rh4Var4;
            case 6:
                return new rh4((String) this.u, (mr5) this.t, (Event) obj2, rq3Var);
            case 7:
                return new rh4((mr5) this.u, (Event) obj2, rq3Var, 7);
            case 8:
                return new rh4((mr5) this.t, (Event) this.u, (OddsCountryProvider) obj2, rq3Var, 8);
            case 9:
                return new rh4((q8) this.t, (Event) obj2, (String) this.u, rq3Var, 9);
            case 10:
                return new rh4((q8) this.t, (Event) obj2, (String) this.u, rq3Var, 10);
            case 11:
                return new rh4((dz5) this.u, (Event) obj2, rq3Var, 11);
            case 12:
                return new rh4((dz5) this.t, (Event) this.u, (OddsCountryProvider) obj2, rq3Var, 12);
            case 13:
                rh4 rh4Var5 = new rh4((List) this.u, (u16) obj2, rq3Var, 13);
                rh4Var5.t = obj;
                return rh4Var5;
            case 14:
                return new rh4((b1d) this.t, (EventMatchesFragment) this.u, rq3Var, (EventMatchesFragment) obj2, 14);
            case 15:
                rh4 rh4Var6 = new rh4((nc6) obj2, rq3Var, 15);
                rh4Var6.u = obj;
                return rh4Var6;
            case 16:
                rh4 rh4Var7 = new rh4((wd6) this.u, (Event) obj2, rq3Var, 16);
                rh4Var7.t = obj;
                return rh4Var7;
            case 17:
                return new rh4((yd6) this.u, (List) obj2, rq3Var, 17);
            case 18:
                rh4 rh4Var8 = new rh4((List) this.u, (yd6) obj2, rq3Var, 18);
                rh4Var8.t = obj;
                return rh4Var8;
            case 19:
                return new rh4((AbstractActivity) this.t, (z88) this.u, (Function2) obj2, rq3Var, 19);
            case 20:
                return new rh4((ComponentActivity) this.t, (z88) this.u, (Function2) obj2, rq3Var, 20);
            case 21:
                return new rh4((b1d) this.t, (FantasyCompetitionFixturesFragment) this.u, rq3Var, (FantasyCompetitionFixturesFragment) obj2, 21);
            case 22:
                rh4 rh4Var9 = new rh4((cq6) this.u, (List) obj2, rq3Var, 22);
                rh4Var9.t = obj;
                return rh4Var9;
            case 23:
                return new rh4((pu6) this.t, (ho7) this.u, (av4) obj2, rq3Var, 23);
            case 24:
                return new rh4((xu6) this.t, (String) this.u, (UserAccount) obj2, rq3Var, 24);
            case 25:
                return new rh4((xu6) this.u, (UserAccount) obj2, rq3Var, 25);
            case 26:
                return new rh4((Context) this.t, (b27) this.u, (h27) obj2, rq3Var, 26);
            case 27:
                rh4 rh4Var10 = new rh4((h27) obj2, rq3Var, 27);
                rh4Var10.u = obj;
                return rh4Var10;
            case 28:
                rh4 rh4Var11 = new rh4((r77) obj2, (String) this.u, rq3Var);
                rh4Var11.t = obj;
                return rh4Var11;
            default:
                return new rh4((Function1) this.t, (Integer) this.u, (FragmentActivity) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 14:
                ((rh4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 21:
                ((rh4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((rh4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x06e4, code lost:
    
        if (r0 == r9) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x06c2, code lost:
    
        if (r6 == r9) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0875, code lost:
    
        if (r0 == r9) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x089d, code lost:
    
        if (r0 == r9) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x08ad, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.AMERICAN_FOOTBALL) == false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x08e2, code lost:
    
        if (kotlin.text.c.v(r10, "en", false) == false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x08e4, code lost:
    
        r1 = r2.getId();
        r25.s = 1;
        r0 = r4.F(r1, null, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x08ee, code lost:
    
        if (r0 != r9) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x08cc, code lost:
    
        if (r0 == r9) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x08dc, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.ICE_HOCKEY) != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0b4d, code lost:
    
        if (r0 == r7) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0b29, code lost:
    
        if (r6 == r7) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0bea, code lost:
    
        if (r0 == r7) goto L526;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02eb A[LOOP:4: B:145:0x02e5->B:147:0x02eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.Map] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var;
        rq3 rq3Var;
        Object P;
        LinkedHashMap linkedHashMap;
        String valueOf;
        Object P2;
        Object R;
        ?? r13;
        Object value;
        Map<String, Integer> liveCategories;
        Object B;
        Object F;
        Object F2;
        Object F3;
        Object P3;
        mr5 mr5Var;
        Object P4;
        FanPlayerOfTheMatchResponse fanPlayerOfTheMatchResponse;
        Object U;
        Object u;
        List<Country> list;
        Object w;
        yzc yzcVar;
        Object r;
        Object u2;
        Object c;
        boolean z;
        BrandingFantasyCompetition brandingFantasyCompetition;
        Iterator it;
        Object obj2;
        un6 un6Var;
        Iterator it2;
        Object u3;
        Map<String, BrandingFantasyCompetition> fantasyCompetitions;
        SharedPreferences d;
        Object k;
        Object a;
        int i = 2;
        int i2 = 0;
        r5 = false;
        r5 = false;
        r5 = false;
        r5 = false;
        r5 = false;
        r5 = false;
        r5 = false;
        r5 = false;
        boolean booleanValue = false;
        int i3 = 3;
        int i4 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        switch (this.r) {
            case 0:
                ai4 ai4Var = (ai4) this.v;
                long j = ai4Var.h;
                vyh vyhVar = ai4Var.e;
                fdi fdiVar = ai4Var.m;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    if (ai4Var.u()) {
                        List list2 = ((hh4) fdiVar.getValue()).d;
                        int c2 = sub.c(k13.r(list2, 10));
                        linkedHashMap = new LinkedHashMap(c2 >= 16 ? c2 : 16);
                        for (Object obj3 : list2) {
                            linkedHashMap.put(new Integer(((ci6) obj3).b.getId()), obj3);
                        }
                        Calendar calendar = ke0.a;
                        valueOf = String.valueOf(ke0.c());
                        String str = ai4Var.j;
                        bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                        ConcurrentHashMap concurrentHashMap = hk4.a;
                        String i6 = fc6.i(j, hk4.a(bi4Var.d()));
                        oqb oqbVar = ai4Var.v;
                        String z11 = oqbVar != null ? i2a.z(oqbVar, j, false) : "";
                        this.t = linkedHashMap;
                        this.u = valueOf;
                        this.s = 1;
                        vyhVar.getClass();
                        lu3Var = lu3Var2;
                        P2 = yaa.P(new tyh(vyhVar, str, i6, z11, null, 0), this);
                        break;
                    } else {
                        lu3Var = lu3Var2;
                        rq3Var = null;
                        String str2 = ai4Var.j;
                        this.s = 3;
                        vyhVar.getClass();
                        P = yaa.P(new uyh(vyhVar, str2, rq3Var, i2), this);
                        break;
                    }
                    return lu3Var;
                }
                if (i5 == 1) {
                    valueOf = (String) this.u;
                    Map map = (Map) this.t;
                    y6a.M(obj);
                    linkedHashMap = map;
                    lu3Var = lu3Var2;
                    P2 = obj;
                    String str3 = valueOf;
                    CategoriesForDateResponse categoriesForDateResponse = (CategoriesForDateResponse) yaa.x((x2g) P2);
                    hs4 hs4Var = z45.a;
                    rq3 rq3Var2 = null;
                    k50 k50Var = new k50(categoriesForDateResponse, ai4Var, str3, rq3Var2, 2);
                    this.t = linkedHashMap;
                    this.u = null;
                    this.s = 2;
                    R = xw3.R(hs4Var, k50Var, this);
                    r13 = rq3Var2;
                    break;
                } else {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        P = obj;
                        rq3Var = null;
                        LiveCategoriesResponse liveCategoriesResponse = (LiveCategoriesResponse) yaa.x((x2g) P);
                        if (liveCategoriesResponse == null || (liveCategories = liveCategoriesResponse.getLiveCategories()) == null) {
                            return rq3Var;
                        }
                        ai4Var.o.j(liveCategories);
                        return Unit.a;
                    }
                    Map map2 = (Map) this.t;
                    y6a.M(obj);
                    linkedHashMap = map2;
                    r13 = 0;
                    R = obj;
                    kh4 kh4Var = (kh4) R;
                    ai4Var.q.j(kh4Var.a);
                    ai4Var.w = kh4Var.b;
                    ai4Var.x = kh4Var.c;
                    ArrayList arrayList = kh4Var.d;
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        int i7 = i2;
                        if (!it3.hasNext()) {
                            do {
                                value = fdiVar.getValue();
                            } while (!fdiVar.k(value, hh4.a((hh4) value, arrayList2, r13, 23)));
                            return Unit.a;
                        }
                        Object next = it3.next();
                        i2 = i7 + 1;
                        if (i7 < 0) {
                            b.q();
                            throw r13;
                        }
                        Category category = (Category) next;
                        ci6 ci6Var = (ci6) me4.f(category.getId(), linkedHashMap);
                        arrayList2.add(ci6Var != null ? new ci6(category, ci6Var.c, ci6Var.d, ci6Var.e, ci6Var.f) : new ci6(category, new ArrayList(), false, i7, 0));
                    }
                }
                break;
            case 1:
                e1d e1dVar = ((ls4) this.u).d;
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                try {
                    if (i8 == 0) {
                        y6a.M(obj);
                        oug ougVar = (oug) this.t;
                        ((eoh) e1dVar).setValue(Boolean.TRUE);
                        Function2 function2 = (Function2) this.v;
                        this.s = 1;
                        if (function2.invoke(ougVar, this) == lu3Var3) {
                            return lu3Var3;
                        }
                    } else {
                        if (i8 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    e1dVar = (eoh) e1dVar;
                    e1dVar.setValue(Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th) {
                    ((eoh) e1dVar).setValue(Boolean.FALSE);
                    throw th;
                }
            case 2:
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    ls4 ls4Var = (ls4) this.t;
                    q1d q1dVar = ls4Var.c;
                    ks4 ks4Var = ls4Var.b;
                    m1d m1dVar = (m1d) this.u;
                    rh4 rh4Var = new rh4((Object) ls4Var, this.v, (rq3) (z2 ? 1 : 0), i4);
                    this.s = 1;
                    q1dVar.getClass();
                    if (s9a.r(new q7c(m1dVar, q1dVar, rh4Var, ks4Var, null), this) == lu3Var4) {
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
            case 3:
                aq4 aq4Var = (aq4) this.v;
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                try {
                    if (i10 == 0) {
                        y6a.M(obj);
                        kml kmlVar = (kml) this.t;
                        db2 db2Var = (db2) this.u;
                        hc2 hc2Var = kmlVar.a;
                        this.s = 1;
                        B = l6g.B(db2Var, hc2Var, Long.MAX_VALUE, this);
                        if (B == lu3Var5) {
                            return lu3Var5;
                        }
                    } else {
                        if (i10 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        B = obj;
                    }
                    ((Number) B).longValue();
                    return Unit.a;
                } catch (CancellationException e) {
                    s9a.o(aq4Var, e);
                    throw e;
                } catch (Throwable th2) {
                    s9a.o(aq4Var, ml4.e("Receive failed", th2));
                    throw th2;
                }
            case 4:
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    cx cxVar = (cx) this.t;
                    j95 j95Var = (j95) this.u;
                    r82 r82Var = new r82(19, cxVar, (x95) this.v);
                    this.s = 1;
                    if (j95Var.invoke(r82Var, this) == lu3Var6) {
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
            case 5:
                x95 x95Var = (x95) this.u;
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var = (ku3) this.t;
                    ct8 ct8Var = x95Var.N;
                    long f = vmk.f(((s85) this.v).a, 1.0f);
                    ewd ewdVar = x95Var.K;
                    xf2 xf2Var = w95.a;
                    Float f2 = new Float(ewdVar == ewd.a ? vmk.c(f) : vmk.b(f));
                    this.s = 1;
                    if (ct8Var.invoke(ku3Var, f2, this) == lu3Var7) {
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
            case 6:
                Event event = (Event) this.v;
                s96 s96Var = ((mr5) this.t).f;
                lu3 lu3Var8 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    String a2 = dla.a();
                    String str4 = (String) this.u;
                    switch (str4.hashCode()) {
                        case -2002238939:
                            break;
                        case -1721090992:
                            if (str4.equals(Sports.BASEBALL)) {
                                int id = event.getId();
                                String str5 = dla.c.contains(a2) ? a2 : "en";
                                this.s = 4;
                                F = s96Var.F(id, str5, this);
                                break;
                            }
                            break;
                        case -83759494:
                            break;
                        case 394668909:
                            if (str4.equals(Sports.FOOTBALL) && dla.a.contains(a2)) {
                                int id2 = event.getId();
                                this.s = 2;
                                F2 = s96Var.F(id2, a2, this);
                                break;
                            }
                            break;
                        case 727149765:
                            if (str4.equals(Sports.BASKETBALL) && dla.b.contains(a2)) {
                                int id3 = event.getId();
                                this.s = 3;
                                F3 = s96Var.F(id3, a2, this);
                                break;
                            }
                            break;
                    }
                } else if (i13 == 1) {
                    y6a.M(obj);
                    Object F4 = obj;
                    booleanValue = ((Boolean) F4).booleanValue();
                } else if (i13 == 2) {
                    y6a.M(obj);
                    F2 = obj;
                    booleanValue = ((Boolean) F2).booleanValue();
                } else if (i13 == 3) {
                    y6a.M(obj);
                    F3 = obj;
                    booleanValue = ((Boolean) F3).booleanValue();
                } else {
                    if (i13 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    F = obj;
                    booleanValue = ((Boolean) F).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case 7:
                mr5 mr5Var2 = (mr5) this.u;
                lu3 lu3Var9 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    t9c t9cVar = mr5Var2.e;
                    int id4 = ((Event) this.v).getId();
                    String c3 = dv3.c();
                    this.t = mr5Var2;
                    this.s = 1;
                    t9cVar.getClass();
                    P3 = yaa.P(new y8c(t9cVar, id4, c3, null, 0), this);
                    if (P3 == lu3Var9) {
                        return lu3Var9;
                    }
                    mr5Var = mr5Var2;
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mr5 mr5Var3 = (mr5) this.t;
                    y6a.M(obj);
                    mr5Var = mr5Var3;
                    P3 = obj;
                }
                mr5Var.J = (MediaHighlightSummaryResponse) yaa.x((x2g) P3);
                return Boolean.valueOf(mr5Var2.J != null);
            case 8:
                Event event2 = (Event) this.u;
                lu3 lu3Var10 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                umd umdVar = ((mr5) this.t).k;
                String type = event2.getStatus().getType();
                int id5 = event2.getTournament().getId();
                OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) this.v;
                this.s = 1;
                umdVar.getClass();
                Object r2 = s9a.r(new z23(oddsCountryProvider, umdVar, type, id5, (rq3) null, 14), this);
                return r2 == lu3Var10 ? lu3Var10 : r2;
            case 9:
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
                s96 s96Var2 = ((hw5) this.t).e;
                Event event3 = (Event) this.v;
                String str6 = (String) this.u;
                this.s = 1;
                Object i17 = s96Var2.i(event3, str6, this);
                return i17 == lu3Var11 ? lu3Var11 : i17;
            case 10:
                Event event4 = (Event) this.v;
                lu3 lu3Var12 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var3 = ((dz5) this.t).i;
                int id6 = event4.getId();
                String str7 = (String) this.u;
                boolean shouldReverseTeams = event4.shouldReverseTeams();
                this.s = 1;
                Serializable k2 = s96Var3.k(id6, str7, shouldReverseTeams, this);
                return k2 == lu3Var12 ? lu3Var12 : k2;
            case 11:
                Event event5 = (Event) this.v;
                zte zteVar = ((dz5) this.u).t;
                lu3 lu3Var13 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    int id7 = event5.getId();
                    this.s = 1;
                    zteVar.getClass();
                    P4 = yaa.P(new xr2(zteVar, id7, z3 ? 1 : 0, i3), this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        FanPlayerOfTheMatchResponse fanPlayerOfTheMatchResponse2 = (FanPlayerOfTheMatchResponse) this.t;
                        y6a.M(obj);
                        fanPlayerOfTheMatchResponse = fanPlayerOfTheMatchResponse2;
                        U = obj;
                        DbPlayerOfTheMatchVote dbPlayerOfTheMatchVote = (DbPlayerOfTheMatchVote) U;
                        return new ly5(fanPlayerOfTheMatchResponse, dbPlayerOfTheMatchVote != null ? new Integer(dbPlayerOfTheMatchVote.getPlayerId()) : null);
                    }
                    y6a.M(obj);
                    P4 = obj;
                }
                fanPlayerOfTheMatchResponse = (FanPlayerOfTheMatchResponse) yaa.x((x2g) P4);
                if (fanPlayerOfTheMatchResponse == null) {
                    return null;
                }
                int id8 = event5.getId();
                this.t = fanPlayerOfTheMatchResponse;
                this.s = 2;
                U = gz8.U(this, zteVar.a.a, true, false, new bvb(id8, r2));
                break;
            case 12:
                Event event6 = (Event) this.u;
                lu3 lu3Var14 = lu3.a;
                int i20 = this.s;
                if (i20 != 0) {
                    if (i20 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                umd umdVar2 = ((dz5) this.t).o;
                String type2 = event6.getStatus().getType();
                int id9 = event6.getTournament().getId();
                OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) this.v;
                this.s = 1;
                umdVar2.getClass();
                Object r3 = s9a.r(new z23(oddsCountryProvider2, umdVar2, type2, id9, (rq3) null, 14), this);
                return r3 == lu3Var14 ? lu3Var14 : r3;
            case 13:
                List list3 = (List) this.u;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var15 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    u16 u16Var = (u16) this.v;
                    ArrayList arrayList3 = new ArrayList(k13.r(list3, 10));
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(xw3.t(ku3Var2, null, new qu1((Object) u16Var, ((Number) it4.next()).intValue(), (rq3) (z4 ? 1 : 0), 5), 3));
                    }
                    this.t = null;
                    this.s = 1;
                    u = m6k.u(arrayList3, this);
                    if (u == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u = obj;
                }
                List list4 = (List) u;
                if (list4 == null || !list4.isEmpty()) {
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        if (((Event) it5.next()) == null) {
                            return km5.a;
                        }
                    }
                }
                return CollectionsKt.H0(CollectionsKt.W(list4), new h31(list3, i));
            case 14:
                lu3 lu3Var16 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    b1d b1dVar = (b1d) this.t;
                    nk0 nk0Var = new nk0(6, (EventMatchesFragment) this.u, (EventMatchesFragment) this.v);
                    this.s = 1;
                    if (b1dVar.collect(nk0Var, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 15:
                nc6 nc6Var = (nc6) this.v;
                ku3 ku3Var3 = (ku3) this.u;
                lu3 lu3Var17 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    list = zu3.y0;
                    av4 t = xw3.t(ku3Var3, null, new q3(nc6Var, z5 ? 1 : 0, 24), 3);
                    this.u = null;
                    this.t = list;
                    this.s = 1;
                    w = t.w(this);
                    if (w == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list5 = (List) this.t;
                    y6a.M(obj);
                    list = list5;
                    w = obj;
                }
                TvCountryChannelsResponse tvCountryChannelsResponse = (TvCountryChannelsResponse) yaa.x((x2g) w);
                Map<String, List<Integer>> countryChannels = tvCountryChannelsResponse != null ? tvCountryChannelsResponse.getCountryChannels() : null;
                for (Country country : list) {
                    List<Integer> list6 = countryChannels != null ? countryChannels.get(country.getIso2Alpha()) : null;
                    if (list6 == null) {
                        list6 = km5.a;
                    }
                    country.setChannelIds(list6);
                }
                nc6Var.g.k(list);
                return Unit.a;
            case 16:
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var18 = lu3.a;
                int i24 = this.s;
                if (i24 != 0 && i24 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                while (s9a.w(ku3Var4)) {
                    wd6 wd6Var = (wd6) this.u;
                    Event event7 = (Event) this.v;
                    int i25 = wd6.i;
                    Time time = event7.getTime();
                    StatusTime statusTime = time != null ? time.getStatusTime() : null;
                    TextView textView = (TextView) wd6Var.c.m;
                    if (statusTime != null) {
                        l4a.K(textView, z8e.t(statusTime, xe6.c().b, false));
                    } else {
                        textView.setText(pd0.u(wd6Var.b, event7));
                    }
                    wd5 wd5Var = xd5.b;
                    long R2 = wkn.R(1, be5.SECONDS);
                    this.t = ku3Var4;
                    this.s = 1;
                    if (n4o.z(R2, this) == lu3Var18) {
                        return lu3Var18;
                    }
                }
                return Unit.a;
            case 17:
                lu3 lu3Var19 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    yd6 yd6Var = (yd6) this.u;
                    yzcVar = yd6Var.f;
                    List list7 = (List) this.v;
                    this.t = yzcVar;
                    this.s = 1;
                    r = s9a.r(new rh4((Object) list7, (Object) yd6Var, (rq3) (z6 ? 1 : 0), 18), this);
                    if (r == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzc yzcVar2 = (yzc) this.t;
                    y6a.M(obj);
                    yzcVar = yzcVar2;
                    r = obj;
                }
                yzcVar.j(r);
                return Unit.a;
            case 18:
                List list8 = (List) this.u;
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var20 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    yd6 yd6Var2 = (yd6) this.v;
                    ArrayList arrayList4 = new ArrayList(k13.r(list8, 10));
                    Iterator it6 = list8.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(xw3.t(ku3Var5, null, new xd6(yd6Var2, ((Number) it6.next()).intValue(), z7 ? 1 : 0, i2), 3));
                    }
                    this.t = null;
                    this.s = 1;
                    u2 = m6k.u(arrayList4, this);
                    if (u2 == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u2 = obj;
                }
                d38 g = i5h.g(i5h.n(i5h.g(CollectionsKt.N((Iterable) u2), rg2.d), new au5(27)), new r41(list8, i3));
                h31 h31Var = new h31(list8, i3);
                ArrayList r4 = i5h.r(g);
                n13.u(h31Var, r4);
                Iterator it7 = r4.iterator();
                if (it7.hasNext()) {
                    Object next2 = it7.next();
                    if (it7.hasNext()) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(next2);
                        while (it7.hasNext()) {
                            arrayList5.add(it7.next());
                        }
                        return arrayList5;
                    }
                    c = a.c(next2);
                } else {
                    c = km5.a;
                }
                return c;
            case 19:
                lu3 lu3Var21 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    AbstractActivity abstractActivity = (AbstractActivity) this.t;
                    e6b e6bVar = e6b.e;
                    ek6 ek6Var = new ek6((z88) this.u, (Function2) this.v, z8 ? 1 : 0, i4);
                    this.s = 1;
                    if (b6a.A(abstractActivity, e6bVar, ek6Var, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var22 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    ComponentActivity componentActivity = (ComponentActivity) this.t;
                    e6b e6bVar2 = e6b.d;
                    ek6 ek6Var2 = new ek6((z88) this.u, (Function2) this.v, z9 ? 1 : 0, i3);
                    this.s = 1;
                    if (b6a.A(componentActivity, e6bVar2, ek6Var2, this) == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                lu3 lu3Var23 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    b1d b1dVar2 = (b1d) this.t;
                    nk0 nk0Var2 = new nk0(7, (FantasyCompetitionFixturesFragment) this.u, (FantasyCompetitionFixturesFragment) this.v);
                    this.s = 1;
                    if (b1dVar2.collect(nk0Var2, this) == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 22:
                ku3 ku3Var6 = (ku3) this.t;
                lu3 lu3Var24 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    ia0 ia0Var = ia0.q;
                    boolean C = mz1.C();
                    bga bgaVar = xld.a;
                    boolean f3 = xld.f(((cq6) this.u).i(), ((cq6) this.u).e);
                    Context i32 = ((cq6) this.u).i();
                    if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = i32.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        ccd ccdVar = vl.b;
                        String string = sharedPreferences.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18");
                        ccd ccdVar2 = vl.b;
                        if (!Intrinsics.c(string, "25_or_older")) {
                            z = false;
                            ((cq6) this.u).i();
                            int i33 = ((cq6) this.u).h.c.c;
                            jca.G(ok3.p().e());
                            BrandingConfig brandingConfig = ccd.b;
                            rq3 rq3Var3 = null;
                            brandingFantasyCompetition = (brandingConfig != null || (fantasyCompetitions = brandingConfig.getFantasyCompetitions()) == null) ? null : fantasyCompetitions.get(String.valueOf(i33));
                            cq6 cq6Var = (cq6) this.u;
                            it = xld.b(cq6Var.i()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = null;
                                } else {
                                    obj2 = it.next();
                                    OddsCountryProvider oddsCountryProvider3 = (OddsCountryProvider) obj2;
                                    if (brandingFantasyCompetition != null) {
                                        int id10 = oddsCountryProvider3.getProvider().getId();
                                        Integer oddsProviderId = brandingFantasyCompetition.getOddsProviderId();
                                        if (oddsProviderId != null && id10 == oddsProviderId.intValue()) {
                                        }
                                    }
                                }
                            }
                            if (f3 || !z) {
                                obj2 = null;
                            }
                            cq6Var.s = (OddsCountryProvider) obj2;
                            it7 it7Var = un6.b;
                            un6Var = un6.BETTING;
                            it7Var.getClass();
                            if (it7.x(brandingFantasyCompetition, un6Var, C) || ((cq6) this.u).s == null) {
                                List list9 = (List) this.v;
                                ArrayList arrayList6 = new ArrayList(k13.r(list9, 10));
                                it2 = list9.iterator();
                                while (it2.hasNext()) {
                                    arrayList6.add(new by6((Event) it2.next()));
                                }
                                return arrayList6;
                            }
                            int i34 = ke0.c;
                            boolean z12 = zu3.V.hasMcc(Integer.valueOf(i34)) || zu3.d0.hasMcc(Integer.valueOf(i34)) || zu3.z.hasMcc(Integer.valueOf(i34));
                            List list10 = (List) this.v;
                            cq6 cq6Var2 = (cq6) this.u;
                            ArrayList arrayList7 = new ArrayList(k13.r(list10, 10));
                            Iterator it8 = list10.iterator();
                            while (it8.hasNext()) {
                                arrayList7.add(xw3.t(ku3Var6, null, new w21(cq6Var2, (Event) it8.next(), z12, rq3Var3, 1), 3));
                            }
                            this.t = null;
                            this.s = 1;
                            u3 = m6k.u(arrayList7, this);
                            if (u3 == lu3Var24) {
                                return lu3Var24;
                            }
                        }
                    }
                    z = true;
                    ((cq6) this.u).i();
                    int i332 = ((cq6) this.u).h.c.c;
                    jca.G(ok3.p().e());
                    BrandingConfig brandingConfig2 = ccd.b;
                    rq3 rq3Var32 = null;
                    if (brandingConfig2 != null) {
                    }
                    cq6 cq6Var3 = (cq6) this.u;
                    it = xld.b(cq6Var3.i()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (f3) {
                    }
                    obj2 = null;
                    cq6Var3.s = (OddsCountryProvider) obj2;
                    it7 it7Var2 = un6.b;
                    un6Var = un6.BETTING;
                    it7Var2.getClass();
                    if (it7.x(brandingFantasyCompetition, un6Var, C)) {
                    }
                    List list92 = (List) this.v;
                    ArrayList arrayList62 = new ArrayList(k13.r(list92, 10));
                    it2 = list92.iterator();
                    while (it2.hasNext()) {
                    }
                    return arrayList62;
                }
                if (i31 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                u3 = obj;
                return (List) u3;
            case 23:
                mj7 mj7Var = ((ho7) this.u).a;
                lu3 lu3Var25 = lu3.a;
                int i35 = this.s;
                if (i35 != 0) {
                    if (i35 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                pu6 pu6Var = (pu6) this.t;
                ky6 ky6Var = pu6Var.g;
                int i36 = pu6Var.m().c.c;
                int i37 = mj7Var.a;
                r3 r3Var = new r3((av4) this.v, z10 ? 1 : 0, 11);
                Long l = mj7Var.h;
                long longValue = l != null ? l.longValue() : 0L;
                this.s = 1;
                ky6Var.getClass();
                Object r5 = s9a.r(new jy6(ky6Var, i37, i36, r3Var, longValue, null), this);
                return r5 == lu3Var25 ? lu3Var25 : r5;
            case 24:
                xu6 xu6Var = (xu6) this.t;
                lu3 lu3Var26 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = xu6Var.f;
                    this.s = 1;
                    k = wi7Var.k(this);
                    if (k == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    k = obj;
                }
                String str8 = (String) this.u;
                UserAccount userAccount = (UserAccount) this.v;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj4 : (Iterable) k) {
                    if (f5p.L((FantasyCompetition) obj4, str8, jca.M(userAccount))) {
                        arrayList8.add(obj4);
                    }
                }
                ArrayList arrayList9 = new ArrayList(k13.r(arrayList8, 10));
                Iterator it9 = arrayList8.iterator();
                while (it9.hasNext()) {
                    arrayList9.add(fkf.N((FantasyCompetition) it9.next(), xu6Var.i()));
                }
                return arrayList9;
            case 25:
                return e(obj);
            case 26:
                return f(obj);
            case 27:
                return g(obj);
            case 28:
                return h(obj);
            default:
                Function1 function1 = (Function1) this.t;
                lu3 lu3Var27 = lu3.a;
                int i39 = this.s;
                try {
                    if (i39 == 0) {
                        y6a.M(obj);
                        function1.invoke(Boolean.TRUE);
                        ia0 ia0Var2 = ia0.q;
                        y65 y65Var = ok3.p().o;
                        if (y65Var == null) {
                            Intrinsics.i("fantasyEntryPointCoordinator");
                            throw null;
                        }
                        lx6 lx6Var = (lx6) y65Var.get();
                        Integer num = (Integer) this.u;
                        this.s = 1;
                        a = lx6Var.a(num, this);
                        if (a == lu3Var27) {
                            return lu3Var27;
                        }
                    } else {
                        if (i39 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        a = obj;
                    }
                    ((ix6) a).a((FragmentActivity) this.v);
                    function1.invoke(Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th3) {
                    function1.invoke(Boolean.FALSE);
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh4(d50 d50Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = d50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh4(r77 r77Var, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 28;
        this.v = r77Var;
        this.u = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh4(b1d b1dVar, AbstractFragment abstractFragment, rq3 rq3Var, AbstractFragment abstractFragment2, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b1dVar;
        this.u = abstractFragment;
        this.v = abstractFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh4(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh4(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh4(q8 q8Var, Event event, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = q8Var;
        this.v = event;
        this.u = str;
    }
}
