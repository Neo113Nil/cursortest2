package androidx.media3.exoplayer.dash;

import D1.e;
import D1.f;
import D1.k;
import D1.m;
import D1.n;
import D1.o;
import E1.c;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.l;
import androidx.media3.exoplayer.dash.n;
import androidx.media3.exoplayer.source.AbstractC2200a;
import androidx.media3.exoplayer.source.B;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C2210k;
import androidx.media3.exoplayer.source.C2223y;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.InterfaceC2209j;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.M;
import b1.AbstractC2332A;
import b1.AbstractC2346O;
import b1.C2338G;
import b1.z;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import e2.s;
import h1.C4418n;
import h1.InterfaceC4403F;
import h1.InterfaceC4411g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.LongCompanionObject;
import p1.C6031a;
import p1.C6033c;
import p1.C6034d;
import q1.C6103l;
import q1.u;
import q1.w;
import x1.C6778b;

/* loaded from: classes.dex */
public final class DashMediaSource extends AbstractC2200a {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4411g f20951A;

    /* renamed from: B, reason: collision with root package name */
    public D1.m f20952B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC4403F f20953C;

    /* renamed from: D, reason: collision with root package name */
    public IOException f20954D;

    /* renamed from: E, reason: collision with root package name */
    public Handler f20955E;

    /* renamed from: F, reason: collision with root package name */
    public z.g f20956F;

    /* renamed from: G, reason: collision with root package name */
    public Uri f20957G;

    /* renamed from: H, reason: collision with root package name */
    public Uri f20958H;

    /* renamed from: I, reason: collision with root package name */
    public C6033c f20959I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f20960J;

    /* renamed from: K, reason: collision with root package name */
    public long f20961K;

    /* renamed from: L, reason: collision with root package name */
    public long f20962L;

    /* renamed from: O, reason: collision with root package name */
    public long f20963O;

    /* renamed from: P, reason: collision with root package name */
    public int f20964P;

    /* renamed from: R, reason: collision with root package name */
    public long f20965R;

    /* renamed from: T, reason: collision with root package name */
    public int f20966T;

    /* renamed from: V, reason: collision with root package name */
    public z f20967V;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20968h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC4411g.a f20969i;

    /* renamed from: j, reason: collision with root package name */
    public final c.a f20970j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2209j f20971k;

    /* renamed from: l, reason: collision with root package name */
    public final D1.e f20972l;

    /* renamed from: m, reason: collision with root package name */
    public final u f20973m;

    /* renamed from: n, reason: collision with root package name */
    public final D1.k f20974n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.media3.exoplayer.dash.b f20975o;

    /* renamed from: p, reason: collision with root package name */
    public final long f20976p;

    /* renamed from: q, reason: collision with root package name */
    public final long f20977q;

    /* renamed from: r, reason: collision with root package name */
    public final L.a f20978r;

    /* renamed from: s, reason: collision with root package name */
    public final o.a f20979s;

    /* renamed from: t, reason: collision with root package name */
    public final e f20980t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f20981u;

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray f20982v;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f20983w;

    /* renamed from: x, reason: collision with root package name */
    public final Runnable f20984x;

    /* renamed from: y, reason: collision with root package name */
    public final n.b f20985y;

    /* renamed from: z, reason: collision with root package name */
    public final D1.n f20986z;

    public static final class Factory implements M {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f20987l = 0;

        /* renamed from: c, reason: collision with root package name */
        public final c.a f20988c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC4411g.a f20989d;

        /* renamed from: e, reason: collision with root package name */
        public e.a f20990e;

        /* renamed from: f, reason: collision with root package name */
        public w f20991f;

        /* renamed from: g, reason: collision with root package name */
        public InterfaceC2209j f20992g;

        /* renamed from: h, reason: collision with root package name */
        public D1.k f20993h;

        /* renamed from: i, reason: collision with root package name */
        public long f20994i;

        /* renamed from: j, reason: collision with root package name */
        public long f20995j;

