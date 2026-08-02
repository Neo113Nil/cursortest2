package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import xsna.c300;
import xsna.dz5;
import xsna.fkk0;
import xsna.fxc0;
import xsna.y2r0;
import xsna.zxo0;

/* compiled from: SpeedChangingAudioProcessor.java */
/* loaded from: classes12.dex */
public final class f implements AudioProcessor {
    public final Object b;
    public final fkk0 c;
    public final g d;
    public final c300 e;
    public final ArrayDeque f;
    public float g;
    public long h;
    public boolean i;
    public AudioProcessor.a j;
    public AudioProcessor.a k;
    public AudioProcessor.a l;
    public boolean m;

    public f(fkk0 fkk0Var) {
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.k = aVar;
        this.l = aVar;
        this.j = aVar;
        this.c = fkk0Var;
        Object obj = new Object();
        this.b = obj;
        this.d = new g(obj);
        this.e = new c300();
        this.f = new ArrayDeque();
        this.g = 1.0f;
    }

    public static long d(int i, long j, fkk0 fkk0Var) {
        long longValueExact;
        fkk0 fkk0Var2 = fkk0Var;
        long j2 = i;
        long d0 = y2r0.d0(j, j2, 1000000L, RoundingMode.HALF_EVEN);
        fxc0.p(fkk0Var2 != null);
        fxc0.p(i > 0);
        long j3 = 0;
        fxc0.p(d0 >= 0);
        long j4 = 0;
        long j5 = 0;
        while (j4 < d0) {
            long A = dz5.A(i, j4, fkk0Var2);
            if (A == -1 || A > d0) {
                A = d0;
            }
            fxc0.p(j4 >= j3);
            fxc0.p(i > 0);
            float b = fkk0Var2.b(y2r0.b0(i, j4));
            float f = i;
            float f2 = (f / f) * b;
            double d = b / b;
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(f2));
            BigDecimal valueOf = BigDecimal.valueOf(A - j4);
            if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
                valueOf = valueOf.divide(BigDecimal.valueOf(d), RoundingMode.HALF_EVEN);
            }
            if (f2 == 1.0f) {
                longValueExact = valueOf.longValueExact();
            } else {
                RoundingMode roundingMode = RoundingMode.HALF_EVEN;
                long longValueExact2 = valueOf.divide(bigDecimal, roundingMode).longValueExact();
                BigDecimal valueOf2 = BigDecimal.valueOf(j2);
                BigDecimal divide = valueOf.divide(valueOf2, 20, roundingMode);
                BigDecimal divide2 = valueOf2.divide(bigDecimal, 20, roundingMode);
                RoundingMode roundingMode2 = RoundingMode.FLOOR;
                longValueExact = longValueExact2 - divide.multiply(divide2.subtract(divide2.setScale(0, roundingMode2))).setScale(0, roundingMode2).longValueExact();
            }
            j5 += longValueExact;
            fkk0Var2 = fkk0Var;
            j4 = A;
            j3 = 0;
        }
        return y2r0.b0(i, j5);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void a(AudioProcessor.b bVar) {
        this.m = false;
        this.h = 0L;
        this.i = false;
        synchronized (this.b) {
            this.j = this.k;
            this.d.a(bVar);
            e();
            this.h = y2r0.q(this.j.a, bVar.a);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.k = aVar;
        AudioProcessor.a b = this.d.b(aVar);
        this.l = b;
        return b;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final long c(long j) {
        return dz5.z(this.c, j);
    }

    public final void e() {
        synchronized (this.b) {
            try {
                if (this.j.a == -1) {
                    return;
                }
                while (!this.f.isEmpty()) {
                    long c = this.e.c();
                    ((zxo0) this.f.remove()).a(d(this.j.a, c, this.c));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        return this.d.getOutput();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return !this.l.equals(AudioProcessor.a.e);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        return this.m && this.d.isEnded();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.m = true;
        if (this.i) {
            return;
        }
        this.d.queueEndOfStream();
        this.i = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        AudioProcessor.a aVar;
        int i;
        synchronized (this.b) {
            aVar = this.j;
        }
        fkk0 fkk0Var = this.c;
        long j = this.h;
        int i2 = aVar.a;
        fxc0.p(j >= 0);
        fxc0.p(i2 > 0);
        float b = fkk0Var.b(y2r0.b0(i2, j));
        long A = dz5.A(aVar.a, this.h, this.c);
        if (b != this.g) {
            this.g = b;
            g gVar = this.d;
            synchronized (gVar.b) {
                gVar.c.f(b);
            }
            g gVar2 = this.d;
            synchronized (gVar2.b) {
                gVar2.c.e(b);
            }
            this.d.a(AudioProcessor.b.b);
            this.i = false;
        }
        int limit = byteBuffer.limit();
        if (A != -1) {
            i = (int) ((A - this.h) * aVar.d);
            byteBuffer.limit(Math.min(limit, byteBuffer.position() + i));
        } else {
            i = -1;
        }
        long position = byteBuffer.position();
        this.d.queueInput(byteBuffer);
        if (i != -1 && byteBuffer.position() - position == i) {
            this.d.queueEndOfStream();
            this.i = true;
        }
        long position2 = byteBuffer.position() - position;
        fxc0.A(position2 % ((long) aVar.d) == 0, "A frame was not queued completely.");
        this.h = (position2 / aVar.d) + this.h;
        byteBuffer.limit(limit);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        a(AudioProcessor.b.b);
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.k = aVar;
        this.l = aVar;
        synchronized (this.b) {
            this.j = aVar;
            c300 c300Var = this.e;
            c300Var.a = 0;
            c300Var.b = -1;
            c300Var.c = 0;
            this.f.clear();
        }
        this.g = 1.0f;
        this.h = 0L;
        this.i = false;
        this.d.reset();
    }
}
