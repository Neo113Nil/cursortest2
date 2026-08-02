package io.sentry;

import java.util.concurrent.Future;

/* renamed from: io.sentry.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4760i0 {
    void a(long j10);

    Future b(Runnable runnable, long j10);

    boolean isClosed();

    Future submit(Runnable runnable);
}