        /* renamed from: k, reason: collision with root package name */
        public o.a f20996k;

        public Factory(InterfaceC4411g.a aVar) {
            this(new l.a(aVar), aVar);
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public DashMediaSource e(z zVar) {
            AbstractC4134a.e(zVar.f24655b);
            o.a aVar = this.f20996k;
            if (aVar == null) {
                aVar = new C6034d();
            }
            List list = zVar.f24655b.f24753e;
            o.a c6778b = !list.isEmpty() ? new C6778b(aVar, list) : aVar;
            e.a aVar2 = this.f20990e;
            return new DashMediaSource(zVar, null, this.f20989d, c6778b, this.f20988c, this.f20992g, aVar2 == null ? null : aVar2.a(zVar), this.f20991f.a(zVar), this.f20993h, this.f20994i, this.f20995j, null);
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z10) {
            this.f20988c.b(z10);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory c(int i10) {
            this.f20988c.c(i10);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory f(e.a aVar) {
            this.f20990e = (e.a) AbstractC4134a.e(aVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory d(w wVar) {
            this.f20991f = (w) AbstractC4134a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory g(D1.k kVar) {
            this.f20993h = (D1.k) AbstractC4134a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.D.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f20988c.a((s.a) AbstractC4134a.e(aVar));
            return this;
        }

        public Factory(c.a aVar, InterfaceC4411g.a aVar2) {
            this.f20988c = (c.a) AbstractC4134a.e(aVar);
            this.f20989d = aVar2;
            this.f20991f = new C6103l();
            this.f20993h = new D1.j();
            this.f20994i = 30000L;
            this.f20995j = 5000000L;
            this.f20992g = new C2210k();
            b(true);
        }
    }

    public class a implements c.b {
        public a() {
        }

        @Override // E1.c.b
        public void a() {
            DashMediaSource.this.c0(E1.c.i());
        }

        @Override // E1.c.b
        public void b(IOException iOException) {
            DashMediaSource.this.b0(iOException);
        }
    }

    public static final class b extends AbstractC2346O {

        /* renamed from: e, reason: collision with root package name */
        public final long f20998e;

        /* renamed from: f, reason: collision with root package name */
        public final long f20999f;

        /* renamed from: g, reason: collision with root package name */
        public final long f21000g;

        /* renamed from: h, reason: collision with root package name */
        public final int f21001h;

        /* renamed from: i, reason: collision with root package name */
        public final long f21002i;

        /* renamed from: j, reason: collision with root package name */
        public final long f21003j;

        /* renamed from: k, reason: collision with root package name */
        public final long f21004k;

        /* renamed from: l, reason: collision with root package name */
        public final C6033c f21005l;

        /* renamed from: m, reason: collision with root package name */
        public final z f21006m;

        /* renamed from: n, reason: collision with root package name */
        public final z.g f21007n;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, C6033c c6033c, z zVar, z.g gVar) {
            AbstractC4134a.g(c6033c.f62903d == (gVar != null));
            this.f20998e = j10;
            this.f20999f = j11;
            this.f21000g = j12;
            this.f21001h = i10;
            this.f21002i = j13;
            this.f21003j = j14;
            this.f21004k = j15;
            this.f21005l = c6033c;
            this.f21006m = zVar;
            this.f21007n = gVar;
        }

        public static boolean t(C6033c c6033c) {
            return c6033c.f62903d && c6033c.f62904e != -9223372036854775807L && c6033c.f62901b == -9223372036854775807L;
        }

        @Override // b1.AbstractC2346O
        public int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f21001h) >= 0 && intValue < i()) {
                return intValue;
            }
            return -1;
        }

        @Override // b1.AbstractC2346O
        public AbstractC2346O.b g(int i10, AbstractC2346O.b bVar, boolean z10) {
            AbstractC4134a.c(i10, 0, i());
            return bVar.t(z10 ? this.f21005l.d(i10).f62932a : null, z10 ? Integer.valueOf(this.f21001h + i10) : null, 0, this.f21005l.g(i10), Z.a1(this.f21005l.d(i10).f62933b - this.f21005l.d(0).f62933b) - this.f21002i);
        }

        @Override // b1.AbstractC2346O
        public int i() {
            return this.f21005l.e();
        }

        @Override // b1.AbstractC2346O
        public Object m(int i10) {
            AbstractC4134a.c(i10, 0, i());
            return Integer.valueOf(this.f21001h + i10);
        }

        @Override // b1.AbstractC2346O
        public AbstractC2346O.c o(int i10, AbstractC2346O.c cVar, long j10) {
            AbstractC4134a.c(i10, 0, 1);
            long s10 = s(j10);
            Object obj = AbstractC2346O.c.f24367q;
            z zVar = this.f21006m;
            C6033c c6033c = this.f21005l;
            return cVar.g(obj, zVar, c6033c, this.f20998e, this.f20999f, this.f21000g, true, t(c6033c), this.f21007n, s10, this.f21003j, 0, i() - 1, this.f21002i);
        }

        @Override // b1.AbstractC2346O
        public int p() {
            return 1;
        }

        public final long s(long j10) {
            i l10;
            long j11 = this.f21004k;
            if (!t(this.f21005l)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f21003j) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f21002i + j11;
            long g10 = this.f21005l.g(0);
            int i10 = 0;
            while (i10 < this.f21005l.e() - 1 && j12 >= g10) {
                j12 -= g10;
                i10++;
                g10 = this.f21005l.g(i10);
            }
            p1.g d10 = this.f21005l.d(i10);
            int a10 = d10.a(2);
            return (a10 == -1 || (l10 = ((p1.j) ((C6031a) d10.f62934c.get(a10)).f62892c.get(0)).l()) == null || l10.g(g10) == 0) ? j11 : (j11 + l10.b(l10.f(j12, g10))) - j12;
        }
    }

    public final class c implements n.b {
        public c() {
        }

        @Override // androidx.media3.exoplayer.dash.n.b
        public void a(long j10) {
            DashMediaSource.this.T(j10);
        }

        @Override // androidx.media3.exoplayer.dash.n.b
        public void b() {
            DashMediaSource.this.U();
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class d implements o.a {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f21009a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // D1.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = f21009a.matcher(readLine);
                if (!matcher.matches()) {
                    throw C2338G.c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j10 * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw C2338G.c(null, e10);
            }
        }
    }

    public final class e implements m.b {
        public e() {
        }

        @Override // D1.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void l(o oVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(oVar, j10, j11);
        }

        @Override // D1.m.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void i(o oVar, long j10, long j11) {
            DashMediaSource.this.W(oVar, j10, j11);
        }

        @Override // D1.m.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(oVar, j10, j11, iOException, i10);
        }

