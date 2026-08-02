package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.widget.RelativeLayout;
import com.ironsource.C4094gc;
import com.ironsource.C4427z5;
import com.sofascore.model.database.DbSportOrder;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.CountrySport;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.EventsByMonthResponse;
import com.sofascore.model.newNetwork.PlayerDetailsResponse;
import com.sofascore.model.newNetwork.StageOddsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.helper.SofaBackupAgent;
import com.sofascore.results.league.fragment.details.PopularPlayersModal;
import com.sofascore.results.player.PlayerWorker;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.stagesport.fragments.category.StageCategoryRacesFragment;
import com.sofascore.results.team.TeamWorker;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cce extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce(u6b u6bVar, b1d b1dVar, StageCategoryRacesFragment stageCategoryRacesFragment, rq3 rq3Var, StageCategoryRacesFragment stageCategoryRacesFragment2) {
        super(2, rq3Var);
        this.r = 19;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = stageCategoryRacesFragment;
        this.w = stageCategoryRacesFragment2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x003a, code lost:
    
        if (r2 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f1 A[LOOP:0: B:7:0x00eb->B:9:0x00f1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        Object a;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        fdi fdiVar;
        Object value;
        vnb vnbVar;
        SharedPreferences d;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Throwable th = null;
        if (i == 0) {
            y6a.M(obj);
            gzh gzhVar = ((a0i) this.v).l;
            this.s = 1;
            a = gzhVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList2 = (ArrayList) this.u;
                arrayList = (ArrayList) this.t;
                y6a.M(obj);
                arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((hzh) it.next()).a.getSportSlug());
                }
                if (!arrayList3.equals(arrayList)) {
                    Context i2 = ((a0i) this.v).i();
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
                    SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "UserHasCustomizedSportOrder", true);
                    Unit unit = Unit.a;
                    i3.apply();
                }
                Map map = SofaBackupAgent.b;
                aik.h0();
                fdiVar = ((a0i) this.v).e;
                do {
                    value = fdiVar.getValue();
                    vnbVar = (vnb) value;
                    vnbVar.getClass();
                    if (vnbVar instanceof unb) {
                        vnbVar = new unb(p2h.a((p2h) ((unb) vnbVar).a, false));
                    }
                } while (!fdiVar.k(value, vnbVar));
                return Unit.a;
            }
            y6a.M(obj);
            a = obj;
        }
        Iterable iterable = (List) a;
        if (iterable == null) {
            iterable = km5.a;
        }
        ArrayList arrayList4 = new ArrayList(k13.r(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((CountrySport) it2.next()).getSport().getSlug());
        }
        List list = ((l2h) this.w).a;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list) {
            if (((hzh) obj2).a instanceof lzh) {
                arrayList5.add(obj2);
            }
        }
        gzh gzhVar2 = ((a0i) this.v).l;
        ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                Throwable th2 = th;
                b.q();
                throw th2;
            }
            hzh hzhVar = (hzh) next;
            arrayList6.add(new DbSportOrder(hzhVar.a.getSportSlug(), i4, hzhVar.b));
            i4 = i5;
            th = th;
        }
        this.t = arrayList4;
        this.u = arrayList5;
        this.s = 2;
        if (gzhVar2.c(arrayList6, this) != lu3Var) {
            arrayList = arrayList4;
            arrayList2 = arrayList5;
            arrayList3 = new ArrayList(k13.r(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
            }
            if (!arrayList3.equals(arrayList)) {
            }
            Map map2 = SofaBackupAgent.b;
            aik.h0();
            fdiVar = ((a0i) this.v).e;
            do {
                value = fdiVar.getValue();
                vnbVar = (vnb) value;
                vnbVar.getClass();
                if (vnbVar instanceof unb) {
                }
            } while (!fdiVar.k(value, vnbVar));
            return Unit.a;
        }
        return lu3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    private final Object f(Object obj) {
        j6i j6iVar;
        List<ProviderOdds> markets;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        ?? r6 = 0;
        r6 = 0;
        r6 = 0;
        if (i == 0) {
            y6a.M(obj);
            j6i j6iVar2 = (j6i) this.u;
            umd umdVar = j6iVar2.e;
            Stage stage = (Stage) this.v;
            OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) this.w;
            this.t = j6iVar2;
            this.s = 1;
            umdVar.getClass();
            Object r = s9a.r(new pmd(umdVar, oddsCountryProvider, stage, r6, 0), this);
            if (r == lu3Var) {
                return lu3Var;
            }
            obj = r;
            j6iVar = j6iVar2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j6iVar = (j6i) this.t;
            y6a.M(obj);
        }
        StageOddsResponse stageOddsResponse = (StageOddsResponse) obj;
        if (stageOddsResponse != null && (markets = stageOddsResponse.getMarkets()) != null) {
            if (!markets.isEmpty()) {
                Iterator it = markets.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((ProviderOdds) it.next()).isLive()) {
                        int i2 = ke0.c;
                        if (zu3.V.hasMcc(Integer.valueOf(i2)) || zu3.d0.hasMcc(Integer.valueOf(i2)) || zu3.z.hasMcc(Integer.valueOf(i2))) {
                            markets = null;
                        }
                    }
                }
            }
            if (markets != null) {
                r6 = ug5.A(markets);
            }
        }
        j6iVar.i = r6;
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        if (r3 == r2) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        Object A;
        Team team;
        fsf fsfVar;
        Object k;
        fsf fsfVar2;
        Team team2;
        nui nuiVar = (nui) this.w;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            hof hofVar = nuiVar.z;
            this.s = 1;
            A = rd0.A(hofVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fsfVar2 = (fsf) this.v;
                fsf fsfVar3 = (fsf) this.u;
                Team team3 = (Team) this.t;
                y6a.M(obj);
                fsfVar = fsfVar3;
                team = team3;
                k = obj;
                TeamDetailsResponse teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) k);
                fsfVar2.a = teamDetailsResponse == null ? teamDetailsResponse.getTeam() : null;
                if (fsfVar.a != null && team != null && team.getUserCount() > ((Team) fsfVar.a).getUserCount()) {
                    fsfVar.a = Team.copy$default((Team) fsfVar.a, 0, null, null, team.getUserCount(), 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 63, null);
                }
                Object obj2 = fsfVar.a;
                team2 = (Team) obj2;
                if (team2 != null) {
                    return null;
                }
                nuiVar.j.k(obj2);
                return team2;
            }
            y6a.M(obj);
            A = obj;
        }
        team = (Team) A;
        fsfVar = new fsf();
        j0j j0jVar = nuiVar.e;
        int i2 = nuiVar.i;
        this.t = team;
        this.u = fsfVar;
        this.v = fsfVar;
        this.s = 2;
        k = j0jVar.k(i2, this);
        if (k != lu3Var) {
            fsfVar2 = fsfVar;
            TeamDetailsResponse teamDetailsResponse2 = (TeamDetailsResponse) yaa.x((x2g) k);
            fsfVar2.a = teamDetailsResponse2 == null ? teamDetailsResponse2.getTeam() : null;
            if (fsfVar.a != null) {
                fsfVar.a = Team.copy$default((Team) fsfVar.a, 0, null, null, team.getUserCount(), 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, 63, null);
            }
            Object obj22 = fsfVar.a;
            team2 = (Team) obj22;
            if (team2 != null) {
            }
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (r1.k(r2, r22) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0190, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018e, code lost:
    
        if (r13.Z(r22) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0077, code lost:
    
        if (r4 == r12) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(Object obj) {
        g9i L;
        Object l;
        g9i g9iVar;
        lwi lwiVar;
        Object value;
        lwi lwiVar2;
        YearMonth yearMonth = (YearMonth) this.w;
        xwi xwiVar = (xwi) this.v;
        Team team = xwiVar.g;
        fdi fdiVar = xwiVar.o;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 2;
        int i3 = 1;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            L = xw3.L(ku3Var, null, null, new u41(i2, rq3Var, 15), 3);
            j0j j0jVar = xwiVar.e;
            int id = team.getId();
            LocalDate atDay = yearMonth.atDay(1);
            atDay.getClass();
            bi4 bi4Var = bi4.PATTERN_NETWORK_MY;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            String format = atDay.format(hk4.a(bi4Var.d()));
            format.getClass();
            this.t = null;
            this.u = L;
            this.s = 1;
            l = j0jVar.l(id, format, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                lwiVar = null;
                do {
                    value = fdiVar.getValue();
                    lwi lwiVar3 = (lwi) value;
                    if (lwiVar3 != null) {
                        YearMonth yearMonth2 = lwiVar3.a;
                        String str = lwiVar3.b;
                        gv9 gv9Var = lwiVar3.c;
                        gv9 gv9Var2 = lwiVar3.d;
                        YearMonth yearMonth3 = lwiVar3.f;
                        YearMonth yearMonth4 = lwiVar3.g;
                        yearMonth2.getClass();
                        gv9Var.getClass();
                        gv9Var2.getClass();
                        lwiVar2 = new lwi(yearMonth2, str, gv9Var, gv9Var2, false, yearMonth3, yearMonth4);
                    } else {
                        lwiVar2 = lwiVar;
                    }
                } while (!fdiVar.k(value, lwiVar2));
                return Unit.a;
            }
            L = (g9i) this.u;
            y6a.M(obj);
            l = obj;
        }
        g9i g9iVar2 = L;
        EventsByMonthResponse eventsByMonthResponse = (EventsByMonthResponse) l;
        if (eventsByMonthResponse != null) {
            yearMonth.getClass();
            LocalDate o = vxd.o(Instant.ofEpochSecond(eventsByMonthResponse.getFirstEventTimestamp()));
            YearMonth of = YearMonth.of(o.getYear(), o.getMonth());
            of.getClass();
            LocalDate o2 = vxd.o(Instant.ofEpochSecond(eventsByMonthResponse.getLastEventTimestamp()));
            YearMonth of2 = YearMonth.of(o2.getYear(), o2.getMonth());
            of2.getClass();
            YearMonth yearMonth5 = (YearMonth) llf.g(yearMonth, of, of2);
            if (Intrinsics.c(yearMonth5, yearMonth)) {
                while (true) {
                    Object value2 = fdiVar.getValue();
                    Context i4 = xwiVar.i();
                    int id2 = team.getId();
                    String sportSlug = team.getSportSlug();
                    lwi lwiVar4 = (lwi) fdiVar.getValue();
                    int i5 = lwiVar4 != null ? lwiVar4.e ? 1 : 0 : i3;
                    int p = ug5.p(i4);
                    LocalDate o3 = vxd.o(Instant.ofEpochSecond(eventsByMonthResponse.getFirstEventTimestamp()));
                    YearMonth of3 = YearMonth.of(o3.getYear(), o3.getMonth());
                    of3.getClass();
                    LocalDate o4 = vxd.o(Instant.ofEpochSecond(eventsByMonthResponse.getLastEventTimestamp()));
                    YearMonth of4 = YearMonth.of(o4.getYear(), o4.getMonth());
                    of4.getClass();
                    LocalDate atDay2 = yearMonth.atDay(i3);
                    atDay2.getClass();
                    bi4 bi4Var2 = bi4.PATTERN_MMMMY;
                    ConcurrentHashMap concurrentHashMap2 = hk4.a;
                    String format2 = atDay2.format(hk4.a(bi4Var2.d()));
                    format2.getClass();
                    g9iVar = g9iVar2;
                    if (fdiVar.k(value2, new lwi(yearMonth, format2, l6g.W(tba.l(p)), l6g.W(tba.k(i4, yearMonth, p, eventsByMonthResponse.getEvents(), id2, sportSlug)), i5, of3, of4))) {
                        break;
                    }
                    g9iVar2 = g9iVar;
                    i3 = 1;
                }
                lwiVar = null;
            } else {
                g9iVar2.e(null);
                this.t = null;
                this.u = null;
                this.s = 2;
            }
        } else {
            g9iVar = g9iVar2;
            lwiVar = null;
        }
        this.t = lwiVar;
        this.u = lwiVar;
        this.s = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r10 == r2) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        av4 t;
        x2g x2gVar;
        x2g x2gVar2;
        xwi xwiVar = (xwi) this.w;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 2;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            av4 t2 = xw3.t(ku3Var, null, new wwi(xwiVar, rq3Var, i2), 3);
            t = xw3.t(ku3Var, null, new wwi(xwiVar, rq3Var, 3), 3);
            this.t = null;
            this.u = t;
            this.s = 1;
            obj = t2.w(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x2gVar = (x2g) this.v;
                y6a.M(obj);
                x2gVar2 = (x2g) obj;
                yzc yzcVar = xwiVar.k;
                xbb b = a.b();
                if (x2gVar instanceof v2g) {
                    b.addAll(((EventListResponse) ((v2g) x2gVar).a).getEvents());
                }
                if (x2gVar2 instanceof v2g) {
                    b.addAll(((EventListResponse) ((v2g) x2gVar2).a).getEvents());
                }
                yzcVar.j(CollectionsKt.B0(a.a(b)));
                return Unit.a;
            }
            t = (av4) this.u;
            y6a.M(obj);
        }
        x2g x2gVar3 = (x2g) obj;
        this.t = null;
        this.u = null;
        this.v = x2gVar3;
        this.s = 2;
        Object T = t.T(this);
        if (T != lu3Var) {
            obj = T;
            x2gVar = x2gVar3;
            x2gVar2 = (x2g) obj;
            yzc yzcVar2 = xwiVar.k;
            xbb b2 = a.b();
            if (x2gVar instanceof v2g) {
            }
            if (x2gVar2 instanceof v2g) {
            }
            yzcVar2.j(CollectionsKt.B0(a.a(b2)));
            return Unit.a;
        }
        return lu3Var;
    }

    private final Object k(Object obj) {
        yzc yzcVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            y2j y2jVar = (y2j) this.u;
            yzc yzcVar2 = y2jVar.f;
            umd umdVar = y2jVar.e;
            String str = (String) this.v;
            String str2 = (String) this.w;
            this.t = yzcVar2;
            this.s = 1;
            umdVar.getClass();
            obj = yaa.P(new yw(umdVar, str, str2, null, 9), this);
            if (obj == lu3Var) {
                return lu3Var;
            }
            yzcVar = yzcVar2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yzcVar = (yzc) this.t;
            y6a.M(obj);
        }
        yzcVar.j(obj);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        if (r2.i(r14, r0, r13) != r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (r14 != r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r14 == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        Team team;
        Team team2;
        Team team3;
        Object U;
        asf asfVar = (asf) this.w;
        DbMyTeam dbMyTeam = (DbMyTeam) this.v;
        TeamWorker teamWorker = (TeamWorker) this.u;
        j0j j0jVar = teamWorker.b;
        lu3 lu3Var = lu3.a;
        int i = 3;
        rq3 rq3Var = null;
        switch (this.s) {
            case 0:
                y6a.M(obj);
                int teamId = dbMyTeam.getTeamId();
                this.s = 1;
                obj = j0jVar.k(teamId, this);
                break;
            case 1:
                y6a.M(obj);
                TeamDetailsResponse teamDetailsResponse = (TeamDetailsResponse) yaa.x((x2g) obj);
                if (teamDetailsResponse == null || (team = teamDetailsResponse.getTeam()) == null) {
                    return Unit.a;
                }
                if (team.getId() == dbMyTeam.getTeamId()) {
                    this.t = team;
                    this.s = 5;
                    Object J = j0jVar.J(team, this);
                    if (J != lu3Var) {
                        team2 = team;
                        obj = J;
                        ((Boolean) obj).getClass();
                        int id = team2.getId();
                        boolean z = asfVar.a;
                        this.t = null;
                        this.s = 6;
                        break;
                    }
                } else {
                    asfVar.a = true;
                    int teamId2 = dbMyTeam.getTeamId();
                    this.t = team;
                    this.s = 2;
                    if (j0jVar.I(teamId2, this) != lu3Var) {
                        team3 = team;
                        int teamId3 = dbMyTeam.getTeamId();
                        this.t = team3;
                        this.s = 3;
                        U = gz8.U(this, j0jVar.a.a, false, true, new bvb(teamId3, 25));
                        if (U != lu3Var) {
                            U = Unit.a;
                        }
                        if (U != lu3Var) {
                            U = Unit.a;
                            break;
                        }
                    }
                }
                return lu3Var;
            case 2:
                team3 = (Team) this.t;
                y6a.M(obj);
                int teamId32 = dbMyTeam.getTeamId();
                this.t = team3;
                this.s = 3;
                U = gz8.U(this, j0jVar.a.a, false, true, new bvb(teamId32, 25));
                if (U != lu3Var) {
                }
                if (U != lu3Var) {
                }
                break;
            case 3:
                team3 = (Team) this.t;
                y6a.M(obj);
                Pair pair = new Pair(team3, Boolean.valueOf(dbMyTeam.getNotificationsEnabled()));
                this.t = team3;
                this.s = 4;
                fvi fviVar = j0jVar.a;
                obj = gz8.T(this, fviVar.a, new fzh(fviVar, pair, rq3Var, i));
                if (obj != lu3Var) {
                    team2 = team3;
                    ((Boolean) obj).getClass();
                    int id2 = team2.getId();
                    boolean z2 = asfVar.a;
                    this.t = null;
                    this.s = 6;
                    break;
                }
                return lu3Var;
            case 4:
                team2 = (Team) this.t;
                y6a.M(obj);
                ((Boolean) obj).getClass();
                int id22 = team2.getId();
                boolean z22 = asfVar.a;
                this.t = null;
                this.s = 6;
                break;
            case 5:
                team2 = (Team) this.t;
                y6a.M(obj);
                ((Boolean) obj).getClass();
                int id222 = team2.getId();
                boolean z222 = asfVar.a;
                this.t = null;
                this.s = 6;
                break;
            case 6:
                y6a.M(obj);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    private final Object m(Object obj) {
        Object obj2 = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            caj cajVar = (caj) this.t;
            wzc wzcVar = cajVar.y;
            lcj lcjVar = (lcj) this.u;
            qze qzeVar = (qze) this.v;
            deh dehVar = (deh) this.w;
            w9j w9jVar = new w9j(cajVar, 11);
            this.s = 1;
            lcjVar.getClass();
            mcj mcjVar = new mcj(wzcVar, lcjVar, null);
            vsc vscVar = new vsc(29, dehVar, lcjVar, w9jVar);
            xf2 xf2Var = rti.a;
            Object r = s9a.r(new h10(qzeVar, mcjVar, vscVar, new j6f(qzeVar), (rq3) null), this);
            if (r != obj2) {
                r = Unit.a;
            }
            if (r != obj2) {
                r = Unit.a;
            }
            if (r != obj2) {
                r = Unit.a;
            }
            if (r != obj2) {
                r = Unit.a;
            }
            if (r == obj2) {
                return obj2;
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

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                cce cceVar = new cce((q50) this.u, (e1d) obj2, (q50) this.v, rq3Var);
                cceVar.t = obj;
                return cceVar;
            case 1:
                u6b u6bVar = (u6b) this.t;
                e6b e6bVar = e6b.a;
                return new cce(u6bVar, (b1d) this.u, (PlayerEventStatisticsModal) this.v, rq3Var, (PlayerEventStatisticsModal) obj2);
            case 2:
                cce cceVar2 = new cce((long[]) this.u, (PlayerWorker) this.v, (wu) obj2, rq3Var, 2);
                cceVar2.t = obj;
                return cceVar2;
            case 3:
                cce cceVar3 = new cce((HashSet) this.v, (PlayerWorker) obj2, rq3Var, 3);
                cceVar3.t = obj;
                return cceVar3;
            case 4:
                u6b u6bVar2 = (u6b) this.t;
                e6b e6bVar2 = e6b.a;
                return new cce(u6bVar2, (b1d) this.u, (PopularPlayersModal) this.v, rq3Var, (PopularPlayersModal) obj2);
            case 5:
                cce cceVar4 = new cce((mlf) this.v, (List) obj2, rq3Var, 5);
                cceVar4.t = obj;
                return cceVar4;
            case 6:
                u6b u6bVar3 = (u6b) this.t;
                e6b e6bVar3 = e6b.a;
                return new cce(u6bVar3, (b1d) this.u, (RefereeEventsFragment) this.v, rq3Var, (RefereeEventsFragment) obj2);
            case 7:
                return new cce((zxf) this.t, (Map) this.u, (gje) this.v, (d11) obj2, rq3Var, 7);
            case 8:
                return new cce((j2d) this.v, (Function2) obj2, rq3Var, 8);
            case 9:
                cce cceVar5 = new cce((ucd) this.u, (jcd) this.v, (Context) obj2, rq3Var, 9);
                cceVar5.t = obj;
                return cceVar5;
            case 10:
                cce cceVar6 = new cce((k6g) this.u, (lj2) this.v, (hb4) obj2, rq3Var, 10);
                cceVar6.t = obj;
                return cceVar6;
            case 11:
                return new cce((zag) this.t, (gcg) this.u, (zjg) this.v, (g62) obj2, rq3Var, 11);
            case 12:
                return new cce((yhg) this.v, (String) obj2, rq3Var, 12);
            case 13:
                return new cce((pyg) this.t, (Context) this.u, (LinkedHashMap) this.v, (tee) obj2, rq3Var, 13);
            case 14:
                cce cceVar7 = new cce((Function1) this.u, (AtomicReference) this.v, (Function2) obj2, rq3Var, 14);
                cceVar7.t = obj;
                return cceVar7;
            case 15:
                return new cce((af0) this.t, (Context) this.u, (Throwable) this.v, (zij) obj2, rq3Var, 15);
            case 16:
                cce cceVar8 = new cce((b98) this.v, (Function2) obj2, rq3Var, 16);
                cceVar8.t = obj;
                return cceVar8;
            case 17:
                return new cce((q50) this.u, (g6b) this.t, (e1d) obj2, (kth) this.v, rq3Var);
            case 18:
                return new cce((a0i) this.v, (l2h) obj2, rq3Var, 18);
            case 19:
                u6b u6bVar4 = (u6b) this.t;
                e6b e6bVar4 = e6b.a;
                return new cce(u6bVar4, (b1d) this.u, (StageCategoryRacesFragment) this.v, rq3Var, (StageCategoryRacesFragment) obj2);
            case 20:
                cce cceVar9 = new cce((UniqueStage) this.u, (q3i) this.v, (j5i) obj2, this.s, rq3Var);
                cceVar9.t = obj;
                return cceVar9;
            case 21:
                return new cce((j6i) this.u, (Stage) this.v, (OddsCountryProvider) obj2, rq3Var, 21);
            case 22:
                return new cce((nui) obj2, rq3Var, 22);
            case 23:
                u6b u6bVar5 = (u6b) this.t;
                e6b e6bVar5 = e6b.a;
                return new cce(u6bVar5, (b1d) this.u, (TeamEventsFragment) this.v, rq3Var, (TeamEventsFragment) obj2);
            case 24:
                cce cceVar10 = new cce((xwi) this.v, (YearMonth) obj2, rq3Var, 24);
                cceVar10.t = obj;
                return cceVar10;
            case 25:
                cce cceVar11 = new cce((xwi) obj2, rq3Var, 25);
                cceVar11.t = obj;
                return cceVar11;
            case 26:
                return new cce((y2j) this.u, (String) this.v, (String) obj2, rq3Var, 26);
            case 27:
                return new cce((TeamWorker) this.u, (DbMyTeam) this.v, (asf) obj2, rq3Var, 27);
            case 28:
                return new cce((caj) this.t, (lcj) this.u, (qze) this.v, (deh) obj2, rq3Var, 28);
            default:
                return new cce((zij) this.t, (ogj) this.u, (ku3) this.v, (Function2) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((cce) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02b4, code lost:
    
        if (defpackage.bea.q(r3, r21) == r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0553, code lost:
    
        if (r0 == r3) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0601, code lost:
    
        if (r2.e(r21) == r0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x06e8, code lost:
    
        if (r11.invoke(r0, r21) == r2) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x06fb, code lost:
    
        if (r11.invoke(r3, r21) != r2) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0858, code lost:
    
        if (defpackage.jid.g(r0, r2, r21) == r11) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x093d, code lost:
    
        if (defpackage.jid.g(r0, r3, r21) == r2) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0921, code lost:
    
        if (r0 == r2) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x08c0, code lost:
    
        if (r0 == r2) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0199, code lost:
    
        if (defpackage.b6a.z(r3, r4, r5, r21) == r2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0181, code lost:
    
        if (r0.f(r21, r3) == r2) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    /* JADX WARN: Type inference failed for: r2v41, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v31, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v34, types: [h2d] */
    /* JADX WARN: Type inference failed for: r3v77, types: [yda] */
    /* JADX WARN: Type inference failed for: r3v80, types: [yda] */
    /* JADX WARN: Type inference failed for: r5v9, types: [kotlin.Pair] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0219 -> B:83:0x01e9). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rq3 rq3Var;
        Object u;
        Object T;
        rq3 rq3Var2;
        Player player;
        asf asfVar;
        yzc yzcVar;
        Object u2;
        j2d j2dVar;
        Function2 function2;
        h2d h2dVar;
        Object u2gVar;
        mz0 mz0Var;
        Object R;
        Object b;
        Object R2;
        rq3 rq3Var3;
        Object obj2;
        Object obj3;
        yhg yhgVar;
        Object c;
        xag xagVar;
        Object R3;
        n8h n8hVar;
        n8h n8hVar2;
        Object invoke;
        n8h n8hVar3;
        g9i L;
        b62 b62Var;
        g9i g9iVar;
        Object obj4;
        b62 b62Var2;
        j5i j5iVar;
        long a;
        int i = this.r;
        int i2 = 16;
        int i3 = 6;
        r7 = false;
        boolean z = false;
        int i4 = 2;
        Object obj5 = this.w;
        int i5 = 1;
        rq3 rq3Var4 = null;
        switch (i) {
            case 0:
                q50 q50Var = (q50) this.u;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    int i7 = ((fm8) ((e1d) obj5).getValue()) != null ? 400 : 0;
                    if (((Number) q50Var.d()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.t = ku3Var;
                        this.s = 1;
                        if (n4o.y(i7, this) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                int m = tba.m(((Number) q50Var.d()).floatValue(), 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 500);
                xw3.L(ku3Var, null, null, new bce(q50Var, m, rq3Var4, i5), 3);
                xw3.L(ku3Var, null, null, new bce((q50) this.v, m, rq3Var4, i4), 3);
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) this.t;
                    e6b e6bVar = e6b.c;
                    j8c j8cVar = new j8c((b1d) this.u, (PlayerEventStatisticsModal) this.v, (rq3) null, (PlayerEventStatisticsModal) obj5, 24);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, j8cVar, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                PlayerWorker playerWorker = (PlayerWorker) this.v;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                int i9 = this.s;
                rq3 rq3Var5 = null;
                if (i9 == 0) {
                    y6a.M(obj);
                    long[] jArr = (long[]) this.u;
                    ArrayList arrayList = new ArrayList(jArr.length);
                    for (long j : jArr) {
                        arrayList.add(xw3.t(ku3Var2, null, new z40(playerWorker, j, rq3Var5, 5), 3));
                    }
                    rq3Var = null;
                    this.t = null;
                    this.s = 1;
                    u = m6k.u(arrayList, this);
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            ad2 ad2Var = qv5.a;
                            qv5.a(x42.a);
                            return Unit.a;
                        }
                        y6a.M(obj);
                        T = obj;
                        rq3Var = null;
                        if (((Boolean) T).booleanValue()) {
                            jid jidVar = playerWorker.c;
                            Context applicationContext = playerWorker.getApplicationContext();
                            applicationContext.getClass();
                            this.t = rq3Var;
                            this.s = 3;
                            break;
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                    u = obj;
                    rq3Var = null;
                }
                wu wuVar = (wu) obj5;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((Iterable) u).iterator();
                while (it.hasNext()) {
                    PlayerDetailsResponse playerDetailsResponse = (PlayerDetailsResponse) yaa.x((x2g) it.next());
                    if (playerDetailsResponse == null || (player = playerDetailsResponse.getPlayer()) == null) {
                        rq3Var2 = rq3Var;
                    } else {
                        Context applicationContext2 = playerWorker.getApplicationContext();
                        applicationContext2.getClass();
                        nv.y(applicationContext2, vu.ADD_FAVORITE, xu.PLAYER, player.getId(), wuVar);
                        rq3Var2 = new Pair(player, Boolean.TRUE);
                    }
                    if (rq3Var2 != null) {
                        arrayList2.add(rq3Var2);
                    }
                }
                wve wveVar = playerWorker.b;
                this.t = rq3Var;
                this.s = 2;
                aoe aoeVar = wveVar.a;
                T = gz8.T(this, aoeVar.a, new cl(aoeVar, arrayList2, rq3Var, 22));
                break;
            case 3:
                PlayerWorker playerWorker2 = (PlayerWorker) obj5;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var4 = lu3.a;
                int i10 = this.s;
                rq3 rq3Var6 = null;
                if (i10 == 0) {
                    y6a.M(obj);
                    asf asfVar2 = new asf();
                    HashSet hashSet = (HashSet) this.v;
                    ArrayList arrayList3 = new ArrayList(k13.r(hashSet, 10));
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(xw3.t(ku3Var3, null, new z23(playerWorker2, ((Number) it2.next()).intValue(), asfVar2, rq3Var6, 15), 3));
                    }
                    this.t = null;
                    this.u = asfVar2;
                    this.s = 1;
                    if (m6k.u(arrayList3, this) != lu3Var4) {
                        asfVar = asfVar2;
                    }
                    return lu3Var4;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                asfVar = (asf) this.u;
                y6a.M(obj);
                if (asfVar.a) {
                    jid jidVar2 = playerWorker2.c;
                    Context applicationContext3 = playerWorker2.getApplicationContext();
                    applicationContext3.getClass();
                    this.t = null;
                    this.u = null;
                    this.s = 2;
                    break;
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    u6b u6bVar2 = (u6b) this.t;
                    e6b e6bVar2 = e6b.c;
                    v1f v1fVar = new v1f((b1d) this.u, (PopularPlayersModal) this.v, (rq3) null, (PopularPlayersModal) obj5, 0);
                    this.s = 1;
                    if (b6a.A(u6bVar2, e6bVar2, v1fVar, this) == lu3Var5) {
                        return lu3Var5;
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
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var6 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    mlf mlfVar = (mlf) this.v;
                    yzcVar = mlfVar.h;
                    List list = (List) obj5;
                    ArrayList arrayList4 = new ArrayList(k13.r(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(xw3.t(ku3Var4, null, new gje((amf) it3.next(), mlfVar, rq3Var4, i2), 3));
                    }
                    this.t = null;
                    this.u = yzcVar;
                    this.s = 1;
                    u2 = m6k.u(arrayList4, this);
                    if (u2 == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzc yzcVar2 = (yzc) this.u;
                    y6a.M(obj);
                    yzcVar = yzcVar2;
                    u2 = obj;
                }
                yzcVar.j(CollectionsKt.W((Iterable) u2));
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    u6b u6bVar3 = (u6b) this.t;
                    e6b e6bVar3 = e6b.c;
                    v1f v1fVar2 = new v1f((b1d) this.u, (RefereeEventsFragment) this.v, (rq3) null, (RefereeEventsFragment) obj5, 7);
                    this.s = 1;
                    if (b6a.A(u6bVar3, e6bVar3, v1fVar2, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                d11 d11Var = (d11) obj5;
                lu3 lu3Var8 = lu3.a;
                int i14 = this.s;
                try {
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.toString();
                    }
                    this.s = 3;
                    break;
                }
                if (i14 == 0) {
                    y6a.M(obj);
                    URLConnection openConnection = ((zxf) this.t).a().openConnection();
                    openConnection.getClass();
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod(C4094gc.a);
                    httpsURLConnection.setRequestProperty("Accept", C4427z5.M);
                    for (Map.Entry entry : ((Map) this.u).entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String str = "Bad response code: " + responseCode;
                        this.s = 2;
                        break;
                    } else {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                sb.append(readLine);
                            } else {
                                bufferedReader.close();
                                inputStream.close();
                                JSONObject jSONObject = new JSONObject(sb.toString());
                                gje gjeVar = (gje) this.v;
                                this.s = 1;
                                if (gjeVar.invoke(jSONObject, this) == lu3Var8) {
                                    return lu3Var8;
                                }
                            }
                        }
                    }
                } else if (i14 == 1 || i14 == 2) {
                    y6a.M(obj);
                } else {
                    if (i14 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i15 = this.s;
                try {
                    if (i15 == 0) {
                        y6a.M(obj);
                        j2dVar = (j2d) this.v;
                        ?? r3 = (Function2) obj5;
                        this.t = j2dVar;
                        this.u = (hoi) r3;
                        this.s = 1;
                        function2 = r3;
                        break;
                    } else {
                        if (i15 != 1) {
                            if (i15 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar = (h2d) this.t;
                            try {
                                y6a.M(obj);
                                Unit unit = Unit.a;
                                h2dVar.f(null);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                h2dVar.f(null);
                                throw th;
                            }
                        }
                        Function2 function22 = (Function2) ((hoi) this.u);
                        ?? r32 = (h2d) this.t;
                        y6a.M(obj);
                        function2 = function22;
                        j2dVar = r32;
                    }
                    p4f p4fVar = new p4f(function2, rq3Var4, 8);
                    this.t = j2dVar;
                    this.u = null;
                    this.s = 2;
                    if (s9a.r(p4fVar, this) != lu3Var9) {
                        h2dVar = j2dVar;
                        Unit unit2 = Unit.a;
                        h2dVar.f(null);
                        return Unit.a;
                    }
                    return lu3Var9;
                } catch (Throwable th2) {
                    th = th2;
                    h2dVar = j2dVar;
                    h2dVar.f(null);
                    throw th;
                }
            case 9:
                ucd ucdVar = (ucd) this.u;
                LinkedHashSet linkedHashSet = ucdVar.e;
                lu3 lu3Var10 = lu3.a;
                int i16 = this.s;
                try {
                } catch (Throwable th3) {
                    p2g p2gVar = w2g.b;
                    u2gVar = new u2g(th3);
                }
                if (i16 == 0) {
                    y6a.M(obj);
                    String str2 = iie.c;
                    str2.getClass();
                    ucdVar.f = str2;
                    if (iie.c.length() == 0 || iie.d.length() == 0) {
                        throw new qcd(1, "API Key or Publisher Key not set", null);
                    }
                    if (ucdVar.d.length() == 0) {
                        ucdVar.d = mz1.o(new StringBuilder("https://"), iie.d, ".adsbynimbus.com/rta/v1");
                    }
                    LinkedHashSet linkedHashSet2 = j0g.a;
                    if (td4.c0(ucdVar) != 2 || j0g.a(ucdVar) < 2) {
                        if (td4.c0(ucdVar) == 1 && j0g.a(ucdVar) == 1 && (mz0Var = ucdVar.a.a[0].a) != null) {
                            int i17 = mz0Var.b;
                            int i18 = mz0Var.a;
                            if ((i18 == 320 && i17 == 480) || (i18 == 480 && i17 == 320)) {
                                i3 = 3;
                            }
                        }
                        i3 = td4.c0(ucdVar);
                    }
                    td4.v0(ucdVar, i3);
                    Context context = (Context) obj5;
                    p2g p2gVar2 = w2g.b;
                    Build.MANUFACTURER.getClass();
                    Build.MODEL.getClass();
                    Build.VERSION.RELEASE.getClass();
                    this.s = 1;
                    rod rodVar = i0g.a;
                    iie iieVar = iie.a;
                    R = xw3.R(z45.a, new g0g(context, ucdVar, iie.a(), null), this);
                    if (R == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        b = obj;
                        u2gVar = (wcd) b;
                        p2g p2gVar3 = w2g.b;
                        if (!(u2gVar instanceof u2g)) {
                            Iterator it4 = linkedHashSet.iterator();
                            if (it4.hasNext()) {
                                throw lnb.i(it4);
                            }
                        }
                        Throwable a2 = w2g.a(u2gVar);
                        if (a2 != null) {
                            Iterator it5 = linkedHashSet.iterator();
                            if (it5.hasNext()) {
                                if (it5.next() != null) {
                                    pvd.j();
                                    return null;
                                }
                                if ((a2 instanceof qcd ? (qcd) a2 : null) != null) {
                                    throw null;
                                }
                                rod rodVar2 = i0g.a;
                                String message2 = a2.getMessage();
                                if (message2 == null) {
                                    message2 = "Error sending request to Nimbus";
                                }
                                new qcd(3, message2, a2);
                                throw null;
                            }
                        }
                        y6a.M(u2gVar);
                        return u2gVar;
                    }
                    y6a.M(obj);
                    R = obj;
                }
                this.s = 2;
                rod rodVar3 = i0g.a;
                oog oogVar = new oog(z9a.b(this));
                i0g.a.a((ucd) R, new h0g(oogVar));
                b = oogVar.b();
                break;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    CoroutineContext.Element element = ((ku3) this.t).getCoroutineContext().get(d.Q7);
                    element.getClass();
                    ?? r2 = (d) element;
                    k6g k6gVar = (k6g) this.u;
                    CoroutineContext plus = ((kotlin.coroutines.a) r2).plus(new xuj(r2));
                    CoroutineContext plus2 = plus.plus(new bgj(plus, k6gVar.getSuspendingTransactionContext()));
                    lj2 lj2Var = (lj2) this.v;
                    p2g p2gVar4 = w2g.b;
                    this.t = lj2Var;
                    this.s = 1;
                    R2 = xw3.R(plus2, (hb4) obj5, this);
                    if (R2 == lu3Var11) {
                        return lu3Var11;
                    }
                    rq3Var3 = lj2Var;
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rq3Var3 = (rq3) this.t;
                    y6a.M(obj);
                    R2 = obj;
                }
                p2g p2gVar5 = w2g.b;
                rq3Var3.resumeWith(R2);
                return Unit.a;
            case 11:
                gcg gcgVar = (gcg) this.u;
                zag zagVar = (zag) this.t;
                lu3 lu3Var12 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    zagVar.m = true;
                    zagVar.l = gcgVar;
                    Function1 function1 = zagVar.f;
                    List list2 = gcgVar.f;
                    if (list2 == null || (obj2 = CollectionsKt.S0(list2)) == null) {
                        obj2 = km5.a;
                    }
                    zagVar.q = (jhg) function1.invoke(obj2);
                    Function2 function23 = zagVar.g;
                    List list3 = gcgVar.g;
                    if (list3 == null || (obj3 = CollectionsKt.S0(list3)) == null) {
                        obj3 = km5.a;
                    }
                    zagVar.r = (hhg) function23.invoke(obj3, ((zjg) this.v).b());
                    Unit unit3 = Unit.a;
                    this.s = 1;
                    if (((g62) obj5).q(this, unit3) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    yhgVar = (yhg) this.v;
                    xag xagVar2 = yhgVar.t;
                    if (xagVar2 != null) {
                        this.t = yhgVar;
                        this.u = xagVar2;
                        this.s = 1;
                        c = ((zag) xagVar2).c((String) obj5, this);
                        if (c == lu3Var13) {
                            return lu3Var13;
                        }
                        xagVar = xagVar2;
                    }
                    return Unit.a;
                }
                if (i21 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xagVar = (xag) this.u;
                yhg yhgVar2 = (yhg) this.t;
                y6a.M(obj);
                yhgVar = yhgVar2;
                c = obj;
                if (((Boolean) c).booleanValue()) {
                    zag zagVar2 = (zag) xagVar;
                    zagVar2.i(kig.CLICK, yhgVar.C);
                    zagVar2.i(kig.TIME_TO_CLICK, yhgVar.C);
                    mjg mjgVar = yhgVar.c;
                    RelativeLayout relativeLayout = yhgVar.o;
                    if (relativeLayout == null) {
                        Intrinsics.i("measuredView");
                        throw null;
                    }
                    rjg b2 = mjgVar.b(relativeLayout);
                    if (b2 != null && b2.c != null) {
                        hkg.T().post(new ojg(b2, 5));
                    }
                }
                return Unit.a;
            case 13:
                pyg pygVar = (pyg) this.t;
                lu3 lu3Var14 = lu3.a;
                int i22 = this.s;
                rq3 rq3Var7 = null;
                if (i22 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    k50 k50Var = new k50((Context) this.u, pygVar, (LinkedHashMap) this.v, rq3Var7, 23);
                    this.s = 1;
                    R3 = xw3.R(hs4Var, k50Var, this);
                    if (R3 == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R3 = obj;
                }
                pygVar.n(null, new aaf(i2, (tee) obj5, (gv9) R3));
                return Unit.a;
            case 14:
                AtomicReference atomicReference = (AtomicReference) this.v;
                lu3 lu3Var15 = lu3.a;
                int i23 = this.s;
                try {
                    if (i23 == 0) {
                        y6a.M(obj);
                        ku3 ku3Var5 = (ku3) this.t;
                        n8h n8hVar4 = new n8h(bea.x(ku3Var5.getCoroutineContext()), ((Function1) this.u).invoke(ku3Var5));
                        n8h n8hVar5 = (n8h) atomicReference.getAndSet(n8hVar4);
                        if (n8hVar5 != null) {
                            yda ydaVar = n8hVar5.a;
                            this.t = n8hVar4;
                            this.s = 1;
                            break;
                        }
                        n8hVar = n8hVar4;
                    } else {
                        if (i23 != 1) {
                            if (i23 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            n8hVar2 = (n8h) this.t;
                            try {
                                y6a.M(obj);
                                n8hVar3 = n8hVar2;
                                invoke = obj;
                                while (!atomicReference.compareAndSet(n8hVar3, null) && atomicReference.get() == n8hVar3) {
                                }
                                return invoke;
                            } catch (Throwable th4) {
                                th = th4;
                                while (!atomicReference.compareAndSet(n8hVar2, null)) {
                                }
                                throw th;
                            }
                        }
                        n8hVar = (n8h) this.t;
                        y6a.M(obj);
                    }
                    Object obj6 = n8hVar.b;
                    this.t = n8hVar;
                    this.s = 2;
                    invoke = ((Function2) obj5).invoke(obj6, this);
                    if (invoke != lu3Var15) {
                        n8hVar3 = n8hVar;
                        while (!atomicReference.compareAndSet(n8hVar3, null)) {
                        }
                        return invoke;
                    }
                    return lu3Var15;
                } catch (Throwable th5) {
                    th = th5;
                    n8hVar2 = n8hVar;
                    while (!atomicReference.compareAndSet(n8hVar2, null) && atomicReference.get() == n8hVar2) {
                    }
                    throw th;
                }
            case 15:
                Throwable th6 = (Throwable) this.v;
                lu3 lu3Var16 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    af0 af0Var = (af0) this.t;
                    Context context2 = (Context) this.u;
                    this.s = 1;
                    af0Var.a(context2, th6);
                    if (Unit.a == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                s9a.o((zij) obj5, ml4.e("Error in composition effect coroutine", th6));
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var6 = (ku3) this.t;
                    g62 g = ml4.g(0, 6, null);
                    L = xw3.L(ku3Var6, null, null, new big(g, (Function2) obj5, rq3Var4, 12), 3);
                    b62Var = new b62(g);
                } else {
                    if (i25 == 1) {
                        b62Var2 = (b62) this.u;
                        ?? r33 = (yda) this.t;
                        y6a.M(obj);
                        g9iVar = r33;
                        obj4 = obj;
                        if (((Boolean) obj4).booleanValue()) {
                            g9iVar.e(null);
                            return Unit.a;
                        }
                        Object c2 = b62Var2.c();
                        b98 b98Var = (b98) this.v;
                        this.t = g9iVar;
                        this.u = b62Var2;
                        this.s = 2;
                        if (b98Var.emit(c2, this) != lu3Var17) {
                            g9i g9iVar2 = g9iVar;
                            b62Var = b62Var2;
                            L = g9iVar2;
                        }
                        return lu3Var17;
                    }
                    if (i25 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b62 b62Var3 = (b62) this.u;
                    ?? r34 = (yda) this.t;
                    y6a.M(obj);
                    b62Var = b62Var3;
                    L = r34;
                }
                this.t = L;
                this.u = b62Var;
                this.s = 1;
                obj4 = b62Var.a(this);
                if (obj4 != lu3Var17) {
                    b62 b62Var4 = b62Var;
                    g9iVar = L;
                    b62Var2 = b62Var4;
                    if (((Boolean) obj4).booleanValue()) {
                    }
                }
                return lu3Var17;
            case 17:
                e1d e1dVar = (e1d) obj5;
                q50 q50Var2 = (q50) this.u;
                lu3 lu3Var18 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    int i27 = SofaSeasonActivity.L;
                    if (((hth) e1dVar.getValue()).b() != null && ((Number) q50Var2.d()).floatValue() == 1.0f) {
                        Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.s = 1;
                        break;
                    }
                } else {
                    if (i26 != 1) {
                        if (i26 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                g6b g6bVar = (g6b) this.t;
                e6b e6bVar4 = e6b.e;
                nsh nshVar = new nsh(q50Var2, (kth) this.v, e1dVar, null);
                this.s = 2;
                break;
            case 18:
                return e(obj);
            case 19:
                lu3 lu3Var19 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    u6b u6bVar4 = (u6b) this.t;
                    e6b e6bVar5 = e6b.c;
                    v1f v1fVar3 = new v1f((b1d) this.u, (StageCategoryRacesFragment) this.v, (rq3) null, (StageCategoryRacesFragment) obj5, 27);
                    this.s = 1;
                    if (b6a.A(u6bVar4, e6bVar5, v1fVar3, this) == lu3Var19) {
                        return lu3Var19;
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
                j5i j5iVar2 = (j5i) obj5;
                q3i q3iVar = (q3i) this.v;
                ku3 ku3Var7 = (ku3) this.t;
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                if (cga.z((UniqueStage) this.u) && ((j5iVar = q3iVar.i) == null || j5iVar == j5iVar2)) {
                    z = true;
                }
                return yaa.p(ku3Var7, z, new o3i(q3iVar, this.s, j5iVar2, null, 0));
            case 21:
                return f(obj);
            case 22:
                return g(obj);
            case 23:
                lu3 lu3Var21 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    u6b u6bVar5 = (u6b) this.t;
                    e6b e6bVar6 = e6b.c;
                    h4i h4iVar = new h4i((b1d) this.u, (TeamEventsFragment) this.v, (rq3) null, (TeamEventsFragment) obj5, 11);
                    this.s = 1;
                    if (b6a.A(u6bVar5, e6bVar6, h4iVar, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 24:
                return h(obj);
            case 25:
                return j(obj);
            case 26:
                return k(obj);
            case 27:
                return l(obj);
            case 28:
                return m(obj);
            default:
                zij zijVar = (zij) this.t;
                lu3 lu3Var22 = lu3.a;
                int i30 = this.s;
                if (i30 != 0 && i30 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                do {
                    Object obj7 = zijVar.b.get();
                    obj7.getClass();
                    long longValue = ((Number) obj7).longValue();
                    ((ogj) this.u).getClass();
                    if (longValue <= System.currentTimeMillis()) {
                        s9a.o((ku3) this.v, new rij("Timed out of executing block.", ((Function2) obj5).hashCode()));
                        return Unit.a;
                    }
                    a = zijVar.a();
                    this.s = 1;
                } while (n4o.z(a, this) != lu3Var22);
                return lu3Var22;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce(q50 q50Var, g6b g6bVar, e1d e1dVar, kth kthVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 17;
        this.u = q50Var;
        this.t = g6bVar;
        this.w = e1dVar;
        this.v = kthVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce(q50 q50Var, e1d e1dVar, q50 q50Var2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        this.u = q50Var;
        this.w = e1dVar;
        this.v = q50Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce(u6b u6bVar, b1d b1dVar, PlayerEventStatisticsModal playerEventStatisticsModal, rq3 rq3Var, PlayerEventStatisticsModal playerEventStatisticsModal2) {
        super(2, rq3Var);
        this.r = 1;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = playerEventStatisticsModal;
        this.w = playerEventStatisticsModal2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce(u6b u6bVar, b1d b1dVar, PopularPlayersModal popularPlayersModal, rq3 rq3Var, PopularPlayersModal popularPlayersModal2) {
        super(2, rq3Var);
        this.r = 4;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = popularPlayersModal;
        this.w = popularPlayersModal2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce(u6b u6bVar, b1d b1dVar, RefereeEventsFragment refereeEventsFragment, rq3 rq3Var, RefereeEventsFragment refereeEventsFragment2) {
        super(2, rq3Var);
        this.r = 6;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = refereeEventsFragment;
        this.w = refereeEventsFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cce(q8 q8Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = q8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce(u6b u6bVar, b1d b1dVar, TeamEventsFragment teamEventsFragment, rq3 rq3Var, TeamEventsFragment teamEventsFragment2) {
        super(2, rq3Var);
        this.r = 23;
        e6b e6bVar = e6b.a;
        this.t = u6bVar;
        this.u = b1dVar;
        this.v = teamEventsFragment;
        this.w = teamEventsFragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce(UniqueStage uniqueStage, q3i q3iVar, j5i j5iVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 20;
        this.u = uniqueStage;
        this.v = q3iVar;
        this.w = j5iVar;
        this.s = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cce(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cce(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cce(Object obj, Object obj2, Object obj3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
    }
}
