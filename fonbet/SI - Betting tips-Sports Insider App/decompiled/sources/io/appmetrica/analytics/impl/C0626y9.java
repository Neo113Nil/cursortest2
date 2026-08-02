package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626y9 implements ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0288kk f14948a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f14949b;

    public C0626y9() {
        C0288kk w10 = C0353na.k().w();
        this.f14948a = w10;
        this.f14949b = w10.b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f14948a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final InterruptionSafeThread getInterruptionThread(@NotNull String str, @NotNull String str2, @NotNull Runnable runnable) {
        StringBuilder c2 = v.f.c(str + '-' + str2, "-");
        c2.append(ThreadFactoryC0655zd.f14994a.incrementAndGet());
        return new InterruptionSafeThread(runnable, c2.toString());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getModuleExecutor() {
        return this.f14949b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getReportRunnableExecutor() {
        return this.f14948a.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getSupportIOExecutor() {
        C0288kk c0288kk = this.f14948a;
        if (c0288kk.f14153f == null) {
            synchronized (c0288kk) {
                try {
                    if (c0288kk.f14153f == null) {
                        c0288kk.f14148a.getClass();
                        HandlerThreadC0073cb a7 = C0651z9.a("IAA-SIO");
                        c0288kk.f14153f = new C0651z9(a7, a7.getLooper(), new Handler(a7.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c0288kk.f14153f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getUiExecutor() {
        C0288kk c0288kk = this.f14948a;
        if (c0288kk.f14155h == null) {
            synchronized (c0288kk) {
                try {
                    if (c0288kk.f14155h == null) {
                        c0288kk.f14148a.getClass();
                        c0288kk.f14155h = new ExecutorC0236ik(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c0288kk.f14155h;
    }
}
