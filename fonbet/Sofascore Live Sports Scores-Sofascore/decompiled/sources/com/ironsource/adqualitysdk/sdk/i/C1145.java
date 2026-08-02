package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｒ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1145 extends ThreadPoolExecutor implements InterfaceC0873, AutoCloseable {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1143 f3625;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0683 f3626;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1145(C1143 c1143, ThreadPoolExecutor threadPoolExecutor, C0683 c0683) {
        super(r1, r2, threadPoolExecutor.getKeepAliveTime(r5), r5, threadPoolExecutor.getQueue());
        this.f3625 = c1143;
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f3626 = c0683;
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
    public final void execute(Runnable runnable) {
        this.f3625.m270(this, this.f3626, StringFog.decrypt("PIRdqhKOaQ4HtEu3BZt1GQ3ofaoSjmkODQ==\n", "aMYY0nftHHo=\n"), runnable);
        super.execute(runnable);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0873
    /* renamed from: ﾒ */
    public final Object mo127() {
        return this;
    }
}
