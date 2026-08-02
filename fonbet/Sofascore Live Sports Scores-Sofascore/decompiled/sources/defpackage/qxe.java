package defpackage;

import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qxe implements wke, View.OnClickListener, nne, fne {
    public final iij a = new iij();
    public Object b;
    public final /* synthetic */ PlayerView c;

    public qxe(PlayerView playerView) {
        this.c = playerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.H;
        this.c.i();
    }

    @Override // defpackage.wke
    public final void onCues(o74 o74Var) {
        SubtitleView subtitleView = this.c.i;
        if (subtitleView != null) {
            subtitleView.setCues(o74Var.a);
        }
    }

    @Override // defpackage.wke
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        int i2 = PlayerView.H;
        PlayerView playerView = this.c;
        playerView.k();
        if (!playerView.c() || !playerView.E) {
            playerView.e(false);
            return;
        }
        one oneVar = playerView.l;
        if (oneVar != null) {
            oneVar.f();
        }
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        int i2 = PlayerView.H;
        PlayerView playerView = this.c;
        playerView.k();
        playerView.m();
        if (!playerView.c() || !playerView.E) {
            playerView.e(false);
            return;
        }
        one oneVar = playerView.l;
        if (oneVar != null) {
            oneVar.f();
        }
    }

    @Override // defpackage.wke
    public final void onPositionDiscontinuity(yke ykeVar, yke ykeVar2, int i) {
        one oneVar;
        int i2 = PlayerView.H;
        PlayerView playerView = this.c;
        if (playerView.c() && playerView.E && (oneVar = playerView.l) != null) {
            oneVar.f();
        }
    }

    @Override // defpackage.wke
    public final void onRenderedFirstFrame() {
        PlayerView playerView = this.c;
        View view = playerView.c;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.a()) {
                playerView.b();
                return;
            }
            ImageView imageView = playerView.g;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    @Override // defpackage.wke
    public final void onSurfaceSizeChanged(int i, int i2) {
        PlayerView playerView = this.c;
        View view = playerView.d;
        if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.G) {
            txe txeVar = playerView.f;
            txeVar.getClass();
            int i3 = 10;
            playerView.o.post(new kdc(i3, txeVar, (SurfaceView) view, new yp8(playerView, 28)));
        }
    }

    @Override // defpackage.wke
    public final void onTracksChanged(uuj uujVar) {
        PlayerView playerView = this.c;
        ale aleVar = playerView.s;
        aleVar.getClass();
        mij currentTimeline = aleVar.k(17) ? aleVar.getCurrentTimeline() : mij.a;
        if (currentTimeline.p()) {
            this.b = null;
        } else {
            boolean k = aleVar.k(30);
            iij iijVar = this.a;
            if (!k || aleVar.i().a.isEmpty()) {
                Object obj = this.b;
                if (obj != null) {
                    int b = currentTimeline.b(obj);
                    if (b != -1) {
                        if (aleVar.y() == currentTimeline.f(b, iijVar, false).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                this.b = currentTimeline.f(aleVar.getCurrentPeriodIndex(), iijVar, true).b;
            }
        }
        playerView.n(false);
    }

    @Override // defpackage.wke
    public final void onVideoSizeChanged(zqk zqkVar) {
        PlayerView playerView;
        ale aleVar;
        if (zqkVar.equals(zqk.d) || (aleVar = (playerView = this.c).s) == null || aleVar.getPlaybackState() == 1) {
            return;
        }
        playerView.j();
    }
}
