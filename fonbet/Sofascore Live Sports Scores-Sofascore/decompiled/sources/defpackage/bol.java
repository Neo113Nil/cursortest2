package defpackage;

import android.view.View;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class bol {
    public final /* synthetic */ YouTubePlayerView a;

    public bol(YouTubePlayerView youTubePlayerView) {
        this.a = youTubePlayerView;
    }

    public final void a(View view, ndk ndkVar) {
        view.getClass();
        ArrayList arrayList = this.a.a;
        if (arrayList.isEmpty()) {
            a70.r("To enter fullscreen you need to first register a FullscreenListener.");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((bol) it.next()).a(view, ndkVar);
        }
    }

    public final void b() {
        ArrayList arrayList = this.a.a;
        if (arrayList.isEmpty()) {
            a70.r("To enter fullscreen you need to first register a FullscreenListener.");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((bol) it.next()).b();
        }
    }
}
