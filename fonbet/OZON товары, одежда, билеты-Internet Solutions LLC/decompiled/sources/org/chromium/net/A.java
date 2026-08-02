package org.chromium.net;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public abstract class A implements Closeable {
    public abstract long c() throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public abstract void d(h hVar, ByteBuffer byteBuffer) throws IOException;

    public abstract void j(h hVar) throws IOException;
}
