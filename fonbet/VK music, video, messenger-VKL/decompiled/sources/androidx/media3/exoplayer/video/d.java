package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.Range;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.a;
import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.c;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahn;
import xsna.aw5;
import xsna.bv9;
import xsna.dds0;
import xsna.dvf;
import xsna.dwo0;
import xsna.fin0;
import xsna.fqn0;
import xsna.frl;
import xsna.fxc0;
import xsna.g7l;
import xsna.gms0;
import xsna.iza0;
import xsna.jxj0;
import xsna.kms0;
import xsna.kzm;
import xsna.m6g;
import xsna.mms0;
import xsna.njn0;
import xsna.otu;
import xsna.ouj0;
import xsna.p6q;
import xsna.p8p;
import xsna.qhz;
import xsna.sm9;
import xsna.tn9;
import xsna.tw3;
import xsna.uns0;
import xsna.vy10;
import xsna.xgt0;
import xsna.y2r0;
import xsna.zhn0;

/* compiled from: PlaybackVideoGraphWrapper.java */
/* loaded from: classes12.dex */
public final class d implements uns0.b {
    public static final frl B = new frl();
    public int A;
    public final Context a;
    public final g b;
    public final SparseArray<C0069d> c;
    public final boolean d;
    public final androidx.media3.exoplayer.video.a e;
    public final a f;
    public final dvf g;
    public final CopyOnWriteArraySet<e> h;
    public final long i;
    public final mms0 j;
    public dwo0<h> k = new dwo0<>();
    public androidx.media3.common.a l;
    public final dds0.a m;
    public final com.google.common.collect.g n;
    public otu o;
    public uns0 p;
    public gms0 q;
    public long r;
    public int s;

    @Nullable
    public Pair<Surface, jxj0> t;
    public int u;
    public int v;
    public long w;
    public long x;
    public boolean y;
    public int z;

