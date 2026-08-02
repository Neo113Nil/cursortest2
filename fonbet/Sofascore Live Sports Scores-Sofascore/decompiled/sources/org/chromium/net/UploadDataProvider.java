package org.chromium.net;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class UploadDataProvider implements Closeable {
    public abstract long getLength() throws IOException;

    public abstract void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException;

    public abstract void rewind(UploadDataSink uploadDataSink) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
