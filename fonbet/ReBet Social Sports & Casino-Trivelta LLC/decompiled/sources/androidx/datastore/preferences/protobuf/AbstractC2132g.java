package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2132g implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2132g f19474b = new i(AbstractC2149y.EMPTY_BYTE_ARRAY);

    /* renamed from: c, reason: collision with root package name */
    public static final f f19475c;

    /* renamed from: d, reason: collision with root package name */
    public static final Comparator f19476d;
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public int f19477a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    public class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public int f19478a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f19479b;

        public a() {
            this.f19479b = AbstractC2132g.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19478a < this.f19479b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g.InterfaceC0372g
        public byte nextByte() {
            int i10 = this.f19478a;
            if (i10 >= this.f19479b) {
                throw new NoSuchElementException();
            }
            this.f19478a = i10 + 1;
            return AbstractC2132g.this.j(i10);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2132g abstractC2132g, AbstractC2132g abstractC2132g2) {
            InterfaceC0372g k10 = abstractC2132g.k();
            InterfaceC0372g k11 = abstractC2132g2.k();
            while (k10.hasNext() && k11.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC2132g.p(k10.nextByte())).compareTo(Integer.valueOf(AbstractC2132g.p(k11.nextByte())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC2132g.size()).compareTo(Integer.valueOf(abstractC2132g2.size()));
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    public static abstract class c implements InterfaceC0372g {
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

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
    public static final class d implements f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    public static final class e extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: e, reason: collision with root package name */
        public final int f19481e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19482f;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC2132g.e(i10, i10 + i11, bArr.length);
            this.f19481e = i10;
            this.f19482f = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g.i, androidx.datastore.preferences.protobuf.AbstractC2132g
        public byte b(int i10) {
            AbstractC2132g.c(i10, size());
            return this.bytes[this.f19481e + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g.i, androidx.datastore.preferences.protobuf.AbstractC2132g
        public void i(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.bytes, v() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g.i, androidx.datastore.preferences.protobuf.AbstractC2132g
        public byte j(int i10) {
            return this.bytes[this.f19481e + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g.i, androidx.datastore.preferences.protobuf.AbstractC2132g
        public int size() {
            return this.f19482f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g.i
        public int v() {
            return this.f19481e;
        }

        public Object writeReplace() {
            return AbstractC2132g.r(o());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    public interface f {
        byte[] copyFrom(byte[] bArr, int i10, int i11);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0372g extends Iterator {
        byte nextByte();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    public static abstract class h extends AbstractC2132g {
        private static final long serialVersionUID = 1;

        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.k();
        }

        public h() {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    public static class i extends h {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g
        public byte b(int i10) {
            return this.bytes[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2132g) || size() != ((AbstractC2132g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int m10 = m();
            int m11 = iVar.m();
            if (m10 == 0 || m11 == 0 || m10 == m11) {
                return u(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g
        public void i(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.bytes, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g
        public byte j(int i10) {
            return this.bytes[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g
        public final int l(int i10, int i11, int i12) {
            return AbstractC2149y.g(i10, this.bytes, v() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g
        public final AbstractC2132g n(int i10, int i11) {
            int e10 = AbstractC2132g.e(i10, i11, size());
            return e10 == 0 ? AbstractC2132g.f19474b : new e(this.bytes, v() + i10, e10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g
        public int size() {
            return this.bytes.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g
        public final void t(AbstractC2131f abstractC2131f) {
            abstractC2131f.a(this.bytes, v(), size());
        }

        public final boolean u(AbstractC2132g abstractC2132g, int i10, int i11) {
            if (i11 > abstractC2132g.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC2132g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC2132g.size());
            }
            if (!(abstractC2132g instanceof i)) {
                return abstractC2132g.n(i10, i12).equals(n(0, i11));
            }
            i iVar = (i) abstractC2132g;
            byte[] bArr = this.bytes;
            byte[] bArr2 = iVar.bytes;
            int v10 = v() + i11;
            int v11 = v();
            int v12 = iVar.v() + i10;
            while (v11 < v10) {
                if (bArr[v11] != bArr2[v12]) {
                    return false;
                }
                v11++;
                v12++;
            }
            return true;
        }

        public int v() {
            return 0;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    public static final class j implements f {
        public j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2132g.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f19475c = AbstractC2129d.c() ? new j(aVar) : new d(aVar);
        f19476d = new b();
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

    public static AbstractC2132g f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static AbstractC2132g g(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        return new i(f19475c.copyFrom(bArr, i10, i11));
    }

    public static AbstractC2132g h(String str) {
        return new i(str.getBytes(AbstractC2149y.f19691b));
    }

    public static int p(byte b10) {
        return b10 & UByte.MAX_VALUE;
    }

    public static AbstractC2132g r(byte[] bArr) {
        return new i(bArr);
    }

    public static AbstractC2132g s(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f19477a;
        if (i10 == 0) {
            int size = size();
            i10 = l(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f19477a = i10;
        }
        return i10;
    }

    public abstract void i(byte[] bArr, int i10, int i11, int i12);

    public abstract byte j(int i10);

    public InterfaceC0372g k() {
        return new a();
    }

    public abstract int l(int i10, int i11, int i12);

    public final int m() {
        return this.f19477a;
    }

    public abstract AbstractC2132g n(int i10, int i11);

    public final byte[] o() {
        int size = size();
        if (size == 0) {
            return AbstractC2149y.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public final String q() {
        if (size() <= 50) {
            return k0.a(this);
        }
        return k0.a(n(0, 47)) + "...";
    }

    public abstract int size();

    public abstract void t(AbstractC2131f abstractC2131f);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), q());
    }
}
