package n3;

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
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import com.google.android.gms.internal.measurement.y3;
import e3.i0;
import e3.x;
import f3.v;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k2.d0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f20826e = x.g("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f20827f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f20828a;

    /* renamed from: b, reason: collision with root package name */
    public final v f20829b;

    /* renamed from: c, reason: collision with root package name */
    public final f f20830c;

    /* renamed from: d, reason: collision with root package name */
    public int f20831d = 0;

    public d(Context context, v vVar) {
        this.f20828a = context.getApplicationContext();
        this.f20829b = vVar;
        this.f20830c = vVar.f9432g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i5 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i5);
        long currentTimeMillis = System.currentTimeMillis() + f20827f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z5;
        int i5;
        PendingIntent broadcast;
        f fVar = this.f20830c;
        v vVar = this.f20829b;
        WorkDatabase workDatabase = vVar.f9428c;
        e3.c cVar = vVar.f9427b;
        f fVar2 = vVar.f9432g;
        workDatabase = vVar.f9428c;
        String str = h3.c.f10349f;
        Context context = this.f20828a;
        JobScheduler b10 = h3.a.b(context);
        ArrayList f6 = h3.c.f(context, b10);
        List list = (List) f3.x.n0(workDatabase.v().f20319a, true, false, new d0(3));
        HashSet hashSet = new HashSet(f6 != null ? f6.size() : 0);
        if (f6 != null && !f6.isEmpty()) {
            Iterator it = f6.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                m3.j g10 = h3.c.g(jobInfo);
                if (g10 != null) {
                    hashSet.add(g10.f20321a);
                } else {
                    h3.c.a(b10, jobInfo.getId());
                }
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains((String) it2.next())) {
                    x.e().a(h3.c.f10349f, "Reconciling jobs");
                    z5 = true;
                    break;
                }
            } else {
                z5 = false;
                break;
            }
        }
        if (z5) {
            workDatabase.b();
            try {
                m3.s y5 = workDatabase.y();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    y5.e(-1L, (String) it3.next());
                }
                workDatabase.r();
                workDatabase.f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m3.s y10 = workDatabase.y();
        m3.m x10 = workDatabase.x();
        workDatabase.b();
        try {
            List<m3.o> list2 = (List) f3.x.n0(y10.f20360a, true, false, new d0(6));
            boolean z7 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z7) {
                for (m3.o oVar : list2) {
                    i0 i0Var = i0.f8524a;
                    String str2 = oVar.f20331a;
                    y10.h(i0Var, str2);
                    y10.i(-512, str2);
                    y10.e(-1L, str2);
                }
            }
            f3.x.n0(x10.f20327a, false, true, new d0(4));
            workDatabase.r();
            workDatabase.f();
            boolean z10 = z7 || z5;
            Long a7 = fVar2.f20834a.u().a("reschedule_needed");
            String str3 = f20826e;
            if (a7 != null && a7.longValue() == 1) {
                x.e().a(str3, "Rescheduling Workers.");
                vVar.h();
                fVar2.getClass();
                Intrinsics.checkNotNullParameter("reschedule_needed", "key");
                fVar2.f20834a.u().b(new m3.d("reschedule_needed", 0L));
                return;
            }
            try {
                i5 = Build.VERSION.SDK_INT;
                int i10 = i5 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
            } catch (IllegalArgumentException e7) {
                e = e7;
                if (x.e().f8571a <= 5) {
                    w0.n(str3, "Ignoring exception", e);
                }
                x.e().a(str3, "Application was force-stopped, rescheduling.");
                vVar.h();
                cVar.f8478d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                fVar.getClass();
                fVar.f20834a.u().b(new m3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                return;
            } catch (SecurityException e9) {
                e = e9;
                if (x.e().f8571a <= 5) {
                }
                x.e().a(str3, "Application was force-stopped, rescheduling.");
                vVar.h();
                cVar.f8478d.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                fVar.getClass();
                fVar.f20834a.u().b(new m3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                return;
            }
            if (i5 >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long a10 = fVar.f20834a.u().a("last_force_stop_ms");
                    long longValue = a10 != null ? a10.longValue() : 0L;
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo d10 = io.sentry.clientreport.a.d(historicalProcessExitReasons.get(i11));
                        if (d10.getReason() == 10 && d10.getTimestamp() >= longValue) {
                            x.e().a(str3, "Application was force-stopped, rescheduling.");
                            vVar.h();
                            cVar.f8478d.getClass();
                            long currentTimeMillis22 = System.currentTimeMillis();
                            fVar.getClass();
                            fVar.f20834a.u().b(new m3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                            return;
                        }
                    }
                }
                if (z10) {
                    return;
                }
                x.e().a(str3, "Found unfinished work, scheduling it.");
                f3.j.b(cVar, workDatabase, vVar.f9430e);
                return;
            }
            if (broadcast == null) {
                c(context);
                x.e().a(str3, "Application was force-stopped, rescheduling.");
                vVar.h();
                cVar.f8478d.getClass();
                long currentTimeMillis222 = System.currentTimeMillis();
                fVar.getClass();
                fVar.f20834a.u().b(new m3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                return;
            }
            if (z10) {
            }
        } finally {
            workDatabase.f();
        }
    }

    public final boolean b() {
        e3.c cVar = this.f20829b.f9427b;
        boolean isEmpty = TextUtils.isEmpty(cVar.j);
        String str = f20826e;
        if (isEmpty) {
            x.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a7 = l.a(this.f20828a, cVar);
        x.e().a(str, "Is default app process = " + a7);
        return a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f20828a;
        String str = f20826e;
        v vVar = this.f20829b;
        try {
            if (b()) {
                while (true) {
                    try {
                        io.sentry.config.a.t(context);
                        x.e().a(str, "Performing cleanup operations.");
                        try {
                            a();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e7) {
                            int i5 = this.f20831d + 1;
                            this.f20831d = i5;
                            if (i5 >= 3) {
                                String str2 = y3.u(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                x.e().d(str, str2, e7);
                                IllegalStateException illegalStateException = new IllegalStateException(str2, e7);
                                da.q qVar = vVar.f9427b.f8482h;
                                if (qVar == null) {
                                    throw illegalStateException;
                                }
                                x.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                                qVar.accept(illegalStateException);
                            } else {
                                x.e().b(str, "Retrying after " + (i5 * 300), e7);
                                try {
                                    Thread.sleep(this.f20831d * 300);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    } catch (SQLiteException e9) {
                        x.e().c(str, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e9);
                        da.q qVar2 = vVar.f9427b.f8482h;
                        if (qVar2 == null) {
                            throw illegalStateException2;
                        }
                        qVar2.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            vVar.g();
        }
    }
}
