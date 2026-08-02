package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.bhd0;
import xsna.dwx0;
import xsna.fxx0;
import xsna.gxx0;
import xsna.i7s;
import xsna.i8h0;
import xsna.m100;
import xsna.nyx;
import xsna.owx0;
import xsna.sqn0;
import xsna.svx0;
import xsna.syc0;
import xsna.txc0;
import xsna.wkq0;
import xsna.zux0;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    public static final String f = m100.d("ForceStopRunnable");
    public static final long g = TimeUnit.DAYS.toMillis(3650);
    public final Context b;
    public final dwx0 c;
    public final syc0 d;
    public int e = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            m100.d("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            m100.c().getClass();
            ForceStopRunnable.b(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull dwx0 dwx0Var) {
        this.b = context.getApplicationContext();
        this.c = dwx0Var;
        this.d = dwx0Var.g;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + g;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        boolean z;
        boolean z2;
        int i;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        syc0 syc0Var = this.d;
        dwx0 dwx0Var = this.c;
        WorkDatabase workDatabase = dwx0Var.c;
        String str = sqn0.g;
        Context context = this.b;
        JobScheduler a = nyx.a(context);
        ArrayList b = sqn0.b(context, a);
        ArrayList b2 = workDatabase.A().b();
        HashSet hashSet = new HashSet(b != null ? b.size() : 0);
        if (b != null && !b.isEmpty()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                svx0 f2 = sqn0.f(jobInfo);
                if (f2 != null) {
                    hashSet.add(f2.a);
                } else {
                    sqn0.a(a, jobInfo.getId());
                }
            }
        }
        Iterator it2 = b2.iterator();
        while (true) {
            z = true;
            if (it2.hasNext()) {
                if (!hashSet.contains((String) it2.next())) {
                    m100.c().getClass();
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            workDatabase.c();
            try {
                gxx0 D = workDatabase.D();
                Iterator it3 = b2.iterator();
                while (it3.hasNext()) {
                    D.u(-1L, (String) it3.next());
                }
                workDatabase.w();
                workDatabase.q();
            } catch (Throwable th) {
                throw th;
            }
        }
        workDatabase = dwx0Var.c;
        gxx0 D2 = workDatabase.D();
        owx0 C = workDatabase.C();
        workDatabase.c();
        try {
            ArrayList m = D2.m();
            boolean isEmpty = m.isEmpty();
            if (!isEmpty) {
                Iterator it4 = m.iterator();
                while (it4.hasNext()) {
                    fxx0 fxx0Var = (fxx0) it4.next();
                    WorkInfo.State state = WorkInfo.State.ENQUEUED;
                    String str2 = fxx0Var.a;
                    D2.h(state, str2);
                    D2.c(-512, str2);
                    D2.u(-1L, str2);
                }
            }
            C.b();
            workDatabase.w();
            workDatabase.q();
            if (isEmpty && !z2) {
                z = false;
            }
            Long b3 = dwx0Var.g.a.z().b("reschedule_needed");
            if (b3 != null && b3.longValue() == 1) {
                m100.c().getClass();
                dwx0Var.k();
                syc0 syc0Var2 = dwx0Var.g;
                syc0Var2.getClass();
                syc0Var2.a.z().a(new txc0("reschedule_needed", 0L));
                return;
            }
            try {
                i = Build.VERSION.SDK_INT;
                int i2 = i >= 31 ? 570425344 : SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
            } catch (IllegalArgumentException | SecurityException unused) {
                m100.c().getClass();
            }
            if (i >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long b4 = syc0Var.a.z().b("last_force_stop_ms");
                    long longValue = b4 != null ? b4.longValue() : 0L;
                    for (int i3 = 0; i3 < historicalProcessExitReasons.size(); i3++) {
                        ApplicationExitInfo a2 = i7s.a(historicalProcessExitReasons.get(i3));
                        reason = a2.getReason();
                        if (reason == 10) {
                            timestamp = a2.getTimestamp();
                            if (timestamp >= longValue) {
                                m100.c().getClass();
                                dwx0Var.k();
                                dwx0Var.b.d.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                syc0Var.getClass();
                                syc0Var.a.z().a(new txc0("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                                return;
                            }
                        }
                    }
                }
            } else if (broadcast == null) {
                b(context);
                m100.c().getClass();
                dwx0Var.k();
                dwx0Var.b.d.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                syc0Var.getClass();
                syc0Var.a.z().a(new txc0("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                return;
            }
            if (z) {
                m100.c().getClass();
                i8h0.b(dwx0Var.b, dwx0Var.c, dwx0Var.e);
            }
        } finally {
            workDatabase.q();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean equals;
        String str = f;
        dwx0 dwx0Var = this.c;
        try {
            dwx0Var.b.getClass();
            boolean isEmpty = TextUtils.isEmpty(null);
            Context context = this.b;
            if (isEmpty) {
                m100.c().getClass();
                equals = true;
            } else {
                int i = bhd0.a;
                equals = Application.getProcessName().equals(context.getApplicationInfo().processName);
                m100.c().getClass();
            }
            if (!equals) {
                return;
            }
            while (true) {
                try {
                    zux0.a(context);
                    m100.c().getClass();
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i2 = this.e + 1;
                        this.e = i2;
                        if (i2 >= 3) {
                            String str2 = wkq0.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            m100.c().b(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            dwx0Var.b.getClass();
                            throw illegalStateException;
                        }
                        m100.c().getClass();
                        try {
                            Thread.sleep(this.e * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    m100.c().a(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    dwx0Var.b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            dwx0Var.j();
        }
    }
}
