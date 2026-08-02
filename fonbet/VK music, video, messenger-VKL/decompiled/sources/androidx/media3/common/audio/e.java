package androidx.media3.common.audio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.fxc0;
import xsna.xek0;
import xsna.y2r0;

/* compiled from: SonicAudioProcessor.java */
/* loaded from: classes12.dex */
public final class e implements AudioProcessor {
    public final boolean b;
    public int c;
    public float d = 1.0f;
    public float e = 1.0f;
    public AudioProcessor.a f;
    public AudioProcessor.a g;
    public AudioProcessor.a h;
    public AudioProcessor.a i;
    public boolean j;

    @Nullable
    public xek0 k;
    public ByteBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public e(boolean z) {
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.c = -1;
        this.b = z;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void a(AudioProcessor.b bVar) {
        if (isActive()) {
            AudioProcessor.a aVar = this.f;
            this.h = aVar;
            AudioProcessor.a aVar2 = this.g;
            this.i = aVar2;
            if (this.j) {
                this.k = new xek0(aVar.a, aVar.b, this.d, this.e, aVar2.a, aVar.c == 4);
            } else {
                xek0 xek0Var = this.k;
                if (xek0Var != null) {
                    xek0Var.j = 0;
                    xek0Var.k = 0;
                    xek0Var.l = 0;
                    xek0Var.m = 0;
                    xek0Var.n = 0;
                    xek0Var.o = 0;
                    xek0Var.p = 0;
                    xek0Var.q = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                    xek0Var.i.flush();
                }
            }
        }
        this.m = AudioProcessor.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i = aVar.c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i2 = this.c;
        if (i2 == -1) {
            i2 = aVar.a;
        }
        this.f = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i2, aVar.b, i);
        this.g = aVar2;
        this.j = true;
        return aVar2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final long c(long j) {
        return d(j);
    }

    public final long d(long j) {
        if (this.o < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (j / this.d);
        }
        long j2 = this.n;
        this.k.getClass();
        long f = j2 - (r2.i.f() * (r2.j * r2.b));
        int i = this.i.a;
        int i2 = this.h.a;
        return i == i2 ? y2r0.d0(j, this.o, f, RoundingMode.DOWN) : y2r0.d0(j, this.o * i2, f * i, RoundingMode.DOWN);
    }

    public final void e(float f) {
        fxc0.p(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.e != f) {
            this.e = f;
            this.j = true;
        }
    }

    public final void f(float f) {
        fxc0.p(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.d != f) {
            this.d = f;
            this.j = true;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        xek0 xek0Var = this.k;
        if (xek0Var != null) {
            xek0.b<?> bVar = xek0Var.i;
            int i = xek0Var.b;
            fxc0.z(xek0Var.k >= 0);
            int f = bVar.f() * xek0Var.k * i;
            if (f > 0) {
                if (this.l.capacity() < f) {
                    this.l = ByteBuffer.allocateDirect(f).order(ByteOrder.nativeOrder());
                } else {
                    this.l.clear();
                }
                ByteBuffer byteBuffer = this.l;
                fxc0.z(xek0Var.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (bVar.f() * i), xek0Var.k);
                bVar.a(min, byteBuffer);
                xek0Var.k -= min;
                System.arraycopy(bVar.q(), min * i, bVar.q(), 0, xek0Var.k * i);
                this.l.flip();
                this.o += f;
                this.m = this.l;
            }
        }
        ByteBuffer byteBuffer2 = this.m;
        this.m = AudioProcessor.a;
        return byteBuffer2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        if (this.g.a != -1) {
            return this.b || Math.abs(this.d - 1.0f) >= 1.0E-4f || Math.abs(this.e - 1.0f) >= 1.0E-4f || this.g.a != this.f.a;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        if (this.p) {
            xek0 xek0Var = this.k;
            if (xek0Var != null) {
                fxc0.z(xek0Var.k >= 0);
                if (xek0Var.i.f() * xek0Var.k * xek0Var.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        xek0 xek0Var = this.k;
        if (xek0Var != null) {
            int i = xek0Var.j;
            float f = xek0Var.c;
            float f2 = xek0Var.d;
            double d = f / f2;
            int i2 = xek0Var.k + ((int) (((((((i - r6) / d) + xek0Var.o) + xek0Var.q) + xek0Var.l) / (xek0Var.e * f2)) + 0.5d));
            xek0Var.q = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            xek0.b<?> bVar = xek0Var.i;
            int i3 = xek0Var.h * 2;
            bVar.d(i3 + i);
            bVar.m(i * xek0Var.b, i3);
            xek0Var.j = i3 + xek0Var.j;
            xek0Var.b();
            if (xek0Var.k > i2) {
                xek0Var.k = Math.max(i2, 0);
            }
            xek0Var.j = 0;
            xek0Var.o = 0;
            xek0Var.l = 0;
        }
        this.p = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            xek0 xek0Var = this.k;
            xek0Var.getClass();
            this.n += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i = xek0Var.b;
            xek0.b<?> bVar = xek0Var.i;
            int f = remaining / (bVar.f() * i);
            bVar.d(f);
            bVar.l(remaining, byteBuffer);
            xek0Var.j += f;
            xek0Var.b();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.d = 1.0f;
        this.e = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.i = aVar;
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.c = -1;
        this.j = false;
        this.k = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
