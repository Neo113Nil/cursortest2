package c0;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends JobServiceEngine {

    /* renamed from: a, reason: collision with root package name */
    public final o f3286a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3287b;

    /* renamed from: c, reason: collision with root package name */
    public JobParameters f3288c;

    public n(o oVar) {
        super(oVar);
        this.f3287b = new Object();
        this.f3286a = oVar;
    }

    public final IBinder a() {
        return getBinder();
    }

    public final m b() {
        synchronized (this.f3287b) {
            try {
                JobParameters jobParameters = this.f3288c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                dequeueWork.getIntent().setExtrasClassLoader(this.f3286a.getClassLoader());
                return new m(this, dequeueWork);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.f3288c = jobParameters;
        this.f3286a.a(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        i iVar = this.f3286a.f3292c;
        if (iVar != null) {
            iVar.cancel(false);
        }
        synchronized (this.f3287b) {
            this.f3288c = null;
        }
        return true;
    }
}
