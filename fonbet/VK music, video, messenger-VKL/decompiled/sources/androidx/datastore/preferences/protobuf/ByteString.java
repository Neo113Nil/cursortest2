package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
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
import xsna.bu00;
import xsna.efz;
import xsna.i5s;
import xsna.ji;
import xsna.lhg;
import xsna.o12;
import xsna.tgw;
import xsna.xy6;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final g b = new g(p.b);
    public static final d c;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* loaded from: classes12.dex */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            androidx.datastore.preferences.protobuf.e eVar = (androidx.datastore.preferences.protobuf.e) this;
            int i = eVar.b;
            if (i >= eVar.c) {
                throw new NoSuchElementException();
            }
            eVar.b = i + 1;
            return Byte.valueOf(eVar.d.g(i));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes12.dex */
    public static final class b implements d {
        @Override // androidx.datastore.preferences.protobuf.ByteString.d
        public final byte[] a(int i, int i2, byte[] bArr) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* loaded from: classes12.dex */
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

        @Override // androidx.datastore.preferences.protobuf.ByteString.g, androidx.datastore.preferences.protobuf.ByteString
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

        @Override // androidx.datastore.preferences.protobuf.ByteString.g, androidx.datastore.preferences.protobuf.ByteString
        public final void f(int i, byte[] bArr) {
            System.arraycopy(this.bytes, this.bytesOffset, bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.g, androidx.datastore.preferences.protobuf.ByteString
        public final byte g(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.g
        public final int l() {
            return this.bytesOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.g, androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            byte[] bArr;
            int size = size();
            if (size == 0) {
                bArr = p.b;
            } else {
                byte[] bArr2 = new byte[size];
                f(size, bArr2);
                bArr = bArr2;
            }
            return new g(bArr);
        }
    }

    public interface d {
        byte[] a(int i, int i2, byte[] bArr);
    }

    /* loaded from: classes12.dex */
    public static final class e {
        public final CodedOutputStream.b a;
        public final byte[] b;

        public e(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            Logger logger = CodedOutputStream.d;
            this.a = new CodedOutputStream.b(bArr, i);
        }

        public final g a() {
            CodedOutputStream.b bVar = this.a;
            if (bVar.g - bVar.h == 0) {
                return new g(this.b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        }

        public final CodedOutputStream.b b() {
            return this.a;
        }
    }

    public static abstract class f extends ByteString {
        private static final long serialVersionUID = 1;

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new androidx.datastore.preferences.protobuf.e(this);
        }
    }

    public static class g extends f {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public g(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte c(int i) {
            return this.bytes[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
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
            int i = i();
            int i2 = gVar.i();
            if (i != 0 && i2 != 0 && i != i2) {
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
            int l = l() + size;
            int l2 = l();
            int l3 = gVar.l();
            while (l2 < l) {
                if (bArr[l2] != bArr2[l3]) {
                    return false;
                }
                l2++;
                l3++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void f(int i, byte[] bArr) {
            System.arraycopy(this.bytes, 0, bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte g(int i) {
            return this.bytes[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int h(int i, int i2) {
            byte[] bArr = this.bytes;
            int l = l();
            Charset charset = p.a;
            for (int i3 = l; i3 < l + i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final g j(int i) {
            int d = ByteString.d(0, i, size());
            return d == 0 ? ByteString.b : new c(this.bytes, l(), d);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void k(CodedOutputStream codedOutputStream) throws IOException {
            codedOutputStream.g(this.bytes, l(), size());
        }

        public int l() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }
    }

    public static final class h implements d {
        @Override // androidx.datastore.preferences.protobuf.ByteString.d
        public final byte[] a(int i, int i2, byte[] bArr) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        c = o12.a() ? new h() : new b();
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

    public abstract int h(int i, int i2);

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = h(size, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public final int i() {
        return this.hash;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public abstract g j(int i);

    public abstract void k(CodedOutputStream codedOutputStream) throws IOException;

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = bu00.i(this);
        } else {
            str = bu00.i(j(47)) + "...";
        }
        return i5s.a(xy6.b(size, "<ByteString@", hexString, " size=", " contents=\""), str, "\">");
    }
}
