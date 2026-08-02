package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class srb extends WeakReference {
    public static final boolean f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    public static final RuntimeException g;
    public final ReferenceQueue a;
    public final ConcurrentMap b;
    public final String c;
    public final SoftReference d;
    public final AtomicBoolean e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        g = runtimeException;
    }

    public srb(trb trbVar, qrb qrbVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(trbVar, referenceQueue);
        this.e = new AtomicBoolean();
        this.d = new SoftReference(f ? new RuntimeException("ManagedChannel allocation site") : g);
        this.c = qrbVar.toString();
        this.a = referenceQueue;
        this.b = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            srb srbVar = (srb) referenceQueue.poll();
            if (srbVar == null) {
                return;
            }
            SoftReference softReference = srbVar.d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            srbVar.b.remove(srbVar);
            softReference.clear();
            if (!srbVar.e.get()) {
                Level level = Level.SEVERE;
                Logger logger = trb.d;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{srbVar.c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.b.remove(this);
        this.d.clear();
        a(this.a);
    }
}
