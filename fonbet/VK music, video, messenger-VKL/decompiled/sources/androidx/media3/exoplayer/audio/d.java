package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.h;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.a;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.audio.c;
import androidx.media3.exoplayer.audio.f;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.k;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.ahn;
import xsna.b900;
import xsna.bbl;
import xsna.cbl;
import xsna.cp5;
import xsna.cw4;
import xsna.dvf;
import xsna.fxc0;
import xsna.gc3;
import xsna.h0p0;
import xsna.h1b;
import xsna.hr80;
import xsna.jwa0;
import xsna.lhg;
import xsna.nc4;
import xsna.ni;
import xsna.omj0;
import xsna.qd0;
import xsna.ri;
import xsna.vl4;
import xsna.wi90;
import xsna.x19;
import xsna.x1b0;
import xsna.y2r0;
import xsna.yrp0;
import xsna.zv4;

/* compiled from: DefaultAudioSink.java */
/* loaded from: classes12.dex */
public final class d implements AudioSink {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;

    @Nullable
    public ByteBuffer I;
    public int J;

    @Nullable
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public cp5 S;

    @Nullable
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;

    @Nullable
    public final Context a;
    public long a0;
    public final e b;
    public Handler b0;
    public final h1b c;
    public final yrp0 d;
    public final h e;
    public final h0p0 f;
    public final com.google.common.collect.g g;
    public final ArrayDeque<f> h;
    public int i;

    @Nullable
    public a j;
    public final g<AudioSink.InitializationException> k;
    public final g<AudioSink.WriteException> l;

    @Nullable
    public x1b0 m;

    @Nullable
    public f.a n;

    @Nullable
    public C0049d o;
    public C0049d p;
    public androidx.media3.common.audio.b q;
    public AudioOutputProvider r;
    public cbl s;

    @Nullable
    public AudioOutput t;
    public nc4 u;

    @Nullable
    public f v;
    public f w;
    public jwa0 x;
    public boolean y;
    public long z;

    /* compiled from: DefaultAudioSink.java */
    public final class a implements AudioOutput.a {
        public final AudioOutputProvider.d a;

