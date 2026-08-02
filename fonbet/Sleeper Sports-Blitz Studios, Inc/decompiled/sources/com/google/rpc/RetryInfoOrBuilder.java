package com.google.rpc;

import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes8.dex */
public interface RetryInfoOrBuilder extends MessageLiteOrBuilder {
    Duration getRetryDelay();

    boolean hasRetryDelay();
}
