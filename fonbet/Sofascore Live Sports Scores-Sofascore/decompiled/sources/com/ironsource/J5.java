package com.ironsource;

import com.ironsource.Ff;
import defpackage.ada;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class J5 implements Ff {

    @NotNull
    private final ScheduledExecutorService a;

    public J5(@NotNull ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // com.ironsource.Ff
    @NotNull
    public Ff.a a(long j, @NotNull Runnable runnable) {
        runnable.getClass();
        return new ada(this.a.schedule(runnable, j, TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
    }
}
