package org.chromium.base.task;

import android.os.AsyncTask;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.task.d;

/* loaded from: classes10.dex */
final class e extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    private static final int f78588a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f78589b;

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadFactory f78590c;

    /* renamed from: d, reason: collision with root package name */
    private static final ArrayBlockingQueue f78591d;

    final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f78592a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, Ej.b.a(this.f78592a.getAndIncrement(), "CrAsyncTask #"));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f78588a = Math.max(2, Math.min(availableProcessors - 1, 4));
        f78589b = (availableProcessors * 2) + 1;
        f78590c = new a();
        f78591d = new ArrayBlockingQueue(UserVerificationMethods.USER_VERIFY_PATTERN);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    e() {
        super(f78588a, f78589b, 30L, r5, r6, r7);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ArrayBlockingQueue arrayBlockingQueue = f78591d;
        ThreadFactory threadFactory = f78590c;
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e11) {
            HashMap hashMap = new HashMap();
            for (Runnable runnable2 : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                Class<?> cls = runnable2.getClass();
                if (cls == d.a.class) {
                    cls = d.this.getClass();
                } else if (cls.getEnclosingClass() == AsyncTask.class) {
                    cls = AsyncTask.class;
                }
                String name = cls.getName();
                hashMap.put(name, Integer.valueOf((hashMap.containsKey(name) ? ((Integer) hashMap.get(name)).intValue() : 0) + 1));
            }
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 32) {
                    sb2.append((String) entry.getKey());
                    sb2.append(' ');
                }
            }
            throw new RejectedExecutionException(Nk.a.b("Prominent classes in AsyncTask: ", sb2.length() == 0 ? "NO CLASSES FOUND" : sb2.toString()), e11);
        }
    }
}
