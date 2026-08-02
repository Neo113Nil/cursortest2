package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30633a;

    /* renamed from: b, reason: collision with root package name */
    public final d f30634b;

    /* renamed from: e, reason: collision with root package name */
    public final int f30637e;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f30635c = new a();

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f30636d = new b();

    /* renamed from: f, reason: collision with root package name */
    public H7.k f30638f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f30639g = 0;

    /* renamed from: h, reason: collision with root package name */
    public f f30640h = f.IDLE;

    /* renamed from: i, reason: collision with root package name */
    public long f30641i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f30642j = 0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.d();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.j();
        }
    }

    public static /* synthetic */ class c {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$imagepipeline$producers$JobScheduler$JobState;

        static {
            int[] iArr = new int[f.values().length];
            $SwitchMap$com$facebook$imagepipeline$producers$JobScheduler$JobState = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$imagepipeline$producers$JobScheduler$JobState[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$imagepipeline$producers$JobScheduler$JobState[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$imagepipeline$producers$JobScheduler$JobState[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(H7.k kVar, int i10);
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static ScheduledExecutorService f30645a;

        public static ScheduledExecutorService a() {
            if (f30645a == null) {
                f30645a = Executors.newSingleThreadScheduledExecutor();
            }
            return f30645a;
        }
    }

    public enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public G(Executor executor, d dVar, int i10) {
        this.f30633a = executor;
        this.f30634b = dVar;
        this.f30637e = i10;
    }

    public static boolean i(H7.k kVar, int i10) {
        return AbstractC3019c.d(i10) || AbstractC3019c.m(i10, 4) || H7.k.isValid(kVar);
    }

    public void c() {
        H7.k kVar;
        synchronized (this) {
            kVar = this.f30638f;
            this.f30638f = null;
            this.f30639g = 0;
        }
        H7.k.r(kVar);
    }

    public final void d() {
        H7.k kVar;
        int i10;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            kVar = this.f30638f;
            i10 = this.f30639g;
            this.f30638f = null;
            this.f30639g = 0;
            this.f30640h = f.RUNNING;
            this.f30642j = uptimeMillis;
        }
        try {
            if (i(kVar, i10)) {
                this.f30634b.a(kVar, i10);
            }
        } finally {
            H7.k.r(kVar);
            g();
        }
    }

    public final void e(long j10) {
        Runnable a10 = I7.a.a(this.f30636d, "JobScheduler_enqueueJob");
        if (j10 > 0) {
            e.a().schedule(a10, j10, TimeUnit.MILLISECONDS);
        } else {
            a10.run();
        }
    }

    public synchronized long f() {
        return this.f30642j - this.f30641i;
    }

    public final void g() {
        long j10;
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f30640h == f.RUNNING_AND_PENDING) {
                    j10 = Math.max(this.f30642j + this.f30637e, uptimeMillis);
                    this.f30641i = uptimeMillis;
                    this.f30640h = f.QUEUED;
                    z10 = true;
                } else {
                    this.f30640h = f.IDLE;
                    j10 = 0;
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            e(j10 - uptimeMillis);
        }
    }

    public boolean h() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z10 = false;
                if (!i(this.f30638f, this.f30639g)) {
                    return false;
                }
                int i10 = c.$SwitchMap$com$facebook$imagepipeline$producers$JobScheduler$JobState[this.f30640h.ordinal()];
                if (i10 != 1) {
                    if (i10 == 3) {
                        this.f30640h = f.RUNNING_AND_PENDING;
                    }
                    max = 0;
                } else {
                    max = Math.max(this.f30642j + this.f30637e, uptimeMillis);
                    this.f30641i = uptimeMillis;
                    this.f30640h = f.QUEUED;
                    z10 = true;
                }
                if (z10) {
                    e(max - uptimeMillis);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        this.f30633a.execute(I7.a.a(this.f30635c, "JobScheduler_submitJob"));
    }

    public boolean k(H7.k kVar, int i10) {
        H7.k kVar2;
        if (!i(kVar, i10)) {
            return false;
        }
        synchronized (this) {
            kVar2 = this.f30638f;
            this.f30638f = H7.k.k(kVar);
            this.f30639g = i10;
        }
        H7.k.r(kVar2);
        return true;
    }
}