        @Override // D1.m.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, long j10, long j11, int i10) {
            DashMediaSource.this.Y(oVar, j10, j11, i10);
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public final class f implements D1.n {
        public f() {
        }

        @Override // D1.n
        public void a() {
            DashMediaSource.this.f20952B.a();
            b();
        }

        public final void b() {
            if (DashMediaSource.this.f20954D != null) {
                throw DashMediaSource.this.f20954D;
            }
        }
    }

    public final class g implements m.b {
        public g() {
        }

        @Override // D1.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void l(o oVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(oVar, j10, j11);
        }

        @Override // D1.m.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void i(o oVar, long j10, long j11) {
            DashMediaSource.this.Z(oVar, j10, j11);
        }

        @Override // D1.m.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.a0(oVar, j10, j11, iOException);
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class h implements o.a {
        public h() {
        }

        @Override // D1.o.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(Z.i1(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        AbstractC2332A.a("media3.exoplayer.dash");
    }

    public /* synthetic */ DashMediaSource(z zVar, C6033c c6033c, InterfaceC4411g.a aVar, o.a aVar2, c.a aVar3, InterfaceC2209j interfaceC2209j, D1.e eVar, u uVar, D1.k kVar, long j10, long j11, a aVar4) {
        this(zVar, c6033c, aVar, aVar2, aVar3, interfaceC2209j, eVar, uVar, kVar, j10, j11);
    }