        public a(AudioOutputProvider.d dVar) {
            this.a = dVar;
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.a
        public final void a() {
            long j;
            d dVar = d.this;
            if (equals(dVar.j) && dVar.n != null) {
                C0049d c0049d = dVar.p;
                int i = c0049d.d;
                if (i != -1) {
                    long j2 = c0049d.e.f / i;
                    AudioOutput audioOutput = dVar.t;
                    audioOutput.getClass();
                    j = y2r0.b0(audioOutput.c(), j2);
                } else {
                    j = C.TIME_UNSET;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime() - dVar.W;
                f.a aVar = dVar.n;
                final int i2 = dVar.p.e.f;
                final long j0 = y2r0.j0(j);
                final b.a aVar2 = androidx.media3.exoplayer.audio.f.this.J0;
                Handler handler = aVar2.a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: xsna.xv4
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.media3.exoplayer.audio.b bVar = b.a.this.b;
                            String str = y2r0.a;
                            bVar.i(i2, j0, elapsedRealtime);
                        }
                    });
                }
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.a
        public final void b(final long j) {
            f.a aVar;
            d dVar = d.this;
            if (equals(dVar.j) && (aVar = dVar.n) != null) {
                androidx.media3.exoplayer.audio.f fVar = androidx.media3.exoplayer.audio.f.this;
                fVar.U0 = true;
                final b.a aVar2 = fVar.J0;
                Handler handler = aVar2.a;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: xsna.yv4
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.media3.exoplayer.audio.b bVar = b.a.this.b;
                            String str = y2r0.a;
                            bVar.r(j);
                        }
                    });
                }
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.a
        public final void c() {
            f.a aVar;
            j.a aVar2;
            d dVar = d.this;
            if (equals(dVar.j) && (aVar = dVar.n) != null && dVar.O && (aVar2 = androidx.media3.exoplayer.audio.f.this.K) != null) {
                aVar2.b();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.a
        public final void d() {
            d dVar = d.this;
            if (equals(dVar.j) && dVar.M) {
                dVar.N = true;
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.a
        public final void onReleased() {
            d.c0.getAndDecrement();
            f.a aVar = d.this.n;
            if (aVar != null) {
                int i = this.a.a;
                AudioSink.a aVar2 = new AudioSink.a();
                b.a aVar3 = androidx.media3.exoplayer.audio.f.this.J0;
                Handler handler = aVar3.a;
                if (handler != null) {
                    handler.post(new zv4(0, aVar3, aVar2));
                }
            }
        }
    }

    /* compiled from: DefaultAudioSink.java */
    public interface b {
        public static final androidx.media3.exoplayer.audio.e a = new androidx.media3.exoplayer.audio.e();
    }

    /* compiled from: DefaultAudioSink.java */
    public static final class c {

        @Nullable
        public final Context a;
        public final vl4 b = vl4.c;

        @Nullable
        public e c;
        public boolean d;
        public androidx.media3.exoplayer.audio.e e;
        public androidx.media3.exoplayer.audio.c f;
        public bbl g;

        public c(Context context) {
            this.a = context;
        }

        public final d a() {
            fxc0.z(!this.d);
            this.d = true;
            if (this.c == null) {
                this.c = new e(new AudioProcessor[0]);
            }
            if (this.f == null) {
                bbl bblVar = this.g;
                Context context = this.a;
                if (bblVar == null) {
                    this.g = new bbl(context);
                }
                if (this.e == null) {
                    this.e = b.a;
                }
                c.a aVar = new c.a(context);
                vl4 vl4Var = context != null ? null : this.b;
                Context context2 = aVar.a;
                if (context2 == null) {
                    aVar.d = vl4Var;
                }
                bbl bblVar2 = this.g;
                aVar.b = bblVar2;
                aVar.c = this.e;
                if (bblVar2 == null) {
                    aVar.b = new bbl(context2);
                }
                this.f = new androidx.media3.exoplayer.audio.c(aVar);
            } else {
                fxc0.z(this.g == null);
                fxc0.z(this.e == null);
            }
            return new d(this);
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* renamed from: androidx.media3.exoplayer.audio.d$d, reason: collision with other inner class name */
    public static final class C0049d {
        public final androidx.media3.common.a a;
        public final androidx.media3.common.a b;
        public final int c;
        public final int d;
        public final AudioOutputProvider.d e;
        public final androidx.media3.common.audio.b f;

        public C0049d(androidx.media3.common.a aVar, androidx.media3.common.a aVar2, int i, int i2, AudioOutputProvider.d dVar, androidx.media3.common.audio.b bVar) {
            this.a = aVar;
            this.b = aVar2;
            this.c = i;
            this.d = i2;
            this.e = dVar;
            this.f = bVar;
        }

        public static boolean a(C0049d c0049d) {
            return Objects.equals(c0049d.a.n, MimeTypes.AUDIO_RAW);
        }
    }

    /* compiled from: DefaultAudioSink.java */
    public static class e {
        public final AudioProcessor[] a;
        public final omj0 b;
        public final androidx.media3.common.audio.e c;

        public e(AudioProcessor... audioProcessorArr) {
            omj0 omj0Var = new omj0();
            androidx.media3.common.audio.e eVar = new androidx.media3.common.audio.e(false);
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.b = omj0Var;
            this.c = eVar;
            audioProcessorArr2[audioProcessorArr.length] = omj0Var;
            audioProcessorArr2[audioProcessorArr.length + 1] = eVar;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    public static final class f {
        public final jwa0 a;
        public final long b;
        public final long c;
        public long d;

        public f(jwa0 jwa0Var, long j, long j2) {
            this.a = jwa0Var;
            this.b = j;
            this.c = j2;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    public static final class g<T extends Exception> {

        @Nullable
        public T a;
        public long b = C.TIME_UNSET;
        public long c = C.TIME_UNSET;

        public final void a(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.a == null) {
                this.a = t;
            }
            if (this.b == C.TIME_UNSET && d.c0.get() <= 0) {
                this.b = 200 + elapsedRealtime;
            }
            long j = this.b;
            if (j == C.TIME_UNSET || elapsedRealtime < j) {
                this.c = elapsedRealtime + 50;
                return;
            }
            T t2 = this.a;
            if (t2 != t) {
                t2.addSuppressed(t);
            }
            T t3 = this.a;
            this.a = null;
            this.b = C.TIME_UNSET;
            this.c = C.TIME_UNSET;
            throw t3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0081, code lost:
    
        r9 = r0.getDeviceId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(c cVar) {
        int deviceId;
        Context context = cVar.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = nc4.c;
        this.b = cVar.c;
        this.i = 0;
        this.r = cVar.f;
        h1b h1bVar = new h1b();
        this.c = h1bVar;
        yrp0 yrp0Var = new yrp0();
        yrp0Var.m = y2r0.b;
        this.d = yrp0Var;
        this.e = new h();
        this.f = new h0p0();
        this.g = ImmutableList.q(yrp0Var, h1bVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new cp5();
        jwa0 jwa0Var = jwa0.d;
        this.w = new f(jwa0Var, 0L, 0L);
        this.x = jwa0Var;
        this.y = false;
        this.h = new ArrayDeque<>();
        this.k = new g<>();
        this.l = new g<>();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && deviceId != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int y(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b4 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b4; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b5 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b5; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((hr80.w(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = y2r0.a;
                    int i14 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i14 = Integer.reverseBytes(i14);
                    }
                    if ((i14 & (-2097152)) == -2097152 && (i6 = (i14 >>> 19) & 3) != 1 && (i7 = (i14 >>> 17) & 3) != 0) {
                        int i15 = (i14 >>> 12) & 15;
                        int i16 = (i14 >>> 10) & 3;
                        if (i15 != 0 && i15 != 15 && i16 != 3) {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        throw new IllegalArgumentException();
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                            if (i5 == -1) {
                                return i5;
                            }
                            throw new IllegalArgumentException();
                        }
                    }
                    i5 = -1;
                    if (i5 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i17 = position2;
                            while (true) {
                                if (i17 <= limit) {
                                    String str2 = y2r0.a;
                                    int i18 = byteBuffer.getInt(i17 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i18 = Integer.reverseBytes(i18);
                                    }
                                    if ((i18 & (-2)) == -126718022) {
                                        i8 = i17 - position2;
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return ri.b(new wi90(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(lhg.a(i, "Unexpected audio encoding: "));
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return ni.a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position4 = byteBuffer.position();
        byte b6 = byteBuffer.get(position4);
        if (b6 != -2) {
            if (b6 == -1) {
                i3 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b3 = byteBuffer.get(position4 + 7);
            } else if (b6 != 31) {
                i3 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b2 = byteBuffer.get(position4 + 5);
            } else {
                i3 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b3 = byteBuffer.get(position4 + 6);
            }
            i4 = b3 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b2 = byteBuffer.get(position4 + 4);
        i4 = b2 & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A() throws AudioSink.InitializationException {
        AudioOutput u;
        b900 b900Var;
        g<AudioSink.InitializationException> gVar = this.k;
        if (gVar.a != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < gVar.c)) {
            return false;
        }
        try {
            u = u(this.p.e);
        } catch (AudioSink.InitializationException e2) {
            AudioOutputProvider.d dVar = this.p.e;
            if (dVar.f > 1000000) {
                AudioOutputProvider.d.a a2 = dVar.a();
                a2.f = 1000000;
                AudioOutputProvider.d dVar2 = new AudioOutputProvider.d(a2);
                try {
                    u = u(dVar2);
                    C0049d c0049d = this.p;
                    this.p = new C0049d(c0049d.a, c0049d.b, c0049d.c, c0049d.d, dVar2, c0049d.f);
                } catch (AudioSink.InitializationException e3) {
                    e2.addSuppressed(e3);
                    if (this.p.e.e) {
                    }
                }
            }
            if (this.p.e.e) {
                throw e2;
            }
            this.X = true;
            throw e2;
        }
        this.t = u;
        a aVar = new a(this.p.e);
        this.j = aVar;
        ((AudioTrackAudioOutput) u).i.a(aVar);
        if (this.t.g()) {
            C0049d c0049d2 = this.p;
            if (c0049d2.e.k) {
                AudioOutput audioOutput = this.t;
                androidx.media3.common.a aVar2 = c0049d2.a;
                audioOutput.d(aVar2.I, aVar2.J);
            }
        }
        x1b0 x1b0Var = this.m;
        if (x1b0Var != null) {
            this.t.e(x1b0Var);
        }
        if (B()) {
            this.t.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.t.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.t.getAudioSessionId();
        boolean z = audioSessionId != this.Q;
        this.Q = audioSessionId;
        f.a aVar3 = this.n;
        if (aVar3 != null) {
            int i = this.p.e.a;
            AudioSink.a aVar4 = new AudioSink.a();
            b.a aVar5 = androidx.media3.exoplayer.audio.f.this.J0;
            Handler handler = aVar5.a;
            if (handler != null) {
                handler.post(new gc3(1, aVar5, aVar4));
            }
            if (z) {
                this.R = true;
                C0049d c0049d3 = this.p;
                AudioOutputProvider.d.a a3 = c0049d3.e.a();
                a3.h = this.Q;
                this.p = new C0049d(c0049d3.a, c0049d3.b, c0049d3.c, c0049d3.d, new AudioOutputProvider.d(a3), c0049d3.f);
                C0049d c0049d4 = this.o;
                if (c0049d4 != null) {
                    AudioOutputProvider.d.a a4 = c0049d4.e.a();
                    a4.h = this.Q;
                    this.o = new C0049d(c0049d4.a, c0049d4.b, c0049d4.c, c0049d4.d, new AudioOutputProvider.d(a4), c0049d4.f);
                }
                f.a aVar6 = this.n;
                final int i2 = this.Q;
                androidx.media3.exoplayer.audio.f fVar = androidx.media3.exoplayer.audio.f.this;
                if (Build.VERSION.SDK_INT >= 35 && (b900Var = fVar.L0) != null) {
                    b900Var.b(i2);
                }
                final b.a aVar7 = fVar.J0;
                Handler handler2 = aVar7.a;
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: xsna.dw4
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.media3.exoplayer.audio.b bVar = b.a.this.b;
                            String str = y2r0.a;
                            bVar.a(i2);
                        }
                    });
                }
            }
        }
        return true;
    }

    public final boolean B() {
        return this.t != null;
    }

    public final void C(long j) throws AudioSink.WriteException {
        v(j);
        if (this.K != null) {
            return;
        }
        if (!this.q.f()) {
            ByteBuffer byteBuffer = this.I;
            if (byteBuffer != null) {
                E(byteBuffer);
                v(j);
                return;
            }
            return;
        }
        while (!this.q.e()) {
            do {
                ByteBuffer d = this.q.d();
                if (d.hasRemaining()) {
                    E(d);
                    v(j);
                } else {
                    ByteBuffer byteBuffer2 = this.I;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.q.i(this.I);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void D() {
        if (this.p != null) {
            C0049d c0049d = this.o;
            if (c0049d != null) {
                this.p = c0049d;
                this.o = null;
            }
            try {
                AudioOutputProvider.d g2 = this.r.g(x(this.p.b));
                C0049d c0049d2 = this.p;
                this.p = new C0049d(c0049d2.a, c0049d2.b, c0049d2.c, c0049d2.d, g2, c0049d2.f);
            } catch (AudioOutputProvider.ConfigurationException e2) {
                throw new IllegalStateException(new AudioSink.ConfigurationException(e2, this.p.a));
            }
        }
        flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        byte b2;
        int i2;
        int i3;
        fxc0.z(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (C0049d.a(this.p)) {
                int q = (int) y2r0.q(this.p.e.b, y2r0.S(20L));
                long z = z();
                long j = q;
                if (z < j) {
                    C0049d c0049d = this.p;
                    int i4 = c0049d.e.a;
                    int i5 = c0049d.d;
                    int i6 = (int) z;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < q) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i4 == 4) {
                                float i7 = y2r0.i(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (i7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (-i7) * (-2.1474836E9f) : i7 * 2.1474836E9f);
                            } else if (i4 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b2 = byteBuffer.get();
                            } else if (i4 != 22) {
                                if (i4 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i4 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i4 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b2 = byteBuffer.get();
                            }
                            int i8 = (int) ((i3 * i6) / j);
                            if (i4 != 2) {
                                byteBuffer2.put((byte) (i8 >> 16));
                                byteBuffer2.put((byte) (i8 >> 24));
                            } else if (i4 == 3) {
                                byteBuffer2.put((byte) (i8 >> 24));
                            } else if (i4 != 4) {
                                if (i4 == 21) {
                                    byteBuffer2.put((byte) (i8 >> 8));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                    byteBuffer2.put((byte) (i8 >> 24));
                                } else if (i4 == 22) {
                                    byteBuffer2.put((byte) i8);
                                    byteBuffer2.put((byte) (i8 >> 8));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                    byteBuffer2.put((byte) (i8 >> 24));
                                } else if (i4 == 268435456) {
                                    byteBuffer2.put((byte) (i8 >> 24));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                } else if (i4 == 1342177280) {
                                    byteBuffer2.put((byte) (i8 >> 24));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                    byteBuffer2.put((byte) (i8 >> 8));
                                } else {
                                    if (i4 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBuffer2.put((byte) (i8 >> 24));
                                    byteBuffer2.put((byte) (i8 >> 16));
                                    byteBuffer2.put((byte) (i8 >> 8));
                                    byteBuffer2.put((byte) i8);
                                }
                            } else if (i8 < 0) {
                                byteBuffer2.putFloat((-i8) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i8 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i5) {
                                i6++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b2 = byteBuffer.get();
                        }
                        i2 = (b2 & 255) << 24;
                        i3 = i | i2;
                        int i82 = (int) ((i3 * i6) / j);
                        if (i4 != 2) {
                        }
                        if (byteBuffer.position() != position + i5) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.K = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.K = byteBuffer2;
        }
    }

    public final boolean F() {
        C0049d c0049d = this.p;
        return c0049d != null && c0049d.e.j;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean a(androidx.media3.common.a aVar) {
        return o(aVar) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void b(jwa0 jwa0Var) {
        this.x = new jwa0(y2r0.i(jwa0Var.a, 0.1f, 8.0f), y2r0.i(jwa0Var.b, 0.1f, 8.0f));
        if (F()) {
            if (B()) {
                this.t.b(this.x);
                this.x = this.t.getPlaybackParameters();
                return;
            }
            return;
        }
        f fVar = new f(jwa0Var, C.TIME_UNSET, C.TIME_UNSET);
        if (B()) {
            this.v = fVar;
        } else {
            this.w = fVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void c(dvf dvfVar) {
        this.r.c(dvfVar);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void d(int i, int i2) {
        C0049d c0049d;
        AudioOutput audioOutput = this.t;
        if (audioOutput == null || !audioOutput.g() || (c0049d = this.p) == null || !c0049d.e.k) {
            return;
        }
        this.t.d(i, i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void disableTunneling() {
        if (this.V) {
            this.V = false;
            D();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void e(@Nullable x1b0 x1b0Var) {
        this.m = x1b0Var;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final long f() {
        if (!B()) {
            return C.TIME_UNSET;
        }
        if (C0049d.a(this.p)) {
            return y2r0.b0(this.p.e.b, this.t.h());
        }
        long h = this.t.h();
        int D = x19.D(this.p.e.a);
        fxc0.z(D != -2147483647);
        return y2r0.d0(h, 1000000L, D, RoundingMode.DOWN);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void flush() {
        if (B()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new f(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            androidx.media3.common.audio.b bVar = this.p.f;
            this.q = bVar;
            bVar.getClass();
            bVar.b(AudioProcessor.b.b);
            this.j = null;
            C0049d c0049d = this.o;
            if (c0049d != null) {
                this.p = c0049d;
                this.o = null;
            }
            c0.incrementAndGet();
            this.t.release();
            this.t = null;
        }
        g<AudioSink.WriteException> gVar = this.l;
        gVar.a = null;
        gVar.b = C.TIME_UNSET;
        gVar.c = C.TIME_UNSET;
        g<AudioSink.InitializationException> gVar2 = this.k;
        gVar2.a = null;
        gVar2.b = C.TIME_UNSET;
        gVar2.c = C.TIME_UNSET;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void g(int i) {
        fxc0.z(Build.VERSION.SDK_INT >= 29);
        this.i = i;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final jwa0 getPlaybackParameters() {
        return this.x;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void h(AudioOutputProvider audioOutputProvider) {
        if (audioOutputProvider.equals(this.r)) {
            return;
        }
        this.r.release();
        this.r = audioOutputProvider;
        cbl cblVar = this.s;
        if (cblVar != null) {
            audioOutputProvider.f(cblVar);
        }
        D();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void handleDiscontinuity() {
        this.E = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean hasPendingData() {
        if (!B()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.g() && this.N) {
            return false;
        }
        long z = z();
        long positionUs = this.t.getPositionUs();
        AudioOutput audioOutput = this.t;
        audioOutput.getClass();
        return z > y2r0.q(audioOutput.c(), positionUs);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final long i() {
        ArrayDeque<f> arrayDeque;
        long j;
        if (!B() || this.F) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.getPositionUs(), y2r0.b0(this.p.e.b, z()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < arrayDeque.getFirst().c) {
                break;
            }
            this.w = arrayDeque.remove();
        }
        f fVar = this.w;
        long j2 = min - fVar.c;
        long D = y2r0.D(j2, fVar.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        e eVar = this.b;
        if (isEmpty) {
            androidx.media3.common.audio.e eVar2 = eVar.c;
            if (eVar2.isActive()) {
                if (eVar2.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    long j3 = eVar2.n;
                    eVar2.k.getClass();
                    long f2 = j3 - (r8.i.f() * (r8.j * r8.b));
                    int i = eVar2.i.a;
                    int i2 = eVar2.h.a;
                    j2 = i == i2 ? y2r0.d0(j2, f2, eVar2.o, RoundingMode.DOWN) : y2r0.d0(j2, f2 * i, eVar2.o * i2, RoundingMode.DOWN);
                } else {
                    j2 = (long) (eVar2.d * j2);
                }
            }
            f fVar2 = this.w;
            j = fVar2.b + j2;
            fVar2.d = j2 - D;
        } else {
            f fVar3 = this.w;
            j = fVar3.b + D + fVar3.d;
        }
        long j4 = eVar.b.q;
        long b0 = y2r0.b0(this.p.e.b, j4) + j;
        long j5 = this.Z;
        if (j4 > j5) {
            long b02 = y2r0.b0(this.p.e.b, j4 - j5);
            this.Z = j4;
            this.a0 += b02;
            if (this.b0 == null) {
                this.b0 = new Handler(Looper.myLooper());
            }
            this.b0.removeCallbacksAndMessages(null);
            this.b0.postDelayed(new qd0(this, 5), 100L);
        }
        return b0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean isEnded() {
        if (B()) {
            return this.L && !hasPendingData();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void j(boolean z) {
        this.y = z;
        f fVar = new f(F() ? jwa0.d : this.x, C.TIME_UNSET, C.TIME_UNSET);
        if (B()) {
            this.v = fVar;
        } else {
            this.w = fVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void k(f.a aVar) {
        this.n = aVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void l(int i) {
        if (i == 0 || i == -1) {
            i = -1;
        }
        if (this.U == i) {
            return;
        }
        this.U = i;
        D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [xsna.cbl] */
    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void m(androidx.media3.common.a aVar, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        androidx.media3.common.audio.b bVar;
        androidx.media3.common.a aVar2;
        int i;
        int i2;
        if (this.s == null && this.a != null) {
            ?? r0 = new AudioOutputProvider.c() { // from class: xsna.cbl
                @Override // androidx.media3.exoplayer.audio.AudioOutputProvider.c
                public final void a() {
                    k.a aVar3;
                    f.a aVar4 = androidx.media3.exoplayer.audio.d.this.n;
                    if (aVar4 != null) {
                        androidx.media3.exoplayer.audio.f fVar = androidx.media3.exoplayer.audio.f.this;
                        synchronized (fVar.b) {
                            aVar3 = fVar.s;
                        }
                        if (aVar3 != null) {
                            npl nplVar = (npl) aVar3;
                            synchronized (nplVar.c) {
                                nplVar.f.getClass();
                            }
                        }
                    }
                }
            };
            this.s = r0;
            this.r.f(r0);
        }
        String str = aVar.n;
        int i3 = aVar.H;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            fxc0.p(y2r0.M(i3));
            int u = y2r0.u(i3) * aVar.F;
            ImmutableList.a aVar3 = new ImmutableList.a();
            aVar3.e(this.g);
            aVar3.c(this.e);
            aVar3.d(this.b.a);
            bVar = new androidx.media3.common.audio.b(aVar3.g());
            if (bVar.equals(this.q)) {
                bVar = this.q;
            }
            int i4 = aVar.I;
            int i5 = aVar.J;
            yrp0 yrp0Var = this.d;
            yrp0Var.i = i4;
            yrp0Var.j = i5;
            this.c.i = iArr;
            try {
                AudioProcessor.a a2 = bVar.a(new AudioProcessor.a(aVar));
                int i6 = a2.b;
                int i7 = a2.c;
                a.C0043a a3 = aVar.a();
                a3.G = i7;
                a3.F = a2.a;
                a3.E = i6;
                aVar2 = new androidx.media3.common.a(a3);
                i = u;
                i2 = y2r0.u(i7) * i6;
            } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                throw new AudioSink.ConfigurationException(e2, aVar);
            }
        } else {
            bVar = new androidx.media3.common.audio.b(com.google.common.collect.g.f);
            aVar2 = aVar;
            i = -1;
            i2 = -1;
        }
        androidx.media3.common.audio.b bVar2 = bVar;
        AudioOutputProvider.a x = x(aVar2);
        androidx.media3.common.a aVar4 = x.a;
        try {
            AudioOutputProvider.d g2 = this.r.g(x);
            int i8 = g2.a;
            boolean z = g2.e;
            if (i8 == 0) {
                throw new AudioSink.ConfigurationException(aVar4, com.vk.movika.sdk.android.defaultplayer.interactive.c.a("Invalid output encoding (isOffload=", ")", z));
            }
            if (g2.c == 0) {
                throw new AudioSink.ConfigurationException(aVar4, com.vk.movika.sdk.android.defaultplayer.interactive.c.a("Invalid output channel config (isOffload=", ")", z));
            }
            this.X = false;
            C0049d c0049d = new C0049d(aVar, aVar2, i, i2, g2, bVar2);
            if (B()) {
                this.o = c0049d;
            } else {
                this.p = c0049d;
            }
        } catch (AudioOutputProvider.ConfigurationException e3) {
            throw new AudioSink.ConfigurationException(e3, aVar);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void n() {
        fxc0.z(this.P);
        if (this.V) {
            return;
        }
        this.V = true;
        D();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final int o(androidx.media3.common.a aVar) {
        boolean z;
        if (!y2r0.M(aVar.H) || aVar.H == 2) {
            z = false;
        } else {
            a.C0043a a2 = aVar.a();
            a2.G = 2;
            aVar = new androidx.media3.common.a(a2);
            z = true;
        }
        int i = this.r.d(x(aVar)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void p(cp5 cp5Var) {
        if (this.S.equals(cp5Var)) {
            return;
        }
        cp5Var.getClass();
        if (this.t != null) {
            this.S.getClass();
        }
        this.S = cp5Var;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void pause() {
        this.O = false;
        if (B()) {
            this.t.pause();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void play() {
        this.O = true;
        if (B()) {
            this.t.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.L && B() && w()) {
            if (!this.M) {
                this.M = true;
                if (this.t.g()) {
                    this.N = false;
                }
                this.t.stop();
            }
            this.L = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final androidx.media3.exoplayer.audio.a q(androidx.media3.common.a aVar) {
        if (this.X) {
            return androidx.media3.exoplayer.audio.a.d;
        }
        AudioOutputProvider.b d = this.r.d(x(aVar));
        a.C0048a c0048a = new a.C0048a();
        c0048a.a = d.a;
        c0048a.b = d.b;
        c0048a.c = d.c;
        return c0048a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0110, code lost:
    
        if (r5 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0091, code lost:
    
        if (A() == false) goto L111;
     */
    @Override // androidx.media3.exoplayer.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j, int i, ByteBuffer byteBuffer) throws AudioSink.InitializationException, AudioSink.WriteException {
        long j2;
        long j3;
        ByteBuffer byteBuffer2 = this.I;
        fxc0.p(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (w()) {
                C0049d c0049d = this.o;
                C0049d c0049d2 = this.p;
                c0049d.getClass();
                if (c0049d2.e.equals(c0049d.e)) {
                    this.p = this.o;
                    this.o = null;
                    AudioOutput audioOutput = this.t;
                    if (audioOutput != null && audioOutput.g() && this.p.e.k) {
                        this.t.j();
                        AudioOutput audioOutput2 = this.t;
                        androidx.media3.common.a aVar = this.p.a;
                        audioOutput2.d(aVar.I, aVar.J);
                        this.Y = true;
                    }
                } else {
                    if (!this.M) {
                        this.M = true;
                        if (this.t.g()) {
                            this.N = false;
                        }
                        this.t.stop();
                    }
                    if (!hasPendingData()) {
                        flush();
                    }
                }
                t(j);
            }
            return false;
        }
        boolean B = B();
        g<AudioSink.InitializationException> gVar = this.k;
        if (!B) {
            try {
            } catch (AudioSink.InitializationException e2) {
                if (e2.isRecoverable) {
                    throw e2;
                }
                gVar.a(e2);
                return false;
            }
        }
        gVar.a = null;
        gVar.b = C.TIME_UNSET;
        gVar.c = C.TIME_UNSET;
        if (this.F) {
            this.G = Math.max(0L, j);
            this.E = false;
            this.F = false;
            if (F() && B()) {
                this.t.b(this.x);
                this.x = this.t.getPlaybackParameters();
            }
            t(j);
            if (this.O) {
                play();
            }
        }
        if (this.I == null) {
            fxc0.p(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!C0049d.a(this.p) && this.D == 0) {
                    int y = y(this.p.e.a, byteBuffer);
                    this.D = y;
                }
                if (this.v != null) {
                    if (w()) {
                        t(j);
                        this.v = null;
                    }
                    return false;
                }
                long j4 = this.G;
                C0049d c0049d3 = this.p;
                if (C0049d.a(c0049d3)) {
                    j2 = 0;
                    j3 = this.z / this.p.c;
                } else {
                    j2 = 0;
                    j3 = this.A;
                }
                long b0 = y2r0.b0(c0049d3.a.G, j3 - this.d.o) + j4;
                if (!this.E && Math.abs(b0 - j) > 200000) {
                    f.a aVar2 = this.n;
                    if (aVar2 != null) {
                        aVar2.a(new AudioSink.UnexpectedDiscontinuityException(j, b0));
                    }
                    this.E = true;
                }
                if (this.E) {
                    if (w()) {
                        long j5 = j - b0;
                        this.G += j5;
                        this.E = false;
                        t(j);
                        f.a aVar3 = this.n;
                        if (aVar3 != null && j5 != j2) {
                            androidx.media3.exoplayer.audio.f.this.R0 = true;
                        }
                    }
                    return false;
                }
                if (C0049d.a(this.p)) {
                    this.z += byteBuffer.remaining();
                } else {
                    this.A = (this.D * i) + this.A;
                }
                this.I = byteBuffer;
                this.J = i;
            }
            return true;
        }
        C(j);
        if (!this.I.hasRemaining()) {
            this.I = null;
            this.J = 0;
            return true;
        }
        if (this.t.i()) {
            ahn.F("Resetting stalled audio output");
            flush();
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void release() {
        this.r.release();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void reset() {
        flush();
        ImmutableList.b listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((AudioProcessor) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        androidx.media3.common.audio.b bVar = this.q;
        if (bVar != null) {
            bVar.j();
        }
        this.O = false;
        this.X = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void s(nc4 nc4Var) {
        if (this.u.equals(nc4Var)) {
            return;
        }
        this.u = nc4Var;
        if (this.V) {
            return;
        }
        D();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void setAudioSessionId(int i) {
        if (this.R) {
            if (this.Q != i) {
                return;
            } else {
                this.R = false;
            }
        }
        if (this.Q != i) {
            this.Q = i;
            this.P = i != 0;
            D();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.T = audioDeviceInfo;
        AudioOutput audioOutput = this.t;
        if (audioOutput != null) {
            audioOutput.setPreferredDevice(audioDeviceInfo);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void setVolume(float f2) {
        if (this.H != f2) {
            this.H = f2;
            if (B()) {
                this.t.setVolume(this.H);
            }
        }
    }

    public final void t(long j) {
        jwa0 jwa0Var;
        boolean z;
        boolean F = F();
        e eVar = this.b;
        if (F) {
            jwa0Var = jwa0.d;
        } else {
            if (this.V || !C0049d.a(this.p)) {
                jwa0Var = jwa0.d;
            } else {
                int i = this.p.a.H;
                jwa0Var = this.x;
                androidx.media3.common.audio.e eVar2 = eVar.c;
                eVar2.f(jwa0Var.a);
                eVar2.e(jwa0Var.b);
            }
            this.x = jwa0Var;
        }
        jwa0 jwa0Var2 = jwa0Var;
        if (this.V || !C0049d.a(this.p)) {
            z = false;
        } else {
            int i2 = this.p.a.H;
            z = this.y;
            eVar.b.o = z;
        }
        this.y = z;
        long max = Math.max(0L, j);
        C0049d c0049d = this.p;
        this.h.add(new f(jwa0Var2, max, y2r0.b0(c0049d.e.b, z())));
        androidx.media3.common.audio.b bVar = this.p.f;
        this.q = bVar;
        bVar.getClass();
        bVar.b(AudioProcessor.b.b);
        f.a aVar = this.n;
        if (aVar != null) {
            boolean z2 = this.y;
            b.a aVar2 = androidx.media3.exoplayer.audio.f.this.J0;
            Handler handler = aVar2.a;
            if (handler != null) {
                handler.post(new cw4(aVar2, z2, 0));
            }
        }
    }

    public final AudioOutput u(AudioOutputProvider.d dVar) throws AudioSink.InitializationException {
        try {
            return this.r.e(dVar);
        } catch (AudioOutputProvider.InitializationException e2) {
            AudioSink.InitializationException initializationException = new AudioSink.InitializationException(dVar.b, dVar.c, dVar.a, dVar.f, this.p.a, dVar.e, e2);
            f.a aVar = this.n;
            if (aVar == null) {
                throw initializationException;
            }
            aVar.a(initializationException);
            throw initializationException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j) throws AudioSink.WriteException {
        f.a aVar;
        f.a aVar2;
        j.a aVar3;
        if (this.K == null) {
            return;
        }
        g<AudioSink.WriteException> gVar = this.l;
        if (gVar.a != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < gVar.c)) {
            return;
        }
        int remaining = this.K.remaining();
        try {
            boolean f2 = this.t.f(j, this.J, this.K);
            this.W = SystemClock.elapsedRealtime();
            gVar.a = null;
            gVar.b = C.TIME_UNSET;
            gVar.c = C.TIME_UNSET;
            if (this.t.g()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (aVar2 = this.n) != null && !f2 && !this.Y && (aVar3 = androidx.media3.exoplayer.audio.f.this.K) != null) {
                    aVar3.a();
                }
            }
            if (C0049d.a(this.p)) {
                this.B += remaining - this.K.remaining();
            }
            if (f2) {
                if (!C0049d.a(this.p)) {
                    fxc0.z(this.K == this.I);
                    this.C = (this.D * this.J) + this.C;
                }
                this.K = null;
            }
        } catch (AudioOutput.WriteException e2) {
            if (e2.isRecoverable) {
                if (z() <= 0) {
                    if (this.t.g()) {
                        if (this.p.e.e) {
                            this.X = true;
                        }
                    }
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(e2.errorCode, this.p.a, r4);
                aVar = this.n;
                if (aVar != null) {
                    aVar.a(writeException);
                }
                if (!e2.isRecoverable) {
                    throw writeException;
                }
                gVar.a(writeException);
                return;
            }
            r4 = false;
            AudioSink.WriteException writeException2 = new AudioSink.WriteException(e2.errorCode, this.p.a, r4);
            aVar = this.n;
            if (aVar != null) {
            }
            if (!e2.isRecoverable) {
            }
        }
    }

    public final boolean w() throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        if (!this.q.f()) {
            v(Long.MIN_VALUE);
            return this.K == null;
        }
        this.q.h();
        C(Long.MIN_VALUE);
        return this.q.e() && ((byteBuffer = this.K) == null || !byteBuffer.hasRemaining());
    }

    public final AudioOutputProvider.a x(androidx.media3.common.a aVar) {
        AudioOutputProvider.a.C0047a c0047a = new AudioOutputProvider.a.C0047a(aVar);
        c0047a.b = this.u;
        c0047a.d = this.i != 0;
        c0047a.c = this.T;
        c0047a.e = this.Q;
        c0047a.g = this.V;
        c0047a.h = -1;
        c0047a.f = this.U;
        return new AudioOutputProvider.a(c0047a);
    }

    public final long z() {
        if (!C0049d.a(this.p)) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.d;
        return ((j + j2) - 1) / j2;
    }
}
