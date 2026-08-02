package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.JobIntentService;

/* compiled from: SafeJobServiceEngineImpl.java */
/* loaded from: classes11.dex */
public final class c extends JobServiceEngine implements JobIntentService.b {
    public final SafeJobIntentService a;
    public final Object b;
    public JobParameters c;

    /* compiled from: SafeJobServiceEngineImpl.java */
    public final class a implements JobIntentService.d {
        public final JobWorkItem a;

        public a(JobWorkItem jobWorkItem) {
            this.a = jobWorkItem;
        }

        @Override // androidx.core.app.JobIntentService.d
        public final Intent getIntent() {
            return this.a.getIntent();
        }

        @Override // androidx.core.app.JobIntentService.d
        public final void i() {
            synchronized (c.this.b) {
                JobParameters jobParameters = c.this.c;
                if (jobParameters != null) {
                    try {
                        jobParameters.completeWork(this.a);
                    } catch (IllegalArgumentException | SecurityException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public c(SafeJobIntentService safeJobIntentService) {
        super(safeJobIntentService);
        this.b = new Object();
        this.a = safeJobIntentService;
    }

    @Override // androidx.core.app.JobIntentService.b
    public final IBinder compatGetBinder() {
        return getBinder();
    }

    @Override // androidx.core.app.JobIntentService.b
    public final JobIntentService.d dequeueWork() {
        JobWorkItem jobWorkItem;
        synchronized (this.b) {
            JobParameters jobParameters = this.c;
            if (jobParameters == null) {
                return null;
            }
            try {
                jobWorkItem = jobParameters.dequeueWork();
            } catch (SecurityException e) {
                e.printStackTrace();
                jobWorkItem = null;
            }
            if (jobWorkItem == null) {
                return null;
            }
            jobWorkItem.getIntent().setExtrasClassLoader(this.a.getClassLoader());
            return new a(jobWorkItem);
        }
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.ensureProcessorRunningLocked(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean doStopCurrentWork = this.a.doStopCurrentWork();
        synchronized (this.b) {
            this.c = null;
        }
        return doStopCurrentWork;
    }
}
