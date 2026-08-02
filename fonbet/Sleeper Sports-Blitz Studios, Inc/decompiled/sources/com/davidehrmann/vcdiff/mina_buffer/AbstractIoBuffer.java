package com.davidehrmann.vcdiff.mina_buffer;

import androidx.collection.SieveCacheKt;
import androidx.core.view.MotionEventCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.EnumSet;
import java.util.Set;
import kotlin.UShort;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public abstract class AbstractIoBuffer extends IoBuffer {
    private static final long BYTE_MASK = 255;
    private static final long INT_MASK = 4294967295L;
    private static final long SHORT_MASK = 65535;
    private boolean autoExpand;
    private boolean autoShrink;
    private final boolean derived;
    private int mark = -1;
    private int minimumCapacity;
    private boolean recapacityAllowed;

    private int getMediumInt(byte b, byte b2, byte b3) {
        int i = ((b2 << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((b << 16) & 16711680) | (b3 & 255);
        return (b & 128) == 128 ? (-16777216) | i : i;
    }

    protected abstract IoBuffer asReadOnlyBuffer0();

    protected abstract void buf(ByteBuffer byteBuffer);

    protected abstract IoBuffer duplicate0();

    protected abstract IoBuffer slice0();

    protected AbstractIoBuffer(IoBufferAllocator ioBufferAllocator, int i) {
        this.recapacityAllowed = true;
        setAllocator(ioBufferAllocator);
        this.recapacityAllowed = true;
        this.derived = false;
        this.minimumCapacity = i;
    }

    protected AbstractIoBuffer(AbstractIoBuffer abstractIoBuffer) {
        this.recapacityAllowed = true;
        setAllocator(getAllocator());
        this.recapacityAllowed = false;
        this.derived = true;
        this.minimumCapacity = abstractIoBuffer.minimumCapacity;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final boolean isDirect() {
        return buf().isDirect();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final boolean isReadOnly() {
        return buf().isReadOnly();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final int minimumCapacity() {
        return this.minimumCapacity;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer minimumCapacity(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("minimumCapacity: " + i);
        }
        this.minimumCapacity = i;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final int capacity() {
        return buf().capacity();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer capacity(int i) {
        if (!this.recapacityAllowed) {
            throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
        }
        if (i > capacity()) {
            int position = position();
            int limit = limit();
            ByteOrder order = order();
            ByteBuffer buf = buf();
            ByteBuffer allocateNioBuffer = getAllocator().allocateNioBuffer(i, isDirect());
            buf.clear();
            allocateNioBuffer.put(buf);
            buf(allocateNioBuffer);
            buf().limit(limit);
            if (this.mark >= 0) {
                buf().position(this.mark);
                buf().mark();
            }
            buf().position(position);
            buf().order(order);
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final boolean isAutoExpand() {
        return this.autoExpand && this.recapacityAllowed;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final boolean isAutoShrink() {
        return this.autoShrink && this.recapacityAllowed;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final boolean isDerived() {
        return this.derived;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer setAutoExpand(boolean z) {
        if (!this.recapacityAllowed) {
            throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
        }
        this.autoExpand = z;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer setAutoShrink(boolean z) {
        if (!this.recapacityAllowed) {
            throw new IllegalStateException("Derived buffers and their parent can't be shrinked.");
        }
        this.autoShrink = z;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer expand(int i) {
        return expand(position(), i, false);
    }

    private IoBuffer expand(int i, boolean z) {
        return expand(position(), i, z);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer expand(int i, int i2) {
        return expand(i, i2, false);
    }

    private IoBuffer expand(int i, int i2, boolean z) {
        if (!this.recapacityAllowed) {
            throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
        }
        int i3 = i + i2;
        int normalizeCapacity = z ? IoBuffer.normalizeCapacity(i3) : i3;
        if (normalizeCapacity > capacity()) {
            capacity(normalizeCapacity);
        }
        if (i3 > limit()) {
            buf().limit(i3);
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer shrink() {
        if (!this.recapacityAllowed) {
            throw new IllegalStateException("Derived buffers and their parent can't be expanded.");
        }
        int position = position();
        int capacity = capacity();
        int limit = limit();
        if (capacity != limit) {
            int max = Math.max(this.minimumCapacity, limit);
            int i = capacity;
            while (true) {
                int i2 = i >>> 1;
                if (i2 < max) {
                    break;
                }
                i = i2;
            }
            int max2 = Math.max(max, i);
            if (max2 != capacity) {
                ByteOrder order = order();
                ByteBuffer buf = buf();
                ByteBuffer allocateNioBuffer = getAllocator().allocateNioBuffer(max2, isDirect());
                buf.position(0);
                buf.limit(limit);
                allocateNioBuffer.put(buf);
                buf(allocateNioBuffer);
                buf().position(position);
                buf().limit(limit);
                buf().order(order);
                this.mark = -1;
                return this;
            }
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final int position() {
        return buf().position();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer position(int i) {
        autoExpand(i, 0);
        buf().position(i);
        if (this.mark > i) {
            this.mark = -1;
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final int limit() {
        return buf().limit();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer limit(int i) {
        autoExpand(i, 0);
        buf().limit(i);
        if (this.mark > i) {
            this.mark = -1;
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer mark() {
        buf().mark();
        this.mark = position();
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final int markValue() {
        return this.mark;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer reset() {
        buf().reset();
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer clear() {
        buf().clear();
        this.mark = -1;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer sweep() {
        clear();
        return fillAndReset(remaining());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer sweep(byte b) {
        clear();
        return fillAndReset(b, remaining());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer flip() {
        buf().flip();
        this.mark = -1;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer rewind() {
        buf().rewind();
        this.mark = -1;
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final int remaining() {
        return limit() - position();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final boolean hasRemaining() {
        return limit() > position();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final byte get() {
        return buf().get();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final short getUnsigned() {
        return (short) (get() & 255);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer put(byte b) {
        autoExpand(1);
        buf().put(b);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putUnsigned(byte b) {
        autoExpand(1);
        buf().put((byte) (b & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putUnsigned(int i, byte b) {
        autoExpand(i, 1);
        buf().put(i, (byte) (b & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putUnsigned(short s) {
        autoExpand(1);
        buf().put((byte) (s & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putUnsigned(int i, short s) {
        autoExpand(i, 1);
        buf().put(i, (byte) (s & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putUnsigned(int i) {
        autoExpand(1);
        buf().put((byte) (i & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putUnsigned(int i, int i2) {
        autoExpand(i, 1);
        buf().put(i, (byte) (i2 & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putUnsigned(long j) {
        autoExpand(1);
        buf().put((byte) (j & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putUnsigned(int i, long j) {
        autoExpand(i, 1);
        buf().put(i, (byte) (j & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final byte get(int i) {
        return buf().get(i);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final short getUnsigned(int i) {
        return (short) (get(i) & 255);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer put(int i, byte b) {
        autoExpand(i, 1);
        buf().put(i, b);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer get(byte[] bArr, int i, int i2) {
        buf().get(bArr, i, i2);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer put(ByteBuffer byteBuffer) {
        autoExpand(byteBuffer.remaining());
        buf().put(byteBuffer);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer put(byte[] bArr, int i, int i2) {
        autoExpand(i2);
        buf().put(bArr, i, i2);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer compact() {
        int i;
        int remaining = remaining();
        int capacity = capacity();
        if (capacity != 0) {
            if (isAutoShrink() && remaining <= (capacity >>> 2) && capacity > (i = this.minimumCapacity)) {
                int max = Math.max(i, remaining << 1);
                int i2 = capacity;
                while (true) {
                    int i3 = i2 >>> 1;
                    if (i3 < max) {
                        break;
                    }
                    i2 = i3;
                }
                int max2 = Math.max(max, i2);
                if (max2 != capacity) {
                    ByteOrder order = order();
                    if (remaining > max2) {
                        throw new IllegalStateException("The amount of the remaining bytes is greater than the new capacity.");
                    }
                    ByteBuffer buf = buf();
                    ByteBuffer allocateNioBuffer = getAllocator().allocateNioBuffer(max2, isDirect());
                    allocateNioBuffer.put(buf);
                    buf(allocateNioBuffer);
                    buf().order(order);
                }
            } else {
                buf().compact();
            }
            this.mark = -1;
            return this;
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final ByteOrder order() {
        return buf().order();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer order(ByteOrder byteOrder) {
        buf().order(byteOrder);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final char getChar() {
        return buf().getChar();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putChar(char c) {
        autoExpand(2);
        buf().putChar(c);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final char getChar(int i) {
        return buf().getChar(i);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putChar(int i, char c) {
        autoExpand(i, 2);
        buf().putChar(i, c);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final CharBuffer asCharBuffer() {
        return buf().asCharBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final short getShort() {
        return buf().getShort();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putShort(short s) {
        autoExpand(2);
        buf().putShort(s);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final short getShort(int i) {
        return buf().getShort(i);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putShort(int i, short s) {
        autoExpand(i, 2);
        buf().putShort(i, s);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final ShortBuffer asShortBuffer() {
        return buf().asShortBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final int getInt() {
        return buf().getInt();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putInt(int i) {
        autoExpand(4);
        buf().putInt(i);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedInt(byte b) {
        autoExpand(4);
        buf().putInt(b & 255);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedInt(int i, byte b) {
        autoExpand(i, 4);
        buf().putInt(i, b & 255);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedInt(short s) {
        autoExpand(4);
        buf().putInt(s & UShort.MAX_VALUE);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedInt(int i, short s) {
        autoExpand(i, 4);
        buf().putInt(i, s & UShort.MAX_VALUE);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedInt(int i) {
        autoExpand(4);
        buf().putInt(i);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedInt(int i, int i2) {
        autoExpand(i, 4);
        buf().putInt(i, i2);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedInt(long j) {
        autoExpand(4);
        buf().putInt((int) j);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedInt(int i, long j) {
        autoExpand(i, 4);
        buf().putInt(i, (int) (j & INT_MASK));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedShort(byte b) {
        autoExpand(2);
        buf().putShort((short) (b & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedShort(int i, byte b) {
        autoExpand(i, 2);
        buf().putShort(i, (short) (b & 255));
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedShort(short s) {
        autoExpand(2);
        buf().putShort(s);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedShort(int i, short s) {
        autoExpand(i, 2);
        buf().putShort(i, s);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedShort(int i) {
        autoExpand(2);
        buf().putShort((short) i);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedShort(int i, int i2) {
        autoExpand(i, 2);
        buf().putShort(i, (short) i2);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedShort(long j) {
        autoExpand(2);
        buf().putShort((short) j);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putUnsignedShort(int i, long j) {
        autoExpand(i, 2);
        buf().putShort(i, (short) j);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final int getInt(int i) {
        return buf().getInt(i);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putInt(int i, int i2) {
        autoExpand(i, 4);
        buf().putInt(i, i2);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IntBuffer asIntBuffer() {
        return buf().asIntBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final long getLong() {
        return buf().getLong();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putLong(long j) {
        autoExpand(8);
        buf().putLong(j);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final long getLong(int i) {
        return buf().getLong(i);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putLong(int i, long j) {
        autoExpand(i, 8);
        buf().putLong(i, j);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final LongBuffer asLongBuffer() {
        return buf().asLongBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final float getFloat() {
        return buf().getFloat();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putFloat(float f) {
        autoExpand(4);
        buf().putFloat(f);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final float getFloat(int i) {
        return buf().getFloat(i);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putFloat(int i, float f) {
        autoExpand(i, 4);
        buf().putFloat(i, f);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final FloatBuffer asFloatBuffer() {
        return buf().asFloatBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final double getDouble() {
        return buf().getDouble();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putDouble(double d) {
        autoExpand(8);
        buf().putDouble(d);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final double getDouble(int i) {
        return buf().getDouble(i);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer putDouble(int i, double d) {
        autoExpand(i, 8);
        buf().putDouble(i, d);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final DoubleBuffer asDoubleBuffer() {
        return buf().asDoubleBuffer();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer asReadOnlyBuffer() {
        this.recapacityAllowed = false;
        return asReadOnlyBuffer0();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer duplicate() {
        this.recapacityAllowed = false;
        return duplicate0();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer slice() {
        this.recapacityAllowed = false;
        return slice0();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer getSlice(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("length: " + i2);
        }
        int limit = limit();
        if (i > limit) {
            throw new IllegalArgumentException("index: " + i);
        }
        int i3 = i2 + i;
        if (capacity() < i3) {
            throw new IndexOutOfBoundsException("index + length (" + i3 + ") is greater than capacity (" + capacity() + ").");
        }
        clear();
        position(i);
        limit(i3);
        IoBuffer slice = slice();
        position(i);
        limit(limit);
        return slice;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public final IoBuffer getSlice(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("length: " + i);
        }
        int position = position();
        int limit = limit();
        int i2 = position + i;
        if (limit < i2) {
            throw new IndexOutOfBoundsException("position + length (" + i2 + ") is greater than limit (" + limit + ").");
        }
        limit(i2);
        IoBuffer slice = slice();
        position(i2);
        limit(limit);
        return slice;
    }

    public int hashCode() {
        int position = position();
        int i = 1;
        for (int limit = limit() - 1; limit >= position; limit--) {
            i = (i * 31) + get(limit);
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IoBuffer)) {
            return false;
        }
        IoBuffer ioBuffer = (IoBuffer) obj;
        if (remaining() != ioBuffer.remaining()) {
            return false;
        }
        int position = position();
        int limit = limit() - 1;
        int limit2 = ioBuffer.limit() - 1;
        while (limit >= position) {
            if (get(limit) != ioBuffer.get(limit2)) {
                return false;
            }
            limit--;
            limit2--;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public int compareTo(IoBuffer ioBuffer) {
        int position = position() + Math.min(remaining(), ioBuffer.remaining());
        int position2 = position();
        int position3 = ioBuffer.position();
        while (position2 < position) {
            byte b = get(position2);
            byte b2 = ioBuffer.get(position3);
            if (b != b2) {
                return b < b2 ? -1 : 1;
            }
            position2++;
            position3++;
        }
        return remaining() - ioBuffer.remaining();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isDirect()) {
            sb.append("DirectBuffer");
        } else {
            sb.append("HeapBuffer");
        }
        sb.append("[pos=");
        sb.append(position());
        sb.append(" lim=");
        sb.append(limit());
        sb.append(" cap=");
        sb.append(capacity());
        sb.append(": ");
        sb.append(getHexDump(16));
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer get(byte[] bArr) {
        return get(bArr, 0, bArr.length);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer put(IoBuffer ioBuffer) {
        return put(ioBuffer.buf());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer put(byte[] bArr) {
        return put(bArr, 0, bArr.length);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public int getUnsignedShort() {
        return getShort() & UShort.MAX_VALUE;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public int getUnsignedShort(int i) {
        return getShort(i) & UShort.MAX_VALUE;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public long getUnsignedInt() {
        return getInt() & INT_MASK;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public int getMediumInt() {
        byte b = get();
        byte b2 = get();
        byte b3 = get();
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            return getMediumInt(b, b2, b3);
        }
        return getMediumInt(b3, b2, b);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public int getUnsignedMediumInt() {
        short unsigned = getUnsigned();
        short unsigned2 = getUnsigned();
        short unsigned3 = getUnsigned();
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            return (unsigned << 16) | (unsigned2 << 8) | unsigned3;
        }
        return unsigned | (unsigned2 << 8) | (unsigned3 << 16);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public int getMediumInt(int i) {
        byte b = get(i);
        byte b2 = get(i + 1);
        byte b3 = get(i + 2);
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            return getMediumInt(b, b2, b3);
        }
        return getMediumInt(b3, b2, b);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public int getUnsignedMediumInt(int i) {
        short unsigned = getUnsigned(i);
        short unsigned2 = getUnsigned(i + 1);
        short unsigned3 = getUnsigned(i + 2);
        return ByteOrder.BIG_ENDIAN.equals(order()) ? unsigned3 | (unsigned << 16) | (unsigned2 << 8) : (unsigned3 << 16) | (unsigned2 << 8) | unsigned;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putMediumInt(int i) {
        byte b = (byte) (i >> 16);
        byte b2 = (byte) (i >> 8);
        byte b3 = (byte) i;
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            put(b).put(b2).put(b3);
            return this;
        }
        put(b3).put(b2).put(b);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putMediumInt(int i, int i2) {
        byte b = (byte) (i2 >> 16);
        byte b2 = (byte) (i2 >> 8);
        byte b3 = (byte) i2;
        if (ByteOrder.BIG_ENDIAN.equals(order())) {
            put(i, b).put(i + 1, b2).put(i + 2, b3);
            return this;
        }
        put(i, b3).put(i + 1, b2).put(i + 2, b);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public long getUnsignedInt(int i) {
        return getInt(i) & INT_MASK;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public InputStream asInputStream() {
        return new InputStream() { // from class: com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer.1
            @Override // java.io.InputStream
            public boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public int available() {
                return AbstractIoBuffer.this.remaining();
            }

            @Override // java.io.InputStream
            public synchronized void mark(int i) {
                AbstractIoBuffer.this.mark();
            }

            @Override // java.io.InputStream
            public int read() {
                if (AbstractIoBuffer.this.hasRemaining()) {
                    return AbstractIoBuffer.this.get() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                int remaining = AbstractIoBuffer.this.remaining();
                if (remaining <= 0) {
                    return -1;
                }
                int min = Math.min(remaining, i2);
                AbstractIoBuffer.this.get(bArr, i, min);
                return min;
            }

            @Override // java.io.InputStream
            public synchronized void reset() {
                AbstractIoBuffer.this.reset();
            }

            @Override // java.io.InputStream
            public long skip(long j) {
                int min;
                if (j > SieveCacheKt.NodeLinkMask) {
                    min = AbstractIoBuffer.this.remaining();
                } else {
                    min = Math.min(AbstractIoBuffer.this.remaining(), (int) j);
                }
                AbstractIoBuffer.this.skip(min);
                return min;
            }
        };
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public OutputStream asOutputStream() {
        return new OutputStream() { // from class: com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer.2
            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                AbstractIoBuffer.this.put(bArr, i, i2);
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                AbstractIoBuffer.this.put((byte) i);
            }
        };
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public String getHexDump() {
        return getHexDump(Integer.MAX_VALUE);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public String getHexDump(int i) {
        return IoBufferHexDumper.getHexdump(this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0057, code lost:
    
        if (r4 <= r3) goto L12;
     */
    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getString(CharsetDecoder charsetDecoder) throws CharacterCodingException {
        int i;
        int i2;
        int i3;
        CoderResult flush;
        if (!hasRemaining()) {
            return "";
        }
        boolean startsWith = charsetDecoder.charset().name().startsWith("UTF-16");
        int position = position();
        int limit = limit();
        if (startsWith) {
            i = position;
            while (true) {
                boolean z = get(i) == 0;
                int i4 = i + 1;
                if (i4 >= limit) {
                    break;
                }
                if (get(i4) != 0) {
                    i += 2;
                    if (i >= limit) {
                        break;
                    }
                } else {
                    if (z) {
                        break;
                    }
                    i = i4;
                }
            }
            i = -1;
            if (i < 0) {
                i = ((limit - position) & (-2)) + position;
            } else {
                i2 = i + 2;
            }
            i3 = i;
        } else {
            i = indexOf((byte) 0);
            if (i < 0) {
                i = limit;
                i3 = i;
            } else {
                i2 = i + 1;
                i3 = i2;
            }
        }
        if (position == i) {
            position(i3);
            return "";
        }
        limit(i);
        charsetDecoder.reset();
        int remaining = ((int) (remaining() * charsetDecoder.averageCharsPerByte())) + 1;
        CharBuffer allocate = CharBuffer.allocate(remaining);
        while (true) {
            if (hasRemaining()) {
                flush = charsetDecoder.decode(buf(), allocate, true);
            } else {
                flush = charsetDecoder.flush(allocate);
            }
            if (!flush.isUnderflow()) {
                if (flush.isOverflow()) {
                    CharBuffer allocate2 = CharBuffer.allocate(allocate.capacity() + remaining);
                    allocate.flip();
                    allocate2.put(allocate);
                    allocate = allocate2;
                } else if (flush.isError()) {
                    limit(limit);
                    position(position);
                    flush.throwException();
                }
            } else {
                limit(limit);
                position(i3);
                return allocate.flip().toString();
            }
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public String getString(int i, CharsetDecoder charsetDecoder) throws CharacterCodingException {
        CoderResult flush;
        checkFieldSize(i);
        if (i == 0 || !hasRemaining()) {
            return "";
        }
        boolean startsWith = charsetDecoder.charset().name().startsWith("UTF-16");
        if (startsWith && (i & 1) != 0) {
            throw new IllegalArgumentException("fieldSize is not even.");
        }
        int position = position();
        int limit = limit();
        int i2 = i + position;
        if (limit < i2) {
            throw new BufferUnderflowException();
        }
        if (!startsWith) {
            int i3 = position;
            while (i3 < i2 && get(i3) != 0) {
                i3++;
            }
            if (i3 == i2) {
                limit(i2);
            } else {
                limit(i3);
            }
        } else {
            int i4 = position;
            while (i4 < i2 && (get(i4) != 0 || get(i4 + 1) != 0)) {
                i4 += 2;
            }
            if (i4 == i2) {
                limit(i2);
            } else {
                limit(i4);
            }
        }
        if (!hasRemaining()) {
            limit(limit);
            position(i2);
            return "";
        }
        charsetDecoder.reset();
        int remaining = ((int) (remaining() * charsetDecoder.averageCharsPerByte())) + 1;
        CharBuffer allocate = CharBuffer.allocate(remaining);
        while (true) {
            if (hasRemaining()) {
                flush = charsetDecoder.decode(buf(), allocate, true);
            } else {
                flush = charsetDecoder.flush(allocate);
            }
            if (!flush.isUnderflow()) {
                if (flush.isOverflow()) {
                    CharBuffer allocate2 = CharBuffer.allocate(allocate.capacity() + remaining);
                    allocate.flip();
                    allocate2.put(allocate);
                    allocate = allocate2;
                } else if (flush.isError()) {
                    limit(limit);
                    position(position);
                    flush.throwException();
                }
            } else {
                limit(limit);
                position(i2);
                return allocate.flip().toString();
            }
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putString(CharSequence charSequence, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        CoderResult flush;
        if (charSequence.length() != 0) {
            CharBuffer wrap = CharBuffer.wrap(charSequence);
            charsetEncoder.reset();
            int i = 0;
            while (true) {
                if (wrap.hasRemaining()) {
                    flush = charsetEncoder.encode(wrap, buf(), true);
                } else {
                    flush = charsetEncoder.flush(buf());
                }
                if (flush.isUnderflow()) {
                    break;
                }
                if (!flush.isOverflow()) {
                    i = 0;
                } else if (isAutoExpand()) {
                    if (i == 0) {
                        autoExpand((int) Math.ceil(wrap.remaining() * charsetEncoder.averageBytesPerChar()));
                    } else if (i == 1) {
                        autoExpand((int) Math.ceil(wrap.remaining() * charsetEncoder.maxBytesPerChar()));
                    } else {
                        throw new RuntimeException("Expanded by " + ((int) Math.ceil(wrap.remaining() * charsetEncoder.maxBytesPerChar())) + " but that wasn't enough for '" + ((Object) charSequence) + "'");
                    }
                    i++;
                }
                flush.throwException();
            }
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putString(CharSequence charSequence, int i, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        CoderResult flush;
        checkFieldSize(i);
        if (i == 0) {
            return this;
        }
        autoExpand(i);
        boolean startsWith = charsetEncoder.charset().name().startsWith("UTF-16");
        if (startsWith && (i & 1) != 0) {
            throw new IllegalArgumentException("fieldSize is not even.");
        }
        int limit = limit();
        int position = position() + i;
        if (limit < position) {
            throw new BufferOverflowException();
        }
        if (charSequence.length() == 0) {
            if (!startsWith) {
                put((byte) 0);
            } else {
                put((byte) 0);
                put((byte) 0);
            }
            position(position);
            return this;
        }
        CharBuffer wrap = CharBuffer.wrap(charSequence);
        limit(position);
        charsetEncoder.reset();
        while (true) {
            if (wrap.hasRemaining()) {
                flush = charsetEncoder.encode(wrap, buf(), true);
            } else {
                flush = charsetEncoder.flush(buf());
            }
            if (flush.isUnderflow() || flush.isOverflow()) {
                break;
            }
            flush.throwException();
        }
        limit(limit);
        if (position() < position) {
            if (!startsWith) {
                put((byte) 0);
            } else {
                put((byte) 0);
                put((byte) 0);
            }
        }
        position(position);
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public String getPrefixedString(CharsetDecoder charsetDecoder) throws CharacterCodingException {
        return getPrefixedString(2, charsetDecoder);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public String getPrefixedString(int i, CharsetDecoder charsetDecoder) throws CharacterCodingException {
        int unsigned;
        CoderResult flush;
        if (!prefixedDataAvailable(i)) {
            throw new BufferUnderflowException();
        }
        if (i == 1) {
            unsigned = getUnsigned();
        } else if (i == 2) {
            unsigned = getUnsignedShort();
        } else {
            unsigned = i != 4 ? 0 : getInt();
        }
        if (unsigned == 0) {
            return "";
        }
        if (charsetDecoder.charset().name().startsWith("UTF-16") && (unsigned & 1) != 0) {
            throw new BufferDataException("fieldSize is not even for a UTF-16 string.");
        }
        int limit = limit();
        int position = position() + unsigned;
        if (limit < position) {
            throw new BufferUnderflowException();
        }
        limit(position);
        charsetDecoder.reset();
        int remaining = ((int) (remaining() * charsetDecoder.averageCharsPerByte())) + 1;
        CharBuffer allocate = CharBuffer.allocate(remaining);
        while (true) {
            if (hasRemaining()) {
                flush = charsetDecoder.decode(buf(), allocate, true);
            } else {
                flush = charsetDecoder.flush(allocate);
            }
            if (!flush.isUnderflow()) {
                if (flush.isOverflow()) {
                    CharBuffer allocate2 = CharBuffer.allocate(allocate.capacity() + remaining);
                    allocate.flip();
                    allocate2.put(allocate);
                    allocate = allocate2;
                } else {
                    flush.throwException();
                }
            } else {
                limit(limit);
                position(position);
                return allocate.flip().toString();
            }
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putPrefixedString(CharSequence charSequence, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        return putPrefixedString(charSequence, 2, 0, charsetEncoder);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putPrefixedString(CharSequence charSequence, int i, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        return putPrefixedString(charSequence, i, 0, charsetEncoder);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putPrefixedString(CharSequence charSequence, int i, int i2, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        return putPrefixedString(charSequence, i, i2, (byte) 0, charsetEncoder);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putPrefixedString(CharSequence charSequence, int i, int i2, byte b, CharsetEncoder charsetEncoder) throws CharacterCodingException {
        int i3;
        int i4;
        CoderResult flush;
        int i5;
        int i6 = 4;
        int i7 = 2;
        boolean z = true;
        if (i == 1) {
            i3 = 255;
        } else if (i == 2) {
            i3 = 65535;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException("prefixLength: " + i);
            }
            i3 = Integer.MAX_VALUE;
        }
        if (charSequence.length() > i3) {
            throw new IllegalArgumentException("The specified string is too long.");
        }
        if (charSequence.length() != 0) {
            if (i2 == 0 || i2 == 1) {
                i4 = 0;
            } else if (i2 == 2) {
                i4 = 1;
            } else {
                if (i2 != 4) {
                    throw new IllegalArgumentException("padding: " + i2);
                }
                i4 = 3;
            }
            CharBuffer wrap = CharBuffer.wrap(charSequence);
            skip(i);
            int position = position();
            charsetEncoder.reset();
            int i8 = 0;
            while (true) {
                if (wrap.hasRemaining()) {
                    flush = charsetEncoder.encode(wrap, buf(), z);
                } else {
                    flush = charsetEncoder.flush(buf());
                }
                if (position() - position > i3) {
                    throw new IllegalArgumentException("The specified string is too long.");
                }
                if (!flush.isUnderflow()) {
                    if (!flush.isOverflow()) {
                        i8 = 0;
                    } else if (isAutoExpand()) {
                        if (i8 == 0) {
                            i5 = i3;
                            autoExpand((int) Math.ceil(wrap.remaining() * charsetEncoder.averageBytesPerChar()));
                            i8++;
                            i3 = i5;
                            i6 = 4;
                            i7 = 2;
                            z = true;
                        } else if (i8 == z) {
                            autoExpand((int) Math.ceil(wrap.remaining() * charsetEncoder.maxBytesPerChar()));
                            i8++;
                            i6 = 4;
                            i7 = 2;
                        } else {
                            throw new RuntimeException("Expanded by " + ((int) Math.ceil(wrap.remaining() * charsetEncoder.maxBytesPerChar())) + " but that wasn't enough for '" + ((Object) charSequence) + "'");
                        }
                    }
                    i5 = i3;
                    flush.throwException();
                    i3 = i5;
                    i6 = 4;
                    i7 = 2;
                    z = true;
                } else {
                    fill(b, i2 - ((position() - position) & i4));
                    int position2 = position() - position;
                    if (i == z) {
                        put(position - (z ? 1 : 0), (byte) position2);
                        return this;
                    }
                    if (i == i7) {
                        putShort(position - i7, (short) position2);
                        return this;
                    }
                    if (i == i6) {
                        putInt(position - i6, position2);
                        return this;
                    }
                }
            }
        } else {
            if (i == 1) {
                put((byte) 0);
                return this;
            }
            if (i == 2) {
                putShort((short) 0);
                return this;
            }
            if (i == 4) {
                putInt(0);
                return this;
            }
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public Object getObject() throws ClassNotFoundException {
        return getObject(Thread.currentThread().getContextClassLoader());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public Object getObject(final ClassLoader classLoader) throws ClassNotFoundException {
        if (!prefixedDataAvailable(4)) {
            throw new BufferUnderflowException();
        }
        int i = getInt();
        if (i <= 4) {
            throw new BufferDataException("Object length should be greater than 4: " + i);
        }
        int limit = limit();
        limit(position() + i);
        try {
            try {
                return new ObjectInputStream(asInputStream()) { // from class: com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer.3
                    @Override // java.io.ObjectInputStream
                    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
                        int read = read();
                        if (read < 0) {
                            throw new EOFException();
                        }
                        if (read == 0) {
                            return super.readClassDescriptor();
                        }
                        if (read == 1) {
                            return ObjectStreamClass.lookup(Class.forName(readUTF(), true, classLoader));
                        }
                        throw new StreamCorruptedException("Unexpected class descriptor type: " + read);
                    }

                    @Override // java.io.ObjectInputStream
                    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
                        try {
                            return Class.forName(objectStreamClass.getName(), false, classLoader);
                        } catch (ClassNotFoundException unused) {
                            return super.resolveClass(objectStreamClass);
                        }
                    }
                }.readObject();
            } catch (IOException e) {
                throw new BufferDataException(e);
            }
        } finally {
            limit(limit);
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putObject(Object obj) {
        int position = position();
        skip(4);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(asOutputStream()) { // from class: com.davidehrmann.vcdiff.mina_buffer.AbstractIoBuffer.4
                @Override // java.io.ObjectOutputStream
                protected void writeClassDescriptor(ObjectStreamClass objectStreamClass) throws IOException {
                    try {
                        if (!Serializable.class.isAssignableFrom(Class.forName(objectStreamClass.getName()))) {
                            write(0);
                            super.writeClassDescriptor(objectStreamClass);
                        } else {
                            write(1);
                            writeUTF(objectStreamClass.getName());
                        }
                    } catch (ClassNotFoundException unused) {
                        write(0);
                        super.writeClassDescriptor(objectStreamClass);
                    }
                }
            };
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            int position2 = position();
            position(position);
            putInt((position2 - position) - 4);
            position(position2);
            return this;
        } catch (IOException e) {
            throw new BufferDataException(e);
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public boolean prefixedDataAvailable(int i) {
        return prefixedDataAvailable(i, Integer.MAX_VALUE);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public boolean prefixedDataAvailable(int i, int i2) {
        int unsigned;
        if (remaining() < i) {
            return false;
        }
        if (i == 1) {
            unsigned = getUnsigned(position());
        } else if (i == 2) {
            unsigned = getUnsignedShort(position());
        } else if (i == 4) {
            unsigned = getInt(position());
        } else {
            throw new IllegalArgumentException("prefixLength: " + i);
        }
        if (unsigned >= 0 && unsigned <= i2) {
            return remaining() - i >= unsigned;
        }
        throw new BufferDataException("dataLength: " + unsigned);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public int indexOf(byte b) {
        if (hasArray()) {
            int arrayOffset = arrayOffset();
            int limit = limit() + arrayOffset;
            byte[] array = array();
            for (int position = position() + arrayOffset; position < limit; position++) {
                if (array[position] == b) {
                    return position - arrayOffset;
                }
            }
            return -1;
        }
        int limit2 = limit();
        for (int position2 = position(); position2 < limit2; position2++) {
            if (get(position2) == b) {
                return position2;
            }
        }
        return -1;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer skip(int i) {
        autoExpand(i);
        return position(position() + i);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer fill(byte b, int i) {
        autoExpand(i);
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i2 > 0) {
            long j = (b << 8) | b | (b << 16) | (b << 24);
            long j2 = j | (j << 32);
            while (i2 > 0) {
                putLong(j2);
                i2--;
            }
        }
        int i4 = i3 >>> 2;
        int i5 = i & 3;
        if (i4 > 0) {
            putInt((b << 8) | b | (b << 16) | (b << 24));
        }
        int i6 = i & 1;
        if ((i5 >> 1) > 0) {
            putShort((short) ((b << 8) | b));
        }
        if (i6 > 0) {
            put(b);
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer fillAndReset(byte b, int i) {
        autoExpand(i);
        int position = position();
        try {
            fill(b, i);
            return this;
        } finally {
            position(position);
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer fill(int i) {
        autoExpand(i);
        int i2 = i & 7;
        for (int i3 = i >>> 3; i3 > 0; i3--) {
            putLong(0L);
        }
        int i4 = i2 >>> 2;
        int i5 = i & 3;
        if (i4 > 0) {
            putInt(0);
        }
        int i6 = i & 1;
        if ((i5 >> 1) > 0) {
            putShort((short) 0);
        }
        if (i6 > 0) {
            put((byte) 0);
        }
        return this;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer fillAndReset(int i) {
        autoExpand(i);
        int position = position();
        try {
            fill(i);
            return this;
        } finally {
            position(position);
        }
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> E getEnum(Class<E> cls) {
        return (E) toEnum(cls, getUnsigned());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> E getEnum(int i, Class<E> cls) {
        return (E) toEnum(cls, getUnsigned(i));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> E getEnumShort(Class<E> cls) {
        return (E) toEnum(cls, getUnsignedShort());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> E getEnumShort(int i, Class<E> cls) {
        return (E) toEnum(cls, getUnsignedShort(i));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> E getEnumInt(Class<E> cls) {
        return (E) toEnum(cls, getInt());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> E getEnumInt(int i, Class<E> cls) {
        return (E) toEnum(cls, getInt(i));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putEnum(Enum<?> r5) {
        if (r5.ordinal() > 255) {
            throw new IllegalArgumentException(enumConversionErrorMessage(r5, "byte"));
        }
        return put((byte) r5.ordinal());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putEnum(int i, Enum<?> r6) {
        if (r6.ordinal() > 255) {
            throw new IllegalArgumentException(enumConversionErrorMessage(r6, "byte"));
        }
        return put(i, (byte) r6.ordinal());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putEnumShort(Enum<?> r5) {
        if (r5.ordinal() > 65535) {
            throw new IllegalArgumentException(enumConversionErrorMessage(r5, "short"));
        }
        return putShort((short) r5.ordinal());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putEnumShort(int i, Enum<?> r6) {
        if (r6.ordinal() > 65535) {
            throw new IllegalArgumentException(enumConversionErrorMessage(r6, "short"));
        }
        return putShort(i, (short) r6.ordinal());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putEnumInt(Enum<?> r1) {
        return putInt(r1.ordinal());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public IoBuffer putEnumInt(int i, Enum<?> r2) {
        return putInt(i, r2.ordinal());
    }

    private <E> E toEnum(Class<E> cls, int i) {
        E[] enumConstants = cls.getEnumConstants();
        if (i > enumConstants.length) {
            throw new IndexOutOfBoundsException(String.format("%d is too large of an ordinal to convert to the enum %s", Integer.valueOf(i), cls.getName()));
        }
        return enumConstants[i];
    }

    private String enumConversionErrorMessage(Enum<?> r2, String str) {
        return String.format("%s.%s has an ordinal value too large for a %s", r2.getClass().getName(), r2.name(), str);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> EnumSet<E> getEnumSet(Class<E> cls) {
        return toEnumSet(cls, get() & 255);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> EnumSet<E> getEnumSet(int i, Class<E> cls) {
        return toEnumSet(cls, get(i) & 255);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> EnumSet<E> getEnumSetShort(Class<E> cls) {
        return toEnumSet(cls, getShort() & 65535);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> EnumSet<E> getEnumSetShort(int i, Class<E> cls) {
        return toEnumSet(cls, getShort(i) & 65535);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> EnumSet<E> getEnumSetInt(Class<E> cls) {
        return toEnumSet(cls, getInt() & INT_MASK);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> EnumSet<E> getEnumSetInt(int i, Class<E> cls) {
        return toEnumSet(cls, getInt(i) & INT_MASK);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> EnumSet<E> getEnumSetLong(Class<E> cls) {
        return toEnumSet(cls, getLong());
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> EnumSet<E> getEnumSetLong(int i, Class<E> cls) {
        return toEnumSet(cls, getLong(i));
    }

    private <E extends Enum<E>> EnumSet<E> toEnumSet(Class<E> cls, long j) {
        EnumSet<E> noneOf = EnumSet.noneOf(cls);
        long j2 = 1;
        for (E e : cls.getEnumConstants()) {
            if ((j2 & j) == j2) {
                noneOf.add(e);
            }
            j2 <<= 1;
        }
        return noneOf;
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> IoBuffer putEnumSet(Set<E> set) {
        long j = toLong(set);
        if (((-256) & j) != 0) {
            throw new IllegalArgumentException("The enum set is too large to fit in a byte: " + set);
        }
        return put((byte) j);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> IoBuffer putEnumSet(int i, Set<E> set) {
        long j = toLong(set);
        if (((-256) & j) != 0) {
            throw new IllegalArgumentException("The enum set is too large to fit in a byte: " + set);
        }
        return put(i, (byte) j);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> IoBuffer putEnumSetShort(Set<E> set) {
        long j = toLong(set);
        if (((-65536) & j) != 0) {
            throw new IllegalArgumentException("The enum set is too large to fit in a short: " + set);
        }
        return putShort((short) j);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> IoBuffer putEnumSetShort(int i, Set<E> set) {
        long j = toLong(set);
        if (((-65536) & j) != 0) {
            throw new IllegalArgumentException("The enum set is too large to fit in a short: " + set);
        }
        return putShort(i, (short) j);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> IoBuffer putEnumSetInt(Set<E> set) {
        long j = toLong(set);
        if (((-4294967296L) & j) != 0) {
            throw new IllegalArgumentException("The enum set is too large to fit in an int: " + set);
        }
        return putInt((int) j);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> IoBuffer putEnumSetInt(int i, Set<E> set) {
        long j = toLong(set);
        if (((-4294967296L) & j) != 0) {
            throw new IllegalArgumentException("The enum set is too large to fit in an int: " + set);
        }
        return putInt(i, (int) j);
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> IoBuffer putEnumSetLong(Set<E> set) {
        return putLong(toLong(set));
    }

    @Override // com.davidehrmann.vcdiff.mina_buffer.IoBuffer
    public <E extends Enum<E>> IoBuffer putEnumSetLong(int i, Set<E> set) {
        return putLong(i, toLong(set));
    }

    private <E extends Enum<E>> long toLong(Set<E> set) {
        long j = 0;
        for (E e : set) {
            if (e.ordinal() >= 64) {
                throw new IllegalArgumentException("The enum set is too large to fit in a bit vector: " + set);
            }
            j |= 1 << e.ordinal();
        }
        return j;
    }

    private IoBuffer autoExpand(int i) {
        if (isAutoExpand()) {
            expand(i, true);
        }
        return this;
    }

    private IoBuffer autoExpand(int i, int i2) {
        if (isAutoExpand()) {
            expand(i, i2, true);
        }
        return this;
    }

    private static void checkFieldSize(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException("fieldSize cannot be negative: " + i);
    }
}
