package androidx.work.impl.utils;

import Q2.AbstractC1508t;
import Q2.K;
import R2.AbstractC1548y;
import R2.J;
import R2.Y;
import X2.k;
import Y2.AbstractC1817h;
import Y2.B;
import Y2.C;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
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
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.m;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import u0.p;
import x0.InterfaceC6772a;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f24018e = AbstractC1508t.i("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f24019f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f24020a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f24021b;

    /* renamed from: c, reason: collision with root package name */
    public final B f24022c;

    /* renamed from: d, reason: collision with root package name */
    public int f24023d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f24024a = AbstractC1508t.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC1508t.e().j(f24024a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, Y y10) {
        this.f24020a = context.getApplicationContext();
        this.f24021b = y10;
        this.f24022c = y10.o();
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f24019f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean i10 = m.i(this.f24020a, this.f24021b.s());
        WorkDatabase s10 = this.f24021b.s();
        c l10 = s10.l();
        k k10 = s10.k();
        s10.beginTransaction();
        try {
            List<WorkSpec> u10 = l10.u();
            boolean z10 = (u10 == null || u10.isEmpty()) ? false : true;
            if (z10) {
                for (WorkSpec workSpec : u10) {
                    l10.n(K.c.ENQUEUED, workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
                    l10.d(workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String, -512);
                    l10.o(workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String, -1L);
                }
            }
            k10.b();
            s10.setTransactionSuccessful();
            s10.endTransaction();
            return z10 || i10;
        } catch (Throwable th2) {
            s10.endTransaction();
            throw th2;
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            AbstractC1508t.e().a(f24018e, "Rescheduling Workers.");
            this.f24021b.v();
            this.f24021b.o().e(false);
        } else if (e()) {
            AbstractC1508t.e().a(f24018e, "Application was force-stopped, rescheduling.");
            this.f24021b.v();
            this.f24022c.d(this.f24021b.f().a().a());
        } else if (a10) {
            AbstractC1508t.e().a(f24018e, "Found unfinished work, scheduling it.");
            AbstractC1548y.f(this.f24021b.f(), this.f24021b.s(), this.f24021b.q());
        }
    }

    public boolean e() {
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent d10 = d(this.f24020a, i10 >= 31 ? 570425344 : PKIFailureInfo.duplicateCertReq);
            if (i10 >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f24020a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long a10 = this.f24022c.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo a11 = AbstractC1817h.a(historicalProcessExitReasons.get(i11));
                        reason = a11.getReason();
                        if (reason == 10) {
                            timestamp = a11.getTimestamp();
                            if (timestamp >= a10) {
                                return true;
                            }
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f24020a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            AbstractC1508t.e().l(f24018e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            AbstractC1508t.e().l(f24018e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a f10 = this.f24021b.f();
        if (TextUtils.isEmpty(f10.c())) {
            AbstractC1508t.e().a(f24018e, "The default process name was not specified.");
            return true;
        }
        boolean b10 = C.b(this.f24020a, f10);
        AbstractC1508t.e().a(f24018e, "Is default app process = " + b10);
        return b10;
    }

    public boolean h() {
        return this.f24021b.o().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    try {
                        J.d(this.f24020a);
                        AbstractC1508t.e().a(f24018e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                            i10 = this.f24023d + 1;
                            this.f24023d = i10;
                            if (i10 >= 3) {
                                String str = p.a(this.f24020a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                AbstractC1508t e11 = AbstractC1508t.e();
                                String str2 = f24018e;
                                e11.d(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                InterfaceC6772a e12 = this.f24021b.f().e();
                                if (e12 == null) {
                                    throw illegalStateException;
                                }
                                AbstractC1508t.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                e12.accept(illegalStateException);
                            } else {
                                AbstractC1508t.e().b(f24018e, "Retrying after " + (i10 * 300), e10);
                                i(((long) this.f24023d) * 300);
                            }
                        }
                        AbstractC1508t.e().b(f24018e, "Retrying after " + (i10 * 300), e10);
                        i(((long) this.f24023d) * 300);
                    } catch (SQLiteException e13) {
                        AbstractC1508t.e().c(f24018e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e13);
                        InterfaceC6772a e14 = this.f24021b.f().e();
                        if (e14 == null) {
                            throw illegalStateException2;
                        }
                        e14.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            this.f24021b.u();
        }
    }
}
