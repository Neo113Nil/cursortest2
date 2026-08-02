package androidx.media3.transformer;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.transformer.e;
import androidx.media3.transformer.z;
import com.google.common.collect.ImmutableList;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import xsna.a7l;
import xsna.ahn;
import xsna.dds0;
import xsna.e840;
import xsna.fxc0;
import xsna.g7l;
import xsna.hdu;
import xsna.hjp;
import xsna.io20;
import xsna.k5j;
import xsna.kms0;
import xsna.kr10;
import xsna.kzm;
import xsna.m6g;
import xsna.njn0;
import xsna.ouj0;
import xsna.uns0;
import xsna.yzt;

/* compiled from: VideoSampleExporter.java */
/* loaded from: classes12.dex */
public final class e0 extends x {
    public final c e;
    public final a f;
    public final DecoderInputBuffer g;
    public volatile long h;
    public long i;
    public boolean j;

    /* compiled from: VideoSampleExporter.java */
    public static final class a {
        public final e.b a;
        public final androidx.media3.common.a b;
        public final ImmutableList<Integer> c;
        public final List<String> d;
        public final z e;
        public final u f;
        public final String g;
        public final int h;

        @Nullable
        public final LogSessionId i;
        public njn0 j;
        public volatile e k;
        public volatile int l;
        public volatile boolean m;

        public a(e.b bVar, androidx.media3.common.a aVar, ImmutableList immutableList, ImmutableList immutableList2, z zVar, u uVar, @Nullable LogSessionId logSessionId) {
            m6g m6gVar = aVar.D;
            fxc0.p(m6gVar != null);
            this.a = bVar;
            this.b = aVar;
            this.c = immutableList;
            this.d = immutableList2;
            this.e = zVar;
            this.f = uVar;
            this.i = logSessionId;
            String str = aVar.n;
            str.getClass();
            String str2 = zVar.c;
            String str3 = "video/hevc";
            if (str2 != null) {
                str = str2;
            } else if (io20.n(str)) {
                str = "video/hevc";
            }
            int i = zVar.d;
            if (i == 0 && m6g.h(m6gVar) && hjp.f(str, m6gVar).isEmpty()) {
                if (hjp.f("video/hevc", m6gVar).isEmpty()) {
                    i = 2;
                }
                Pair create = Pair.create(str3, Integer.valueOf(i));
                this.g = (String) create.first;
                this.h = ((Integer) create.second).intValue();
            }
            str3 = str;
            Pair create2 = Pair.create(str3, Integer.valueOf(i));
            this.g = (String) create2.first;
            this.h = ((Integer) create2.second).intValue();
        }

        @Nullable
        public final njn0 a(int i, int i2) throws ExportException {
            m6g m6gVar;
            if (this.m) {
                return null;
            }
            njn0 njn0Var = this.j;
            if (njn0Var != null) {
                return njn0Var;
            }
            if (i < i2) {
                this.l = 90;
                i2 = i;
                i = i2;
            }
            if (this.b.z % 180 == this.l % 180) {
                this.l = this.b.z;
            }
            if (!this.c.contains(Integer.valueOf(this.l))) {
                int i3 = (this.l + 180) % 360;
                if (this.c.contains(Integer.valueOf(i3))) {
                    this.l = i3;
                } else {
                    this.l = this.c.get(0).intValue();
                    int i4 = i2;
                    i2 = i;
                    i = i4;
                }
            }
            a.C0043a c0043a = new a.C0043a();
            c0043a.t = i;
            c0043a.u = i2;
            c0043a.y = 0;
            c0043a.x = this.b.y;
            c0043a.m = io20.q(this.g);
            androidx.media3.common.a aVar = this.b;
            if (m6g.h(aVar.D) && this.h != 0) {
                m6gVar = m6g.h;
            } else if (m6g.i.equals(aVar.D)) {
                m6gVar = m6g.h;
            } else {
                m6gVar = aVar.D;
                m6gVar.getClass();
            }
            c0043a.C = m6gVar;
            c0043a.j = this.b.k;
            androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0043a);
            e.b bVar = this.a;
            a.C0043a a = aVar2.a();
            a.m = io20.q(x.c(aVar2, this.d));
            this.k = bVar.b(new androidx.media3.common.a(a), this.i);
            androidx.media3.common.a aVar3 = ((i) this.k).c;
            u uVar = this.f;
            z zVar = this.e;
            boolean z = this.l != 0;
            int i5 = this.h;
            z.a a2 = zVar.a();
            if (zVar.d != i5) {
                a2.d = i5;
            }
            if (!Objects.equals(aVar2.n, aVar3.n)) {
                String q = io20.q(aVar3.n);
                fxc0.o(q, "Not a video MIME type: %s", q == null || io20.p(q));
                a2.c = q;
            }
            if (z) {
                int i6 = aVar2.u;
                int i7 = aVar3.u;
                if (i6 != i7) {
                    a2.a = i7;
                }
            } else {
                int i8 = aVar2.v;
                int i9 = aVar3.v;
                if (i8 != i9) {
                    a2.a = i9;
                }
            }
            uVar.a(a2.a());
            Surface surface = ((i) this.k).e;
            surface.getClass();
            this.j = new njn0(surface, aVar3.u, aVar3.v, this.l, true);
            if (this.m) {
                ((i) this.k).i();
            }
            return this.j;
        }

