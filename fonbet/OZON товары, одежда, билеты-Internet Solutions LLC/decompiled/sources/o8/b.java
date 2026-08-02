package o8;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class b implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f77788f = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Executor f77789a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f77790b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private c f77791c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    private long f77792d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final RunnableC1316b f77793e = new RunnableC1316b();

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f77794a;

        a(Runnable runnable) {
            this.f77794a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f77794a.run();
        }

        public final String toString() {
            return this.f77794a.toString();
        }
    }

    /* renamed from: o8.b$b, reason: collision with other inner class name */
    private final class RunnableC1316b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Runnable f77795a;

        RunnableC1316b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        
            r8.f77795a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
        
            r8.f77795a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            o8.b.f77788f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f77795a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a() {
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                try {
                    synchronized (b.this.f77790b) {
                        if (!z11) {
                            c cVar = b.this.f77791c;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                b.d(b.this);
                                b.this.f77791c = cVar2;
                                z11 = true;
                            }
                        }
                        Runnable runnable = (Runnable) b.this.f77790b.poll();
                        this.f77795a = runnable;
                        if (runnable == null) {
                            b.this.f77791c = c.IDLE;
                        }
                    }
                    if (!z12) {
                        return;
                    }
                } finally {
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e11) {
                synchronized (b.this.f77790b) {
                    b.this.f77791c = c.IDLE;
                    throw e11;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f77795a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + b.this.f77791c + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c IDLE;
        public static final c QUEUED;
        public static final c QUEUING;
        public static final c RUNNING;

        static {
            c cVar = new c("IDLE", 0);
            IDLE = cVar;
            c cVar2 = new c("QUEUING", 1);
            QUEUING = cVar2;
            c cVar3 = new c("QUEUED", 2);
            QUEUED = cVar3;
            c cVar4 = new c("RUNNING", 3);
            RUNNING = cVar4;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    b(Executor executor) {
        this.f77789a = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ void d(b bVar) {
        bVar.f77792d++;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z11;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f77790b) {
            c cVar2 = this.f77791c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j11 = this.f77792d;
                a aVar = new a(runnable);
                this.f77790b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f77791c = cVar3;
                try {
                    this.f77789a.execute(this.f77793e);
                    if (this.f77791c != cVar3) {
                        return;
                    }
                    synchronized (this.f77790b) {
                        try {
                            if (this.f77792d == j11 && this.f77791c == cVar3) {
                                this.f77791c = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e11) {
                    synchronized (this.f77790b) {
                        try {
                            c cVar4 = this.f77791c;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z11 = false;
                                if ((e11 instanceof RejectedExecutionException) || z11) {
                                    throw e11;
                                }
                            }
                            if (this.f77790b.removeLastOccurrence(aVar)) {
                                z11 = true;
                                if (e11 instanceof RejectedExecutionException) {
                                }
                                throw e11;
                            }
                            z11 = false;
                            if (e11 instanceof RejectedExecutionException) {
                            }
                            throw e11;
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f77790b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f77789a + "}";
    }
}
