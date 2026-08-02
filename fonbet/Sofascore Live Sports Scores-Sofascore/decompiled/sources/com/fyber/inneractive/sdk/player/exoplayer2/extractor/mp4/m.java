package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int A = z.a("seig");
    public static final byte[] B = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f;
    public int l;
    public long m;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n o;
    public long p;
    public int q;
    public l t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j y;
    public boolean z;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.a);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(5);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n d = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n e = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(1);
    public final byte[] h = new byte[16];
    public final Stack i = new Stack();
    public final LinkedList j = new LinkedList();
    public final SparseArray a = new SparseArray();
    public long r = C.TIME_UNSET;
    public long s = C.TIME_UNSET;
    public int k = 0;
    public int n = 0;

    public m(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar) {
        this.f = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x05af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        s a;
        int i;
        SparseArray sparseArray;
        int i2;
        int i3;
        int i4;
        int i5;
        int size;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList;
        long j2;
        int i9;
        boolean z;
        long j3;
        int i10;
        long j4;
        int i11;
        int i12;
        int i13;
        j jVar;
        int i14;
        while (!this.i.isEmpty() && ((a) this.i.peek()).P0 == j) {
            a aVar = (a) this.i.pop();
            int i15 = aVar.a;
            int i16 = 12;
            int i17 = 8;
            int i18 = 1;
            if (i15 == c.C) {
                com.fyber.inneractive.sdk.player.exoplayer2.drm.d a2 = a(aVar.Q0);
                a b = aVar.b(c.N);
                SparseArray sparseArray2 = new SparseArray();
                int size2 = b.Q0.size();
                long j5 = -9223372036854775807L;
                int i19 = 0;
                while (i19 < size2) {
                    b bVar = (b) b.Q0.get(i19);
                    int i20 = bVar.a;
                    if (i20 == c.z) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
                        nVar.e(i16);
                        i = i18;
                        Pair create = Pair.create(Integer.valueOf(nVar.b()), new j(nVar.m() - i18, nVar.m(), nVar.m(), nVar.b()));
                        sparseArray2.put(((Integer) create.first).intValue(), (j) create.second);
                    } else {
                        i = i18;
                        if (i20 == c.O) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = bVar.P0;
                            nVar2.e(8);
                            j5 = ((nVar2.b() >> 24) & 255) == 0 ? nVar2.k() : nVar2.n();
                        }
                    }
                    i19++;
                    i18 = i;
                    i16 = 12;
                }
                SparseArray sparseArray3 = new SparseArray();
                int size3 = aVar.R0.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    a aVar2 = (a) aVar.R0.get(i21);
                    if (aVar2.a == c.E && (a = i.a(aVar2, aVar.c(c.D), j5, a2, false)) != null) {
                        sparseArray3.put(a.a, a);
                    }
                }
                int size4 = sparseArray3.size();
                if (this.a.size() == 0) {
                    for (int i22 = 0; i22 < size4; i22++) {
                        s sVar = (s) sparseArray3.valueAt(i22);
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3 = this.y.a(i22, sVar.b);
                        l lVar = new l(a3);
                        j jVar2 = (j) sparseArray2.get(sVar.a);
                        lVar.c = sVar;
                        jVar2.getClass();
                        lVar.d = jVar2;
                        a3.a(sVar.f);
                        lVar.a();
                        this.a.put(sVar.a, lVar);
                        this.r = Math.max(this.r, sVar.e);
                    }
                    this.y.b();
                } else {
                    if (this.a.size() != size4) {
                        zzl.s();
                        return;
                    }
                    for (int i23 = 0; i23 < size4; i23++) {
                        s sVar2 = (s) sparseArray3.valueAt(i23);
                        l lVar2 = (l) this.a.get(sVar2.a);
                        j jVar3 = (j) sparseArray2.get(sVar2.a);
                        lVar2.getClass();
                        lVar2.c = sVar2;
                        jVar3.getClass();
                        lVar2.d = jVar3;
                        lVar2.b.a(sVar2.f);
                        lVar2.a();
                    }
                }
            } else {
                int i24 = 1;
                if (i15 == c.L) {
                    SparseArray sparseArray4 = this.a;
                    byte[] bArr = this.h;
                    int size5 = aVar.R0.size();
                    int i25 = 0;
                    while (i25 < size5) {
                        a aVar3 = (a) aVar.R0.get(i25);
                        if (aVar3.a == c.M) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = aVar3.c(c.y).P0;
                            nVar3.e(i17);
                            int b2 = nVar3.b();
                            l lVar3 = (l) sparseArray4.get(nVar3.b());
                            if (lVar3 == null) {
                                lVar3 = null;
                            } else {
                                if ((b2 & 1) != 0) {
                                    long n = nVar3.n();
                                    u uVar = lVar3.a;
                                    uVar.b = n;
                                    uVar.c = n;
                                }
                                j jVar4 = lVar3.d;
                                lVar3.a.a = new j((b2 & 2) != 0 ? nVar3.m() - 1 : jVar4.a, (b2 & 8) != 0 ? nVar3.m() : jVar4.b, (b2 & 16) != 0 ? nVar3.m() : jVar4.c, (b2 & 32) != 0 ? nVar3.m() : jVar4.d);
                            }
                            if (lVar3 != null) {
                                u uVar2 = lVar3.a;
                                long j6 = uVar2.r;
                                lVar3.a();
                                int i26 = c.x;
                                if (aVar3.c(i26) != null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVar3.c(i26).P0;
                                    nVar4.e(i17);
                                    j6 = ((nVar4.b() >> 24) & 255) == i24 ? nVar4.n() : nVar4.k();
                                }
                                ArrayList arrayList2 = aVar3.Q0;
                                int size6 = arrayList2.size();
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (i28 < size6) {
                                    SparseArray sparseArray5 = sparseArray4;
                                    b bVar2 = (b) arrayList2.get(i28);
                                    int i30 = size5;
                                    int i31 = i25;
                                    if (bVar2.a == c.A) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = bVar2.P0;
                                        nVar5.e(12);
                                        int m = nVar5.m();
                                        if (m > 0) {
                                            i27 += m;
                                            i29++;
                                        }
                                    }
                                    i28++;
                                    size5 = i30;
                                    sparseArray4 = sparseArray5;
                                    i25 = i31;
                                }
                                sparseArray = sparseArray4;
                                i2 = size5;
                                i3 = i25;
                                lVar3.g = 0;
                                lVar3.f = 0;
                                lVar3.e = 0;
                                u uVar3 = lVar3.a;
                                uVar3.d = i29;
                                uVar3.e = i27;
                                int[] iArr = uVar3.g;
                                if (iArr == null || iArr.length < i29) {
                                    uVar3.f = new long[i29];
                                    uVar3.g = new int[i29];
                                }
                                int[] iArr2 = uVar3.h;
                                if (iArr2 == null || iArr2.length < i27) {
                                    int i32 = (i27 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                    uVar3.h = new int[i32];
                                    uVar3.i = new int[i32];
                                    uVar3.j = new long[i32];
                                    uVar3.k = new boolean[i32];
                                    uVar3.m = new boolean[i32];
                                }
                                int i33 = 0;
                                int i34 = 0;
                                int i35 = 0;
                                while (i33 < size6) {
                                    long j7 = 0;
                                    b bVar3 = (b) arrayList2.get(i33);
                                    if (bVar3.a == c.A) {
                                        int i36 = i34 + 1;
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVar3.P0;
                                        nVar6.e(8);
                                        int b3 = nVar6.b();
                                        i8 = i33;
                                        s sVar3 = lVar3.c;
                                        u uVar4 = lVar3.a;
                                        int i37 = i34;
                                        j jVar5 = uVar4.a;
                                        int i38 = i35;
                                        uVar4.g[i37] = nVar6.m();
                                        long[] jArr = uVar4.f;
                                        j2 = j6;
                                        long j8 = uVar4.b;
                                        jArr[i37] = j8;
                                        if ((b3 & 1) != 0) {
                                            jArr[i37] = j8 + nVar6.b();
                                        }
                                        boolean z2 = (b3 & 4) != 0;
                                        int i39 = jVar5.d;
                                        if (z2) {
                                            i39 = nVar6.m();
                                        }
                                        boolean z3 = (b3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
                                        boolean z4 = z2;
                                        boolean z5 = (b3 & 512) != 0;
                                        boolean z6 = (b3 & 1024) != 0;
                                        boolean z7 = (b3 & com.ironsource.mediationsdk.metadata.a.o) != 0;
                                        boolean z8 = z6;
                                        long[] jArr2 = sVar3.i;
                                        arrayList = arrayList2;
                                        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                            i9 = i39;
                                            z = z3;
                                            j7 = z.a(sVar3.j[0], 1000L, sVar3.c);
                                        } else {
                                            i9 = i39;
                                            z = z3;
                                        }
                                        int[] iArr3 = uVar4.h;
                                        int[] iArr4 = uVar4.i;
                                        int i40 = i9;
                                        long[] jArr3 = uVar4.j;
                                        boolean[] zArr = uVar4.k;
                                        int i41 = i38 + uVar4.g[i37];
                                        long j9 = sVar3.c;
                                        if (i37 > 0) {
                                            j3 = j9;
                                            j4 = uVar4.r;
                                            i10 = i38;
                                        } else {
                                            j3 = j9;
                                            i10 = i38;
                                            j4 = j2;
                                        }
                                        while (i10 < i41) {
                                            int m2 = z ? nVar6.m() : jVar5.b;
                                            int m3 = z5 ? nVar6.m() : jVar5.c;
                                            if (i10 == 0 && z4) {
                                                i11 = i10;
                                                i12 = i40;
                                            } else if (z8) {
                                                i11 = i10;
                                                i12 = nVar6.b();
                                            } else {
                                                i11 = i10;
                                                i12 = jVar5.d;
                                            }
                                            if (z7) {
                                                i13 = i12;
                                                jVar = jVar5;
                                                i14 = i41;
                                                iArr4[i11] = (int) ((nVar6.b() * 1000) / j3);
                                            } else {
                                                i13 = i12;
                                                jVar = jVar5;
                                                i14 = i41;
                                                iArr4[i11] = 0;
                                            }
                                            long j10 = j4;
                                            jArr3[i11] = z.a(j4, 1000L, j3) - j7;
                                            iArr3[i11] = m3;
                                            zArr[i11] = ((i13 >> 16) & 1) == 0;
                                            j4 = j10 + m2;
                                            i10 = i11 + 1;
                                            jVar5 = jVar;
                                            i41 = i14;
                                        }
                                        uVar4.r = j4;
                                        i34 = i36;
                                        i35 = i41;
                                    } else {
                                        i8 = i33;
                                        arrayList = arrayList2;
                                        j2 = j6;
                                    }
                                    i33 = i8 + 1;
                                    j6 = j2;
                                    arrayList2 = arrayList;
                                }
                                b c = aVar3.c(c.d0);
                                if (c != null) {
                                    t tVar = lVar3.c.h[uVar2.a.a];
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar7 = c.P0;
                                    int i42 = tVar.a;
                                    nVar7.e(8);
                                    if ((nVar7.b() & 1) == 1) {
                                        nVar7.e(nVar7.b + 8);
                                    }
                                    int j11 = nVar7.j();
                                    int m4 = nVar7.m();
                                    if (m4 != uVar2.e) {
                                        StringBuilder a4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", m4, ", ");
                                        a4.append(uVar2.e);
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r(a4.toString());
                                    }
                                    if (j11 == 0) {
                                        boolean[] zArr2 = uVar2.m;
                                        i7 = 0;
                                        for (int i43 = 0; i43 < m4; i43++) {
                                            int j12 = nVar7.j();
                                            i7 += j12;
                                            zArr2[i43] = j12 > i42;
                                        }
                                    } else {
                                        i7 = j11 * m4;
                                        Arrays.fill(uVar2.m, 0, m4, j11 > i42);
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = uVar2.p;
                                    if (nVar8 == null || nVar8.c < i7) {
                                        uVar2.p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i7);
                                    }
                                    uVar2.o = i7;
                                    uVar2.l = true;
                                    uVar2.q = true;
                                }
                                b c2 = aVar3.c(c.e0);
                                if (c2 != null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar9 = c2.P0;
                                    nVar9.e(8);
                                    int b4 = nVar9.b();
                                    if ((b4 & 1) == 1) {
                                        nVar9.e(nVar9.b + 8);
                                    }
                                    int m5 = nVar9.m();
                                    if (m5 != 1) {
                                        zzl.t(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected saio entry count: ", m5));
                                        return;
                                    }
                                    uVar2.c += ((b4 >> 24) & 255) == 0 ? nVar9.k() : nVar9.n();
                                }
                                b c3 = aVar3.c(c.i0);
                                if (c3 != null) {
                                    a(c3.P0, 0, uVar2);
                                }
                                b c4 = aVar3.c(c.f0);
                                b c5 = aVar3.c(c.g0);
                                if (c4 != null && c5 != null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar10 = c4.P0;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar11 = c5.P0;
                                    nVar10.e(8);
                                    int b5 = nVar10.b();
                                    int b6 = nVar10.b();
                                    int i44 = A;
                                    if (b6 == i44) {
                                        i5 = 1;
                                        if (((b5 >> 24) & 255) == 1) {
                                            nVar10.e(nVar10.b + 4);
                                        }
                                        if (nVar10.b() != 1) {
                                            zzl.t("Entry count in sbgp != 1 (unsupported).");
                                            return;
                                        }
                                        nVar11.e(8);
                                        int b7 = nVar11.b();
                                        if (nVar11.b() == i44) {
                                            int i45 = (b7 >> 24) & 255;
                                            if (i45 == 1) {
                                                if (nVar11.k() == 0) {
                                                    zzl.t("Variable length decription in sgpd found (unsupported)");
                                                    return;
                                                }
                                            } else if (i45 >= 2) {
                                                nVar11.e(nVar11.b + 4);
                                            }
                                            if (nVar11.k() != 1) {
                                                zzl.t("Entry count in sgpd != 1 (unsupported).");
                                                return;
                                            }
                                            nVar11.e(nVar11.b + 2);
                                            i5 = 1;
                                            if (nVar11.j() == 1) {
                                                int j13 = nVar11.j();
                                                byte[] bArr2 = new byte[16];
                                                nVar11.a(bArr2, 0, 16);
                                                uVar2.l = true;
                                                uVar2.n = new t(j13, bArr2);
                                            }
                                        }
                                        size = aVar3.Q0.size();
                                        for (i6 = 0; i6 < size; i6++) {
                                            b bVar4 = (b) aVar3.Q0.get(i6);
                                            if (bVar4.a == c.h0) {
                                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar12 = bVar4.P0;
                                                nVar12.e(8);
                                                nVar12.a(bArr, 0, 16);
                                                if (Arrays.equals(bArr, B)) {
                                                    a(nVar12, 16, uVar2);
                                                }
                                            }
                                        }
                                        i4 = 8;
                                        i25 = i3 + 1;
                                        i24 = i5;
                                        i17 = i4;
                                        size5 = i2;
                                        sparseArray4 = sparseArray;
                                    }
                                }
                                i5 = 1;
                                size = aVar3.Q0.size();
                                while (i6 < size) {
                                }
                                i4 = 8;
                                i25 = i3 + 1;
                                i24 = i5;
                                i17 = i4;
                                size5 = i2;
                                sparseArray4 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray4;
                        i2 = size5;
                        i3 = i25;
                        i4 = i17;
                        i5 = i24;
                        i25 = i3 + 1;
                        i24 = i5;
                        i17 = i4;
                        size5 = i2;
                        sparseArray4 = sparseArray;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.d a5 = a(aVar.Q0);
                    if (a5 != null) {
                        int i46 = 0;
                        for (int size7 = this.a.size(); i46 < size7; size7 = size7) {
                            l lVar4 = (l) this.a.valueAt(i46);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = lVar4.b;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = lVar4.c.f;
                            rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.a, oVar.e, oVar.f, oVar.c, oVar.b, oVar.g, oVar.j, oVar.k, oVar.l, oVar.m, oVar.n, oVar.p, oVar.o, oVar.q, oVar.r, oVar.s, oVar.t, oVar.u, oVar.v, oVar.x, oVar.y, oVar.z, oVar.w, oVar.h, a5, oVar.d));
                            i46++;
                        }
                    }
                } else if (!this.i.isEmpty()) {
                    ((a) this.i.peek()).R0.add(aVar);
                }
            }
        }
        this.k = 0;
        this.n = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((l) this.a.valueAt(i)).a();
        }
        this.j.clear();
        this.q = 0;
        this.i.clear();
        this.k = 0;
        this.n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x007c, code lost:
    
        r3 = r2.a;
        r4 = r3.h;
        r9 = r2.e;
        r4 = r4[r9];
        r28.u = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0088, code lost:
    
        if (r3.l == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x008a, code lost:
    
        r4 = r3.p;
        r10 = r3.a.a;
        r11 = r3.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0092, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0095, code lost:
    
        r11 = r2.c.h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x009b, code lost:
    
        r10 = r11.a;
        r3 = r3.m[r9];
        r9 = r28.e;
        r11 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x00a5, code lost:
    
        if (r3 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x00a7, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x00ab, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.e(0);
        r2 = r2.b;
        r2.a(1, r28.e);
        r2.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00bc, code lost:
    
        if (r3 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x00be, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x00d4, code lost:
    
        r28.v = r10;
        r4 = r28.u + r10;
        r28.u = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00e5, code lost:
    
        if (r28.t.c.g != 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x00e7, code lost:
    
        r28.u = r4 - 8;
        r29.a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x00ed, code lost:
    
        r28.k = 4;
        r28.w = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x00f4, code lost:
    
        r2 = r28.t;
        r3 = r2.a;
        r4 = r2.c;
        r9 = r2.b;
        r2 = r2.e;
        r5 = r4.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0100, code lost:
    
        if (r5 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0102, code lost:
    
        r12 = r28.c.a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r30] = 0;
        r13 = r5 + 1;
        r5 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0114, code lost:
    
        if (r28.v >= r28.u) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0116, code lost:
    
        r14 = r28.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0118, code lost:
    
        if (r14 != 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x014a, code lost:
    
        if (r28.x == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x014c, code lost:
    
        r28.d.c(r14);
        r29.b(r28.d.a, r7 ? 1 : 0, r28.w, r7);
        r9.a(r28.w, r28.d);
        r14 = r28.w;
        r15 = r28.d;
        r18 = r8;
        r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(r15.c, r15.a);
        r28.d.e("video/hevc".equals(r4.f.f) ? 1 : 0);
        r28.d.d(r8);
        r22 = r6;
        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a((r3.j[r2] + r3.i[r2]) * 1000, r28.d, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x01a5, code lost:
    
        r28.v += r14;
        r28.w -= r14;
        r8 = r18;
        r6 = r22;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x019a, code lost:
    
        r22 = r6;
        r18 = r8;
        r14 = r9.a(r29, r14, r7 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x011a, code lost:
    
        r29.b(r12, r5, r13, r7);
        r28.c.e(r7 ? 1 : 0);
        r28.w = r28.c.m() - r6;
        r28.b.e(r7 ? 1 : 0);
        r9.a(r8, r28.b);
        r9.a(r6, r28.c);
        r28.x = r7;
        r28.v += 5;
        r28.u += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01b6, code lost:
    
        r19 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01d1, code lost:
    
        r5 = (r3.j[r2] + r3.i[r2]) * r19;
        r1 = r3.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01df, code lost:
    
        if (r1 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01e1, code lost:
    
        r7 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01e5, code lost:
    
        r12 = r7 | (r3.k[r2] ? 1 : 0);
        r2 = r3.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01ef, code lost:
    
        if (r1 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01f1, code lost:
    
        r1 = r3.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01f3, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x01f5, code lost:
    
        r1 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01f7, code lost:
    
        r15 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0201, code lost:
    
        r1 = r28.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0203, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0205, code lost:
    
        r5 = r1.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0209, code lost:
    
        r9.a(r5, r12, r28.u, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0216, code lost:
    
        if (r28.j.isEmpty() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0218, code lost:
    
        r1 = r28.t;
        r1.e++;
        r2 = r1.f + 1;
        r1.f = r2;
        r3 = r3.g;
        r4 = r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x022c, code lost:
    
        if (r2 != r3[r4]) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x022e, code lost:
    
        r1.g = r4 + 1;
        r5 = 0;
        r1.f = 0;
        r28.t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x023c, code lost:
    
        r28.k = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x023e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x023a, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x023f, code lost:
    
        r28.q -= ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k) r28.j.removeFirst()).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0250, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01f9, code lost:
    
        r1 = r4.h[r2].b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0200, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x01e4, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x01bb, code lost:
    
        r19 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x01bf, code lost:
    
        r5 = r28.v;
        r6 = r28.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x01c3, code lost:
    
        if (r5 >= r6) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x01c5, code lost:
    
        r28.v += r9.a(r29, r6 - r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x00c0, code lost:
    
        r3 = r4.o();
        r4.e(r4.b - 2);
        r3 = (r3 * 6) + 2;
        r2.a(r3, r4);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x00aa, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x00dd, code lost:
    
        r28.v = 0;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        char c;
        long n;
        long n2;
        while (true) {
            int i = this.k;
            char c2 = 2;
            int i2 = 1;
            boolean z = false;
            if (i != 0) {
                int i3 = 4;
                if (i != 1) {
                    long j = Long.MAX_VALUE;
                    if (i != 2) {
                        if (i != 3) {
                            c = 2;
                            break;
                        }
                        l lVar = this.t;
                        if (lVar != null) {
                            c = 2;
                            break;
                        }
                        SparseArray sparseArray = this.a;
                        int size = sparseArray.size();
                        long j2 = Long.MAX_VALUE;
                        l lVar2 = null;
                        int i4 = 0;
                        while (i4 < size) {
                            l lVar3 = (l) sparseArray.valueAt(i4);
                            char c3 = c2;
                            int i5 = lVar3.g;
                            u uVar = lVar3.a;
                            if (i5 != uVar.d) {
                                long j3 = uVar.f[i5];
                                if (j3 < j2) {
                                    j2 = j3;
                                    lVar2 = lVar3;
                                }
                            }
                            i4++;
                            c2 = c3;
                        }
                        c = c2;
                        if (lVar2 == null) {
                            int i6 = (int) (this.p - bVar.c);
                            if (i6 >= 0) {
                                bVar.a(i6);
                                this.k = 0;
                                this.n = 0;
                            } else {
                                zzl.t("Offset to end of mdat was negative.");
                                return 0;
                            }
                        } else {
                            int i7 = (int) (lVar2.a.f[lVar2.g] - bVar.c);
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            bVar.a(i7);
                            this.t = lVar2;
                            lVar = lVar2;
                        }
                    } else {
                        int size2 = this.a.size();
                        l lVar4 = null;
                        for (int i8 = 0; i8 < size2; i8++) {
                            u uVar2 = ((l) this.a.valueAt(i8)).a;
                            if (uVar2.q) {
                                long j4 = uVar2.c;
                                if (j4 < j) {
                                    lVar4 = (l) this.a.valueAt(i8);
                                    j = j4;
                                }
                            }
                        }
                        if (lVar4 == null) {
                            this.k = 3;
                        } else {
                            int i9 = (int) (j - bVar.c);
                            if (i9 >= 0) {
                                bVar.a(i9);
                                u uVar3 = lVar4.a;
                                bVar.b(uVar3.p.a, 0, uVar3.o, false);
                                uVar3.p.e(0);
                                uVar3.q = false;
                            } else {
                                zzl.t("Offset to encryption data was negative.");
                                return 0;
                            }
                        }
                    }
                } else {
                    int i10 = ((int) this.m) - this.n;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.o;
                    if (nVar != null) {
                        bVar.b(nVar.a, 8, i10, false);
                        int i11 = this.l;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.o;
                        b bVar2 = new b(i11, nVar2);
                        long j5 = bVar.c;
                        if (!this.i.isEmpty()) {
                            ((a) this.i.peek()).Q0.add(bVar2);
                        } else if (i11 == c.B) {
                            nVar2.e(8);
                            int b = (nVar2.b() >> 24) & 255;
                            nVar2.e(nVar2.b + 4);
                            long k = nVar2.k();
                            if (b == 0) {
                                n = nVar2.k();
                                n2 = nVar2.k();
                            } else {
                                n = nVar2.n();
                                n2 = nVar2.n();
                            }
                            long j6 = n2 + j5;
                            long j7 = n;
                            long j8 = j6;
                            long a = z.a(j7, 1000000L, k);
                            nVar2.e(nVar2.b + 2);
                            int o = nVar2.o();
                            int[] iArr = new int[o];
                            long[] jArr = new long[o];
                            long[] jArr2 = new long[o];
                            long j9 = a;
                            long[] jArr3 = new long[o];
                            int i12 = 0;
                            while (i12 < o) {
                                int b2 = nVar2.b();
                                if ((b2 & Integer.MIN_VALUE) == 0) {
                                    long k2 = nVar2.k();
                                    iArr[i12] = b2 & Integer.MAX_VALUE;
                                    jArr[i12] = j8;
                                    jArr2[i12] = j9;
                                    j7 += k2;
                                    int i13 = i12;
                                    long[] jArr4 = jArr2;
                                    long j10 = j8;
                                    long[] jArr5 = jArr3;
                                    long a2 = z.a(j7, 1000000L, k);
                                    jArr5[i13] = a2 - jArr4[i13];
                                    long j11 = a;
                                    nVar2.e(nVar2.b + 4);
                                    long j12 = j10 + iArr[i13];
                                    i12 = i13 + 1;
                                    j9 = a2;
                                    jArr2 = jArr4;
                                    jArr3 = jArr5;
                                    j8 = j12;
                                    a = j11;
                                } else {
                                    zzl.t("Unhandled indirect reference");
                                    return 0;
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(a), new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr, jArr, jArr3, jArr2));
                            this.s = ((Long) create.first).longValue();
                            this.y.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.q) create.second);
                            this.z = true;
                        }
                    } else {
                        bVar.a(i10);
                    }
                    a(bVar.c);
                }
            } else {
                if (this.n == 0) {
                    if (!bVar.b(this.g.a, 0, 8, true)) {
                        return -1;
                    }
                    this.n = 8;
                    this.g.e(0);
                    this.m = this.g.k();
                    this.l = this.g.b();
                }
                long j13 = this.m;
                if (j13 == 1) {
                    bVar.b(this.g.a, 8, 8, false);
                    this.n += 8;
                    j13 = this.g.n();
                    this.m = j13;
                }
                long j14 = this.n;
                if (j13 >= j14) {
                    long j15 = bVar.c - j14;
                    if (this.l == c.L) {
                        int size3 = this.a.size();
                        for (int i14 = 0; i14 < size3; i14++) {
                            u uVar4 = ((l) this.a.valueAt(i14)).a;
                            uVar4.getClass();
                            uVar4.c = j15;
                            uVar4.b = j15;
                        }
                    }
                    int i15 = this.l;
                    if (i15 == c.i) {
                        this.t = null;
                        this.p = j15 + this.m;
                        if (!this.z) {
                            this.y.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(this.r));
                            this.z = true;
                        }
                        this.k = 2;
                    } else if (i15 != c.C && i15 != c.E && i15 != c.F && i15 != c.G && i15 != c.H && i15 != c.L && i15 != c.M && i15 != c.N && i15 != c.Q) {
                        if (i15 == c.T || i15 == c.S || i15 == c.D || i15 == c.B || i15 == c.U || i15 == c.x || i15 == c.y || i15 == c.P || i15 == c.z || i15 == c.A || i15 == c.V || i15 == c.d0 || i15 == c.e0 || i15 == c.i0 || i15 == c.h0 || i15 == c.f0 || i15 == c.g0 || i15 == c.R || i15 == c.O || i15 == c.G0) {
                            if (this.n == 8) {
                                long j16 = this.m;
                                if (j16 <= 2147483647L) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j16);
                                    this.o = nVar3;
                                    System.arraycopy(this.g.a, 0, nVar3.a, 0, 8);
                                    this.k = 1;
                                } else {
                                    zzl.t("Leaf atom with length > 2147483647 (unsupported).");
                                    return 0;
                                }
                            } else {
                                zzl.t("Leaf atom defines extended atom size (unsupported).");
                                return 0;
                            }
                        } else if (this.m <= 2147483647L) {
                            this.o = null;
                            this.k = 1;
                        } else {
                            zzl.t("Skipping atom with length > 2147483647 (unsupported).");
                            return 0;
                        }
                    } else {
                        long j17 = (bVar.c + this.m) - 8;
                        this.i.add(new a(this.l, j17));
                        if (this.m == this.n) {
                            a(j17);
                        } else {
                            this.k = 0;
                            this.n = 0;
                        }
                    }
                } else {
                    zzl.t("Atom size less than header length (unsupported).");
                    return 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, true);
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, u uVar) {
        nVar.e(i + 8);
        int b = nVar.b();
        int i2 = c.b;
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int m = nVar.m();
            if (m == uVar.e) {
                Arrays.fill(uVar.m, 0, m, z);
                int i3 = nVar.c - nVar.b;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = uVar.p;
                if (nVar2 == null || nVar2.c < i3) {
                    nVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i3);
                    uVar.p = nVar2;
                }
                uVar.o = i3;
                uVar.l = true;
                uVar.q = true;
                nVar.a(nVar2.a, 0, i3);
                uVar.p.e(0);
                uVar.q = false;
                return;
            }
            StringBuilder a = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", m, ", ");
            a.append(uVar.e);
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(a.toString());
        }
        zzl.t("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.d a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            if (bVar.a == c.V) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.P0.a;
                UUID a = q.a(bArr);
                if (a != null) {
                    arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(a, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(false, (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) arrayList2.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c[arrayList2.size()]));
    }
}
