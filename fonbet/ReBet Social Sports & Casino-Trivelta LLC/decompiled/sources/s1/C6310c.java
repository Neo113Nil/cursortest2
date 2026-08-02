package s1;

import D1.f;
import D1.k;
import D1.m;
import D1.o;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C2223y;
import androidx.media3.exoplayer.source.L;
import b1.C2338G;
import com.google.common.collect.I;
import e1.AbstractC4134a;
import e1.Z;
import h1.C4418n;
import h1.C4428x;
import h1.InterfaceC4411g;
import i3.C4527h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import s1.C6310c;
import s1.f;
import s1.i;
import s1.k;
import s1.m;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6310c implements m, m.b {

    /* renamed from: q, reason: collision with root package name */
    public static final m.a f64430q = new m.a() { // from class: s1.b
        @Override // s1.m.a
        public final m a(r1.g gVar, D1.k kVar, l lVar, D1.e eVar) {
            return new C6310c(gVar, kVar, lVar, eVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final r1.g f64431a;

    /* renamed from: b, reason: collision with root package name */
    public final l f64432b;

    /* renamed from: c, reason: collision with root package name */
    public final D1.k f64433c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f64434d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f64435e;

    /* renamed from: f, reason: collision with root package name */
    public final double f64436f;

    /* renamed from: g, reason: collision with root package name */
    public final D1.e f64437g;

    /* renamed from: h, reason: collision with root package name */
    public L.a f64438h;

    /* renamed from: i, reason: collision with root package name */
    public D1.m f64439i;

    /* renamed from: j, reason: collision with root package name */
    public Handler f64440j;

    /* renamed from: k, reason: collision with root package name */
    public m.e f64441k;

    /* renamed from: l, reason: collision with root package name */
    public i f64442l;

    /* renamed from: m, reason: collision with root package name */
    public Uri f64443m;

    /* renamed from: n, reason: collision with root package name */
    public f f64444n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f64445o;

    /* renamed from: p, reason: collision with root package name */
    public long f64446p;

    /* renamed from: s1.c$b */
    public class b implements m.b {
        public b() {
        }

        @Override // s1.m.b
        public boolean a(Uri uri, k.c cVar, boolean z10) {
            C0895c c0895c;
            if (C6310c.this.f64444n == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((i) Z.i(C6310c.this.f64442l)).f64547e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0895c c0895c2 = (C0895c) C6310c.this.f64434d.get(((i.b) list.get(i11)).f64560a);
                    if (c0895c2 != null && elapsedRealtime < c0895c2.f64455h) {
                        i10++;
                    }
                }
                k.b a10 = C6310c.this.f64433c.a(new k.a(1, 0, C6310c.this.f64442l.f64547e.size(), i10), cVar);
                if (a10 != null && a10.f2448a == 2 && (c0895c = (C0895c) C6310c.this.f64434d.get(uri)) != null) {
                    c0895c.h(a10.f2449b);
                }
            }
            return false;
        }

        @Override // s1.m.b
        public void c() {
            C6310c.this.f64435e.remove(this);
        }
    }

    /* renamed from: s1.c$c, reason: collision with other inner class name */
    public final class C0895c implements m.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f64448a;

        /* renamed from: b, reason: collision with root package name */
        public final D1.m f64449b = new D1.m("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC4411g f64450c;

        /* renamed from: d, reason: collision with root package name */
        public f f64451d;

        /* renamed from: e, reason: collision with root package name */
        public long f64452e;

        /* renamed from: f, reason: collision with root package name */
        public long f64453f;

        /* renamed from: g, reason: collision with root package name */
        public long f64454g;

        /* renamed from: h, reason: collision with root package name */
        public long f64455h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f64456i;

        /* renamed from: j, reason: collision with root package name */
        public IOException f64457j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f64458k;

        public C0895c(Uri uri) {
            this.f64448a = uri;
            this.f64450c = C6310c.this.f64431a.a(4);
        }

        public static /* synthetic */ void a(C0895c c0895c, Uri uri) {
            c0895c.f64456i = false;
            c0895c.r(uri);
        }

        public void A(boolean z10) {
            this.f64458k = z10;
        }

        public final boolean h(long j10) {
            this.f64455h = SystemClock.elapsedRealtime() + j10;
            return this.f64448a.equals(C6310c.this.f64443m) && !C6310c.this.P();
        }

        public final Uri k() {
            f fVar = this.f64451d;
            if (fVar != null) {
                f.h hVar = fVar.f64482v;
                if (hVar.f64540a != -9223372036854775807L || hVar.f64544e) {
                    Uri.Builder buildUpon = this.f64448a.buildUpon();
                    f fVar2 = this.f64451d;
                    if (fVar2.f64482v.f64544e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.f64471k + fVar2.f64478r.size()));
                        f fVar3 = this.f64451d;
                        if (fVar3.f64474n != -9223372036854775807L) {
                            List list = fVar3.f64479s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.d) I.f(list)).f64523m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.h hVar2 = this.f64451d.f64482v;
                    if (hVar2.f64540a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", hVar2.f64541b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f64448a;
        }

        public f m() {
            return this.f64451d;
        }

        public boolean n() {
            return this.f64458k;
        }

        public boolean p() {
            int i10;
            if (this.f64451d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, Z.J1(this.f64451d.f64481u));
            f fVar = this.f64451d;
            return fVar.f64475o || (i10 = fVar.f64464d) == 2 || i10 == 1 || this.f64452e + max > elapsedRealtime;
        }

        public void q(boolean z10) {
            s(z10 ? k() : this.f64448a);
        }

        public final void r(Uri uri) {
            o.a a10 = C6310c.this.f64432b.a(C6310c.this.f64442l, this.f64451d);
            C4418n a11 = new C4418n.b().i(uri).b(1).a();
            if (C6310c.this.f64437g != null) {
                f.C0047f l10 = new f.C0047f(C6310c.this.f64437g, C4527h.f48087o).l(X9.m.f13664a);
                if (C6310c.this.f64444n != null) {
                    l10.i(true ^ C6310c.this.f64444n.f64475o);
                }
                a11 = l10.a().a(a11);
            }
            o oVar = new o(this.f64450c, a11, 4, a10);
            this.f64449b.n(oVar, this, C6310c.this.f64433c.c(oVar.f2476c));
        }

        public final void s(final Uri uri) {
            this.f64455h = 0L;
            if (this.f64456i || this.f64449b.j() || this.f64449b.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f64454g) {
                r(uri);
            } else {
                this.f64456i = true;
                C6310c.this.f64440j.postDelayed(new Runnable() { // from class: s1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6310c.C0895c.a(C6310c.C0895c.this, uri);
                    }
                }, this.f64454g - elapsedRealtime);
            }
        }

        public void t() {
            this.f64449b.a();
            IOException iOException = this.f64457j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // D1.m.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void l(o oVar, long j10, long j11, boolean z10) {
            C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
            C6310c.this.f64433c.d(oVar.f2474a);
            C6310c.this.f64438h.l(c2223y, 4);
        }

        @Override // D1.m.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void i(o oVar, long j10, long j11) {
            j jVar = (j) oVar.e();
            C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
            if (jVar instanceof f) {
                y((f) jVar, c2223y);
                C6310c.this.f64438h.o(c2223y, 4);
            } else {
                this.f64457j = C2338G.c("Loaded playlist has unexpected type.", null);
                C6310c.this.f64438h.s(c2223y, 4, this.f64457j, true);
            }
            C6310c.this.f64433c.d(oVar.f2474a);
        }

        @Override // D1.m.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
            m.c cVar;
            C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
            boolean z10 = iOException instanceof k.a;
            if ((oVar.f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof C4428x ? ((C4428x) iOException).f47621d : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f64454g = SystemClock.elapsedRealtime();
                    q(false);
                    ((L.a) Z.i(C6310c.this.f64438h)).s(c2223y, oVar.f2476c, iOException, true);
                    return D1.m.f2456f;
                }
            }
            k.c cVar2 = new k.c(c2223y, new B(oVar.f2476c), iOException, i10);
            if (C6310c.this.R(this.f64448a, cVar2, false)) {
                long b10 = C6310c.this.f64433c.b(cVar2);
                cVar = b10 != -9223372036854775807L ? D1.m.h(false, b10) : D1.m.f2457g;
            } else {
                cVar = D1.m.f2456f;
            }
            boolean c10 = cVar.c();
            C6310c.this.f64438h.s(c2223y, oVar.f2476c, iOException, !c10);
            if (!c10) {
                C6310c.this.f64433c.d(oVar.f2474a);
            }
            return cVar;
        }

        @Override // D1.m.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, long j10, long j11, int i10) {
            C6310c.this.f64438h.u(i10 == 0 ? new C2223y(oVar.f2474a, oVar.f2475b, j10) : new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f2476c, i10);
        }

        public final void y(f fVar, C2223y c2223y) {
            boolean z10;
            long j10;
            f fVar2 = this.f64451d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f64452e = elapsedRealtime;
            f J10 = C6310c.this.J(fVar2, fVar);
            this.f64451d = J10;
            IOException iOException = null;
            if (J10 != fVar2) {
                this.f64457j = null;
                this.f64453f = elapsedRealtime;
                C6310c.this.W(this.f64448a, J10);
            } else if (!J10.f64475o) {
                if (fVar.f64471k + fVar.f64478r.size() < this.f64451d.f64471k) {
                    iOException = new m.c(this.f64448a);
                    z10 = true;
                } else {
                    z10 = false;
                    if (elapsedRealtime - this.f64453f > Z.J1(r13.f64473m) * C6310c.this.f64436f) {
                        iOException = new m.d(this.f64448a);
                    }
                }
                if (iOException != null) {
                    this.f64457j = iOException;
                    C6310c.this.R(this.f64448a, new k.c(c2223y, new B(4), iOException, 1), z10);
                }
            }
            f fVar3 = this.f64451d;
            if (!fVar3.f64482v.f64544e) {
                j10 = fVar3 != fVar2 ? fVar3.f64473m : fVar3.f64473m / 2;
            } else if (fVar3 == fVar2) {
                long j11 = fVar3.f64474n;
                j10 = j11 != -9223372036854775807L ? j11 / 2 : fVar3.f64473m / 2;
            } else {
                j10 = 0;
            }
            this.f64454g = (elapsedRealtime + Z.J1(j10)) - c2223y.f21893f;
            if (this.f64451d.f64475o) {
                return;
            }
            if (this.f64448a.equals(C6310c.this.f64443m) || this.f64458k) {
                s(k());
            }
        }

        public void z() {
            this.f64449b.l();
        }
    }

    public C6310c(r1.g gVar, D1.k kVar, l lVar, D1.e eVar) {
        this(gVar, kVar, lVar, eVar, 3.5d);
    }

    public static f.C0896f I(f fVar, f fVar2) {
        int i10 = (int) (fVar2.f64471k - fVar.f64471k);
        List list = fVar.f64478r;
        if (i10 < list.size()) {
            return (f.C0896f) list.get(i10);
        }
        return null;
    }

    public final void H(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list.get(i10);
            this.f64434d.put(uri, new C0895c(uri));
        }
    }

    public final f J(f fVar, f fVar2) {
        return !fVar2.f(fVar) ? fVar2.f64475o ? fVar.d() : fVar : fVar2.c(L(fVar, fVar2), K(fVar, fVar2));
    }

    public final int K(f fVar, f fVar2) {
        f.C0896f I10;
        if (fVar2.f64469i) {
            return fVar2.f64470j;
        }
        f fVar3 = this.f64444n;
        return (fVar == null || (I10 = I(fVar, fVar2)) == null) ? fVar3 != null ? fVar3.f64470j : 0 : (fVar.f64470j + I10.f64532d) - ((f.C0896f) fVar2.f64478r.get(0)).f64532d;
    }

    public final long L(f fVar, f fVar2) {
        if (fVar2.f64476p) {
            return fVar2.f64468h;
        }
        f fVar3 = this.f64444n;
        long j10 = fVar3 != null ? fVar3.f64468h : 0L;
        if (fVar != null) {
            int size = fVar.f64478r.size();
            f.C0896f I10 = I(fVar, fVar2);
            if (I10 != null) {
                return fVar.f64468h + I10.f64533e;
            }
            if (size == fVar2.f64471k - fVar.f64471k) {
                return fVar.e();
            }
        }
        return j10;
    }

    public final Uri M(Uri uri) {
        f.e eVar;
        f fVar = this.f64444n;
        if (fVar == null || !fVar.f64482v.f64544e || (eVar = (f.e) fVar.f64480t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f64525b));
        int i10 = eVar.f64526c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    public final boolean N(Uri uri) {
        List list = this.f64442l.f64547e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(((i.b) list.get(i10)).f64560a)) {
                return true;
            }
        }
        return false;
    }

    public final void O(Uri uri) {
        C0895c c0895c = (C0895c) this.f64434d.get(uri);
        f m10 = c0895c.m();
        if (c0895c.n()) {
            return;
        }
        c0895c.A(true);
        if (m10 == null || m10.f64475o) {
            return;
        }
        c0895c.q(true);
    }

    public final boolean P() {
        List list = this.f64442l.f64547e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0895c c0895c = (C0895c) AbstractC4134a.e((C0895c) this.f64434d.get(((i.b) list.get(i10)).f64560a));
            if (elapsedRealtime > c0895c.f64455h) {
                Uri uri = c0895c.f64448a;
                this.f64443m = uri;
                c0895c.s(M(uri));
                return true;
            }
        }
        return false;
    }

    public final void Q(Uri uri) {
        if (uri.equals(this.f64443m) || !N(uri)) {
            return;
        }
        f fVar = this.f64444n;
        if (fVar == null || !fVar.f64475o) {
            this.f64443m = uri;
            C0895c c0895c = (C0895c) this.f64434d.get(uri);
            f fVar2 = c0895c.f64451d;
            if (fVar2 == null || !fVar2.f64475o) {
                c0895c.s(M(uri));
            } else {
                this.f64444n = fVar2;
                this.f64441k.h(fVar2);
            }
        }
    }

    public final boolean R(Uri uri, k.c cVar, boolean z10) {
        Iterator it = this.f64435e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((m.b) it.next()).a(uri, cVar, z10);
        }
        return z11;
    }

    @Override // D1.m.b
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void l(o oVar, long j10, long j11, boolean z10) {
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f64433c.d(oVar.f2474a);
        this.f64438h.l(c2223y, 4);
    }

    @Override // D1.m.b
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void i(o oVar, long j10, long j11) {
        j jVar = (j) oVar.e();
        boolean z10 = jVar instanceof f;
        i e10 = z10 ? i.e(jVar.f64566a) : (i) jVar;
        this.f64442l = e10;
        this.f64443m = ((i.b) e10.f64547e.get(0)).f64560a;
        this.f64435e.add(new b());
        H(e10.f64546d);
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        C0895c c0895c = (C0895c) this.f64434d.get(this.f64443m);
        if (z10) {
            c0895c.y((f) jVar, c2223y);
        } else {
            c0895c.q(false);
        }
        this.f64433c.d(oVar.f2474a);
        this.f64438h.o(c2223y, 4);
    }

    @Override // D1.m.b
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        long b10 = this.f64433c.b(new k.c(c2223y, new B(oVar.f2476c), iOException, i10));
        boolean z10 = b10 == -9223372036854775807L;
        this.f64438h.s(c2223y, oVar.f2476c, iOException, z10);
        if (z10) {
            this.f64433c.d(oVar.f2474a);
        }
        return z10 ? D1.m.f2457g : D1.m.h(false, b10);
    }

    @Override // D1.m.b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void j(o oVar, long j10, long j11, int i10) {
        this.f64438h.u(i10 == 0 ? new C2223y(oVar.f2474a, oVar.f2475b, j10) : new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f2476c, i10);
    }

    public final void W(Uri uri, f fVar) {
        if (uri.equals(this.f64443m)) {
            if (this.f64444n == null) {
                this.f64445o = !fVar.f64475o;
                this.f64446p = fVar.f64468h;
            }
            this.f64444n = fVar;
            this.f64441k.h(fVar);
        }
        Iterator it = this.f64435e.iterator();
        while (it.hasNext()) {
            ((m.b) it.next()).c();
        }
    }

    @Override // s1.m
    public void a(Uri uri) {
        C0895c c0895c = (C0895c) this.f64434d.get(uri);
        if (c0895c != null) {
            c0895c.A(false);
        }
    }

    @Override // s1.m
    public void b(m.b bVar) {
        this.f64435e.remove(bVar);
    }

    @Override // s1.m
    public void c(Uri uri) {
        ((C0895c) this.f64434d.get(uri)).t();
    }

    @Override // s1.m
    public long d() {
        return this.f64446p;
    }

    @Override // s1.m
    public i e() {
        return this.f64442l;
    }

    @Override // s1.m
    public void f(Uri uri) {
        ((C0895c) this.f64434d.get(uri)).q(true);
    }

    @Override // s1.m
    public boolean g(Uri uri) {
        return ((C0895c) this.f64434d.get(uri)).p();
    }

    @Override // s1.m
    public void h(Uri uri, L.a aVar, m.e eVar) {
        this.f64440j = Z.z();
        this.f64438h = aVar;
        this.f64441k = eVar;
        C4418n a10 = new C4418n.b().i(uri).b(1).a();
        if (this.f64437g != null) {
            a10 = new f.C0047f(this.f64437g, C4527h.f48087o).l(X9.m.f13664a).a().a(a10);
        }
        o oVar = new o(this.f64431a.a(4), a10, 4, this.f64432b.b());
        AbstractC4134a.g(this.f64439i == null);
        D1.m mVar = new D1.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f64439i = mVar;
        mVar.n(oVar, this, this.f64433c.c(oVar.f2476c));
    }

    @Override // s1.m
    public void k(m.b bVar) {
        AbstractC4134a.e(bVar);
        this.f64435e.add(bVar);
    }

    @Override // s1.m
    public boolean m() {
        return this.f64445o;
    }

    @Override // s1.m
    public boolean n(Uri uri, long j10) {
        if (((C0895c) this.f64434d.get(uri)) != null) {
            return !r2.h(j10);
        }
        return false;
    }

    @Override // s1.m
    public void p() {
        D1.m mVar = this.f64439i;
        if (mVar != null) {
            mVar.a();
        }
        Uri uri = this.f64443m;
        if (uri != null) {
            c(uri);
        }
    }

    @Override // s1.m
    public f q(Uri uri, boolean z10) {
        f m10 = ((C0895c) this.f64434d.get(uri)).m();
        if (m10 != null && z10) {
            Q(uri);
            O(uri);
        }
        return m10;
    }

    @Override // s1.m
    public void stop() {
        this.f64443m = null;
        this.f64444n = null;
        this.f64442l = null;
        this.f64446p = -9223372036854775807L;
        this.f64439i.l();
        this.f64439i = null;
        Iterator it = this.f64434d.values().iterator();
        while (it.hasNext()) {
            ((C0895c) it.next()).z();
        }
        this.f64440j.removeCallbacksAndMessages(null);
        this.f64440j = null;
        this.f64434d.clear();
    }

    public C6310c(r1.g gVar, D1.k kVar, l lVar, D1.e eVar, double d10) {
        this.f64431a = gVar;
        this.f64432b = lVar;
        this.f64433c = kVar;
        this.f64437g = eVar;
        this.f64436f = d10;
        this.f64435e = new CopyOnWriteArrayList();
        this.f64434d = new HashMap();
        this.f64446p = -9223372036854775807L;
    }
}
