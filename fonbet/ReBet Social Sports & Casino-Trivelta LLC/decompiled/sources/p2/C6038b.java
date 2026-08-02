package p2;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.O;
import H1.T;
import H1.r;
import H1.u;
import android.util.Pair;
import androidx.media3.common.a;
import b1.C2338G;
import com.plaid.internal.EnumC3631g;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.J;
import e1.Z;
import io.agora.rtc2.Constants;
import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6038b implements InterfaceC1183p {

    /* renamed from: h, reason: collision with root package name */
    public static final u f62988h = new u() { // from class: p2.a
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return C6038b.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public r f62989a;

    /* renamed from: b, reason: collision with root package name */
    public O f62990b;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0869b f62993e;

    /* renamed from: c, reason: collision with root package name */
    public int f62991c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f62992d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f62994f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f62995g = -1;

    /* renamed from: p2.b$a */
    public static final class a implements InterfaceC0869b {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 157, EnumC3631g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC3631g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 253, EnumC3631g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 307, 337, 371, 408, 449, 494, 544, 598, 658, Constants.AUDIO_MIXING_REASON_STOPPED_BY_USER, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final r f62996a;

        /* renamed from: b, reason: collision with root package name */
        public final O f62997b;

        /* renamed from: c, reason: collision with root package name */
        public final C6039c f62998c;

        /* renamed from: d, reason: collision with root package name */
        public final int f62999d;

        /* renamed from: e, reason: collision with root package name */
        public final J f63000e;

        /* renamed from: f, reason: collision with root package name */
        public final int f63001f;

        /* renamed from: g, reason: collision with root package name */
        public final androidx.media3.common.a f63002g;

        /* renamed from: h, reason: collision with root package name */
        public int f63003h;

        /* renamed from: i, reason: collision with root package name */
        public long f63004i;
        private final byte[] inputData;

        /* renamed from: j, reason: collision with root package name */
        public int f63005j;

        /* renamed from: k, reason: collision with root package name */
        public long f63006k;

        public a(r rVar, O o10, C6039c c6039c) {
            this.f62996a = rVar;
            this.f62997b = o10;
            this.f62998c = c6039c;
            int max = Math.max(1, c6039c.f63017c / 10);
            this.f63001f = max;
            J j10 = new J(c6039c.extraData);
            j10.E();
            int E10 = j10.E();
            this.f62999d = E10;
            int i10 = c6039c.f63016b;
            int i11 = (((c6039c.f63019e - (i10 * 4)) * 8) / (c6039c.f63020f * i10)) + 1;
            if (E10 == i11) {
                int k10 = Z.k(max, E10);
                this.inputData = new byte[c6039c.f63019e * k10];
                this.f63000e = new J(k10 * h(E10, i10));
                int i12 = ((c6039c.f63017c * c6039c.f63019e) * 8) / E10;
                this.f63002g = new a.b().y0("audio/raw").S(i12).t0(i12).o0(h(max, i10)).T(c6039c.f63016b).z0(c6039c.f63017c).s0(2).P();
                return;
            }
            throw C2338G.a("Expected frames per block: " + i11 + "; got: " + E10, null);
        }

        public static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        @Override // p2.C6038b.InterfaceC0869b
        public void a(int i10, long j10) {
            C6041e c6041e = new C6041e(this.f62998c, this.f62999d, i10, j10);
            this.f62996a.q(c6041e);
            this.f62997b.c(this.f63002g);
            this.f62997b.d(c6041e.m());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // p2.C6038b.InterfaceC0869b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean b(InterfaceC1184q interfaceC1184q, long j10) {
            boolean z10;
            int i10;
            int f10;
            int k10 = Z.k(this.f63001f - f(this.f63005j), this.f62999d) * this.f62998c.f63019e;
            if (j10 != 0) {
                z10 = false;
                while (!z10) {
                    if (this.f63003h >= k10) {
                        break;
                    }
                    int read = interfaceC1184q.read(this.inputData, this.f63003h, (int) Math.min(k10 - r3, j10));
                    if (read != -1) {
                        this.f63003h += read;
                    }
                }
                i10 = this.f63003h / this.f62998c.f63019e;
                if (i10 > 0) {
                    d(this.inputData, i10, this.f63000e);
                    this.f63003h -= i10 * this.f62998c.f63019e;
                    int j11 = this.f63000e.j();
                    this.f62997b.a(this.f63000e, j11);
                    int i11 = this.f63005j + j11;
                    this.f63005j = i11;
                    int f11 = f(i11);
                    int i12 = this.f63001f;
                    if (f11 >= i12) {
                        i(i12);
                    }
                }
                if (z10 && (f10 = f(this.f63005j)) > 0) {
                    i(f10);
                }
                return z10;
            }
            z10 = true;
            while (!z10) {
            }
            i10 = this.f63003h / this.f62998c.f63019e;
            if (i10 > 0) {
            }
            if (z10) {
                i(f10);
            }
            return z10;
        }

        @Override // p2.C6038b.InterfaceC0869b
        public void c(long j10) {
            this.f63003h = 0;
            this.f63004i = j10;
            this.f63005j = 0;
            this.f63006k = 0L;
        }

        public final void d(byte[] bArr, int i10, J j10) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f62998c.f63016b; i12++) {
                    e(bArr, i11, i12, j10.f());
                }
            }
            int g10 = g(this.f62999d * i10);
            j10.b0(0);
            j10.a0(g10);
        }

        public final void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            C6039c c6039c = this.f62998c;
            int i12 = c6039c.f63019e;
            int i13 = c6039c.f63016b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i14] & UByte.MAX_VALUE));
            int min = Math.min(bArr[i14 + 2] & UByte.MAX_VALUE, 88);
            int i18 = STEP_TABLE[min];
            int i19 = ((i10 * this.f62999d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                byte b10 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)];
                int i21 = i20 % 2 == 0 ? b10 & 15 : (b10 & UByte.MAX_VALUE) >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i18) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                i17 = Z.o(i17 + i22, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i23 = min + INDEX_TABLE[i21];
                int[] iArr = STEP_TABLE;
                min = Z.o(i23, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        public final int f(int i10) {
            return i10 / (this.f62998c.f63016b * 2);
        }

        public final int g(int i10) {
            return h(i10, this.f62998c.f63016b);
        }

        public final void i(int i10) {
            long p12 = this.f63004i + Z.p1(this.f63006k, 1000000L, this.f62998c.f63017c);
            int g10 = g(i10);
            this.f62997b.g(p12, 1, g10, this.f63005j - g10, null);
            this.f63006k += i10;
            this.f63005j -= g10;
        }
    }

    /* renamed from: p2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0869b {
        void a(int i10, long j10);

        boolean b(InterfaceC1184q interfaceC1184q, long j10);

        void c(long j10);
    }

    /* renamed from: p2.b$c */
    public static final class c implements InterfaceC0869b {

        /* renamed from: a, reason: collision with root package name */
        public final r f63007a;

        /* renamed from: b, reason: collision with root package name */
        public final O f63008b;

        /* renamed from: c, reason: collision with root package name */
        public final C6039c f63009c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.media3.common.a f63010d;

        /* renamed from: e, reason: collision with root package name */
        public final int f63011e;

        /* renamed from: f, reason: collision with root package name */
        public long f63012f;

        /* renamed from: g, reason: collision with root package name */
        public int f63013g;

        /* renamed from: h, reason: collision with root package name */
        public long f63014h;

        public c(r rVar, O o10, C6039c c6039c, String str, int i10) {
            this.f63007a = rVar;
            this.f63008b = o10;
            this.f63009c = c6039c;
            int i11 = (c6039c.f63016b * c6039c.f63020f) / 8;
            if (c6039c.f63019e == i11) {
                int i12 = c6039c.f63017c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f63011e = max;
                this.f63010d = new a.b().W("audio/wav").y0(str).S(i13).t0(i13).o0(max).T(c6039c.f63016b).z0(c6039c.f63017c).s0(i10).P();
                return;
            }
            throw C2338G.a("Expected block size: " + i11 + "; got: " + c6039c.f63019e, null);
        }

        @Override // p2.C6038b.InterfaceC0869b
        public void a(int i10, long j10) {
            C6041e c6041e = new C6041e(this.f63009c, 1, i10, j10);
            this.f63007a.q(c6041e);
            this.f63008b.c(this.f63010d);
            this.f63008b.d(c6041e.m());
        }

        @Override // p2.C6038b.InterfaceC0869b
        public boolean b(InterfaceC1184q interfaceC1184q, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f63013g) < (i11 = this.f63011e)) {
                int e10 = this.f63008b.e(interfaceC1184q, (int) Math.min(i11 - i10, j11), true);
                if (e10 == -1) {
                    j11 = 0;
                } else {
                    this.f63013g += e10;
                    j11 -= e10;
                }
            }
            int i12 = this.f63009c.f63019e;
            int i13 = this.f63013g / i12;
            if (i13 > 0) {
                long p12 = this.f63012f + Z.p1(this.f63014h, 1000000L, r1.f63017c);
                int i14 = i13 * i12;
                int i15 = this.f63013g - i14;
                this.f63008b.g(p12, 1, i14, i15, null);
                this.f63014h += i13;
                this.f63013g = i15;
            }
            return j11 <= 0;
        }

        @Override // p2.C6038b.InterfaceC0869b
        public void c(long j10) {
            this.f63012f = j10;
            this.f63013g = 0;
            this.f63014h = 0L;
        }
    }

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new C6038b()};
    }

    private void d() {
        AbstractC4134a.i(this.f62990b);
        Z.i(this.f62989a);
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        this.f62991c = j10 == 0 ? 0 : 4;
        InterfaceC0869b interfaceC0869b = this.f62993e;
        if (interfaceC0869b != null) {
            interfaceC0869b.c(j11);
        }
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f62989a = rVar;
        this.f62990b = rVar.c(0, 1);
        rVar.s();
    }

    public final void e(InterfaceC1184q interfaceC1184q) {
        AbstractC4134a.g(interfaceC1184q.getPosition() == 0);
        int i10 = this.f62994f;
        if (i10 != -1) {
            interfaceC1184q.l(i10);
            this.f62991c = 4;
        } else {
            if (!AbstractC6040d.a(interfaceC1184q)) {
                throw C2338G.a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC1184q.l((int) (interfaceC1184q.i() - interfaceC1184q.getPosition()));
            this.f62991c = 1;
        }
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        d();
        int i11 = this.f62991c;
        if (i11 == 0) {
            e(interfaceC1184q);
            return 0;
        }
        if (i11 == 1) {
            i(interfaceC1184q);
            return 0;
        }
        if (i11 == 2) {
            h(interfaceC1184q);
            return 0;
        }
        if (i11 == 3) {
            m(interfaceC1184q);
            return 0;
        }
        if (i11 == 4) {
            return l(interfaceC1184q);
        }
        throw new IllegalStateException();
    }

    public final void h(InterfaceC1184q interfaceC1184q) {
        C6039c b10 = AbstractC6040d.b(interfaceC1184q);
        int i10 = b10.f63015a;
        if (i10 == 17) {
            this.f62993e = new a(this.f62989a, this.f62990b, b10);
        } else if (i10 == 6) {
            this.f62993e = new c(this.f62989a, this.f62990b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f62993e = new c(this.f62989a, this.f62990b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = T.a(i10, b10.f63020f);
            if (a10 == 0) {
                throw C2338G.d("Unsupported WAV format type: " + b10.f63015a);
            }
            this.f62993e = new c(this.f62989a, this.f62990b, b10, "audio/raw", a10);
        }
        this.f62991c = 3;
    }

    public final void i(InterfaceC1184q interfaceC1184q) {
        this.f62992d = AbstractC6040d.c(interfaceC1184q);
        this.f62991c = 2;
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        return AbstractC6040d.a(interfaceC1184q);
    }

    public final int l(InterfaceC1184q interfaceC1184q) {
        AbstractC4134a.g(this.f62995g != -1);
        return ((InterfaceC0869b) AbstractC4134a.e(this.f62993e)).b(interfaceC1184q, this.f62995g - interfaceC1184q.getPosition()) ? -1 : 0;
    }

    public final void m(InterfaceC1184q interfaceC1184q) {
        Pair e10 = AbstractC6040d.e(interfaceC1184q);
        this.f62994f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f62992d;
        if (j10 != -1 && longValue == BodyPartID.bodyIdMax) {
            longValue = j10;
        }
        this.f62995g = this.f62994f + longValue;
        long length = interfaceC1184q.getLength();
        if (length != -1 && this.f62995g > length) {
            AbstractC4156x.i("WavExtractor", "Data exceeds input length: " + this.f62995g + ", " + length);
            this.f62995g = length;
        }
        ((InterfaceC0869b) AbstractC4134a.e(this.f62993e)).a(this.f62994f, this.f62995g);
        this.f62991c = 4;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
