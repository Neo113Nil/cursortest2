package com.vk.media.recorder;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import com.vk.media.recorder.impl.BufferItem;
import com.vk.media.recorder.impl.Streamer;
import com.vk.media.recorder.impl.j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URI;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.media.LiveStreamStatReporterDebugLog;
import ru.ok.media.StreamerBase;
import ru.ok.media.StreamerLinkState;
import ru.ok.media.StreamerLinkStats;
import ru.ok.media.StreamerPacketsInfo;
import ru.ok.media.StreamerStatistic;
import ru.ok.media.StreamingStatisticsHandler;
import ru.ok.media.api.LiveStreamStatReporter;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.StreamerState;
import ru.ok.media.api.VideoCBRMode;
import xsna.axi;
import xsna.byi;
import xsna.cyi;
import xsna.d830;
import xsna.fp;
import xsna.fqg0;
import xsna.g4j;
import xsna.imz;
import xsna.io9;
import xsna.jfe0;
import xsna.jn4;
import xsna.lms0;
import xsna.mo9;
import xsna.ne7;
import xsna.nhf0;
import xsna.ohf0;
import xsna.oj9;
import xsna.oom0;
import xsna.phf0;
import xsna.pj9;
import xsna.qom0;
import xsna.ro2;
import xsna.sk9;
import xsna.sy70;
import xsna.tto0;
import xsna.uqg0;
import xsna.wb6;
import xsna.xb6;
import xsna.zip;

/* compiled from: RecorderSurface18.java */
/* loaded from: classes3.dex */
public final class e extends i {
    public final Context L;
    public final boolean M;
    public boolean N = false;
    public final Streamer.MODE O = Streamer.MODE.AUDIO_VIDEO;
    public int P = -1;
    public final c Q = new c();
    public Streamer.CONNECTION_STATE R = Streamer.CONNECTION_STATE.INITIALIZED;
    public Streamer.STATUS S = Streamer.STATUS.SUCCESS;
    public Streamer.CAPTURE_STATE T;
    public Streamer.CAPTURE_STATE U;
    public Streamer.RECORD_STATE V;
    public com.vk.media.recorder.impl.e W;
    public cyi X;
    public byi Y;
    public volatile boolean Z;
    public phf0 a0;

    @Nullable
    public LiveStreamStatReporter b0;

    @Nullable
    public String c0;

    @Nullable
    public d d0;
    public final tto0 e0;

    @Nullable
    public StreamingStatisticsHandler f0;

    @Nullable
    public Integer g0;

    @Nullable
    public sk9 h0;

    /* compiled from: RecorderSurface18.java */
    public class a {
        public a() {
        }
    }

    /* compiled from: RecorderSurface18.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Streamer.CONNECTION_STATE.values().length];
            b = iArr;
            try {
                iArr[Streamer.CONNECTION_STATE.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Streamer.CONNECTION_STATE.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Streamer.CONNECTION_STATE.SETUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Streamer.CONNECTION_STATE.RECORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[Streamer.CONNECTION_STATE.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[StreamerState.values().length];
            a = iArr2;
            try {
                iArr2[StreamerState.waiting.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[StreamerState.preparing.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[StreamerState.starting.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[StreamerState.started.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[StreamerState.paused.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[StreamerState.finished.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[StreamerState.failed.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[StreamerState.unrecoverableFailure.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: RecorderSurface18.java */
    public class c implements Streamer.b {
        public c() {
        }

        @Override // com.vk.media.recorder.impl.Streamer.b
        public final void a(Streamer.CAPTURE_STATE capture_state) {
            LiveStreamStatReporter statsReporter;
            e eVar = e.this;
            Objects.toString(eVar.U);
            Objects.toString(capture_state);
            Objects.toString(eVar.r);
            d dVar = eVar.d0;
            if (dVar != null && ((capture_state == Streamer.CAPTURE_STATE.FAILED || capture_state == Streamer.CAPTURE_STATE.ENCODER_FAIL) && (statsReporter = dVar.getStatsReporter()) != null)) {
                statsReporter.streamAudioFailed(capture_state.toString(), "");
            }
            eVar.U = capture_state;
            if (capture_state == Streamer.CAPTURE_STATE.STARTED) {
                eVar.R();
                return;
            }
            Streamer.CAPTURE_STATE capture_state2 = Streamer.CAPTURE_STATE.FAILED;
            if (capture_state == capture_state2 || capture_state == Streamer.CAPTURE_STATE.ENCODER_FAIL) {
                if (capture_state == Streamer.CAPTURE_STATE.ENCODER_FAIL) {
                    eVar.m();
                } else {
                    eVar.A();
                }
                eVar.r = RecorderBase.State.IDLE;
                eVar.g(capture_state == capture_state2 ? 1000 : 1001, false);
                return;
            }
            Streamer.CAPTURE_STATE capture_state3 = Streamer.CAPTURE_STATE.STOPPED;
            if (capture_state == capture_state3 && eVar.N && eVar.T == capture_state3 && capture_state == capture_state3) {
                eVar.l();
            }
        }

