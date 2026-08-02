package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.AudioSink;
import xsna.g8l;
import xsna.n8l;
import xsna.qzf;
import xsna.wv4;

/* compiled from: AudioRendererEventListener.java */
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: AudioRendererEventListener.java */
    public static final class a {

        @Nullable
        public final Handler a;

        @Nullable
        public final b b;

        public a(@Nullable Handler handler, @Nullable b bVar) {
            this.a = handler;
            this.b = bVar;
        }

        public final void a(g8l g8lVar) {
            synchronized (g8lVar) {
            }
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new wv4(0, this, g8lVar));
            }
        }
    }

    default void a(int i) {
    }

    default void c(Exception exc) {
    }

    default void l(String str) {
    }

    default void n(g8l g8lVar) {
    }

    default void o(AudioSink.a aVar) {
    }

    default void onSkipSilenceEnabledChanged(boolean z) {
    }

    default void p(AudioSink.a aVar) {
    }

    default void q(Exception exc) {
    }

    default void r(long j) {
    }

    default void s(g8l g8lVar) {
    }

    default void w(qzf qzfVar) {
    }

    default void g(androidx.media3.common.a aVar, @Nullable n8l n8lVar) {
    }

    default void i(int i, long j, long j2) {
    }

    default void onAudioDecoderInitialized(String str, long j, long j2) {
    }
}
