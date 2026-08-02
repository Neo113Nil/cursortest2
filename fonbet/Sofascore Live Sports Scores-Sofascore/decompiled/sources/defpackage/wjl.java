package defpackage;

import com.sofascore.model.mvvm.model.City;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.model.newNetwork.TeamDetailsResponse;
import com.sofascore.model.wc26.WorldCupTimeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wjl extends hoi implements Function2 {
    public Integer A;
    public String B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ qkl I;
    public String r;
    public Integer s;
    public zu4 t;
    public av4 u;
    public StandingsTableRow v;
    public String w;
    public gv9 x;
    public Object y;
    public gv9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjl(qkl qklVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.I = qklVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        wjl wjlVar = new wjl(this.I, rq3Var);
        wjlVar.H = obj;
        return wjlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wjl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x031a, code lost:
    
        if (r9.length() > 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02aa, code lost:
    
        if (r5 == r2) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x00a4, code lost:
    
        if (r3 == r2) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0443 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03a3  */
    /* JADX WARN: Type inference failed for: r14v16, types: [zu4] */
    /* JADX WARN: Type inference failed for: r23v5, types: [sfl] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r8v18, types: [zu4] */
    /* JADX WARN: Type inference failed for: r8v19, types: [zu4] */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50, types: [rfl] */
    /* JADX WARN: Type inference failed for: r9v51, types: [rfl] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object A;
        String str;
        Integer b;
        int i;
        av4 p;
        av4 p2;
        Object w;
        av4 av4Var;
        int i2;
        av4 av4Var2;
        rfl rflVar;
        agl aglVar;
        int i3;
        List<StandingsTable> list;
        av4 av4Var3;
        int i4;
        StandingsTableRow standingsTableRow;
        String str2;
        String str3;
        av4 av4Var4;
        List<Event> list2;
        Integer num;
        StandingsTableRow standingsTableRow2;
        Object T;
        StandingsTableRow standingsTableRow3;
        Object obj2;
        Tournament tournament;
        Object obj3;
        int i5;
        StandingsResponse standingsResponse;
        int i6;
        gv9 gv9Var;
        int i7;
        int i8;
        String str4;
        String str5;
        ifl iflVar;
        Object obj4;
        Event event;
        Object p3;
        String str6;
        City city;
        av4 av4Var5;
        int i9;
        Integer num2;
        Iterator it;
        qkl qklVar;
        boolean z;
        gv9 W;
        int i10;
        boolean B;
        Team team;
        Object T2;
        gv9 gv9Var2;
        gv9 gv9Var3;
        int i11;
        int i12;
        boolean z2;
        int i13;
        Lineups awayLineups$default;
        List<MissingPlayerData> missingPlayers;
        String f0;
        Lineups homeLineups$default;
        List<MissingPlayerData> missingPlayers2;
        gv9 gv9Var4;
        gv9 gv9Var5;
        boolean z3;
        Team team2;
        Object obj5;
        ?? r9;
        Integer points;
        TeamDetailsResponse teamDetailsResponse;
        ku3 ku3Var = (ku3) this.H;
        lu3 lu3Var = lu3.a;
        int i14 = this.G;
        qkl qklVar2 = this.I;
        Team team3 = null;
        if (i14 == 0) {
            y6a.M(obj);
            yf4 yf4Var = qklVar2.A;
            this.H = ku3Var;
            this.G = 1;
            A = rd0.A(yf4Var, this);
        } else if (i14 == 1) {
            y6a.M(obj);
            A = obj;
        } else if (i14 == 2) {
            i2 = this.D;
            int i15 = this.C;
            av4Var = this.u;
            ?? r8 = this.t;
            b = this.s;
            str = this.r;
            y6a.M(obj);
            w = obj;
            i5 = i15;
            av4Var2 = r8;
            standingsResponse = (StandingsResponse) w;
            if (standingsResponse == null) {
                list = standingsResponse.getStandings();
                i4 = i5;
                av4Var3 = av4Var2;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        o13.v(((StandingsTable) it2.next()).getRows(), arrayList);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        int id = ((StandingsTableRow) obj3).getTeam().getId();
                        if (b != null && id == b.intValue()) {
                            break;
                        }
                    }
                    standingsTableRow = (StandingsTableRow) obj3;
                } else {
                    standingsTableRow = null;
                }
                if (list != null) {
                    Iterator it4 = list.iterator();
                    loop5: while (true) {
                        if (!it4.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it4.next();
                        List<StandingsTableRow> rows = ((StandingsTable) obj2).getRows();
                        if (rows == null || !rows.isEmpty()) {
                            Iterator it5 = rows.iterator();
                            while (it5.hasNext()) {
                                int id2 = ((StandingsTableRow) it5.next()).getTeam().getId();
                                if (b != null && id2 == b.intValue()) {
                                    break loop5;
                                }
                            }
                        }
                    }
                    StandingsTable standingsTable = (StandingsTable) obj2;
                    if (standingsTable != null && (tournament = standingsTable.getTournament()) != null) {
                        str2 = tournament.getGroupName();
                        if (av4Var == null) {
                            this.H = null;
                            this.r = str;
                            this.s = b;
                            this.t = av4Var3;
                            this.u = null;
                            this.v = standingsTableRow;
                            this.w = str2;
                            this.C = i4;
                            this.D = i2;
                            this.G = 3;
                            T = av4Var.T(this);
                            if (T != lu3Var) {
                                standingsTableRow3 = standingsTableRow;
                                i9 = i4;
                                av4Var5 = av4Var3;
                                list2 = (List) T;
                                av4 av4Var6 = av4Var5;
                                str3 = str2;
                                av4Var4 = av4Var6;
                                num = b;
                                standingsTableRow2 = standingsTableRow3;
                                i6 = i9;
                                if (list2 != null) {
                                }
                                if (list2 != null) {
                                }
                                int i16 = i6;
                                i7 = i2;
                                i8 = i16;
                                str4 = str;
                                str5 = str3;
                                iflVar = null;
                                num2 = num;
                                kp5 kp5Var = sfl.f;
                                ArrayList arrayList2 = new ArrayList(k13.r(kp5Var, 10));
                                it = kp5Var.iterator();
                                while (it.hasNext()) {
                                }
                                qklVar = qklVar2;
                                z = true;
                                W = l6g.W(arrayList2);
                                long w2 = yaa.w();
                                yea yeaVar = j58.a;
                                WorldCupTimeline h = j58.h();
                                if (w2 < yid.n(h == null ? new Long(h.getMyTeamCollapsable()) : null)) {
                                }
                                B = fn0.B("world_cup_widget_enabled");
                                team = null;
                                team3 = null;
                                if (av4Var4 != null) {
                                }
                                i11 = i8;
                                gv9Var4 = gv9Var;
                                gv9Var5 = W;
                                i12 = i10;
                                z3 = B;
                                team2 = team;
                                obj5 = team;
                                ifl iflVar2 = iflVar;
                                agl aglVar2 = new agl(num2, str4, tba.p(qklVar.i(), team2), wba.w(str5), standingsTableRow2 == null ? standingsTableRow2.getPosition() : 0, (standingsTableRow2 != null || (points = standingsTableRow2.getPoints()) == null) ? 0 : points.intValue());
                                Object Y = CollectionsKt.Y(sfl.f);
                                if (i11 != 0) {
                                }
                                Y = obj5;
                                sfl sflVar = (sfl) Y;
                                if (gv9Var4 == null) {
                                }
                                gv9 gv9Var6 = gv9Var4;
                                if (i12 == 0) {
                                }
                                rfl rflVar2 = new rfl(gv9Var5, r21, z3, sflVar, aglVar2, gv9Var6, null, null, iflVar2);
                                oil oilVar = (oil) qklVar.l().a();
                                if (oilVar == null) {
                                }
                                if (r9 != null) {
                                }
                            }
                            return lu3Var;
                        }
                        av4 av4Var7 = av4Var3;
                        str3 = str2;
                        av4Var4 = av4Var7;
                        list2 = null;
                        num = b;
                        standingsTableRow2 = standingsTableRow;
                        i6 = i4;
                        if (list2 != null) {
                        }
                        if (list2 != null) {
                        }
                        int i162 = i6;
                        i7 = i2;
                        i8 = i162;
                        str4 = str;
                        str5 = str3;
                        iflVar = null;
                        num2 = num;
                        kp5 kp5Var2 = sfl.f;
                        ArrayList arrayList22 = new ArrayList(k13.r(kp5Var2, 10));
                        it = kp5Var2.iterator();
                        while (it.hasNext()) {
                        }
                        qklVar = qklVar2;
                        z = true;
                        W = l6g.W(arrayList22);
                        long w22 = yaa.w();
                        yea yeaVar2 = j58.a;
                        WorldCupTimeline h2 = j58.h();
                        if (w22 < yid.n(h2 == null ? new Long(h2.getMyTeamCollapsable()) : null)) {
                        }
                        B = fn0.B("world_cup_widget_enabled");
                        team = null;
                        team3 = null;
                        if (av4Var4 != null) {
                        }
                        i11 = i8;
                        gv9Var4 = gv9Var;
                        gv9Var5 = W;
                        i12 = i10;
                        z3 = B;
                        team2 = team;
                        obj5 = team;
                        ifl iflVar22 = iflVar;
                        agl aglVar22 = new agl(num2, str4, tba.p(qklVar.i(), team2), wba.w(str5), standingsTableRow2 == null ? standingsTableRow2.getPosition() : 0, (standingsTableRow2 != null || (points = standingsTableRow2.getPoints()) == null) ? 0 : points.intValue());
                        Object Y2 = CollectionsKt.Y(sfl.f);
                        if (i11 != 0) {
                        }
                        Y2 = obj5;
                        sfl sflVar2 = (sfl) Y2;
                        if (gv9Var4 == null) {
                        }
                        gv9 gv9Var62 = gv9Var4;
                        if (i12 == 0) {
                        }
                        rfl rflVar22 = new rfl(gv9Var5, r21, z3, sflVar2, aglVar22, gv9Var62, null, null, iflVar22);
                        oil oilVar2 = (oil) qklVar.l().a();
                        if (oilVar2 == null) {
                        }
                        if (r9 != null) {
                        }
                    }
                }
                str2 = null;
                if (av4Var == null) {
                }
            } else {
                av4 av4Var8 = av4Var;
                i = i2;
                p2 = av4Var8;
                p = av4Var2;
                i3 = i5;
                int i17 = i;
                av4Var = p2;
                i2 = i17;
                list = null;
                av4Var3 = p;
                i4 = i3;
                if (list != null) {
                }
                if (list != null) {
                }
                str2 = null;
                if (av4Var == null) {
                }
            }
        } else if (i14 == 3) {
            i2 = this.D;
            int i18 = this.C;
            String str7 = this.w;
            standingsTableRow3 = this.v;
            ?? r82 = this.t;
            b = this.s;
            str = this.r;
            y6a.M(obj);
            str2 = str7;
            T = obj;
            i9 = i18;
            av4Var5 = r82;
            list2 = (List) T;
            av4 av4Var62 = av4Var5;
            str3 = str2;
            av4Var4 = av4Var62;
            num = b;
            standingsTableRow2 = standingsTableRow3;
            i6 = i9;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
                for (Event event2 : list2) {
                    wn1 R = gz8.R(qklVar2.i(), event2, true);
                    r9k w3 = wba.w(event2.getTournament().getGroupName());
                    Regex regex = c7g.a;
                    Round roundInfo = event2.getRoundInfo();
                    r9k a = c7g.a(roundInfo != null ? roundInfo.getName() : null, event2.getSportSlug());
                    Venue venue = event2.getVenue();
                    if (venue == null || (city = venue.getCity()) == null || (str6 = city.getName()) == null) {
                        str6 = "";
                    }
                    arrayList3.add(new xel(R, w3, a, str6, null, false, false, null));
                }
                gv9Var = l6g.W(arrayList3);
            } else {
                gv9Var = null;
            }
            if (list2 != null) {
                Iterator it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it6.next();
                    if (!ok3.C((Event) obj4)) {
                        break;
                    }
                }
                event = (Event) obj4;
                if (event != null) {
                    s96 s96Var = qklVar2.p;
                    this.H = null;
                    this.r = str;
                    this.s = num;
                    this.t = av4Var4;
                    this.u = null;
                    this.v = standingsTableRow2;
                    this.w = str3;
                    this.x = gv9Var;
                    this.y = event;
                    this.C = i6;
                    this.D = i2;
                    this.E = 0;
                    this.G = 4;
                    p3 = s96Var.p(event, this);
                    i13 = i6;
                }
            }
            int i1622 = i6;
            i7 = i2;
            i8 = i1622;
            str4 = str;
            str5 = str3;
            iflVar = null;
            num2 = num;
            kp5 kp5Var22 = sfl.f;
            ArrayList arrayList222 = new ArrayList(k13.r(kp5Var22, 10));
            it = kp5Var22.iterator();
            while (it.hasNext()) {
            }
            qklVar = qklVar2;
            z = true;
            W = l6g.W(arrayList222);
            long w222 = yaa.w();
            yea yeaVar22 = j58.a;
            WorldCupTimeline h22 = j58.h();
            if (w222 < yid.n(h22 == null ? new Long(h22.getMyTeamCollapsable()) : null)) {
            }
            B = fn0.B("world_cup_widget_enabled");
            team = null;
            team3 = null;
            if (av4Var4 != null) {
            }
            i11 = i8;
            gv9Var4 = gv9Var;
            gv9Var5 = W;
            i12 = i10;
            z3 = B;
            team2 = team;
            obj5 = team;
            ifl iflVar222 = iflVar;
            agl aglVar222 = new agl(num2, str4, tba.p(qklVar.i(), team2), wba.w(str5), standingsTableRow2 == null ? standingsTableRow2.getPosition() : 0, (standingsTableRow2 != null || (points = standingsTableRow2.getPoints()) == null) ? 0 : points.intValue());
            Object Y22 = CollectionsKt.Y(sfl.f);
            if (i11 != 0) {
            }
            Y22 = obj5;
            sfl sflVar22 = (sfl) Y22;
            if (gv9Var4 == null) {
            }
            gv9 gv9Var622 = gv9Var4;
            if (i12 == 0) {
            }
            rfl rflVar222 = new rfl(gv9Var5, r21, z3, sflVar22, aglVar222, gv9Var622, null, null, iflVar222);
            oil oilVar22 = (oil) qklVar.l().a();
            if (oilVar22 == null) {
            }
            if (r9 != null) {
            }
        } else if (i14 == 4) {
            i2 = this.D;
            int i19 = this.C;
            event = (Event) this.y;
            gv9Var = this.x;
            str3 = this.w;
            standingsTableRow2 = this.v;
            ?? r14 = this.t;
            num = this.s;
            String str8 = this.r;
            y6a.M(obj);
            av4Var4 = r14;
            str = str8;
            p3 = obj;
            i13 = i19;
            LineupsResponse lineupsResponse = (LineupsResponse) p3;
            int id3 = Event.getHomeTeam$default(event, null, 1, null).getId();
            if (num != null && id3 == num.intValue()) {
                if (lineupsResponse != null && (homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)) != null && (missingPlayers2 = homeLineups$default.getMissingPlayers()) != null) {
                    String f02 = CollectionsKt.f0(missingPlayers2, ", ", null, null, new pcl(17), 30);
                    if (f02.length() > 0) {
                        f0 = f02;
                        ifl iflVar3 = new ifl(event.getId(), f0);
                        int i20 = i13;
                        i7 = i2;
                        i8 = i20;
                        String str9 = str3;
                        iflVar = iflVar3;
                        str4 = str;
                        str5 = str9;
                        num2 = num;
                        kp5 kp5Var222 = sfl.f;
                        ArrayList arrayList2222 = new ArrayList(k13.r(kp5Var222, 10));
                        it = kp5Var222.iterator();
                        while (it.hasNext()) {
                            sfl sflVar3 = (sfl) it.next();
                            Iterator it7 = it;
                            qkl qklVar3 = qklVar2;
                            String string = qklVar2.i().getString(sflVar3.a);
                            string.getClass();
                            arrayList2222.add(new s1h(sflVar3, string, !(str4 == null || str4.length() == 0)));
                            it = it7;
                            qklVar2 = qklVar3;
                        }
                        qklVar = qklVar2;
                        z = true;
                        W = l6g.W(arrayList2222);
                        long w2222 = yaa.w();
                        yea yeaVar222 = j58.a;
                        WorldCupTimeline h222 = j58.h();
                        i10 = w2222 < yid.n(h222 == null ? new Long(h222.getMyTeamCollapsable()) : null) ? 1 : 0;
                        B = fn0.B("world_cup_widget_enabled");
                        team = null;
                        team3 = null;
                        if (av4Var4 != null) {
                            this.H = null;
                            this.r = null;
                            this.s = null;
                            this.t = null;
                            this.u = null;
                            this.v = standingsTableRow2;
                            this.w = str5;
                            this.x = gv9Var;
                            this.y = iflVar;
                            this.z = W;
                            this.A = num2;
                            this.B = str4;
                            this.C = i8;
                            this.D = i7;
                            this.E = i10;
                            this.F = B;
                            this.G = 5;
                            T2 = av4Var4.T(this);
                            if (T2 != lu3Var) {
                                gv9Var2 = gv9Var;
                                gv9Var3 = W;
                                i11 = i8;
                                i12 = i10;
                                z2 = B;
                                teamDetailsResponse = (TeamDetailsResponse) T2;
                                if (teamDetailsResponse == null) {
                                }
                            }
                            return lu3Var;
                        }
                        i11 = i8;
                        gv9Var4 = gv9Var;
                        gv9Var5 = W;
                        i12 = i10;
                        z3 = B;
                        team2 = team;
                        obj5 = team;
                    }
                }
                f0 = null;
                ifl iflVar32 = new ifl(event.getId(), f0);
                int i202 = i13;
                i7 = i2;
                i8 = i202;
                String str92 = str3;
                iflVar = iflVar32;
                str4 = str;
                str5 = str92;
                num2 = num;
                kp5 kp5Var2222 = sfl.f;
                ArrayList arrayList22222 = new ArrayList(k13.r(kp5Var2222, 10));
                it = kp5Var2222.iterator();
                while (it.hasNext()) {
                }
                qklVar = qklVar2;
                z = true;
                W = l6g.W(arrayList22222);
                long w22222 = yaa.w();
                yea yeaVar2222 = j58.a;
                WorldCupTimeline h2222 = j58.h();
                if (w22222 < yid.n(h2222 == null ? new Long(h2222.getMyTeamCollapsable()) : null)) {
                }
                B = fn0.B("world_cup_widget_enabled");
                team = null;
                team3 = null;
                if (av4Var4 != null) {
                }
                i11 = i8;
                gv9Var4 = gv9Var;
                gv9Var5 = W;
                i12 = i10;
                z3 = B;
                team2 = team;
                obj5 = team;
            } else {
                if (lineupsResponse != null && (awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)) != null && (missingPlayers = awayLineups$default.getMissingPlayers()) != null) {
                    f0 = CollectionsKt.f0(missingPlayers, ", ", null, null, new pcl(18), 30);
                }
                f0 = null;
                ifl iflVar322 = new ifl(event.getId(), f0);
                int i2022 = i13;
                i7 = i2;
                i8 = i2022;
                String str922 = str3;
                iflVar = iflVar322;
                str4 = str;
                str5 = str922;
                num2 = num;
                kp5 kp5Var22222 = sfl.f;
                ArrayList arrayList222222 = new ArrayList(k13.r(kp5Var22222, 10));
                it = kp5Var22222.iterator();
                while (it.hasNext()) {
                }
                qklVar = qklVar2;
                z = true;
                W = l6g.W(arrayList222222);
                long w222222 = yaa.w();
                yea yeaVar22222 = j58.a;
                WorldCupTimeline h22222 = j58.h();
                if (w222222 < yid.n(h22222 == null ? new Long(h22222.getMyTeamCollapsable()) : null)) {
                }
                B = fn0.B("world_cup_widget_enabled");
                team = null;
                team3 = null;
                if (av4Var4 != null) {
                }
                i11 = i8;
                gv9Var4 = gv9Var;
                gv9Var5 = W;
                i12 = i10;
                z3 = B;
                team2 = team;
                obj5 = team;
            }
            ifl iflVar2222 = iflVar;
            agl aglVar2222 = new agl(num2, str4, tba.p(qklVar.i(), team2), wba.w(str5), standingsTableRow2 == null ? standingsTableRow2.getPosition() : 0, (standingsTableRow2 != null || (points = standingsTableRow2.getPoints()) == null) ? 0 : points.intValue());
            Object Y222 = CollectionsKt.Y(sfl.f);
            if (i11 != 0) {
            }
            Y222 = obj5;
            sfl sflVar222 = (sfl) Y222;
            if (gv9Var4 == null) {
            }
            gv9 gv9Var6222 = gv9Var4;
            if (i12 == 0) {
            }
            rfl rflVar2222 = new rfl(gv9Var5, r21, z3, sflVar222, aglVar2222, gv9Var6222, null, null, iflVar2222);
            oil oilVar222 = (oil) qklVar.l().a();
            if (oilVar222 == null) {
            }
            if (r9 != null) {
            }
        } else {
            if (i14 != 5) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = this.F;
            i12 = this.E;
            i7 = this.D;
            i11 = this.C;
            str4 = this.B;
            num2 = this.A;
            gv9Var3 = this.z;
            iflVar = (ifl) this.y;
            gv9 gv9Var7 = this.x;
            str5 = this.w;
            StandingsTableRow standingsTableRow4 = this.v;
            y6a.M(obj);
            qklVar = qklVar2;
            z = true;
            gv9Var2 = gv9Var7;
            standingsTableRow2 = standingsTableRow4;
            T2 = obj;
            teamDetailsResponse = (TeamDetailsResponse) T2;
            if (teamDetailsResponse == null) {
                gv9 gv9Var8 = gv9Var2;
                team2 = teamDetailsResponse.getTeam();
                gv9Var4 = gv9Var8;
                z3 = z2;
                gv9Var5 = gv9Var3;
                obj5 = team3;
                ifl iflVar22222 = iflVar;
                agl aglVar22222 = new agl(num2, str4, tba.p(qklVar.i(), team2), wba.w(str5), standingsTableRow2 == null ? standingsTableRow2.getPosition() : 0, (standingsTableRow2 != null || (points = standingsTableRow2.getPoints()) == null) ? 0 : points.intValue());
                Object Y2222 = CollectionsKt.Y(sfl.f);
                if (i11 != 0 || i7 == 0) {
                    Y2222 = obj5;
                }
                sfl sflVar2222 = (sfl) Y2222;
                if (gv9Var4 == null) {
                    gv9Var4 = rlh.b;
                }
                gv9 gv9Var62222 = gv9Var4;
                boolean z4 = i12 == 0 ? z : false;
                rfl rflVar22222 = new rfl(gv9Var5, z4, z3, sflVar2222, aglVar22222, gv9Var62222, null, null, iflVar22222);
                oil oilVar2222 = (oil) qklVar.l().a();
                r9 = oilVar2222 == null ? oilVar2222.g : obj5;
                if (r9 != null) {
                    return rflVar22222;
                }
                if (i7 != 0) {
                    obj5 = sflVar2222;
                }
                if (obj5 == null) {
                    obj5 = r9.d;
                }
                return new rfl(gv9Var5, z4, z3, obj5, aglVar22222, gv9Var62222, i7 == 0 ? r9.g : null, i7 == 0 ? r9.h : null, iflVar22222);
            }
            gv9 gv9Var9 = gv9Var2;
            W = gv9Var3;
            gv9Var = gv9Var9;
            B = z2;
            i10 = i12;
            i8 = i11;
            team = team3;
            i11 = i8;
            gv9Var4 = gv9Var;
            gv9Var5 = W;
            i12 = i10;
            z3 = B;
            team2 = team;
            obj5 = team;
            ifl iflVar222222 = iflVar;
            agl aglVar222222 = new agl(num2, str4, tba.p(qklVar.i(), team2), wba.w(str5), standingsTableRow2 == null ? standingsTableRow2.getPosition() : 0, (standingsTableRow2 != null || (points = standingsTableRow2.getPoints()) == null) ? 0 : points.intValue());
            Object Y22222 = CollectionsKt.Y(sfl.f);
            if (i11 != 0) {
            }
            Y22222 = obj5;
            sfl sflVar22222 = (sfl) Y22222;
            if (gv9Var4 == null) {
            }
            gv9 gv9Var622222 = gv9Var4;
            if (i12 == 0) {
            }
            rfl rflVar222222 = new rfl(gv9Var5, z4, z3, sflVar22222, aglVar222222, gv9Var622222, null, null, iflVar222222);
            oil oilVar22222 = (oil) qklVar.l().a();
            if (oilVar22222 == null) {
            }
            if (r9 != null) {
            }
        }
        str = (String) A;
        vel velVar = vel.a;
        b = vel.b(str);
        ?? r3 = b != null ? 1 : 0;
        oil oilVar3 = (oil) qklVar2.l().a();
        i = !Intrinsics.c(str, (oilVar3 == null || (rflVar = oilVar3.g) == null || (aglVar = rflVar.e) == null) ? null : aglVar.b) ? 1 : 0;
        p = yaa.p(ku3Var, r3, new vjl(qklVar2, b, null, 1));
        av4 p4 = yaa.p(ku3Var, r3, new njl(qklVar2, null, 7));
        p2 = yaa.p(ku3Var, r3, new vjl(qklVar2, b, null, 0));
        i3 = r3;
        if (p4 != null) {
            this.H = null;
            this.r = str;
            this.s = b;
            this.t = p;
            this.u = p2;
            this.C = r3;
            this.D = i;
            this.G = 2;
            w = p4.w(this);
            if (w != lu3Var) {
                av4Var = p2;
                i2 = i;
                av4Var2 = p;
                i5 = r3;
                standingsResponse = (StandingsResponse) w;
                if (standingsResponse == null) {
                }
            }
            return lu3Var;
        }
        int i172 = i;
        av4Var = p2;
        i2 = i172;
        list = null;
        av4Var3 = p;
        i4 = i3;
        if (list != null) {
        }
        if (list != null) {
        }
        str2 = null;
        if (av4Var == null) {
        }
    }
}
