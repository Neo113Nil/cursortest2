package kh;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import lh.C5466a;

/* loaded from: classes3.dex */
public abstract class n implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final a f54503h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final mh.f f54504a;

    /* renamed from: b, reason: collision with root package name */
    public C5466a f54505b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f54506c;

    /* renamed from: d, reason: collision with root package name */
    public int f54507d;

    /* renamed from: e, reason: collision with root package name */
    public int f54508e;

    /* renamed from: f, reason: collision with root package name */
    public long f54509f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54510g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public n(C5466a head, long j10, mh.f pool) {
        Intrinsics.checkNotNullParameter(head, "head");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f54504a = pool;
        this.f54505b = head;
        this.f54506c = head.g();
        this.f54507d = head.h();
        this.f54508e = head.j();
        this.f54509f = j10 - (r3 - this.f54507d);
    }

    public static /* synthetic */ String p2(n nVar, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return nVar.o2(i10, i11);
    }

    public final C5466a A0() {
        if (this.f54510g) {
            return null;
        }
        C5466a y12 = y1();
        if (y12 == null) {
            this.f54510g = true;
            return null;
        }
        k(y12);
        return y12;
    }

    public final boolean B() {
        return (this.f54507d == this.f54508e && this.f54509f == 0) ? false : true;
    }

    public final C5466a D0(C5466a current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return m1(current, C5466a.f55859j.a());
    }

    public abstract void J();

    public final void T1(C5466a current) {
        Intrinsics.checkNotNullParameter(current, "current");
        C5466a y10 = current.y();
        if (y10 == null) {
            Y1(current);
            return;
        }
        int j10 = current.j() - current.h();
        int min = Math.min(j10, 8 - (current.e() - current.f()));
        if (y10.i() < min) {
            Y1(current);
            return;
        }
        AbstractC5258d.f(y10, min);
        if (j10 > min) {
            current.l();
            this.f54508e = current.j();
            u2(this.f54509f + min);
        } else {
            v2(y10);
            u2(this.f54509f - ((y10.j() - y10.h()) - min));
            current.x();
            current.B(this.f54504a);
        }
    }

    public final int U(int i10) {
        if (i10 >= 0) {
            return w0(i10, 0);
        }
        throw new IllegalArgumentException(("Negative discard is not allowed: " + i10).toString());
    }

    public final void Y1(C5466a c5466a) {
        if (this.f54510g && c5466a.y() == null) {
            this.f54507d = c5466a.h();
            this.f54508e = c5466a.j();
            u2(0L);
            return;
        }
        int j10 = c5466a.j() - c5466a.h();
        int min = Math.min(j10, 8 - (c5466a.e() - c5466a.f()));
        if (j10 > min) {
            Z1(c5466a, j10, min);
        } else {
            C5466a c5466a2 = (C5466a) this.f54504a.V0();
            c5466a2.o(8);
            c5466a2.D(c5466a.x());
            AbstractC5256b.a(c5466a2, c5466a, j10);
            v2(c5466a2);
        }
        c5466a.B(this.f54504a);
    }

    public final void Z1(C5466a c5466a, int i10, int i11) {
        C5466a c5466a2 = (C5466a) this.f54504a.V0();
        C5466a c5466a3 = (C5466a) this.f54504a.V0();
        c5466a2.o(8);
        c5466a3.o(8);
        c5466a2.D(c5466a3);
        c5466a3.D(c5466a.x());
        AbstractC5256b.a(c5466a2, c5466a, i10 - i11);
        AbstractC5256b.a(c5466a3, c5466a, i11);
        v2(c5466a2);
        u2(h.c(c5466a3));
    }

    public final boolean a2() {
        if (c2() - e2() == 0 && this.f54509f == 0) {
            return this.f54510g || A0() == null;
        }
        return false;
    }

    public final C5466a b2() {
        C5466a c5466a = this.f54505b;
        c5466a.d(this.f54507d);
        return c5466a;
    }

    public final int c2() {
        return this.f54508e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        r2();
        if (!this.f54510g) {
            this.f54510g = true;
        }
        J();
    }

    public final void d(C5466a c5466a) {
        if (c5466a.j() - c5466a.h() == 0) {
            s2(c5466a);
        }
    }

    public final ByteBuffer d2() {
        return this.f54506c;
    }

    public final int e2() {
        return this.f54507d;
    }

    public final long f2() {
        return (c2() - e2()) + this.f54509f;
    }

    public final void g2() {
        if (this.f54510g) {
            return;
        }
        this.f54510g = true;
    }

    public final Void h2(int i10, int i11) {
        throw new IllegalArgumentException("min should be less or equal to max but min = " + i10 + ", max = " + i11);
    }

    public final Void i2(int i10) {
        throw new IllegalStateException("minSize of " + i10 + " is too big (should be less than 8)");
    }

    public final Void j2(int i10, int i11) {
        throw new lh.c("Premature end of stream: expected at least " + i10 + " chars but had only " + i11);
    }

    public final void k(C5466a c5466a) {
        C5466a a10 = h.a(this.f54505b);
        if (a10 != C5466a.f55859j.a()) {
            a10.D(c5466a);
            u2(this.f54509f + h.c(c5466a));
            return;
        }
        v2(c5466a);
        if (this.f54509f != 0) {
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
        C5466a y10 = c5466a.y();
        u2(y10 != null ? h.c(y10) : 0L);
    }

    public final C5466a k2(int i10) {
        C5466a b22 = b2();
        return this.f54508e - this.f54507d >= i10 ? b22 : m2(i10, b22);
    }

    public final C5466a l2(int i10) {
        return m2(i10, b2());
    }

    public final C5466a m1(C5466a c5466a, C5466a c5466a2) {
        while (c5466a != c5466a2) {
            C5466a x10 = c5466a.x();
            c5466a.B(this.f54504a);
            if (x10 == null) {
                v2(c5466a2);
                u2(0L);
                c5466a = c5466a2;
            } else {
                if (x10.j() > x10.h()) {
                    v2(x10);
                    u2(this.f54509f - (x10.j() - x10.h()));
                    return x10;
                }
                c5466a = x10;
            }
        }
        return A0();
    }

    public final C5466a m2(int i10, C5466a c5466a) {
        while (true) {
            int c22 = c2() - e2();
            if (c22 >= i10) {
                return c5466a;
            }
            C5466a y10 = c5466a.y();
            if (y10 == null && (y10 = A0()) == null) {
                return null;
            }
            if (c22 == 0) {
                if (c5466a != C5466a.f55859j.a()) {
                    s2(c5466a);
                }
                c5466a = y10;
            } else {
                int a10 = AbstractC5256b.a(c5466a, y10, i10 - c22);
                this.f54508e = c5466a.j();
                u2(this.f54509f - a10);
                if (y10.j() > y10.h()) {
                    y10.p(a10);
                } else {
                    c5466a.D(null);
                    c5466a.D(y10.x());
                    y10.B(this.f54504a);
                }
                if (c5466a.j() - c5466a.h() >= i10) {
                    return c5466a;
                }
                if (i10 > 8) {
                    i2(i10);
                    throw new KotlinNothingValueException();
                }
            }
        }
    }

    public final C5466a n1(C5466a current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return D0(current);
    }

    public final int n2(Appendable appendable, int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (i11 == 0 && i10 == 0) {
            return 0;
        }
        if (a2()) {
            if (i10 == 0) {
                return 0;
            }
            r(i10);
            throw new KotlinNothingValueException();
        }
        if (i11 < i10) {
            h2(i10, i11);
            throw new KotlinNothingValueException();
        }
        C5466a b10 = lh.e.b(this, 1);
        if (b10 == null) {
            i12 = 0;
        } else {
            i12 = 0;
            boolean z14 = false;
            while (true) {
                try {
                    ByteBuffer g10 = b10.g();
                    int h10 = b10.h();
                    int j10 = b10.j();
                    for (int i13 = h10; i13 < j10; i13++) {
                        byte b11 = g10.get(i13);
                        int i14 = b11 & UByte.MAX_VALUE;
                        if ((b11 & ByteCompanionObject.MIN_VALUE) != 128) {
                            char c10 = (char) i14;
                            if (i12 == i11) {
                                z12 = false;
                            } else {
                                appendable.append(c10);
                                i12++;
                                z12 = true;
                            }
                            if (z12) {
                            }
                        }
                        b10.c(i13 - h10);
                        z10 = false;
                        break;
                    }
                    b10.c(j10 - h10);
                    z10 = true;
                    if (z10) {
                        z11 = true;
                    } else if (i12 == i11) {
                        z11 = false;
                    } else {
                        z11 = false;
                        z14 = true;
                    }
                    if (!z11) {
                        lh.e.a(this, b10);
                        break;
                    }
                    try {
                        b10 = lh.e.c(this, b10);
                        if (b10 == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z13) {
                            lh.e.a(this, b10);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z13 = true;
                }
            }
            z13 = z14;
        }
        if (z13) {
            return i12 + q2(appendable, i10 - i12, i11 - i12);
        }
        if (i12 >= i10) {
            return i12;
        }
        j2(i10, i12);
        throw new KotlinNothingValueException();
    }

    public final String o2(int i10, int i11) {
        if (i10 == 0 && (i11 == 0 || a2())) {
            return "";
        }
        long f22 = f2();
        if (f22 > 0 && i11 >= f22) {
            return u.g(this, (int) f22, null, 2, null);
        }
        StringBuilder sb2 = new StringBuilder(RangesKt.coerceAtMost(RangesKt.coerceAtLeast(i10, 16), i11));
        n2(sb2, i10, i11);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00dd, code lost:
    
        r5.c(((r11 - r9) - r14) + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004f, code lost:
    
        r5.c(r11 - r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int q2(Appendable appendable, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C5466a c10;
        int i18;
        int i19 = 1;
        C5466a b10 = lh.e.b(this, 1);
        if (b10 == null) {
            i18 = 0;
        } else {
            int i20 = 1;
            int i21 = 0;
            while (true) {
                try {
                    int j10 = b10.j() - b10.h();
                    if (j10 >= i20) {
                        try {
                            ByteBuffer g10 = b10.g();
                            int h10 = b10.h();
                            int j11 = b10.j();
                            int i22 = h10;
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                if (i22 >= j11) {
                                    i12 = i19;
                                    b10.c(j11 - h10);
                                    i13 = 0;
                                    break;
                                }
                                byte b11 = g10.get(i22);
                                i12 = i19;
                                int i26 = b11 & UByte.MAX_VALUE;
                                i13 = -1;
                                if ((b11 & ByteCompanionObject.MIN_VALUE) == 0) {
                                    if (i23 != 0) {
                                        lh.d.i(i23);
                                        throw new KotlinNothingValueException();
                                    }
                                    char c11 = (char) i26;
                                    if (i21 == i11) {
                                        i17 = 0;
                                    } else {
                                        appendable.append(c11);
                                        i21++;
                                        i17 = i12;
                                    }
                                    if (i17 == 0) {
                                        try {
                                            break;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            b10.j();
                                            b10.h();
                                            throw th;
                                        }
                                    }
                                    i22++;
                                    i19 = i12;
                                } else if (i23 == 0) {
                                    int i27 = 128;
                                    i24 = i26;
                                    for (int i28 = i12; i28 < 7 && (i24 & i27) != 0; i28++) {
                                        i24 &= ~i27;
                                        i27 >>= 1;
                                        i23++;
                                    }
                                    int i29 = i23 - 1;
                                    if (i23 > j11 - i22) {
                                        b10.c(i22 - h10);
                                        i13 = i23;
                                        break;
                                    }
                                    i25 = i23;
                                    i23 = i29;
                                    i22++;
                                    i19 = i12;
                                } else {
                                    i24 = (i24 << 6) | (b11 & ByteCompanionObject.MAX_VALUE);
                                    i23--;
                                    if (i23 != 0) {
                                        continue;
                                    } else if (lh.d.f(i24)) {
                                        char c12 = (char) i24;
                                        if (i21 == i11) {
                                            i16 = 0;
                                        } else {
                                            appendable.append(c12);
                                            i21++;
                                            i16 = i12;
                                        }
                                        if (i16 == 0) {
                                            b10.c(((i22 - h10) - i25) + 1);
                                            break;
                                        }
                                        i24 = 0;
                                    } else {
                                        if (!lh.d.g(i24)) {
                                            lh.d.j(i24);
                                            throw new KotlinNothingValueException();
                                        }
                                        char e10 = (char) lh.d.e(i24);
                                        if (i21 == i11) {
                                            i14 = 0;
                                        } else {
                                            appendable.append(e10);
                                            i21++;
                                            i14 = i12;
                                        }
                                        if (i14 == 0) {
                                            break;
                                        }
                                        char h11 = (char) lh.d.h(i24);
                                        if (i21 == i11) {
                                            i15 = 0;
                                        } else {
                                            appendable.append(h11);
                                            i21++;
                                            i15 = i12;
                                        }
                                        if (i15 == 0) {
                                            break;
                                        }
                                        i24 = 0;
                                    }
                                    i22++;
                                    i19 = i12;
                                }
                            }
                            i20 = i13 == 0 ? i12 : i13 > 0 ? i13 : 0;
                            try {
                                j10 = b10.j() - b10.h();
                            } catch (Throwable th3) {
                                th = th3;
                                i19 = i12;
                                if (i19 != 0) {
                                    lh.e.a(this, b10);
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i12 = i19;
                        }
                    } else {
                        i12 = i19;
                    }
                    if (j10 == 0) {
                        try {
                            c10 = lh.e.c(this, b10);
                        } catch (Throwable th5) {
                            th = th5;
                            i19 = 0;
                            if (i19 != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (j10 >= i20 && b10.e() - b10.f() >= 8) {
                            c10 = b10;
                        }
                        lh.e.a(this, b10);
                        c10 = lh.e.b(this, i20);
                    }
                    if (c10 == null) {
                        i19 = 0;
                        break;
                    }
                    b10 = c10;
                    i19 = i12;
                    if (i20 <= 0) {
                        break;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            if (i19 != 0) {
                lh.e.a(this, b10);
            }
            i18 = i21;
        }
        if (i18 >= i10) {
            return i18;
        }
        j2(i10, i18);
        throw new KotlinNothingValueException();
    }

    public final Void r(int i10) {
        throw new EOFException("at least " + i10 + " characters required but no bytes available");
    }

    public final void r2() {
        C5466a b22 = b2();
        C5466a a10 = C5466a.f55859j.a();
        if (b22 != a10) {
            v2(a10);
            u2(0L);
            h.b(b22, this.f54504a);
        }
    }

    public final C5466a s2(C5466a head) {
        Intrinsics.checkNotNullParameter(head, "head");
        C5466a x10 = head.x();
        if (x10 == null) {
            x10 = C5466a.f55859j.a();
        }
        v2(x10);
        u2(this.f54509f - (x10.j() - x10.h()));
        head.B(this.f54504a);
        return x10;
    }

    public final void t2(int i10) {
        this.f54507d = i10;
    }

    public final void u2(long j10) {
        if (j10 >= 0) {
            this.f54509f = j10;
            return;
        }
        throw new IllegalArgumentException(("tailRemaining shouldn't be negative: " + j10).toString());
    }

    public final void v2(C5466a c5466a) {
        this.f54505b = c5466a;
        this.f54506c = c5466a.g();
        this.f54507d = c5466a.h();
        this.f54508e = c5466a.j();
    }

    public final int w0(int i10, int i11) {
        while (i10 != 0) {
            C5466a k22 = k2(1);
            if (k22 == null) {
                break;
            }
            int min = Math.min(k22.j() - k22.h(), i10);
            k22.c(min);
            this.f54507d += min;
            d(k22);
            i10 -= min;
            i11 += min;
        }
        return i11;
    }

    public abstract C5466a y1();

    public final void z0(int i10) {
        if (U(i10) == i10) {
            return;
        }
        throw new EOFException("Unable to discard " + i10 + " bytes due to end of packet");
    }
}
