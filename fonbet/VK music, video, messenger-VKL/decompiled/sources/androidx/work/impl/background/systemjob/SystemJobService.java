package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import xsna.dwx0;
import xsna.e3q;
import xsna.m100;
import xsna.ohd0;
import xsna.svx0;
import xsna.tqk0;
import xsna.uqk0;
import xsna.zr;
import xsna.zvx0;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements e3q {
    public static final String f = m100.d("SystemJobService");
    public dwx0 b;
    public final HashMap c = new HashMap();
    public final uqk0 d = new uqk0();
    public zvx0 e;

    /* loaded from: classes12.dex */
    public static class a {
        public static int a(JobParameters jobParameters) {
            int stopReason = jobParameters.getStopReason();
            String str = SystemJobService.f;
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(zr.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    @Nullable
    public static svx0 c(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new svx0(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // xsna.e3q
    public final void b(@NonNull svx0 svx0Var, boolean z) {
        a("onExecuted");
        m100 c = m100.c();
        String str = svx0Var.a;
        c.getClass();
        JobParameters jobParameters = (JobParameters) this.c.remove(svx0Var);
        this.d.b(svx0Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            dwx0 h = dwx0.h(getApplicationContext());
            this.b = h;
            ohd0 ohd0Var = h.f;
            this.e = new zvx0(ohd0Var, h.d);
            ohd0Var.a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            m100.c().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        dwx0 dwx0Var = this.b;
        if (dwx0Var != null) {
            dwx0Var.f.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        a("onStartJob");
        if (this.b == null) {
            m100.c().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        svx0 c = c(jobParameters);
        if (c == null) {
            m100.c().a(f, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.c;
        if (hashMap.containsKey(c)) {
            m100 c2 = m100.c();
            c.toString();
            c2.getClass();
            return false;
        }
        m100 c3 = m100.c();
        c.toString();
        c3.getClass();
        hashMap.put(c, jobParameters);
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (jobParameters.getTriggeredContentUris() != null) {
            aVar.b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        aVar.c = jobParameters.getNetwork();
        this.e.c(this.d.c(c), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        boolean contains;
        a("onStopJob");
        if (this.b == null) {
            m100.c().getClass();
            return true;
        }
        svx0 c = c(jobParameters);
        if (c == null) {
            m100.c().a(f, "WorkSpec id not found!");
            return false;
        }
        m100 c2 = m100.c();
        c.toString();
        c2.getClass();
        this.c.remove(c);
        tqk0 b = this.d.b(c);
        if (b != null) {
            this.e.b(b, Build.VERSION.SDK_INT >= 31 ? a.a(jobParameters) : -512);
        }
        ohd0 ohd0Var = this.b.f;
        String str = c.a;
        synchronized (ohd0Var.k) {
            contains = ohd0Var.i.contains(str);
        }
        return !contains;
    }
}
