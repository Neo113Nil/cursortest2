package androidx.media3.transformer;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.transformer.a;
import androidx.media3.transformer.b0;
import androidx.media3.transformer.m;
import androidx.media3.transformer.t;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.a7l;
import xsna.c880;
import xsna.cs2;
import xsna.dvf;
import xsna.fxc0;
import xsna.g0h0;
import xsna.i2e0;
import xsna.io20;
import xsna.k5j;
import xsna.kv2;
import xsna.m6g;
import xsna.otu;
import xsna.qe9;
import xsna.y2r0;
import xsna.yh9;

/* compiled from: SequenceAssetLoader.java */
/* loaded from: classes12.dex */
public final class y implements androidx.media3.transformer.a, a.c {
    public static final androidx.media3.common.a A;
    public static final androidx.media3.common.a B;
    public final com.google.common.collect.g a;
    public final ImmutableSet<Integer> b;
    public final a c;
    public final a.C0070a d;
    public final b0.c e;
    public final otu f;
    public final HashMap g;
    public final HashMap h;
    public final ImmutableList.a<t.b> i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    public boolean l;
    public int m;
    public androidx.media3.transformer.a n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public androidx.media3.common.a t;
    public androidx.media3.common.a u;
    public volatile boolean v;
    public volatile long w;
    public volatile long x;
    public volatile boolean y;
    public volatile boolean z;

    /* compiled from: SequenceAssetLoader.java */
    public final class a implements a.b {
        public final a.b a;

        public a(a.b bVar) {
            this.a = bVar;
        }

        @Override // androidx.media3.transformer.a.b
        public final androidx.media3.transformer.a a(m mVar, Looper looper, a.c cVar, a.C0070a c0070a) {
            return m.d(mVar.a) ? y.this.new b(mVar.d) : this.a.a(mVar, looper, cVar, c0070a);
        }
    }

    /* compiled from: SequenceAssetLoader.java */
    public final class c implements g0h0 {
        public final g0h0 a;
        public final int b;
        public long c;

        public c(g0h0 g0h0Var, int i) {
            this.a = g0h0Var;
            this.b = i;
        }

        @Override // xsna.g0h0
        public final Surface b() {
            return this.a.b();
        }

        @Override // xsna.g0h0
        public final int d(Bitmap bitmap, k5j k5jVar) {
            return this.a.d(bitmap, k5jVar.a());
        }

        @Override // xsna.g0h0
        @Nullable
        public final DecoderInputBuffer e() {
            return this.a.e();
        }

        @Override // xsna.g0h0
        public final int f() {
            return this.a.f();
        }

        @Override // xsna.g0h0
        public final void g() {
            y yVar = y.this;
            AtomicInteger atomicInteger = yVar.k;
            atomicInteger.decrementAndGet();
            if (yVar.j()) {
                this.a.g();
            } else if (atomicInteger.get() == 0) {
                yVar.f.post(new kv2(this, 10));
            }
        }

        @Override // xsna.g0h0
        public final boolean h() {
            g0h0 g0h0Var = this.a;
            DecoderInputBuffer e = g0h0Var.e();
            e.getClass();
            if (e.b(4)) {
                y yVar = y.this;
                yVar.k.decrementAndGet();
                if (!yVar.j()) {
                    if (this.b == 1 && yVar.p) {
                        fxc0.z(g0h0Var.h());
                    } else {
                        e.c();
                        e.g = 0L;
                    }
                    if (yVar.k.get() == 0) {
                        yVar.f.post(new kv2(this, 10));
                    }
                    return true;
                }
            }
            fxc0.z(g0h0Var.h());
            return true;
        }

        @Override // xsna.g0h0
        public final boolean i(long j) {
            return this.a.i(j);
        }
    }

