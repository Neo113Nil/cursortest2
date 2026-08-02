package defpackage;

import androidx.media3.common.b;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mxc implements yi5 {
    public String e;
    public vsj f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final j9e a = new j9e(new byte[15], 2);
    public final nm2 b = new nm2(3);
    public final j9e c = new j9e();
    public final zl0 p = new zl0();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041e  */
    @Override // defpackage.yi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j9e j9eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        byte[] bArr;
        long j;
        long j2;
        int i6;
        long j3;
        boolean z;
        int i7;
        this.f.getClass();
        while (j9eVar.a() > 0) {
            int i8 = this.d;
            int i9 = 8;
            int i10 = 3;
            int i11 = 1;
            if (i8 != 0) {
                j9e j9eVar2 = this.c;
                zl0 zl0Var = this.p;
                if (i8 == 1) {
                    int a = j9eVar.a();
                    j9e j9eVar3 = this.a;
                    int min = Math.min(a, j9eVar3.a());
                    j9eVar.k(j9eVar3.a, j9eVar3.b, min);
                    j9eVar3.O(min);
                    if (j9eVar3.a() == 0) {
                        int i12 = j9eVar3.c;
                        byte[] bArr2 = j9eVar3.a;
                        nm2 nm2Var = this.b;
                        nm2Var.p(bArr2, i12);
                        nm2Var.f();
                        int w = mha.w(nm2Var, 3, 8, 8);
                        zl0Var.c = w;
                        if (w != -1) {
                            z1a.s(Math.max(Math.max(2, 8), 32) <= 63);
                            i9a.s(i9a.s(3L, 255L), 4294967296L);
                            if (nm2Var.b() >= 2) {
                                long k = nm2Var.k(2);
                                if (k == 3) {
                                    if (nm2Var.b() >= 8) {
                                        long k2 = nm2Var.k(8);
                                        k += k2;
                                        if (k2 == 255) {
                                            if (nm2Var.b() >= 32) {
                                                k = nm2Var.k(32) + k;
                                            }
                                        }
                                    }
                                }
                                j3 = k;
                                zl0Var.b = j3;
                                if (j3 != -1) {
                                    if (j3 > 16) {
                                        throw s9e.c("Contains sub-stream with an invalid packet label " + zl0Var.b);
                                    }
                                    if (j3 == 0) {
                                        int i13 = zl0Var.c;
                                        if (i13 == 1) {
                                            throw s9e.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i13 == 2) {
                                            throw s9e.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i13 == 17) {
                                            throw s9e.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int w2 = mha.w(nm2Var, 11, 24, 24);
                                    zl0Var.d = w2;
                                    if (w2 != -1) {
                                        z = true;
                                        if (z) {
                                            i7 = 0;
                                        } else {
                                            i7 = 0;
                                            this.n = 0;
                                            this.o = zl0Var.d + i12 + this.o;
                                        }
                                        if (z) {
                                            int i14 = j9eVar3.c;
                                            if (i14 < 15) {
                                                j9eVar3.M(i14 + 1);
                                                this.m = false;
                                            }
                                        } else {
                                            j9eVar3.N(i7);
                                            this.f.g(j9eVar3.c, j9eVar3);
                                            j9eVar3.K(2);
                                            j9eVar2.K(zl0Var.d);
                                            this.m = true;
                                            this.d = 2;
                                        }
                                    }
                                }
                            }
                            j3 = -1;
                            zl0Var.b = j3;
                            if (j3 != -1) {
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        if (z) {
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i8 != 2) {
                        zzl.s();
                        return;
                    }
                    int i15 = zl0Var.c;
                    if (i15 == 1 || i15 == 17) {
                        int i16 = j9eVar.b;
                        int min2 = Math.min(j9eVar.a(), j9eVar2.a());
                        j9eVar.k(j9eVar2.a, j9eVar2.b, min2);
                        j9eVar2.O(min2);
                        j9eVar.N(i16);
                    }
                    int min3 = Math.min(j9eVar.a(), zl0Var.d - this.n);
                    this.f.g(min3, j9eVar);
                    int i17 = this.n + min3;
                    this.n = i17;
                    if (i17 != zl0Var.d) {
                        continue;
                    } else {
                        int i18 = zl0Var.c;
                        if (i18 == 1) {
                            byte[] bArr3 = j9eVar2.a;
                            nm2 nm2Var2 = new nm2(bArr3, bArr3.length, 3, (byte) 0);
                            int i19 = nm2Var2.i(8);
                            int i20 = nm2Var2.i(5);
                            if (i20 != 31) {
                                switch (i20) {
                                    case 0:
                                        i4 = 96000;
                                        break;
                                    case 1:
                                        i4 = 88200;
                                        break;
                                    case 2:
                                        i4 = 64000;
                                        break;
                                    case 3:
                                        i4 = 48000;
                                        break;
                                    case 4:
                                        i4 = 44100;
                                        break;
                                    case 5:
                                        i4 = 32000;
                                        break;
                                    case 6:
                                        i4 = 24000;
                                        break;
                                    case 7:
                                        i4 = 22050;
                                        break;
                                    case 8:
                                        i4 = 16000;
                                        break;
                                    case 9:
                                        i4 = 12000;
                                        break;
                                    case 10:
                                        i4 = 11025;
                                        break;
                                    case 11:
                                        i4 = 8000;
                                        break;
                                    case 12:
                                        i4 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw s9e.c("Unsupported sampling rate index " + i20);
                                    case 15:
                                        i4 = 57600;
                                        break;
                                    case 16:
                                        i4 = 51200;
                                        break;
                                    case 17:
                                        i4 = 40000;
                                        break;
                                    case 18:
                                        i4 = 38400;
                                        break;
                                    case 19:
                                        i4 = 34150;
                                        break;
                                    case 20:
                                        i4 = 28800;
                                        break;
                                    case 21:
                                        i4 = 25600;
                                        break;
                                    case 22:
                                        i4 = 20000;
                                        break;
                                    case 23:
                                        i4 = 19200;
                                        break;
                                    case 24:
                                        i4 = 17075;
                                        break;
                                    case 25:
                                        i4 = 14400;
                                        break;
                                    case 26:
                                        i4 = 12800;
                                        break;
                                    case 27:
                                        i4 = 9600;
                                        break;
                                }
                            } else {
                                i4 = nm2Var2.i(24);
                            }
                            int i21 = nm2Var2.i(3);
                            if (i21 == 0) {
                                i5 = 768;
                            } else if (i21 == 1) {
                                i5 = 1024;
                            } else if (i21 == 2 || i21 == 3) {
                                i5 = a.o;
                            } else {
                                if (i21 != 4) {
                                    throw s9e.c("Unsupported coreSbrFrameLengthIndex " + i21);
                                }
                                i5 = 4096;
                            }
                            int i22 = i5;
                            if (i21 == 0 || i21 == 1) {
                                c = 0;
                            } else if (i21 == 2) {
                                c = 2;
                            } else if (i21 == 3) {
                                c = 3;
                            } else {
                                if (i21 != 4) {
                                    throw s9e.c("Unsupported coreSbrFrameLengthIndex " + i21);
                                }
                                c = 1;
                            }
                            nm2Var2.t(2);
                            mha.D(nm2Var2);
                            int i23 = nm2Var2.i(5);
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                int i26 = i11;
                                int i27 = 16;
                                if (i24 < i23 + 1) {
                                    int i28 = nm2Var2.i(3);
                                    i25 = mha.w(nm2Var2, 5, 8, 16) + 1 + i25;
                                    if ((i28 == 0 || i28 == 2) && nm2Var2.h()) {
                                        mha.D(nm2Var2);
                                    }
                                    i24++;
                                    i11 = i26;
                                } else {
                                    int w3 = mha.w(nm2Var2, 4, 8, 16) + 1;
                                    nm2Var2.s();
                                    int i29 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i29 < w3) {
                                            int i30 = nm2Var2.i(2);
                                            if (i30 == 0) {
                                                nm2Var2.t(i10);
                                                if (nm2Var2.h()) {
                                                    nm2Var2.t(13);
                                                }
                                                if (c > 0) {
                                                    mha.C(nm2Var2);
                                                }
                                            } else if (i30 == i26) {
                                                nm2Var2.t(i10);
                                                boolean h = nm2Var2.h();
                                                if (h) {
                                                    nm2Var2.t(13);
                                                }
                                                if (h) {
                                                    nm2Var2.s();
                                                }
                                                if (c > 0) {
                                                    mha.C(nm2Var2);
                                                    i6 = nm2Var2.i(2);
                                                } else {
                                                    i6 = 0;
                                                }
                                                if (i6 > 0) {
                                                    nm2Var2.t(6);
                                                    int i31 = nm2Var2.i(2);
                                                    nm2Var2.t(4);
                                                    if (nm2Var2.h()) {
                                                        nm2Var2.t(5);
                                                    }
                                                    if (i6 == 2 || i6 == i10) {
                                                        nm2Var2.t(6);
                                                    }
                                                    if (i31 == 2) {
                                                        nm2Var2.s();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i25 - 1) / Math.log(2.0d))) + 1;
                                                int i32 = nm2Var2.i(2);
                                                if (i32 > 0 && nm2Var2.h()) {
                                                    nm2Var2.t(floor);
                                                }
                                                if (nm2Var2.h()) {
                                                    nm2Var2.t(floor);
                                                }
                                                if (c == 0 && i32 == 0) {
                                                    nm2Var2.s();
                                                }
                                            } else if (i30 == i10) {
                                                mha.w(nm2Var2, 4, i9, i27);
                                                int w4 = mha.w(nm2Var2, 4, i9, i27);
                                                if (nm2Var2.h()) {
                                                    mha.w(nm2Var2, i9, i27, 0);
                                                }
                                                nm2Var2.s();
                                                if (w4 > 0) {
                                                    nm2Var2.t(w4 * 8);
                                                }
                                            }
                                            i29++;
                                            i9 = 8;
                                            i10 = 3;
                                            i27 = 16;
                                            i26 = 1;
                                        } else {
                                            if (nm2Var2.h()) {
                                                int i33 = 8;
                                                int w5 = mha.w(nm2Var2, 2, 4, 8) + 1;
                                                int i34 = 0;
                                                bArr = null;
                                                while (i34 < w5) {
                                                    int w6 = mha.w(nm2Var2, 4, i33, 16);
                                                    int w7 = mha.w(nm2Var2, 4, i33, 16);
                                                    if (w6 == 7) {
                                                        int i35 = nm2Var2.i(4) + 1;
                                                        nm2Var2.t(4);
                                                        byte[] bArr4 = new byte[i35];
                                                        for (int i36 = 0; i36 < i35; i36++) {
                                                            bArr4[i36] = (byte) nm2Var2.i(i33);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        nm2Var2.t(w7 * i33);
                                                    }
                                                    i34++;
                                                    i33 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i4) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i22 * d);
                                                    j = this.t;
                                                    j2 = zl0Var.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String concat = i19 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i19))) : "mhm1";
                                                        vvf A = (bArr == null || bArr.length <= 0) ? null : hv9.A(nik.b, bArr);
                                                        qm8 qm8Var = new qm8();
                                                        qm8Var.a = this.e;
                                                        qm8Var.m = sjc.p("video/mp2t");
                                                        qm8Var.n = sjc.p("audio/mhm1");
                                                        qm8Var.G = this.q;
                                                        qm8Var.j = concat;
                                                        qm8Var.q = A;
                                                        this.f.d(new b(qm8Var));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i22 * d);
                                                    j = this.t;
                                                    j2 = zl0Var.b;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i22 * d);
                                                    j = this.t;
                                                    j2 = zl0Var.b;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i22 * d);
                                                    j = this.t;
                                                    j2 = zl0Var.b;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw s9e.c("Unsupported sampling rate " + i4);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i18 == 17) {
                                byte[] bArr5 = j9eVar2.a;
                                nm2 nm2Var3 = new nm2(bArr5, bArr5.length, 3, (byte) 0);
                                if (nm2Var3.h()) {
                                    nm2Var3.t(2);
                                    i3 = nm2Var3.i(13);
                                } else {
                                    i3 = 0;
                                }
                                this.s = i3;
                            } else if (i18 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = ((this.r - this.s) * 1000000.0d) / this.q;
                                long round = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.a(round, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                }
            } else {
                int i37 = this.k;
                if ((i37 & 2) == 0) {
                    j9eVar.N(j9eVar.c);
                } else {
                    if ((i37 & 4) == 0) {
                        while (j9eVar.a() > 0) {
                            int i38 = this.l << 8;
                            this.l = i38;
                            int A2 = i38 | j9eVar.A();
                            this.l = A2;
                            if ((A2 & 16777215) == 12583333) {
                                j9eVar.N(j9eVar.b - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = 1;
                }
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

    @Override // defpackage.yi5
    public final void g(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != C.TIME_UNSET) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // defpackage.yi5
    public final void seek() {
        this.d = 0;
        this.l = 0;
        this.a.K(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.yi5
    public final void c(boolean z) {
    }
}
