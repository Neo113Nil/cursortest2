package u4;

import N3.M;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import java.util.Arrays;
import java.util.Collections;
import m3.C8050C;
import m3.N;
import n3.C8434g;
import u4.J;

/* loaded from: classes8.dex */
public final class m implements InterfaceC9958l {

    /* renamed from: r, reason: collision with root package name */
    private static final double[] f100068r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f100069a;

    /* renamed from: b, reason: collision with root package name */
    private M f100070b;

    /* renamed from: c, reason: collision with root package name */
    private final L f100071c;

    /* renamed from: d, reason: collision with root package name */
    private final String f100072d;

    /* renamed from: e, reason: collision with root package name */
    private final C8050C f100073e;

    /* renamed from: f, reason: collision with root package name */
    private final v f100074f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f100075g;

    /* renamed from: h, reason: collision with root package name */
    private final a f100076h;

    /* renamed from: i, reason: collision with root package name */
    private long f100077i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f100078j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f100079k;

    /* renamed from: l, reason: collision with root package name */
    private long f100080l;

    /* renamed from: m, reason: collision with root package name */
    private long f100081m;

    /* renamed from: n, reason: collision with root package name */
    private long f100082n;

    /* renamed from: o, reason: collision with root package name */
    private long f100083o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f100084p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f100085q;

    private static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f100086e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f100087a;

        /* renamed from: b, reason: collision with root package name */
        public int f100088b;

        /* renamed from: c, reason: collision with root package name */
        public int f100089c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f100090d;

        public final void a(int i11, int i12, byte[] bArr) {
            if (this.f100087a) {
                int i13 = i12 - i11;
                byte[] bArr2 = this.f100090d;
                int length = bArr2.length;
                int i14 = this.f100088b + i13;
                if (length < i14) {
                    this.f100090d = Arrays.copyOf(bArr2, i14 * 2);
                }
                System.arraycopy(bArr, i11, this.f100090d, this.f100088b, i13);
                this.f100088b += i13;
            }
        }

        public final boolean b(int i11, int i12) {
            if (this.f100087a) {
                int i13 = this.f100088b - i12;
                this.f100088b = i13;
                if (this.f100089c != 0 || i11 != 181) {
                    this.f100087a = false;
                    return true;
                }
                this.f100089c = i13;
            } else if (i11 == 179) {
                this.f100087a = true;
            }
            a(0, 3, f100086e);
            return false;
        }