    public static long M(p1.g gVar, long j10, long j11) {
        long a12 = Z.a1(gVar.f62933b);
        boolean Q10 = Q(gVar);
        long j12 = LongCompanionObject.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f62934c.size(); i10++) {
            C6031a c6031a = (C6031a) gVar.f62934c.get(i10);
            List list = c6031a.f62892c;
            int i11 = c6031a.f62891b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!Q10 || !z10) && !list.isEmpty()) {
                i l10 = ((p1.j) list.get(0)).l();
                if (l10 == null) {
                    return a12 + j10;
                }
                long j13 = l10.j(j10, j11);
                if (j13 == 0) {
                    return a12;
                }
                long c10 = (l10.c(j10, j11) + j13) - 1;
                j12 = Math.min(j12, l10.a(c10, j10) + l10.b(c10) + a12);
            }
        }
        return j12;
    }

    public static long N(p1.g gVar, long j10, long j11) {
        long a12 = Z.a1(gVar.f62933b);
        boolean Q10 = Q(gVar);
        long j12 = a12;
        for (int i10 = 0; i10 < gVar.f62934c.size(); i10++) {
            C6031a c6031a = (C6031a) gVar.f62934c.get(i10);
            List list = c6031a.f62892c;
            int i11 = c6031a.f62891b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!Q10 || !z10) && !list.isEmpty()) {
                i l10 = ((p1.j) list.get(0)).l();
                if (l10 == null || l10.j(j10, j11) == 0) {
                    return a12;
                }
                j12 = Math.max(j12, l10.b(l10.c(j10, j11)) + a12);
            }
        }
        return j12;
    }

    public static long O(C6033c c6033c, long j10) {
        i l10;
        int e10 = c6033c.e() - 1;
        p1.g d10 = c6033c.d(e10);
        long a12 = Z.a1(d10.f62933b);
        long g10 = c6033c.g(e10);
        long a13 = Z.a1(j10);
        long a14 = Z.a1(c6033c.f62900a);
        long a15 = Z.a1(c6033c.f62904e);
        if (a15 == -9223372036854775807L || a15 >= 5000000) {
            a15 = 5000000;
        }
        for (int i10 = 0; i10 < d10.f62934c.size(); i10++) {
            List list = ((C6031a) d10.f62934c.get(i10)).f62892c;
            if (!list.isEmpty() && (l10 = ((p1.j) list.get(0)).l()) != null) {
                long d11 = ((a14 + a12) + l10.d(g10, a13)) - a13;
                if (d11 > 0 && (d11 < a15 - 100000 || (d11 > a15 && d11 < a15 + 100000))) {
                    a15 = d11;
                }
            }
        }
        return com.google.common.math.e.b(a15, 1000L, RoundingMode.CEILING);
    }

    public static boolean Q(p1.g gVar) {
        for (int i10 = 0; i10 < gVar.f62934c.size(); i10++) {
            int i11 = ((C6031a) gVar.f62934c.get(i10)).f62891b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(p1.g gVar) {
        for (int i10 = 0; i10 < gVar.f62934c.size(); i10++) {
            i l10 = ((p1.j) ((C6031a) gVar.f62934c.get(i10)).f62892c.get(0)).l();
            if (l10 == null || l10.h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        Uri uri;
        this.f20955E.removeCallbacks(this.f20983w);
        if (this.f20952B.i()) {
            return;
        }
        if (this.f20952B.j()) {
            this.f20960J = true;
            return;
        }
        synchronized (this.f20981u) {
            uri = this.f20957G;
        }
        this.f20960J = false;
        C4418n a10 = new C4418n.b().i(uri).b(1).a();
        if (this.f20972l != null) {
            f.C0047f l10 = new f.C0047f(this.f20972l, W9.d.f13160a).l(X9.m.f13664a);
            C6033c c6033c = this.f20959I;
            if (c6033c != null) {
                l10.i(c6033c.f62903d);
            }
            a10 = l10.a().a(a10);
        }
        i0(new o(this.f20951A, a10, 4, this.f20979s), this.f20980t, this.f20974n.c(4));
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void D(InterfaceC4403F interfaceC4403F) {
        this.f20953C = interfaceC4403F;
        this.f20973m.a(Looper.myLooper(), B());
        this.f20973m.g();
        if (this.f20968h) {
            d0(false);
            return;
        }
        this.f20951A = this.f20969i.a();
        this.f20952B = new D1.m("DashMediaSource");
        this.f20955E = Z.z();
        j0();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
        this.f20960J = false;
        this.f20951A = null;
        D1.m mVar = this.f20952B;
        if (mVar != null) {
            mVar.l();
            this.f20952B = null;
        }
        this.f20961K = 0L;
        this.f20962L = 0L;
        this.f20957G = this.f20958H;
        this.f20954D = null;
        Handler handler = this.f20955E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f20955E = null;
        }
        this.f20963O = -9223372036854775807L;
        this.f20964P = 0;
        this.f20965R = -9223372036854775807L;
        this.f20982v.clear();
        this.f20975o.i();
        this.f20973m.release();
    }

    public final long P() {
        return Math.min((this.f20964P - 1) * 1000, 5000);
    }

    public final void S() {
        E1.c.l(this.f20952B, new a());
    }

    public void T(long j10) {
        long j11 = this.f20965R;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.f20965R = j10;
        }
    }

    public void U() {
        this.f20955E.removeCallbacks(this.f20984x);
        j0();
    }

    public void V(o oVar, long j10, long j11) {
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f20974n.d(oVar.f2474a);
        this.f20978r.l(c2223y, oVar.f2476c);
    }

    public void W(o oVar, long j10, long j11) {
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f20974n.d(oVar.f2474a);
        this.f20978r.o(c2223y, oVar.f2476c);
        C6033c c6033c = (C6033c) oVar.e();
        C6033c c6033c2 = this.f20959I;
        int e10 = c6033c2 == null ? 0 : c6033c2.e();
        long j12 = c6033c.d(0).f62933b;
        int i10 = 0;
        while (i10 < e10 && this.f20959I.d(i10).f62933b < j12) {
            i10++;
        }
        if (c6033c.f62903d) {
            if (e10 - i10 > c6033c.e()) {
                AbstractC4156x.i("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.f20965R;
                if (j13 == -9223372036854775807L || c6033c.f62907h * 1000 > j13) {
                    this.f20964P = 0;
                } else {
                    AbstractC4156x.i("DashMediaSource", "Loaded stale dynamic manifest: " + c6033c.f62907h + ", " + this.f20965R);
                }
            }
            int i11 = this.f20964P;
            this.f20964P = i11 + 1;
            if (i11 < this.f20974n.c(oVar.f2476c)) {
                h0(P());
                return;
            } else {
                this.f20954D = new androidx.media3.exoplayer.dash.d();
                return;
            }
        }
        this.f20959I = c6033c;
        this.f20960J = c6033c.f62903d & this.f20960J;
        this.f20961K = j10 - j11;
        this.f20962L = j10;
        this.f20966T += i10;
        synchronized (this.f20981u) {
            try {
                if (!oVar.f2475b.f47554a.equals(this.f20957G)) {
                    if (this.f20972l != null && D1.f.b(oVar.f2475b.f47554a).equals(this.f20957G)) {
                    }
                }
                Uri uri = this.f20959I.f62910k;
                if (uri == null) {
                    uri = D1.f.b(oVar.f());
                }
                this.f20957G = uri;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C6033c c6033c3 = this.f20959I;
        if (!c6033c3.f62903d || this.f20963O != -9223372036854775807L) {
            d0(true);
            return;
        }
        p1.o oVar2 = c6033c3.f62908i;
        if (oVar2 != null) {
            e0(oVar2);
        } else {
            S();
        }
    }

    public m.c X(o oVar, long j10, long j11, IOException iOException, int i10) {
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        long b10 = this.f20974n.b(new k.c(c2223y, new B(oVar.f2476c), iOException, i10));
        m.c h10 = b10 == -9223372036854775807L ? D1.m.f2457g : D1.m.h(false, b10);
        boolean c10 = h10.c();
        this.f20978r.s(c2223y, oVar.f2476c, iOException, !c10);
        if (!c10) {
            this.f20974n.d(oVar.f2474a);
        }
        return h10;
    }

    public void Y(o oVar, long j10, long j11, int i10) {
        this.f20978r.u(i10 == 0 ? new C2223y(oVar.f2474a, oVar.f2475b, j10) : new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f2476c, i10);
    }

    public void Z(o oVar, long j10, long j11) {
        C2223y c2223y = new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f20974n.d(oVar.f2474a);
        this.f20978r.o(c2223y, oVar.f2476c);
        c0(((Long) oVar.e()).longValue() - j10);
    }

    public m.c a0(o oVar, long j10, long j11, IOException iOException) {
        this.f20978r.s(new C2223y(oVar.f2474a, oVar.f2475b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f2476c, iOException, true);
        this.f20974n.d(oVar.f2474a);
        b0(iOException);
        return D1.m.f2456f;
    }

    public final void b0(IOException iOException) {
        AbstractC4156x.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f20963O = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        d0(true);
    }

    @Override // androidx.media3.exoplayer.source.D
    public C c(D.b bVar, D1.b bVar2, long j10) {
        int intValue = ((Integer) bVar.f21516a).intValue() - this.f20966T;
        L.a y10 = y(bVar);
        androidx.media3.exoplayer.dash.f fVar = new androidx.media3.exoplayer.dash.f(this.f20966T + intValue, this.f20959I, this.f20975o, intValue, this.f20970j, this.f20953C, this.f20972l, this.f20973m, w(bVar), this.f20974n, y10, this.f20963O, this.f20986z, bVar2, this.f20971k, this.f20985y, B());
        this.f20982v.put(fVar.f21019a, fVar);
        return fVar;
    }

    public final void c0(long j10) {
        this.f20963O = j10;
        d0(true);
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized z d() {
        return this.f20967V;
    }

    public final void d0(boolean z10) {
        long j10;
        long j11;
        long j12;
        for (int i10 = 0; i10 < this.f20982v.size(); i10++) {
            int keyAt = this.f20982v.keyAt(i10);
            if (keyAt >= this.f20966T) {
                ((androidx.media3.exoplayer.dash.f) this.f20982v.valueAt(i10)).P(this.f20959I, keyAt - this.f20966T);
            }
        }
        p1.g d10 = this.f20959I.d(0);
        int e10 = this.f20959I.e() - 1;
        p1.g d11 = this.f20959I.d(e10);
        long g10 = this.f20959I.g(e10);
        long a12 = Z.a1(Z.m0(this.f20963O));
        long N10 = N(d10, this.f20959I.g(0), a12);
        long M10 = M(d11, g10, a12);
        boolean z11 = this.f20959I.f62903d && !R(d11);
        if (z11) {
            long j13 = this.f20959I.f62905f;
            if (j13 != -9223372036854775807L) {
                N10 = Math.max(N10, M10 - Z.a1(j13));
            }
        }
        long j14 = M10 - N10;
        C6033c c6033c = this.f20959I;
        if (c6033c.f62903d) {
            AbstractC4134a.g(c6033c.f62900a != -9223372036854775807L);
            long a13 = (a12 - Z.a1(this.f20959I.f62900a)) - N10;
            k0(a13, j14);
            long J12 = this.f20959I.f62900a + Z.J1(N10);
            long a14 = a13 - Z.a1(this.f20956F.f24731a);
            j10 = 0;
            long min = Math.min(this.f20977q, j14 / 2);
            j11 = J12;
            j12 = a14 < min ? min : a14;
        } else {
            j10 = 0;
            j11 = -9223372036854775807L;
            j12 = 0;
        }
        long a15 = N10 - Z.a1(d10.f62933b);
        C6033c c6033c2 = this.f20959I;
        E(new b(c6033c2.f62900a, j11, this.f20963O, this.f20966T, a15, j14, j12, c6033c2, d(), this.f20959I.f62903d ? this.f20956F : null));
        if (this.f20968h) {
            return;
        }
        this.f20955E.removeCallbacks(this.f20984x);
        if (z11) {
            this.f20955E.postDelayed(this.f20984x, O(this.f20959I, Z.m0(this.f20963O)));
        }
        if (this.f20960J) {
            j0();
            return;
        }
        if (z10) {
            C6033c c6033c3 = this.f20959I;
            if (c6033c3.f62903d) {
                long j15 = c6033c3.f62904e;
                if (j15 != -9223372036854775807L) {
                    if (j15 == j10) {
                        j15 = 5000;
                    }
                    h0(Math.max(j10, (this.f20961K + j15) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void e0(p1.o oVar) {
        String str = oVar.f62986a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            f0(oVar);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            g0(oVar, new d());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            g0(oVar, new h(null));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            S();
        } else {
            b0(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // androidx.media3.exoplayer.source.D
    public void f(C c10) {
        androidx.media3.exoplayer.dash.f fVar = (androidx.media3.exoplayer.dash.f) c10;
        fVar.L();
        this.f20982v.remove(fVar.f21019a);
    }

    public final void f0(p1.o oVar) {
        try {
            c0(Z.i1(oVar.f62987b) - this.f20962L);
        } catch (C2338G e10) {
            b0(e10);
        }
    }

    public final void g0(p1.o oVar, o.a aVar) {
        i0(new o(this.f20951A, Uri.parse(oVar.f62987b), 5, aVar), new g(this, null), 1);
    }

    public final void h0(long j10) {
        this.f20955E.postDelayed(this.f20983w, j10);
    }

    public final void i0(o oVar, m.b bVar, int i10) {
        this.f20952B.n(oVar, bVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(long j10, long j11) {
        long j12;
        long min;
        long J12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        float f10;
        float f11;
        p1.l lVar;
        z.g gVar = d().f24657d;
        long J13 = Z.J1(j10);
        long j18 = gVar.f24733c;
        if (j18 == -9223372036854775807L) {
            p1.l lVar2 = this.f20959I.f62909j;
            if (lVar2 != null) {
                long j19 = lVar2.f62979c;
                if (j19 != -9223372036854775807L) {
                    min = Math.min(J13, j19);
                }
            }
            j12 = J13;
            J12 = Z.J1(j10 - j11);
            if (J12 < 0 && j12 > 0) {
                J12 = 0;
            }
            j13 = this.f20959I.f62902c;
            if (j13 != -9223372036854775807L) {
                J12 = Math.min(J12 + j13, J13);
            }
            long j20 = J12;
            j14 = gVar.f24732b;
            if (j14 == -9223372036854775807L) {
                j20 = Z.p(j14, j20, J13);
            } else {
                p1.l lVar3 = this.f20959I.f62909j;
                if (lVar3 != null) {
                    long j21 = lVar3.f62978b;
                    if (j21 != -9223372036854775807L) {
                        j20 = Z.p(j21, j20, J13);
                    }
                }
            }
            j15 = j20;
            j16 = j15 <= j12 ? j15 : j12;
            j17 = this.f20956F.f24731a;
            if (j17 == -9223372036854775807L) {
                C6033c c6033c = this.f20959I;
                p1.l lVar4 = c6033c.f62909j;
                if (lVar4 != null) {
                    long j22 = lVar4.f62977a;
                    if (j22 != -9223372036854775807L) {
                        j17 = j22;
                    }
                }
                j17 = c6033c.f62906g;
                if (j17 == -9223372036854775807L) {
                    j17 = this.f20976p;
                }
            }
            if (j17 < j15) {
                j17 = j15;
            }
            if (j17 > j16) {
                j17 = Z.p(Z.J1(j10 - Math.min(this.f20977q, j11 / 2)), j15, j16);
            }
            long j23 = j16;
            f10 = gVar.f24734d;
            if (f10 == -3.4028235E38f) {
                p1.l lVar5 = this.f20959I.f62909j;
                f10 = lVar5 != null ? lVar5.f62980d : -3.4028235E38f;
            }
            f11 = gVar.f24735e;
            if (f11 == -3.4028235E38f) {
                p1.l lVar6 = this.f20959I.f62909j;
                f11 = lVar6 != null ? lVar6.f62981e : -3.4028235E38f;
            }
            if (f10 == -3.4028235E38f && f11 == -3.4028235E38f && ((lVar = this.f20959I.f62909j) == null || lVar.f62977a == -9223372036854775807L)) {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            this.f20956F = new z.g.a().k(j17).i(j15).g(j23).j(f10).h(f11).f();
        }
        min = Math.min(J13, j18);
        j12 = min;
        J12 = Z.J1(j10 - j11);
        if (J12 < 0) {
            J12 = 0;
        }
        j13 = this.f20959I.f62902c;
        if (j13 != -9223372036854775807L) {
        }
        long j202 = J12;
        j14 = gVar.f24732b;
        if (j14 == -9223372036854775807L) {
        }
        j15 = j202;
        if (j15 <= j12) {
        }
        j17 = this.f20956F.f24731a;
        if (j17 == -9223372036854775807L) {
        }
        if (j17 < j15) {
        }
        if (j17 > j16) {
        }
        long j232 = j16;
        f10 = gVar.f24734d;
        if (f10 == -3.4028235E38f) {
        }
        f11 = gVar.f24735e;
        if (f11 == -3.4028235E38f) {
        }
        if (f10 == -3.4028235E38f) {
            f10 = 1.0f;
            f11 = 1.0f;
        }
        this.f20956F = new z.g.a().k(j17).i(j15).g(j232).j(f10).h(f11).f();
    }

    @Override // androidx.media3.exoplayer.source.D
    public synchronized void n(z zVar) {
        this.f20967V = zVar;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void q() {
        this.f20986z.a();
    }

    public DashMediaSource(z zVar, C6033c c6033c, InterfaceC4411g.a aVar, o.a aVar2, c.a aVar3, InterfaceC2209j interfaceC2209j, D1.e eVar, u uVar, D1.k kVar, long j10, long j11) {
        this.f20967V = zVar;
        this.f20956F = zVar.f24657d;
        this.f20957G = ((z.h) AbstractC4134a.e(zVar.f24655b)).f24749a;
        this.f20958H = zVar.f24655b.f24749a;
        this.f20959I = c6033c;
        this.f20969i = aVar;
        this.f20979s = aVar2;
        this.f20970j = aVar3;
        this.f20972l = eVar;
        this.f20973m = uVar;
        this.f20974n = kVar;
        this.f20976p = j10;
        this.f20977q = j11;
        this.f20971k = interfaceC2209j;
        this.f20975o = new androidx.media3.exoplayer.dash.b();
        boolean z10 = c6033c != null;
        this.f20968h = z10;
        a aVar4 = null;
        this.f20978r = y(null);
        this.f20981u = new Object();
        this.f20982v = new SparseArray();
        this.f20985y = new c(this, aVar4);
        this.f20965R = -9223372036854775807L;
        this.f20963O = -9223372036854775807L;
        if (!z10) {
            this.f20980t = new e(this, aVar4);
            this.f20986z = new f();
            this.f20983w = new Runnable() { // from class: androidx.media3.exoplayer.dash.g
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.j0();
                }
            };
            this.f20984x = new Runnable() { // from class: androidx.media3.exoplayer.dash.h
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.d0(false);
                }
            };
            return;
        }
        AbstractC4134a.g(true ^ c6033c.f62903d);
        this.f20980t = null;
        this.f20983w = null;
        this.f20984x = null;
        this.f20986z = new n.a();
    }
}
