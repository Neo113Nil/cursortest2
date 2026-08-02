package com.appsflyer.internal;

import android.os.Build;
import android.os.Handler;
import android.view.Window;
import com.google.android.gms.internal.play_billing.c2;
import com.google.android.gms.internal.play_billing.f2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static void a(Window window, io.sentry.android.core.internal.util.n nVar, Handler handler) {
        if (nVar == null) {
            return;
        }
        window.addOnFrameMetricsAvailableListener(nVar, handler);
    }

    public static void b(Window window, io.sentry.android.core.internal.util.n nVar) {
        if (nVar == null) {
            return;
        }
        window.removeOnFrameMetricsAvailableListener(nVar);
    }

    public static /* synthetic */ void c(AFc1jSDK aFc1jSDK) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || aFc1jSDK != ForkJoinPool.commonPool()) && !(isTerminated = aFc1jSDK.isTerminated())) {
            aFc1jSDK.shutdown();
            boolean z5 = false;
            while (!isTerminated) {
                try {
                    isTerminated = aFc1jSDK.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z5) {
                        aFc1jSDK.shutdownNow();
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void d(c2 c2Var) {
        boolean isTerminated;
        ExecutorService executorService = c2Var.f5410a;
        if ((Build.VERSION.SDK_INT <= 23 || c2Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            c2Var.shutdown();
            boolean z5 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z5) {
                        c2Var.shutdownNow();
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void e(f2 f2Var) {
        boolean isTerminated;
        ExecutorService executorService = f2Var.f5410a;
        if ((Build.VERSION.SDK_INT <= 23 || f2Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            f2Var.shutdown();
            boolean z5 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z5) {
                        f2Var.shutdownNow();
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void f(io.sentry.android.replay.util.f fVar) {
        boolean isTerminated;
        ScheduledExecutorService scheduledExecutorService = fVar.f16131a;
        if ((Build.VERSION.SDK_INT <= 23 || fVar != ForkJoinPool.commonPool()) && !(isTerminated = scheduledExecutorService.isTerminated())) {
            fVar.shutdown();
            boolean z5 = false;
            while (!isTerminated) {
                try {
                    isTerminated = scheduledExecutorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z5) {
                        fVar.shutdownNow();
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void g(io.sentry.transport.n nVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || nVar != ForkJoinPool.commonPool()) && !(isTerminated = nVar.isTerminated())) {
            nVar.shutdown();
            boolean z5 = false;
            while (!isTerminated) {
                try {
                    isTerminated = nVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z5) {
                        nVar.shutdownNow();
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void h(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z5 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z5) {
                        executorService.shutdownNow();
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void i(p8.e eVar) {
        if ((Build.VERSION.SDK_INT <= 23 || eVar != ForkJoinPool.commonPool()) && !eVar.f21549a.isTerminated()) {
            eVar.shutdown();
            throw null;
        }
    }
}
