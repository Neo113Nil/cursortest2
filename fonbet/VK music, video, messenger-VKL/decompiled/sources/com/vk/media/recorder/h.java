package com.vk.media.recorder;

import android.content.Context;
import android.media.AudioRecord;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Message;
import android.util.Range;
import android.view.Surface;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import com.vk.media.recorder.h;
import com.vk.media.recorder.impl.Streamer;
import defpackage.q0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.SimpleGLProgram;
import xsna.c5g;
import xsna.djp;
import xsna.epx;
import xsna.fap;
import xsna.gb4;
import xsna.gq10;
import xsna.gzf;
import xsna.j5g;
import xsna.map;
import xsna.mo9;
import xsna.nv70;
import xsna.oj9;
import xsna.pes;
import xsna.pj9;
import xsna.t12;
import xsna.to2;
import xsna.v2s0;
import xsna.vhf0;
import xsna.w2s0;
import xsna.yk9;
import xsna.zhy0;

/* compiled from: RecorderToFile.kt */
/* loaded from: classes3.dex */
public final class h extends i {
    public final Context L;
    public final boolean N;
    public boolean P;
    public gb4 Q;
    public boolean R;
    public boolean S;
    public v2s0 T;
    public a U;
    public final boolean M = true;
    public final b O = new b();
    public long V = -1;

    /* compiled from: RecorderToFile.kt */
    public final class a {
        public final AtomicBoolean a = new AtomicBoolean();
        public final AtomicReference<v2s0> b = new AtomicReference<>();
        public final CountDownLatch c = new CountDownLatch(1);
        public boolean d;
        public final Handler e;

