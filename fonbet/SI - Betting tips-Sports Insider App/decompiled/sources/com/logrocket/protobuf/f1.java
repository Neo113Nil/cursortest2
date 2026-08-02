package com.logrocket.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f1 extends j {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f6690i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final int f6691d;

    /* renamed from: e, reason: collision with root package name */
    public final j f6692e;

    /* renamed from: f, reason: collision with root package name */
    public final j f6693f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6694g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6695h;

    public f1(j jVar, j jVar2) {
        this.f6692e = jVar;
        this.f6693f = jVar2;
        int size = jVar.size();
        this.f6694g = size;
        this.f6691d = jVar2.size() + size;
        this.f6695h = Math.max(jVar.f(), jVar2.f()) + 1;
    }

    public static int q(int i5) {
        if (i5 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f6690i[i5];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.logrocket.protobuf.j
    public final byte b(int i5) {
        j.c(i5, this.f6691d);
        return g(i5);
    }

    @Override // com.logrocket.protobuf.j
    public final void e(int i5, byte[] bArr, int i10, int i11) {
        int i12 = i5 + i11;
        j jVar = this.f6692e;
        int i13 = this.f6694g;
        if (i12 <= i13) {
            jVar.e(i5, bArr, i10, i11);
            return;
        }
        j jVar2 = this.f6693f;
        if (i5 >= i13) {
            jVar2.e(i5 - i13, bArr, i10, i11);
            return;
        }
        int i14 = i13 - i5;
        jVar.e(i5, bArr, i10, i14);
        jVar2.e(0, bArr, i10 + i14, i11 - i14);
    }

    @Override // com.logrocket.protobuf.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            int size = jVar.size();
            int i5 = this.f6691d;
            if (i5 == size) {
                if (i5 == 0) {
                    return true;
                }
                int i10 = this.f6738a;
                int i11 = jVar.f6738a;
                if (i10 == 0 || i11 == 0 || i10 == i11) {
                    e1 e1Var = new e1(this);
                    h a7 = e1Var.a();
                    e1 e1Var2 = new e1(jVar);
                    h a10 = e1Var2.a();
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        int size2 = a7.size() - i12;
                        int size3 = a10.size() - i13;
                        int min = Math.min(size2, size3);
                        if (!(i12 == 0 ? a7.q(a10, i13, min) : a10.q(a7, i12, min))) {
                            break;
                        }
                        i14 += min;
                        if (i14 >= i5) {
                            if (i14 == i5) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (min == size2) {
                            a7 = e1Var.a();
                            i12 = 0;
                        } else {
                            i12 += min;
                        }
                        if (min == size3) {
                            a10 = e1Var2.a();
                            i13 = 0;
                        } else {
                            i13 += min;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.logrocket.protobuf.j
    public final int f() {
        return this.f6695h;
    }

    @Override // com.logrocket.protobuf.j
    public final byte g(int i5) {
        int i10 = this.f6694g;
        return i5 < i10 ? this.f6692e.g(i5) : this.f6693f.g(i5 - i10);
    }

    @Override // com.logrocket.protobuf.j
    public final boolean h() {
        return this.f6691d >= q(this.f6695h);
    }

    @Override // com.logrocket.protobuf.j
    public final boolean i() {
        int l6 = this.f6692e.l(0, 0, this.f6694g);
        j jVar = this.f6693f;
        return jVar.l(l6, 0, jVar.size()) == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d1(this);
    }

    @Override // com.logrocket.protobuf.j
    public final int j(int i5, int i10, int i11) {
        int i12 = i10 + i11;
        j jVar = this.f6692e;
        int i13 = this.f6694g;
        if (i12 <= i13) {
            return jVar.j(i5, i10, i11);
        }
        j jVar2 = this.f6693f;
        if (i10 >= i13) {
            return jVar2.j(i5, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return jVar2.j(jVar.j(i5, i10, i14), 0, i11 - i14);
    }

    @Override // com.logrocket.protobuf.j
    public final int l(int i5, int i10, int i11) {
        int i12 = i10 + i11;
        j jVar = this.f6692e;
        int i13 = this.f6694g;
        if (i12 <= i13) {
            return jVar.l(i5, i10, i11);
        }
        j jVar2 = this.f6693f;
        if (i10 >= i13) {
            return jVar2.l(i5, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return jVar2.l(jVar.l(i5, i10, i14), 0, i11 - i14);
    }

    @Override // com.logrocket.protobuf.j
    public final j m(int i5, int i10) {
        int i11 = this.f6691d;
        int d10 = j.d(i5, i10, i11);
        if (d10 == 0) {
            return j.f6736b;
        }
        if (d10 == i11) {
            return this;
        }
        j jVar = this.f6692e;
        int i12 = this.f6694g;
        if (i10 <= i12) {
            return jVar.m(i5, i10);
        }
        j jVar2 = this.f6693f;
        return i5 >= i12 ? jVar2.m(i5 - i12, i10 - i12) : new f1(jVar.m(i5, jVar.size()), jVar2.m(0, i10 - i12));
    }

    @Override // com.logrocket.protobuf.j
    public final String o(Charset charset) {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = d0.f6682b;
        } else {
            byte[] bArr2 = new byte[size];
            e(0, bArr2, 0, size);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // com.logrocket.protobuf.j
    public final void p(p pVar) {
        this.f6692e.p(pVar);
        this.f6693f.p(pVar);
    }

    @Override // com.logrocket.protobuf.j
    public final int size() {
        return this.f6691d;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = d0.f6682b;
        } else {
            byte[] bArr2 = new byte[size];
            e(0, bArr2, 0, size);
            bArr = bArr2;
        }
        return new i(bArr);
    }
}
