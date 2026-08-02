package com.squareup.wire;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: MessageSink.kt */
/* loaded from: classes14.dex */
public interface MessageSink<T> extends Closeable {
    void cancel() throws IOException;

    void write(T t) throws IOException;
}
