package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;

/* compiled from: TimestampExtensions.kt */
/* loaded from: classes14.dex */
public final class TimestampExtensionsKt {
    public static final long duration(long j) {
        return System.nanoTime() - j;
    }

    public static final Timestamp fromMillis(long j) {
        long j2 = 1000;
        return Timestamp.newBuilder().setSeconds(j / j2).setNanos((int) ((j % j2) * 1000000)).build();
    }
}
