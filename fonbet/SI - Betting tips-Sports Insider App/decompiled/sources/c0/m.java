package c0;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final JobWorkItem f3282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f3283b;

    public m(n nVar, JobWorkItem jobWorkItem) {
        this.f3283b = nVar;
        this.f3282a = jobWorkItem;
    }

    @Override // c0.l
    public final void a() {
        synchronized (this.f3283b.f3287b) {
            try {
                JobParameters jobParameters = this.f3283b.f3288c;
                if (jobParameters != null) {
                    jobParameters.completeWork(this.f3282a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c0.l
    public final Intent getIntent() {
        return this.f3282a.getIntent();
    }
}
