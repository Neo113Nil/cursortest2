package f1;

import e1.AbstractC4134a;
import e1.I;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: f1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4231i {

    /* renamed from: f1.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f46260a;

        public b(e eVar, d dVar) {
            int i10 = dVar.f46261a;
            AbstractC4134a.a(i10 == 6 || i10 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f46262b.remaining())];
            dVar.f46262b.asReadOnlyBuffer().get(bArr);
            I i11 = new I(bArr);
            AbstractC4231i.f(eVar.f46263a);
            if (i11.g()) {
                this.f46260a = false;
                return;
            }
            int h10 = i11.h(2);
            boolean g10 = i11.g();
            AbstractC4231i.f(eVar.f46264b);
            if (!g10) {
                this.f46260a = true;
                return;
            }
            boolean g11 = (h10 == 3 || h10 == 0) ? true : i11.g();
            i11.q();
            AbstractC4231i.f(!eVar.f46266d);
            if (i11.g()) {
                AbstractC4231i.f(!eVar.f46267e);
                i11.q();
            }
            AbstractC4231i.f(eVar.f46265c);
            if (h10 != 3) {
                i11.q();
            }
            i11.r(eVar.f46268f);
            if (h10 != 2 && h10 != 0 && !g11) {
                i11.r(3);
            }
            this.f46260a = ((h10 == 3 || h10 == 0) ? 255 : i11.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f46260a;
        }
    }

    /* renamed from: f1.i$c */
    public static class c extends Exception {
        public c() {
        }
    }

    /* renamed from: f1.i$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f46261a;

        /* renamed from: b, reason: collision with root package name */
        public final ByteBuffer f46262b;

        public d(int i10, ByteBuffer byteBuffer) {
            this.f46261a = i10;
            this.f46262b = byteBuffer;
        }
    }

    /* renamed from: f1.i$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f46263a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46264b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46265c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f46266d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f46267e;

        /* renamed from: f, reason: collision with root package name */
        public final int f46268f;

        /* renamed from: g, reason: collision with root package name */
        public final int f46269g;

        /* renamed from: h, reason: collision with root package name */
        public final int f46270h;

        /* renamed from: i, reason: collision with root package name */
        public final int f46271i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f46272j;

        /* renamed from: k, reason: collision with root package name */
        public final int f46273k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f46274l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f46275m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f46276n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f46277o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f46278p;

        /* renamed from: q, reason: collision with root package name */
        public final int f46279q;

        /* renamed from: r, reason: collision with root package name */
        public final byte f46280r;

        /* renamed from: s, reason: collision with root package name */
        public final byte f46281s;

        /* renamed from: t, reason: collision with root package name */
        public final byte f46282t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        public e(d dVar) {
            int i10;
            int i11;
            boolean z10;
            ?? r82;
            AbstractC4134a.a(dVar.f46261a == 1);
            byte[] bArr = new byte[dVar.f46262b.remaining()];
            dVar.f46262b.asReadOnlyBuffer().get(bArr);
            I i12 = new I(bArr);
            this.f46269g = i12.h(3);
            i12.q();
            boolean g10 = i12.g();
            this.f46263a = g10;
            if (g10) {
                i11 = i12.h(5);
                this.f46264b = false;
                this.f46272j = false;
                r82 = 0;
                i10 = 0;
            } else {
                if (i12.g()) {
                    b(i12);
                    boolean g11 = i12.g();
                    this.f46264b = g11;
                    if (g11) {
                        i12.r(47);
                    }
                } else {
                    this.f46264b = false;
                }
                this.f46272j = i12.g();
                int h10 = i12.h(5);
                int i13 = 0;
                int i14 = 0;
                boolean z11 = false;
                i10 = 0;
                while (i14 <= h10) {
                    i12.r(12);
                    if (i14 == 0) {
                        i13 = i12.h(5);
                        z10 = z11;
                        if (i13 > 7) {
                            z10 = i12.g();
                        }
                    } else {
                        z10 = z11;
                        if (i12.h(5) > 7) {
                            i12.q();
                            z10 = z11;
                        }
                    }
                    if (this.f46264b) {
                        i12.q();
                    }
                    if (this.f46272j && i12.g()) {
                        if (i14 == 0) {
                            i10 = i12.h(4);
                        } else {
                            i12.r(4);
                        }
                    }
                    i14++;
                    z11 = z10;
                }
                i11 = i13;
                r82 = z11;
            }
            int h11 = i12.h(4);
            int h12 = i12.h(4);
            i12.r(h11 + 1);
            i12.r(h12 + 1);
            if (this.f46263a) {
                this.f46265c = false;
            } else {
                this.f46265c = i12.g();
            }
            if (this.f46265c) {
                i12.r(4);
                i12.r(3);
            }
            i12.r(3);
            if (this.f46263a) {
                this.f46267e = true;
                this.f46266d = true;
                this.f46268f = 0;
            } else {
                i12.r(4);
                boolean g12 = i12.g();
                if (g12) {
                    i12.r(2);
                }
                if (i12.g()) {
                    this.f46266d = true;
                } else {
                    this.f46266d = i12.g();
                }
                if (!this.f46266d) {
                    this.f46267e = true;
                } else if (i12.g()) {
                    this.f46267e = true;
                } else {
                    this.f46267e = i12.g();
                }
                if (g12) {
                    this.f46268f = i12.h(3) + 1;
                } else {
                    this.f46268f = 0;
                }
            }
            this.f46270h = i11;
            this.f46271i = r82;
            this.f46273k = i10;
            i12.r(3);
            boolean g13 = i12.g();
            this.f46274l = g13;
            if (this.f46269g == 2 && g13) {
                this.f46275m = i12.g();
            } else {
                this.f46275m = false;
            }
            if (this.f46269g != 1) {
                this.f46276n = i12.g();
            } else {
                this.f46276n = false;
            }
            if (i12.g()) {
                this.f46280r = (byte) i12.h(8);
                this.f46281s = (byte) i12.h(8);
                this.f46282t = (byte) i12.h(8);
            } else {
                this.f46280r = (byte) 0;
                this.f46281s = (byte) 0;
                this.f46282t = (byte) 0;
            }
            if (this.f46276n) {
                i12.q();
                this.f46277o = false;
                this.f46278p = false;
                this.f46279q = 0;
            } else if (this.f46280r == 1 && this.f46281s == 13 && this.f46282t == 0) {
                this.f46277o = false;
                this.f46278p = false;
                this.f46279q = 0;
            } else {
                i12.q();
                int i15 = this.f46269g;
                if (i15 == 0) {
                    this.f46277o = true;
                    this.f46278p = true;
                } else if (i15 == 1) {
                    this.f46277o = false;
                    this.f46278p = false;
                } else if (this.f46275m) {
                    boolean g14 = i12.g();
                    this.f46277o = g14;
                    if (g14) {
                        this.f46278p = i12.g();
                    } else {
                        this.f46278p = false;
                    }
                } else {
                    this.f46277o = true;
                    this.f46278p = false;
                }
                if (this.f46277o && this.f46278p) {
                    this.f46279q = i12.h(2);
                } else {
                    this.f46279q = 0;
                }
            }
            i12.q();
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        public static void b(I i10) {
            i10.r(64);
            if (i10.g()) {
                AbstractC4231i.d(i10);
            }
        }
    }

    public static int c(ByteBuffer byteBuffer) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            byte b10 = byteBuffer.get();
            i10 |= (b10 & ByteCompanionObject.MAX_VALUE) << (i11 * 7);
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                return i10;
            }
        }
        return i10;
    }

    public static void d(I i10) {
        int i11 = 0;
        while (!i10.g()) {
            i11++;
        }
        if (i11 < 32) {
            i10.r(i11);
        }
    }

    public static List e(ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            byte b10 = asReadOnlyBuffer.get();
            int i10 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                asReadOnlyBuffer.get();
            }
            int c10 = ((b10 >> 1) & 1) != 0 ? c(asReadOnlyBuffer) : asReadOnlyBuffer.remaining();
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            duplicate.limit(asReadOnlyBuffer.position() + c10);
            arrayList.add(new d(i10, duplicate));
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + c10);
        }
        return arrayList;
    }

    public static void f(boolean z10) {
        if (z10) {
            throw new c();
        }
    }
}
