package org.chromium.net.urlconnection;

import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes10.dex */
final class CronetFixedModeOutputStream extends CronetOutputStream {
    private static int sDefaultBufferLength = 16384;
    private final ByteBuffer mBuffer;
    private long mBytesWritten;
    private final long mContentLength;
    private final MessageLoop mMessageLoop;
    private final UploadDataProvider mUploadDataProvider = new UploadDataProviderImpl();

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    boolean connectRequested() throws IOException {
        return true;
    }

    CronetFixedModeOutputStream(CronetHttpURLConnection connection, long contentLength, MessageLoop messageLoop) {
        Objects.requireNonNull(connection);
        if (contentLength < 0) {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.mContentLength = contentLength;
        this.mBuffer = ByteBuffer.allocate((int) Math.min(contentLength, sDefaultBufferLength));
        this.mMessageLoop = messageLoop;
        this.mBytesWritten = 0L;
    }

    @Override // java.io.OutputStream
    public void write(int oneByte) throws IOException {
        checkNotClosed();
        checkNotExceedContentLength(1);
        ensureBufferHasRemaining();
        this.mBuffer.put((byte) oneByte);
        this.mBytesWritten++;
        uploadIfComplete();
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int offset, int count) throws IOException {
        checkNotClosed();
        if (buffer.length - offset < count || offset < 0 || count < 0) {
            throw new IndexOutOfBoundsException();
        }
        checkNotExceedContentLength(count);
        int i = count;
        while (i > 0) {
            ensureBufferHasRemaining();
            int min = Math.min(i, this.mBuffer.remaining());
            this.mBuffer.put(buffer, (offset + count) - i, min);
            i -= min;
        }
        this.mBytesWritten += count;
        uploadIfComplete();
    }

    private void ensureBufferHasRemaining() throws IOException {
        if (this.mBuffer.hasRemaining()) {
            return;
        }
        uploadBufferInternal();
    }

    private void uploadIfComplete() throws IOException {
        if (this.mBytesWritten == this.mContentLength) {
            uploadBufferInternal();
        }
    }

    private void uploadBufferInternal() throws IOException {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetFixedModeOutputStream#uploadBufferInternal");
        try {
            checkNotClosed();
            this.mMessageLoop.loop();
            checkNoException();
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

    private void checkNotExceedContentLength(int numBytes) throws ProtocolException {
        if (this.mBytesWritten + numBytes <= this.mContentLength) {
            return;
        }
        throw new ProtocolException("expected " + (this.mContentLength - this.mBytesWritten) + " bytes but received " + numBytes);
    }

    @Override // org.chromium.net.urlconnection.CronetOutputStream
    void checkReceivedEnoughContent() throws IOException {
        if (this.mBytesWritten < this.mContentLength) {
            throw new ProtocolException("Content received is less than Content-Length.");
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
            return CronetFixedModeOutputStream.this.mContentLength;
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(final UploadDataSink uploadDataSink, final ByteBuffer byteBuffer) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetFixedModeOutputStream.UploadDataProviderImpl#read");
            try {
                if (byteBuffer.remaining() >= CronetFixedModeOutputStream.this.mBuffer.remaining()) {
                    byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
                    uploadDataSink.onReadSucceeded(false);
                    CronetFixedModeOutputStream.this.mMessageLoop.quit();
                } else {
                    int limit = CronetFixedModeOutputStream.this.mBuffer.limit();
                    byteBuffer.put(CronetFixedModeOutputStream.this.mBuffer);
                    uploadDataSink.onReadSucceeded(false);
                }
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
            uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
        }
    }

    static void setDefaultBufferLengthForTesting(int length) {
        sDefaultBufferLength = length;
    }
}
