package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.dash.b;
import androidx.media3.exoplayer.dash.d;
import androidx.media3.exoplayer.dash.e;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import androidx.media3.exoplayer.upstream.c;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.ahn;
import xsna.anl;
import xsna.bpz;
import xsna.btk;
import xsna.bvk;
import xsna.cj0;
import xsna.cxf;
import xsna.e7g0;
import xsna.evk;
import xsna.ewo0;
import xsna.fxc0;
import xsna.fz5;
import xsna.gfr;
import xsna.grz;
import xsna.icc;
import xsna.jdk0;
import xsna.jx90;
import xsna.k0q;
import xsna.kr10;
import xsna.mjp0;
import xsna.nr10;
import xsna.q44;
import xsna.qdl;
import xsna.r0q;
import xsna.r300;
import xsna.rsk;
import xsna.ryc;
import xsna.voi0;
import xsna.vyk0;
import xsna.wak;
import xsna.wp6;
import xsna.wsk;
import xsna.x1b0;
import xsna.xg0;
import xsna.xu1;
import xsna.y2r0;
import xsna.ylo;

/* loaded from: classes12.dex */
public final class DashMediaSource extends androidx.media3.exoplayer.source.a {
    public Loader A;

    @Nullable
    public mjp0 B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public rsk G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public kr10 O;
    public kr10.e P;
    public final boolean h;
    public final a.InterfaceC0045a i;
    public final b.a j;
    public final fz5 k;
    public final androidx.media3.exoplayer.drm.b l;
    public final androidx.media3.exoplayer.upstream.b m;
    public final wp6 n;
    public final long o;
    public final long p;
    public final j.a q;
    public final c.a<? extends rsk> r;
    public final e s;
    public final Object t;
    public final SparseArray<androidx.media3.exoplayer.dash.c> u;
    public final ryc v;
    public final q44 w;
    public final c x;
    public final grz y;
    public androidx.media3.datasource.a z;

    public static final class Factory implements i.a {
        public final b.a a;

        @Nullable
        public final a.InterfaceC0045a b;
        public ylo c;
        public final fz5 d;
        public androidx.media3.exoplayer.upstream.b e;
        public final long f;
        public final long g;

        @Nullable
        public c.a<? extends rsk> h;

