package com.google.crypto.tink.shaded.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3476h implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC3476h f37290b = new j(AbstractC3493z.EMPTY_BYTE_ARRAY);

    /* renamed from: c, reason: collision with root package name */
    public static final f f37291c;

    /* renamed from: d, reason: collision with root package name */
    public static final Comparator f37292d;

    /* renamed from: a, reason: collision with root package name */
    public int f37293a = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    public class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public int f37294a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f37295b;

        public a() {
            this.f37295b = AbstractC3476h.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37294a < this.f37295b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h.g
        public byte nextByte() {
            int i10 = this.f37294a;
            if (i10 >= this.f37295b) {
                throw new NoSuchElementException();
            }
            this.f37294a = i10 + 1;
            return AbstractC3476h.this.j(i10);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3476h abstractC3476h, AbstractC3476h abstractC3476h2) {
            g l10 = abstractC3476h.l();
            g l11 = abstractC3476h2.l();
            while (l10.hasNext() && l11.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC3476h.s(l10.nextByte())).compareTo(Integer.valueOf(AbstractC3476h.s(l11.nextByte())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC3476h.size()).compareTo(Integer.valueOf(abstractC3476h2.size()));
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    public static final class d implements f {
        public d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final int f37297e;

        /* renamed from: f, reason: collision with root package name */
        public final int f37298f;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC3476h.e(i10, i10 + i11, bArr.length);
            this.f37297e = i10;
            this.f37298f = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h.j
        public int B() {
            return this.f37297e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h.j, com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public byte b(int i10) {
            AbstractC3476h.c(i10, size());
            return this.bytes[this.f37297e + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h.j, com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public void i(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.bytes, B() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h.j, com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public byte j(int i10) {
            return this.bytes[this.f37297e + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h.j, com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public int size() {
            return this.f37298f;
        }

        public Object writeReplace() {
            return AbstractC3476h.x(r());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    public interface f {
        byte[] copyFrom(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    public interface g extends Iterator {
        byte nextByte();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    public static final class C0521h {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC3479k f37299a;
        private final byte[] buffer;

        public /* synthetic */ C0521h(int i10, a aVar) {
            this(i10);
        }

        public AbstractC3476h a() {
            this.f37299a.c();
            return new j(this.buffer);
        }

        public AbstractC3479k b() {
            return this.f37299a;
        }

        public C0521h(int i10) {
            byte[] bArr = new byte[i10];
            this.buffer = bArr;
            this.f37299a = AbstractC3479k.U(bArr);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    public static abstract class i extends AbstractC3476h {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.l();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    public static class j extends i {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public j(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        public final boolean A(AbstractC3476h abstractC3476h, int i10, int i11) {
            if (i11 > abstractC3476h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC3476h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC3476h.size());
            }
            if (!(abstractC3476h instanceof j)) {
                return abstractC3476h.q(i10, i12).equals(q(0, i11));
            }
            j jVar = (j) abstractC3476h;
            byte[] bArr = this.bytes;
            byte[] bArr2 = jVar.bytes;
            int B10 = B() + i11;
            int B11 = B();
            int B12 = jVar.B() + i10;
            while (B11 < B10) {
                if (bArr[B11] != bArr2[B12]) {
                    return false;
                }
                B11++;
                B12++;
            }
            return true;
        }

        public int B() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public byte b(int i10) {
            return this.bytes[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC3476h) || size() != ((AbstractC3476h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int p10 = p();
            int p11 = jVar.p();
            if (p10 == 0 || p11 == 0 || p10 == p11) {
                return A(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public void i(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.bytes, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public byte j(int i10) {
            return this.bytes[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public final boolean k() {
            int B10 = B();
            return p0.n(this.bytes, B10, size() + B10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public final AbstractC3477i n() {
            return AbstractC3477i.j(this.bytes, B(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public final int o(int i10, int i11, int i12) {
            return AbstractC3493z.h(i10, this.bytes, B() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public final AbstractC3476h q(int i10, int i11) {
            int e10 = AbstractC3476h.e(i10, i11, size());
            return e10 == 0 ? AbstractC3476h.f37290b : new e(this.bytes, B() + i10, e10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public final String u(Charset charset) {
            return new String(this.bytes, B(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h
        public final void z(AbstractC3475g abstractC3475g) {
            abstractC3475g.a(this.bytes, B(), size());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    public static final class k implements f {
        public k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3476h.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f37291c = AbstractC3472d.c() ? new k(aVar) : new d(aVar);
        f37292d = new b();
    }

    public static void c(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public static int e(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC3476h f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static AbstractC3476h g(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        return new j(f37291c.copyFrom(bArr, i10, i11));
    }

    public static AbstractC3476h h(String str) {
        return new j(str.getBytes(AbstractC3493z.f37488b));
    }

    public static C0521h m(int i10) {
        return new C0521h(i10, null);
    }

    public static int s(byte b10) {
        return b10 & UByte.MAX_VALUE;
    }

    public static AbstractC3476h x(byte[] bArr) {
        return new j(bArr);
    }

    public static AbstractC3476h y(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f37293a;
        if (i10 == 0) {
            int size = size();
            i10 = o(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f37293a = i10;
        }
        return i10;
    }

    public abstract void i(byte[] bArr, int i10, int i11, int i12);

    public abstract byte j(int i10);

    public abstract boolean k();

    public g l() {
        return new a();
    }

    public abstract AbstractC3477i n();

    public abstract int o(int i10, int i11, int i12);

    public final int p() {
        return this.f37293a;
    }

    public abstract AbstractC3476h q(int i10, int i11);

    public final byte[] r() {
        int size = size();
        if (size == 0) {
            return AbstractC3493z.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public abstract int size();

    public final String t(Charset charset) {
        return size() == 0 ? "" : u(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), w());
    }

    public abstract String u(Charset charset);

    public final String v() {
        return t(AbstractC3493z.f37488b);
    }

    public final String w() {
        if (size() <= 50) {
            return i0.a(this);
        }
        return i0.a(q(0, 47)) + "...";
    }

    public abstract void z(AbstractC3475g abstractC3475g);
}
