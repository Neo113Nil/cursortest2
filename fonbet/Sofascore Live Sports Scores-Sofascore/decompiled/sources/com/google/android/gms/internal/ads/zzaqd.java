package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqd implements zzaqh {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public zzaht h;
    public zzaht i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public zzaht v;
    public long w;
    public final zzet b = new zzet(new byte[7], 7);
    public final zzeu c = new zzeu(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = C.TIME_UNSET;
    public long u = C.TIME_UNSET;
    public int j = 0;
    public int k = 0;
    public int l = NotificationCompat.FLAG_LOCAL_ONLY;

    public zzaqd(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.g = zzarvVar.e;
        zzarvVar.b();
        zzaht b = zzagkVar.b(zzarvVar.d, 1);
        this.h = b;
        this.v = b;
        if (!this.a) {
            this.i = new zzage();
            return;
        }
        zzarvVar.a();
        zzarvVar.b();
        zzaht b2 = zzagkVar.b(zzarvVar.d, 5);
        this.i = b2;
        zzt zztVar = new zzt();
        zzarvVar.b();
        zztVar.a = zzarvVar.e;
        zztVar.c(this.f);
        zztVar.d(MimeTypes.APPLICATION_ID3);
        b2.e(new zzv(zztVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        this.u = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x021f, code lost:
    
        r19 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0313 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zzeu zzeuVar) {
        int i;
        int i2;
        byte b;
        char c;
        int i3;
        int i4;
        char c2;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        this.h.getClass();
        String str = zzfm.a;
        while (zzeuVar.B() > 0) {
            int i9 = this.j;
            zzeu zzeuVar2 = this.c;
            zzet zzetVar = this.b;
            int i10 = 4;
            int i11 = 3;
            char c4 = 65535;
            int i12 = 0;
            int i13 = 1;
            if (i9 == 0) {
                byte[] bArr = zzeuVar.a;
                int i14 = zzeuVar.b;
                int i15 = zzeuVar.c;
                while (true) {
                    if (i14 >= i15) {
                        zzeuVar.D(i14);
                        break;
                    }
                    i = i14 + 1;
                    i2 = i11;
                    b = bArr[i14];
                    int i16 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (this.l != 512 || (((((byte) i16) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED ? 1 : 0) | 65280 ? 1 : 0) & 65526) != 65520) {
                        c = c4;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i17 = i14 - 1;
                        zzeuVar.D(i14);
                        byte[] bArr2 = zzetVar.a;
                        if (zzeuVar.B() < i13) {
                            i3 = i13;
                        } else {
                            zzeuVar.F(i12, i13, bArr2);
                            zzetVar.d(i10);
                            int h = zzetVar.h(i13);
                            int i18 = this.o;
                            if (i18 == -1 || h == i18) {
                                if (this.p != -1) {
                                    byte[] bArr3 = zzetVar.a;
                                    if (zzeuVar.B() < i13) {
                                        break;
                                    }
                                    zzeuVar.F(i12, i13, bArr3);
                                    zzetVar.d(2);
                                    i8 = 4;
                                    i7 = i13;
                                    if (zzetVar.h(4) == this.p) {
                                        zzeuVar.D(i);
                                    } else {
                                        i3 = i7;
                                    }
                                } else {
                                    i7 = i13;
                                    i8 = 4;
                                }
                                byte[] bArr4 = zzetVar.a;
                                if (zzeuVar.B() < i8) {
                                    break;
                                }
                                zzeuVar.F(i12, i8, bArr4);
                                zzetVar.d(14);
                                int h2 = zzetVar.h(13);
                                if (h2 >= 7) {
                                    byte[] bArr5 = zzeuVar.a;
                                    int i19 = zzeuVar.c;
                                    int i20 = i17 + h2;
                                    if (i20 >= i19) {
                                        break;
                                    }
                                    byte b2 = bArr5[i20];
                                    c = 65535;
                                    if (b2 != -1) {
                                        if (b2 == 73) {
                                            int i21 = i20 + 1;
                                            if (i21 == i19) {
                                                break;
                                            }
                                            if (bArr5[i21] == 68) {
                                                int i22 = i20 + 2;
                                                if (i22 == i19) {
                                                    break;
                                                } else if (bArr5[i22] == 51) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        int i23 = i20 + 1;
                                        if (i23 == i19) {
                                            break;
                                        }
                                        byte b3 = bArr5[i23];
                                        if ((((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED ? 1 : 0) | 65280 ? 1 : 0) & 65526) == 65520 && ((b3 & 8) >> 3) == h) {
                                            break;
                                        }
                                    }
                                } else {
                                    c = 65535;
                                }
                                i3 = i7;
                                int i24 = this.l;
                                i4 = i16 | i24;
                                if (i4 == 329) {
                                    c2 = 256;
                                    c3 = 2;
                                    i11 = 3;
                                    i5 = 0;
                                    i6 = 768;
                                } else if (i4 == 511) {
                                    c2 = 256;
                                    c3 = 2;
                                    i11 = 3;
                                    i5 = 0;
                                    i6 = 512;
                                } else if (i4 == 836) {
                                    c2 = 256;
                                    c3 = 2;
                                    i11 = 3;
                                    i5 = 0;
                                    i6 = 1024;
                                } else {
                                    if (i4 == 1075) {
                                        this.j = 2;
                                        this.k = 3;
                                        this.t = 0;
                                        zzeuVar2.D(0);
                                        zzeuVar.D(i);
                                        break;
                                    }
                                    c2 = 256;
                                    if (i24 != 256) {
                                        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                                        i13 = i3;
                                        c4 = c;
                                        i10 = 4;
                                        i11 = 3;
                                        i12 = 0;
                                    } else {
                                        c3 = 2;
                                        i11 = 3;
                                        i5 = 0;
                                        char c5 = c;
                                        i12 = i5;
                                        c4 = c5;
                                        i14 = i;
                                        i13 = i3;
                                        i10 = 4;
                                    }
                                }
                                this.l = i6;
                                char c52 = c;
                                i12 = i5;
                                c4 = c52;
                                i14 = i;
                                i13 = i3;
                                i10 = 4;
                            } else {
                                c = 65535;
                            }
                        }
                        c = 65535;
                        int i242 = this.l;
                        i4 = i16 | i242;
                        if (i4 == 329) {
                        }
                        this.l = i6;
                        char c522 = c;
                        i12 = i5;
                        c4 = c522;
                        i14 = i;
                        i13 = i3;
                        i10 = 4;
                    }
                    i3 = i13;
                    int i2422 = this.l;
                    i4 = i16 | i2422;
                    if (i4 == 329) {
                    }
                    this.l = i6;
                    char c5222 = c;
                    i12 = i5;
                    c4 = c5222;
                    i14 = i;
                    i13 = i3;
                    i10 = 4;
                }
                this.q = (b & 8) >> 3;
                int i25 = i7;
                this.m = i25 != ((b & 1) ^ 1) ? 0 : i25;
                if (this.n) {
                    this.j = i2;
                    this.k = 0;
                } else {
                    this.j = i25;
                    this.k = 0;
                }
                zzeuVar.D(i);
            } else if (i9 != 1) {
                if (i9 == 2) {
                    byte[] bArr6 = zzeuVar2.a;
                    int min = Math.min(zzeuVar.B(), 10 - this.k);
                    zzeuVar.F(this.k, min, bArr6);
                    int i26 = this.k + min;
                    this.k = i26;
                    if (i26 == 10) {
                        this.i.b(10, zzeuVar2);
                        zzeuVar2.D(6);
                        zzaht zzahtVar = this.i;
                        int g = zzeuVar2.g() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = zzahtVar;
                        this.w = 0L;
                        this.t = g;
                    }
                } else if (i9 != 3) {
                    int min2 = Math.min(zzeuVar.B(), this.t - this.k);
                    this.v.b(min2, zzeuVar);
                    int i27 = this.k + min2;
                    this.k = i27;
                    if (i27 == this.t) {
                        zzguk.f(this.u != C.TIME_UNSET);
                        this.v.f(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                    }
                } else {
                    int i28 = true != this.m ? 5 : 7;
                    byte[] bArr7 = zzetVar.a;
                    int min3 = Math.min(zzeuVar.B(), i28 - this.k);
                    zzeuVar.F(this.k, min3, bArr7);
                    int i29 = this.k + min3;
                    this.k = i29;
                    if (i29 == i28) {
                        zzetVar.d(0);
                        if (this.r) {
                            zzetVar.f(10);
                        } else {
                            int h3 = zzetVar.h(2) + 1;
                            if (h3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(h3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(h3);
                                sb.append(", but assuming AAC LC.");
                                zzeh.c(sb.toString());
                            }
                            zzetVar.f(5);
                            int h4 = zzetVar.h(3);
                            int i30 = this.p;
                            byte[] bArr8 = {(byte) (((i30 >> 1) & 7) | 16), (byte) (((h4 << 3) & 120) | ((i30 << 7) & 128))};
                            zzafe a = zzaff.a(new zzet(bArr8, 2), false);
                            zzt zztVar = new zzt();
                            zztVar.a = this.g;
                            zztVar.c(this.f);
                            zztVar.d(MimeTypes.AUDIO_AAC);
                            zztVar.j = a.c;
                            zztVar.G = a.b;
                            zztVar.I = a.a;
                            zztVar.q = Collections.singletonList(bArr8);
                            zztVar.d = this.d;
                            zztVar.f = this.e;
                            zzv zzvVar = new zzv(zztVar);
                            this.s = 1024000000 / zzvVar.J;
                            this.h.e(zzvVar);
                            this.r = true;
                        }
                        zzetVar.f(4);
                        int h5 = zzetVar.h(13);
                        int i31 = h5 - 7;
                        if (this.m) {
                            i31 = h5 - 9;
                        }
                        zzaht zzahtVar2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = zzahtVar2;
                        this.w = j;
                        this.t = i31;
                    }
                }
            } else if (zzeuVar.B() != 0) {
                zzetVar.a[0] = zzeuVar.a[zzeuVar.b];
                zzetVar.d(2);
                int h6 = zzetVar.h(4);
                int i32 = this.p;
                if (i32 == -1 || h6 == i32) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = h6;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.u = C.TIME_UNSET;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
    }
}
