package n1;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.source.C2223y;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2339H;
import b1.AbstractC2346O;
import b1.AbstractC2356j;
import b1.C2338G;
import b1.InterfaceC2341J;
import b1.T;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4136c;
import e1.C4133C;
import h1.C4404G;
import h1.C4423s;
import h1.C4426v;
import h1.C4427w;
import h1.C4428x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import m1.C5507g;
import n1.D1;
import n1.InterfaceC5608b;
import o1.InterfaceC5773z;
import q1.C6099h;
import q1.InterfaceC6104m;
import v1.AbstractC6596A;
import v1.C6628s;

/* loaded from: classes.dex */
public final class C1 implements InterfaceC5608b, D1.a {

    /* renamed from: A, reason: collision with root package name */
    public int f56709A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f56710B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f56711a;

    /* renamed from: c, reason: collision with root package name */
    public final D1 f56713c;

    /* renamed from: d, reason: collision with root package name */
    public final PlaybackSession f56714d;

    /* renamed from: j, reason: collision with root package name */
    public String f56720j;

    /* renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f56721k;

    /* renamed from: l, reason: collision with root package name */
    public int f56722l;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC2339H f56725o;

    /* renamed from: p, reason: collision with root package name */
    public b f56726p;

    /* renamed from: q, reason: collision with root package name */
    public b f56727q;

    /* renamed from: r, reason: collision with root package name */
    public b f56728r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.media3.common.a f56729s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.media3.common.a f56730t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.media3.common.a f56731u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f56732v;

    /* renamed from: w, reason: collision with root package name */
    public int f56733w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f56734x;

    /* renamed from: y, reason: collision with root package name */
    public int f56735y;

    /* renamed from: z, reason: collision with root package name */
    public int f56736z;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f56712b = AbstractC4136c.a();

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC2346O.c f56716f = new AbstractC2346O.c();

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC2346O.b f56717g = new AbstractC2346O.b();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f56719i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f56718h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final long f56715e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    public int f56723m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f56724n = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f56737a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56738b;

        public a(int i10, int i11) {
            this.f56737a = i10;
            this.f56738b = i11;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.a f56739a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56740b;

        /* renamed from: c, reason: collision with root package name */
        public final String f56741c;

        public b(androidx.media3.common.a aVar, int i10, String str) {
            this.f56739a = aVar;
            this.f56740b = i10;
            this.f56741c = str;
        }
    }

    public C1(Context context, PlaybackSession playbackSession) {
        this.f56711a = context.getApplicationContext();
        this.f56714d = playbackSession;
        C5654v0 c5654v0 = new C5654v0();
        this.f56713c = c5654v0;
        c5654v0.e(this);
    }

    public static C1 F0(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a10 = s1.a(context.getSystemService("media_metrics"));
        if (a10 == null) {
            return null;
        }
        createPlaybackSession = a10.createPlaybackSession();
        return new C1(context, createPlaybackSession);
    }

