package com.ironsource;

/* renamed from: com.ironsource.cg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC2371cg {
    static /* synthetic */ void a(InterfaceC2371cg interfaceC2371cg, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        interfaceC2371cg.a(runnable, j);
    }

    void a(Runnable runnable);

    void a(Runnable runnable, long j);
}
