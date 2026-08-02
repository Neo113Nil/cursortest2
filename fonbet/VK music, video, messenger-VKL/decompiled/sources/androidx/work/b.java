package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.ao;
import xsna.h24;
import xsna.iyx0;
import xsna.n7s;
import xsna.r5o0;
import xsna.twx0;
import xsna.ub9;
import xsna.ugz;
import xsna.xgz;

/* compiled from: ListenableWorker.java */
/* loaded from: classes.dex */
public abstract class b {

    @NonNull
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    /* compiled from: ListenableWorker.java */
    public static abstract class a {

        /* compiled from: ListenableWorker.java */
        /* renamed from: androidx.work.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes12.dex */
        public static final class C0092a extends a {
            public final Data a = Data.b;

            @NonNull
            public final Data a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0092a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0092a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (C0092a.class.getName().hashCode() * 31);
            }

            @NonNull
            public final String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        /* compiled from: ListenableWorker.java */
        /* renamed from: androidx.work.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes12.dex */
        public static final class C0093b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C0093b.class == obj.getClass();
            }

            public final int hashCode() {
                return C0093b.class.getName().hashCode();
            }

            @NonNull
            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: ListenableWorker.java */
        public static final class c extends a {
            public final Data a = Data.b;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            @NonNull
            public final String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }
        }
    }

    public b(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getForegroundInfoAsync$0(ub9.a aVar) throws Exception {
        aVar.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    @NonNull
    public ugz<n7s> getForegroundInfoAsync() {
        return ub9.a(new ao(18));
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.b;
    }

    @Nullable
    public final Network getNetwork() {
        return this.mWorkerParams.d.c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    @NonNull
    public r5o0 getTaskExecutor() {
        return this.mWorkerParams.h;
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.d.a;
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.d.b;
    }

    @NonNull
    public iyx0 getWorkerFactory() {
        return this.mWorkerParams.i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    @NonNull
    public final ugz<Void> setForegroundAsync(@NonNull n7s n7sVar) {
        return this.mWorkerParams.k.a(getApplicationContext(), getId(), n7sVar);
    }

    @NonNull
    public ugz<Void> setProgressAsync(@NonNull Data data) {
        twx0 twx0Var = this.mWorkerParams.j;
        getApplicationContext();
        UUID id = getId();
        return ub9.a(new xgz(twx0Var.b.a, "updateProgress", new h24(twx0Var, id, data, 5)));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    public abstract ugz<a> startWork();

    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }

    public void onStopped() {
    }
}
