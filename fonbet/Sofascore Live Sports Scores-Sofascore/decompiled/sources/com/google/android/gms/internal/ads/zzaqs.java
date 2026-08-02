package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqs implements zzaqh {
    public final String a;
    public final int b;
    public final zzeu c;
    public final zzet d;
    public zzaht e;
    public String f;
    public zzv g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public zzaqs(String str, int i) {
        this.a = str;
        this.b = i;
        zzeu zzeuVar = new zzeu(1024);
        this.c = zzeuVar;
        byte[] bArr = zzeuVar.a;
        this.d = new zzet(bArr, bArr.length);
        this.l = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.e = zzagkVar.b(zzarvVar.d, 1);
        zzarvVar.b();
        this.f = zzarvVar.e;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        this.l = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0199, code lost:
    
        if (r23.m == false) goto L68;
     */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zzeu zzeuVar) {
        int h;
        int i;
        int i2;
        boolean g;
        int i3;
        this.e.getClass();
        while (zzeuVar.B() > 0) {
            int i4 = this.h;
            if (i4 != 0) {
                int i5 = 2;
                if (i4 != 1) {
                    zzet zzetVar = this.d;
                    zzeu zzeuVar2 = this.c;
                    if (i4 != 2) {
                        int min = Math.min(zzeuVar.B(), this.j - this.i);
                        zzeuVar.F(this.i, min, zzetVar.a);
                        int i6 = this.i + min;
                        this.i = i6;
                        if (i6 == this.j) {
                            zzetVar.d(0);
                            if (!zzetVar.g()) {
                                this.m = true;
                                int h2 = zzetVar.h(1);
                                if (h2 == 1) {
                                    i2 = zzetVar.h(1);
                                    i = 1;
                                } else {
                                    i = h2;
                                    i2 = 0;
                                }
                                this.n = i2;
                                if (i2 != 0) {
                                    throw zzat.a(null, null);
                                }
                                if (i == 1) {
                                    zzetVar.h((zzetVar.h(2) + 1) * 8);
                                    i = 1;
                                }
                                if (!zzetVar.g()) {
                                    throw zzat.a(null, null);
                                }
                                this.o = zzetVar.h(6);
                                int h3 = zzetVar.h(4);
                                int h4 = zzetVar.h(3);
                                if (h3 != 0 || h4 != 0) {
                                    throw zzat.a(null, null);
                                }
                                if (i == 0) {
                                    int i7 = (zzetVar.b * 8) + zzetVar.c;
                                    int b = zzetVar.b();
                                    zzafe a = zzaff.a(zzetVar, true);
                                    this.v = a.c;
                                    this.s = a.a;
                                    this.u = a.b;
                                    int b2 = b - zzetVar.b();
                                    zzetVar.d(i7);
                                    byte[] bArr = new byte[(b2 + 7) / 8];
                                    zzetVar.j(b2, bArr);
                                    zzt zztVar = new zzt();
                                    zztVar.a = this.f;
                                    zztVar.c("video/mp2t");
                                    zztVar.d(MimeTypes.AUDIO_AAC);
                                    zztVar.j = this.v;
                                    zztVar.G = this.u;
                                    zztVar.I = this.s;
                                    zztVar.q = Collections.singletonList(bArr);
                                    zztVar.d = this.a;
                                    zztVar.f = this.b;
                                    zzv zzvVar = new zzv(zztVar);
                                    if (!zzvVar.equals(this.g)) {
                                        this.g = zzvVar;
                                        this.t = 1024000000 / zzvVar.J;
                                        this.e.e(zzvVar);
                                    }
                                } else {
                                    int b3 = zzetVar.b();
                                    zzafe a2 = zzaff.a(zzetVar, true);
                                    this.v = a2.c;
                                    this.s = a2.a;
                                    this.u = a2.b;
                                    zzetVar.f(zzetVar.h((zzetVar.h(2) + 1) * 8) - (b3 - zzetVar.b()));
                                }
                                int h5 = zzetVar.h(3);
                                this.p = h5;
                                if (h5 == 0) {
                                    zzetVar.f(8);
                                } else if (h5 == 1) {
                                    zzetVar.f(9);
                                } else if (h5 == 3 || h5 == 4 || h5 == 5) {
                                    zzetVar.f(6);
                                } else {
                                    if (h5 != 6 && h5 != 7) {
                                        defpackage.zzl.s();
                                        return;
                                    }
                                    zzetVar.f(1);
                                }
                                boolean g2 = zzetVar.g();
                                this.q = g2;
                                this.r = 0L;
                                if (g2) {
                                    if (i != 1) {
                                        do {
                                            g = zzetVar.g();
                                            this.r = (this.r << 8) + zzetVar.h(8);
                                        } while (g);
                                    } else {
                                        this.r = zzetVar.h((zzetVar.h(2) + 1) * 8);
                                    }
                                }
                                if (zzetVar.g()) {
                                    zzetVar.f(8);
                                }
                            }
                            if (this.n != 0) {
                                throw zzat.a(null, null);
                            }
                            if (this.o != 0) {
                                throw zzat.a(null, null);
                            }
                            if (this.p != 0) {
                                throw zzat.a(null, null);
                            }
                            int i8 = 0;
                            do {
                                h = zzetVar.h(8);
                                i8 += h;
                            } while (h == 255);
                            int i9 = (zzetVar.b * 8) + zzetVar.c;
                            if ((i9 & 7) == 0) {
                                zzeuVar2.D(i9 >> 3);
                            } else {
                                zzetVar.j(i8 * 8, zzeuVar2.a);
                                zzeuVar2.D(0);
                            }
                            this.e.b(i8, zzeuVar2);
                            zzguk.f(this.l != C.TIME_UNSET);
                            this.e.f(this.l, 1, i8, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                zzetVar.f((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int I = ((this.k & (-225)) << 8) | zzeuVar.I();
                        this.j = I;
                        if (I > zzeuVar2.a.length) {
                            zzeuVar2.y(I);
                            byte[] bArr2 = zzeuVar2.a;
                            int length = bArr2.length;
                            zzetVar.a = bArr2;
                            i3 = 0;
                            zzetVar.b = 0;
                            zzetVar.c = 0;
                            zzetVar.d = length;
                        } else {
                            i3 = 0;
                        }
                        this.i = i3;
                        this.h = 3;
                    }
                } else {
                    int I2 = zzeuVar.I();
                    if ((I2 & 224) == 224) {
                        this.k = I2;
                    } else if (I2 != 86) {
                        i5 = 0;
                    }
                    this.h = i5;
                }
            } else if (zzeuVar.I() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.h = 0;
        this.l = C.TIME_UNSET;
        this.m = false;
    }
}
