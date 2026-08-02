package androidx.work.impl.background.systemjob;

import Q2.AbstractC1508t;
import R2.A;
import R2.C1543t;
import R2.C1549z;
import R2.InterfaceC1530f;
import R2.U;
import R2.W;
import R2.Y;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1530f {

    /* renamed from: e, reason: collision with root package name */
    public static final String f23840e = AbstractC1508t.i("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public Y f23841a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f23842b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final A f23843c = A.c(false);

    /* renamed from: d, reason: collision with root package name */
    public U f23844d;

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static class c {
        public static int a(JobParameters jobParameters) {
            return SystemJobService.b(jobParameters.getStopReason());
        }
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public static int b(int i10) {
        switch (i10) {
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
                return i10;
            default:
                return -512;
        }
    }

    public static X2.h d(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new X2.h(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // R2.InterfaceC1530f
    public void c(X2.h hVar, boolean z10) {
        a("onExecuted");
        AbstractC1508t.e().a(f23840e, hVar.b() + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f23842b.remove(hVar);
        this.f23843c.b(hVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            Y n10 = Y.n(getApplicationContext());
            this.f23841a = n10;
            C1543t p10 = n10.p();
            this.f23844d = new W(p10, this.f23841a.t());
            p10.e(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            AbstractC1508t.e().k(f23840e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Y y10 = this.f23841a;
        if (y10 != null) {
            y10.p().m(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f23841a == null) {
            AbstractC1508t.e().a(f23840e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        X2.h d10 = d(jobParameters);
        if (d10 == null) {
            AbstractC1508t.e().c(f23840e, "WorkSpec id not found!");
            return false;
        }
        if (this.f23842b.containsKey(d10)) {
            AbstractC1508t.e().a(f23840e, "Job is already being executed by SystemJobService: " + d10);
            return false;
        }
        AbstractC1508t.e().a(f23840e, "onStartJob for " + d10);
        this.f23842b.put(d10, jobParameters);
        int i10 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.f23727b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.f23726a = Arrays.asList(a.a(jobParameters));
        }
        if (i10 >= 28) {
            aVar.f23728c = b.a(jobParameters);
        }
        this.f23844d.d(this.f23843c.e(d10), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f23841a == null) {
            AbstractC1508t.e().a(f23840e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        X2.h d10 = d(jobParameters);
        if (d10 == null) {
            AbstractC1508t.e().c(f23840e, "WorkSpec id not found!");
            return false;
        }
        AbstractC1508t.e().a(f23840e, "onStopJob for " + d10);
        this.f23842b.remove(d10);
        C1549z b10 = this.f23843c.b(d10);
        if (b10 != null) {
            this.f23844d.a(b10, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f23841a.p().j(d10.b());
    }
}
