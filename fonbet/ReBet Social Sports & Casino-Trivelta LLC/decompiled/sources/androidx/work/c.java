package androidx.work;

import Q2.C1498i;
import Q2.O;
import Ta.o;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c {

    @NonNull
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    public static abstract class a {

        /* renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0416a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f23774a;

            public C0416a() {
                this(androidx.work.b.f23770c);
            }

            public androidx.work.b e() {
                return this.f23774a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0416a.class != obj.getClass()) {
                    return false;
                }
                return this.f23774a.equals(((C0416a) obj).f23774a);
            }

            public int hashCode() {
                return (C0416a.class.getName().hashCode() * 31) + this.f23774a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f23774a + '}';
            }

            public C0416a(androidx.work.b bVar) {
                this.f23774a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0417c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f23775a;

            public C0417c() {
                this(androidx.work.b.f23770c);
            }

            public androidx.work.b e() {
                return this.f23775a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0417c.class != obj.getClass()) {
                    return false;
                }
                return this.f23775a.equals(((C0417c) obj).f23775a);
            }

            public int hashCode() {
                return (C0417c.class.getName().hashCode() * 31) + this.f23775a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f23775a + '}';
            }

            public C0417c(androidx.work.b bVar) {
                this.f23775a = bVar;
            }
        }

        public static a a() {
            return new C0416a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C0417c();
        }

        public static a d(androidx.work.b bVar) {
            return new C0417c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public abstract o getForegroundInfoAsync();

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.c();
    }

    @NonNull
    public final b getInputData() {
        return this.mWorkerParams.d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }

    @NonNull
    public Z2.b getTaskExecutor() {
        return this.mWorkerParams.i();
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }

    @NonNull
    public O getWorkerFactory() {
        return this.mWorkerParams.m();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final o setForegroundAsync(@NonNull C1498i c1498i) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), c1498i);
    }

    @NonNull
    public o setProgressAsync(@NonNull b bVar) {
        return this.mWorkerParams.f().a(getApplicationContext(), getId(), bVar);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract o startWork();

    public final void stop(int i10) {
        if (this.mStopReason.compareAndSet(-256, i10)) {
            onStopped();
        }
    }
}
