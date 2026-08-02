package com.bytedance.sdk.component.kj.sf;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends ThreadPoolExecutor implements AutoCloseable {
    private int gm;
    private int oo;
    private final String pcc;
    private int sf;
    private boolean vj;

    private qf(pcc pccVar) {
        super(pccVar.sf, Integer.MAX_VALUE, pccVar.vj, pccVar.qf, (BlockingQueue<Runnable>) pccVar.vy, pccVar.ork);
        this.vj = false;
        String unused = pccVar.pcc;
        int unused2 = pccVar.sf;
        int unused3 = pccVar.gm;
        long unused4 = pccVar.vj;
        int unused5 = pccVar.oo;
        boolean unused6 = pccVar.kj;
        BlockingQueue unused7 = pccVar.vy;
        this.pcc = pccVar.pcc;
        this.sf = pccVar.sf;
        this.gm = pccVar.gm;
        this.oo = pccVar.oo;
        allowCoreThreadTimeOut(pccVar.wh);
        this.vj = pccVar.kj;
    }

    private void gm() {
        try {
            if (this.sf != 0 && getCorePoolSize() < this.gm) {
                int size = getQueue().size();
                if (getActiveCount() < this.sf || size < this.oo) {
                    return;
                }
                setCorePoolSize(this.gm);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void oo() {
        try {
            if (this.sf != 0 && getCorePoolSize() > this.sf && getQueue().size() == 0) {
                setCorePoolSize(this.sf);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof gm;
        if (z) {
            ((gm) runnable).setAfterTimestamp(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z) {
            gm gmVar = (gm) runnable;
            gmVar.getName();
            gmVar.getPriority();
            gmVar.getSubmitTimestamp();
            gmVar.getBeforeTimestamp();
            gmVar.getAfterTimestamp();
        }
        oo();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof gm) {
            ((gm) runnable).setBeforeTimestamp(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.kj.sf.pcc pcc2;
        if (!(runnable instanceof gm)) {
            runnable = new gm("unknown", runnable) { // from class: com.bytedance.sdk.component.kj.sf.qf.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable target = getTarget();
                    if (target != null) {
                        target.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.pcc)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(vj.pcc(this.pcc)) && (pcc2 = oo.pcc()) != null) {
                pcc2.pcc(this, (gm) runnable);
            }
        }
        ((gm) runnable).setSubmitTimestamp(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            gm();
        } catch (Throwable th) {
            pcc(runnable, th);
        }
    }

    public void pcc(pcc pccVar) {
        try {
            if (pccVar.sf >= 0 && this.sf != pccVar.sf) {
                int i = pccVar.sf;
                this.sf = i;
                setCorePoolSize(i);
            }
            this.gm = pccVar.gm;
            this.oo = pccVar.oo;
            allowCoreThreadTimeOut(pccVar.wh);
            this.vj = pccVar.kj;
        } catch (Throwable th) {
            th.getMessage();
        }
        String unused = pccVar.pcc;
        int unused2 = pccVar.sf;
        int unused3 = pccVar.gm;
        long unused4 = pccVar.vj;
        int unused5 = pccVar.oo;
        boolean unused6 = pccVar.kj;
        BlockingQueue unused7 = pccVar.vy;
    }

    public boolean sf() {
        return this.vj;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.pcc)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.pcc) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int i;
        String str;
        runnable.getClass();
        final RunnableFuture newTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof gm) {
            gm gmVar = (gm) runnable;
            i = gmVar.getPriority();
            str = gmVar.getName();
        } else {
            i = 6;
            str = "";
        }
        if (i == 0 || TextUtils.isEmpty(str)) {
            new RuntimeException();
        }
        execute(new gm(str, i) { // from class: com.bytedance.sdk.component.kj.sf.qf.1
            @Override // java.lang.Runnable
            public void run() {
                newTaskFor.run();
            }
        });
        return newTaskFor;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private String pcc = "cache";
        private int sf = 4;
        private int gm = 100;
        private int oo = 0;
        private long vj = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private boolean wh = false;
        private TimeUnit qf = TimeUnit.MILLISECONDS;
        private boolean kj = false;
        private BlockingQueue<Runnable> vy = new PriorityBlockingQueue();
        private ThreadFactory ork = null;

        public qf pcc() {
            if (this.ork == null) {
                this.ork = new vj(this.pcc);
            }
            int i = this.sf;
            if (i < 0) {
                i = 8;
                this.sf = 8;
            }
            if (i == 0) {
                this.vy = new SynchronousQueue();
            }
            if (this.vy == null) {
                this.vy = new LinkedBlockingQueue();
            }
            int i2 = this.gm;
            if (i2 > 100) {
                this.gm = 100;
                i2 = 100;
            }
            int i3 = this.sf;
            if (i2 < i3) {
                this.gm = i3;
            }
            return new qf(this);
        }

        public pcc gm(int i) {
            this.oo = i;
            return this;
        }

        public pcc oo(int i) {
            return this;
        }

        public pcc sf(int i) {
            this.gm = i;
            return this;
        }

        public pcc vj(int i) {
            return this;
        }

        public pcc sf(boolean z) {
            this.kj = z;
            return this;
        }

        public pcc pcc(String str) {
            this.pcc = str;
            return this;
        }

        public pcc pcc(int i) {
            this.sf = i;
            return this;
        }

        public pcc pcc(long j) {
            this.vj = j;
            return this;
        }

        public pcc pcc(boolean z) {
            this.wh = z;
            return this;
        }

        public pcc pcc(BlockingQueue<Runnable> blockingQueue) {
            this.vy = blockingQueue;
            return this;
        }
    }

    private void pcc(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler sf = oo.sf();
                if (sf != null) {
                    sf.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public int pcc() {
        return this.gm;
    }
}
