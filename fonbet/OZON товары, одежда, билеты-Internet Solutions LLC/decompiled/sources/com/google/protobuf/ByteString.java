package com.google.protobuf;

import Am.C2438a;
import B0.A0;
import C.o0;
import N3.C3660k;
import g.C6594f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(Internal.f60126b);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final b byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* loaded from: classes9.dex */
    static abstract class AbstractByteIterator implements c {
        AbstractByteIterator() {
        }

        @Override // com.google.protobuf.ByteString.c
        public abstract /* synthetic */ byte nextByte();

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* loaded from: classes9.dex */
    private static final class ArraysByteArrayCopier implements b {
        private ArraysByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.b
        public byte[] copyFrom(byte[] bArr, int i11, int i12) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }
    }

    /* loaded from: classes9.dex */
    private static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bArr, int i11, int i12) {
            super(bArr);
            ByteString.checkRange(i11, i11 + i12, bArr.length);
            this.bytesOffset = i11;
            this.bytesLength = i12;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public byte byteAt(int i11) {
            ByteString.checkIndex(i11, size());
            return this.bytes[this.bytesOffset + i11];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i11, bArr, i12, i13);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        protected int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        byte internalByteAt(int i11) {
            return this.bytes[this.bytesOffset + i11];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        abstract boolean equalsRange(ByteString byteString, int i11, int i12);

        @Override // com.google.protobuf.ByteString
        protected final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        protected final boolean isBalanced() {
            return true;
        }

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // com.google.protobuf.ByteString
        void writeToReverse(AbstractC5953d abstractC5953d) throws IOException {
            writeTo(abstractC5953d);
        }

        private LeafByteString() {
        }
    }

    private static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        LiteralByteString(byte[] bArr) {
            super();
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int i11) {
            return this.bytes[i11];
        }

        @Override // com.google.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.bytes, i11, bArr, i12, i13);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int peekCachedHashCode = peekCachedHashCode();
            int peekCachedHashCode2 = literalByteString.peekCachedHashCode();
            if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                return equalsRange(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        final boolean equalsRange(ByteString byteString, int i11, int i12) {
            if (i12 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i12 + size());
            }
            int i13 = i11 + i12;
            if (i13 > byteString.size()) {
                StringBuilder a11 = C2438a.a("Ran off end of other: ", i11, ", ", ", ", i12);
                a11.append(byteString.size());
                throw new IllegalArgumentException(a11.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.substring(i11, i13).equals(substring(0, i12));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + i12;
            int offsetIntoBytes2 = getOffsetIntoBytes();
            int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + i11;
            while (offsetIntoBytes2 < offsetIntoBytes) {
                if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                    return false;
                }
                offsetIntoBytes2++;
                offsetIntoBytes3++;
            }
            return true;
        }

        protected int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        byte internalByteAt(int i11) {
            return this.bytes[i11];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.o(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
            return CodedInputStream.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        protected final int partialHash(int i11, int i12, int i13) {
            byte[] bArr = this.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + i12;
            byte[] bArr2 = Internal.f60126b;
            for (int i14 = offsetIntoBytes; i14 < offsetIntoBytes + i13; i14++) {
                i11 = (i11 * 31) + bArr[i14];
            }
            return i11;
        }

        @Override // com.google.protobuf.ByteString
        protected final int partialIsValidUtf8(int i11, int i12, int i13) {
            int offsetIntoBytes = getOffsetIntoBytes() + i12;
            return Utf8.q(i11, this.bytes, offsetIntoBytes, i13 + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString substring(int i11, int i12) {
            int checkRange = ByteString.checkRange(i11, i12, size());
            return checkRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, getOffsetIntoBytes() + i11, checkRange);
        }

        @Override // com.google.protobuf.ByteString
        protected final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.ByteString
        final void writeToInternal(OutputStream outputStream, int i11, int i12) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i11, i12);
        }

        @Override // com.google.protobuf.ByteString
        final void writeTo(AbstractC5953d abstractC5953d) throws IOException {
            abstractC5953d.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    /* loaded from: classes9.dex */
    private static final class NioByteString extends LeafByteString {
        private final ByteBuffer buffer;

        NioByteString(ByteBuffer byteBuffer) {
            super();
            Internal.a(byteBuffer, "buffer");
            this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private ByteBuffer slice(int i11, int i12) {
            if (i11 < this.buffer.position() || i12 > this.buffer.limit() || i11 > i12) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            ByteBuffer slice = this.buffer.slice();
            slice.position(i11 - this.buffer.position());
            slice.limit(i12 - this.buffer.position());
            return slice;
        }

        private Object writeReplace() {
            return ByteString.copyFrom(this.buffer.slice());
        }

        @Override // com.google.protobuf.ByteString
        public ByteBuffer asReadOnlyByteBuffer() {
            return this.buffer.asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int i11) {
            try {
                return this.buffer.get(i11);
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw e11;
            } catch (IndexOutOfBoundsException e12) {
                throw new ArrayIndexOutOfBoundsException(e12.getMessage());
            }
        }

        @Override // com.google.protobuf.ByteString
        public void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.buffer.slice());
        }

        @Override // com.google.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i11, int i12, int i13) {
            ByteBuffer slice = this.buffer.slice();
            slice.position(i11);
            slice.get(bArr, i12, i13);
        }

        @Override // com.google.protobuf.ByteString
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            if (size() != byteString.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            return obj instanceof NioByteString ? this.buffer.equals(((NioByteString) obj).buffer) : obj instanceof RopeByteString ? obj.equals(this) : this.buffer.equals(byteString.asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        boolean equalsRange(ByteString byteString, int i11, int i12) {
            return substring(0, i12).equals(byteString.substring(i11, i12 + i11));
        }

        @Override // com.google.protobuf.ByteString
        public byte internalByteAt(int i11) {
            return byteAt(i11);
        }

        @Override // com.google.protobuf.ByteString
        public boolean isValidUtf8() {
            return Utf8.m(this.buffer);
        }

        @Override // com.google.protobuf.ByteString
        public CodedInputStream newCodedInput() {
            return CodedInputStream.newInstance(this.buffer, true);
        }

        @Override // com.google.protobuf.ByteString
        public InputStream newInput() {
            return new a(this);
        }

        @Override // com.google.protobuf.ByteString
        protected int partialHash(int i11, int i12, int i13) {
            for (int i14 = i12; i14 < i12 + i13; i14++) {
                i11 = (i11 * 31) + this.buffer.get(i14);
            }
            return i11;
        }

        @Override // com.google.protobuf.ByteString
        protected int partialIsValidUtf8(int i11, int i12, int i13) {
            return Utf8.p(i11, this.buffer, i12, i13 + i12);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.buffer.remaining();
        }

        @Override // com.google.protobuf.ByteString
        public ByteString substring(int i11, int i12) {
            try {
                return new NioByteString(slice(i11, i12));
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw e11;
            } catch (IndexOutOfBoundsException e12) {
                throw new ArrayIndexOutOfBoundsException(e12.getMessage());
            }
        }

        @Override // com.google.protobuf.ByteString
        protected String toStringInternal(Charset charset) {
            byte[] byteArray;
            int length;
            int i11;
            if (this.buffer.hasArray()) {
                byteArray = this.buffer.array();
                i11 = this.buffer.position() + this.buffer.arrayOffset();
                length = this.buffer.remaining();
            } else {
                byteArray = toByteArray();
                length = byteArray.length;
                i11 = 0;
            }
            return new String(byteArray, i11, length, charset);
        }

        @Override // com.google.protobuf.ByteString
        public void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.ByteString
        void writeToInternal(OutputStream outputStream, int i11, int i12) throws IOException {
            if (!this.buffer.hasArray()) {
                C5952c.a(slice(i11, i12 + i11), outputStream);
                return;
            }
            outputStream.write(this.buffer.array(), this.buffer.position() + this.buffer.arrayOffset() + i11, i12);
        }

        final class a extends InputStream {

            /* renamed from: a, reason: collision with root package name */
            private final ByteBuffer f60094a;

            a(NioByteString nioByteString) {
                this.f60094a = nioByteString.buffer.slice();
            }

            @Override // java.io.InputStream
            public final int available() throws IOException {
                return this.f60094a.remaining();
            }

            @Override // java.io.InputStream
            public final void mark(int i11) {
                this.f60094a.mark();
            }

            @Override // java.io.InputStream
            public final boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public final int read() throws IOException {
                ByteBuffer byteBuffer = this.f60094a;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public final void reset() throws IOException {
                try {
                    this.f60094a.reset();
                } catch (InvalidMarkException e11) {
                    throw new IOException(e11);
                }
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i11, int i12) throws IOException {
                ByteBuffer byteBuffer = this.f60094a;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i12, byteBuffer.remaining());
                byteBuffer.get(bArr, i11, min);
                return min;
            }
        }

        @Override // com.google.protobuf.ByteString
        void writeTo(AbstractC5953d abstractC5953d) throws IOException {
            abstractC5953d.writeLazy(this.buffer.slice());
        }
    }

    private static final class SystemByteArrayCopier implements b {
        private SystemByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.b
        public byte[] copyFrom(byte[] bArr, int i11, int i12) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            return bArr2;
        }
    }

    final class a implements Comparator<ByteString> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.ByteString$c, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.protobuf.ByteString$c, java.util.Iterator] */
        @Override // java.util.Comparator
        public final int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ?? iterator2 = byteString3.iterator2();
            ?? iterator22 = byteString4.iterator2();
            while (iterator2.hasNext() && iterator22.hasNext()) {
                int compare = Integer.compare(ByteString.toInt(iterator2.nextByte()), ByteString.toInt(iterator22.nextByte()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString3.size(), byteString4.size());
        }
    }

    private interface b {
        byte[] copyFrom(byte[] bArr, int i11, int i12);
    }

    /* loaded from: classes9.dex */
    public interface c extends Iterator<Byte> {
        byte nextByte();
    }

    /* loaded from: classes9.dex */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f60095a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f60096b;

        d(int i11) {
            byte[] bArr = new byte[i11];
            this.f60096b = bArr;
            this.f60095a = CodedOutputStream.newInstance(bArr);
        }

        public final ByteString a() {
            this.f60095a.checkNoSpaceLeft();
            return new LiteralByteString(this.f60096b);
        }

        public final CodedOutputStream b() {
            return this.f60095a;
        }
    }

    static {
        int i11 = C5950a.f60193b;
        byteArrayCopier = new SystemByteArrayCopier();
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new a();
    }

    ByteString() {
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i11) {
        if (i11 < 1) {
            throw new IllegalArgumentException(T7.E.a(i11, "length (", ") must be >= 1"));
        }
        if (i11 == 1) {
            return it.next();
        }
        int i12 = i11 >>> 1;
        return balancedConcat(it, i12).concat(balancedConcat(it, i11 - i12));
    }

    static void checkIndex(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 >= 0) {
                throw new ArrayIndexOutOfBoundsException(A0.a(i11, i12, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(Ej.b.a(i11, "Index < 0: "));
        }
    }

    static int checkRange(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(T7.E.a(i11, "Beginning index: ", " < 0"));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(A0.a(i11, i12, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(A0.a(i12, i13, "End index: ", " >= "));
    }

    public static ByteString copyFrom(byte[] bArr, int i11, int i12) {
        checkRange(i11, i11 + i12, bArr.length);
        return new LiteralByteString(byteArrayCopier.copyFrom(bArr, i11, i12));
    }

    public static ByteString copyFromUtf8(String str) {
        return new LiteralByteString(str.getBytes(Internal.f60125a));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i11) {
        int hexDigit = hexDigit(str.charAt(i11));
        if (hexDigit != -1) {
            return hexDigit;
        }
        StringBuilder b11 = C6594f.b("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        b11.append(str.charAt(i11));
        b11.append(" at index ");
        b11.append(i11);
        throw new NumberFormatException(b11.toString());
    }

    public static ByteString fromHex(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder b11 = C6594f.b("Invalid hexString ", str, " of length ");
            b11.append(str.length());
            b11.append(" must be even.");
            throw new NumberFormatException(b11.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (extractHexDigit(str, i12 + 1) | (extractHexDigit(str, i12) << 4));
        }
        return new LiteralByteString(bArr);
    }

    private static int hexDigit(char c11) {
        if (c11 >= '0' && c11 <= '9') {
            return c11 - '0';
        }
        if (c11 >= 'A' && c11 <= 'F') {
            return c11 - '7';
        }
        if (c11 < 'a' || c11 > 'f') {
            return -1;
        }
        return c11 - 'W';
    }

    static d newCodedBuilder(int i11) {
        return new d(i11);
    }

    public static e newOutput(int i11) {
        return new e(i11);
    }

    static ByteString nioByteString(ByteBuffer byteBuffer) {
        return new NioByteString(byteBuffer);
    }

    private static ByteString readChunk(InputStream inputStream, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int read = inputStream.read(bArr, i12, i11 - i12);
            if (read == -1) {
                break;
            }
            i12 += read;
        }
        if (i12 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i12);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, MAX_READ_FROM_CHUNK_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b11) {
        return b11 & 255;
    }

    private String truncateAndEscapeForDisplay() {
        return size() <= 50 ? TextFormatEscaper.a(this) : o0.c(new StringBuilder(), TextFormatEscaper.a(substring(0, 47)), "...");
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i11);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.concatenate(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i11) {
        copyTo(bArr, 0, i11, size());
    }

    protected abstract void copyToInternal(byte[] bArr, int i11, int i12, int i13);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    protected abstract int getTreeDepth();

    public final int hashCode() {
        int i11 = this.hash;
        if (i11 == 0) {
            int size = size();
            i11 = partialHash(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.hash = i11;
        }
        return i11;
    }

    abstract byte internalByteAt(int i11);

    protected abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    protected abstract int partialHash(int i11, int i12, int i13);

    protected abstract int partialIsValidUtf8(int i11, int i12, int i13);

    protected final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i11) {
        return substring(i11, size());
    }

    public abstract ByteString substring(int i11, int i12);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.f60126b;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e11) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e11);
            throw unsupportedEncodingException;
        }
    }

    protected abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(Internal.f60125a);
    }

    abstract void writeTo(AbstractC5953d abstractC5953d) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    final void writeTo(OutputStream outputStream, int i11, int i12) throws IOException {
        checkRange(i11, i11 + i12, size());
        if (i12 > 0) {
            writeToInternal(outputStream, i11, i12);
        }
    }

    abstract void writeToInternal(OutputStream outputStream, int i11, int i12) throws IOException;

    abstract void writeToReverse(AbstractC5953d abstractC5953d) throws IOException;

    public static e newOutput() {
        return new e(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i11) throws IOException {
        return readFrom(inputStream, i11, i11);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i11, int i12, int i13) {
        checkRange(i11, i11 + i13, size());
        checkRange(i12, i12 + i13, bArr.length);
        if (i13 > 0) {
            copyToInternal(bArr, i11, i12, i13);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new AbstractByteIterator() { // from class: com.google.protobuf.ByteString.1
            private final int limit;
            private int position = 0;

            {
                this.limit = ByteString.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.position < this.limit;
            }

            @Override // com.google.protobuf.ByteString.AbstractByteIterator, com.google.protobuf.ByteString.c
            public byte nextByte() {
                int i11 = this.position;
                if (i11 >= this.limit) {
                    throw new NoSuchElementException();
                }
                this.position = i11 + 1;
                return ByteString.this.internalByteAt(i11);
            }
        };
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i11, int i12) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString readChunk = readChunk(inputStream, i11);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            i11 = Math.min(i11 * 2, i12);
        }
    }

    /* loaded from: classes9.dex */
    public static final class e extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final int f60097a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<ByteString> f60098b;

        /* renamed from: c, reason: collision with root package name */
        private int f60099c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f60100d;

        /* renamed from: e, reason: collision with root package name */
        private int f60101e;

        e(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f60097a = i11;
            this.f60098b = new ArrayList<>();
            this.f60100d = new byte[i11];
        }

        private void c(int i11) {
            this.f60098b.add(new LiteralByteString(this.f60100d));
            int length = this.f60099c + this.f60100d.length;
            this.f60099c = length;
            this.f60100d = new byte[Math.max(this.f60097a, Math.max(i11, length >>> 1))];
            this.f60101e = 0;
        }

        public final String toString() {
            int i11;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i11 = this.f60099c + this.f60101e;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i11));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i11) {
            try {
                if (this.f60101e == this.f60100d.length) {
                    c(1);
                }
                byte[] bArr = this.f60100d;
                int i12 = this.f60101e;
                this.f60101e = i12 + 1;
                bArr[i12] = (byte) i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i11, int i12) {
            try {
                byte[] bArr2 = this.f60100d;
                int length = bArr2.length;
                int i13 = this.f60101e;
                if (i12 <= length - i13) {
                    System.arraycopy(bArr, i11, bArr2, i13, i12);
                    this.f60101e += i12;
                } else {
                    int length2 = bArr2.length - i13;
                    System.arraycopy(bArr, i11, bArr2, i13, length2);
                    int i14 = i12 - length2;
                    c(i14);
                    System.arraycopy(bArr, i11 + length2, this.f60100d, 0, i14);
                    this.f60101e = i14;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i11) {
        checkRange(0, i11, byteBuffer.remaining());
        byte[] bArr = new byte[i11];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    static ByteString wrap(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    static ByteString wrap(byte[] bArr, int i11, int i12) {
        return new BoundedByteString(bArr, i11, i12);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        return o0.c(C3660k.c(size, "<ByteString@", hexString, " size=", " contents=\""), truncateAndEscapeForDisplay(), "\">");
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
