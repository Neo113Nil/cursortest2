package u4;

import N3.M;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import java.util.Arrays;
import java.util.Collections;
import m3.C8049B;
import m3.C8050C;
import m3.N;
import n3.C8434g;
import u4.J;

/* loaded from: classes8.dex */
public final class n implements InterfaceC9958l {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f100091l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final L f100092a;

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f100093b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f100094c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final a f100095d;

    /* renamed from: e, reason: collision with root package name */
    private final v f100096e;

    /* renamed from: f, reason: collision with root package name */
    private b f100097f;

    /* renamed from: g, reason: collision with root package name */
    private long f100098g;

    /* renamed from: h, reason: collision with root package name */
    private String f100099h;

    /* renamed from: i, reason: collision with root package name */
    private M f100100i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f100101j;

    /* renamed from: k, reason: collision with root package name */
    private long f100102k;

    private static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f100103f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f100104a;

        /* renamed from: b, reason: collision with root package name */
        private int f100105b;

        /* renamed from: c, reason: collision with root package name */
        public int f100106c;

        /* renamed from: d, reason: collision with root package name */
        public int f100107d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f100108e;

        public final void a(int i11, int i12, byte[] bArr) {
            if (this.f100104a) {
                int i13 = i12 - i11;
                byte[] bArr2 = this.f100108e;
                int length = bArr2.length;
                int i14 = this.f100106c + i13;
                if (length < i14) {
                    this.f100108e = Arrays.copyOf(bArr2, i14 * 2);
                }
                System.arraycopy(bArr, i11, this.f100108e, this.f100106c, i13);
                this.f100106c += i13;
            }
        }

