package com.ironsource;

import com.ironsource.Hf;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public final class M5 implements Hf {
    private final ScheduledExecutorService a;

    public M5(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // com.ironsource.Hf
    public Hf.a a(long j, Runnable runnable) {
        return new xsna.ed(this.a.schedule(runnable, j, TimeUnit.MILLISECONDS), 21);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
    }
}
