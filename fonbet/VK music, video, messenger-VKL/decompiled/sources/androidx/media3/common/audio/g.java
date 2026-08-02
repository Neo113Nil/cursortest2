package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: SynchronizedSonicAudioProcessor.java */
/* loaded from: classes12.dex */
public final class g implements AudioProcessor {
    public final Object b;
    public final e c = new e(true);

    public g(Object obj) {
        this.b = obj;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void a(AudioProcessor.b bVar) {
        synchronized (this.b) {
            this.c.a(bVar);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        AudioProcessor.a b;
        synchronized (this.b) {
            b = this.c.b(aVar);
        }
        return b;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final long c(long j) {
        long d;
        synchronized (this.b) {
            d = this.c.d(j);
        }
        return d;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        ByteBuffer output;
        synchronized (this.b) {
            output = this.c.getOutput();
        }
        return output;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        boolean isActive;
        synchronized (this.b) {
            isActive = this.c.isActive();
        }
        return isActive;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        boolean isEnded;
        synchronized (this.b) {
            isEnded = this.c.isEnded();
        }
        return isEnded;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        synchronized (this.b) {
            this.c.queueEndOfStream();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        synchronized (this.b) {
            this.c.queueInput(byteBuffer);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        synchronized (this.b) {
            this.c.reset();
        }
    }
}
