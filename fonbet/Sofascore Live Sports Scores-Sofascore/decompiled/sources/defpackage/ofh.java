package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.customui.views.YouTubePlayerSeekBar;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ofh extends y8 {
    public final /* synthetic */ pfh a;
    public final /* synthetic */ YouTubePlayerView b;
    public final /* synthetic */ qfh c;
    public final /* synthetic */ int d;

    public ofh(pfh pfhVar, YouTubePlayerView youTubePlayerView, qfh qfhVar, int i) {
        this.a = pfhVar;
        this.b = youTubePlayerView;
        this.c = qfhVar;
        this.d = i;
    }

    @Override // defpackage.y8, defpackage.ynl
    public final void c(snl snlVar) {
        snlVar.getClass();
        pfh pfhVar = this.a;
        fye fyeVar = pfhVar.d;
        if (fyeVar != null) {
            fyeVar.a = snlVar;
        }
        YouTubePlayerView youTubePlayerView = this.b;
        nth nthVar = new nth(new WeakReference(youTubePlayerView.getContext()), snlVar, null);
        bv1 bv1Var = nthVar.c;
        ((ImageView) bv1Var.f).setVisibility(8);
        ((View) bv1Var.d).setVisibility(8);
        ((View) bv1Var.c).setVisibility(8);
        ((ProgressBar) bv1Var.h).setVisibility(8);
        YouTubePlayerSeekBar youTubePlayerSeekBar = (YouTubePlayerSeekBar) bv1Var.j;
        youTubePlayerSeekBar.getVideoDurationTextView().setVisibility(8);
        youTubePlayerSeekBar.getVideoCurrentTimeTextView().setVisibility(8);
        ((View) bv1Var.g).setOnClickListener(new cne(nthVar, 22));
        FrameLayout frameLayout = (FrameLayout) bv1Var.b;
        frameLayout.getClass();
        youTubePlayerView.setCustomPlayerUi(frameLayout);
        aik.Y(snlVar, this.c.l, pfhVar.g);
        if (this.d == 0 || pfhVar.f) {
            pfhVar.f = true;
        } else {
            ((xnl) snlVar).c();
        }
    }

    @Override // defpackage.y8, defpackage.ynl
    public final void f(snl snlVar, bne bneVar) {
        snl snlVar2;
        snl snlVar3;
        fye fyeVar;
        snl snlVar4;
        snlVar.getClass();
        pfh pfhVar = this.a;
        pfhVar.e = bneVar;
        int ordinal = bneVar.ordinal();
        if (ordinal == 2) {
            fye fyeVar2 = pfhVar.d;
            if (fyeVar2 == null || (snlVar2 = fyeVar2.a) == null) {
                return;
            }
            xnl xnlVar = (xnl) snlVar2;
            xnlVar.b(xnlVar.a, "seekTo", Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            return;
        }
        if (ordinal != 3) {
            if (ordinal != 4 || (fyeVar = pfhVar.d) == null || (snlVar4 = fyeVar.a) == null) {
                return;
            }
            xnl xnlVar2 = (xnl) snlVar4;
            xnlVar2.b(xnlVar2.a, CampaignEx.JSON_NATIVE_VIDEO_MUTE, new Object[0]);
            return;
        }
        fye fyeVar3 = pfhVar.d;
        if (fyeVar3 == null || (snlVar3 = fyeVar3.a) == null) {
            return;
        }
        xnl xnlVar3 = (xnl) snlVar3;
        xnlVar3.b(xnlVar3.a, "unMute", new Object[0]);
    }
}
