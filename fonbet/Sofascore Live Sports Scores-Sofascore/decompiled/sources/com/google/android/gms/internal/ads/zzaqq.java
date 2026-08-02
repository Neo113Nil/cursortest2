package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.l59;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqq implements zzaqh {
    public final zzark a;
    public String b;
    public zzaht c;
    public l59 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final zzaqy g = new zzaqy(32);
    public final zzaqy h = new zzaqy(33);
    public final zzaqy i = new zzaqy(34);
    public final zzaqy j = new zzaqy(39);
    public final zzaqy k = new zzaqy(40);
    public long m = C.TIME_UNSET;
    public final zzeu n = new zzeu();

    public zzaqq(zzark zzarkVar) {
        this.a = zzarkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.b = zzarvVar.e;
        zzarvVar.b();
        zzaht b = zzagkVar.b(zzarvVar.d, 2);
        this.c = b;
        this.d = new l59(b);
        this.a.a(zzagkVar, zzarvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        this.m = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void c(zzeu zzeuVar) {
        this.c.getClass();
        String str = zzfm.a;
        while (zzeuVar.B() > 0) {
            int i = zzeuVar.b;
            int i2 = zzeuVar.c;
            byte[] bArr = zzeuVar.a;
            this.l += zzeuVar.B();
            this.c.b(zzeuVar.B(), zzeuVar);
            while (i < i2) {
                int g = zzgr.g(bArr, i, i2, this.f);
                if (g == i2) {
                    e(i, i2, bArr);
                    return;
                }
                int i3 = bArr[g + 3] & 126;
                int i4 = 3;
                if (g > 0) {
                    int i5 = g - 1;
                    if (bArr[i5] == 0) {
                        i4 = 4;
                        g = i5;
                    }
                }
                int i6 = g - i;
                if (i6 > 0) {
                    e(i, g, bArr);
                }
                int i7 = i2 - g;
                long j = this.l - i7;
                f(i7, i6 < 0 ? -i6 : 0, j, this.m);
                d(i7, i3 >> 1, j, this.m);
                i = g + i4;
            }
        }
    }

    public final void d(int i, int i2, long j, long j2) {
        l59 l59Var = this.d;
        boolean z = this.e;
        l59Var.f = false;
        l59Var.g = false;
        l59Var.d = j2;
        l59Var.c = 0;
        l59Var.a = j;
        if (i2 >= 32 && i2 != 40) {
            if (l59Var.h && !l59Var.i) {
                if (z) {
                    l59Var.b(i);
                }
                l59Var.h = false;
            }
            if (i2 <= 35 || i2 == 39) {
                l59Var.g = !l59Var.i;
                l59Var.i = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        l59Var.b = z2;
        l59Var.e = z2 || i2 <= 9;
        if (!this.e) {
            this.g.b(i2);
            this.h.b(i2);
            this.i.b(i2);
        }
        this.j.b(i2);
        this.k.b(i2);
    }

    public final void e(int i, int i2, byte[] bArr) {
        l59 l59Var = this.d;
        if (l59Var.e) {
            int i3 = l59Var.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                l59Var.f = (bArr[i4] & 128) != 0;
                l59Var.e = false;
            } else {
                l59Var.c = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.c(i, i2, bArr);
            this.h.c(i, i2, bArr);
            this.i.c(i, i2, bArr);
        }
        this.j.c(i, i2, bArr);
        this.k.c(i, i2, bArr);
    }

    public final void f(int i, int i2, long j, long j2) {
        zzhc zzhcVar = this.a.c;
        l59 l59Var = this.d;
        boolean z = this.e;
        if (l59Var.i && l59Var.f) {
            l59Var.l = l59Var.b;
            l59Var.i = false;
        } else if (l59Var.g || l59Var.f) {
            if (z && l59Var.h) {
                l59Var.b(i + ((int) (j - l59Var.a)));
            }
            l59Var.j = l59Var.a;
            l59Var.k = l59Var.d;
            l59Var.l = l59Var.b;
            l59Var.h = true;
        }
        if (!this.e) {
            zzaqy zzaqyVar = this.g;
            zzaqyVar.d(i2);
            zzaqy zzaqyVar2 = this.h;
            zzaqyVar2.d(i2);
            zzaqy zzaqyVar3 = this.i;
            zzaqyVar3.d(i2);
            if (zzaqyVar.c && zzaqyVar2.c && zzaqyVar3.c) {
                String str = this.b;
                int i3 = zzaqyVar.e;
                byte[] bArr = new byte[zzaqyVar2.e + i3 + zzaqyVar3.e];
                System.arraycopy(zzaqyVar.d, 0, bArr, 0, i3);
                System.arraycopy(zzaqyVar2.d, 0, bArr, zzaqyVar.e, zzaqyVar2.e);
                System.arraycopy(zzaqyVar3.d, 0, bArr, zzaqyVar.e + zzaqyVar2.e, zzaqyVar3.e);
                String str2 = null;
                zzgl f = zzgr.f(zzaqyVar2.d, 3, zzaqyVar2.e, null);
                zzgg zzggVar = f.b;
                if (zzggVar != null) {
                    int i4 = zzggVar.f;
                    int[] iArr = zzggVar.e;
                    int i5 = zzggVar.d;
                    str2 = zzdr.a(zzggVar.a, zzggVar.b, zzggVar.c, i5, iArr, i4);
                }
                zzt zztVar = new zzt();
                zztVar.a = str;
                zztVar.c("video/mp2t");
                zztVar.d("video/hevc");
                zztVar.j = str2;
                zztVar.u = f.e;
                zztVar.v = f.f;
                zztVar.w = f.g;
                zztVar.x = f.h;
                zzh zzhVar = new zzh();
                zzhVar.a = f.k;
                zzhVar.b = f.l;
                zzhVar.c = f.m;
                zzhVar.e = f.c + 8;
                zzhVar.f = f.d + 8;
                zztVar.E = zzhVar.a();
                zztVar.B = f.i;
                zztVar.p = f.j;
                zztVar.F = f.a + 1;
                zztVar.q = Collections.singletonList(bArr);
                zzv zzvVar = new zzv(zztVar);
                this.c.e(zzvVar);
                int i6 = zzvVar.q;
                zzguk.f(i6 != -1);
                zzhcVar.a(i6);
                this.e = true;
            }
        }
        zzaqy zzaqyVar4 = this.j;
        boolean d = zzaqyVar4.d(i2);
        zzeu zzeuVar = this.n;
        if (d) {
            zzeuVar.z(zzgr.a(zzaqyVar4.e, zzaqyVar4.d), zzaqyVar4.d);
            zzeuVar.E(5);
            zzhcVar.b(j2, zzeuVar);
        }
        zzaqy zzaqyVar5 = this.k;
        if (zzaqyVar5.d(i2)) {
            zzeuVar.z(zzgr.a(zzaqyVar5.e, zzaqyVar5.d), zzaqyVar5.d);
            zzeuVar.E(5);
            zzhcVar.b(j2, zzeuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.l = 0L;
        this.m = C.TIME_UNSET;
        zzgr.h(this.f);
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        this.a.c.c(0);
        l59 l59Var = this.d;
        if (l59Var != null) {
            l59Var.e = false;
            l59Var.f = false;
            l59Var.g = false;
            l59Var.h = false;
            l59Var.i = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        this.c.getClass();
        String str = zzfm.a;
        this.a.c.c(0);
        f(0, 0, this.l, this.m);
        d(0, 48, this.l, this.m);
    }
}
