package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.appcompat.widget.c1;
import androidx.core.view.k;
import androidx.fragment.app.d;
import com.google.android.gms.internal.measurement.h4;
import e3.i;
import e3.l;
import e3.x;
import f3.c;
import f3.f;
import f3.v;
import java.util.Arrays;
import java.util.HashMap;
import k2.a0;
import kotlin.jvm.internal.Intrinsics;
import l1.a;
import m3.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f2931e = x.g("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public v f2932a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2933b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final i f2934c = new i(1);

    /* renamed from: d, reason: collision with root package name */
    public a f2935d;

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(c1.n("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static j c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // f3.c
    public final void a(j jVar, boolean z5) {
        b("onExecuted");
        x.e().a(f2931e, jVar.f20321a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f2933b.remove(jVar);
        this.f2934c.g(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z5);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            v e7 = v.e(getApplicationContext());
            this.f2932a = e7;
            f fVar = e7.f9431f;
            this.f2935d = new a(fVar, e7.f9429d);
            fVar.a(this);
        } catch (IllegalStateException e9) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e9);
            }
            x.e().h(f2931e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        v vVar = this.f2932a;
        if (vVar != null) {
            vVar.f9431f.g(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        l lVar;
        b("onStartJob");
        v vVar = this.f2932a;
        String str = f2931e;
        if (vVar == null) {
            x.e().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j c2 = c(jobParameters);
        if (c2 == null) {
            x.e().c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.f2933b;
        if (hashMap.containsKey(c2)) {
            x.e().a(str, "Job is already being executed by SystemJobService: " + c2);
            return false;
        }
        x.e().a(str, "onStartJob for " + c2);
        hashMap.put(c2, jobParameters);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            lVar = new l();
            if (h4.i(jobParameters) != null) {
                Arrays.asList(h4.i(jobParameters));
            }
            if (h4.h(jobParameters) != null) {
                Arrays.asList(h4.h(jobParameters));
            }
            if (i5 >= 28) {
                k.f(jobParameters);
            }
        } else {
            lVar = null;
        }
        a aVar = this.f2935d;
        f3.k workSpecId = this.f2934c.j(c2);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        ((a0) ((com.google.firebase.messaging.x) aVar.f19315c).f6182a).execute(new d(aVar, workSpecId, lVar, 12));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        b("onStopJob");
        if (this.f2932a == null) {
            x.e().a(f2931e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j c2 = c(jobParameters);
        if (c2 == null) {
            x.e().c(f2931e, "WorkSpec id not found!");
            return false;
        }
        x.e().a(f2931e, "onStopJob for " + c2);
        this.f2933b.remove(c2);
        f3.k workSpecId = this.f2934c.g(c2);
        if (workSpecId != null) {
            int a7 = Build.VERSION.SDK_INT >= 31 ? h3.d.a(jobParameters) : -512;
            a aVar = this.f2935d;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
            aVar.D(workSpecId, a7);
        }
        f fVar = this.f2932a.f9431f;
        String str = c2.f20321a;
        synchronized (fVar.f9362k) {
            contains = fVar.f9361i.contains(str);
        }
        return !contains;
    }
}
