package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.collect.ImmutableMap;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import xsna.ahn;
import xsna.b4e0;
import xsna.bpz;
import xsna.cvk;
import xsna.d7q;
import xsna.do8;
import xsna.evk;
import xsna.fas;
import xsna.fi20;
import xsna.fxc0;
import xsna.gtf0;
import xsna.io20;
import xsna.k0n;
import xsna.m0h0;
import xsna.n3i0;
import xsna.o3i0;
import xsna.o4;
import xsna.pf30;
import xsna.pfp0;
import xsna.pgq;
import xsna.pzb0;
import xsna.qfp0;
import xsna.rgp0;
import xsna.rgq;
import xsna.sc4;
import xsna.suk;
import xsna.tel;
import xsna.utw;
import xsna.vrv;
import xsna.vyk0;
import xsna.w8s;
import xsna.wwi;
import xsna.xab;
import xsna.xi90;
import xsna.xrv;
import xsna.xu1;
import xsna.y2r0;
import xsna.z;

/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes12.dex */
public final class m implements h, rgq, Loader.a<b>, Loader.e, p.c {
    public static final Map<String, String> S;
    public static final androidx.media3.common.a T;
    public boolean A;
    public boolean B;
    public e C;
    public n3i0 D;
    public long E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public long M;
    public long N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public final Uri b;
    public final androidx.media3.datasource.a c;
    public final androidx.media3.exoplayer.drm.b d;
    public final androidx.media3.exoplayer.upstream.b e;
    public final j.a f;
    public final a.C0054a g;
    public final n h;
    public final xu1 i;

    @Nullable
    public final String j;
    public final long k;

    @Nullable
    public final androidx.media3.common.a l;
    public final long m;
    public final Loader n;
    public final do8 o;
    public final wwi p;
    public final sc4 q;
    public final o4 r;
    public final Handler s;

    @Nullable
    public h.a t;

    @Nullable
    public xrv u;
    public a[] v;
    public p[] w;
    public d[] x;
    public boolean y;
    public boolean z;

    /* compiled from: ProgressiveMediaPeriod.java */
    public static class a extends fas {
        public final p b;
        public final k0n c;
        public final AtomicReference<EnumC0064a> d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProgressiveMediaPeriod.java */
        /* renamed from: androidx.media3.exoplayer.source.m$a$a, reason: collision with other inner class name */
        public static final class EnumC0064a {
            private static final /* synthetic */ EnumC0064a[] $VALUES;
            public static final EnumC0064a DISCARDING;
            public static final EnumC0064a DISCARD_AFTER_NEXT_SAMPLE_METADATA;
            public static final EnumC0064a PASS_THROUGH;

            static {
                EnumC0064a enumC0064a = new EnumC0064a("PASS_THROUGH", 0);
                PASS_THROUGH = enumC0064a;
                EnumC0064a enumC0064a2 = new EnumC0064a("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
                DISCARD_AFTER_NEXT_SAMPLE_METADATA = enumC0064a2;
                EnumC0064a enumC0064a3 = new EnumC0064a("DISCARDING", 2);
                DISCARDING = enumC0064a3;
                $VALUES = new EnumC0064a[]{enumC0064a, enumC0064a2, enumC0064a3};
            }

            public EnumC0064a() {
                throw null;
            }

            public static EnumC0064a valueOf(String str) {
                return (EnumC0064a) Enum.valueOf(EnumC0064a.class, str);
            }

            public static EnumC0064a[] values() {
                return (EnumC0064a[]) $VALUES.clone();
            }
        }

        public a(p pVar) {
            super(pVar);
            this.b = pVar;
            this.c = new k0n();
            this.d = new AtomicReference<>(EnumC0064a.PASS_THROUGH);
        }

        @Override // xsna.rgp0
        public final void a(long j, int i, int i2, int i3, @Nullable rgp0.a aVar) {
            h().a(j, i, i2, i3, aVar);
            AtomicReference<EnumC0064a> atomicReference = this.d;
            if (atomicReference.get() == EnumC0064a.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
                this.b.D(false);
                atomicReference.set(EnumC0064a.DISCARDING);
            }
        }

