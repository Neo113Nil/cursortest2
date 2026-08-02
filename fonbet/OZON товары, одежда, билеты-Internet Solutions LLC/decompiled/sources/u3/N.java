package u3;

import B3.C;
import Cm.RunnableC2781a;
import F3.C3013s;
import F3.C3016v;
import F3.InterfaceC3018x;
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
import androidx.media3.exoplayer.C5449k;
import com.google.common.collect.g0;
import fJ.C6474a;
import g1.C6611c;
import j3.AbstractC7252H;
import j3.C7256L;
import j3.C7266h;
import j3.C7270l;
import j3.C7272n;
import j3.C7275q;
import j3.Q;
import j3.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import m3.C8060b;
import p3.C8840A;
import p3.n;
import t3.C9737c;
import u3.InterfaceC9928b;
import u3.O;
import w3.C10425b;
import w3.g;

/* loaded from: classes8.dex */
public final class N implements InterfaceC9928b, O.a {

    /* renamed from: A, reason: collision with root package name */
    private int f99766A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f99767B;

    /* renamed from: a, reason: collision with root package name */
    private final Context f99768a;

    /* renamed from: c, reason: collision with root package name */
    private final v f99770c;

    /* renamed from: d, reason: collision with root package name */
    private final PlaybackSession f99771d;

    /* renamed from: j, reason: collision with root package name */
    private String f99777j;

    /* renamed from: k, reason: collision with root package name */
    private PlaybackMetrics.Builder f99778k;

    /* renamed from: l, reason: collision with root package name */
    private int f99779l;

    /* renamed from: o, reason: collision with root package name */
    private j3.w f99782o;

    /* renamed from: p, reason: collision with root package name */
    private b f99783p;

    /* renamed from: q, reason: collision with root package name */
    private b f99784q;

    /* renamed from: r, reason: collision with root package name */
    private b f99785r;

    /* renamed from: s, reason: collision with root package name */
    private C7272n f99786s;

    /* renamed from: t, reason: collision with root package name */
    private C7272n f99787t;

    /* renamed from: u, reason: collision with root package name */
    private C7272n f99788u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f99789v;

    /* renamed from: w, reason: collision with root package name */
    private int f99790w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f99791x;

    /* renamed from: y, reason: collision with root package name */
    private int f99792y;

    /* renamed from: z, reason: collision with root package name */
    private int f99793z;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f99769b = C8060b.b();

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC7252H.c f99773f = new AbstractC7252H.c();

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC7252H.b f99774g = new AbstractC7252H.b();

    /* renamed from: i, reason: collision with root package name */
    private final HashMap<String, Long> f99776i = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f99775h = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final long f99772e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    private int f99780m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f99781n = 0;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f99794a;

        /* renamed from: b, reason: collision with root package name */
        public final int f99795b;

        public a(int i11, int i12) {
            this.f99794a = i11;
            this.f99795b = i12;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final C7272n f99796a;

        /* renamed from: b, reason: collision with root package name */
        public final int f99797b;

        /* renamed from: c, reason: collision with root package name */
        public final String f99798c;

        public b(C7272n c7272n, int i11, String str) {
            this.f99796a = c7272n;
            this.f99797b = i11;
            this.f99798c = str;
        }
    }

    private N(Context context, PlaybackSession playbackSession) {
        this.f99768a = context.getApplicationContext();
        this.f99771d = playbackSession;
        v vVar = new v();
        this.f99770c = vVar;
        vVar.l(this);
    }

    private boolean g(b bVar) {
        if (bVar != null) {
            return bVar.f99798c.equals(this.f99770c.h());
        }
        return false;
    }

    public static N h(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a11 = C6611c.a(context.getSystemService("media_metrics"));
        if (a11 == null) {
            return null;
        }
        createPlaybackSession = a11.createPlaybackSession();
        return new N(context, createPlaybackSession);
    }

