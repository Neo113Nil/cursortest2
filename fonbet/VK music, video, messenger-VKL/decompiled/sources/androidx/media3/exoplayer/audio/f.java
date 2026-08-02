package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.c;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.g;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import xsna.ahn;
import xsna.b900;
import xsna.bw4;
import xsna.cp5;
import xsna.cq10;
import xsna.dvf;
import xsna.ew4;
import xsna.f8x;
import xsna.g8l;
import xsna.h;
import xsna.hc3;
import xsna.hq10;
import xsna.hr10;
import xsna.i;
import xsna.io20;
import xsna.jwa0;
import xsna.lq10;
import xsna.n8l;
import xsna.nc4;
import xsna.qzf;
import xsna.tzf;
import xsna.vv4;
import xsna.w8s;
import xsna.wyf0;
import xsna.x1b0;
import xsna.y2r0;

/* compiled from: MediaCodecAudioRenderer.java */
/* loaded from: classes12.dex */
public final class f extends MediaCodecRenderer implements cq10 {
    public final Context I0;
    public final b.a J0;
    public final AudioSink K0;

    @Nullable
    public final b900 L0;
    public int M0;
    public boolean N0;

    @Nullable
    public androidx.media3.common.a O0;

    @Nullable
    public androidx.media3.common.a P0;
    public long Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public int V0;
    public boolean W0;
    public long X0;

    /* compiled from: MediaCodecAudioRenderer.java */
    public final class a {
        public a() {
        }

        public final void a(Exception exc) {
            ahn.o("MediaCodecAudioRenderer", "Audio sink error", exc);
            b.a aVar = f.this.J0;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new hc3(2, aVar, exc));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, c.b bVar, androidx.media3.exoplayer.mediacodec.e eVar, boolean z, @Nullable Handler handler, @Nullable b bVar2, AudioSink audioSink) {
        super(context.getApplicationContext(), 1, bVar, eVar, z, 44100.0f);
        b900 b900Var = Build.VERSION.SDK_INT >= 35 ? new b900() : null;
        this.I0 = context.getApplicationContext();
        this.K0 = audioSink;
        this.L0 = b900Var;
        this.V0 = -1000;
        this.J0 = new b.a(handler, bVar2);
        this.X0 = C.TIME_UNSET;
        audioSink.k(new a());
    }

    public final int A0(androidx.media3.common.a aVar) {
        androidx.media3.exoplayer.audio.a q = this.K0.q(aVar);
        if (!q.a) {
            return 0;
        }
        int i = q.b ? 1536 : 512;
        return q.c ? i | 2048 : i;
    }

