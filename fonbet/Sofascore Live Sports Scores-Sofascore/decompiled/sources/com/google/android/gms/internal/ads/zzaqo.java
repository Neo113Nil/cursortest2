package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.ajn;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqo implements zzaqh {
    public final zzark a;
    public long e;
    public String g;
    public zzaht h;
    public ajn i;
    public boolean j;
    public boolean l;
    public final boolean[] f = new boolean[3];
    public final zzaqy b = new zzaqy(7);
    public final zzaqy c = new zzaqy(8);
    public final zzaqy d = new zzaqy(6);
    public long k = C.TIME_UNSET;
    public final zzeu m = new zzeu();

    public zzaqo(zzark zzarkVar) {
        this.a = zzarkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.g = zzarvVar.e;
        zzarvVar.b();
        zzaht b = zzagkVar.b(zzarvVar.d, 2);
        this.h = b;
        this.i = new ajn(b);
        this.a.a(zzagkVar, zzarvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        this.k = j;
        int i2 = i & 2;
        this.l = (i2 != 0) | this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zzeu zzeuVar) {
        zzaqy zzaqyVar;
        zzaqy zzaqyVar2;
        zzaqy zzaqyVar3;
        int i;
        int i2;
        this.h.getClass();
        String str = zzfm.a;
        int i3 = zzeuVar.b;
        int i4 = zzeuVar.c;
        byte[] bArr = zzeuVar.a;
        this.e += zzeuVar.B();
        this.h.b(zzeuVar.B(), zzeuVar);
        while (true) {
            int g = zzgr.g(bArr, i3, i4, this.f);
            zzaqyVar = this.d;
            zzaqyVar2 = this.c;
            zzaqyVar3 = this.b;
            if (g == i4) {
                break;
            }
            int i5 = bArr[g + 3] & 31;
            int i6 = 3;
            if (g > 0) {
                i = g - 1;
                if (bArr[i] == 0) {
                    i6 = 4;
                    int i7 = i6;
                    i2 = i - i3;
                    if (i2 > 0) {
                        if (!this.j) {
                            zzaqyVar3.c(i3, i, bArr);
                            zzaqyVar2.c(i3, i, bArr);
                        }
                        zzaqyVar.c(i3, i, bArr);
                    }
                    int i8 = i4 - i;
                    long j = this.e - i8;
                    e(i8, i2 >= 0 ? -i2 : 0, j, this.k);
                    d(i5, j, this.k);
                    i3 = i + i7;
                }
            }
            i = g;
            int i72 = i6;
            i2 = i - i3;
            if (i2 > 0) {
            }
            int i82 = i4 - i;
            long j2 = this.e - i82;
            e(i82, i2 >= 0 ? -i2 : 0, j2, this.k);
            d(i5, j2, this.k);
            i3 = i + i72;
        }
        if (!this.j) {
            zzaqyVar3.c(i3, i4, bArr);
            zzaqyVar2.c(i3, i4, bArr);
        }
        zzaqyVar.c(i3, i4, bArr);
    }

    public final void d(int i, long j, long j2) {
        if (!this.j) {
            this.b.b(i);
            this.c.b(i);
        }
        this.d.b(i);
        ajn ajnVar = this.i;
        boolean z = this.l;
        ajnVar.d = i;
        ajnVar.f = j2;
        ajnVar.e = j;
        ajnVar.k = z;
    }

    public final void e(int i, int i2, long j, long j2) {
        zzhc zzhcVar = this.a.c;
        boolean z = true;
        if (!this.j) {
            zzaqy zzaqyVar = this.b;
            zzaqyVar.d(i2);
            zzaqy zzaqyVar2 = this.c;
            zzaqyVar2.d(i2);
            boolean z2 = this.j;
            boolean z3 = zzaqyVar.c;
            if (z2) {
                if (z3) {
                    zzgq d = zzgr.d(4, zzaqyVar.e, zzaqyVar.d);
                    zzhcVar.a(d.m);
                    this.i.b.append(d.d, d);
                    zzaqyVar.a();
                } else if (zzaqyVar2.c) {
                    zzgz zzgzVar = new zzgz(zzaqyVar2.d, 4, zzaqyVar2.e);
                    int g = zzgzVar.g();
                    zzgzVar.g();
                    zzgzVar.a();
                    zzgzVar.d();
                    this.i.c.append(g, new zzgp(g));
                    zzaqyVar2.a();
                }
            } else if (z3 && zzaqyVar2.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzaqyVar.d, zzaqyVar.e));
                arrayList.add(Arrays.copyOf(zzaqyVar2.d, zzaqyVar2.e));
                zzgq d2 = zzgr.d(4, zzaqyVar.e, zzaqyVar.d);
                zzgz zzgzVar2 = new zzgz(zzaqyVar2.d, 4, zzaqyVar2.e);
                int g2 = zzgzVar2.g();
                zzgzVar2.g();
                zzgzVar2.a();
                zzgzVar2.d();
                zzgp zzgpVar = new zzgp(g2);
                int i3 = d2.a;
                int i4 = d2.b;
                int i5 = d2.c;
                byte[] bArr = zzdr.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
                zzaht zzahtVar = this.h;
                zzt zztVar = new zzt();
                zztVar.a = this.g;
                zztVar.c("video/mp2t");
                zztVar.d("video/avc");
                zztVar.j = format;
                zztVar.u = d2.e;
                zztVar.v = d2.f;
                zzh zzhVar = new zzh();
                zzhVar.a = d2.j;
                zzhVar.b = d2.k;
                zzhVar.c = d2.l;
                zzhVar.e = d2.h + 8;
                zzhVar.f = d2.i + 8;
                zztVar.E = zzhVar.a();
                zztVar.B = d2.g;
                zztVar.q = arrayList;
                int i6 = d2.m;
                zztVar.p = i6;
                zzahtVar.e(new zzv(zztVar));
                this.j = true;
                zzhcVar.a(i6);
                this.i.b.append(d2.d, d2);
                this.i.c.append(g2, zzgpVar);
                zzaqyVar.a();
                zzaqyVar2.a();
            }
        }
        zzaqy zzaqyVar3 = this.d;
        if (zzaqyVar3.d(i2)) {
            int a = zzgr.a(zzaqyVar3.e, zzaqyVar3.d);
            byte[] bArr2 = zzaqyVar3.d;
            zzeu zzeuVar = this.m;
            zzeuVar.z(a, bArr2);
            zzeuVar.D(4);
            zzhcVar.b(j2, zzeuVar);
        }
        ajn ajnVar = this.i;
        boolean z4 = this.j;
        if (ajnVar.d == 9) {
            if (z4 && ajnVar.g) {
                long j3 = ajnVar.e;
                int i7 = i + ((int) (j - j3));
                long j4 = ajnVar.i;
                if (j4 != C.TIME_UNSET) {
                    long j5 = ajnVar.h;
                    if (j3 != j5) {
                        ajnVar.a.f(j4, ajnVar.j ? 1 : 0, (int) (j3 - j5), i7, null);
                    }
                }
            }
            ajnVar.h = ajnVar.e;
            ajnVar.i = ajnVar.f;
            ajnVar.j = false;
            ajnVar.g = true;
        }
        boolean z5 = ajnVar.k;
        boolean z6 = ajnVar.j;
        int i8 = ajnVar.d;
        if (i8 != 5 && (!z5 || i8 != 1)) {
            z = false;
        }
        boolean z7 = z6 | z;
        ajnVar.j = z7;
        ajnVar.d = 24;
        if (z7) {
            this.l = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.e = 0L;
        this.l = false;
        this.k = C.TIME_UNSET;
        zzgr.h(this.f);
        this.b.a();
        this.c.a();
        this.d.a();
        this.a.c.c(0);
        ajn ajnVar = this.i;
        if (ajnVar != null) {
            ajnVar.g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        this.h.getClass();
        String str = zzfm.a;
        this.a.c.c(0);
        e(0, 0, this.e, this.k);
        d(9, this.e, this.k);
        e(0, 0, this.e, this.k);
    }
}
