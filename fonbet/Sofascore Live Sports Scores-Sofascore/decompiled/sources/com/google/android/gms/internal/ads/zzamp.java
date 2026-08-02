package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.ahn;
import defpackage.ihn;
import defpackage.jgn;
import defpackage.jhn;
import defpackage.khn;
import defpackage.lhn;
import defpackage.lnb;
import defpackage.mio;
import defpackage.t6a;
import defpackage.y6a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzamp implements zzagh {
    public static final /* synthetic */ int G = 0;
    public int A;
    public long B;
    public zzagk C;
    public jhn[] D;
    public long[][] E;
    public int F;
    public final zzanx a;
    public final int b;
    public final zzeu c;
    public final zzeu d;
    public final zzeu e;
    public final zzeu f;
    public final ArrayDeque g;
    public final lhn h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public s l;
    public int m;
    public int n;
    public long o;
    public int p;
    public zzeu q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public zzamp(int i, zzanx zzanxVar) {
        this.a = zzanxVar;
        this.b = i;
        mio mioVar = zzgxm.b;
        this.l = s.e;
        this.m = 0;
        this.h = new lhn();
        this.i = new ArrayList();
        this.f = new zzeu(16);
        this.g = new ArrayDeque();
        this.c = new zzeu(zzgr.a);
        this.d = new zzeu(6);
        this.e = new zzeu();
        this.r = -1;
        this.C = zzagk.F7;
        this.D = new jhn[0];
        this.j = new ArrayList();
        this.k = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.g.clear();
        this.p = 0;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.z = 0;
        this.A = 0;
        this.j.clear();
        this.k.clear();
        if (j == 0) {
            if (this.m != 3) {
                this.m = 0;
                this.p = 0;
                return;
            } else {
                lhn lhnVar = this.h;
                lhnVar.a.clear();
                lhnVar.b = 0;
                this.i.clear();
                return;
            }
        }
        for (jhn jhnVar : this.D) {
            zzamz zzamzVar = jhnVar.b;
            int a = zzamzVar.a(j2);
            if (a == -1) {
                a = zzamzVar.b(j2);
            }
            jhnVar.e = a;
            zzahu zzahuVar = jhnVar.d;
            if (zzahuVar != null) {
                zzahuVar.b = false;
                zzahuVar.c = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (((com.google.android.gms.internal.ads.zzfx) r12).a.equals("auxiliary.tracks.interleaved") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (((com.google.android.gms.internal.ads.zzfx) r12).a.equals("auxiliary.tracks.map") != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j) {
        long j2;
        ArrayList arrayList;
        zzap zzapVar;
        zzap zzapVar2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        int i2;
        long j3;
        int i3;
        zzap zzapVar3;
        zzap zzapVar4;
        zzap zzapVar5;
        String str;
        zzv zzvVar;
        boolean z;
        int i4;
        boolean z2;
        jhn jhnVar;
        ArrayList arrayList4;
        int i5;
        int i6;
        zzao zzaoVar;
        zzao zzaoVar2;
        int i7;
        while (true) {
            ArrayDeque arrayDeque = this.g;
            if (arrayDeque.isEmpty() || ((zzfz) arrayDeque.peek()).b != j) {
                break;
            }
            zzfz zzfzVar = (zzfz) arrayDeque.pop();
            if (zzfzVar.a == 1836019574) {
                zzfz c = zzfzVar.c(1835365473);
                ArrayList arrayList5 = new ArrayList();
                if (c != null) {
                    zzapVar = zzalv.e(c);
                    if (this.y) {
                        zzapVar.getClass();
                        zzao[] zzaoVarArr = zzapVar.a;
                        int length = zzaoVarArr.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                j2 = 0;
                                zzaoVar = null;
                                break;
                            }
                            zzao zzaoVar3 = zzaoVarArr[i8];
                            if (zzfx.class.isAssignableFrom(zzaoVar3.getClass())) {
                                zzaoVar = (zzao) zzfx.class.cast(zzaoVar3);
                                j2 = 0;
                            } else {
                                j2 = 0;
                            }
                            zzaoVar = null;
                            if (zzaoVar != null) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        zzfx zzfxVar = (zzfx) zzaoVar;
                        if (zzfxVar != null && zzfxVar.b[0] == 0) {
                            this.B = j2 + 16;
                        }
                        int length2 = zzaoVarArr.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length2) {
                                zzaoVar2 = null;
                                break;
                            }
                            zzao zzaoVar4 = zzaoVarArr[i9];
                            if (zzfx.class.isAssignableFrom(zzaoVar4.getClass())) {
                                zzaoVar2 = (zzao) zzfx.class.cast(zzaoVar4);
                            }
                            zzaoVar2 = null;
                            if (zzaoVar2 != null) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                        zzfx zzfxVar2 = (zzfx) zzaoVar2;
                        zzfxVar2.getClass();
                        ArrayList b = zzfxVar2.b();
                        ArrayList arrayList6 = new ArrayList(b.size());
                        int i10 = 0;
                        while (i10 < b.size()) {
                            int intValue = ((Integer) b.get(i10)).intValue();
                            if (intValue == 0) {
                                i7 = 1;
                            } else if (intValue != 1) {
                                i7 = 3;
                                if (intValue != 2) {
                                    i7 = intValue != 3 ? 0 : 4;
                                }
                            } else {
                                i7 = 2;
                            }
                            i10 = lnb.f(i7, arrayList6, i10, 1);
                        }
                        arrayList = arrayList6;
                    } else {
                        j2 = 0;
                        arrayList = arrayList5;
                    }
                } else {
                    j2 = 0;
                    arrayList = arrayList5;
                    zzapVar = null;
                }
                ArrayList arrayList7 = new ArrayList();
                int i11 = this.F;
                zzaha zzahaVar = new zzaha();
                zzga b2 = zzfzVar.b(1969517665);
                if (b2 != null) {
                    zzapVar2 = zzalv.c(b2);
                    zzahaVar.a(zzapVar2);
                } else {
                    zzapVar2 = null;
                }
                zzga b3 = zzfzVar.b(1836476516);
                b3.getClass();
                boolean z3 = 1 == i11;
                zzap zzapVar6 = new zzap(zzalv.d(b3.b));
                zzap zzapVar7 = zzapVar2;
                boolean z4 = z3;
                zzaha zzahaVar2 = zzahaVar;
                zzap zzapVar8 = zzapVar6;
                ArrayList b4 = zzalv.b(zzfzVar, zzahaVar2, C.TIME_UNSET, null, false, z4, ahn.b);
                if (this.y) {
                    boolean z5 = arrayList.size() == b4.size();
                    Locale locale = Locale.US;
                    zzguk.g(lnb.j(arrayList.size(), b4.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"), z5);
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it = b4.iterator();
                while (it.hasNext()) {
                    int i12 = ((zzamz) it.next()).a.l;
                    if (i12 != -1) {
                        Integer valueOf = Integer.valueOf(i12);
                        if (!arrayList8.contains(valueOf)) {
                            arrayList8.add(valueOf);
                        }
                    }
                }
                ArrayList arrayList9 = this.j;
                arrayList9.clear();
                Iterator it2 = b4.iterator();
                while (it2.hasNext()) {
                    zzamz zzamzVar = (zzamz) it2.next();
                    if (arrayList8.contains(Integer.valueOf(zzamzVar.a.a))) {
                        arrayList9.add(zzamzVar);
                    }
                }
                String Q = y6a.Q(b4);
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                long j4 = C.TIME_UNSET;
                while (i14 < b4.size()) {
                    zzamz zzamzVar2 = (zzamz) b4.get(i14);
                    ArrayDeque arrayDeque2 = arrayDeque;
                    int i16 = zzamzVar2.b;
                    long[] jArr = zzamzVar2.f;
                    ArrayList arrayList10 = b4;
                    int[] iArr = zzamzVar2.h;
                    if (i16 == 0) {
                        arrayList2 = arrayList9;
                        arrayList3 = arrayList7;
                    } else {
                        arrayList2 = arrayList9;
                        zzamw zzamwVar = zzamzVar2.a;
                        arrayList3 = arrayList7;
                        if (zzamwVar.m) {
                            String str2 = Q;
                            zzagk zzagkVar = this.C;
                            i = i15 + 1;
                            zzap zzapVar9 = zzapVar;
                            int i17 = zzamwVar.b;
                            zzaht b5 = zzagkVar.b(i15, i17);
                            jhn jhnVar2 = new jhn(zzamwVar, zzamzVar2, b5);
                            zzaha zzahaVar3 = zzahaVar2;
                            long j5 = zzamwVar.e;
                            if (j5 == C.TIME_UNSET) {
                                j5 = zzamzVar2.i;
                            }
                            b5.getClass();
                            long max = Math.max(j4, j5);
                            zzv zzvVar2 = zzamwVar.g;
                            String str3 = zzvVar2.o;
                            boolean equals = MimeTypes.AUDIO_TRUEHD.equals(str3);
                            int i18 = zzamzVar2.e;
                            int i19 = equals ? i18 * 16 : i18 + 30;
                            zzt zztVar = new zzt(zzvVar2);
                            zztVar.o = i19;
                            if (i17 == 2) {
                                int i20 = zzvVar2.f;
                                if ((this.b & 8) != 0) {
                                    i20 |= i13 == -1 ? 1 : 2;
                                }
                                if (this.y) {
                                    i20 |= 32768;
                                    zztVar.g = ((Integer) arrayList.get(i14)).intValue();
                                }
                                zztVar.f = i20;
                                i17 = 2;
                            }
                            if (!zzas.b(str3) || jArr.length <= 0) {
                                i2 = i13;
                            } else {
                                boolean z6 = zzamzVar2.j;
                                int min = Math.min(!z6 ? iArr.length : i16, 20);
                                zzguk.f(j5 != C.TIME_UNSET);
                                long min2 = Math.min(j5, 10000000L);
                                i2 = i13;
                                int i21 = 0;
                                int i22 = 0;
                                int i23 = -1;
                                while (i21 < min) {
                                    int i24 = z6 ? i21 : iArr[i21];
                                    long j6 = jArr[i24];
                                    if (j6 > min2) {
                                        break;
                                    }
                                    if (j6 >= j2) {
                                        i6 = min;
                                        int i25 = zzamzVar2.d[i24];
                                        if (i25 > i22) {
                                            i22 = i25;
                                            i23 = i24;
                                        }
                                    } else {
                                        i6 = min;
                                    }
                                    i21++;
                                    min = i6;
                                }
                                if (i23 != -1) {
                                    j3 = jArr[i23];
                                    if (j3 == C.TIME_UNSET) {
                                        zzajk zzajkVar = new zzajk(j3);
                                        i3 = 1;
                                        zzapVar3 = new zzap(zzajkVar);
                                    } else {
                                        i3 = 1;
                                        zzapVar3 = null;
                                    }
                                    if (i17 != i3) {
                                        zzahaVar2 = zzahaVar3;
                                        int i26 = zzahaVar2.a;
                                        if (i26 != -1 && (i5 = zzahaVar2.b) != -1) {
                                            zztVar.K = i26;
                                            zztVar.L = i5;
                                        }
                                    } else {
                                        zzahaVar2 = zzahaVar3;
                                    }
                                    zzap zzapVar10 = zzvVar2.l;
                                    ArrayList arrayList11 = this.i;
                                    zzap zzapVar11 = !arrayList11.isEmpty() ? null : new zzap(arrayList11);
                                    zzapVar4 = zzapVar8;
                                    zzap[] zzapVarArr = {zzapVar11, zzapVar7, zzapVar4, zzapVar3};
                                    zzapVar5 = zzapVar9;
                                    t6a.N(i17, zzapVar5, zztVar, zzapVar10, zzapVarArr);
                                    str = str2;
                                    zztVar.c(str);
                                    zzvVar = new zzv(zztVar);
                                    z = !Objects.equals(str3, MimeTypes.AUDIO_MPEG) || zzagg.a(str3);
                                    i4 = zzamwVar.l;
                                    if (i4 != -1) {
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            if (((zzamz) it3.next()).a.a == i4) {
                                                z2 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!z || z2) {
                                        jhnVar = jhnVar2;
                                        jhnVar.f = zzvVar;
                                    } else {
                                        b5.e(zzvVar);
                                        jhnVar = jhnVar2;
                                    }
                                    int i27 = i2;
                                    if (i17 == 2 && i27 == -1) {
                                        i13 = arrayList3.size();
                                        arrayList4 = arrayList3;
                                        arrayList4.add(jhnVar);
                                        j4 = max;
                                        i14++;
                                        arrayList7 = arrayList4;
                                        zzapVar8 = zzapVar4;
                                        zzapVar = zzapVar5;
                                        b4 = arrayList10;
                                        arrayList9 = arrayList2;
                                        i15 = i;
                                        Q = str;
                                        arrayDeque = arrayDeque2;
                                    }
                                    i13 = i27;
                                    arrayList4 = arrayList3;
                                    arrayList4.add(jhnVar);
                                    j4 = max;
                                    i14++;
                                    arrayList7 = arrayList4;
                                    zzapVar8 = zzapVar4;
                                    zzapVar = zzapVar5;
                                    b4 = arrayList10;
                                    arrayList9 = arrayList2;
                                    i15 = i;
                                    Q = str;
                                    arrayDeque = arrayDeque2;
                                }
                            }
                            j3 = -9223372036854775807L;
                            if (j3 == C.TIME_UNSET) {
                            }
                            if (i17 != i3) {
                            }
                            zzap zzapVar102 = zzvVar2.l;
                            ArrayList arrayList112 = this.i;
                            if (!arrayList112.isEmpty()) {
                            }
                            zzapVar4 = zzapVar8;
                            zzap[] zzapVarArr2 = {zzapVar11, zzapVar7, zzapVar4, zzapVar3};
                            zzapVar5 = zzapVar9;
                            t6a.N(i17, zzapVar5, zztVar, zzapVar102, zzapVarArr2);
                            str = str2;
                            zztVar.c(str);
                            zzvVar = new zzv(zztVar);
                            if (Objects.equals(str3, MimeTypes.AUDIO_MPEG)) {
                            }
                            i4 = zzamwVar.l;
                            if (i4 != -1) {
                            }
                            z2 = false;
                            if (z) {
                            }
                            jhnVar = jhnVar2;
                            jhnVar.f = zzvVar;
                            int i272 = i2;
                            if (i17 == 2) {
                                i13 = arrayList3.size();
                                arrayList4 = arrayList3;
                                arrayList4.add(jhnVar);
                                j4 = max;
                                i14++;
                                arrayList7 = arrayList4;
                                zzapVar8 = zzapVar4;
                                zzapVar = zzapVar5;
                                b4 = arrayList10;
                                arrayList9 = arrayList2;
                                i15 = i;
                                Q = str;
                                arrayDeque = arrayDeque2;
                            }
                            i13 = i272;
                            arrayList4 = arrayList3;
                            arrayList4.add(jhnVar);
                            j4 = max;
                            i14++;
                            arrayList7 = arrayList4;
                            zzapVar8 = zzapVar4;
                            zzapVar = zzapVar5;
                            b4 = arrayList10;
                            arrayList9 = arrayList2;
                            i15 = i;
                            Q = str;
                            arrayDeque = arrayDeque2;
                        }
                    }
                    str = Q;
                    i = i15;
                    zzapVar4 = zzapVar8;
                    zzapVar5 = zzapVar;
                    arrayList4 = arrayList3;
                    i14++;
                    arrayList7 = arrayList4;
                    zzapVar8 = zzapVar4;
                    zzapVar = zzapVar5;
                    b4 = arrayList10;
                    arrayList9 = arrayList2;
                    i15 = i;
                    Q = str;
                    arrayDeque = arrayDeque2;
                }
                ArrayDeque arrayDeque3 = arrayDeque;
                ArrayList arrayList12 = arrayList9;
                int i28 = i13;
                int i29 = -1;
                jhn[] jhnVarArr = (jhn[]) arrayList7.toArray(new jhn[0]);
                this.D = jhnVarArr;
                int length3 = jhnVarArr.length;
                long[][] jArr2 = new long[length3][];
                int[] iArr2 = new int[length3];
                long[] jArr3 = new long[length3];
                boolean[] zArr = new boolean[length3];
                for (int i30 = 0; i30 < jhnVarArr.length; i30++) {
                    jArr2[i30] = new long[jhnVarArr[i30].b.b];
                    jArr3[i30] = jhnVarArr[i30].b.f[0];
                }
                long j7 = j2;
                int i31 = 0;
                while (i31 < jhnVarArr.length) {
                    long j8 = Long.MAX_VALUE;
                    int i32 = i29;
                    for (int i33 = 0; i33 < jhnVarArr.length; i33++) {
                        if (!zArr[i33]) {
                            long j9 = jArr3[i33];
                            if (j9 <= j8) {
                                i32 = i33;
                                j8 = j9;
                            }
                        }
                    }
                    int i34 = iArr2[i32];
                    long[] jArr4 = jArr2[i32];
                    jArr4[i34] = j7;
                    zzamz zzamzVar3 = jhnVarArr[i32].b;
                    jhn[] jhnVarArr2 = jhnVarArr;
                    boolean[] zArr2 = zArr;
                    j7 += zzamzVar3.d[i34];
                    int i35 = i34 + 1;
                    iArr2[i32] = i35;
                    if (i35 < jArr4.length) {
                        jArr3[i32] = zzamzVar3.f[i35];
                    } else {
                        zArr2[i32] = true;
                        i31++;
                    }
                    jhnVarArr = jhnVarArr2;
                    zArr = zArr2;
                    i29 = -1;
                }
                this.E = jArr2;
                this.C.zzv();
                this.C.c(new ihn(j4, this.D, i28));
                arrayDeque3.clear();
                if (!this.x) {
                    this.m = true != arrayList12.isEmpty() ? 4 : 2;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((zzfz) arrayDeque.peek()).d.add(zzfzVar);
            }
        }
        int i36 = this.m;
        if (i36 == 4 || i36 == 2) {
            return;
        }
        this.m = 0;
        this.p = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        s sVar;
        zzaho a = zzamu.a(zzagiVar, false);
        if (a != null) {
            sVar = zzgxm.t(a);
        } else {
            mio mioVar = zzgxm.b;
            sVar = s.e;
        }
        this.l = sVar;
        return a == null;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        if ((this.b & 16) == 0) {
            zzagkVar = new zzaoa(zzagkVar, this.a);
        }
        this.C = zzagkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x06b8, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00f9, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.ads.zzajg) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0745, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x040a, code lost:
    
        if (r33 < r29) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06b8 A[EDGE_INSN: B:154:0x06b8->B:155:0x06b8 BREAK  A[LOOP:0: B:2:0x0006->B:55:0x0006], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0518 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        char c;
        int i;
        int i2;
        int i3;
        int b;
        int i4;
        long j;
        long j2;
        int i5;
        char c2;
        jhn[] jhnVarArr;
        int i6;
        boolean z;
        zzao zzaoVar;
        boolean z2;
        int i7;
        while (true) {
            int i8 = this.m;
            ArrayDeque arrayDeque = this.g;
            zzeu zzeuVar = this.e;
            boolean z3 = true;
            int i9 = 0;
            if (i8 != 0) {
                int i10 = 4;
                if (i8 == 1) {
                    long j3 = this.o - this.p;
                    long zzn = zzagiVar.zzn() + j3;
                    zzeu zzeuVar2 = this.q;
                    if (zzeuVar2 == null) {
                        if (!this.w && this.n == 1835295092) {
                            this.F = 1;
                        }
                        if (j3 >= 262144) {
                            zzahhVar.a = zzagiVar.zzn() + j3;
                            z2 = true;
                            b(zzn);
                            i4 = 1;
                            if (!this.x) {
                                this.y = true;
                                zzahhVar.a = 0L;
                                this.x = false;
                            } else if (!z2) {
                                continue;
                            }
                            if (this.m == 2) {
                                break;
                            }
                        } else {
                            zzagiVar.zzf((int) j3);
                        }
                    } else {
                        zzagiVar.g(this.p, (int) j3, zzeuVar2.a);
                        if (this.n == 1718909296) {
                            this.w = true;
                            zzeuVar2.D(8);
                            if (zzeuVar2.b() != 1903435808) {
                                zzeuVar2.E(4);
                                while (zzeuVar2.B() > 0) {
                                    if (zzeuVar2.b() != 1903435808) {
                                    }
                                }
                                i7 = 0;
                                this.F = i7;
                            }
                            i7 = 1;
                            this.F = i7;
                        } else if (!arrayDeque.isEmpty()) {
                            ((zzfz) arrayDeque.peek()).c.add(new zzga(this.n, zzeuVar2));
                        }
                    }
                    z2 = false;
                    b(zzn);
                    i4 = 1;
                    if (!this.x) {
                    }
                    if (this.m == 2) {
                    }
                } else {
                    if (i8 == 2) {
                        long zzn2 = zzagiVar.zzn();
                        int i11 = this.r;
                        if (i11 == -1) {
                            boolean z4 = true;
                            boolean z5 = true;
                            int i12 = 0;
                            int i13 = -1;
                            int i14 = -1;
                            long j4 = Long.MAX_VALUE;
                            long j5 = Long.MAX_VALUE;
                            long j6 = Long.MAX_VALUE;
                            while (true) {
                                jhn[] jhnVarArr2 = this.D;
                                if (i12 >= jhnVarArr2.length) {
                                    break;
                                }
                                jhn jhnVar = jhnVarArr2[i12];
                                int i15 = jhnVar.e;
                                zzamz zzamzVar = jhnVar.b;
                                boolean z6 = z4;
                                if (i15 != zzamzVar.b) {
                                    long j7 = zzamzVar.c[i15];
                                    long[][] jArr = this.E;
                                    jArr.getClass();
                                    long j8 = jArr[i12][i15];
                                    long j9 = j7 - zzn2;
                                    z4 = j9 < 0 || j9 >= 262144;
                                    if (!z4) {
                                        if (!z5) {
                                            z5 = false;
                                        }
                                        z5 = z4;
                                        j5 = j8;
                                        i14 = i12;
                                        j6 = j9;
                                        if (j8 < j4) {
                                            j4 = j8;
                                            i13 = i12;
                                            i12++;
                                        }
                                    }
                                    if (z4 == z5) {
                                    }
                                    if (j8 < j4) {
                                    }
                                }
                                z4 = z6;
                                i12++;
                            }
                            i11 = (j4 == Long.MAX_VALUE || !z4 || j5 < j4 + 10485760) ? i14 : i13;
                            this.r = i11;
                            if (i11 == -1) {
                                return -1;
                            }
                        }
                        jhn jhnVar2 = this.D[i11];
                        zzaht zzahtVar = jhnVar2.c;
                        int i16 = jhnVar2.e;
                        zzamz zzamzVar2 = jhnVar2.b;
                        long j10 = zzamzVar2.c[i16] + this.B;
                        int[] iArr = zzamzVar2.d;
                        int i17 = iArr[i16];
                        zzahu zzahuVar = jhnVar2.d;
                        long j11 = (j10 - zzn2) + this.s;
                        if (j11 < 0 || j11 >= 262144) {
                            zzahhVar.a = j10;
                            return 1;
                        }
                        zzamw zzamwVar = jhnVar2.a;
                        if (zzamwVar.h == 1) {
                            j11 += 8;
                            i17 -= 8;
                        }
                        zzagiVar.zzf((int) j11);
                        zzv zzvVar = zzamwVar.g;
                        String str = zzvVar.o;
                        boolean equals = Objects.equals(str, "video/avc");
                        int i18 = this.b;
                        if (!equals ? !Objects.equals(str, "video/hevc") ? Objects.equals(str, "video/apv") : (i18 & 128) != 0 : (i18 & 32) != 0) {
                            c = 1;
                        } else {
                            c = 1;
                            this.v = true;
                        }
                        int i19 = zzamwVar.k;
                        if (i19 == 0) {
                            zzv zzvVar2 = jhnVar2.f;
                            if ("audio/ac4".equals(str)) {
                                if (this.t == 0) {
                                    zzafk.b(i17, zzeuVar);
                                    zzahtVar.b(7, zzeuVar);
                                    this.t += 7;
                                }
                                i17 += 7;
                            } else if (zzvVar2 != null && Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                                zzeuVar.y(4);
                                zzagiVar.h(0, 4, zzeuVar.a);
                                zzagiVar.zzl();
                                zzahe zzaheVar = new zzahe();
                                if (zzaheVar.a(zzeuVar.b()) && !Objects.equals(zzvVar2.o, zzaheVar.b)) {
                                    zzt zztVar = new zzt(zzvVar2);
                                    String str2 = zzaheVar.b;
                                    str2.getClass();
                                    zztVar.d(str2);
                                    zzvVar2 = new zzv(zztVar);
                                }
                                zzahtVar.e(zzvVar2);
                                jhnVar2.f = null;
                            } else if (zzvVar2 != null && zzagg.a(str)) {
                                zzahtVar.e(zzagg.e(zzagiVar, i17, zzvVar2));
                                jhnVar2.f = null;
                            } else if (zzahuVar != null) {
                                zzahuVar.a(zzagiVar);
                            }
                            while (true) {
                                int i20 = this.t;
                                if (i20 >= i17) {
                                    break;
                                }
                                int d = zzahtVar.d(zzagiVar, i17 - i20, false);
                                this.s += d;
                                this.t += d;
                                this.u -= d;
                            }
                        } else {
                            zzeu zzeuVar3 = this.d;
                            byte[] bArr = zzeuVar3.a;
                            bArr[0] = 0;
                            bArr[c] = 0;
                            bArr[2] = 0;
                            int i21 = 4 - i19;
                            i17 += i21;
                            while (this.t < i17) {
                                int i22 = this.u;
                                if (i22 == 0) {
                                    if (this.v) {
                                        i = i19;
                                    } else {
                                        i = i19;
                                        if (zzgr.b(zzvVar) + i19 <= iArr[i16] - this.s) {
                                            i3 = zzgr.b(zzvVar);
                                            i2 = i + i3;
                                            zzagiVar.g(i21, i2, bArr);
                                            this.s += i2;
                                            zzeuVar3.D(0);
                                            b = zzeuVar3.b();
                                            if (b >= 0) {
                                                throw zzat.a(null, "Invalid NAL length");
                                            }
                                            this.u = b - i3;
                                            zzeu zzeuVar4 = this.c;
                                            zzeuVar4.D(0);
                                            zzahtVar.b(4, zzeuVar4);
                                            this.t += 4;
                                            if (i3 > 0) {
                                                zzahtVar.b(i3, zzeuVar3);
                                                this.t += i3;
                                                if (zzgr.c(bArr, i3, zzvVar)) {
                                                    this.v = true;
                                                }
                                            }
                                        }
                                    }
                                    i2 = i;
                                    i3 = 0;
                                    zzagiVar.g(i21, i2, bArr);
                                    this.s += i2;
                                    zzeuVar3.D(0);
                                    b = zzeuVar3.b();
                                    if (b >= 0) {
                                    }
                                } else {
                                    i = i19;
                                    int d2 = zzahtVar.d(zzagiVar, i22, false);
                                    this.s += d2;
                                    this.t += d2;
                                    this.u -= d2;
                                }
                                i19 = i;
                            }
                        }
                        int i23 = i17;
                        long j12 = zzamzVar2.f[i16];
                        int i24 = zzamzVar2.g[i16];
                        if (!this.v) {
                            i24 |= 67108864;
                        }
                        int i25 = i24;
                        if (zzahuVar != null) {
                            zzahuVar.b(zzahtVar, j12, i25, i23, 0, null);
                            if (i16 + 1 == zzamzVar2.b) {
                                zzahuVar.c(zzahtVar, null);
                            }
                        } else {
                            zzahtVar.f(j12, i25, i23, 0, null);
                        }
                        jhnVar2.e++;
                        this.r = -1;
                        this.s = 0;
                        this.t = 0;
                        this.u = 0;
                        this.v = false;
                        return 0;
                    }
                    if (i8 != 3) {
                        int i26 = this.z;
                        ArrayList arrayList = this.j;
                        zzamz zzamzVar3 = (zzamz) arrayList.get(i26);
                        int i27 = this.A;
                        int i28 = zzamzVar3.b;
                        ArrayList arrayList2 = this.k;
                        if (i27 < i28) {
                            long j13 = zzamzVar3.c[i27];
                            if (zzagiVar.zzn() != j13) {
                                zzahhVar.a = j13;
                                return 1;
                            }
                            int i29 = zzamzVar3.d[this.A];
                            zzeuVar.y(i29);
                            zzagiVar.g(0, i29, zzeuVar.a);
                            String k = zzeuVar.k(Math.min(zzeuVar.J(), zzeuVar.B()), StandardCharsets.UTF_8);
                            long[] jArr2 = zzamzVar3.f;
                            long t = zzfm.t(jArr2[this.A]);
                            int i30 = this.A + 1;
                            long t2 = i30 < i28 ? zzfm.t(jArr2[i30]) : zzfm.t(zzamzVar3.i);
                            zzajf zzajfVar = new zzajf();
                            zzajfVar.a = t;
                            zzajfVar.b = t2;
                            zzx zzxVar = new zzx(null, k);
                            zzajfVar.d = zzxVar;
                            arrayList2.add(new jgn(zzajfVar.a, zzajfVar.b, zzajfVar.c, zzxVar));
                            this.A++;
                            return 0;
                        }
                        jhn[] jhnVarArr3 = this.D;
                        int length = jhnVarArr3.length;
                        int i31 = 0;
                        while (i31 < length) {
                            jhn jhnVar3 = jhnVarArr3[i31];
                            if (jhnVar3.a.l == zzamzVar3.a.a) {
                                zzv zzvVar3 = jhnVar3.f;
                                zzvVar3.getClass();
                                zzap zzapVar = zzvVar3.l;
                                ArrayList arrayList3 = new ArrayList();
                                if (zzapVar != null) {
                                    mio mioVar = zzgxm.b;
                                    z = z3;
                                    zzgxj zzgxjVar = new zzgxj();
                                    zzao[] zzaoVarArr = zzapVar.a;
                                    int length2 = zzaoVarArr.length;
                                    while (i9 < length2) {
                                        zzao zzaoVar2 = zzaoVarArr[i9];
                                        jhn[] jhnVarArr4 = jhnVarArr3;
                                        int i32 = length;
                                        if (zzao.class.isAssignableFrom(zzaoVar2.getClass())) {
                                            zzaoVar = (zzao) zzao.class.cast(zzaoVar2);
                                        }
                                        zzaoVar = null;
                                        if (zzaoVar != null) {
                                            zzgxjVar.c(zzaoVar);
                                        }
                                        i9++;
                                        jhnVarArr3 = jhnVarArr4;
                                        length = i32;
                                    }
                                    jhnVarArr = jhnVarArr3;
                                    i6 = length;
                                    arrayList3.addAll(zzgxjVar.f());
                                } else {
                                    jhnVarArr = jhnVarArr3;
                                    i6 = length;
                                    z = z3;
                                }
                                arrayList3.addAll(arrayList2);
                                zzt zztVar2 = new zzt(zzvVar3);
                                zztVar2.k = new zzap(arrayList3);
                                zzv zzvVar4 = new zzv(zztVar2);
                                String str3 = zzvVar4.o;
                                if (Objects.equals(str3, MimeTypes.AUDIO_MPEG) || zzagg.a(str3)) {
                                    jhnVar3.f = zzvVar4;
                                } else {
                                    jhnVar3.c.e(zzvVar4);
                                    jhnVar3.f = null;
                                }
                            } else {
                                jhnVarArr = jhnVarArr3;
                                i6 = length;
                                z = z3;
                            }
                            i31++;
                            jhnVarArr3 = jhnVarArr;
                            length = i6;
                            z3 = z;
                            i9 = 0;
                        }
                        this.z++;
                        this.A = 0;
                        arrayList2.clear();
                        if (this.z != arrayList.size()) {
                            return 0;
                        }
                        this.m = 2;
                        return 0;
                    }
                    lhn lhnVar = this.h;
                    ArrayList arrayList4 = lhnVar.a;
                    int i33 = lhnVar.b;
                    if (i33 == 0) {
                        long zzo = zzagiVar.zzo();
                        long j14 = (zzo == -1 || zzo < 8) ? 0L : zzo - 8;
                        zzahhVar.a = j14;
                        i4 = 1;
                        lhnVar.b = 1;
                        j = j14;
                        j2 = 0;
                    } else if (i33 != 1) {
                        short s = 2192;
                        short s2 = 2817;
                        int i34 = 8;
                        if (i33 != 2) {
                            long zzn3 = zzagiVar.zzn();
                            int zzo2 = (int) ((zzagiVar.zzo() - zzagiVar.zzn()) - lhnVar.c);
                            zzeu zzeuVar5 = new zzeu(zzo2);
                            zzagiVar.g(0, zzo2, zzeuVar5.a);
                            int i35 = 0;
                            while (i35 < arrayList4.size()) {
                                khn khnVar = (khn) arrayList4.get(i35);
                                zzeuVar5.D((int) (khnVar.a - zzn3));
                                zzeuVar5.E(i10);
                                int c3 = zzeuVar5.c();
                                Charset charset = StandardCharsets.UTF_8;
                                String k2 = zzeuVar5.k(c3, charset);
                                switch (k2.hashCode()) {
                                    case -1711564334:
                                        if (!k2.equals("SlowMotion_Data")) {
                                            throw zzat.a(null, "Invalid SEF name");
                                        }
                                        c2 = 2192;
                                        int i36 = khnVar.b - (c3 + 8);
                                        if (c2 == 2192) {
                                            ArrayList arrayList5 = new ArrayList();
                                            List c4 = lhn.e.c(zzeuVar5.k(i36, charset));
                                            for (int i37 = 0; i37 < c4.size(); i37++) {
                                                List c5 = lhn.d.c((CharSequence) c4.get(i37));
                                                if (c5.size() != 3) {
                                                    throw zzat.a(null, null);
                                                }
                                                try {
                                                    arrayList5.add(new zzakg(Long.parseLong((String) c5.get(0)), Long.parseLong((String) c5.get(1)), 1 << (Integer.parseInt((String) c5.get(2)) - 1)));
                                                } catch (NumberFormatException e) {
                                                    throw zzat.a(e, null);
                                                }
                                            }
                                            this.i.add(new zzakh(arrayList5));
                                        } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                            defpackage.zzl.s();
                                            return 0;
                                        }
                                        i35++;
                                        i10 = 4;
                                        break;
                                    case -1332107749:
                                        if (!k2.equals("Super_SlowMotion_Edit_Data")) {
                                            throw zzat.a(null, "Invalid SEF name");
                                        }
                                        c2 = 2819;
                                        int i362 = khnVar.b - (c3 + 8);
                                        if (c2 == 2192) {
                                        }
                                        i35++;
                                        i10 = 4;
                                        break;
                                    case -1251387154:
                                        if (!k2.equals("Super_SlowMotion_Data")) {
                                            throw zzat.a(null, "Invalid SEF name");
                                        }
                                        c2 = 2816;
                                        int i3622 = khnVar.b - (c3 + 8);
                                        if (c2 == 2192) {
                                        }
                                        i35++;
                                        i10 = 4;
                                        break;
                                    case -830665521:
                                        if (!k2.equals("Super_SlowMotion_Deflickering_On")) {
                                            throw zzat.a(null, "Invalid SEF name");
                                        }
                                        c2 = 2820;
                                        int i36222 = khnVar.b - (c3 + 8);
                                        if (c2 == 2192) {
                                        }
                                        i35++;
                                        i10 = 4;
                                        break;
                                    case 1760745220:
                                        if (!k2.equals("Super_SlowMotion_BGM")) {
                                            throw zzat.a(null, "Invalid SEF name");
                                        }
                                        c2 = 2817;
                                        int i362222 = khnVar.b - (c3 + 8);
                                        if (c2 == 2192) {
                                        }
                                        i35++;
                                        i10 = 4;
                                        break;
                                    default:
                                        throw zzat.a(null, "Invalid SEF name");
                                }
                            }
                            zzahhVar.a = 0L;
                        } else {
                            long zzo3 = zzagiVar.zzo();
                            int i38 = lhnVar.c - 20;
                            zzeu zzeuVar6 = new zzeu(i38);
                            zzagiVar.g(0, i38, zzeuVar6.a);
                            int i39 = 0;
                            while (i39 < i38 / 12) {
                                zzeuVar6.E(2);
                                zzeuVar6.v(2);
                                byte[] bArr2 = zzeuVar6.a;
                                int i40 = zzeuVar6.b;
                                int i41 = i40 + 1;
                                zzeuVar6.b = i41;
                                int i42 = bArr2[i40] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                zzeuVar6.b = i40 + 2;
                                short s3 = (short) (((bArr2[i41] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i42);
                                if (s3 != s && s3 != 2816 && s3 != s2) {
                                    if (s3 != 2819 && s3 != 2820) {
                                        zzeuVar6.E(i34);
                                        i5 = i38;
                                        i39++;
                                        i38 = i5;
                                        s = 2192;
                                        s2 = 2817;
                                        i34 = 8;
                                    }
                                }
                                i5 = i38;
                                arrayList4.add(new khn((zzo3 - lhnVar.c) - zzeuVar6.c(), zzeuVar6.c()));
                                i39++;
                                i38 = i5;
                                s = 2192;
                                s2 = 2817;
                                i34 = 8;
                            }
                            if (arrayList4.isEmpty()) {
                                zzahhVar.a = 0L;
                            } else {
                                lhnVar.b = 3;
                                long j15 = ((khn) arrayList4.get(0)).a;
                                zzahhVar.a = j15;
                                j = j15;
                                j2 = 0;
                                i4 = 1;
                            }
                        }
                        j2 = 0;
                        i4 = 1;
                        j = 0;
                    } else {
                        zzeu zzeuVar7 = new zzeu(8);
                        zzagiVar.g(0, 8, zzeuVar7.a);
                        lhnVar.c = zzeuVar7.c() + 8;
                        if (zzeuVar7.b() != 1397048916) {
                            zzahhVar.a = 0L;
                            j2 = 0;
                            i4 = 1;
                            j = 0;
                        } else {
                            long zzn4 = zzagiVar.zzn() - (lhnVar.c - 12);
                            zzahhVar.a = zzn4;
                            lhnVar.b = 2;
                            j = zzn4;
                            j2 = 0;
                            i4 = 1;
                        }
                    }
                    if (j == j2) {
                        this.m = 0;
                        this.p = 0;
                        return i4;
                    }
                }
            } else {
                int i43 = this.p;
                zzeu zzeuVar8 = this.f;
                if (i43 == 0) {
                    if (!zzagiVar.i(zzeuVar8.a, 0, 8, true)) {
                        return -1;
                    }
                    this.p = 8;
                    zzeuVar8.D(0);
                    this.o = zzeuVar8.N();
                    this.n = zzeuVar8.b();
                }
                long j16 = this.o;
                if (j16 == 1) {
                    zzagiVar.g(8, 8, zzeuVar8.a);
                    this.p += 8;
                    this.o = zzeuVar8.j();
                } else if (j16 == 0) {
                    long zzo4 = zzagiVar.zzo();
                    if (zzo4 == -1) {
                        zzfz zzfzVar = (zzfz) arrayDeque.peek();
                        zzo4 = zzfzVar != null ? zzfzVar.b : -1L;
                    }
                    if (zzo4 != -1) {
                        this.o = (zzo4 - zzagiVar.zzn()) + this.p;
                    }
                }
                long j17 = this.o;
                int i44 = this.p;
                long j18 = i44;
                if (j17 < j18) {
                    if (this.n != 1718773093 || i44 != 8) {
                        break;
                    }
                    this.o = j18;
                    i44 = 8;
                }
                int i45 = this.n;
                if (i45 == 1836019574 || i45 == 1953653099 || i45 == 1835297121 || i45 == 1835626086 || i45 == 1937007212 || i45 == 1701082227 || i45 == 1835365473 || i45 == 1635284069 || i45 == 1953654118) {
                    long zzn5 = zzagiVar.zzn();
                    long j19 = this.o;
                    long j20 = zzn5 + j19;
                    long j21 = this.p;
                    if (j19 != j21 && this.n == 1835365473) {
                        zzeuVar.y(8);
                        zzagiVar.h(0, 8, zzeuVar.a);
                        zzalv.f(zzeuVar);
                        zzagiVar.zzf(zzeuVar.b);
                        zzagiVar.zzl();
                    }
                    long j22 = j20 - j21;
                    arrayDeque.push(new zzfz(this.n, j22));
                    if (this.o == this.p) {
                        b(j22);
                    } else {
                        this.m = 0;
                        this.p = 0;
                    }
                } else {
                    if (i45 == 1835296868 || i45 == 1836476516 || i45 == 1751411826 || i45 == 1937011556 || i45 == 1937011827 || i45 == 1937011571 || i45 == 1668576371 || i45 == 1701606260 || i45 == 1937011555 || i45 == 1937011578 || i45 == 1937013298 || i45 == 1937007471 || i45 == 1668232756 || i45 == 1953196132 || i45 == 1718909296 || i45 == 1969517665 || i45 == 1801812339 || i45 == 1768715124 || i45 == 1667785072) {
                        zzguk.f(i44 == 8);
                        zzguk.f(this.o <= 2147483647L);
                        zzeu zzeuVar9 = new zzeu((int) this.o);
                        System.arraycopy(zzeuVar8.a, 0, zzeuVar9.a, 0, 8);
                        this.q = zzeuVar9;
                    } else {
                        this.q = null;
                    }
                    this.m = 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ List zzb() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Deprecated
    public zzamp() {
        this(16, zzanx.G7);
    }
}
