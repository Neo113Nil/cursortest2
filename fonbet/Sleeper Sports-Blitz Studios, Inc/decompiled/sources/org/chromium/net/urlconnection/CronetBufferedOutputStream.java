package org.chromium.net.urlconnection;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes10.dex */
final class CronetBufferedOutputStream extends CronetOutputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_BUFFER_SIZE = 16384;
    private ByteBuffer mBuffer;
    private boolean mConnectRequested;
    private boolean mConnected;
    private final CronetHttpURLConnection mConnection;
    private final int mInitialContentLength;
    private final UploadDataProvider mUploadDataProvider;

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    void checkReceivedEnoughContent() throws IOException {
    }

    CronetBufferedOutputStream(final CronetHttpURLConnection connection, final long contentLength) {
        this.mUploadDataProvider = new UploadDataProviderImpl();
        Objects.requireNonNull(connection, "Argument connection cannot be null.");
        if (contentLength > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (contentLength < 0) {
            throw new IllegalArgumentException("Content length < 0.");
        }
        this.mConnection = connection;
        int i = (int) contentLength;
        this.mInitialContentLength = i;
        this.mBuffer = ByteBuffer.allocate(i);
    }

    CronetBufferedOutputStream(final CronetHttpURLConnection connection) {
        this.mUploadDataProvider = new UploadDataProviderImpl();
        this.mConnection = (CronetHttpURLConnection) Objects.requireNonNull(connection);
        this.mInitialContentLength = -1;
        this.mBuffer = ByteBuffer.allocate(16384);
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) throws IOException {
        checkNotClosed();
        ensureCanWrite(1);
        this.mBuffer.put((byte) oneByte);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int offset, int count) throws IOException {
        checkNotClosed();
        ensureCanWrite(count);
        this.mBuffer.put(buffer, offset, count);
    }

    private void ensureCanWrite(int count) throws IOException {
        if (this.mInitialContentLength != -1 && this.mBuffer.position() + count > this.mInitialContentLength) {
            throw new ProtocolException("exceeded content-length limit of " + this.mInitialContentLength + " bytes");
        }
        if (this.mInitialContentLength == -1 && this.mBuffer.limit() - this.mBuffer.position() <= count) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.mBuffer.capacity() * 2, this.mBuffer.capacity() + count));
            allocate.put(this.mBuffer);
            this.mBuffer = allocate;
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    boolean connectRequested() throws IOException {
        if (!isClosed()) {
            this.mConnectRequested = true;
            return false;
        }
        this.mConnected = true;
        if (this.mBuffer.position() < this.mInitialContentLength) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        return true;
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.mConnectRequested) {
            this.mConnection.connect();
            this.mConnectRequested = false;
        }
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    UploadDataProvider getUploadDataProvider() {
        return this.mUploadDataProvider;
    }

    private class UploadDataProviderImpl extends UploadDataProvider {
        private UploadDataProviderImpl() {
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            int i;
            if (CronetBufferedOutputStream.this.mInitialContentLength == -1) {
                i = CronetBufferedOutputStream.this.mConnected ? CronetBufferedOutputStream.this.mBuffer.limit() : CronetBufferedOutputStream.this.mBuffer.position();
            } else {
                i = CronetBufferedOutputStream.this.mInitialContentLength;
            }
            return i;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBufferedOutputStream.UploadDataProviderImpl#read");
            try {
                int remaining = byteBuffer.remaining();
                if (remaining < CronetBufferedOutputStream.this.mBuffer.remaining()) {
                    byteBuffer.put(CronetBufferedOutputStream.this.mBuffer.array(), CronetBufferedOutputStream.this.mBuffer.position(), remaining);
                } else {
                    byteBuffer.put(CronetBufferedOutputStream.this.mBuffer);
                }
                uploadDataSink.onReadSucceeded(false);
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBufferedOutputStream.UploadDataProviderImpl#rewind");
            try {
                uploadDataSink.onRewindSucceeded();
                if (scoped != null) {
                    scoped.close();
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }
}
