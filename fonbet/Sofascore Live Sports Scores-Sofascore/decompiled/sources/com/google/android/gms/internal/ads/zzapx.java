package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzapx implements zzaqh {
    public final zzet a;
    public final zzeu b;
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public zzaht g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public zzv l;
    public int m;
    public long n;

    public zzapx(String str, int i, String str2) {
        zzet zzetVar = new zzet(new byte[128], 128);
        this.a = zzetVar;
        this.b = new zzeu(zzetVar.a);
        this.h = 0;
        this.n = C.TIME_UNSET;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.f = zzarvVar.e;
        zzarvVar.b();
        this.g = zzagkVar.b(zzarvVar.d, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        this.n = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a3  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zzeu zzeuVar) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int h;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.g.getClass();
        while (zzeuVar.B() > 0) {
            int i16 = this.h;
            zzeu zzeuVar2 = this.b;
            if (i16 == 0) {
                while (true) {
                    if (zzeuVar.B() <= 0) {
                        break;
                    }
                    if (this.j) {
                        int I = zzeuVar.I();
                        if (I == 119) {
                            this.j = false;
                            this.h = 1;
                            byte[] bArr = zzeuVar2.a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.i = 2;
                            break;
                        }
                        this.j = I == 11;
                    } else {
                        this.j = zzeuVar.I() == 11;
                    }
                }
            } else if (i16 != 1) {
                int min = Math.min(zzeuVar.B(), this.m - this.i);
                this.g.b(min, zzeuVar);
                int i17 = this.i + min;
                this.i = i17;
                if (i17 == this.m) {
                    zzguk.f(this.n != C.TIME_UNSET);
                    this.g.f(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                }
            } else {
                byte[] bArr2 = zzeuVar2.a;
                int min2 = Math.min(zzeuVar.B(), 128 - this.i);
                zzeuVar.F(this.i, min2, bArr2);
                int i18 = this.i + min2;
                this.i = i18;
                if (i18 == 128) {
                    zzet zzetVar = this.a;
                    zzetVar.d(0);
                    int i19 = (zzetVar.b * 8) + zzetVar.c;
                    zzetVar.f(40);
                    int h2 = zzetVar.h(5);
                    zzetVar.d(i19);
                    int[] iArr = zzafh.d;
                    int[] iArr2 = zzafh.b;
                    if (h2 > 10) {
                        zzetVar.f(16);
                        int h3 = zzetVar.h(2);
                        char c = h3 != 0 ? h3 != 1 ? h3 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                        zzetVar.f(3);
                        int h4 = zzetVar.h(11) + 1;
                        int h5 = zzetVar.h(2);
                        if (h5 == 3) {
                            i6 = zzafh.c[zzetVar.h(2)];
                            h = 3;
                            i7 = 6;
                        } else {
                            h = zzetVar.h(2);
                            int i20 = zzafh.a[h];
                            i6 = iArr2[h5];
                            i7 = i20;
                        }
                        i5 = h4 + h4;
                        int i21 = (i5 * i6) / (i7 * 32);
                        int h6 = zzetVar.h(3);
                        boolean g = zzetVar.g();
                        i3 = iArr[h6] + (g ? 1 : 0);
                        zzetVar.f(10);
                        if (zzetVar.g()) {
                            zzetVar.f(8);
                        }
                        if (h6 == 0) {
                            zzetVar.f(5);
                            if (zzetVar.g()) {
                                zzetVar.f(8);
                            }
                            i8 = 0;
                            h6 = 0;
                        } else {
                            i8 = h6;
                        }
                        if (c == 1) {
                            if (zzetVar.g()) {
                                zzetVar.f(16);
                            }
                            c = 1;
                        }
                        if (zzetVar.g()) {
                            if (i8 > 2) {
                                zzetVar.f(2);
                            }
                            if ((i8 & 1) == 0 || i8 <= 2) {
                                i12 = 6;
                            } else {
                                i12 = 6;
                                zzetVar.f(6);
                            }
                            if ((i8 & 4) != 0) {
                                zzetVar.f(i12);
                            }
                            if (g && zzetVar.g()) {
                                zzetVar.f(5);
                            }
                            if (c == 0) {
                                if (zzetVar.g()) {
                                    i13 = 6;
                                    zzetVar.f(6);
                                } else {
                                    i13 = 6;
                                }
                                if (i8 == 0 && zzetVar.g()) {
                                    zzetVar.f(i13);
                                }
                                if (zzetVar.g()) {
                                    zzetVar.f(i13);
                                }
                                int h7 = zzetVar.h(2);
                                if (h7 == 1) {
                                    zzetVar.f(5);
                                    i14 = 2;
                                } else {
                                    if (h7 == 2) {
                                        zzetVar.f(12);
                                    } else if (h7 == 3) {
                                        int h8 = zzetVar.h(5);
                                        if (zzetVar.g()) {
                                            zzetVar.f(5);
                                            if (zzetVar.g()) {
                                                i15 = 4;
                                                zzetVar.f(4);
                                            } else {
                                                i15 = 4;
                                            }
                                            if (zzetVar.g()) {
                                                zzetVar.f(i15);
                                            }
                                            if (zzetVar.g()) {
                                                zzetVar.f(i15);
                                            }
                                            if (zzetVar.g()) {
                                                zzetVar.f(i15);
                                            }
                                            if (zzetVar.g()) {
                                                zzetVar.f(i15);
                                            }
                                            if (zzetVar.g()) {
                                                zzetVar.f(i15);
                                            }
                                            if (zzetVar.g()) {
                                                zzetVar.f(i15);
                                            }
                                            if (zzetVar.g()) {
                                                if (zzetVar.g()) {
                                                    zzetVar.f(i15);
                                                }
                                                if (zzetVar.g()) {
                                                    zzetVar.f(i15);
                                                }
                                            }
                                        }
                                        if (zzetVar.g()) {
                                            zzetVar.f(5);
                                            if (zzetVar.g()) {
                                                zzetVar.f(7);
                                                if (zzetVar.g()) {
                                                    zzetVar.f(8);
                                                    i14 = 2;
                                                    zzetVar.f((h8 + i14) * 8);
                                                    zzetVar.k();
                                                }
                                            }
                                        }
                                        i14 = 2;
                                        zzetVar.f((h8 + i14) * 8);
                                        zzetVar.k();
                                    }
                                    i14 = 2;
                                }
                                if (i8 < i14) {
                                    if (zzetVar.g()) {
                                        zzetVar.f(14);
                                    }
                                    if (h6 == 0 && zzetVar.g()) {
                                        zzetVar.f(14);
                                    }
                                }
                                if (zzetVar.g()) {
                                    if (h == 0) {
                                        zzetVar.f(5);
                                        i9 = 0;
                                        c = 0;
                                        if (zzetVar.g()) {
                                            zzetVar.f(5);
                                            if (i8 == 2) {
                                                zzetVar.f(4);
                                                i8 = 2;
                                            }
                                            if (i8 >= 6) {
                                                zzetVar.f(2);
                                            }
                                            if (zzetVar.g()) {
                                                i11 = 8;
                                                zzetVar.f(8);
                                            } else {
                                                i11 = 8;
                                            }
                                            if (i8 == 0 && zzetVar.g()) {
                                                zzetVar.f(i11);
                                            }
                                            if (h5 < 3) {
                                                zzetVar.e();
                                            }
                                        }
                                        if (c == 0 && i9 != 3) {
                                            zzetVar.e();
                                        }
                                        if (c == 2 || !(i9 == 3 || zzetVar.g())) {
                                            i10 = 6;
                                        } else {
                                            i10 = 6;
                                            zzetVar.f(6);
                                        }
                                        str = (!zzetVar.g() && zzetVar.h(i10) == 1 && zzetVar.h(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
                                        i4 = i7 * NotificationCompat.FLAG_LOCAL_ONLY;
                                        i = i21;
                                    } else {
                                        for (int i22 = 0; i22 < i7; i22++) {
                                            if (zzetVar.g()) {
                                                zzetVar.f(5);
                                            }
                                        }
                                    }
                                }
                                i9 = h;
                                c = 0;
                                if (zzetVar.g()) {
                                }
                                if (c == 0) {
                                    zzetVar.e();
                                }
                                if (c == 2) {
                                }
                                i10 = 6;
                                if (!zzetVar.g()) {
                                }
                                i4 = i7 * NotificationCompat.FLAG_LOCAL_ONLY;
                                i = i21;
                            }
                        }
                        i9 = h;
                        if (zzetVar.g()) {
                        }
                        if (c == 0) {
                        }
                        if (c == 2) {
                        }
                        i10 = 6;
                        if (!zzetVar.g()) {
                        }
                        i4 = i7 * NotificationCompat.FLAG_LOCAL_ONLY;
                        i = i21;
                    } else {
                        zzetVar.f(32);
                        int h9 = zzetVar.h(2);
                        String str2 = h9 == 3 ? null : MimeTypes.AUDIO_AC3;
                        int h10 = zzetVar.h(6);
                        i = zzafh.e[h10 / 2] * 1000;
                        int a = zzafh.a(h9, h10);
                        zzetVar.f(8);
                        int h11 = zzetVar.h(3);
                        if ((h11 & 1) == 0 || h11 == 1) {
                            i2 = 2;
                        } else {
                            i2 = 2;
                            zzetVar.f(2);
                        }
                        if ((h11 & 4) != 0) {
                            zzetVar.f(i2);
                        }
                        if (h11 == i2) {
                            zzetVar.f(i2);
                        }
                        int i23 = h9 < 3 ? iArr2[h9] : -1;
                        i3 = iArr[h11] + (zzetVar.g() ? 1 : 0);
                        i4 = 1536;
                        str = str2;
                        i5 = a;
                        i6 = i23;
                    }
                    zzv zzvVar = this.l;
                    if (zzvVar == null || i3 != zzvVar.H || i6 != zzvVar.J || !Objects.equals(str, zzvVar.o)) {
                        zzt zztVar = new zzt();
                        zztVar.a = this.f;
                        zztVar.c(this.e);
                        zztVar.d(str);
                        zztVar.G = i3;
                        zztVar.I = i6;
                        zztVar.d = this.c;
                        zztVar.f = this.d;
                        zztVar.i = i;
                        if (MimeTypes.AUDIO_AC3.equals(str)) {
                            zztVar.h = i;
                        }
                        zzv zzvVar2 = new zzv(zztVar);
                        this.l = zzvVar2;
                        this.g.e(zzvVar2);
                    }
                    this.m = i5;
                    this.k = (i4 * 1000000) / this.l.J;
                    zzeuVar2.D(0);
                    this.g.b(128, zzeuVar2);
                    this.h = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = C.TIME_UNSET;
    }
}
