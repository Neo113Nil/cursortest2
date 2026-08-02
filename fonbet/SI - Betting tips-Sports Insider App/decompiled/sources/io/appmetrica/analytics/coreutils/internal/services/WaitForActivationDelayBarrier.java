package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a, reason: collision with root package name */
    private long f11735a;

    /* renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f11736b;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class ActivationBarrierHelper {

        /* renamed from: a, reason: collision with root package name */
        private boolean f11737a = false;

        /* renamed from: b, reason: collision with root package name */
        private final a f11738b;

        /* renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f11739c;

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f11738b = new a(this, runnable);
            this.f11739c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j, @NonNull ICommonExecutor iCommonExecutor) {
            if (this.f11737a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f11739c.subscribe(j, iCommonExecutor, this.f11738b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f11735a = this.f11736b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j - (this.f11736b.currentTimeMillis() - this.f11735a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f11736b = systemTimeProvider;
    }
}
