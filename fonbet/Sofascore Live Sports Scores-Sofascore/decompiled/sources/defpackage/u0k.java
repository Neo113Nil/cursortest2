package defpackage;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class u0k {
    public static final u0k e = new u0k(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final rik c;
    public Object[] d;

    public u0k(int i, int i2, Object[] objArr, rik rikVar) {
        this.a = i;
        this.b = i2;
        this.c = rikVar;
        this.d = objArr;
    }

    public static u0k k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, rik rikVar) {
        if (i3 > 30) {
            return new u0k(0, 0, new Object[]{obj, obj2, obj3, obj4}, rikVar);
        }
        int D = cga.D(i, i3);
        int D2 = cga.D(i2, i3);
        if (D != D2) {
            return new u0k((1 << D) | (1 << D2), 0, D < D2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, rikVar);
        }
        return new u0k(0, 1 << D, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, rikVar)}, rikVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, rik rikVar) {
        Object obj3 = this.d[i];
        u0k k = k(obj3 != null ? obj3.hashCode() : 0, obj3, w(i), i3, obj, obj2, i4 + 5, rikVar);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        mh0.i(0, i, 6, objArr, objArr2);
        mh0.d(i, i + 2, i5, objArr, objArr2);
        objArr2[t - 1] = k;
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

    public final int c(Object obj) {
        a i = llf.i(2, llf.j(0, this.d.length));
        int i2 = i.a;
        int i3 = i.b;
        int i4 = i.c;
        if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
            return -1;
        }
        while (!Intrinsics.c(obj, this.d[i2])) {
            if (i2 == i3) {
                return -1;
            }
            i2 += i4;
        }
        return i2;
    }

    public final boolean d(int i, int i2, Object obj) {
        int D = 1 << cga.D(i, i2);
        if (i(D)) {
            return Intrinsics.c(obj, this.d[f(D)]);
        }
        if (!j(D)) {
            return false;
        }
        u0k s = s(t(D));
        return i2 == 30 ? s.c(obj) != -1 : s.d(i, i2 + 5, obj);
    }

    public final boolean e(u0k u0kVar) {
        if (this == u0kVar) {
            return true;
        }
        if (this.b == u0kVar.b && this.a == u0kVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == u0kVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final boolean g(u0k u0kVar, Function2 function2) {
        int i;
        u0kVar.getClass();
        if (this == u0kVar) {
            return true;
        }
        int i2 = this.a;
        if (i2 == u0kVar.a && (i = this.b) == u0kVar.b) {
            if (i2 != 0 || i != 0) {
                int bitCount = Integer.bitCount(i2) * 2;
                a i3 = llf.i(2, llf.j(0, bitCount));
                int i4 = i3.a;
                int i5 = i3.b;
                int i6 = i3.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (Intrinsics.c(this.d[i4], u0kVar.d[i4]) && ((Boolean) function2.invoke(w(i4), u0kVar.w(i4))).booleanValue()) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                }
                int length = this.d.length;
                while (bitCount < length) {
                    if (s(bitCount).g(u0kVar.s(bitCount), function2)) {
                        bitCount++;
                    }
                }
                return true;
            }
            Object[] objArr = this.d;
            if (objArr.length == u0kVar.d.length) {
                Iterable i7 = llf.i(2, llf.j(0, objArr.length));
                if ((i7 instanceof Collection) && ((Collection) i7).isEmpty()) {
                    return true;
                }
                v6a it = i7.iterator();
                while (it.c) {
                    int nextInt = it.nextInt();
                    Object obj = u0kVar.d[nextInt];
                    Object w = u0kVar.w(nextInt);
                    int c = c(obj);
                    if (!(c != -1 ? ((Boolean) function2.invoke(w(c), w)).booleanValue() : false)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object h(int i, int i2, Object obj) {
        int D = 1 << cga.D(i, i2);
        if (i(D)) {
            int f = f(D);
            if (Intrinsics.c(obj, this.d[f])) {
                return w(f);
            }
            return null;
        }
        if (!j(D)) {
            return null;
        }
        u0k s = s(t(D));
        if (i2 != 30) {
            return s.h(i, i2 + 5, obj);
        }
        int c = s.c(obj);
        if (c != -1) {
            return s.w(c);
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.a & i) != 0;
    }

    public final boolean j(int i) {
        return (this.b & i) != 0;
    }

    public final u0k l(int i, fee feeVar) {
        feeVar.h(feeVar.f - 1);
        feeVar.d = w(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != feeVar.b) {
            return new u0k(0, 0, cga.N(i, objArr), feeVar.b);
        }
        this.d = cga.N(i, objArr);
        return this;
    }

    public final u0k m(int i, Object obj, Object obj2, int i2, fee feeVar) {
        u0k m;
        int D = 1 << cga.D(i, i2);
        boolean i3 = i(D);
        rik rikVar = this.c;
        if (i3) {
            int f = f(D);
            if (!Intrinsics.c(obj, this.d[f])) {
                feeVar.h(feeVar.f + 1);
                rik rikVar2 = feeVar.b;
                if (rikVar != rikVar2) {
                    return new u0k(this.a ^ D, this.b | D, a(f, D, i, obj, obj2, i2, rikVar2), rikVar2);
                }
                this.d = a(f, D, i, obj, obj2, i2, rikVar2);
                this.a ^= D;
                this.b |= D;
                return this;
            }
            feeVar.d = w(f);
            if (w(f) != obj2) {
                if (rikVar == feeVar.b) {
                    this.d[f + 1] = obj2;
                    return this;
                }
                feeVar.e++;
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new u0k(this.a, this.b, copyOf, feeVar.b);
            }
        } else {
            if (!j(D)) {
                feeVar.h(feeVar.f + 1);
                rik rikVar3 = feeVar.b;
                int f2 = f(D);
                Object[] objArr2 = this.d;
                if (rikVar != rikVar3) {
                    return new u0k(this.a | D, this.b, cga.E(objArr2, f2, obj, obj2), rikVar3);
                }
                this.d = cga.E(objArr2, f2, obj, obj2);
                this.a |= D;
                return this;
            }
            int t = t(D);
            u0k s = s(t);
            if (i2 == 30) {
                int c = s.c(obj);
                if (c != -1) {
                    feeVar.d = s.w(c);
                    if (s.c == feeVar.b) {
                        s.d[c + 1] = obj2;
                        m = s;
                    } else {
                        feeVar.e++;
                        Object[] objArr3 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                        copyOf2[c + 1] = obj2;
                        m = new u0k(0, 0, copyOf2, feeVar.b);
                    }
                } else {
                    feeVar.h(feeVar.f + 1);
                    m = new u0k(0, 0, cga.E(s.d, 0, obj, obj2), feeVar.b);
                }
            } else {
                m = s.m(i, obj, obj2, i2 + 5, feeVar);
            }
            if (s != m) {
                return v(t, D, m, feeVar.b);
            }
        }
        return this;
    }

    public final u0k n(u0k u0kVar, int i, gx4 gx4Var, fee feeVar) {
        Object[] objArr;
        u0k k;
        u0kVar.getClass();
        if (this == u0kVar) {
            gx4Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            rik rikVar = feeVar.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + u0kVar.d.length);
            int length = this.d.length;
            a i3 = llf.i(2, llf.j(0, u0kVar.d.length));
            int i4 = i3.a;
            int i5 = i3.b;
            int i6 = i3.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(u0kVar.d[i4]) != -1) {
                        gx4Var.a++;
                    } else {
                        Object[] objArr3 = u0kVar.d;
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
                if (length != u0kVar.d.length) {
                    return length == copyOf.length ? new u0k(0, 0, copyOf, rikVar) : new u0k(0, 0, Arrays.copyOf(copyOf, length), rikVar);
                }
            }
            return this;
        }
        int i7 = this.b | u0kVar.b;
        int i8 = this.a;
        int i9 = u0kVar.a;
        int i10 = (i8 ^ i9) & (~i7);
        int i11 = i8 & i9;
        int i12 = i10;
        while (i11 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i11);
            if (Intrinsics.c(this.d[f(lowestOneBit)], u0kVar.d[u0kVar.f(lowestOneBit)])) {
                i12 |= lowestOneBit;
            } else {
                i7 |= lowestOneBit;
            }
            i11 ^= lowestOneBit;
        }
        if ((i7 & i12) != 0) {
            a70.r("Check failed.");
            return null;
        }
        u0k u0kVar2 = (Intrinsics.c(this.c, feeVar.b) && this.a == i12 && this.b == i7) ? this : new u0k(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
        int i13 = i7;
        int i14 = 0;
        while (i13 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i13);
            Object[] objArr4 = u0kVar2.d;
            int length2 = (objArr4.length - 1) - i14;
            if (j(lowestOneBit2)) {
                k = s(t(lowestOneBit2));
                if (u0kVar.j(lowestOneBit2)) {
                    k = k.n(u0kVar.s(u0kVar.t(lowestOneBit2)), i + 5, gx4Var, feeVar);
                    objArr = objArr4;
                } else if (u0kVar.i(lowestOneBit2)) {
                    int f = u0kVar.f(lowestOneBit2);
                    Object obj = u0kVar.d[f];
                    Object w = u0kVar.w(f);
                    int i15 = feeVar.f;
                    objArr = objArr4;
                    k = k.m(obj != null ? obj.hashCode() : i2, obj, w, i + 5, feeVar);
                    if (feeVar.f == i15) {
                        gx4Var.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (u0kVar.j(lowestOneBit2)) {
                    u0k s = u0kVar.s(u0kVar.t(lowestOneBit2));
                    if (i(lowestOneBit2)) {
                        int f2 = f(lowestOneBit2);
                        Object obj2 = this.d[f2];
                        int i16 = i + 5;
                        if (s.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                            gx4Var.a++;
                        } else {
                            k = s.m(obj2 != null ? obj2.hashCode() : 0, obj2, w(f2), i16, feeVar);
                        }
                    }
                    k = s;
                } else {
                    int f3 = f(lowestOneBit2);
                    Object obj3 = this.d[f3];
                    Object w2 = w(f3);
                    int f4 = u0kVar.f(lowestOneBit2);
                    Object obj4 = u0kVar.d[f4];
                    k = k(obj3 != null ? obj3.hashCode() : 0, obj3, w2, obj4 != null ? obj4.hashCode() : 0, obj4, u0kVar.w(f4), i + 5, feeVar.b);
                }
            }
            objArr[length2] = k;
            i14++;
            i13 ^= lowestOneBit2;
            i2 = 0;
        }
        int i17 = 0;
        while (i12 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i12);
            int i18 = i17 * 2;
            if (u0kVar.i(lowestOneBit3)) {
                int f5 = u0kVar.f(lowestOneBit3);
                Object[] objArr5 = u0kVar2.d;
                objArr5[i18] = u0kVar.d[f5];
                objArr5[i18 + 1] = u0kVar.w(f5);
                if (i(lowestOneBit3)) {
                    gx4Var.a++;
                }
            } else {
                int f6 = f(lowestOneBit3);
                Object[] objArr6 = u0kVar2.d;
                objArr6[i18] = this.d[f6];
                objArr6[i18 + 1] = w(f6);
            }
            i17++;
            i12 ^= lowestOneBit3;
        }
        if (!e(u0kVar2)) {
            return u0kVar.e(u0kVar2) ? u0kVar : u0kVar2;
        }
        return this;
    }

    public final u0k o(int i, Object obj, int i2, fee feeVar) {
        u0k o;
        int D = 1 << cga.D(i, i2);
        if (i(D)) {
            int f = f(D);
            if (Intrinsics.c(obj, this.d[f])) {
                return q(f, D, feeVar);
            }
        } else if (j(D)) {
            int t = t(D);
            u0k s = s(t);
            if (i2 == 30) {
                int c = s.c(obj);
                o = c != -1 ? s.l(c, feeVar) : s;
            } else {
                o = s.o(i, obj, i2 + 5, feeVar);
            }
            return r(s, o, t, D, feeVar.b);
        }
        return this;
    }

    public final u0k p(int i, Object obj, Object obj2, int i2, fee feeVar) {
        fee feeVar2;
        u0k p;
        int D = 1 << cga.D(i, i2);
        if (i(D)) {
            int f = f(D);
            return (Intrinsics.c(obj, this.d[f]) && Intrinsics.c(obj2, w(f))) ? q(f, D, feeVar) : this;
        }
        if (!j(D)) {
            return this;
        }
        int t = t(D);
        u0k s = s(t);
        if (i2 == 30) {
            int c = s.c(obj);
            p = (c == -1 || !Intrinsics.c(obj2, s.w(c))) ? s : s.l(c, feeVar);
            feeVar2 = feeVar;
        } else {
            feeVar2 = feeVar;
            p = s.p(i, obj, obj2, i2 + 5, feeVar2);
        }
        return r(s, p, t, D, feeVar2.b);
    }

    public final u0k q(int i, int i2, fee feeVar) {
        feeVar.h(feeVar.f - 1);
        feeVar.d = w(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != feeVar.b) {
            return new u0k(i2 ^ this.a, this.b, cga.N(i, objArr), feeVar.b);
        }
        this.d = cga.N(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final u0k r(u0k u0kVar, u0k u0kVar2, int i, int i2, rik rikVar) {
        if (u0kVar2 != null) {
            return (u0kVar2 != u0kVar || (u0kVar2.d.length == 2 && u0kVar2.b == 0)) ? v(i, i2, u0kVar2, rikVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != rikVar) {
            Object[] objArr2 = new Object[objArr.length - 1];
            mh0.i(0, i, 6, objArr, objArr2);
            mh0.d(i, i + 1, objArr.length, objArr, objArr2);
            return new u0k(this.a, this.b ^ i2, objArr2, rikVar);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        mh0.i(0, i, 6, objArr, objArr3);
        mh0.d(i, i + 1, objArr.length, objArr, objArr3);
        this.d = objArr3;
        this.b ^= i2;
        return this;
    }

    public final u0k s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (u0k) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (r15 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        r15.c = v(r7, r2, (defpackage.u0k) r15.c, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if (r15 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yz1 u(int i, Object obj, Object obj2, int i2) {
        yz1 u;
        int i3 = 1;
        int D = 1 << cga.D(i, i2);
        int i4 = 14;
        int i5 = 0;
        if (i(D)) {
            int f = f(D);
            if (!Intrinsics.c(obj, this.d[f])) {
                return new yz1(new u0k(this.a ^ D, this.b | D, a(f, D, i, obj, obj2, i2, null), null), i3, i4);
            }
            if (w(f) != obj2) {
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new yz1(new u0k(this.a, this.b, copyOf, null), i5, i4);
            }
        } else {
            if (!j(D)) {
                return new yz1(new u0k(this.a | D, this.b, cga.E(this.d, f(D), obj, obj2), null), i3, i4);
            }
            int t = t(D);
            u0k s = s(t);
            if (i2 == 30) {
                int c = s.c(obj);
                if (c == -1) {
                    u = new yz1(new u0k(0, 0, cga.E(s.d, 0, obj, obj2), null), i3, i4);
                } else if (obj2 == s.w(c)) {
                    u = null;
                } else {
                    Object[] objArr2 = s.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    copyOf2[c + 1] = obj2;
                    u = new yz1(new u0k(0, 0, copyOf2, null), i5, i4);
                }
            } else {
                u = s.u(i, obj, obj2, i2 + 5);
            }
        }
        return null;
    }

    public final u0k v(int i, int i2, u0k u0kVar, rik rikVar) {
        if (u0kVar.d.length != 2 || u0kVar.b != 0) {
            if (rikVar != null && this.c == rikVar) {
                this.d[i] = u0kVar;
                return this;
            }
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i] = u0kVar;
            return new u0k(this.a, this.b, copyOf, rikVar);
        }
        if (this.d.length == 1) {
            u0kVar.a = this.b;
            return u0kVar;
        }
        int f = f(i2);
        Object[] objArr2 = this.d;
        Object[] objArr3 = u0kVar.d;
        Object obj = objArr3[0];
        Object obj2 = objArr3[1];
        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length + 1);
        mh0.d(i + 2, i + 1, objArr2.length, copyOf2, copyOf2);
        mh0.d(f + 2, f, i, copyOf2, copyOf2);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new u0k(this.a ^ i2, this.b ^ i2, copyOf2, rikVar);
    }

    public final Object w(int i) {
        return this.d[i + 1];
    }
}
