package com.google.crypto.tink.shaded.protobuf;

import B0.A0;
import N3.C3660k;
import com.google.crypto.tink.shaded.protobuf.AbstractC5906l;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5903i implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5903i f59377b = new g(C5919z.f59481b);

    /* renamed from: c, reason: collision with root package name */
    private static final d f59378c;

    /* renamed from: a, reason: collision with root package name */
    private int f59379a = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$a */
    /* loaded from: classes9.dex */
    static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            return Byte.valueOf(((C5902h) this).nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    /* loaded from: classes9.dex */
    private static final class b implements d {
        b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i.d
        public final byte[] copyFrom(byte[] bArr, int i11, int i12) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    /* loaded from: classes9.dex */
    private static final class c extends g {

        /* renamed from: e, reason: collision with root package name */
        private final int f59380e;

        /* renamed from: f, reason: collision with root package name */
        private final int f59381f;

        c(byte[] bArr, int i11, int i12) {
            super(bArr);
            AbstractC5903i.b(i11, i11 + i12, bArr.length);
            this.f59380e = i11;
            this.f59381f = i12;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i.g, com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        public final byte a(int i11) {
            int i12 = this.f59381f;
            if (((i12 - (i11 + 1)) | i11) >= 0) {
                return this.f59384d[this.f59380e + i11];
            }
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(Ej.b.a(i11, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.a(i11, i12, "Index > length: ", ", "));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i.g, com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        protected final void f(int i11, byte[] bArr) {
            System.arraycopy(this.f59384d, this.f59380e, bArr, 0, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i.g, com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        final byte g(int i11) {
            return this.f59384d[this.f59380e + i11];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i.g, com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        public final int size() {
            return this.f59381f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i.g
        protected final int u() {
            return this.f59380e;
        }

        Object writeReplace() {
            return new g(n());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$d */
    private interface d {
        byte[] copyFrom(byte[] bArr, int i11, int i12);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$e */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5906l f59382a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f59383b;

        e(int i11) {
            byte[] bArr = new byte[i11];
            this.f59383b = bArr;
            int i12 = AbstractC5906l.f59429d;
            this.f59382a = new AbstractC5906l.a(i11, bArr);
        }

        public final AbstractC5903i a() {
            if (this.f59382a.m() == 0) {
                return new g(this.f59383b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        }

        public final AbstractC5906l b() {
            return this.f59382a;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$f */
    static abstract class f extends AbstractC5903i {
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new C5902h(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$g */
    static class g extends f {

        /* renamed from: d, reason: collision with root package name */
        protected final byte[] f59384d;

        g(byte[] bArr) {
            bArr.getClass();
            this.f59384d = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        public byte a(int i11) {
            return this.f59384d[i11];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC5903i) || size() != ((AbstractC5903i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof g)) {
                return obj.equals(this);
            }
            g gVar = (g) obj;
            int l11 = l();
            int l12 = gVar.l();
            if (l11 != 0 && l12 != 0 && l11 != l12) {
                return false;
            }
            int size = size();
            if (size > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > gVar.size()) {
                StringBuilder f7 = P4.f.f(size, "Ran off end of other: 0, ", ", ");
                f7.append(gVar.size());
                throw new IllegalArgumentException(f7.toString());
            }
            int u11 = u() + size;
            int u12 = u();
            int u13 = gVar.u();
            while (u12 < u11) {
                if (this.f59384d[u12] != gVar.f59384d[u13]) {
                    return false;
                }
                u12++;
                u13++;
            }
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        protected void f(int i11, byte[] bArr) {
            System.arraycopy(this.f59384d, 0, bArr, 0, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        byte g(int i11) {
            return this.f59384d[i11];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        public final AbstractC5904j h() {
            return AbstractC5904j.f(this.f59384d, u(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        protected final int i(int i11, int i12) {
            int u11 = u();
            byte[] bArr = C5919z.f59481b;
            for (int i13 = u11; i13 < u11 + i12; i13++) {
                i11 = (i11 * 31) + this.f59384d[i13];
            }
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        public final AbstractC5903i m(int i11) {
            int b11 = AbstractC5903i.b(0, i11, size());
            if (b11 == 0) {
                return AbstractC5903i.f59377b;
            }
            return new c(this.f59384d, u(), b11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        final void s(AbstractC5901g abstractC5901g) throws IOException {
            abstractC5901g.a(this.f59384d, u(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i
        public int size() {
            return this.f59384d.length;
        }

        protected int u() {
            return 0;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$h */
    private static final class h implements d {
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5903i.d
        public final byte[] copyFrom(byte[] bArr, int i11, int i12) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            return bArr2;
        }
    }

    static {
        f59378c = C5898d.b() ? new h() : new b();
    }

    AbstractC5903i() {
    }

    static int b(int i11, int i12, int i13) {
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

    public static AbstractC5903i e(int i11, int i12, byte[] bArr) {
        b(i11, i11 + i12, bArr.length);
        return new g(f59378c.copyFrom(bArr, i11, i12));
    }

    public abstract byte a(int i11);

    public abstract boolean equals(Object obj);

    protected abstract void f(int i11, byte[] bArr);

    abstract byte g(int i11);

    public abstract AbstractC5904j h();

    public final int hashCode() {
        int i11 = this.f59379a;
        if (i11 == 0) {
            int size = size();
            i11 = i(size, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.f59379a = i11;
        }
        return i11;
    }

    protected abstract int i(int i11, int i12);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C5902h(this);
    }

    protected final int l() {
        return this.f59379a;
    }

    public abstract AbstractC5903i m(int i11);

    public final byte[] n() {
        int size = size();
        if (size == 0) {
            return C5919z.f59481b;
        }
        byte[] bArr = new byte[size];
        f(size, bArr);
        return bArr;
    }

    abstract void s(AbstractC5901g abstractC5901g) throws IOException;

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return C.o0.c(C3660k.c(size(), "<ByteString@", hexString, " size=", " contents=\""), size() <= 50 ? k0.a(this) : C.o0.c(new StringBuilder(), k0.a(m(47)), "..."), "\">");
    }
}
