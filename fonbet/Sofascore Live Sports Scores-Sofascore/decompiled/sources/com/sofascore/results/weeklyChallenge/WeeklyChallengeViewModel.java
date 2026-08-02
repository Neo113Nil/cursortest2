package com.sofascore.results.weeklyChallenge;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.weeklyChallenge.ActiveWeeklyLeague;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeaderboardResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeagueAsset;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeTimestampData;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeTimestampResponse;
import com.sofascore.model.weeklyChallenge.WeeklyLeaderboardUser;
import com.sofascore.results.R;
import defpackage.a3l;
import defpackage.a5f;
import defpackage.a70;
import defpackage.ajj;
import defpackage.amd;
import defpackage.b7;
import defpackage.bga;
import defpackage.c4l;
import defpackage.ccd;
import defpackage.d4l;
import defpackage.dhk;
import defpackage.dv3;
import defpackage.f6a;
import defpackage.fdi;
import defpackage.fyk;
import defpackage.gdi;
import defpackage.gmf;
import defpackage.gz8;
import defpackage.h4l;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.i4l;
import defpackage.ia0;
import defpackage.iz2;
import defpackage.jof;
import defpackage.jp5;
import defpackage.k13;
import defpackage.k76;
import defpackage.ke0;
import defpackage.l3l;
import defpackage.l6g;
import defpackage.llf;
import defpackage.lu3;
import defpackage.oc;
import defpackage.ok3;
import defpackage.q3l;
import defpackage.q8;
import defpackage.s96;
import defpackage.s9a;
import defpackage.sha;
import defpackage.slf;
import defpackage.sq3;
import defpackage.tlf;
import defpackage.u3l;
import defpackage.uic;
import defpackage.un0;
import defpackage.vl;
import defpackage.w3l;
import defpackage.w9h;
import defpackage.waa;
import defpackage.x2g;
import defpackage.xld;
import defpackage.xw3;
import defpackage.y3l;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.z45;
import defpackage.zu3;
import defpackage.zzc;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/WeeklyChallengeViewModel;", "Lq8;", "t3l", "x3l", "b4l", "LeaderboardInfoType", "c4l", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyChallengeViewModel extends q8 {
    public final jof A;
    public final zzc B;
    public final zzc C;
    public final zzc D;
    public final zzc E;
    public final LinkedHashSet F;
    public final a3l e;
    public final s96 f;
    public final fyk g;
    public final dhk h;
    public final amd i;
    public final SharedPreferences j;
    public final fdi k;
    public final jof l;
    public final fdi m;
    public final jof n;
    public final fdi o;
    public final jof p;
    public Integer q;
    public final fdi r;
    public final jof s;
    public final fdi t;
    public final jof u;
    public final fdi v;
    public final jof w;
    public final fdi x;
    public final jof y;
    public final fdi z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/WeeklyChallengeViewModel$LeaderboardInfoType;", "", "infoTitleRes", "", "analyticsName", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getInfoTitleRes", "()I", "getAnalyticsName", "()Ljava/lang/String;", "FULL_LEADERBOARD_INFO", "POINTS_INFO", "ZONE_INFO", "TIME_INFO", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LeaderboardInfoType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ LeaderboardInfoType[] $VALUES;

        @NotNull
        private final String analyticsName;
        private final int infoTitleRes;
        public static final LeaderboardInfoType FULL_LEADERBOARD_INFO = new LeaderboardInfoType("FULL_LEADERBOARD_INFO", 0, R.string.weekly_challenge_info, "ChallengeInfoModal");
        public static final LeaderboardInfoType POINTS_INFO = new LeaderboardInfoType("POINTS_INFO", 1, R.string.weekly_challenge_collecting_points, "ChallengePointsModal");
        public static final LeaderboardInfoType ZONE_INFO = new LeaderboardInfoType("ZONE_INFO", 2, R.string.leaderboard_explainer_bottom_sheet_header, "ChallengePromotionZoneModal");
        public static final LeaderboardInfoType TIME_INFO = new LeaderboardInfoType("TIME_INFO", 3, R.string.timer_explainer_bottom_sheet_header, "ChallengeTimerModal");

        private static final /* synthetic */ LeaderboardInfoType[] $values() {
            return new LeaderboardInfoType[]{FULL_LEADERBOARD_INFO, POINTS_INFO, ZONE_INFO, TIME_INFO};
        }

        static {
            LeaderboardInfoType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private LeaderboardInfoType(String str, int i, int i2, String str2) {
            this.infoTitleRes = i2;
            this.analyticsName = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static LeaderboardInfoType valueOf(String str) {
            return (LeaderboardInfoType) Enum.valueOf(LeaderboardInfoType.class, str);
        }

        public static LeaderboardInfoType[] values() {
            return (LeaderboardInfoType[]) $VALUES.clone();
        }

        @NotNull
        public final String getAnalyticsName() {
            return this.analyticsName;
        }

        public final int getInfoTitleRes() {
            return this.infoTitleRes;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeeklyChallengeViewModel(Application application, a3l a3lVar, s96 s96Var, fyk fykVar, dhk dhkVar, amd amdVar, SharedPreferences sharedPreferences) {
        super(application);
        SharedPreferences d;
        a3lVar.getClass();
        s96Var.getClass();
        fykVar.getClass();
        dhkVar.getClass();
        amdVar.getClass();
        sharedPreferences.getClass();
        this.e = a3lVar;
        this.f = s96Var;
        this.g = fykVar;
        this.h = dhkVar;
        this.i = amdVar;
        this.j = sharedPreferences;
        fdi a = gdi.a(u3l.a);
        this.k = a;
        this.l = un0.u(a);
        fdi a2 = gdi.a(q3l.a);
        this.m = a2;
        this.n = un0.u(a2);
        fdi a3 = gdi.a(y3l.a);
        this.o = a3;
        this.p = un0.u(a3);
        Boolean bool = Boolean.FALSE;
        fdi a4 = gdi.a(bool);
        this.r = a4;
        this.s = un0.u(a4);
        fdi a5 = gdi.a(new c4l(false, false));
        this.t = a5;
        this.u = un0.u(a5);
        fdi a6 = gdi.a(null);
        this.v = a6;
        this.w = un0.u(a6);
        fdi a7 = gdi.a(bool);
        this.x = a7;
        this.y = un0.u(a7);
        Context i = i();
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext = i.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences2 = d;
        }
        fdi a8 = gdi.a(Boolean.valueOf(sharedPreferences2.getBoolean("PREF_SHOW_WEEKLY_COMP_JOIN_DIALOG", true)));
        this.z = a8;
        this.A = un0.u(a8);
        zzc zzcVar = new zzc();
        this.B = zzcVar;
        this.C = zzcVar;
        zzc zzcVar2 = new zzc();
        this.D = zzcVar2;
        this.E = zzcVar2;
        this.F = new LinkedHashSet();
    }

    public static UserAccount l() {
        ia0 ia0Var = ia0.q;
        return ok3.p().e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x033e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ProfileData profileData, UserAccount userAccount, List list, WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse, sq3 sq3Var) {
        d4l d4lVar;
        int i;
        oc ocVar;
        ArrayList arrayList;
        int i2;
        int i3;
        l3l l3lVar;
        Object obj;
        boolean c;
        int i4;
        oc ocVar2;
        int i5;
        Event event;
        b7 b7Var;
        Event event2;
        int i6;
        int i7;
        boolean z;
        int i8;
        ArrayList arrayList2;
        boolean z2;
        SharedPreferences d;
        EventResponse eventResponse;
        Event event3;
        Integer weeklyChallengePreviousWeeklyStreak;
        Integer weeklyChallengeCurrentWeeklyStreak;
        List list2;
        ProfileData profileData2 = profileData;
        if (sq3Var instanceof d4l) {
            d4lVar = (d4l) sq3Var;
            int i9 = d4lVar.A;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                d4lVar.A = i9 - Integer.MIN_VALUE;
                d4l d4lVar2 = d4lVar;
                Object obj2 = d4lVar2.y;
                lu3 lu3Var = lu3.a;
                i = d4lVar2.A;
                int i10 = 1;
                if (i != 0) {
                    y6a.M(obj2);
                    int maxLeaderboardLevel = userAccount.getMaxLeaderboardLevel();
                    int level = weeklyChallengeLeaderboardResponse.getLeague().getLevel();
                    list.getClass();
                    ArrayList arrayList3 = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset = (WeeklyChallengeLeagueAsset) it.next();
                        arrayList3.add(waa.M(weeklyChallengeLeagueAsset, weeklyChallengeLeagueAsset.getLevel() <= maxLeaderboardLevel, weeklyChallengeLeagueAsset.getLevel() == level));
                    }
                    b7 Z = l6g.Z(arrayList3);
                    ActiveWeeklyLeague league = weeklyChallengeLeaderboardResponse.getLeague();
                    league.getClass();
                    ocVar = new oc(league.getLevel(), league.getEndDateTimestamp(), league.getTitle());
                    int size = weeklyChallengeLeaderboardResponse.getRankings().size();
                    int c2 = llf.c(weeklyChallengeLeaderboardResponse.getPromotionZoneUsers(), 0, size);
                    int c3 = llf.c(weeklyChallengeLeaderboardResponse.getNeutralZoneUsers(), 0, size);
                    int demotionZoneUsers = weeklyChallengeLeaderboardResponse.getDemotionZoneUsers();
                    int i11 = (size - c2) - c3;
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    int c4 = llf.c(demotionZoneUsers, 0, i11);
                    List<WeeklyLeaderboardUser> subList = weeklyChallengeLeaderboardResponse.getRankings().subList(0, c2);
                    ArrayList arrayList4 = new ArrayList(k13.r(subList, 10));
                    for (WeeklyLeaderboardUser weeklyLeaderboardUser : subList) {
                        arrayList4.add(f6a.L(weeklyLeaderboardUser, weeklyChallengeLeaderboardResponse.getRankings().indexOf(weeklyLeaderboardUser) + 1, true, false, userAccount.getId(), userAccount.getNickname()));
                        i10 = i10;
                    }
                    int i12 = i10;
                    List<WeeklyLeaderboardUser> subList2 = weeklyChallengeLeaderboardResponse.getRankings().subList(c2, llf.c(c3 + c2, c2, size));
                    ArrayList arrayList5 = new ArrayList(k13.r(subList2, 10));
                    for (WeeklyLeaderboardUser weeklyLeaderboardUser2 : subList2) {
                        arrayList5.add(f6a.L(weeklyLeaderboardUser2, weeklyChallengeLeaderboardResponse.getRankings().indexOf(weeklyLeaderboardUser2) + 1, false, false, userAccount.getId(), userAccount.getNickname()));
                    }
                    List<WeeklyLeaderboardUser> subList3 = weeklyChallengeLeaderboardResponse.getRankings().subList(size - c4, size);
                    ArrayList arrayList6 = new ArrayList(k13.r(subList3, 10));
                    for (WeeklyLeaderboardUser weeklyLeaderboardUser3 : subList3) {
                        arrayList6.add(f6a.L(weeklyLeaderboardUser3, weeklyChallengeLeaderboardResponse.getRankings().indexOf(weeklyLeaderboardUser3) + 1, false, true, userAccount.getId(), userAccount.getNickname()));
                    }
                    arrayList = new ArrayList();
                    if (!arrayList4.isEmpty()) {
                        arrayList.addAll(arrayList4);
                        arrayList.add(new tlf(gmf.PROMOTION_ZONE));
                    }
                    arrayList.addAll(arrayList5);
                    if (!arrayList6.isEmpty()) {
                        arrayList.add(new tlf(gmf.DEMOTION_ZONE));
                        arrayList.addAll(arrayList6);
                    }
                    if (CollectionsKt.w0(arrayList6, CollectionsKt.w0(arrayList5, arrayList4)).size() < 5) {
                        arrayList.add(new tlf(gmf.FILLING_UP_ZONE));
                    }
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof slf) {
                            arrayList7.add(next);
                        }
                    }
                    Iterator it3 = arrayList7.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (Intrinsics.c(((slf) it3.next()).a, userAccount.getId())) {
                            i2 = i13;
                            break;
                        }
                        i13++;
                    }
                    Iterator it4 = list.iterator();
                    int i14 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (((WeeklyChallengeLeagueAsset) it4.next()).getLevel() == weeklyChallengeLeaderboardResponse.getLeague().getLevel()) {
                            i3 = i14;
                            break;
                        }
                        i14++;
                    }
                    bga bgaVar = xld.a;
                    if (!xld.g(i())) {
                        l3lVar = new l3l(Z, ocVar, i3, l6g.Z(arrayList), i2, false, null);
                        return new w3l(l3lVar, (profileData2 != null || (weeklyChallengeCurrentWeeklyStreak = profileData2.getWeeklyChallengeCurrentWeeklyStreak()) == null) ? 0 : weeklyChallengeCurrentWeeklyStreak.intValue(), (profileData2 != null || (weeklyChallengePreviousWeeklyStreak = profileData2.getWeeklyChallengePreviousWeeklyStreak()) == null) ? 0 : weeklyChallengePreviousWeeklyStreak.intValue());
                    }
                    LocalDate localDate = Instant.ofEpochMilli(userAccount.getWeeklyChallengeDailyBonusUsedAtTimestamp() * 1000).atZone(ZoneOffset.UTC).toLocalDate();
                    LocalDate now = LocalDate.now();
                    Integer num = new Integer(this.j.getInt("PREF_DAILY_BONUS_EVENT_ID", -1));
                    if (num.intValue() == -1) {
                        num = null;
                    }
                    Iterator<T> it5 = weeklyChallengeLeaderboardResponse.getRankings().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it5.next();
                        if (Intrinsics.c(((WeeklyLeaderboardUser) obj).getId(), userAccount.getId())) {
                            break;
                        }
                    }
                    WeeklyLeaderboardUser weeklyLeaderboardUser4 = (WeeklyLeaderboardUser) obj;
                    Integer currentDailyBonusEventId = weeklyLeaderboardUser4 != null ? weeklyLeaderboardUser4.getCurrentDailyBonusEventId() : null;
                    if (currentDailyBonusEventId != null) {
                        num = currentDailyBonusEventId;
                    }
                    c = Intrinsics.c(now, localDate);
                    int i15 = ke0.c;
                    ArrayList arrayList8 = dv3.a;
                    Country b = dv3.b(Integer.valueOf(i15));
                    if (this.i.c().size() <= i12 && !zu3.v0.hasMcc(Integer.valueOf(i15)) && b != null) {
                        Context i16 = i();
                        if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = i16.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            ccd ccdVar = vl.b;
                        }
                        if (!c || num == null) {
                            Integer num2 = new Integer(1);
                            Set b2 = w9h.b(Sports.FOOTBALL);
                            d4lVar2.r = profileData2;
                            d4lVar2.s = Z;
                            d4lVar2.t = ocVar;
                            d4lVar2.u = arrayList;
                            d4lVar2.v = i2;
                            d4lVar2.w = i3;
                            d4lVar2.x = c;
                            d4lVar2.A = 2;
                            event2 = null;
                            obj2 = s9a.r(new ajj(this, num2, b2, 0 == true ? 1 : 0, 8), d4lVar2);
                            if (obj2 != lu3Var) {
                                i6 = i2;
                                i7 = i3;
                                z = c;
                                b7Var = Z;
                                list2 = (List) obj2;
                                if (list2 == null) {
                                }
                            }
                        } else {
                            s96 s96Var = this.f;
                            int intValue = num.intValue();
                            d4lVar2.r = profileData2;
                            d4lVar2.s = Z;
                            d4lVar2.t = ocVar;
                            d4lVar2.u = arrayList;
                            d4lVar2.v = i2;
                            d4lVar2.w = i3;
                            d4lVar2.x = c;
                            d4lVar2.A = 1;
                            obj2 = s96Var.d(intValue, d4lVar2);
                            if (obj2 != lu3Var) {
                                i8 = i2;
                                arrayList2 = arrayList;
                                i7 = i3;
                                z2 = c;
                                b7Var = Z;
                                eventResponse = (EventResponse) yaa.x((x2g) obj2);
                                if (eventResponse == null) {
                                }
                            }
                        }
                        return lu3Var;
                    }
                    int i17 = i3;
                    i4 = i2;
                    ocVar2 = ocVar;
                    i5 = i17;
                    event = null;
                    b7Var = Z;
                } else if (i == 1) {
                    z2 = d4lVar2.x;
                    i7 = d4lVar2.w;
                    i8 = d4lVar2.v;
                    arrayList2 = d4lVar2.u;
                    oc ocVar3 = d4lVar2.t;
                    b7Var = d4lVar2.s;
                    ProfileData profileData3 = d4lVar2.r;
                    y6a.M(obj2);
                    ocVar = ocVar3;
                    profileData2 = profileData3;
                    eventResponse = (EventResponse) yaa.x((x2g) obj2);
                    if (eventResponse == null) {
                        event3 = eventResponse.getEvent();
                        c = z2;
                        i4 = i8;
                        arrayList = arrayList2;
                        event = event3;
                        ocVar2 = ocVar;
                        i5 = i7;
                    } else {
                        c = z2;
                        i4 = i8;
                        arrayList = arrayList2;
                        ocVar2 = ocVar;
                        event = null;
                        i5 = i7;
                    }
                } else {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = d4lVar2.x;
                    i7 = d4lVar2.w;
                    i6 = d4lVar2.v;
                    ArrayList arrayList9 = d4lVar2.u;
                    oc ocVar4 = d4lVar2.t;
                    b7Var = d4lVar2.s;
                    ProfileData profileData4 = d4lVar2.r;
                    y6a.M(obj2);
                    arrayList = arrayList9;
                    ocVar = ocVar4;
                    profileData2 = profileData4;
                    event2 = null;
                    list2 = (List) obj2;
                    if (list2 == null) {
                        event3 = (Event) CollectionsKt.firstOrNull(list2);
                        c = z;
                        i4 = i6;
                        event = event3;
                        ocVar2 = ocVar;
                        i5 = i7;
                    } else {
                        c = z;
                        i4 = i6;
                        event = event2;
                        ocVar2 = ocVar;
                        i5 = i7;
                    }
                }
                l3lVar = new l3l(b7Var, ocVar2, i5, l6g.Z(arrayList), i4, c, event);
                return new w3l(l3lVar, (profileData2 != null || (weeklyChallengeCurrentWeeklyStreak = profileData2.getWeeklyChallengeCurrentWeeklyStreak()) == null) ? 0 : weeklyChallengeCurrentWeeklyStreak.intValue(), (profileData2 != null || (weeklyChallengePreviousWeeklyStreak = profileData2.getWeeklyChallengePreviousWeeklyStreak()) == null) ? 0 : weeklyChallengePreviousWeeklyStreak.intValue());
            }
        }
        d4lVar = new d4l(this, sq3Var);
        d4l d4lVar22 = d4lVar;
        Object obj22 = d4lVar22.y;
        lu3 lu3Var2 = lu3.a;
        i = d4lVar22.A;
        int i102 = 1;
        if (i != 0) {
        }
        l3lVar = new l3l(b7Var, ocVar2, i5, l6g.Z(arrayList), i4, c, event);
        return new w3l(l3lVar, (profileData2 != null || (weeklyChallengeCurrentWeeklyStreak = profileData2.getWeeklyChallengeCurrentWeeklyStreak()) == null) ? 0 : weeklyChallengeCurrentWeeklyStreak.intValue(), (profileData2 != null || (weeklyChallengePreviousWeeklyStreak = profileData2.getWeeklyChallengePreviousWeeklyStreak()) == null) ? 0 : weeklyChallengePreviousWeeklyStreak.intValue());
    }

    public final void m() {
        sha.q(i());
        iz2 z = un0.z(this);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new h4l(this, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r1 == r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r1 != r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        if (r1 == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(sq3 sq3Var) {
        i4l i4lVar;
        int i;
        long startDateTimestamp;
        WeeklyChallengeTimestampData meta;
        WeeklyChallengeTimestampData meta2;
        if (sq3Var instanceof i4l) {
            i4lVar = (i4l) sq3Var;
            int i2 = i4lVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i4lVar.u = i2 - Integer.MIN_VALUE;
                Object obj = i4lVar.s;
                lu3 lu3Var = lu3.a;
                i = i4lVar.u;
                long j = 0;
                a3l a3lVar = this.e;
                if (i != 0) {
                    y6a.M(obj);
                    i4lVar.u = 1;
                    obj = a3lVar.e(i4lVar);
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            return Boolean.valueOf(((Number) obj).intValue() > 0);
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    startDateTimestamp = i4lVar.r;
                    y6a.M(obj);
                    WeeklyChallengeTimestampResponse weeklyChallengeTimestampResponse = (WeeklyChallengeTimestampResponse) obj;
                    if (weeklyChallengeTimestampResponse != null && (meta2 = weeklyChallengeTimestampResponse.getMeta()) != null) {
                        j = meta2.getEndDateTimestamp();
                    }
                    i4lVar.r = startDateTimestamp;
                    i4lVar.u = 3;
                    obj = gz8.U(i4lVar, this.g.a.a, true, false, new k76(j, startDateTimestamp, 4));
                }
                WeeklyChallengeTimestampResponse weeklyChallengeTimestampResponse2 = (WeeklyChallengeTimestampResponse) obj;
                startDateTimestamp = (weeklyChallengeTimestampResponse2 != null || (meta = weeklyChallengeTimestampResponse2.getMeta()) == null) ? 0L : meta.getStartDateTimestamp();
                i4lVar.r = startDateTimestamp;
                i4lVar.u = 2;
                obj = a3lVar.e(i4lVar);
            }
        }
        i4lVar = new i4l(this, sq3Var);
        Object obj2 = i4lVar.s;
        lu3 lu3Var2 = lu3.a;
        i = i4lVar.u;
        long j2 = 0;
        a3l a3lVar2 = this.e;
        if (i != 0) {
        }
        WeeklyChallengeTimestampResponse weeklyChallengeTimestampResponse22 = (WeeklyChallengeTimestampResponse) obj2;
        if (weeklyChallengeTimestampResponse22 != null) {
        }
        i4lVar.r = startDateTimestamp;
        i4lVar.u = 2;
        obj2 = a3lVar2.e(i4lVar);
    }
}
