package com.sofascore.results.service;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkerParameters;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.model.notifications.NotificationSettingKt;
import com.sofascore.model.weeklyChallenge.ActiveWeeklyLeague;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeaderboardResponse;
import com.sofascore.results.weeklyChallenge.WeeklyAlarmReceiver;
import defpackage.a3l;
import defpackage.a5f;
import defpackage.a70;
import defpackage.be5;
import defpackage.bfk;
import defpackage.cfi;
import defpackage.d7a;
import defpackage.gz8;
import defpackage.ir4;
import defpackage.jdb;
import defpackage.jgd;
import defpackage.l4l;
import defpackage.lu3;
import defpackage.n4l;
import defpackage.o4l;
import defpackage.p4l;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.uic;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.y6a;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/results/service/WeeklyChallengeWorker;", "Lcom/sofascore/results/service/AbstractRetryCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lbfk;", "userAccountManager", "La3l;", "weeklyChallengeRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lbfk;La3l;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyChallengeWorker extends AbstractRetryCoroutineWorker {
    public final bfk b;
    public final a3l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeeklyChallengeWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull bfk bfkVar, @NotNull a3l a3lVar) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        bfkVar.getClass();
        a3lVar.getClass();
        this.b = bfkVar;
        this.c = a3lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x019d, code lost:
    
        if (d(r14, r6, r0) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r6.f(r3, r8, r0) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014c, code lost:
    
        if (d(r3, r8, r0) == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.sofascore.results.service.AbstractRetryCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        o4l o4lVar;
        int i;
        UserAccount userAccount;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        UserAccount userAccount2;
        jdb jdbVar;
        jdb jdbVar2;
        if (rq3Var instanceof o4l) {
            o4lVar = (o4l) rq3Var;
            int i13 = o4lVar.z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                o4lVar.z = i13 - Integer.MIN_VALUE;
                Object obj = o4lVar.x;
                Object obj2 = lu3.a;
                i = o4lVar.z;
                int i14 = 7;
                a3l a3lVar = this.c;
                switch (i) {
                    case 0:
                        y6a.M(obj);
                        UserAccount b = this.b.b();
                        int leaderboardId = b.getLeaderboardId();
                        int previousLeaderboardId = b.getPreviousLeaderboardId();
                        String id = b.getId();
                        o4lVar.r = b;
                        o4lVar.t = leaderboardId;
                        o4lVar.u = previousLeaderboardId;
                        o4lVar.z = 1;
                        Object U = gz8.U(o4lVar, a3lVar.b.a, true, false, new cfi(id, i14));
                        if (U != obj2) {
                            userAccount = b;
                            obj = U;
                            i2 = leaderboardId;
                            i3 = previousLeaderboardId;
                            int intValue = ((Number) obj).intValue();
                            i4 = intValue != i2 ? 1 : 0;
                            if (i4 != 0 || i3 == 0 || intValue == 0) {
                                if (userAccount.getIsLoggedIn()) {
                                    String id2 = userAccount.getId();
                                    o4lVar.r = null;
                                    o4lVar.t = i2;
                                    o4lVar.u = i3;
                                    o4lVar.v = intValue;
                                    o4lVar.w = i4;
                                    o4lVar.z = 6;
                                    if (a3lVar.f(id2, i2, o4lVar) != obj2) {
                                        i5 = i3;
                                        i6 = i4;
                                        i7 = i2;
                                        i8 = intValue;
                                        if (i7 != 0) {
                                            if (e()) {
                                                Context applicationContext = getApplicationContext();
                                                applicationContext.getClass();
                                                o4lVar.r = null;
                                                o4lVar.t = i7;
                                                o4lVar.u = i5;
                                                o4lVar.v = i8;
                                                o4lVar.w = i6;
                                                o4lVar.z = 7;
                                                break;
                                            } else {
                                                Context applicationContext2 = getApplicationContext();
                                                applicationContext2.getClass();
                                                d7a.s(applicationContext2);
                                                Unit unit = Unit.a;
                                            }
                                        }
                                    }
                                }
                                Unit unit2 = Unit.a;
                                return jdb.a();
                            }
                            if (i2 == 0) {
                                String id3 = userAccount.getId();
                                o4lVar.r = null;
                                o4lVar.t = i2;
                                o4lVar.u = i3;
                                o4lVar.v = intValue;
                                o4lVar.w = i4;
                                o4lVar.z = 2;
                                break;
                            } else {
                                if (i2 == i3) {
                                    if (e()) {
                                        Context applicationContext3 = getApplicationContext();
                                        applicationContext3.getClass();
                                        o4lVar.r = null;
                                        o4lVar.t = i2;
                                        o4lVar.u = i3;
                                        o4lVar.v = intValue;
                                        o4lVar.w = i4;
                                        o4lVar.z = 5;
                                        break;
                                    } else {
                                        Context applicationContext4 = getApplicationContext();
                                        applicationContext4.getClass();
                                        d7a.s(applicationContext4);
                                        Unit unit3 = Unit.a;
                                    }
                                    return jdb.a();
                                }
                                String id4 = userAccount.getId();
                                o4lVar.r = userAccount;
                                o4lVar.t = i2;
                                o4lVar.u = i3;
                                o4lVar.v = intValue;
                                o4lVar.w = i4;
                                o4lVar.z = 3;
                                Object c = c(i3, i2, o4lVar, id4);
                                if (c != obj2) {
                                    i9 = intValue;
                                    obj = c;
                                    int i15 = i4;
                                    i10 = i3;
                                    i11 = i15;
                                    i12 = i2;
                                    userAccount2 = userAccount;
                                    jdbVar = (jdb) obj;
                                    if (Intrinsics.c(jdbVar, jdb.a())) {
                                        String id5 = userAccount2.getId();
                                        o4lVar.r = null;
                                        o4lVar.s = jdbVar;
                                        o4lVar.t = i12;
                                        o4lVar.u = i10;
                                        o4lVar.v = i9;
                                        o4lVar.w = i11;
                                        o4lVar.z = 4;
                                        if (a3lVar.f(id5, i12, o4lVar) != obj2) {
                                            jdbVar2 = jdbVar;
                                            jdbVar = jdbVar2;
                                        }
                                    }
                                    Context applicationContext5 = getApplicationContext();
                                    applicationContext5.getClass();
                                    d7a.s(applicationContext5);
                                    return jdbVar;
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        i3 = o4lVar.u;
                        i2 = o4lVar.t;
                        userAccount = o4lVar.r;
                        y6a.M(obj);
                        int intValue2 = ((Number) obj).intValue();
                        if (intValue2 != i2) {
                        }
                        if (i4 != 0) {
                        }
                        if (userAccount.getIsLoggedIn()) {
                        }
                        Unit unit22 = Unit.a;
                        return jdb.a();
                    case 2:
                        y6a.M(obj);
                        Context applicationContext6 = getApplicationContext();
                        applicationContext6.getClass();
                        d7a.s(applicationContext6);
                        Unit unit4 = Unit.a;
                        return jdb.a();
                    case 3:
                        i11 = o4lVar.w;
                        i9 = o4lVar.v;
                        i10 = o4lVar.u;
                        i12 = o4lVar.t;
                        userAccount2 = o4lVar.r;
                        y6a.M(obj);
                        jdbVar = (jdb) obj;
                        if (Intrinsics.c(jdbVar, jdb.a())) {
                        }
                        Context applicationContext52 = getApplicationContext();
                        applicationContext52.getClass();
                        d7a.s(applicationContext52);
                        return jdbVar;
                    case 4:
                        jdbVar2 = o4lVar.s;
                        y6a.M(obj);
                        jdbVar = jdbVar2;
                        Context applicationContext522 = getApplicationContext();
                        applicationContext522.getClass();
                        d7a.s(applicationContext522);
                        return jdbVar;
                    case 5:
                        y6a.M(obj);
                        return jdb.a();
                    case 6:
                        i6 = o4lVar.w;
                        i8 = o4lVar.v;
                        i5 = o4lVar.u;
                        i7 = o4lVar.t;
                        y6a.M(obj);
                        if (i7 != 0) {
                        }
                        Unit unit222 = Unit.a;
                        return jdb.a();
                    case 7:
                        y6a.M(obj);
                        Unit unit2222 = Unit.a;
                        return jdb.a();
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        o4lVar = new o4l(this, (sq3) rq3Var);
        Object obj3 = o4lVar.x;
        Object obj22 = lu3.a;
        i = o4lVar.z;
        int i142 = 7;
        a3l a3lVar2 = this.c;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, int i2, sq3 sq3Var, String str) {
        l4l l4lVar;
        int i3;
        if (sq3Var instanceof l4l) {
            l4lVar = (l4l) sq3Var;
            int i4 = l4lVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l4lVar.t = i4 - Integer.MIN_VALUE;
                Object obj = l4lVar.r;
                lu3 lu3Var = lu3.a;
                i3 = l4lVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    n4l n4lVar = new n4l(this, i, i2, str, null);
                    l4lVar.t = 1;
                    obj = s9a.r(n4lVar, l4lVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        l4lVar = new l4l(this, sq3Var);
        Object obj2 = l4lVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = l4lVar.t;
        if (i3 != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.time.LocalDateTime, java.time.chrono.ChronoLocalDateTime] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, int i, sq3 sq3Var) {
        p4l p4lVar;
        int i2;
        Long l;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse;
        long epochSecond;
        ActiveWeeklyLeague league;
        if (sq3Var instanceof p4l) {
            p4lVar = (p4l) sq3Var;
            int i3 = p4lVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p4lVar.u = i3 - Integer.MIN_VALUE;
                Object obj = p4lVar.s;
                lu3 lu3Var = lu3.a;
                i2 = p4lVar.u;
                l = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a3l a3lVar = this.c;
                    String valueOf = String.valueOf(i);
                    p4lVar.r = context;
                    p4lVar.u = 1;
                    obj = a3lVar.d(valueOf, p4lVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = p4lVar.r;
                    y6a.M(obj);
                }
                weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) obj;
                if (weeklyChallengeLeaderboardResponse != null && (league = weeklyChallengeLeaderboardResponse.getLeague()) != null) {
                    l = new Long(league.getEndDateTimestamp());
                }
                if (l != null) {
                    return Boolean.FALSE;
                }
                long longValue = l.longValue();
                Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
                systemService.getClass();
                AlarmManager alarmManager = (AlarmManager) systemService;
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                if (sharedPreferences.getBoolean("PREF_FORCE_SHOW_LEADERBOARD_NOTIFICATION", false)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    wd5 wd5Var = xd5.b;
                    epochSecond = xd5.e(wkn.R(30, be5.SECONDS)) + currentTimeMillis;
                } else {
                    ?? localDateTime = Instant.ofEpochSecond(longValue).atZone(ZoneId.systemDefault()).toLocalDateTime();
                    localDateTime.getClass();
                    LocalDateTime withMinute = localDateTime.withHour(18).withMinute(0);
                    boolean isBefore = withMinute.isBefore(localDateTime);
                    LocalDateTime localDateTime2 = withMinute;
                    if (isBefore) {
                        localDateTime2 = withMinute.plusDays(1L);
                    }
                    epochSecond = 1000 * localDateTime2.toEpochSecond(ZoneId.systemDefault().getRules().getOffset(Instant.now()));
                }
                if (epochSecond > System.currentTimeMillis()) {
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) WeeklyAlarmReceiver.class), 33554432);
                    broadcast.getClass();
                    alarmManager.setAndAllowWhileIdle(0, epochSecond, broadcast);
                }
                return Boolean.TRUE;
            }
        }
        p4lVar = new p4l(this, sq3Var);
        Object obj2 = p4lVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = p4lVar.u;
        l = null;
        if (i2 != 0) {
        }
        weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) obj2;
        if (weeklyChallengeLeaderboardResponse != null) {
            l = new Long(league.getEndDateTimestamp());
        }
        if (l != null) {
        }
    }

    public final boolean e() {
        Object obj;
        Iterator it = ir4.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NotificationSetting notificationSetting = (NotificationSetting) obj;
            if (Intrinsics.c(notificationSetting.getGroup(), "user") && Intrinsics.c(notificationSetting.getName(), "weekly_challenge")) {
                break;
            }
        }
        NotificationSetting notificationSetting2 = (NotificationSetting) obj;
        if (notificationSetting2 == null || jgd.d.contains(NotificationSettingKt.getBackendChannelName(notificationSetting2))) {
            return false;
        }
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        String channelId = notificationSetting2.getChannelId();
        channelId.getClass();
        NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService(NotificationManager.class);
        NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel(channelId) : null;
        return (notificationChannel == null || notificationChannel.getImportance() == 0) ? false : true;
    }
}
