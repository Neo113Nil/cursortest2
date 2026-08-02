package t2;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.a;
import androidx.media3.effect.SingleInputVideoGraph;
import androidx.media3.effect.l;
import b1.AbstractC2335D;
import b1.C2345N;
import b1.C2357k;
import b1.InterfaceC2360n;
import b1.W;
import b1.X;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.InterfaceC4148o;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import t2.InterfaceC6399i;
import t2.V0;

/* loaded from: classes.dex */
public final class n1 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    public final c f65457e;

    /* renamed from: f, reason: collision with root package name */
    public final a f65458f;

    /* renamed from: g, reason: collision with root package name */
    public final k1.f f65459g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f65460h;

    /* renamed from: i, reason: collision with root package name */
    public long f65461i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f65462j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC6399i.b f65463a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.a f65464b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC3445z f65465c;

        /* renamed from: d, reason: collision with root package name */
        public final List f65466d;

        /* renamed from: e, reason: collision with root package name */
        public final V0 f65467e;

        /* renamed from: f, reason: collision with root package name */
        public final A0 f65468f;

        /* renamed from: g, reason: collision with root package name */
        public final String f65469g;

        /* renamed from: h, reason: collision with root package name */
        public final int f65470h;

        /* renamed from: i, reason: collision with root package name */
        public final LogSessionId f65471i;

        /* renamed from: j, reason: collision with root package name */
        public C2345N f65472j;

        /* renamed from: k, reason: collision with root package name */
        public volatile InterfaceC6399i f65473k;

        /* renamed from: l, reason: collision with root package name */
        public volatile int f65474l;

        /* renamed from: m, reason: collision with root package name */
        public volatile boolean f65475m;

        public a(InterfaceC6399i.b bVar, androidx.media3.common.a aVar, AbstractC3445z abstractC3445z, List list, V0 v02, A0 a02, LogSessionId logSessionId) {
            AbstractC4134a.a(aVar.f20516D != null);
            this.f65463a = bVar;
            this.f65464b = aVar;
            this.f65465c = abstractC3445z;
            this.f65466d = list;
            this.f65467e = v02;
            this.f65468f = a02;
            this.f65471i = logSessionId;
            Pair f10 = f(aVar, v02);
            this.f65469g = (String) f10.first;
            this.f65470h = ((Integer) f10.second).intValue();
        }

        public static V0 a(V0 v02, boolean z10, androidx.media3.common.a aVar, androidx.media3.common.a aVar2, int i10) {
            V0.b a10 = v02.a();
            if (v02.f65181d != i10) {
                a10.c(i10);
            }
            if (!Objects.equals(aVar.f20543o, aVar2.f20543o)) {
                a10.e(aVar2.f20543o);
            }
            if (z10) {
                int i11 = aVar.f20550v;
                int i12 = aVar2.f20550v;
                if (i11 != i12) {
                    a10.d(i12);
                }
            } else {
                int i13 = aVar.f20551w;
                int i14 = aVar2.f20551w;
                if (i13 != i14) {
                    a10.d(i14);
                }
            }
            return a10.a();
        }

        public static Pair f(androidx.media3.common.a aVar, V0 v02) {
            String str = (String) AbstractC4134a.e(aVar.f20543o);
            String str2 = v02.f65180c;
            if (str2 != null) {
                str = str2;
            } else if (AbstractC2335D.q(str)) {
                str = "video/hevc";
            }
            return k1.f(v02.f65181d, str, aVar.f20516D);
        }

        public int b() {
            return this.f65470h;
        }

        public ByteBuffer c() {
            if (this.f65473k != null) {
                return this.f65473k.j();
            }
            return null;
        }

        public MediaCodec.BufferInfo d() {
            if (this.f65473k != null) {
                return this.f65473k.h();
            }
            return null;
        }

        public androidx.media3.common.a e() {
            if (this.f65473k == null) {
                return null;
            }
            androidx.media3.common.a outputFormat = this.f65473k.getOutputFormat();
            return (outputFormat == null || this.f65474l == 0) ? outputFormat : outputFormat.b().x0(this.f65474l).P();
        }

        public final C2357k g() {
            return (!C2357k.i(this.f65464b.f20516D) || this.f65470h == 0) ? C2357k.f24597h.equals(this.f65464b.f20516D) ? C2357k.f24596g : (C2357k) AbstractC4134a.e(this.f65464b.f20516D) : C2357k.f24596g;
        }

        public C2345N h(int i10, int i11) {
            if (this.f65475m) {
                return null;
            }
            C2345N c2345n = this.f65472j;
            if (c2345n != null) {
                return c2345n;
            }
            if (i10 < i11) {
                this.f65474l = 90;
                i11 = i10;
                i10 = i11;
            }
            if (this.f65464b.f20513A % 180 == this.f65474l % 180) {
                this.f65474l = this.f65464b.f20513A;
            }
            if (!this.f65465c.contains(Integer.valueOf(this.f65474l))) {
                int i12 = (this.f65474l + 180) % 360;
                if (this.f65465c.contains(Integer.valueOf(i12))) {
                    this.f65474l = i12;
                } else {
                    this.f65474l = ((Integer) this.f65465c.get(0)).intValue();
                    int i13 = i11;
                    i11 = i10;
                    i10 = i13;
                }
            }
            androidx.media3.common.a P10 = new a.b().F0(i10).h0(i11).x0(0).f0(this.f65464b.f20554z).y0(this.f65469g).V(g()).U(this.f65464b.f20539k).P();
            this.f65473k = this.f65463a.b(P10.b().y0(M0.j(P10, this.f65466d)).P(), this.f65471i);
            androidx.media3.common.a l10 = this.f65473k.l();
            this.f65468f.c(a(this.f65467e, this.f65474l != 0, P10, l10, this.f65470h));
            this.f65472j = new C2345N(this.f65473k.d(), l10.f20550v, l10.f20551w, this.f65474l, true);
            if (this.f65475m) {
                this.f65473k.release();
            }
            return this.f65472j;
        }

        public boolean i() {
            return this.f65473k != null && this.f65473k.b();
        }

        public void j() {
            if (this.f65473k != null) {
                this.f65473k.release();
            }
            this.f65475m = true;
        }

        public void k(boolean z10) {
            if (this.f65473k != null) {
                this.f65473k.i(z10);
            }
        }

        public void l() {
            if (this.f65473k != null) {
                this.f65473k.signalEndOfInputStream();
            }
        }
    }

    public static final class b implements C0 {

        /* renamed from: a, reason: collision with root package name */
        public final b1.X f65476a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65477b;

        /* renamed from: c, reason: collision with root package name */
        public final long f65478c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f65479d = new AtomicLong();

        public b(b1.X x10, int i10, long j10) {
            this.f65476a = x10;
            this.f65477b = i10;
            this.f65478c = j10;
        }

        public static androidx.media3.common.a i(androidx.media3.common.a aVar) {
            return aVar.f20513A % 180 == 0 ? aVar : aVar.b().F0(aVar.f20551w).h0(aVar.f20550v).x0(0).P();
        }

        public static int j(String str) {
            if (AbstractC2335D.q(str)) {
                return 2;
            }
            if (str.equals("video/raw")) {
                return 3;
            }
            if (AbstractC2335D.t(str)) {
                return 1;
            }
            throw new IllegalArgumentException("MIME type not supported " + str);
        }

        public static boolean k(E e10) {
            String scheme;
            z.h hVar = e10.f65013a.f24655b;
            if (hVar == null || (scheme = hVar.f24749a.getScheme()) == null) {
                return false;
            }
            return scheme.equals("transformer_surface_asset");
        }

        @Override // t2.L0
        public int b(Bitmap bitmap, e1.S s10) {
            return this.f65476a.m(this.f65477b, bitmap, s10) ? 1 : 2;
        }

        @Override // t2.J0
        public void c(E e10, long j10, androidx.media3.common.a aVar, boolean z10) {
            boolean k10 = k(e10);
            long b10 = e10.b(j10);
            if (aVar != null) {
                androidx.media3.common.a i10 = i(aVar);
                this.f65476a.d(this.f65477b, k10 ? 4 : j((String) AbstractC4134a.e(i10.f20543o)), i10, e10.f65019g.f65397b, this.f65479d.get() + this.f65478c);
            }
            this.f65479d.addAndGet(b10);
        }

        @Override // t2.L0
        public Surface d() {
            return this.f65476a.g(this.f65477b);
        }

        @Override // t2.L0
        public int e() {
            return this.f65476a.i(this.f65477b);
        }

        @Override // t2.L0
        public void g() {
            this.f65476a.l(this.f65477b);
        }

        @Override // t2.L0
        public boolean h(long j10) {
            return this.f65476a.b(this.f65477b);
        }
    }

    public final class c implements X.b {

        /* renamed from: a, reason: collision with root package name */
        public final b1.X f65480a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f65481b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC4148o f65482c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f65483d;

        /* renamed from: e, reason: collision with root package name */
        public final long f65484e;

        /* renamed from: f, reason: collision with root package name */
        public final int f65485f;

        /* renamed from: g, reason: collision with root package name */
        public int f65486g;

        /* renamed from: h, reason: collision with root package name */
        public int f65487h;

        public c(Context context, X.a aVar, C2357k c2357k, InterfaceC2360n interfaceC2360n, b1.U u10, List list, InterfaceC4148o interfaceC4148o, long j10, int i10, boolean z10) {
            this.f65482c = interfaceC4148o;
            this.f65483d = z10;
            this.f65484e = j10;
            this.f65485f = i10;
            b1.X a10 = aVar.a(context, c2357k, interfaceC2360n, this, Ta.r.a(), j10, z10);
            this.f65480a = a10;
            a10.f(list);
            a10.j(u10);
        }

        @Override // b1.X.b
        public void a(b1.V v10) {
            this.f65482c.accept(C6427w0.f(v10));
        }

        @Override // b1.X.b
        public void b(long j10, boolean z10) {
            if (this.f65483d) {
                return;
            }
            synchronized (this.f65481b) {
                this.f65487h++;
            }
            j();
        }

        @Override // b1.X.b
        public void c(long j10) {
            n1.this.f65460h = j10;
            try {
                n1.this.f65458f.l();
            } catch (C6427w0 e10) {
                this.f65482c.accept(e10);
            }
        }

        @Override // b1.X.b
        public void d(int i10, int i11) {
            C2345N c2345n;
            try {
                c2345n = n1.this.f65458f.h(i10, i11);
            } catch (C6427w0 e10) {
                this.f65482c.accept(e10);
                c2345n = null;
            }
            this.f65480a.c(c2345n);
        }

        public C0 f(int i10) {
            this.f65480a.k(i10);
            return new b(this.f65480a, i10, this.f65484e);
        }

        public boolean g() {
            boolean z10 = false;
            if (this.f65483d) {
                return false;
            }
            boolean z11 = n1.this.f65460h != -9223372036854775807L;
            synchronized (this.f65481b) {
                if (this.f65486g == 0 && z11) {
                    z10 = true;
                }
            }
            return z10;
        }

        public boolean h() {
            return this.f65480a.h();
        }

        public void i() {
            this.f65480a.initialize();
        }

        public final void j() {
            boolean z10;
            int i10;
            synchronized (this.f65481b) {
                try {
                    int i11 = this.f65487h;
                    if (i11 <= 0 || (i10 = this.f65486g) >= this.f65485f) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.f65486g = i10 + 1;
                        this.f65487h = i11 - 1;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                this.f65480a.a(-3L);
            }
        }

        public void k() {
            if (this.f65483d) {
                return;
            }
            synchronized (this.f65481b) {
                AbstractC4134a.g(this.f65486g > 0);
                this.f65486g--;
            }
            j();
        }

        public void l() {
            this.f65480a.release();
        }
    }

    public n1(Context context, androidx.media3.common.a aVar, V0 v02, b1.U u10, List list, W.b bVar, InterfaceC6399i.b bVar2, I0 i02, InterfaceC4148o interfaceC4148o, A0 a02, InterfaceC2360n interfaceC2360n, long j10, boolean z10, AbstractC3445z abstractC3445z, int i10, LogSessionId logSessionId) {
        super(aVar, i02);
        boolean z11 = i10 < 1;
        this.f65460h = -9223372036854775807L;
        this.f65461i = -9223372036854775807L;
        C2357k c2357k = (C2357k) AbstractC4134a.e(aVar.f20516D);
        C2357k a10 = c2357k.f24606c == 2 ? Objects.equals(aVar.f20543o, "image/jpeg_r") ? new C2357k.b().d(6).e(7).c(1).a() : C2357k.f24596g : c2357k;
        a aVar2 = new a(bVar2, aVar.b().V(a10).P(), abstractC3445z, i02.i(2), v02, a02, logSessionId);
        this.f65458f = aVar2;
        this.f65459g = new k1.f(0);
        if (aVar2.b() == 2 && C2357k.i(c2357k)) {
            a10 = C2357k.f24596g;
        }
        try {
            c cVar = new c(context, z10 ? new l.e(bVar) : new SingleInputVideoGraph.Factory(bVar), a10, interfaceC2360n, u10, list, interfaceC4148o, j10, i10, z11);
            this.f65457e = cVar;
            cVar.i();
        } catch (b1.V e10) {
            throw C6427w0.f(e10);
        }
    }

    @Override // t2.M0
    public C0 k(E e10, androidx.media3.common.a aVar, int i10) {
        try {
            return this.f65457e.f(i10);
        } catch (b1.V e11) {
            throw C6427w0.f(e11);
        }
    }

    @Override // t2.M0
    public k1.f l() {
        this.f65459g.f54108d = this.f65458f.c();
        if (this.f65459g.f54108d == null) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) AbstractC4134a.e(this.f65458f.d());
        if (bufferInfo.presentationTimeUs == 0 && this.f65457e.h() == this.f65462j && this.f65460h != -9223372036854775807L && bufferInfo.size > 0) {
            bufferInfo.presentationTimeUs = this.f65460h;
        }
        k1.f fVar = this.f65459g;
        fVar.f54110f = bufferInfo.presentationTimeUs;
        fVar.n(bufferInfo.flags);
        this.f65461i = bufferInfo.presentationTimeUs;
        return this.f65459g;
    }

    @Override // t2.M0
    public androidx.media3.common.a m() {
        return this.f65458f.e();
    }

    @Override // t2.M0
    public boolean n() {
        return this.f65458f.i() || this.f65457e.g();
    }

    @Override // t2.M0
    public void q() {
        this.f65457e.l();
        this.f65458f.j();
    }

    @Override // t2.M0
    public void r() {
        if (this.f65461i == 0) {
            this.f65462j = true;
        }
        this.f65458f.k(false);
        this.f65457e.k();
    }
}
