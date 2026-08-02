package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: BaseAudioProcessor.java */
/* loaded from: classes12.dex */
public abstract class c implements AudioProcessor {
    public AudioProcessor.a b;
    public AudioProcessor.a c;
    public AudioProcessor.a d;
    public AudioProcessor.a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public c() {
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void a(AudioProcessor.b bVar) {
        this.g = AudioProcessor.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        e();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.d = aVar;
        this.e = d(aVar);
        return isActive() ? this.e : AudioProcessor.a.e;
    }

    public abstract AudioProcessor.a d(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    @Override // androidx.media3.common.audio.AudioProcessor
    @Deprecated
    public final void flush() {
        a(AudioProcessor.b.b);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.g;
        this.g = AudioProcessor.a;
        return byteBuffer;
    }

    public final ByteBuffer h(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.e != AudioProcessor.a.e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.h && this.g == AudioProcessor.a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.h = true;
        f();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        g();
    }

    @Deprecated
    public void e() {
    }

    public void f() {
    }

    public void g() {
    }
}