        @Override // com.vk.media.recorder.impl.Streamer.b
        public final void b(Streamer.CAPTURE_STATE capture_state) {
            LiveStreamStatReporter statsReporter;
            e eVar = e.this;
            Objects.toString(eVar.T);
            Objects.toString(capture_state);
            Objects.toString(eVar.r);
            d dVar = eVar.d0;
            if (dVar != null && ((capture_state == Streamer.CAPTURE_STATE.FAILED || capture_state == Streamer.CAPTURE_STATE.ENCODER_FAIL) && (statsReporter = dVar.getStatsReporter()) != null)) {
                statsReporter.streamVideoFailed(capture_state.toString(), "");
            }
            eVar.T = capture_state;
            if (capture_state == Streamer.CAPTURE_STATE.STARTED) {
                eVar.R();
                return;
            }
            Streamer.CAPTURE_STATE capture_state2 = Streamer.CAPTURE_STATE.FAILED;
            if (capture_state == capture_state2 || capture_state == Streamer.CAPTURE_STATE.ENCODER_FAIL) {
                if (capture_state == Streamer.CAPTURE_STATE.ENCODER_FAIL) {
                    eVar.m();
                } else {
                    eVar.A();
                }
                eVar.r = RecorderBase.State.IDLE;
                eVar.g(capture_state == capture_state2 ? 1000 : 1001, true);
                return;
            }
            Streamer.CAPTURE_STATE capture_state3 = Streamer.CAPTURE_STATE.STOPPED;
            if (capture_state == capture_state3 && eVar.N && capture_state == capture_state3 && eVar.U == capture_state3) {
                eVar.l();
            }
        }

        @Override // com.vk.media.recorder.impl.Streamer.b
        public final void c(long j) {
            e eVar = e.this;
            eVar.z = j;
            eVar.a.post(new ohf0(eVar, j, 0));
        }

        @Override // com.vk.media.recorder.impl.Streamer.b
        public final void d(int i, Streamer.CONNECTION_STATE connection_state, Streamer.STATUS status) {
            e eVar = e.this;
            Objects.toString(eVar.R);
            Objects.toString(connection_state);
            Objects.toString(eVar.S);
            Objects.toString(status);
            d dVar = eVar.d0;
            if (dVar != null) {
                StreamerState streamerState = dVar.get_state();
                ne7.m("RecorderSurface18", "RtmpVkStreamer.onConnectionStateChanged() in _state= " + streamerState + " i= " + i + " state= " + connection_state + " status= " + status);
                int i2 = b.a[streamerState.ordinal()];
                if (i2 == 3) {
                    int i3 = b.b[connection_state.ordinal()];
                    if (i3 == 3) {
                        dVar.set_wasConnected(true);
                    } else if (i3 == 4) {
                        dVar.setWasStarted(true);
                        dVar.updateState(StreamerState.started);
                    } else if (i3 == 5) {
                        dVar.updateState(StreamerState.failed);
                    }
                } else if (i2 == 4 && b.b[connection_state.ordinal()] == 5) {
                    dVar.updateState(StreamerState.failed);
                } else {
                    ne7.n("RecorderSurface18", "RtmpVkStreamer.onConnectionStateChanged() - unexpected in _state= " + streamerState + " i= " + i + " state= " + connection_state + " status= " + status);
                }
            }
            eVar.R = connection_state;
            eVar.S = status;
            if (connection_state == Streamer.CONNECTION_STATE.RECORD) {
                eVar.f(-1004);
            } else if (connection_state == Streamer.CONNECTION_STATE.CONNECTED) {
                eVar.f(-1005);
            } else if (connection_state == Streamer.CONNECTION_STATE.DISCONNECTED) {
                eVar.f(-1006);
            }
        }

        @Override // com.vk.media.recorder.impl.Streamer.b
        public final void e(@NonNull nhf0 nhf0Var) {
            e eVar = e.this;
            eVar.a.post(new ro2(3, eVar, nhf0Var));
        }

        @Override // com.vk.media.recorder.impl.Streamer.b
        public final void f() {
            mo9.b bVar = e.this.j;
            if (bVar != null) {
                bVar.c();
            }
        }

        @Override // com.vk.media.recorder.impl.Streamer.b
        public final void g(Streamer.RECORD_STATE record_state) {
            e eVar;
            RecorderBase.d dVar;
            Objects.toString(e.this.V);
            Objects.toString(record_state);
            Objects.toString(e.this.r);
            e eVar2 = e.this;
            d dVar2 = eVar2.d0;
            eVar2.V = record_state;
            if (record_state == Streamer.RECORD_STATE.STARTED && eVar2.r == RecorderBase.State.RECORDING) {
                eVar2.J();
            }
            if (record_state != Streamer.RECORD_STATE.STOPPED || (dVar = (eVar = e.this).i) == null) {
                return;
            }
            dVar.a(eVar.m, false);
        }

        @Override // com.vk.media.recorder.impl.Streamer.b
        public final Handler getHandler() {
            return e.this.a;
        }
    }

