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

/* compiled from: RopeByteString.java */
/* loaded from: classes13.dex */
public final class u extends ByteString {
    public static final int[] b = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* compiled from: RopeByteString.java */
    public class a extends ByteString.c {
        public final c b;
        public ByteString.ByteIterator c = a();

        public a(u uVar) {
            this.b = new c(uVar);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.google.protobuf.ByteString$ByteIterator] */
        public final ByteString.ByteIterator a() {
            c cVar = this.b;
            if (cVar.hasNext()) {
                return cVar.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c != null;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            ByteString.ByteIterator byteIterator = this.c;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte nextByte = byteIterator.nextByte();
            if (!this.c.hasNext()) {
                this.c = a();
            }
            return nextByte;
        }
    }

    /* compiled from: RopeByteString.java */
    public static class b {
        public final ArrayDeque<ByteString> a = new ArrayDeque<>();

        public final void a(ByteString byteString) {
            if (!byteString.isBalanced()) {
                if (!(byteString instanceof u)) {
                    throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
                }
                u uVar = (u) byteString;
                a(uVar.left);
                a(uVar.right);
                return;
            }
            int binarySearch = Arrays.binarySearch(u.b, byteString.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int d = u.d(binarySearch + 1);
            ArrayDeque<ByteString> arrayDeque = this.a;
            if (arrayDeque.isEmpty() || arrayDeque.peek().size() >= d) {
                arrayDeque.push(byteString);
                return;
            }
            int d2 = u.d(binarySearch);
            ByteString pop = arrayDeque.pop();
            while (!arrayDeque.isEmpty() && arrayDeque.peek().size() < d2) {
                pop = new u(arrayDeque.pop(), pop);
            }
            u uVar2 = new u(pop, byteString);
            while (!arrayDeque.isEmpty()) {
                int binarySearch2 = Arrays.binarySearch(u.b, uVar2.size());
                if (binarySearch2 < 0) {
                    binarySearch2 = (-(binarySearch2 + 1)) - 1;
                }
                if (arrayDeque.peek().size() >= u.d(binarySearch2 + 1)) {
                    break;
                } else {
                    uVar2 = new u(arrayDeque.pop(), uVar2);
                }
            }
            arrayDeque.push(uVar2);
        }
    }

    /* compiled from: RopeByteString.java */
    public static final class c implements Iterator<ByteString.g> {
        public final ArrayDeque<u> b;
        public ByteString.g c;

