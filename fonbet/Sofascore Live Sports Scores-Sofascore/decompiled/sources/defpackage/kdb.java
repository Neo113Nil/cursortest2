package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class kdb {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public kdb(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            a70.p("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            a70.p("WorkerParameters is null");
            throw null;
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public abstract ddb getForegroundInfoAsync();

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final md4 getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public zti getTaskExecutor() {
        return this.mWorkerParams.h;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    public ucl getWorkerFactory() {
        return this.mWorkerParams.i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final ddb setForegroundAsync(gm8 gm8Var) {
        pbl pblVar = this.mWorkerParams.k;
        Context applicationContext = getApplicationContext();
        return x2a.z(pblVar.a.a, "setForegroundAsync", new m61(pblVar, getId(), gm8Var, applicationContext, 28));
    }

    public ddb setProgressAsync(md4 md4Var) {
        fcl fclVar = this.mWorkerParams.j;
        getApplicationContext();
        return x2a.z(fclVar.b.a, "updateProgress", new mth(9, fclVar, getId(), md4Var));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ddb startWork();

    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }

    public void onStopped() {
    }
}
