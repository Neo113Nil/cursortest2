package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.b59;
import defpackage.l2a;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqj implements zzaqh {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public zzaht b;
    public final l2a c;
    public final String d;
    public final zzeu e;
    public final zzaqy f;
    public final boolean[] g = new boolean[4];
    public final b59 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public zzaqj(l2a l2aVar, String str) {
        zzeu zzeuVar;
        this.c = l2aVar;
        this.d = str;
        b59 b59Var = new b59(2);
        b59Var.e = new byte[128];
        this.h = b59Var;
        if (l2aVar != null) {
            this.f = new zzaqy(178);
            zzeuVar = new zzeu();
        } else {
            zzeuVar = null;
            this.f = null;
        }
        this.e = zzeuVar;
        this.m = C.TIME_UNSET;
        this.o = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.a = zzarvVar.e;
        zzarvVar.b();
        this.b = zzagkVar.b(zzarvVar.d, 2);
        l2a l2aVar = this.c;
        if (l2aVar != null) {
            l2aVar.J(zzagkVar, zzarvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        this.m = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zzeu zzeuVar) {
        zzaqy zzaqyVar;
        b59 b59Var;
        int i;
        long j;
        long j2;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        long j3;
        byte b;
        int i6;
        this.b.getClass();
        int i7 = zzeuVar.b;
        int i8 = zzeuVar.c;
        byte[] bArr = zzeuVar.a;
        this.i += zzeuVar.B();
        this.b.b(zzeuVar.B(), zzeuVar);
        while (true) {
            int g = zzgr.g(bArr, i7, i8, this.g);
            zzaqyVar = this.f;
            b59Var = this.h;
            if (g == i8) {
                break;
            }
            int i9 = g + 3;
            boolean z3 = zzeuVar.a[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i10 = g - i7;
            if (this.k) {
                i = i8;
            } else {
                if (i10 > 0) {
                    b59Var.b(i7, g, bArr);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                if (b59Var.b) {
                    int i12 = b59Var.c - i11;
                    b59Var.c = i12;
                    if (b59Var.d == 0 && z3 == 181) {
                        b59Var.d = i12;
                        i = i8;
                    } else {
                        b59Var.b = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf((byte[]) b59Var.e, b59Var.c);
                        int i13 = copyOf[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        byte b2 = copyOf[5];
                        int i14 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        i = i8;
                        int i15 = copyOf[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        int i16 = (i14 >> 4) | (i13 << 4);
                        int i17 = (copyOf[7] & 240) >> 4;
                        int i18 = ((b2 & 15) << 8) | i15;
                        if (i17 == 2) {
                            i3 = i18 * 4;
                            i4 = i16 * 3;
                        } else if (i17 == 3) {
                            i3 = i18 * 16;
                            i4 = i16 * 9;
                        } else if (i17 != 4) {
                            f = 1.0f;
                            zzt zztVar = new zzt();
                            zztVar.a = str;
                            zztVar.c(this.d);
                            zztVar.d(MimeTypes.VIDEO_MPEG2);
                            zztVar.u = i16;
                            zztVar.v = i18;
                            zztVar.B = f;
                            zztVar.q = Collections.singletonList(copyOf);
                            zzv zzvVar = new zzv(zztVar);
                            i5 = (copyOf[7] & 15) - 1;
                            j3 = 0;
                            if (i5 >= 0 && i5 < 8) {
                                double d = r[i5];
                                b = copyOf[b59Var.d + 9];
                                i6 = (b & 96) >> 5;
                                if (i6 == (b & 31)) {
                                    d = ((i6 + 1.0d) / (r7 + 1)) * d;
                                }
                                j3 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(zzvVar, Long.valueOf(j3));
                            this.b.e((zzv) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            i3 = i18 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            i4 = i16 * 100;
                        }
                        f = i3 / i4;
                        zzt zztVar2 = new zzt();
                        zztVar2.a = str;
                        zztVar2.c(this.d);
                        zztVar2.d(MimeTypes.VIDEO_MPEG2);
                        zztVar2.u = i16;
                        zztVar2.v = i18;
                        zztVar2.B = f;
                        zztVar2.q = Collections.singletonList(copyOf);
                        zzv zzvVar2 = new zzv(zztVar2);
                        i5 = (copyOf[7] & 15) - 1;
                        j3 = 0;
                        if (i5 >= 0) {
                            double d2 = r[i5];
                            b = copyOf[b59Var.d + 9];
                            i6 = (b & 96) >> 5;
                            if (i6 == (b & 31)) {
                            }
                            j3 = (long) (1000000.0d / d2);
                        }
                        Pair create2 = Pair.create(zzvVar2, Long.valueOf(j3));
                        this.b.e((zzv) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i8;
                    if (z3 == 179) {
                        b59Var.b = true;
                    }
                }
                b59Var.b(0, 3, b59.h);
            }
            if (zzaqyVar != null) {
                if (i10 > 0) {
                    zzaqyVar.c(i7, g, bArr);
                    i2 = 0;
                } else {
                    i2 = -i10;
                }
                if (zzaqyVar.d(i2)) {
                    int a = zzgr.a(zzaqyVar.e, zzaqyVar.d);
                    String str2 = zzfm.a;
                    byte[] bArr2 = zzaqyVar.d;
                    zzeu zzeuVar2 = this.e;
                    zzeuVar2.z(a, bArr2);
                    this.c.K(this.o, zzeuVar2);
                }
                if (z3 == 178) {
                    if (zzeuVar.a[g + 2] == 1) {
                        zzaqyVar.b(178);
                    }
                    z3 = 178;
                }
            }
            if (z3 == 0 || z3 == 179) {
                int i19 = i - g;
                if (this.q && this.k) {
                    long j4 = this.o;
                    if (j4 != C.TIME_UNSET) {
                        j = -9223372036854775807L;
                        this.b.f(j4, this.p ? 1 : 0, ((int) (this.i - this.n)) - i19, i19, null);
                        if (this.j || this.q) {
                            this.n = this.i - i19;
                            j2 = this.m;
                            if (j2 == j) {
                                long j5 = this.o;
                                j2 = j5 != j ? j5 + this.l : j;
                            }
                            this.o = j2;
                            z = false;
                            this.p = false;
                            this.m = j;
                            z2 = true;
                            this.j = true;
                        } else {
                            z2 = true;
                            z = false;
                        }
                        this.q = z3 != 0 ? z2 : z;
                    }
                }
                j = -9223372036854775807L;
                if (this.j) {
                }
                this.n = this.i - i19;
                j2 = this.m;
                if (j2 == j) {
                }
                this.o = j2;
                z = false;
                this.p = false;
                this.m = j;
                z2 = true;
                this.j = true;
                this.q = z3 != 0 ? z2 : z;
            } else if (z3 == 184) {
                this.p = true;
            }
            i7 = i9;
            i8 = i;
        }
        if (!this.k) {
            b59Var.b(i7, i8, bArr);
        }
        if (zzaqyVar != null) {
            zzaqyVar.c(i7, i8, bArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        zzgr.h(this.g);
        b59 b59Var = this.h;
        b59Var.b = false;
        b59Var.c = 0;
        b59Var.d = 0;
        zzaqy zzaqyVar = this.f;
        if (zzaqyVar != null) {
            zzaqyVar.a();
        }
        this.i = 0L;
        this.j = false;
        this.m = C.TIME_UNSET;
        this.o = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        zzaht zzahtVar = this.b;
        zzahtVar.getClass();
        long j = this.o;
        if (j != C.TIME_UNSET) {
            boolean z = this.p;
            zzahtVar.f(j, z ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }
}