        public Factory(a.InterfaceC0045a interfaceC0045a) {
            this(new d.a(interfaceC0045a), interfaceC0045a);
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final void a(anl anlVar) {
            this.a.a(anlVar);
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final void b() {
            this.a.b();
        }

        @Override // androidx.media3.exoplayer.source.i.a
        @Deprecated
        public final void c(boolean z) {
            this.a.c(z);
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final i d(kr10 kr10Var) {
            kr10Var.b.getClass();
            c.a aVar = this.h;
            if (aVar == null) {
                aVar = new wsk();
            }
            List<StreamKey> list = kr10Var.b.c;
            return new DashMediaSource(kr10Var, this.b, !list.isEmpty() ? new gfr(aVar, list) : aVar, this.a, this.d, this.c.a(kr10Var), this.e, this.f, this.g);
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final i.a e(ylo yloVar) {
            fxc0.t(yloVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.c = yloVar;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.i.a
        public final i.a f(androidx.media3.exoplayer.upstream.b bVar) {
            fxc0.t(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.e = bVar;
            return this;
        }

        public Factory(b.a aVar, @Nullable a.InterfaceC0045a interfaceC0045a) {
            this.a = aVar;
            this.b = interfaceC0045a;
            this.c = new qdl();
            this.e = new androidx.media3.exoplayer.upstream.a();
            this.f = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
            this.g = 5000000L;
            this.d = new fz5();
            aVar.c(true);
        }
    }

    public class a {
        public a() {
        }

        public final void a() {
            long j;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            synchronized (jdk0.b) {
                try {
                    j = jdk0.c ? jdk0.d : C.TIME_UNSET;
                } catch (Throwable th) {
                    throw th;
                }
            }
            dashMediaSource.K = j;
            dashMediaSource.y(true);
        }
    }

    public static final class b extends ewo0 {
        public final long b;
        public final long c;
        public final long d;
        public final int e;
        public final long f;
        public final long g;
        public final long h;
        public final rsk i;
        public final kr10 j;

        @Nullable
        public final kr10.e k;

        public b(long j, long j2, long j3, int i, long j4, long j5, long j6, rsk rskVar, kr10 kr10Var, @Nullable kr10.e eVar) {
            fxc0.z(rskVar.d == (eVar != null));
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = i;
            this.f = j4;
            this.g = j5;
            this.h = j6;
            this.i = rskVar;
            this.j = kr10Var;
            this.k = eVar;
        }

        @Override // xsna.ewo0
        public final int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.e) >= 0 && intValue < h()) {
                return intValue;
            }
            return -1;
        }

        @Override // xsna.ewo0
        public final ewo0.b f(int i, ewo0.b bVar, boolean z) {
            fxc0.s(i, h());
            rsk rskVar = this.i;
            String str = z ? rskVar.b(i).a : null;
            Integer valueOf = z ? Integer.valueOf(this.e + i) : null;
            long d = rskVar.d(i);
            long S = y2r0.S(rskVar.b(i).b - rskVar.b(0).b) - this.f;
            bVar.getClass();
            bVar.h(str, valueOf, 0, d, S, xg0.c, false);
            return bVar;
        }

        @Override // xsna.ewo0
        public final int h() {
            return this.i.m.size();
        }

        @Override // xsna.ewo0
        public final Object l(int i) {
            fxc0.s(i, h());
            return Integer.valueOf(this.e + i);
        }

        @Override // xsna.ewo0
        public final ewo0.c m(int i, ewo0.c cVar, long j) {
            boolean z;
            long j2;
            btk e;
            fxc0.s(i, 1);
            rsk rskVar = this.i;
            boolean z2 = rskVar.d;
            long j3 = this.h;
            if (z2 && rskVar.e != C.TIME_UNSET && rskVar.b == C.TIME_UNSET) {
                if (j > 0) {
                    j3 += j;
                    if (j3 > this.g) {
                        z = true;
                        j2 = -9223372036854775807L;
                        Object obj = ewo0.c.q;
                        cVar.b(this.j, rskVar, this.b, this.c, this.d, true, (rskVar.d || rskVar.e == C.TIME_UNSET || rskVar.b != C.TIME_UNSET) ? false : z, this.k, j2, this.g, h() - 1, this.f);
                        return cVar;
                    }
                }
                long j4 = this.f + j3;
                long d = rskVar.d(0);
                int i2 = 0;
                while (i2 < rskVar.m.size() - 1 && j4 >= d) {
                    j4 -= d;
                    i2++;
                    d = rskVar.d(i2);
                }
                jx90 b = rskVar.b(i2);
                int a = b.a(2);
                z = true;
                if (a != -1 && (e = b.c.get(a).c.get(0).e()) != null && e.i(d) != 0) {
                    j3 = (e.getTimeUs(e.h(j4, d)) + j3) - j4;
                }
            } else {
                z = true;
            }
            j2 = j3;
            Object obj2 = ewo0.c.q;
            cVar.b(this.j, rskVar, this.b, this.c, this.d, true, (rskVar.d || rskVar.e == C.TIME_UNSET || rskVar.b != C.TIME_UNSET) ? false : z, this.k, j2, this.g, h() - 1, this.f);
            return cVar;
        }

        @Override // xsna.ewo0
        public final int o() {
            return 1;
        }
    }

    public final class c implements e.b {
        public c() {
        }
    }

    public static final class d implements c.a<Long> {
        public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // androidx.media3.exoplayer.upstream.c.a
        public final Object a(Uri uri, bvk bvkVar) throws IOException {
            String readLine = new BufferedReader(new InputStreamReader(bvkVar, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = a.matcher(readLine);
                if (!matcher.matches()) {
                    throw ParserException.b(null, "Couldn't parse timestamp: " + readLine);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000) * j;
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw ParserException.b(e, null);
            }
        }
    }

    public final class e implements Loader.a<androidx.media3.exoplayer.upstream.c<rsk>> {
        public e() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void d(androidx.media3.exoplayer.upstream.c<rsk> cVar, long j, long j2) {
            long j3;
            androidx.media3.exoplayer.upstream.c<rsk> cVar2 = cVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long j4 = cVar2.a;
            evk evkVar = cVar2.b;
            vyk0 vyk0Var = cVar2.d;
            bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
            dashMediaSource.m.getClass();
            dashMediaSource.q.e(bpzVar, cVar2.c);
            rsk rskVar = cVar2.f;
            rsk rskVar2 = dashMediaSource.G;
            int size = rskVar2 == null ? 0 : rskVar2.m.size();
            long j5 = rskVar.b(0).b;
            int i = 0;
            while (i < size && dashMediaSource.G.b(i).b < j5) {
                i++;
            }
            if (rskVar.d) {
                if (size - i > rskVar.m.size()) {
                    ahn.F("Loaded out of sync manifest");
                } else {
                    long j6 = dashMediaSource.M;
                    j3 = -9223372036854775807L;
                    if (j6 == C.TIME_UNSET || rskVar.h * 1000 > j6) {
                        dashMediaSource.L = 0;
                    } else {
                        ahn.F("Loaded stale dynamic manifest: " + rskVar.h + ", " + dashMediaSource.M);
                    }
                }
                int i2 = dashMediaSource.L;
                dashMediaSource.L = i2 + 1;
                if (i2 < dashMediaSource.m.c(cVar2.c)) {
                    dashMediaSource.D.postDelayed(dashMediaSource.v, Math.min((dashMediaSource.L - 1) * 1000, 5000));
                    return;
                } else {
                    dashMediaSource.C = new DashManifestStaleException();
                    return;
                }
            }
            j3 = -9223372036854775807L;
            dashMediaSource.G = rskVar;
            dashMediaSource.H = rskVar.d & dashMediaSource.H;
            dashMediaSource.I = j - j2;
            dashMediaSource.J = j;
            dashMediaSource.N += i;
            synchronized (dashMediaSource.t) {
                if (cVar2.b.a.equals(dashMediaSource.E)) {
                    Uri uri = dashMediaSource.G.k;
                    if (uri == null) {
                        uri = cxf.a(cVar2.d.c);
                    }
                    dashMediaSource.E = uri;
                }
            }
            rsk rskVar3 = dashMediaSource.G;
            if (!rskVar3.d || dashMediaSource.K != j3) {
                dashMediaSource.y(true);
                return;
            }
            wak wakVar = rskVar3.i;
            if (wakVar == null) {
                dashMediaSource.v();
                return;
            }
            String str = (String) wakVar.b;
            if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    dashMediaSource.K = y2r0.V((String) wakVar.c) - dashMediaSource.J;
                    dashMediaSource.y(true);
                    return;
                } catch (ParserException e) {
                    dashMediaSource.x(e);
                    return;
                }
            }
            if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                dashMediaSource.z(wakVar, new d());
                return;
            }
            if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                dashMediaSource.z(wakVar, new h());
            } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                dashMediaSource.v();
            } else {
                dashMediaSource.x(new IOException("Unsupported UTC timing scheme"));
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final Loader.b g(androidx.media3.exoplayer.upstream.c<rsk> cVar, long j, long j2, IOException iOException, int i) {
            androidx.media3.exoplayer.upstream.c<rsk> cVar2 = cVar;
            long j3 = cVar2.a;
            evk evkVar = cVar2.b;
            vyk0 vyk0Var = cVar2.d;
            bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
            int i2 = cVar2.c;
            b.c cVar3 = new b.c(iOException, i);
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long b = dashMediaSource.m.b(cVar3);
            Loader.b bVar = b == C.TIME_UNSET ? Loader.f : new Loader.b(0, b);
            dashMediaSource.q.h(bpzVar, i2, iOException, !bVar.a());
            return bVar;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void i(androidx.media3.exoplayer.upstream.c<rsk> cVar, long j, long j2, int i) {
            bpz bpzVar;
            androidx.media3.exoplayer.upstream.c<rsk> cVar2 = cVar;
            if (i == 0) {
                long j3 = cVar2.a;
                bpzVar = new bpz(j, cVar2.b);
            } else {
                long j4 = cVar2.a;
                evk evkVar = cVar2.b;
                vyk0 vyk0Var = cVar2.d;
                bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
            }
            DashMediaSource.this.q.i(bpzVar, cVar2.c, i);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void j(androidx.media3.exoplayer.upstream.c<rsk> cVar, long j, long j2, boolean z) {
            DashMediaSource.this.w(cVar, j, j2);
        }
    }

    public final class f implements grz {
        public f() {
        }

        @Override // xsna.grz
        public final void maybeThrowError() throws IOException {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.A.maybeThrowError();
            IOException iOException = dashMediaSource.C;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final class g implements Loader.a<androidx.media3.exoplayer.upstream.c<Long>> {
        public g() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void d(androidx.media3.exoplayer.upstream.c<Long> cVar, long j, long j2) {
            androidx.media3.exoplayer.upstream.c<Long> cVar2 = cVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long j3 = cVar2.a;
            evk evkVar = cVar2.b;
            vyk0 vyk0Var = cVar2.d;
            bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
            dashMediaSource.m.getClass();
            dashMediaSource.q.e(bpzVar, cVar2.c);
            dashMediaSource.K = cVar2.f.longValue() - j;
            dashMediaSource.y(true);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final Loader.b g(androidx.media3.exoplayer.upstream.c<Long> cVar, long j, long j2, IOException iOException, int i) {
            androidx.media3.exoplayer.upstream.c<Long> cVar2 = cVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            j.a aVar = dashMediaSource.q;
            long j3 = cVar2.a;
            evk evkVar = cVar2.b;
            vyk0 vyk0Var = cVar2.d;
            aVar.h(new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b), cVar2.c, iOException, true);
            dashMediaSource.m.getClass();
            dashMediaSource.x(iOException);
            return Loader.e;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void j(androidx.media3.exoplayer.upstream.c<Long> cVar, long j, long j2, boolean z) {
            DashMediaSource.this.w(cVar, j, j2);
        }
    }

    public static final class h implements c.a<Long> {
        @Override // androidx.media3.exoplayer.upstream.c.a
        public final Object a(Uri uri, bvk bvkVar) throws IOException {
            return Long.valueOf(y2r0.V(new BufferedReader(new InputStreamReader(bvkVar)).readLine()));
        }
    }

    static {
        nr10.a("media3.exoplayer.dash");
    }

    public DashMediaSource(kr10 kr10Var, a.InterfaceC0045a interfaceC0045a, c.a aVar, b.a aVar2, fz5 fz5Var, androidx.media3.exoplayer.drm.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j, long j2) {
        this.O = kr10Var;
        this.P = kr10Var.d;
        kr10.f fVar = kr10Var.b;
        fVar.getClass();
        Uri uri = fVar.a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.i = interfaceC0045a;
        this.r = aVar;
        this.j = aVar2;
        this.l = bVar;
        this.m = bVar2;
        this.o = j;
        this.p = j2;
        this.k = fz5Var;
        this.n = new wp6();
        this.h = false;
        this.q = o(null);
        this.t = new Object();
        this.u = new SparseArray<>();
        this.x = new c();
        this.M = C.TIME_UNSET;
        this.K = C.TIME_UNSET;
        this.s = new e();
        this.y = new f();
        this.v = new ryc(this, 3);
        this.w = new q44(this, 5);
    }

    public static boolean u(jx90 jx90Var) {
        List<cj0> list = jx90Var.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = list.get(i).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.b()) {
            return;
        }
        if (this.A.c()) {
            this.H = true;
            return;
        }
        synchronized (this.t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        fxc0.t(uri, "The uri must be set.");
        this.A.e(new androidx.media3.exoplayer.upstream.c(this.z, new evk(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), 4, this.r), this.s, this.m.c(4));
    }

    @Override // androidx.media3.exoplayer.source.i
    public final synchronized kr10 f() {
        return this.O;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void h(androidx.media3.exoplayer.source.h hVar) {
        androidx.media3.exoplayer.dash.c cVar = (androidx.media3.exoplayer.dash.c) hVar;
        androidx.media3.exoplayer.dash.e eVar = cVar.n;
        eVar.j = true;
        eVar.e.removeCallbacksAndMessages(null);
        for (icc<androidx.media3.exoplayer.dash.b> iccVar : cVar.t) {
            iccVar.q(cVar);
        }
        cVar.s = null;
        this.u.remove(cVar.b);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final synchronized void l(kr10 kr10Var) {
        this.O = kr10Var;
        this.P = kr10Var.d;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final androidx.media3.exoplayer.source.h m(i.b bVar, xu1 xu1Var, long j) {
        int intValue = ((Integer) bVar.a).intValue() - this.N;
        j.a o = o(bVar);
        a.C0054a c0054a = new a.C0054a(this.d.c, 0, bVar);
        int i = this.N + intValue;
        rsk rskVar = this.G;
        mjp0 mjp0Var = this.B;
        long j2 = this.K;
        x1b0 x1b0Var = this.g;
        x1b0Var.getClass();
        androidx.media3.exoplayer.dash.c cVar = new androidx.media3.exoplayer.dash.c(i, rskVar, this.n, intValue, this.j, mjp0Var, this.l, c0054a, this.m, o, j2, this.y, xu1Var, this.k, this.x, x1b0Var);
        this.u.put(i, cVar);
        return cVar;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        this.y.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r(@Nullable mjp0 mjp0Var) {
        this.B = mjp0Var;
        Looper myLooper = Looper.myLooper();
        x1b0 x1b0Var = this.g;
        x1b0Var.getClass();
        androidx.media3.exoplayer.drm.b bVar = this.l;
        bVar.b(myLooper, x1b0Var);
        bVar.prepare();
        if (this.h) {
            y(false);
            return;
        }
        this.z = this.i.createDataSource();
        this.A = new Loader("DashMediaSource");
        this.D = y2r0.o(null);
        A();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t() {
        this.H = false;
        this.z = null;
        Loader loader = this.A;
        if (loader != null) {
            loader.d(null);
            this.A = null;
        }
        kr10.e eVar = f().d;
        synchronized (this) {
            this.P = eVar;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = C.TIME_UNSET;
        this.L = 0;
        this.M = C.TIME_UNSET;
        this.u.clear();
        wp6 wp6Var = this.n;
        wp6Var.a.clear();
        wp6Var.b.clear();
        wp6Var.c.clear();
        this.l.release();
    }

    public final void v() {
        boolean z;
        Loader loader = this.A;
        a aVar = new a();
        synchronized (jdk0.b) {
            z = jdk0.c;
        }
        if (z) {
            aVar.a();
            return;
        }
        if (loader == null) {
            loader = new Loader("SntpClient");
        }
        loader.e(new jdk0.b(), new jdk0.a(aVar), 1);
    }

    public final void w(androidx.media3.exoplayer.upstream.c<?> cVar, long j, long j2) {
        long j3 = cVar.a;
        evk evkVar = cVar.b;
        vyk0 vyk0Var = cVar.d;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        this.m.getClass();
        this.q.c(bpzVar, cVar.c);
    }

    public final void x(IOException iOException) {
        ahn.o("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(boolean z) {
        jx90 jx90Var;
        long j;
        long j2;
        long j3;
        boolean z2;
        rsk rskVar;
        boolean z3;
        long j4;
        jx90 jx90Var2;
        long j5;
        long j6;
        kr10.e eVar;
        int i;
        long j7;
        kr10.e eVar2;
        long j8;
        long j9;
        long j10;
        boolean z4;
        long j11;
        float f2;
        long j12;
        float f3;
        kr10.e eVar3;
        char c2;
        boolean z5;
        btk e2;
        boolean z6;
        int i2;
        q44 q44Var = this.w;
        long j13 = this.p;
        SparseArray<androidx.media3.exoplayer.dash.c> sparseArray = this.u;
        boolean z7 = false;
        int i3 = 0;
        while (i3 < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i3);
            if (keyAt >= this.N) {
                androidx.media3.exoplayer.dash.c valueAt = sparseArray.valueAt(i3);
                rsk rskVar2 = this.G;
                int i4 = keyAt - this.N;
                valueAt.w = rskVar2;
                valueAt.x = i4;
                androidx.media3.exoplayer.dash.e eVar4 = valueAt.n;
                eVar4.i = z7;
                eVar4.g = rskVar2;
                Iterator<Map.Entry<Long, Long>> it = eVar4.f.entrySet().iterator();
                while (it.hasNext()) {
                    int i5 = i3;
                    if (it.next().getKey().longValue() < eVar4.g.h) {
                        it.remove();
                    }
                    i3 = i5;
                }
                i2 = i3;
                icc<androidx.media3.exoplayer.dash.b>[] iccVarArr = valueAt.t;
                if (iccVarArr != null) {
                    for (icc<androidx.media3.exoplayer.dash.b> iccVar : iccVarArr) {
                        iccVar.f.f(rskVar2, i4);
                    }
                    valueAt.s.d(valueAt);
                }
                valueAt.y = rskVar2.b(i4).d;
                for (k0q k0qVar : valueAt.u) {
                    Iterator<r0q> it2 = valueAt.y.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            r0q next = it2.next();
                            if (next.a().equals(k0qVar.f.a())) {
                                k0qVar.a(next, rskVar2.d && i4 == rskVar2.m.size() + (-1));
                            }
                        }
                    }
                }
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
            z7 = false;
        }
        int i6 = 1;
        jx90 b2 = this.G.b(0);
        int size = this.G.m.size() - 1;
        jx90 b3 = this.G.b(size);
        long d2 = this.G.d(size);
        long S = y2r0.S(y2r0.E(this.K));
        long d3 = this.G.d(0);
        long j14 = b2.b;
        List<cj0> list = b2.c;
        long S2 = y2r0.S(j14);
        boolean u = u(b2);
        int i7 = 0;
        while (true) {
            jx90Var = b2;
            j = j13;
            if (i7 >= list.size()) {
                j2 = 0;
                break;
            }
            cj0 cj0Var = list.get(i7);
            j2 = 0;
            List<e7g0> list2 = cj0Var.c;
            int i8 = cj0Var.b;
            boolean z8 = (i8 == i6 || i8 == 2) ? false : true;
            if ((!u || !z8) && !list2.isEmpty()) {
                btk e3 = list2.get(0).e();
                if (e3 != null && e3.n(d3, S) != 0) {
                    S2 = Math.max(S2, e3.getTimeUs(e3.f(d3, S)) + S2);
                }
            }
            i7++;
            b2 = jx90Var;
            j13 = j;
            i6 = 1;
        }
        long j15 = b3.b;
        List<cj0> list3 = b3.c;
        long S3 = y2r0.S(j15);
        boolean u2 = u(b3);
        long j16 = Long.MAX_VALUE;
        int i9 = 0;
        while (true) {
            if (i9 >= list3.size()) {
                j3 = j16;
                break;
            }
            cj0 cj0Var2 = list3.get(i9);
            List<e7g0> list4 = cj0Var2.c;
            int i10 = cj0Var2.b;
            long j17 = S3;
            if (i10 != 1) {
                c2 = 2;
                if (i10 != 2) {
                    z5 = true;
                    if ((u2 || !z5) && !list4.isEmpty()) {
                        e2 = list4.get(0).e();
                        if (e2 != null) {
                            j3 = j17 + d2;
                            break;
                        }
                        long n = e2.n(d2, S);
                        if (n == j2) {
                            j3 = j17;
                            break;
                        } else {
                            z6 = u2;
                            long f4 = (e2.f(d2, S) + n) - 1;
                            j16 = Math.min(j16, e2.a(f4, d2) + e2.getTimeUs(f4) + j17);
                        }
                    } else {
                        z6 = u2;
                    }
                    i9++;
                    u2 = z6;
                    S3 = j17;
                }
            } else {
                c2 = 2;
            }
            z5 = false;
            if (u2) {
            }
            e2 = list4.get(0).e();
            if (e2 != null) {
            }
        }
        if (this.G.d) {
            for (int i11 = 0; i11 < list3.size(); i11++) {
                btk e4 = list3.get(i11).c.get(0).e();
                if (e4 != null && !e4.d()) {
                }
            }
            z2 = true;
            if (z2) {
                long j18 = this.G.f;
                if (j18 != C.TIME_UNSET) {
                    S2 = Math.max(S2, j3 - y2r0.S(j18));
                }
            }
            long j19 = j3 - S2;
            rskVar = this.G;
            if (!rskVar.d) {
                fxc0.z(rskVar.a != C.TIME_UNSET);
                long S4 = (S - y2r0.S(this.G.a)) - S2;
                kr10.e eVar5 = f().d;
                long j0 = y2r0.j0(S4);
                long j20 = eVar5.c;
                if (j20 != C.TIME_UNSET) {
                    j7 = Math.min(j0, j20);
                } else {
                    voi0 voi0Var = this.G.j;
                    if (voi0Var != null) {
                        long j21 = voi0Var.c;
                        if (j21 != C.TIME_UNSET) {
                            j7 = Math.min(j0, j21);
                        }
                    }
                    j7 = j0;
                }
                long j02 = y2r0.j0(S4 - j19);
                if (j02 < j2 && j7 > j2) {
                    j02 = j2;
                }
                j4 = -9223372036854775807L;
                long j22 = this.G.c;
                if (j22 != C.TIME_UNSET) {
                    j02 = Math.min(j02 + j22, j0);
                }
                long j23 = j02;
                long j24 = eVar5.b;
                if (j24 != C.TIME_UNSET) {
                    j23 = y2r0.k(j24, j23, j0);
                } else {
                    voi0 voi0Var2 = this.G.j;
                    if (voi0Var2 != null) {
                        long j25 = voi0Var2.b;
                        if (j25 != C.TIME_UNSET) {
                            j23 = y2r0.k(j25, j23, j0);
                        }
                    }
                }
                long j26 = j23;
                long j27 = j26 > j7 ? j26 : j7;
                synchronized (this) {
                    eVar2 = this.P;
                }
                long j28 = eVar2.a;
                if (j28 == C.TIME_UNSET) {
                    rsk rskVar3 = this.G;
                    voi0 voi0Var3 = rskVar3.j;
                    if (voi0Var3 != null) {
                        long j29 = voi0Var3.a;
                        if (j29 != C.TIME_UNSET) {
                            j28 = j29;
                        }
                    }
                    j28 = rskVar3.g;
                    if (j28 == C.TIME_UNSET) {
                        j28 = this.o;
                    }
                }
                if (j28 < j26) {
                    j28 = j26;
                }
                if (j28 > j27) {
                    j9 = j;
                    j8 = 2;
                    j10 = j26;
                    z4 = z2;
                    j11 = y2r0.k(y2r0.j0(S4 - Math.min(j9, j19 / 2)), j26, j27);
                } else {
                    j8 = 2;
                    j9 = j;
                    j10 = j26;
                    z4 = z2;
                    j11 = j28;
                }
                long j30 = j27;
                float f5 = eVar5.d;
                if (f5 == -3.4028235E38f) {
                    voi0 voi0Var4 = this.G.j;
                    f5 = voi0Var4 != null ? voi0Var4.d : -3.4028235E38f;
                }
                float f6 = eVar5.e;
                if (f6 == -3.4028235E38f) {
                    voi0 voi0Var5 = this.G.j;
                    f6 = voi0Var5 != null ? voi0Var5.e : -3.4028235E38f;
                }
                if (f5 == -3.4028235E38f && f6 == -3.4028235E38f) {
                    f2 = f6;
                    voi0 voi0Var6 = this.G.j;
                    j12 = S4;
                    z3 = z4;
                    if (voi0Var6 == null || voi0Var6.a == C.TIME_UNSET) {
                        f5 = 1.0f;
                        f3 = 1.0f;
                        kr10.e.a aVar = new kr10.e.a();
                        aVar.a = j11;
                        aVar.b = j10;
                        aVar.c = j30;
                        aVar.d = f5;
                        aVar.e = f3;
                        kr10.e eVar6 = new kr10.e(aVar);
                        synchronized (this) {
                            this.P = eVar6;
                        }
                        long j03 = y2r0.j0(S2) + this.G.a;
                        synchronized (this) {
                            eVar3 = this.P;
                        }
                        long S5 = j12 - y2r0.S(eVar3.a);
                        long min = Math.min(j9, j19 / j8);
                        if (S5 < min) {
                            j6 = j03;
                            j5 = min;
                        } else {
                            j5 = S5;
                            j6 = j03;
                        }
                        jx90Var2 = jx90Var;
                    }
                } else {
                    f2 = f6;
                    j12 = S4;
                    z3 = z4;
                }
                f3 = f2;
                kr10.e.a aVar2 = new kr10.e.a();
                aVar2.a = j11;
                aVar2.b = j10;
                aVar2.c = j30;
                aVar2.d = f5;
                aVar2.e = f3;
                kr10.e eVar62 = new kr10.e(aVar2);
                synchronized (this) {
                }
                s(new b(r2, j6, r4, r6, r34, j19, j5, r0, r41, eVar));
                if (this.h) {
                    return;
                }
                this.D.removeCallbacks(q44Var);
                if (z3) {
                    Handler handler = this.D;
                    rsk rskVar4 = this.G;
                    long E = y2r0.E(this.K);
                    int size2 = rskVar4.m.size() - 1;
                    jx90 b4 = rskVar4.b(size2);
                    long j31 = b4.b;
                    List<cj0> list5 = b4.c;
                    long S6 = y2r0.S(j31);
                    long d4 = rskVar4.d(size2);
                    long S7 = y2r0.S(E);
                    long S8 = y2r0.S(rskVar4.a);
                    long S9 = y2r0.S(rskVar4.e);
                    if (S9 == j4 || S9 >= 5000000) {
                        S9 = 5000000;
                    }
                    int i12 = 0;
                    while (i12 < list5.size()) {
                        List<e7g0> list6 = list5.get(i12).c;
                        if (list6.isEmpty()) {
                            i = i12;
                        } else {
                            i = i12;
                            btk e5 = list6.get(0).e();
                            if (e5 != null) {
                                long b5 = (e5.b(d4, S7) + (S8 + S6)) - S7;
                                if (b5 > j2 && (b5 < S9 - 100000 || (b5 > S9 && b5 < S9 + 100000))) {
                                    S9 = b5;
                                }
                            }
                        }
                        i12 = i + 1;
                    }
                    handler.postDelayed(q44Var, r300.b(S9, 1000L, RoundingMode.CEILING));
                }
                if (this.H) {
                    A();
                    return;
                }
                if (z) {
                    rsk rskVar5 = this.G;
                    if (rskVar5.d) {
                        long j32 = rskVar5.e;
                        if (j32 != j4) {
                            if (j32 == j2) {
                                j32 = 5000;
                            }
                            this.D.postDelayed(this.v, Math.max(j2, (this.I + j32) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            z3 = z2;
            j4 = -9223372036854775807L;
            jx90Var2 = jx90Var;
            j5 = j2;
            j6 = -9223372036854775807L;
            long S10 = S2 - y2r0.S(jx90Var2.b);
            rsk rskVar6 = this.G;
            long j33 = rskVar6.a;
            long j34 = this.K;
            int i13 = this.N;
            kr10 f7 = f();
            if (this.G.d) {
                eVar = null;
            } else {
                synchronized (this) {
                    eVar = this.P;
                }
            }
            s(new b(j33, j6, j34, i13, S10, j19, j5, rskVar6, f7, eVar));
            if (this.h) {
            }
        }
        z2 = false;
        if (z2) {
        }
        long j192 = j3 - S2;
        rskVar = this.G;
        if (!rskVar.d) {
        }
        long S102 = S2 - y2r0.S(jx90Var2.b);
        rsk rskVar62 = this.G;
        long j332 = rskVar62.a;
        long j342 = this.K;
        int i132 = this.N;
        kr10 f72 = f();
        if (this.G.d) {
        }
        s(new b(j332, j6, j342, i132, S102, j192, j5, rskVar62, f72, eVar));
        if (this.h) {
        }
    }

    public final void z(wak wakVar, c.a<Long> aVar) {
        androidx.media3.datasource.a aVar2 = this.z;
        Uri parse = Uri.parse((String) wakVar.c);
        Map map = Collections.EMPTY_MAP;
        fxc0.t(parse, "The uri must be set.");
        this.A.e(new androidx.media3.exoplayer.upstream.c(aVar2, new evk(parse, 0L, 1, null, map, 0L, -1L, null, 1, null), 5, aVar), new g(), 1);
    }
}
