package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v0k {
    public static final v0k e = new v0k(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final ug5 c;
    public Object[] d;

    public v0k(int i, int i2, Object[] objArr, ug5 ug5Var) {
        this.a = i;
        this.b = i2;
        this.c = ug5Var;
        this.d = objArr;
    }

    public static v0k j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, ug5 ug5Var) {
        if (i3 > 30) {
            return new v0k(0, 0, new Object[]{obj, obj2, obj3, obj4}, ug5Var);
        }
        int U = aik.U(i, i3);
        int U2 = aik.U(i2, i3);
        if (U != U2) {
            return new v0k((1 << U) | (1 << U2), 0, U < U2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, ug5Var);
        }
        return new v0k(0, 1 << U, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, ug5Var)}, ug5Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, ug5 ug5Var) {
        Object obj3 = this.d[i];
        v0k j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, ug5Var);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        mh0.i(0, i, 6, objArr, objArr2);
        mh0.d(i, i + 2, i5, objArr, objArr2);
        objArr2[t - 1] = j;
        mh0.d(t, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        a i = llf.i(2, llf.j(0, this.d.length));
        int i2 = i.a;
        int i3 = i.b;
        int i4 = i.c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (!Intrinsics.c(obj, this.d[i2])) {
                if (i2 != i3) {
                    i2 += i4;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int U = 1 << aik.U(i, i2);
        if (h(U)) {
            return Intrinsics.c(obj, this.d[f(U)]);
        }
        if (!i(U)) {
            return false;
        }
        v0k s = s(t(U));
        return i2 == 30 ? s.c(obj) : s.d(i, i2 + 5, obj);
    }

    public final boolean e(v0k v0kVar) {
        if (this == v0kVar) {
            return true;
        }
        if (this.b == v0kVar.b && this.a == v0kVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == v0kVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int U = 1 << aik.U(i, i2);
        if (h(U)) {
            int f = f(U);
            if (Intrinsics.c(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(U)) {
            return null;
        }
        v0k s = s(t(U));
        if (i2 != 30) {
            return s.g(i, i2 + 5, obj);
        }
        a i3 = llf.i(2, llf.j(0, s.d.length));
        int i4 = i3.a;
        int i5 = i3.b;
        int i6 = i3.c;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return null;
        }
        while (!Intrinsics.c(obj, s.d[i4])) {
            if (i4 == i5) {
                return null;
            }
            i4 += i6;
        }
        return s.x(i4);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final v0k k(int i, gee geeVar) {
        geeVar.h(geeVar.f - 1);
        geeVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != geeVar.b) {
            return new v0k(0, 0, aik.f0(i, objArr), geeVar.b);
        }
        this.d = aik.f0(i, objArr);
        return this;
    }

    public final v0k l(int i, Object obj, Object obj2, int i2, gee geeVar) {
        gee geeVar2;
        v0k l;
        int U = 1 << aik.U(i, i2);
        boolean h = h(U);
        ug5 ug5Var = this.c;
        if (h) {
            int f = f(U);
            if (!Intrinsics.c(obj, this.d[f])) {
                geeVar.h(geeVar.f + 1);
                ug5 ug5Var2 = geeVar.b;
                if (ug5Var != ug5Var2) {
                    return new v0k(this.a ^ U, this.b | U, a(f, U, i, obj, obj2, i2, ug5Var2), ug5Var2);
                }
                this.d = a(f, U, i, obj, obj2, i2, ug5Var2);
                this.a ^= U;
                this.b |= U;
                return this;
            }
            geeVar.d = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (ug5Var == geeVar.b) {
                this.d[f + 1] = obj2;
                return this;
            }
            geeVar.e++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[f + 1] = obj2;
            return new v0k(this.a, this.b, copyOf, geeVar.b);
        }
        if (!i(U)) {
            geeVar.h(geeVar.f + 1);
            ug5 ug5Var3 = geeVar.b;
            int f2 = f(U);
            Object[] objArr2 = this.d;
            if (ug5Var != ug5Var3) {
                return new v0k(this.a | U, this.b, aik.V(objArr2, f2, obj, obj2), ug5Var3);
            }
            this.d = aik.V(objArr2, f2, obj, obj2);
            this.a |= U;
            return this;
        }
        int t = t(U);
        v0k s = s(t);
        if (i2 == 30) {
            a i3 = llf.i(2, llf.j(0, s.d.length));
            int i4 = i3.a;
            int i5 = i3.b;
            int i6 = i3.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (!Intrinsics.c(obj, s.d[i4])) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                geeVar.d = s.x(i4);
                if (s.c == geeVar.b) {
                    s.d[i4 + 1] = obj2;
                    l = s;
                } else {
                    geeVar.e++;
                    Object[] objArr3 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i4 + 1] = obj2;
                    l = new v0k(0, 0, copyOf2, geeVar.b);
                }
                geeVar2 = geeVar;
            }
            geeVar.h(geeVar.f + 1);
            l = new v0k(0, 0, aik.V(s.d, 0, obj, obj2), geeVar.b);
            geeVar2 = geeVar;
        } else {
            geeVar2 = geeVar;
            l = s.l(i, obj, obj2, i2 + 5, geeVar2);
        }
        return s == l ? this : r(t, l, geeVar2.b);
    }

    public final v0k m(v0k v0kVar, int i, hx4 hx4Var, gee geeVar) {
        Object[] objArr;
        v0k j;
        if (this == v0kVar) {
            hx4Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            ug5 ug5Var = geeVar.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + v0kVar.d.length);
            int length = this.d.length;
            a i3 = llf.i(2, llf.j(0, v0kVar.d.length));
            int i4 = i3.a;
            int i5 = i3.b;
            int i6 = i3.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(v0kVar.d[i4])) {
                        hx4Var.a++;
                    } else {
                        Object[] objArr3 = v0kVar.d;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length != v0kVar.d.length) {
                    return length == copyOf.length ? new v0k(0, 0, copyOf, ug5Var) : new v0k(0, 0, Arrays.copyOf(copyOf, length), ug5Var);
                }
            }
            return this;
        }
        int i7 = this.b | v0kVar.b;
        int i8 = this.a;
        int i9 = v0kVar.a;
        int i10 = (i8 ^ i9) & (~i7);
        int i11 = i8 & i9;
        int i12 = i10;
        while (i11 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i11);
            if (Intrinsics.c(this.d[f(lowestOneBit)], v0kVar.d[v0kVar.f(lowestOneBit)])) {
                i12 |= lowestOneBit;
            } else {
                i7 |= lowestOneBit;
            }
            i11 ^= lowestOneBit;
        }
        if ((i7 & i12) != 0) {
            h3f.b("Check failed.");
        }
        v0k v0kVar2 = (Intrinsics.c(this.c, geeVar.b) && this.a == i12 && this.b == i7) ? this : new v0k(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
        int i13 = i7;
        int i14 = 0;
        while (i13 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i13);
            Object[] objArr4 = v0kVar2.d;
            int length2 = (objArr4.length - 1) - i14;
            if (i(lowestOneBit2)) {
                j = s(t(lowestOneBit2));
                if (v0kVar.i(lowestOneBit2)) {
                    j = j.m(v0kVar.s(v0kVar.t(lowestOneBit2)), i + 5, hx4Var, geeVar);
                    objArr = objArr4;
                } else if (v0kVar.h(lowestOneBit2)) {
                    int f = v0kVar.f(lowestOneBit2);
                    Object obj = v0kVar.d[f];
                    Object x = v0kVar.x(f);
                    int i15 = geeVar.f;
                    objArr = objArr4;
                    j = j.l(obj != null ? obj.hashCode() : i2, obj, x, i + 5, geeVar);
                    if (geeVar.f == i15) {
                        hx4Var.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (v0kVar.i(lowestOneBit2)) {
                    v0k s = v0kVar.s(v0kVar.t(lowestOneBit2));
                    if (h(lowestOneBit2)) {
                        int f2 = f(lowestOneBit2);
                        Object obj2 = this.d[f2];
                        int i16 = i + 5;
                        if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                            hx4Var.a++;
                        } else {
                            j = s.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f2), i16, geeVar);
                        }
                    }
                    j = s;
                } else {
                    int f3 = f(lowestOneBit2);
                    Object obj3 = this.d[f3];
                    Object x2 = x(f3);
                    int f4 = v0kVar.f(lowestOneBit2);
                    Object obj4 = v0kVar.d[f4];
                    j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, v0kVar.x(f4), i + 5, geeVar.b);
                }
            }
            objArr[length2] = j;
            i14++;
            i13 ^= lowestOneBit2;
            i2 = 0;
        }
        int i17 = 0;
        while (i12 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i12);
            int i18 = i17 * 2;
            if (v0kVar.h(lowestOneBit3)) {
                int f5 = v0kVar.f(lowestOneBit3);
                Object[] objArr5 = v0kVar2.d;
                objArr5[i18] = v0kVar.d[f5];
                objArr5[i18 + 1] = v0kVar.x(f5);
                if (h(lowestOneBit3)) {
                    hx4Var.a++;
                }
            } else {
                int f6 = f(lowestOneBit3);
                Object[] objArr6 = v0kVar2.d;
                objArr6[i18] = this.d[f6];
                objArr6[i18 + 1] = x(f6);
            }
            i17++;
            i12 ^= lowestOneBit3;
        }
        if (!e(v0kVar2)) {
            return v0kVar.e(v0kVar2) ? v0kVar : v0kVar2;
        }
        return this;
    }

    public final v0k n(int i, Object obj, int i2, gee geeVar) {
        v0k n;
        int U = 1 << aik.U(i, i2);
        if (h(U)) {
            int f = f(U);
            if (Intrinsics.c(obj, this.d[f])) {
                return p(f, U, geeVar);
            }
        } else if (i(U)) {
            int t = t(U);
            v0k s = s(t);
            if (i2 == 30) {
                a i3 = llf.i(2, llf.j(0, s.d.length));
                int i4 = i3.a;
                int i5 = i3.b;
                int i6 = i3.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!Intrinsics.c(obj, s.d[i4])) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    n = s.k(i4, geeVar);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, geeVar);
            return q(s, n, t, U, geeVar.b);
        }
        return this;
    }

    public final v0k o(int i, Object obj, Object obj2, int i2, gee geeVar) {
        gee geeVar2;
        v0k o;
        int U = 1 << aik.U(i, i2);
        if (h(U)) {
            int f = f(U);
            return (Intrinsics.c(obj, this.d[f]) && Intrinsics.c(obj2, x(f))) ? p(f, U, geeVar) : this;
        }
        if (!i(U)) {
            return this;
        }
        int t = t(U);
        v0k s = s(t);
        if (i2 == 30) {
            a i3 = llf.i(2, llf.j(0, s.d.length));
            int i4 = i3.a;
            int i5 = i3.b;
            int i6 = i3.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!Intrinsics.c(obj, s.d[i4]) || !Intrinsics.c(obj2, s.x(i4))) {
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    } else {
                        o = s.k(i4, geeVar);
                        break;
                    }
                }
                geeVar2 = geeVar;
            }
            o = s;
            geeVar2 = geeVar;
        } else {
            geeVar2 = geeVar;
            o = s.o(i, obj, obj2, i2 + 5, geeVar2);
        }
        return q(s, o, t, U, geeVar2.b);
    }

    public final v0k p(int i, int i2, gee geeVar) {
        geeVar.h(geeVar.f - 1);
        geeVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != geeVar.b) {
            return new v0k(i2 ^ this.a, this.b, aik.f0(i, objArr), geeVar.b);
        }
        this.d = aik.f0(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final v0k q(v0k v0kVar, v0k v0kVar2, int i, int i2, ug5 ug5Var) {
        ug5 ug5Var2 = this.c;
        if (v0kVar2 != null) {
            return (ug5Var2 == ug5Var || v0kVar != v0kVar2) ? r(i, v0kVar2, ug5Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (ug5Var2 != ug5Var) {
            return new v0k(this.a, this.b ^ i2, aik.g0(i, objArr), ug5Var);
        }
        this.d = aik.g0(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final v0k r(int i, v0k v0kVar, ug5 ug5Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && v0kVar.d.length == 2 && v0kVar.b == 0) {
            v0kVar.a = this.b;
            return v0kVar;
        }
        if (this.c == ug5Var) {
            objArr[i] = v0kVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = v0kVar;
        return new v0k(this.a, this.b, copyOf, ug5Var);
    }

    public final v0k s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (v0k) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r14.c = w(r7, r2, (defpackage.v0k) r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yz1 u(int i, Object obj, Object obj2, int i2) {
        yz1 u;
        int i3 = 1;
        int U = 1 << aik.U(i, i2);
        int i4 = 15;
        int i5 = 0;
        if (h(U)) {
            int f = f(U);
            if (!Intrinsics.c(obj, this.d[f])) {
                return new yz1(new v0k(this.a ^ U, this.b | U, a(f, U, i, obj, obj2, i2, null), null), i3, i4);
            }
            if (x(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new yz1(new v0k(this.a, this.b, copyOf, null), i5, i4);
            }
        } else {
            if (!i(U)) {
                return new yz1(new v0k(U | this.a, this.b, aik.V(this.d, f(U), obj, obj2), null), i3, i4);
            }
            int t = t(U);
            v0k s = s(t);
            if (i2 == 30) {
                a i6 = llf.i(2, llf.j(0, s.d.length));
                int i7 = i6.a;
                int i8 = i6.b;
                int i9 = i6.c;
                if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                    while (!Intrinsics.c(obj, s.d[i7])) {
                        if (i7 != i8) {
                            i7 += i9;
                        }
                    }
                    if (obj2 == s.x(i7)) {
                        u = null;
                    } else {
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i7 + 1] = obj2;
                        u = new yz1(new v0k(0, 0, copyOf2, null), i5, i4);
                    }
                }
                u = new yz1(new v0k(0, 0, aik.V(s.d, 0, obj, obj2), null), i3, i4);
                break;
            }
            u = s.u(i, obj, obj2, i2 + 5);
        }
        return null;
    }

    public final v0k v(int i, int i2, Object obj) {
        v0k v;
        int U = 1 << aik.U(i, i2);
        if (h(U)) {
            int f = f(U);
            if (!Intrinsics.c(obj, this.d[f])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new v0k(this.a ^ U, this.b, aik.f0(f, objArr), null);
            }
        } else {
            if (!i(U)) {
                return this;
            }
            int t = t(U);
            v0k s = s(t);
            if (i2 == 30) {
                a i3 = llf.i(2, llf.j(0, s.d.length));
                int i4 = i3.a;
                int i5 = i3.b;
                int i6 = i3.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!Intrinsics.c(obj, s.d[i4])) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    Object[] objArr2 = s.d;
                    v = objArr2.length == 2 ? null : new v0k(0, 0, aik.f0(i4, objArr2), null);
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v != null) {
                return s != v ? w(t, U, v) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new v0k(this.a, this.b ^ U, aik.g0(t, objArr3), null);
            }
        }
        return null;
    }

    public final v0k w(int i, int i2, v0k v0kVar) {
        Object[] objArr = v0kVar.d;
        if (objArr.length != 2 || v0kVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = v0kVar;
            return new v0k(this.a, this.b, copyOf, null);
        }
        if (this.d.length == 1) {
            v0kVar.a = this.b;
            return v0kVar;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        mh0.d(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        mh0.d(f + 2, f, i, copyOf2, copyOf2);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new v0k(this.a ^ i2, this.b ^ i2, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
