package defpackage;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class col extends y8 {
    public final /* synthetic */ String a;
    public final /* synthetic */ YouTubePlayerView b;
    public final /* synthetic */ boolean c;

    public col(String str, YouTubePlayerView youTubePlayerView, boolean z) {
        this.a = str;
        this.b = youTubePlayerView;
        this.c = z;
    }

    @Override // defpackage.y8, defpackage.ynl
    public final void c(snl snlVar) {
        snlVar.getClass();
        String str = this.a;
        if (str != null) {
            aik.Z(snlVar, this.b.b.getCanPlay$core_release() && this.c, str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ((xnl) snlVar).d(this);
    }
}
