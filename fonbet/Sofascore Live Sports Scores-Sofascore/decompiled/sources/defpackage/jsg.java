package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class jsg {
    public static final boolean a;
    public static final int b;
    public static final AtomicReference c = new AtomicReference();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[LOOP:0: B:12:0x0039->B:20:0x006b, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        boolean z;
        String property;
        int parseInt;
        ScheduledExecutorService newScheduledThreadPool;
        String property2;
        try {
            property2 = System.getProperty("rx2.purge-enabled");
        } catch (Throwable unused) {
        }
        if (property2 == null) {
            z = true;
            a = z;
            if (z) {
                try {
                    property = System.getProperty("rx2.purge-period-seconds");
                } catch (Throwable unused2) {
                }
                if (property != null) {
                    parseInt = Integer.parseInt(property);
                    b = parseInt;
                    if (!a) {
                        return;
                    }
                    while (true) {
                        AtomicReference atomicReference = c;
                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
                        if (scheduledExecutorService != null) {
                            return;
                        }
                        newScheduledThreadPool = Executors.newScheduledThreadPool(1, new bag("RxSchedulerPurge"));
                        while (!atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                            if (atomicReference.get() != scheduledExecutorService) {
                                break;
                            }
                        }
                        gl5 gl5Var = new gl5(4);
                        long j = b;
                        newScheduledThreadPool.scheduleAtFixedRate(gl5Var, j, j, TimeUnit.SECONDS);
                        return;
                        newScheduledThreadPool.shutdownNow();
                    }
                }
            }
            parseInt = 1;
            b = parseInt;
            if (!a) {
            }
        } else {
            z = "true".equals(property2);
            a = z;
            if (z) {
            }
            parseInt = 1;
            b = parseInt;
            if (!a) {
            }
        }
    }
}
