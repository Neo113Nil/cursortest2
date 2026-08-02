package ru.ozon.app.android.analytics.plugins;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutorImpl;", "Lru/ozon/app/android/analytics/plugins/AnalyticsEventExecutor;", "executor", "Ljava/util/concurrent/ExecutorService;", "<init>", "(Ljava/util/concurrent/ExecutorService;)V", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "execute", "", "V", "callable", "Ljava/util/concurrent/Callable;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsEventExecutorImpl implements AnalyticsEventExecutor {

    @NotNull
    private final ExecutorService executor;

    public AnalyticsEventExecutorImpl(@NotNull ExecutorService executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
    }

    @Override // ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor
    public <V> void execute(@NotNull Callable<V> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        getExecutor().submit(callable);
    }

    @Override // ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor
    @NotNull
    public ExecutorService getExecutor() {
        return this.executor;
    }
}
