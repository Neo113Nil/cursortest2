package androidx.media3.common.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import xsna.fxc0;

/* compiled from: AudioProcessingPipeline.java */
/* loaded from: classes12.dex */
public final class b {
    public final ImmutableList<AudioProcessor> a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public AudioProcessor.a d;
    public AudioProcessor.a e;
    public boolean f;

    public b(ImmutableList<AudioProcessor> immutableList) {
        this.a = immutableList;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.f = false;
    }

    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.a;
            if (i >= immutableList.size()) {
                this.e = aVar;
                return aVar;
            }
            AudioProcessor audioProcessor = immutableList.get(i);
            AudioProcessor.a b = audioProcessor.b(aVar);
            if (audioProcessor.isActive()) {
                fxc0.z(!b.equals(AudioProcessor.a.e));
                aVar = b;
            }
            i++;
        }
    }

    public final void b(AudioProcessor.b bVar) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = this.e;
        this.f = false;
        long j = bVar.a;
        int i = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.a;
            if (i >= immutableList.size()) {
                break;
            }
            AudioProcessor audioProcessor = immutableList.get(i);
            audioProcessor.a(new AudioProcessor.b(j));
            if (audioProcessor.isActive()) {
                j = audioProcessor.c(j);
                fxc0.z(j >= 0);
                arrayList.add(audioProcessor);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((AudioProcessor) arrayList.get(i2)).getOutput();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public final ByteBuffer d() {
        if (!f()) {
            return AudioProcessor.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(AudioProcessor.a);
        return this.c[c()];
    }

    public final boolean e() {
        return this.f && ((AudioProcessor) this.b.get(c())).isEnded() && !this.c[c()].hasRemaining();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        ImmutableList<AudioProcessor> immutableList = this.a;
        if (immutableList.size() != bVar.a.size()) {
            return false;
        }
        for (int i = 0; i < immutableList.size(); i++) {
            if (immutableList.get(i) != bVar.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return !this.b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= c()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    AudioProcessor audioProcessor = (AudioProcessor) arrayList.get(i);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.a;
                        long remaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.c[i] = audioProcessor.getOutput();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        ((AudioProcessor) arrayList.get(i + 1)).queueEndOfStream();
                    }
                }
                i++;
            }
        }
    }

    public final void h() {
        if (!f() || this.f) {
            return;
        }
        this.f = true;
        ((AudioProcessor) this.b.get(0)).queueEndOfStream();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(ByteBuffer byteBuffer) {
        if (!f() || this.f) {
            return;
        }
        g(byteBuffer);
    }

    public final void j() {
        int i = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.a;
            if (i >= immutableList.size()) {
                this.b.clear();
                this.c = new ByteBuffer[0];
                AudioProcessor.a aVar = AudioProcessor.a.e;
                this.d = aVar;
                this.e = aVar;
                this.f = false;
                return;
            }
            AudioProcessor audioProcessor = immutableList.get(i);
            audioProcessor.a(AudioProcessor.b.b);
            audioProcessor.reset();
            i++;
        }
    }
}
