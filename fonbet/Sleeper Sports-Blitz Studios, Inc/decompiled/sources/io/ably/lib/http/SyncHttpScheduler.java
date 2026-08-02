package io.ably.lib.http;

import io.ably.lib.util.CurrentThreadExecutor;

/* loaded from: classes9.dex */
public class SyncHttpScheduler extends HttpScheduler {
    public SyncHttpScheduler(HttpCore httpCore) {
        super(httpCore, CurrentThreadExecutor.INSTANCE);
    }
}
