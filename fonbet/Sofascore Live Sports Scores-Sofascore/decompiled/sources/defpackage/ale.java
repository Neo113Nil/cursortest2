package defpackage;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface ale {
    long A();

    void B();

    void C();

    q6c D();

    long E();

    void a();

    void b(hke hkeVar);

    long c();

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    void d();

    h6c e();

    void f(etj etjVar);

    void g();

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    mij getCurrentTimeline();

    long getDuration();

    boolean getPlayWhenReady();

    hke getPlaybackParameters();

    int getPlaybackState();

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    float getVolume();

    dke h();

    uuj i();

    boolean isPlaying();

    boolean isPlayingAd();

    o74 j();

    boolean k(int i);

    void l(h6c h6cVar);

    int m();

    Looper n();

    etj o();

    void p();

    void pause();

    void play();

    ske q();

    long r();

    void release();

    void s(wke wkeVar);

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void setPlayWhenReady(boolean z);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f);

    void stop();

    void t();

    long u();

    zqk v();

    long w();

    void x(vvf vvfVar);

    int y();

    void z(wke wkeVar);
}
