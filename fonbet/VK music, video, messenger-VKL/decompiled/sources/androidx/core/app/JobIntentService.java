package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.ji;

@Deprecated
/* loaded from: classes11.dex */
public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    g mCompatWorkEnqueuer;
    a mCurProcessor;
    b mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, g> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;
    final ArrayList<c> mCompatQueue = null;

    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                d dequeueWork = jobIntentService.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                jobIntentService.onHandleWork(dequeueWork.getIntent());
                dequeueWork.i();
            }
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r1) {
            JobIntentService.this.processorFinished();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            JobIntentService.this.processorFinished();
        }
    }

    public interface b {
        IBinder compatGetBinder();

        d dequeueWork();
    }

    public final class c implements d {
        public final Intent a;
        public final int b;

        public c(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        @Override // androidx.core.app.JobIntentService.d
        public final Intent getIntent() {
            return this.a;
        }

        @Override // androidx.core.app.JobIntentService.d
        public final void i() {
            JobIntentService.this.stopSelf(this.b);
        }
    }

    public interface d {
        Intent getIntent();

        void i();
    }

    public static final class e extends JobServiceEngine implements b {
        public final JobIntentService a;
        public final Object b;
        public JobParameters c;

        public final class a implements d {
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
                synchronized (e.this.b) {
                    try {
                        JobParameters jobParameters = e.this.c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.b = new Object();
            this.a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.b
        public final IBinder compatGetBinder() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.b
        public final d dequeueWork() {
            synchronized (this.b) {
                try {
                    JobParameters jobParameters = this.c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    dequeueWork.getIntent().setExtrasClassLoader(this.a.getClassLoader());
                    return new a(dequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
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

    public static final class f extends g {
        public final JobInfo c;
        public final JobScheduler d;

        public f(Context context, ComponentName componentName, int i) {
            b(i);
            this.c = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
            this.d = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.g
        public final void a(Intent intent) {
            this.d.enqueue(this.c, new JobWorkItem(intent));
        }
    }

    public static abstract class g {
        public boolean a;
        public int b;

        public abstract void a(Intent intent);

        public final void b(int i) {
            if (!this.a) {
                this.a = true;
                this.b = i;
            } else {
                if (this.b == i) {
                    return;
                }
                StringBuilder b = ji.b(i, "Given job ID ", " is different than previous ");
                b.append(this.b);
                throw new IllegalArgumentException(b.toString());
            }
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static g getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, g> hashMap = sClassWorkEnqueuer;
        g gVar = hashMap.get(componentName);
        if (gVar != null) {
            return gVar;
        }
        if (!z) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        f fVar = new f(context, componentName, i);
        hashMap.put(componentName, fVar);
        return fVar;
    }

    public d dequeueWork() {
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.dequeueWork();
        }
        synchronized (this.mCompatQueue) {
            try {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                return this.mCompatQueue.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean doStopCurrentWork() {
        a aVar = this.mCurProcessor;
        if (aVar != null) {
            aVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            a aVar = new a();
            this.mCurProcessor = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new e(this);
        this.mCompatWorkEnqueuer = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<c> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.getClass();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getClass();
        synchronized (this.mCompatQueue) {
            ArrayList<c> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<c> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<c> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            g workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.b(i);
            workEnqueuer.a(intent);
        }
    }
}
