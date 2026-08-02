package org.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes10.dex */
public class RewindableReadableByteChannel implements ReadableByteChannel {
    private final ByteBuffer buffer;
    private int nextBufferReadPosition;
    private int nextBufferWritePosition;
    private boolean passedRewindPoint;
    private final ReadableByteChannel readableByteChannel;

    public RewindableReadableByteChannel(ReadableByteChannel readableByteChannel, int i) {
        this.buffer = ByteBuffer.allocate(i);
        this.readableByteChannel = readableByteChannel;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        int position = byteBuffer.position();
        ByteBuffer byteBuffer2 = this.buffer;
        byteBuffer2.limit(byteBuffer2.capacity());
        this.buffer.position(this.nextBufferWritePosition);
        if (this.buffer.capacity() > 0) {
            this.readableByteChannel.read(this.buffer);
            this.nextBufferWritePosition = this.buffer.position();
        }
        this.buffer.position(this.nextBufferReadPosition);
        this.buffer.limit(this.nextBufferWritePosition);
        if (this.buffer.remaining() > byteBuffer.remaining()) {
            ByteBuffer byteBuffer3 = this.buffer;
            byteBuffer3.limit(byteBuffer3.position() + byteBuffer.remaining());
        }
        byteBuffer.put(this.buffer);
        this.nextBufferReadPosition = this.buffer.position();
        int read = this.readableByteChannel.read(byteBuffer);
        if (read > 0) {
            this.passedRewindPoint = true;
        } else if (read == -1 && byteBuffer.position() - position == 0) {
            return -1;
        }
        return byteBuffer.position() - position;
    }

    public void rewind() {
        if (this.passedRewindPoint) {
            throw new IllegalStateException("Passed the rewind point. Increase the buffer capacity.");
        }
        this.nextBufferReadPosition = 0;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.readableByteChannel.isOpen();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.readableByteChannel.close();
    }
}