        public final void c() {
            this.f100087a = false;
            this.f100088b = 0;
            this.f100089c = 0;
        }
    }

    public m() {
        this(null, "video/mp2p");
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        C8434g.a(this.f100075g);
        this.f100076h.c();
        v vVar = this.f100074f;
        if (vVar != null) {
            vVar.d();
        }
        this.f100077i = 0L;
        this.f100078j = false;
        this.f100081m = -9223372036854775807L;
        this.f100083o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e3  */
    @Override // u4.InterfaceC9958l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C8050C c8050c) {
        a aVar;
        v vVar;
        char c11;
        int i11;
        long j11;
        boolean z11;
        boolean z12;
        long j12;
        int i12;
        float f7;
        long j13;
        float f11;
        int i13;
        char c12 = 3;
        G10.a.i(this.f100070b);
        int f12 = c8050c.f();
        int i14 = c8050c.i();
        byte[] e11 = c8050c.e();
        this.f100077i += c8050c.a();
        this.f100070b.e(c8050c.a(), c8050c);
        while (true) {
            int b11 = C8434g.b(e11, f12, i14, this.f100075g);
            aVar = this.f100076h;
            vVar = this.f100074f;
            if (b11 == i14) {
                break;
            }
            int i15 = b11 + 3;
            int i16 = c8050c.e()[i15] & 255;
            int i17 = b11 - f12;
            if (!this.f100079k) {
                if (i17 > 0) {
                    aVar.a(f12, b11, e11);
                }
                if (aVar.b(i16, i17 < 0 ? -i17 : 0)) {
                    String str = this.f100069a;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(aVar.f100090d, aVar.f100088b);
                    int i18 = copyOf[4] & 255;
                    byte b12 = copyOf[5];
                    int i19 = (i18 << 4) | ((b12 & 255) >> 4);
                    int i21 = ((b12 & 15) << 8) | (copyOf[6] & 255);
                    int i22 = (copyOf[7] & 240) >> 4;
                    if (i22 != 2) {
                        if (i22 == 3) {
                            f11 = i21 * 16;
                            i13 = i19 * 9;
                        } else if (i22 != 4) {
                            f7 = 1.0f;
                            c11 = 3;
                        } else {
                            f11 = i21 * 121;
                            i13 = i19 * 100;
                        }
                        f7 = f11 / i13;
                        c11 = 3;
                    } else {
                        c11 = 3;
                        f7 = (i21 * 4) / (i19 * 3);
                    }
                    C7272n.a aVar2 = new C7272n.a();
                    aVar2.j0(str);
                    aVar2.W(this.f100072d);
                    aVar2.y0("video/mpeg2");
                    aVar2.F0(i19);
                    aVar2.h0(i21);
                    aVar2.u0(f7);
                    aVar2.k0(Collections.singletonList(copyOf));
                    C7272n P11 = aVar2.P();
                    int i23 = (copyOf[7] & 15) - 1;
                    if (i23 < 0 || i23 >= 8) {
                        j13 = 0;
                    } else {
                        double d11 = f100068r[i23];
                        byte b13 = copyOf[aVar.f100089c + 9];
                        int i24 = (b13 & 96) >> 5;
                        if (i24 != (b13 & 31)) {
                            d11 = ((i24 + 1.0d) / (r4 + 1)) * d11;
                        }
                        j13 = (long) (1000000.0d / d11);
                    }
                    Pair create = Pair.create(P11, Long.valueOf(j13));
                    this.f100070b.a((C7272n) create.first);
                    this.f100080l = ((Long) create.second).longValue();
                    this.f100079k = true;
                    if (vVar != null) {
                        if (i17 > 0) {
                            vVar.a(f12, b11, e11);
                            i12 = 0;
                        } else {
                            i12 = -i17;
                        }
                        if (vVar.b(i12)) {
                            int m11 = C8434g.m(vVar.f100268e, vVar.f100267d);
                            int i25 = N.f74289a;
                            byte[] bArr = vVar.f100267d;
                            C8050C c8050c2 = this.f100073e;
                            c8050c2.P(m11, bArr);
                            this.f100071c.b(this.f100083o, c8050c2);
                        }
                        if (i16 == 178) {
                            if (c8050c.e()[b11 + 2] == 1) {
                                vVar.e(i16);
                            }
                            if (i16 != 0 || i16 == 179) {
                                i11 = i14 - b11;
                                if (this.f100085q && this.f100079k) {
                                    j12 = this.f100083o;
                                    if (j12 != -9223372036854775807L) {
                                        this.f100070b.b(j12, this.f100084p ? 1 : 0, ((int) (this.f100077i - this.f100082n)) - i11, i11, null);
                                    }
                                }
                                if (this.f100078j || this.f100085q) {
                                    this.f100082n = this.f100077i - i11;
                                    j11 = this.f100081m;
                                    if (j11 == -9223372036854775807L) {
                                        long j14 = this.f100083o;
                                        j11 = j14 != -9223372036854775807L ? j14 + this.f100080l : -9223372036854775807L;
                                    }
                                    this.f100083o = j11;
                                    z11 = false;
                                    this.f100084p = false;
                                    this.f100081m = -9223372036854775807L;
                                    z12 = true;
                                    this.f100078j = true;
                                } else {
                                    z11 = false;
                                    z12 = true;
                                }
                                this.f100085q = i16 == 0 ? z12 : z11;
                            } else if (i16 == 184) {
                                this.f100084p = true;
                            }
                            f12 = i15;
                            c12 = c11;
                        }
                    }
                    if (i16 != 0) {
                    }
                    i11 = i14 - b11;
                    if (this.f100085q) {
                        j12 = this.f100083o;
                        if (j12 != -9223372036854775807L) {
                        }
                    }
                    if (this.f100078j) {
                    }
                    this.f100082n = this.f100077i - i11;
                    j11 = this.f100081m;
                    if (j11 == -9223372036854775807L) {
                    }
                    this.f100083o = j11;
                    z11 = false;
                    this.f100084p = false;
                    this.f100081m = -9223372036854775807L;
                    z12 = true;
                    this.f100078j = true;
                    this.f100085q = i16 == 0 ? z12 : z11;
                    f12 = i15;
                    c12 = c11;
                }
            }
            c11 = c12;
            if (vVar != null) {
            }
            if (i16 != 0) {
            }
            i11 = i14 - b11;
            if (this.f100085q) {
            }
            if (this.f100078j) {
            }
            this.f100082n = this.f100077i - i11;
            j11 = this.f100081m;
            if (j11 == -9223372036854775807L) {
            }
            this.f100083o = j11;
            z11 = false;
            this.f100084p = false;
            this.f100081m = -9223372036854775807L;
            z12 = true;
            this.f100078j = true;
            this.f100085q = i16 == 0 ? z12 : z11;
            f12 = i15;
            c12 = c11;
        }
        if (!this.f100079k) {
            aVar.a(f12, i14, e11);
        }
        if (vVar != null) {
            vVar.a(f12, i14, e11);
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100081m = j11;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100069a = dVar.b();
        this.f100070b = rVar.track(dVar.c(), 2);
        L l11 = this.f100071c;
        if (l11 != null) {
            l11.c(rVar, dVar);
        }
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
        G10.a.i(this.f100070b);
        if (z11) {
            boolean z12 = this.f100084p;
            this.f100070b.b(this.f100083o, z12 ? 1 : 0, (int) (this.f100077i - this.f100082n), 0, null);
        }
    }

    m(L l11, String str) {
        this.f100071c = l11;
        this.f100072d = str;
        this.f100075g = new boolean[4];
        a aVar = new a();
        aVar.f100090d = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.f100076h = aVar;
        if (l11 != null) {
            this.f100074f = new v(178);
            this.f100073e = new C8050C();
        } else {
            this.f100074f = null;
            this.f100073e = null;
        }
        this.f100081m = -9223372036854775807L;
        this.f100083o = -9223372036854775807L;
    }
}