        public c(ByteString byteString) {
            if (!(byteString instanceof u)) {
                this.b = null;
                this.c = (ByteString.g) byteString;
                return;
            }
            u uVar = (u) byteString;
            ArrayDeque<u> arrayDeque = new ArrayDeque<>(uVar.getTreeDepth());
            this.b = arrayDeque;
            arrayDeque.push(uVar);
            ByteString byteString2 = uVar.left;
            while (byteString2 instanceof u) {
                u uVar2 = (u) byteString2;
                this.b.push(uVar2);
                byteString2 = uVar2.left;
            }
            this.c = (ByteString.g) byteString2;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteString.g next() {
            ByteString.g gVar;
            ByteString.g gVar2 = this.c;
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque<u> arrayDeque = this.b;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    gVar = null;
                    break;
                }
                ByteString byteString = arrayDeque.pop().right;
                while (byteString instanceof u) {
                    u uVar = (u) byteString;
                    arrayDeque.push(uVar);
                    byteString = uVar.left;
                }
                gVar = (ByteString.g) byteString;
            } while (gVar.isEmpty());
            this.c = gVar;
            return gVar2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public u(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = byteString2.size() + size;
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static ByteString c(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString2.size() + byteString.size();
        if (size < 128) {
            int size2 = byteString.size();
            int size3 = byteString2.size();
            byte[] bArr = new byte[size2 + size3];
            byteString.copyTo(bArr, 0, 0, size2);
            byteString2.copyTo(bArr, 0, size2, size3);
            return ByteString.wrap(bArr);
        }
        if (byteString instanceof u) {
            u uVar = (u) byteString;
            if (byteString2.size() + uVar.right.size() < 128) {
                ByteString byteString3 = uVar.right;
                int size4 = byteString3.size();
                int size5 = byteString2.size();
                byte[] bArr2 = new byte[size4 + size5];
                byteString3.copyTo(bArr2, 0, 0, size4);
                byteString2.copyTo(bArr2, 0, size4, size5);
                return new u(uVar.left, ByteString.wrap(bArr2));
            }
            if (uVar.left.getTreeDepth() > uVar.right.getTreeDepth() && uVar.treeDepth > byteString2.getTreeDepth()) {
                return new u(uVar.left, new u(uVar.right, byteString2));
            }
        }
        if (size >= d(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new u(byteString, byteString2);
        }
        b bVar = new b();
        bVar.a(byteString);
        bVar.a(byteString2);
        ArrayDeque<ByteString> arrayDeque = bVar.a;
        ByteString pop = arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            pop = new u(arrayDeque.pop(), pop);
        }
        return pop;
    }

    public static int d(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return b[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        ByteString.g gVar;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(getTreeDepth());
        arrayDeque.push(this);
        ByteString byteString = this.left;
        while (byteString instanceof u) {
            u uVar = (u) byteString;
            arrayDeque.push(uVar);
            byteString = uVar.left;
        }
        ByteString.g gVar2 = (ByteString.g) byteString;
        while (true) {
            if (!(gVar2 != null)) {
                return arrayList;
            }
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    gVar = null;
                    break;
                }
                ByteString byteString2 = ((u) arrayDeque.pop()).right;
                while (byteString2 instanceof u) {
                    u uVar2 = (u) byteString2;
                    arrayDeque.push(uVar2);
                    byteString2 = uVar2.left;
                }
                gVar = (ByteString.g) byteString2;
                if (!gVar.isEmpty()) {
                    break;
                }
            }
            arrayList.add(gVar2.asReadOnlyByteBuffer());
            gVar2 = gVar;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (this.totalLength == byteString.size()) {
                if (this.totalLength == 0) {
                    return true;
                }
                int peekCachedHashCode = peekCachedHashCode();
                int peekCachedHashCode2 = byteString.peekCachedHashCode();
                if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                    c cVar = new c(this);
                    ByteString.g next = cVar.next();
                    c cVar2 = new c(byteString);
                    ByteString.g next2 = cVar2.next();
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        int size = next.size() - i;
                        int size2 = next2.size() - i2;
                        int min = Math.min(size, size2);
                        if (!(i == 0 ? next.a(next2, i2, min) : next2.a(next, i, min))) {
                            break;
                        }
                        i3 += min;
                        int i4 = this.totalLength;
                        if (i3 >= i4) {
                            if (i3 == i4) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (min == size) {
                            next = cVar.next();
                            i = 0;
                        } else {
                            i += min;
                        }
                        if (min == size2) {
                            next2 = cVar2.next();
                            i2 = 0;
                        } else {
                            i2 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        int i2 = this.leftLength;
        return i < i2 ? this.left.internalByteAt(i) : this.right.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return this.totalLength >= d(this.treeDepth);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new a(this);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new d();
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int checkRange = ByteString.checkRange(i, i2, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        return i2 <= i3 ? this.left.substring(i, i2) : i >= i3 ? this.right.substring(i - i3, i2 - i3) : new u(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(ByteOutput byteOutput) throws IOException {
        this.right.writeToReverse(byteOutput);
        this.left.writeToReverse(byteOutput);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new a(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        this.left.writeTo(byteOutput);
        this.right.writeTo(byteOutput);
    }

    /* compiled from: RopeByteString.java */
    public class d extends InputStream {
        public c b;
        public ByteString.g c;
        public int d;
        public int e;
        public int f;
        public int g;

        public d() {
            c cVar = new c(u.this);
            this.b = cVar;
            ByteString.g next = cVar.next();
            this.c = next;
            this.d = next.size();
            this.e = 0;
            this.f = 0;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return u.this.size() - (this.f + this.e);
        }

        public final void m() {
            if (this.c != null) {
                int i = this.e;
                int i2 = this.d;
                if (i == i2) {
                    this.f += i2;
                    this.e = 0;
                    if (!this.b.hasNext()) {
                        this.c = null;
                        this.d = 0;
                    } else {
                        ByteString.g next = this.b.next();
                        this.c = next;
                        this.d = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            this.g = this.f + this.e;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        public final int n(int i, int i2, byte[] bArr) {
            int i3 = i2;
            while (i3 > 0) {
                m();
                if (this.c == null) {
                    break;
                }
                int min = Math.min(this.d - this.e, i3);
                if (bArr != null) {
                    this.c.copyTo(bArr, this.e, i, min);
                    i += min;
                }
                this.e += min;
                i3 -= min;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int n = n(i, i2, bArr);
            if (n != 0) {
                return n;
            }
            if (i2 <= 0) {
                if (u.this.size() - (this.f + this.e) != 0) {
                    return n;
                }
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            c cVar = new c(u.this);
            this.b = cVar;
            ByteString.g next = cVar.next();
            this.c = next;
            this.d = next.size();
            this.e = 0;
            this.f = 0;
            n(0, this.g, null);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return n(0, (int) j, null);
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            m();
            ByteString.g gVar = this.c;
            if (gVar == null) {
                return -1;
            }
            int i = this.e;
            this.e = i + 1;
            return gVar.byteAt(i) & 255;
        }
    }
}
