package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rvd implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Number b;
    public final Object c;

    public rvd(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = str;
                this.b = new AtomicInteger(1);
                break;
            default:
                this.c = str;
                this.b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Number number = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, ((String) obj) + ":" + ((AtomicInteger) number).incrementAndGet());
                if (thread.isDaemon()) {
                    thread.setDaemon(false);
                }
                if (thread.getPriority() != 5) {
                    thread.setPriority(5);
                }
                return thread;
            case 1:
                int andIncrement = ((AtomicInteger) number).getAndIncrement();
                String str = (String) obj;
                StringBuilder sb = new StringBuilder(mz1.d(12, String.valueOf(andIncrement).length(), str));
                sb.append("AdWorker(");
                sb.append(str);
                sb.append(") #");
                sb.append(andIncrement);
                return new Thread(runnable, sb.toString());
            default:
                Thread newThread = ((ThreadFactory) obj).newThread(runnable);
                Objects.requireNonNull(newThread);
                AtomicLong atomicLong = (AtomicLong) number;
                Objects.requireNonNull(atomicLong);
                long andIncrement2 = atomicLong.getAndIncrement();
                Locale locale = Locale.ROOT;
                newThread.setName("imasdk-" + andIncrement2);
                return newThread;
        }
    }

    public rvd(ThreadFactory threadFactory, AtomicLong atomicLong) {
        this.a = 2;
        this.c = threadFactory;
        this.b = atomicLong;
    }
}
