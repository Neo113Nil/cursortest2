package com.squareup.wire;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: MessageSource.kt */
/* loaded from: classes14.dex */
public interface MessageSource<T> extends Closeable {
    T read() throws IOException;
}
