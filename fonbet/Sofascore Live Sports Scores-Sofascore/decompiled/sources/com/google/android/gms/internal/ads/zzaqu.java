package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.fn0;
import defpackage.uaa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqu implements zzaqh {
    public String e;
    public zzaht f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final zzeu a = new zzeu(new byte[15], 2);
    public final zzet b = new zzet();
    public final zzeu c = new zzeu();
    public final zzaqv p = new zzaqv();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

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
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != C.TIME_UNSET) {
            double d = j;
            if (this.i) {
                this.h = d;
            } else {
                this.g = d;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04cc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zzeu zzeuVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        byte[] bArr;
        long j;
        long j2;
        char c2;
        int i6;
        char c3;
        long j3;
        this.f.getClass();
        while (zzeuVar.B() > 0) {
            int i7 = this.d;
            int i8 = 8;
            int i9 = 1;
            if (i7 != 0) {
                zzaqv zzaqvVar = this.p;
                zzeu zzeuVar2 = this.c;
                if (i7 != 1) {
                    int i10 = zzaqvVar.a;
                    if (i10 == 1 || i10 == 17) {
                        int i11 = zzeuVar.b;
                        int min = Math.min(zzeuVar.B(), zzeuVar2.B());
                        zzeuVar.F(zzeuVar2.b, min, zzeuVar2.a);
                        zzeuVar2.E(min);
                        zzeuVar.D(i11);
                    }
                    int min2 = Math.min(zzeuVar.B(), zzaqvVar.c - this.n);
                    this.f.b(min2, zzeuVar);
                    int i12 = this.n + min2;
                    this.n = i12;
                    if (i12 != zzaqvVar.c) {
                        continue;
                    } else {
                        int i13 = zzaqvVar.a;
                        if (i13 == 1) {
                            byte[] bArr2 = zzeuVar2.a;
                            zzet zzetVar = new zzet(bArr2, bArr2.length);
                            int h = zzetVar.h(8);
                            char c4 = 5;
                            int h2 = zzetVar.h(5);
                            if (h2 != 31) {
                                switch (h2) {
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
                                        StringBuilder sb = new StringBuilder(String.valueOf(h2).length() + 32);
                                        sb.append("Unsupported sampling rate index ");
                                        sb.append(h2);
                                        throw zzat.b(sb.toString());
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
                                i4 = zzetVar.h(24);
                            }
                            int h3 = zzetVar.h(3);
                            int i14 = 4;
                            if (h3 == 0) {
                                i5 = 768;
                            } else if (h3 == 1) {
                                i5 = 1024;
                            } else if (h3 == 2 || h3 == 3) {
                                i5 = com.ironsource.mediationsdk.metadata.a.o;
                            } else {
                                if (h3 != 4) {
                                    StringBuilder sb2 = new StringBuilder(fn0.a(h3, 36));
                                    sb2.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb2.append(h3);
                                    throw zzat.b(sb2.toString());
                                }
                                i5 = 4096;
                            }
                            int i15 = i5;
                            if (h3 == 0 || h3 == 1) {
                                c = 0;
                            } else if (h3 == 2) {
                                c = 2;
                            } else if (h3 == 3) {
                                c = 3;
                            } else {
                                if (h3 != 4) {
                                    StringBuilder sb3 = new StringBuilder(fn0.a(h3, 36));
                                    sb3.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb3.append(h3);
                                    throw zzat.b(sb3.toString());
                                }
                                c = 1;
                            }
                            zzetVar.f(2);
                            uaa.B(zzetVar);
                            int h4 = zzetVar.h(5);
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                int i18 = i9;
                                int i19 = 16;
                                if (i16 < h4 + 1) {
                                    int h5 = zzetVar.h(3);
                                    i17 = uaa.D(zzetVar, 5, 8, 16) + 1 + i17;
                                    if ((h5 == 0 || h5 == 2) && zzetVar.g()) {
                                        uaa.B(zzetVar);
                                    }
                                    i16++;
                                    i9 = i18;
                                } else {
                                    int D = uaa.D(zzetVar, 4, 8, 16) + 1;
                                    zzetVar.e();
                                    int i20 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i20 < D) {
                                            int h6 = zzetVar.h(2);
                                            if (h6 == 0) {
                                                c2 = c4;
                                                zzetVar.f(3);
                                                if (zzetVar.g()) {
                                                    zzetVar.f(13);
                                                }
                                                if (c > 0) {
                                                    uaa.C(zzetVar);
                                                }
                                            } else if (h6 != i18) {
                                                if (h6 == 3) {
                                                    uaa.D(zzetVar, i14, i8, i19);
                                                    int D2 = uaa.D(zzetVar, i14, i8, i19);
                                                    if (zzetVar.g()) {
                                                        uaa.D(zzetVar, i8, i19, 0);
                                                    }
                                                    zzetVar.e();
                                                    if (D2 > 0) {
                                                        zzetVar.f(D2 * 8);
                                                    }
                                                }
                                                c2 = 5;
                                            } else {
                                                zzetVar.f(3);
                                                boolean g = zzetVar.g();
                                                if (g) {
                                                    zzetVar.f(13);
                                                }
                                                if (g) {
                                                    zzetVar.e();
                                                }
                                                if (c > 0) {
                                                    uaa.C(zzetVar);
                                                    i6 = zzetVar.h(2);
                                                    c3 = c;
                                                } else {
                                                    i6 = 0;
                                                    c3 = 0;
                                                }
                                                if (i6 > 0) {
                                                    zzetVar.f(6);
                                                    int h7 = zzetVar.h(2);
                                                    zzetVar.f(i14);
                                                    c2 = 5;
                                                    if (zzetVar.g()) {
                                                        zzetVar.f(5);
                                                    }
                                                    if (i6 == 2 || i6 == 3) {
                                                        zzetVar.f(6);
                                                    }
                                                    if (h7 == 2) {
                                                        zzetVar.e();
                                                    }
                                                } else {
                                                    c2 = 5;
                                                }
                                                int floor = ((int) Math.floor(Math.log(i17 - 1) / Math.log(2.0d))) + 1;
                                                int h8 = zzetVar.h(2);
                                                if (h8 > 0 && zzetVar.g()) {
                                                    zzetVar.f(floor);
                                                }
                                                if (zzetVar.g()) {
                                                    zzetVar.f(floor);
                                                }
                                                if (c3 == 0 && h8 == 0) {
                                                    zzetVar.e();
                                                }
                                            }
                                            i20++;
                                            c4 = c2;
                                            i8 = 8;
                                            i19 = 16;
                                            i14 = 4;
                                            i18 = 1;
                                        } else {
                                            if (zzetVar.g()) {
                                                int i21 = 8;
                                                int D3 = uaa.D(zzetVar, 2, 4, 8) + 1;
                                                int i22 = 0;
                                                bArr = null;
                                                while (i22 < D3) {
                                                    int D4 = uaa.D(zzetVar, 4, i21, 16);
                                                    int D5 = uaa.D(zzetVar, 4, i21, 16);
                                                    if (D4 == 7) {
                                                        int h9 = zzetVar.h(4) + 1;
                                                        zzetVar.f(4);
                                                        byte[] bArr3 = new byte[h9];
                                                        for (int i23 = 0; i23 < h9; i23++) {
                                                            bArr3[i23] = (byte) zzetVar.h(i21);
                                                        }
                                                        bArr = bArr3;
                                                    } else {
                                                        zzetVar.f(D5 * i21);
                                                    }
                                                    i22++;
                                                    i21 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i4) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i15 * d);
                                                    j = this.t;
                                                    j2 = zzaqvVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String concat = h != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(h))) : "mhm1";
                                                        s u = (bArr == null || bArr.length <= 0) ? null : zzgxm.u(zzfm.b, bArr);
                                                        zzt zztVar = new zzt();
                                                        zztVar.a = this.e;
                                                        zztVar.c("video/mp2t");
                                                        zztVar.d("audio/mhm1");
                                                        zztVar.I = this.q;
                                                        zztVar.j = concat;
                                                        zztVar.q = u;
                                                        this.f.e(new zzv(zztVar));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i4 * d);
                                                    this.r = (int) (i15 * d);
                                                    j = this.t;
                                                    j2 = zzaqvVar.b;
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
                                                    this.r = (int) (i15 * d);
                                                    j = this.t;
                                                    j2 = zzaqvVar.b;
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
                                                    this.r = (int) (i15 * d);
                                                    j = this.t;
                                                    j2 = zzaqvVar.b;
                                                    if (j != j2) {
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(i4).length() + 26);
                                                    sb4.append("Unsupported sampling rate ");
                                                    sb4.append(i4);
                                                    throw zzat.b(sb4.toString());
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i13 == 17) {
                                byte[] bArr4 = zzeuVar2.a;
                                zzet zzetVar2 = new zzet(bArr4, bArr4.length);
                                if (zzetVar2.g()) {
                                    zzetVar2.f(2);
                                    i3 = zzetVar2.h(13);
                                } else {
                                    i3 = 0;
                                }
                                this.s = i3;
                            } else if (i13 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                int i24 = this.r - this.s;
                                double d2 = this.q;
                                long round = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += (i24 * 1000000.0d) / d2;
                                }
                                this.f.f(round, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                } else {
                    int B = zzeuVar.B();
                    zzeu zzeuVar3 = this.a;
                    int min3 = Math.min(B, zzeuVar3.B());
                    zzeuVar.F(zzeuVar3.b, min3, zzeuVar3.a);
                    zzeuVar3.E(min3);
                    if (zzeuVar3.B() == 0) {
                        int i25 = zzeuVar3.c;
                        byte[] bArr5 = zzeuVar3.a;
                        zzet zzetVar3 = this.b;
                        zzetVar3.a = bArr5;
                        zzetVar3.b = 0;
                        zzetVar3.c = 0;
                        zzetVar3.d = i25;
                        zzetVar3.c();
                        int D6 = uaa.D(zzetVar3, 3, 8, 8);
                        zzaqvVar.a = D6;
                        if (D6 != -1) {
                            zzguk.a(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (zzetVar3.b() >= 2) {
                                long i26 = zzetVar3.i(2);
                                if (i26 == 3) {
                                    if (zzetVar3.b() >= 8) {
                                        long i27 = zzetVar3.i(8);
                                        long j4 = i27 + 3;
                                        if (i27 != 255) {
                                            i26 = j4;
                                        } else if (zzetVar3.b() >= 32) {
                                            i26 = zzetVar3.i(32) + j4;
                                        }
                                    }
                                }
                                j3 = i26;
                                zzaqvVar.b = j3;
                                if (j3 != -1) {
                                    if (j3 > 16) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(j3).length() + 49);
                                        sb5.append("Contains sub-stream with an invalid packet label ");
                                        sb5.append(j3);
                                        throw zzat.b(sb5.toString());
                                    }
                                    if (j3 == 0) {
                                        int i28 = zzaqvVar.a;
                                        if (i28 == 1) {
                                            throw zzat.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i28 == 2) {
                                            throw zzat.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i28 == 17) {
                                            throw zzat.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int D7 = uaa.D(zzetVar3, 11, 24, 24);
                                    zzaqvVar.c = D7;
                                    if (D7 != -1) {
                                        this.n = 0;
                                        this.o = D7 + i25 + this.o;
                                        zzeuVar3.D(0);
                                        this.f.b(zzeuVar3.c, zzeuVar3);
                                        zzeuVar3.y(2);
                                        zzeuVar2.y(zzaqvVar.c);
                                        this.m = true;
                                        this.d = 2;
                                    }
                                }
                            }
                            j3 = -1;
                            zzaqvVar.b = j3;
                            if (j3 != -1) {
                            }
                        }
                        int i29 = zzeuVar3.c;
                        if (i29 < 15) {
                            zzeuVar3.C(i29 + 1);
                        }
                    }
                    this.m = false;
                }
            } else {
                int i30 = this.k;
                if ((i30 & 2) == 0) {
                    zzeuVar.D(zzeuVar.c);
                } else {
                    if ((i30 & 4) == 0) {
                        while (zzeuVar.B() > 0) {
                            int i31 = this.l << 8;
                            this.l = i31;
                            int I = i31 | zzeuVar.I();
                            this.l = I;
                            if ((I & 16777215) == 12583333) {
                                zzeuVar.D(zzeuVar.b - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.d = 0;
        this.l = 0;
        this.a.y(2);
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
}
