package androidx.media3.exoplayer;

import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.List;
import java.util.Objects;
import xsna.by1;
import xsna.dip0;
import xsna.ewo0;
import xsna.fk6;
import xsna.gv;
import xsna.ihz;
import xsna.jwa0;
import xsna.jza0;
import xsna.nc4;
import xsna.wwi;

/* compiled from: SimpleExoPlayer.java */
@Deprecated
/* loaded from: classes12.dex */
public final class l extends fk6 implements ExoPlayer {
    public final c c;
    public final wwi d;

    public l(ExoPlayer.b bVar) {
        wwi wwiVar = new wwi();
        this.d = wwiVar;
        try {
            this.c = new c(bVar, this);
            wwiVar.f();
        } catch (Throwable th) {
            this.d.f();
            throw th;
        }
    }

    public final void A(jwa0 jwa0Var) {
        y();
        this.c.O(jwa0Var);
    }

    @Override // xsna.jza0
    public final long a() {
        y();
        return this.c.a();
    }

    @Override // xsna.jza0
    public final void c(jza0.b bVar) {
        y();
        this.c.c(bVar);
    }

    @Override // xsna.jza0
    public final void f(List list) {
        y();
        this.c.f(list);
    }

    @Override // xsna.jza0
    public final int g() {
        y();
        return this.c.g();
    }

    @Override // xsna.jza0
    public final long getBufferedPosition() {
        y();
        return this.c.getBufferedPosition();
    }

    @Override // xsna.jza0
    public final long getContentPosition() {
        y();
        return this.c.getContentPosition();
    }

    @Override // xsna.jza0
    public final int getCurrentAdGroupIndex() {
        y();
        return this.c.getCurrentAdGroupIndex();
    }

    @Override // xsna.jza0
    public final int getCurrentAdIndexInAdGroup() {
        y();
        return this.c.getCurrentAdIndexInAdGroup();
    }

    @Override // xsna.jza0
    public final int getCurrentPeriodIndex() {
        y();
        return this.c.getCurrentPeriodIndex();
    }

    @Override // xsna.jza0
    public final long getCurrentPosition() {
        y();
        return this.c.getCurrentPosition();
    }

    @Override // xsna.jza0
    public final ewo0 getCurrentTimeline() {
        y();
        return this.c.getCurrentTimeline();
    }

    @Override // xsna.jza0
    public final long getDuration() {
        y();
        return this.c.getDuration();
    }

    @Override // xsna.jza0
    public final boolean getPlayWhenReady() {
        y();
        return this.c.getPlayWhenReady();
    }

    @Override // xsna.jza0
    public final int getPlaybackState() {
        y();
        return this.c.getPlaybackState();
    }

    @Override // xsna.jza0
    public final int getRepeatMode() {
        y();
        c cVar = this.c;
        cVar.X();
        return cVar.I;
    }

    @Override // xsna.jza0
    public final void getShuffleModeEnabled() {
        y();
        this.c.X();
    }

    @Override // xsna.jza0
    public final float getVolume() {
        y();
        c cVar = this.c;
        cVar.X();
        return cVar.f0;
    }

    @Override // xsna.jza0
    @Nullable
    /* renamed from: i */
    public final ExoPlaybackException b() {
        y();
        return this.c.b();
    }

    @Override // xsna.jza0
    public final boolean isPlayingAd() {
        y();
        return this.c.isPlayingAd();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        y();
        c cVar = this.c;
        cVar.X();
        return cVar.M;
    }

    @Override // xsna.jza0
    public final dip0 j() {
        y();
        return this.c.j();
    }

    @Override // xsna.jza0
    public final void k() {
        y();
        this.c.k();
    }

    @Override // xsna.jza0
    public final void l(jza0.b bVar) {
        y();
        this.c.l(bVar);
    }

    @Override // xsna.jza0
    public final jza0.a p() {
        y();
        c cVar = this.c;
        cVar.X();
        return cVar.T;
    }

    @Override // xsna.jza0
    public final void prepare() {
        y();
        this.c.prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void q(by1 by1Var) {
        y();
        this.c.q(by1Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void r(androidx.media3.exoplayer.source.i iVar) {
        y();
        this.c.r(iVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        y();
        this.c.release();
    }

    @Override // xsna.jza0
    public final int s() {
        y();
        return this.c.s();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(@Nullable ImageOutput imageOutput) {
        y();
        this.c.setImageOutput(imageOutput);
    }

    @Override // xsna.jza0
    public final void setPlayWhenReady(boolean z) {
        y();
        this.c.setPlayWhenReady(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        y();
        this.c.setScrubbingModeEnabled(z);
    }

    @Override // xsna.jza0
    public final void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        y();
        this.c.setVideoSurfaceView(surfaceView);
    }

    @Override // xsna.jza0
    public final void setVideoTextureView(@Nullable TextureView textureView) {
        y();
        this.c.setVideoTextureView(textureView);
    }

    @Override // xsna.jza0
    public final void setVolume(float f) {
        y();
        this.c.setVolume(f);
    }

    @Override // xsna.jza0
    public final void stop() {
        y();
        this.c.stop();
    }

    @Override // xsna.fk6
    public final void v(int i, int i2, long j) {
        y();
        this.c.v(i, i2, j);
    }

    public final void y() {
        this.d.b();
    }

    public final void z(nc4 nc4Var) {
        y();
        c cVar = this.c;
        ihz<jza0.b> ihzVar = cVar.n;
        cVar.X();
        if (cVar.n0) {
            return;
        }
        if (!Objects.equals(cVar.e0, nc4Var)) {
            cVar.e0 = nc4Var;
            cVar.L(1, 3, nc4Var);
            ihzVar.c(20, new gv(nc4Var, 18));
        }
        d dVar = cVar.m;
        dVar.i.obtainMessage(31, 0, 0, cVar.e0).b();
        ihzVar.b();
    }
}
