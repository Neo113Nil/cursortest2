package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.audio.f;
import java.nio.ByteBuffer;
import xsna.cgn;
import xsna.cp5;
import xsna.dvf;
import xsna.fp;
import xsna.jwa0;
import xsna.lhg;
import xsna.nc4;
import xsna.odj;
import xsna.x1b0;

/* loaded from: classes12.dex */
public interface AudioSink {

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final androidx.media3.common.a format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InitializationException(int i, int i2, int i3, int i4, androidx.media3.common.a aVar, boolean z, @Nullable AudioOutputProvider.InitializationException initializationException) {
            super(r3.toString(), initializationException);
            StringBuilder a = odj.a(i, i2, "AudioTrack init failed 0 Config(", ", ", ", ");
            cgn.a(i3, i4, ", ", ") ", a);
            a.append(aVar);
            a.append(z ? " (recoverable)" : "");
            this.audioTrackState = 0;
            this.isRecoverable = z;
            this.format = aVar;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UnexpectedDiscontinuityException(long j, long j2) {
            super(r0.toString());
            StringBuilder b = fp.b(j2, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
            b.append(j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j2;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final androidx.media3.common.a format;
        public final boolean isRecoverable;

        public WriteException(int i, androidx.media3.common.a aVar, boolean z) {
            super(lhg.a(i, "AudioTrack write failed: "));
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = aVar;
        }
    }

    public static final class a {
    }

    boolean a(androidx.media3.common.a aVar);

    void b(jwa0 jwa0Var);

    void disableTunneling();

    long f();

    void flush();

    jwa0 getPlaybackParameters();

    default void h(AudioOutputProvider audioOutputProvider) {
        throw new UnsupportedOperationException("AudioSink doesn't support setAudioOutputProvider");
    }

    void handleDiscontinuity();

    boolean hasPendingData();

    long i();

    boolean isEnded();

    void j(boolean z);

    void k(f.a aVar);

    void m(androidx.media3.common.a aVar, @Nullable int[] iArr) throws ConfigurationException;

    void n();

    int o(androidx.media3.common.a aVar);

    void p(cp5 cp5Var);

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    default androidx.media3.exoplayer.audio.a q(androidx.media3.common.a aVar) {
        return androidx.media3.exoplayer.audio.a.d;
    }

    boolean r(long j, int i, ByteBuffer byteBuffer) throws InitializationException, WriteException;

    void reset();

    void s(nc4 nc4Var);

    void setAudioSessionId(int i);

    void setVolume(float f);

    public static final class ConfigurationException extends Exception {
        public final androidx.media3.common.a format;

        public ConfigurationException(Exception exc, androidx.media3.common.a aVar) {
            super(exc);
            this.format = aVar;
        }

        public ConfigurationException(androidx.media3.common.a aVar, String str) {
            super(str);
            this.format = aVar;
        }
    }

    default void release() {
    }

    default void c(dvf dvfVar) {
    }

    default void e(@Nullable x1b0 x1b0Var) {
    }

    default void g(int i) {
    }

    default void l(int i) {
    }

    default void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    default void d(int i, int i2) {
    }
}
