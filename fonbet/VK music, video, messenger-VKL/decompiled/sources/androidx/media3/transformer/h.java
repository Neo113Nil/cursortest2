package androidx.media3.transformer;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import xsna.a7l;
import xsna.ar4;
import xsna.fxc0;
import xsna.w3b;
import xsna.wr;
import xsna.y2r0;

/* compiled from: DefaultAudioMixer.java */
/* loaded from: classes12.dex */
public final class h {
    public int b;
    public long h;
    public long j;
    public final SparseArray<c> a = new SparseArray<>();
    public AudioProcessor.a c = AudioProcessor.a.e;
    public int d = -1;
    public b[] e = new b[0];
    public long f = C.TIME_UNSET;
    public long g = -1;
    public long i = Long.MAX_VALUE;

    /* compiled from: DefaultAudioMixer.java */
    public static final class a implements ar4 {
    }

    /* compiled from: DefaultAudioMixer.java */
    public static class b {
        public final ByteBuffer a;
        public final long b;
        public final long c;

        public b(long j, ByteBuffer byteBuffer, long j2) {
            this.a = byteBuffer;
            this.b = j;
            this.c = j2;
        }
    }

    /* compiled from: DefaultAudioMixer.java */
    public final class c {
        public long a;
        public final AudioProcessor.a b;
        public final w3b c;

        public c(h hVar, AudioProcessor.a aVar, w3b w3bVar, long j) {
            this.b = aVar;
            this.a = j;
            this.c = w3bVar;
        }

        public final void a(long j, ByteBuffer byteBuffer) {
            fxc0.p(j >= this.a);
            byteBuffer.position((((int) (j - this.a)) * this.b.d) + byteBuffer.position());
            this.a = j;
        }
    }

    public final int a(AudioProcessor.a aVar, long j) throws AudioProcessor.UnhandledAudioFormatException {
        c();
        c();
        AudioProcessor.a aVar2 = this.c;
        if (aVar.a != aVar2.a || !androidx.media3.common.audio.a.a(aVar) || !androidx.media3.common.audio.a.a(aVar2)) {
            throw new AudioProcessor.UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.c, aVar);
        }
        long q = y2r0.q(aVar.a, j - this.f);
        int i = this.b;
        this.b = i + 1;
        this.a.append(i, new c(this, aVar, w3b.a(aVar.b, this.c.b), q));
        LinkedHashMap linkedHashMap = a7l.a;
        synchronized (a7l.class) {
        }
        return i;
    }

    public final b b(long j) {
        ByteBuffer order = ByteBuffer.allocateDirect(this.d * this.c.d).order(ByteOrder.nativeOrder());
        order.mark();
        return new b(j, order, j + this.d);
    }

    public final void c() {
        fxc0.A(!this.c.equals(AudioProcessor.a.e), "Audio mixer is not configured.");
    }

    public final void d(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        fxc0.A(this.c.equals(AudioProcessor.a.e), "Audio mixer already configured.");
        if (!androidx.media3.common.audio.a.a(aVar)) {
            throw new AudioProcessor.UnhandledAudioFormatException("Can not mix to this AudioFormat.", aVar);
        }
        this.c = aVar;
        this.d = (500 * aVar.a) / 1000;
        this.f = 0L;
        LinkedHashMap linkedHashMap = a7l.a;
        synchronized (a7l.class) {
        }
        this.e = new b[]{b(0L), b(this.d)};
        this.g = Math.min(this.i, this.h + this.d);
    }

    public final boolean e() {
        c();
        long j = this.h;
        if (j < this.i) {
            return j >= this.j && this.a.size() == 0;
        }
        return true;
    }

    public final void f(int i, ByteBuffer byteBuffer) {
        int i2;
        c();
        if (byteBuffer.hasRemaining()) {
            SparseArray<c> sparseArray = this.a;
            fxc0.A(y2r0.l(sparseArray, i), "Source not found.");
            c cVar = sparseArray.get(i);
            if (cVar.a >= this.g) {
                return;
            }
            long min = Math.min(cVar.a + (byteBuffer.remaining() / cVar.b.d), this.g);
            if (cVar.c.d) {
                cVar.a(min, byteBuffer);
                return;
            }
            long j = cVar.a;
            long j2 = this.h;
            if (j < j2) {
                cVar.a(Math.min(min, j2), byteBuffer);
                if (cVar.a == min) {
                    return;
                }
            }
            b[] bVarArr = this.e;
            int length = bVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                b bVar = bVarArr[i3];
                long j3 = cVar.a;
                long j4 = bVar.c;
                ByteBuffer byteBuffer2 = bVar.a;
                if (j3 >= j4) {
                    i2 = i3;
                } else {
                    wr.c(((int) (j3 - bVar.b)) * this.c.d, byteBuffer2);
                    long min2 = Math.min(min, bVar.c);
                    AudioProcessor.a aVar = this.c;
                    i2 = i3;
                    fxc0.p(min2 >= cVar.a);
                    androidx.media3.common.audio.a.c(byteBuffer, cVar.b, byteBuffer2, aVar, cVar.c, (int) (min2 - cVar.a), true);
                    cVar.a = min2;
                    byteBuffer2.reset();
                    if (cVar.a == min) {
                        return;
                    }
                }
                i3 = i2 + 1;
            }
        }
    }
}
