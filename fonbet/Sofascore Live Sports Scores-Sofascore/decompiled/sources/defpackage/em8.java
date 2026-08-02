package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class em8 implements Runnable {
    public static final long e;
    public final Context a;
    public final xbl b;
    public final by9 c;
    public int d = 0;

    static {
        rik.x("ForceStopRunnable");
        e = 315360000000L;
    }

    public em8(Context context, xbl xblVar) {
        this.a = context.getApplicationContext();
        this.b = xblVar;
        this.c = xblVar.g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        boolean z;
        int i;
        PendingIntent broadcast;
        by9 by9Var = this.c;
        xbl xblVar = this.b;
        ti3 ti3Var = xblVar.b;
        by9 by9Var2 = xblVar.g;
        WorkDatabase workDatabase = xblVar.c;
        int i2 = fri.e;
        Context context = this.a;
        JobScheduler a = dea.a(context);
        ArrayList d = fri.d(context, a);
        List list = (List) gz8.S(workDatabase.d().a, true, false, new rfi(12));
        HashSet hashSet = new HashSet(d != null ? d.size() : 0);
        if (d != null && !d.isEmpty()) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                qbl f = fri.f(jobInfo);
                if (f != null) {
                    hashSet.add(f.a);
                } else {
                    fri.a(a, jobInfo.getId());
                }
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains((String) it2.next())) {
                    rik.o().getClass();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.beginTransaction();
            try {
                qcl g = workDatabase.g();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    g.g(-1L, (String) it3.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                throw th;
            }
        }
        qcl g2 = workDatabase.g();
        ecl f2 = workDatabase.f();
        workDatabase.beginTransaction();
        try {
            List<lcl> list2 = (List) gz8.S(g2.a, true, false, new nxk(27));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (lcl lclVar : list2) {
                    sbl sblVar = sbl.a;
                    String str = lclVar.a;
                    g2.j(sblVar, str);
                    g2.k(-512, str);
                    g2.g(-1L, str);
                }
            }
            gz8.S(f2.a, false, true, new nxk(24));
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            boolean z3 = z2 || z;
            Long a2 = ((WorkDatabase) by9Var2.a).c().a("reschedule_needed");
            int i3 = 25;
            if (a2 != null && a2.longValue() == 1) {
                rik.o().getClass();
                xblVar.g();
                by9Var2.getClass();
                n4f n4fVar = new n4f("reschedule_needed", 0L);
                o4f c = ((WorkDatabase) by9Var2.a).c();
                gz8.S(c.a, false, true, new ord(i3, c, n4fVar));
                return;
            }
            try {
                i = Build.VERSION.SDK_INT;
                int i4 = i >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i4);
            } catch (IllegalArgumentException | SecurityException unused) {
                rik.o().getClass();
            }
            if (i >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long a3 = ((WorkDatabase) by9Var.a).c().a("last_force_stop_ms");
                    long longValue = a3 != null ? a3.longValue() : 0L;
                    for (int i5 = 0; i5 < historicalProcessExitReasons.size(); i5++) {
                        ApplicationExitInfo b = hg6.b(historicalProcessExitReasons.get(i5));
                        if (b.getReason() == 10 && b.getTimestamp() >= longValue) {
                            rik.o().getClass();
                            xblVar.g();
                            bgf bgfVar = ti3Var.d;
                            long currentTimeMillis = System.currentTimeMillis();
                            by9Var.getClass();
                            n4f n4fVar2 = new n4f("last_force_stop_ms", Long.valueOf(currentTimeMillis));
                            o4f c2 = ((WorkDatabase) by9Var.a).c();
                            gz8.S(c2.a, false, true, new ord(i3, c2, n4fVar2));
                            return;
                        }
                    }
                }
            } else if (broadcast == null) {
                b(context);
                rik.o().getClass();
                xblVar.g();
                bgf bgfVar2 = ti3Var.d;
                long currentTimeMillis2 = System.currentTimeMillis();
                by9Var.getClass();
                n4f n4fVar22 = new n4f("last_force_stop_ms", Long.valueOf(currentTimeMillis2));
                o4f c22 = ((WorkDatabase) by9Var.a).c();
                gz8.S(c22.a, false, true, new ord(i3, c22, n4fVar22));
                return;
            }
            if (z3) {
                rik.o().getClass();
                ssg.b(ti3Var, workDatabase, xblVar.e);
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean a;
        xbl xblVar = this.b;
        ti3 ti3Var = xblVar.b;
        try {
            ti3Var.getClass();
            boolean isEmpty = TextUtils.isEmpty(null);
            Context context = this.a;
            if (isEmpty) {
                rik.o().getClass();
                a = true;
            } else {
                a = f8f.a(context, ti3Var);
                rik.o().getClass();
            }
            if (!a) {
                return;
            }
            while (true) {
                try {
                    aik.a0(context);
                    rik.o().getClass();
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            String str = kda.D(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            rik.o().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException(str, e2);
                            ti3Var.getClass();
                            throw illegalStateException;
                        }
                        rik.o().getClass();
                        try {
                            Thread.sleep(this.d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    rik.o().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    ti3Var.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            xblVar.f();
        }
    }
}
