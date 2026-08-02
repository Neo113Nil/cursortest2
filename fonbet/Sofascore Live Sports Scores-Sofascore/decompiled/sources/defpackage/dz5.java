package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.TvType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.Head2HeadEventsResponse;
import com.sofascore.model.newNetwork.EventGraphData;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentAchievements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Ldz5;", "Le4f;", "", "iy5", "jy5", "my5", "hy5", "ly5", "ky5", "gy5", "ny5", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class dz5 extends e4f {
    public final /* synthetic */ vng h;
    public final s96 i;
    public final t9c j;
    public final j0j k;
    public final pai l;
    public final wve m;
    public final w3b n;
    public final umd o;
    public final amd p;
    public final g39 q;
    public final cg4 r;
    public final e64 s;
    public final zte t;
    public final yf4 u;
    public final cz5 v;
    public final yzc w;
    public final lec x;
    public final yzc y;
    public final lec z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz5(Application application, s96 s96Var, t9c t9cVar, j0j j0jVar, pai paiVar, wve wveVar, w3b w3bVar, umd umdVar, amd amdVar, z3k z3kVar, SharedPreferences sharedPreferences, fyk fykVar, g39 g39Var, cg4 cg4Var, e64 e64Var, zte zteVar) {
        super(application, fykVar);
        s96Var.getClass();
        t9cVar.getClass();
        j0jVar.getClass();
        paiVar.getClass();
        wveVar.getClass();
        w3bVar.getClass();
        umdVar.getClass();
        amdVar.getClass();
        z3kVar.getClass();
        sharedPreferences.getClass();
        fykVar.getClass();
        g39Var.getClass();
        cg4Var.getClass();
        e64Var.getClass();
        zteVar.getClass();
        this.h = new vng(z3kVar, sharedPreferences);
        this.i = s96Var;
        this.j = t9cVar;
        this.k = j0jVar;
        this.l = paiVar;
        this.m = wveVar;
        this.n = w3bVar;
        this.o = umdVar;
        this.p = amdVar;
        this.q = g39Var;
        this.r = cg4Var;
        this.s = e64Var;
        this.t = zteVar;
        this.u = cg4Var.f(new e5f("PREF_SHOW_BASEBALL_HOME_AWAY_BUBBLE"), Boolean.TRUE);
        this.v = new cz5(cg4Var.f(new e5f("PREF_POTM_VOTING_BUBBLE_DISMISS_COUNT"), 0), 0);
        yzc yzcVar = new yzc();
        this.w = yzcVar;
        this.x = waa.w(yzcVar);
        yzc yzcVar2 = new yzc();
        this.y = yzcVar2;
        this.z = waa.w(yzcVar2);
    }

    public static int v(List list) {
        int m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UniqueTournamentAchievements uniqueTournamentAchievements = (UniqueTournamentAchievements) it.next();
            Integer trophiesWon = uniqueTournamentAchievements.getTrophiesWon();
            if (trophiesWon != null) {
                UniqueTournament uniqueTournament = uniqueTournamentAchievements.getUniqueTournament();
                m = Intrinsics.c(uniqueTournament != null ? uniqueTournament.getMajorTrophy() : null, Boolean.TRUE) ? m + yid.m(trophiesWon) : 0;
            }
            trophiesWon = null;
        }
        return m;
    }

    public static EventGraphResponse w(String str, List list) {
        Object obj;
        int i;
        Object obj2;
        int i2;
        if (Intrinsics.c(str, Sports.HANDBALL)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Incident incident = (Incident) obj;
                if ((incident instanceof Incident.PeriodIncident) && StringsKt.J(((Incident.PeriodIncident) incident).getText(), "HT", false)) {
                    break;
                }
            }
            Incident incident2 = (Incident) obj;
            if (incident2 != null) {
                Integer homeScore$default = Incident.getHomeScore$default(incident2, null, 1, null);
                int intValue = homeScore$default != null ? homeScore$default.intValue() : 0;
                Integer awayScore$default = Incident.getAwayScore$default(incident2, null, 1, null);
                i = intValue + (awayScore$default != null ? awayScore$default.intValue() : 0);
            } else {
                i = 0;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                Incident incident3 = (Incident) obj2;
                if ((incident3 instanceof Incident.PeriodIncident) && StringsKt.J(((Incident.PeriodIncident) incident3).getText(), "FT", false)) {
                    break;
                }
            }
            Incident incident4 = (Incident) obj2;
            if (incident4 != null) {
                Integer homeScore$default2 = Incident.getHomeScore$default(incident4, null, 1, null);
                int intValue2 = homeScore$default2 != null ? homeScore$default2.intValue() : 0;
                Integer awayScore$default2 = Incident.getAwayScore$default(incident4, null, 1, null);
                i2 = intValue2 + (awayScore$default2 != null ? awayScore$default2.intValue() : 0);
            } else {
                i2 = 0;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof Incident.GoalIncident) {
                    arrayList.add(obj3);
                }
            }
            List B0 = CollectionsKt.B0(arrayList);
            ArrayList arrayList2 = new ArrayList(k13.r(B0, 10));
            int i3 = 0;
            for (Object obj4 : B0) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                Incident.GoalIncident goalIncident = (Incident.GoalIncident) obj4;
                double intValue3 = goalIncident.getTime() != null ? r8.intValue() : 0.0d;
                Integer homeScore$default3 = Incident.getHomeScore$default(goalIncident, null, 1, null);
                EventGraphData eventGraphData = new EventGraphData(intValue3, (homeScore$default3 != null ? homeScore$default3.intValue() : 0) - (Incident.getAwayScore$default(goalIncident, null, 1, null) != null ? r6.intValue() : 0));
                eventGraphData.setIncidentIndex(i4);
                arrayList2.add(eventGraphData);
                i3 = i4;
            }
            if (!arrayList2.isEmpty()) {
                EventGraphResponse eventGraphResponse = new EventGraphResponse(arrayList2, null, null, null, null);
                eventGraphResponse.setHalfTimeCount(Integer.valueOf(i));
                eventGraphResponse.setFullTimeCount(Integer.valueOf(i2));
                return eventGraphResponse;
            }
        }
        return null;
    }

    public static int y(int i, List list) {
        Integer num;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            UniqueTournament uniqueTournament = ((UniqueTournamentAchievements) obj).getUniqueTournament();
            if (uniqueTournament != null && uniqueTournament.getId() == i) {
                break;
            }
        }
        UniqueTournamentAchievements uniqueTournamentAchievements = (UniqueTournamentAchievements) obj;
        if (uniqueTournamentAchievements != null) {
            UniqueTournament uniqueTournament2 = uniqueTournamentAchievements.getUniqueTournament();
            if (!Intrinsics.c(uniqueTournament2 != null ? uniqueTournament2.getMajorTrophy() : null, Boolean.TRUE)) {
                uniqueTournamentAchievements = null;
            }
            if (uniqueTournamentAchievements != null) {
                num = uniqueTournamentAchievements.getTrophiesWon();
            }
        }
        return yid.m(num);
    }

    public final Object m(int i, Country country, TvType tvType, rq3 rq3Var) {
        return this.h.L(i, country, tvType, (hoi) rq3Var);
    }

    public final Country n() {
        return (Country) this.h.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, sq3 sq3Var) {
        ry5 ry5Var;
        int i;
        if (sq3Var instanceof ry5) {
            ry5Var = (ry5) sq3Var;
            int i2 = ry5Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ry5Var.t = i2 - Integer.MIN_VALUE;
                Object obj = ry5Var.r;
                lu3 lu3Var = lu3.a;
                i = ry5Var.t;
                Object[] objArr = 0;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    ry5Var.t = 1;
                    s96 s96Var = this.i;
                    s96Var.getClass();
                    obj = yaa.P(new b86(s96Var, str, objArr == true ? 1 : 0, i3), ry5Var);
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
                Head2HeadEventsResponse head2HeadEventsResponse = (Head2HeadEventsResponse) yaa.x((x2g) obj);
                List<Event> events = head2HeadEventsResponse != null ? head2HeadEventsResponse.getEvents() : null;
                return events != null ? km5.a : events;
            }
        }
        ry5Var = new ry5(this, sq3Var);
        Object obj2 = ry5Var.r;
        lu3 lu3Var2 = lu3.a;
        i = ry5Var.t;
        Object[] objArr2 = 0;
        int i32 = 1;
        if (i != 0) {
        }
        Head2HeadEventsResponse head2HeadEventsResponse2 = (Head2HeadEventsResponse) yaa.x((x2g) obj2);
        if (head2HeadEventsResponse2 != null) {
        }
        if (events != null) {
        }
    }

    public final void t(int i, Event event) {
        xw3.L(un0.z(this), null, null, new sy5(this, event, null, i), 3);
    }

    public final TvCountryChannelsResponse u() {
        return (TvCountryChannelsResponse) this.h.f;
    }

    public final void x(TvCountryChannelsResponse tvCountryChannelsResponse) {
        this.h.f = tvCountryChannelsResponse;
    }
}