        public a() {
            this.e = new Handler(h.this.a.getLooper(), new Handler.Callback() { // from class: xsna.qhf0
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    h.a aVar = h.a.this;
                    com.vk.media.recorder.h hVar = r2;
                    if (!aVar.a.get()) {
                        int i = message.what;
                        if (i == 1) {
                            hVar.r = RecorderBase.State.RECORDING;
                            hVar.b.onInfo(null, -1001, 0);
                        } else if (i == 2) {
                            mo9.b bVar = hVar.j;
                            if (bVar != null) {
                                v2s0.f fVar = aVar.b.get().G;
                                bVar.d(fVar != null ? fVar.f : null);
                                return true;
                            }
                        } else if (i == 3) {
                            v2s0 v2s0Var = aVar.b.get();
                            long j = message.arg1;
                            hVar.z = j;
                            mo9.b bVar2 = hVar.j;
                            if (bVar2 != null) {
                                bVar2.b(j);
                            }
                            if (v2s0Var == hVar.T) {
                                int e = hVar.e();
                                int i2 = hVar.s;
                                if (e < i2) {
                                    e = i2;
                                }
                                if (j >= e) {
                                    hVar.b.onInfo(null, 800, e);
                                    return true;
                                }
                            }
                        } else {
                            if (i == 4) {
                                com.vk.media.recorder.h.R(hVar, aVar.b.get());
                                return true;
                            }
                            if (i == 5) {
                                com.vk.media.recorder.h.Q(hVar, aVar.b.get());
                                return true;
                            }
                        }
                    }
                    return true;
                }
            });
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallbackHandler(vae=");
            v2s0 v2s0Var = this.b.get();
            sb.append(String.valueOf(v2s0Var != null ? v2s0Var.a : null));
            sb.append(" isReleased=");
            sb.append(this.a.get());
            sb.append(" isWaitStopScheduled=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: RecorderToFile.kt */
    public static final class b implements v2s0.d {
        public fap a;
        public pes b;
        public nv70 c;
        public map.b d;
        public yk9 e;

        @Override // xsna.v2s0.d
        public final nv70 a(int i, int i2) {
            nv70 a = nv70.a(this.c, i, i2);
            this.c = a;
            return a;
        }

        @Override // xsna.v2s0.d
        public final void b() {
            yk9 yk9Var = this.e;
            if (yk9Var != null) {
                yk9Var.a(this.b);
            }
        }

        public final map.b c(Surface surface) {
            map.b bVar = this.d;
            if (epx.f(surface, bVar != null ? bVar.e : null)) {
                return this.d;
            }
            map.b bVar2 = this.d;
            if (bVar2 != null) {
                try {
                    bVar2.e();
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                }
            }
            if (surface != null) {
                try {
                    this.d = new map.b(this.a, surface, false);
                } catch (Throwable th2) {
                    this.d = null;
                    com.vk.metrics.eventtracking.b.a.a(th2);
                }
            } else {
                this.d = null;
            }
            return this.d;
        }
    }

    public h(Context context, RecorderBase.RecordingType recordingType, boolean z) {
        this.L = context;
        this.N = z;
        this.A = recordingType;
        this.F.b = false;
        this.k = false;
        this.r = RecorderBase.State.PREPARED;
    }

    public static final void Q(h hVar, v2s0 v2s0Var) {
        hVar.r = RecorderBase.State.PREPARED;
        hVar.q = false;
        hVar.U();
        a aVar = hVar.U;
        if (aVar != null) {
            aVar.d = false;
        }
        hVar.W();
        hVar.V();
        if (v2s0Var.n.get() == null) {
            return;
        }
        RecorderBase.d dVar = hVar.i;
        if (dVar != null) {
            dVar.a(hVar.m, true);
        }
        hVar.g(1001, false);
    }

    public static final void R(h hVar, v2s0 v2s0Var) {
        hVar.V();
        hVar.r = RecorderBase.State.PREPARED;
        hVar.q = false;
        if (v2s0Var.b.a() <= hVar.e() || hVar.m == null || (hVar.m.exists() && hVar.m.length() > 0)) {
            RecorderBase.d dVar = hVar.i;
            if (dVar != null) {
                dVar.a(hVar.m, false);
            }
        } else {
            hVar.g(1002, false);
        }
        hVar.T();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void A() {
        v2s0 v2s0Var = this.T;
        if (v2s0Var == null || v2s0Var.n.get() == null) {
            return;
        }
        S();
        a aVar = this.U;
        if (aVar != null) {
            aVar.d = true;
        }
        W();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean C() {
        return this.m == null;
    }

    @Override // com.vk.media.recorder.i, com.vk.media.recorder.f
    public final void D() {
        b bVar = this.O;
        bVar.c(null);
        nv70 nv70Var = bVar.c;
        if (nv70Var != null) {
            ((FrameBuffer) nv70Var.c).release();
            ((SimpleGLProgram) nv70Var.d).release();
        }
        bVar.c = null;
    }

    @Override // com.vk.media.recorder.i, com.vk.media.recorder.f
    public final void L(pes pesVar, fap fapVar) {
        v2s0 v2s0Var;
        Surface surface;
        map.b c;
        yk9 yk9Var = this.e;
        if (yk9Var != null) {
            MediaUtils.d dVar = this.E;
            yk9Var.a.h(dVar.a, dVar.b);
            if (fapVar != null && (v2s0Var = this.T) != null) {
                b bVar = this.O;
                bVar.a = fapVar;
                bVar.b = pesVar;
                bVar.e = yk9Var;
                if (v2s0Var.k.get()) {
                    synchronized (v2s0Var.j) {
                        try {
                            if (v2s0Var.F != null && (surface = v2s0Var.D) != null && (c = bVar.c(surface)) != null && v2s0Var.m.get()) {
                                v2s0Var.F.c(bVar, c);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                b bVar2 = this.O;
                bVar2.e = null;
                bVar2.b = null;
                bVar2.a = null;
                return;
            }
        }
        b bVar3 = this.O;
        bVar3.c(null);
        nv70 nv70Var = bVar3.c;
        if (nv70Var != null) {
            ((FrameBuffer) nv70Var.c).release();
            ((SimpleGLProgram) nv70Var.d).release();
        }
        bVar3.c = null;
    }

    public final void S() {
        gb4 gb4Var;
        AudioRecord audioRecord;
        v2s0 v2s0Var = this.T;
        if (v2s0Var != null) {
            synchronized (v2s0Var.j) {
                try {
                    gb4 gb4Var2 = v2s0Var.v;
                    if (gb4Var2 != null && (audioRecord = gb4Var2.c) != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                v2s0Var.w = false;
                                gb4Var = v2s0Var.v;
                            }
                        } catch (Exception e) {
                            L.j(e, "failed to check audio record state");
                        }
                    }
                    gb4Var = null;
                } finally {
                }
            }
            if (gb4Var != null) {
                gb4 gb4Var3 = this.Q;
                if (gb4Var3 != gb4Var && gb4Var3 != null) {
                    gb4Var3.a();
                }
                this.Q = gb4Var;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T() {
        vhf0 vhf0Var;
        MediaUtils.e eVar;
        float f;
        int i;
        Iterator it;
        int i2;
        Integer valueOf;
        String str;
        Integer num;
        Integer num2;
        String string;
        if (this.P) {
            return;
        }
        v2s0 v2s0Var = this.T;
        if (v2s0Var == null || v2s0Var.n.get() == null) {
            oj9 oj9Var = this.c;
            if (oj9Var == null || (eVar = oj9Var.e) == null) {
                vhf0Var = null;
            } else {
                pj9 pj9Var = this.h;
                if (pj9Var != null) {
                    pj9Var.b(oj9Var);
                }
                int[] iArr = {8000, 16000, 18000, 20000, 24000, 32000, 40000, 48000, 56000, RtpSenderHelper.AUDIO_BITRATE_MAX, 80000, 96000, 112000, 128000, 160000, 192000, 256000, 320000};
                int i3 = 0;
                for (int i4 = 1; i4 < 18; i4++) {
                    if (Math.abs(iArr[i4] - 47040) <= Math.abs(iArr[i3] - 47040)) {
                        i3 = i4;
                    }
                }
                int i5 = iArr[i3];
                gzf.a aVar = new gzf.a(2, this.x, this.S ? 2 : 1, 44100, eVar.e);
                float f2 = this.y;
                int i6 = oj9Var.b;
                if (i6 <= 0) {
                    i6 = (int) ((f2 / 30) * (((int) ((((oj9Var.a ? 2.0f : 1.0f) * 2000.0f) * 1000.0f) * 1.13f)) / (921600 / (eVar.a * eVar.b))));
                }
                Streamer.c cVar = this.L.getResources().getConfiguration().orientation == 1 ? new Streamer.c(eVar.b, eVar.a) : new Streamer.c(eVar.a, eVar.b);
                int i7 = cVar.b;
                int i8 = cVar.a;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, i6);
                mediaFormat.setInteger("frame-rate", (int) f2);
                mediaFormat.setInteger("i-frame-interval", 1);
                String str2 = "width";
                mediaFormat.setInteger("width", i8);
                mediaFormat.setInteger("height", i7);
                mediaFormat.setString("mime", "video/avc");
                djp djpVar = new djp();
                if (djpVar.b(mediaFormat).isEmpty()) {
                    try {
                        String str3 = "";
                        if (mediaFormat.containsKey("mime") && (string = mediaFormat.getString("mime")) != null) {
                            str3 = string;
                        }
                        djpVar.a.getClass();
                        ArrayList c = gq10.c(str3);
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = c.iterator();
                        while (it2.hasNext()) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) it2.next()).getVideoCapabilities();
                            if (videoCapabilities != null) {
                                arrayList.add(videoCapabilities);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities2 = (MediaCodecInfo.VideoCapabilities) it3.next();
                            Integer valueOf2 = mediaFormat.containsKey(BadConnectionSignaling.KEY_BAD_NET_BITRATE) ? Integer.valueOf(mediaFormat.getInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE)) : null;
                            if (mediaFormat.containsKey("frame-rate")) {
                                try {
                                    it = it3;
                                    i2 = mediaFormat.getInteger("frame-rate");
                                } catch (Throwable unused) {
                                    it = it3;
                                    i2 = (int) mediaFormat.getFloat("frame-rate");
                                }
                                valueOf = Integer.valueOf(i2);
                            } else {
                                it = it3;
                                valueOf = null;
                            }
                            if (mediaFormat.containsKey(str2)) {
                                str = str2;
                                num = Integer.valueOf(mediaFormat.getInteger(str2));
                            } else {
                                str = str2;
                                num = null;
                            }
                            if (mediaFormat.containsKey("height")) {
                                f = f2;
                                num2 = Integer.valueOf(mediaFormat.getInteger("height"));
                            } else {
                                f = f2;
                                num2 = null;
                            }
                            i = i6;
                            try {
                                Range<Integer> bitrateRange = videoCapabilities2.getBitrateRange();
                                if (valueOf2 != null && bitrateRange != null) {
                                    valueOf2 = bitrateRange.clamp(valueOf2);
                                }
                                Range<Integer> supportedFrameRates = videoCapabilities2.getSupportedFrameRates();
                                if (valueOf != null && supportedFrameRates != null) {
                                    valueOf = supportedFrameRates.clamp(valueOf);
                                }
                                arrayList2.add(new djp.c(valueOf2, valueOf, num, num2));
                                it3 = it;
                                str2 = str;
                                f2 = f;
                                i6 = i;
                            } catch (Exception e) {
                                e = e;
                                L.g("EncoderMediaFormatAdjuster", e);
                                if (!mediaFormat.containsKey(BadConnectionSignaling.KEY_BAD_NET_BITRATE)) {
                                }
                                if (r0 == null) {
                                }
                                if (!mediaFormat.containsKey("frame-rate")) {
                                }
                                if ((!mediaFormat.containsKey("frame-rate") ? Integer.valueOf(mediaFormat.getInteger("frame-rate")) : null) == null) {
                                }
                                L.e("makeVideoConfig: bitrate:" + r8 + ", fps:" + r6 + ", size:" + i8 + 'x' + i7);
                                vhf0Var = new vhf0(aVar, new gzf.c(r6, r8, cVar.a, cVar.b, this.V), this.w);
                                if (vhf0Var != null) {
                                }
                            }
                        }
                        f = f2;
                        i = i6;
                        djp.c cVar2 = (djp.c) j5g.l0(arrayList2);
                        if (cVar2 != null) {
                            cVar2.a(mediaFormat);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        f = f2;
                        i = i6;
                    }
                } else {
                    f = f2;
                    i = i6;
                }
                Integer valueOf3 = !mediaFormat.containsKey(BadConnectionSignaling.KEY_BAD_NET_BITRATE) ? Integer.valueOf(mediaFormat.getInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE)) : null;
                int intValue = valueOf3 == null ? valueOf3.intValue() : i;
                float intValue2 = (!mediaFormat.containsKey("frame-rate") ? Integer.valueOf(mediaFormat.getInteger("frame-rate")) : null) == null ? r0.intValue() : f;
                L.e("makeVideoConfig: bitrate:" + intValue + ", fps:" + intValue2 + ", size:" + i8 + 'x' + i7);
                vhf0Var = new vhf0(aVar, new gzf.c(intValue2, intValue, cVar.a, cVar.b, this.V), this.w);
            }
            if (vhf0Var != null) {
                return;
            }
            v2s0 v2s0Var2 = this.T;
            if (v2s0Var2 == null) {
                V();
            } else {
                if (epx.f(v2s0Var2.c, vhf0Var)) {
                    return;
                }
                if (v2s0Var2.c.a.equals(vhf0Var.a)) {
                    S();
                } else {
                    U();
                }
                a aVar2 = this.U;
                if (aVar2 != null) {
                    aVar2.d = false;
                }
                W();
                V();
            }
            a aVar3 = new a();
            this.U = aVar3;
            try {
                w2s0 w2s0Var = new w2s0(aVar3);
                w2s0Var.f = this.R;
                w2s0Var.c = vhf0Var;
                w2s0Var.e = this.v;
                w2s0Var.g = false;
                w2s0Var.d = this.Q;
                w2s0Var.b = this.l;
                w2s0Var.h = this.N;
                this.T = w2s0Var.a();
            } catch (Exception e3) {
                L.j(e3, "failed to create encoder");
                W();
                V();
            }
            v2s0 v2s0Var3 = this.T;
            if (v2s0Var3 == null || !v2s0Var3.f(this.Q)) {
                return;
            }
            this.Q = null;
        }
    }

    public final void U() {
        gb4 gb4Var;
        v2s0 v2s0Var = this.T;
        if (v2s0Var == null) {
            gb4 gb4Var2 = this.Q;
            if (gb4Var2 != null) {
                gb4Var2.a();
            }
        } else if (!v2s0Var.f(this.Q) && (gb4Var = this.Q) != null) {
            gb4Var.a();
        }
        this.Q = null;
    }

    public final void V() {
        v2s0 andSet;
        a aVar = this.U;
        if (aVar != null) {
            AtomicReference<v2s0> atomicReference = aVar.b;
            Handler handler = aVar.e;
            if (aVar.d && (andSet = atomicReference.getAndSet(null)) != null) {
                if (andSet.n.get() == null) {
                    andSet = null;
                }
                if (andSet != null) {
                    h hVar = h.this;
                    try {
                        if (!aVar.c.await(5000L, TimeUnit.MILLISECONDS)) {
                            com.vk.metrics.eventtracking.b.a.a(new RuntimeException("encoder stopping timed out"));
                        }
                    } catch (InterruptedException unused) {
                        L.l("waiting for encoder stop was interrupted");
                        Thread.currentThread().interrupt();
                    }
                    if (handler.hasMessages(5)) {
                        Q(hVar, andSet);
                    } else if (handler.hasMessages(4)) {
                        R(hVar, andSet);
                    }
                }
            }
            aVar.a.set(true);
            atomicReference.set(null);
            handler.removeCallbacksAndMessages(null);
        }
        this.U = null;
    }

    public final void W() {
        v2s0 v2s0Var = this.T;
        if (v2s0Var != null) {
            ExecutorService executorService = v2s0Var.h;
            if (v2s0Var.k.compareAndSet(true, false) && !executorService.isShutdown()) {
                a aVar = v2s0Var.p;
                if (!aVar.a.get()) {
                    h.this.q = false;
                }
                executorService.execute(new to2(v2s0Var, 14));
                executorService.shutdown();
            }
        }
        this.T = null;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean a(RecorderBase.RecordingType recordingType) {
        if (this.M) {
            if (this.A != recordingType) {
                if (recordingType != RecorderBase.RecordingType.CLIP && recordingType != RecorderBase.RecordingType.ORIGINAL) {
                    return false;
                }
                A();
                this.A = recordingType;
                return true;
            }
        } else if (this.A != recordingType) {
            return false;
        }
        return true;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void b(boolean z) {
        this.S = z;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean l() {
        T();
        f(-1000);
        return true;
    }

    @Override // com.vk.media.recorder.f, com.vk.media.recorder.RecorderBase
    public final void m() {
        this.P = true;
        U();
        W();
        V();
        yk9 yk9Var = this.e;
        if (yk9Var != null) {
            yk9Var.a.d(new to2(this.O, 12));
        }
        super.m();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void n(ExtraAudioSupplier extraAudioSupplier) {
        this.v = extraAudioSupplier;
        v2s0 v2s0Var = this.T;
        if (v2s0Var != null) {
            v2s0Var.y = extraAudioSupplier;
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void o(float f) {
        float f2 = this.y;
        super.o(f);
        if (f2 == this.y) {
            return;
        }
        T();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void q(float f) {
        float f2 = this.x;
        super.q(f);
        if (f2 == this.x) {
            return;
        }
        T();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void s(MediaUtils.e eVar) {
        this.c.e = eVar;
        T();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(vae=");
        v2s0 v2s0Var = this.T;
        sb.append(String.valueOf(v2s0Var != null ? v2s0Var.a : null));
        sb.append(" isReleased=");
        return q0.a(sb, this.P, ')');
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void u(boolean z) {
        L.p(zhy0.a("Recorder is silenced: ", z));
        this.R = z;
        v2s0 v2s0Var = this.T;
        if (v2s0Var != null) {
            v2s0Var.x = z;
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void v(float f) {
        float f2 = this.w;
        super.v(f);
        if (f2 == this.w) {
            return;
        }
        T();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void w(Float f, Float f2) {
        float f3 = this.w;
        float f4 = this.x;
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        v(floatValue);
        q(floatValue2);
        if (f3 == this.w && f4 == this.x) {
            return;
        }
        T();
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void y(long j) {
        if (this.V != j) {
            this.V = j;
            T();
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean z() {
        T();
        v2s0 v2s0Var = this.T;
        boolean z = false;
        if (v2s0Var == null) {
            return false;
        }
        if (v2s0Var.n.get() != null) {
            return true;
        }
        if (this.U != null) {
            System.currentTimeMillis();
        }
        File file = this.m;
        ExecutorService executorService = v2s0Var.h;
        if (file != null && v2s0Var.k.get() && !executorService.isShutdown()) {
            AtomicReference<File> atomicReference = v2s0Var.n;
            while (true) {
                if (atomicReference.compareAndSet(null, file)) {
                    executorService.execute(new t12(v2s0Var, 12));
                    z = true;
                    break;
                }
                if (atomicReference.get() != null) {
                    break;
                }
            }
        }
        this.q = z;
        return this.q;
    }
}
