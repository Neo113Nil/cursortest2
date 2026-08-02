package com.google.protobuf;

import com.google.protobuf.T;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: f, reason: collision with root package name */
    private static final O f60144f = new O(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f60145a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f60146b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f60147c;

    /* renamed from: d, reason: collision with root package name */
    private int f60148d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f60149e;

    private O() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i11) {
        int[] iArr = this.f60146b;
        if (i11 > iArr.length) {
            int i12 = this.f60145a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f60146b = Arrays.copyOf(iArr, i11);
            this.f60147c = Arrays.copyOf(this.f60147c, i11);
        }
    }

    public static O c() {
        return f60144f;
    }

    static O i(O o11, O o12) {
        int i11 = o11.f60145a + o12.f60145a;
        int[] copyOf = Arrays.copyOf(o11.f60146b, i11);
        System.arraycopy(o12.f60146b, 0, copyOf, o11.f60145a, o12.f60145a);
        Object[] copyOf2 = Arrays.copyOf(o11.f60147c, i11);
        System.arraycopy(o12.f60147c, 0, copyOf2, o11.f60145a, o12.f60145a);
        return new O(i11, copyOf, copyOf2, true);
    }

    static O j() {
        return new O();
    }

    private static void n(int i11, Object obj, T t2) throws IOException {
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            t2.writeInt64(i12, ((Long) obj).longValue());
            return;
        }
        if (i13 == 1) {
            t2.writeFixed64(i12, ((Long) obj).longValue());
            return;
        }
        if (i13 == 2) {
            t2.writeBytes(i12, (ByteString) obj);
            return;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            t2.writeFixed32(i12, ((Integer) obj).intValue());
        } else if (t2.fieldOrder() == T.a.ASCENDING) {
            t2.writeStartGroup(i12);
            ((O) obj).o(t2);
            t2.writeEndGroup(i12);
        } else {
            t2.writeEndGroup(i12);
            ((O) obj).o(t2);
            t2.writeStartGroup(i12);
        }
    }

    final void a() {
        if (!this.f60149e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int d() {
        int computeUInt64Size;
        int i11 = this.f60148d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f60145a; i13++) {
            int i14 = this.f60146b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                computeUInt64Size = CodedOutputStream.computeUInt64Size(i15, ((Long) this.f60147c[i13]).longValue());
            } else if (i16 == 1) {
                computeUInt64Size = CodedOutputStream.computeFixed64Size(i15, ((Long) this.f60147c[i13]).longValue());
            } else if (i16 == 2) {
                computeUInt64Size = CodedOutputStream.computeBytesSize(i15, (ByteString) this.f60147c[i13]);
            } else if (i16 == 3) {
                i12 = ((O) this.f60147c[i13]).d() + (CodedOutputStream.computeTagSize(i15) * 2) + i12;
            } else {
                if (i16 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                computeUInt64Size = CodedOutputStream.computeFixed32Size(i15, ((Integer) this.f60147c[i13]).intValue());
            }
            i12 = computeUInt64Size + i12;
        }
        this.f60148d = i12;
        return i12;
    }

    public final int e() {
        int i11 = this.f60148d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f60145a; i13++) {
            i12 += CodedOutputStream.computeRawMessageSetExtensionSize(this.f60146b[i13] >>> 3, (ByteString) this.f60147c[i13]);
        }
        this.f60148d = i12;
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O)) {
            return false;
        }
        O o11 = (O) obj;
        int i11 = this.f60145a;
        if (i11 == o11.f60145a) {
            int[] iArr = this.f60146b;
            int[] iArr2 = o11.f60146b;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    Object[] objArr = this.f60147c;
                    Object[] objArr2 = o11.f60147c;
                    int i13 = this.f60145a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (objArr[i14].equals(objArr2[i14])) {
                        }
                    }
                    return true;
                }
                if (iArr[i12] != iArr2[i12]) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f60149e) {
            this.f60149e = false;
        }
    }

    final boolean g(int i11, CodedInputStream codedInputStream) throws IOException {
        int readTag;
        a();
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            l(i11, Long.valueOf(codedInputStream.readInt64()));
            return true;
        }
        if (i13 == 1) {
            l(i11, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        if (i13 == 2) {
            l(i11, codedInputStream.readBytes());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                codedInputStream.checkValidEndTag();
                return false;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            l(i11, Integer.valueOf(codedInputStream.readFixed32()));
            return true;
        }
        O o11 = new O();
        do {
            readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
        } while (o11.g(readTag, codedInputStream));
        codedInputStream.checkLastTagWas((i12 << 3) | 4);
        l(i11, o11);
        return true;
    }

    final void h(O o11) {
        if (o11.equals(f60144f)) {
            return;
        }
        a();
        int i11 = this.f60145a + o11.f60145a;
        b(i11);
        System.arraycopy(o11.f60146b, 0, this.f60146b, this.f60145a, o11.f60145a);
        System.arraycopy(o11.f60147c, 0, this.f60147c, this.f60145a, o11.f60145a);
        this.f60145a = i11;
    }

    public final int hashCode() {
        int i11 = this.f60145a;
        int i12 = (527 + i11) * 31;
        int[] iArr = this.f60146b;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i12 + i14) * 31;
        Object[] objArr = this.f60147c;
        int i17 = this.f60145a;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    final void k(int i11, StringBuilder sb2) {
        for (int i12 = 0; i12 < this.f60145a; i12++) {
            B.b(sb2, i11, String.valueOf(this.f60146b[i12] >>> 3), this.f60147c[i12]);
        }
    }

    final void l(int i11, Object obj) {
        a();
        b(this.f60145a + 1);
        int[] iArr = this.f60146b;
        int i12 = this.f60145a;
        iArr[i12] = i11;
        this.f60147c[i12] = obj;
        this.f60145a = i12 + 1;
    }

    final void m(T t2) throws IOException {
        if (t2.fieldOrder() == T.a.DESCENDING) {
            for (int i11 = this.f60145a - 1; i11 >= 0; i11--) {
                t2.writeMessageSetItem(this.f60146b[i11] >>> 3, this.f60147c[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.f60145a; i12++) {
            t2.writeMessageSetItem(this.f60146b[i12] >>> 3, this.f60147c[i12]);
        }
    }

    public final void o(T t2) throws IOException {
        if (this.f60145a == 0) {
            return;
        }
        if (t2.fieldOrder() == T.a.ASCENDING) {
            for (int i11 = 0; i11 < this.f60145a; i11++) {
                n(this.f60146b[i11], this.f60147c[i11], t2);
            }
            return;
        }
        for (int i12 = this.f60145a - 1; i12 >= 0; i12--) {
            n(this.f60146b[i12], this.f60147c[i12], t2);
        }
    }

    private O(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f60148d = -1;
        this.f60145a = i11;
        this.f60146b = iArr;
        this.f60147c = objArr;
        this.f60149e = z11;
    }
}
