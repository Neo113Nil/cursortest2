package o2;

import android.util.Pair;
import androidx.media3.common.a;
import com.plaid.internal.EnumC3631g;
import e1.AbstractC4134a;
import e1.Z;
import f1.AbstractC4230h;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import o2.L;

/* renamed from: o2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5794n implements InterfaceC5793m {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f59093a;

    /* renamed from: b, reason: collision with root package name */
    public H1.O f59094b;

    /* renamed from: c, reason: collision with root package name */
    public final O f59095c;

    /* renamed from: d, reason: collision with root package name */
    public final String f59096d;

    /* renamed from: e, reason: collision with root package name */
    public final e1.J f59097e;

    /* renamed from: f, reason: collision with root package name */
    public final w f59098f;

    /* renamed from: g, reason: collision with root package name */
    public final a f59099g;

    /* renamed from: h, reason: collision with root package name */
    public long f59100h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f59101i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59102j;

    /* renamed from: k, reason: collision with root package name */
    public long f59103k;

    /* renamed from: l, reason: collision with root package name */
    public long f59104l;

    /* renamed from: m, reason: collision with root package name */
    public long f59105m;

    /* renamed from: n, reason: collision with root package name */
    public long f59106n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f59107o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f59108p;
    private final boolean[] prefixFlags;

    /* renamed from: o2.n$a */
    public static final class a {
        private static final byte[] START_CODE = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f59109a;

        /* renamed from: b, reason: collision with root package name */
        public int f59110b;

        /* renamed from: c, reason: collision with root package name */
        public int f59111c;
        public byte[] data;

        public a(int i10) {
            this.data = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f59109a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i13 = this.f59110b;
                if (length < i13 + i12) {
                    this.data = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.data, this.f59110b, i12);
                this.f59110b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f59109a) {
                int i12 = this.f59110b - i11;
                this.f59110b = i12;
                if (this.f59111c != 0 || i10 != 181) {
                    this.f59109a = false;
                    return true;
                }
                this.f59111c = i12;
            } else if (i10 == 179) {
                this.f59109a = true;
            }
            byte[] bArr = START_CODE;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f59109a = false;
            this.f59110b = 0;
            this.f59111c = 0;
        }
    }

    public C5794n(String str) {
        this(null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair f(a aVar, String str, String str2) {
        float f10;
        int i10;
        float f11;
        int i11;
        long j10;
        byte[] copyOf = Arrays.copyOf(aVar.data, aVar.f59110b);
        int i12 = copyOf[4] & UByte.MAX_VALUE;
        byte b10 = copyOf[5];
        int i13 = (i12 << 4) | ((b10 & UByte.MAX_VALUE) >> 4);
        int i14 = ((b10 & 15) << 8) | (copyOf[6] & UByte.MAX_VALUE);
        int i15 = (copyOf[7] & 240) >> 4;
        if (i15 == 2) {
            f10 = i14 * 4;
            i10 = i13 * 3;
        } else if (i15 == 3) {
            f10 = i14 * 16;
            i10 = i13 * 9;
        } else {
            if (i15 != 4) {
                f11 = 1.0f;
                androidx.media3.common.a P10 = new a.b().j0(str).W(str2).y0("video/mpeg2").F0(i13).h0(i14).u0(f11).k0(Collections.singletonList(copyOf)).P();
                i11 = (copyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    double[] dArr = FRAME_RATE_VALUES;
                    if (i11 < dArr.length) {
                        double d10 = dArr[i11];
                        byte b11 = copyOf[aVar.f59111c + 9];
                        int i16 = (b11 & 96) >> 5;
                        if (i16 != (b11 & 31)) {
                            d10 *= (i16 + 1.0d) / (r8 + 1);
                        }
                        j10 = (long) (1000000.0d / d10);
                        return Pair.create(P10, Long.valueOf(j10));
                    }
                }
                j10 = 0;
                return Pair.create(P10, Long.valueOf(j10));
            }
            f10 = i14 * 121;
            i10 = i13 * 100;
        }
        f11 = f10 / i10;
        androidx.media3.common.a P102 = new a.b().j0(str).W(str2).y0("video/mpeg2").F0(i13).h0(i14).u0(f11).k0(Collections.singletonList(copyOf)).P();
        i11 = (copyOf[7] & 15) - 1;
        if (i11 >= 0) {
        }
        j10 = 0;
        return Pair.create(P102, Long.valueOf(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    @Override // o2.InterfaceC5793m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(e1.J j10) {
        int i10;
        long j11;
        boolean z10;
        int i11;
        AbstractC4134a.i(this.f59094b);
        int g10 = j10.g();
        int j12 = j10.j();
        byte[] f10 = j10.f();
        this.f59100h += j10.a();
        this.f59094b.a(j10, j10.a());
        while (true) {
            int e10 = AbstractC4230h.e(f10, g10, j12, this.prefixFlags);
            if (e10 == j12) {
                break;
            }
            int i12 = e10 + 3;
            int i13 = j10.f()[i12] & UByte.MAX_VALUE;
            int i14 = e10 - g10;
            if (!this.f59102j) {
                if (i14 > 0) {
                    this.f59099g.a(f10, g10, e10);
                }
                if (this.f59099g.b(i13, i14 < 0 ? -i14 : 0)) {
                    Pair f11 = f(this.f59099g, (String) AbstractC4134a.e(this.f59093a), this.f59096d);
                    this.f59094b.c((androidx.media3.common.a) f11.first);
                    this.f59103k = ((Long) f11.second).longValue();
                    this.f59102j = true;
                }
            }
            w wVar = this.f59098f;
            if (wVar != null) {
                if (i14 > 0) {
                    wVar.a(f10, g10, e10);
                    i11 = 0;
                } else {
                    i11 = -i14;
                }
                if (this.f59098f.b(i11)) {
                    w wVar2 = this.f59098f;
                    ((e1.J) Z.i(this.f59097e)).Z(this.f59098f.nalData, AbstractC4230h.L(wVar2.nalData, wVar2.f59286d));
                    ((O) Z.i(this.f59095c)).b(this.f59106n, this.f59097e);
                }
                if (i13 == 178 && j10.f()[e10 + 2] == 1) {
                    this.f59098f.e(i13);
                }
            }
            if (i13 == 0 || i13 == 179) {
                int i15 = j12 - e10;
                if (this.f59108p && this.f59102j) {
                    long j13 = this.f59106n;
                    if (j13 != -9223372036854775807L) {
                        i10 = j12;
                        this.f59094b.g(j13, this.f59107o ? 1 : 0, ((int) (this.f59100h - this.f59105m)) - i15, i15, null);
                        if (this.f59101i || this.f59108p) {
                            this.f59105m = this.f59100h - i15;
                            j11 = this.f59104l;
                            if (j11 == -9223372036854775807L) {
                                long j14 = this.f59106n;
                                j11 = j14 != -9223372036854775807L ? j14 + this.f59103k : -9223372036854775807L;
                            }
                            this.f59106n = j11;
                            this.f59107o = false;
                            this.f59104l = -9223372036854775807L;
                            z10 = true;
                            this.f59101i = true;
                        } else {
                            z10 = true;
                        }
                        this.f59108p = i13 == 0 ? z10 : false;
                    }
                }
                i10 = j12;
                if (this.f59101i) {
                }
                this.f59105m = this.f59100h - i15;
                j11 = this.f59104l;
                if (j11 == -9223372036854775807L) {
                }
                this.f59106n = j11;
                this.f59107o = false;
                this.f59104l = -9223372036854775807L;
                z10 = true;
                this.f59101i = true;
                this.f59108p = i13 == 0 ? z10 : false;
            } else {
                if (i13 == 184) {
                    this.f59107o = true;
                }
                i10 = j12;
            }
            j12 = i10;
            g10 = i12;
        }
        if (!this.f59102j) {
            this.f59099g.a(f10, g10, j12);
        }
        w wVar3 = this.f59098f;
        if (wVar3 != null) {
            wVar3.a(f10, g10, j12);
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        AbstractC4230h.c(this.prefixFlags);
        this.f59099g.c();
        w wVar = this.f59098f;
        if (wVar != null) {
            wVar.d();
        }
        this.f59100h = 0L;
        this.f59101i = false;
        this.f59104l = -9223372036854775807L;
        this.f59106n = -9223372036854775807L;
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
        AbstractC4134a.i(this.f59094b);
        if (z10) {
            boolean z11 = this.f59107o;
            this.f59094b.g(this.f59106n, z11 ? 1 : 0, (int) (this.f59100h - this.f59105m), 0, null);
        }
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59093a = dVar.b();
        this.f59094b = rVar.c(dVar.c(), 2);
        O o10 = this.f59095c;
        if (o10 != null) {
            o10.c(rVar, dVar);
        }
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59104l = j10;
    }

    public C5794n(O o10, String str) {
        this.f59095c = o10;
        this.f59096d = str;
        this.prefixFlags = new boolean[4];
        this.f59099g = new a(128);
        if (o10 != null) {
            this.f59098f = new w(EnumC3631g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 128);
            this.f59097e = new e1.J();
        } else {
            this.f59098f = null;
            this.f59097e = null;
        }
        this.f59104l = -9223372036854775807L;
        this.f59106n = -9223372036854775807L;
    }
}
