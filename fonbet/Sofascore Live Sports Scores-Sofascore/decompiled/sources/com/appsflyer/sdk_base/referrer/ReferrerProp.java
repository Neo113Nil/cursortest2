package com.appsflyer.sdk_base.referrer;

import com.appsflyer.sdk_base.logger.AFLoggerBase;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/appsflyer/sdk_base/referrer/ReferrerProp;", "", "listener", "Ljava/lang/Runnable;", "logger", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "backgroundExecutor", "Ljava/util/concurrent/ExecutorService;", "<init>", "(Ljava/lang/Runnable;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/ExecutorService;)V", "getListener", "()Ljava/lang/Runnable;", "getLogger", "()Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "getBackgroundExecutor", "()Ljava/util/concurrent/ExecutorService;", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReferrerProp {

    @NotNull
    private final ExecutorService backgroundExecutor;

    @NotNull
    private final Runnable listener;

    @NotNull
    private final AFLoggerBase logger;

    public ReferrerProp(@NotNull Runnable runnable, @NotNull AFLoggerBase aFLoggerBase, @NotNull ExecutorService executorService) {
        runnable.getClass();
        aFLoggerBase.getClass();
        executorService.getClass();
        this.listener = runnable;
        this.logger = aFLoggerBase;
        this.backgroundExecutor = executorService;
    }

    @NotNull
    public final ExecutorService getBackgroundExecutor() {
        return this.backgroundExecutor;
    }

    @NotNull
    public final Runnable getListener() {
        return this.listener;
    }

    @NotNull
    public final AFLoggerBase getLogger() {
        return this.logger;
    }
}