    public e(Context context, boolean z, boolean z2) {
        Streamer.CAPTURE_STATE capture_state = Streamer.CAPTURE_STATE.FAILED;
        this.T = capture_state;
        this.U = capture_state;
        this.V = Streamer.RECORD_STATE.INITIALIZED;
        this.c0 = null;
        this.d0 = null;
        this.e0 = new tto0();
        if (z2 && jfe0.b == null) {
            axi axiVar = new axi(new boolean[]{true, true, true, true, true}, false, false);
            if (!axiVar.equals(jfe0.b)) {
                ne7.i = new jfe0(axiVar);
                jfe0.b = axiVar;
            }
        }
        this.L = context;
        this.M = z;
        this.A = z ? RecorderBase.RecordingType.LIVE : RecorderBase.RecordingType.ORIGINAL;
        this.F.b = z;
        this.k = false;
        this.z = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // com.vk.media.recorder.RecorderBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A() {
        long j;
        d dVar;
        int i;
        g4j g4jVar;
        long j2 = this.t;
        if (j2 > 0) {
            long j3 = this.u;
            if (j3 > j2) {
                j = (j3 - j2) / 1000000;
                super.A();
                ne7.m("RecorderSurface18", "stopRecord() - duration= " + j);
                dVar = this.d0;
                if (dVar != null) {
                    dVar.stop();
                    dVar.release();
                    this.d0 = null;
                }
                this.g0 = null;
                if (this.W != null) {
                    return;
                }
                if (!TextUtils.isEmpty(this.n)) {
                    int i2 = this.P;
                    if (i2 != -1) {
                        try {
                            this.W.i(i2);
                            com.vk.media.recorder.impl.e eVar = this.W;
                            i = this.P;
                            g4jVar = eVar.a;
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        if (g4jVar == null) {
                            throw new IllegalStateException("After release(), the streamer is no longer available");
                        }
                        g4jVar.e(i);
                    }
                }
                if (this.q) {
                    this.q = false;
                    if (this.m != null) {
                        try {
                            this.W.m();
                        } catch (Throwable th) {
                            th.toString();
                        }
                    }
                    this.r = RecorderBase.State.PREPARED;
                    if (j <= e() || this.m == null) {
                        return;
                    }
                    if (!this.m.exists() || this.m.length() <= 0) {
                        StringBuilder b2 = fp.b(j, "error: duration=", " sec, file length=");
                        b2.append(this.m.length());
                        Log.e("RecorderSurface18", b2.toString());
                        g(1002, true);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        j = 0;
        super.A();
        ne7.m("RecorderSurface18", "stopRecord() - duration= " + j);
        dVar = this.d0;
        if (dVar != null) {
        }
        this.g0 = null;
        if (this.W != null) {
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean C() {
        return this.m == null;
    }

    @Override // com.vk.media.recorder.f
    public final boolean E() {
        com.vk.media.recorder.impl.e eVar = this.W;
        if (eVar == null) {
            return true;
        }
        j jVar = eVar.m;
        return true;
    }

    @Override // com.vk.media.recorder.f
    public final Surface F() {
        com.vk.media.recorder.impl.e eVar;
        j jVar;
        if (this.Z || (eVar = this.W) == null || (jVar = eVar.m) == null) {
            return null;
        }
        return jVar.q;
    }

    @Override // com.vk.media.recorder.f
    public final boolean I(long j) {
        j jVar;
        com.vk.media.recorder.impl.e eVar = this.W;
        lms0 lms0Var = null;
        if (eVar != null && (jVar = eVar.d) != null) {
            lms0Var = jVar.h;
        }
        if (lms0Var == null) {
            return true;
        }
        if (j - lms0Var.b < lms0Var.a) {
            return false;
        }
        lms0Var.b = j;
        return true;
    }

    @Override // com.vk.media.recorder.f
    public final void K(d830 d830Var) {
        com.vk.media.recorder.impl.e eVar = this.W;
        if (eVar != null) {
            eVar.l = d830Var;
            j jVar = eVar.d;
            if (jVar != null) {
                jVar.o = d830Var != null ? new d830(d830Var) : null;
            }
        }
    }

    @Override // com.vk.media.recorder.f
    public final void N() {
        if (this.W != null) {
            A();
            this.r = RecorderBase.State.IDLE;
            com.vk.media.recorder.impl.e eVar = this.W;
            eVar.n = null;
            eVar.n();
            this.W.l();
            com.vk.media.recorder.impl.e eVar2 = this.W;
            if (eVar2.b != null) {
                g4j g4jVar = eVar2.a;
                if (g4jVar != null) {
                    g4jVar.j = null;
                }
                j jVar = eVar2.d;
                if (jVar != null) {
                    jVar.d = null;
                }
                com.vk.media.recorder.impl.a aVar = eVar2.c;
                if (aVar != null) {
                    aVar.h = null;
                }
                if (g4jVar != null) {
                    ConcurrentHashMap concurrentHashMap = g4jVar.b;
                    Iterator it = concurrentHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        ((wb6) ((Map.Entry) it.next()).getValue()).b();
                    }
                    concurrentHashMap.clear();
                    g4jVar.k.clear();
                    g4jVar.g();
                    g4jVar.j = null;
                    eVar2.a = null;
                }
                eVar2.m();
                eVar2.n();
                eVar2.l();
                eVar2.f = null;
                eVar2.b = null;
            }
            eVar2.m = null;
            this.W = null;
            Streamer.CAPTURE_STATE capture_state = Streamer.CAPTURE_STATE.STOPPED;
            this.U = capture_state;
            this.T = capture_state;
        }
    }

    public final void Q() {
        LiveStreamStatReporter liveStreamStatReporter = this.b0;
        if (liveStreamStatReporter != null) {
            this.b0 = null;
            com.vk.media.recorder.impl.e eVar = this.W;
            if (eVar != null) {
                eVar.i(this.P);
            }
            liveStreamStatReporter.streamEnded("");
        }
        this.c0 = null;
        this.K.set(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R() {
        URI uri;
        int i;
        String str;
        String str2;
        String str3;
        wb6 fqg0Var;
        Streamer.MODE mode = this.O;
        if (mode == Streamer.MODE.AUDIO_VIDEO) {
            Streamer.CAPTURE_STATE capture_state = this.T;
            Streamer.CAPTURE_STATE capture_state2 = Streamer.CAPTURE_STATE.STARTED;
            if (capture_state != capture_state2 || this.U != capture_state2) {
                return;
            }
        } else if (mode != Streamer.MODE.VIDEO_ONLY) {
            A();
            return;
        } else if (this.T != Streamer.CAPTURE_STATE.STARTED) {
            return;
        }
        Objects.toString(this.r);
        if (!this.q || this.r == RecorderBase.State.RECORDING) {
            RecorderBase.State state = this.r;
            RecorderBase.State state2 = RecorderBase.State.PREPARED;
            if (state == state2 || state == RecorderBase.State.RECORDING) {
                return;
            }
            this.r = state2;
            f(-1000);
            return;
        }
        if (this.g0 == null) {
            this.g0 = Integer.valueOf(io9.a());
            ne7.m("RecorderSurface18", "startRecord() - deviceOrientationAtLiveStart= $deviceOrientationAtLiveStart");
        }
        if (this.m != null) {
            try {
                this.W.k(this.m, this.w, this.x);
            } catch (Throwable th) {
                if (this.q) {
                    th.toString();
                }
                this.q = false;
            }
        } else if (!TextUtils.isEmpty(this.n)) {
            Streamer.AUTH auth = Streamer.AUTH.DEFAULT;
            String str4 = this.n + DomExceptionUtils.SEPARATOR + this.p;
            Streamer.MODE mode2 = this.O;
            try {
                uri = URI.create(str4);
            } catch (IllegalArgumentException unused) {
                ne7.n("RecorderSurface18", "startRecord() - failed to parse URI from uriString= " + str4);
                uri = null;
            }
            String str5 = this.B;
            if (!Objects.equals(str5, this.c0)) {
                Q();
                if (this.C) {
                    this.c0 = str5;
                    LiveStreamStatReporter imzVar = str5 != null ? new imz(str5) : new LiveStreamStatReporterDebugLog();
                    this.b0 = imzVar;
                    imzVar.streamCreated(LiveStreamStatReporter.PublisherType.rtmp_vk);
                }
            }
            if (uri != null) {
                d dVar = new d(this.b0);
                this.d0 = dVar;
                dVar.prepare(uri);
                this.d0.start();
            }
            com.vk.media.recorder.impl.e eVar = this.W;
            LiveStreamStatReporter liveStreamStatReporter = this.b0;
            g4j g4jVar = eVar.a;
            if (g4jVar == null) {
                throw new IllegalStateException("After release(), the streamer is no longer available");
            }
            if (str4 == null || mode2 == null || auth == null) {
                Log.e("Streamer", "Function parameter is null");
                if (liveStreamStatReporter != null) {
                    liveStreamStatReporter.streamStartFailed("Function parameter is null");
                }
            } else {
                synchronized (g4jVar) {
                    try {
                        Uri parse = Uri.parse(str4);
                        String scheme = parse.getScheme();
                        if (scheme == null) {
                            g4j.f("failed to parse scheme, uri=" + parse, liveStreamStatReporter);
                        } else {
                            String userInfo = parse.getUserInfo();
                            if (userInfo != null) {
                                String[] split = userInfo.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                                if (split.length == 2) {
                                    str2 = split[0];
                                    str3 = split[1];
                                } else {
                                    str2 = null;
                                    str3 = null;
                                }
                                int indexOf = str4.indexOf("@");
                                str = indexOf != -1 ? scheme + "://" + str4.substring(indexOf + 1) : str4;
                            } else {
                                str = str4;
                                str2 = null;
                                str3 = null;
                            }
                            String host = parse.getHost();
                            if (host == null) {
                                g4j.f("failed to parse host, uri=" + parse, liveStreamStatReporter);
                            } else {
                                int port = parse.getPort();
                                if (scheme.equalsIgnoreCase("rtsp")) {
                                    if (-1 == port) {
                                        port = 554;
                                    }
                                    int i2 = g4jVar.d + 1;
                                    g4jVar.d = i2;
                                    fqg0Var = new uqg0(g4jVar, i2, mode2, str, host, port, str2, str3);
                                } else if (scheme.equalsIgnoreCase("rtmp")) {
                                    if (-1 == port) {
                                        port = 1935;
                                    }
                                    int i3 = port;
                                    String[] split2 = str4.split(DomExceptionUtils.SEPARATOR);
                                    if (split2.length < 5) {
                                        g4j.f("failed to get rtmp app & stream, uri=" + parse, liveStreamStatReporter);
                                    } else {
                                        String str6 = split2[3];
                                        for (int i4 = 4; i4 < split2.length - 1; i4++) {
                                            str6 = str6 + DomExceptionUtils.SEPARATOR + split2[i4];
                                        }
                                        Streamer.a aVar = new Streamer.a();
                                        aVar.a = auth;
                                        String str7 = split2[split2.length - 1];
                                        int i5 = g4jVar.d + 1;
                                        g4jVar.d = i5;
                                        fqg0Var = new fqg0(g4jVar, i5, mode2, aVar, host, i3, str6, str7, liveStreamStatReporter);
                                        if (auth == Streamer.AUTH.LLNW) {
                                            xb6 xb6Var = new xb6();
                                            xb6Var.a = liveStreamStatReporter;
                                            g4jVar.k.put(Integer.valueOf(g4jVar.d), xb6Var);
                                        }
                                    }
                                } else {
                                    g4j.f("unsupported scheme=".concat(scheme), liveStreamStatReporter);
                                }
                                g4jVar.d(fqg0Var, str4);
                                i = g4jVar.d;
                            }
                        }
                    } catch (Exception e) {
                        g4j.f(Log.getStackTraceString(e), liveStreamStatReporter);
                    }
                }
                this.P = i;
                if (i == -1) {
                    ne7.m("RecorderSurface18", "failed to start stream!");
                    f(-1006);
                }
            }
            i = -1;
            this.P = i;
            if (i == -1) {
            }
        }
        this.r = RecorderBase.State.RECORDING;
    }

    public final void S(LiveStreamStatReporter.ApplicationState applicationState) {
        LiveStreamStatReporter statsReporter;
        ne7.m("RecorderSurface18", "statReportAppState() - appState= " + applicationState);
        d dVar = this.d0;
        if (dVar == null || (statsReporter = dVar.getStatsReporter()) == null) {
            return;
        }
        statsReporter.setApplicationState(applicationState);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void c() {
        ne7.m("RecorderSurface18", "finishLive()");
        A();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final oom0 d() {
        com.vk.media.recorder.impl.e eVar;
        String a2;
        int i = this.P;
        if (i == -1 || (eVar = this.W) == null || this.X == null) {
            return null;
        }
        long e = eVar.e(i);
        long d2 = this.W.d(this.P);
        long a3 = this.W.a(this.P);
        long b2 = this.W.b(this.P);
        qom0 qom0Var = this.W.b;
        if (qom0Var == null) {
            throw new IllegalStateException("After release(), the streamer is no longer available");
        }
        double d3 = qom0Var.j;
        long f = this.W.f(this.P);
        long g = this.W.g(this.P);
        int c2 = (int) this.W.c(this.P);
        int i2 = this.Y.d;
        cyi cyiVar = this.X;
        int i3 = cyiVar.a;
        Streamer.c cVar = cyiVar.c;
        int i4 = cVar.a;
        int i5 = cVar.b;
        long j = this.F.a;
        d dVar = this.d0;
        if (dVar == null) {
            a2 = null;
        } else {
            VideoCBRMode videoCBRMode = sy70.c0;
            a2 = sy70.a.a(this.h0, dVar, null);
        }
        return new oom0("RTMP/VK", i, e, d2, a3, b2, d3, f, g, c2, i2, i3, i4, i5, -1, j, a2);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void i() {
        ne7.m("RecorderSurface18", "onPause()");
        S(LiveStreamStatReporter.ApplicationState.inactive);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void j() {
        ne7.m("RecorderSurface18", "onResume()");
        S(LiveStreamStatReporter.ApplicationState.active);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void k() {
        oj9 oj9Var = this.c;
        MediaUtils.e eVar = oj9Var != null ? oj9Var.e : null;
        if (eVar != null) {
            int i = io9.c.a.get().getResources().getConfiguration().orientation;
            boolean z = true;
            if (i != 0 && i != 1) {
                z = false;
            }
            G(eVar, z);
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean l() {
        boolean z;
        boolean z2;
        zip zipVar;
        com.vk.media.recorder.impl.b bVar;
        RecorderBase.State state = this.r;
        if (state != RecorderBase.State.IDLE && state != RecorderBase.State.PREPARED) {
            Objects.toString(state);
            return true;
        }
        m();
        MediaUtils.e eVar = this.c.e;
        if (eVar == null) {
            Log.e("RecorderSurface18", "can't create recorder on empty profile");
            return false;
        }
        eVar.toString();
        com.vk.media.recorder.impl.f fVar = new com.vk.media.recorder.impl.f();
        fVar.f = 200;
        fVar.a = this.L;
        fVar.b = this.Q;
        oj9 oj9Var = this.c;
        byi byiVar = new byi();
        byiVar.a = 5;
        byiVar.b = 1;
        byiVar.c = 44100;
        int[] iArr = {8000, 16000, 18000, 20000, 24000, 32000, 40000, 48000, 56000, RtpSenderHelper.AUDIO_BITRATE_MAX, 80000, 96000, 112000, 128000, 160000, 192000, 256000, 320000};
        int i = 0;
        for (int i2 = 1; i2 < 18; i2++) {
            if (Math.abs(iArr[i2] - 47040) <= Math.abs(iArr[i] - 47040)) {
                i = i2;
            }
        }
        byiVar.d = iArr[i];
        byiVar.a = 1;
        byiVar.d = oj9Var.e.e;
        this.Y = byiVar;
        L.e("RecorderSurface18", "makeAudioConfig: audioSource: " + byiVar.a + ", channelCount: " + byiVar.b + ", sampleRate: " + byiVar.c + ", bitRate: " + byiVar.d);
        fVar.c = byiVar;
        cyi cyiVar = new cyi();
        cyiVar.a = 2000000;
        cyiVar.b = 2;
        cyiVar.c = null;
        cyiVar.b = this.M ? 3 : 1;
        oj9 oj9Var2 = this.c;
        MediaUtils.e eVar2 = oj9Var2.e;
        pj9 pj9Var = this.h;
        if (pj9Var != null) {
            pj9Var.b(oj9Var2);
        }
        int i3 = oj9Var2.b;
        if (i3 > 0) {
            cyiVar.a = i3;
        } else {
            cyiVar.a = (int) ((30.0f / 30) * (((int) ((((oj9Var2.a ? 2.0f : 1.0f) * 2000.0f) * 1000.0f) * 1.13f)) / (921600 / (eVar2.a * eVar2.b))));
        }
        int i4 = eVar2.a;
        int i5 = eVar2.b;
        int i6 = io9.c.a.get().getResources().getConfiguration().orientation;
        boolean z3 = i6 == 0 || i6 == 1;
        int min = Math.min(i4, i5);
        int max = Math.max(i4, i5);
        MediaUtils.d dVar = z3 ? new MediaUtils.d(min, max) : new MediaUtils.d(max, min);
        cyiVar.c = new Streamer.c(dVar.a, dVar.b);
        this.X = cyiVar;
        StringBuilder sb = new StringBuilder("makeVideoConfig: orientation: ");
        sb.append(this.L.getResources().getConfiguration().orientation);
        sb.append(", bitrate: ");
        sb.append(cyiVar.a);
        sb.append(", fps: 30.0, width: ");
        sb.append(cyiVar.c.a);
        sb.append(", height: ");
        sb.append(cyiVar.c.b);
        sb.append(", orientation landscape: ");
        Streamer.c cVar = cyiVar.c;
        sb.append(cVar.a > cVar.b);
        L.e("RecorderSurface18", sb.toString());
        fVar.d = cyiVar;
        fVar.f = 80;
        fVar.e = this.v;
        Streamer.MODE mode = this.O;
        int i7 = fVar.f;
        com.vk.media.recorder.impl.e eVar3 = new com.vk.media.recorder.impl.e();
        int i8 = i7 / 2;
        qom0 qom0Var = new qom0();
        qom0Var.d = 0L;
        qom0Var.g = 10;
        qom0Var.h = 0L;
        qom0Var.i = -1L;
        qom0Var.j = -1.0d;
        qom0Var.b = i8;
        int max2 = Math.max(i7, i8);
        qom0Var.c = max2;
        qom0Var.a = new BufferItem[max2];
        eVar3.b = qom0Var;
        g4j g4jVar = new g4j();
        g4jVar.d = 0;
        g4jVar.f = -1L;
        g4jVar.g = -1L;
        g4jVar.i = 0L;
        g4jVar.a = qom0Var;
        g4jVar.b = new ConcurrentHashMap();
        g4jVar.h = new ConcurrentLinkedQueue();
        g4jVar.k = new ConcurrentHashMap();
        try {
            g4jVar.c = Selector.open();
        } catch (IOException e) {
            Log.e("ConnectionManager", Log.getStackTraceString(e));
        }
        eVar3.a = g4jVar;
        if (fVar.a == null) {
            Log.e("d", "Build failed: context is null");
            z = false;
        } else {
            z = true;
        }
        if (fVar.b == null) {
            Log.e("d", "Build failed: Listener is null");
            z = false;
        }
        Streamer.b bVar2 = fVar.b;
        if (bVar2 != null && bVar2.getHandler() == null) {
            Log.e("d", "Build failed: Listener.getHandler() must return non null handler");
            z = false;
        }
        if (z) {
            if (mode != Streamer.MODE.VIDEO_ONLY) {
                if (fVar.c == null) {
                    Log.e("d", "Build failed: audio config is null");
                    zipVar = null;
                } else {
                    jn4 jn4Var = new jn4();
                    jn4Var.b = fVar.c;
                    zipVar = jn4Var.b();
                }
                if (zipVar == null || zipVar.a == null) {
                    Log.e(InneractiveMediationDefs.GENDER_FEMALE, "Build failed: can't create audio encoder");
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = true;
                zipVar = null;
            }
            if (mode != Streamer.MODE.AUDIO_ONLY) {
                if (fVar.d == null) {
                    Log.e("d", "Build failed: video config is null");
                    bVar = null;
                } else {
                    com.vk.media.recorder.impl.g gVar = new com.vk.media.recorder.impl.g();
                    gVar.a = fVar.d;
                    bVar = gVar.a();
                }
                if (bVar == null || bVar.a == null) {
                    Log.e(InneractiveMediationDefs.GENDER_FEMALE, "Build failed: can't create video encoder");
                    z2 = false;
                }
            } else {
                bVar = null;
            }
            if (z2) {
                Streamer.b bVar3 = fVar.b;
                eVar3.f = bVar3;
                g4j g4jVar2 = eVar3.a;
                g4jVar2.j = bVar3;
                eVar3.g = bVar;
                eVar3.h = zipVar;
                ExtraAudioSupplier extraAudioSupplier = fVar.e;
                eVar3.i = extraAudioSupplier;
                com.vk.media.recorder.impl.a aVar = eVar3.c;
                if (aVar != null) {
                    aVar.s = extraAudioSupplier;
                }
                byi byiVar2 = fVar.c;
                eVar3.j = byiVar2;
                g4jVar2.l = byiVar2;
                cyi cyiVar2 = fVar.d;
                eVar3.k = cyiVar2;
                g4jVar2.m = cyiVar2;
            } else {
                if (zipVar != null) {
                    zipVar.a();
                }
                if (bVar != null) {
                    bVar.a();
                }
            }
        } else {
            eVar3 = null;
        }
        this.W = eVar3;
        eVar3.n = new a();
        try {
            eVar3.o();
            if (this.O == Streamer.MODE.AUDIO_VIDEO) {
                this.W.j(null, null);
            }
            this.r = RecorderBase.State.PREPARING;
            this.N = false;
        } catch (Throwable th) {
            Log.e("RecorderSurface18", "can't create video encoder: " + th);
            m();
        }
        return this.r == RecorderBase.State.PREPARING;
    }

    @Override // com.vk.media.recorder.f, com.vk.media.recorder.RecorderBase
    public final void m() {
        this.a.removeCallbacks(this.a0);
        this.a0 = null;
        super.m();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean r(long j) {
        if (super.r(j) || this.M) {
            return true;
        }
        A();
        this.a.post(new com.vk.media.recorder.a(this));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Runnable, xsna.phf0] */
    @Override // com.vk.media.recorder.RecorderBase
    public final void s(MediaUtils.e eVar) {
        oj9 oj9Var = this.c;
        MediaUtils.e eVar2 = oj9Var.e;
        final boolean z = eVar2 == null;
        final boolean z2 = this.r == RecorderBase.State.IDLE;
        boolean e = io9.e(eVar2, eVar);
        StringBuilder sb = new StringBuilder("setProfile: ");
        sb.append(eVar2 != null ? eVar2.toString() : null);
        sb.append(" -> ");
        sb.append(eVar.toString());
        L.e("RecorderSurface18", sb.toString());
        oj9Var.e = eVar;
        if (e) {
            return;
        }
        phf0 phf0Var = this.a0;
        Handler handler = this.a;
        handler.removeCallbacks(phf0Var);
        ?? r8 = new Runnable() { // from class: xsna.phf0
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.media.recorder.e eVar3 = com.vk.media.recorder.e.this;
                eVar3.a0 = null;
                eVar3.m();
                boolean z3 = (z || z2) ? false : true;
                eVar3.N = z3;
                if (z3 || eVar3.l()) {
                    return;
                }
                eVar3.m();
                eVar3.N = true;
            }
        };
        this.a0 = r8;
        handler.post(r8);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void t(sk9 sk9Var) {
        this.h0 = sk9Var;
        super.t(sk9Var);
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void u(boolean z) {
        com.vk.media.recorder.impl.a aVar;
        com.vk.media.recorder.impl.e eVar = this.W;
        if (eVar == null || (aVar = eVar.c) == null) {
            return;
        }
        aVar.r = z;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean z() {
        if (this.W != null && (this.m != null || !TextUtils.isEmpty(this.n))) {
            Objects.toString(this.r);
            this.q = true;
            R();
        }
        return this.q;
    }

    /* compiled from: RecorderSurface18.java */
    public class d extends StreamerBase {
        public d(@Nullable LiveStreamStatReporter liveStreamStatReporter) {
            super((HandlerThread) sy70.d0.getValue(), liveStreamStatReporter);
            if (liveStreamStatReporter != null) {
                e.this.f0 = new StreamingStatisticsHandler(this, (Handler) sy70.e0.getValue(), e.this.e0);
            }
        }

        @Override // ru.ok.media.api.Streamer
        @NonNull
        public final String getDebugInfo() {
            StringBuilder sb = new StringBuilder("RtmpVkStreamer ------\n");
            URI uri = getUri();
            if (uri != null) {
                sb.append("Target: ");
                sb.append(uri.getHost());
                sb.append("\n");
            }
            sb.append("State: ");
            sb.append(get_state());
            sb.append("\n");
            e eVar = e.this;
            int i = eVar.P;
            if (i != -1) {
                sb.append("ConnId: ");
                sb.append(i);
                sb.append("\n");
            }
            sb.append("wasConnected: ");
            sb.append(getWasConnected());
            sb.append(", wasStarted: ");
            sb.append(getWasStarted());
            sb.append("\nConnection: ");
            sb.append(eVar.R);
            sb.append(" ");
            sb.append(eVar.S);
            sb.append("\nRecord: ");
            sb.append(eVar.V);
            sb.append("\nAudio: ");
            sb.append(eVar.U);
            byi byiVar = eVar.Y;
            if (byiVar != null) {
                sb.append(" ");
                sb.append(byiVar);
            }
            sb.append("\nVideo: ");
            sb.append(eVar.T);
            cyi cyiVar = eVar.X;
            if (cyiVar != null) {
                sb.append(" ");
                sb.append(cyiVar);
            }
            sb.append("\nCap: ");
            sb.append(eVar.J);
            sb.append(" drop: ");
            sb.append(eVar.K);
            return sb.toString();
        }

        @Override // ru.ok.media.StreamerBase
        @Nullable
        public final int[] getLastBlocksNative() {
            return new int[0];
        }

        @Override // ru.ok.media.api.Streamer
        @NonNull
        public final StreamerPacketsInfo getPacketsInfo() {
            StreamerPacketsInfo totalPacketsInfo = getTotalPacketsInfo();
            e eVar = e.this;
            com.vk.media.recorder.impl.e eVar2 = eVar.W;
            if (eVar2 == null) {
                return totalPacketsInfo;
            }
            int i = eVar.P;
            long b = eVar2.b(i) + totalPacketsInfo.getAudioPacketsSent();
            long g = eVar2.g(i) + totalPacketsInfo.getVideoPacketsSent();
            return new StreamerPacketsInfo(eVar2.e(i) + totalPacketsInfo.getBytesSent(), eVar2.d(i) + totalPacketsInfo.getBytesReceived(), 0L, 0L, b, b, eVar2.a(i) + totalPacketsInfo.getAudioPacketsLost(), g, g, eVar2.f(i) + totalPacketsInfo.getVideoPacketsLost());
        }

        @Override // ru.ok.media.api.Streamer
        @NonNull
        public final StreamerStatistic getStatistic() {
            Double d;
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            int i;
            int i2;
            e eVar = e.this;
            long j = eVar.u;
            Long valueOf = j != -1 ? Long.valueOf(j / 1000000) : null;
            com.vk.media.recorder.impl.e eVar2 = eVar.W;
            int i3 = eVar.P;
            if (eVar2 == null || i3 == -1) {
                d = null;
                num = null;
                num2 = null;
                num3 = null;
                num4 = null;
            } else {
                Streamer.c cVar = eVar.X.c;
                Integer valueOf2 = (cVar == null || (i2 = cVar.a) <= 0) ? null : Integer.valueOf(i2);
                Integer valueOf3 = (cVar == null || (i = cVar.b) <= 0) ? null : Integer.valueOf(i);
                int a = io9.a();
                Integer num5 = eVar.g0;
                Integer valueOf4 = Integer.valueOf(num5 == null ? 0 : ((a + 360) - num5.intValue()) % 360);
                qom0 qom0Var = eVar2.b;
                if (qom0Var == null) {
                    throw new IllegalStateException("After release(), the streamer is no longer available");
                }
                Double valueOf5 = Double.valueOf(qom0Var.j);
                Integer valueOf6 = Integer.valueOf((int) eVar2.c(i3));
                byi byiVar = eVar.Y;
                cyi cyiVar = eVar.X;
                int i4 = (byiVar != null ? byiVar.d : 0) + (cyiVar != null ? cyiVar.a : 0);
                r5 = i4 > 0 ? Integer.valueOf(i4) : null;
                num = valueOf6;
                num3 = valueOf3;
                num2 = valueOf2;
                num4 = valueOf4;
                d = valueOf5;
            }
            StreamerPacketsInfo packetsInfo = getPacketsInfo();
            StreamerLinkStats stats = getLinkTracker().getStats();
            StreamerBase.DebugQueueInfo debugQueueInfo = getDebugQueueInfo();
            return new StreamerStatistic("RTMP/VK", get_state(), d == null ? ConnectivityTracker.DEFAULT_UPLINK_BITRATE : d.doubleValue(), d, i3, packetsInfo, getVideoFramesDropped(), (int) getAverageBitrate(), num, r5 != null ? r5.intValue() : 0, (int) getAverageOverheadBitrate(), valueOf, num2, num3, num4, getDebugInfo(), stats, StreamerLinkState.Companion.combine(stats.getAudio().getState(), stats.getVideo().getState()), StreamerBase.getQuality(stats), debugQueueInfo.getTicks(), debugQueueInfo.getLastBlocksNative(), debugQueueInfo.getTicks2(), debugQueueInfo.getLastBlocks());
        }

        @Override // ru.ok.media.StreamerBase
        public final long getTicksNative() {
            return 0L;
        }

        @Override // ru.ok.media.StreamerBase
        public final long getVideoFramesDropped() {
            return e.this.K.get();
        }

        @Override // ru.ok.media.api.Streamer
        public final void prepare(@NonNull URI uri) {
            ne7.t("RecorderSurface18", "prepare() - uri= " + uri + ", state= " + get_state());
            StreamerState streamerState = get_state();
            if (streamerState == StreamerState.waiting || streamerState.isFinal()) {
                setUri(uri);
                set_wasConnected(false);
                updateState(StreamerState.preparing);
            } else {
                ne7.p("RecorderSurface18", "prepare() - won't prepare in state= " + get_state());
            }
        }

        @Override // ru.ok.media.StreamerBase
        public final void release() {
            super.release();
            e eVar = e.this;
            StreamingStatisticsHandler streamingStatisticsHandler = eVar.f0;
            if (streamingStatisticsHandler != null) {
                streamingStatisticsHandler.cleanup();
                eVar.f0 = null;
            }
            LiveStreamStatReporter statsReporter = getStatsReporter();
            if (statsReporter != null) {
                StreamerStatistic statistic = getStatistic();
                statsReporter.streamLink(statistic.getState(), statistic.getLinkStats());
            }
        }

        @Override // ru.ok.media.api.Streamer
        public final void start() {
            StreamerState streamerState = get_state();
            ne7.m("RecorderSurface18", "start() - state= " + streamerState);
            int i = b.a[streamerState.ordinal()];
            if (i == 1 || i != 2) {
                return;
            }
            updateState(StreamerState.starting);
        }

        @Override // ru.ok.media.api.Streamer
        public final void stop() {
            StreamerState streamerState = get_state();
            ne7.m("RecorderSurface18", "stop() - state= " + streamerState);
            if (streamerState.isFinal()) {
                return;
            }
            setWasStarting(false);
            setUri(null);
            updateState(StreamerState.finished);
        }

        @Override // ru.ok.media.api.Streamer
        public final void pause() {
        }

        @Override // ru.ok.media.api.Streamer
        public final void resume() {
        }

        @Override // ru.ok.media.api.Streamer
        public final void processVideoFrame(@NonNull GL10 gl10, @NonNull Streamer.VideoFrame videoFrame) {
        }
    }
}
