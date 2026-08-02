package io.sentry.android.replay.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67684a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Runnable f67685b;

    public i(@NotNull Runnable delegate, @NotNull String taskName) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f67684a = taskName;
        this.f67685b = delegate;
    }

    @NotNull
    public final String a() {
        return this.f67684a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67685b.run();
    }
}
