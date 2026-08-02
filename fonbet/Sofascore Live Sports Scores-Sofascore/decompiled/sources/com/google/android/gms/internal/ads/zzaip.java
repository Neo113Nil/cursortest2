package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.agn;
import defpackage.d1l;
import defpackage.ilg;
import defpackage.x3f;
import defpackage.zfn;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaip implements zzagh {
    public final byte[] a;
    public final zzeu b;
    public final zzago c;
    public zzagk d;
    public zzaht e;
    public int f;
    public zzap g;
    public zzagu h;
    public int i;
    public int j;
    public agn k;
    public int l;
    public long m;

    public zzaip(int i) {
        this.a = new byte[42];
        this.b = new zzeu(new byte[32768], 0);
        this.c = new zzago();
        this.f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            agn agnVar = this.k;
            if (agnVar != null) {
                agnVar.a(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.y(0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        zzap a = new zzahc().a(zzagiVar, x3f.b, 0);
        if (a != null) {
            int length = a.a.length;
        }
        zzeu zzeuVar = new zzeu(4);
        ((zzafy) zzagiVar).f(zzeuVar.a, 0, 4, false);
        return zzeuVar.N() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.d = zzagkVar;
        this.e = zzagkVar.b(0, 1);
        zzagkVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        int i;
        zzahk zzahjVar;
        long j;
        boolean z;
        long j2;
        boolean z2;
        int i2 = this.f;
        zzap zzapVar = null;
        if (i2 == 0) {
            zzagiVar.zzl();
            long zzm = zzagiVar.zzm();
            zzap a = new zzahc().a(zzagiVar, null, 0);
            if (a != null && a.a.length != 0) {
                zzapVar = a;
            }
            zzagiVar.zzf((int) (zzagiVar.zzm() - zzm));
            this.g = zzapVar;
            this.f = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i2 == 1) {
            zzagiVar.h(0, 42, bArr);
            zzagiVar.zzl();
            this.f = 2;
            return 0;
        }
        int i3 = 3;
        int i4 = 4;
        if (i2 == 2) {
            zzeu zzeuVar = new zzeu(4);
            zzagiVar.g(0, 4, zzeuVar.a);
            if (zzeuVar.N() != 1716281667) {
                throw zzat.a(null, "Failed to read FLAC stream marker.");
            }
            this.f = 3;
            return 0;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                zzagiVar.zzl();
                zzeu zzeuVar2 = new zzeu(2);
                zzagiVar.h(0, 2, zzeuVar2.a);
                int J = zzeuVar2.J();
                if ((J >> 2) != 16382) {
                    zzagiVar.zzl();
                    throw zzat.a(null, "First frame does not start with sync code.");
                }
                zzagiVar.zzl();
                this.j = J;
                zzagk zzagkVar = this.d;
                String str = zzfm.a;
                long zzn = zzagiVar.zzn();
                long zzo = zzagiVar.zzo();
                zzagu zzaguVar = this.h;
                zzaguVar.getClass();
                zzagt zzagtVar = zzaguVar.k;
                if (zzagtVar != null && zzagtVar.a.length > 0) {
                    zzahjVar = new zzags(zzaguVar, zzn);
                    i = 0;
                } else if (zzo == -1 || zzaguVar.j <= 0) {
                    i = 0;
                    zzahjVar = new zzahj(zzaguVar.a(), 0L);
                } else {
                    int i5 = this.j;
                    int i6 = zzaguVar.c;
                    d1l d1lVar = new d1l(zzaguVar, i4);
                    zfn zfnVar = new zfn(zzaguVar, i5);
                    long a2 = zzaguVar.a();
                    long j3 = zzaguVar.j;
                    int i7 = zzaguVar.d;
                    if (i7 > 0) {
                        i = 0;
                        j = ((i7 + i6) / 2) + 1;
                    } else {
                        i = 0;
                        int i8 = zzaguVar.a;
                        long j4 = 4096;
                        if (i8 == zzaguVar.b && i8 > 0) {
                            j4 = i8;
                        }
                        j = (((zzaguVar.g * j4) * zzaguVar.h) / 8) + 64;
                    }
                    agn agnVar = new agn(d1lVar, zfnVar, a2, j3, zzn, zzo, j, Math.max(6, i6));
                    this.k = agnVar;
                    zzahjVar = agnVar.a;
                }
                zzagkVar.c(zzahjVar);
                this.f = 5;
                return i;
            }
            this.e.getClass();
            zzagu zzaguVar2 = this.h;
            zzaguVar2.getClass();
            agn agnVar2 = this.k;
            if (agnVar2 != null && agnVar2.c != null) {
                return agnVar2.b(zzagiVar, zzahhVar);
            }
            if (this.m == -1) {
                zzagiVar.zzl();
                zzagiVar.d(1);
                byte[] bArr2 = new byte[1];
                zzagiVar.h(0, 1, bArr2);
                int i9 = bArr2[0] & 1;
                boolean z3 = 1 == i9;
                zzagiVar.d(2);
                r10 = 1 != i9 ? 6 : 7;
                zzeu zzeuVar3 = new zzeu(r10);
                byte[] bArr3 = zzeuVar3.a;
                int i10 = 0;
                while (i10 < r10) {
                    int j5 = zzagiVar.j(i10, r10 - i10, bArr3);
                    if (j5 == -1) {
                        break;
                    }
                    i10 += j5;
                }
                zzeuVar3.C(i10);
                zzagiVar.zzl();
                zzago zzagoVar = new zzago();
                if (!zzagp.c(zzeuVar3, zzaguVar2, z3, zzagoVar)) {
                    throw zzat.a(null, null);
                }
                this.m = zzagoVar.a;
                return 0;
            }
            zzeu zzeuVar4 = this.b;
            int i11 = zzeuVar4.c;
            if (i11 < 32768) {
                int b = zzagiVar.b(i11, 32768 - i11, zzeuVar4.a);
                z = b == -1;
                if (!z) {
                    zzeuVar4.C(i11 + b);
                } else if (zzeuVar4.B() == 0) {
                    long j6 = this.m * 1000000;
                    zzagu zzaguVar3 = this.h;
                    String str2 = zzfm.a;
                    this.e.f(j6 / zzaguVar3.e, 1, this.l, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i12 = zzeuVar4.b;
            int i13 = this.l;
            int i14 = this.i;
            if (i13 < i14) {
                zzeuVar4.E(Math.min(i14 - i13, zzeuVar4.B()));
            }
            this.h.getClass();
            int i15 = zzeuVar4.b;
            while (true) {
                int i16 = zzeuVar4.c - 16;
                zzago zzagoVar2 = this.c;
                if (i15 <= i16) {
                    zzeuVar4.D(i15);
                    if (zzagp.a(zzeuVar4, this.h, this.j, zzagoVar2)) {
                        zzeuVar4.D(i15);
                        j2 = zzagoVar2.a;
                        break;
                    }
                    i15++;
                } else {
                    if (z) {
                        while (true) {
                            int i17 = zzeuVar4.c;
                            if (i15 > i17 - this.i) {
                                zzeuVar4.D(i17);
                                break;
                            }
                            zzeuVar4.D(i15);
                            try {
                                z2 = zzagp.a(zzeuVar4, this.h, this.j, zzagoVar2);
                            } catch (IndexOutOfBoundsException unused) {
                                z2 = false;
                            }
                            if (zzeuVar4.b <= zzeuVar4.c && z2) {
                                zzeuVar4.D(i15);
                                j2 = zzagoVar2.a;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        zzeuVar4.D(i15);
                    }
                    j2 = -1;
                }
            }
            int i18 = zzeuVar4.b - i12;
            zzeuVar4.D(i12);
            this.e.b(i18, zzeuVar4);
            int i19 = this.l + i18;
            this.l = i19;
            if (j2 != -1) {
                long j7 = this.m * 1000000;
                zzagu zzaguVar4 = this.h;
                String str3 = zzfm.a;
                this.e.f(j7 / zzaguVar4.e, 1, i19, 0, null);
                this.l = 0;
                this.m = j2;
            }
            int length = zzeuVar4.a.length - zzeuVar4.c;
            if (zzeuVar4.B() < 16 && length < 16) {
                int B = zzeuVar4.B();
                byte[] bArr4 = zzeuVar4.a;
                System.arraycopy(bArr4, zzeuVar4.b, bArr4, 0, B);
                zzeuVar4.D(0);
                zzeuVar4.C(B);
            }
            return 0;
        }
        int i20 = 0;
        zzagu zzaguVar5 = this.h;
        zzagq zzagqVar = new zzagq();
        zzagqVar.a = zzaguVar5;
        while (true) {
            zzagiVar.zzl();
            byte[] bArr5 = new byte[i4];
            zzet zzetVar = new zzet(bArr5, i4);
            int i21 = i20;
            zzagiVar.h(i21, i4, bArr5);
            boolean g = zzetVar.g();
            int h = zzetVar.h(r10);
            int h2 = zzetVar.h(24) + i4;
            if (h == 0) {
                byte[] bArr6 = new byte[38];
                zzagiVar.g(i21, 38, bArr6);
                zzagqVar.a = new zzagu(bArr6, i4);
            } else {
                zzagu zzaguVar6 = zzagqVar.a;
                if (zzaguVar6 == null) {
                    ilg.c();
                    return 0;
                }
                zzap zzapVar2 = zzaguVar6.l;
                if (h == i3) {
                    zzeu zzeuVar5 = new zzeu(h2);
                    zzagiVar.g(0, h2, zzeuVar5.a);
                    zzagqVar.a = new zzagu(zzaguVar6.a, zzaguVar6.b, zzaguVar6.c, zzaguVar6.d, zzaguVar6.e, zzaguVar6.g, zzaguVar6.h, zzaguVar6.j, zzagr.a(zzeuVar5), zzaguVar6.l);
                } else {
                    int i22 = i4;
                    if (h == i22) {
                        zzeu zzeuVar6 = new zzeu(h2);
                        zzagiVar.g(0, h2, zzeuVar6.a);
                        zzeuVar6.E(i22);
                        zzap a3 = zzahv.a(Arrays.asList(zzhh.b(zzeuVar6, false, false).a));
                        if (zzapVar2 != null) {
                            a3 = zzapVar2.a(a3);
                        }
                        zzagqVar.a = new zzagu(zzaguVar6.a, zzaguVar6.b, zzaguVar6.c, zzaguVar6.d, zzaguVar6.e, zzaguVar6.g, zzaguVar6.h, zzaguVar6.j, zzaguVar6.k, a3);
                    } else if (h == 6) {
                        zzeu zzeuVar7 = new zzeu(h2);
                        zzagiVar.g(0, h2, zzeuVar7.a);
                        zzeuVar7.E(4);
                        zzap zzapVar3 = new zzap(zzgxm.t(zzajn.b(zzeuVar7)));
                        if (zzapVar2 != null) {
                            zzapVar3 = zzapVar2.a(zzapVar3);
                        }
                        zzagqVar.a = new zzagu(zzaguVar6.a, zzaguVar6.b, zzaguVar6.c, zzaguVar6.d, zzaguVar6.e, zzaguVar6.g, zzaguVar6.h, zzaguVar6.j, zzaguVar6.k, zzapVar3);
                    } else {
                        zzagiVar.zzf(h2);
                    }
                }
            }
            zzagu zzaguVar7 = zzagqVar.a;
            String str4 = zzfm.a;
            this.h = zzaguVar7;
            if (g) {
                zzaguVar7.getClass();
                this.i = Math.max(zzaguVar7.c, 6);
                zzv b2 = this.h.b(bArr, this.g);
                zzaht zzahtVar = this.e;
                zzt zztVar = new zzt(b2);
                zztVar.c(MimeTypes.AUDIO_FLAC);
                zzahtVar.e(new zzv(zztVar));
                zzaht zzahtVar2 = this.e;
                this.h.a();
                zzahtVar2.getClass();
                this.f = 4;
                return 0;
            }
            i3 = 3;
            i4 = 4;
            r10 = 7;
            i20 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    public zzaip() {
        throw null;
    }
}
