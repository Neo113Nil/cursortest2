package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.ilg;
import defpackage.zzl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i implements s {
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k a;
    public final b b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b e;
    public final long i;
    public r j;
    public int k;
    public boolean l;
    public z m;
    public n[] n;
    public n[] o;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.h p;
    public final int c = 3;
    public final IdentityHashMap f = new IdentityHashMap();
    public final o g = new o();
    public final Handler h = new Handler();

    public i(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2, long j) {
        this.a = kVar;
        this.b = bVar;
        this.d = fVar;
        this.e = bVar2;
        this.i = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j) {
        int[] iArr;
        int i;
        boolean z;
        v[] vVarArr2;
        int i2;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr2;
        int i3;
        int[] iArr2;
        int[] iArr3 = new int[bVarArr.length];
        int[] iArr4 = new int[bVarArr.length];
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            v vVar = vVarArr[i4];
            iArr3[i4] = vVar == null ? -1 : ((Integer) this.f.get(vVar)).intValue();
            iArr4[i4] = -1;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = bVarArr[i4];
            if (bVar != null) {
                y yVar = bVar.a;
                int i5 = 0;
                while (true) {
                    n[] nVarArr = this.n;
                    if (i5 < nVarArr.length) {
                        z zVar = nVarArr[i5].t;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= zVar.a) {
                                i6 = -1;
                                break;
                            }
                            if (zVar.b[i6] == yVar) {
                                break;
                            }
                            i6++;
                        }
                        if (i6 != -1) {
                            iArr4[i4] = i5;
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        this.f.clear();
        int length = bVarArr.length;
        v[] vVarArr3 = new v[length];
        v[] vVarArr4 = new v[bVarArr.length];
        int length2 = bVarArr.length;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr3 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[length2];
        ArrayList arrayList = new ArrayList(this.n.length);
        int i7 = 0;
        boolean z2 = false;
        while (i7 < this.n.length) {
            int i8 = 0;
            while (true) {
                iArr = iArr3;
                if (i8 >= bVarArr.length) {
                    break;
                }
                vVarArr4[i8] = iArr[i8] == i7 ? vVarArr[i8] : null;
                bVarArr3[i8] = iArr4[i8] == i7 ? bVarArr[i8] : null;
                i8++;
                iArr3 = iArr;
            }
            n nVar = this.n[i7];
            boolean z3 = this.l;
            if (!nVar.o) {
                zzl.s();
                return 0L;
            }
            int i9 = 0;
            while (i9 < length2) {
                v vVar2 = vVarArr4[i9];
                if (vVar2 == null || (bVarArr3[i9] != null && zArr[i9])) {
                    i3 = i9;
                    iArr2 = iArr4;
                } else {
                    i3 = i9;
                    int i10 = ((k) vVar2).a;
                    iArr2 = iArr4;
                    boolean[] zArr3 = nVar.v;
                    if (!zArr3[i10]) {
                        zzl.s();
                        return 0L;
                    }
                    zArr3[i10] = false;
                    nVar.p--;
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.j.valueAt(i10)).b();
                    vVarArr4[i3] = null;
                }
                i9 = i3 + 1;
                iArr4 = iArr2;
            }
            int[] iArr5 = iArr4;
            int i11 = 0;
            boolean z4 = false;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar2 = null;
            while (i11 < length2) {
                if (vVarArr4[i11] == null) {
                    i = i11;
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar3 = bVarArr3[i];
                    z = z3;
                    if (bVar3 != null) {
                        z zVar2 = nVar.t;
                        vVarArr2 = vVarArr4;
                        y yVar2 = bVar3.a;
                        i2 = length2;
                        bVarArr2 = bVarArr3;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= zVar2.a) {
                                i12 = -1;
                                break;
                            }
                            if (zVar2.b[i12] == yVar2) {
                                break;
                            }
                            i12++;
                        }
                        boolean[] zArr4 = nVar.v;
                        if (zArr4[i12]) {
                            zzl.s();
                            return 0L;
                        }
                        zArr4[i12] = true;
                        nVar.p++;
                        if (i12 == nVar.u) {
                            nVar.c.p = bVar3;
                            bVar2 = bVar3;
                        }
                        vVarArr2[i] = new k(nVar, i12);
                        zArr2[i] = true;
                        z4 = true;
                        i11 = i + 1;
                        z3 = z;
                        vVarArr4 = vVarArr2;
                        length2 = i2;
                        bVarArr3 = bVarArr2;
                    }
                } else {
                    i = i11;
                    z = z3;
                }
                vVarArr2 = vVarArr4;
                i2 = length2;
                bVarArr2 = bVarArr3;
                i11 = i + 1;
                z3 = z;
                vVarArr4 = vVarArr2;
                length2 = i2;
                bVarArr3 = bVarArr2;
            }
            v[] vVarArr5 = vVarArr4;
            int i13 = length2;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr4 = bVarArr3;
            if (!z3) {
                int size = nVar.j.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (!nVar.v[i14]) {
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.j.valueAt(i14)).b();
                    }
                }
                if (bVar2 != null && !nVar.k.isEmpty()) {
                    bVar2.d();
                    if (bVar2.c[bVar2.a()] != nVar.c.f.a(((h) nVar.k.getLast()).c)) {
                        nVar.c(nVar.w);
                    }
                }
            }
            if (nVar.p == 0) {
                nVar.c.j = null;
                nVar.q = null;
                nVar.k.clear();
                if (nVar.g.a()) {
                    nVar.g.b.a(false);
                }
            }
            z2 |= z4;
            boolean z5 = false;
            for (int i15 = 0; i15 < bVarArr.length; i15++) {
                if (iArr5[i15] == i7) {
                    v vVar3 = vVarArr5[i15];
                    if (vVar3 == null) {
                        zzl.s();
                        return 0L;
                    }
                    vVarArr3[i15] = vVar3;
                    this.f.put(vVarArr5[i15], Integer.valueOf(i7));
                    z5 = true;
                } else if (iArr[i15] == i7 && vVarArr5[i15] != null) {
                    zzl.s();
                    return 0L;
                }
            }
            if (z5) {
                arrayList.add(this.n[i7]);
            }
            i7++;
            iArr3 = iArr;
            iArr4 = iArr5;
            vVarArr4 = vVarArr5;
            length2 = i13;
            bVarArr3 = bVarArr4;
        }
        System.arraycopy(vVarArr3, 0, vVarArr, 0, length);
        n[] nVarArr2 = new n[arrayList.size()];
        this.o = nVarArr2;
        arrayList.toArray(nVarArr2);
        n[] nVarArr3 = this.o;
        if (nVarArr3.length > 0) {
            nVarArr3[0].c.h = true;
            int i16 = 1;
            while (true) {
                nVarArr3 = this.o;
                if (i16 >= nVarArr3.length) {
                    break;
                }
                nVarArr3[i16].c.h = false;
                i16++;
            }
        }
        this.p = new com.fyber.inneractive.sdk.player.exoplayer2.source.h(nVarArr3);
        if (this.l && z2) {
            a(j);
            for (int i17 = 0; i17 < bVarArr.length; i17++) {
                if (vVarArr[i17] != null) {
                    zArr2[i17] = true;
                }
            }
        }
        this.l = true;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j) {
        return this.p.b(j);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        /*
            r18 = this;
            r0 = r18
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n[] r0 = r0.o
            int r1 = r0.length
            r4 = 0
            r5 = r4
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lc:
            r8 = -9223372036854775808
            if (r5 >= r1) goto L85
            r10 = r0[r5]
            boolean r11 = r10.y
            if (r11 == 0) goto L1d
            r11 = r8
        L17:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L7a
        L1d:
            long r11 = r10.x
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 == 0) goto L29
            goto L17
        L29:
            long r11 = r10.w
            java.util.LinkedList r13 = r10.k
            java.lang.Object r13 = r13.getLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r13 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r13
            boolean r14 = r13.F
            if (r14 == 0) goto L38
            goto L51
        L38:
            java.util.LinkedList r13 = r10.k
            int r13 = r13.size()
            r14 = 1
            if (r13 <= r14) goto L50
            java.util.LinkedList r13 = r10.k
            int r14 = r13.size()
            int r14 = r14 + (-2)
            java.lang.Object r13 = r13.get(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r13 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r13
            goto L51
        L50:
            r13 = 0
        L51:
            if (r13 == 0) goto L59
            long r13 = r13.g
            long r11 = java.lang.Math.max(r11, r13)
        L59:
            android.util.SparseArray r13 = r10.j
            int r13 = r13.size()
            r14 = r4
        L60:
            if (r14 >= r13) goto L17
            android.util.SparseArray r15 = r10.j
            java.lang.Object r15 = r15.valueAt(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r15 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) r15
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r15.d()
            long r11 = java.lang.Math.max(r11, r2)
            int r14 = r14 + 1
            goto L60
        L7a:
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 == 0) goto L82
            long r6 = java.lang.Math.min(r6, r11)
        L82:
            int r5 = r5 + 1
            goto Lc
        L85:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 != 0) goto L8f
            return r8
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i.c():long");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() {
        n[] nVarArr = this.n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                nVar.g.b();
                f fVar = nVar.c;
                com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.j;
                if (gVar != null) {
                    throw gVar;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.k;
                if (aVar != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.e.d.get(aVar);
                    hVar.b.b();
                    IOException iOException = hVar.j;
                    if (iOException != null) {
                        throw iOException;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        return this.p.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        return C.TIME_UNSET;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar;
        this.a.g.add(this);
        this.j = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar = this.a.j;
        ArrayList arrayList = new ArrayList(bVar.b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) arrayList.get(i);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.b;
            if (oVar.k <= 0) {
                String str = oVar.c;
                if (!TextUtils.isEmpty(str)) {
                    for (String str2 : str.split("(\\s*,\\s*)|(\\s*$)")) {
                        if (!str2.startsWith("avc")) {
                        }
                    }
                }
                String str3 = aVar.b.c;
                if (!TextUtils.isEmpty(str3)) {
                    String[] split = str3.split("(\\s*,\\s*)|(\\s*$)");
                    int length = split.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (split[i2].startsWith("mp4a")) {
                            arrayList3.add(aVar);
                            break;
                        }
                        i2++;
                    }
                }
            }
            arrayList2.add(aVar);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List list = bVar.c;
        List list2 = bVar.d;
        int size = list2.size() + list.size() + 1;
        this.n = new n[size];
        this.k = size;
        if (!arrayList.isEmpty()) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[arrayList.size()];
            arrayList.toArray(aVarArr);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = bVar.e;
            f fVar = new f(this.a, aVarArr, this.b, this.g, bVar.f);
            n nVar = new n(0, this, fVar, this.e, this.i, oVar2, this.c, this.d);
            this.n[0] = nVar;
            fVar.h = true;
            if (!nVar.o) {
                nVar.b(nVar.w);
            }
            int i3 = 0;
            int i4 = 1;
            while (i3 < list.size()) {
                n nVar2 = new n(1, this, new f(this.a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list.get(i3)}, this.b, this.g, Collections.EMPTY_LIST), this.e, this.i, null, this.c, this.d);
                int i5 = i4 + 1;
                this.n[i4] = nVar2;
                if (!nVar2.o) {
                    nVar2.b(nVar2.w);
                }
                i3++;
                i4 = i5;
            }
            int i6 = 0;
            while (i6 < list2.size()) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list2.get(i6);
                f fVar2 = new f(this.a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{aVar2}, this.b, this.g, Collections.EMPTY_LIST);
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2 = this.e;
                n nVar3 = new n(3, this, fVar2, bVar2, this.i, null, this.c, this.d);
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = aVar2.b;
                if (nVar3.j.indexOfKey(0) >= 0) {
                    gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar3.j.get(0);
                } else {
                    gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(bVar2);
                    gVar.n = nVar3;
                    gVar.c.r = nVar3.r;
                    nVar3.j.put(0, gVar);
                }
                gVar.a(oVar3);
                nVar3.n = true;
                nVar3.h();
                this.n[i4] = nVar3;
                i6++;
                i4++;
            }
            return;
        }
        ilg.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j) {
        this.g.a.clear();
        for (n nVar : this.o) {
            nVar.c(j);
        }
        return j;
    }
}
