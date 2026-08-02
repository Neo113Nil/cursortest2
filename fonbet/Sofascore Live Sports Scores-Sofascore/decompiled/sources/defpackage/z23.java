package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.widget.ImageView;
import com.sofascore.model.Sports;
import com.sofascore.model.TvType;
import com.sofascore.model.database.DbFeedPostFeedback;
import com.sofascore.model.database.DbSavedSearches;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeague;
import com.sofascore.model.fantasy.FantasyLeagueResponse;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.StageOddsResponse;
import com.sofascore.model.newNetwork.StageSportSeasonsResponse;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.model.newNetwork.topperformance.response.LeagueGoatPlayerInfo;
import com.sofascore.model.newNetwork.topperformance.response.LeagueGoatPlayerVotesResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.model.team.TennisSurfaceType;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.sofascore.results.feed.compose.model.FeedbackType;
import com.sofascore.results.player.PlayerWorker;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z23 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z23(int i, Context context, qug qugVar, koh kohVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 24;
        this.t = i;
        this.u = context;
        this.v = qugVar;
        this.w = kohVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x018e, code lost:
    
        r5 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0192, code lost:
    
        if (r8 == (-1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0195, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ed, code lost:
    
        if (r15 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ac, code lost:
    
        if (r15 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        a38 b;
        SharedPreferences d;
        Object value;
        plj pljVar;
        gv9 W;
        Integer valueOf;
        ku3 ku3Var = (ku3) this.v;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            Context i2 = ((qlj) this.w).i();
            kp5 kp5Var = k6c.h;
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = i2.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            k6c k6cVar = (k6c) CollectionsKt.a0(sharedPreferences.getInt("PREF_FEED_DEFAULT_FILTER", 0), kp5Var);
            if (k6cVar == null) {
                k6cVar = k6c.d;
            }
            b = ((qlj) this.w).g.b(k6cVar);
            Set set = b.a.b;
            qlj qljVar = (qlj) this.w;
            ArrayList arrayList = new ArrayList(k13.r(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(xw3.t(ku3Var, null, new zni(qljVar, ((Number) it.next()).intValue(), rq3Var, 4), 3));
            }
            this.v = ku3Var;
            this.u = b;
            this.s = 1;
            obj = m6k.u(arrayList, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (obj2 instanceof zbd) {
                        arrayList2.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (hashSet.add(((zbd) next).k)) {
                        arrayList3.add(next);
                    }
                }
                fdi fdiVar = ((qlj) this.w).j;
                int i3 = this.t;
                do {
                    value = fdiVar.getValue();
                    pljVar = (plj) value;
                    ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((zbd) it3.next()).n());
                    }
                    W = l6g.W(arrayList4);
                    Iterator it4 = arrayList3.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i4 = -1;
                            break;
                        }
                        Object next2 = it4.next();
                        if (i4 < 0) {
                            b.q();
                            throw null;
                        }
                        if (((zbd) next2).g == i3) {
                            break;
                        }
                        i4++;
                    }
                } while (!fdiVar.k(value, plj.a(pljVar, W, yid.m(valueOf), 8)));
                return Unit.a;
            }
            b = (a38) this.u;
            y6a.M(obj);
        }
        a38 a38Var = b;
        ArrayList W2 = CollectionsKt.W((Iterable) obj);
        qlj qljVar2 = (qlj) this.w;
        ArrayList arrayList5 = new ArrayList(k13.r(W2, 10));
        Iterator it5 = W2.iterator();
        while (it5.hasNext()) {
            arrayList5.add(xw3.t(ku3Var, null, new h4i(qljVar2, (MediaPost) it5.next(), a38Var, rq3Var, 19), 3));
        }
        this.v = null;
        this.u = null;
        this.s = 2;
        obj = m6k.u(arrayList5, this);
    }

    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    private final Object f(Object obj) {
        int i;
        tn3 tn3Var = (tn3) this.w;
        String str = (String) this.u;
        WeeklyChallengeViewModel weeklyChallengeViewModel = (WeeklyChallengeViewModel) this.v;
        fdi fdiVar = weeklyChallengeViewModel.t;
        LinkedHashSet linkedHashSet = weeklyChallengeViewModel.F;
        lu3 lu3Var = lu3.a;
        int i2 = this.t;
        if (i2 == 0) {
            y6a.M(obj);
            boolean z = str == null || linkedHashSet.contains(str);
            ?? r6 = (z || !tn3Var.b) ? 0 : 1;
            if (!z && str != null) {
                linkedHashSet.add(str);
            }
            c4l c4lVar = new c4l(true, r6);
            fdiVar.getClass();
            fdiVar.m(null, c4lVar);
            this.s = r6;
            this.t = 1;
            if (n4o.y(4000L, this) == lu3Var) {
                return lu3Var;
            }
            i = r6;
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.s;
            y6a.M(obj);
        }
        if (i != 0) {
            weeklyChallengeViewModel.v.l(tn3Var.a);
        }
        c4l c4lVar2 = new c4l(false, false);
        fdiVar.getClass();
        fdiVar.m(null, c4lVar2);
        weeklyChallengeViewModel.m();
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (defpackage.v8a.G(r0, r8 - r0.a.h(), r7) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        int i;
        qug qugVar = (qug) this.v;
        lu3 lu3Var = lu3.a;
        int i2 = this.s;
        if (i2 == 0) {
            y6a.M(obj);
            int i3 = this.t;
            if (i3 == 0) {
                return Unit.a;
            }
            wj0 wj0Var = new wj0(sea.y(new bk7((koh) this.w, i3, 6)), 3);
            this.s = 1;
            obj = rd0.y(wj0Var, this);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        x6a x6aVar = (x6a) obj;
        if (hkg.c0((Context) this.u)) {
            i = qugVar.b.h() + (qugVar.e.h() - x6aVar.c);
        } else {
            i = x6aVar.a;
        }
        int c = llf.c(i, 0, qugVar.e.h());
        this.s = 2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                return new z23((z88[]) this.u, this.t, (AtomicInteger) this.v, (g62) obj2, rq3Var, 0);
            case 1:
                return new z23((ksa) this.u, this.t, (IntRange) this.v, (lg2) obj2, rq3Var, 1);
            case 2:
                return new z23((e1d) this.u, this.t, (ksa) this.v, (cdi) obj2, rq3Var, 2);
            case 3:
                return new z23((dz5) this.u, this.t, (TvChannelData) this.v, (o3k) obj2, rq3Var, 3);
            case 4:
                return new z23((lcd) this.u, (LinkedHashMap) this.v, this.t, (Rect) obj2, rq3Var, 4);
            case 5:
                return new z23((dw6) this.u, this.t, (String) this.v, (String) obj2, rq3Var, 5);
            case 6:
                return new z23((wb7) obj2, this.t, rq3Var, 6);
            case 7:
                return new z23((tj7) this.u, this.t, (Integer) this.v, (Integer) obj2, rq3Var, 7);
            case 8:
                return new z23((my7) this.v, (Set) obj2, rq3Var);
            case 9:
                z23 z23Var = new z23(this.t, (du9[]) this.v, (ImageView) obj2, rq3Var);
                z23Var.u = obj;
                return z23Var;
            case 10:
                return new z23((kva) obj2, this.t, rq3Var, 10);
            case 11:
                return new z23((uf8) this.u, (zwa) this.v, (t6e) obj2, this.t, rq3Var, 11);
            case 12:
                z23 z23Var2 = new z23((o4b) this.v, this.t, (Integer) obj2, rq3Var, 12);
                z23Var2.u = obj;
                return z23Var2;
            case 13:
                return new z23((ioc) this.u, this.t, (String) this.v, (Gender) obj2, rq3Var, 13);
            case 14:
                return new z23((OddsCountryProvider) this.u, (umd) this.v, (String) obj2, this.t, rq3Var, 14);
            case 15:
                return new z23((PlayerWorker) this.v, this.t, (asf) obj2, rq3Var, 15);
            case 16:
                return new z23((String) this.u, (bxg) this.v, this.w, this.t, rq3Var, 16);
            case 17:
                return new z23((g1i) obj2, this.t, rq3Var, 17);
            case 18:
                return new z23((g4i) this.u, this.t, (TvChannelData) this.v, (o3k) obj2, rq3Var, 18);
            case 19:
                return new z23((xwi) this.u, (t6e) this.v, this.t, (dvi) obj2, rq3Var, 19);
            case 20:
                return new z23((y0j) this.v, this.t, (String) obj2, rq3Var, 20);
            case 21:
                return new z23((n3j) this.u, this.t, (String) this.v, (Integer) obj2, rq3Var, 21);
            case 22:
                z23 z23Var3 = new z23((qlj) obj2, this.t, rq3Var, 22);
                z23Var3.v = obj;
                return z23Var3;
            case 23:
                return new z23((String) this.u, (WeeklyChallengeViewModel) this.v, (tn3) obj2, rq3Var, 23);
            case 24:
                return new z23(this.t, (Context) this.u, (qug) this.v, (koh) obj2, rq3Var);
            default:
                return new z23((qkl) this.u, (String) this.v, (bcl) obj2, rq3Var, 25);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((z23) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x02b3, code lost:
    
        if (r2 == r1) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (defpackage.td4.y0(r2, r1, r38) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0476, code lost:
    
        if (r0 != r1) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0406, code lost:
    
        if (r2 == r1) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04f4, code lost:
    
        if (defpackage.gz8.T(r38, r2.a, new defpackage.cl(r2, r0, r11, r1)) != r12) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x050d, code lost:
    
        if (r0 == r12) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04b9, code lost:
    
        if (r9 == r12) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r2 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        if (r2.h("WC_26_MY_TEAM_SELECTED_TIMESTAMP", r12, r38) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r2.i("WC_26_MY_TEAM_ALPHA2", r0, r38) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x06dc, code lost:
    
        if (r0 == r1) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06bd, code lost:
    
        if (r3 == r1) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0849, code lost:
    
        if (r3 == r1) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0809, code lost:
    
        if (r2.q(r38, r3) == r1) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0904, code lost:
    
        if (r0 == r3) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0a80, code lost:
    
        if (defpackage.s9a.n(r1, r38) == r2) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0a77, code lost:
    
        if (defpackage.n4o.y(184, r38) == r2) goto L499;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x097d A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r11v16, types: [gv9] */
    /* JADX WARN: Type inference failed for: r20v1, types: [gv9] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        FantasyLeague league;
        Object value;
        Object e;
        ev6 ev6Var;
        ev6 ev6Var2;
        mj7 mj7Var;
        Object b;
        ev6 ev6Var3;
        mj7 mj7Var2;
        ?? r20;
        Object value2;
        int i;
        Object r;
        Object P;
        LeagueGoatPlayerVotesResponse leagueGoatPlayerVotesResponse;
        Object b2;
        String C;
        Object P2;
        List<Event> list;
        Object P3;
        List<RankingRow> list2;
        Object d2;
        Object i2;
        Player player;
        Player player2;
        Object y;
        Object T;
        lu3 lu3Var;
        Object Q;
        List<StageSeason> seasons;
        UniqueStage uniqueStage;
        OddsCountryProvider oddsCountryProvider;
        Boolean bool;
        Object r2;
        List<StageSeason> list3;
        StageSeason stageSeason;
        StageSeason stageSeason2;
        StageOddsResponse stageOddsResponse;
        List<ProviderOdds> markets;
        int i3;
        Iterator it;
        Object P4;
        Object obj2;
        List<Event> events;
        Object v;
        y0j y0jVar;
        Object s;
        List<Season> seasons2;
        Season season;
        UniqueTournament uniqueTournament;
        int intValue;
        Object A;
        int i4 = this.r;
        int i5 = 21;
        int i6 = -1;
        int i7 = 2;
        Object obj3 = this.w;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        rq3 rq3Var = null;
        UniqueTournamentSeasons uniqueTournamentSeasons = null;
        r11 = null;
        Integer num = null;
        switch (i4) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.v;
                g62 g62Var = (g62) obj3;
                lu3 lu3Var2 = lu3.a;
                int i8 = this.s;
                try {
                    if (i8 == 0) {
                        y6a.M(obj);
                        z88[] z88VarArr = (z88[]) this.u;
                        int i9 = this.t;
                        z88 z88Var = z88VarArr[i9];
                        os2 os2Var = new os2(g62Var, i9, 1);
                        this.s = 1;
                        if (z88Var.collect(os2Var, this) == lu3Var2) {
                            return lu3Var2;
                        }
                    } else {
                        if (i8 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        g62Var.r(null);
                    }
                    return Unit.a;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        g62Var.r(null);
                    }
                }
            case 1:
                lu3 lu3Var3 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    ksa ksaVar = (ksa) this.u;
                    int i11 = (((this.t - ((IntRange) this.v).a) * 12) + ((lg2) obj3).b) - 1;
                    this.s = 1;
                    if (ksa.l(i11, this, ksaVar) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var4 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    if (((Boolean) ((e1d) this.u).getValue()).booleanValue()) {
                        int i13 = this.t;
                        int i14 = vh.f;
                        if (i13 == ((Number) ((cdi) obj3).getValue()).intValue()) {
                            ksa ksaVar2 = (ksa) this.v;
                            int h = ksaVar2.h();
                            this.s = 1;
                            if (ksaVar2.f(h, 1, this) == lu3Var4) {
                                return lu3Var4;
                            }
                        }
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var5 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    dz5 dz5Var = (dz5) this.u;
                    TvType.Companion companion = TvType.INSTANCE;
                    this.s = 1;
                    if (dz5Var.h.Z(this.t, (TvChannelData) this.v, (o3k) obj3, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                Rect rect = (Rect) obj3;
                int i16 = this.t;
                lcd lcdVar = (lcd) this.u;
                lu3 lu3Var6 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    lcdVar.getObstructingViewCache$render_release().clear();
                    lcdVar.getObstructingViewCache$render_release().putAll((LinkedHashMap) this.v);
                    if (i16 != lcdVar.getExposure() || !Intrinsics.c(rect, lcdVar.getVisibleRect())) {
                        lcdVar.setExposure$render_release(i16);
                        Rect visibleRect = lcdVar.getVisibleRect();
                        visibleRect.set(rect);
                        visibleRect.offset(lcdVar.getOffset$render_release().x, lcdVar.getOffset$render_release().y);
                        of ofVar = lcdVar.d;
                        if (ofVar != null) {
                            ofVar.d(lcdVar.getExposure(), lcdVar.getVisibleRect());
                        }
                    }
                    lcdVar.setLastReportTime$render_release(System.currentTimeMillis());
                    if (!lcdVar.getNeedsExposureUpdate$render_release()) {
                        lcdVar.setExposureScheduled$render_release(false);
                        return Unit.a;
                    }
                    this.s = 1;
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    this.s = 2;
                    break;
                }
                break;
            case 5:
                lu3 lu3Var7 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    d = ((dw6) this.u).c.d(this.t, (String) this.v, (String) obj3, this);
                    if (d == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d = obj;
                }
                FantasyLeagueResponse fantasyLeagueResponse = (FantasyLeagueResponse) d;
                if (fantasyLeagueResponse == null || (league = fantasyLeagueResponse.getLeague()) == null) {
                    return null;
                }
                return iz8.w(league);
            case 6:
                int i19 = this.t;
                wb7 wb7Var = (wb7) obj3;
                fdi fdiVar = wb7Var.j;
                lu3 lu3Var8 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    do {
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, pb7.a((pb7) value, uj7.a, null, 0, 0, new Integer(i19), null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, null, 8388590)));
                    wi7 wi7Var = wb7Var.f;
                    this.s = 1;
                    e = wi7Var.e(i19, this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mj7Var2 = (mj7) this.v;
                        ev6 ev6Var4 = (ev6) this.u;
                        y6a.M(obj);
                        ev6Var3 = ev6Var4;
                        b = obj;
                        mj7Var = mj7Var2;
                        ev6Var2 = ev6Var3;
                        rq3Var = l6g.W((Iterable) b);
                        r20 = rq3Var;
                        do {
                            value2 = fdiVar.getValue();
                        } while (!fdiVar.k(value2, pb7.a((pb7) value2, (ev6Var2 != null || mj7Var == null) ? uj7.b : uj7.c, null, 0, 0, null, ev6Var2, mj7Var, r20, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, null, 8388382)));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    e = obj;
                }
                FantasyCompetition fantasyCompetition = (FantasyCompetition) e;
                if (fantasyCompetition != null) {
                    int i21 = wb7.o;
                    ev6Var = fkf.N(fantasyCompetition, wb7Var.i());
                } else {
                    ev6Var = null;
                }
                mj7 mj7Var3 = ev6Var != null ? yaa.w() > ev6Var.o ? ev6Var.j : ev6Var.i : null;
                if (Intrinsics.c(ev6Var != null ? Boolean.valueOf(ev6Var.d == FantasyCompetitionType.WEEKLY) : null, Boolean.TRUE)) {
                    if ((mj7Var3 != null ? new Integer(mj7Var3.a) : null) != null) {
                        ky6 ky6Var = wb7Var.g;
                        int i22 = mj7Var3.a;
                        this.u = ev6Var;
                        this.v = mj7Var3;
                        this.s = 2;
                        b = ky6Var.b(i22, this);
                        if (b != lu3Var8) {
                            ev6Var3 = ev6Var;
                            mj7Var2 = mj7Var3;
                            mj7Var = mj7Var2;
                            ev6Var2 = ev6Var3;
                            rq3Var = l6g.W((Iterable) b);
                            r20 = rq3Var;
                            do {
                                value2 = fdiVar.getValue();
                            } while (!fdiVar.k(value2, pb7.a((pb7) value2, (ev6Var2 != null || mj7Var == null) ? uj7.b : uj7.c, null, 0, 0, null, ev6Var2, mj7Var, r20, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, null, 8388382)));
                            return Unit.a;
                        }
                        return lu3Var8;
                    }
                }
                ev6Var2 = ev6Var;
                mj7Var = mj7Var3;
                r20 = rq3Var;
                do {
                    value2 = fdiVar.getValue();
                } while (!fdiVar.k(value2, pb7.a((pb7) value2, (ev6Var2 != null || mj7Var == null) ? uj7.b : uj7.c, null, 0, 0, null, ev6Var2, mj7Var, r20, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, null, 8388382)));
                return Unit.a;
            case 7:
                lu3 lu3Var9 = lu3.a;
                int i23 = this.s;
                if (i23 != 0) {
                    if (i23 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wi7 wi7Var2 = ((tj7) this.u).b;
                int i24 = this.t;
                int intValue2 = ((Integer) this.v).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                this.s = 1;
                Object C2 = wi7Var2.C(i24, intValue2, intValue3, this);
                return C2 == lu3Var9 ? lu3Var9 : C2;
            case 8:
                Set set = (Set) obj3;
                my7 my7Var = (my7) this.v;
                lu3 lu3Var10 = lu3.a;
                int i25 = this.t;
                if (i25 == 0) {
                    y6a.M(obj);
                    g62 g62Var2 = my7Var.i;
                    gy7 gy7Var = new gy7(set);
                    this.t = 1;
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i26 = this.s;
                        my7 my7Var2 = (my7) this.u;
                        y6a.M(obj);
                        i = i26;
                        my7Var = my7Var2;
                        my7Var.f(i, true);
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                my7Var.g.l(rm5.a);
                FeedbackType feedbackType = (FeedbackType) CollectionsKt.Z(set);
                if (feedbackType != null) {
                    i = feedbackType.c;
                    m7c m7cVar = my7Var.b;
                    this.u = my7Var;
                    this.s = i;
                    this.t = 2;
                    dx7 dx7Var = m7cVar.c;
                    Object U = gz8.U(this, dx7Var.a, false, true, new w47(22, dx7Var, new DbFeedPostFeedback(i, System.currentTimeMillis())));
                    Object obj4 = U;
                    if (U != lu3Var10) {
                        obj4 = Unit.a;
                    }
                    if (obj4 != lu3Var10) {
                        obj4 = Unit.a;
                        break;
                    }
                }
                return Unit.a;
            case 9:
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var11 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    int i28 = this.t;
                    du9[] du9VarArr = (du9[]) this.v;
                    du9[] du9VarArr2 = (du9[]) Arrays.copyOf(du9VarArr, du9VarArr.length);
                    this.u = ku3Var;
                    this.s = 1;
                    r = s9a.r(new f54(i28, du9VarArr2, (rq3) null), this);
                    if (r == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                Bitmap bitmap = (Bitmap) r;
                if (s9a.w(ku3Var)) {
                    ((ImageView) obj3).setImageBitmap(bitmap);
                }
                return Unit.a;
            case 10:
                int i29 = this.t;
                kva kvaVar = (kva) obj3;
                lu3 lu3Var12 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    w3b w3bVar = kvaVar.e;
                    this.s = 1;
                    w3bVar.getClass();
                    P = yaa.P(new d0b(i29, 9, rq3Var, w3bVar), this);
                    break;
                } else {
                    if (i30 != 1) {
                        if (i30 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        LeagueGoatPlayerVotesResponse leagueGoatPlayerVotesResponse2 = (LeagueGoatPlayerVotesResponse) this.v;
                        kvaVar = (kva) this.u;
                        y6a.M(obj);
                        leagueGoatPlayerVotesResponse = leagueGoatPlayerVotesResponse2;
                        b2 = obj;
                        int intValue4 = ((Number) b2).intValue();
                        Context i31 = kvaVar.i();
                        leagueGoatPlayerVotesResponse.getClass();
                        Iterator it2 = leagueGoatPlayerVotesResponse.getPlayers().iterator();
                        int i32 = 0;
                        while (it2.hasNext()) {
                            i32 += ((LeagueGoatPlayerInfo) it2.next()).getVoteCount();
                        }
                        if (i32 < 1) {
                            i32 = 1;
                        }
                        List<LeagueGoatPlayerInfo> players = leagueGoatPlayerVotesResponse.getPlayers();
                        ArrayList arrayList = new ArrayList(k13.r(players, 10));
                        for (LeagueGoatPlayerInfo leagueGoatPlayerInfo : players) {
                            int id = leagueGoatPlayerInfo.getPlayer().getId();
                            if (leagueGoatPlayerInfo.getPlayer().getId() == 2521944) {
                                C = i31.getString(R.string.another_legend);
                            } else {
                                C = tba.C(leagueGoatPlayerInfo.getPlayer());
                                if (C == null) {
                                    C = tba.t(leagueGoatPlayerInfo.getPlayer());
                                }
                            }
                            String str = C;
                            str.getClass();
                            arrayList.add(new jrj(id, str, leagueGoatPlayerInfo.getPlayer().getId() == intValue4, (leagueGoatPlayerInfo.getVoteCount() / i32) * 100.0f, leagueGoatPlayerInfo.getSortOrder()));
                        }
                        return new exa(i32, l6g.W(arrayList));
                    }
                    y6a.M(obj);
                    P = obj;
                }
                leagueGoatPlayerVotesResponse = (LeagueGoatPlayerVotesResponse) yaa.x((x2g) P);
                if (leagueGoatPlayerVotesResponse == null) {
                    return null;
                }
                cg4 cg4Var = kvaVar.i;
                String j = ljg.j(i29, "goat_vote_");
                this.u = kvaVar;
                this.v = leagueGoatPlayerVotesResponse;
                this.s = 2;
                b2 = cg4Var.b(-1, j, this);
                break;
            case 11:
                lu3 lu3Var13 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    c64 c64Var = new c64((zwa) this.v, (t6e) obj3, this.t, (rq3) null, 12);
                    this.s = 1;
                    P2 = yaa.P(c64Var, this);
                    if (P2 == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                uf8 uf8Var = (uf8) this.u;
                EventListResponse eventListResponse = (EventListResponse) yaa.x((x2g) P2);
                if (eventListResponse == null || (list = eventListResponse.getEvents()) == null) {
                    list = km5.a;
                }
                uf8Var.invoke(list);
                return Unit.a;
            case 12:
                o4b o4bVar = (o4b) this.v;
                ku3 ku3Var2 = (ku3) this.u;
                lu3 lu3Var14 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    e4b e4bVar = o4bVar.m;
                    if (e4bVar != null) {
                        e4bVar.b();
                    }
                    m4b m4bVar = (m4b) ((vnb) o4bVar.f.a.getValue()).a();
                    String str2 = m4bVar != null ? m4bVar.g : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    o4bVar.n(null, new isa(20));
                    List j2 = b.j(xw3.L(ku3Var2, null, null, new u41(i7, rq3Var, 6), 3), xw3.L(ku3Var2, null, null, new zi7(o4bVar, this.t, (Integer) obj3, str2, (rq3) null), 3));
                    this.u = null;
                    this.s = 1;
                    if (m6k.V(j2, this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                o4bVar.n(null, new isa(21));
                return Unit.a;
            case 13:
                ioc iocVar = (ioc) this.u;
                lu3 lu3Var15 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    pai paiVar = iocVar.e;
                    this.s = 1;
                    paiVar.getClass();
                    P3 = yaa.P(new kai(paiVar, this.t, (String) this.v, (Gender) obj3, null, 0), this);
                    if (P3 == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P3 = obj;
                }
                yzc yzcVar = iocVar.f;
                Ranking ranking = (Ranking) yaa.x((x2g) P3);
                if (ranking == null || (list2 = ranking.getRankingRows()) == null) {
                    list2 = km5.a;
                }
                yzcVar.j(list2);
                return Unit.a;
            case 14:
                lu3 lu3Var16 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) this.u;
                    umd umdVar = (umd) this.v;
                    qmd qmdVar = new qmd(umdVar, this.t, rq3Var, i7);
                    this.s = 1;
                    d2 = umdVar.d(oddsCountryProvider2, (String) obj3, false, qmdVar, this);
                    if (d2 == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i36 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d2 = obj;
                }
                return Boolean.valueOf(Intrinsics.c(d2, Boolean.TRUE));
            case 15:
                int i37 = this.t;
                wve wveVar = ((PlayerWorker) this.v).b;
                lu3 lu3Var17 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    i2 = wveVar.i(i37, this);
                    break;
                } else if (i38 == 1) {
                    y6a.M(obj);
                    i2 = obj;
                } else {
                    if (i38 != 2) {
                        if (i38 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        if (i38 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        Unit unit = Unit.a;
                        return Unit.a;
                    }
                    player2 = (Player) this.u;
                    y6a.M(obj);
                    this.u = null;
                    this.s = 3;
                    aoe aoeVar = wveVar.a;
                    break;
                }
                PlayerDetailsResponse playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) i2);
                if (playerDetailsResponse == null || (player = playerDetailsResponse.getPlayer()) == null) {
                    return Unit.a;
                }
                if (player.getId() == i37) {
                    this.u = null;
                    this.s = 4;
                    aoe aoeVar2 = wveVar.a;
                    Object U2 = gz8.U(this, aoeVar2.a, false, true, new xne(aoeVar2, player, z2 ? 1 : 0));
                    if (U2 != lu3Var17) {
                        U2 = Unit.a;
                        break;
                    }
                } else {
                    ((asf) obj3).a = true;
                    this.u = player;
                    this.s = 2;
                    if (wveVar.q(i37, this) != lu3Var17) {
                        player2 = player;
                        this.u = null;
                        this.s = 3;
                        aoe aoeVar3 = wveVar.a;
                    }
                }
                return lu3Var17;
            case 16:
                String str3 = (String) this.u;
                bxg bxgVar = (bxg) this.v;
                lu3 lu3Var18 = lu3.a;
                int i39 = this.s;
                if (i39 == 0) {
                    y6a.M(obj);
                    if (str3.equals("event")) {
                        yf4 yf4Var = bxgVar.i;
                        this.s = 1;
                        y = rd0.y(yf4Var, this);
                        break;
                    }
                    uwg uwgVar = bxgVar.e;
                    int i40 = this.t;
                    this.s = 2;
                    DbSavedSearches dbSavedSearches = new DbSavedSearches(i40, str3, uwgVar.f(obj3), System.currentTimeMillis() / 1000);
                    gwg gwgVar = uwgVar.b;
                    T = gz8.T(this, gwgVar.a, new as2(gwgVar, str3, dbSavedSearches, num, null, 5));
                    lu3Var = lu3.a;
                    if (T != lu3Var) {
                        T = Unit.a;
                    }
                    if (T != lu3Var) {
                        T = Unit.a;
                        break;
                    }
                } else {
                    if (i39 != 1) {
                        if (i39 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    y = obj;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : (Iterable) y) {
                    if (obj5 instanceof Event) {
                        arrayList2.add(obj5);
                    }
                }
                if (arrayList2.size() + 1 > 5) {
                    num = new Integer(((Event) CollectionsKt.h0(arrayList2)).getId());
                }
                uwg uwgVar2 = bxgVar.e;
                int i402 = this.t;
                this.s = 2;
                DbSavedSearches dbSavedSearches2 = new DbSavedSearches(i402, str3, uwgVar2.f(obj3), System.currentTimeMillis() / 1000);
                gwg gwgVar2 = uwgVar2.b;
                T = gz8.T(this, gwgVar2.a, new as2(gwgVar2, str3, dbSavedSearches2, num, null, 5));
                lu3Var = lu3.a;
                if (T != lu3Var) {
                }
                if (T != lu3Var) {
                }
                break;
            case 17:
                g1i g1iVar = (g1i) obj3;
                amd amdVar = g1iVar.g;
                lu3 lu3Var19 = lu3.a;
                int i41 = this.s;
                boolean z4 = false;
                if (i41 == 0) {
                    y6a.M(obj);
                    s96 s96Var = g1iVar.e;
                    int i42 = this.t;
                    this.s = 1;
                    Q = s96Var.Q(i42, this);
                    break;
                } else {
                    if (i41 != 1) {
                        if (i41 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        UniqueStage uniqueStage2 = (UniqueStage) this.v;
                        list3 = (List) this.u;
                        y6a.M(obj);
                        uniqueStage = uniqueStage2;
                        r2 = obj;
                        stageOddsResponse = (StageOddsResponse) r2;
                        if (stageOddsResponse != null && (markets = stageOddsResponse.getMarkets()) != null) {
                            i3 = ke0.c;
                            if ((!zu3.V.hasMcc(Integer.valueOf(i3)) || zu3.d0.hasMcc(Integer.valueOf(i3)) || zu3.z.hasMcc(Integer.valueOf(i3))) && !markets.isEmpty()) {
                                it = markets.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((ProviderOdds) it.next()).isLive()) {
                                            markets = null;
                                        }
                                    }
                                }
                            }
                            if (markets != null) {
                                bool = Boolean.valueOf(!markets.isEmpty());
                                seasons = list3;
                                boolean c = Intrinsics.c(bool, Boolean.TRUE);
                                g1iVar.l.j(uniqueStage);
                                yzc yzcVar2 = g1iVar.h;
                                if (seasons == null) {
                                    seasons = km5.a;
                                }
                                yzcVar2.j(new f1i(!Intrinsics.c(uniqueStage != null ? uniqueStage.getSportSlug() : null, Sports.CYCLING), c, seasons));
                                return Unit.a;
                            }
                        }
                        bool = null;
                        seasons = list3;
                        boolean c2 = Intrinsics.c(bool, Boolean.TRUE);
                        g1iVar.l.j(uniqueStage);
                        yzc yzcVar22 = g1iVar.h;
                        if (seasons == null) {
                        }
                        yzcVar22.j(new f1i(!Intrinsics.c(uniqueStage != null ? uniqueStage.getSportSlug() : null, Sports.CYCLING), c2, seasons));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    Q = obj;
                }
                StageSportSeasonsResponse stageSportSeasonsResponse = (StageSportSeasonsResponse) Q;
                seasons = stageSportSeasonsResponse != null ? stageSportSeasonsResponse.getSeasons() : null;
                uniqueStage = (seasons == null || (stageSeason2 = (StageSeason) CollectionsKt.firstOrNull(seasons)) == null) ? null : stageSeason2.getUniqueStage();
                OddsCountryProvider oddsCountryProvider3 = (OddsCountryProvider) CollectionsKt.firstOrNull(amdVar.c());
                if (oddsCountryProvider3 != null) {
                    Context i43 = g1iVar.i();
                    amdVar.getClass();
                    yea yeaVar = j58.a;
                    if (fn0.B("show_motorsport_odds") && xld.g(i43) && rld.t(i43) && amdVar.c().size() == 1) {
                        oddsCountryProvider = oddsCountryProvider3;
                        Integer num2 = (seasons != null || (stageSeason = (StageSeason) CollectionsKt.firstOrNull(seasons)) == null) ? null : new Integer(stageSeason.getId());
                        if (oddsCountryProvider != null || num2 == null) {
                            bool = null;
                            boolean c22 = Intrinsics.c(bool, Boolean.TRUE);
                            g1iVar.l.j(uniqueStage);
                            yzc yzcVar222 = g1iVar.h;
                            if (seasons == null) {
                            }
                            yzcVar222.j(new f1i(!Intrinsics.c(uniqueStage != null ? uniqueStage.getSportSlug() : null, Sports.CYCLING), c22, seasons));
                            return Unit.a;
                        }
                        int intValue5 = num2.intValue();
                        umd umdVar2 = g1iVar.f;
                        this.u = seasons;
                        this.v = uniqueStage;
                        this.s = 2;
                        umdVar2.getClass();
                        r2 = s9a.r(new mmd(umdVar2, oddsCountryProvider, intValue5, z4 ? 1 : 0, 1), this);
                        if (r2 != lu3Var19) {
                            list3 = seasons;
                            stageOddsResponse = (StageOddsResponse) r2;
                            if (stageOddsResponse != null) {
                                i3 = ke0.c;
                                if (!zu3.V.hasMcc(Integer.valueOf(i3))) {
                                }
                                it = markets.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                if (markets != null) {
                                }
                            }
                            bool = null;
                            seasons = list3;
                            boolean c222 = Intrinsics.c(bool, Boolean.TRUE);
                            g1iVar.l.j(uniqueStage);
                            yzc yzcVar2222 = g1iVar.h;
                            if (seasons == null) {
                            }
                            yzcVar2222.j(new f1i(!Intrinsics.c(uniqueStage != null ? uniqueStage.getSportSlug() : null, Sports.CYCLING), c222, seasons));
                            return Unit.a;
                        }
                        return lu3Var19;
                    }
                }
                oddsCountryProvider = null;
                if (seasons != null) {
                }
                if (oddsCountryProvider != null) {
                }
                bool = null;
                boolean c2222 = Intrinsics.c(bool, Boolean.TRUE);
                g1iVar.l.j(uniqueStage);
                yzc yzcVar22222 = g1iVar.h;
                if (seasons == null) {
                }
                yzcVar22222.j(new f1i(!Intrinsics.c(uniqueStage != null ? uniqueStage.getSportSlug() : null, Sports.CYCLING), c2222, seasons));
                return Unit.a;
            case 18:
                lu3 lu3Var20 = lu3.a;
                int i44 = this.s;
                if (i44 == 0) {
                    y6a.M(obj);
                    g4i g4iVar = (g4i) this.u;
                    TvType.Companion companion2 = TvType.INSTANCE;
                    this.s = 1;
                    if (g4iVar.e.Z(this.t, (TvChannelData) this.v, (o3k) obj3, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i44 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                xwi xwiVar = (xwi) this.u;
                lu3 lu3Var21 = lu3.a;
                int i45 = this.s;
                if (i45 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = xwiVar.e;
                    int id2 = xwiVar.g.getId();
                    yyi yyiVar = xwiVar.r;
                    String t6eVar = ((t6e) this.v).toString();
                    int i46 = this.t;
                    UniqueTournament uniqueTournament2 = (UniqueTournament) ((eoh) xwiVar.q).getValue();
                    Integer num3 = uniqueTournament2 != null ? new Integer(uniqueTournament2.getId()) : null;
                    this.s = 1;
                    j0jVar.getClass();
                    P4 = yaa.P(new jzi(yyiVar, j0jVar, id2, t6eVar, i46, num3, null), this);
                    if (P4 == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i45 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P4 = obj;
                }
                dvi dviVar = (dvi) obj3;
                EventListResponse eventListResponse2 = (EventListResponse) yaa.x((x2g) P4);
                if (eventListResponse2 == null || (events = eventListResponse2.getEvents()) == null || (obj2 = CollectionsKt.B0(events)) == null) {
                    obj2 = km5.a;
                }
                dviVar.invoke(obj2);
                return Unit.a;
            case 20:
                y0j y0jVar2 = (y0j) this.v;
                lu3 lu3Var22 = lu3.a;
                int i47 = this.s;
                if (i47 == 0) {
                    y6a.M(obj);
                    this.u = y0jVar2;
                    this.s = 1;
                    v = y0jVar2.e.v(this.t, (String) obj3, this);
                    if (v == lu3Var22) {
                        return lu3Var22;
                    }
                    y0jVar = y0jVar2;
                } else {
                    if (i47 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y0jVar = (y0j) this.u;
                    y6a.M(obj);
                    v = obj;
                }
                y0jVar.m = (Map) v;
                y0jVar2.k.j(TennisSurfaceType.getEntries());
                return Unit.a;
            case 21:
                int i48 = this.t;
                n3j n3jVar = (n3j) this.u;
                lu3 lu3Var23 = lu3.a;
                int i49 = this.s;
                if (i49 == 0) {
                    y6a.M(obj);
                    j0j j0jVar2 = n3jVar.n;
                    this.s = 1;
                    s = j0jVar2.s(i48, this);
                    if (s == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i49 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    s = obj;
                }
                StatisticsSeasonsResponse statisticsSeasonsResponse = (StatisticsSeasonsResponse) s;
                if (statisticsSeasonsResponse != null) {
                    String str4 = (String) this.v;
                    Integer num4 = (Integer) obj3;
                    n3jVar.o = statisticsSeasonsResponse;
                    Iterator it3 = statisticsSeasonsResponse.getUniqueTournamentSeasons().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            ?? next = it3.next();
                            int id3 = ((UniqueTournamentSeasons) next).getUniqueTournament().getId();
                            if (num4 != null && id3 == num4.intValue()) {
                                uniqueTournamentSeasons = next;
                            }
                        }
                    }
                    UniqueTournamentSeasons uniqueTournamentSeasons2 = uniqueTournamentSeasons;
                    if (uniqueTournamentSeasons2 == null) {
                        uniqueTournamentSeasons2 = (UniqueTournamentSeasons) CollectionsKt.firstOrNull(statisticsSeasonsResponse.getUniqueTournamentSeasons());
                    }
                    if (uniqueTournamentSeasons2 != null && (uniqueTournament = uniqueTournamentSeasons2.getUniqueTournament()) != null) {
                        i6 = uniqueTournament.getId();
                    }
                    rnj rnjVar = new rnj(i6, (uniqueTournamentSeasons2 == null || (seasons2 = uniqueTournamentSeasons2.getSeasons()) == null || (season = (Season) CollectionsKt.firstOrNull(seasons2)) == null) ? -2 : season.getId(), new Integer(i48), str4, null);
                    boj bojVar = boj.PLAYERS;
                    n3jVar.C(rnjVar, a.c(bojVar), bojVar);
                }
                return Unit.a;
            case 22:
                return e(obj);
            case 23:
                return f(obj);
            case 24:
                return g(obj);
            default:
                String str5 = (String) this.v;
                qkl qklVar = (qkl) this.u;
                cg4 cg4Var2 = qklVar.q;
                lu3 lu3Var24 = lu3.a;
                int i50 = this.t;
                if (i50 == 0) {
                    y6a.M(obj);
                    this.t = 1;
                    break;
                } else if (i50 == 1) {
                    y6a.M(obj);
                } else if (i50 == 2) {
                    y6a.M(obj);
                    xw3.L(un0.z(qklVar), null, null, new lkl(qklVar, z, rq3Var, z3 ? 1 : 0), 3);
                    vel velVar = vel.a;
                    Integer b3 = vel.b(str5);
                    if (b3 == null) {
                        return Unit.a;
                    }
                    intValue = b3.intValue();
                    nb8 b4 = qklVar.o.b(intValue);
                    this.s = intValue;
                    this.t = 3;
                    A = rd0.A(b4, this);
                    break;
                } else {
                    if (i50 != 3) {
                        if (i50 == 4) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    intValue = this.s;
                    y6a.M(obj);
                    A = obj;
                    DbMyTeam dbMyTeam = (DbMyTeam) A;
                    if (dbMyTeam == null || !dbMyTeam.getNotificationsEnabled()) {
                        v7a.h(intValue, qklVar.i());
                        nv.y(qklVar.i(), vu.ADD_NOTIFICATION, xu.TEAM, intValue, wu.OTHER);
                        ((bcl) obj3).invoke(new Integer(intValue));
                    }
                    auh auhVar = new auh(1);
                    Context applicationContext = qklVar.i().getApplicationContext();
                    applicationContext.getClass();
                    this.s = intValue;
                    this.t = 4;
                    break;
                }
                long v2 = yaa.v();
                this.t = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z23(int i, du9[] du9VarArr, ImageView imageView, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 9;
        this.t = i;
        this.v = du9VarArr;
        this.w = imageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(q8 q8Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.w = q8Var;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z23(my7 my7Var, Set set, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 8;
        this.v = my7Var;
        this.w = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(Object obj, int i, Serializable serializable, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.v = obj;
        this.t = i;
        this.w = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(Object obj, int i, Object obj2, Object obj3, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = obj;
        this.t = i;
        this.v = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(Object obj, Serializable serializable, int i, Object obj2, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = obj;
        this.v = serializable;
        this.t = i;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(Object obj, Object obj2, Object obj3, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }
}
