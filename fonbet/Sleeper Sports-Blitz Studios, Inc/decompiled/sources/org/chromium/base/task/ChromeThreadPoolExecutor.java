package org.chromium.base.task;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.chromium.base.task.AsyncTask;

/* loaded from: classes10.dex */
class ChromeThreadPoolExecutor extends ThreadPoolExecutor implements AutoCloseable {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    private static final int RUNNABLE_WARNING_COUNT = 32;
    private static final BlockingQueue<Runnable> sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        UByte$$ExternalSyntheticBackport0.m((ExecutorService) this);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
        MAXIMUM_POOL_SIZE = (availableProcessors * 2) + 1;
        sThreadFactory = new ThreadFactory() { // from class: org.chromium.base.task.ChromeThreadPoolExecutor.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable r) {
                return new Thread(r, "CrAsyncTask #" + this.mCount.getAndIncrement());
            }
        };
        sPoolWorkQueue = new ArrayBlockingQueue(128);
    }

    ChromeThreadPoolExecutor() {
        this(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
    }

    ChromeThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    private static String getClassName(Runnable runnable) {
        Class cls = runnable.getClass();
        if (cls == AsyncTask.NamedFutureTask.class) {
            cls = ((AsyncTask.NamedFutureTask) runnable).getBlamedClass();
        } else if (cls.getEnclosingClass() == android.os.AsyncTask.class) {
            cls = android.os.AsyncTask.class;
        }
        return cls.getName();
    }

    private Map<String, Integer> getNumberOfClassNameOccurrencesInQueue() {
        HashMap hashMap = new HashMap();
        for (Runnable runnable : (Runnable[]) getQueue().toArray(new Runnable[0])) {
            String className = getClassName(runnable);
            hashMap.put(className, Integer.valueOf((hashMap.containsKey(className) ? ((Integer) hashMap.get(className)).intValue() : 0) + 1));
        }
        return hashMap;
    }

    private String findClassNamesWithTooManyRunnables(Map<String, Integer> counts) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue().intValue() > 32) {
                sb.append(entry.getKey());
                sb.append(' ');
            }
        }
        if (sb.length() == 0) {
            return "NO CLASSES FOUND";
        }
        return sb.toString();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable r) {
        try {
            super.execute(r);
        } catch (RejectedExecutionException e) {
            throw new RejectedExecutionException("Prominent classes in AsyncTask: " + findClassNamesWithTooManyRunnables(getNumberOfClassNameOccurrencesInQueue()), e);
        }
    }
}
