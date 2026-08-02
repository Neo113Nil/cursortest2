package com.google.protobuf;

import defpackage.v6g;
import defpackage.w6g;
import defpackage.yhk;
import defpackage.zzl;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h2 extends ByteString {
    public static final int[] f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int a;
    public final ByteString b;
    public final ByteString c;
    public final int d;
    public final int e;

    public h2(ByteString byteString, ByteString byteString2) {
        this.b = byteString;
        this.c = byteString2;
        int size = byteString.size();
        this.d = size;
        this.a = byteString2.size() + size;
        this.e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static int c(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return f[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.e);
        arrayDeque.push(this);
        ByteString byteString = this.b;
        while (byteString instanceof h2) {
            h2 h2Var = (h2) byteString;
            arrayDeque.push(h2Var);
            byteString = h2Var.b;
        }
        l lVar = (l) byteString;
        while (true) {
            if (!(lVar != null)) {
                return arrayList;
            }
            l lVar2 = null;
            if (lVar == null) {
                yhk.d();
                return null;
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    break;
                }
                ByteString byteString2 = ((h2) arrayDeque.pop()).c;
                while (byteString2 instanceof h2) {
                    h2 h2Var2 = (h2) byteString2;
                    arrayDeque.push(h2Var2);
                    byteString2 = h2Var2.b;
                }
                l lVar3 = (l) byteString2;
                if (!lVar3.isEmpty()) {
                    lVar2 = lVar3;
                    break;
                }
            }
            arrayList.add(lVar.asReadOnlyByteBuffer());
            lVar = lVar2;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.a);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.b.copyTo(byteBuffer);
        this.c.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.b;
        int i5 = this.d;
        if (i4 <= i5) {
            byteString.copyToInternal(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.c;
        if (i >= i5) {
            byteString2.copyToInternal(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.copyToInternal(bArr, i, i2, i6);
        byteString2.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.a;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                int peekCachedHashCode = peekCachedHashCode();
                int peekCachedHashCode2 = byteString.peekCachedHashCode();
                if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                    v6g v6gVar = new v6g(this);
                    l a = v6gVar.a();
                    v6g v6gVar2 = new v6g(byteString);
                    l a2 = v6gVar2.a();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int size2 = a.size() - i2;
                        int size3 = a2.size() - i3;
                        int min = Math.min(size2, size3);
                        if (!(i2 == 0 ? a.a(a2, i3, min) : a2.a(a, i2, min))) {
                            break;
                        }
                        i4 += min;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            zzl.s();
                            return false;
                        }
                        if (min == size2) {
                            a = v6gVar.a();
                            i2 = 0;
                        } else {
                            i2 += min;
                        }
                        if (min == size3) {
                            a2 = v6gVar2.a();
                            i3 = 0;
                        } else {
                            i3 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return this.e;
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        int i2 = this.d;
        return i < i2 ? this.b.internalByteAt(i) : this.c.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return this.a >= c(this.e);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int partialIsValidUtf8 = this.b.partialIsValidUtf8(0, 0, this.d);
        ByteString byteString = this.c;
        return byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new g2(this);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new w6g(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.b;
        int i5 = this.d;
        if (i4 <= i5) {
            return byteString.partialHash(i, i2, i3);
        }
        ByteString byteString2 = this.c;
        if (i2 >= i5) {
            return byteString2.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialHash(byteString.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.b;
        int i5 = this.d;
        if (i4 <= i5) {
            return byteString.partialIsValidUtf8(i, i2, i3);
        }
        ByteString byteString2 = this.c;
        if (i2 >= i5) {
            return byteString2.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.a;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int i3 = this.a;
        int checkRange = ByteString.checkRange(i, i2, i3);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == i3) {
            return this;
        }
        ByteString byteString = this.b;
        int i4 = this.d;
        if (i2 <= i4) {
            return byteString.substring(i, i2);
        }
        ByteString byteString2 = this.c;
        return i >= i4 ? byteString2.substring(i - i4, i2 - i4) : new h2(byteString.substring(i), byteString2.substring(0, i2 - i4));
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        this.b.writeTo(outputStream);
        this.c.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        ByteString byteString = this.b;
        int i4 = this.d;
        if (i3 <= i4) {
            byteString.writeToInternal(outputStream, i, i2);
            return;
        }
        ByteString byteString2 = this.c;
        if (i >= i4) {
            byteString2.writeToInternal(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        byteString.writeToInternal(outputStream, i, i5);
        byteString2.writeToInternal(outputStream, 0, i2 - i5);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(ByteOutput byteOutput) {
        this.c.writeToReverse(byteOutput);
        this.b.writeToReverse(byteOutput);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new g2(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) {
        this.b.writeTo(byteOutput);
        this.c.writeTo(byteOutput);
    }
}
