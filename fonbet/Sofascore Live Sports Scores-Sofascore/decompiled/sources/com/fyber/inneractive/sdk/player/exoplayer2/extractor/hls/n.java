package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.w;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.zzl;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n implements x, w, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public final int a;
    public final i b;
    public final f c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.o e;
    public final int f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f h;
    public boolean n;
    public boolean o;
    public int p;
    public com.fyber.inneractive.sdk.player.exoplayer2.o q;
    public int r;
    public boolean s;
    public z t;
    public int u;
    public boolean[] v;
    public long w;
    public long x;
    public boolean y;
    public final b0 g = new b0("Loader:HlsSampleStreamWrapper");
    public final d i = new d();
    public final SparseArray j = new SparseArray();
    public final LinkedList k = new LinkedList();
    public final m l = new m(this);
    public final Handler m = new Handler();

    public n(int i, i iVar, f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i2, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2) {
        this.a = i;
        this.b = iVar;
        this.c = fVar;
        this.d = bVar;
        this.e = oVar;
        this.f = i2;
        this.h = fVar2;
        this.w = j;
        this.x = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd A[RETURN] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, IOException iOException) {
        boolean z;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar;
        boolean z2;
        v vVar;
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        boolean z3 = aVar instanceof h;
        boolean z4 = !z3 || aVar.c() == 0;
        f fVar2 = this.c;
        if (z4) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar2.p;
            int a = fVar2.f.a(aVar.c);
            int i2 = 0;
            while (true) {
                if (i2 >= bVar.b) {
                    i2 = -1;
                    break;
                }
                if (bVar.c[i2] == a) {
                    break;
                }
                i2++;
            }
            if ((iOException instanceof v) && ((i = (vVar = (v) iOException).a) == 404 || i == 410)) {
                z2 = bVar.a(i2);
                int i3 = vVar.a;
                if (z2) {
                    l.a("Blacklisted: duration=60000, responseCode=", i3, ", format=").append(bVar.d[i2]);
                } else {
                    l.a("Blacklisting failed (cannot blacklist last enabled track): responseCode=", i3, ", format=").append(bVar.d[i2]);
                }
            } else {
                z2 = false;
            }
            if (z2) {
                if (z3) {
                    if (((h) this.k.removeLast()) != aVar) {
                        zzl.s();
                        return 0;
                    }
                    if (this.k.isEmpty()) {
                        this.x = this.w;
                    }
                }
                z = true;
                fVar = this.h;
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.a;
                int i4 = aVar.b;
                int i5 = this.a;
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.c;
                int i6 = aVar.d;
                Object obj = aVar.e;
                long j3 = aVar.f;
                long j4 = aVar.g;
                long c = aVar.c();
                if (fVar.b != null) {
                    fVar.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, i4, i5, oVar, i6, obj, j3, j4, j, j2, c, iOException, z));
                }
                if (z) {
                    return 0;
                }
                if (!this.o) {
                    b(this.w);
                    return 2;
                }
                i iVar = this.b;
                iVar.getClass();
                if (iVar.m == null) {
                    return 2;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
                lVar.getClass();
                lVar.f.obtainMessage(9, iVar).sendToTarget();
                return 2;
            }
        } else {
            fVar2.getClass();
        }
        z = false;
        fVar = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = aVar.a;
        int i42 = aVar.b;
        int i52 = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = aVar.c;
        int i62 = aVar.d;
        Object obj2 = aVar.e;
        long j32 = aVar.f;
        long j42 = aVar.g;
        long c2 = aVar.c();
        if (fVar.b != null) {
        }
        if (z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(long j) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        int i4;
        if (!this.y && !this.g.a()) {
            f fVar = this.c;
            h hVar = this.k.isEmpty() ? null : (h) this.k.getLast();
            long j2 = this.x;
            if (j2 == C.TIME_UNSET) {
                j2 = j;
            }
            d dVar = this.i;
            int a = hVar == null ? -1 : fVar.f.a(hVar.c);
            fVar.k = null;
            if (hVar != null) {
                Math.max(0L, hVar.f - j2);
            }
            fVar.p.d();
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.p;
            int i5 = bVar.c[bVar.a()];
            boolean z4 = a != i5;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.d[i5];
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.e.d.get(aVar);
            if (hVar2.d != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                boolean z5 = z4;
                long max = Math.max(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, com.fyber.inneractive.sdk.player.exoplayer2.b.a(hVar2.d.o));
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar2 = hVar2.d;
                long j3 = j2;
                if (dVar2.j || (i4 = dVar2.b) == 2 || i4 == 1 || hVar2.e + max > elapsedRealtime) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d a2 = fVar.e.a(aVar);
                    if (hVar == null || z5) {
                        if (hVar != null) {
                            j3 = hVar.f;
                        }
                        if (a2.j || j3 <= a2.d + a2.o) {
                            List list = a2.m;
                            Long valueOf = Long.valueOf(j3 - a2.d);
                            boolean z6 = !fVar.e.m || hVar == null;
                            int i6 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a;
                            int binarySearch = Collections.binarySearch(list, valueOf);
                            if (binarySearch < 0) {
                                i = -(binarySearch + 2);
                            } else {
                                while (true) {
                                    int i7 = binarySearch - 1;
                                    if (i7 < 0 || ((Comparable) list.get(i7)).compareTo(valueOf) != 0) {
                                        break;
                                    }
                                    binarySearch = i7;
                                }
                                i = binarySearch;
                            }
                            if (z6) {
                                i = Math.max(0, i);
                            }
                            int i8 = a2.g;
                            i2 = i + i8;
                            if (i2 < i8 && hVar != null) {
                                aVar = fVar.d[a];
                                a2 = fVar.e.a(aVar);
                                i2 = hVar.i + 1;
                                i3 = a2.g;
                                if (i2 >= i3) {
                                    fVar.j = new com.fyber.inneractive.sdk.player.exoplayer2.source.g();
                                    z = true;
                                    d dVar3 = this.i;
                                    z2 = dVar3.b;
                                    com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar2 = dVar3.a;
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar3 = dVar3.c;
                                    dVar3.a = null;
                                    dVar3.b = false;
                                    dVar3.c = null;
                                    if (!z2) {
                                        this.y = z;
                                        return z;
                                    }
                                    if (aVar2 != null) {
                                        if (aVar2 instanceof h) {
                                            this.x = C.TIME_UNSET;
                                            h hVar3 = (h) aVar2;
                                            hVar3.D = this;
                                            int i9 = hVar3.j;
                                            boolean z7 = hVar3.t;
                                            this.r = i9;
                                            for (int i10 = 0; i10 < this.j.size(); i10++) {
                                                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i10)).c.r = i9;
                                            }
                                            if (z7) {
                                                for (int i11 = 0; i11 < this.j.size(); i11++) {
                                                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i11)).m = z;
                                                }
                                            }
                                            this.k.add(hVar3);
                                        }
                                        b0 b0Var = this.g;
                                        int i12 = this.f;
                                        b0Var.getClass();
                                        Looper myLooper = Looper.myLooper();
                                        if (myLooper == null) {
                                            zzl.s();
                                            return false;
                                        }
                                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                        y yVar = new y(b0Var, myLooper, aVar2, this, i12, elapsedRealtime2);
                                        if (b0Var.b != null) {
                                            zzl.s();
                                            return false;
                                        }
                                        b0Var.b = yVar;
                                        yVar.e = null;
                                        b0Var.a.execute(yVar);
                                        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.h;
                                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = aVar2.a;
                                        int i13 = aVar2.b;
                                        int i14 = this.a;
                                        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar2.c;
                                        int i15 = aVar2.d;
                                        Object obj = aVar2.e;
                                        long j4 = aVar2.f;
                                        long j5 = aVar2.g;
                                        if (fVar2.b != null) {
                                            fVar2.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.a(fVar2, kVar2, i13, i14, oVar, i15, obj, j4, j5, elapsedRealtime2));
                                        }
                                        return z;
                                    }
                                    if (aVar3 != null) {
                                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) this.b.a.d.get(aVar3)).b();
                                        return false;
                                    }
                                } else {
                                    int i16 = i2 - i3;
                                    if (i16 < a2.m.size()) {
                                        z3 = true;
                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) a2.m.get(i16);
                                        if (cVar.e) {
                                            Uri a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(a2.a, cVar.f);
                                            boolean equals = a3.equals(fVar.l);
                                            String str = cVar.g;
                                            if (!equals) {
                                                dVar.a = new c(fVar.b, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(a3, 0L, 0L, -1L, null, 1), fVar.d[a].b, fVar.p.c(), fVar.p.b(), fVar.i, str);
                                            } else if (!com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(str, fVar.n)) {
                                                fVar.a(a3, cVar.g, fVar.m);
                                            }
                                        } else {
                                            fVar.l = null;
                                            fVar.m = null;
                                            fVar.n = null;
                                            fVar.o = null;
                                        }
                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar2 = a2.l;
                                        if (cVar2 != null) {
                                            Uri a4 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(a2.a, cVar2.a);
                                            long j6 = cVar2.h;
                                            kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(a4, j6, j6, cVar2.i, null, 0);
                                        } else {
                                            kVar = null;
                                        }
                                        long j7 = a2.d + cVar.d;
                                        int i17 = a2.f + cVar.c;
                                        o oVar2 = fVar.c;
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.v) oVar2.a.get(i17);
                                        if (vVar == null) {
                                            vVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(Long.MAX_VALUE);
                                            oVar2.a.put(i17, vVar);
                                        }
                                        Uri a5 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(a2.a, cVar.a);
                                        long j8 = cVar.h;
                                        z = true;
                                        dVar.a = new h(fVar.a, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(a5, j8, j8, cVar.i, null, 0), kVar, aVar, fVar.g, fVar.p.c(), fVar.p.b(), j7, j7 + cVar.b, i2, i17, fVar.h, vVar, hVar, fVar.m, fVar.o);
                                        d dVar32 = this.i;
                                        z2 = dVar32.b;
                                        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar22 = dVar32.a;
                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar32 = dVar32.c;
                                        dVar32.a = null;
                                        dVar32.b = false;
                                        dVar32.c = null;
                                        if (!z2) {
                                        }
                                    } else if (a2.j) {
                                        z3 = true;
                                        dVar.b = true;
                                    } else {
                                        z3 = true;
                                        dVar.c = aVar;
                                        fVar.k = aVar;
                                    }
                                    z = z3;
                                    d dVar322 = this.i;
                                    z2 = dVar322.b;
                                    com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar222 = dVar322.a;
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar322 = dVar322.c;
                                    dVar322.a = null;
                                    dVar322.b = false;
                                    dVar322.c = null;
                                    if (!z2) {
                                    }
                                }
                            }
                        } else {
                            i2 = a2.g + a2.m.size();
                        }
                    } else {
                        i2 = hVar.i + 1;
                    }
                    a = i5;
                    i3 = a2.g;
                    if (i2 >= i3) {
                    }
                }
            }
            dVar.c = aVar;
            fVar.k = aVar;
            z = true;
            d dVar3222 = this.i;
            z2 = dVar3222.b;
            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar2222 = dVar3222.a;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar3222 = dVar3222.c;
            dVar3222.a = null;
            dVar3222.b = false;
            dVar3222.c = null;
            if (!z2) {
            }
        }
        return false;
    }

    public final void c(long j) {
        this.w = j;
        this.x = j;
        this.y = false;
        this.k.clear();
        if (this.g.a()) {
            this.g.b.a(false);
            return;
        }
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i)).a(this.v[i]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.m.post(this.l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j = this.x;
        if (j != C.TIME_UNSET) {
            return j;
        }
        if (this.y) {
            return Long.MIN_VALUE;
        }
        return ((h) this.k.getLast()).g;
    }

    public final void h() {
        if (this.s || this.o || !this.n) {
            return;
        }
        int size = this.j.size();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.j;
            if (i >= size) {
                int size2 = sparseArray.size();
                int i2 = 0;
                char c = 0;
                int i3 = -1;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    String str = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i2)).e().f;
                    char c2 = "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 3 : "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 2 : "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 1 : (char) 0;
                    if (c2 > c) {
                        i3 = i2;
                        c = c2;
                    } else if (c2 == c && i3 != -1) {
                        i3 = -1;
                    }
                    i2++;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar = this.c.f;
                int i4 = yVar.a;
                this.u = -1;
                this.v = new boolean[size2];
                com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[size2];
                for (int i5 = 0; i5 < size2; i5++) {
                    com.fyber.inneractive.sdk.player.exoplayer2.o e = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i5)).e();
                    if (i5 == i3) {
                        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i4];
                        for (int i6 = 0; i6 < i4; i6++) {
                            oVarArr[i6] = a(yVar.b[i6], e);
                        }
                        yVarArr[i5] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(oVarArr);
                        this.u = i5;
                    } else {
                        yVarArr[i5] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(a((c == 3 && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(e.f))) ? this.e : null, e));
                    }
                }
                this.t = new z(yVarArr);
                this.o = true;
                i iVar = this.b;
                int i7 = iVar.k - 1;
                iVar.k = i7;
                if (i7 > 0) {
                    return;
                }
                int i8 = 0;
                for (n nVar : iVar.n) {
                    i8 += nVar.t.a;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[i8];
                int i9 = 0;
                for (n nVar2 : iVar.n) {
                    int i10 = nVar2.t.a;
                    int i11 = 0;
                    while (i11 < i10) {
                        yVarArr2[i9] = nVar2.t.b[i11];
                        i11++;
                        i9++;
                    }
                }
                iVar.m = new z(yVarArr2);
                ((com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j).f.obtainMessage(8, iVar).sendToTarget();
                return;
            }
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) sparseArray.valueAt(i)).e() == null) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.a;
        int i = aVar.b;
        int i2 = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.c;
        int i3 = aVar.d;
        Object obj = aVar.e;
        long j3 = aVar.f;
        long j4 = aVar.g;
        long c = aVar.c();
        if (fVar.b != null) {
            fVar.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, i, i2, oVar, i3, obj, j3, j4, j, j2, c));
        }
        if (z) {
            return;
        }
        int size = this.j.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i4)).a(this.v[i4]);
        }
        i iVar = this.b;
        iVar.getClass();
        if (iVar.m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
        lVar.getClass();
        lVar.f.obtainMessage(9, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        f fVar = this.c;
        fVar.getClass();
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            fVar.i = cVar.i;
            fVar.a(cVar.a.a, cVar.l, cVar.m);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.a;
        int i = aVar.b;
        int i2 = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.c;
        int i3 = aVar.d;
        Object obj = aVar.e;
        long j3 = aVar.f;
        long j4 = aVar.g;
        long c = aVar.c();
        if (fVar2.b != null) {
            fVar2.a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar2, kVar, i, i2, oVar, i3, obj, j3, j4, j, j2, c));
        }
        if (!this.o) {
            b(this.w);
            return;
        }
        i iVar = this.b;
        iVar.getClass();
        if (iVar.m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
        lVar.getClass();
        lVar.f.obtainMessage(9, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(q qVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i, int i2) {
        if (this.j.indexOfKey(i) >= 0) {
            return (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.get(i);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.d);
        gVar.n = this;
        gVar.c.r = this.r;
        this.j.put(i, gVar);
        return gVar;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        String a;
        if (oVar == null) {
            return oVar2;
        }
        int c = com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(oVar2.f);
        if (c == 1) {
            a = a(oVar.c, 1);
        } else {
            a = c == 2 ? a(oVar.c, 2) : null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.a, oVar2.e, oVar2.f, a, oVar.b, oVar2.g, oVar.j, oVar.k, oVar2.l, oVar2.m, oVar2.n, oVar2.p, oVar2.o, oVar2.q, oVar2.r, oVar2.s, oVar2.t, oVar2.u, oVar2.v, oVar.x, oVar.y, oVar2.z, oVar2.w, oVar2.h, oVar2.i, oVar2.d);
    }

    public static String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (i == com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str2))) {
                if (sb.length() > 0) {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.n = true;
        this.m.post(this.l);
    }
}
