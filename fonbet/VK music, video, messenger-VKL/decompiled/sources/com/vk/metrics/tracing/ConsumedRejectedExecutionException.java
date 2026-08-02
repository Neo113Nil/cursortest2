package com.vk.metrics.tracing;

import java.util.concurrent.RejectedExecutionException;
import xsna.d7j;

/* compiled from: TracingExecutors.kt */
/* loaded from: classes3.dex */
public final class ConsumedRejectedExecutionException extends RejectedExecutionException implements d7j {
    public ConsumedRejectedExecutionException(String str, Throwable th) {
        super(str, th);
    }
}
