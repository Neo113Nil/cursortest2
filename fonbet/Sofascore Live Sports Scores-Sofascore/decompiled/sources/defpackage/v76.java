package defpackage;

import com.ironsource.mediationsdk.j;
import com.sofascore.model.database.DbEvent;
import com.sofascore.model.database.DbEventAll;
import com.sofascore.model.database.DbEventScore;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderTypeConverter;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v76 {
    public final k6g a;
    public final q76 b;
    public final sz8 c = new sz8(16);
    public final q76 d;
    public final s82 e;
    public final r76 f;
    public final fp4 g;
    public final fp4 h;

    public v76(k6g k6gVar) {
        this.a = k6gVar;
        int i = 0;
        this.b = new q76(this, i);
        int i2 = 1;
        this.d = new q76(this, i2);
        int i3 = 3;
        this.e = new s82(i3);
        this.f = new r76(this, i);
        int i4 = 2;
        q76 q76Var = new q76(this, i4);
        r76 r76Var = new r76(this, i2);
        int i5 = 11;
        this.g = new fp4(i5, q76Var, r76Var);
        this.h = new fp4(i5, new q76(this, i3), new r76(this, i4));
    }

    public static String a(ServerType serverType) {
        switch (s76.b[serverType.ordinal()]) {
            case 1:
                return "SPORT";
            case 2:
                return "SEASON";
            case 3:
                return "EVENT";
            case 4:
                return "PRACTICE";
            case 5:
                return "QUALIFYING";
            case 6:
                return "QUALIFYING_PART";
            case 7:
                return "RACE";
            case 8:
                return "LAP";
            case 9:
                return "STAGE";
            case 10:
                return "PROLOGUE";
            case 11:
                return "SPRINT";
            case 12:
                return "DISCIPLINE";
            case 13:
                return "SPRINT_QUALIFYING";
            case 14:
                return "SPRINT_QUALIFYING_PART";
            case 15:
                return "PRACTICE_PART";
            case 16:
                return "DAY";
            case 17:
                return "AFTER_STAGE";
            case 18:
                return "CYCLING_OVERALL";
            case 19:
                return j.f;
            default:
                zzl.b();
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static ServerType b(String str) {
        switch (str.hashCode()) {
            case -1853006109:
                if (str.equals("SEASON")) {
                    return ServerType.SEASON;
                }
                break;
            case -1842350566:
                if (str.equals("SPRINT")) {
                    return ServerType.SPRINT;
                }
                break;
            case -1007507368:
                if (str.equals("SPRINT_QUALIFYING_PART")) {
                    return ServerType.SPRINT_QUALIFYING_PART;
                }
                break;
            case -656408933:
                if (str.equals("AFTER_STAGE")) {
                    return ServerType.AFTER_STAGE;
                }
                break;
            case -622890693:
                if (str.equals("PRACTICE")) {
                    return ServerType.PRACTICE;
                }
                break;
            case -213921209:
                if (str.equals("PROLOGUE")) {
                    return ServerType.PROLOGUE;
                }
                break;
            case 67452:
                if (str.equals("DAY")) {
                    return ServerType.DAY;
                }
                break;
            case 75131:
                if (str.equals("LAP")) {
                    return ServerType.LAP;
                }
                break;
            case 2507473:
                if (str.equals("RACE")) {
                    return ServerType.RACE;
                }
                break;
            case 66353786:
                if (str.equals("EVENT")) {
                    return ServerType.EVENT;
                }
                break;
            case 79114068:
                if (str.equals("SPORT")) {
                    return ServerType.SPORT;
                }
                break;
            case 79219422:
                if (str.equals("STAGE")) {
                    return ServerType.STAGE;
                }
                break;
            case 454124917:
                if (str.equals("QUALIFYING")) {
                    return ServerType.QUALIFYING;
                }
                break;
            case 845514608:
                if (str.equals("DISCIPLINE")) {
                    return ServerType.DISCIPLINE;
                }
                break;
            case 946945009:
                if (str.equals("CYCLING_OVERALL")) {
                    return ServerType.CYCLING_OVERALL;
                }
                break;
            case 1309462653:
                if (str.equals("QUALIFYING_PART")) {
                    return ServerType.QUALIFYING_PART;
                }
                break;
            case 1445802103:
                if (str.equals("PRACTICE_PART")) {
                    return ServerType.PRACTICE_PART;
                }
                break;
            case 1666502842:
                if (str.equals("SPRINT_QUALIFYING")) {
                    return ServerType.SPRINT_QUALIFYING;
                }
                break;
            case 1999208305:
                if (str.equals(j.f)) {
                    return ServerType.CUSTOM;
                }
                break;
        }
        a70.p("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
    
        if (r12 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (r15 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r15 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(v76 v76Var, long j, sq3 sq3Var) {
        x66 x66Var;
        Object obj;
        int i;
        Object U;
        v76 v76Var2;
        long j2;
        Object U2;
        if (sq3Var instanceof x66) {
            x66Var = (x66) sq3Var;
            int i2 = x66Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x66Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = x66Var.t;
                obj = lu3.a;
                i = x66Var.v;
                if (i != 0) {
                    y6a.M(obj2);
                    x66Var.r = v76Var;
                    x66Var.s = j;
                    x66Var.v = 1;
                    Object U3 = gz8.U(x66Var, v76Var.a, false, true, new yz(j, 19));
                    if (U3 != obj) {
                        U3 = Unit.a;
                    }
                } else if (i == 1) {
                    j = x66Var.s;
                    v76Var = x66Var.r;
                    y6a.M(obj2);
                } else if (i == 2) {
                    j2 = x66Var.s;
                    v76Var2 = x66Var.r;
                    y6a.M(obj2);
                    x66Var.r = v76Var2;
                    x66Var.s = j2;
                    x66Var.v = 3;
                    U2 = gz8.U(x66Var, v76Var2.a, false, true, new au5(17));
                    if (U2 != obj) {
                        U2 = Unit.a;
                    }
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            y6a.M(obj2);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = x66Var.s;
                    v76Var2 = x66Var.r;
                    y6a.M(obj2);
                    x66Var.r = null;
                    x66Var.s = j2;
                    x66Var.v = 4;
                    Object U4 = gz8.U(x66Var, v76Var2.a, false, true, new au5(16));
                    if (U4 != obj) {
                        U4 = Unit.a;
                    }
                }
                x66Var.r = v76Var;
                x66Var.s = j;
                x66Var.v = 2;
                U = gz8.U(x66Var, v76Var.a, false, true, new au5(21));
                if (U != obj) {
                    U = Unit.a;
                }
                if (U != obj) {
                    v76Var2 = v76Var;
                    j2 = j;
                    x66Var.r = v76Var2;
                    x66Var.s = j2;
                    x66Var.v = 3;
                    U2 = gz8.U(x66Var, v76Var2.a, false, true, new au5(17));
                    if (U2 != obj) {
                    }
                }
                return obj;
            }
        }
        x66Var = new x66(v76Var, sq3Var);
        Object obj22 = x66Var.t;
        obj = lu3.a;
        i = x66Var.v;
        if (i != 0) {
        }
        x66Var.r = v76Var;
        x66Var.s = j;
        x66Var.v = 2;
        U = gz8.U(x66Var, v76Var.a, false, true, new au5(21));
        if (U != obj) {
        }
        if (U != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0124, code lost:
    
        if (r1 != r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object h(v76 v76Var, DbEventAll dbEventAll, sq3 sq3Var) {
        b76 b76Var;
        lu3 lu3Var;
        int i;
        Team homeTeam;
        DbEventAll dbEventAll2;
        DbEventScore dbEventScore;
        int i2;
        Team team;
        int i3;
        Team team2;
        DbEventScore dbEventScore2;
        v76 v76Var2;
        int i4;
        DbEventScore dbEventScore3;
        DbEventAll dbEventAll3;
        v76 v76Var3;
        int i5;
        v76 v76Var4 = v76Var;
        if (sq3Var instanceof b76) {
            b76Var = (b76) sq3Var;
            int i6 = b76Var.B;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                b76Var.B = i6 - Integer.MIN_VALUE;
                Object obj = b76Var.z;
                lu3Var = lu3.a;
                i = b76Var.B;
                int i7 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    Tournament tournament = dbEventAll.getTournament();
                    homeTeam = dbEventAll.getHomeTeam();
                    Team awayTeam = dbEventAll.getAwayTeam();
                    DbEventScore score = dbEventAll.getScore();
                    if (tournament == null || homeTeam == null || awayTeam == null || score == null) {
                        return Boolean.FALSE;
                    }
                    b76Var.r = v76Var4;
                    dbEventAll2 = dbEventAll;
                    b76Var.s = dbEventAll2;
                    b76Var.t = score;
                    b76Var.u = awayTeam;
                    b76Var.v = homeTeam;
                    b76Var.w = 0;
                    b76Var.x = 0;
                    b76Var.B = 1;
                    Object U = gz8.U(b76Var, v76Var4.a, false, true, new xw5(16, v76Var4, tournament));
                    if (U != lu3Var) {
                        U = Unit.a;
                    }
                    if (U != lu3Var) {
                        dbEventScore = score;
                        i2 = 0;
                        team = awayTeam;
                        i3 = 0;
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    int i8 = b76Var.x;
                    i3 = b76Var.w;
                    homeTeam = b76Var.v;
                    Team team3 = b76Var.u;
                    dbEventScore = b76Var.t;
                    DbEventAll dbEventAll4 = b76Var.s;
                    v76 v76Var5 = b76Var.r;
                    y6a.M(obj);
                    i2 = i8;
                    v76Var4 = v76Var5;
                    team = team3;
                    dbEventAll2 = dbEventAll4;
                } else {
                    if (i == 2) {
                        i4 = b76Var.x;
                        i3 = b76Var.w;
                        team2 = b76Var.u;
                        dbEventScore2 = b76Var.t;
                        dbEventAll2 = b76Var.s;
                        v76Var2 = b76Var.r;
                        y6a.M(obj);
                        b76Var.r = v76Var2;
                        b76Var.s = dbEventAll2;
                        b76Var.t = dbEventScore2;
                        b76Var.u = null;
                        b76Var.v = null;
                        b76Var.w = i3;
                        b76Var.x = i4;
                        b76Var.B = 3;
                        if (v76Var2.l(team2, b76Var) != lu3Var) {
                            dbEventScore3 = dbEventScore2;
                            dbEventAll3 = dbEventAll2;
                            v76Var3 = v76Var2;
                            DbEvent event = dbEventAll3.getEvent();
                            b76Var.r = v76Var3;
                            b76Var.s = null;
                            b76Var.t = dbEventScore3;
                            b76Var.u = null;
                            b76Var.v = null;
                            b76Var.w = i3;
                            b76Var.x = i4;
                            b76Var.B = 4;
                            obj = gz8.U(b76Var, v76Var3.a, false, true, new m76(v76Var3, event, i7));
                        }
                        return lu3Var;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i5 = b76Var.y;
                            y6a.M(obj);
                            return Boolean.valueOf(i5 != 0);
                        }
                        i4 = b76Var.x;
                        i3 = b76Var.w;
                        dbEventScore3 = b76Var.t;
                        v76Var3 = b76Var.r;
                        y6a.M(obj);
                        int i9 = ((Number) obj).longValue() != -1 ? 1 : 0;
                        b76Var.r = null;
                        b76Var.s = null;
                        b76Var.t = null;
                        b76Var.u = null;
                        b76Var.v = null;
                        b76Var.w = i3;
                        b76Var.x = i4;
                        b76Var.y = i9;
                        b76Var.B = 5;
                        Object U2 = gz8.U(b76Var, v76Var3.a, false, true, new xw5(17, v76Var3, dbEventScore3));
                        if (U2 != lu3Var) {
                            U2 = Unit.a;
                        }
                        if (U2 != lu3Var) {
                            i5 = i9;
                            return Boolean.valueOf(i5 != 0);
                        }
                        return lu3Var;
                    }
                    i4 = b76Var.x;
                    i3 = b76Var.w;
                    DbEventScore dbEventScore4 = b76Var.t;
                    dbEventAll3 = b76Var.s;
                    v76 v76Var6 = b76Var.r;
                    y6a.M(obj);
                    dbEventScore3 = dbEventScore4;
                    v76Var3 = v76Var6;
                    DbEvent event2 = dbEventAll3.getEvent();
                    b76Var.r = v76Var3;
                    b76Var.s = null;
                    b76Var.t = dbEventScore3;
                    b76Var.u = null;
                    b76Var.v = null;
                    b76Var.w = i3;
                    b76Var.x = i4;
                    b76Var.B = 4;
                    obj = gz8.U(b76Var, v76Var3.a, false, true, new m76(v76Var3, event2, i7));
                }
                b76Var.r = v76Var4;
                b76Var.s = dbEventAll2;
                b76Var.t = dbEventScore;
                b76Var.u = team;
                b76Var.v = null;
                b76Var.w = i3;
                b76Var.x = i2;
                b76Var.B = 2;
                if (v76Var4.l(homeTeam, b76Var) != lu3Var) {
                    team2 = team;
                    dbEventScore2 = dbEventScore;
                    v76Var2 = v76Var4;
                    i4 = i2;
                    b76Var.r = v76Var2;
                    b76Var.s = dbEventAll2;
                    b76Var.t = dbEventScore2;
                    b76Var.u = null;
                    b76Var.v = null;
                    b76Var.w = i3;
                    b76Var.x = i4;
                    b76Var.B = 3;
                    if (v76Var2.l(team2, b76Var) != lu3Var) {
                    }
                }
                return lu3Var;
            }
        }
        b76Var = new b76(v76Var4, sq3Var);
        Object obj2 = b76Var.z;
        lu3Var = lu3.a;
        i = b76Var.B;
        int i72 = 1;
        if (i != 0) {
        }
        b76Var.r = v76Var4;
        b76Var.s = dbEventAll2;
        b76Var.t = dbEventScore;
        b76Var.u = team;
        b76Var.v = null;
        b76Var.w = i3;
        b76Var.x = i2;
        b76Var.B = 2;
        if (v76Var4.l(homeTeam, b76Var) != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x010a, code lost:
    
        if (r14 != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r15 == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object i(v76 v76Var, int i, sq3 sq3Var) {
        c76 c76Var;
        lu3 lu3Var;
        int i2;
        Object U;
        v76 v76Var2;
        int i3;
        DbEvent dbEvent;
        int i4;
        v76 v76Var3;
        DbEvent dbEvent2;
        int i5;
        int i6;
        int awayTeamId;
        v76 v76Var4;
        Object U2;
        if (sq3Var instanceof c76) {
            c76Var = (c76) sq3Var;
            int i7 = c76Var.x;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c76Var.x = i7 - Integer.MIN_VALUE;
                Object obj = c76Var.v;
                lu3Var = lu3.a;
                i2 = c76Var.x;
                int i8 = 13;
                int i9 = 4;
                int i10 = 2;
                Object[] objArr = 0;
                if (i2 != 0) {
                    y6a.M(obj);
                    c76Var.r = v76Var;
                    c76Var.t = i;
                    c76Var.x = 1;
                    obj = gz8.U(c76Var, v76Var.a, true, false, new i76(i, v76Var, objArr == true ? 1 : 0));
                } else if (i2 == 1) {
                    i = c76Var.t;
                    v76Var = c76Var.r;
                    y6a.M(obj);
                } else {
                    if (i2 == 2) {
                        i3 = c76Var.t;
                        dbEvent = c76Var.s;
                        v76Var2 = c76Var.r;
                        y6a.M(obj);
                        i4 = ((Number) obj).intValue() <= 0 ? 1 : 0;
                        if (dbEvent != null) {
                            int homeTeamId = dbEvent.getHomeTeamId();
                            c76Var.r = v76Var2;
                            c76Var.s = dbEvent;
                            c76Var.t = i3;
                            c76Var.u = i4;
                            c76Var.x = 3;
                            if (gz8.U(c76Var, v76Var2.a, false, true, new q13(homeTeamId, i8)) != lu3Var) {
                                v76Var3 = v76Var2;
                                dbEvent2 = dbEvent;
                                i5 = i3;
                                i6 = i4;
                                awayTeamId = dbEvent2.getAwayTeamId();
                                c76Var.r = v76Var3;
                                c76Var.s = dbEvent2;
                                c76Var.t = i5;
                                c76Var.u = i6;
                                c76Var.x = 4;
                                if (gz8.U(c76Var, v76Var3.a, false, true, new q13(awayTeamId, i8)) != lu3Var) {
                                }
                            }
                            return lu3Var;
                        }
                        return Boolean.valueOf(i4 != 0);
                    }
                    if (i2 == 3) {
                        i6 = c76Var.u;
                        i5 = c76Var.t;
                        dbEvent2 = c76Var.s;
                        v76Var3 = c76Var.r;
                        y6a.M(obj);
                        awayTeamId = dbEvent2.getAwayTeamId();
                        c76Var.r = v76Var3;
                        c76Var.s = dbEvent2;
                        c76Var.t = i5;
                        c76Var.u = i6;
                        c76Var.x = 4;
                        if (gz8.U(c76Var, v76Var3.a, false, true, new q13(awayTeamId, i8)) != lu3Var) {
                            v76Var4 = v76Var3;
                            int tournamentId = dbEvent2.getTournamentId();
                            c76Var.r = null;
                            c76Var.s = null;
                            c76Var.t = i5;
                            c76Var.u = i6;
                            c76Var.x = 5;
                            U2 = gz8.U(c76Var, v76Var4.a, false, true, new q13(tournamentId, i9));
                            if (U2 != lu3Var) {
                            }
                        }
                        return lu3Var;
                    }
                    if (i2 != 4) {
                        if (i2 != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i6 = c76Var.u;
                        y6a.M(obj);
                        i4 = i6;
                        return Boolean.valueOf(i4 != 0);
                    }
                    i6 = c76Var.u;
                    i5 = c76Var.t;
                    dbEvent2 = c76Var.s;
                    v76Var4 = c76Var.r;
                    y6a.M(obj);
                    int tournamentId2 = dbEvent2.getTournamentId();
                    c76Var.r = null;
                    c76Var.s = null;
                    c76Var.t = i5;
                    c76Var.u = i6;
                    c76Var.x = 5;
                    U2 = gz8.U(c76Var, v76Var4.a, false, true, new q13(tournamentId2, i9));
                    if (U2 != lu3Var) {
                        U2 = Unit.a;
                    }
                }
                DbEvent dbEvent3 = (DbEvent) obj;
                c76Var.r = v76Var;
                c76Var.s = dbEvent3;
                c76Var.t = i;
                c76Var.x = 2;
                U = gz8.U(c76Var, v76Var.a, false, true, new q13(i, i10));
                if (U != lu3Var) {
                    v76Var2 = v76Var;
                    i3 = i;
                    dbEvent = dbEvent3;
                    obj = U;
                    if (((Number) obj).intValue() <= 0) {
                    }
                    if (dbEvent != null) {
                    }
                    return Boolean.valueOf(i4 != 0);
                }
                return lu3Var;
            }
        }
        c76Var = new c76(v76Var, sq3Var);
        Object obj2 = c76Var.v;
        lu3Var = lu3.a;
        i2 = c76Var.x;
        int i82 = 13;
        int i92 = 4;
        int i102 = 2;
        Object[] objArr2 = 0;
        if (i2 != 0) {
        }
        DbEvent dbEvent32 = (DbEvent) obj2;
        c76Var.r = v76Var;
        c76Var.s = dbEvent32;
        c76Var.t = i;
        c76Var.x = 2;
        U = gz8.U(c76Var, v76Var.a, false, true, new q13(i, i102));
        if (U != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x016e, code lost:
    
        if (r0 != r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object j(v76 v76Var, DbEventAll dbEventAll, sq3 sq3Var) {
        d76 d76Var;
        int i;
        DbEventScore dbEventScore;
        Team team;
        int i2;
        DbEventAll dbEventAll2;
        Team team2;
        int i3;
        Object U;
        Team team3;
        DbEventAll dbEventAll3;
        v76 v76Var2;
        int i4;
        Team team4;
        DbEventScore dbEventScore2;
        v76 v76Var3;
        DbEventAll dbEventAll4;
        Object U2;
        v76 v76Var4 = v76Var;
        if (sq3Var instanceof d76) {
            d76Var = (d76) sq3Var;
            int i5 = d76Var.A;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                d76Var.A = i5 - Integer.MIN_VALUE;
                Object obj = d76Var.y;
                Object obj2 = lu3.a;
                i = d76Var.A;
                int i6 = 0;
                if (i != 0) {
                    y6a.M(obj);
                    Tournament tournament = dbEventAll.getTournament();
                    Team homeTeam = dbEventAll.getHomeTeam();
                    Team awayTeam = dbEventAll.getAwayTeam();
                    DbEventScore score = dbEventAll.getScore();
                    if (tournament != null && homeTeam != null && awayTeam != null && score != null) {
                        d76Var.r = v76Var4;
                        d76Var.s = dbEventAll;
                        d76Var.t = score;
                        d76Var.u = awayTeam;
                        d76Var.v = homeTeam;
                        d76Var.w = 0;
                        d76Var.x = 0;
                        d76Var.A = 1;
                        Object U3 = gz8.U(d76Var, v76Var4.a, false, true, new xw5(16, v76Var4, tournament));
                        if (U3 != obj2) {
                            U3 = Unit.a;
                        }
                        if (U3 != obj2) {
                            dbEventScore = score;
                            team = awayTeam;
                            i2 = 0;
                            dbEventAll2 = dbEventAll;
                            team2 = homeTeam;
                            i3 = 0;
                            DbEvent event = dbEventAll2.getEvent();
                            d76Var.r = v76Var4;
                            d76Var.s = dbEventAll2;
                            d76Var.t = dbEventScore;
                            d76Var.u = team;
                            d76Var.v = team2;
                            d76Var.w = i3;
                            d76Var.x = i2;
                            d76Var.A = 2;
                            U = gz8.U(d76Var, v76Var4.a, false, true, new m76(v76Var4, event, i6));
                            if (U != obj2) {
                            }
                            if (U != obj2) {
                            }
                        }
                        return obj2;
                    }
                } else {
                    if (i == 1) {
                        int i7 = d76Var.x;
                        i3 = d76Var.w;
                        team2 = d76Var.v;
                        Team team5 = d76Var.u;
                        DbEventScore dbEventScore3 = d76Var.t;
                        dbEventAll2 = d76Var.s;
                        v76 v76Var5 = d76Var.r;
                        y6a.M(obj);
                        i2 = i7;
                        v76Var4 = v76Var5;
                        team = team5;
                        dbEventScore = dbEventScore3;
                        DbEvent event2 = dbEventAll2.getEvent();
                        d76Var.r = v76Var4;
                        d76Var.s = dbEventAll2;
                        d76Var.t = dbEventScore;
                        d76Var.u = team;
                        d76Var.v = team2;
                        d76Var.w = i3;
                        d76Var.x = i2;
                        d76Var.A = 2;
                        U = gz8.U(d76Var, v76Var4.a, false, true, new m76(v76Var4, event2, i6));
                        if (U != obj2) {
                            U = Unit.a;
                        }
                        if (U != obj2) {
                            team3 = team2;
                            dbEventAll3 = dbEventAll2;
                            v76Var2 = v76Var4;
                            i4 = i2;
                            d76Var.r = v76Var2;
                            d76Var.s = dbEventAll3;
                            d76Var.t = dbEventScore;
                            d76Var.u = team;
                            d76Var.v = null;
                            d76Var.w = i3;
                            d76Var.x = i4;
                            d76Var.A = 3;
                            if (v76Var2.l(team3, d76Var) != obj2) {
                            }
                        }
                        return obj2;
                    }
                    if (i == 2) {
                        i4 = d76Var.x;
                        i3 = d76Var.w;
                        team3 = d76Var.v;
                        Team team6 = d76Var.u;
                        dbEventScore = d76Var.t;
                        dbEventAll3 = d76Var.s;
                        v76Var2 = d76Var.r;
                        y6a.M(obj);
                        team = team6;
                        d76Var.r = v76Var2;
                        d76Var.s = dbEventAll3;
                        d76Var.t = dbEventScore;
                        d76Var.u = team;
                        d76Var.v = null;
                        d76Var.w = i3;
                        d76Var.x = i4;
                        d76Var.A = 3;
                        if (v76Var2.l(team3, d76Var) != obj2) {
                            team4 = team;
                            dbEventScore2 = dbEventScore;
                            v76Var3 = v76Var2;
                            d76Var.r = v76Var3;
                            d76Var.s = dbEventAll3;
                            d76Var.t = dbEventScore2;
                            d76Var.u = null;
                            d76Var.v = null;
                            d76Var.w = i3;
                            d76Var.x = i4;
                            d76Var.A = 4;
                            if (v76Var3.l(team4, d76Var) != obj2) {
                            }
                        }
                        return obj2;
                    }
                    if (i == 3) {
                        i4 = d76Var.x;
                        i3 = d76Var.w;
                        team4 = d76Var.u;
                        DbEventScore dbEventScore4 = d76Var.t;
                        DbEventAll dbEventAll5 = d76Var.s;
                        v76 v76Var6 = d76Var.r;
                        y6a.M(obj);
                        dbEventScore2 = dbEventScore4;
                        dbEventAll3 = dbEventAll5;
                        v76Var3 = v76Var6;
                        d76Var.r = v76Var3;
                        d76Var.s = dbEventAll3;
                        d76Var.t = dbEventScore2;
                        d76Var.u = null;
                        d76Var.v = null;
                        d76Var.w = i3;
                        d76Var.x = i4;
                        d76Var.A = 4;
                        if (v76Var3.l(team4, d76Var) != obj2) {
                            dbEventAll4 = dbEventAll3;
                            DbEventScore dbEventScore5 = new DbEventScore(dbEventAll4.getEvent().getId(), dbEventScore2.getHomeScore(), dbEventScore2.getAwayScore());
                            d76Var.r = null;
                            d76Var.s = null;
                            d76Var.t = null;
                            d76Var.u = null;
                            d76Var.v = null;
                            d76Var.w = i3;
                            d76Var.x = i4;
                            d76Var.A = 5;
                            U2 = gz8.U(d76Var, v76Var3.a, false, true, new xw5(17, v76Var3, dbEventScore5));
                            if (U2 != obj2) {
                            }
                        }
                        return obj2;
                    }
                    if (i == 4) {
                        i4 = d76Var.x;
                        i3 = d76Var.w;
                        dbEventScore2 = d76Var.t;
                        dbEventAll4 = d76Var.s;
                        v76Var3 = d76Var.r;
                        y6a.M(obj);
                        DbEventScore dbEventScore52 = new DbEventScore(dbEventAll4.getEvent().getId(), dbEventScore2.getHomeScore(), dbEventScore2.getAwayScore());
                        d76Var.r = null;
                        d76Var.s = null;
                        d76Var.t = null;
                        d76Var.u = null;
                        d76Var.v = null;
                        d76Var.w = i3;
                        d76Var.x = i4;
                        d76Var.A = 5;
                        U2 = gz8.U(d76Var, v76Var3.a, false, true, new xw5(17, v76Var3, dbEventScore52));
                        if (U2 != obj2) {
                            U2 = Unit.a;
                        }
                    } else {
                        if (i != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                }
                return Unit.a;
            }
        }
        d76Var = new d76(v76Var4, sq3Var);
        Object obj3 = d76Var.y;
        Object obj22 = lu3.a;
        i = d76Var.A;
        int i62 = 0;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object k(v76 v76Var, ArrayList arrayList, sq3 sq3Var) {
        e76 e76Var;
        int i;
        Iterator it;
        int i2;
        if (sq3Var instanceof e76) {
            e76Var = (e76) sq3Var;
            int i3 = e76Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e76Var.w = i3 - Integer.MIN_VALUE;
                Object obj = e76Var.u;
                lu3 lu3Var = lu3.a;
                i = e76Var.w;
                rq3 rq3Var = null;
                int i4 = 0;
                if (i != 0) {
                    y6a.M(obj);
                    it = arrayList.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = e76Var.t;
                    Iterator it2 = e76Var.s;
                    v76 v76Var2 = e76Var.r;
                    y6a.M(obj);
                    it = it2;
                    i2 = i5;
                    v76Var = v76Var2;
                }
                while (it.hasNext()) {
                    DbEventAll dbEventAll = (DbEventAll) it.next();
                    e76Var.r = v76Var;
                    e76Var.s = it;
                    e76Var.t = i2;
                    e76Var.w = 1;
                    if (gz8.T(e76Var, v76Var.a, new u76(v76Var, dbEventAll, rq3Var, i4)) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        e76Var = new e76(v76Var, sq3Var);
        Object obj2 = e76Var.u;
        lu3 lu3Var2 = lu3.a;
        i = e76Var.w;
        rq3 rq3Var2 = null;
        int i42 = 0;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    public final void c(glg glgVar, nkb nkbVar) {
        if (nkbVar.e()) {
            return;
        }
        int i = 2;
        if (nkbVar.i() > 999) {
            z1a.V(nkbVar, new j76(this, glgVar, 2));
            return;
        }
        StringBuilder q = fc6.q("SELECT `eventId`,`home_score_display`,`home_score_period1`,`home_score_period2`,`home_score_period3`,`home_score_period4`,`home_score_period5`,`home_score_period6`,`home_score_period7`,`home_score_period8`,`home_score_period9`,`home_score_period10`,`home_score_period11`,`home_score_period12`,`home_score_period13`,`home_score_period1TieBreak`,`home_score_period2TieBreak`,`home_score_period3TieBreak`,`home_score_period4TieBreak`,`home_score_period5TieBreak`,`home_score_point`,`home_score_overtime`,`home_score_penalties`,`home_score_aggregated`,`home_score_series`,`home_score_currentCricketDisplay`,`away_score_display`,`away_score_period1`,`away_score_period2`,`away_score_period3`,`away_score_period4`,`away_score_period5`,`away_score_period6`,`away_score_period7`,`away_score_period8`,`away_score_period9`,`away_score_period10`,`away_score_period11`,`away_score_period12`,`away_score_period13`,`away_score_period1TieBreak`,`away_score_period2TieBreak`,`away_score_period3TieBreak`,`away_score_period4TieBreak`,`away_score_period5TieBreak`,`away_score_point`,`away_score_overtime`,`away_score_penalties`,`away_score_aggregated`,`away_score_series`,`away_score_currentCricketDisplay` FROM `events_score` WHERE `eventId` IN (");
        pea.m(nkbVar.i(), q);
        q.append(")");
        nlg V0 = glgVar.V0(q.toString());
        int i2 = nkbVar.i();
        int i3 = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            V0.q(i4, nkbVar.f(i5));
            i4++;
        }
        try {
            V0.getClass();
            int F = z1a.F(V0, "eventId");
            if (F == -1) {
                return;
            }
            while (V0.U0()) {
                long j = V0.getLong(F);
                if (nkbVar.b(j)) {
                    int i6 = (int) V0.getLong(i3);
                    String str = null;
                    Score score = new Score(V0.isNull(1) ? null : Integer.valueOf((int) V0.getLong(1)), V0.isNull(i) ? null : Integer.valueOf((int) V0.getLong(i)), V0.isNull(3) ? null : Integer.valueOf((int) V0.getLong(3)), V0.isNull(4) ? null : Integer.valueOf((int) V0.getLong(4)), V0.isNull(5) ? null : Integer.valueOf((int) V0.getLong(5)), V0.isNull(6) ? null : Integer.valueOf((int) V0.getLong(6)), V0.isNull(7) ? null : Integer.valueOf((int) V0.getLong(7)), V0.isNull(8) ? null : Integer.valueOf((int) V0.getLong(8)), V0.isNull(9) ? null : Integer.valueOf((int) V0.getLong(9)), V0.isNull(10) ? null : Integer.valueOf((int) V0.getLong(10)), V0.isNull(11) ? null : Integer.valueOf((int) V0.getLong(11)), V0.isNull(12) ? null : Integer.valueOf((int) V0.getLong(12)), V0.isNull(13) ? null : Integer.valueOf((int) V0.getLong(13)), V0.isNull(14) ? null : Integer.valueOf((int) V0.getLong(14)), V0.isNull(15) ? null : Integer.valueOf((int) V0.getLong(15)), V0.isNull(16) ? null : Integer.valueOf((int) V0.getLong(16)), V0.isNull(17) ? null : Integer.valueOf((int) V0.getLong(17)), V0.isNull(18) ? null : Integer.valueOf((int) V0.getLong(18)), V0.isNull(19) ? null : Integer.valueOf((int) V0.getLong(19)), V0.isNull(20) ? null : V0.F0(20), V0.isNull(21) ? null : Integer.valueOf((int) V0.getLong(21)), V0.isNull(22) ? null : Integer.valueOf((int) V0.getLong(22)), V0.isNull(23) ? null : Integer.valueOf((int) V0.getLong(23)), V0.isNull(24) ? null : Integer.valueOf((int) V0.getLong(24)));
                    score.setCurrentCricketDisplay(V0.isNull(25) ? null : V0.F0(25));
                    Score score2 = new Score(V0.isNull(26) ? null : Integer.valueOf((int) V0.getLong(26)), V0.isNull(27) ? null : Integer.valueOf((int) V0.getLong(27)), V0.isNull(28) ? null : Integer.valueOf((int) V0.getLong(28)), V0.isNull(29) ? null : Integer.valueOf((int) V0.getLong(29)), V0.isNull(30) ? null : Integer.valueOf((int) V0.getLong(30)), V0.isNull(31) ? null : Integer.valueOf((int) V0.getLong(31)), V0.isNull(32) ? null : Integer.valueOf((int) V0.getLong(32)), V0.isNull(33) ? null : Integer.valueOf((int) V0.getLong(33)), V0.isNull(34) ? null : Integer.valueOf((int) V0.getLong(34)), V0.isNull(35) ? null : Integer.valueOf((int) V0.getLong(35)), V0.isNull(36) ? null : Integer.valueOf((int) V0.getLong(36)), V0.isNull(37) ? null : Integer.valueOf((int) V0.getLong(37)), V0.isNull(38) ? null : Integer.valueOf((int) V0.getLong(38)), V0.isNull(39) ? null : Integer.valueOf((int) V0.getLong(39)), V0.isNull(40) ? null : Integer.valueOf((int) V0.getLong(40)), V0.isNull(41) ? null : Integer.valueOf((int) V0.getLong(41)), V0.isNull(42) ? null : Integer.valueOf((int) V0.getLong(42)), V0.isNull(43) ? null : Integer.valueOf((int) V0.getLong(43)), V0.isNull(44) ? null : Integer.valueOf((int) V0.getLong(44)), V0.isNull(45) ? null : V0.F0(45), V0.isNull(46) ? null : Integer.valueOf((int) V0.getLong(46)), V0.isNull(47) ? null : Integer.valueOf((int) V0.getLong(47)), V0.isNull(48) ? null : Integer.valueOf((int) V0.getLong(48)), V0.isNull(49) ? null : Integer.valueOf((int) V0.getLong(49)));
                    if (!V0.isNull(50)) {
                        str = V0.F0(50);
                    }
                    score2.setCurrentCricketDisplay(str);
                    nkbVar.g(new DbEventScore(i6, score, score2), j);
                    i3 = 0;
                    i = 2;
                }
            }
        } finally {
            V0.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0238 A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:22:0x006d, B:25:0x0098, B:28:0x00a8, B:33:0x00c1, B:36:0x00d7, B:39:0x00e5, B:42:0x00f3, B:45:0x0101, B:47:0x0107, B:49:0x010f, B:52:0x017d, B:54:0x018b, B:56:0x0191, B:58:0x0197, B:61:0x01f7, B:63:0x0201, B:67:0x021b, B:69:0x0225, B:73:0x0250, B:75:0x025a, B:79:0x028e, B:83:0x0264, B:86:0x0271, B:89:0x0283, B:90:0x027e, B:91:0x026d, B:92:0x022f, B:95:0x023c, B:98:0x0249, B:99:0x0245, B:100:0x0238, B:101:0x020b, B:103:0x01a3, B:106:0x01b5, B:108:0x01bb, B:112:0x01f0, B:113:0x01c7, B:116:0x01d4, B:119:0x01e7, B:120:0x01e3, B:121:0x01d0, B:122:0x01b1, B:124:0x0120, B:128:0x0135, B:130:0x013b, B:134:0x0176, B:135:0x014b, B:138:0x0158, B:141:0x016b, B:142:0x0167, B:143:0x0154, B:144:0x0130, B:147:0x00cc, B:148:0x00bb, B:149:0x00b2, B:150:0x00a2, B:151:0x0092), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025a A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:22:0x006d, B:25:0x0098, B:28:0x00a8, B:33:0x00c1, B:36:0x00d7, B:39:0x00e5, B:42:0x00f3, B:45:0x0101, B:47:0x0107, B:49:0x010f, B:52:0x017d, B:54:0x018b, B:56:0x0191, B:58:0x0197, B:61:0x01f7, B:63:0x0201, B:67:0x021b, B:69:0x0225, B:73:0x0250, B:75:0x025a, B:79:0x028e, B:83:0x0264, B:86:0x0271, B:89:0x0283, B:90:0x027e, B:91:0x026d, B:92:0x022f, B:95:0x023c, B:98:0x0249, B:99:0x0245, B:100:0x0238, B:101:0x020b, B:103:0x01a3, B:106:0x01b5, B:108:0x01bb, B:112:0x01f0, B:113:0x01c7, B:116:0x01d4, B:119:0x01e7, B:120:0x01e3, B:121:0x01d0, B:122:0x01b1, B:124:0x0120, B:128:0x0135, B:130:0x013b, B:134:0x0176, B:135:0x014b, B:138:0x0158, B:141:0x016b, B:142:0x0167, B:143:0x0154, B:144:0x0130, B:147:0x00cc, B:148:0x00bb, B:149:0x00b2, B:150:0x00a2, B:151:0x0092), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027e A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:22:0x006d, B:25:0x0098, B:28:0x00a8, B:33:0x00c1, B:36:0x00d7, B:39:0x00e5, B:42:0x00f3, B:45:0x0101, B:47:0x0107, B:49:0x010f, B:52:0x017d, B:54:0x018b, B:56:0x0191, B:58:0x0197, B:61:0x01f7, B:63:0x0201, B:67:0x021b, B:69:0x0225, B:73:0x0250, B:75:0x025a, B:79:0x028e, B:83:0x0264, B:86:0x0271, B:89:0x0283, B:90:0x027e, B:91:0x026d, B:92:0x022f, B:95:0x023c, B:98:0x0249, B:99:0x0245, B:100:0x0238, B:101:0x020b, B:103:0x01a3, B:106:0x01b5, B:108:0x01bb, B:112:0x01f0, B:113:0x01c7, B:116:0x01d4, B:119:0x01e7, B:120:0x01e3, B:121:0x01d0, B:122:0x01b1, B:124:0x0120, B:128:0x0135, B:130:0x013b, B:134:0x0176, B:135:0x014b, B:138:0x0158, B:141:0x016b, B:142:0x0167, B:143:0x0154, B:144:0x0130, B:147:0x00cc, B:148:0x00bb, B:149:0x00b2, B:150:0x00a2, B:151:0x0092), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026d A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:22:0x006d, B:25:0x0098, B:28:0x00a8, B:33:0x00c1, B:36:0x00d7, B:39:0x00e5, B:42:0x00f3, B:45:0x0101, B:47:0x0107, B:49:0x010f, B:52:0x017d, B:54:0x018b, B:56:0x0191, B:58:0x0197, B:61:0x01f7, B:63:0x0201, B:67:0x021b, B:69:0x0225, B:73:0x0250, B:75:0x025a, B:79:0x028e, B:83:0x0264, B:86:0x0271, B:89:0x0283, B:90:0x027e, B:91:0x026d, B:92:0x022f, B:95:0x023c, B:98:0x0249, B:99:0x0245, B:100:0x0238, B:101:0x020b, B:103:0x01a3, B:106:0x01b5, B:108:0x01bb, B:112:0x01f0, B:113:0x01c7, B:116:0x01d4, B:119:0x01e7, B:120:0x01e3, B:121:0x01d0, B:122:0x01b1, B:124:0x0120, B:128:0x0135, B:130:0x013b, B:134:0x0176, B:135:0x014b, B:138:0x0158, B:141:0x016b, B:142:0x0167, B:143:0x0154, B:144:0x0130, B:147:0x00cc, B:148:0x00bb, B:149:0x00b2, B:150:0x00a2, B:151:0x0092), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0245 A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:22:0x006d, B:25:0x0098, B:28:0x00a8, B:33:0x00c1, B:36:0x00d7, B:39:0x00e5, B:42:0x00f3, B:45:0x0101, B:47:0x0107, B:49:0x010f, B:52:0x017d, B:54:0x018b, B:56:0x0191, B:58:0x0197, B:61:0x01f7, B:63:0x0201, B:67:0x021b, B:69:0x0225, B:73:0x0250, B:75:0x025a, B:79:0x028e, B:83:0x0264, B:86:0x0271, B:89:0x0283, B:90:0x027e, B:91:0x026d, B:92:0x022f, B:95:0x023c, B:98:0x0249, B:99:0x0245, B:100:0x0238, B:101:0x020b, B:103:0x01a3, B:106:0x01b5, B:108:0x01bb, B:112:0x01f0, B:113:0x01c7, B:116:0x01d4, B:119:0x01e7, B:120:0x01e3, B:121:0x01d0, B:122:0x01b1, B:124:0x0120, B:128:0x0135, B:130:0x013b, B:134:0x0176, B:135:0x014b, B:138:0x0158, B:141:0x016b, B:142:0x0167, B:143:0x0154, B:144:0x0130, B:147:0x00cc, B:148:0x00bb, B:149:0x00b2, B:150:0x00a2, B:151:0x0092), top: B:12:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(glg glgVar, nkb nkbVar) {
        int i;
        FieldTranslations fieldTranslations;
        SubTeam subTeam;
        int i2;
        FieldTranslations fieldTranslations2;
        SubTeam subTeam2;
        Sport sport;
        Country country;
        FieldTranslations fieldTranslations3;
        v76 v76Var = this;
        if (nkbVar.e()) {
            return;
        }
        int i3 = 0;
        if (nkbVar.i() > 999) {
            z1a.V(nkbVar, new j76(v76Var, glgVar, 0));
            return;
        }
        StringBuilder q = fc6.q("SELECT `id`,`name`,`slug`,`userCount`,`type`,`nameCode`,`shortName`,`gender`,`ranking`,`disabled`,`national`,`sub_team_one_id`,`sub_team_one_name`,`sub_team_one_nameTranslation`,`sub_team_one_shortNameTranslation`,`sub_team_two_id`,`sub_team_two_name`,`sub_team_two_nameTranslation`,`sub_team_two_shortNameTranslation`,`sport_id`,`sport_slug`,`country_name`,`country_alpha2`,`nameTranslation`,`shortNameTranslation` FROM `teams` WHERE `id` IN (");
        pea.m(nkbVar.i(), q);
        q.append(")");
        nlg V0 = glgVar.V0(q.toString());
        int i4 = nkbVar.i();
        int i5 = 1;
        int i6 = 1;
        for (int i7 = 0; i7 < i4; i7++) {
            V0.q(i6, nkbVar.f(i7));
            i6++;
        }
        try {
            V0.getClass();
            int F = z1a.F(V0, "id");
            if (F == -1) {
                V0.close();
                return;
            }
            while (V0.U0()) {
                long j = V0.getLong(F);
                if (nkbVar.b(j)) {
                    int i8 = (int) V0.getLong(i3);
                    String F0 = V0.F0(i5);
                    String F02 = V0.F0(2);
                    long j2 = V0.getLong(3);
                    int i9 = (int) V0.getLong(4);
                    String F03 = V0.isNull(5) ? null : V0.F0(5);
                    String F04 = V0.isNull(6) ? null : V0.F0(6);
                    String F05 = V0.isNull(7) ? null : V0.F0(7);
                    Gender stringToGender = F05 == null ? null : GenderTypeConverter.stringToGender(F05);
                    Integer valueOf = V0.isNull(8) ? null : Integer.valueOf((int) V0.getLong(8));
                    boolean z = ((int) V0.getLong(9)) != 0 ? i5 : i3;
                    boolean z2 = ((int) V0.getLong(10)) != 0 ? i5 : i3;
                    boolean isNull = V0.isNull(11);
                    sz8 sz8Var = v76Var.c;
                    if (isNull && V0.isNull(12) && V0.isNull(13) && V0.isNull(14)) {
                        i = F;
                        subTeam = null;
                    } else {
                        int i10 = (int) V0.getLong(11);
                        String F06 = V0.isNull(12) ? null : V0.F0(12);
                        int i11 = 13;
                        if (V0.isNull(13)) {
                            if (V0.isNull(14)) {
                                i = F;
                                fieldTranslations = null;
                                subTeam = new SubTeam(i10, F06, fieldTranslations);
                            } else {
                                i11 = 13;
                            }
                        }
                        i = F;
                        fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i11) ? null : V0.F0(i11)), sz8Var.z(V0.isNull(14) ? null : V0.F0(14)));
                        subTeam = new SubTeam(i10, F06, fieldTranslations);
                    }
                    if (V0.isNull(15) && V0.isNull(16) && V0.isNull(17) && V0.isNull(18)) {
                        i2 = i8;
                        subTeam2 = null;
                    } else {
                        i2 = i8;
                        int i12 = (int) V0.getLong(15);
                        String F07 = V0.isNull(16) ? null : V0.F0(16);
                        if (V0.isNull(17) && V0.isNull(18)) {
                            fieldTranslations2 = null;
                            subTeam2 = new SubTeam(i12, F07, fieldTranslations2);
                        }
                        fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(17) ? null : V0.F0(17)), sz8Var.z(V0.isNull(18) ? null : V0.F0(18)));
                        subTeam2 = new SubTeam(i12, F07, fieldTranslations2);
                    }
                    if (V0.isNull(19) && V0.isNull(20)) {
                        sport = null;
                        if (V0.isNull(21) && V0.isNull(22)) {
                            country = null;
                            if (V0.isNull(23) && V0.isNull(24)) {
                                fieldTranslations3 = null;
                                nkbVar.g(new Team(i2, F0, F02, j2, i9, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations3), j);
                                F = i;
                                i5 = 1;
                                i3 = 0;
                            }
                            fieldTranslations3 = new FieldTranslations(sz8Var.z(!V0.isNull(23) ? null : V0.F0(23)), sz8Var.z(V0.isNull(24) ? null : V0.F0(24)));
                            nkbVar.g(new Team(i2, F0, F02, j2, i9, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations3), j);
                            F = i;
                            i5 = 1;
                            i3 = 0;
                        }
                        country = new Country(!V0.isNull(21) ? null : V0.F0(21), !V0.isNull(22) ? null : V0.F0(22));
                        if (V0.isNull(23)) {
                            fieldTranslations3 = null;
                            nkbVar.g(new Team(i2, F0, F02, j2, i9, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations3), j);
                            F = i;
                            i5 = 1;
                            i3 = 0;
                        }
                        fieldTranslations3 = new FieldTranslations(sz8Var.z(!V0.isNull(23) ? null : V0.F0(23)), sz8Var.z(V0.isNull(24) ? null : V0.F0(24)));
                        nkbVar.g(new Team(i2, F0, F02, j2, i9, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations3), j);
                        F = i;
                        i5 = 1;
                        i3 = 0;
                    }
                    sport = new Sport((int) V0.getLong(19), V0.F0(20));
                    if (V0.isNull(21)) {
                        country = null;
                        if (V0.isNull(23)) {
                        }
                        fieldTranslations3 = new FieldTranslations(sz8Var.z(!V0.isNull(23) ? null : V0.F0(23)), sz8Var.z(V0.isNull(24) ? null : V0.F0(24)));
                        nkbVar.g(new Team(i2, F0, F02, j2, i9, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations3), j);
                        F = i;
                        i5 = 1;
                        i3 = 0;
                    }
                    country = new Country(!V0.isNull(21) ? null : V0.F0(21), !V0.isNull(22) ? null : V0.F0(22));
                    if (V0.isNull(23)) {
                    }
                    fieldTranslations3 = new FieldTranslations(sz8Var.z(!V0.isNull(23) ? null : V0.F0(23)), sz8Var.z(V0.isNull(24) ? null : V0.F0(24)));
                    nkbVar.g(new Team(i2, F0, F02, j2, i9, F03, F04, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations3), j);
                    F = i;
                    i5 = 1;
                    i3 = 0;
                }
                v76Var = this;
            }
            V0.close();
        } catch (Throwable th) {
            V0.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029c A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c4 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b1 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0278 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0265 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0209 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f2 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e0 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01a6 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0187 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e6 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030a A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f9 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b1 A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:13:0x004d, B:18:0x005d, B:20:0x0063, B:23:0x006d, B:26:0x00a3, B:31:0x00db, B:33:0x00f4, B:35:0x00fa, B:37:0x0100, B:39:0x0106, B:41:0x010c, B:43:0x0114, B:45:0x011c, B:47:0x0124, B:49:0x012c, B:51:0x0134, B:53:0x013c, B:55:0x0144, B:57:0x014c, B:59:0x0154, B:61:0x015c, B:63:0x0164, B:65:0x016c, B:68:0x02dc, B:70:0x02e6, B:74:0x0319, B:77:0x02f0, B:80:0x02fd, B:83:0x030f, B:84:0x030a, B:85:0x02f9, B:87:0x0179, B:90:0x018d, B:93:0x019d, B:97:0x01b1, B:100:0x01ba, B:102:0x01c6, B:106:0x01d5, B:110:0x01e7, B:114:0x01fe, B:118:0x0225, B:120:0x0250, B:124:0x0287, B:126:0x029c, B:130:0x02d3, B:131:0x02a8, B:134:0x02b5, B:137:0x02c8, B:138:0x02c4, B:139:0x02b1, B:140:0x025c, B:143:0x0269, B:146:0x027c, B:147:0x0278, B:148:0x0265, B:149:0x0209, B:151:0x0215, B:153:0x0218, B:155:0x0220, B:157:0x0325, B:158:0x0338, B:160:0x01f2, B:161:0x01e0, B:165:0x01a6, B:167:0x0187, B:168:0x00b1, B:171:0x00be, B:174:0x00cf, B:175:0x00cb, B:176:0x00ba), top: B:12:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(glg glgVar, nkb nkbVar) {
        FieldTranslations fieldTranslations;
        Gender gender;
        Gender gender2;
        FieldTranslations fieldTranslations2;
        FieldTranslations fieldTranslations3;
        UniqueTournament uniqueTournament;
        FieldTranslations fieldTranslations4;
        if (nkbVar.e()) {
            return;
        }
        int i = 1;
        if (nkbVar.i() > 999) {
            z1a.V(nkbVar, new j76(this, glgVar, 1));
            return;
        }
        StringBuilder q = fc6.q("SELECT `id`,`name`,`category_id`,`category_name`,`category_flag`,`category_sport_id`,`category_sport_slug`,`category_nameTranslation`,`category_shortNameTranslation`,`unique_tournament_id`,`unique_tournament_name`,`unique_tournament_userCount`,`unique_tournament_hasEventPlayerStatistics`,`unique_tournament_hasBoxScore`,`unique_tournament_displayInverseHomeAwayTeams`,`unique_tournament_groundType`,`unique_tournament_tennisPoints`,`unique_tournament_gender`,`unique_tournament_category_id`,`unique_tournament_category_name`,`unique_tournament_category_flag`,`unique_tournament_category_sport_id`,`unique_tournament_category_sport_slug`,`unique_tournament_category_nameTranslation`,`unique_tournament_category_shortNameTranslation`,`unique_tournament_nameTranslation`,`unique_tournament_shortNameTranslation`,`nameTranslation`,`shortNameTranslation` FROM `tournament` WHERE `id` IN (");
        pea.m(nkbVar.i(), q);
        q.append(")");
        nlg V0 = glgVar.V0(q.toString());
        int i2 = nkbVar.i();
        int i3 = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            V0.q(i4, nkbVar.f(i5));
            i4++;
        }
        try {
            V0.getClass();
            int F = z1a.F(V0, "id");
            if (F == -1) {
                V0.close();
                return;
            }
            while (V0.U0()) {
                long j = V0.getLong(F);
                if (nkbVar.b(j)) {
                    int i6 = (int) V0.getLong(i3);
                    String F0 = V0.F0(i);
                    int i7 = (int) V0.getLong(2);
                    String F02 = V0.F0(3);
                    String F03 = V0.F0(4);
                    Sport sport = new Sport((int) V0.getLong(5), V0.F0(6));
                    boolean isNull = V0.isNull(7);
                    sz8 sz8Var = this.c;
                    if (isNull && V0.isNull(8)) {
                        fieldTranslations = null;
                        Category category = new Category(i7, F02, F03, sport, fieldTranslations);
                        if (!V0.isNull(9) && V0.isNull(10) && V0.isNull(11) && V0.isNull(12) && V0.isNull(13) && V0.isNull(14) && V0.isNull(15) && V0.isNull(16) && V0.isNull(17) && V0.isNull(18) && V0.isNull(19) && V0.isNull(20) && V0.isNull(21) && V0.isNull(22) && V0.isNull(23) && V0.isNull(24) && V0.isNull(25) && V0.isNull(26)) {
                            uniqueTournament = null;
                        } else {
                            int i8 = (int) V0.getLong(9);
                            String F04 = !V0.isNull(10) ? null : V0.F0(10);
                            long j2 = V0.getLong(11);
                            boolean z = ((int) V0.getLong(12)) == 0;
                            Integer valueOf = !V0.isNull(13) ? null : Integer.valueOf((int) V0.getLong(13));
                            Boolean valueOf2 = valueOf == null ? Boolean.valueOf(valueOf.intValue() != 0) : null;
                            boolean z2 = ((int) V0.getLong(14)) == 0;
                            String F05 = !V0.isNull(15) ? null : V0.F0(15);
                            Integer valueOf3 = !V0.isNull(16) ? null : Integer.valueOf((int) V0.getLong(16));
                            if (V0.isNull(17)) {
                                String F06 = V0.F0(17);
                                if (Intrinsics.c(F06, "Male")) {
                                    gender = Gender.Male;
                                } else {
                                    if (!Intrinsics.c(F06, "Female")) {
                                        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + F06);
                                    }
                                    gender = Gender.Female;
                                }
                                gender2 = gender;
                            } else {
                                gender2 = null;
                            }
                            int i9 = (int) V0.getLong(18);
                            String F07 = V0.F0(19);
                            String F08 = V0.F0(20);
                            Sport sport2 = new Sport((int) V0.getLong(21), V0.F0(22));
                            if (V0.isNull(23) && V0.isNull(24)) {
                                fieldTranslations2 = null;
                                Category category2 = new Category(i9, F07, F08, sport2, fieldTranslations2);
                                if (V0.isNull(25) && V0.isNull(26)) {
                                    fieldTranslations3 = null;
                                    uniqueTournament = new UniqueTournament(i8, F04, category2, j2, z, valueOf2, z2, F05, valueOf3, gender2, fieldTranslations3);
                                }
                                fieldTranslations3 = new FieldTranslations(sz8Var.z(!V0.isNull(25) ? null : V0.F0(25)), sz8Var.z(!V0.isNull(26) ? null : V0.F0(26)));
                                uniqueTournament = new UniqueTournament(i8, F04, category2, j2, z, valueOf2, z2, F05, valueOf3, gender2, fieldTranslations3);
                            }
                            fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(23) ? null : V0.F0(23)), sz8Var.z(!V0.isNull(24) ? null : V0.F0(24)));
                            Category category22 = new Category(i9, F07, F08, sport2, fieldTranslations2);
                            if (V0.isNull(25)) {
                                fieldTranslations3 = null;
                                uniqueTournament = new UniqueTournament(i8, F04, category22, j2, z, valueOf2, z2, F05, valueOf3, gender2, fieldTranslations3);
                            }
                            fieldTranslations3 = new FieldTranslations(sz8Var.z(!V0.isNull(25) ? null : V0.F0(25)), sz8Var.z(!V0.isNull(26) ? null : V0.F0(26)));
                            uniqueTournament = new UniqueTournament(i8, F04, category22, j2, z, valueOf2, z2, F05, valueOf3, gender2, fieldTranslations3);
                        }
                        if (V0.isNull(27) && V0.isNull(28)) {
                            fieldTranslations4 = null;
                            nkbVar.g(new Tournament(i6, F0, category, uniqueTournament, fieldTranslations4), j);
                            i3 = 0;
                            i = 1;
                        }
                        fieldTranslations4 = new FieldTranslations(sz8Var.z(V0.isNull(27) ? null : V0.F0(27)), sz8Var.z(V0.isNull(28) ? null : V0.F0(28)));
                        nkbVar.g(new Tournament(i6, F0, category, uniqueTournament, fieldTranslations4), j);
                        i3 = 0;
                        i = 1;
                    }
                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(7) ? null : V0.F0(7)), sz8Var.z(V0.isNull(8) ? null : V0.F0(8)));
                    Category category3 = new Category(i7, F02, F03, sport, fieldTranslations);
                    if (!V0.isNull(9)) {
                    }
                    int i82 = (int) V0.getLong(9);
                    if (!V0.isNull(10)) {
                    }
                    long j22 = V0.getLong(11);
                    if (((int) V0.getLong(12)) == 0) {
                    }
                    if (!V0.isNull(13)) {
                    }
                    if (valueOf == null) {
                    }
                    if (((int) V0.getLong(14)) == 0) {
                    }
                    if (!V0.isNull(15)) {
                    }
                    if (!V0.isNull(16)) {
                    }
                    if (V0.isNull(17)) {
                    }
                    int i92 = (int) V0.getLong(18);
                    String F072 = V0.F0(19);
                    String F082 = V0.F0(20);
                    Sport sport22 = new Sport((int) V0.getLong(21), V0.F0(22));
                    if (V0.isNull(23)) {
                        fieldTranslations2 = null;
                        Category category222 = new Category(i92, F072, F082, sport22, fieldTranslations2);
                        if (V0.isNull(25)) {
                        }
                        fieldTranslations3 = new FieldTranslations(sz8Var.z(!V0.isNull(25) ? null : V0.F0(25)), sz8Var.z(!V0.isNull(26) ? null : V0.F0(26)));
                        uniqueTournament = new UniqueTournament(i82, F04, category222, j22, z, valueOf2, z2, F05, valueOf3, gender2, fieldTranslations3);
                        if (V0.isNull(27)) {
                            fieldTranslations4 = null;
                            nkbVar.g(new Tournament(i6, F0, category3, uniqueTournament, fieldTranslations4), j);
                            i3 = 0;
                            i = 1;
                        }
                        fieldTranslations4 = new FieldTranslations(sz8Var.z(V0.isNull(27) ? null : V0.F0(27)), sz8Var.z(V0.isNull(28) ? null : V0.F0(28)));
                        nkbVar.g(new Tournament(i6, F0, category3, uniqueTournament, fieldTranslations4), j);
                        i3 = 0;
                        i = 1;
                    }
                    fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(23) ? null : V0.F0(23)), sz8Var.z(!V0.isNull(24) ? null : V0.F0(24)));
                    Category category2222 = new Category(i92, F072, F082, sport22, fieldTranslations2);
                    if (V0.isNull(25)) {
                    }
                    fieldTranslations3 = new FieldTranslations(sz8Var.z(!V0.isNull(25) ? null : V0.F0(25)), sz8Var.z(!V0.isNull(26) ? null : V0.F0(26)));
                    uniqueTournament = new UniqueTournament(i82, F04, category2222, j22, z, valueOf2, z2, F05, valueOf3, gender2, fieldTranslations3);
                    if (V0.isNull(27)) {
                    }
                    fieldTranslations4 = new FieldTranslations(sz8Var.z(V0.isNull(27) ? null : V0.F0(27)), sz8Var.z(V0.isNull(28) ? null : V0.F0(28)));
                    nkbVar.g(new Tournament(i6, F0, category3, uniqueTournament, fieldTranslations4), j);
                    i3 = 0;
                    i = 1;
                }
            }
            V0.close();
        } catch (Throwable th) {
            V0.close();
            throw th;
        }
    }

    public final nb8 g(Integer num) {
        l76 l76Var = new l76(1, num);
        return zm2.s(this.a, false, new String[]{"my_leagues"}, l76Var);
    }

    public final Object l(Team team, sq3 sq3Var) {
        return gz8.U(sq3Var, this.a, false, true, new xw5(13, this, team));
    }
}
