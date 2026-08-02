package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.a70;
import defpackage.by9;
import defpackage.c0l;
import defpackage.c90;
import defpackage.cci;
import defpackage.g8f;
import defpackage.l2a;
import defpackage.lnb;
import defpackage.qbl;
import defpackage.qe6;
import defpackage.qz;
import defpackage.rik;
import defpackage.sw9;
import defpackage.xbl;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements qe6 {
    public static final /* synthetic */ int e = 0;
    public xbl a;
    public final HashMap b = new HashMap();
    public final by9 c = new by9(21);
    public c0l d;

    static {
        rik.x("SystemJobService");
    }

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        a70.r(lnb.o("Cannot invoke ", str, " on a background thread"));
    }

    public static qbl c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new qbl(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.qe6
    public final void a(qbl qblVar, boolean z) {
        b("onExecuted");
        rik o = rik.o();
        String str = qblVar.a;
        o.getClass();
        JobParameters jobParameters = (JobParameters) this.b.remove(qblVar);
        this.c.w(qblVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            xbl d = xbl.d(getApplicationContext());
            this.a = d;
            g8f g8fVar = d.f;
            this.d = new c0l(g8fVar, d.d);
            g8fVar.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                rik.o().getClass();
            } else {
                sw9.m("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        xbl xblVar = this.a;
        if (xblVar != null) {
            g8f g8fVar = xblVar.f;
            synchronized (g8fVar.k) {
                g8fVar.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        b("onStartJob");
        if (this.a == null) {
            rik.o().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        qbl c = c(jobParameters);
        if (c == null) {
            rik.o().getClass();
            return false;
        }
        HashMap hashMap = this.b;
        if (hashMap.containsKey(c)) {
            rik o = rik.o();
            c.toString();
            o.getClass();
            return false;
        }
        rik o2 = rik.o();
        c.toString();
        o2.getClass();
        hashMap.put(c, jobParameters);
        l2a l2aVar = new l2a(23);
        if (jobParameters.getTriggeredContentUris() != null) {
            l2aVar.c = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            l2aVar.b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            l2aVar.d = c90.s(jobParameters);
        }
        this.d.k(this.c.F(c), l2aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        b("onStopJob");
        if (this.a == null) {
            rik.o().getClass();
            return true;
        }
        qbl c = c(jobParameters);
        if (c == null) {
            rik.o().getClass();
            return false;
        }
        rik o = rik.o();
        c.toString();
        o.getClass();
        this.b.remove(c);
        cci w = this.c.w(c);
        if (w != null) {
            int o2 = Build.VERSION.SDK_INT >= 31 ? qz.o(jobParameters) : -512;
            c0l c0lVar = this.d;
            c0lVar.getClass();
            c0lVar.m(w, o2);
        }
        g8f g8fVar = this.a.f;
        String str = c.a;
        synchronized (g8fVar.k) {
            contains = g8fVar.i.contains(str);
        }
        return !contains;
    }
}
