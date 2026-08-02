package defpackage;

import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.weeklyChallenge.ActiveWeeklyLeague;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeAssetsResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeaderboardResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeagueAsset;
import com.sofascore.model.weeklyChallenge.WeeklyLeaderboardUser;
import com.sofascore.model.weeklyChallenge.WeeklyLeagueImageUrl;
import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g4l extends hoi implements Function2 {
    public WeeklyChallengeViewModel A;
    public WeeklyChallengeLeaderboardResponse B;
    public ProfileData C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ WeeklyChallengeViewModel N;
    public zu4 r;
    public zu4 s;
    public zu4 t;
    public zu4 u;
    public zu4 v;
    public String w;
    public List x;
    public WeeklyStatus y;
    public WeeklyChallengeLeagueAsset z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4l(WeeklyChallengeViewModel weeklyChallengeViewModel, rq3 rq3Var) {
        super(2, rq3Var);
        this.N = weeklyChallengeViewModel;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        g4l g4lVar = new g4l(this.N, rq3Var);
        g4lVar.M = obj;
        return g4lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g4l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x042a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0513  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int leaderboardId;
        zu4 t;
        Object w;
        zu4 zu4Var;
        int i;
        zu4 zu4Var2;
        zu4 zu4Var3;
        zu4 zu4Var4;
        Object T;
        int i2;
        int i3;
        int i4;
        ActiveWeeklyLeague league;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse;
        String str;
        Object T2;
        String str2;
        int i5;
        ActiveWeeklyLeague league2;
        zu4 zu4Var5;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse2;
        int i6;
        int i7;
        Object T3;
        int i8;
        int i9;
        int i10;
        zu4 zu4Var6;
        zu4 zu4Var7;
        int i11;
        List<WeeklyLeaderboardUser> rankings;
        Iterator<WeeklyLeaderboardUser> it;
        Object T4;
        int i12;
        int i13;
        zu4 zu4Var8;
        zu4 zu4Var9;
        zu4 zu4Var10;
        String str3;
        ActiveWeeklyLeague league3;
        WeeklyChallengeAssetsResponse weeklyChallengeAssetsResponse;
        List<WeeklyChallengeLeagueAsset> list;
        Object T5;
        int i14;
        String str4;
        int i15;
        int i16;
        int i17;
        int i18;
        zu4 zu4Var11;
        zu4 zu4Var12;
        List<WeeklyChallengeLeagueAsset> list2;
        WeeklyChallengeAssetsResponse weeklyChallengeAssetsResponse2;
        String str5;
        int i19;
        Object T6;
        String str6;
        int i20;
        List<WeeklyChallengeLeagueAsset> list3;
        int i21;
        int i22;
        zu4 zu4Var13;
        zu4 zu4Var14;
        List<WeeklyChallengeLeagueAsset> meta;
        Integer num;
        int i23;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse3;
        int i24;
        WeeklyStatus weeklyUnchanged;
        zu4 zu4Var15;
        boolean z;
        WeeklyStatus weeklyUnchangedOnTop;
        Iterator it2;
        Object obj2;
        WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset;
        Object T7;
        int i25;
        int i26;
        List<WeeklyChallengeLeagueAsset> list4;
        int i27;
        int i28;
        int i29;
        int i30;
        WeeklyStatus weeklyStatus;
        int i31;
        zu4 zu4Var16;
        Iterator it3;
        List<WeeklyLeaderboardUser> rankings2;
        Iterator it4;
        Object obj3;
        WeeklyLeaderboardUser weeklyLeaderboardUser;
        Integer currentWeeklyChallengeWeeklyStreak;
        Iterator it5;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse4;
        Object T8;
        int i32;
        List<WeeklyChallengeLeagueAsset> list5;
        WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset2;
        WeeklyStatus weeklyStatus2;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse5;
        int i33;
        Object k;
        WeeklyChallengeViewModel weeklyChallengeViewModel;
        ProfileData profileData;
        WeeklyStatus weeklyStatus3;
        WeeklyLeagueImageUrl lockedImageAmoledUrl;
        String png;
        WeeklyLeagueImageUrl lockedImageLightUrl;
        String png2;
        WeeklyLeagueImageUrl imageUrl;
        String png3;
        String title;
        ku3 ku3Var = (ku3) this.M;
        lu3 lu3Var = lu3.a;
        int i34 = this.L;
        int i35 = 2;
        int i36 = 3;
        String str7 = "";
        int i37 = 1;
        int i38 = 0;
        WeeklyChallengeViewModel weeklyChallengeViewModel2 = this.N;
        switch (i34) {
            case 0:
                y6a.M(obj);
                leaderboardId = WeeklyChallengeViewModel.l().getLeaderboardId();
                int previousLeaderboardId = WeeklyChallengeViewModel.l().getPreviousLeaderboardId();
                if (previousLeaderboardId == 0) {
                    fdi fdiVar = weeklyChallengeViewModel2.m;
                    fdiVar.getClass();
                    fdiVar.m(null, r3l.a);
                    Unit unit = Unit.a;
                    return Unit.a;
                }
                rq3 rq3Var = null;
                av4 t2 = xw3.t(ku3Var, null, new e4l(weeklyChallengeViewModel2, previousLeaderboardId, rq3Var, i37), 3);
                t = xw3.t(ku3Var, null, new e4l(weeklyChallengeViewModel2, leaderboardId, rq3Var, i36), 3);
                av4 t3 = xw3.t(ku3Var, null, new f4l(weeklyChallengeViewModel2, rq3Var, i38), 3);
                av4 t4 = xw3.t(ku3Var, null, new e4l(weeklyChallengeViewModel2, previousLeaderboardId, rq3Var, i35), 3);
                av4 t5 = xw3.t(ku3Var, null, new f4l(weeklyChallengeViewModel2, rq3Var, i37), 3);
                this.M = null;
                this.r = t2;
                this.s = t;
                this.t = t3;
                this.u = t4;
                this.v = t5;
                this.D = leaderboardId;
                this.E = previousLeaderboardId;
                this.L = 1;
                w = t2.w(this);
                if (w != lu3Var) {
                    zu4Var = t5;
                    i = previousLeaderboardId;
                    zu4Var2 = t2;
                    zu4Var3 = t3;
                    zu4Var4 = t4;
                    WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse6 = (WeeklyChallengeLeaderboardResponse) w;
                    int level = (weeklyChallengeLeaderboardResponse6 != null || (league = weeklyChallengeLeaderboardResponse6.getLeague()) == null) ? 0 : league.getLevel();
                    this.M = null;
                    this.r = zu4Var2;
                    this.s = t;
                    this.t = zu4Var3;
                    this.u = zu4Var4;
                    this.v = zu4Var;
                    this.D = leaderboardId;
                    this.E = i;
                    this.F = level;
                    this.L = 2;
                    T = zu4Var2.T(this);
                    if (T != lu3Var) {
                        int i39 = leaderboardId;
                        i2 = i;
                        i3 = level;
                        i4 = i39;
                        weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) T;
                        if (weeklyChallengeLeaderboardResponse != null || (league2 = weeklyChallengeLeaderboardResponse.getLeague()) == null || (str = league2.getTitle()) == null) {
                            str = "";
                        }
                        this.M = null;
                        this.r = null;
                        this.s = t;
                        this.t = zu4Var3;
                        this.u = zu4Var4;
                        this.v = zu4Var;
                        this.w = str;
                        this.D = i4;
                        this.E = i2;
                        this.F = i3;
                        this.L = 3;
                        T2 = zu4Var2.T(this);
                        if (T2 != lu3Var) {
                            int i40 = i4;
                            str2 = str;
                            i5 = i40;
                            zu4Var5 = t;
                            weeklyChallengeLeaderboardResponse2 = (WeeklyChallengeLeaderboardResponse) T2;
                            if (weeklyChallengeLeaderboardResponse2 != null && (rankings = weeklyChallengeLeaderboardResponse2.getRankings()) != null) {
                                it = rankings.iterator();
                                int i41 = 0;
                                while (it.hasNext()) {
                                    i6 = i37;
                                    if (Intrinsics.c(it.next().getId(), WeeklyChallengeViewModel.l().getId())) {
                                        i7 = i41;
                                        int i42 = i7 + 1;
                                        this.M = null;
                                        this.r = null;
                                        this.s = zu4Var5;
                                        this.t = zu4Var3;
                                        this.u = zu4Var4;
                                        this.v = zu4Var;
                                        this.w = str2;
                                        this.D = i5;
                                        this.E = i2;
                                        this.F = i3;
                                        this.G = i42;
                                        this.L = 4;
                                        T3 = zu4Var5.T(this);
                                        if (T3 != lu3Var) {
                                            int i43 = i5;
                                            i8 = i3;
                                            i9 = i2;
                                            i10 = i42;
                                            zu4Var6 = zu4Var4;
                                            zu4Var7 = zu4Var;
                                            i11 = i43;
                                            WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse7 = (WeeklyChallengeLeaderboardResponse) T3;
                                            int level2 = (weeklyChallengeLeaderboardResponse7 != null || (league3 = weeklyChallengeLeaderboardResponse7.getLeague()) == null) ? 0 : league3.getLevel();
                                            this.M = null;
                                            this.r = null;
                                            this.s = zu4Var5;
                                            this.t = zu4Var3;
                                            this.u = zu4Var6;
                                            this.v = zu4Var7;
                                            this.w = str2;
                                            this.D = i11;
                                            this.E = i9;
                                            this.F = i8;
                                            this.G = i10;
                                            this.H = level2;
                                            this.L = 5;
                                            T4 = zu4Var3.T(this);
                                            if (T4 != lu3Var) {
                                                int i44 = level2;
                                                i12 = i9;
                                                i13 = i44;
                                                zu4Var8 = zu4Var5;
                                                zu4Var9 = zu4Var3;
                                                zu4Var10 = zu4Var7;
                                                str3 = str2;
                                                weeklyChallengeAssetsResponse = (WeeklyChallengeAssetsResponse) T4;
                                                if (weeklyChallengeAssetsResponse != null || (list = weeklyChallengeAssetsResponse.getMeta()) == null) {
                                                    list = km5.a;
                                                }
                                                this.M = null;
                                                this.r = null;
                                                this.s = zu4Var8;
                                                this.t = null;
                                                this.u = zu4Var6;
                                                this.v = zu4Var10;
                                                this.w = str3;
                                                this.x = list;
                                                this.D = i11;
                                                this.E = i12;
                                                this.F = i8;
                                                this.G = i10;
                                                this.H = i13;
                                                this.L = 6;
                                                T5 = zu4Var9.T(this);
                                                if (T5 != lu3Var) {
                                                    int i45 = i10;
                                                    i14 = i13;
                                                    str4 = str3;
                                                    i15 = i11;
                                                    i16 = i12;
                                                    i17 = i8;
                                                    i18 = i45;
                                                    zu4Var11 = zu4Var6;
                                                    zu4Var12 = zu4Var10;
                                                    list2 = list;
                                                    weeklyChallengeAssetsResponse2 = (WeeklyChallengeAssetsResponse) T5;
                                                    if (weeklyChallengeAssetsResponse2 != null || (meta = weeklyChallengeAssetsResponse2.getMeta()) == null) {
                                                        str5 = "";
                                                    } else {
                                                        Iterator<T> it6 = meta.iterator();
                                                        if (it6.hasNext()) {
                                                            num = new Integer(((WeeklyChallengeLeagueAsset) it6.next()).getLevel());
                                                            while (it6.hasNext()) {
                                                                String str8 = str7;
                                                                Integer num2 = new Integer(((WeeklyChallengeLeagueAsset) it6.next()).getLevel());
                                                                if (num.compareTo(num2) < 0) {
                                                                    num = num2;
                                                                }
                                                                str7 = str8;
                                                            }
                                                        } else {
                                                            num = null;
                                                        }
                                                        str5 = str7;
                                                        if (num != null) {
                                                            i19 = num.intValue();
                                                            this.M = null;
                                                            this.r = null;
                                                            this.s = null;
                                                            this.t = null;
                                                            this.u = zu4Var11;
                                                            this.v = zu4Var12;
                                                            this.w = str4;
                                                            this.x = list2;
                                                            this.D = i15;
                                                            this.E = i16;
                                                            this.F = i17;
                                                            this.G = i18;
                                                            this.H = i14;
                                                            this.I = i19;
                                                            this.L = 7;
                                                            T6 = zu4Var8.T(this);
                                                            if (T6 != lu3Var) {
                                                                List<WeeklyChallengeLeagueAsset> list6 = list2;
                                                                str6 = str4;
                                                                i20 = i19;
                                                                list3 = list6;
                                                                int i46 = i15;
                                                                i21 = i18;
                                                                i22 = i46;
                                                                zu4Var13 = zu4Var12;
                                                                zu4Var14 = zu4Var11;
                                                                i23 = i14;
                                                                int i47 = i16;
                                                                weeklyChallengeLeaderboardResponse3 = (WeeklyChallengeLeaderboardResponse) T6;
                                                                if (weeklyChallengeLeaderboardResponse3 != null && (rankings2 = weeklyChallengeLeaderboardResponse3.getRankings()) != null) {
                                                                    it4 = rankings2.iterator();
                                                                    while (true) {
                                                                        if (it4.hasNext()) {
                                                                            obj3 = null;
                                                                        } else {
                                                                            obj3 = it4.next();
                                                                            it5 = it4;
                                                                            if (!Intrinsics.c(((WeeklyLeaderboardUser) obj3).getId(), WeeklyChallengeViewModel.l().getId())) {
                                                                                it4 = it5;
                                                                            }
                                                                        }
                                                                    }
                                                                    weeklyLeaderboardUser = (WeeklyLeaderboardUser) obj3;
                                                                    if (weeklyLeaderboardUser != null && (currentWeeklyChallengeWeeklyStreak = weeklyLeaderboardUser.getCurrentWeeklyChallengeWeeklyStreak()) != null) {
                                                                        i24 = currentWeeklyChallengeWeeklyStreak.intValue();
                                                                        if (i23 <= i17) {
                                                                            weeklyUnchangedOnTop = new WeeklyStatus.WeeklyPromotion(i21, str6, i23, i24);
                                                                        } else if (i23 < i17) {
                                                                            weeklyUnchangedOnTop = new WeeklyStatus.WeeklyDemotion(i21, str6, i23, i24);
                                                                        } else if (i23 == i20) {
                                                                            weeklyUnchangedOnTop = new WeeklyStatus.WeeklyUnchangedOnTop(i21, str6, i23, i24);
                                                                        } else {
                                                                            int i48 = i6;
                                                                            if (i23 == i48) {
                                                                                zu4 zu4Var17 = zu4Var13;
                                                                                z = i48;
                                                                                zu4Var15 = zu4Var17;
                                                                            } else {
                                                                                zu4Var15 = zu4Var13;
                                                                                z = 0;
                                                                            }
                                                                            weeklyUnchanged = new WeeklyStatus.WeeklyUnchanged(i21, str6, i23, i24, z);
                                                                            it2 = list3.iterator();
                                                                            while (true) {
                                                                                if (it2.hasNext()) {
                                                                                    Object next = it2.next();
                                                                                    it3 = it2;
                                                                                    obj2 = next;
                                                                                    if (((WeeklyChallengeLeagueAsset) next).getLevel() != weeklyUnchanged.getNewTier()) {
                                                                                        it2 = it3;
                                                                                    }
                                                                                } else {
                                                                                    obj2 = null;
                                                                                }
                                                                            }
                                                                            WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset3 = (WeeklyChallengeLeagueAsset) obj2;
                                                                            weeklyChallengeLeagueAsset = weeklyChallengeLeagueAsset3 == null ? (WeeklyChallengeLeagueAsset) CollectionsKt.firstOrNull(list3) : weeklyChallengeLeagueAsset3;
                                                                            this.M = null;
                                                                            this.r = null;
                                                                            this.s = null;
                                                                            this.t = null;
                                                                            this.u = null;
                                                                            this.v = zu4Var15;
                                                                            this.w = null;
                                                                            this.x = list3;
                                                                            this.y = weeklyUnchanged;
                                                                            this.z = weeklyChallengeLeagueAsset;
                                                                            this.D = i22;
                                                                            this.E = i47;
                                                                            this.F = i17;
                                                                            this.G = i21;
                                                                            this.H = i23;
                                                                            this.I = i20;
                                                                            this.J = i24;
                                                                            this.L = 8;
                                                                            T7 = zu4Var14.T(this);
                                                                            if (T7 != lu3Var) {
                                                                                i25 = i20;
                                                                                i26 = i24;
                                                                                list4 = list3;
                                                                                i27 = i17;
                                                                                i28 = i21;
                                                                                i29 = i22;
                                                                                i30 = i23;
                                                                                weeklyStatus = weeklyUnchanged;
                                                                                i31 = i47;
                                                                                zu4Var16 = zu4Var15;
                                                                                weeklyChallengeLeaderboardResponse4 = (WeeklyChallengeLeaderboardResponse) T7;
                                                                                if (weeklyChallengeLeaderboardResponse4 != null) {
                                                                                    this.M = null;
                                                                                    this.r = null;
                                                                                    this.s = null;
                                                                                    this.t = null;
                                                                                    this.u = null;
                                                                                    this.v = null;
                                                                                    this.w = null;
                                                                                    this.x = list4;
                                                                                    this.y = weeklyStatus;
                                                                                    this.z = weeklyChallengeLeagueAsset;
                                                                                    this.A = weeklyChallengeViewModel2;
                                                                                    this.B = weeklyChallengeLeaderboardResponse4;
                                                                                    this.D = i29;
                                                                                    this.E = i31;
                                                                                    this.F = i27;
                                                                                    this.G = i28;
                                                                                    this.H = i30;
                                                                                    this.I = i25;
                                                                                    this.J = i26;
                                                                                    this.K = 0;
                                                                                    this.L = 9;
                                                                                    T8 = zu4Var16.T(this);
                                                                                    if (T8 != lu3Var) {
                                                                                        WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset4 = weeklyChallengeLeagueAsset;
                                                                                        i32 = i29;
                                                                                        list5 = list4;
                                                                                        weeklyChallengeLeagueAsset2 = weeklyChallengeLeagueAsset4;
                                                                                        weeklyStatus2 = weeklyStatus;
                                                                                        weeklyChallengeLeaderboardResponse5 = weeklyChallengeLeaderboardResponse4;
                                                                                        i33 = 0;
                                                                                        ProfileData profileData2 = (ProfileData) yaa.x((x2g) T8);
                                                                                        weeklyChallengeViewModel2.getClass();
                                                                                        this.M = null;
                                                                                        this.r = null;
                                                                                        this.s = null;
                                                                                        this.t = null;
                                                                                        this.u = null;
                                                                                        this.v = null;
                                                                                        this.w = null;
                                                                                        this.x = null;
                                                                                        this.y = weeklyStatus2;
                                                                                        this.z = weeklyChallengeLeagueAsset2;
                                                                                        this.A = weeklyChallengeViewModel2;
                                                                                        this.B = null;
                                                                                        this.C = profileData2;
                                                                                        this.D = i32;
                                                                                        this.E = i31;
                                                                                        this.F = i27;
                                                                                        this.G = i28;
                                                                                        this.H = i30;
                                                                                        this.I = i25;
                                                                                        this.J = i26;
                                                                                        this.K = i33;
                                                                                        this.L = 10;
                                                                                        WeeklyChallengeViewModel weeklyChallengeViewModel3 = weeklyChallengeViewModel2;
                                                                                        k = weeklyChallengeViewModel3.k(profileData2, WeeklyChallengeViewModel.l(), list5, weeklyChallengeLeaderboardResponse5, this);
                                                                                        if (k != lu3Var) {
                                                                                            weeklyChallengeViewModel = weeklyChallengeViewModel3;
                                                                                            profileData = profileData2;
                                                                                            weeklyStatus3 = weeklyStatus2;
                                                                                            w3l w3lVar = (w3l) k;
                                                                                            fdi fdiVar2 = weeklyChallengeViewModel.m;
                                                                                            s3l s3lVar = new s3l(w3lVar.a, weeklyStatus3, w3lVar.b, profileData == null ? profileData.getWeeklyChallengePreviousWeeklyStreak() : null, new p4b(true, false, (weeklyChallengeLeagueAsset2 != null || (title = weeklyChallengeLeagueAsset2.getTitle()) == null) ? str5 : title, (weeklyChallengeLeagueAsset2 != null || (imageUrl = weeklyChallengeLeagueAsset2.getImageUrl()) == null || (png3 = imageUrl.getPng()) == null) ? str5 : png3, (weeklyChallengeLeagueAsset2 != null || (lockedImageLightUrl = weeklyChallengeLeagueAsset2.getLockedImageLightUrl()) == null || (png2 = lockedImageLightUrl.getPng()) == null) ? str5 : png2, (weeklyChallengeLeagueAsset2 != null || (lockedImageAmoledUrl = weeklyChallengeLeagueAsset2.getLockedImageAmoledUrl()) == null || (png = lockedImageAmoledUrl.getPng()) == null) ? str5 : png, 1, 0));
                                                                                            fdiVar2.getClass();
                                                                                            fdiVar2.m(null, s3lVar);
                                                                                            Unit unit2 = Unit.a;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                return Unit.a;
                                                                            }
                                                                        }
                                                                        weeklyUnchanged = weeklyUnchangedOnTop;
                                                                        zu4Var15 = zu4Var13;
                                                                        it2 = list3.iterator();
                                                                        while (true) {
                                                                            if (it2.hasNext()) {
                                                                            }
                                                                            it2 = it3;
                                                                        }
                                                                        WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset32 = (WeeklyChallengeLeagueAsset) obj2;
                                                                        if (weeklyChallengeLeagueAsset32 == null) {
                                                                        }
                                                                        this.M = null;
                                                                        this.r = null;
                                                                        this.s = null;
                                                                        this.t = null;
                                                                        this.u = null;
                                                                        this.v = zu4Var15;
                                                                        this.w = null;
                                                                        this.x = list3;
                                                                        this.y = weeklyUnchanged;
                                                                        this.z = weeklyChallengeLeagueAsset;
                                                                        this.D = i22;
                                                                        this.E = i47;
                                                                        this.F = i17;
                                                                        this.G = i21;
                                                                        this.H = i23;
                                                                        this.I = i20;
                                                                        this.J = i24;
                                                                        this.L = 8;
                                                                        T7 = zu4Var14.T(this);
                                                                        if (T7 != lu3Var) {
                                                                        }
                                                                    }
                                                                }
                                                                i24 = 0;
                                                                if (i23 <= i17) {
                                                                }
                                                                weeklyUnchanged = weeklyUnchangedOnTop;
                                                                zu4Var15 = zu4Var13;
                                                                it2 = list3.iterator();
                                                                while (true) {
                                                                    if (it2.hasNext()) {
                                                                    }
                                                                    it2 = it3;
                                                                }
                                                                WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset322 = (WeeklyChallengeLeagueAsset) obj2;
                                                                if (weeklyChallengeLeagueAsset322 == null) {
                                                                }
                                                                this.M = null;
                                                                this.r = null;
                                                                this.s = null;
                                                                this.t = null;
                                                                this.u = null;
                                                                this.v = zu4Var15;
                                                                this.w = null;
                                                                this.x = list3;
                                                                this.y = weeklyUnchanged;
                                                                this.z = weeklyChallengeLeagueAsset;
                                                                this.D = i22;
                                                                this.E = i47;
                                                                this.F = i17;
                                                                this.G = i21;
                                                                this.H = i23;
                                                                this.I = i20;
                                                                this.J = i24;
                                                                this.L = 8;
                                                                T7 = zu4Var14.T(this);
                                                                if (T7 != lu3Var) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i19 = 0;
                                                    this.M = null;
                                                    this.r = null;
                                                    this.s = null;
                                                    this.t = null;
                                                    this.u = zu4Var11;
                                                    this.v = zu4Var12;
                                                    this.w = str4;
                                                    this.x = list2;
                                                    this.D = i15;
                                                    this.E = i16;
                                                    this.F = i17;
                                                    this.G = i18;
                                                    this.H = i14;
                                                    this.I = i19;
                                                    this.L = 7;
                                                    T6 = zu4Var8.T(this);
                                                    if (T6 != lu3Var) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i41++;
                                        i37 = i6;
                                    }
                                }
                            }
                            i6 = i37;
                            i7 = -1;
                            int i422 = i7 + 1;
                            this.M = null;
                            this.r = null;
                            this.s = zu4Var5;
                            this.t = zu4Var3;
                            this.u = zu4Var4;
                            this.v = zu4Var;
                            this.w = str2;
                            this.D = i5;
                            this.E = i2;
                            this.F = i3;
                            this.G = i422;
                            this.L = 4;
                            T3 = zu4Var5.T(this);
                            if (T3 != lu3Var) {
                            }
                        }
                    }
                }
                return lu3Var;
            case 1:
                i = this.E;
                leaderboardId = this.D;
                zu4Var = this.v;
                zu4Var4 = this.u;
                zu4Var3 = this.t;
                t = this.s;
                zu4Var2 = this.r;
                y6a.M(obj);
                w = obj;
                WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse62 = (WeeklyChallengeLeaderboardResponse) w;
                if (weeklyChallengeLeaderboardResponse62 != null) {
                    break;
                }
                this.M = null;
                this.r = zu4Var2;
                this.s = t;
                this.t = zu4Var3;
                this.u = zu4Var4;
                this.v = zu4Var;
                this.D = leaderboardId;
                this.E = i;
                this.F = level;
                this.L = 2;
                T = zu4Var2.T(this);
                if (T != lu3Var) {
                }
                return lu3Var;
            case 2:
                i3 = this.F;
                i2 = this.E;
                int i49 = this.D;
                zu4Var = this.v;
                zu4Var4 = this.u;
                zu4Var3 = this.t;
                t = this.s;
                zu4Var2 = this.r;
                y6a.M(obj);
                i4 = i49;
                T = obj;
                weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) T;
                if (weeklyChallengeLeaderboardResponse != null) {
                    break;
                }
                str = "";
                this.M = null;
                this.r = null;
                this.s = t;
                this.t = zu4Var3;
                this.u = zu4Var4;
                this.v = zu4Var;
                this.w = str;
                this.D = i4;
                this.E = i2;
                this.F = i3;
                this.L = 3;
                T2 = zu4Var2.T(this);
                if (T2 != lu3Var) {
                }
                return lu3Var;
            case 3:
                i3 = this.F;
                i2 = this.E;
                i5 = this.D;
                String str9 = this.w;
                zu4Var = this.v;
                zu4Var4 = this.u;
                zu4Var3 = this.t;
                t = this.s;
                y6a.M(obj);
                str2 = str9;
                T2 = obj;
                zu4Var5 = t;
                weeklyChallengeLeaderboardResponse2 = (WeeklyChallengeLeaderboardResponse) T2;
                if (weeklyChallengeLeaderboardResponse2 != null) {
                    it = rankings.iterator();
                    int i412 = 0;
                    while (it.hasNext()) {
                    }
                    break;
                }
                i6 = i37;
                i7 = -1;
                int i4222 = i7 + 1;
                this.M = null;
                this.r = null;
                this.s = zu4Var5;
                this.t = zu4Var3;
                this.u = zu4Var4;
                this.v = zu4Var;
                this.w = str2;
                this.D = i5;
                this.E = i2;
                this.F = i3;
                this.G = i4222;
                this.L = 4;
                T3 = zu4Var5.T(this);
                if (T3 != lu3Var) {
                }
                return lu3Var;
            case 4:
                int i50 = this.G;
                int i51 = this.F;
                int i52 = this.E;
                int i53 = this.D;
                String str10 = this.w;
                zu4Var7 = this.v;
                zu4 zu4Var18 = this.u;
                zu4 zu4Var19 = this.t;
                zu4Var5 = this.s;
                y6a.M(obj);
                i10 = i50;
                i9 = i52;
                i8 = i51;
                zu4Var6 = zu4Var18;
                zu4Var3 = zu4Var19;
                i6 = 1;
                str2 = str10;
                i11 = i53;
                T3 = obj;
                WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse72 = (WeeklyChallengeLeaderboardResponse) T3;
                if (weeklyChallengeLeaderboardResponse72 != null) {
                    break;
                }
                this.M = null;
                this.r = null;
                this.s = zu4Var5;
                this.t = zu4Var3;
                this.u = zu4Var6;
                this.v = zu4Var7;
                this.w = str2;
                this.D = i11;
                this.E = i9;
                this.F = i8;
                this.G = i10;
                this.H = level2;
                this.L = 5;
                T4 = zu4Var3.T(this);
                if (T4 != lu3Var) {
                }
                return lu3Var;
            case 5:
                i13 = this.H;
                i10 = this.G;
                i8 = this.F;
                i12 = this.E;
                i11 = this.D;
                str3 = this.w;
                zu4Var10 = this.v;
                zu4Var6 = this.u;
                zu4Var9 = this.t;
                zu4Var8 = this.s;
                y6a.M(obj);
                i6 = 1;
                T4 = obj;
                weeklyChallengeAssetsResponse = (WeeklyChallengeAssetsResponse) T4;
                if (weeklyChallengeAssetsResponse != null) {
                    break;
                }
                list = km5.a;
                this.M = null;
                this.r = null;
                this.s = zu4Var8;
                this.t = null;
                this.u = zu4Var6;
                this.v = zu4Var10;
                this.w = str3;
                this.x = list;
                this.D = i11;
                this.E = i12;
                this.F = i8;
                this.G = i10;
                this.H = i13;
                this.L = 6;
                T5 = zu4Var9.T(this);
                if (T5 != lu3Var) {
                }
                return lu3Var;
            case 6:
                int i54 = this.H;
                int i55 = this.G;
                int i56 = this.F;
                int i57 = this.E;
                int i58 = this.D;
                List<WeeklyChallengeLeagueAsset> list7 = this.x;
                String str11 = this.w;
                zu4Var12 = this.v;
                zu4Var11 = this.u;
                zu4Var8 = this.s;
                y6a.M(obj);
                i14 = i54;
                str4 = str11;
                list2 = list7;
                i15 = i58;
                i16 = i57;
                i17 = i56;
                i18 = i55;
                T5 = obj;
                i6 = 1;
                weeklyChallengeAssetsResponse2 = (WeeklyChallengeAssetsResponse) T5;
                if (weeklyChallengeAssetsResponse2 != null) {
                    break;
                }
                str5 = "";
                i19 = 0;
                this.M = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = zu4Var11;
                this.v = zu4Var12;
                this.w = str4;
                this.x = list2;
                this.D = i15;
                this.E = i16;
                this.F = i17;
                this.G = i18;
                this.H = i14;
                this.I = i19;
                this.L = 7;
                T6 = zu4Var8.T(this);
                if (T6 != lu3Var) {
                }
                return lu3Var;
            case 7:
                i20 = this.I;
                i14 = this.H;
                int i59 = this.G;
                i17 = this.F;
                i16 = this.E;
                int i60 = this.D;
                List<WeeklyChallengeLeagueAsset> list8 = this.x;
                String str12 = this.w;
                zu4 zu4Var20 = this.v;
                zu4 zu4Var21 = this.u;
                y6a.M(obj);
                i21 = i59;
                i22 = i60;
                i6 = 1;
                str5 = "";
                list3 = list8;
                str6 = str12;
                zu4Var14 = zu4Var21;
                T6 = obj;
                zu4Var13 = zu4Var20;
                i23 = i14;
                int i472 = i16;
                weeklyChallengeLeaderboardResponse3 = (WeeklyChallengeLeaderboardResponse) T6;
                if (weeklyChallengeLeaderboardResponse3 != null) {
                    it4 = rankings2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                        }
                        it4 = it5;
                    }
                    weeklyLeaderboardUser = (WeeklyLeaderboardUser) obj3;
                    if (weeklyLeaderboardUser != null) {
                        i24 = currentWeeklyChallengeWeeklyStreak.intValue();
                        if (i23 <= i17) {
                        }
                        weeklyUnchanged = weeklyUnchangedOnTop;
                        zu4Var15 = zu4Var13;
                        it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                            }
                            it2 = it3;
                        }
                        WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset3222 = (WeeklyChallengeLeagueAsset) obj2;
                        if (weeklyChallengeLeagueAsset3222 == null) {
                        }
                        this.M = null;
                        this.r = null;
                        this.s = null;
                        this.t = null;
                        this.u = null;
                        this.v = zu4Var15;
                        this.w = null;
                        this.x = list3;
                        this.y = weeklyUnchanged;
                        this.z = weeklyChallengeLeagueAsset;
                        this.D = i22;
                        this.E = i472;
                        this.F = i17;
                        this.G = i21;
                        this.H = i23;
                        this.I = i20;
                        this.J = i24;
                        this.L = 8;
                        T7 = zu4Var14.T(this);
                        if (T7 != lu3Var) {
                        }
                        return lu3Var;
                    }
                    break;
                }
                i24 = 0;
                if (i23 <= i17) {
                }
                weeklyUnchanged = weeklyUnchangedOnTop;
                zu4Var15 = zu4Var13;
                it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                    it2 = it3;
                }
                WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset32222 = (WeeklyChallengeLeagueAsset) obj2;
                if (weeklyChallengeLeagueAsset32222 == null) {
                }
                this.M = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = zu4Var15;
                this.w = null;
                this.x = list3;
                this.y = weeklyUnchanged;
                this.z = weeklyChallengeLeagueAsset;
                this.D = i22;
                this.E = i472;
                this.F = i17;
                this.G = i21;
                this.H = i23;
                this.I = i20;
                this.J = i24;
                this.L = 8;
                T7 = zu4Var14.T(this);
                if (T7 != lu3Var) {
                }
                return lu3Var;
            case 8:
                i26 = this.J;
                i25 = this.I;
                i30 = this.H;
                i28 = this.G;
                i27 = this.F;
                i31 = this.E;
                i29 = this.D;
                weeklyChallengeLeagueAsset = this.z;
                weeklyStatus = this.y;
                list4 = this.x;
                zu4Var16 = this.v;
                y6a.M(obj);
                T7 = obj;
                str5 = "";
                weeklyChallengeLeaderboardResponse4 = (WeeklyChallengeLeaderboardResponse) T7;
                if (weeklyChallengeLeaderboardResponse4 != null) {
                }
                return Unit.a;
            case 9:
                int i61 = this.K;
                i26 = this.J;
                i25 = this.I;
                i30 = this.H;
                i28 = this.G;
                i27 = this.F;
                int i62 = this.E;
                int i63 = this.D;
                WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse8 = this.B;
                WeeklyChallengeViewModel weeklyChallengeViewModel4 = this.A;
                weeklyChallengeLeagueAsset2 = this.z;
                weeklyStatus2 = this.y;
                List<WeeklyChallengeLeagueAsset> list9 = this.x;
                y6a.M(obj);
                i31 = i62;
                weeklyChallengeViewModel2 = weeklyChallengeViewModel4;
                weeklyChallengeLeaderboardResponse5 = weeklyChallengeLeaderboardResponse8;
                i32 = i63;
                list5 = list9;
                str5 = "";
                i33 = i61;
                T8 = obj;
                ProfileData profileData22 = (ProfileData) yaa.x((x2g) T8);
                weeklyChallengeViewModel2.getClass();
                this.M = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = weeklyStatus2;
                this.z = weeklyChallengeLeagueAsset2;
                this.A = weeklyChallengeViewModel2;
                this.B = null;
                this.C = profileData22;
                this.D = i32;
                this.E = i31;
                this.F = i27;
                this.G = i28;
                this.H = i30;
                this.I = i25;
                this.J = i26;
                this.K = i33;
                this.L = 10;
                WeeklyChallengeViewModel weeklyChallengeViewModel32 = weeklyChallengeViewModel2;
                k = weeklyChallengeViewModel32.k(profileData22, WeeklyChallengeViewModel.l(), list5, weeklyChallengeLeaderboardResponse5, this);
                if (k != lu3Var) {
                }
                return lu3Var;
            case 10:
                profileData = this.C;
                weeklyChallengeViewModel = this.A;
                WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset5 = this.z;
                WeeklyStatus weeklyStatus4 = this.y;
                y6a.M(obj);
                weeklyChallengeLeagueAsset2 = weeklyChallengeLeagueAsset5;
                weeklyStatus3 = weeklyStatus4;
                str5 = "";
                k = obj;
                w3l w3lVar2 = (w3l) k;
                fdi fdiVar22 = weeklyChallengeViewModel.m;
                if (weeklyChallengeLeagueAsset2 != null) {
                    break;
                }
                if (weeklyChallengeLeagueAsset2 != null) {
                    break;
                }
                if (weeklyChallengeLeagueAsset2 != null) {
                    break;
                }
                if (weeklyChallengeLeagueAsset2 != null) {
                    break;
                }
                s3l s3lVar2 = new s3l(w3lVar2.a, weeklyStatus3, w3lVar2.b, profileData == null ? profileData.getWeeklyChallengePreviousWeeklyStreak() : null, new p4b(true, false, (weeklyChallengeLeagueAsset2 != null || (title = weeklyChallengeLeagueAsset2.getTitle()) == null) ? str5 : title, (weeklyChallengeLeagueAsset2 != null || (imageUrl = weeklyChallengeLeagueAsset2.getImageUrl()) == null || (png3 = imageUrl.getPng()) == null) ? str5 : png3, (weeklyChallengeLeagueAsset2 != null || (lockedImageLightUrl = weeklyChallengeLeagueAsset2.getLockedImageLightUrl()) == null || (png2 = lockedImageLightUrl.getPng()) == null) ? str5 : png2, (weeklyChallengeLeagueAsset2 != null || (lockedImageAmoledUrl = weeklyChallengeLeagueAsset2.getLockedImageAmoledUrl()) == null || (png = lockedImageAmoledUrl.getPng()) == null) ? str5 : png, 1, 0));
                fdiVar22.getClass();
                fdiVar22.m(null, s3lVar2);
                Unit unit22 = Unit.a;
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
