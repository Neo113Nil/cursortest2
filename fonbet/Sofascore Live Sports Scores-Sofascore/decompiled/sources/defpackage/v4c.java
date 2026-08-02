package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v4c implements krk {
    public final FrameLayout a;
    public final YouTubePlayerView b;

    public v4c(FrameLayout frameLayout, YouTubePlayerView youTubePlayerView) {
        this.a = frameLayout;
        this.b = youTubePlayerView;
    }

    public static v4c a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.media_external_video_dialog, viewGroup, false);
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) nq8.B(R.id.youtube_player_view, inflate);
        if (youTubePlayerView != null) {
            return new v4c((FrameLayout) inflate, youTubePlayerView);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.youtube_player_view)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
