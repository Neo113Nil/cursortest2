package t2;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.a;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4134a;
import e1.C4147n;
import e1.InterfaceC4143j;
import e1.InterfaceC4152t;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l1.AbstractC5366l;
import t2.C6429x0;
import t2.InterfaceC6383a;
import t2.R0;

/* loaded from: classes.dex */
public final class R0 implements InterfaceC6383a, InterfaceC6383a.c {

    /* renamed from: E, reason: collision with root package name */
    public static final androidx.media3.common.a f65122E = new a.b().y0("audio/mp4a-latm").z0(AudioFormat.AUDIO_SAMPLE_RATE_44100).T(2).P();

    /* renamed from: F, reason: collision with root package name */
    public static final androidx.media3.common.a f65123F = new a.b().F0(1).h0(1).y0("image/raw").V(C2357k.f24597h).P();

    /* renamed from: A, reason: collision with root package name */
    public volatile long f65124A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f65125B;

    /* renamed from: C, reason: collision with root package name */
    public volatile boolean f65126C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f65127D;

    /* renamed from: a, reason: collision with root package name */
    public final List f65128a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65129b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65130c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65131d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6383a.b f65132e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC6383a.C0908a f65133f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC6383a.c f65134g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4152t f65135h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f65136i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f65137j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC3445z.a f65138k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f65139l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f65140m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f65141n;

    /* renamed from: o, reason: collision with root package name */
    public int f65142o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC6383a f65143p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f65144q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f65145r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f65146s;

    /* renamed from: t, reason: collision with root package name */
    public int f65147t;

    /* renamed from: u, reason: collision with root package name */
    public int f65148u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.media3.common.a f65149v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.media3.common.a f65150w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f65151x;

    /* renamed from: y, reason: collision with root package name */
    public volatile long f65152y;

    /* renamed from: z, reason: collision with root package name */
    public volatile long f65153z;

    public static final class b implements e1.S {

        /* renamed from: a, reason: collision with root package name */
        public final e1.S f65154a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65155b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f65156c;

        public b(e1.S s10, long j10) {
            this.f65154a = s10;
            this.f65155b = j10;
        }

        @Override // e1.S
        public e1.S a() {
            return new b(this.f65154a.a(), this.f65155b);
        }

        @Override // e1.S
        public boolean hasNext() {
            return !this.f65156c && this.f65154a.hasNext();
        }

        @Override // e1.S
        public long next() {
            AbstractC4134a.g(hasNext());
            long next = this.f65154a.next();
            if (this.f65155b <= next) {
                this.f65156c = true;
            }
            return next;
        }
    }

    public final class c implements InterfaceC6383a.b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC6383a.b f65157a;

        public c(InterfaceC6383a.b bVar) {
            this.f65157a = bVar;
        }

