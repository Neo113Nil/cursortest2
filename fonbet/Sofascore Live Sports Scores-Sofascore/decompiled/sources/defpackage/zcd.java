package defpackage;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.h2;
import com.google.protobuf.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zcd extends l {
    public final ByteBuffer a;

    public zcd(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.a.slice());
    }

    @Override // com.google.protobuf.l
    public final boolean a(l lVar, int i, int i2) {
        return substring(0, i2).equals(lVar.substring(i, i2 + i));
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.a.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.a.asReadOnlyBuffer());
    }

    public final ByteBuffer b(int i, int i2) {
        ByteBuffer byteBuffer = this.a;
        if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
            sw9.n("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        ByteBuffer slice = byteBuffer.slice();
        slice.position(i - byteBuffer.position());
        slice.limit(i2 - byteBuffer.position());
        return slice;
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        try {
            return this.a.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            hc5.h(e2.getMessage());
            return (byte) 0;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.a.slice();
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
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        return obj instanceof zcd ? byteBuffer.equals(((zcd) obj).a) : obj instanceof h2 ? obj.equals(this) : byteBuffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        u8f u8fVar = fik.a;
        ByteBuffer byteBuffer = this.a;
        return u8fVar.h(0, byteBuffer.position(), byteBuffer.remaining(), byteBuffer) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.a, true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new oy1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.a.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        return fik.a.h(i, i2, i3 + i2, this.a);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.a.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        try {
            return new zcd(b(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            hc5.h(e2.getMessage());
            return null;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int i;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            byteArray = byteBuffer.array();
            i = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            i = 0;
        }
        return new String(byteArray, i, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) {
        byteOutput.writeLazy(this.a.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        int length;
        WritableByteChannel writableByteChannel;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset() + i, i2);
            return;
        }
        ByteBuffer b = b(i, i2 + i);
        ThreadLocal threadLocal = ia2.a;
        int position = b.position();
        try {
            if (b.hasArray()) {
                outputStream.write(b.array(), b.arrayOffset() + b.position(), b.remaining());
            } else {
                long j = ia2.c;
                byte[] bArr = null;
                if (j >= 0 && ia2.b.isInstance(outputStream)) {
                    try {
                        writableByteChannel = (WritableByteChannel) uck.j(outputStream, j);
                    } catch (ClassCastException unused) {
                        writableByteChannel = null;
                    }
                    if (writableByteChannel != null) {
                        writableByteChannel.write(b);
                    }
                }
                int max = Math.max(b.remaining(), 1024);
                ThreadLocal threadLocal2 = ia2.a;
                SoftReference softReference = (SoftReference) threadLocal2.get();
                if (softReference != null) {
                    bArr = (byte[]) softReference.get();
                }
                if (bArr == null || ((length = bArr.length) < max && length < max * 0.5f)) {
                    bArr = new byte[max];
                    if (max <= 16384) {
                        threadLocal2.set(new SoftReference(bArr));
                    }
                }
                while (b.hasRemaining()) {
                    int min = Math.min(b.remaining(), bArr.length);
                    b.get(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                }
            }
            b.position(position);
        } catch (Throwable th) {
            b.position(position);
            throw th;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        outputStream.write(toByteArray());
    }
}
