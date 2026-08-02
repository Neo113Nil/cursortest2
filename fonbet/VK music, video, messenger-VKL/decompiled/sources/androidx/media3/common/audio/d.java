package androidx.media3.common.audio;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import xsna.w3b;

/* compiled from: ChannelMixingAudioProcessor.java */
/* loaded from: classes12.dex */
public final class d extends c {
    public final SparseArray<w3b> i = new SparseArray<>();

    @Override // androidx.media3.common.audio.c
    public final AudioProcessor.a d(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (!a.a(aVar)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        w3b w3bVar = this.i.get(aVar.b);
        if (w3bVar != null) {
            return w3bVar.e ? AudioProcessor.a.e : new AudioProcessor.a(aVar.a, w3bVar.b, aVar.c);
        }
        throw new AudioProcessor.UnhandledAudioFormatException("No mixing matrix for input channel count", aVar);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        w3b w3bVar = this.i.get(this.b.b);
        w3bVar.getClass();
        int remaining = byteBuffer.remaining() / this.b.d;
        ByteBuffer h = h(this.c.d * remaining);
        a.c(byteBuffer, this.b, h, this.c, w3bVar, remaining, false);
        h.flip();
    }
}
