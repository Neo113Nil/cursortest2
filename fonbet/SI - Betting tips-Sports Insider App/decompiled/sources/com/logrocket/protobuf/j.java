package com.logrocket.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f6736b = new i(d0.f6682b);

    /* renamed from: c, reason: collision with root package name */
    public static final f f6737c;
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public int f6738a = 0;

    static {
        f6737c = c.a() ? new f(1) : new f(0);
    }

    public static j a(Iterator it, int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException(d9.e.f(i5, "length (", ") must be >= 1"));
        }
        if (i5 == 1) {
            return (j) it.next();
        }
        int i10 = i5 >>> 1;
        j a7 = a(it, i10);
        j a10 = a(it, i5 - i10);
        if (Integer.MAX_VALUE - a7.size() < a10.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + a7.size() + "+" + a10.size());
        }
        if (a10.size() == 0) {
            return a7;
        }
        if (a7.size() == 0) {
            return a10;
        }
        int size = a10.size() + a7.size();
        if (size < 128) {
            int size2 = a7.size();
            int size3 = a10.size();
            int i11 = size2 + size3;
            byte[] bArr = new byte[i11];
            d(0, size2, a7.size());
            d(0, size2, i11);
            if (size2 > 0) {
                a7.e(0, bArr, 0, size2);
            }
            d(0, size3, a10.size());
            d(size2, i11, i11);
            if (size3 > 0) {
                a10.e(0, bArr, size2, size3);
            }
            return new i(bArr);
        }
        if (a7 instanceof f1) {
            f1 f1Var = (f1) a7;
            j jVar = f1Var.f6692e;
            j jVar2 = f1Var.f6693f;
            if (a10.size() + jVar2.size() < 128) {
                int size4 = jVar2.size();
                int size5 = a10.size();
                int i12 = size4 + size5;
                byte[] bArr2 = new byte[i12];
                d(0, size4, jVar2.size());
                d(0, size4, i12);
                if (size4 > 0) {
                    jVar2.e(0, bArr2, 0, size4);
                }
                d(0, size5, a10.size());
                d(size4, i12, i12);
                if (size5 > 0) {
                    a10.e(0, bArr2, size4, size5);
                }
                return new f1(jVar, new i(bArr2));
            }
            if (jVar.f() > jVar2.f() && f1Var.f6695h > a10.f()) {
                return new f1(jVar, new f1(jVar2, a10));
            }
        }
        if (size >= f1.q(Math.max(a7.f(), a10.f()) + 1)) {
            return new f1(a7, a10);
        }
        n0 n0Var = new n0(2);
        n0Var.a(a7);
        n0Var.a(a10);
        ArrayDeque arrayDeque = (ArrayDeque) n0Var.f6757a;
        j jVar3 = (j) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            jVar3 = new f1((j) arrayDeque.pop(), jVar3);
        }
        return jVar3;
    }

    public static void c(int i5, int i10) {
        if (((i10 - (i5 + 1)) | i5) < 0) {
            if (i5 >= 0) {
                throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Index > length: ", ", ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.i(i5, "Index < 0: "));
        }
    }

    public static int d(int i5, int i10, int i11) {
        int i12 = i10 - i5;
        if ((i5 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(d9.e.f(i5, "Beginning index: ", " < 0"));
        }
        if (i10 < i5) {
            throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Beginning index larger than ending index: ", ", ", i10));
        }
        throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i10, "End index: ", " >= ", i11));
    }

    public abstract byte b(int i5);

    public abstract void e(int i5, byte[] bArr, int i10, int i11);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract byte g(int i5);

    public abstract boolean h();

    public final int hashCode() {
        int i5 = this.f6738a;
        if (i5 == 0) {
            int size = size();
            i5 = j(size, 0, size);
            if (i5 == 0) {
                i5 = 1;
            }
            this.f6738a = i5;
        }
        return i5;
    }

    public abstract boolean i();

    public abstract int j(int i5, int i10, int i11);

    public abstract int l(int i5, int i10, int i11);

    public abstract j m(int i5, int i10);

    public abstract String o(Charset charset);

    public abstract void p(p pVar);

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = l1.d(this);
        } else {
            str = l1.d(m(0, 47)) + "...";
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return d9.e.l(sb2, str, "\">");
    }
}
