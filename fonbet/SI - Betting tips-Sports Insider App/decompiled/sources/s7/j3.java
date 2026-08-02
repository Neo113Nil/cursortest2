package s7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j3 extends l3 {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmManager f22834d;

    /* renamed from: e, reason: collision with root package name */
    public e3 f22835e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f22836f;

    public j3(r3 r3Var) {
        super(r3Var);
        this.f22834d = (AlarmManager) ((f1) this.f3328a).f22740a.getSystemService("alarm");
    }

    @Override // s7.l3
    public final void m() {
        AlarmManager alarmManager = this.f22834d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            p();
        }
    }

    public final void n() {
        k();
        n0 n0Var = ((f1) this.f3328a).f22745f;
        f1.m(n0Var);
        n0Var.f22910n.a("Unscheduling upload");
        AlarmManager alarmManager = this.f22834d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().c();
        if (Build.VERSION.SDK_INT >= 24) {
            p();
        }
    }

    public final k o() {
        if (this.f22835e == null) {
            this.f22835e = new e3(this, this.f22859b.f22997l, 1);
        }
        return this.f22835e;
    }

    public final void p() {
        JobScheduler jobScheduler = (JobScheduler) ((f1) this.f3328a).f22740a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    public final int q() {
        if (this.f22836f == null) {
            this.f22836f = Integer.valueOf("measurement".concat(String.valueOf(((f1) this.f3328a).f22740a.getPackageName())).hashCode());
        }
        return this.f22836f.intValue();
    }

    public final PendingIntent r() {
        Context context = ((f1) this.f3328a).f22740a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.f0.f5038a);
    }
}
