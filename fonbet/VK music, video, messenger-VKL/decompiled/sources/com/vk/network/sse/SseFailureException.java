package com.vk.network.sse;

import java.io.IOException;

/* compiled from: SseFailureException.kt */
/* loaded from: classes3.dex */
public final class SseFailureException extends IOException {
    public SseFailureException() {
        this(null, 3);
    }

    public SseFailureException(String str, int i) {
        super((i & 1) != 0 ? "" : str, null);
    }
}
