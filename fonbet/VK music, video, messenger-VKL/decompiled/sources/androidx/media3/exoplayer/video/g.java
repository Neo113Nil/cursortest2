package androidx.media3.exoplayer.video;

import android.os.Handler;
import androidx.annotation.Nullable;
import xsna.aw;
import xsna.g8l;
import xsna.n8l;
import xsna.qzf;
import xsna.xgt0;

/* compiled from: VideoRendererEventListener.java */
/* loaded from: classes12.dex */
public interface g {

    /* compiled from: VideoRendererEventListener.java */
    public static final class a {

        @Nullable
        public final Handler a;

        @Nullable
        public final g b;

        public a(@Nullable Handler handler, @Nullable g gVar) {
            if (gVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.a = handler;
            this.b = gVar;
        }

        public final void a(xgt0 xgt0Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new aw(7, this, xgt0Var));
            }
        }
    }

    default void e(g8l g8lVar) {
    }

    default void f(g8l g8lVar) {
    }

    default void j(String str) {
    }

    default void onVideoSizeChanged(xgt0 xgt0Var) {
    }

    default void t(Exception exc) {
    }

    default void v(qzf qzfVar) {
    }

    default void b(long j, Object obj) {
    }

    default void m(int i, long j) {
    }

    default void onDroppedFrames(int i, long j) {
    }

    default void u(androidx.media3.common.a aVar, @Nullable n8l n8lVar) {
    }

    default void onVideoDecoderInitialized(String str, long j, long j2) {
    }
}
