package z3;

import F3.C3013s;
import F3.F;
import J3.i;
import J3.j;
import J3.k;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.B;
import j3.C7272n;
import j3.v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m3.N;
import p3.C8847g;
import p3.InterfaceC8846f;
import p3.i;
import p3.o;
import p3.s;
import x3.C10652a;
import z3.C10978b;
import z3.e;
import z3.g;
import z3.i;
import z3.k;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10978b implements k, j.a<J3.k<h>> {

    /* renamed from: o, reason: collision with root package name */
    public static final Ej.b f106990o = new Ej.b();

    /* renamed from: a, reason: collision with root package name */
    private final C10652a f106991a;

    /* renamed from: b, reason: collision with root package name */
    private final j f106992b;

    /* renamed from: c, reason: collision with root package name */
    private final J3.h f106993c;

    /* renamed from: f, reason: collision with root package name */
    private F.a f106996f;

    /* renamed from: g, reason: collision with root package name */
    private J3.j f106997g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f106998h;

    /* renamed from: i, reason: collision with root package name */
    private HlsMediaSource f106999i;

    /* renamed from: j, reason: collision with root package name */
    private g f107000j;

    /* renamed from: k, reason: collision with root package name */
    private Uri f107001k;

    /* renamed from: l, reason: collision with root package name */
    private e f107002l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f107003m;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<k.a> f106995e = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<Uri, C2322b> f106994d = new HashMap<>();

    /* renamed from: n, reason: collision with root package name */
    private long f107004n = -9223372036854775807L;

    /* renamed from: z3.b$a */
    private class a implements k.a {
        a() {
        }

        @Override // z3.k.a
        public final void a() {
            C10978b.this.f106995e.remove(this);
        }

        @Override // z3.k.a
        public final boolean b(Uri uri, i.c cVar, boolean z11) {
            C2322b c2322b;
            C10978b c10978b = C10978b.this;
            if (c10978b.f107002l == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                g gVar = c10978b.f107000j;
                int i11 = N.f74289a;
                List<g.b> list = gVar.f107105e;
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    C2322b c2322b2 = (C2322b) c10978b.f106994d.get(list.get(i13).f107117a);
                    if (c2322b2 != null && elapsedRealtime < c2322b2.f107013h) {
                        i12++;
                    }
                }
                i.b c11 = ((J3.h) c10978b.f106993c).c(new i.a(c10978b.f107000j.f107105e.size(), i12), cVar);
                if (c11 != null && c11.f13794a == 2 && (c2322b = (C2322b) c10978b.f106994d.get(uri)) != null) {
                    C2322b.b(c2322b, c11.f13795b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z3.b$b, reason: collision with other inner class name */
    final class C2322b implements j.a<J3.k<h>> {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f107006a;

        /* renamed from: b, reason: collision with root package name */
        private final J3.j f107007b = new J3.j("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC8846f f107008c;

        /* renamed from: d, reason: collision with root package name */
        private e f107009d;

        /* renamed from: e, reason: collision with root package name */
        private long f107010e;

        /* renamed from: f, reason: collision with root package name */
        private long f107011f;

        /* renamed from: g, reason: collision with root package name */
        private long f107012g;

        /* renamed from: h, reason: collision with root package name */
        private long f107013h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f107014i;

        /* renamed from: j, reason: collision with root package name */
        private IOException f107015j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f107016k;

        public C2322b(Uri uri) {
            this.f107006a = uri;
            this.f107008c = ((C10652a) C10978b.this.f106991a).a();
        }

        public static /* synthetic */ void a(C2322b c2322b, Uri uri) {
            c2322b.f107014i = false;
            c2322b.m(uri);
        }

        static boolean b(C2322b c2322b, long j11) {
            c2322b.f107013h = SystemClock.elapsedRealtime() + j11;
            C10978b c10978b = C10978b.this;
            return c2322b.f107006a.equals(c10978b.f107001k) && !C10978b.i(c10978b);
        }

        private Uri h() {
            e eVar = this.f107009d;
            Uri uri = this.f107006a;
            if (eVar != null) {
                e.g gVar = eVar.f107040v;
                if (gVar.f107098a != -9223372036854775807L || gVar.f107102e) {
                    Uri.Builder buildUpon = uri.buildUpon();
                    e eVar2 = this.f107009d;
                    if (eVar2.f107040v.f107102e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar2.f107029k + eVar2.f107036r.size()));
                        e eVar3 = this.f107009d;
                        if (eVar3.f107032n != -9223372036854775807L) {
                            AbstractC5880y abstractC5880y = eVar3.f107037s;
                            int size = abstractC5880y.size();
                            if (!abstractC5880y.isEmpty() && ((e.c) B.b(abstractC5880y)).f107081m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    e.g gVar2 = this.f107009d.f107040v;
                    if (gVar2.f107098a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", gVar2.f107099b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return uri;
        }

        private void m(Uri uri) {
            C10978b c10978b = C10978b.this;
            k.a<h> a11 = c10978b.f106992b.a(c10978b.f107000j, this.f107009d);
            i.a aVar = new i.a();
            aVar.i(uri);
            aVar.b(1);
            J3.k kVar = new J3.k(this.f107008c, aVar.a(), a11);
            this.f107007b.l(kVar, this, ((J3.h) c10978b.f106993c).b(kVar.f13819c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(final Uri uri) {
            this.f107013h = 0L;
            if (this.f107014i) {
                return;
            }
            J3.j jVar = this.f107007b;
            if (jVar.i() || jVar.h()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f107012g) {
                m(uri);
            } else {
                this.f107014i = true;
                C10978b.this.f106998h.postDelayed(new Runnable() { // from class: z3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10978b.C2322b.a(C10978b.C2322b.this, uri);
                    }
                }, this.f107012g - elapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(e eVar, C3013s c3013s) {
            boolean z11;
            e eVar2 = this.f107009d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f107010e = elapsedRealtime;
            C10978b c10978b = C10978b.this;
            e f7 = C10978b.f(c10978b, eVar2, eVar);
            this.f107009d = f7;
            IOException iOException = null;
            Uri uri = this.f107006a;
            if (f7 != eVar2) {
                this.f107015j = null;
                this.f107011f = elapsedRealtime;
                C10978b.g(c10978b, uri, f7);
            } else if (!f7.f107033o) {
                if (eVar.f107029k + eVar.f107036r.size() < this.f107009d.f107029k) {
                    iOException = new k.b();
                    z11 = true;
                } else {
                    z11 = false;
                    if (elapsedRealtime - this.f107011f > N.g0(r1.f107031m) * 3.5d) {
                        iOException = new k.c();
                    }
                }
                if (iOException != null) {
                    this.f107015j = iOException;
                    C10978b.a(c10978b, uri, new i.c(1, iOException), z11);
                }
            }
            e eVar3 = this.f107009d;
            boolean z12 = eVar3.f107040v.f107102e;
            long j11 = eVar3.f107031m;
            if (z12) {
                if (eVar3 == eVar2) {
                    long j12 = eVar3.f107032n;
                    j11 = j12 != -9223372036854775807L ? j12 / 2 : j11 / 2;
                } else {
                    j11 = 0;
                }
            } else if (eVar3 == eVar2) {
                j11 /= 2;
            }
            this.f107012g = (N.g0(j11) + elapsedRealtime) - c3013s.f8723c;
            if (this.f107009d.f107033o) {
                return;
            }
            if (uri.equals(c10978b.f107001k) || this.f107016k) {
                n(h());
            }
        }

        public final e i() {
            return this.f107009d;
        }

        public final boolean j() {
            return this.f107016k;
        }

        public final boolean k() {
            int i11;
            if (this.f107009d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, N.g0(this.f107009d.f107039u));
            e eVar = this.f107009d;
            return eVar.f107033o || (i11 = eVar.f107022d) == 2 || i11 == 1 || this.f107010e + max > elapsedRealtime;
        }

        public final void l(boolean z11) {
            n(z11 ? h() : this.f107006a);
        }

        public final void o() throws IOException {
            this.f107007b.j(LinearLayoutManager.INVALID_OFFSET);
            IOException iOException = this.f107015j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // J3.j.a
        public final void onLoadCanceled(J3.k<h> kVar, long j11, long j12, boolean z11) {
            J3.k<h> kVar2 = kVar;
            long j13 = kVar2.f13817a;
            kVar2.d();
            Map<String, List<String>> b11 = kVar2.b();
            kVar2.a();
            C3013s c3013s = new C3013s(kVar2.f13818b, b11, j12);
            C10978b c10978b = C10978b.this;
            c10978b.f106993c.getClass();
            c10978b.f106996f.d(c3013s, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        @Override // J3.j.a
        public final void onLoadCompleted(J3.k<h> kVar, long j11, long j12) {
            C10978b c10978b;
            J3.k<h> kVar2 = kVar;
            h c11 = kVar2.c();
            kVar2.d();
            Map<String, List<String>> b11 = kVar2.b();
            kVar2.a();
            C3013s c3013s = new C3013s(kVar2.f13818b, b11, j12);
            boolean z11 = c11 instanceof e;
            C10978b c10978b2 = C10978b.this;
            if (z11) {
                p((e) c11, c3013s);
                c10978b2.f106996f.e(c3013s, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                c10978b = c10978b2;
            } else {
                this.f107015j = v.d("Loaded playlist has unexpected type.");
                c10978b = c10978b2;
                c10978b2.f106996f.f(c3013s, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, this.f107015j, true);
            }
            c10978b.f106993c.getClass();
        }

        @Override // J3.j.a
        public final j.b onLoadError(J3.k<h> kVar, long j11, long j12, IOException iOException, int i11) {
            J3.k<h> kVar2 = kVar;
            long j13 = kVar2.f13817a;
            kVar2.d();
            Map<String, List<String>> b11 = kVar2.b();
            kVar2.a();
            C3013s c3013s = new C3013s(kVar2.f13818b, b11, j12);
            boolean z11 = kVar2.d().getQueryParameter("_HLS_msn") != null;
            boolean z12 = iOException instanceof i.a;
            j.b bVar = J3.j.f13799e;
            C10978b c10978b = C10978b.this;
            int i12 = kVar2.f13819c;
            if (z11 || z12) {
                int i13 = iOException instanceof s ? ((s) iOException).f80119d : Integer.MAX_VALUE;
                if (z12 || i13 == 400 || i13 == 503) {
                    this.f107012g = SystemClock.elapsedRealtime();
                    l(false);
                    F.a aVar = c10978b.f106996f;
                    int i14 = N.f74289a;
                    aVar.f(c3013s, i12, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                    return bVar;
                }
            }
            i.c cVar = new i.c(i11, iOException);
            if (C10978b.a(c10978b, this.f107006a, cVar, false)) {
                long a11 = ((J3.h) c10978b.f106993c).a(cVar);
                bVar = a11 != -9223372036854775807L ? J3.j.g(a11, false) : J3.j.f13800f;
            }
            boolean c11 = bVar.c();
            c10978b.f106996f.f(c3013s, i12, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !c11);
            if (!c11) {
                c10978b.f106993c.getClass();
            }
            return bVar;
        }

        @Override // J3.j.a
        public final void onLoadStarted(J3.k<h> kVar, long j11, long j12, int i11) {
            C3013s c3013s;
            J3.k<h> kVar2 = kVar;
            if (i11 == 0) {
                long j13 = kVar2.f13817a;
                c3013s = new C3013s(kVar2.f13818b);
            } else {
                long j14 = kVar2.f13817a;
                kVar2.d();
                Map<String, List<String>> b11 = kVar2.b();
                kVar2.a();
                c3013s = new C3013s(kVar2.f13818b, b11, j12);
            }
            C10978b.this.f106996f.g(c3013s, kVar2.f13819c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
        }

        public final void q() {
            this.f107007b.k(null);
        }

        public final void r(boolean z11) {
            this.f107016k = z11;
        }
    }

    public C10978b(C10652a c10652a, J3.h hVar, j jVar) {
        this.f106991a = c10652a;
        this.f106992b = jVar;
        this.f106993c = hVar;
    }

    static boolean a(C10978b c10978b, Uri uri, i.c cVar, boolean z11) {
        Iterator<k.a> it = c10978b.f106995e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !it.next().b(uri, cVar, z11);
        }
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static e f(C10978b c10978b, e eVar, e eVar2) {
        long j11;
        long j12;
        int i11;
        int size;
        int size2;
        int size3;
        c10978b.getClass();
        if (eVar != null) {
            long j13 = eVar2.f107029k;
            long j14 = eVar.f107029k;
            if (j13 <= j14) {
                boolean z11 = eVar.f107033o;
                boolean z12 = eVar2.f107033o;
                if (j13 < j14 || ((size = eVar2.f107036r.size() - eVar.f107036r.size()) == 0 ? !((size2 = eVar2.f107037s.size()) > (size3 = eVar.f107037s.size()) || (size2 == size3 && z12 && !z11)) : size <= 0)) {
                    return (!z12 || z11) ? eVar : new e(eVar.f107022d, eVar.f107123a, eVar.f107124b, eVar.f107023e, eVar.f107025g, eVar.f107026h, eVar.f107027i, eVar.f107028j, eVar.f107029k, eVar.f107030l, eVar.f107031m, eVar.f107032n, eVar.f107125c, true, eVar.f107034p, eVar.f107035q, eVar.f107036r, eVar.f107037s, eVar.f107040v, eVar.f107038t, eVar.f107041w);
                }
            }
        } else {
            eVar2.getClass();
        }
        boolean z13 = eVar2.f107034p;
        long j15 = eVar2.f107029k;
        if (z13) {
            j11 = eVar2.f107026h;
        } else {
            e eVar3 = c10978b.f107002l;
            j11 = eVar3 != null ? eVar3.f107026h : 0L;
            if (eVar != null) {
                AbstractC5880y abstractC5880y = eVar.f107036r;
                int size4 = abstractC5880y.size();
                long j16 = eVar.f107029k;
                int i12 = (int) (j15 - j16);
                e.C2323e c2323e = i12 < abstractC5880y.size() ? (e.C2323e) abstractC5880y.get(i12) : null;
                long j17 = eVar.f107026h;
                if (c2323e != null) {
                    j12 = c2323e.f107091e;
                } else if (size4 == j15 - j16) {
                    j12 = eVar.f107039u;
                }
                j11 = j12 + j17;
            }
        }
        long j18 = j11;
        boolean z14 = eVar2.f107027i;
        AbstractC5880y abstractC5880y2 = eVar2.f107036r;
        if (z14) {
            i11 = eVar2.f107028j;
        } else {
            e eVar4 = c10978b.f107002l;
            i11 = eVar4 != null ? eVar4.f107028j : 0;
            if (eVar != null) {
                int i13 = (int) (j15 - eVar.f107029k);
                AbstractC5880y abstractC5880y3 = eVar.f107036r;
                e.C2323e c2323e2 = i13 < abstractC5880y3.size() ? (e.C2323e) abstractC5880y3.get(i13) : null;
                if (c2323e2 != null) {
                    i11 = (eVar.f107028j + c2323e2.f107090d) - ((e.C2323e) abstractC5880y2.get(0)).f107090d;
                }
            }
        }
        return new e(eVar2.f107022d, eVar2.f107123a, eVar2.f107124b, eVar2.f107023e, eVar2.f107025g, j18, true, i11, eVar2.f107029k, eVar2.f107030l, eVar2.f107031m, eVar2.f107032n, eVar2.f107125c, eVar2.f107033o, eVar2.f107034p, eVar2.f107035q, abstractC5880y2, eVar2.f107037s, eVar2.f107040v, eVar2.f107038t, eVar2.f107041w);
    }

    static void g(C10978b c10978b, Uri uri, e eVar) {
        if (uri.equals(c10978b.f107001k)) {
            if (c10978b.f107002l == null) {
                c10978b.f107003m = !eVar.f107033o;
                c10978b.f107004n = eVar.f107026h;
            }
            c10978b.f107002l = eVar;
            c10978b.f106999i.d(eVar);
        }
        Iterator<k.a> it = c10978b.f106995e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    static boolean i(C10978b c10978b) {
        List<g.b> list = c10978b.f107000j.f107105e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i11 = 0; i11 < size; i11++) {
            C2322b c2322b = c10978b.f106994d.get(list.get(i11).f107117a);
            c2322b.getClass();
            if (elapsedRealtime > c2322b.f107013h) {
                Uri uri = c2322b.f107006a;
                c10978b.f107001k = uri;
                c2322b.n(c10978b.u(uri));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Uri u(Uri uri) {
        e.d dVar;
        e eVar = this.f107002l;
        if (eVar == null || !eVar.f107040v.f107102e || (dVar = (e.d) eVar.f107038t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar.f107083b));
        int i11 = dVar.f107084c;
        if (i11 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i11));
        }
        return buildUpon.build();
    }

    public final void A(k.a aVar) {
        this.f106995e.remove(aVar);
    }

    public final void B(Uri uri, F.a aVar, HlsMediaSource hlsMediaSource) {
        this.f106998h = N.p(null);
        this.f106996f = aVar;
        this.f106999i = hlsMediaSource;
        i.a aVar2 = new i.a();
        aVar2.i(uri);
        aVar2.b(1);
        J3.k kVar = new J3.k(this.f106991a.a(), aVar2.a(), this.f106992b.b());
        G10.a.h(this.f106997g == null);
        J3.j jVar = new J3.j("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f106997g = jVar;
        jVar.l(kVar, this, this.f106993c.b(kVar.f13819c));
    }

    public final void C() {
        this.f107001k = null;
        this.f107002l = null;
        this.f107000j = null;
        this.f107004n = -9223372036854775807L;
        this.f106997g.k(null);
        this.f106997g = null;
        HashMap<Uri, C2322b> hashMap = this.f106994d;
        Iterator<C2322b> it = hashMap.values().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
        this.f106998h.removeCallbacksAndMessages(null);
        this.f106998h = null;
        hashMap.clear();
    }

    public final void o(k.a aVar) {
        this.f106995e.add(aVar);
    }

    @Override // J3.j.a
    public final void onLoadCanceled(J3.k<h> kVar, long j11, long j12, boolean z11) {
        J3.k<h> kVar2 = kVar;
        long j13 = kVar2.f13817a;
        kVar2.d();
        Map<String, List<String>> b11 = kVar2.b();
        kVar2.a();
        C3013s c3013s = new C3013s(kVar2.f13818b, b11, j12);
        this.f106993c.getClass();
        this.f106996f.d(c3013s, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // J3.j.a
    public final void onLoadCompleted(J3.k<h> kVar, long j11, long j12) {
        g gVar;
        HashMap<Uri, C2322b> hashMap;
        J3.k<h> kVar2 = kVar;
        h c11 = kVar2.c();
        boolean z11 = c11 instanceof e;
        if (z11) {
            String str = c11.f107123a;
            g gVar2 = g.f107103n;
            Uri parse = Uri.parse(str);
            C7272n.a aVar = new C7272n.a();
            aVar.j0("0");
            aVar.W("application/x-mpegURL");
            List singletonList = Collections.singletonList(new g.b(parse, aVar.P(), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            gVar = new g("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            gVar = (g) c11;
        }
        this.f107000j = gVar;
        this.f107001k = gVar.f107105e.get(0).f107117a;
        this.f106995e.add(new a());
        List<Uri> list2 = gVar.f107104d;
        int size = list2.size();
        int i11 = 0;
        while (true) {
            hashMap = this.f106994d;
            if (i11 >= size) {
                break;
            }
            Uri uri = list2.get(i11);
            hashMap.put(uri, new C2322b(uri));
            i11++;
        }
        kVar2.d();
        Map<String, List<String>> b11 = kVar2.b();
        kVar2.a();
        C3013s c3013s = new C3013s(kVar2.f13818b, b11, j12);
        C2322b c2322b = hashMap.get(this.f107001k);
        if (z11) {
            c2322b.p((e) c11, c3013s);
        } else {
            c2322b.l(false);
        }
        this.f106993c.getClass();
        this.f106996f.e(c3013s, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    @Override // J3.j.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j.b onLoadError(J3.k<h> kVar, long j11, long j12, IOException iOException, int i11) {
        long j13;
        J3.k<h> kVar2 = kVar;
        long j14 = kVar2.f13817a;
        kVar2.d();
        Map<String, List<String>> b11 = kVar2.b();
        kVar2.a();
        C3013s c3013s = new C3013s(kVar2.f13818b, b11, j12);
        this.f106993c.getClass();
        if (!(iOException instanceof v) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof o) && !(iOException instanceof j.g)) {
            int i12 = C8847g.f80059b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof C8847g) || ((C8847g) th2).f80060a != 2008) {
                }
            }
            j13 = Math.min((i11 - 1) * 1000, 5000);
            boolean z11 = j13 != -9223372036854775807L;
            this.f106996f.f(c3013s, kVar2.f13819c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z11);
            return !z11 ? J3.j.f13800f : J3.j.g(j13, false);
        }
        j13 = -9223372036854775807L;
        if (j13 != -9223372036854775807L) {
        }
        this.f106996f.f(c3013s, kVar2.f13819c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z11);
        if (!z11) {
        }
    }

    @Override // J3.j.a
    public final void onLoadStarted(J3.k<h> kVar, long j11, long j12, int i11) {
        C3013s c3013s;
        J3.k<h> kVar2 = kVar;
        if (i11 == 0) {
            long j13 = kVar2.f13817a;
            c3013s = new C3013s(kVar2.f13818b);
        } else {
            long j14 = kVar2.f13817a;
            kVar2.d();
            Map<String, List<String>> b11 = kVar2.b();
            kVar2.a();
            c3013s = new C3013s(kVar2.f13818b, b11, j12);
        }
        this.f106996f.g(c3013s, kVar2.f13819c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
    }

    public final void p(Uri uri) {
        C2322b c2322b = this.f106994d.get(uri);
        if (c2322b != null) {
            c2322b.r(false);
        }
    }

    public final boolean q(Uri uri, long j11) {
        if (this.f106994d.get(uri) != null) {
            return !C2322b.b(r2, j11);
        }
        return false;
    }

    public final long r() {
        return this.f107004n;
    }

    public final g s() {
        return this.f107000j;
    }

    public final e t(Uri uri, boolean z11) {
        HashMap<Uri, C2322b> hashMap = this.f106994d;
        e i11 = hashMap.get(uri).i();
        if (i11 != null && z11) {
            if (!uri.equals(this.f107001k)) {
                List<g.b> list = this.f107000j.f107105e;
                int i12 = 0;
                while (true) {
                    if (i12 >= list.size()) {
                        break;
                    }
                    if (uri.equals(list.get(i12).f107117a)) {
                        e eVar = this.f107002l;
                        if (eVar == null || !eVar.f107033o) {
                            this.f107001k = uri;
                            C2322b c2322b = hashMap.get(uri);
                            e eVar2 = c2322b.f107009d;
                            if (eVar2 == null || !eVar2.f107033o) {
                                c2322b.n(u(uri));
                            } else {
                                this.f107002l = eVar2;
                                this.f106999i.d(eVar2);
                            }
                        }
                    } else {
                        i12++;
                    }
                }
            }
            C2322b c2322b2 = hashMap.get(uri);
            e i13 = c2322b2.i();
            if (!c2322b2.j()) {
                c2322b2.r(true);
                if (i13 != null && !i13.f107033o) {
                    c2322b2.l(true);
                }
            }
        }
        return i11;
    }

    public final boolean v() {
        return this.f107003m;
    }

    public final boolean w(Uri uri) {
        return this.f106994d.get(uri).k();
    }

    public final void x(Uri uri) throws IOException {
        this.f106994d.get(uri).o();
    }

    public final void y() throws IOException {
        J3.j jVar = this.f106997g;
        if (jVar != null) {
            jVar.j(LinearLayoutManager.INVALID_OFFSET);
        }
        Uri uri = this.f107001k;
        if (uri != null) {
            x(uri);
        }
    }

    public final void z(Uri uri) {
        this.f106994d.get(uri).l(true);
    }
}