    static {
        a.C0043a c0043a = new a.C0043a();
        c0043a.m = io20.q("audio/mp4a-latm");
        c0043a.F = 44100;
        c0043a.E = 2;
        A = new androidx.media3.common.a(c0043a);
        a.C0043a c0043a2 = new a.C0043a();
        c0043a2.t = 1;
        c0043a2.u = 1;
        c0043a2.m = io20.q("image/raw");
        c0043a2.C = m6g.i;
        B = new androidx.media3.common.a(c0043a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(n nVar, a.b bVar, a.C0070a c0070a, b0.c cVar, dvf dvfVar, Looper looper) {
        ImmutableSet<Integer> immutableSet = nVar.b;
        this.b = immutableSet;
        com.google.common.collect.g gVar = nVar.a;
        if (!immutableSet.contains(-2)) {
            ImmutableList.a aVar = new ImmutableList.a();
            ImmutableList.b listIterator = gVar.listIterator(0);
            while (listIterator.hasNext()) {
                m mVar = (m) listIterator.next();
                if (m.d(mVar.a)) {
                    aVar.c(mVar);
                } else {
                    m.a a2 = mVar.a();
                    a2.b = mVar.b || !immutableSet.contains(1);
                    a2.c = mVar.c || !immutableSet.contains(2);
                    aVar.c(new m(a2));
                }
            }
            gVar = aVar.g();
        }
        this.a = gVar;
        a aVar2 = new a(bVar);
        this.c = aVar2;
        this.d = c0070a;
        this.e = cVar;
        this.f = dvfVar.createHandler(looper, null);
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new ImmutableList.a<>();
        this.j = new AtomicInteger();
        this.k = new AtomicInteger();
        this.l = true;
        this.n = aVar2.a((m) gVar.get(0), looper, this, c0070a);
    }

    @Override // androidx.media3.transformer.a.c
    public final void a(ExportException exportException) {
        this.e.a(exportException);
    }

    @Override // androidx.media3.transformer.a
    public final int c(i2e0 i2e0Var) {
        int c2 = this.n.c(i2e0Var);
        int i = this.a.e;
        if (i == 1 || c2 == 0) {
            return c2;
        }
        int X = y2r0.X(this.m, i);
        if (c2 == 2) {
            X += i2e0Var.a / i;
        }
        i2e0Var.a = X;
        return 2;
    }

    @Override // androidx.media3.transformer.a.c
    public final boolean d(int i, androidx.media3.common.a aVar) {
        boolean z;
        boolean z2;
        boolean z3 = c0.c(aVar.n) == 1;
        LinkedHashMap linkedHashMap = a7l.a;
        synchronized (a7l.class) {
        }
        if (z3) {
            this.t = aVar;
        } else {
            this.u = aVar;
        }
        if (!this.l) {
            boolean z4 = z3 ? this.p : this.q;
            if (z4) {
                return z4;
            }
            fxc0.p((i & 1) != 0);
            return z4;
        }
        if (this.j.get() == 1) {
            boolean z5 = this.b.contains(1) && !z3;
            if (this.b.contains(2) && z3) {
                z2 = true;
                z = z5;
            } else {
                z2 = false;
                z = z5;
            }
        } else {
            z = false;
            z2 = false;
        }
        if (!this.o) {
            this.e.e(this.j.get() + ((z || z2) ? 1 : 0));
            this.o = true;
        }
        boolean d = this.e.d(i, aVar);
        if (z3) {
            this.p = d;
        } else {
            this.q = d;
        }
        if (z) {
            this.e.d(2, A);
            this.p = true;
        }
        if (z2) {
            this.e.d(2, B);
            this.q = true;
        }
        return d;
    }

    @Override // androidx.media3.transformer.a.c
    public final void e(int i) {
        this.j.set(i);
        this.k.set(i);
    }

    @Override // androidx.media3.transformer.a.c
    public final void f(long j) {
        fxc0.l(this.m, "Could not retrieve required duration for EditedMediaItem %s", j != C.TIME_UNSET || j());
        this.x = ((m) this.a.get(this.m)).b(j);
        this.w = j;
        if (this.a.e == 1) {
            this.e.getClass();
        }
    }

    @Override // androidx.media3.transformer.a
    public final ImmutableMap<Integer, String> g() {
        return this.n.g();
    }

    public final void h() {
        int i = this.r;
        com.google.common.collect.g gVar = this.a;
        int i2 = i * gVar.e;
        int i3 = this.m;
        if (i2 + i3 >= this.s) {
            ImmutableMap<Integer, String> g = this.n.g();
            this.i.c(new t.b(this.w, this.t, this.u, g.get(1), g.get(2)));
            this.s++;
        }
    }

    public final void i(Bitmap bitmap) {
        c cVar = (c) this.g.get(2);
        cVar.getClass();
        if (cVar.a.d(bitmap, new k5j(0, this.w, 30.0f).a()) != 1) {
            this.f.postDelayed(new qe9(5, this, bitmap), 10L);
        } else {
            cVar.g();
        }
    }

    public final boolean j() {
        return this.m == this.a.e - 1;
    }

    public final void k(int i, @Nullable androidx.media3.common.a aVar) {
        c880 c880Var = (c880) this.h.get(Integer.valueOf(i));
        if (c880Var == null) {
            return;
        }
        m mVar = (m) this.a.get(this.m);
        long j = this.w;
        if (m.d(mVar.a) && i == 1) {
            aVar = null;
        }
        c880Var.a(mVar, j, aVar, j());
    }

    @Override // androidx.media3.transformer.a.c
    @Nullable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final c b(androidx.media3.common.a aVar) throws ExportException {
        c cVar;
        int c2 = c0.c(aVar.n);
        y2r0.H(c2);
        LinkedHashMap linkedHashMap = a7l.a;
        synchronized (a7l.class) {
        }
        if (this.l) {
            if (c2 == 2) {
                this.z = true;
            } else {
                this.y = true;
            }
            g0h0 b2 = this.e.b(aVar);
            if (b2 == null) {
                return null;
            }
            cVar = new c(b2, c2);
            this.g.put(Integer.valueOf(c2), cVar);
            if (this.j.get() == 1) {
                if (this.b.contains(1) && c2 == 2) {
                    b0.c cVar2 = this.e;
                    a.C0043a a2 = A.a();
                    a2.m = io20.q(MimeTypes.AUDIO_RAW);
                    a2.G = 2;
                    g0h0 b3 = cVar2.b(new androidx.media3.common.a(a2));
                    b3.getClass();
                    this.g.put(1, new c(b3, 1));
                } else if (this.b.contains(2) && c2 == 1) {
                    g0h0 b4 = this.e.b(B);
                    b4.getClass();
                    this.g.put(2, new c(b4, 2));
                }
            }
        } else {
            String str = c2 == 1 ? "The preceding MediaItem does not contain any audio track. If the sequence starts with an item without audio track (like images), followed by items with audio tracks, then EditedMediaItemSequence.Builder.experimentalSetForceAudioTrack() needs to be set to true." : "The preceding MediaItem does not contain any video track. If the sequence starts with an item without video track (audio only), followed by items with video tracks, then EditedMediaItemSequence.Builder.experimentalSetForceVideoTrack() needs to be set to true.";
            cVar = (c) this.g.get(Integer.valueOf(c2));
            fxc0.t(cVar, str);
        }
        k(c2, aVar);
        if (this.j.get() == 1 && this.g.size() == 2) {
            if (c2 == 1) {
                k(2, B);
                this.k.incrementAndGet();
                this.f.post(new cs2(this, 14));
                return cVar;
            }
            k(1, null);
        }
        return cVar;
    }

    @Override // androidx.media3.transformer.a
    public final void release() {
        this.n.release();
        this.v = true;
    }

    @Override // androidx.media3.transformer.a
    public final void start() {
        this.n.start();
        if (this.a.e <= 1) {
            return;
        }
        this.e.getClass();
    }

    /* compiled from: SequenceAssetLoader.java */
    public final class b implements androidx.media3.transformer.a {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final androidx.media3.common.a d;
        public final androidx.media3.common.a e;
        public boolean f;
        public boolean g;

        public b(long j) {
            this.a = j;
            boolean z = y.this.y || y.this.b.contains(1);
            this.b = z;
            boolean z2 = y.this.z || y.this.b.contains(2);
            this.c = z2;
            fxc0.z(z || z2);
            a.C0043a c0043a = new a.C0043a();
            c0043a.m = io20.q(MimeTypes.AUDIO_RAW);
            this.d = new androidx.media3.common.a(c0043a);
            a.C0043a c0043a2 = new a.C0043a();
            c0043a2.m = io20.q(MimeTypes.AUDIO_RAW);
            c0043a2.F = 44100;
            c0043a2.E = 2;
            c0043a2.G = 2;
            this.e = new androidx.media3.common.a(c0043a2);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: RuntimeException -> 0x0050, ExportException -> 0x0052, TRY_LEAVE, TryCatch #2 {ExportException -> 0x0052, RuntimeException -> 0x0050, blocks: (B:37:0x0027, B:40:0x0031, B:42:0x003b, B:44:0x0041, B:45:0x004d, B:17:0x0056, B:21:0x0073, B:34:0x005f), top: B:36:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            boolean z = false;
            boolean z2 = true;
            boolean z3 = this.b && !this.f;
            boolean z4 = this.c && !this.g;
            fxc0.z(z3 || z4);
            y yVar = y.this;
            if (z3) {
                try {
                    c b = yVar.b(this.e);
                    if (b == null) {
                        z = true;
                    } else {
                        y yVar2 = y.this;
                        if (yVar2.k.decrementAndGet() == 0 && !yVar2.j()) {
                            yVar2.f.post(new kv2(b, 10));
                        }
                        this.f = true;
                    }
                } catch (ExportException e) {
                    yVar.a(e);
                    return;
                } catch (RuntimeException e2) {
                    yVar.a(ExportException.a(1000, e2));
                    return;
                }
            }
            if (z4) {
                if (yVar.b(y.B) == null) {
                    if (z2) {
                        return;
                    }
                    yVar.f.postDelayed(new yh9(this, 7), 10L);
                    return;
                }
                yVar.i(Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888));
                this.g = true;
            }
            z2 = z;
            if (z2) {
            }
        }

        @Override // androidx.media3.transformer.a
        public final int c(i2e0 i2e0Var) {
            boolean z = this.b && !this.f;
            boolean z2 = this.c && !this.g;
            if (z && z2) {
                i2e0Var.a = 0;
                return 2;
            }
            if (z || z2) {
                i2e0Var.a = 50;
                return 2;
            }
            i2e0Var.a = 99;
            return 2;
        }

        @Override // androidx.media3.transformer.a
        public final ImmutableMap<Integer, String> g() {
            return com.google.common.collect.h.h;
        }

        @Override // androidx.media3.transformer.a
        public final void start() {
            long j = this.a;
            y yVar = y.this;
            yVar.f(j);
            boolean z = this.c;
            boolean z2 = this.b;
            yVar.e((z2 && z) ? 2 : 1);
            if (z2) {
                yVar.d(2, this.d);
            }
            if (z) {
                yVar.d(2, y.B);
            }
            a();
        }

        @Override // androidx.media3.transformer.a
        public final void release() {
        }
    }
}