        @Override // t2.InterfaceC6383a.b
        public InterfaceC6383a a(E e10, Looper looper, InterfaceC6383a.c cVar, InterfaceC6383a.C0908a c0908a) {
            return e10.c() ? new d(e10.f65017e) : this.f65157a.a(e10, looper, cVar, c0908a);
        }
    }

    public final class d implements InterfaceC6383a {

        /* renamed from: a, reason: collision with root package name */
        public final long f65159a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65160b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f65161c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.media3.common.a f65162d;

        /* renamed from: e, reason: collision with root package name */
        public final androidx.media3.common.a f65163e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f65164f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f65165g;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: RuntimeException -> 0x0037, w0 -> 0x0039, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0037, w0 -> 0x0039, blocks: (B:37:0x0025, B:40:0x0031, B:17:0x003d, B:21:0x0058, B:34:0x004a), top: B:36:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b() {
            boolean z10 = false;
            boolean z11 = true;
            boolean z12 = this.f65160b && !this.f65164f;
            boolean z13 = this.f65161c && !this.f65165g;
            AbstractC4134a.g(z12 || z13);
            if (z12) {
                try {
                    e a10 = R0.this.a(this.f65163e);
                    if (a10 == null) {
                        z10 = true;
                    } else {
                        a10.j();
                        this.f65164f = true;
                    }
                } catch (RuntimeException e10) {
                    R0.this.d(C6427w0.a(e10, 1000));
                    return;
                } catch (C6427w0 e11) {
                    R0.this.d(e11);
                    return;
                }
            }
            if (z13) {
                if (R0.this.a(R0.f65123F) == null) {
                    if (z11) {
                        return;
                    }
                    R0.this.f65135h.k(new Runnable() { // from class: t2.S0
                        @Override // java.lang.Runnable
                        public final void run() {
                            R0.d.this.b();
                        }
                    }, 10L);
                    return;
                }
                R0.this.O(R0.M());
                this.f65165g = true;
            }
            z11 = z10;
            if (z11) {
            }
        }

        @Override // t2.InterfaceC6383a
        public int e(K0 k02) {
            boolean z10 = this.f65160b && !this.f65164f;
            boolean z11 = this.f65161c && !this.f65165g;
            if (z10 && z11) {
                k02.f65093a = 0;
                return 2;
            }
            if (z10 || z11) {
                k02.f65093a = 50;
                return 2;
            }
            k02.f65093a = 99;
            return 2;
        }

        @Override // t2.InterfaceC6383a
        public com.google.common.collect.B g() {
            return com.google.common.collect.B.m();
        }

        @Override // t2.InterfaceC6383a
        public void start() {
            R0.this.f(this.f65159a);
            R0.this.c((this.f65160b && this.f65161c) ? 2 : 1);
            if (this.f65160b) {
                R0.this.b(this.f65162d, 2);
            }
            if (this.f65161c) {
                R0.this.b(R0.f65123F, 2);
            }
            b();
        }

        public d(long j10) {
            this.f65159a = j10;
            boolean z10 = true;
            boolean z11 = R0.this.f65126C || R0.this.f65130c;
            this.f65160b = z11;
            boolean z12 = R0.this.f65127D || R0.this.f65131d;
            this.f65161c = z12;
            if (!z11 && !z12) {
                z10 = false;
            }
            AbstractC4134a.g(z10);
            this.f65162d = new a.b().y0("audio/raw").P();
            this.f65163e = new a.b().y0("audio/raw").z0(AudioFormat.AUDIO_SAMPLE_RATE_44100).T(2).s0(2).P();
        }

        @Override // t2.InterfaceC6383a
        public void release() {
        }
    }

    public final class e implements L0 {

        /* renamed from: a, reason: collision with root package name */
        public final L0 f65167a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65168b;

        /* renamed from: c, reason: collision with root package name */
        public long f65169c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f65170d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f65171e;

        public e(L0 l02, int i10) {
            this.f65167a = l02;
            this.f65168b = i10;
        }

        public static /* synthetic */ void c(e eVar) {
            eVar.getClass();
            try {
                if (R0.this.f65151x) {
                    return;
                }
                R0.this.K();
                eVar.f65169c += R0.this.f65153z;
                R0.this.f65143p.release();
                R0.this.f65141n = false;
                R0.q(R0.this);
                if (R0.this.f65142o == R0.this.f65128a.size()) {
                    R0.this.f65142o = 0;
                    R0.s(R0.this);
                }
                E e10 = (E) R0.this.f65128a.get(R0.this.f65142o);
                R0 r02 = R0.this;
                InterfaceC6383a.b bVar = r02.f65132e;
                Looper looper = (Looper) AbstractC4134a.e(Looper.myLooper());
                R0 r03 = R0.this;
                r02.f65143p = bVar.a(e10, looper, r03, r03.f65133f);
                R0.this.f65143p.start();
            } catch (RuntimeException e11) {
                R0.this.d(C6427w0.a(e11, 1000));
            }
        }

        @Override // t2.L0
        public boolean a() {
            k1.f fVar = (k1.f) AbstractC4134a.i(this.f65167a.f());
            long j10 = this.f65169c + fVar.f54110f;
            if (R0.this.f65129b && (j10 >= R0.this.f65124A || this.f65170d)) {
                if (R0.this.f65125B && !this.f65170d) {
                    ((ByteBuffer) AbstractC4134a.e(fVar.f54108d)).limit(0);
                    fVar.n(4);
                    AbstractC4134a.g(this.f65167a.a());
                    this.f65170d = true;
                    R0.this.f65140m.decrementAndGet();
                }
                return false;
            }
            if (fVar.i()) {
                R0.this.f65140m.decrementAndGet();
                if (!R0.this.P() || R0.this.f65129b) {
                    if (this.f65168b == 1 && !R0.this.f65129b && R0.this.f65145r) {
                        AbstractC4134a.g(this.f65167a.a());
                    } else {
                        fVar.f();
                        fVar.f54110f = 0L;
                    }
                    if (R0.this.f65140m.get() == 0) {
                        k();
                    }
                    return true;
                }
            }
            AbstractC4134a.g(this.f65167a.a());
            return true;
        }

        @Override // t2.L0
        public int b(Bitmap bitmap, e1.S s10) {
            if (R0.this.f65129b) {
                long j10 = -9223372036854775807L;
                while (true) {
                    if (!s10.hasNext()) {
                        break;
                    }
                    long next = s10.next();
                    if (this.f65169c + next <= R0.this.f65124A) {
                        j10 = next;
                    } else {
                        if (!R0.this.f65125B) {
                            return 2;
                        }
                        if (j10 == -9223372036854775807L) {
                            if (this.f65171e) {
                                return 2;
                            }
                            this.f65171e = true;
                            g();
                            return 3;
                        }
                        b bVar = new b(s10.a(), j10);
                        this.f65171e = true;
                        s10 = bVar;
                    }
                }
            }
            return this.f65167a.b(bitmap, s10.a());
        }

        @Override // t2.L0
        public Surface d() {
            return this.f65167a.d();
        }

        @Override // t2.L0
        public int e() {
            return this.f65167a.e();
        }

        @Override // t2.L0
        public k1.f f() {
            return this.f65167a.f();
        }

        @Override // t2.L0
        public void g() {
            R0.this.f65140m.decrementAndGet();
            if (R0.this.f65129b ? this.f65171e : R0.this.P()) {
                this.f65167a.g();
            } else if (R0.this.f65140m.get() == 0) {
                k();
            }
        }

        @Override // t2.L0
        public boolean h(long j10) {
            long j11 = this.f65169c + j10;
            if (!R0.this.f65129b || j11 < R0.this.f65124A) {
                return this.f65167a.h(j10);
            }
            if (!R0.this.f65125B || this.f65171e) {
                return false;
            }
            this.f65171e = true;
            g();
            return false;
        }

        public final void j() {
            if (R0.this.f65140m.decrementAndGet() != 0 || R0.this.P()) {
                return;
            }
            k();
        }

        public final void k() {
            R0.this.f65135h.j(new Runnable() { // from class: t2.T0
                @Override // java.lang.Runnable
                public final void run() {
                    R0.e.c(R0.e.this);
                }
            });
        }
    }

    public R0(F f10, InterfaceC6383a.b bVar, InterfaceC6383a.C0908a c0908a, InterfaceC6383a.c cVar, InterfaceC4143j interfaceC4143j, Looper looper) {
        AbstractC3445z abstractC3445z = f10.f65031a;
        this.f65128a = abstractC3445z;
        this.f65129b = f10.f65032b;
        this.f65130c = f10.f65033c;
        this.f65131d = f10.f65034d;
        c cVar2 = new c(bVar);
        this.f65132e = cVar2;
        this.f65133f = c0908a;
        this.f65134g = cVar;
        this.f65135h = interfaceC4143j.d(looper, null);
        this.f65136i = new HashMap();
        this.f65137j = new HashMap();
        this.f65138k = new AbstractC3445z.a();
        this.f65139l = new AtomicInteger();
        this.f65140m = new AtomicInteger();
        this.f65141n = true;
        this.f65143p = cVar2.a((E) abstractC3445z.get(0), looper, this, c0908a);
    }

    public static Bitmap M() {
        return Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888);
    }

    public static /* synthetic */ void i(R0 r02) {
        r02.getClass();
        r02.O(M());
    }

    public static /* synthetic */ int q(R0 r02) {
        int i10 = r02.f65142o;
        r02.f65142o = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int s(R0 r02) {
        int i10 = r02.f65147t;
        r02.f65147t = i10 + 1;
        return i10;
    }

    public final void K() {
        int size = this.f65147t * this.f65128a.size();
        int i10 = this.f65142o;
        if (size + i10 >= this.f65148u) {
            b1.z zVar = ((E) this.f65128a.get(i10)).f65013a;
            com.google.common.collect.B g10 = g();
            this.f65138k.a(new C6429x0.c(zVar, this.f65152y, this.f65149v, this.f65150w, (String) g10.get(1), (String) g10.get(2)));
            this.f65148u++;
        }
    }

    public void L(J0 j02, int i10) {
        AbstractC4134a.a(i10 == 1 || i10 == 2);
        AbstractC4134a.a(this.f65137j.get(Integer.valueOf(i10)) == null);
        this.f65137j.put(Integer.valueOf(i10), j02);
    }

    public AbstractC3445z N() {
        K();
        return this.f65138k.m();
    }

    public final void O(final Bitmap bitmap) {
        e eVar = (e) AbstractC4134a.e((e) this.f65136i.get(2));
        if (eVar.b(bitmap, new C4147n(this.f65152y, 30.0f)) != 1) {
            this.f65135h.k(new Runnable() { // from class: t2.P0
                @Override // java.lang.Runnable
                public final void run() {
                    R0.this.O(bitmap);
                }
            }, 10L);
        } else {
            eVar.g();
        }
    }

    public final boolean P() {
        return this.f65142o == this.f65128a.size() - 1;
    }

    public final void Q(int i10, androidx.media3.common.a aVar) {
        J0 j02 = (J0) this.f65137j.get(Integer.valueOf(i10));
        if (j02 == null) {
            return;
        }
        E e10 = (E) this.f65128a.get(this.f65142o);
        long j10 = (i10 == 1 && this.f65129b && this.f65145r) ? -9223372036854775807L : this.f65152y;
        if (e10.c() && i10 == 1) {
            aVar = null;
        }
        j02.c(e10, j10, aVar, P());
    }

    @Override // t2.InterfaceC6383a.c
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public e a(androidx.media3.common.a aVar) {
        e eVar;
        int g10 = k1.g(aVar.f20543o);
        AbstractC5366l.f("AssetLoader", "OutputFormat", -9223372036854775807L, "%s:%s", e1.Z.z0(g10), aVar);
        if (this.f65141n) {
            if (g10 == 2) {
                this.f65127D = true;
            } else {
                this.f65126C = true;
            }
            L0 a10 = this.f65134g.a(aVar);
            if (a10 == null) {
                return null;
            }
            eVar = new e(a10, g10);
            this.f65136i.put(Integer.valueOf(g10), eVar);
            if (this.f65139l.get() == 1) {
                if (this.f65130c && g10 == 2) {
                    this.f65136i.put(1, new e((L0) AbstractC4134a.i(this.f65134g.a(f65122E.b().y0("audio/raw").s0(2).P())), 1));
                } else if (this.f65131d && g10 == 1) {
                    this.f65136i.put(2, new e((L0) AbstractC4134a.i(this.f65134g.a(f65123F)), 2));
                }
            }
        } else {
            eVar = (e) AbstractC4134a.j((e) this.f65136i.get(Integer.valueOf(g10)), g10 == 1 ? "The preceding MediaItem does not contain any audio track. If the sequence starts with an item without audio track (like images), followed by items with audio tracks, then EditedMediaItemSequence.Builder.experimentalSetForceAudioTrack() needs to be set to true." : "The preceding MediaItem does not contain any video track. If the sequence starts with an item without video track (audio only), followed by items with video tracks, then EditedMediaItemSequence.Builder.experimentalSetForceVideoTrack() needs to be set to true.");
        }
        Q(g10, aVar);
        if (this.f65139l.get() == 1 && this.f65136i.size() == 2) {
            if (g10 == 1) {
                Q(2, f65123F);
                this.f65140m.incrementAndGet();
                this.f65135h.j(new Runnable() { // from class: t2.Q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        R0.i(R0.this);
                    }
                });
                return eVar;
            }
            Q(1, null);
        }
        return eVar;
    }

    public void S(long j10, boolean z10) {
        this.f65124A = j10;
        this.f65125B = z10;
    }

    @Override // t2.InterfaceC6383a.c
    public boolean b(androidx.media3.common.a aVar, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = k1.g(aVar.f20543o) == 1;
        AbstractC5366l.f("AssetLoader", "InputFormat", -9223372036854775807L, "%s:%s", z12 ? "audio" : "video", aVar);
        if (z12) {
            this.f65149v = aVar;
        } else {
            this.f65150w = aVar;
        }
        if (!this.f65141n) {
            boolean z13 = z12 ? this.f65145r : this.f65146s;
            if (z13) {
                AbstractC4134a.a((i10 & 2) != 0);
                return z13;
            }
            AbstractC4134a.a((i10 & 1) != 0);
            return z13;
        }
        if (this.f65139l.get() == 1) {
            boolean z14 = this.f65130c && !z12;
            if (this.f65131d && z12) {
                z11 = true;
                z10 = z14;
            } else {
                z11 = false;
                z10 = z14;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        if (!this.f65144q) {
            this.f65134g.c(this.f65139l.get() + ((z10 || z11) ? 1 : 0));
            this.f65144q = true;
        }
        boolean b10 = this.f65134g.b(aVar, i10);
        if (z12) {
            this.f65145r = b10;
        } else {
            this.f65146s = b10;
        }
        if (z10) {
            this.f65134g.b(f65122E, 2);
            this.f65145r = true;
        }
        if (z11) {
            this.f65134g.b(f65123F, 2);
            this.f65146s = true;
        }
        return b10;
    }

    @Override // t2.InterfaceC6383a.c
    public void c(int i10) {
        this.f65139l.set(i10);
        this.f65140m.set(i10);
    }

    @Override // t2.InterfaceC6383a.c
    public void d(C6427w0 c6427w0) {
        this.f65134g.d(c6427w0);
    }

    @Override // t2.InterfaceC6383a
    public int e(K0 k02) {
        if (this.f65129b) {
            return 3;
        }
        int e10 = this.f65143p.e(k02);
        int size = this.f65128a.size();
        if (size == 1 || e10 == 0) {
            return e10;
        }
        int k12 = e1.Z.k1(this.f65142o, size);
        if (e10 == 2) {
            k12 += k02.f65093a / size;
        }
        k02.f65093a = k12;
        return 2;
    }

    @Override // t2.InterfaceC6383a.c
    public void f(long j10) {
        AbstractC4134a.b(j10 != -9223372036854775807L || P(), "Could not retrieve required duration for EditedMediaItem " + this.f65142o);
        this.f65153z = ((E) this.f65128a.get(this.f65142o)).b(j10);
        this.f65152y = j10;
        if (this.f65128a.size() != 1 || this.f65129b) {
            return;
        }
        this.f65134g.f(this.f65153z);
    }

    @Override // t2.InterfaceC6383a
    public com.google.common.collect.B g() {
        return this.f65143p.g();
    }

    @Override // t2.InterfaceC6383a
    public void release() {
        this.f65143p.release();
        this.f65151x = true;
    }

    @Override // t2.InterfaceC6383a
    public void start() {
        this.f65143p.start();
        if (this.f65128a.size() > 1 || this.f65129b) {
            this.f65134g.f(-9223372036854775807L);
        }
    }
}
