package org.chromium.net.urlconnection;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
class CronetInputStream extends InputStream {
    private static final int READ_BUFFER_SIZE = 32768;
    private ByteBuffer mBuffer;
    private IOException mException;
    private final CronetHttpURLConnection mHttpURLConnection;
    private boolean mResponseDataCompleted;

    public CronetInputStream(CronetHttpURLConnection httpURLConnection) {
        this.mHttpURLConnection = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        getMoreDataIfNeeded();
        if (hasUnreadData()) {
            return this.mBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer, int byteOffset, int byteCount) throws IOException {
        if (byteOffset < 0 || byteCount < 0 || byteOffset + byteCount > buffer.length) {
            throw new IndexOutOfBoundsException();
        }
        if (byteCount == 0) {
            return 0;
        }
        getMoreDataIfNeeded();
        if (!hasUnreadData()) {
            return -1;
        }
        int min = Math.min(this.mBuffer.limit() - this.mBuffer.position(), byteCount);
        this.mBuffer.get(buffer, byteOffset, min);
        return min;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.mResponseDataCompleted) {
            IOException iOException = this.mException;
            if (iOException == null) {
                return 0;
            }
            throw iOException;
        }
        if (hasUnreadData()) {
            return this.mBuffer.remaining();
        }
        return 0;
    }

    void setResponseDataCompleted(IOException exception) {
        this.mException = exception;
        this.mResponseDataCompleted = true;
        this.mBuffer = null;
    }

    private void getMoreDataIfNeeded() throws IOException {
        if (this.mResponseDataCompleted) {
            IOException iOException = this.mException;
            if (iOException != null) {
                throw iOException;
            }
        } else {
            if (hasUnreadData()) {
                return;
            }
            if (this.mBuffer == null) {
                this.mBuffer = ByteBuffer.allocateDirect(32768);
            }
            this.mHttpURLConnection.getMoreData(this.mBuffer);
            IOException iOException2 = this.mException;
            if (iOException2 != null) {
                throw iOException2;
            }
            ByteBuffer byteBuffer = this.mBuffer;
            if (byteBuffer != null) {
            }
        }
    }

    private boolean hasUnreadData() {
        ByteBuffer byteBuffer = this.mBuffer;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }
}
