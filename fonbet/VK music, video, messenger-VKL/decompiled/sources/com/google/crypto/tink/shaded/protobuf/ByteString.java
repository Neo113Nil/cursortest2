package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.g;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import xsna.d02;
import xsna.efz;
import xsna.i5s;
import xsna.ji;
import xsna.lhg;
import xsna.m12;
import xsna.tgw;
import xsna.xy6;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final g b = new g(q.b);
    public static final d c;
    private int hash = 0;

    /* loaded from: classes13.dex */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            com.google.crypto.tink.shaded.protobuf.f fVar = (com.google.crypto.tink.shaded.protobuf.f) this;
            int i = fVar.b;
            if (i >= fVar.c) {
                throw new NoSuchElementException();
            }
            fVar.b = i + 1;
            return Byte.valueOf(fVar.d.g(i));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes13.dex */
    public static final class b implements d {
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.d
        public final byte[] a(int i, int i2, byte[] bArr) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* loaded from: classes13.dex */
    public static final class c extends g {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public c(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.d(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.g, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte c(int i) {
            int i2 = this.bytesLength;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.bytes[this.bytesOffset + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(lhg.a(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(efz.a(i, i2, "Index > length: ", ", "));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.g, com.google.crypto.tink.shaded.protobuf.ByteString
        public final void f(int i, byte[] bArr) {
            System.arraycopy(this.bytes, this.bytesOffset, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.g, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte g(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.g
        public final int p() {
            return this.bytesOffset;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.g, com.google.crypto.tink.shaded.protobuf.ByteString
        public final int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return new g(m());
        }
    }

    public interface d {
        byte[] a(int i, int i2, byte[] bArr);
    }

    /* loaded from: classes13.dex */
    public static final class e {
        public final CodedOutputStream.a a;
        public final byte[] b;

        public e(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            Logger logger = CodedOutputStream.b;
            this.a = new CodedOutputStream.a(bArr, i);
        }

        public final g a() {
            if (this.a.J() == 0) {
                return new g(this.b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        }

        public final CodedOutputStream.a b() {
            return this.a;
        }
    }

    public static abstract class f extends ByteString {
    }

    public static class g extends f {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public g(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte c(int i) {
            return this.bytes[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
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
            if (!(obj instanceof g)) {
                return obj.equals(this);
            }
            g gVar = (g) obj;
            int k = k();
            int k2 = gVar.k();
            if (k != 0 && k2 != 0 && k != k2) {
                return false;
            }
            int size = size();
            if (size > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > gVar.size()) {
                StringBuilder b = ji.b(size, "Ran off end of other: 0, ", ", ");
                b.append(gVar.size());
                throw new IllegalArgumentException(b.toString());
            }
            byte[] bArr = this.bytes;
            byte[] bArr2 = gVar.bytes;
            int p = p() + size;
            int p2 = p();
            int p3 = gVar.p();
            while (p2 < p) {
                if (bArr[p2] != bArr2[p3]) {
                    return false;
                }
                p2++;
                p3++;
            }
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void f(int i, byte[] bArr) {
            System.arraycopy(this.bytes, 0, bArr, 0, i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte g(int i) {
            return this.bytes[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean h() {
            int p = p();
            byte[] bArr = this.bytes;
            return h0.a.c(p, size() + p, bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final g.a i() {
            byte[] bArr = this.bytes;
            int p = p();
            int size = size();
            g.a aVar = new g.a(bArr, p, size, true);
            try {
                aVar.g(size);
                return aVar;
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalArgumentException(e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int j(int i, int i2) {
            byte[] bArr = this.bytes;
            int p = p();
            Charset charset = q.a;
            for (int i3 = p; i3 < p + i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            return i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final g l(int i) {
            int d = ByteString.d(0, i, size());
            return d == 0 ? ByteString.b : new c(this.bytes, p(), d);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final String n(Charset charset) {
            return new String(this.bytes, p(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void o(CodedOutputStream.a aVar) throws IOException {
            aVar.K(this.bytes, p(), size());
        }

        public int p() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }
    }

    public static final class h implements d {
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.d
        public final byte[] a(int i, int i2, byte[] bArr) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        c = m12.a() ? new h() : new b();
    }

    public static int d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(tgw.b(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(efz.a(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(efz.a(i2, i3, "End index: ", " >= "));
    }

    public static g e(int i, int i2, byte[] bArr) {
        d(i, i + i2, bArr.length);
        return new g(c.a(i, i2, bArr));
    }

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public abstract void f(int i, byte[] bArr);

    public abstract byte g(int i);

    public abstract boolean h();

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = j(size, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public abstract g.a i();

    @Override // java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new com.google.crypto.tink.shaded.protobuf.f(this);
    }

    public abstract int j(int i, int i2);

    public final int k() {
        return this.hash;
    }

    public abstract g l(int i);

    public final byte[] m() {
        int size = size();
        if (size == 0) {
            return q.b;
        }
        byte[] bArr = new byte[size];
        f(size, bArr);
        return bArr;
    }

    public abstract String n(Charset charset);

    public abstract void o(CodedOutputStream.a aVar) throws IOException;

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = d02.s(this);
        } else {
            str = d02.s(l(47)) + "...";
        }
        return i5s.a(xy6.b(size, "<ByteString@", hexString, " size=", " contents=\""), str, "\">");
    }
}
