package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C4860w1;
import io.sentry.InterfaceC4662a0;

/* loaded from: classes3.dex */
public class F implements InterfaceC4662a0 {
    @Override // io.sentry.InterfaceC4662a0
    public void c() {
    }

    @Override // io.sentry.InterfaceC4662a0
    public void d(C4860w1 c4860w1) {
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        c4860w1.f(Long.valueOf(freeMemory));
        c4860w1.g(Long.valueOf(nativeHeapSize));
    }
}
