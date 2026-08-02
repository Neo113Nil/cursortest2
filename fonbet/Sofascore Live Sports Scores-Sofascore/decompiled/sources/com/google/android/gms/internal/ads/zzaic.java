package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.fn0;
import defpackage.nfn;
import defpackage.sfn;
import defpackage.tfn;
import defpackage.ufn;
import defpackage.uif;
import defpackage.vfn;
import defpackage.wfn;
import defpackage.xfn;
import defpackage.yfn;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaic implements zzagh {
    public final zzeu a;
    public final uif b;
    public final boolean c;
    public final zzanx d;
    public int e;
    public zzagk f;
    public tfn g;
    public long h;
    public vfn[] i;
    public long j;
    public vfn k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public zzaic(int i, zzanx zzanxVar) {
        this.d = zzanxVar;
        this.c = 1 == (i ^ 1);
        this.a = new zzeu(12);
        this.b = new uif((byte) 0, 14);
        this.f = new zzahg();
        this.i = new vfn[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (vfn vfnVar : this.i) {
            if (vfnVar.k == 0) {
                vfnVar.i = 0;
            } else {
                vfnVar.i = vfnVar.n[zzfm.s(vfnVar.m, j, true)];
            }
        }
        if (j == 0) {
            this.e = this.i.length != 0 ? 3 : 0;
        } else {
            this.e = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        zzeu zzeuVar = this.a;
        zzagiVar.h(0, 12, zzeuVar.a);
        zzeuVar.D(0);
        if (zzeuVar.c() != 1179011410) {
            return false;
        }
        zzeuVar.E(4);
        return zzeuVar.c() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.e = 0;
        if (this.c) {
            zzagkVar = new zzaoa(zzagkVar, this.d);
        }
        this.f = zzagkVar;
        this.j = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b3  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        boolean z;
        vfn vfnVar;
        long j;
        int i;
        vfn vfnVar2;
        long j2 = this.j;
        int i2 = 0;
        if (j2 != -1) {
            long zzn = zzagiVar.zzn();
            if (j2 < zzn || j2 > 262144 + zzn) {
                zzahhVar.a = j2;
                z = true;
                this.j = -1L;
                if (!z) {
                    return 1;
                }
                int i3 = this.e;
                vfn vfnVar3 = null;
                if (i3 == 0) {
                    if (!c(zzagiVar)) {
                        throw zzat.a(null, "AVI Header List not found");
                    }
                    zzagiVar.zzf(12);
                    this.e = 1;
                    return 0;
                }
                uif uifVar = this.b;
                zzeu zzeuVar = this.a;
                if (i3 == 1) {
                    zzagiVar.g(0, 12, zzeuVar.a);
                    zzeuVar.D(0);
                    uifVar.getClass();
                    uifVar.b = zzeuVar.c();
                    uifVar.c = zzeuVar.c();
                    int i4 = uifVar.b;
                    if (i4 != 1414744396) {
                        StringBuilder sb = new StringBuilder(fn0.a(i4, 22));
                        sb.append("LIST expected, found: ");
                        sb.append(i4);
                        throw zzat.a(null, sb.toString());
                    }
                    int c = zzeuVar.c();
                    if (c == 1819436136) {
                        this.l = uifVar.c;
                        this.e = 2;
                        return 0;
                    }
                    StringBuilder sb2 = new StringBuilder(fn0.a(c, 22));
                    sb2.append("hdrl expected, found: ");
                    sb2.append(c);
                    throw zzat.a(null, sb2.toString());
                }
                if (i3 == 2) {
                    int i5 = 2;
                    int i6 = this.l - 4;
                    zzeu zzeuVar2 = new zzeu(i6);
                    zzagiVar.g(0, i6, zzeuVar2.a);
                    wfn a = wfn.a(1819436136, zzeuVar2);
                    int i7 = a.b;
                    if (i7 != 1819436136) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 28);
                        sb3.append("Unexpected header list type ");
                        sb3.append(i7);
                        throw zzat.a(null, sb3.toString());
                    }
                    tfn tfnVar = (tfn) a.b(tfn.class);
                    if (tfnVar == null) {
                        throw zzat.a(null, "AviHeader not found");
                    }
                    this.g = tfnVar;
                    this.h = tfnVar.c * tfnVar.a;
                    ArrayList arrayList = new ArrayList();
                    zzgxm zzgxmVar = a.a;
                    int size = zzgxmVar.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size) {
                        nfn nfnVar = (nfn) zzgxmVar.get(i8);
                        if (nfnVar.zza() == 1819440243) {
                            wfn wfnVar = (wfn) nfnVar;
                            int i10 = i9 + 1;
                            ufn ufnVar = (ufn) wfnVar.b(ufn.class);
                            xfn xfnVar = (xfn) wfnVar.b(xfn.class);
                            if (ufnVar == null) {
                                zzeh.c("Missing Stream Header");
                            } else if (xfnVar == null) {
                                zzeh.c("Missing Stream Format");
                            } else {
                                long w = zzfm.w(ufnVar.d, ufnVar.b * 1000000, ufnVar.c, RoundingMode.DOWN);
                                zzv zzvVar = xfnVar.a;
                                zzt zztVar = new zzt(zzvVar);
                                zztVar.b(i9);
                                int i11 = ufnVar.e;
                                if (i11 != 0) {
                                    zztVar.o = i11;
                                }
                                yfn yfnVar = (yfn) wfnVar.b(yfn.class);
                                if (yfnVar != null) {
                                    zztVar.b = yfnVar.a;
                                }
                                int f = zzas.f(zzvVar.o);
                                if (f != 1) {
                                    if (f == i5) {
                                        f = 2;
                                    }
                                }
                                zzaht b = this.f.b(i9, f);
                                b.e(new zzv(zztVar));
                                this.h = Math.max(this.h, w);
                                vfnVar = new vfn(i9, ufnVar, b);
                                if (vfnVar != null) {
                                    arrayList.add(vfnVar);
                                }
                                i9 = i10;
                            }
                            vfnVar = null;
                            if (vfnVar != null) {
                            }
                            i9 = i10;
                        }
                        i8++;
                        i5 = 2;
                    }
                    this.i = (vfn[]) arrayList.toArray(new vfn[0]);
                    this.f.zzv();
                    this.e = 3;
                    return 0;
                }
                int i12 = 4;
                if (i3 == 3) {
                    long j3 = this.m;
                    if (j3 != -1 && zzagiVar.zzn() != j3) {
                        this.j = j3;
                        return 0;
                    }
                    zzagiVar.h(0, 12, zzeuVar.a);
                    zzagiVar.zzl();
                    zzeuVar.D(0);
                    uifVar.getClass();
                    uifVar.b = zzeuVar.c();
                    uifVar.c = zzeuVar.c();
                    int c2 = zzeuVar.c();
                    int i13 = uifVar.b;
                    if (i13 == 1179011410) {
                        zzagiVar.zzf(12);
                        return 0;
                    }
                    if (i13 != 1414744396 || c2 != 1769369453) {
                        this.j = zzagiVar.zzn() + uifVar.c + 8;
                        return 0;
                    }
                    long zzn2 = zzagiVar.zzn();
                    this.m = zzn2;
                    long j4 = zzn2 + uifVar.c + 8;
                    this.n = j4;
                    if (!this.p) {
                        tfn tfnVar2 = this.g;
                        tfnVar2.getClass();
                        if ((tfnVar2.b & 16) == 16) {
                            this.e = 4;
                            this.j = j4;
                            return 0;
                        }
                        this.f.c(new zzahj(this.h, 0L));
                        this.p = true;
                    }
                    this.j = zzagiVar.zzn() + 12;
                    this.e = 6;
                    return 0;
                }
                if (i3 == 4) {
                    zzagiVar.g(0, 8, zzeuVar.a);
                    zzeuVar.D(0);
                    int c3 = zzeuVar.c();
                    int c4 = zzeuVar.c();
                    if (c3 != 829973609) {
                        this.j = zzagiVar.zzn() + c4;
                        return 0;
                    }
                    this.e = 5;
                    this.o = c4;
                    return 0;
                }
                if (i3 != 5) {
                    if (zzagiVar.zzn() >= this.n) {
                        return -1;
                    }
                    vfn vfnVar4 = this.k;
                    if (vfnVar4 != null) {
                        int i14 = vfnVar4.h;
                        zzaht zzahtVar = vfnVar4.b;
                        int d = i14 - zzahtVar.d(zzagiVar, i14, false);
                        vfnVar4.h = d;
                        boolean z2 = d == 0;
                        if (z2) {
                            if (vfnVar4.g > 0) {
                                int i15 = vfnVar4.i;
                                zzahtVar.f((vfnVar4.e * i15) / vfnVar4.f, Arrays.binarySearch(vfnVar4.n, i15) >= 0 ? 1 : 0, vfnVar4.g, 0, null);
                            }
                            vfnVar4.i++;
                        }
                        if (!z2) {
                            return 0;
                        }
                        this.k = null;
                        return 0;
                    }
                    if ((zzagiVar.zzn() & 1) == 1) {
                        zzagiVar.zzf(1);
                    }
                    zzagiVar.h(0, 12, zzeuVar.a);
                    zzeuVar.D(0);
                    int c5 = zzeuVar.c();
                    if (c5 == 1414744396) {
                        zzeuVar.D(8);
                        zzagiVar.zzf(zzeuVar.c() != 1769369453 ? 8 : 12);
                        zzagiVar.zzl();
                        return 0;
                    }
                    int c6 = zzeuVar.c();
                    if (c5 == 1263424842) {
                        this.j = zzagiVar.zzn() + c6 + 8;
                        return 0;
                    }
                    zzagiVar.zzf(8);
                    zzagiVar.zzl();
                    for (vfn vfnVar5 : this.i) {
                        if (vfnVar5.c == c5 || vfnVar5.d == c5) {
                            vfnVar3 = vfnVar5;
                            break;
                        }
                    }
                    if (vfnVar3 == null) {
                        this.j = zzagiVar.zzn() + c6;
                        return 0;
                    }
                    vfnVar3.g = c6;
                    vfnVar3.h = c6;
                    this.k = vfnVar3;
                    return 0;
                }
                zzeu zzeuVar3 = new zzeu(this.o);
                zzagiVar.g(0, this.o, zzeuVar3.a);
                if (zzeuVar3.B() < 16) {
                    j = 0;
                } else {
                    int i16 = zzeuVar3.b;
                    zzeuVar3.E(8);
                    long c7 = zzeuVar3.c();
                    long j5 = this.m;
                    j = c7 > j5 ? 0L : j5 + 8;
                    zzeuVar3.D(i16);
                }
                while (zzeuVar3.B() >= 16) {
                    int c8 = zzeuVar3.c();
                    int c9 = zzeuVar3.c();
                    int i17 = i2;
                    long c10 = zzeuVar3.c() + j;
                    zzeuVar3.E(i12);
                    vfn[] vfnVarArr = this.i;
                    int length = vfnVarArr.length;
                    int i18 = i17;
                    while (true) {
                        if (i18 >= length) {
                            vfnVar2 = null;
                            break;
                        }
                        vfnVar2 = vfnVarArr[i18];
                        if (vfnVar2.c == c8 || vfnVar2.d == c8) {
                            break;
                        }
                        i18++;
                    }
                    if (vfnVar2 != null) {
                        int i19 = (c9 & 16) == 16 ? 1 : i17;
                        if (vfnVar2.l == -1) {
                            vfnVar2.l = c10;
                        }
                        if (i19 != 0) {
                            int i20 = vfnVar2.k;
                            int[] iArr = vfnVar2.n;
                            if (i20 == iArr.length) {
                                long[] jArr = vfnVar2.m;
                                vfnVar2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr2 = vfnVar2.n;
                                iArr = Arrays.copyOf(iArr2, (iArr2.length * 3) / 2);
                                vfnVar2.n = iArr;
                            }
                            long[] jArr2 = vfnVar2.m;
                            int i21 = vfnVar2.k;
                            jArr2[i21] = c10;
                            iArr[i21] = vfnVar2.j;
                            vfnVar2.k = i21 + 1;
                        }
                        vfnVar2.j++;
                    }
                    i2 = i17;
                    i12 = 4;
                }
                int i22 = i2;
                vfn[] vfnVarArr2 = this.i;
                int length2 = vfnVarArr2.length;
                for (int i23 = i22; i23 < length2; i23++) {
                    vfn vfnVar6 = vfnVarArr2[i23];
                    vfnVar6.m = Arrays.copyOf(vfnVar6.m, vfnVar6.k);
                    vfnVar6.n = Arrays.copyOf(vfnVar6.n, vfnVar6.k);
                    if ((vfnVar6.c & 1651965952) == 1651965952 && vfnVar6.a.f != 0 && (i = vfnVar6.k) > 0) {
                        vfnVar6.f = i;
                    }
                }
                this.p = true;
                int length3 = this.i.length;
                zzagk zzagkVar = this.f;
                long j6 = this.h;
                if (length3 == 0) {
                    zzagkVar.c(new zzahj(j6, 0L));
                } else {
                    zzagkVar.c(new sfn(this, j6));
                }
                this.e = 6;
                this.j = this.m;
                return i22;
            }
            zzagiVar.zzf((int) (j2 - zzn));
        }
        z = false;
        this.j = -1L;
        if (!z) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Deprecated
    public zzaic() {
        this(1, zzanx.G7);
    }
}
