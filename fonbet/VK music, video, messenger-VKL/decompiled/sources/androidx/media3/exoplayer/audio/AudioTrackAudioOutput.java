package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.ahn;
import xsna.az4;
import xsna.dvf;
import xsna.en;
import xsna.ihz;
import xsna.jwa0;
import xsna.lz4;
import xsna.q2r0;
import xsna.ry4;
import xsna.tj0;
import xsna.vl4;
import xsna.vy4;
import xsna.wl4;
import xsna.wy4;
import xsna.x1b0;
import xsna.y2r0;
import xsna.zq;

/* loaded from: classes12.dex */
public final class AudioTrackAudioOutput implements AudioOutput {
    public static final Object p = new Object();

    @Nullable
    public static ScheduledExecutorService q;
    public static int r;
    public final AudioTrack a;
    public final AudioOutputProvider.d b;

    @Nullable
    public final a c;

    @Nullable
    public b d;
    public final lz4 e;
    public final boolean f;
    public final int g;

    @Nullable
    public final d h;
    public final ihz<AudioOutput.a> i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public interface a {
    }

    public static final class b {
        public final AudioTrack a;
        public final a b;
        public final Handler c;

        @Nullable
        public wy4 d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, xsna.wy4] */
        public b(AudioTrack audioTrack, a aVar) {
            this.a = audioTrack;
            this.b = aVar;
            Handler o = y2r0.o(null);
            this.c = o;
            ?? r0 = new AudioRouting.OnRoutingChangedListener() { // from class: xsna.wy4
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    AudioTrackAudioOutput.b bVar = AudioTrackAudioOutput.b.this;
                    if (bVar.d == null) {
                        return;
                    }
                    jw5.t().execute(new xy4(0, bVar, audioRouting));
                }
            };
            this.d = r0;
            audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r0, o);
        }
    }

    public final class c {
        public c() {
        }
    }

    public final class d {
        public final Handler a;
        public final a b;

        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                AudioTrackAudioOutput.this.i.f(-1, new en(6));
            }

            public final void onPresentationEnded(AudioTrack audioTrack) {
                AudioTrackAudioOutput.this.i.f(-1, new q1(6));
            }

            public final void onTearDown(AudioTrack audioTrack) {
                AudioTrackAudioOutput.this.i.f(-1, new en(6));
            }
        }

        public d() {
            Handler o = y2r0.o(null);
            this.a = o;
            a aVar = new a();
            this.b = aVar;
            AudioTrackAudioOutput.this.a.registerStreamEventCallback(new az4(o), aVar);
        }
    }

    public AudioTrackAudioOutput(AudioTrack audioTrack, AudioOutputProvider.d dVar, @Nullable a aVar, dvf dvfVar) {
        this.a = audioTrack;
        this.b = dVar;
        this.c = aVar;
        ihz<AudioOutput.a> ihzVar = new ihz<>(Thread.currentThread());
        this.i = ihzVar;
        ihzVar.j = false;
        boolean M = y2r0.M(dVar.a);
        this.f = M;
        if (M) {
            this.g = y2r0.u(dVar.a) * Integer.bitCount(dVar.c);
        } else {
            this.g = -1;
        }
        this.e = new lz4(new c(), dvfVar, audioTrack, dVar.a, this.g, dVar.f);
        if (aVar != null) {
            this.d = new b(audioTrack, aVar);
        }
        this.h = g() ? new d() : null;
    }

    public final long a() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = y2r0.a;
        return ((j + j2) - 1) / j2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void b(jwa0 jwa0Var) {
        AudioTrack audioTrack = this.a;
        try {
            audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(jwa0Var.a).setPitch(jwa0Var.b).setAudioFallbackMode(2));
        } catch (IllegalArgumentException e) {
            ahn.G("Failed to set playback params", e);
        }
        float speed = audioTrack.getPlaybackParams().getSpeed();
        lz4 lz4Var = this.e;
        lz4Var.i = speed;
        lz4Var.h.a(0);
        lz4Var.k = 0L;
        lz4Var.t = 0;
        lz4Var.s = 0;
        lz4Var.l = 0L;
        lz4Var.y = C.TIME_UNSET;
        lz4Var.z = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final int c() {
        return this.a.getSampleRate();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void d(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i, i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void e(x1b0 x1b0Var) {
        boolean equals;
        LogSessionId unused;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId a2 = x1b0Var.a();
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = a2.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (equals) {
            return;
        }
        this.a.setLogSessionId(a2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final boolean f(long j, int i, ByteBuffer byteBuffer) throws AudioOutput.WriteException {
        int write;
        boolean z;
        a aVar;
        androidx.media3.exoplayer.audio.c cVar;
        wl4 wl4Var;
        AudioOutputProvider.d dVar = this.b;
        boolean z2 = this.f;
        if (!z2 && this.n == 0) {
            this.n = androidx.media3.exoplayer.audio.d.y(dVar.a, byteBuffer);
        }
        a();
        AudioTrack audioTrack = this.a;
        int underrunCount = audioTrack.getUnderrunCount();
        boolean z3 = underrunCount > this.o;
        this.o = underrunCount;
        if (z3) {
            this.i.f(-1, new zq(3));
        }
        int remaining = byteBuffer.remaining();
        if (dVar.d) {
            if (j == Long.MIN_VALUE) {
                j = this.m;
            } else {
                this.m = j;
            }
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j * 1000);
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write >= 0) {
            z = write == remaining;
            if (z2) {
                this.k += write;
                return z;
            }
            if (z) {
                this.l = (this.n * i) + this.l;
            }
            return z;
        }
        z = write == -6 || write == -32;
        if (z && (aVar = this.c) != null && (wl4Var = (cVar = androidx.media3.exoplayer.audio.c.this).h) != null) {
            vl4 vl4Var = vl4.c;
            cVar.g = vl4Var;
            wl4Var.a(vl4Var);
        }
        throw new AudioOutput.WriteException(write, z);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final boolean g() {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = this.a.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final int getAudioSessionId() {
        return this.a.getAudioSessionId();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final jwa0 getPlaybackParameters() {
        PlaybackParams playbackParams = this.a.getPlaybackParams();
        return new jwa0(playbackParams.getSpeed(), playbackParams.getPitch());
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0206  */
    @Override // androidx.media3.exoplayer.audio.AudioOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getPositionUs() {
        lz4 lz4Var;
        dvf dvfVar;
        ry4 ry4Var;
        AudioTrack audioTrack;
        long j;
        long j2;
        boolean z;
        boolean z2;
        lz4 lz4Var2;
        long b2;
        int playState;
        int i;
        long j3;
        boolean z3;
        ry4.a aVar;
        boolean timestamp;
        ry4 ry4Var2;
        boolean z4;
        int i2;
        int i3;
        Method method;
        Method method2;
        Integer num;
        lz4 lz4Var3 = this.e;
        dvf dvfVar2 = lz4Var3.b;
        ry4 ry4Var3 = lz4Var3.h;
        AudioTrack audioTrack2 = lz4Var3.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = lz4Var3.c;
            long a2 = dvfVar2.a() / 1000;
            j = 1000;
            if (a2 - lz4Var3.l >= ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                long b0 = y2r0.b0(lz4Var3.e, lz4Var3.a());
                if (b0 != 0) {
                    jArr[lz4Var3.s] = y2r0.G(b0, lz4Var3.i) - a2;
                    lz4Var3.s = (lz4Var3.s + 1) % 10;
                    int i4 = lz4Var3.t;
                    if (i4 < 10) {
                        lz4Var3.t = i4 + 1;
                    }
                    lz4Var3.l = a2;
                    lz4Var3.k = 0L;
                    int i5 = 0;
                    while (true) {
                        int i6 = lz4Var3.t;
                        if (i5 >= i6) {
                            break;
                        }
                        lz4Var3.k = (jArr[i5] / i6) + lz4Var3.k;
                        i5++;
                    }
                } else {
                    lz4Var = lz4Var3;
                    dvfVar = dvfVar2;
                    ry4Var = ry4Var3;
                    audioTrack = audioTrack2;
                }
            }
            long j4 = lz4Var3.n;
            if (!lz4Var3.g || (method = lz4Var3.m) == null) {
                j3 = 500000;
            } else {
                j3 = 500000;
                if (a2 - lz4Var3.o >= 500000) {
                    try {
                        num = (Integer) method.invoke(audioTrack2, null);
                        String str = y2r0.a;
                    } catch (Exception unused) {
                        method2 = null;
                    }
                    try {
                        long intValue = (num.intValue() * 1000) - lz4Var3.f;
                        lz4Var3.n = intValue;
                        long max = Math.max(intValue, 0L);
                        lz4Var3.n = max;
                        if (max > 10000000) {
                            ahn.F("Ignoring impossibly large audio latency: " + max);
                            lz4Var3.n = 0L;
                        }
                    } catch (Exception unused2) {
                        method2 = null;
                        lz4Var3.m = method2;
                        lz4Var3.o = a2;
                        if (j4 == lz4Var3.n) {
                        }
                        float f = lz4Var3.i;
                        long b3 = lz4Var3.b(a2);
                        aVar = ry4Var3.a;
                        c cVar = ry4Var3.c;
                        ry4.a aVar2 = ry4Var3.a;
                        j2 = 0;
                        int i7 = ry4Var3.b;
                        if (z3) {
                        }
                        ry4Var3.g = a2;
                        AudioTrack audioTrack3 = aVar.a;
                        AudioTimestamp audioTimestamp = aVar.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp);
                        if (timestamp) {
                        }
                        if (timestamp) {
                        }
                        i3 = ry4Var.d;
                        if (i3 != 0) {
                        }
                        long a3 = dvfVar.a() / j;
                        if (ry4Var.d != 2) {
                        }
                        if (z2) {
                        }
                        long j5 = b2;
                        playState = audioTrack.getPlayState();
                        if (playState != 3) {
                        }
                        return j5;
                    }
                    lz4Var3.o = a2;
                }
            }
            z3 = j4 == lz4Var3.n;
            float f2 = lz4Var3.i;
            long b32 = lz4Var3.b(a2);
            aVar = ry4Var3.a;
            c cVar2 = ry4Var3.c;
            ry4.a aVar22 = ry4Var3.a;
            j2 = 0;
            int i72 = ry4Var3.b;
            if (!z3 || a2 - ry4Var3.g >= ry4Var3.f) {
                ry4Var3.g = a2;
                AudioTrack audioTrack32 = aVar.a;
                AudioTimestamp audioTimestamp2 = aVar.b;
                timestamp = audioTrack32.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    lz4Var = lz4Var3;
                    dvfVar = dvfVar2;
                    ry4Var2 = ry4Var3;
                } else {
                    lz4Var = lz4Var3;
                    long j6 = audioTimestamp2.framePosition;
                    dvfVar = dvfVar2;
                    ry4Var2 = ry4Var3;
                    long j7 = aVar.d;
                    if (j7 > j6) {
                        if (aVar.f) {
                            aVar.g += j7;
                            aVar.f = false;
                        } else {
                            aVar.c++;
                        }
                    }
                    aVar.d = j6;
                    aVar.e = j6 + aVar.g + (aVar.c << 32);
                }
                if (timestamp) {
                    z4 = timestamp;
                    ry4Var = ry4Var2;
                    i2 = 4;
                    audioTrack = audioTrack2;
                } else {
                    long j8 = audioTimestamp2.nanoTime / 1000;
                    z4 = timestamp;
                    long b02 = y2r0.b0(i72, aVar22.e) + y2r0.D(a2 - (aVar22.b.nanoTime / 1000), f2);
                    if (Math.abs(j8 - a2) > 5000000) {
                        long j9 = aVar.e;
                        cVar2.getClass();
                        StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                        sb.append(j9);
                        sb.append(", ");
                        sb.append(j8);
                        tj0.d(sb, ", ", a2, ", ");
                        sb.append(b32);
                        sb.append(", ");
                        sb.append(AudioTrackAudioOutput.this.a());
                        ahn.F(sb.toString());
                        ry4Var = ry4Var2;
                        ry4Var.a(4);
                        audioTrack = audioTrack2;
                        i2 = 4;
                    } else {
                        ry4Var = ry4Var2;
                        if (Math.abs(b02 - b32) > 5000000) {
                            long j10 = aVar.e;
                            cVar2.getClass();
                            audioTrack = audioTrack2;
                            StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(j10);
                            sb2.append(", ");
                            sb2.append(j8);
                            tj0.d(sb2, ", ", a2, ", ");
                            sb2.append(b32);
                            sb2.append(", ");
                            sb2.append(AudioTrackAudioOutput.this.a());
                            ahn.F(sb2.toString());
                            i2 = 4;
                            ry4Var.a(4);
                        } else {
                            audioTrack = audioTrack2;
                            i2 = 4;
                            if (ry4Var.d == 4) {
                                ry4Var.a(0);
                            }
                        }
                    }
                }
                i3 = ry4Var.d;
                if (i3 != 0) {
                    z = false;
                    if (z4) {
                        long j11 = audioTimestamp2.nanoTime;
                        if (j11 / 1000 >= ry4Var.e) {
                            ry4Var.h = aVar.e;
                            ry4Var.i = j11 / 1000;
                            ry4Var.a(1);
                        }
                    } else if (a2 - ry4Var.e > j3) {
                        ry4Var.a(3);
                    }
                } else if (i3 != 1) {
                    if (i3 == 2) {
                        z = false;
                        if (!z4) {
                            ry4Var.a(0);
                        }
                    } else if (i3 != 3) {
                        if (i3 != i2) {
                            throw new IllegalStateException();
                        }
                    } else if (z4) {
                        z = false;
                        ry4Var.a(0);
                    }
                } else if (z4) {
                    long j12 = aVar.e;
                    long j13 = ry4Var.h;
                    if (j12 > j13) {
                        if (Math.abs((y2r0.D(a2 - (aVar22.b.nanoTime / 1000), f2) + y2r0.b0(i72, aVar22.e)) - (y2r0.D(a2 - ry4Var.i, f2) + y2r0.b0(i72, j13))) < 1000) {
                            ry4Var.a(2);
                        }
                    }
                    if (a2 - ry4Var.e > 2000000) {
                        ry4Var.a(3);
                    } else {
                        ry4Var.h = aVar.e;
                        ry4Var.i = audioTimestamp2.nanoTime / 1000;
                    }
                } else {
                    z = false;
                    ry4Var.a(0);
                }
                long a32 = dvfVar.a() / j;
                z2 = ry4Var.d != 2 ? true : z;
                if (z2) {
                    lz4Var2 = lz4Var;
                    b2 = lz4Var2.b(a32);
                } else {
                    lz4Var2 = lz4Var;
                    float f3 = lz4Var2.i;
                    ry4.a aVar3 = ry4Var.a;
                    b2 = y2r0.D(a32 - (aVar3.b.nanoTime / j), f3) + y2r0.b0(ry4Var.b, aVar3.e);
                }
                long j52 = b2;
                playState = audioTrack.getPlayState();
                if (playState != 3) {
                    if (z2 || ((i = ry4Var.d) != 0 && i != 1)) {
                        lz4Var2.d(j52);
                    }
                    long j14 = lz4Var2.z;
                    if (j14 != C.TIME_UNSET) {
                        long j15 = j52 - lz4Var2.y;
                        long D = y2r0.D(a32 - j14, lz4Var2.i);
                        long j16 = lz4Var2.y + D;
                        long abs = Math.abs(j16 - j52);
                        if (j15 != j2 && abs < 1000000) {
                            long j17 = (D * 10) / 100;
                            j52 = y2r0.k(j52, j16 - j17, j16 + j17);
                        }
                    }
                    lz4Var2.z = a32;
                    lz4Var2.y = j52;
                } else if (playState == 1) {
                    lz4Var2.d(j52);
                }
                return j52;
            }
            lz4Var = lz4Var3;
            dvfVar = dvfVar2;
            ry4Var = ry4Var3;
            audioTrack = audioTrack2;
            z = false;
            long a322 = dvfVar.a() / j;
            if (ry4Var.d != 2) {
            }
            if (z2) {
            }
            long j522 = b2;
            playState = audioTrack.getPlayState();
            if (playState != 3) {
            }
            return j522;
        }
        lz4Var = lz4Var3;
        dvfVar = dvfVar2;
        ry4Var = ry4Var3;
        audioTrack = audioTrack2;
        j = 1000;
        j2 = 0;
        z = false;
        long a3222 = dvfVar.a() / j;
        if (ry4Var.d != 2) {
        }
        if (z2) {
        }
        long j5222 = b2;
        playState = audioTrack.getPlayState();
        if (playState != 3) {
        }
        return j5222;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final long h() {
        return this.a.getBufferSizeInFrames();
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final boolean i() {
        long a2 = a();
        lz4 lz4Var = this.e;
        return lz4Var.v != C.TIME_UNSET && a2 > 0 && lz4Var.b.elapsedRealtime() - lz4Var.v >= 200;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void j() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.a;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        lz4 lz4Var = this.e;
        lz4Var.A = true;
        lz4Var.h.a.f = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void pause() {
        lz4 lz4Var = this.e;
        lz4Var.k = 0L;
        lz4Var.t = 0;
        lz4Var.s = 0;
        lz4Var.l = 0L;
        lz4Var.y = C.TIME_UNSET;
        lz4Var.z = C.TIME_UNSET;
        if (lz4Var.u == C.TIME_UNSET) {
            lz4Var.h.a(0);
        }
        lz4Var.w = lz4Var.a();
        if (!this.j || g()) {
            this.a.pause();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void play() {
        lz4 lz4Var = this.e;
        if (lz4Var.u != C.TIME_UNSET) {
            lz4Var.u = y2r0.S(lz4Var.b.elapsedRealtime());
        }
        lz4Var.j = y2r0.b0(lz4Var.e, lz4Var.a());
        lz4Var.h.a(0);
        if (!this.j || g()) {
            this.a.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void release() {
        if (this.e.d.getPlayState() == 3) {
            this.a.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && g()) {
            d dVar = this.h;
            dVar.getClass();
            AudioTrackAudioOutput.this.a.unregisterStreamEventCallback(dVar.b);
            dVar.a.removeCallbacksAndMessages(null);
        }
        b bVar = this.d;
        if (bVar != null) {
            AudioTrack audioTrack = bVar.a;
            wy4 wy4Var = bVar.d;
            wy4Var.getClass();
            audioTrack.removeOnRoutingChangedListener(wy4Var);
            bVar.d = null;
            this.d = null;
        }
        AudioTrack audioTrack2 = this.a;
        ihz<AudioOutput.a> ihzVar = this.i;
        Handler o = y2r0.o(null);
        synchronized (p) {
            try {
                if (q == null) {
                    q = Executors.newSingleThreadScheduledExecutor(new q2r0("ExoPlayer:AudioTrackReleaseThread"));
                }
                r++;
                q.schedule(new vy4(audioTrack2, o, ihzVar, 0), 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.a.setPreferredDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void setVolume(float f) {
        this.a.setVolume(f);
    }

    @Override // androidx.media3.exoplayer.audio.AudioOutput
    public final void stop() {
        if (this.j) {
            return;
        }
        this.j = true;
        long a2 = a();
        lz4 lz4Var = this.e;
        lz4Var.w = lz4Var.a();
        lz4Var.u = y2r0.S(lz4Var.b.elapsedRealtime());
        lz4Var.x = a2;
        this.a.stop();
    }
}
