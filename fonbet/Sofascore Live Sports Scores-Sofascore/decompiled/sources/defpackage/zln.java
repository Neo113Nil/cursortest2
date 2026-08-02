package defpackage;

import com.android.billingclient.api.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zln implements ThreadFactory {
    public final /* synthetic */ int a = 0;
    public final ThreadFactory b = Executors.defaultThreadFactory();
    public final AtomicInteger c = new AtomicInteger(1);

    public zln() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        ThreadFactory threadFactory = this.b;
        AtomicInteger atomicInteger = this.c;
        switch (i) {
            case 0:
                Thread newThread = threadFactory.newThread(runnable);
                int andIncrement = atomicInteger.getAndIncrement();
                StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 5);
                sb.append("gads-");
                sb.append(andIncrement);
                newThread.setName(sb.toString());
                return newThread;
            default:
                Thread newThread2 = threadFactory.newThread(runnable);
                newThread2.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread2;
        }
    }

    public zln(a aVar) {
    }
}
