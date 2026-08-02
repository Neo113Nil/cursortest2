package nb;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* renamed from: nb.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC5691A implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f57156f = Logger.getLogger(ExecutorC5691A.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f57157a;

    /* renamed from: b, reason: collision with root package name */
    public final Deque f57158b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public c f57159c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    public long f57160d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final b f57161e = new b(this, null);

    /* renamed from: nb.A$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f57162a;

        public a(Runnable runnable) {
            this.f57162a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57162a.run();
        }

        public String toString() {
            return this.f57162a.toString();
        }
    }

    /* renamed from: nb.A$b */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f57164a;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        
            r8.f57164a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
        
            r8.f57164a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            nb.ExecutorC5691A.f57156f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f57164a, (java.lang.Throwable) r3);
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
        public final void a() {
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                try {
                    synchronized (ExecutorC5691A.this.f57158b) {
                        if (!z10) {
                            c cVar = ExecutorC5691A.this.f57159c;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                ExecutorC5691A.d(ExecutorC5691A.this);
                                ExecutorC5691A.this.f57159c = cVar2;
                                z10 = true;
                            }
                        }
                        Runnable runnable = (Runnable) ExecutorC5691A.this.f57158b.poll();
                        this.f57164a = runnable;
                        if (runnable == null) {
                            ExecutorC5691A.this.f57159c = c.IDLE;
                        }
                    }
                    if (!z11) {
                        return;
                    }
                } finally {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (ExecutorC5691A.this.f57158b) {
                    ExecutorC5691A.this.f57159c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f57164a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC5691A.this.f57159c + "}";
        }

        public /* synthetic */ b(ExecutorC5691A executorC5691A, a aVar) {
            this();
        }
    }

    /* renamed from: nb.A$c */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC5691A(Executor executor) {
        this.f57157a = (Executor) AbstractC3191o.m(executor);
    }

    public static /* synthetic */ long d(ExecutorC5691A executorC5691A) {
        long j10 = executorC5691A.f57160d;
        executorC5691A.f57160d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        AbstractC3191o.m(runnable);
        synchronized (this.f57158b) {
            c cVar2 = this.f57159c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f57160d;
                a aVar = new a(runnable);
                this.f57158b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f57159c = cVar3;
                try {
                    this.f57157a.execute(this.f57161e);
                    if (this.f57159c != cVar3) {
                        return;
                    }
                    synchronized (this.f57158b) {
                        try {
                            if (this.f57160d == j10 && this.f57159c == cVar3) {
                                this.f57159c = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f57158b) {
                        try {
                            c cVar4 = this.f57159c;
                            if (cVar4 != c.IDLE) {
                                if (cVar4 == c.QUEUING) {
                                }
                                z10 = false;
                                if ((e10 instanceof RejectedExecutionException) || z10) {
                                    throw e10;
                                }
                            }
                            if (this.f57158b.removeLastOccurrence(aVar)) {
                                z10 = true;
                                if (e10 instanceof RejectedExecutionException) {
                                }
                                throw e10;
                            }
                            z10 = false;
                            if (e10 instanceof RejectedExecutionException) {
                            }
                            throw e10;
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f57158b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f57157a + "}";
    }
}
