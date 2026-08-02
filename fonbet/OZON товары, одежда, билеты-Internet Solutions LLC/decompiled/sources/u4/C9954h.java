package u4;

import N3.C3650a;
import N3.C3663n;
import N3.M;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import java.util.Arrays;
import java.util.Collections;
import m3.C8049B;
import m3.C8050C;
import m3.N;
import u4.J;

/* renamed from: u4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9954h implements InterfaceC9958l {

    /* renamed from: x, reason: collision with root package name */
    private static final byte[] f100019x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f100020a;

    /* renamed from: d, reason: collision with root package name */
    private final String f100023d;

    /* renamed from: e, reason: collision with root package name */
    private final int f100024e;

    /* renamed from: f, reason: collision with root package name */
    private final String f100025f;

    /* renamed from: g, reason: collision with root package name */
    private String f100026g;

    /* renamed from: h, reason: collision with root package name */
    private M f100027h;

    /* renamed from: i, reason: collision with root package name */
    private M f100028i;

    /* renamed from: m, reason: collision with root package name */
    private boolean f100032m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f100033n;

    /* renamed from: q, reason: collision with root package name */
    private int f100036q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f100037r;

    /* renamed from: t, reason: collision with root package name */
    private int f100039t;

    /* renamed from: v, reason: collision with root package name */
    private M f100041v;

    /* renamed from: w, reason: collision with root package name */
    private long f100042w;

    /* renamed from: b, reason: collision with root package name */
    private final C8049B f100021b = new C8049B(7, new byte[7]);

    /* renamed from: c, reason: collision with root package name */
    private final C8050C f100022c = new C8050C(Arrays.copyOf(f100019x, 10));

    /* renamed from: o, reason: collision with root package name */
    private int f100034o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f100035p = -1;

    /* renamed from: s, reason: collision with root package name */
    private long f100038s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    private long f100040u = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private int f100029j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f100030k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f100031l = 256;

    public C9954h(int i11, String str, String str2, boolean z11) {
        this.f100020a = z11;
        this.f100023d = str;
        this.f100024e = i11;
        this.f100025f = str2;
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100040u = -9223372036854775807L;
        this.f100033n = false;
        this.f100029j = 0;
        this.f100030k = 0;
        this.f100031l = 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ca, code lost:
    
        r24.f100036q = (r9 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02d2, code lost:
    
        if ((r9 & 1) != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02d4, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02d8, code lost:
    
        r24.f100032m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02dc, code lost:
    
        if (r24.f100033n != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02de, code lost:
    
        r3 = r22;
        r24.f100029j = r3 == true ? 1 : 0;
        r24.f100030k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02ed, code lost:
    
        r25.R(r15);
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e5, code lost:
    
        r3 = r22;
        r24.f100029j = r18;
        r24.f100030k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02d7, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0242, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.InterfaceC9958l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C8050C c8050c) throws j3.v {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = -1;
        int i17 = 2;
        boolean z11 = 1;
        this.f100027h.getClass();
        int i18 = N.f74289a;
        while (c8050c.a() > 0) {
            int i19 = this.f100029j;
            C8049B c8049b = this.f100021b;
            int i21 = 4;
            int i22 = 3;
            C8050C c8050c2 = this.f100022c;
            if (i19 == 0) {
                int i23 = 7;
                byte[] e11 = c8050c.e();
                int f7 = c8050c.f();
                int i24 = c8050c.i();
                int i25 = z11;
                while (true) {
                    if (f7 >= i24) {
                        int i26 = i25;
                        i11 = i16;
                        i12 = i26;
                        c8050c.R(f7);
                        break;
                    }
                    int i27 = f7 + 1;
                    byte b11 = e11[f7];
                    int i28 = i22;
                    int i29 = b11 & 255;
                    if (this.f100031l != 512 || ((65280 | (((byte) i29) & 255)) & 65526) != 65520) {
                        int i31 = i25;
                        i11 = i16;
                        i12 = i31;
                    } else {
                        if (this.f100033n) {
                            i14 = i25;
                            i11 = i16;
                            break;
                        }
                        int i32 = f7 - 1;
                        c8050c.R(f7);
                        byte[] bArr = c8049b.f74257a;
                        if (c8050c.a() < i25) {
                            i14 = i25;
                        } else {
                            c8050c.n(0, i25, bArr);
                            c8049b.n(i21);
                            int h11 = c8049b.h(i25);
                            int i33 = this.f100034o;
                            if (i33 == -1 || h11 == i33) {
                                if (this.f100035p != -1) {
                                    byte[] bArr2 = c8049b.f74257a;
                                    if (c8050c.a() < i25) {
                                        i14 = i25;
                                        break;
                                    }
                                    c8050c.n(0, i25, bArr2);
                                    c8049b.n(2);
                                    i15 = 4;
                                    i14 = i25;
                                    if (c8049b.h(4) == this.f100035p) {
                                        c8050c.R(i27);
                                    }
                                } else {
                                    i14 = i25;
                                    i15 = 4;
                                }
                                byte[] bArr3 = c8049b.f74257a;
                                if (c8050c.a() >= i15) {
                                    c8050c.n(0, i15, bArr3);
                                    c8049b.n(14);
                                    int h12 = c8049b.h(13);
                                    if (h12 >= i23) {
                                        byte[] e12 = c8050c.e();
                                        int i34 = c8050c.i();
                                        int i35 = i32 + h12;
                                        if (i35 < i34) {
                                            byte b12 = e12[i35];
                                            i11 = -1;
                                            if (b12 != -1) {
                                                if (b12 == 73) {
                                                    int i36 = i35 + 1;
                                                    if (i36 != i34) {
                                                        if (e12[i36] == 68) {
                                                            int i37 = i35 + 2;
                                                            if (i37 != i34) {
                                                                if (e12[i37] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i38 = i35 + 1;
                                                if (i38 != i34) {
                                                    byte b13 = e12[i38];
                                                    if (((65280 | (b13 & 255)) & 65526) == 65520 && ((b13 & 8) >> 3) == h11) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                i14 = i25;
                                i11 = -1;
                            }
                            i12 = i14;
                        }
                        i11 = -1;
                        i12 = i14;
                    }
                    int i39 = this.f100031l;
                    int i41 = i39 | i29;
                    if (i41 == 329) {
                        i17 = 2;
                        i13 = 3;
                        this.f100031l = 768;
                    } else if (i41 == 511) {
                        i17 = 2;
                        i13 = 3;
                        this.f100031l = UserVerificationMethods.USER_VERIFY_NONE;
                    } else if (i41 == 836) {
                        i17 = 2;
                        i13 = 3;
                        this.f100031l = UserVerificationMethods.USER_VERIFY_ALL;
                    } else {
                        if (i41 == 1075) {
                            i17 = 2;
                            this.f100029j = 2;
                            this.f100030k = 3;
                            this.f100039t = 0;
                            c8050c2.R(0);
                            c8050c.R(i27);
                            break;
                        }
                        if (i39 != 256) {
                            this.f100031l = 256;
                            i17 = 2;
                            i13 = 3;
                            int i42 = i11;
                            i25 = i12 == true ? 1 : 0;
                            i16 = i42;
                            i22 = i13;
                            i21 = 4;
                            i23 = 7;
                        } else {
                            i17 = 2;
                            i13 = 3;
                        }
                    }
                    f7 = i27;
                    int i422 = i11;
                    i25 = i12 == true ? 1 : 0;
                    i16 = i422;
                    i22 = i13;
                    i21 = 4;
                    i23 = 7;
                }
                int i43 = i11;
                z11 = i12;
                i16 = i43;
            } else if (i19 != z11) {
                if (i19 == i17) {
                    byte[] e13 = c8050c2.e();
                    int min = Math.min(c8050c.a(), 10 - this.f100030k);
                    c8050c.n(this.f100030k, min, e13);
                    int i44 = this.f100030k + min;
                    this.f100030k = i44;
                    if (i44 == 10) {
                        this.f100028i.e(10, c8050c2);
                        c8050c2.R(6);
                        M m11 = this.f100028i;
                        int D11 = c8050c2.D() + 10;
                        this.f100029j = 4;
                        this.f100030k = 10;
                        this.f100041v = m11;
                        this.f100042w = 0L;
                        this.f100039t = D11;
                    }
                } else if (i19 == 3) {
                    int i45 = this.f100032m ? 7 : 5;
                    byte[] bArr4 = c8049b.f74257a;
                    int min2 = Math.min(c8050c.a(), i45 - this.f100030k);
                    c8050c.n(this.f100030k, min2, bArr4);
                    int i46 = this.f100030k + min2;
                    this.f100030k = i46;
                    if (i46 == i45) {
                        c8049b.n(0);
                        if (this.f100037r) {
                            c8049b.p(10);
                        } else {
                            int h13 = c8049b.h(i17) + (z11 ? 1 : 0);
                            if (h13 != i17) {
                                m3.s.f("AdtsReader", "Detected audio object type: " + h13 + ", but assuming AAC LC.");
                                h13 = i17;
                            }
                            c8049b.p(5);
                            int h14 = c8049b.h(3);
                            int i47 = this.f100035p;
                            byte b14 = (byte) (((h13 << 3) & 248) | ((i47 >> 1) & 7));
                            byte b15 = (byte) (((h14 << 3) & 120) | ((i47 << 7) & UserVerificationMethods.USER_VERIFY_PATTERN));
                            byte[] bArr5 = new byte[i17];
                            bArr5[0] = b14;
                            bArr5[z11 ? 1 : 0] = b15;
                            C3650a.C0354a b16 = C3650a.b(new C8049B(i17, bArr5), false);
                            C7272n.a aVar = new C7272n.a();
                            aVar.j0(this.f100026g);
                            aVar.W(this.f100025f);
                            aVar.y0("audio/mp4a-latm");
                            aVar.U(b16.f18544c);
                            aVar.T(b16.f18543b);
                            aVar.z0(b16.f18542a);
                            aVar.k0(Collections.singletonList(bArr5));
                            aVar.n0(this.f100023d);
                            aVar.w0(this.f100024e);
                            C7272n P11 = aVar.P();
                            this.f100038s = 1024000000 / P11.f69103H;
                            this.f100027h.a(P11);
                            this.f100037r = z11;
                        }
                        c8049b.p(4);
                        int h15 = c8049b.h(13);
                        int i48 = h15 - 7;
                        if (this.f100032m) {
                            i48 = h15 - 9;
                        }
                        M m12 = this.f100027h;
                        long j11 = this.f100038s;
                        this.f100029j = 4;
                        this.f100030k = 0;
                        this.f100041v = m12;
                        this.f100042w = j11;
                        this.f100039t = i48;
                    }
                } else {
                    if (i19 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(c8050c.a(), this.f100039t - this.f100030k);
                    this.f100041v.e(min3, c8050c);
                    int i49 = this.f100030k + min3;
                    this.f100030k = i49;
                    if (i49 == this.f100039t) {
                        G10.a.h(this.f100040u != -9223372036854775807L ? z11 ? 1 : 0 : false);
                        this.f100041v.b(this.f100040u, 1, this.f100039t, 0, null);
                        this.f100040u += this.f100042w;
                        this.f100029j = 0;
                        this.f100030k = 0;
                        this.f100031l = 256;
                    }
                }
            } else if (c8050c.a() != 0) {
                c8049b.f74257a[0] = c8050c.e()[c8050c.f()];
                c8049b.n(i17);
                int h16 = c8049b.h(4);
                int i51 = this.f100035p;
                if (i51 == i16 || h16 == i51) {
                    if (!this.f100033n) {
                        this.f100033n = z11;
                        this.f100034o = this.f100036q;
                        this.f100035p = h16;
                    }
                    this.f100029j = 3;
                    this.f100030k = 0;
                } else {
                    this.f100033n = false;
                    this.f100029j = 0;
                    this.f100030k = 0;
                    this.f100031l = 256;
                }
            }
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100040u = j11;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100026g = dVar.b();
        M track = rVar.track(dVar.c(), 1);
        this.f100027h = track;
        this.f100041v = track;
        if (!this.f100020a) {
            this.f100028i = new C3663n();
            return;
        }
        dVar.a();
        M track2 = rVar.track(dVar.c(), 5);
        this.f100028i = track2;
        C7272n.a aVar = new C7272n.a();
        aVar.j0(dVar.b());
        aVar.W(this.f100025f);
        aVar.y0("application/id3");
        track2.a(aVar.P());
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
    }
}
