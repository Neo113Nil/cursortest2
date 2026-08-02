package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque<ByteString> f60151a = new ArrayDeque<>();

        a() {
        }

        static ByteString a(a aVar, ByteString byteString, ByteString byteString2) {
            aVar.b(byteString);
            aVar.b(byteString2);
            ArrayDeque<ByteString> arrayDeque = aVar.f60151a;
            ByteString pop = arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                pop = new RopeByteString(arrayDeque.pop(), pop);
            }
            return pop;
        }

        private void b(ByteString byteString) {
            if (!byteString.isBalanced()) {
                if (!(byteString instanceof RopeByteString)) {
                    throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
                }
                RopeByteString ropeByteString = (RopeByteString) byteString;
                b(ropeByteString.left);
                b(ropeByteString.right);
                return;
            }
            int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, byteString.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int minLength = RopeByteString.minLength(binarySearch + 1);
            ArrayDeque<ByteString> arrayDeque = this.f60151a;
            if (arrayDeque.isEmpty() || arrayDeque.peek().size() >= minLength) {
                arrayDeque.push(byteString);
                return;
            }
            int minLength2 = RopeByteString.minLength(binarySearch);
            ByteString pop = arrayDeque.pop();
            while (true) {
                if (arrayDeque.isEmpty() || arrayDeque.peek().size() >= minLength2) {
                    break;
                } else {
                    pop = new RopeByteString(arrayDeque.pop(), pop);
                }
            }
            RopeByteString ropeByteString2 = new RopeByteString(pop, byteString);
            while (!arrayDeque.isEmpty()) {
                int binarySearch2 = Arrays.binarySearch(RopeByteString.minLengthByDepth, ropeByteString2.size());
                if (binarySearch2 < 0) {
                    binarySearch2 = (-(binarySearch2 + 1)) - 1;
                }
                if (arrayDeque.peek().size() >= RopeByteString.minLength(binarySearch2 + 1)) {
                    break;
                } else {
                    ropeByteString2 = new RopeByteString(arrayDeque.pop(), ropeByteString2);
                }
            }
            arrayDeque.push(ropeByteString2);
        }
    }

    private static final class b implements Iterator<ByteString.LeafByteString> {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque<RopeByteString> f60152a;

        /* renamed from: b, reason: collision with root package name */
        private ByteString.LeafByteString f60153b;

        b(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.f60152a = null;
                this.f60153b = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.getTreeDepth());
            this.f60152a = arrayDeque;
            arrayDeque.push(ropeByteString);
            ByteString byteString2 = ropeByteString.left;
            while (byteString2 instanceof RopeByteString) {
                RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                this.f60152a.push(ropeByteString2);
                byteString2 = ropeByteString2.left;
            }
            this.f60153b = (ByteString.LeafByteString) byteString2;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString;
            ByteString.LeafByteString leafByteString2 = this.f60153b;
            if (leafByteString2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f60152a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    leafByteString = null;
                    break;
                }
                ByteString byteString = arrayDeque.pop().right;
                while (byteString instanceof RopeByteString) {
                    RopeByteString ropeByteString = (RopeByteString) byteString;
                    arrayDeque.push(ropeByteString);
                    byteString = ropeByteString.left;
                }
                leafByteString = (ByteString.LeafByteString) byteString;
            } while (leafByteString.isEmpty());
            this.f60153b = leafByteString;
            return leafByteString2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f60153b != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString2.size() + byteString.size();
        if (size < 128) {
            return concatenateBytes(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (byteString2.size() + ropeByteString.right.size() < 128) {
                return new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        return size >= minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1) ? new RopeByteString(byteString, byteString2) : a.a(new a(), byteString, byteString2);
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean equalsFragments(ByteString byteString) {
        b bVar = new b(this);
        ByteString.LeafByteString next = bVar.next();
        b bVar2 = new b(byteString);
        ByteString.LeafByteString next2 = bVar2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = next.size() - i11;
            int size2 = next2.size() - i12;
            int min = Math.min(size, size2);
            if (!(i11 == 0 ? next.equalsRange(next2, i12, min) : next2.equalsRange(next, i11, min))) {
                return false;
            }
            i13 += min;
            int i14 = this.totalLength;
            if (i13 >= i14) {
                if (i13 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i11 = 0;
                next = bVar.next();
            } else {
                i11 += min;
                next = next;
            }
            if (min == size2) {
                next2 = bVar2.next();
                i12 = 0;
            } else {
                i12 += min;
            }
        }
    }

    static int minLength(int i11) {
        int[] iArr = minLengthByDepth;
        if (i11 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i11];
    }

    static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        b bVar = new b(this);
        while (bVar.hasNext()) {
            arrayList.add(bVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i11) {
        ByteString.checkIndex(i11, this.totalLength);
        return internalByteAt(i11);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i11, int i12, int i13) {
        int i14 = i11 + i13;
        int i15 = this.leftLength;
        if (i14 <= i15) {
            this.left.copyToInternal(bArr, i11, i12, i13);
        } else {
            if (i11 >= i15) {
                this.right.copyToInternal(bArr, i11 - i15, i12, i13);
                return;
            }
            int i16 = i15 - i11;
            this.left.copyToInternal(bArr, i11, i12, i16);
            this.right.copyToInternal(bArr, 0, i12 + i16, i13 - i16);
        }
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
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
            return equalsFragments(byteString);
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    byte internalByteAt(int i11) {
        int i12 = this.leftLength;
        return i11 < i12 ? this.left.internalByteAt(i11) : this.right.internalByteAt(i11 - i12);
    }

    @Override // com.google.protobuf.ByteString
    protected boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new c();
    }

    @Override // com.google.protobuf.ByteString
    protected int partialHash(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.leftLength;
        if (i14 <= i15) {
            return this.left.partialHash(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.right.partialHash(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.right.partialHash(this.left.partialHash(i11, i12, i16), 0, i13 - i16);
    }

    @Override // com.google.protobuf.ByteString
    protected int partialIsValidUtf8(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.leftLength;
        if (i14 <= i15) {
            return this.left.partialIsValidUtf8(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.right.partialIsValidUtf8(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i11, i12, i16), 0, i13 - i16);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i11, int i12) {
        int checkRange = ByteString.checkRange(i11, i12, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i13 = this.leftLength;
        return i12 <= i13 ? this.left.substring(i11, i12) : i11 >= i13 ? this.right.substring(i11 - i13, i12 - i13) : new RopeByteString(this.left.substring(i11), this.right.substring(0, i12 - this.leftLength));
    }

    @Override // com.google.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    void writeToInternal(OutputStream outputStream, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        int i14 = this.leftLength;
        if (i13 <= i14) {
            this.left.writeToInternal(outputStream, i11, i12);
        } else {
            if (i11 >= i14) {
                this.right.writeToInternal(outputStream, i11 - i14, i12);
                return;
            }
            int i15 = i14 - i11;
            this.left.writeToInternal(outputStream, i11, i15);
            this.right.writeToInternal(outputStream, 0, i12 - i15);
        }
    }

    @Override // com.google.protobuf.ByteString
    void writeToReverse(AbstractC5953d abstractC5953d) throws IOException {
        this.right.writeToReverse(abstractC5953d);
        this.left.writeToReverse(abstractC5953d);
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = byteString2.size() + size;
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new ByteString.AbstractByteIterator() { // from class: com.google.protobuf.RopeByteString.1
            ByteString.c current = nextPiece();
            final b pieces;

            {
                this.pieces = new b(RopeByteString.this);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$c] */
            private ByteString.c nextPiece() {
                if (this.pieces.hasNext()) {
                    return this.pieces.next().iterator2();
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.current != null;
            }

            @Override // com.google.protobuf.ByteString.AbstractByteIterator, com.google.protobuf.ByteString.c
            public byte nextByte() {
                ByteString.c cVar = this.current;
                if (cVar == null) {
                    throw new NoSuchElementException();
                }
                byte nextByte = cVar.nextByte();
                if (!this.current.hasNext()) {
                    this.current = nextPiece();
                }
                return nextByte;
            }
        };
    }

    @Override // com.google.protobuf.ByteString
    void writeTo(AbstractC5953d abstractC5953d) throws IOException {
        this.left.writeTo(abstractC5953d);
        this.right.writeTo(abstractC5953d);
    }

    private class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private b f60154a;

        /* renamed from: b, reason: collision with root package name */
        private ByteString.LeafByteString f60155b;

        /* renamed from: c, reason: collision with root package name */
        private int f60156c;

        /* renamed from: d, reason: collision with root package name */
        private int f60157d;

        /* renamed from: e, reason: collision with root package name */
        private int f60158e;

        /* renamed from: f, reason: collision with root package name */
        private int f60159f;

        public c() {
            b bVar = new b(RopeByteString.this);
            this.f60154a = bVar;
            ByteString.LeafByteString next = bVar.next();
            this.f60155b = next;
            this.f60156c = next.size();
            this.f60157d = 0;
            this.f60158e = 0;
        }

        private void c() {
            if (this.f60155b != null) {
                int i11 = this.f60157d;
                int i12 = this.f60156c;
                if (i11 == i12) {
                    this.f60158e += i12;
                    this.f60157d = 0;
                    if (!this.f60154a.hasNext()) {
                        this.f60155b = null;
                        this.f60156c = 0;
                    } else {
                        ByteString.LeafByteString next = this.f60154a.next();
                        this.f60155b = next;
                        this.f60156c = next.size();
                    }
                }
            }
        }

        private int d(int i11, int i12, byte[] bArr) {
            int i13 = i12;
            while (i13 > 0) {
                c();
                if (this.f60155b == null) {
                    break;
                }
                int min = Math.min(this.f60156c - this.f60157d, i13);
                if (bArr != null) {
                    this.f60155b.copyTo(bArr, this.f60157d, i11, min);
                    i11 += min;
                }
                this.f60157d += min;
                i13 -= min;
            }
            return i12 - i13;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return RopeByteString.this.size() - (this.f60158e + this.f60157d);
        }

        @Override // java.io.InputStream
        public final void mark(int i11) {
            this.f60159f = this.f60158e + this.f60157d;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i11, int i12) {
            bArr.getClass();
            if (i11 < 0 || i12 < 0 || i12 > bArr.length - i11) {
                throw new IndexOutOfBoundsException();
            }
            int d11 = d(i11, i12, bArr);
            if (d11 != 0) {
                return d11;
            }
            if (i12 <= 0) {
                if (RopeByteString.this.size() - (this.f60158e + this.f60157d) != 0) {
                    return d11;
                }
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            b bVar = new b(RopeByteString.this);
            this.f60154a = bVar;
            ByteString.LeafByteString next = bVar.next();
            this.f60155b = next;
            this.f60156c = next.size();
            this.f60157d = 0;
            this.f60158e = 0;
            d(0, this.f60159f, null);
        }

        @Override // java.io.InputStream
        public final long skip(long j11) {
            if (j11 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j11 > 2147483647L) {
                j11 = 2147483647L;
            }
            return d(0, (int) j11, null);
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            c();
            ByteString.LeafByteString leafByteString = this.f60155b;
            if (leafByteString == null) {
                return -1;
            }
            int i11 = this.f60157d;
            this.f60157d = i11 + 1;
            return leafByteString.byteAt(i11) & 255;
        }
    }
}
