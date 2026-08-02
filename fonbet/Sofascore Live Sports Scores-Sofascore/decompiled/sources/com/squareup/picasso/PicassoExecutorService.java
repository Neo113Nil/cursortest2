package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Utils;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
class PicassoExecutorService extends ThreadPoolExecutor implements AutoCloseable {
    private static final int DEFAULT_THREAD_COUNT = 3;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class PicassoFutureTask extends FutureTask<BitmapHunter> implements Comparable<PicassoFutureTask> {
        private final BitmapHunter hunter;

        public PicassoFutureTask(BitmapHunter bitmapHunter) {
            super(bitmapHunter, null);
            this.hunter = bitmapHunter;
        }

        @Override // java.lang.Comparable
        public int compareTo(PicassoFutureTask picassoFutureTask) {
            int ordinal;
            int ordinal2;
            Picasso.Priority priority = this.hunter.getPriority();
            Picasso.Priority priority2 = picassoFutureTask.hunter.getPriority();
            if (priority == priority2) {
                ordinal = this.hunter.sequence;
                ordinal2 = picassoFutureTask.hunter.sequence;
            } else {
                ordinal = priority2.ordinal();
                ordinal2 = priority.ordinal();
            }
            return ordinal - ordinal2;
        }
    }

    public PicassoExecutorService() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new Utils.PicassoThreadFactory());
    }

    private void setThreadCount(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public void adjustThreadCount(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            setThreadCount(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                setThreadCount(4);
                return;
            } else {
                setThreadCount(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                setThreadCount(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        setThreadCount(3);
                        break;
                    default:
                        setThreadCount(3);
                        break;
                }
                return;
        }
        setThreadCount(2);
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

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        PicassoFutureTask picassoFutureTask = new PicassoFutureTask((BitmapHunter) runnable);
        execute(picassoFutureTask);
        return picassoFutureTask;
    }
}
