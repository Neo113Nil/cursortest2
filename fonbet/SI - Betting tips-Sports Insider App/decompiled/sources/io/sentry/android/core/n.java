package io.sentry.android.core;

import android.os.Debug;
import io.sentry.d3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements io.sentry.x0 {
    @Override // io.sentry.x0
    public final void a(d3 d3Var) {
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        d3Var.f16303b = Long.valueOf(freeMemory);
        d3Var.f16304c = Long.valueOf(nativeHeapSize);
    }

    @Override // io.sentry.x0
    public final void c() {
    }
}
