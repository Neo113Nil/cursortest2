package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.agn;
import defpackage.b10;
import defpackage.c0l;
import defpackage.djn;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzarr implements zzagh {
    public final int a;
    public final List b;
    public final zzeu c;
    public final SparseIntArray d;
    public final zzaqe e;
    public final zzanx f;
    public final SparseArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final djn j;
    public agn k;
    public zzagk l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;

    public zzarr(int i, zzanx zzanxVar, zzfj zzfjVar, zzaqe zzaqeVar) {
        this.e = zzaqeVar;
        this.a = i;
        this.f = zzanxVar;
        this.b = Collections.singletonList(zzfjVar);
        this.c = new zzeu(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.h = sparseBooleanArray;
        this.i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.d = new SparseIntArray();
        this.j = new djn(1);
        this.l = zzagk.F7;
        this.p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray3 = this.g;
            if (i2 >= size) {
                sparseArray3.put(0, new zzari(new c0l(this)));
                return;
            } else {
                sparseArray3.put(sparseArray2.keyAt(i2), (zzarw) sparseArray2.valueAt(i2));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        agn agnVar;
        long j3;
        List list = this.b;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zzfj zzfjVar = (zzfj) list.get(i2);
            synchronized (zzfjVar) {
                j3 = zzfjVar.b;
            }
            if (j3 != C.TIME_UNSET) {
                long a = zzfjVar.a();
                if (a != C.TIME_UNSET) {
                    if (a != 0) {
                        if (a == j2) {
                        }
                    }
                }
            }
            zzfjVar.b(j2);
        }
        if (j2 != 0 && (agnVar = this.k) != null) {
            agnVar.a(j2);
        }
        this.c.y(0);
        this.d.clear();
        while (true) {
            SparseArray sparseArray = this.g;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzarw) sparseArray.valueAt(i)).zzb();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(zzagi zzagiVar) {
        byte[] bArr = this.c.a;
        zzafy zzafyVar = (zzafy) zzagiVar;
        zzafyVar.f(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            zzafyVar.e(i, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        if (this.a == 0) {
            zzagkVar = new zzaoa(zzagkVar, this.f);
        }
        this.l = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        zzagi zzagiVar2;
        int i;
        int i2;
        long j;
        long j2;
        long zzo = zzagiVar.zzo();
        if (this.m) {
            long j3 = C.TIME_UNSET;
            djn djnVar = this.j;
            if (zzo != -1 && !djnVar.c) {
                int i3 = this.p;
                zzeu zzeuVar = djnVar.b;
                if (i3 <= 0) {
                    djnVar.b(zzagiVar);
                    return 0;
                }
                if (djnVar.e) {
                    if (djnVar.g == C.TIME_UNSET) {
                        djnVar.b(zzagiVar);
                        return 0;
                    }
                    if (djnVar.d) {
                        long j4 = djnVar.f;
                        if (j4 == C.TIME_UNSET) {
                            djnVar.b(zzagiVar);
                            return 0;
                        }
                        zzfj zzfjVar = djnVar.a;
                        djnVar.h = zzfjVar.d(djnVar.g) - zzfjVar.c(j4);
                        djnVar.b(zzagiVar);
                        return 0;
                    }
                    int min = (int) Math.min(112800L, zzagiVar.zzo());
                    if (zzagiVar.zzn() != 0) {
                        zzahhVar.a = 0L;
                        return 1;
                    }
                    zzeuVar.y(min);
                    zzagiVar.zzl();
                    zzagiVar.h(0, min, zzeuVar.a);
                    int i4 = zzeuVar.b;
                    int i5 = zzeuVar.c;
                    while (true) {
                        if (i4 >= i5) {
                            j2 = -9223372036854775807L;
                            break;
                        }
                        if (zzeuVar.a[i4] == 71) {
                            j2 = zzarx.a(zzeuVar, i4, i3);
                            if (j2 != C.TIME_UNSET) {
                                break;
                            }
                        }
                        i4++;
                    }
                    djnVar.f = j2;
                    djnVar.d = true;
                    return 0;
                }
                long zzo2 = zzagiVar.zzo();
                int min2 = (int) Math.min(112800L, zzo2);
                long j5 = zzo2 - min2;
                if (zzagiVar.zzn() != j5) {
                    zzahhVar.a = j5;
                    return 1;
                }
                zzeuVar.y(min2);
                zzagiVar.zzl();
                zzagiVar.h(0, min2, zzeuVar.a);
                int i6 = zzeuVar.b;
                int i7 = zzeuVar.c;
                int i8 = i7 - 188;
                while (true) {
                    if (i8 < i6) {
                        break;
                    }
                    byte[] bArr = zzeuVar.a;
                    int i9 = -4;
                    int i10 = 0;
                    while (true) {
                        if (i9 > 4) {
                            break;
                        }
                        int i11 = (i9 * 188) + i8;
                        if (i11 < i6 || i11 >= i7 || bArr[i11] != 71) {
                            i10 = 0;
                        } else {
                            i10++;
                            if (i10 == 5) {
                                long a = zzarx.a(zzeuVar, i8, i3);
                                if (a != C.TIME_UNSET) {
                                    j3 = a;
                                    break;
                                }
                            }
                        }
                        i9++;
                    }
                    i8--;
                }
                djnVar.g = j3;
                djnVar.e = true;
                return 0;
            }
            if (this.n) {
                i = 1;
                j = 0;
            } else {
                this.n = true;
                long j6 = djnVar.h;
                if (j6 != C.TIME_UNSET) {
                    i = 1;
                    j = 0;
                    agn agnVar = new agn(new zzafo(), new b10(this.p, djnVar.a), j6, j6 + 1, 0L, zzo, 188L, 940);
                    this.k = agnVar;
                    this.l.c(agnVar.a);
                } else {
                    i = 1;
                    j = 0;
                    this.l.c(new zzahj(j6, 0L));
                }
            }
            if (this.o) {
                this.o = false;
                a(j, j);
                if (zzagiVar.zzn() != j) {
                    zzahhVar.a = j;
                    return i;
                }
            }
            agn agnVar2 = this.k;
            if (agnVar2 != null && agnVar2.c != null) {
                return agnVar2.b(zzagiVar, zzahhVar);
            }
            zzagiVar2 = zzagiVar;
        } else {
            zzagiVar2 = zzagiVar;
            i = 1;
        }
        zzeu zzeuVar2 = this.c;
        byte[] bArr2 = zzeuVar2.a;
        if (9400 - zzeuVar2.b < 188) {
            int B = zzeuVar2.B();
            if (B > 0) {
                System.arraycopy(bArr2, zzeuVar2.b, bArr2, 0, B);
            }
            zzeuVar2.z(B, bArr2);
        }
        while (true) {
            int B2 = zzeuVar2.B();
            SparseArray sparseArray = this.g;
            if (B2 >= 188) {
                int i12 = zzeuVar2.b;
                int i13 = zzeuVar2.c;
                byte[] bArr3 = zzeuVar2.a;
                while (i12 < i13 && bArr3[i12] != 71) {
                    i12++;
                }
                zzeuVar2.D(i12);
                int i14 = i12 + 188;
                int i15 = zzeuVar2.c;
                if (i14 > i15) {
                    return 0;
                }
                int b = zzeuVar2.b();
                if ((8388608 & b) != 0) {
                    zzeuVar2.D(i14);
                    return 0;
                }
                int i16 = (4194304 & b) != 0 ? 1 : 0;
                int i17 = b & 32;
                int i18 = (b >> 8) & 8191;
                zzarw zzarwVar = (b & 16) != 0 ? (zzarw) sparseArray.get(i18) : null;
                if (zzarwVar == null) {
                    zzeuVar2.D(i14);
                    return 0;
                }
                int i19 = b & 15;
                SparseIntArray sparseIntArray = this.d;
                int i20 = sparseIntArray.get(i18, i19 - 1);
                sparseIntArray.put(i18, i19);
                if (i20 == i19) {
                    zzeuVar2.D(i14);
                    return 0;
                }
                if (i19 != ((i20 + 1) & 15)) {
                    zzarwVar.zzb();
                }
                if (i17 != 0) {
                    int I = zzeuVar2.I();
                    i16 |= (zzeuVar2.I() & 64) != 0 ? 2 : 0;
                    zzeuVar2.E(I - 1);
                }
                boolean z = this.m;
                if (z || !this.i.get(i18, false)) {
                    zzeuVar2.C(i14);
                    zzarwVar.b(i16, zzeuVar2);
                    zzeuVar2.C(i15);
                }
                if (!z && this.m && zzo != -1) {
                    this.o = true;
                }
                zzeuVar2.D(i14);
                return 0;
            }
            int i21 = zzeuVar2.c;
            int b2 = zzagiVar2.b(i21, 9400 - i21, bArr2);
            if (b2 == -1) {
                int i22 = 0;
                while (i22 < sparseArray.size()) {
                    zzarw zzarwVar2 = (zzarw) sparseArray.valueAt(i22);
                    if (zzarwVar2 instanceof zzara) {
                        zzara zzaraVar = (zzara) zzarwVar2;
                        int i23 = zzaraVar.c;
                        if (i23 != 3) {
                            i2 = i;
                            if (i23 != i2) {
                            }
                            zzaraVar.b(i2, new zzeu());
                        } else if (zzaraVar.j == -1) {
                            i2 = i;
                            zzaraVar.b(i2, new zzeu());
                        }
                    }
                    i22++;
                    i = 1;
                }
                return -1;
            }
            zzeuVar2.C(i21 + b2);
            i = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Deprecated
    public zzarr() {
        this(1, zzanx.G7, new zzfj(), new zzaqe(0));
    }
}
