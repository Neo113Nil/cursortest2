package androidx.media3.exoplayer.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import xsna.ahn;
import xsna.c8h0;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class PlatformScheduler implements c8h0 {
    public static final int d = 16 | 15;
    public final int a;
    public final ComponentName b;
    public final JobScheduler c;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int a = new Requirements(extras.getInt("requirements")).a(this);
            if (a != 0) {
                ahn.F("Requirements not met: " + a);
                jobFinished(jobParameters, true);
                return false;
            }
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            Intent intent = new Intent(string).setPackage(string2);
            String str = y2r0.a;
            startForegroundService(intent);
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    public PlatformScheduler(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = 42;
        this.b = new ComponentName(applicationContext, (Class<?>) PlatformSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        jobScheduler.getClass();
        this.c = jobScheduler;
    }

    @Override // xsna.c8h0
    public final boolean a(Requirements requirements, String str) {
        int i = requirements.b;
        int i2 = requirements.b;
        int i3 = d & i;
        Requirements requirements2 = i3 == i ? requirements : new Requirements(i3);
        if (!requirements2.equals(requirements)) {
            ahn.F("Ignoring unsupported requirements: " + (requirements2.b ^ i2));
        }
        JobInfo.Builder builder = new JobInfo.Builder(this.a, this.b);
        if ((i2 & 2) != 0) {
            builder.setRequiredNetworkType(2);
        } else if ((i2 & 1) != 0) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle((i2 & 4) != 0);
        builder.setRequiresCharging((i2 & 8) != 0);
        if ((i2 & 16) != 0) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", "androidx.media3.exoplayer.downloadService.action.RESTART");
        persistableBundle.putString("service_package", str);
        persistableBundle.putInt("requirements", i2);
        builder.setExtras(persistableBundle);
        return this.c.schedule(builder.build()) == 1;
    }

    @Override // xsna.c8h0
    public final Requirements b(Requirements requirements) {
        int i = requirements.b;
        int i2 = d & i;
        return i2 == i ? requirements : new Requirements(i2);
    }

    @Override // xsna.c8h0
    public final void cancel() {
        this.c.cancel(this.a);
    }
}
