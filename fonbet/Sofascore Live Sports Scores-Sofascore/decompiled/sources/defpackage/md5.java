package defpackage;

import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class md5 implements yi5 {
    public final j9e a;
    public final String c;
    public final int d;
    public String e;
    public vsj f;
    public int h;
    public int i;
    public long j;
    public b k;
    public int l;
    public int m;
    public int g = 0;
    public long p = C.TIME_UNSET;
    public final AtomicInteger b = new AtomicInteger();
    public int n = -1;
    public int o = -1;

    public md5(String str, int i, int i2) {
        this.a = new j9e(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    public final boolean a(j9e j9eVar, byte[] bArr, int i) {
        int min = Math.min(j9eVar.a(), i - this.h);
        j9eVar.k(bArr, this.h, min);
        int i2 = this.h + min;
        this.h = i2;
        return i2 == i;
    }

    @Override // defpackage.yi5
    public final void b(j9e j9eVar) {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        long j2;
        int i10;
        int i11;
        int i12;
        int i13;
        this.f.getClass();
        while (j9eVar.a() > 0) {
            int i14 = this.g;
            j9e j9eVar2 = this.a;
            switch (i14) {
                case 0:
                    while (true) {
                        if (j9eVar.a() > 0) {
                            int i15 = this.i << 8;
                            this.i = i15;
                            int A = i15 | j9eVar.A();
                            this.i = A;
                            int T = fz8.T(A);
                            this.m = T;
                            if (T != 0) {
                                byte[] bArr = j9eVar2.a;
                                int i16 = this.i;
                                bArr[0] = (byte) ((i16 >> 24) & 255);
                                bArr[1] = (byte) ((i16 >> 16) & 255);
                                bArr[2] = (byte) ((i16 >> 8) & 255);
                                bArr[3] = (byte) (i16 & 255);
                                this.h = 4;
                                this.i = 0;
                                if (T != 3 && T != 4) {
                                    if (T == 1) {
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
                            }
                        }
                    }
                    break;
                case 1:
                    if (!a(j9eVar, j9eVar2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = j9eVar2.a;
                        if (this.k == null) {
                            String str = this.e;
                            nm2 U = fz8.U(bArr2);
                            U.t(60);
                            int i17 = fz8.c[U.i(6)];
                            int i18 = fz8.d[U.i(4)];
                            int i19 = U.i(5);
                            int i20 = i19 >= 29 ? -1 : (fz8.e[i19] * 1000) / 2;
                            U.t(10);
                            int i21 = i17 + (U.i(2) > 0 ? 1 : 0);
                            qm8 qm8Var = new qm8();
                            qm8Var.a = str;
                            qm8Var.m = sjc.p("video/mp2t");
                            qm8Var.n = sjc.p(MimeTypes.AUDIO_DTS);
                            qm8Var.h = i20;
                            qm8Var.F = i21;
                            qm8Var.G = i18;
                            qm8Var.r = null;
                            qm8Var.d = this.c;
                            qm8Var.f = this.d;
                            b bVar = new b(qm8Var);
                            this.k = bVar;
                            this.f.d(bVar);
                        }
                        this.l = fz8.R(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.j = jaa.s(nik.Z(this.k.H, (((i2 >> 2) | i) + 1) * 32));
                            j9eVar2.N(0);
                            this.f.g(18, j9eVar2);
                            this.g = 6;
                            break;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.j = jaa.s(nik.Z(this.k.H, (((i2 >> 2) | i) + 1) * 32));
                        j9eVar2.N(0);
                        this.f.g(18, j9eVar2);
                        this.g = 6;
                    }
                case 2:
                    if (a(j9eVar, j9eVar2.a, 7)) {
                        nm2 U2 = fz8.U(j9eVar2.a);
                        U2.t(42);
                        this.n = U2.i(U2.h() ? 12 : 8) + 1;
                        this.g = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i22 = 8;
                    if (a(j9eVar, j9eVar2.a, this.n)) {
                        nm2 U3 = fz8.U(j9eVar2.a);
                        U3.t(40);
                        int i23 = U3.i(2);
                        if (U3.h()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        U3.t(i4);
                        int i24 = U3.i(i3) + 1;
                        boolean h = U3.h();
                        if (h) {
                            i5 = U3.i(2);
                            i6 = (U3.i(3) + 1) * 512;
                            if (U3.h()) {
                                U3.t(36);
                            }
                            int i25 = U3.i(3) + 1;
                            int i26 = U3.i(3) + 1;
                            if (i25 != 1 || i26 != 1) {
                                throw s9e.c("Multiple audio presentations or assets not supported");
                            }
                            int i27 = i23 + 1;
                            int i28 = U3.i(i27);
                            int i29 = 0;
                            while (i29 < i27) {
                                if (((i28 >> i29) & 1) == 1) {
                                    U3.t(i22);
                                }
                                i29++;
                                i22 = 8;
                            }
                            if (U3.h()) {
                                U3.t(2);
                                int i30 = (U3.i(2) + 1) << 2;
                                int i31 = U3.i(2) + 1;
                                for (int i32 = 0; i32 < i31; i32++) {
                                    U3.t(i30);
                                }
                            }
                        } else {
                            i5 = -1;
                            i6 = 0;
                        }
                        U3.t(i3);
                        U3.t(12);
                        if (h) {
                            if (U3.h()) {
                                U3.t(4);
                            }
                            if (U3.h()) {
                                U3.t(24);
                            }
                            if (U3.h()) {
                                U3.u(U3.i(10) + 1);
                            }
                            U3.t(5);
                            i8 = fz8.f[U3.i(4)];
                            i7 = U3.i(8) + 1;
                        } else {
                            i7 = -1;
                            i8 = -2147483647;
                        }
                        if (h) {
                            if (i5 == 0) {
                                i9 = 32000;
                            } else if (i5 == 1) {
                                i9 = 44100;
                            } else {
                                if (i5 != 2) {
                                    throw s9e.a(null, "Unsupported reference clock code in DTS HD header: " + i5);
                                }
                                i9 = 48000;
                            }
                            String str2 = nik.a;
                            j = nik.b0(i6, 1000000L, i9, RoundingMode.DOWN);
                        } else {
                            j = -9223372036854775807L;
                        }
                        e(new d0(MimeTypes.AUDIO_DTS_EXPRESS, i7, i8, i24, j));
                        this.l = i24;
                        this.j = j == C.TIME_UNSET ? 0L : j;
                        j9eVar2.N(0);
                        this.f.g(this.n, j9eVar2);
                        this.g = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (a(j9eVar, j9eVar2.a, 6)) {
                        nm2 U4 = fz8.U(j9eVar2.a);
                        U4.t(32);
                        int a0 = fz8.a0(U4, fz8.k) + 1;
                        this.o = a0;
                        int i33 = this.h;
                        if (i33 > a0) {
                            int i34 = i33 - a0;
                            this.h = i33 - i34;
                            j9eVar.N(j9eVar.b - i34);
                        }
                        this.g = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(j9eVar, j9eVar2.a, this.o)) {
                        byte[] bArr3 = j9eVar2.a;
                        nm2 U5 = fz8.U(bArr3);
                        int i35 = U5.i(32) == 1078008818 ? 1 : 0;
                        int a02 = fz8.a0(U5, fz8.g);
                        int i36 = a02 + 1;
                        if (i35 == 0) {
                            j2 = -9223372036854775807L;
                            i10 = -2147483647;
                        } else {
                            if (!U5.h()) {
                                throw s9e.c("Only supports full channel mask-based audio presentation");
                            }
                            int i37 = a02 - 1;
                            int i38 = ((bArr3[i37] << 8) & 65535) | (bArr3[a02] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            String str3 = nik.a;
                            int i39 = 65535;
                            for (int i40 = 0; i40 < i37; i40++) {
                                byte b4 = bArr3[i40];
                                int i41 = (((b4 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4) ^ ((i39 >> 12) & 255)) & 255;
                                int[] iArr = nik.l;
                                int i42 = (iArr[i41] ^ ((i39 << 4) & 65535)) & 65535;
                                i39 = (iArr[((b4 & 15) ^ ((i42 >> 12) & 255)) & 255] ^ ((i42 << 4) & 65535)) & 65535;
                            }
                            if (i38 != i39) {
                                throw s9e.a(null, "CRC check failed");
                            }
                            int i43 = U5.i(2);
                            if (i43 != 0) {
                                if (i43 == 1) {
                                    i12 = 480;
                                } else {
                                    if (i43 != 2) {
                                        throw s9e.a(null, "Unsupported base duration index in DTS UHD header: " + i43);
                                    }
                                    i12 = 384;
                                }
                                i11 = 3;
                            } else {
                                i11 = 3;
                                i12 = 512;
                            }
                            int i44 = (U5.i(i11) + 1) * i12;
                            int i45 = U5.i(2);
                            if (i45 == 0) {
                                i13 = 32000;
                            } else if (i45 == 1) {
                                i13 = 44100;
                            } else {
                                if (i45 != 2) {
                                    throw s9e.a(null, "Unsupported clock rate index in DTS UHD header: " + i45);
                                }
                                i13 = 48000;
                            }
                            if (U5.h()) {
                                U5.t(36);
                            }
                            int i46 = i13 * (1 << U5.i(2));
                            j2 = nik.b0(i44, 1000000L, i13, RoundingMode.DOWN);
                            i10 = i46;
                        }
                        int i47 = 0;
                        for (int i48 = 0; i48 < i35; i48++) {
                            i47 += fz8.a0(U5, fz8.h);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i35 != 0) {
                            atomicInteger.set(fz8.a0(U5, fz8.i));
                        }
                        int a03 = i47 + (atomicInteger.get() != 0 ? fz8.a0(U5, fz8.j) : 0) + i36;
                        d0 d0Var = new d0("audio/vnd.dts.uhd;profile=p2", 2, i10, a03, j2);
                        if (this.m == 3) {
                            e(d0Var);
                        }
                        this.l = a03;
                        this.j = j2 == C.TIME_UNSET ? 0L : j2;
                        j9eVar2.N(0);
                        this.f.g(this.o, j9eVar2);
                        this.g = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(j9eVar.a(), this.l - this.h);
                    this.f.g(min, j9eVar);
                    int i49 = this.h + min;
                    this.h = i49;
                    if (i49 != this.l) {
                        break;
                    } else {
                        z1a.E(this.p != C.TIME_UNSET);
                        this.f.a(this.p, this.m == 4 ? 0 : 1, this.l, 0, null);
                        this.p += this.j;
                        this.g = 0;
                        break;
                    }
                default:
                    zzl.s();
                    return;
            }
        }
    }

    @Override // defpackage.yi5
    public final void d(pl6 pl6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.e = c2kVar.f;
        c2kVar.b();
        this.f = pl6Var.mo2track(c2kVar.e, 1);
    }

    public final void e(d0 d0Var) {
        int i = d0Var.a;
        String str = d0Var.c;
        int i2 = d0Var.b;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        b bVar = this.k;
        if (bVar != null && i2 == bVar.G && i == bVar.H && str.equals(bVar.o)) {
            return;
        }
        b bVar2 = this.k;
        qm8 qm8Var = bVar2 == null ? new qm8() : bVar2.a();
        qm8Var.a = this.e;
        qm8Var.m = sjc.p("video/mp2t");
        qm8Var.n = sjc.p(str);
        qm8Var.F = i2;
        qm8Var.G = i;
        qm8Var.d = this.c;
        qm8Var.f = this.d;
        b bVar3 = new b(qm8Var);
        this.k = bVar3;
        this.f.d(bVar3);
    }

    @Override // defpackage.yi5
    public final void g(int i, long j) {
        this.p = j;
    }

    @Override // defpackage.yi5
    public final void seek() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = C.TIME_UNSET;
        this.b.set(0);
    }

    @Override // defpackage.yi5
    public final void c(boolean z) {
    }
}