    public static int H0(int i10) {
        switch (e1.Z.f0(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static DrmInitData I0(AbstractC3445z abstractC3445z) {
        DrmInitData drmInitData;
        com.google.common.collect.m0 it = abstractC3445z.iterator();
        while (it.hasNext()) {
            T.a aVar = (T.a) it.next();
            for (int i10 = 0; i10 < aVar.f24518a; i10++) {
                if (aVar.h(i10) && (drmInitData = aVar.b(i10).f20547s) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    public static int J0(DrmInitData drmInitData) {
        for (int i10 = 0; i10 < drmInitData.f20464c; i10++) {
            UUID uuid = drmInitData.i(i10).f20466b;
            if (uuid.equals(AbstractC2356j.f24594d)) {
                return 3;
            }
            if (uuid.equals(AbstractC2356j.f24595e)) {
                return 2;
            }
            if (uuid.equals(AbstractC2356j.f24593c)) {
                return 6;
            }
        }
        return 1;
    }

    public static a K0(AbstractC2339H abstractC2339H, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (abstractC2339H.f24309a == 1001) {
            return new a(20, 0);
        }
        if (abstractC2339H instanceof m1.I) {
            m1.I i11 = (m1.I) abstractC2339H;
            z11 = i11.f56098j == 1;
            i10 = i11.f56102n;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) AbstractC4134a.e(abstractC2339H.getCause());
        if (!(th2 instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof AbstractC6596A.c) {
                return new a(13, e1.Z.g0(((AbstractC6596A.c) th2).f66895d));
            }
            if (th2 instanceof C6628s) {
                return new a(14, ((C6628s) th2).f66985c);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof InterfaceC5773z.c) {
                return new a(17, ((InterfaceC5773z.c) th2).f58892a);
            }
            if (th2 instanceof InterfaceC5773z.f) {
                return new a(18, ((InterfaceC5773z.f) th2).f58897a);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(H0(errorCode), errorCode);
        }
        if (th2 instanceof C4428x) {
            return new a(5, ((C4428x) th2).f47621d);
        }
        if ((th2 instanceof C4427w) || (th2 instanceof C2338G)) {
            return new a(z10 ? 10 : 11, 0);
        }
        boolean z12 = th2 instanceof C4426v;
        if (z12 || (th2 instanceof C4404G.a)) {
            if (C4133C.e(context).g() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z12 && ((C4426v) th2).f47619c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (abstractC2339H.f24309a == 1002) {
            return new a(21, 0);
        }
        if (th2 instanceof InterfaceC6104m.a) {
            Throwable th3 = (Throwable) AbstractC4134a.e(th2.getCause());
            if (!(th3 instanceof MediaDrm.MediaDrmStateException)) {
                return th3 instanceof MediaDrmResetException ? new a(27, 0) : th3 instanceof NotProvisionedException ? new a(24, 0) : th3 instanceof DeniedByServerException ? new a(29, 0) : th3 instanceof q1.O ? new a(23, 0) : th3 instanceof C6099h.e ? new a(28, 0) : new a(30, 0);
            }
            int g02 = e1.Z.g0(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new a(H0(g02), g02);
        }
        if (!(th2 instanceof C4423s.b) || !(th2.getCause() instanceof FileNotFoundException)) {
            return new a(9, 0);
        }
        Throwable cause2 = ((Throwable) AbstractC4134a.e(th2.getCause())).getCause();
        return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
    }

    public static Pair L0(String str) {
        String[] A12 = e1.Z.A1(str, "-");
        return Pair.create(A12[0], A12.length >= 2 ? A12[1] : null);
    }

    public static int N0(Context context) {
        switch (C4133C.e(context).g()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int O0(b1.z zVar) {
        z.h hVar = zVar.f24655b;
        if (hVar == null) {
            return 0;
        }
        int I02 = e1.Z.I0(hVar.f24749a, hVar.f24750b);
        if (I02 == 0) {
            return 3;
        }
        if (I02 != 1) {
            return I02 != 2 ? 1 : 4;
        }
        return 5;
    }

    public static int P0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    @Override // n1.InterfaceC5608b
    public void B(InterfaceC5608b.a aVar, b1.Y y10) {
        b bVar = this.f56726p;
        if (bVar != null) {
            androidx.media3.common.a aVar2 = bVar.f56739a;
            if (aVar2.f20551w == -1) {
                this.f56726p = new b(aVar2.b().F0(y10.f24529a).h0(y10.f24530b).P(), bVar.f56740b, bVar.f56741c);
            }
        }
    }

    public final boolean E0(b bVar) {
        return bVar != null && bVar.f56741c.equals(this.f56713c.a());
    }

    public final void G0() {
        final PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f56721k;
        if (builder != null && this.f56710B) {
            builder.setAudioUnderrunCount(this.f56709A);
            this.f56721k.setVideoFramesDropped(this.f56735y);
            this.f56721k.setVideoFramesPlayed(this.f56736z);
            Long l10 = (Long) this.f56718h.get(this.f56720j);
            this.f56721k.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f56719i.get(this.f56720j);
            this.f56721k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f56721k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            build = this.f56721k.build();
            this.f56712b.execute(new Runnable() { // from class: n1.A1
                @Override // java.lang.Runnable
                public final void run() {
                    C1.this.f56714d.reportPlaybackMetrics(build);
                }
            });
        }
        this.f56721k = null;
        this.f56720j = null;
        this.f56709A = 0;
        this.f56735y = 0;
        this.f56736z = 0;
        this.f56729s = null;
        this.f56730t = null;
        this.f56731u = null;
        this.f56710B = false;
    }

    public LogSessionId M0() {
        LogSessionId sessionId;
        sessionId = this.f56714d.getSessionId();
        return sessionId;
    }

    public final void Q0(InterfaceC5608b.C0829b c0829b) {
        for (int i10 = 0; i10 < c0829b.d(); i10++) {
            int b10 = c0829b.b(i10);
            InterfaceC5608b.a c10 = c0829b.c(b10);
            if (b10 == 0) {
                this.f56713c.d(c10);
            } else if (b10 == 11) {
                this.f56713c.f(c10, this.f56722l);
            } else {
                this.f56713c.g(c10);
            }
        }
    }

    public final void R0(long j10) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        final NetworkEvent build;
        int N02 = N0(this.f56711a);
        if (N02 != this.f56724n) {
            this.f56724n = N02;
            networkType = H0.a().setNetworkType(N02);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j10 - this.f56715e);
            build = timeSinceCreatedMillis.build();
            this.f56712b.execute(new Runnable() { // from class: n1.y1
                @Override // java.lang.Runnable
                public final void run() {
                    C1.this.f56714d.reportNetworkEvent(build);
                }
            });
        }
    }

    public final void S0(long j10) {
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        final PlaybackErrorEvent build;
        AbstractC2339H abstractC2339H = this.f56725o;
        if (abstractC2339H == null) {
            return;
        }
        a K02 = K0(abstractC2339H, this.f56711a, this.f56733w == 4);
        timeSinceCreatedMillis = AbstractC5616d1.a().setTimeSinceCreatedMillis(j10 - this.f56715e);
        errorCode = timeSinceCreatedMillis.setErrorCode(K02.f56737a);
        subErrorCode = errorCode.setSubErrorCode(K02.f56738b);
        exception = subErrorCode.setException(abstractC2339H);
        build = exception.build();
        this.f56712b.execute(new Runnable() { // from class: n1.z1
            @Override // java.lang.Runnable
            public final void run() {
                C1.this.f56714d.reportPlaybackErrorEvent(build);
            }
        });
        this.f56710B = true;
        this.f56725o = null;
    }

    public final void T0(InterfaceC2341J interfaceC2341J, InterfaceC5608b.C0829b c0829b, long j10) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        final PlaybackStateEvent build;
        if (interfaceC2341J.g0() != 2) {
            this.f56732v = false;
        }
        if (interfaceC2341J.w() == null) {
            this.f56734x = false;
        } else if (c0829b.a(10)) {
            this.f56734x = true;
        }
        int b12 = b1(interfaceC2341J);
        if (this.f56723m != b12) {
            this.f56723m = b12;
            this.f56710B = true;
            state = o1.a().setState(this.f56723m);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j10 - this.f56715e);
            build = timeSinceCreatedMillis.build();
            this.f56712b.execute(new Runnable() { // from class: n1.B1
                @Override // java.lang.Runnable
                public final void run() {
                    C1.this.f56714d.reportPlaybackStateEvent(build);
                }
            });
        }
    }

    public final void U0(InterfaceC2341J interfaceC2341J, InterfaceC5608b.C0829b c0829b, long j10) {
        if (c0829b.a(2)) {
            b1.T z10 = interfaceC2341J.z();
            boolean c10 = z10.c(2);
            boolean c11 = z10.c(1);
            boolean c12 = z10.c(3);
            if (c10 || c11 || c12) {
                if (!c10) {
                    Z0(j10, null, 0);
                }
                if (!c11) {
                    V0(j10, null, 0);
                }
                if (!c12) {
                    X0(j10, null, 0);
                }
            }
        }
        if (E0(this.f56726p)) {
            b bVar = this.f56726p;
            androidx.media3.common.a aVar = bVar.f56739a;
            if (aVar.f20551w != -1) {
                Z0(j10, aVar, bVar.f56740b);
                this.f56726p = null;
            }
        }
        if (E0(this.f56727q)) {
            b bVar2 = this.f56727q;
            V0(j10, bVar2.f56739a, bVar2.f56740b);
            this.f56727q = null;
        }
        if (E0(this.f56728r)) {
            b bVar3 = this.f56728r;
            X0(j10, bVar3.f56739a, bVar3.f56740b);
            this.f56728r = null;
        }
    }

    public final void V0(long j10, androidx.media3.common.a aVar, int i10) {
        if (Objects.equals(this.f56730t, aVar)) {
            return;
        }
        if (this.f56730t == null && i10 == 0) {
            i10 = 1;
        }
        this.f56730t = aVar;
        a1(0, j10, aVar, i10);
    }

    public final void W0(InterfaceC2341J interfaceC2341J, InterfaceC5608b.C0829b c0829b) {
        DrmInitData I02;
        if (c0829b.a(0)) {
            InterfaceC5608b.a c10 = c0829b.c(0);
            if (this.f56721k != null) {
                Y0(c10.f56809b, c10.f56811d);
            }
        }
        if (c0829b.a(2) && this.f56721k != null && (I02 = I0(interfaceC2341J.z().a())) != null) {
            N0.a(e1.Z.i(this.f56721k)).setDrmType(J0(I02));
        }
        if (c0829b.a(1011)) {
            this.f56709A++;
        }
    }

    public final void X0(long j10, androidx.media3.common.a aVar, int i10) {
        if (Objects.equals(this.f56731u, aVar)) {
            return;
        }
        if (this.f56731u == null && i10 == 0) {
            i10 = 1;
        }
        this.f56731u = aVar;
        a1(2, j10, aVar, i10);
    }

    @Override // n1.InterfaceC5608b
    public void Y(InterfaceC2341J interfaceC2341J, InterfaceC5608b.C0829b c0829b) {
        if (c0829b.d() == 0) {
            return;
        }
        Q0(c0829b);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        W0(interfaceC2341J, c0829b);
        S0(elapsedRealtime);
        U0(interfaceC2341J, c0829b, elapsedRealtime);
        R0(elapsedRealtime);
        T0(interfaceC2341J, c0829b, elapsedRealtime);
        if (c0829b.a(1028)) {
            this.f56713c.b(c0829b.c(1028));
        }
    }

    public final void Y0(AbstractC2346O abstractC2346O, D.b bVar) {
        int b10;
        PlaybackMetrics.Builder builder = this.f56721k;
        if (bVar == null || (b10 = abstractC2346O.b(bVar.f21516a)) == -1) {
            return;
        }
        abstractC2346O.f(b10, this.f56717g);
        abstractC2346O.n(this.f56717g.f24356c, this.f56716f);
        builder.setStreamType(O0(this.f56716f.f24379c));
        AbstractC2346O.c cVar = this.f56716f;
        if (cVar.f24389m != -9223372036854775807L && !cVar.f24387k && !cVar.f24385i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f56716f.d());
        }
        builder.setPlaybackType(this.f56716f.f() ? 2 : 1);
        this.f56710B = true;
    }

    public final void Z0(long j10, androidx.media3.common.a aVar, int i10) {
        if (Objects.equals(this.f56729s, aVar)) {
            return;
        }
        if (this.f56729s == null && i10 == 0) {
            i10 = 1;
        }
        this.f56729s = aVar;
        a1(1, j10, aVar, i10);
    }

    @Override // n1.InterfaceC5608b
    public void a0(InterfaceC5608b.a aVar, InterfaceC2341J.e eVar, InterfaceC2341J.e eVar2, int i10) {
        if (i10 == 1) {
            this.f56732v = true;
        }
        this.f56722l = i10;
    }

    public final void a1(int i10, long j10, androidx.media3.common.a aVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        final TrackChangeEvent build;
        timeSinceCreatedMillis = AbstractC5656w0.a(i10).setTimeSinceCreatedMillis(j10 - this.f56715e);
        if (aVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(P0(i11));
            String str = aVar.f20542n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = aVar.f20543o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = aVar.f20539k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = aVar.f20538j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = aVar.f20550v;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = aVar.f20551w;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = aVar.f20518F;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = aVar.f20519G;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = aVar.f20532d;
            if (str4 != null) {
                Pair L02 = L0(str4);
                timeSinceCreatedMillis.setLanguage((String) L02.first);
                Object obj = L02.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = aVar.f20554z;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f56710B = true;
        build = timeSinceCreatedMillis.build();
        this.f56712b.execute(new Runnable() { // from class: n1.x1
            @Override // java.lang.Runnable
            public final void run() {
                C1.this.f56714d.reportTrackChangeEvent(build);
            }
        });
    }

    public final int b1(InterfaceC2341J interfaceC2341J) {
        int g02 = interfaceC2341J.g0();
        if (this.f56732v) {
            return 5;
        }
        if (this.f56734x) {
            return 13;
        }
        if (g02 == 4) {
            return 11;
        }
        if (g02 == 2) {
            int i10 = this.f56723m;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (interfaceC2341J.S()) {
                return interfaceC2341J.H() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (g02 == 3) {
            if (interfaceC2341J.S()) {
                return interfaceC2341J.H() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (g02 != 1 || this.f56723m == 0) {
            return this.f56723m;
        }
        return 12;
    }

    @Override // n1.InterfaceC5608b
    public void c0(InterfaceC5608b.a aVar, androidx.media3.exoplayer.source.B b10) {
        if (aVar.f56811d == null) {
            return;
        }
        b bVar = new b((androidx.media3.common.a) AbstractC4134a.e(b10.f21510c), b10.f21511d, this.f56713c.c(aVar.f56809b, (D.b) AbstractC4134a.e(aVar.f56811d)));
        int i10 = b10.f21509b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f56727q = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f56728r = bVar;
                return;
            }
        }
        this.f56726p = bVar;
    }

    @Override // n1.InterfaceC5608b
    public void e(InterfaceC5608b.a aVar, AbstractC2339H abstractC2339H) {
        this.f56725o = abstractC2339H;
    }

    @Override // n1.InterfaceC5608b
    public void q(InterfaceC5608b.a aVar, C2223y c2223y, androidx.media3.exoplayer.source.B b10, IOException iOException, boolean z10) {
        this.f56733w = b10.f21508a;
    }

    @Override // n1.InterfaceC5608b
    public void q0(InterfaceC5608b.a aVar, C5507g c5507g) {
        this.f56735y += c5507g.f56202g;
        this.f56736z += c5507g.f56200e;
    }

    @Override // n1.D1.a
    public void r(InterfaceC5608b.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        D.b bVar = aVar.f56811d;
        if (bVar == null || !bVar.b()) {
            G0();
            this.f56720j = str;
            playerName = S0.a().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.8.0");
            this.f56721k = playerVersion;
            Y0(aVar.f56809b, aVar.f56811d);
        }
    }

    @Override // n1.D1.a
    public void u(InterfaceC5608b.a aVar, String str, boolean z10) {
        D.b bVar = aVar.f56811d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f56720j)) {
            G0();
        }
        this.f56718h.remove(str);
        this.f56719i.remove(str);
    }

    @Override // n1.InterfaceC5608b
    public void v0(InterfaceC5608b.a aVar, int i10, long j10, long j11) {
        D.b bVar = aVar.f56811d;
        if (bVar != null) {
            String c10 = this.f56713c.c(aVar.f56809b, (D.b) AbstractC4134a.e(bVar));
            Long l10 = (Long) this.f56719i.get(c10);
            Long l11 = (Long) this.f56718h.get(c10);
            this.f56719i.put(c10, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f56718h.put(c10, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // n1.D1.a
    public void R(InterfaceC5608b.a aVar, String str) {
    }

    @Override // n1.D1.a
    public void p(InterfaceC5608b.a aVar, String str, String str2) {
    }
}