    /* compiled from: PlaybackVideoGraphWrapper.java */
    public class a implements VideoSink.b {
        public a() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public final void a() {
            uns0 uns0Var = d.this.p;
            uns0Var.getClass();
            uns0Var.e(-2L);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public final void b(long j) {
            uns0 uns0Var = d.this.p;
            uns0Var.getClass();
            uns0Var.e(j);
        }
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    public static final class b {
        public final Context a;
        public final androidx.media3.exoplayer.video.e b;
        public g c;
        public boolean d;
        public dvf e;
        public boolean f;
        public long g = 15000;
        public final mms0 h;

        public b(Context context, androidx.media3.exoplayer.video.e eVar) {
            this.a = context.getApplicationContext();
            this.b = eVar;
            mms0 mms0Var = new mms0();
            Range<Double> range = new Range<>(Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), Double.valueOf(1.0d / 1.0f));
            mms0Var.d = range;
            mms0Var.c = range.getUpper().doubleValue();
            mms0Var.a = C.TIME_UNSET;
            mms0Var.b = C.TIME_UNSET;
            this.h = mms0Var;
            this.e = dvf.a;
        }
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    public final class c implements VideoSink.a {
        public c() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public final void a(VideoSink.VideoSinkException videoSinkException) {
            Iterator<e> it = d.this.h.iterator();
            while (it.hasNext()) {
                it.next().a(VideoFrameProcessingException.a(C.TIME_UNSET, videoSinkException));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public final void d() {
            Iterator<e> it = d.this.h.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public final void onFirstFrameRendered() {
            Iterator<e> it = d.this.h.iterator();
            while (it.hasNext()) {
                it.next().onFirstFrameRendered();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public final void onVideoSizeChanged(xgt0 xgt0Var) {
            Iterator<e> it = d.this.h.iterator();
            while (it.hasNext()) {
                it.next().onVideoSizeChanged(xgt0Var);
            }
        }
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    /* renamed from: androidx.media3.exoplayer.video.d$d, reason: collision with other inner class name */
    public final class C0069d implements VideoSink, e {
        public final int a;
        public ImmutableList<p8p> b;

        @Nullable
        public androidx.media3.common.a c;
        public int d;
        public long e;
        public long f;
        public int g;
        public VideoSink.a h;
        public Executor i;
        public boolean j;

        public C0069d(Context context) {
            this.a = y2r0.N(context) ? 1 : 5;
            ImmutableList.b bVar = ImmutableList.c;
            this.b = com.google.common.collect.g.f;
            this.f = C.TIME_UNSET;
            this.h = VideoSink.a.a;
            this.i = d.B;
        }

        @Override // androidx.media3.exoplayer.video.d.e
        public final void a(VideoFrameProcessingException videoFrameProcessingException) {
            this.i.execute(new vy10(this, this.h, videoFrameProcessingException, 2));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final Surface b() {
            fxc0.z(this.j);
            uns0 uns0Var = d.this.p;
            uns0Var.getClass();
            return uns0Var.j(0);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void c() {
            if (this.j) {
                d dVar = d.this;
                long j = dVar.w;
                d.f(dVar, false);
                uns0 uns0Var = dVar.p;
                uns0Var.getClass();
                uns0Var.c();
                dVar.w = j;
            }
        }

        @Override // androidx.media3.exoplayer.video.d.e
        public final void d() {
            VideoSink.a aVar = this.h;
            Executor executor = this.i;
            Objects.requireNonNull(aVar);
            executor.execute(new bv9(aVar, 9));
        }

        @Override // androidx.media3.exoplayer.video.d.e
        public final void e() {
            VideoSink.a aVar = this.h;
            Executor executor = this.i;
            Objects.requireNonNull(aVar);
            executor.execute(new tw3(aVar, 17));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void f() {
            long j = this.f;
            d dVar = d.this;
            dVar.x = j;
            if (dVar.w >= j) {
                dVar.e.f();
                dVar.y = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00db  */
        @Override // androidx.media3.exoplayer.video.VideoSink
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean g(androidx.media3.common.a aVar) throws VideoSink.VideoSinkException {
            m6g m6gVar;
            Pair<Surface, jxj0> pair;
            fxc0.z(!this.j);
            d dVar = d.this;
            androidx.media3.exoplayer.video.a aVar2 = dVar.e;
            fxc0.z(dVar.v == 0);
            m6g m6gVar2 = aVar.D;
            if (m6gVar2 == null || !m6gVar2.f()) {
                m6gVar2 = m6g.h;
            }
            int i = m6gVar2.c;
            try {
                try {
                    if (i == 7) {
                        try {
                            if (Build.VERSION.SDK_INT < 34 && GlUtil.r()) {
                                m6g.a a = m6gVar2.a();
                                a.c = 6;
                                m6gVar = new m6g(a.a, a.b, a.c, a.e, a.f, a.d);
                                dvf dvfVar = dVar.g;
                                Looper myLooper = Looper.myLooper();
                                myLooper.getClass();
                                fqn0 createHandler = dvfVar.createHandler(myLooper, null);
                                dVar.o = createHandler;
                                uns0 a2 = dVar.b.a(dVar.a, m6gVar, g7l.j7, dVar, new p6q(createHandler), 0L, false);
                                dVar.p = a2;
                                a2.g(dVar.n);
                                dVar.p.d(dVar.m);
                                dVar.p.initialize();
                                pair = dVar.t;
                                if (pair != null) {
                                    Surface surface = (Surface) pair.first;
                                    jxj0 jxj0Var = (jxj0) pair.second;
                                    dVar.g(surface, jxj0Var.a, jxj0Var.b);
                                }
                                aVar2.getClass();
                                c cVar = dVar.new c();
                                otu otuVar = dVar.o;
                                Objects.requireNonNull(otuVar);
                                p6q p6qVar = new p6q(otuVar);
                                aVar2.h = cVar;
                                aVar2.i = p6qVar;
                                dVar.v = 1;
                                uns0 uns0Var = dVar.p;
                                uns0Var.getClass();
                                uns0Var.m(0);
                                dVar.A++;
                                this.j = true;
                                return true;
                            }
                        } catch (GlUtil.GlException e) {
                            throw new VideoSink.VideoSinkException(e, aVar);
                        }
                    }
                    uns0 uns0Var2 = dVar.p;
                    uns0Var2.getClass();
                    uns0Var2.m(0);
                    dVar.A++;
                    this.j = true;
                    return true;
                } catch (VideoFrameProcessingException e2) {
                    throw new VideoSink.VideoSinkException(e2, aVar);
                }
                uns0 a22 = dVar.b.a(dVar.a, m6gVar, g7l.j7, dVar, new p6q(createHandler), 0L, false);
                dVar.p = a22;
                a22.g(dVar.n);
                dVar.p.d(dVar.m);
                dVar.p.initialize();
                pair = dVar.t;
                if (pair != null) {
                }
                aVar2.getClass();
                c cVar2 = dVar.new c();
                otu otuVar2 = dVar.o;
                Objects.requireNonNull(otuVar2);
                p6q p6qVar2 = new p6q(otuVar2);
                aVar2.h = cVar2;
                aVar2.i = p6qVar2;
                dVar.v = 1;
            } catch (VideoFrameProcessingException e3) {
                throw new VideoSink.VideoSinkException(e3, aVar);
            }
            if (!(i == 6 ? GlUtil.r() : i == 7 ? GlUtil.s("EGL_EXT_gl_colorspace_bt2020_hlg") : true) && Build.VERSION.SDK_INT >= 29) {
                Locale locale = Locale.US;
                ahn.F("Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                m6gVar2 = m6g.h;
            } else if (i == 2 || i == 10) {
                m6gVar2 = m6g.h;
            }
            m6gVar = m6gVar2;
            dvf dvfVar2 = dVar.g;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            fqn0 createHandler2 = dvfVar2.createHandler(myLooper2, null);
            dVar.o = createHandler2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void h() {
            d dVar = d.this;
            if (dVar.d) {
                dVar.e.h();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void i(int i) {
            d.this.e.i(i);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isEnded() {
            if (!this.j) {
                return false;
            }
            d dVar = d.this;
            return dVar.u == 0 && dVar.y && dVar.e.isEnded();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isInitialized() {
            return this.j;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void j(androidx.media3.exoplayer.video.b bVar, kzm kzmVar) {
            this.h = bVar;
            this.i = kzmVar;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean k(long j, VideoSink.b bVar) {
            int i;
            fxc0.z(this.j);
            long j2 = j + this.e;
            d dVar = d.this;
            mms0 mms0Var = dVar.j;
            long j3 = mms0Var.a == C.TIME_UNSET ? -9223372036854775807L : (long) (((j2 - r2) * mms0Var.c) + mms0Var.b);
            if (j3 != C.TIME_UNSET) {
                long j4 = dVar.i;
                if (j4 != C.TIME_UNSET && j3 < j4 && (i = this.g) < 2) {
                    this.g = i + 1;
                    ((c.a) bVar).a();
                    return true;
                }
            }
            int i2 = dVar.z;
            if (i2 != -1 && i2 == dVar.A) {
                uns0 uns0Var = dVar.p;
                uns0Var.getClass();
                if (uns0Var.h(0) < this.a) {
                    uns0 uns0Var2 = dVar.p;
                    uns0Var2.getClass();
                    if (uns0Var2.i(0)) {
                        this.f = j2;
                        ((c.a) bVar).b(j2 * 1000);
                        this.g = 0;
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void l(gms0 gms0Var) {
            d dVar = d.this;
            dVar.q = gms0Var;
            dVar.e.j = gms0Var;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void m(long j) {
            this.e = j;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void n(int i, long j, androidx.media3.common.a aVar, List list) {
            fxc0.z(this.j);
            this.b = ImmutableList.m(list);
            this.d = 1;
            this.c = aVar;
            d dVar = d.this;
            dVar.x = C.TIME_UNSET;
            dVar.y = false;
            w(aVar);
            long j2 = this.f;
            boolean z = j2 == C.TIME_UNSET;
            if (dVar.d || z) {
                long j3 = z ? -4611686018427387904L : 1 + j2;
                dVar.k.a(j3, new h(this.e + j, i, j3));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void o(boolean z) {
            d dVar = d.this;
            if (dVar.d) {
                dVar.e.o(z);
            }
        }

        @Override // androidx.media3.exoplayer.video.d.e
        public final void onFirstFrameRendered() {
            VideoSink.a aVar = this.h;
            Executor executor = this.i;
            Objects.requireNonNull(aVar);
            executor.execute(new tn9(aVar, 12));
        }

        @Override // androidx.media3.exoplayer.video.d.e
        public final void onVideoSizeChanged(xgt0 xgt0Var) {
            this.i.execute(new aw5(2, this.h, xgt0Var));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void p() {
            d dVar = d.this;
            androidx.media3.exoplayer.video.a aVar = dVar.e;
            if (dVar.k.h() == 0) {
                aVar.p();
                return;
            }
            dwo0<h> dwo0Var = new dwo0<>();
            boolean z = true;
            while (dVar.k.h() > 0) {
                h e = dVar.k.e();
                e.getClass();
                if (z) {
                    int i = e.b;
                    if (i == 0 || i == 1) {
                        e = new h(e.a, 0, e.c);
                    } else {
                        aVar.p();
                    }
                    z = false;
                }
                dwo0Var.a(e.c, e);
            }
            dVar.k = dwo0Var;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void q() {
            d dVar = d.this;
            if (dVar.d) {
                dVar.e.q();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void r(List<p8p> list) {
            ImmutableList<p8p> immutableList = this.b;
            immutableList.getClass();
            if (qhz.a(immutableList, list)) {
                return;
            }
            this.b = ImmutableList.m(list);
            androidx.media3.common.a aVar = this.c;
            if (aVar != null) {
                w(aVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void release() {
            d dVar = d.this;
            if (dVar.v == 2) {
                return;
            }
            otu otuVar = dVar.o;
            if (otuVar != null) {
                otuVar.a();
            }
            uns0 uns0Var = dVar.p;
            if (uns0Var != null) {
                uns0Var.release();
            }
            dVar.t = null;
            dVar.v = 2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void render(long j, long j2) throws VideoSink.VideoSinkException {
            d.this.e.render(j + this.e, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean s(boolean z) {
            boolean z2 = false;
            boolean z3 = z && this.j;
            d dVar = d.this;
            androidx.media3.exoplayer.video.a aVar = dVar.e;
            if (z3 && dVar.u == 0) {
                z2 = true;
            }
            return aVar.a.b(z2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setPlaybackSpeed(float f) {
            d dVar = d.this;
            dVar.j.c(f);
            dVar.e.setPlaybackSpeed(f);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void t() {
            d dVar = d.this;
            dVar.getClass();
            jxj0 jxj0Var = jxj0.c;
            dVar.g(null, jxj0Var.a, jxj0Var.b);
            dVar.t = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void u(boolean z) {
            boolean z2 = this.j;
            d dVar = d.this;
            if (z2) {
                uns0 uns0Var = dVar.p;
                uns0Var.getClass();
                uns0Var.flush();
            }
            this.f = C.TIME_UNSET;
            d.f(dVar, z);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void v(Surface surface, jxj0 jxj0Var) {
            d dVar = d.this;
            Pair<Surface, jxj0> pair = dVar.t;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((jxj0) dVar.t.second).equals(jxj0Var)) {
                return;
            }
            dVar.t = Pair.create(surface, jxj0Var);
            dVar.g(surface, jxj0Var.a, jxj0Var.b);
        }

        public final void w(androidx.media3.common.a aVar) {
            a.C0043a a = aVar.a();
            m6g m6gVar = aVar.D;
            if (m6gVar == null || !m6gVar.f()) {
                m6gVar = m6g.h;
            }
            a.C = m6gVar;
            androidx.media3.common.a aVar2 = new androidx.media3.common.a(a);
            int i = this.d != 1 ? 2 : 1;
            uns0 uns0Var = d.this.p;
            uns0Var.getClass();
            uns0Var.k(0, i, aVar2, this.b, 0L);
        }
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    public static final class f implements kms0.b {
        public static final zhn0<Class<?>> a = fin0.a(new iza0());

        @Override // xsna.kms0.b
        public final kms0 a(Context context, g7l g7lVar, m6g m6gVar, boolean z, Executor executor, ouj0.a aVar) throws VideoFrameProcessingException {
            try {
                Class<?> cls = a.get();
                Object newInstance = cls.getConstructor(null).newInstance(null);
                cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(newInstance, Boolean.FALSE);
                Object invoke = cls.getMethod("build", null).invoke(newInstance, null);
                invoke.getClass();
                return ((kms0.b) invoke).a(context, g7lVar, m6gVar, z, executor, aVar);
            } catch (Exception e) {
                throw new VideoFrameProcessingException(e);
            }
        }
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    public static final class g implements uns0.a {
        public final f a = new f();

        @Override // xsna.uns0.a
        public final uns0 a(Context context, m6g m6gVar, g7l g7lVar, uns0.b bVar, Executor executor, long j, boolean z) {
            try {
                return ((uns0.a) ouj0.b.class.getConstructor(kms0.b.class).newInstance(this.a)).a(context, m6gVar, g7lVar, bVar, executor, j, z);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    public static final class h {
        public final long a;
        public final int b;
        public final long c;

        public h(long j, int i, long j2) {
            this.a = j;
            this.b = i;
            this.c = j2;
        }
    }

    public d(b bVar) {
        this.a = bVar.a;
        g gVar = bVar.c;
        gVar.getClass();
        this.b = gVar;
        this.c = new SparseArray<>();
        ImmutableList.b bVar2 = ImmutableList.c;
        this.n = com.google.common.collect.g.f;
        this.m = dds0.a;
        this.d = bVar.d;
        dvf dvfVar = bVar.e;
        this.g = dvfVar;
        long j = bVar.g;
        this.i = j != C.TIME_UNSET ? -j : -9223372036854775807L;
        mms0 mms0Var = bVar.h;
        this.j = mms0Var;
        this.e = new androidx.media3.exoplayer.video.a(bVar.b, mms0Var, dvfVar);
        this.f = new a();
        this.h = new CopyOnWriteArraySet<>();
        this.l = new androidx.media3.common.a(new a.C0043a());
        this.r = C.TIME_UNSET;
        this.w = C.TIME_UNSET;
        this.x = C.TIME_UNSET;
        this.z = -1;
        this.v = 0;
    }

    public static void f(d dVar, boolean z) {
        if (dVar.v == 1) {
            dVar.u++;
            dVar.e.u(z);
            while (dVar.k.h() > 1) {
                dVar.k.e();
            }
            if (dVar.k.h() == 1) {
                h e2 = dVar.k.e();
                e2.getClass();
                dVar.r = e2.a;
                dVar.s = e2.b;
                dVar.h();
            }
            dVar.w = C.TIME_UNSET;
            if (z) {
                dVar.x = C.TIME_UNSET;
                dVar.y = false;
            }
            otu otuVar = dVar.o;
            otuVar.getClass();
            otuVar.post(new sm9(dVar, 12));
        }
    }

    @Override // xsna.uns0.b
    public final void a(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator<e> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(videoFrameProcessingException);
        }
    }

    @Override // xsna.uns0.b
    public final void b(float f2) {
        a.C0043a a2 = this.l.a();
        a2.x = f2;
        this.l = new androidx.media3.common.a(a2);
        h();
    }

    @Override // xsna.uns0.b
    public final void c(int i, int i2) {
        a.C0043a a2 = this.l.a();
        a2.t = i;
        a2.u = i2;
        this.l = new androidx.media3.common.a(a2);
        h();
    }

    @Override // xsna.uns0.b
    public final void d(long j, boolean z) {
        if (this.u > 0) {
            return;
        }
        Iterator<e> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z) {
            gms0 gms0Var = this.q;
            if (gms0Var != null) {
                gms0Var.a(j, C.TIME_UNSET, this.l, null);
                return;
            }
            return;
        }
        this.w = j;
        h f2 = this.k.f(j);
        if (f2 != null) {
            this.r = f2.a;
            this.s = f2.b;
            h();
        }
        a aVar = this.f;
        androidx.media3.exoplayer.video.a aVar2 = this.e;
        aVar2.k(j, aVar);
        long j2 = this.x;
        if (j2 == C.TIME_UNSET || j < j2) {
            return;
        }
        aVar2.f();
        this.y = true;
    }

    public final void g(@Nullable Surface surface, int i, int i2) {
        uns0 uns0Var = this.p;
        if (uns0Var == null) {
            return;
        }
        androidx.media3.exoplayer.video.a aVar = this.e;
        if (surface != null) {
            uns0Var.a(new njn0(surface, i, i2, 0, false));
            aVar.v(surface, new jxj0(i, i2));
        } else {
            uns0Var.a(null);
            aVar.t();
        }
    }

    public final void h() {
        androidx.media3.common.a aVar = this.l;
        long j = this.r;
        int i = this.s;
        ImmutableList.b bVar = ImmutableList.c;
        this.e.n(i, j, aVar, com.google.common.collect.g.f);
    }

    /* compiled from: PlaybackVideoGraphWrapper.java */
    public interface e {
        default void d() {
        }

        default void e() {
        }

        default void onFirstFrameRendered() {
        }

        default void a(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onVideoSizeChanged(xgt0 xgt0Var) {
        }
    }

    @Override // xsna.uns0.b
    public final void e(long j) {
    }
}
