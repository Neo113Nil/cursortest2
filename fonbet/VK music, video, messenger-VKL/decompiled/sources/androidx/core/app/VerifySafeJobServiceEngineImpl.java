package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.core.app.JobIntentService;

/* loaded from: classes11.dex */
public class VerifySafeJobServiceEngineImpl extends JobServiceEngine implements JobIntentService.b {
    private static final boolean DEBUG = false;
    private static final String TAG = "VerifySafeJobServiceEngineImpl";
    private final Object mLock;
    private JobParameters mParams;
    private final JobIntentService mService;

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
            synchronized (VerifySafeJobServiceEngineImpl.this.mLock) {
                JobParameters jobParameters = VerifySafeJobServiceEngineImpl.this.mParams;
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

    public VerifySafeJobServiceEngineImpl(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.mLock = new Object();
        this.mService = jobIntentService;
    }

    @Override // androidx.core.app.JobIntentService.b
    @Nullable
    public IBinder compatGetBinder() {
        return getBinder();
    }

    @Override // androidx.core.app.JobIntentService.b
    @Nullable
    public JobIntentService.d dequeueWork() {
        JobWorkItem jobWorkItem;
        synchronized (this.mLock) {
            JobParameters jobParameters = this.mParams;
            if (jobParameters == null) {
                return null;
            }
            try {
                jobWorkItem = jobParameters.dequeueWork();
            } catch (IllegalArgumentException | SecurityException e) {
                e.printStackTrace();
                jobWorkItem = null;
            }
            if (jobWorkItem == null) {
                return null;
            }
            jobWorkItem.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
            return new a(jobWorkItem);
        }
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStartJob(JobParameters jobParameters) {
        this.mParams = jobParameters;
        this.mService.ensureProcessorRunningLocked(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStopJob(JobParameters jobParameters) {
        boolean doStopCurrentWork = this.mService.doStopCurrentWork();
        synchronized (this.mLock) {
            this.mParams = null;
        }
        return doStopCurrentWork;
    }
}