        public final void b() throws ExportException {
            if (this.k != null) {
                i iVar = (i) this.k;
                if (!iVar.i.get()) {
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                LinkedHashMap linkedHashMap = a7l.a;
                try {
                    synchronized (a7l.class) {
                        synchronized (a7l.class) {
                        }
                        iVar.d.signalEndOfInputStream();
                    }
                    iVar.d.signalEndOfInputStream();
                } catch (RuntimeException e) {
                    ahn.l(e);
                    throw iVar.b(e);
                }
            }
        }
    }

    /* compiled from: VideoSampleExporter.java */
    public static final class b implements hdu {
        public final uns0 a;
        public final int b;
        public final long c;
        public final AtomicLong d = new AtomicLong();

        public b(uns0 uns0Var, int i, long j) {
            this.a = uns0Var;
            this.b = i;
            this.c = j;
        }

        @Override // xsna.c880
        public final void a(m mVar, long j, @Nullable androidx.media3.common.a aVar, boolean z) {
            String scheme;
            int i;
            kr10.f fVar = mVar.a.b;
            boolean equals = (fVar == null || (scheme = fVar.a.getScheme()) == null) ? false : scheme.equals("transformer_surface_asset");
            long b = mVar.b(j);
            AtomicLong atomicLong = this.d;
            if (aVar != null) {
                if (aVar.z % 180 != 0) {
                    a.C0043a a = aVar.a();
                    a.t = aVar.v;
                    a.u = aVar.u;
                    a.y = 0;
                    aVar = new androidx.media3.common.a(a);
                }
                androidx.media3.common.a aVar2 = aVar;
                if (equals) {
                    i = 4;
                } else {
                    String str = aVar2.n;
                    str.getClass();
                    if (io20.n(str)) {
                        i = 2;
                    } else if (str.equals("video/raw")) {
                        i = 3;
                    } else {
                        if (!io20.p(str)) {
                            throw new IllegalArgumentException("MIME type not supported ".concat(str));
                        }
                        i = 1;
                    }
                }
                this.a.k(this.b, i, aVar2, mVar.f.b, atomicLong.get() + this.c);
            }
            atomicLong.addAndGet(b);
        }

        @Override // xsna.g0h0
        public final Surface b() {
            return this.a.j(this.b);
        }

        @Override // xsna.g0h0
        public final int d(Bitmap bitmap, k5j k5jVar) {
            return this.a.b(this.b, bitmap, k5jVar) ? 1 : 2;
        }

        @Override // xsna.g0h0
        public final int f() {
            return this.a.h(this.b);
        }

        @Override // xsna.g0h0
        public final void g() {
            this.a.f(this.b);
        }

        @Override // xsna.g0h0
        public final boolean i(long j) {
            return this.a.i(this.b);
        }
    }

    /* compiled from: VideoSampleExporter.java */
    public final class c implements uns0.b {
        public final uns0 a;
        public final Object b = new Object();
        public final yzt c;
        public final boolean d;
        public final long e;
        public final int f;
        public int g;
        public int h;

        public c(Context context, uns0.a aVar, m6g m6gVar, g7l g7lVar, dds0 dds0Var, List list, yzt yztVar, long j, int i, boolean z) throws VideoFrameProcessingException {
            this.c = yztVar;
            this.d = z;
            this.e = j;
            this.f = i;
            uns0 a = aVar.a(context, m6gVar, g7lVar, this, kzm.INSTANCE, j, z);
            this.a = a;
            a.g(list);
            a.d(dds0Var);
        }

        @Override // xsna.uns0.b
        public final void a(VideoFrameProcessingException videoFrameProcessingException) {
            this.c.accept(new ExportException("Video frame processing error", videoFrameProcessingException, IronSourceConstants.errorCode_biddingDataException, null));
        }

        @Override // xsna.uns0.b
        public final void c(int i, int i2) {
            njn0 njn0Var;
            try {
                njn0Var = e0.this.f.a(i, i2);
            } catch (ExportException e) {
                this.c.accept(e);
                njn0Var = null;
            }
            this.a.a(njn0Var);
        }

        @Override // xsna.uns0.b
        public final void d(long j, boolean z) {
            if (this.d) {
                return;
            }
            synchronized (this.b) {
                this.h++;
            }
            f();
        }

        @Override // xsna.uns0.b
        public final void e(long j) {
            e0.this.h = j;
            try {
                e0.this.f.b();
            } catch (ExportException e) {
                this.c.accept(e);
            }
        }

