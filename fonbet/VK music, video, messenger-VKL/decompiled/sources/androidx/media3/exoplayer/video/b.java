package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.g;
import xsna.uct0;
import xsna.xgt0;

/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: classes12.dex */
public final class b implements VideoSink.a {
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink.a
    public final void a(VideoSink.VideoSinkException videoSinkException) {
        androidx.media3.common.a aVar = videoSinkException.format;
        c cVar = this.b;
        cVar.w0 = cVar.r(videoSinkException, aVar, false, 7001);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink.a
    public final void d() {
        c cVar = this.b;
        if (cVar.Z0 != null) {
            cVar.O0(0, 1);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink.a
    public final void e() {
        j.a aVar = this.b.K;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink.a
    public final void onFirstFrameRendered() {
        c cVar = this.b;
        Surface surface = cVar.Z0;
        if (surface != null) {
            g.a aVar = cVar.K0;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new uct0(aVar, surface, SystemClock.elapsedRealtime()));
            }
            cVar.c1 = true;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink.a
    public final void onVideoSizeChanged(xgt0 xgt0Var) {
    }
}
