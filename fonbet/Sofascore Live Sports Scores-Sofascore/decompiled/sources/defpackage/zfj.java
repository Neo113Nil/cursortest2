package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zfj implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AtomicLong c;
    public final /* synthetic */ Boolean d;

    public zfj(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        Objects.requireNonNull(newThread);
        AtomicLong atomicLong = this.c;
        Objects.requireNonNull(atomicLong);
        newThread.setName(String.format(Locale.ROOT, this.b, Long.valueOf(atomicLong.getAndIncrement())));
        Boolean bool = this.d;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        return newThread;
    }
}
