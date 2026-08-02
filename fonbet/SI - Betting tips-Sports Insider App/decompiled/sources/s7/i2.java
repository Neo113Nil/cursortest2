package s7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i2 extends z {

    /* renamed from: c, reason: collision with root package name */
    public JobScheduler f22810c;

    @Override // s7.z
    public final boolean m() {
        return true;
    }

    public final void n(long j) {
        f1 f1Var = (f1) this.f3328a;
        k();
        j();
        JobScheduler jobScheduler = this.f22810c;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(f1Var.f22740a.getPackageName())).hashCode()) != null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22910n.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int o3 = o();
        if (o3 != 2) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22910n.b(androidx.appcompat.widget.c1.A(o3), "[sgtm] Not eligible for Scion upload");
            return;
        }
        n0 n0Var3 = f1Var.f22745f;
        f1.m(n0Var3);
        n0Var3.f22910n.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(f1Var.f22740a.getPackageName())).hashCode(), new ComponentName(f1Var.f22740a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f22810c;
        g6.v.h(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        n0 n0Var4 = f1Var.f22745f;
        f1.m(n0Var4);
        n0Var4.f22910n.b(schedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int o() {
        f1 f1Var = (f1) this.f3328a;
        k();
        j();
        if (this.f22810c == null) {
            return 7;
        }
        Boolean v5 = f1Var.f22743d.v("google_analytics_sgtm_upload_enabled");
        if (!(v5 == null ? false : v5.booleanValue())) {
            return 8;
        }
        if (f1Var.r().j < 119000) {
            return 6;
        }
        if (!v3.D(f1Var.f22740a, "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return 3;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return !f1Var.p().q() ? 5 : 2;
        }
        return 4;
    }
}
