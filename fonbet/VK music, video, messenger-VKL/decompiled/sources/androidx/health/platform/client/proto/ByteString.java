package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.CodedOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import xsna.efz;
import xsna.fto0;
import xsna.i5s;
import xsna.ji;
import xsna.l12;
import xsna.lhg;
import xsna.tgw;
import xsna.xy6;

/* loaded from: classes12.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final f b = new f(b0.b);
    public static final d c;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            androidx.health.platform.client.proto.f fVar = (androidx.health.platform.client.proto.f) this;
            int i = fVar.b;
            if (i >= fVar.c) {
                throw new NoSuchElementException();
            }
            fVar.b = i + 1;
            return Byte.valueOf(fVar.d.f(i));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements d {
        @Override // androidx.health.platform.client.proto.ByteString.d
        public final byte[] a(int i, int i2, byte[] bArr) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public static final class c extends f {
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

        @Override // androidx.health.platform.client.proto.ByteString.f, androidx.health.platform.client.proto.ByteString
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

        @Override // androidx.health.platform.client.proto.ByteString.f, androidx.health.platform.client.proto.ByteString
        public final byte f(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // androidx.health.platform.client.proto.ByteString.f
        public final int k() {
            return this.bytesOffset;
        }

        @Override // androidx.health.platform.client.proto.ByteString.f, androidx.health.platform.client.proto.ByteString
        public final int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            byte[] bArr;
            int i = this.bytesLength;
            if (i == 0) {
                bArr = b0.b;
            } else {
                byte[] bArr2 = new byte[i];
                System.arraycopy(this.bytes, this.bytesOffset, bArr2, 0, i);
                bArr = bArr2;
            }
            return new f(bArr);
        }
    }

    public interface d {
        byte[] a(int i, int i2, byte[] bArr);
    }

    public static abstract class e extends ByteString {
        private static final long serialVersionUID = 1;

        @Override // androidx.health.platform.client.proto.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new androidx.health.platform.client.proto.f(this);
        }
    }

    public static class f extends e {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public f(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public byte c(int i) {
            return this.bytes[i];
        }

        @Override // androidx.health.platform.client.proto.ByteString
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
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int h = h();
            int h2 = fVar.h();
            if (h != 0 && h2 != 0 && h != h2) {
                return false;
            }
            int size = size();
            if (size > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > fVar.size()) {
                StringBuilder b = ji.b(size, "Ran off end of other: 0, ", ", ");
                b.append(fVar.size());
                throw new IllegalArgumentException(b.toString());
            }
            byte[] bArr = this.bytes;
            byte[] bArr2 = fVar.bytes;
            int k = k() + size;
            int k2 = k();
            int k3 = fVar.k();
            while (k2 < k) {
                if (bArr[k2] != bArr2[k3]) {
                    return false;
                }
                k2++;
                k3++;
            }
            return true;
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public byte f(int i) {
            return this.bytes[i];
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final int g(int i, int i2) {
            byte[] bArr = this.bytes;
            int k = k();
            Charset charset = b0.a;
            for (int i3 = k; i3 < k + i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            return i;
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final f i(int i) {
            int d = ByteString.d(0, i, size());
            return d == 0 ? ByteString.b : new c(this.bytes, k(), d);
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public final void j(CodedOutputStream.a aVar) throws IOException {
            aVar.Y(this.bytes, k(), size());
        }

        public int k() {
            return 0;
        }

        @Override // androidx.health.platform.client.proto.ByteString
        public int size() {
            return this.bytes.length;
        }
    }

    public static final class g implements d {
        @Override // androidx.health.platform.client.proto.ByteString.d
        public final byte[] a(int i, int i2, byte[] bArr) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        c = l12.a() ? new g() : new b();
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

    public static f e(int i, int i2, byte[] bArr) {
        d(i, i + i2, bArr.length);
        return new f(c.a(i, i2, bArr));
    }

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i);

    public abstract int g(int i, int i2);

    public final int h() {
        return this.hash;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = g(size, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public abstract f i(int i);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new androidx.health.platform.client.proto.f(this);
    }

    public abstract void j(CodedOutputStream.a aVar) throws IOException;

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = fto0.j(this);
        } else {
            str = fto0.j(i(47)) + "...";
        }
        return i5s.a(xy6.b(size, "<ByteString@", hexString, " size=", " contents=\""), str, "\">");
    }
}
