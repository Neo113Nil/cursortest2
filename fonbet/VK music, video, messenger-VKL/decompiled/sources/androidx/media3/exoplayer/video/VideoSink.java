package androidx.media3.exoplayer.video;

import android.view.Surface;
import java.util.List;
import xsna.gms0;
import xsna.jxj0;
import xsna.kzm;
import xsna.p8p;
import xsna.xgt0;

/* loaded from: classes12.dex */
public interface VideoSink {

    public static final class VideoSinkException extends Exception {
        public final androidx.media3.common.a format;

        public VideoSinkException(Throwable th, androidx.media3.common.a aVar) {
            super(th);
            this.format = aVar;
        }
    }

    public interface b {
        void a();

        void b(long j);
    }

    Surface b();

    void c();

    void f();

    boolean g(androidx.media3.common.a aVar) throws VideoSinkException;

    void h();

    void i(int i);

    boolean isEnded();

    boolean isInitialized();

    void j(androidx.media3.exoplayer.video.b bVar, kzm kzmVar);

    boolean k(long j, b bVar);

    void l(gms0 gms0Var);

    void m(long j);

    void n(int i, long j, androidx.media3.common.a aVar, List list);

    void o(boolean z);

    void p();

    void q();

    void r(List<p8p> list);

    void release();

    void render(long j, long j2) throws VideoSinkException;

    boolean s(boolean z);

    void setPlaybackSpeed(float f);

    void t();

    void u(boolean z);

    void v(Surface surface, jxj0 jxj0Var);

    public interface a {
        public static final C0066a a = new C0066a();

        /* renamed from: androidx.media3.exoplayer.video.VideoSink$a$a, reason: collision with other inner class name */
        public class C0066a implements a {
        }

        default void d() {
        }

        default void e() {
        }

        default void onFirstFrameRendered() {
        }

        default void a(VideoSinkException videoSinkException) {
        }

        default void onVideoSizeChanged(xgt0 xgt0Var) {
        }
    }
}