        @Override // xsna.rgp0
        public final void b(xi90 xi90Var, int i, int i2) {
            h().b(xi90Var, i, i2);
        }

        @Override // xsna.rgp0
        public final void d(int i, xi90 xi90Var) {
            h().d(i, xi90Var);
        }

        @Override // xsna.rgp0
        public final int f(suk sukVar, int i, boolean z) throws IOException {
            return h().f(sukVar, i, z);
        }

        @Override // xsna.rgp0
        public final int g(suk sukVar, int i, boolean z) throws IOException {
            return h().g(sukVar, i, z);
        }

        public final rgp0 h() {
            return this.d.get() == EnumC0064a.DISCARDING ? this.c : this.b;
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public final class b implements Loader.d {
        public final Uri a;
        public final vyk0 b;
        public final l c;
        public final m d;
        public final wwi e;
        public volatile boolean g;
        public long i;
        public evk j;

        @Nullable
        public rgp0 k;
        public boolean l;
        public final pzb0 f = new pzb0();
        public boolean h = true;

        public b(Uri uri, androidx.media3.datasource.a aVar, do8 do8Var, m mVar, wwi wwiVar) {
            this.a = uri;
            this.b = new vyk0(aVar);
            this.c = do8Var;
            this.d = mVar;
            this.e = wwiVar;
            bpz.g.getAndIncrement();
            this.j = a(0L, null);
        }

        public final evk a(long j, @Nullable String str) {
            Map map = m.S;
            if (str != null && !str.startsWith("W/")) {
                ImmutableMap.a aVar = new ImmutableMap.a(4);
                aVar.e(map.entrySet());
                aVar.d("If-Range", str);
                map = aVar.b();
            }
            Map map2 = Collections.EMPTY_MAP;
            String str2 = m.this.j;
            Uri uri = this.a;
            fxc0.t(uri, "The uri must be set.");
            return new evk(uri, 0L, 1, null, map, j, -1L, str2, 6, null);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void cancelLoad() {
            this.g = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void load() throws IOException {
            androidx.media3.datasource.a aVar;
            pgq pgqVar;
            int i;
            int i2 = 0;
            String str = null;
            while (i2 == 0 && !this.g) {
                try {
                    long j = this.f.a;
                    evk a = a(j, str);
                    this.j = a;
                    long open = this.b.open(a);
                    if (this.g) {
                        if (i2 != 1 && ((do8) this.c).a() != -1) {
                            this.f.a = ((do8) this.c).a();
                        }
                        cvk.k(this.b);
                        return;
                    }
                    List<String> list = this.b.a.getResponseHeaders().get(Command.HTTP_HEADER_ETAG);
                    str = (list == null || list.isEmpty()) ? null : list.get(0);
                    if (open != -1) {
                        open += j;
                        m mVar = m.this;
                        mVar.s.post(new xab(mVar, 9));
                    }
                    long j2 = open;
                    m.this.u = xrv.d(this.b.a.getResponseHeaders());
                    vyk0 vyk0Var = this.b;
                    xrv xrvVar = m.this.u;
                    if (xrvVar == null || (i = xrvVar.f) == -1) {
                        aVar = vyk0Var;
                    } else {
                        aVar = new vrv(vyk0Var, i, this);
                        rgp0 s = m.this.s(new d(0, true));
                        this.k = s;
                        s.c(m.T);
                    }
                    ((do8) this.c).b(aVar, this.a, this.b.a.getResponseHeaders(), j, j2, this.d);
                    if (m.this.u != null && (pgqVar = ((do8) this.c).b) != null) {
                        pgq c = pgqVar.c();
                        if (c instanceof pf30) {
                            ((pf30) c).s = true;
                        }
                    }
                    if (this.h) {
                        l lVar = this.c;
                        long j3 = this.i;
                        pgq pgqVar2 = ((do8) lVar).b;
                        pgqVar2.getClass();
                        pgqVar2.seek(j, j3);
                        this.h = false;
                    }
                    while (i2 == 0 && !this.g) {
                        try {
                            this.e.a();
                            l lVar2 = this.c;
                            pzb0 pzb0Var = this.f;
                            do8 do8Var = (do8) lVar2;
                            pgq pgqVar3 = do8Var.b;
                            pgqVar3.getClass();
                            tel telVar = do8Var.c;
                            telVar.getClass();
                            i2 = pgqVar3.b(telVar, pzb0Var);
                            long a2 = ((do8) this.c).a();
                            if (a2 > m.this.k + j) {
                                this.e.d();
                                m mVar2 = m.this;
                                mVar2.s.post(mVar2.r);
                                j = a2;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else if (((do8) this.c).a() != -1) {
                        this.f.a = ((do8) this.c).a();
                    }
                    cvk.k(this.b);
                } catch (Throwable th) {
                    if (i2 != 1 && ((do8) this.c).a() != -1) {
                        this.f.a = ((do8) this.c).a();
                    }
                    cvk.k(this.b);
                    throw th;
                }
            }
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public final class c implements m0h0 {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        @Override // xsna.m0h0
        public final int b(w8s w8sVar, DecoderInputBuffer decoderInputBuffer, int i) {
            m mVar = m.this;
            if (mVar.v()) {
                return -3;
            }
            int i2 = this.b;
            mVar.q(i2);
            int C = mVar.w[i2].C(w8sVar, decoderInputBuffer, i, mVar.Q);
            if (C == -3) {
                mVar.r(i2);
            }
            return C;
        }

        @Override // xsna.m0h0
        public final boolean isReady() {
            m mVar = m.this;
            return !mVar.v() && mVar.w[this.b].x(mVar.Q);
        }

        @Override // xsna.m0h0
        public final void maybeThrowError() throws IOException {
            int i = this.b;
            m mVar = m.this;
            mVar.w[i].z();
            Loader loader = mVar.n;
            int c = mVar.e.c(mVar.G);
            IOException iOException = loader.c;
            if (iOException != null) {
                throw iOException;
            }
            Loader.c<? extends Loader.d> cVar = loader.b;
            if (cVar != null) {
                if (c == Integer.MIN_VALUE) {
                    c = cVar.b;
                }
                IOException iOException2 = cVar.f;
                if (iOException2 != null && cVar.g > c) {
                    throw iOException2;
                }
            }
        }

        @Override // xsna.m0h0
        public final int skipData(long j) {
            m mVar = m.this;
            if (mVar.v()) {
                return 0;
            }
            int i = this.b;
            mVar.q(i);
            p pVar = mVar.w[i];
            int v = pVar.v(j, mVar.Q);
            pVar.G(v);
            if (v == 0) {
                mVar.r(i);
            }
            return v;
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public static final class d {
        public final int a;
        public final boolean b;

        public d(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    public static final class e {
        public final qfp0 a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public e(qfp0 qfp0Var, boolean[] zArr) {
            this.a = qfp0Var;
            this.b = zArr;
            int i = qfp0Var.a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        S = Collections.unmodifiableMap(hashMap);
        a.C0043a c0043a = new a.C0043a();
        c0043a.a = "icy";
        c0043a.m = io20.q("application/x-icy");
        T = new androidx.media3.common.a(c0043a);
    }

    public m(Uri uri, androidx.media3.datasource.a aVar, do8 do8Var, androidx.media3.exoplayer.drm.b bVar, a.C0054a c0054a, androidx.media3.exoplayer.upstream.b bVar2, j.a aVar2, n nVar, xu1 xu1Var, @Nullable String str, int i, @Nullable androidx.media3.common.a aVar3, long j, @Nullable gtf0 gtf0Var) {
        this.b = uri;
        this.c = aVar;
        this.d = bVar;
        this.g = c0054a;
        this.e = bVar2;
        this.f = aVar2;
        this.h = nVar;
        this.i = xu1Var;
        this.j = str;
        this.k = i;
        this.l = aVar3;
        this.n = gtf0Var != null ? new Loader(gtf0Var) : new Loader("ProgressiveMediaPeriod");
        this.o = do8Var;
        this.m = j;
        this.p = new wwi();
        this.q = new sc4(this, 12);
        this.r = new o4(this, 17);
        this.s = y2r0.o(null);
        this.x = new d[0];
        this.w = new p[0];
        this.v = new a[0];
        this.N = C.TIME_UNSET;
        this.G = 1;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long a(long j, o3i0 o3i0Var) {
        l();
        if (!this.D.isSeekable()) {
            return 0L;
        }
        n3i0.a seekPoints = this.D.getSeekPoints(j);
        return o3i0Var.a(j, seekPoints.a.a, seekPoints.b.a);
    }

    @Override // androidx.media3.exoplayer.source.p.c
    public final void b() {
        this.s.post(this.q);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void d(b bVar, long j, long j2) {
        b bVar2 = bVar;
        if (this.E == C.TIME_UNSET && this.D != null) {
            long n = n(true);
            long j3 = n == Long.MIN_VALUE ? 0L : n + 10000;
            this.E = j3;
            this.h.v(j3, this.D, this.F);
        }
        vyk0 vyk0Var = bVar2.b;
        bpz bpzVar = new bpz(bVar2.j, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        this.e.getClass();
        this.f.f(bpzVar, 1, -1, null, 0, null, bVar2.i, this.E);
        this.Q = true;
        h.a aVar = this.t;
        aVar.getClass();
        aVar.d(this);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void discardBuffer(long j, boolean z) {
        if (this.B) {
            return;
        }
        l();
        if (o()) {
            return;
        }
        boolean[] zArr = this.C.c;
        int length = this.w.length;
        for (int i = 0; i < length; i++) {
            this.w[i].j(j, z, zArr[i]);
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(h.a aVar, long j) {
        this.t = aVar;
        androidx.media3.common.a aVar2 = this.l;
        if (aVar2 == null) {
            this.p.f();
            u();
        } else {
            track(0, 3).c(aVar2);
            t(new utw(new long[]{0}, new long[]{0}, C.TIME_UNSET));
            endTracks();
            this.N = j;
        }
    }

    @Override // xsna.rgq
    public final void endTracks() {
        this.y = true;
        this.s.post(this.q);
    }

    @Override // xsna.rgq
    public final void f(n3i0 n3i0Var) {
        this.s.post(new z(5, this, n3i0Var));
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final Loader.b g(b bVar, long j, long j2, IOException iOException, int i) {
        Loader.b bVar2;
        n3i0 n3i0Var;
        b bVar3 = bVar;
        vyk0 vyk0Var = bVar3.b;
        bpz bpzVar = new bpz(bVar3.j, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        y2r0.j0(bVar3.i);
        y2r0.j0(this.E);
        long b2 = this.e.b(new b.c(iOException, i));
        if (b2 == C.TIME_UNSET) {
            bVar2 = Loader.f;
        } else {
            int m = m();
            int i2 = m > this.P ? 1 : 0;
            if (this.L || !((n3i0Var = this.D) == null || n3i0Var.getDurationUs() == C.TIME_UNSET)) {
                this.P = m;
            } else if (!this.z || v()) {
                this.I = this.z;
                this.M = 0L;
                this.P = 0;
                for (p pVar : this.w) {
                    pVar.D(false);
                }
                bVar3.f.a = 0L;
                bVar3.i = 0L;
                bVar3.h = true;
                bVar3.l = false;
            } else {
                this.O = true;
                bVar2 = Loader.e;
            }
            bVar2 = new Loader.b(i2, b2);
        }
        this.f.g(bpzVar, 1, -1, null, 0, null, bVar3.i, this.E, iOException, !bVar2.a());
        return bVar2;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        long j;
        boolean z;
        l();
        if (this.Q || this.K == 0) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.N;
        }
        if (this.A) {
            int length = this.w.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                e eVar = this.C;
                if (eVar.b[i] && eVar.c[i]) {
                    p pVar = this.w[i];
                    synchronized (pVar) {
                        z = pVar.w;
                    }
                    if (!z) {
                        j = Math.min(j, this.w[i].q());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = n(false);
        }
        return j == Long.MIN_VALUE ? this.M : j;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final qfp0 getTrackGroups() {
        l();
        return this.C.a;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long h(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j) {
        d7q d7qVar;
        l();
        e eVar = this.C;
        qfp0 qfp0Var = eVar.a;
        boolean[] zArr3 = eVar.c;
        int i = this.K;
        int i2 = 0;
        for (int i3 = 0; i3 < d7qVarArr.length; i3++) {
            m0h0 m0h0Var = m0h0VarArr[i3];
            if (m0h0Var != null && (d7qVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) m0h0Var).b;
                fxc0.z(zArr3[i4]);
                this.K--;
                zArr3[i4] = false;
                m0h0VarArr[i3] = null;
            }
        }
        boolean z = !this.H ? j == 0 || this.B : i != 0;
        for (int i5 = 0; i5 < d7qVarArr.length; i5++) {
            if (m0h0VarArr[i5] == null && (d7qVar = d7qVarArr[i5]) != null) {
                fxc0.z(d7qVar.length() == 1);
                fxc0.z(d7qVar.getIndexInTrackGroup(0) == 0);
                int b2 = qfp0Var.b(d7qVar.getTrackGroup());
                fxc0.z(!zArr3[b2]);
                this.K++;
                zArr3[b2] = true;
                this.J = d7qVar.getSelectedFormat().t | this.J;
                m0h0VarArr[i5] = new c(b2);
                zArr2[i5] = true;
                if (!z) {
                    p pVar = this.w[b2];
                    z = (pVar.t() == 0 || pVar.F(j, true)) ? false : true;
                }
            }
        }
        if (this.K == 0) {
            this.O = false;
            this.I = false;
            this.J = false;
            Loader loader = this.n;
            if (loader.c()) {
                p[] pVarArr = this.w;
                int length = pVarArr.length;
                while (i2 < length) {
                    pVarArr[i2].k();
                    i2++;
                }
                loader.a();
            } else {
                this.Q = false;
                for (p pVar2 : this.w) {
                    pVar2.D(false);
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < m0h0VarArr.length) {
                if (m0h0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.H = true;
        return j;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void i(b bVar, long j, long j2, int i) {
        b bVar2 = bVar;
        vyk0 vyk0Var = bVar2.b;
        this.f.j(i == 0 ? new bpz(j, bVar2.j) : new bpz(bVar2.j, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b), 1, -1, null, 0, null, bVar2.i, this.E, i);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        return this.n.c() && this.p.e();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void j(b bVar, long j, long j2, boolean z) {
        b bVar2 = bVar;
        vyk0 vyk0Var = bVar2.b;
        bpz bpzVar = new bpz(bVar2.j, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        this.e.getClass();
        this.f.d(bpzVar, 1, -1, null, 0, null, bVar2.i, this.E);
        if (z) {
            return;
        }
        for (p pVar : this.w) {
            pVar.D(false);
        }
        if (this.K > 0) {
            h.a aVar = this.t;
            aVar.getClass();
            aVar.d(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        if (this.Q) {
            return false;
        }
        Loader loader = this.n;
        if (loader.b() || this.O) {
            return false;
        }
        if ((this.z || this.l != null) && this.K == 0) {
            return false;
        }
        boolean f = this.p.f();
        if (loader.c()) {
            return f;
        }
        u();
        return true;
    }

    public final void l() {
        fxc0.z(this.z);
        this.C.getClass();
        this.D.getClass();
    }

    public final int m() {
        int i = 0;
        for (p pVar : this.w) {
            i += pVar.q + pVar.p;
        }
        return i;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void maybeThrowPrepareError() throws IOException {
        int c2 = this.e.c(this.G);
        Loader loader = this.n;
        IOException iOException = loader.c;
        if (iOException != null) {
            throw iOException;
        }
        Loader.c<? extends Loader.d> cVar = loader.b;
        if (cVar != null) {
            if (c2 == Integer.MIN_VALUE) {
                c2 = cVar.b;
            }
            IOException iOException2 = cVar.f;
            if (iOException2 != null && cVar.g > c2) {
                throw iOException2;
            }
        }
        if (this.Q && !this.z) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final long n(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (i < this.w.length) {
            if (!z) {
                e eVar = this.C;
                eVar.getClass();
                i = eVar.c[i] ? 0 : i + 1;
            }
            j = Math.max(j, this.w[i].q());
        }
        return j;
    }

    public final boolean o() {
        return this.N != C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void onLoaderReleased() {
        for (p pVar : this.w) {
            pVar.D(true);
            DrmSession drmSession = pVar.h;
            if (drmSession != null) {
                drmSession.b(pVar.e);
                pVar.h = null;
                pVar.g = null;
            }
        }
        do8 do8Var = this.o;
        pgq pgqVar = do8Var.b;
        if (pgqVar != null) {
            pgqVar.release();
            do8Var.b = null;
        }
        do8Var.c = null;
    }

    public final void p() {
        long j;
        if (this.R || this.z || !this.y || this.D == null) {
            return;
        }
        for (p pVar : this.w) {
            if (pVar.w() == null) {
                return;
            }
        }
        this.p.d();
        int length = this.w.length;
        pfp0[] pfp0VarArr = new pfp0[length];
        boolean[] zArr = new boolean[length];
        int i = 0;
        while (true) {
            j = this.m;
            if (i >= length) {
                break;
            }
            androidx.media3.common.a w = this.w[i].w();
            w.getClass();
            String str = w.n;
            boolean l = io20.l(str);
            boolean z = l || io20.p(str);
            zArr[i] = z;
            this.A = z | this.A;
            this.B = j != C.TIME_UNSET && length == 1 && io20.n(str);
            xrv xrvVar = this.u;
            if (xrvVar != null) {
                int i2 = xrvVar.a;
                if (l || this.x[i].b) {
                    fi20 fi20Var = w.l;
                    fi20 fi20Var2 = fi20Var == null ? new fi20(xrvVar) : fi20Var.a(xrvVar);
                    a.C0043a a2 = w.a();
                    a2.k = fi20Var2;
                    w = new androidx.media3.common.a(a2);
                }
                if (l && w.h == -1 && w.i == -1 && i2 != -1) {
                    a.C0043a a3 = w.a();
                    a3.h = i2;
                    w = new androidx.media3.common.a(a3);
                }
            }
            int a4 = this.d.a(w);
            a.C0043a a5 = w.a();
            a5.N = a4;
            androidx.media3.common.a aVar = new androidx.media3.common.a(a5);
            pfp0VarArr[i] = new pfp0(Integer.toString(i), aVar);
            this.J = aVar.t | this.J;
            i++;
        }
        this.C = new e(new qfp0(pfp0VarArr), zArr);
        if (this.B && this.E == C.TIME_UNSET) {
            this.E = j;
            this.D = new b4e0(this, this.D);
        }
        this.h.v(this.E, this.D, this.F);
        this.z = true;
        h.a aVar2 = this.t;
        aVar2.getClass();
        aVar2.b(this);
    }

    public final void q(int i) {
        l();
        e eVar = this.C;
        boolean[] zArr = eVar.d;
        if (zArr[i]) {
            return;
        }
        androidx.media3.common.a aVar = eVar.a.a(i).d[0];
        this.f.b(io20.i(aVar.n), aVar, 0, null, this.M);
        zArr[i] = true;
    }

    public final void r(int i) {
        l();
        if (this.O) {
            if ((!this.A || this.C.b[i]) && !this.w[i].x(false)) {
                this.N = 0L;
                this.O = false;
                this.I = true;
                this.M = 0L;
                this.P = 0;
                for (p pVar : this.w) {
                    pVar.D(false);
                }
                h.a aVar = this.t;
                aVar.getClass();
                aVar.d(this);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long readDiscontinuity() {
        if (this.J) {
            this.J = false;
            return this.M;
        }
        if (!this.I) {
            return C.TIME_UNSET;
        }
        if (!this.Q && m() <= this.P) {
            return C.TIME_UNSET;
        }
        this.I = false;
        return this.M;
    }

    public final rgp0 s(d dVar) {
        int length = this.w.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.x[i])) {
                return this.w[i];
            }
        }
        if (this.y) {
            ahn.F("Extractor added new track (id=" + dVar.a + ") after finishing tracks.");
            return new k0n();
        }
        androidx.media3.exoplayer.drm.b bVar = this.d;
        bVar.getClass();
        p pVar = new p(this.i, bVar, this.g);
        a aVar = new a(pVar);
        pVar.f = this;
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.x, i2);
        dVarArr[length] = dVar;
        this.x = dVarArr;
        p[] pVarArr = (p[]) Arrays.copyOf(this.w, i2);
        pVarArr[length] = pVar;
        this.w = pVarArr;
        a[] aVarArr = (a[]) Arrays.copyOf(this.v, i2);
        aVarArr[length] = aVar;
        this.v = aVarArr;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        if (r3 != false) goto L51;
     */
    @Override // androidx.media3.exoplayer.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long seekToUs(long j) {
        l();
        boolean[] zArr = this.C.b;
        if (!this.D.isSeekable()) {
            j = 0;
        }
        this.I = false;
        boolean z = true;
        boolean z2 = this.M == j;
        this.M = j;
        if (o()) {
            this.N = j;
            return j;
        }
        int i = this.G;
        Loader loader = this.n;
        if (i != 7 && (this.Q || loader.c())) {
            int length = this.w.length;
            for (int i2 = 0; i2 < length; i2++) {
                p pVar = this.w[i2];
                if (this.v[i2].d.get() == a.EnumC0064a.PASS_THROUGH && (pVar.t() != 0 || !z2)) {
                    if (!(this.B ? pVar.E(pVar.q) : pVar.F(j, this.Q)) && (zArr[i2] || !this.A)) {
                        z = false;
                        break;
                    }
                }
            }
        }
        this.O = false;
        this.N = j;
        this.Q = false;
        this.J = false;
        if (loader.c()) {
            for (p pVar2 : this.w) {
                pVar2.k();
            }
            loader.a();
            return j;
        }
        loader.c = null;
        for (p pVar3 : this.w) {
            pVar3.D(false);
        }
        return j;
    }

    public final void t(n3i0 n3i0Var) {
        this.D = this.u == null ? n3i0Var : new n3i0.b(C.TIME_UNSET);
        this.E = n3i0Var.getDurationUs();
        boolean z = !this.L && n3i0Var.getDurationUs() == C.TIME_UNSET;
        this.F = z;
        this.G = z ? 7 : 1;
        if (this.z) {
            this.h.v(this.E, n3i0Var, z);
        } else {
            p();
        }
    }

    @Override // xsna.rgq
    public final rgp0 track(int i, int i2) {
        return s(new d(i, false));
    }

    public final void u() {
        b bVar = new b(this.b, this.c, this.o, this, this.p);
        if (this.z) {
            fxc0.z(o());
            long j = this.E;
            if (j != C.TIME_UNSET && this.N > j) {
                this.Q = true;
                this.N = C.TIME_UNSET;
                return;
            }
            n3i0 n3i0Var = this.D;
            n3i0Var.getClass();
            long j2 = n3i0Var.getSeekPoints(this.N).a.b;
            long j3 = this.N;
            bVar.f.a = j2;
            bVar.i = j3;
            bVar.h = true;
            bVar.l = false;
            for (p pVar : this.w) {
                pVar.t = this.N;
            }
            this.N = C.TIME_UNSET;
        }
        this.P = m();
        this.n.e(bVar, this, this.e.c(this.G));
    }

    public final boolean v() {
        return this.I || o();
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
    }
}