    public final void B0() {
        isEnded();
        long i = this.K0.i();
        if (i != Long.MIN_VALUE) {
            if (!this.R0) {
                i = Math.max(this.Q0, i);
            }
            this.Q0 = i;
            this.R0 = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final n8l E(hq10 hq10Var, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        n8l b = hq10Var.b(aVar, aVar2);
        int i = b.e;
        if (this.J == null && v0(aVar2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(hq10Var.a);
        if (aVar2.o > this.M0) {
            i |= 64;
        }
        int i2 = i;
        return new n8l(hq10Var.a, aVar, aVar2, i2 != 0 ? 0 : b.d, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float M(float f, androidx.media3.common.a aVar, androidx.media3.common.a[] aVarArr) {
        int i = -1;
        for (androidx.media3.common.a aVar2 : aVarArr) {
            int i2 = aVar2.G;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList N(androidx.media3.exoplayer.mediacodec.e eVar, androidx.media3.common.a aVar, boolean z) throws MediaCodecUtil.DecoderQueryException {
        g g;
        if (aVar.n == null) {
            g = g.f;
        } else {
            if (this.K0.a(aVar)) {
                List<hq10> e = MediaCodecUtil.e(MimeTypes.AUDIO_RAW, false, false);
                hq10 hq10Var = e.isEmpty() ? null : e.get(0);
                if (hq10Var != null) {
                    g = ImmutableList.p(hq10Var);
                }
            }
            g = MediaCodecUtil.g(eVar, aVar, z, false);
        }
        HashMap<MediaCodecUtil.a, List<hq10>> hashMap = MediaCodecUtil.a;
        ArrayList arrayList = new ArrayList(g);
        Collections.sort(arrayList, new lq10(new f8x(this.I0, aVar)));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final long O(long j, long j2) {
        AudioSink audioSink = this.K0;
        boolean z = audioSink.hasPendingData() && this.X0 != C.TIME_UNSET;
        if (this.W0) {
            long f = audioSink.f();
            if (this.U0 && z && f != C.TIME_UNSET) {
                return Math.max(10000L, (long) ((Math.min(f, this.X0 - j) / (audioSink.getPlaybackParameters() != null ? audioSink.getPlaybackParameters().a : 1.0f)) / 2.0f));
            }
        } else if (z || this.t0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final c.a Q(hq10 hq10Var, androidx.media3.common.a aVar, @Nullable MediaCrypto mediaCrypto, float f) {
        androidx.media3.common.a[] aVarArr = this.k;
        aVarArr.getClass();
        String str = hq10Var.a;
        "OMX.google.raw.decoder".equals(str);
        int i = aVar.o;
        String str2 = aVar.n;
        int i2 = aVar.F;
        if (aVarArr.length != 1) {
            for (androidx.media3.common.a aVar2 : aVarArr) {
                if (hq10Var.b(aVar, aVar2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i = Math.max(i, aVar2.o);
                }
            }
        }
        this.M0 = i;
        this.N0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = hq10Var.c;
        int i3 = this.M0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i2);
        int i4 = aVar.G;
        mediaFormat.setInteger("sample-rate", i4);
        hr10.d(mediaFormat, aVar.q);
        hr10.c(mediaFormat, "max-input-size", i3);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair<Integer, Integer> b = tzf.b(aVar);
            if (b != null) {
                hr10.c(mediaFormat, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, ((Integer) b.first).intValue());
                hr10.c(mediaFormat, "level", ((Integer) b.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        a.C0043a c0043a = new a.C0043a();
        c0043a.q(MimeTypes.AUDIO_RAW);
        c0043a.d(i2);
        c0043a.r(i4);
        c0043a.n(4);
        if (this.K0.o(c0043a.a()) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i5 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i5 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.V0));
        }
        C(mediaFormat);
        this.P0 = (!MimeTypes.AUDIO_RAW.equals(hq10Var.b) || MimeTypes.AUDIO_RAW.equals(str2)) ? null : aVar;
        return new c.a(hq10Var, mediaFormat, aVar, null, mediaCrypto, this.L0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void R(DecoderInputBuffer decoderInputBuffer) {
        androidx.media3.common.a aVar;
        if (Build.VERSION.SDK_INT < 29 || (aVar = decoderInputBuffer.c) == null || !Objects.equals(aVar.n, MimeTypes.AUDIO_OPUS) || !this.h0) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.h;
        byteBuffer.getClass();
        androidx.media3.common.a aVar2 = decoderInputBuffer.c;
        aVar2.getClass();
        int i = aVar2.I;
        if (byteBuffer.remaining() == 8) {
            this.K0.d(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void X(Exception exc) {
        ahn.o("MediaCodecAudioRenderer", "Audio codec error", exc);
        b.a aVar = this.J0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new vv4(0, aVar, exc));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Y(final String str, final long j, final long j2) {
        final b.a aVar = this.J0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: xsna.aw4
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.audio.b bVar = b.a.this.b;
                    String str2 = y2r0.a;
                    bVar.onAudioDecoderInitialized(str, j, j2);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Z(qzf qzfVar) {
        b.a aVar = this.J0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new ew4(0, aVar, qzfVar));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void a0(String str) {
        b.a aVar = this.J0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new h(1, aVar, str));
        }
    }

    @Override // xsna.cq10
    public final void b(jwa0 jwa0Var) {
        this.K0.b(jwa0Var);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @Nullable
    public final n8l b0(w8s w8sVar) throws ExoPlaybackException {
        androidx.media3.common.a aVar = w8sVar.b;
        aVar.getClass();
        this.O0 = aVar;
        n8l b0 = super.b0(w8sVar);
        b.a aVar2 = this.J0;
        Handler handler = aVar2.a;
        if (handler != null) {
            handler.post(new bw4(aVar2, aVar, b0, 0));
        }
        return b0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void c0(androidx.media3.common.a aVar, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        androidx.media3.common.a aVar2 = this.P0;
        int[] iArr = null;
        if (aVar2 != null) {
            aVar = aVar2;
        } else if (this.P != null) {
            mediaFormat.getClass();
            int integer = MimeTypes.AUDIO_RAW.equals(aVar.n) ? aVar.H : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? y2r0.F(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            a.C0043a c0043a = new a.C0043a();
            c0043a.m = io20.q(MimeTypes.AUDIO_RAW);
            c0043a.G = integer;
            c0043a.H = aVar.I;
            c0043a.I = aVar.J;
            c0043a.k = aVar.l;
            c0043a.a = aVar.a;
            c0043a.b = aVar.b;
            c0043a.c = ImmutableList.m(aVar.c);
            c0043a.d = aVar.d;
            c0043a.e = aVar.e;
            c0043a.f = aVar.f;
            c0043a.E = mediaFormat.getInteger("channel-count");
            c0043a.F = mediaFormat.getInteger("sample-rate");
            aVar = new androidx.media3.common.a(c0043a);
            if (this.N0) {
                int i = aVar.F;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            AudioSink audioSink = this.K0;
            if (i2 >= 29) {
                if (this.h0) {
                    wyf0 wyf0Var = this.e;
                    wyf0Var.getClass();
                    if (wyf0Var.a != 0) {
                        wyf0 wyf0Var2 = this.e;
                        wyf0Var2.getClass();
                        audioSink.g(wyf0Var2.a);
                    }
                }
                audioSink.g(0);
            }
            audioSink.m(aVar, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw r(e, e.format, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void d0(long j) {
        this.K0.getClass();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void f0() {
        this.K0.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.j, androidx.media3.exoplayer.k
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // xsna.cq10
    public final jwa0 getPlaybackParameters() {
        return this.K0.getPlaybackParameters();
    }

    @Override // xsna.cq10
    public final long getPositionUs() {
        if (this.i == 2) {
            B0();
        }
        return this.Q0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.a, androidx.media3.exoplayer.i.b
    public final void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        b900 b900Var;
        AudioSink audioSink = this.K0;
        if (i == 2) {
            obj.getClass();
            audioSink.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            nc4 nc4Var = (nc4) obj;
            nc4Var.getClass();
            audioSink.s(nc4Var);
            return;
        }
        if (i == 6) {
            cp5 cp5Var = (cp5) obj;
            cp5Var.getClass();
            audioSink.p(cp5Var);
            return;
        }
        if (i == 12) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.V0 = ((Integer) obj).intValue();
            androidx.media3.exoplayer.mediacodec.c cVar = this.P;
            if (cVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.V0));
                cVar.setParameters(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            audioSink.j(((Boolean) obj).booleanValue());
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            audioSink.setAudioSessionId(intValue);
            if (Build.VERSION.SDK_INT < 35 || (b900Var = this.L0) == null) {
                return;
            }
            b900Var.b(intValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            audioSink.l(((Integer) obj).intValue());
        } else if (i != 20) {
            super.handleMessage(i, obj);
        } else {
            obj.getClass();
            audioSink.h((AudioOutputProvider) obj);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean i0(long j, long j2, @Nullable androidx.media3.exoplayer.mediacodec.c cVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar) throws ExoPlaybackException {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.X0 = C.TIME_UNSET;
        if (this.P0 != null && (i2 & 2) != 0) {
            cVar.getClass();
            cVar.d(i);
            return true;
        }
        AudioSink audioSink = this.K0;
        if (z) {
            if (cVar != null) {
                cVar.d(i);
            }
            this.x0.f += i3;
            audioSink.handleDiscontinuity();
            return true;
        }
        try {
            if (!audioSink.r(j3, i3, byteBuffer)) {
                this.X0 = j3;
                return false;
            }
            if (cVar != null) {
                cVar.d(i);
            }
            this.x0.e += i3;
            return true;
        } catch (AudioSink.InitializationException e) {
            androidx.media3.common.a aVar2 = this.O0;
            boolean z3 = e.isRecoverable;
            if (this.h0) {
                wyf0 wyf0Var = this.e;
                wyf0Var.getClass();
                if (wyf0Var.a != 0) {
                    i5 = IronSourceConstants.errorCode_showInProgress;
                    throw r(e, aVar2, z3, i5);
                }
            }
            i5 = IronSourceConstants.errorCode_biddingDataException;
            throw r(e, aVar2, z3, i5);
        } catch (AudioSink.WriteException e2) {
            boolean z4 = e2.isRecoverable;
            if (this.h0) {
                wyf0 wyf0Var2 = this.e;
                wyf0Var2.getClass();
                if (wyf0Var2.a != 0) {
                    i4 = IronSourceConstants.errorCode_loadInProgress;
                    throw r(e2, aVar, z4, i4);
                }
            }
            i4 = IronSourceConstants.errorCode_isReadyException;
            throw r(e2, aVar, z4, i4);
        }
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j
    public final boolean isEnded() {
        return this.t0 && this.K0.isEnded();
    }

    @Override // androidx.media3.exoplayer.j
    public final boolean isReady() {
        return this.K0.hasPendingData();
    }

    @Override // xsna.cq10
    public final boolean l() {
        boolean z = this.T0;
        this.T0 = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void l0() throws ExoPlaybackException {
        try {
            this.K0.playToEndOfStream();
            long j = this.y0.e;
            if (j != C.TIME_UNSET) {
                this.X0 = j;
            }
        } catch (AudioSink.WriteException e) {
            throw r(e, e.format, e.isRecoverable, this.h0 ? IronSourceConstants.errorCode_loadInProgress : IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.a
    public final void s() {
        b.a aVar = this.J0;
        this.S0 = true;
        this.O0 = null;
        this.X0 = C.TIME_UNSET;
        this.U0 = false;
        try {
            this.K0.flush();
            try {
                super.s();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.s();
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void t(boolean z, boolean z2) throws ExoPlaybackException {
        g8l g8lVar = new g8l();
        this.x0 = g8lVar;
        b.a aVar = this.J0;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new i(3, aVar, g8lVar));
        }
        wyf0 wyf0Var = this.e;
        wyf0Var.getClass();
        boolean z3 = wyf0Var.b;
        AudioSink audioSink = this.K0;
        if (z3) {
            audioSink.n();
        } else {
            audioSink.disableTunneling();
        }
        x1b0 x1b0Var = this.g;
        x1b0Var.getClass();
        audioSink.e(x1b0Var);
        dvf dvfVar = this.h;
        dvfVar.getClass();
        audioSink.c(dvfVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.a
    public final void u(long j, boolean z, boolean z2) throws ExoPlaybackException {
        super.u(j, z, z2);
        this.K0.flush();
        this.Q0 = j;
        this.X0 = C.TIME_UNSET;
        this.T0 = false;
        this.U0 = false;
        this.R0 = true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void v() {
        b900 b900Var;
        this.K0.release();
        if (Build.VERSION.SDK_INT < 35 || (b900Var = this.L0) == null) {
            return;
        }
        b900Var.a.clear();
        LoudnessCodecController loudnessCodecController = b900Var.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean v0(androidx.media3.common.a aVar) {
        wyf0 wyf0Var = this.e;
        wyf0Var.getClass();
        if (wyf0Var.a != 0) {
            int A0 = A0(aVar);
            if ((A0 & 512) != 0) {
                wyf0 wyf0Var2 = this.e;
                wyf0Var2.getClass();
                if (wyf0Var2.a == 2 || (A0 & 1024) != 0) {
                    return true;
                }
                if (aVar.I == 0 && aVar.J == 0) {
                    return true;
                }
            }
        }
        return this.K0.a(aVar);
    }

    @Override // androidx.media3.exoplayer.a
    public final void w() {
        AudioSink audioSink = this.K0;
        this.T0 = false;
        this.U0 = false;
        this.X0 = C.TIME_UNSET;
        try {
            try {
                this.h0 = false;
                m0();
                k0();
                DrmSession drmSession = this.J;
                if (drmSession != null) {
                    drmSession.b(null);
                }
                this.J = null;
            } catch (Throwable th) {
                DrmSession drmSession2 = this.J;
                if (drmSession2 != null) {
                    drmSession2.b(null);
                }
                this.J = null;
                throw th;
            }
        } finally {
            if (this.S0) {
                this.S0 = false;
                audioSink.reset();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r7.isEmpty() ? null : r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int w0(androidx.media3.exoplayer.mediacodec.e eVar, androidx.media3.common.a aVar) throws MediaCodecUtil.DecoderQueryException {
        int i;
        a.C0043a c0043a;
        g g;
        boolean z;
        boolean z2;
        int f = k.f(1, 0, 0, 0);
        String str = aVar.n;
        String str2 = aVar.n;
        if (!io20.l(str)) {
            return k.f(0, 0, 0, 0);
        }
        int i2 = aVar.O;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        AudioSink audioSink = this.K0;
        if (z4) {
            if (z3) {
                List<hq10> e = MediaCodecUtil.e(MimeTypes.AUDIO_RAW, false, false);
            }
            i = A0(aVar);
            if (audioSink.a(aVar)) {
                return k.f(4, 8, 32, i);
            }
            if (MimeTypes.AUDIO_RAW.equals(str2) || audioSink.a(aVar)) {
                int i4 = aVar.F;
                int i5 = aVar.G;
                c0043a = new a.C0043a();
                c0043a.q(MimeTypes.AUDIO_RAW);
                c0043a.d(i4);
                c0043a.r(i5);
                c0043a.n(2);
                if (audioSink.a(c0043a.a())) {
                    if (str2 == null) {
                        g = g.f;
                    } else {
                        if (audioSink.a(aVar)) {
                            List<hq10> e2 = MediaCodecUtil.e(MimeTypes.AUDIO_RAW, false, false);
                            hq10 hq10Var = e2.isEmpty() ? null : e2.get(0);
                            if (hq10Var != null) {
                                g = ImmutableList.p(hq10Var);
                            }
                        }
                        g = MediaCodecUtil.g(eVar, aVar, false, false);
                    }
                    if (!g.isEmpty()) {
                        if (!z4) {
                            return k.f(2, 0, 0, 0);
                        }
                        hq10 hq10Var2 = (hq10) g.get(0);
                        Context context = this.I0;
                        boolean e3 = hq10Var2.e(context, aVar);
                        if (!e3) {
                            for (int i6 = 1; i6 < g.e; i6++) {
                                hq10 hq10Var3 = (hq10) g.get(i6);
                                if (hq10Var3.e(context, aVar)) {
                                    z2 = false;
                                    hq10Var2 = hq10Var3;
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = e3;
                        z2 = true;
                        int i7 = z ? 4 : 3;
                        if (z && hq10Var2.g(aVar)) {
                            i3 = 16;
                        }
                        return (hq10Var2.h ? 64 : 0) | i7 | i3 | 32 | (z2 ? 128 : 0) | i;
                    }
                }
            }
            return f;
        }
        i = 0;
        if (MimeTypes.AUDIO_RAW.equals(str2)) {
        }
        int i42 = aVar.F;
        int i52 = aVar.G;
        c0043a = new a.C0043a();
        c0043a.q(MimeTypes.AUDIO_RAW);
        c0043a.d(i42);
        c0043a.r(i52);
        c0043a.n(2);
        if (audioSink.a(c0043a.a())) {
        }
        return f;
    }

    @Override // androidx.media3.exoplayer.a
    public final void x() {
        this.K0.play();
        this.W0 = true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void y() {
        B0();
        this.W0 = false;
        this.K0.pause();
        this.U0 = false;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j
    @Nullable
    public final cq10 getMediaClock() {
        return this;
    }
}
