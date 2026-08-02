package androidx.core.app;

import androidx.core.app.JobIntentService;

/* loaded from: classes11.dex */
public abstract class SafeJobIntentService extends JobIntentService {
    @Override // androidx.core.app.JobIntentService
    public JobIntentService.d dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new c(this);
    }
}