        public final void f() {
            boolean z;
            int i;
            synchronized (this.b) {
                try {
                    int i2 = this.h;
                    if (i2 <= 0 || (i = this.g) >= this.f) {
                        z = false;
                    } else {
                        z = true;
                        this.g = i + 1;
                        this.h = i2 - 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.a.e(-3L);
            }
        }
    }

    public e0(Context context, androidx.media3.common.a aVar, z zVar, dds0 dds0Var, List list, kms0.b bVar, e.b bVar2, MuxerWrapper muxerWrapper, yzt yztVar, u uVar, g7l g7lVar, long j, boolean z, ImmutableList immutableList, int i, @Nullable LogSessionId logSessionId) throws ExportException {
        super(aVar, muxerWrapper);
        m6g m6gVar;
        boolean z2 = i < 1;
        this.h = C.TIME_UNSET;
        this.i = C.TIME_UNSET;
        m6g m6gVar2 = aVar.D;
        m6gVar2.getClass();
        if (Objects.equals(aVar.n, "image/jpeg_r") && m6gVar2.c == 2) {
            m6gVar = new m6g(6, 1, 7, -1, -1, null);
        } else {
            int i2 = m6gVar2.c;
            m6gVar = (i2 == 2 || i2 == 10) ? m6g.h : m6gVar2;
        }
        a.C0043a a2 = aVar.a();
        a2.C = m6gVar;
        a aVar2 = new a(bVar2, new androidx.media3.common.a(a2), immutableList, muxerWrapper.b.b(2), zVar, uVar, logSessionId);
        this.f = aVar2;
        this.g = new DecoderInputBuffer(0);
        if (aVar2.h == 2 && m6g.h(m6gVar2)) {
            m6gVar = m6g.h;
        }
        try {
            c cVar = new c(context, z ? new e840.e(bVar) : new ouj0.b(bVar), m6gVar, g7lVar, dds0Var, list, yztVar, j, i, z2);
            this.e = cVar;
            cVar.a.initialize();
        } catch (VideoFrameProcessingException e) {
            throw new ExportException("Video frame processing error", e, IronSourceConstants.errorCode_biddingDataException, null);
        }
    }

    @Override // androidx.media3.transformer.x
    public final hdu j(m mVar, androidx.media3.common.a aVar, int i) throws ExportException {
        try {
            c cVar = this.e;
            uns0 uns0Var = cVar.a;
            uns0Var.m(i);
            return new b(uns0Var, i, cVar.e);
        } catch (VideoFrameProcessingException e) {
            throw new ExportException("Video frame processing error", e, IronSourceConstants.errorCode_biddingDataException, null);
        }
    }

    @Override // androidx.media3.transformer.x
    @Nullable
    public final DecoderInputBuffer k() throws ExportException {
        DecoderInputBuffer decoderInputBuffer = this.g;
        a aVar = this.f;
        MediaCodec.BufferInfo bufferInfo = null;
        decoderInputBuffer.e = aVar.k != null ? ((i) aVar.k).d() : null;
        if (this.g.e == null) {
            return null;
        }
        a aVar2 = this.f;
        if (aVar2.k != null) {
            i iVar = (i) aVar2.k;
            if (iVar.g(false)) {
                bufferInfo = iVar.a;
            }
        }
        bufferInfo.getClass();
        if (bufferInfo.presentationTimeUs == 0 && this.e.a.l() == this.j && this.h != C.TIME_UNSET && bufferInfo.size > 0) {
            bufferInfo.presentationTimeUs = this.h;
        }
        DecoderInputBuffer decoderInputBuffer2 = this.g;
        long j = bufferInfo.presentationTimeUs;
        decoderInputBuffer2.g = j;
        decoderInputBuffer2.b = bufferInfo.flags;
        this.i = j;
        return decoderInputBuffer2;
    }

    @Override // androidx.media3.transformer.x
    @Nullable
    public final androidx.media3.common.a l() throws ExportException {
        a aVar = this.f;
        if (aVar.k == null) {
            return null;
        }
        i iVar = (i) aVar.k;
        iVar.g(false);
        androidx.media3.common.a aVar2 = iVar.j;
        if (aVar2 == null || aVar.l == 0) {
            return aVar2;
        }
        a.C0043a a2 = aVar2.a();
        a2.y = aVar.l;
        return new androidx.media3.common.a(a2);
    }

    @Override // androidx.media3.transformer.x
    public final boolean m() {
        boolean z;
        a aVar = this.f;
        if (aVar.k == null || !((i) aVar.k).e()) {
            c cVar = this.e;
            if (cVar.d) {
                z = false;
            } else {
                boolean z2 = e0.this.h != C.TIME_UNSET;
                synchronized (cVar.b) {
                    z = cVar.g == 0 && z2;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.transformer.x
    public final void o() {
        this.e.a.release();
        a aVar = this.f;
        if (aVar.k != null) {
            ((i) aVar.k).i();
        }
        aVar.m = true;
    }

    @Override // androidx.media3.transformer.x
    public final void p() throws ExportException {
        if (this.i == 0) {
            this.j = true;
        }
        a aVar = this.f;
        if (aVar.k != null) {
            ((i) aVar.k).j();
        }
        c cVar = this.e;
        if (cVar.d) {
            return;
        }
        synchronized (cVar.b) {
            fxc0.z(cVar.g > 0);
            cVar.g--;
        }
        cVar.f();
    }
}
