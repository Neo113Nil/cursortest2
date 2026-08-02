package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C7143f1;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.android.core.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7116q implements io.sentry.S {
    @Override // io.sentry.S
    public final void c() {
    }

    @Override // io.sentry.S
    public final void d(@NotNull C7143f1 c7143f1) {
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        c7143f1.f(Long.valueOf(freeMemory));
        c7143f1.g(Long.valueOf(nativeHeapSize));
    }
}
