package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes10.dex */
public interface MessageBufferInput extends Closeable {
    MessageBuffer next() throws IOException;
}
