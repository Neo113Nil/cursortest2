package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqf implements zzaqh {
    public final zzeu a;
    public final String c;
    public final int d;
    public String e;
    public zzaht f;
    public int h;
    public int i;
    public int j;
    public long k;
    public zzv l;
    public int m;
    public int n;
    public int o;
    public boolean r;
    public boolean u;
    public boolean v;
    public int g = 0;
    public long s = C.TIME_UNSET;
    public long t = C.TIME_UNSET;
    public final AtomicInteger b = new AtomicInteger();
    public int p = -1;
    public int q = -1;

    public zzaqf(String str, int i, int i2) {
        this.a = new zzeu(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.e = zzarvVar.e;
        zzarvVar.b();
        this.f = zzagkVar.b(zzarvVar.d, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        if (j != C.TIME_UNSET) {
            if (this.g != 0) {
                this.t = j;
            } else {
                this.s = j;
                this.t = C.TIME_UNSET;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void c(zzeu zzeuVar) {
        int i;
        char c;
        char c2;
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        this.f.getClass();
        while (zzeuVar.B() > 0) {
            int i8 = this.g;
            zzeu zzeuVar2 = this.a;
            int i9 = 2;
            switch (i8) {
                case 0:
                    while (true) {
                        if (zzeuVar.B() > 0) {
                            int i10 = this.j << 8;
                            this.j = i10;
                            int I = i10 | zzeuVar.I();
                            this.j = I;
                            int b3 = zzagg.b(I);
                            this.o = b3;
                            if (b3 != 0) {
                                e(this.j);
                                this.j = 0;
                                if (!this.v || this.o != 2) {
                                    int i11 = this.o;
                                    if (i11 == 1) {
                                        this.v = false;
                                        i = 1;
                                        i11 = 1;
                                    } else {
                                        i = i11;
                                    }
                                    if (i11 != 3 && i11 != 4) {
                                        if (i == 1) {
                                            this.g = 1;
                                            break;
                                        } else {
                                            this.g = 2;
                                            break;
                                        }
                                    } else {
                                        this.g = 4;
                                        break;
                                    }
                                } else {
                                    this.h = 0;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!d(zzeuVar, zzeuVar2.a, 18)) {
                        break;
                    } else {
                        this.u = true;
                        byte[] bArr = zzeuVar2.a;
                        if (this.l == null) {
                            String str = this.e;
                            zzet h = zzagg.h(bArr);
                            h.f(60);
                            int i12 = zzagg.a[h.h(6)];
                            int i13 = zzagg.b[h.h(4)];
                            c2 = 7;
                            int h2 = h.h(5);
                            c = 5;
                            int i14 = h2 >= 29 ? -1 : (zzagg.c[h2] * 1000) / 2;
                            h.f(10);
                            int i15 = i12 + (h.h(2) > 0 ? 1 : 0);
                            zzt zztVar = new zzt();
                            zztVar.a = str;
                            zztVar.c("video/mp2t");
                            zztVar.d(MimeTypes.AUDIO_DTS);
                            zztVar.h = i14;
                            zztVar.G = i15;
                            zztVar.I = i13;
                            zztVar.r = null;
                            zztVar.d = this.c;
                            zztVar.f = this.d;
                            this.l = new zzv(zztVar);
                            this.r = true;
                        } else {
                            c = 5;
                            c2 = 7;
                        }
                        this.m = zzagg.c(bArr);
                        byte b4 = bArr[0];
                        if (b4 != -2) {
                            if (b4 == -1) {
                                i2 = (bArr[4] & 7) << 4;
                                b2 = bArr[c2];
                            } else if (b4 != 31) {
                                i2 = (bArr[4] & 1) << 6;
                                b = bArr[c];
                            } else {
                                i2 = (bArr[c] & 7) << 4;
                                b2 = bArr[6];
                            }
                            i3 = b2 & 60;
                            this.k = zzhbj.a(zzfm.v(this.l.J, (((i3 >> 2) | i2) + 1) * 32));
                            zzeuVar2.D(0);
                            this.f.b(18, zzeuVar2);
                            this.g = 6;
                            break;
                        } else {
                            i2 = (bArr[c] & 1) << 6;
                            b = bArr[4];
                        }
                        i3 = b & 252;
                        this.k = zzhbj.a(zzfm.v(this.l.J, (((i3 >> 2) | i2) + 1) * 32));
                        zzeuVar2.D(0);
                        this.f.b(18, zzeuVar2);
                        this.g = 6;
                    }
                case 2:
                    if (d(zzeuVar, zzeuVar2.a, 7)) {
                        zzet h3 = zzagg.h(zzeuVar2.a);
                        h3.f(42);
                        this.p = h3.h(true != h3.g() ? 8 : 12) + 1;
                        this.g = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (d(zzeuVar, zzeuVar2.a, this.p)) {
                        zzagf d = zzagg.d(zzeuVar2.a);
                        f(d);
                        this.m = d.d;
                        long j2 = d.e;
                        if (j2 != C.TIME_UNSET) {
                            this.k = j2;
                        }
                        zzeuVar2.D(0);
                        this.f.b(this.p, zzeuVar2);
                        this.g = 6;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (d(zzeuVar, zzeuVar2.a, 6)) {
                        zzet h4 = zzagg.h(zzeuVar2.a);
                        h4.f(32);
                        int g = zzagg.g(h4, zzagg.i) + 1;
                        this.q = g;
                        int i16 = this.h;
                        if (i16 > g) {
                            int i17 = i16 - g;
                            this.h = i16 - i17;
                            zzeuVar.D(zzeuVar.b - i17);
                        }
                        this.g = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (d(zzeuVar, zzeuVar2.a, this.q)) {
                        byte[] bArr2 = zzeuVar2.a;
                        zzet h5 = zzagg.h(bArr2);
                        int h6 = h5.h(32);
                        int g2 = zzagg.g(h5, zzagg.e);
                        int i18 = g2 + 1;
                        char c3 = h6 == 1078008818 ? (char) 1 : (char) 0;
                        if (c3 == 0) {
                            i4 = -2147483647;
                            j = -9223372036854775807L;
                        } else {
                            if (!h5.g()) {
                                throw zzat.b("Only supports full channel mask-based audio presentation");
                            }
                            int i19 = g2 - 1;
                            int i20 = bArr2[i19] << 8;
                            int i21 = bArr2[g2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            String str2 = zzfm.a;
                            char c4 = 65535;
                            for (int i22 = 0; i22 < i19; i22++) {
                                int unsignedInt = Byte.toUnsignedInt(bArr2[i22]);
                                int[] iArr = zzfm.h;
                                char c5 = (char) (iArr[((c4 >> '\f') ^ (unsignedInt >> 4)) & 255] ^ ((char) (c4 << 4)));
                                c4 = (char) (((char) (c5 << 4)) ^ iArr[((c5 >> '\f') ^ (unsignedInt & 15)) & 255]);
                            }
                            if ((((char) i20) | i21) != c4) {
                                throw zzat.a(null, "CRC check failed");
                            }
                            int h7 = h5.h(2);
                            if (h7 == 0) {
                                i5 = 512;
                            } else if (h7 == 1) {
                                i5 = 480;
                            } else {
                                if (h7 != 2) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(h7).length() + 51);
                                    sb.append("Unsupported base duration index in DTS UHD header: ");
                                    sb.append(h7);
                                    throw zzat.a(null, sb.toString());
                                }
                                i5 = 384;
                            }
                            int h8 = h5.h(3) + 1;
                            int h9 = h5.h(2);
                            if (h9 == 0) {
                                i6 = 32000;
                            } else if (h9 == 1) {
                                i6 = 44100;
                            } else {
                                if (h9 != 2) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(h9).length() + 48);
                                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                                    sb2.append(h9);
                                    throw zzat.a(null, sb2.toString());
                                }
                                i6 = 48000;
                            }
                            if (h5.g()) {
                                h5.f(36);
                            }
                            int i23 = i5 * h8;
                            i4 = (1 << h5.h(2)) * i6;
                            j = zzfm.w(i23, 1000000L, i6, RoundingMode.DOWN);
                        }
                        int i24 = i4;
                        int i25 = 0;
                        for (char c6 = 0; c6 < c3; c6 = 1) {
                            i25 += zzagg.g(h5, zzagg.f);
                        }
                        for (int i26 = 0; i26 <= 0; i26++) {
                            AtomicInteger atomicInteger = this.b;
                            if (c3 != 0) {
                                atomicInteger.set(zzagg.g(h5, zzagg.g));
                            }
                            i25 += atomicInteger.get() != 0 ? zzagg.g(h5, zzagg.h) : 0;
                        }
                        int i27 = i18 + i25;
                        zzagf zzagfVar = new zzagf("audio/vnd.dts.uhd;profile=p2", 2, i24, i27, j);
                        if (this.o == 3) {
                            f(zzagfVar);
                        }
                        this.m = i27;
                        if (j == C.TIME_UNSET) {
                            j = 0;
                        }
                        this.k = j;
                        zzeuVar2.D(0);
                        this.f.b(this.q, zzeuVar2);
                        this.g = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(zzeuVar.B(), this.m - this.h);
                    this.f.b(min, zzeuVar);
                    int i28 = this.h + min;
                    this.h = i28;
                    int i29 = this.m;
                    if (i28 != i29) {
                        break;
                    } else if (this.o == 1) {
                        this.n = i29;
                        this.h = 0;
                        this.i = 0;
                        this.g = 7;
                        break;
                    } else {
                        zzguk.f(this.s != C.TIME_UNSET);
                        int i30 = this.m;
                        int i31 = this.o;
                        if (i31 == 2) {
                            i7 = this.n;
                        } else {
                            i9 = i31;
                            i7 = 0;
                        }
                        int i32 = i30 + i7;
                        long j3 = this.s;
                        this.f.f(j3, i9 == 4 ? 0 : 1, i32, 0, null);
                        this.s += this.k;
                        long j4 = this.t;
                        if (j4 != C.TIME_UNSET) {
                            if (j4 != j3) {
                                this.s = j4;
                            }
                            this.t = C.TIME_UNSET;
                        }
                        this.n = 0;
                        this.g = 0;
                        break;
                    }
                default:
                    while (zzeuVar.B() > 0 && this.h < 4) {
                        int i33 = this.i << 8;
                        this.i = i33;
                        this.i = i33 | zzeuVar.I();
                        this.h++;
                    }
                    if (this.h != 4) {
                        break;
                    } else if (zzagg.b(this.i) == 2) {
                        e(this.i);
                        this.o = 2;
                        this.i = 0;
                        this.g = 2;
                        break;
                    } else {
                        if (this.r) {
                            zzaht zzahtVar = this.f;
                            zzv zzvVar = this.l;
                            zzvVar.getClass();
                            zzahtVar.e(zzvVar);
                            this.r = false;
                        }
                        zzguk.f(this.s != C.TIME_UNSET);
                        long j5 = this.s;
                        this.f.f(j5, 1, this.n, 0, null);
                        this.s += this.k;
                        long j6 = this.t;
                        if (j6 != C.TIME_UNSET) {
                            if (j6 != j5) {
                                this.s = j6;
                            }
                            this.t = C.TIME_UNSET;
                        }
                        this.n = 0;
                        int i34 = this.i;
                        this.j = i34;
                        this.i = 0;
                        int b5 = zzagg.b(i34);
                        this.o = b5;
                        if (b5 != 3 && b5 != 4) {
                            if (b5 == 1) {
                                e(i34);
                                this.j = 0;
                                this.g = 1;
                                break;
                            } else {
                                this.h = 0;
                                this.g = 0;
                                break;
                            }
                        } else {
                            e(i34);
                            this.j = 0;
                            this.g = 4;
                            break;
                        }
                    }
            }
        }
    }

    public final boolean d(zzeu zzeuVar, byte[] bArr, int i) {
        int min = Math.min(zzeuVar.B(), i - this.h);
        zzeuVar.F(this.h, min, bArr);
        int i2 = this.h + min;
        this.h = i2;
        return i2 == i;
    }

    public final void e(int i) {
        byte[] bArr = this.a.a;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.h = 4;
    }

    public final void f(zzagf zzagfVar) {
        int i;
        int i2 = zzagfVar.b;
        if (i2 == -2147483647 || (i = zzagfVar.c) == -1) {
            return;
        }
        String str = zzagfVar.a;
        if (str == null) {
            zzv zzvVar = this.l;
            str = zzvVar != null ? zzvVar.o : null;
        }
        zzv zzvVar2 = this.l;
        if (zzvVar2 != null && !this.r && i == zzvVar2.H && i2 == zzvVar2.J && Objects.equals(str, zzvVar2.o)) {
            return;
        }
        zzv zzvVar3 = this.l;
        zzt zztVar = zzvVar3 == null ? new zzt() : new zzt(zzvVar3);
        zztVar.a = this.e;
        zztVar.c("video/mp2t");
        zztVar.d(str);
        zztVar.G = i;
        zztVar.I = i2;
        zztVar.d = this.c;
        zztVar.f = this.d;
        zzv zzvVar4 = new zzv(zztVar);
        this.l = zzvVar4;
        this.f.e(zzvVar4);
        this.r = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.i = 0;
        this.n = 0;
        this.s = C.TIME_UNSET;
        this.t = C.TIME_UNSET;
        this.b.set(0);
        this.r = false;
        this.v = this.u;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        if (this.g == 7) {
            zzaht zzahtVar = this.f;
            zzahtVar.getClass();
            if (this.r) {
                zzv zzvVar = this.l;
                zzvVar.getClass();
                zzahtVar.e(zzvVar);
                this.r = false;
            }
            long j = this.s;
            if (j != C.TIME_UNSET) {
                this.f.f(j, 1, this.n, 0, null);
                this.s += this.k;
            }
            this.n = 0;
            this.h = 0;
            this.j = 0;
            this.i = 0;
            this.g = 0;
        }
    }
}
