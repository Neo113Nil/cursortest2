package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import xsna.jwa0;
import xsna.lhg;
import xsna.x1b0;

/* loaded from: classes12.dex */
public interface AudioOutput {

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final boolean isRecoverable;

        public WriteException(int i, boolean z) {
            super(lhg.a(i, "AudioOutput write failed: "));
            this.isRecoverable = z;
            this.errorCode = i;
        }
    }

    public interface a {
        void a();

        void b(long j);

        void c();

        void d();

        void onReleased();
    }

    void b(jwa0 jwa0Var);

    int c();

    void d(int i, int i2);

    boolean f(long j, int i, ByteBuffer byteBuffer) throws WriteException;

    boolean g();

    int getAudioSessionId();

    jwa0 getPlaybackParameters();

    long getPositionUs();

    long h();

    boolean i();

    void j();

    void pause();

    void play();

    void release();

    void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f);

    void stop();

    default void e(x1b0 x1b0Var) {
    }
}
