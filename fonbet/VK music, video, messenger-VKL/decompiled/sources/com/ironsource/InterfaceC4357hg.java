package com.ironsource;

/* renamed from: com.ironsource.hg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4357hg {
    static /* synthetic */ void a(InterfaceC4357hg interfaceC4357hg, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        interfaceC4357hg.a(runnable, j);
    }

    void a(Runnable runnable);

    void a(Runnable runnable, long j);
}
