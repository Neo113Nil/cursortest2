package defpackage;

import com.google.android.gms.internal.ads.zzcer;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ct4 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public ct4(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(1);
                break;
            case 2:
                this.b = new AtomicInteger(0);
                break;
            case 3:
                this.b = new AtomicInteger(0);
                break;
            case 4:
            default:
                this.b = new AtomicInteger(0);
                break;
            case 5:
                this.b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
                return thread;
            case 1:
                return new Thread(runnable, "ConcurrencyUtil#" + atomicInteger.getAndIncrement());
            case 2:
                return new Thread(null, runnable, "ALOG_UP_" + atomicInteger.getAndIncrement());
            case 3:
                return new Thread(null, runnable, "ALOG_SA_" + atomicInteger.getAndIncrement());
            case 4:
                int andIncrement = atomicInteger.getAndIncrement();
                return new Thread(runnable, me4.g(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            default:
                int andIncrement2 = atomicInteger.getAndIncrement();
                return new Thread(runnable, me4.g(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
        }
    }

    public ct4(zzcer zzcerVar) {
        this.a = 4;
        this.b = new AtomicInteger(1);
    }
}
