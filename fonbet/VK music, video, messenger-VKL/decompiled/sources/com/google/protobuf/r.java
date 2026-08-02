package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import xsna.eu8;
import xsna.v5q0;

/* compiled from: NioByteString.java */
/* loaded from: classes13.dex */
public final class r extends ByteString.g {
    private final ByteBuffer buffer;

    public r(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString.g
    public final boolean a(ByteString.g gVar, int i, int i2) {
        return substring(0, i2).equals(gVar.substring(i, i2 + i));
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(this.buffer.asReadOnlyBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        try {
            return this.buffer.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    public final ByteBuffer c(int i, int i2) {
        if (i < this.buffer.position() || i2 > this.buffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer slice = this.buffer.slice();
        slice.position(i - this.buffer.position());
        slice.limit(i2 - this.buffer.position());
        return slice;
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.buffer.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.buffer.remaining() != byteString.size()) {
            return false;
        }
        if (this.buffer.remaining() == 0) {
            return true;
        }
        return obj instanceof r ? this.buffer.equals(((r) obj).buffer) : obj instanceof u ? obj.equals(this) : this.buffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        ByteBuffer byteBuffer = this.buffer;
        return b0.a.d(0, byteBuffer.position(), byteBuffer.remaining(), byteBuffer) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.buffer, true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new a(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.buffer.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        ByteBuffer byteBuffer = this.buffer;
        return b0.a.d(i, i2, i3 + i2, byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        try {
            return new r(c(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int i;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            i = this.buffer.position() + this.buffer.arrayOffset();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            i = 0;
        }
        return new String(byteArray, i, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int length;
        WritableByteChannel writableByteChannel;
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), this.buffer.position() + this.buffer.arrayOffset() + i, i2);
            return;
        }
        ByteBuffer c = c(i, i2 + i);
        ThreadLocal<SoftReference<byte[]>> threadLocal = eu8.a;
        int position = c.position();
        try {
            if (c.hasArray()) {
                outputStream.write(c.array(), c.arrayOffset() + c.position(), c.remaining());
            } else {
                long j = eu8.c;
                byte[] bArr = null;
                if (j >= 0 && eu8.b.isInstance(outputStream)) {
                    try {
                        writableByteChannel = (WritableByteChannel) v5q0.c.k(j, outputStream);
                    } catch (ClassCastException unused) {
                        writableByteChannel = null;
                    }
                    if (writableByteChannel != null) {
                        writableByteChannel.write(c);
                    }
                }
                int max = Math.max(c.remaining(), 1024);
                ThreadLocal<SoftReference<byte[]>> threadLocal2 = eu8.a;
                SoftReference<byte[]> softReference = threadLocal2.get();
                if (softReference != null) {
                    bArr = softReference.get();
                }
                if (bArr == null || ((length = bArr.length) < max && length < max * 0.5f)) {
                    bArr = new byte[max];
                    if (max <= 16384) {
                        threadLocal2.set(new SoftReference<>(bArr));
                    }
                }
                while (c.hasRemaining()) {
                    int min = Math.min(c.remaining(), bArr.length);
                    c.get(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                }
            }
            c.position(position);
        } catch (Throwable th) {
            c.position(position);
            throw th;
        }
    }

    /* compiled from: NioByteString.java */
    public class a extends InputStream {
        public final ByteBuffer b;

        public a(r rVar) {
            this.b = rVar.buffer.slice();
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.b.remaining();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.b.mark();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            ByteBuffer byteBuffer = this.b;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            try {
                this.b.reset();
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            ByteBuffer byteBuffer = this.b;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, byteBuffer.remaining());
            byteBuffer.get(bArr, i, min);
            return min;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.buffer.slice());
    }
}
