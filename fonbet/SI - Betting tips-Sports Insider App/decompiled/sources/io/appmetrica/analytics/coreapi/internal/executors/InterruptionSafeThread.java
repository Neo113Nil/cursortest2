package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f11613a;

    public InterruptionSafeThread() {
        this.f11613a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f11613a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f11613a = false;
        interrupt();
    }

    public InterruptionSafeThread(@NonNull Runnable runnable, @NonNull String str) {
        super(runnable, str);
        this.f11613a = true;
    }

    public InterruptionSafeThread(@NonNull String str) {
        super(str);
        this.f11613a = true;
    }

    public InterruptionSafeThread(@NonNull Runnable runnable) {
        super(runnable);
        this.f11613a = true;
    }
}
