package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.weeklyChallenge.ActiveWeeklyLeague;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeAssetsResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeaderboardResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeagueAsset;
import com.sofascore.model.weeklyChallenge.WeeklyLeaderboardUser;
import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import com.sofascore.results.service.WeeklyChallengeWorker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n4l extends hoi implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ WeeklyChallengeWorker C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public zu4 r;
    public zu4 s;
    public zu4 t;
    public String u;
    public List v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4l(WeeklyChallengeWorker weeklyChallengeWorker, int i, int i2, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.C = weeklyChallengeWorker;
        this.D = i;
        this.E = i2;
        this.F = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        n4l n4lVar = new n4l(this.C, this.D, this.E, this.F, rq3Var);
        n4lVar.B = obj;
        return n4lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n4l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x028e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zu4 t;
        zu4 t2;
        zu4 zu4Var;
        SharedPreferences d;
        zu4 zu4Var2;
        Object T;
        int i;
        zu4 zu4Var3;
        ActiveWeeklyLeague league;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse;
        String str;
        Object T2;
        String str2;
        zu4 zu4Var4;
        ActiveWeeklyLeague league2;
        zu4 zu4Var5;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse2;
        int i2;
        zu4 zu4Var6;
        String str3;
        int i3;
        List<WeeklyLeaderboardUser> rankings;
        Iterator<WeeklyLeaderboardUser> it;
        int i4;
        Object T3;
        int i5;
        zu4 zu4Var7;
        zu4 zu4Var8;
        ActiveWeeklyLeague league3;
        WeeklyChallengeAssetsResponse weeklyChallengeAssetsResponse;
        List<WeeklyChallengeLeagueAsset> list;
        Object T4;
        List<WeeklyChallengeLeagueAsset> list2;
        String str4;
        WeeklyChallengeAssetsResponse weeklyChallengeAssetsResponse2;
        int i6;
        Object T5;
        int i7;
        int i8;
        List<WeeklyChallengeLeagueAsset> meta;
        Iterator<T> it2;
        Integer num;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse3;
        int i9;
        WeeklyStatus weeklyUnchanged;
        List<WeeklyLeaderboardUser> rankings2;
        Iterator<T> it3;
        WeeklyLeaderboardUser weeklyLeaderboardUser;
        Integer currentWeeklyChallengeWeeklyStreak;
        ku3 ku3Var = (ku3) this.B;
        lu3 lu3Var = lu3.a;
        int i10 = 1;
        int i11 = 0;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.A) {
            case 0:
                y6a.M(obj);
                Context applicationContext = this.C.getApplicationContext();
                applicationContext.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext2);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                if (sharedPreferences.getBoolean("PREF_WEEKLY_CHALLENGE_MUTED", false)) {
                    return jdb.a();
                }
                av4 t3 = xw3.t(ku3Var, null, new m4l(this.C, this.D, objArr3 == true ? 1 : 0, i11), 3);
                t = xw3.t(ku3Var, null, new m4l(this.C, this.E, objArr2 == true ? 1 : 0, i10), 3);
                t2 = xw3.t(ku3Var, null, new luj(this.C, objArr == true ? 1 : 0, 9), 3);
                this.B = null;
                this.r = t3;
                this.s = t;
                this.t = t2;
                this.A = 1;
                Object w = t3.w(this);
                if (w != lu3Var) {
                    zu4Var = t3;
                    obj = w;
                    zu4Var2 = t;
                    WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse4 = (WeeklyChallengeLeaderboardResponse) obj;
                    int level = (weeklyChallengeLeaderboardResponse4 != null || (league = weeklyChallengeLeaderboardResponse4.getLeague()) == null) ? 0 : league.getLevel();
                    this.B = null;
                    this.r = zu4Var;
                    this.s = zu4Var2;
                    this.t = t2;
                    this.w = level;
                    this.A = 2;
                    T = zu4Var.T(this);
                    if (T != lu3Var) {
                        zu4 zu4Var9 = t2;
                        i = level;
                        obj = T;
                        zu4Var3 = zu4Var9;
                        weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) obj;
                        if (weeklyChallengeLeaderboardResponse != null || (league2 = weeklyChallengeLeaderboardResponse.getLeague()) == null || (str = league2.getTitle()) == null) {
                            str = "";
                        }
                        this.B = null;
                        this.r = null;
                        this.s = zu4Var2;
                        this.t = zu4Var3;
                        this.u = str;
                        this.w = i;
                        this.A = 3;
                        T2 = zu4Var.T(this);
                        if (T2 != lu3Var) {
                            zu4 zu4Var10 = zu4Var3;
                            str2 = str;
                            obj = T2;
                            zu4Var4 = zu4Var10;
                            zu4Var5 = zu4Var2;
                            weeklyChallengeLeaderboardResponse2 = (WeeklyChallengeLeaderboardResponse) obj;
                            int i12 = -1;
                            if (weeklyChallengeLeaderboardResponse2 != null && (rankings = weeklyChallengeLeaderboardResponse2.getRankings()) != null) {
                                String str5 = this.F;
                                it = rankings.iterator();
                                i4 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        if (Intrinsics.c(it.next().getId(), str5)) {
                                            i12 = i4;
                                        } else {
                                            i4++;
                                        }
                                    }
                                }
                            }
                            int i13 = i12 + 1;
                            this.B = null;
                            this.r = null;
                            this.s = zu4Var5;
                            this.t = zu4Var4;
                            this.u = str2;
                            this.w = i;
                            this.x = i13;
                            this.A = 4;
                            obj = zu4Var5.T(this);
                            if (obj != lu3Var) {
                                zu4 zu4Var11 = zu4Var4;
                                i2 = i;
                                zu4Var6 = zu4Var11;
                                str3 = str2;
                                i3 = i13;
                                WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse5 = (WeeklyChallengeLeaderboardResponse) obj;
                                int level2 = (weeklyChallengeLeaderboardResponse5 != null || (league3 = weeklyChallengeLeaderboardResponse5.getLeague()) == null) ? 0 : league3.getLevel();
                                this.B = null;
                                this.r = null;
                                this.s = zu4Var5;
                                this.t = zu4Var6;
                                this.u = str3;
                                this.w = i2;
                                this.x = i3;
                                this.y = level2;
                                this.A = 5;
                                T3 = zu4Var6.T(this);
                                if (T3 != lu3Var) {
                                    zu4 zu4Var12 = zu4Var6;
                                    i5 = level2;
                                    obj = T3;
                                    zu4Var7 = zu4Var5;
                                    zu4Var8 = zu4Var12;
                                    weeklyChallengeAssetsResponse = (WeeklyChallengeAssetsResponse) obj;
                                    if (weeklyChallengeAssetsResponse != null || (list = weeklyChallengeAssetsResponse.getMeta()) == null) {
                                        list = km5.a;
                                    }
                                    this.B = null;
                                    this.r = null;
                                    this.s = zu4Var7;
                                    this.t = null;
                                    this.u = str3;
                                    this.v = list;
                                    this.w = i2;
                                    this.x = i3;
                                    this.y = i5;
                                    this.A = 6;
                                    T4 = zu4Var8.T(this);
                                    if (T4 != lu3Var) {
                                        String str6 = str3;
                                        list2 = list;
                                        obj = T4;
                                        str4 = str6;
                                        weeklyChallengeAssetsResponse2 = (WeeklyChallengeAssetsResponse) obj;
                                        if (weeklyChallengeAssetsResponse2 != null && (meta = weeklyChallengeAssetsResponse2.getMeta()) != null) {
                                            it2 = meta.iterator();
                                            if (it2.hasNext()) {
                                                num = null;
                                            } else {
                                                num = new Integer(((WeeklyChallengeLeagueAsset) it2.next()).getLevel());
                                                while (it2.hasNext()) {
                                                    Integer num2 = new Integer(((WeeklyChallengeLeagueAsset) it2.next()).getLevel());
                                                    if (num.compareTo(num2) < 0) {
                                                        num = num2;
                                                    }
                                                }
                                            }
                                            if (num != null) {
                                                i6 = num.intValue();
                                                this.B = null;
                                                this.r = null;
                                                this.s = null;
                                                this.t = null;
                                                this.u = str4;
                                                this.v = list2;
                                                this.w = i2;
                                                this.x = i3;
                                                this.y = i5;
                                                this.z = i6;
                                                this.A = 7;
                                                T5 = zu4Var7.T(this);
                                                if (T5 != lu3Var) {
                                                    i7 = i5;
                                                    i8 = i6;
                                                    obj = T5;
                                                    List<WeeklyChallengeLeagueAsset> list3 = list2;
                                                    String str7 = str4;
                                                    int i14 = i3;
                                                    weeklyChallengeLeaderboardResponse3 = (WeeklyChallengeLeaderboardResponse) obj;
                                                    if (weeklyChallengeLeaderboardResponse3 != null && (rankings2 = weeklyChallengeLeaderboardResponse3.getRankings()) != null) {
                                                        String str8 = this.F;
                                                        it3 = rankings2.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                Object next = it3.next();
                                                                if (Intrinsics.c(((WeeklyLeaderboardUser) next).getId(), str8)) {
                                                                    obj2 = next;
                                                                }
                                                            }
                                                        }
                                                        weeklyLeaderboardUser = (WeeklyLeaderboardUser) obj2;
                                                        if (weeklyLeaderboardUser != null && (currentWeeklyChallengeWeeklyStreak = weeklyLeaderboardUser.getCurrentWeeklyChallengeWeeklyStreak()) != null) {
                                                            i9 = currentWeeklyChallengeWeeklyStreak.intValue();
                                                            if (i2 != 0 || i7 == 0 || list3.isEmpty()) {
                                                                return new hdb();
                                                            }
                                                            if (i7 > i2) {
                                                                weeklyUnchanged = new WeeklyStatus.WeeklyPromotion(i14, str7, i7, i9);
                                                            } else if (i7 < i2) {
                                                                weeklyUnchanged = new WeeklyStatus.WeeklyDemotion(i14, str7, i7, i9);
                                                            } else if (i7 == i8) {
                                                                weeklyUnchanged = new WeeklyStatus.WeeklyUnchangedOnTop(i14, str7, i7, i9);
                                                            } else {
                                                                weeklyUnchanged = new WeeklyStatus.WeeklyUnchanged(i14, str7, i7, i9, i7 == 1);
                                                            }
                                                            bfk bfkVar = this.C.b;
                                                            bfkVar.getClass();
                                                            bfkVar.c = list3;
                                                            qv5.a(new i52(weeklyUnchanged));
                                                            return jdb.a();
                                                        }
                                                    }
                                                    i9 = 0;
                                                    if (i2 != 0) {
                                                    }
                                                    return new hdb();
                                                }
                                            }
                                        }
                                        i6 = 0;
                                        this.B = null;
                                        this.r = null;
                                        this.s = null;
                                        this.t = null;
                                        this.u = str4;
                                        this.v = list2;
                                        this.w = i2;
                                        this.x = i3;
                                        this.y = i5;
                                        this.z = i6;
                                        this.A = 7;
                                        T5 = zu4Var7.T(this);
                                        if (T5 != lu3Var) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return lu3Var;
            case 1:
                t2 = this.t;
                t = this.s;
                zu4 zu4Var13 = this.r;
                y6a.M(obj);
                zu4Var = zu4Var13;
                zu4Var2 = t;
                WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse42 = (WeeklyChallengeLeaderboardResponse) obj;
                if (weeklyChallengeLeaderboardResponse42 != null) {
                    break;
                }
                this.B = null;
                this.r = zu4Var;
                this.s = zu4Var2;
                this.t = t2;
                this.w = level;
                this.A = 2;
                T = zu4Var.T(this);
                if (T != lu3Var) {
                }
                return lu3Var;
            case 2:
                i = this.w;
                zu4Var3 = this.t;
                zu4Var2 = this.s;
                zu4Var = this.r;
                y6a.M(obj);
                weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) obj;
                if (weeklyChallengeLeaderboardResponse != null) {
                    break;
                }
                str = "";
                this.B = null;
                this.r = null;
                this.s = zu4Var2;
                this.t = zu4Var3;
                this.u = str;
                this.w = i;
                this.A = 3;
                T2 = zu4Var.T(this);
                if (T2 != lu3Var) {
                }
                return lu3Var;
            case 3:
                i = this.w;
                str2 = this.u;
                zu4Var4 = this.t;
                zu4Var2 = this.s;
                y6a.M(obj);
                zu4Var5 = zu4Var2;
                weeklyChallengeLeaderboardResponse2 = (WeeklyChallengeLeaderboardResponse) obj;
                int i122 = -1;
                if (weeklyChallengeLeaderboardResponse2 != null) {
                    String str52 = this.F;
                    it = rankings.iterator();
                    i4 = 0;
                    while (true) {
                        if (it.hasNext()) {
                        }
                        i4++;
                    }
                    break;
                }
                int i132 = i122 + 1;
                this.B = null;
                this.r = null;
                this.s = zu4Var5;
                this.t = zu4Var4;
                this.u = str2;
                this.w = i;
                this.x = i132;
                this.A = 4;
                obj = zu4Var5.T(this);
                if (obj != lu3Var) {
                }
                return lu3Var;
            case 4:
                int i15 = this.x;
                int i16 = this.w;
                String str9 = this.u;
                zu4 zu4Var14 = this.t;
                zu4Var5 = this.s;
                y6a.M(obj);
                i3 = i15;
                zu4Var6 = zu4Var14;
                str3 = str9;
                i2 = i16;
                WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse52 = (WeeklyChallengeLeaderboardResponse) obj;
                if (weeklyChallengeLeaderboardResponse52 != null) {
                    break;
                }
                this.B = null;
                this.r = null;
                this.s = zu4Var5;
                this.t = zu4Var6;
                this.u = str3;
                this.w = i2;
                this.x = i3;
                this.y = level2;
                this.A = 5;
                T3 = zu4Var6.T(this);
                if (T3 != lu3Var) {
                }
                return lu3Var;
            case 5:
                i5 = this.y;
                i3 = this.x;
                i2 = this.w;
                str3 = this.u;
                zu4Var8 = this.t;
                zu4Var7 = this.s;
                y6a.M(obj);
                weeklyChallengeAssetsResponse = (WeeklyChallengeAssetsResponse) obj;
                if (weeklyChallengeAssetsResponse != null) {
                    break;
                }
                list = km5.a;
                this.B = null;
                this.r = null;
                this.s = zu4Var7;
                this.t = null;
                this.u = str3;
                this.v = list;
                this.w = i2;
                this.x = i3;
                this.y = i5;
                this.A = 6;
                T4 = zu4Var8.T(this);
                if (T4 != lu3Var) {
                }
                return lu3Var;
            case 6:
                i5 = this.y;
                i3 = this.x;
                i2 = this.w;
                list2 = this.v;
                str4 = this.u;
                zu4Var7 = this.s;
                y6a.M(obj);
                weeklyChallengeAssetsResponse2 = (WeeklyChallengeAssetsResponse) obj;
                if (weeklyChallengeAssetsResponse2 != null) {
                    it2 = meta.iterator();
                    if (it2.hasNext()) {
                    }
                    if (num != null) {
                    }
                    break;
                }
                i6 = 0;
                this.B = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = str4;
                this.v = list2;
                this.w = i2;
                this.x = i3;
                this.y = i5;
                this.z = i6;
                this.A = 7;
                T5 = zu4Var7.T(this);
                if (T5 != lu3Var) {
                }
                return lu3Var;
            case 7:
                i8 = this.z;
                int i17 = this.y;
                i3 = this.x;
                i2 = this.w;
                list2 = this.v;
                str4 = this.u;
                y6a.M(obj);
                i7 = i17;
                List<WeeklyChallengeLeagueAsset> list32 = list2;
                String str72 = str4;
                int i142 = i3;
                weeklyChallengeLeaderboardResponse3 = (WeeklyChallengeLeaderboardResponse) obj;
                if (weeklyChallengeLeaderboardResponse3 != null) {
                    String str82 = this.F;
                    it3 = rankings2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                        }
                    }
                    weeklyLeaderboardUser = (WeeklyLeaderboardUser) obj2;
                    if (weeklyLeaderboardUser != null) {
                        i9 = currentWeeklyChallengeWeeklyStreak.intValue();
                        if (i2 != 0) {
                        }
                        return new hdb();
                    }
                    break;
                }
                i9 = 0;
                if (i2 != 0) {
                }
                return new hdb();
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
