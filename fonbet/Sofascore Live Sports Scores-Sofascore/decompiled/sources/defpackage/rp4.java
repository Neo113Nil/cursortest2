package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rp4 implements vfb {
    public final Uri a;
    public final String b;
    public final x6k c = new x6k("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final re4 d;
    public zc9 e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public IOException k;
    public boolean l;
    public final /* synthetic */ tp4 m;

    public rp4(tp4 tp4Var, Uri uri, String str) {
        this.m = tp4Var;
        this.a = uri;
        this.b = str;
        this.d = ((oe4) tp4Var.a.b).createDataSource();
    }

    public final Uri a() {
        zc9 zc9Var = this.e;
        Uri uri = this.a;
        if (zc9Var != null) {
            yc9 yc9Var = zc9Var.v;
            if (yc9Var.a != C.TIME_UNSET || yc9Var.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                zc9 zc9Var2 = this.e;
                if (zc9Var2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(zc9Var2.k + zc9Var2.r.size()));
                    zc9 zc9Var3 = this.e;
                    if (zc9Var3.n != C.TIME_UNSET) {
                        hv9 hv9Var = zc9Var3.s;
                        int size = hv9Var.size();
                        if (!hv9Var.isEmpty() && ((uc9) jca.H(hv9Var)).m) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                yc9 yc9Var2 = this.e.v;
                if (yc9Var2.a != C.TIME_UNSET) {
                    buildUpon.appendQueryParameter("_HLS_skip", yc9Var2.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    @Override // defpackage.vfb
    public final void b(yfb yfbVar, long j, long j2, boolean z) {
        x9e x9eVar = (x9e) yfbVar;
        long j3 = x9eVar.a;
        xe4 xe4Var = x9eVar.b;
        tei teiVar = x9eVar.d;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        tp4 tp4Var = this.m;
        tp4Var.c.getClass();
        tp4Var.f.u(lfbVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public final void c(Uri uri) {
        tp4 tp4Var = this.m;
        w9e b = tp4Var.b.b(tp4Var.j, this.e);
        Map map = Collections.EMPTY_MAP;
        z1a.y(uri, "The uri must be set.");
        x9e x9eVar = new x9e(this.d, new xe4(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, b);
        this.c.y(x9eVar, this, tp4Var.c.n(x9eVar.c));
    }

    @Override // defpackage.vfb
    public final void d(yfb yfbVar, long j, long j2) {
        x9e x9eVar = (x9e) yfbVar;
        ed9 ed9Var = (ed9) x9eVar.f;
        xe4 xe4Var = x9eVar.b;
        tei teiVar = x9eVar.d;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        if (ed9Var instanceof zc9) {
            f((zc9) ed9Var, lfbVar);
            this.m.f.v(lfbVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        } else {
            s9e b = s9e.b("Loaded playlist has unexpected type.", null);
            this.k = b;
            this.m.f.x(lfbVar, 4, b, true);
        }
        this.m.c.getClass();
    }

    public final void e(Uri uri) {
        this.i = 0L;
        if (this.j) {
            return;
        }
        x6k x6kVar = this.c;
        if (x6kVar.l() || x6kVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.h;
        if (elapsedRealtime >= j) {
            c(uri);
        } else {
            this.j = true;
            this.m.h.postDelayed(new mc3(20, this, uri), j - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(zc9 zc9Var, lfb lfbVar) {
        boolean z;
        boolean z2;
        long j;
        hv9 hv9Var;
        long j2;
        long j3;
        int i;
        hv9 hv9Var2;
        zc9 zc9Var2;
        jz2 jz2Var;
        jz2 jz2Var2;
        boolean z3;
        yc9 yc9Var;
        int size;
        int size2;
        int size3;
        boolean z4 = zc9Var.o;
        hv9 hv9Var3 = zc9Var.r;
        long j4 = zc9Var.k;
        zc9 zc9Var3 = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f = elapsedRealtime;
        tp4 tp4Var = this.m;
        CopyOnWriteArrayList copyOnWriteArrayList = tp4Var.e;
        if (zc9Var3 != null) {
            long j5 = zc9Var3.k;
            if (j4 <= j5 && (j4 < j5 || ((size = hv9Var3.size() - zc9Var3.r.size()) == 0 ? !((size2 = zc9Var.s.size()) > (size3 = zc9Var3.s.size()) || (size2 == size3 && z4 && !zc9Var3.o)) : size <= 0))) {
                z = false;
                hv9 hv9Var4 = zc9Var.r;
                long j6 = 0;
                if (!z) {
                    z2 = true;
                    if (zc9Var.p) {
                        j = zc9Var.h;
                        hv9Var = hv9Var3;
                    } else {
                        zc9 zc9Var4 = tp4Var.q;
                        j = zc9Var4 != null ? zc9Var4.h : 0L;
                        hv9Var = hv9Var3;
                        if (zc9Var3 != null) {
                            long j7 = zc9Var3.h;
                            long j8 = zc9Var3.k;
                            hv9 hv9Var5 = zc9Var3.r;
                            int size4 = hv9Var5.size();
                            j2 = j4;
                            int i2 = (int) (j2 - j8);
                            wc9 wc9Var = i2 < hv9Var5.size() ? (wc9) hv9Var5.get(i2) : null;
                            if (wc9Var != null) {
                                j3 = wc9Var.e;
                            } else {
                                if (size4 == j2 - j8) {
                                    j3 = zc9Var3.u;
                                }
                                long j9 = j;
                                if (zc9Var.i) {
                                    i = zc9Var.j;
                                    hv9Var2 = hv9Var4;
                                } else {
                                    zc9 zc9Var5 = tp4Var.q;
                                    int i3 = zc9Var5 != null ? zc9Var5.j : 0;
                                    if (zc9Var3 != null) {
                                        int i4 = (int) (j2 - zc9Var3.k);
                                        hv9 hv9Var6 = zc9Var3.r;
                                        wc9 wc9Var2 = i4 < hv9Var6.size() ? (wc9) hv9Var6.get(i4) : null;
                                        if (wc9Var2 != null) {
                                            i3 = (zc9Var3.j + wc9Var2.d) - ((wc9) hv9Var4.get(0)).d;
                                            i = i3;
                                            hv9Var2 = hv9Var4;
                                        }
                                    }
                                    i = i3;
                                    hv9Var2 = hv9Var4;
                                }
                                jz2Var = null;
                                zc9Var2 = new zc9(zc9Var.d, zc9Var.a, zc9Var.b, zc9Var.e, zc9Var.g, j9, true, i, zc9Var.k, zc9Var.l, zc9Var.m, zc9Var.n, zc9Var.c, zc9Var.o, zc9Var.p, zc9Var.q, hv9Var2, zc9Var.s, zc9Var.v, zc9Var.t, zc9Var.w, zc9Var.x);
                            }
                            j = j7 + j3;
                            long j92 = j;
                            if (zc9Var.i) {
                            }
                            jz2Var = null;
                            zc9Var2 = new zc9(zc9Var.d, zc9Var.a, zc9Var.b, zc9Var.e, zc9Var.g, j92, true, i, zc9Var.k, zc9Var.l, zc9Var.m, zc9Var.n, zc9Var.c, zc9Var.o, zc9Var.p, zc9Var.q, hv9Var2, zc9Var.s, zc9Var.v, zc9Var.t, zc9Var.w, zc9Var.x);
                        }
                    }
                    j2 = j4;
                    long j922 = j;
                    if (zc9Var.i) {
                    }
                    jz2Var = null;
                    zc9Var2 = new zc9(zc9Var.d, zc9Var.a, zc9Var.b, zc9Var.e, zc9Var.g, j922, true, i, zc9Var.k, zc9Var.l, zc9Var.m, zc9Var.n, zc9Var.c, zc9Var.o, zc9Var.p, zc9Var.q, hv9Var2, zc9Var.s, zc9Var.v, zc9Var.t, zc9Var.w, zc9Var.x);
                } else if (!z4) {
                    z2 = true;
                    hv9Var = hv9Var3;
                    j2 = j4;
                    zc9Var2 = zc9Var3;
                    jz2Var = null;
                } else if (zc9Var3.o) {
                    hv9Var = hv9Var3;
                    j2 = j4;
                    zc9Var2 = zc9Var3;
                    jz2Var = null;
                    z2 = true;
                } else {
                    z2 = true;
                    hv9Var = hv9Var3;
                    zc9Var2 = new zc9(zc9Var3.d, zc9Var3.a, zc9Var3.b, zc9Var3.e, zc9Var3.g, zc9Var3.h, zc9Var3.i, zc9Var3.j, zc9Var3.k, zc9Var3.l, zc9Var3.m, zc9Var3.n, zc9Var3.c, true, zc9Var3.p, zc9Var3.q, zc9Var3.r, zc9Var3.s, zc9Var3.v, zc9Var3.t, zc9Var3.w, zc9Var3.x);
                    jz2Var = null;
                    j2 = j4;
                }
                this.e = zc9Var2;
                Uri uri = this.a;
                if (zc9Var2 == zc9Var3) {
                    this.k = jz2Var;
                    this.g = elapsedRealtime;
                    if (uri.equals(tp4Var.p)) {
                        if (tp4Var.q == null) {
                            tp4Var.r = !zc9Var2.o;
                            tp4Var.s = zc9Var2.h;
                        }
                        tp4Var.q = zc9Var2;
                        tp4Var.i.t(zc9Var2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((id9) it.next()).b();
                    }
                } else if (!zc9Var2.o) {
                    long size5 = j2 + hv9Var.size();
                    zc9 zc9Var6 = this.e;
                    if (size5 < zc9Var6.k) {
                        jz2Var2 = new jz2();
                        z3 = z2;
                    } else {
                        jz2Var2 = ((double) (elapsedRealtime - this.g)) > ((double) nik.h0(zc9Var6.m)) * 3.5d ? new jz2() : jz2Var;
                        z3 = false;
                    }
                    if (jz2Var2 != null) {
                        this.k = jz2Var2;
                        yz1 yz1Var = new yz1(jz2Var2, z2 ? 1 : 0, 7);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((id9) it2.next()).d(uri, yz1Var, z3);
                        }
                    }
                }
                zc9 zc9Var7 = this.e;
                yc9Var = zc9Var7.v;
                long j10 = zc9Var7.m;
                if (!yc9Var.e) {
                    if (zc9Var7 == zc9Var3) {
                        long j11 = zc9Var7.n;
                        if (j11 != C.TIME_UNSET) {
                            j6 = j11 / 2;
                        } else {
                            j10 /= 2;
                        }
                    }
                    this.h = (nik.h0(j6) + elapsedRealtime) - lfbVar.e;
                    if (this.e.o) {
                        return;
                    }
                    if (uri.equals(tp4Var.p) || this.l) {
                        e(a());
                        return;
                    }
                    return;
                }
                if (zc9Var7 == zc9Var3) {
                    j10 /= 2;
                }
                j6 = j10;
                this.h = (nik.h0(j6) + elapsedRealtime) - lfbVar.e;
                if (this.e.o) {
                }
            }
        }
        z = true;
        hv9 hv9Var42 = zc9Var.r;
        long j62 = 0;
        if (!z) {
        }
        this.e = zc9Var2;
        Uri uri2 = this.a;
        if (zc9Var2 == zc9Var3) {
        }
        zc9 zc9Var72 = this.e;
        yc9Var = zc9Var72.v;
        long j102 = zc9Var72.m;
        if (!yc9Var.e) {
        }
        j62 = j102;
        this.h = (nik.h0(j62) + elapsedRealtime) - lfbVar.e;
        if (this.e.o) {
        }
    }

    @Override // defpackage.vfb
    public final void l(yfb yfbVar, long j, long j2, int i) {
        lfb lfbVar;
        x9e x9eVar = (x9e) yfbVar;
        if (i == 0) {
            long j3 = x9eVar.a;
            lfbVar = new lfb(x9eVar.b, j);
        } else {
            long j4 = x9eVar.a;
            xe4 xe4Var = x9eVar.b;
            tei teiVar = x9eVar.d;
            lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        }
        this.m.f.y(lfbVar, x9eVar.c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i);
    }

    @Override // defpackage.vfb
    public final r5a r(yfb yfbVar, long j, long j2, IOException iOException, int i) {
        x9e x9eVar = (x9e) yfbVar;
        long j3 = x9eVar.a;
        int i2 = x9eVar.c;
        xe4 xe4Var = x9eVar.b;
        tei teiVar = x9eVar.d;
        Uri uri = teiVar.c;
        lfb lfbVar = new lfb(xe4Var, uri, teiVar.d, j, j2, teiVar.b);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof fd9;
        Uri uri2 = this.a;
        r5a r5aVar = x6k.f;
        tp4 tp4Var = this.m;
        if (z || z2) {
            int i3 = iOException instanceof si9 ? ((si9) iOException).c : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.h = SystemClock.elapsedRealtime();
                e(uri2);
                b10 b10Var = tp4Var.f;
                String str = nik.a;
                b10Var.x(lfbVar, i2, iOException, true);
                return r5aVar;
            }
        }
        yz1 yz1Var = new yz1(iOException, i, 7);
        Iterator it = tp4Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((id9) it.next()).d(uri2, yz1Var, false);
        }
        it7 it7Var = tp4Var.c;
        if (z3) {
            it7Var.getClass();
            long o = it7.o(yz1Var);
            r5aVar = o != C.TIME_UNSET ? new r5a(o, 0, false) : x6k.g;
        }
        boolean b = r5aVar.b();
        tp4Var.f.x(lfbVar, i2, iOException, !b);
        if (!b) {
            it7Var.getClass();
        }
        return r5aVar;
    }
}