        public final boolean b(int i11, int i12) {
            int i13 = this.f100105b;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i11 == 179 || i11 == 181) {
                                this.f100106c -= i12;
                                this.f100104a = false;
                                return true;
                            }
                        } else if ((i11 & 240) != 32) {
                            m3.s.f("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f100107d = this.f100106c;
                            this.f100105b = 4;
                        }
                    } else if (i11 > 31) {
                        m3.s.f("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f100105b = 3;
                    }
                } else if (i11 != 181) {
                    m3.s.f("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f100105b = 2;
                }
            } else if (i11 == 176) {
                this.f100105b = 1;
                this.f100104a = true;
            }
            a(0, 3, f100103f);
            return false;
        }

        public final void c() {
            this.f100104a = false;
            this.f100106c = 0;
            this.f100105b = 0;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final M f100109a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f100110b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f100111c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f100112d;

        /* renamed from: e, reason: collision with root package name */
        private int f100113e;

        /* renamed from: f, reason: collision with root package name */
        private int f100114f;

        /* renamed from: g, reason: collision with root package name */
        private long f100115g;

        /* renamed from: h, reason: collision with root package name */
        private long f100116h;

        public b(M m11) {
            this.f100109a = m11;
        }

        public final void a(int i11, int i12, byte[] bArr) {
            if (this.f100111c) {
                int i13 = this.f100114f;
                int i14 = (i11 + 1) - i13;
                if (i14 >= i12) {
                    this.f100114f = (i12 - i11) + i13;
                } else {
                    this.f100112d = ((bArr[i14] & 192) >> 6) == 0;
                    this.f100111c = false;
                }
            }
        }

        public final void b(long j11, int i11, boolean z11) {
            G10.a.h(this.f100116h != -9223372036854775807L);
            if (this.f100113e == 182 && z11 && this.f100110b) {
                this.f100109a.b(this.f100116h, this.f100112d ? 1 : 0, (int) (j11 - this.f100115g), i11, null);
            }
            if (this.f100113e != 179) {
                this.f100115g = j11;
            }
        }

        public final void c(int i11, long j11) {
            this.f100113e = i11;
            this.f100112d = false;
            this.f100110b = i11 == 182 || i11 == 179;
            this.f100111c = i11 == 182;
            this.f100114f = 0;
            this.f100116h = j11;
        }

        public final void d() {
            this.f100110b = false;
            this.f100111c = false;
            this.f100112d = false;
            this.f100113e = -1;
        }
    }

    n(L l11) {
        this.f100092a = l11;
        a aVar = new a();
        aVar.f100108e = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.f100095d = aVar;
        this.f100102k = -9223372036854775807L;
        this.f100096e = new v(178);
        this.f100093b = new C8050C();
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        C8434g.a(this.f100094c);
        this.f100095d.c();
        b bVar = this.f100097f;
        if (bVar != null) {
            bVar.d();
        }
        v vVar = this.f100096e;
        if (vVar != null) {
            vVar.d();
        }
        this.f100098g = 0L;
        this.f100102k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c  */
    @Override // u4.InterfaceC9958l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C8050C c8050c) {
        a aVar;
        v vVar;
        int i11;
        int i12;
        float f7;
        G10.a.i(this.f100097f);
        G10.a.i(this.f100100i);
        int f11 = c8050c.f();
        int i13 = c8050c.i();
        byte[] e11 = c8050c.e();
        this.f100098g += c8050c.a();
        this.f100100i.e(c8050c.a(), c8050c);
        while (true) {
            int b11 = C8434g.b(e11, f11, i13, this.f100094c);
            aVar = this.f100095d;
            vVar = this.f100096e;
            if (b11 == i13) {
                break;
            }
            int i14 = b11 + 3;
            int i15 = c8050c.e()[i14] & 255;
            int i16 = b11 - f11;
            if (!this.f100101j) {
                if (i16 > 0) {
                    aVar.a(f11, b11, e11);
                }
                if (aVar.b(i15, i16 < 0 ? -i16 : 0)) {
                    M m11 = this.f100100i;
                    int i17 = aVar.f100107d;
                    String str = this.f100099h;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(aVar.f100108e, aVar.f100106c);
                    C8049B c8049b = new C8049B(copyOf.length, copyOf);
                    c8049b.q(i17);
                    c8049b.q(4);
                    c8049b.o();
                    c8049b.p(8);
                    if (c8049b.g()) {
                        c8049b.p(4);
                        c8049b.p(3);
                    }
                    int h11 = c8049b.h(4);
                    i11 = i13;
                    if (h11 == 15) {
                        int h12 = c8049b.h(8);
                        int h13 = c8049b.h(8);
                        if (h13 == 0) {
                            m3.s.f("H263Reader", "Invalid aspect ratio");
                            f7 = 1.0f;
                            if (c8049b.g()) {
                                c8049b.p(2);
                                c8049b.p(1);
                                if (c8049b.g()) {
                                    c8049b.p(15);
                                    c8049b.o();
                                    c8049b.p(15);
                                    c8049b.o();
                                    c8049b.p(15);
                                    c8049b.o();
                                    c8049b.p(3);
                                    c8049b.p(11);
                                    c8049b.o();
                                    c8049b.p(15);
                                    c8049b.o();
                                }
                            }
                            if (c8049b.h(2) != 0) {
                                m3.s.f("H263Reader", "Unhandled video object layer shape");
                            }
                            c8049b.o();
                            int h14 = c8049b.h(16);
                            c8049b.o();
                            if (c8049b.g()) {
                                if (h14 == 0) {
                                    m3.s.f("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i18 = 0;
                                    for (int i19 = h14 - 1; i19 > 0; i19 >>= 1) {
                                        i18++;
                                    }
                                    c8049b.p(i18);
                                }
                            }
                            c8049b.o();
                            int h15 = c8049b.h(13);
                            c8049b.o();
                            int h16 = c8049b.h(13);
                            c8049b.o();
                            c8049b.o();
                            C7272n.a aVar2 = new C7272n.a();
                            aVar2.j0(str);
                            aVar2.W("video/mp2t");
                            aVar2.y0("video/mp4v-es");
                            aVar2.F0(h15);
                            aVar2.h0(h16);
                            aVar2.u0(f7);
                            aVar2.k0(Collections.singletonList(copyOf));
                            m11.a(aVar2.P());
                            this.f100101j = true;
                        } else {
                            f7 = h12 / h13;
                            if (c8049b.g()) {
                            }
                            if (c8049b.h(2) != 0) {
                            }
                            c8049b.o();
                            int h142 = c8049b.h(16);
                            c8049b.o();
                            if (c8049b.g()) {
                            }
                            c8049b.o();
                            int h152 = c8049b.h(13);
                            c8049b.o();
                            int h162 = c8049b.h(13);
                            c8049b.o();
                            c8049b.o();
                            C7272n.a aVar22 = new C7272n.a();
                            aVar22.j0(str);
                            aVar22.W("video/mp2t");
                            aVar22.y0("video/mp4v-es");
                            aVar22.F0(h152);
                            aVar22.h0(h162);
                            aVar22.u0(f7);
                            aVar22.k0(Collections.singletonList(copyOf));
                            m11.a(aVar22.P());
                            this.f100101j = true;
                        }
                    } else if (h11 < 7) {
                        f7 = f100091l[h11];
                        if (c8049b.g()) {
                        }
                        if (c8049b.h(2) != 0) {
                        }
                        c8049b.o();
                        int h1422 = c8049b.h(16);
                        c8049b.o();
                        if (c8049b.g()) {
                        }
                        c8049b.o();
                        int h1522 = c8049b.h(13);
                        c8049b.o();
                        int h1622 = c8049b.h(13);
                        c8049b.o();
                        c8049b.o();
                        C7272n.a aVar222 = new C7272n.a();
                        aVar222.j0(str);
                        aVar222.W("video/mp2t");
                        aVar222.y0("video/mp4v-es");
                        aVar222.F0(h1522);
                        aVar222.h0(h1622);
                        aVar222.u0(f7);
                        aVar222.k0(Collections.singletonList(copyOf));
                        m11.a(aVar222.P());
                        this.f100101j = true;
                    } else {
                        m3.s.f("H263Reader", "Invalid aspect ratio");
                        f7 = 1.0f;
                        if (c8049b.g()) {
                        }
                        if (c8049b.h(2) != 0) {
                        }
                        c8049b.o();
                        int h14222 = c8049b.h(16);
                        c8049b.o();
                        if (c8049b.g()) {
                        }
                        c8049b.o();
                        int h15222 = c8049b.h(13);
                        c8049b.o();
                        int h16222 = c8049b.h(13);
                        c8049b.o();
                        c8049b.o();
                        C7272n.a aVar2222 = new C7272n.a();
                        aVar2222.j0(str);
                        aVar2222.W("video/mp2t");
                        aVar2222.y0("video/mp4v-es");
                        aVar2222.F0(h15222);
                        aVar2222.h0(h16222);
                        aVar2222.u0(f7);
                        aVar2222.k0(Collections.singletonList(copyOf));
                        m11.a(aVar2222.P());
                        this.f100101j = true;
                    }
                    this.f100097f.a(f11, b11, e11);
                    if (vVar != null) {
                        if (i16 > 0) {
                            vVar.a(f11, b11, e11);
                            i12 = 0;
                        } else {
                            i12 = -i16;
                        }
                        if (vVar.b(i12)) {
                            int m12 = C8434g.m(vVar.f100268e, vVar.f100267d);
                            int i21 = N.f74289a;
                            byte[] bArr = vVar.f100267d;
                            C8050C c8050c2 = this.f100093b;
                            c8050c2.P(m12, bArr);
                            this.f100092a.b(this.f100102k, c8050c2);
                        }
                        if (i15 == 178) {
                            if (c8050c.e()[b11 + 2] == 1) {
                                vVar.e(i15);
                            }
                            int i22 = i11 - b11;
                            this.f100097f.b(this.f100098g - i22, i22, this.f100101j);
                            this.f100097f.c(i15, this.f100102k);
                            f11 = i14;
                            i13 = i11;
                        }
                    }
                    int i222 = i11 - b11;
                    this.f100097f.b(this.f100098g - i222, i222, this.f100101j);
                    this.f100097f.c(i15, this.f100102k);
                    f11 = i14;
                    i13 = i11;
                }
            }
            i11 = i13;
            this.f100097f.a(f11, b11, e11);
            if (vVar != null) {
            }
            int i2222 = i11 - b11;
            this.f100097f.b(this.f100098g - i2222, i2222, this.f100101j);
            this.f100097f.c(i15, this.f100102k);
            f11 = i14;
            i13 = i11;
        }
        if (!this.f100101j) {
            aVar.a(f11, i13, e11);
        }
        this.f100097f.a(f11, i13, e11);
        if (vVar != null) {
            vVar.a(f11, i13, e11);
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100102k = j11;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100099h = dVar.b();
        M track = rVar.track(dVar.c(), 2);
        this.f100100i = track;
        this.f100097f = new b(track);
        this.f100092a.c(rVar, dVar);
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
        G10.a.i(this.f100097f);
        if (z11) {
            this.f100097f.b(this.f100098g, 0, this.f100101j);
            this.f100097f.d();
        }
    }
}