    private void i() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f99778k;
        if (builder != null && this.f99767B) {
            builder.setAudioUnderrunCount(this.f99766A);
            this.f99778k.setVideoFramesDropped(this.f99792y);
            this.f99778k.setVideoFramesPlayed(this.f99793z);
            Long l11 = this.f99775h.get(this.f99777j);
            this.f99778k.setNetworkTransferDurationMillis(l11 == null ? 0L : l11.longValue());
            Long l12 = this.f99776i.get(this.f99777j);
            this.f99778k.setNetworkBytesRead(l12 == null ? 0L : l12.longValue());
            this.f99778k.setStreamSource((l12 == null || l12.longValue() <= 0) ? 0 : 1);
            build = this.f99778k.build();
            this.f99769b.execute(new RunnableC2781a(8, this, build));
        }
        this.f99778k = null;
        this.f99777j = null;
        this.f99766A = 0;
        this.f99792y = 0;
        this.f99793z = 0;
        this.f99786s = null;
        this.f99787t = null;
        this.f99788u = null;
        this.f99767B = false;
    }

    private void k(AbstractC7252H abstractC7252H, InterfaceC3018x.b bVar) {
        int indexOfPeriod;
        int i11;
        PlaybackMetrics.Builder builder = this.f99778k;
        if (bVar == null || (indexOfPeriod = abstractC7252H.getIndexOfPeriod(bVar.f8751a)) == -1) {
            return;
        }
        AbstractC7252H.b bVar2 = this.f99774g;
        abstractC7252H.getPeriod(indexOfPeriod, bVar2);
        int i12 = bVar2.f68939c;
        AbstractC7252H.c cVar = this.f99773f;
        abstractC7252H.getWindow(i12, cVar);
        C7275q.f fVar = cVar.f68948c.f69184b;
        if (fVar == null) {
            i11 = 0;
        } else {
            int J11 = m3.N.J(fVar.f69240a, fVar.f69241b);
            i11 = J11 != 0 ? J11 != 1 ? J11 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i11);
        if (cVar.f68958m != -9223372036854775807L && !cVar.f68956k && !cVar.f68954i && !cVar.a()) {
            builder.setMediaDurationMillis(m3.N.g0(cVar.f68958m));
        }
        builder.setPlaybackType(cVar.a() ? 2 : 1);
        this.f99767B = true;
    }

    private void l(int i11, long j11, C7272n c7272n, int i12) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i13;
        timeSinceCreatedMillis = HB.a.a(i11).setTimeSinceCreatedMillis(j11 - this.f99772e);
        if (c7272n != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i12 != 1) {
                i13 = 3;
                if (i12 != 2) {
                    i13 = i12 != 3 ? 1 : 4;
                }
            } else {
                i13 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i13);
            String str = c7272n.f69126n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c7272n.f69127o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c7272n.f69123k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i14 = c7272n.f69122j;
            if (i14 != -1) {
                timeSinceCreatedMillis.setBitrate(i14);
            }
            int i15 = c7272n.f69134v;
            if (i15 != -1) {
                timeSinceCreatedMillis.setWidth(i15);
            }
            int i16 = c7272n.f69135w;
            if (i16 != -1) {
                timeSinceCreatedMillis.setHeight(i16);
            }
            int i17 = c7272n.f69102G;
            if (i17 != -1) {
                timeSinceCreatedMillis.setChannelCount(i17);
            }
            int i18 = c7272n.f69103H;
            if (i18 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i18);
            }
            String str4 = c7272n.f69116d;
            if (str4 != null) {
                int i19 = m3.N.f74289a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f7 = c7272n.f69138z;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f99767B = true;
        build = timeSinceCreatedMillis.build();
        this.f99769b.execute(new Z.f(5, this, build));
    }

    @Override // u3.InterfaceC9928b
    public final void a(C9737c c9737c) {
        this.f99792y += c9737c.f99017g;
        this.f99793z += c9737c.f99015e;
    }

    public final LogSessionId j() {
        LogSessionId sessionId;
        sessionId = this.f99771d.getSessionId();
        return sessionId;
    }

    @Override // u3.O.a
    public final void onAdPlaybackStarted(InterfaceC9928b.a aVar, String str, String str2) {
    }

    @Override // u3.InterfaceC9928b
    public final void onBandwidthEstimate(InterfaceC9928b.a aVar, int i11, long j11, long j12) {
        InterfaceC3018x.b bVar = aVar.f99807d;
        if (bVar != null) {
            String k11 = this.f99770c.k(aVar.f99805b, bVar);
            HashMap<String, Long> hashMap = this.f99776i;
            Long l11 = hashMap.get(k11);
            HashMap<String, Long> hashMap2 = this.f99775h;
            Long l12 = hashMap2.get(k11);
            hashMap.put(k11, Long.valueOf((l11 == null ? 0L : l11.longValue()) + j11));
            hashMap2.put(k11, Long.valueOf((l12 != null ? l12.longValue() : 0L) + i11));
        }
    }

    @Override // u3.InterfaceC9928b
    public final void onDownstreamFormatChanged(InterfaceC9928b.a aVar, C3016v c3016v) {
        InterfaceC3018x.b bVar = aVar.f99807d;
        if (bVar == null) {
            return;
        }
        C7272n c7272n = c3016v.f8746c;
        c7272n.getClass();
        bVar.getClass();
        b bVar2 = new b(c7272n, c3016v.f8747d, this.f99770c.k(aVar.f99805b, bVar));
        int i11 = c3016v.f8745b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f99784q = bVar2;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f99785r = bVar2;
                return;
            }
        }
        this.f99783p = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x048a  */
    @Override // u3.InterfaceC9928b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onEvents(j3.y yVar, InterfaceC9928b.C2198b c2198b) {
        v vVar;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        a aVar;
        a aVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i23;
        b bVar;
        int i24;
        int i25;
        boolean z12;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        C7272n c7272n;
        C7270l c7270l;
        int i26;
        if (c2198b.d() == 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            int d11 = c2198b.d();
            vVar = this.f99770c;
            if (i27 >= d11) {
                break;
            }
            int b11 = c2198b.b(i27);
            InterfaceC9928b.a c11 = c2198b.c(b11);
            if (b11 == 0) {
                vVar.p(c11);
            } else if (b11 == 11) {
                vVar.o(c11, this.f99779l);
            } else {
                vVar.n(c11);
            }
            i27++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c2198b.a(0)) {
            InterfaceC9928b.a c12 = c2198b.c(0);
            if (this.f99778k != null) {
                k(c12.f99805b, c12.f99807d);
            }
        }
        if (c2198b.a(2) && this.f99778k != null) {
            g0<C7256L.a> listIterator = yVar.i().a().listIterator(0);
            loop1: while (true) {
                if (!listIterator.hasNext()) {
                    c7270l = null;
                    break;
                }
                C7256L.a next = listIterator.next();
                for (int i28 = 0; i28 < next.f69035a; i28++) {
                    if (next.f(i28) && (c7270l = next.b(i28).f69131s) != null) {
                        break loop1;
                    }
                }
            }
            if (c7270l != null) {
                PlaybackMetrics.Builder a11 = C6474a.a(this.f99778k);
                int i29 = 0;
                while (true) {
                    if (i29 >= c7270l.f69087d) {
                        i26 = 1;
                        break;
                    }
                    UUID uuid = c7270l.c(i29).f69089b;
                    if (uuid.equals(C7266h.f69064d)) {
                        i26 = 3;
                        break;
                    } else if (uuid.equals(C7266h.f69065e)) {
                        i26 = 2;
                        break;
                    } else {
                        if (uuid.equals(C7266h.f69063c)) {
                            i26 = 6;
                            break;
                        }
                        i29++;
                    }
                }
                a11.setDrmType(i26);
            }
        }
        if (c2198b.a(1011)) {
            this.f99766A++;
        }
        j3.w wVar = this.f99782o;
        Context context = this.f99768a;
        Executor executor = this.f99769b;
        long j11 = this.f99772e;
        int i31 = 5;
        if (wVar == null) {
            i23 = 1;
            i16 = 13;
            i12 = 8;
            i13 = 7;
            i14 = 6;
            i15 = 9;
        } else {
            boolean z13 = this.f99790w == 4;
            int i32 = wVar.f69342a;
            if (i32 == 1001) {
                aVar = new a(20, 0);
            } else {
                if (wVar instanceof C5449k) {
                    C5449k c5449k = (C5449k) wVar;
                    z11 = c5449k.f44076c == 1;
                    i11 = c5449k.f44080g;
                } else {
                    i11 = 0;
                    z11 = false;
                }
                Throwable cause = wVar.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i33 = 24;
                    i12 = 8;
                    i13 = 7;
                    i14 = 6;
                    i15 = 9;
                    if (z11 && (i11 == 0 || i11 == 1)) {
                        aVar = new a(35, 0);
                    } else if (z11 && i11 == 3) {
                        aVar = new a(15, 0);
                    } else if (z11 && i11 == 2) {
                        aVar = new a(23, 0);
                    } else {
                        if (cause instanceof C.b) {
                            i16 = 13;
                            aVar2 = new a(13, m3.N.z(((C.b) cause).f2289d));
                        } else {
                            i16 = 13;
                            if (cause instanceof B3.s) {
                                aVar = new a(14, ((B3.s) cause).f2368b);
                            } else if (cause instanceof OutOfMemoryError) {
                                aVar = new a(14, 0);
                            } else if (cause instanceof v3.r) {
                                aVar = new a(17, ((v3.r) cause).f101939a);
                            } else if (cause instanceof v3.u) {
                                aVar = new a(18, ((v3.u) cause).f101941a);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (m3.N.y(errorCode2)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i33 = 28;
                                        break;
                                    case 6004:
                                        i33 = 25;
                                        break;
                                    case 6005:
                                        i33 = 26;
                                        break;
                                    default:
                                        i33 = 27;
                                        break;
                                }
                                aVar2 = new a(i33, errorCode2);
                            } else {
                                aVar = new a(22, 0);
                            }
                            timeSinceCreatedMillis = pX.a.a().setTimeSinceCreatedMillis(elapsedRealtime - j11);
                            errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f99794a);
                            subErrorCode = errorCode.setSubErrorCode(aVar.f99795b);
                            exception = subErrorCode.setException(wVar);
                            build = exception.build();
                            executor.execute(new d0.P(3, this, build));
                            i23 = 1;
                            this.f99767B = true;
                            this.f99782o = null;
                        }
                        aVar = aVar2;
                        timeSinceCreatedMillis = pX.a.a().setTimeSinceCreatedMillis(elapsedRealtime - j11);
                        errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f99794a);
                        subErrorCode = errorCode.setSubErrorCode(aVar.f99795b);
                        exception = subErrorCode.setException(wVar);
                        build = exception.build();
                        executor.execute(new d0.P(3, this, build));
                        i23 = 1;
                        this.f99767B = true;
                        this.f99782o = null;
                    }
                    i16 = 13;
                    timeSinceCreatedMillis = pX.a.a().setTimeSinceCreatedMillis(elapsedRealtime - j11);
                    errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f99794a);
                    subErrorCode = errorCode.setSubErrorCode(aVar.f99795b);
                    exception = subErrorCode.setException(wVar);
                    build = exception.build();
                    executor.execute(new d0.P(3, this, build));
                    i23 = 1;
                    this.f99767B = true;
                    this.f99782o = null;
                } else if (cause instanceof p3.s) {
                    aVar = new a(5, ((p3.s) cause).f80119d);
                } else {
                    if ((cause instanceof p3.r) || (cause instanceof j3.v)) {
                        i17 = 9;
                        i18 = 8;
                        i19 = 6;
                        i21 = 7;
                        aVar = new a(z13 ? 10 : 11, 0);
                    } else {
                        boolean z14 = cause instanceof p3.q;
                        if (z14 || (cause instanceof C8840A.a)) {
                            i17 = 9;
                            if (m3.y.d(context).e() == 1) {
                                aVar = new a(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    aVar = new a(6, 0);
                                    i15 = 9;
                                    i14 = 6;
                                    i16 = 13;
                                    i12 = 8;
                                    i13 = 7;
                                } else {
                                    i19 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i21 = 7;
                                        aVar = new a(7, 0);
                                    } else {
                                        i21 = 7;
                                        if (z14 && ((p3.q) cause).f80118c == 1) {
                                            aVar = new a(4, 0);
                                        } else {
                                            i18 = 8;
                                            aVar = new a(8, 0);
                                        }
                                    }
                                    i15 = 9;
                                    i14 = 6;
                                    i13 = i21;
                                    i16 = 13;
                                    i12 = 8;
                                }
                                timeSinceCreatedMillis = pX.a.a().setTimeSinceCreatedMillis(elapsedRealtime - j11);
                                errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f99794a);
                                subErrorCode = errorCode.setSubErrorCode(aVar.f99795b);
                                exception = subErrorCode.setException(wVar);
                                build = exception.build();
                                executor.execute(new d0.P(3, this, build));
                                i23 = 1;
                                this.f99767B = true;
                                this.f99782o = null;
                            }
                        } else if (i32 == 1002) {
                            aVar = new a(21, 0);
                        } else if (cause instanceof g.a) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int z15 = m3.N.z(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (m3.N.y(z15)) {
                                    case 6002:
                                        i22 = 24;
                                        break;
                                    case 6003:
                                        i22 = 28;
                                        break;
                                    case 6004:
                                        i22 = 25;
                                        break;
                                    case 6005:
                                        i22 = 26;
                                        break;
                                    default:
                                        i22 = 27;
                                        break;
                                }
                                aVar = new a(i22, z15);
                            } else {
                                aVar = cause3 instanceof MediaDrmResetException ? new a(27, 0) : cause3 instanceof NotProvisionedException ? new a(24, 0) : cause3 instanceof DeniedByServerException ? new a(29, 0) : cause3 instanceof w3.w ? new a(23, 0) : cause3 instanceof C10425b.d ? new a(28, 0) : new a(30, 0);
                            }
                        } else if ((cause instanceof n.b) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            aVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
                        } else {
                            i17 = 9;
                            aVar = new a(9, 0);
                        }
                        i15 = i17;
                        i16 = 13;
                        i12 = 8;
                        i13 = 7;
                        i14 = 6;
                        timeSinceCreatedMillis = pX.a.a().setTimeSinceCreatedMillis(elapsedRealtime - j11);
                        errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f99794a);
                        subErrorCode = errorCode.setSubErrorCode(aVar.f99795b);
                        exception = subErrorCode.setException(wVar);
                        build = exception.build();
                        executor.execute(new d0.P(3, this, build));
                        i23 = 1;
                        this.f99767B = true;
                        this.f99782o = null;
                    }
                    i15 = i17;
                    i12 = i18;
                    i14 = i19;
                    i13 = i21;
                    i16 = 13;
                    timeSinceCreatedMillis = pX.a.a().setTimeSinceCreatedMillis(elapsedRealtime - j11);
                    errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f99794a);
                    subErrorCode = errorCode.setSubErrorCode(aVar.f99795b);
                    exception = subErrorCode.setException(wVar);
                    build = exception.build();
                    executor.execute(new d0.P(3, this, build));
                    i23 = 1;
                    this.f99767B = true;
                    this.f99782o = null;
                }
            }
            i16 = 13;
            i12 = 8;
            i13 = 7;
            i14 = 6;
            i15 = 9;
            timeSinceCreatedMillis = pX.a.a().setTimeSinceCreatedMillis(elapsedRealtime - j11);
            errorCode = timeSinceCreatedMillis.setErrorCode(aVar.f99794a);
            subErrorCode = errorCode.setSubErrorCode(aVar.f99795b);
            exception = subErrorCode.setException(wVar);
            build = exception.build();
            executor.execute(new d0.P(3, this, build));
            i23 = 1;
            this.f99767B = true;
            this.f99782o = null;
        }
        if (c2198b.a(2)) {
            C7256L i34 = yVar.i();
            boolean c13 = i34.c(2);
            boolean c14 = i34.c(i23);
            boolean c15 = i34.c(3);
            if (c13 || c14 || c15) {
                if (c13) {
                    c7272n = null;
                } else {
                    c7272n = null;
                    if (!Objects.equals(this.f99786s, null)) {
                        int i35 = this.f99786s == null ? 1 : 0;
                        this.f99786s = null;
                        l(1, elapsedRealtime, null, i35);
                    }
                }
                if (!c14 && !Objects.equals(this.f99787t, c7272n)) {
                    int i36 = this.f99787t == null ? 1 : 0;
                    this.f99787t = c7272n;
                    l(0, elapsedRealtime, c7272n, i36);
                }
                if (!c15 && !Objects.equals(this.f99788u, c7272n)) {
                    int i37 = this.f99788u == null ? 1 : 0;
                    this.f99788u = c7272n;
                    l(2, elapsedRealtime, c7272n, i37);
                }
                bVar = c7272n;
                if (g(this.f99783p)) {
                    b bVar2 = this.f99783p;
                    C7272n c7272n2 = bVar2.f99796a;
                    if (c7272n2.f69135w != -1) {
                        if (!Objects.equals(this.f99786s, c7272n2)) {
                            C7272n c7272n3 = this.f99786s;
                            int i38 = bVar2.f99797b;
                            int i39 = (c7272n3 == null && i38 == 0) ? 1 : i38;
                            this.f99786s = c7272n2;
                            l(1, elapsedRealtime, c7272n2, i39);
                        }
                        this.f99783p = bVar;
                    }
                }
                if (g(this.f99784q)) {
                    b bVar3 = this.f99784q;
                    C7272n c7272n4 = bVar3.f99796a;
                    if (!Objects.equals(this.f99787t, c7272n4)) {
                        C7272n c7272n5 = this.f99787t;
                        int i41 = bVar3.f99797b;
                        int i42 = (c7272n5 == null && i41 == 0) ? 1 : i41;
                        this.f99787t = c7272n4;
                        l(0, elapsedRealtime, c7272n4, i42);
                    }
                    this.f99784q = bVar;
                }
                if (g(this.f99785r)) {
                    b bVar4 = this.f99785r;
                    C7272n c7272n6 = bVar4.f99796a;
                    if (!Objects.equals(this.f99788u, c7272n6)) {
                        C7272n c7272n7 = this.f99788u;
                        int i43 = bVar4.f99797b;
                        int i44 = (c7272n7 == null && i43 == 0) ? 1 : i43;
                        this.f99788u = c7272n6;
                        l(2, elapsedRealtime, c7272n6, i44);
                    }
                    this.f99785r = bVar;
                }
                switch (m3.y.d(context).e()) {
                    case 0:
                        i24 = 0;
                        break;
                    case 1:
                        i24 = i15;
                        break;
                    case 2:
                        i24 = 2;
                        break;
                    case 3:
                        i24 = 4;
                        break;
                    case 4:
                        i24 = 5;
                        break;
                    case 5:
                        i24 = i14;
                        break;
                    case 6:
                    case 8:
                    default:
                        i24 = 1;
                        break;
                    case 7:
                        i24 = 3;
                        break;
                    case 9:
                        i24 = i12;
                        break;
                    case 10:
                        i24 = i13;
                        break;
                }
                if (i24 != this.f99781n) {
                    this.f99781n = i24;
                    networkType = L.a().setNetworkType(i24);
                    timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - j11);
                    build3 = timeSinceCreatedMillis3.build();
                    executor.execute(new L3.q(5, this, build3));
                }
                if (yVar.P() != 2) {
                    this.f99789v = false;
                }
                if (yVar.a() != null) {
                    this.f99791x = false;
                    i25 = 10;
                } else {
                    i25 = 10;
                    if (c2198b.a(10)) {
                        this.f99791x = true;
                    }
                }
                int P11 = yVar.P();
                if (!this.f99789v) {
                    if (!this.f99791x) {
                        i16 = 4;
                        if (P11 == 4) {
                            i31 = 11;
                        } else {
                            i31 = 12;
                            if (P11 == 2) {
                                int i45 = this.f99780m;
                                if (i45 == 0 || i45 == 2 || i45 == 12) {
                                    i31 = 2;
                                } else if (yVar.n()) {
                                    if (yVar.F() == 0) {
                                        i31 = i14;
                                    }
                                    i31 = i25;
                                } else {
                                    i31 = i13;
                                }
                            } else {
                                i25 = 3;
                                if (P11 != 3) {
                                    z12 = true;
                                    if (P11 != 1 || this.f99780m == 0) {
                                        i31 = this.f99780m;
                                    }
                                    if (this.f99780m != i31) {
                                        this.f99780m = i31;
                                        this.f99767B = z12;
                                        state = pX.b.a().setState(this.f99780m);
                                        timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - j11);
                                        build2 = timeSinceCreatedMillis2.build();
                                        executor.execute(new C.E(1, this, build2));
                                    }
                                    if (c2198b.a(1028)) {
                                        vVar.g(c2198b.c(1028));
                                        return;
                                    }
                                    return;
                                }
                                if (yVar.n()) {
                                    if (yVar.F() != 0) {
                                        i31 = i15;
                                    }
                                    i31 = i25;
                                }
                            }
                        }
                    }
                    i31 = i16;
                }
                z12 = true;
                if (this.f99780m != i31) {
                }
                if (c2198b.a(1028)) {
                }
            }
        }
        bVar = 0;
        if (g(this.f99783p)) {
        }
        if (g(this.f99784q)) {
        }
        if (g(this.f99785r)) {
        }
        switch (m3.y.d(context).e()) {
        }
        if (i24 != this.f99781n) {
        }
        if (yVar.P() != 2) {
        }
        if (yVar.a() != null) {
        }
        int P112 = yVar.P();
        if (!this.f99789v) {
        }
        z12 = true;
        if (this.f99780m != i31) {
        }
        if (c2198b.a(1028)) {
        }
    }

    @Override // u3.InterfaceC9928b
    public final void onLoadError(InterfaceC9928b.a aVar, C3013s c3013s, C3016v c3016v, IOException iOException, boolean z11) {
        this.f99790w = c3016v.f8744a;
    }

    @Override // u3.InterfaceC9928b
    public final void onPlayerError(InterfaceC9928b.a aVar, j3.w wVar) {
        this.f99782o = wVar;
    }

    @Override // u3.InterfaceC9928b
    public final void onPositionDiscontinuity(InterfaceC9928b.a aVar, y.d dVar, y.d dVar2, int i11) {
        if (i11 == 1) {
            this.f99789v = true;
        }
        this.f99779l = i11;
    }

    @Override // u3.O.a
    public final void onSessionActive(InterfaceC9928b.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        InterfaceC3018x.b bVar = aVar.f99807d;
        if (bVar == null || !bVar.b()) {
            i();
            this.f99777j = str;
            playerName = B3.B.a().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.8.0");
            this.f99778k = playerVersion;
            k(aVar.f99805b, bVar);
        }
    }

    @Override // u3.O.a
    public final void onSessionCreated(InterfaceC9928b.a aVar, String str) {
    }

    @Override // u3.O.a
    public final void onSessionFinished(InterfaceC9928b.a aVar, String str, boolean z11) {
        InterfaceC3018x.b bVar = aVar.f99807d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f99777j)) {
            i();
        }
        this.f99775h.remove(str);
        this.f99776i.remove(str);
    }

    @Override // u3.InterfaceC9928b
    public final void onVideoSizeChanged(InterfaceC9928b.a aVar, Q q11) {
        b bVar = this.f99783p;
        if (bVar != null) {
            C7272n c7272n = bVar.f99796a;
            if (c7272n.f69135w == -1) {
                C7272n.a a11 = c7272n.a();
                a11.F0(q11.f69043a);
                a11.h0(q11.f69044b);
                this.f99783p = new b(a11.P(), bVar.f99797b, bVar.f99798c);
            }
        }
    }
}
